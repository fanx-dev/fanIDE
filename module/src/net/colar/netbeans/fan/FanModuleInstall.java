/*
 * Thibaut Colar Dec 18, 2009
 */
package net.colar.netbeans.fan;

import fanjardist.Main;
import net.colar.netbeans.fan.utils.FanUtilities;
import java.util.logging.Level;
import net.colar.netbeans.fan.fantom.FanPlatform;
import org.openide.modules.ModuleInstall;

/**
 * Module startup/shutdown hooks.
 *
 * @author thibautc
 */
public class FanModuleInstall extends ModuleInstall {

    static {
        Main.boot();
        System.out.println("fan runtime init");
    }

    public FanModuleInstall() {
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
        FanPlatform.checkConfigured(10);
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
        return super.closing();
    }
}
