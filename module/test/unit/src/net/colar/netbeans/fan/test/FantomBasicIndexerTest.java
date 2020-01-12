/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.test;

import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.jot.testing.JOTTester;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 *
 * @author tcolar
 */
public class FantomBasicIndexerTest extends FantomCSLTest {

    @Override
    public void cslTest() throws Throwable {
        Snapshot snapshot = NBTestUtilities.textToSnapshot("using fwt::Button\nclass Test{Int a:=3;Void do(){}}", "text/fan");
        FanParserTask result = new FanParserTask(snapshot);
        result.parse(true, 2000);
        result.parseGlobalScope();
        //result.parseLocalScopes();
        
        FanLexAstUtils.dumpTree(result.getAstTree(), 0);
    }

    public static void main(String[] args) {
        try {
            JOTTester.singleTest(new FantomBasicIndexerTest(), false);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
