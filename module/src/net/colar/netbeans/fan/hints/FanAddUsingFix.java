/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.hints;

import java.util.List;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.parser.parboiled.AstKind;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parser.parboiled.pred.NodeKindPredicate;
import org.netbeans.modules.csl.api.HintFix;
import org.netbeans.modules.csl.api.RuleContext;

/**
 * Propose/handles adding a missing using statement
 *
 * @author thibautc
 */
public class FanAddUsingFix implements HintFix
{
    private final RuleContext ctx;
    private final String using;
    public FanAddUsingFix(RuleContext ctx, String usingString)
    {
        this.ctx = ctx;
        this.using = usingString;
    }
    
    public String getDescription()
    {
        return "Add using for: "+using;
    }

    public void implement() throws Exception
    {
        FanParserTask result = (FanParserTask) ctx.parserResult;
        AstNode root = result.getAstTree();
        // If no existing using statements found, will add at before first type def, otherwise before other usings
        //TODO: add after last using rather than before first might make more sense - but trickier
        
        int insertIndex = 0;
        AstNode node= FanLexAstUtils.getFirstChildRecursive(root, new NodeKindPredicate(AstKind.AST_USING));
        if(node != null)
        {
            insertIndex = node.getStartIndex();
            ctx.doc.insertString(insertIndex, "using "+using+"\n", null);
            return;
        }
        
        // no existing using, then add before first typedef
        node = FanLexAstUtils.getFirstChildRecursive(root, new NodeKindPredicate(AstKind.AST_TYPE_DEF));
        if(node!=null)
            insertIndex = node.getStartIndex();

        ctx.doc.insertString(insertIndex, "using "+using+"\n\n", null);
    }

    public boolean isSafe()
    {
        return true;
    }

    public boolean isInteractive()
    {
        return false;
    }

}
