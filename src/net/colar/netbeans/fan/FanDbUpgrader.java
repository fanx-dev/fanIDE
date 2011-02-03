/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.io.File;
import net.jot.logger.JOTLogger;
import net.jot.persistance.JOTDBUpgrader;

/**
 * Handles DB upgrades
 * @author tcolar
 */
public class FanDbUpgrader extends JOTDBUpgrader
{
    // Change  when DB tables are chnage(incompatible) or want to force deletin of all tables
    private int VERSION = 5;

    @Override
    public void upgradeDb(String dbName, int fromVersion) throws Exception
    {
        // For now just whipeout the DB and let it rebuild
        if (fromVersion != VERSION)
        {
            JOTLogger.info(this, "Indexer database version changed! - Deleting current index");
        }
    }

    public static synchronized void deleteTables(String dbName)
    {
        File dbHome = new File(FanUtilities.getFanUserHome().getAbsolutePath() + File.separator + "db" + File.separator);
        if (dbHome.exists())
        {
            // Delete existing db data files
            for (File f : dbHome.listFiles())
            {
                if (f.isFile() && f.getName().startsWith(dbName))
                {
                    f.delete();
                }
            }
        }
    }

    @Override
    public int getLatestVersion()
    {
        return VERSION;
    }
}
