/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parser.parboiled;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.parser.FanTokenID;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.parser.NBFanParser;
import net.colar.netbeans.fan.parser.parboiled.FantomLexerTokens.TokenName;
import net.colar.netbeans.fan.parser.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.parser.parboiled.pred.NodeLabelPredicate;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanFieldScopeVar;
import net.colar.netbeans.fan.scope.FanMethodScopeVar;
import net.colar.netbeans.fan.scope.FanTypeScopeVar;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.DeclarationFinder.DeclarationLocation;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.parboiled.Node;
import org.parboiled.buffers.InputBuffer;
import org.parboiled.common.Predicate;

/**
 * Utilities for lexer / parser / ast trees
 * @author tcolar
 */
public class FanLexAstUtils
{

    /**
     * Return the Actual token at the given caret position in the document.
     * @param doc
     * @param caretIndex
     * @return
     */
    public static Token<? extends FanTokenID> getFanTokenAt(Document doc, int caretIndex)
    {
        TokenSequence ts = getFanTokenSequence(doc);
        ts.move(caretIndex);
        ts.moveNext();
        @SuppressWarnings("unchecked")
        Token<? extends FanTokenID> token = ts.token();
        return token;
    }

    /**
     * Returns the tokensequence from adoc
     * @param doc
     * @return
     */
    public static TokenSequence<? extends FanTokenID> getFanTokenSequence(Document doc, int offset)
    {
        //System.err.println("doc:" + doc);
        TokenHierarchy<Document> th = TokenHierarchy.get(doc);
        //System.err.println("hierarchy: " + th);
        return getFanTokenSequence(th, offset);
    }

    public static TokenSequence<? extends FanTokenID> getFanTokenSequence(Document doc)
    {
        return getFanTokenSequence(doc, 0);
    }

    /**
     * Returns the tokensequence from th tokenhierarchy
     * @param th
     * @return
     */
    public static TokenSequence<? extends FanTokenID> getFanTokenSequence(TokenHierarchy<?> th, int offset)
    {
        TokenSequence<? extends FanTokenID> ts = th.tokenSequence(FanTokenID.language());
        if (offset != 0)
        {
            ts = ts.subSequence(offset);
        }
        return ts;
    }

    /**
     * Find the closing token matching the opening one (balanced) and return the range between the two
     * @param doc
     * @param ts
     * @param opening
     * @param closing
     * @return
     */
    public static OffsetRange findRangeFromOpening(Document doc, TokenSequence<? extends FanTokenID> ts, TokenName openingToken, TokenName closingToken)
    {
        return findRange(doc, ts, openingToken, closingToken, true);
    }

