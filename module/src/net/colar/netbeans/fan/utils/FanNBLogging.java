/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

/**
 * Class used for setting up temporary special Netbeans log levels (for
 * debugging) SetupLogging Called from FanModuleInstall
 *
 * @author thibautc
 */
public class FanNBLogging {

    public static void setupLogging() throws IOException {
        File fantomHome = FanUtilities.getFanUserHome();
        File logHome = new File(fantomHome + File.separator + "log" + File.separator);
        logHome.mkdirs();
        String logFile = logHome.getAbsolutePath() + File.separator + "jot.log";
        ConsoleHandler consoleHandler = new ConsoleHandler();
        FanUtilities.logger.addHandler(consoleHandler);
        FileHandler fileHandler = new FileHandler(logFile);
        FanUtilities.logger.addHandler(fileHandler);
    }
}
