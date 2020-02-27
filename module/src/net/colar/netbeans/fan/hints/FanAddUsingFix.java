/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.hints;

import fan.parser.CompilationUnit;
import fan.parser.Node;
import net.colar.netbeans.fan.parser.FanParserResult;
import org.netbeans.editor.BaseDocument;
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
    
    @Override
    public String getDescription()
    {
        return "Add using for: "+using;
    }

    @Override
    public void implement() throws Exception
    {
        FanParserResult result = (FanParserResult) ctx.parserResult;
        
        CompilationUnit unit = result.getCUnit();
        
        int insertIndex = 0;
        
        BaseDocument doc = ctx.doc;
        if(unit.usings().size() > 0)
        {
            Node node = (Node)unit.usings().get(0);
            insertIndex = (int)node.loc().offset;
            doc.insertString(insertIndex, "using "+using+"\n", null);
            return;
        }
        
        // no existing using, then add before first typedef
        if (unit.types().size() > 0) {
            Node node = (Node)unit.types().get(0);
            insertIndex = (int)node.loc().offset;
            doc.insertString(insertIndex, "using "+using+"\n", null);
            return;
        }
    }

    @Override
    public boolean isSafe()
    {
        return true;
    }

    @Override
    public boolean isInteractive()
    {
        return false;
    }

}