    public static boolean matchType(TokenId token, TokenName[] array)
    {
        for (TokenName t : array)
        {
            //System.out.println("Matching type: "+t+" VS "+type);
            if (token.name().equals(t.name()))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Find (backward) the opening token matching the closing one (balanced) and return the range between the two
     * @param doc
     * @param ts
     * @param opening
     * @param closing
     * @return
     */
    public static OffsetRange findRangeFromClosing(Document doc, TokenSequence<? extends FanTokenID> ts, TokenName openingToken, TokenName closingToken)
    {
        return findRange(doc, ts, openingToken, closingToken, false);
    }

    /**
     * Looking for matching(balanced) opening/closing token
     * @param doc
     * @param ts
     * @param openingID
     * @param closingID
     * @param lookForClosing (false=lookForOpening  - backward)
     * @return
     */
    private static OffsetRange findRange(Document doc, TokenSequence<? extends FanTokenID> ts, TokenName opening, TokenName closing, boolean lookForClosing)
    {
        int balance = 0;

        while (move(ts, lookForClosing))
        {
            Token<? extends FanTokenID> token = ts.token();
            FanTokenID id = token.id();

            if (id.matches(opening))
            {
                if ((!lookForClosing) && balance == 0)
                {
                    return new OffsetRange(ts.offset(), ts.offset() + token.length());
                }
                balance++;
            } else if (id.matches(closing))
            {
                if (lookForClosing && balance == 0)
                {
                    return new OffsetRange(ts.offset(), ts.offset() + token.length());
                }
                balance--;
            }
        }

        return OffsetRange.NONE;
    }

    private static boolean move(TokenSequence ts, boolean forward)
    {
        if (forward)
        {
            return ts.moveNext();
        } else
        {
            return ts.movePrevious();
        }
    }

    public static OffsetRange getNodeRange(AstNode node)
    {
        return new OffsetRange(node.getStartIndex(), node.getEndIndex());
    }

    public static AstNode getScopeNode(AstNode node)
    {
        AstNode nd = node;
        while (nd != null)
        {
            if (nd.isScopeNode())
            {
                return nd;
            }
            nd = nd.getParent();
        }
        return null;
    }

    /**
     * Check whether the parentNode is a direct wrapper of the given nodeKind
     * @param parentNode
     * @param pred
     * @return
     */
    @SuppressWarnings("unchecked")
    public static boolean isWrappingNode(AstNode parentNode, Predicate pred)
    {
        if (pred.apply(parentNode))
        {
            return true;
        }
        if (parentNode.getChildren().size() == 1)
        {
            return isWrappingNode(parentNode.getChildren().get(0), pred);
        }
        return false;
    }

    public static AstNode getFirstChildRecursive(AstNode parentNode, Predicate pred)
    {
        AstNode nd = getFirstChild(parentNode, pred);
        if (nd != null)
        {
            return nd;
        }
        for (AstNode subNode : parentNode.getChildren())
        {
            nd = getFirstChildRecursive(subNode, pred);
            if (nd != null)
            {
                return nd;
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static AstNode getFirstChild(AstNode parentNode, Predicate pred)
    {
        if (parentNode != null)
        {
            for (AstNode child : parentNode.getChildren())
            {
                if (pred.apply(child))
                {
                    return child;
                }
            }
        }
        return null;
    }

    public static List<AstNode> getChildren(AstNode parentNode, Predicate<AstNode> pred)
    {
        List<AstNode> nodes = new ArrayList<AstNode>();
        if (parentNode != null)
        {
            for (AstNode child : parentNode.getChildren())
            {
                if (pred.apply(child))
                {
                    nodes.add(child);
                }
            }
        }
        return nodes;
    }

    public static String getFirstChildText(AstNode parentNode, Predicate<AstNode> pred, boolean recursive)
    {
        AstNode node = recursive ? getFirstChildRecursive(parentNode, pred) : getFirstChild(parentNode, pred);
        return node == null ? null : node.getNodeText(true);
    }

    public static String getNodeText(Node<AstNode> node, InputBuffer inputBuffer)
    {
        int start = node.getStartIndex();
        int end = node.getEndIndex();
        return inputBuffer.extract(start, end);
    }

    public static OffsetRange getNodeRange(Node<AstNode> node)
    {
        return new OffsetRange(node.getStartIndex(), node.getEndIndex());
    }

    @SuppressWarnings("unchecked")
    public static Node<AstNode> getFirstChild(Node<AstNode> parentNode, NodeLabelPredicate pred)
    {
        if (parentNode != null)
        {
            for (Node<AstNode> child : parentNode.getChildren())
            {
                if (pred.apply(child))
                {
                    return child;
                }
            }
        }
        return null;
    }

    public static AstNode findASTNodeAt(AstNode node, int offset)
    {
        if (node != null
                && offset >= node.getStartIndex()
                && offset <= node.getEndIndex())
        {
            for (AstNode child : node.getChildren())
            {
                AstNode found = findASTNodeAt(child, offset);
                if (found != null)
                {
                    return found;
                }
            }
            return node;
        }
        return null;
    }

    public static AstNode findParentNode(final AstNode theNode, AstKind parentType)
    {
        return findParentNodeWithin(theNode, parentType, theNode.getRoot());
    }

    public static AstNode findParentNodeWithin(final AstNode theNode, AstKind parentType, AstNode within)
    {
        // don't want to mess with the original node.
        AstNode node = theNode;
        if (node.getKind() == parentType)
        {
            return node;
        }
        while (node != null && node != within)
        {
            //System.out.println(""+node.getType()+" VS "+parentType+" "+node.toStringTree());
            if (node.getKind() == parentType)
            {
                return node;
            }
            node = node.getParent();
        }
        // not found
        return null;
    }

    public static void dumpTree(AstNode node, int indent)
    {
        StringBuffer sb = new StringBuffer("Tree Dump: \n");
        getDumpTree(sb, node, indent);
        FanUtilities.logger.info(sb.toString());
    }

    private static void getDumpTree(StringBuffer sb, AstNode node, int indent)
    {
        for (int i = 0; i < indent; i++)
        {
            sb = sb.append("  ");
        }
        sb.append(node.toString()).append("\n");
        indent = indent + 1;
        for (AstNode child : node.getChildren())
        {
            getDumpTree(sb, child, indent + 1);
        }
    }

    public static AstNode getCallNodeExpr(AstNode node)
    {
        AstNode expr = FanLexAstUtils.findParentNode(node, AstKind.AST_EXPR);
        AstNode callNode = FanLexAstUtils.findParentNodeWithin(node, AstKind.AST_CALL_EXPR, expr);
        if (callNode == null)
        {
            callNode = FanLexAstUtils.findParentNodeWithin(node, AstKind.AST_CALL, expr);
            if (callNode == null)
            {
                callNode = FanLexAstUtils.findParentNodeWithin(node, AstKind.AST_INC_CALL, expr);
            }
        }
        return callNode;
    }

    public static DeclarationLocation findTypeDeclaration(FanResolvedType t, String slot)
    {
        // Find the relevant item in the source
        FileObject fo = FileUtil.toFileObject(FileUtil.normalizeFile(new File(t.getDbType().getSourcePath())));
        Source source = Source.create(fo);
        Snapshot snapshot = source.createSnapshot();
        // Parse the snaphot
        NBFanParser parser = new NBFanParser();
        try
        {
            parser.parse(snapshot, true);
        } catch (Throwable e)
        {
            return null;
        }
        FanParserTask fanResult = (FanParserTask) parser.getResult();
        AstNode rootScope = fanResult.getRootScope();

        FanTypeScopeVar typeVar = findTypeVar(rootScope, t.getDbType().getSimpleName());

        // look for a specific slot
        if (slot != null)
        {
            FanAstScopeVarBase slotVar = findSlot(typeVar, slot);
            if (slotVar != null)
            {
                return new DeclarationLocation(fo, slotVar.getNode().getStartIndex());
            }
        }

        // if not asked for a slot .. or the slot not found, go to the type
        if (typeVar != null)
        {
            return new DeclarationLocation(fo, typeVar.getNode().getStartIndex());
        }

        // not found
        return null;
    }

    public static FanTypeScopeVar findTypeVar(AstNode rootScope, String name)
    {
        for (FanAstScopeVarBase var : rootScope.getLocalScopeVars().values())
        {
            if (var instanceof FanTypeScopeVar)
            {
                if (var.getName().equals(name))
                {
                    return (FanTypeScopeVar) var;
                }
            }
        }
        return null;
    }

    public static FanAstScopeVarBase findSlot(FanTypeScopeVar type, String slot)
    {
        for (FanAstScopeVarBase slotVar : type.getNode().getLocalScopeVars().values())
        {
            if (slotVar instanceof FanMethodScopeVar || slotVar instanceof FanFieldScopeVar)
            {
                if (slotVar.getName().equals(slot))
                {
                    return slotVar;
                }
            }
        }
        return null;
    }

}
