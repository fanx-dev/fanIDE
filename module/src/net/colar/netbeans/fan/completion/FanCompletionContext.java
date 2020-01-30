/*
 * Thibaut Colar Aug 19, 2009
 */
package net.colar.netbeans.fan.completion;

import javax.swing.text.Document;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.indexer.FanTokenID;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.parser.parboiled.AstKind;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler.QueryType;

/**
 * Store completion context data and determine which completion type to provide
 * (ie: pod etc...)
 *
 * See javadoc of determineCompletionType() for much more details
 *
 * @author thibautc
 */
public class FanCompletionContext {

    private completionTypes completionType;
    private int offset;
    private QueryType queryType;
    private boolean caseSensitive;
    private boolean isPrefixMatch;
    private Document doc;
    //private CommonTree rootNode;
    private TokenSequence<? extends FanTokenID> tokenStream;
    //private CommonTree curNode;

    public static enum completionTypes {

        UNKNOWN, ROOT_LEVEL, IMPORT_POD, IMPORT_FFI_JAVA, CALL, ID
    };
    private CodeCompletionContext context;
    FanParserTask result;
    private String preamble = "";

    public FanCompletionContext(CodeCompletionContext context) {
        this.context = context;
        result = (FanParserTask) context.getParserResult();

        offset = context.getCaretOffset();
        String prefix = context.getPrefix();
        if (prefix == null) {
            prefix = "";
        }
        queryType = context.getQueryType();// what's this ?
        caseSensitive = context.isCaseSensitive();
        isPrefixMatch = context.isPrefixMatch(); // ?
        doc = result.getSnapshot().getSource().getDocument(true);
        tokenStream = FanLexAstUtils.getFanTokenSequence(doc);

        AstNode rootNode = result.getAstTree();
        AstNode curNode = FanLexAstUtils.findASTNodeAt(rootNode, offset);

        completionType = determineCompletionType(curNode);
        FanUtilities.logger.fine("Compl. type:" + completionType.toString());
    }

    /**
     * Figure out what type of completion we will propose
     *
     * NOTE: Call can be after '.' or '?.' NOTE: For inferred vars ... try to
     * recognize the 'easy' ones (literals):
     * http://wiki.colar.net/fan_cheat_sheet#literals Easy: Local Fields, Local
     * method calls, Bool, Numbers(Char), Str, Uri, 'Type (#)'?? Less easy:
     * Lists, Maps, Range, Inherited methods calls, Inherited fields, Static
     * method/field More Difficult: External fields, methods.
     *
     * What to complete ? - Outside of type, default: propose root level items
     * (Class, public etc...)
     *
     * - In using statement * before '::' give pod lists + 'java' * after '::'
     * give type list of given pod
     *
     * - In a Type (class,mixin, enum) * After 'super.' -> Propose methods to
     * override (abstract, override) * After '.' -> if type before '.' can be
     * determined, propose that type's slot. Since we are in Type .. must be
     * another (possibly inherited) Field or a static call .. so the type must
     * be known. * Default -> List all Types ? (favor/only? 'using' types ?),
     * autoadd new types to using ?
     *
     * - In a Method (incl constructors) * Default: Propose other slots
     * (fields/methods) including inerited, propose method params, propose
     * localVars. Propose all Types too ? * After 'this.' : Propose fields
     * (incl. inherited), methods?(no) * After '.': if type before '.' can be
     * determined, propose that type's slot. Otherwise ? propose nothing ? or
     * just Obj slots ? * After 'super.' : Propose inherited slots.
     *
     * - It block * Try to propose right stuff for 'it.'
     *
     * - Closure * Propose closure params
     *
     * - Switch Case: Propose enum values if switching over enum
     *
     * - Try/Catch : No completion for now - fantom unchecked
     *
     * TODO: Propositions visibility (Don't propose things that are not
     * accesible) - Propose localVars only within same "block" - Propose private
     * slots only within same Type - Propose internal slots only within same Pod
     * - Propose protected slots only within "subtypes"
     *
     */
    private completionTypes determineCompletionType(AstNode node) {
        //result.dumpTree();
        if (node == null) {
            FanUtilities.logger.info("Node : Null !");
            // Root level (not in type) default
            return completionTypes.ROOT_LEVEL;
        } else {
            FanUtilities.logger.fine("Node : " + node.toString());
            AstNode usingNode = FanLexAstUtils.findParentNode(node, AstKind.AST_USING);
            if (usingNode == null) {
                usingNode = FanLexAstUtils.findParentNode(node, AstKind.AST_INC_USING);
            }
            if (usingNode != null) {
                //System.out.println("usingNode :" + usingNode.toString() + " " + usingNode.toStringTree());
                return completionTypes.IMPORT_POD;
            }
            // If not in "using" but not in a type either, propose root types only
            if (FanLexAstUtils.findParentNode(node, AstKind.AST_TYPE_DEF) == null) {
                return completionTypes.ROOT_LEVEL;
            }

            // expression completion after a '.' or '?.'
            //System.out.println("Node :" + node.toString() + " " + node.toStringTree());
            // Default proposal for ID's (local vars etc..)

            // do args first because they can "in" a call expression, yet are not part of the call expression
            if (FanLexAstUtils.findParentNode(node, AstKind.AST_ARG) != null) {
                return completionTypes.ID;
            }
            // do calls
            AstNode callExpr = FanLexAstUtils.findParentNode(node, AstKind.AST_CALL_EXPR);
            if (callExpr == null) {
                callExpr = FanLexAstUtils.findParentNode(node, AstKind.AST_CALL);
            }
            if (callExpr == null) {
                callExpr = FanLexAstUtils.findParentNode(node, AstKind.AST_INC_CALL);
            }
            if (callExpr != null) {
                return completionTypes.CALL;
            }
            // Default proposal for ID's (local vars etc..)
            if (FanLexAstUtils.findParentNode(node, AstKind.AST_ID) != null) {
                return completionTypes.ID;
            }
            // Type and ID are same
            if (FanLexAstUtils.findParentNode(node, AstKind.AST_TYPE) != null) {
                return completionTypes.ID;
            }
        }
        // restore ts offset
        //tokenStream.move(offset);
        return completionTypes.UNKNOWN;
    }

    public boolean isCaseSensitive() {
        return caseSensitive;
    }

    public completionTypes getCompletionType() {
        return completionType;
    }

    public CodeCompletionContext getContext() {
        return context;
    }

    /*
     * public CommonTree getCurNode() { return curNode;
	}
     */
    public Document getDoc() {
        return doc;
    }

    public boolean isIsPrefixMatch() {
        return isPrefixMatch;
    }

    public int getOffset() {
        return offset;
    }

    public QueryType getQueryType() {
        return queryType;
    }

    public FanParserTask getResult() {
        return result;
    }

    /*
     * public CommonTree getRootNode() { return rootNode;
	}
     */
    public TokenSequence<? extends FanTokenID> getTokenStream() {
        return tokenStream;
    }

    public String getPreamble() {
        return preamble;
    }
}
