/*
 * Thibaut Colar Aug 6, 2009
 */
package net.colar.netbeans.fan.editor;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import net.colar.netbeans.fan.indexer.FanTokenID;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parser.parboiled.FantomLexerTokens.TokenName;
import org.netbeans.modules.csl.api.Formatter;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.editor.indent.spi.Context;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.editor.BaseDocument;
import org.netbeans.editor.Utilities;
import org.netbeans.modules.csl.spi.GsfUtilities;
import org.openide.util.Exceptions;

/**
 * The formatter, is responsible for "pretty-formatting" a file when requested
 * (indentation etc....)
 *
 * Mostly copied from Groovy formatter and Changed as needed.
 *
 * @author thibautc
 */
public class FanFormatter implements Formatter {

    public static final TokenName[] INSIGNIFICANT_TOKENS = {TokenName.WHITESPACE, TokenName.LF,
        TokenName.COMMENT, TokenName.DOC};

    public boolean needsParserResult() {
        return false;
    }

    public void reindent(Context context) {
        reindent(context, null, true);
    }

    public void reformat(Context context, ParserResult compilationInfo) {
        reindent(context, compilationInfo, false);
    }

    public int indentSize() {
        return FantomIndentUtils.getIndentSize(null); // Fan convention
    }

    public int hangingIndentSize() {
        return indentSize();
    }

    /**
     * Compute the initial balance of brackets at the given offset.
     */
    private int getFormatStableStart(BaseDocument doc, int offset) {
        TokenSequence<? extends FanTokenID> ts = FanLexAstUtils.getFanTokenSequence(doc, offset);
        if (ts == null) {
            return 0;
        }

        ts.move(offset);

        if (!ts.movePrevious()) {
            return 0;
        }

        // Look backwards to find a suitable context - a type definition
        // which we will assume is properly indented and balanced
        do {
            Token<? extends FanTokenID> token = ts.token();
            FanTokenID id = token.id();

            if (tokenIs(token, "class") || tokenIs(token, "mixin") || tokenIs(token, "enum")) {
                return ts.offset();
            }
        } while (ts.movePrevious());

        return ts.offset();
    }

    private int getTokenBalanceDelta(FanTokenID id, Token<? extends FanTokenID> token,
            BaseDocument doc, TokenSequence<? extends FanTokenID> ts, boolean includeKeywords) {
        int ord = id.ordinal();
        /*
         * if (ord == FanLexer.ID) { if (token.length() == 1) { char c =
         * token.text().charAt(0); if (c == '[') { return 1; } else if (c ==
         * ']') { return -1; } } } else
         */ if (id.matches(TokenName.PAR_L) || id.matches(TokenName.BRACKET_L) || id.matches(TokenName.SQ_BRACKET_L)) {
            return 1;
        } else if (id.matches(TokenName.SQ_BRACKET_R) || id.matches(TokenName.BRACKET_R) || id.matches(TokenName.PAR_R)) {
            return -1;
        }

        return 0;
    }

    private int getTokenBalance(BaseDocument doc, int begin, int end, boolean includeKeywords) {
        int balance = 0;

        TokenSequence<? extends FanTokenID> ts = FanLexAstUtils.getFanTokenSequence(doc, begin);
        if (ts == null) {
            return 0;
        }

        ts.move(begin);

        if (!ts.moveNext()) {
            return 0;
        }

        do {
            Token<? extends FanTokenID> token = ts.token();
            FanTokenID id = token.id();

            balance += getTokenBalanceDelta(id, token, doc, ts, includeKeywords);
        } while (ts.moveNext() && (ts.offset() < end));

        return balance;
    }

