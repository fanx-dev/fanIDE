/*
 * Thibaut Colar Mar 10, 2010
 */
package net.colar.netbeans.fan.test;

import net.colar.netbeans.fan.test.mock.MockTrampoline;
import java.io.InputStream;
import java.util.Date;
import java.util.prefs.Preferences;
import net.colar.netbeans.fan.FanModuleInstall;
import net.colar.netbeans.fan.indexer.FanIndexerFactory;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FantomParser;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.fantom.FanPlatformSettings;
import net.colar.netbeans.fan.test.mock.MockLookup;
import net.jot.prefs.JOTPropertiesPreferences;
import net.jot.testing.JOTTestable;
import org.parboiled.Rule;
import org.parboiled.parserunners.RecoveringParseRunner;
import org.parboiled.support.ParsingResult;

/**
 * Base class for CSL tests, which require a minimal Netbeans "Env" to be
 * available Also creates the platform and update the Type indexes.
 *
 * @author thibautc
 */
public abstract class FantomCSLTest implements JOTTestable {

    public JOTPropertiesPreferences prefs = new JOTPropertiesPreferences();
    private final boolean startIndexer;

    public FantomCSLTest() {
        this(true);
    }

    public FantomCSLTest(boolean startIndexer) {
        this.startIndexer = startIndexer;
    }

    public void jotTest() throws Throwable {
        FanModuleInstall mi = NBTestUtilities.initNb(startIndexer,prefs);

        if(startIndexer)
        {
            // wait for indexer to be done
            FanIndexerFactory.getIndexer().waitForEmptyFantomQueue();
        }
        
        try {
            // Run the user test
            cslTest();
        } catch (Throwable t) {
            throw (t);
        } finally {
            // try to always shutdown properly
            mi.closing();
        }
    }

    /**
     * Implement and fill with your test code
     *
     * @throws Throwable
     */
    public abstract void cslTest() throws Throwable;

    public ParsingResult<AstNode> parse(FantomParser parser, Rule rule, String input) {
        long start = new Date().getTime();
        ParsingResult<AstNode> result = new RecoveringParseRunner<AstNode>(rule).run(input);
        long time = new Date().getTime() - start;
        //System.err.println("Parsing in " + (new Date().getTime() - start) + "ms");
        if (time > 100) {
            System.err.println("Long parsing : " + (new Date().getTime() - start) + "ms, for:\n" + input);
        }
        //System.out.println(ParseTreeUtils.printNodeTree(result));
        return result;
    }
}
