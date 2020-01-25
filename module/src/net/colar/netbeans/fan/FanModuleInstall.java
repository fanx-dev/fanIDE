/*
 * Thibaut Colar Dec 18, 2009
 */
package net.colar.netbeans.fan;

import net.colar.netbeans.fan.utils.FanNBLogging;
import net.colar.netbeans.fan.utils.FanUtilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import net.colar.netbeans.fan.actions.FanAction;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.indexer.FanIndexerFactory;
import net.colar.netbeans.fan.fantom.FanPlatform;
import org.openide.modules.ModuleInstall;
import org.openide.util.Exceptions;

/**
 * Module startup/shutdown hooks.
 *
 * @author thibautc
 */
public class FanModuleInstall extends ModuleInstall {
    // IF a breaking change is made to the prefs files compare to a previous version, bump up the number

    public static final String PROP_PREF_FILE_VERSION = "nb.fantom.prefs.version";
    public static final int PREF_VERSION = 2;
    private final boolean startIndexer;

    public FanModuleInstall() {
        this(true);
    }

    public FanModuleInstall(boolean startIndexer) {
        this.startIndexer = startIndexer;
    }

    /**
     * Startup
     */
    @Override
    public void restored() {
        System.out.println("Starting up Fantom plugin.");
        // Initialize special logging as needed
//        try {
//            FanNBLogging.setupLogging();
//        } catch (IOException ex) {
//            Exceptions.printStackTrace(ex);
//        }

        //start indexer
        if (startIndexer && FanPlatform.isConfigured()) {
            FanIndexerFactory.getIndexer().indexAll();
        }

        super.restored();
    }

    /**
     * Shutdown
     *
     * @return
     */
    @Override
    public boolean closing() {
        System.out.println("Shutting down Fantom plugin.");
        try {
//            FanAction.shutdownTales();
            FanIndexer.shutdown();
//            Thread.sleep(250);
//            JOTPersistanceManager.getInstance().destroy();
//            JOTLogger.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.closing();
    }

//    private void copyIsIntoFile(InputStream is, File prefFile) throws IOException
//    {
//        FileOutputStream out = new FileOutputStream(prefFile);
//        byte[] buffer = new byte[10000];
//        int read = -1;
//        while ((read = is.read(buffer)) != -1)
//        {
//            out.write(buffer, 0, read);
//        }
//        out.close();
//        is.close();
//    }
}
