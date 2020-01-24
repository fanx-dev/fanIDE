/*
 * Thibaut Colar Nov 18, 2009
 */

package net.colar.netbeans.fan.utils;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;

/**
 * Class used for setting up temporary special Netbeans log levels (for debugging)
 * SetupLogging Called from FanModuleInstall
 * @author thibautc
 */
public class FanNBLogging
{
	public static void setupLogging(String logFile) throws IOException
	{
		ConsoleHandler consoleHandler = new ConsoleHandler();
                FanUtilities.GENERIC_LOGGER.addHandler(consoleHandler);
                FileHandler fileHandler = new FileHandler(logFile);
                FanUtilities.GENERIC_LOGGER.addHandler(fileHandler);
	}
}
