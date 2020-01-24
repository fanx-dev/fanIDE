/*
 * Thibaut Colar Mar 10, 2010
 */
package net.colar.netbeans.fan.test;

import java.io.File;
import java.util.List;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.structure.FanStructureAnalyzer;
import org.netbeans.modules.parsing.api.Snapshot;

/**
 * Test the structure analyzer
 *
 * @author thibautc
 */
public class FantomStructureAnalyzerTest extends FantomCSLTestBase {

    public void cslTest() throws Throwable {
//        testAllFanFilesUnder(fanHome + "/examples/");
        testAllFanFilesUnder(fanHome + "/src/util");
    }

    private static void testAllFanFilesUnder(String folderPath) throws Exception {
        List<File> files = NBTestUtilities.listAllFanFilesUnder(folderPath);
        for (File f : files) {
            Exception e = null;
            try {
                analyzeFile(f);
            } catch (Exception ex) {
                e = ex;
                e.printStackTrace();
            }
            assertTrue("StructureAnalysis of: " + f.getAbsolutePath(), e == null);
        }
    }

    public static FanParserTask analyzeFile(File file) throws Exception {
        Snapshot snap = NBTestUtilities.fileToSnapshot(file);
        FanParserTask task = new FanParserTask(snap);
        task.parse(true, 2000);
        task.parseGlobalScope();
        if (task.getParsingResult().hasErrors()) {
            for (org.netbeans.modules.csl.api.Error err : task.getDiagnostics()) {
                System.err.println("Error: " + err);
                throw new Exception("Parsing errors");
            }
        }
        FanStructureAnalyzer analyzer = new FanStructureAnalyzer();
        analyzer.scan(task);
        if (task.getDiagnostics().size() > 0) {
            boolean hasErr = false;
            for (org.netbeans.modules.csl.api.Error err : task.getDiagnostics()) {
                String desc = err.getDisplayName();
                // Avoid known false positives (we don't index java.awt & javax.swing by default)
                if (!desc.contains("java.awt") && !desc.contains("javax.swing") && !desc.contains("javax.script") && !desc.contains("ScriptEngine")) {
                    hasErr = true;
                    System.err.println("Error: " + err);
                }
            }
            if (hasErr) {
                throw new Exception("Structure analyzer errors");
            }
        }
        return task;
    }

//    public static void main(String[] args) {
//        try {
//            JOTTester.singleTest(new FantomStructureAnalyzerTest(), false);
//        } catch (Throwable t) {
//            t.printStackTrace();
//        }
//    }
}
