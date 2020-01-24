/*
 * Thibaut Colar Mar 10, 2010
 */
package net.colar.netbeans.fan.test;

import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.prefs.Preferences;
import javax.swing.text.StyledDocument;
import net.colar.netbeans.fan.FanModuleInstall;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.indexer.FanIndexerFactory;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.fantom.FanPlatformSettings;
import net.colar.netbeans.fan.test.mock.MockLookup;
import net.colar.netbeans.fan.test.mock.MockProjectManager;
import net.colar.netbeans.fan.test.mock.MockTrampoline;
import net.colar.netbeans.fan.test.mock.TestEnvironmentFactory;
import net.jot.prefs.JOTPropertiesPreferences;
import org.netbeans.editor.BaseDocument;
import org.netbeans.modules.csl.api.DataLoadersBridge;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;

/**
 *
 * @author thibautc
 */
public class NBTestUtilities {

    public static Snapshot textToSnapshot(String text, String mimeType) throws Exception {
        BaseDocument doc = new BaseDocument(true, mimeType);
        StringReader reader = new StringReader(text);
        doc.read(reader, 0);
        Source source = Source.create(doc);
        Snapshot snap = source.createSnapshot();
        return snap;
    }

    public static Snapshot fileToSnapshot(File f) throws Exception {
        FileObject fo = FileUtil.toFileObject(FileUtil.normalizeFile(f));
        Source source = Source.create(fo);
        Snapshot snap = source.createSnapshot();
        return snap;
    }

    public static List<File> listAllFanFilesUnder(String folderPath) throws Exception {
        List<File> results = new ArrayList<File>();
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                results.addAll(listAllFanFilesUnder(f.getAbsolutePath()));
            } else {
                if (f.getName().equals("gamma.fan")) // Known invalid file
                {
                    continue;
                }
                if (f.getName().endsWith(".fan") || f.getName().endsWith(".fwt")) {
                    results.add(f);
                }
            }
        }
        return results;
    }
    
    static FanModuleInstall initNb(boolean startIndexer, JOTPropertiesPreferences prefs) throws Exception
    {
        InputStream is = NBTestUtilities.class.getResourceAsStream("test.properties");
        prefs.loadFrom(is);

        // Set netbeans props
        System.setProperty("netbeans.full.hack", "true");
        /*
         * System.setProperty("java.util.prefs.PreferencesFactory",
			MemoryPreferencesFactory.class.getName());//NOI18N
         */
        Preferences.userRoot().sync();
        // Addd the required trampoline impl.
        MockLookup.setInstances(new MockTrampoline(), new TestEnvironmentFactory(), new MockProjectManager());

        // Setup the test Platform
        System.setProperty("netbeans.user", prefs.getString("test.home")); // the user it will run in, should probably use some netbeans prop instaed
        FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_FAN_HOME, prefs.getString("fantom.home"));
        FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_DEBUG_PORT, "8080");
        FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_RUN_OPTIONS, "-Xmx256m");
        FanPlatform.updateFromSettings();

        // Initialize the module (JavaOnTracks startup hooks)
        FanModuleInstall mi = new FanModuleInstall(startIndexer);
        // Note: this will run the indexer (might take a while the first time)
        mi.restored();

        if(startIndexer)
        {
            // wait for indexer to be done
            FanIndexerFactory.getIndexer().waitForEmptyFantomQueue();
        }
        return mi;
    }

    /**
     * Warmup the parser so first run won't be slower than normal
     * Doesn't work ...i guess would need to parse a real file with all kind of stuff in it ?
     */
    static void warmupParser() {
        try {
            new FanParserTask(textToSnapshot("class Dummy{Void dummyMethod(){a := 23.abs}}", "text/fan")).parse(true, 2000);
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
