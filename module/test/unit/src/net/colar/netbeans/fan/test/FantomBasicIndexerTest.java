/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.test;

import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 *
 * @author tcolar
 */
public class FantomBasicIndexerTest extends FantomCSLTestBase {

    @Override
    public void cslTest() throws Throwable {
        Snapshot snapshot = NBTestUtilities.textToSnapshot("using fwt::Button\nclass Test{Int a:=3;Void do(){}}", "text/fan");
        FanParserTask result = new FanParserTask(snapshot);
        result.parse(true, 2000);
        result.parseGlobalScope();
        //result.parseLocalScopes();
        
        FanLexAstUtils.dumpTree(result.getAstTree(), 0);
    }
}
