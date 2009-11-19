/*
 * Thibaut Colar Nov 18, 2009
 */

package net.colar.netbeans.fan;

import java.util.logging.LogManager;

/**
 * Class used for setting up temporary special Netbeans log levels (for debugging)
 * SetupLogging Called from FanLanguage
 * @author thibautc
 */
public class FanNBLogging
{
	static void setupLogging()
	{
		//System.setProperty("org.netbeans.modules.debugger.jpda.breakpoints.level", "100");
		//System.setProperty("org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater.level", "100");
		//System.setProperty("org.netbeans.modules.parsing.spi.indexing.support.QuerySupport.level", "100");
		//System.setProperty("org.netbeans.modules.parsing.impl.indexing.lucene.LuceneIndex.level","100");
		try
		{
			LogManager.getLogManager().readConfiguration();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
