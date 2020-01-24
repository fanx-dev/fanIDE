/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.test;

import fanx.util.FileUtil;
import java.io.File;
import java.util.List;
import net.colar.netbeans.fan.parser.FanParserTask;
import org.netbeans.modules.parsing.api.Snapshot;
import org.parboiled.errors.ErrorUtils;

/**
 * Parse all the fantom sources and find the one that are slow or have errors
 * Copy them to /tmp/fantom_test/broken/ for further investigation
 * @author tcolar
 */
public class FantomProblemFinder extends FantomCSLTestBase {

    
    @Override
    public void cslTest() throws Throwable {

        List<File> files = NBTestUtilities.listAllFanFilesUnder(fanHome + "/src/util");
        //List<File> files = NBTestUtilities.listAllFanFilesUnder(fanHome + "/examples/");
        for (File f : files) {
            Snapshot snapshot = NBTestUtilities.fileToSnapshot(f);
            FanParserTask result = new FanParserTask(snapshot);
            try {

                result.parse(true, 1000);
                if(result.getAstTree() == null )
                    throw new Exception("Null AST");
                result.parseGlobalScope();
                result.parseLocalScopes();
                if(result.getRootScope() == null )
                    throw new Exception("Null Root scope");
                if(!result.getDiagnostics().isEmpty())
                    throw new Exception("Errors found "+ErrorUtils.printParseErrors(result.getParsingResult()));
            } catch (Exception e) {
                System.out.println("Failed file: " + f.getAbsolutePath());
                //e.printStackTrace();
                String relPath = f.getAbsolutePath().substring(fanHome.length());
                File file = new File("/tmp/fantom_tst/broken/"+relPath);
                file.getParentFile().mkdirs();
                FileUtil.copy(f, file);
            }
            //FanLexAstUtils.dumpTree(result.getAstTree(), 0);
        }

    }

//    public static void main(String[] args) {
//        try {
//            JOTTester.singleTest(new FantomProblemFinder(), false);
//        } catch (Throwable t) {
//            t.printStackTrace();
//        }
//    }
    
}