    private boolean isInLiteral(BaseDocument doc, int offset) throws BadLocationException {
        int pos = Utilities.getRowFirstNonWhite(doc, offset);

        if (pos != -1) {
            Token<? extends FanTokenID> token = FanLexAstUtils.getFanTokenAt(doc, pos);

            if (token != null) {
                TokenId id = token.id();
                // If we're in a string literal (or regexp or documentation) leave
                // indentation alone!
                if (id.name().equals(TokenName.DSL.name()) || id.name().equals(TokenName.STRS.name())) {
                    // Those can be multiline, so leave it alone
                    return true;
                }

            } else {
                return true;
            }
        } else {
            // Empty line inside a string, documentation etc. literal?
            Token<? extends FanTokenID> token = FanLexAstUtils.getFanTokenAt(doc, offset);

            if (token != null) {
                TokenId id = token.id();
                // If we're in a string literal (or regexp or documentation) leave
                // indentation alone!
                if (FanLexAstUtils.matchType(id, INSIGNIFICANT_TOKENS)
                        || id.name().equals(TokenName.DSL.name())
                        || id.name().equals(TokenName.STRS.name())) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Get the first token on the given line.
     */
    private Token<? extends FanTokenID> getFirstToken(BaseDocument doc, int offset) throws BadLocationException {
        int lineBegin = Utilities.getRowFirstNonWhite(doc, offset);

        if (lineBegin != -1) {
            return FanLexAstUtils.getFanTokenAt(doc, lineBegin);
        }

        return null;
    }

    private boolean isEndIndent(BaseDocument doc, int offset) throws BadLocationException {
        int lineBegin = Utilities.getRowFirstNonWhite(doc, offset);

        if (lineBegin != -1) {
            Token<? extends FanTokenID> token = getFirstToken(doc, offset);

            if (token == null) {
                return false;
            }

            FanTokenID id = token.id();

            // If the line starts with an end-marker, such as "end", "}", "]", etc.,
            // find the corresponding opening marker, and indent the line to the same
            // offset as the beginning of that line.
            return ( /*
                     * LexUtilities.isIndentToken(id) &&
                     * !LexUtilities.isBeginToken(id, doc, offset)) ||
                     */id.matches(TokenName.BRACKET_R) || id.matches(TokenName.PAR_R) || id.matches(TokenName.SQ_BRACKET_R));
        }

        return false;
    }

    private boolean isLineContinued(BaseDocument doc, int offset, int bracketBalance) throws BadLocationException {
        offset = Utilities.getRowLastNonWhite(doc, offset);
        if (offset == -1) {
            return false;
        }

        TokenSequence<? extends FanTokenID> ts = FanLexAstUtils.getFanTokenSequence(doc, offset);

        if (ts == null) {
            return false;
        }

        ts.move(offset);

        if (!ts.moveNext() && !ts.movePrevious()) {
            return false;
        }

        Token<? extends FanTokenID> token = ts.token();

        if (token != null) {
            FanTokenID id = token.id();
            boolean isContinuationOperator = (id.primaryCategory().equalsIgnoreCase("operator")
                    || tokenIs(token, "."));

            if (ts.offset() == offset && token.length() > 1 && token.text().toString().startsWith("\\")) {
                // Continued lines have different token types
                isContinuationOperator = true;
            }

            if (tokenIs(token, ",")) {
                if (bracketBalance == 0) {
                    isContinuationOperator = true;
                }

            }

            if (isContinuationOperator) {
                // Make sure it's not a case like this:
                //    alias eql? ==
                // or
                //    def ==
                token = FanLexAstUtils.getFanTokenAt(doc, Utilities.getRowFirstNonWhite(doc, offset));
                if (token != null) {
                    id = token.id();
                    if (id.matches(TokenName.BRACKET_L)) { // NOI18N
                        return false;
                    }

                }

                return true;
            }
        }

        return false;
    }

    private void reindent(final Context context,
            ParserResult info, final boolean indentOnly) {
        Document document = context.document();
        final int endOffset = Math.min(context.endOffset(), document.getLength());

        try {
            final BaseDocument doc = (BaseDocument) document; // document.getText(0, document.getLength())

            final int startOffset = Utilities.getRowStart(doc, context.startOffset());
            final int lineStart = startOffset;//Utilities.getRowStart(doc, startOffset);
            int initialOffset = 0;
            int initialIndent = 0;
            if (startOffset > 0) {
                int prevOffset = Utilities.getRowStart(doc, startOffset - 1);
                initialOffset =
                        getFormatStableStart(doc, prevOffset);
                initialIndent =
                        GsfUtilities.getLineIndent(doc, initialOffset);
            }

// Build up a set of offsets and indents for lines where I know I need
// to adjust the offset. I will then go back over the document and adjust
// lines that are different from the intended indent. By doing piecemeal
// replacements in the document rather than replacing the whole thing,
// a lot of things will work better: breakpoints and other line annotations
// will be left in place, semantic coloring info will not be temporarily
// damaged, and the caret will stay roughly where it belongs.
            final List<Integer> offsets = new ArrayList<Integer>();
            final List<Integer> indents = new ArrayList<Integer>();

            // When we're formatting sections, include whitespace on empty lines; this
            // is used during live code template insertions for example. However, when
            // wholesale formatting a whole document, leave these lines alone.
            boolean indentEmptyLines = (startOffset != 0 || endOffset != doc.getLength() /*
                     * || Utilities.isRowEmpty(doc, startOffset) ||
                     * Utilities.isRowWhite(doc, startOffset)
                     */);


            boolean includeEnd = endOffset == doc.getLength() || indentOnly;

            computeIndents(doc, initialIndent, initialOffset, endOffset, info,
                    offsets, indents, indentEmptyLines, includeEnd, indentOnly);

            doc.runAtomic(new Runnable() {

                public void run() {
                    try {
                        // Iterate in reverse order such that offsets are not affected by our edits
                        assert indents.size() == offsets.size();
                        for (int i = indents.size() - 1; i
                                >= 0; i--) {
                            int indent = indents.get(i);
                            int lineBegin = offsets.get(i);

                            if (lineBegin < lineStart) {
                                // We're now outside the region that the user wanted reformatting;
                                // these offsets were computed to get the correct continuation context etc.
                                // for the formatter
                                break;
                            }

                            if (lineBegin == lineStart && i > 0) {
                                // Look at the previous line, and see how it's indented
                                // in the buffer.  If it differs from the computed position,
                                // offset my computed position (thus, I'm only going to adjust
                                // the new line position relative to the existing editing.
                                // This avoids the situation where you're inserting a newline
                                // in the middle of "incorrectly" indented code (e.g. different
                                // size than the IDE is using) and the newline position ending
                                // up "out of sync"
                                int prevOffset = offsets.get(i - 1);
                                int prevIndent = indents.get(i - 1);
                                int actualPrevIndent = GsfUtilities.getLineIndent(doc, prevOffset);
                                if (actualPrevIndent != prevIndent) {
                                    // For blank lines, indentation may be 0, so don't adjust in that case
                                    if (!(Utilities.isRowEmpty(doc, prevOffset) || Utilities.isRowWhite(doc, prevOffset))) {
                                        indent = actualPrevIndent + (indent - prevIndent);
                                        if (indent < 0) {
                                            indent = 0;
                                        }

                                    }
                                }
                            }

                            // Adjust the indent at the given line (specified by offset) to the given indent
                            int currentIndent = GsfUtilities.getLineIndent(doc, lineBegin);

                            if (currentIndent != indent) {
                                context.modifyIndent(lineBegin, indent);
                            }

                        }

                        /*
                         * if (!indentOnly && codeStyle.reformatComments()) {
                         * reformatComments(doc, startOffset, endOffset);
						}
                         */

                    } catch (BadLocationException ble) {
                        Exceptions.printStackTrace(ble);
                    }

                }
            });
        } catch (BadLocationException ble) {
            Exceptions.printStackTrace(ble);
        }

    }

    public void computeIndents(BaseDocument doc, int initialIndent, int startOffset, int endOffset, ParserResult info,
            List<Integer> offsets,
            List<Integer> indents,
            boolean indentEmptyLines, boolean includeEnd, boolean indentOnly) {
        // The reformatting APIs in NetBeans should be lexer based. They are still
        // based on the old TokenID apis. Once we get a lexer version, convert this over.
        // I just need -something- in place until that is provided.

        try {
            // Algorithm:
            // Iterate over the range.
            // Accumulate a token balance ( {,(,[, and keywords like class, case, etc. increases the balance,
            //      },),] and "end" decreases it
            // If the line starts with an end marker, indent the line to the level AFTER the token
            // else indent the line to the level BEFORE the token (the level being the balance * indentationSize)
            // Compute the initial balance and indentation level and use that as a "base".
            // If the previous line is not "done" (ends with a comma or a binary operator like "+" etc.
            // add a "hanging indent" modifier.
            // At the end of the day, we're recording a set of line offsets and indents.
            // This can be used either to reformat the buffer, or indent a new line.

            // State:
            int offset = Utilities.getRowStart(doc, startOffset); // The line's offset
            int end = endOffset;

            int indentSize = indentSize();
            int hangingIndentSize = hangingIndentSize();

            // Pending - apply comment formatting too?


            // Build up a set of offsets and indents for lines where I know I need
            // to adjust the offset. I will then go back over the document and adjust
            // lines that are different from the intended indent. By doing piecemeal
            // replacements in the document rather than replacing the whole thing,
            // a lot of things will work better: breakpoints and other line annotations
            // will be left in place, semantic coloring info will not be temporarily
            // damaged, and the caret will stay roughly where it belongs.

            // The token balance at the offset
            int balance = 0;
            // The bracket balance at the offset ( parens, bracket, brace )
            int bracketBalance = 0;
            boolean continued = false;
            boolean checkForSignleStmt = false;
            boolean inCaseStmt = false;

            while ((!includeEnd && offset < end) || (includeEnd && offset <= end)) {
                int singleStmtAdjust = 0;
                int indent; // The indentation to be used for the current line

                int hangingIndent = continued ? (hangingIndentSize) : 0;

                if (isInLiteral(doc, offset)) {
                    // Skip this line - leave formatting as it is prior to reformatting
                    indent = GsfUtilities.getLineIndent(doc, offset);

                } else if (isEndIndent(doc, offset)) {
                    indent = (balance - 1) * indentSize + hangingIndent + initialIndent;
                } else {
                    indent = balance * indentSize + hangingIndent + initialIndent;
                }

                int endOfLine = Utilities.getRowEnd(doc, offset) + 1;

                // thibaut.c
                // start add-on for single stmt and switch/case identation handling
                Token<? extends FanTokenID> token = getFirstToken(doc, offset);
                String line = doc.getText(offset, endOfLine - offset);
                if (token != null) {
                    FanTokenID id = token.id();
                    // Check if we are in single stmt
                    if (checkForSignleStmt) {
                        if (!id.matches(TokenName.BRACKET_L)) {
                            singleStmtAdjust = indentSize;
                        }
                        checkForSignleStmt = false;
                    }
                    if (inCaseStmt) {
                        if (id.matches(TokenName.BRACKET_R) || tokenIs(token, "case") || tokenIs(token, "default")) {
                            inCaseStmt = false;
                        } else {
                            singleStmtAdjust = indentSize;
                        }

                    }
                    // Check current line to set single stmt flags for next pass
                    if (tokenIs(token, "if") || tokenIs(token, "else")
                            || tokenIs(token, "try") || tokenIs(token, "catch") || tokenIs(token, "finally")
                            || tokenIs(token, "for") || tokenIs(token, "while")) {
                        // Deal with when there is a bracket at the end of line (then not a single stmt)
                        // Not perfect ... but probably OK
                        if (line != null && !line.trim().endsWith("{")) {
                            checkForSignleStmt = true;
                        }
                    }
                    if (tokenIs(token, "case") || tokenIs(token, "default")) {
                        inCaseStmt = true;
                    }

                }
                //end add-on

                if (indent < 0) {
                    indent = 0;
                }

                int lineBegin = Utilities.getRowFirstNonWhite(doc, offset);

                // Insert whitespace on empty lines too -- needed for abbreviations expansion
                if (lineBegin != -1 || indentEmptyLines) {
                    // Don't do a hanging indent if we're already indenting beyond the parent level?

                    indents.add(Integer.valueOf(indent + singleStmtAdjust));
                    offsets.add(Integer.valueOf(offset));
                }

                if (lineBegin != -1) {
                    balance += getTokenBalance(doc, lineBegin, endOfLine, true);
                    bracketBalance +=
                            getTokenBalance(doc, lineBegin, endOfLine, false);
                    continued =
                            isLineContinued(doc, offset, bracketBalance);
                }

                offset = endOfLine;
            }

        } catch (BadLocationException ble) {
            Exceptions.printStackTrace(ble);
        }

    }

    private boolean tokenIs(Token tk, String txt) {
        return tk.text().toString().trim().equals(txt);
    }

    /*
     * void reformatComments(BaseDocument doc, int start, int end) { //int
     * rightMargin = rightMarginOverride != -1 ? rightMarginOverride :
     * GsfUtilities.codeStyle.getRightMargin();
     *
     * // ReflowParagraphAction action = new ReflowParagraphAction(); //
     * action.reflowComments(doc, start, end, rightMargin);
	}
     */
}
