/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.handlers;

//import fanx.util.FileUtil;
import java.util.Hashtable;
import javax.swing.text.Document;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.VarKind;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.modules.csl.api.DeclarationFinder;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.openide.filesystems.FileObject;

/**
 * Helper to find the declaration of a type/slot
 * @author thibautc
 */
public class FanDeclarationFinder implements DeclarationFinder
{

    public DeclarationLocation findDeclaration(ParserResult result, int caretOffset)
    {
        FanParserTask task = (FanParserTask) result;
        AstNode rootNode = task.getAstTree();
        AstNode curNode = FanLexAstUtils.findASTNodeAt(rootNode, caretOffset);
        String text = curNode.getText().trim();

        AstNode scopeNode = FanLexAstUtils.getScopeNode(curNode);

        // Try local vars first
        Hashtable<String, FanAstScopeVarBase> vars = scopeNode.getAllScopeVars(false);
        if (vars.containsKey(text))
        {
            FanAstScopeVarBase var = vars.get(text);
            VarKind kind = var.getKind();
            if (kind.isLocal())
            {
                AstNode nd = var.getType().getScopeNode();
                FileObject fo = task.getSourceFile();
                return new DeclarationLocation(fo, nd.getStartIndex());
            }
        }

        // resolve external
        FanResolvedType t;
        String slot = null;

        t = FanResolvedType.resolveCallLeftHandSide(curNode);

        if (t != null)
        {
            slot = text;
            // We want to search in the file where the slot is defined (could be inherited)
            t = t.resolveSlotBaseType(slot, task);
        } else
        {
            t = FanResolvedType.resolveInScope(scopeNode, text);
        }

        if (!t.isResolved())
        {
            t = FanResolvedType.makeFromTypeSig(scopeNode, text);
        }

        if (t.isResolved() && t.getDbType().isFromSource())
        {
            return FanLexAstUtils.findTypeDeclaration(t, slot);
        }

        // Not found
        return DeclarationLocation.NONE;
    }

    @SuppressWarnings(value="unchecked")
    public OffsetRange getReferenceSpan(Document doc, int caretOffset)
    {
        Token tk = FanLexAstUtils.getFanTokenAt(doc, caretOffset);
        TokenHierarchy th = TokenHierarchy.get(doc);
        int start = tk.offset(th);
        int end = start + tk.length();
        OffsetRange range = new OffsetRange(start, end);
        System.out.println("getRefSpan: " + start + "-" + end);
        return range;
    }

}
