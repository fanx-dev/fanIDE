/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.editor;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.text.BadLocationException;
import javax.swing.text.Caret;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import net.colar.netbeans.fan.FanLanguage;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.editor.BaseDocument;
import org.netbeans.editor.Utilities;
import org.netbeans.modules.csl.api.EditorOptions;
import org.netbeans.modules.csl.api.KeystrokeHandler;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.GsfUtilities;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.editor.indent.api.IndentUtils;

/**
 * Impl. of keystrokeHandler Provides support for closing bracket/quote
 * insertion and the likes Also deals with trying to guess/insert proper
 * indentation.
 *
 * @author tcolar
 */
public class FanKeyStrokeHandler implements KeystrokeHandler {

    @Override
    public boolean beforeCharInserted(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException {
        System.out.println("beforeBreak");
        return false;
    }

    @Override
    public boolean afterCharInserted(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException {
        System.out.println("beforeBreak");
        return false;
    }

    @Override
    public boolean charBackspaced(Document document, int caretOffset, JTextComponent target, char car) throws BadLocationException {
        return false;
    }

    @Override
    public int beforeBreak(Document document, int caretOffset, JTextComponent target) throws BadLocationException {
        System.out.println("beforeBreak");

        // Deal with indentation
        BaseDocument doc = (BaseDocument) document;

        int lineBegin = Utilities.getRowStart(doc, caretOffset);
//        int lineEnd = Utilities.getRowEnd(doc, caretOffset);
//        String line = null;
//        if (lineBegin > -1 && lineEnd > lineBegin) {
//            line = doc.getText(lineBegin, lineEnd - lineBegin);
//        }

        // standard indent (same as the line we pressed return on)
        int indent = 0;
        if (lineBegin > 0) {
            indent = IndentUtils.lineIndent(document, lineBegin);
        }

        // Do the insertion and the indent
        String indentStr = createIndentString(document, indent);
        doc.insertString(caretOffset, indentStr, null);
        
        Caret caret = target.getCaret();
        caret.setDot(caretOffset);
        
        return caretOffset + indentStr.length() + 1;
    }
    
    public static String createIndentString(Document document, int indent)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i != indent; i++)
        {
            sb.append(' ');
        }
        return sb.toString();
    }

    /**
     * Helps finding matching opening/closing items (ex: {})
     *
     * @param document
     * @param caretOffset
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public OffsetRange findMatching(
            Document document, int caretOffset) {
        return OffsetRange.NONE;
    }

    @Override
    public List<OffsetRange> findLogicalRanges(ParserResult arg0, int arg1) {
        // not impl yet.
        // what is this used for ?   - provide using FanStructureAnalyzer ??
        return Collections.emptyList();
    }

    @Override
    public int getNextWordOffset(Document arg0, int arg1, boolean arg2) {
        // not impl, default will be fine.
        return -1;
    }

}
