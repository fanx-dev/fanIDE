/*
 * Thibaut Colar Dec 18, 2009
 */
package net.colar.netbeans.fan;

import net.colar.netbeans.fan.utils.FanUtilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import net.colar.netbeans.fan.actions.FanAction;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.indexer.IndexerHelper;
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
        FanUtilities.logger.setLevel(Level.ALL);

        //showconfig
        FanPlatform.isConfigured();

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
//            FanIndexer.shutdown();
//            Thread.sleep(250);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.closing();
    }
}
