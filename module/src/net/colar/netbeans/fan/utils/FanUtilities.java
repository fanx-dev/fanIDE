/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.utils;

import java.io.File;
import java.util.StringTokenizer;
import java.util.logging.Logger;
import javax.swing.text.Document;
import net.colar.netbeans.fan.fantom.FanPlatformSettings;
import net.colar.netbeans.fan.project.FanProjectFactory;
import org.openide.cookies.OpenCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;

/**
 * Generic utilities
 * @author thibautc
 */
public class FanUtilities
{

    public static final Logger logger = Logger.getLogger("FanIDE");

    public static boolean isWindowsOS() {
        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith("win")){
          return true;
        }
        return false;
    }
    
    
    /**
     * Opens the given file in the editor.
     * @param newFile
     * @throws DataObjectNotFoundException
     */
    public static void openFileInEditor(File newFile) throws DataObjectNotFoundException
    {
        FileObject fob = FileUtil.toFileObject(FileUtil.normalizeFile(newFile));
        openFileInEditor(fob);
    }

    private static void openFileInEditor(FileObject fob) throws DataObjectNotFoundException
    {
        if (fob != null)
        {
            DataObject dob = DataObject.find(fob);
            OpenCookie oc = dob.getCookie(OpenCookie.class);
            if (oc != null)
            {
                oc.open();
            }
        }
    }

    /**
     * Find a file object relative to a current fileobject.
     * @param fo
     * @param path
     * @return
     */
    public static FileObject getRelativeFileObject(final FileObject fo, String relativePath)
    {
        StringTokenizer st = new StringTokenizer(relativePath.replaceAll("\\\\", "/"), "/");
        // If fo is a  file, we start from the parent folder
        FileObject curFile = fo.isFolder() ? fo : fo.getParent();
        // folow the relative path to try and find the requested file
        while ((curFile != null) && st.hasMoreTokens())
        {
            String nameExt = st.nextToken();
            // if "." do nothing.
            if (!nameExt.equals("."))
            {
                if (nameExt.equals(".."))
                {
                    curFile = curFile.getParent();

                } else
                {
                    curFile = curFile.getFileObject(nameExt);

                }
            }
        }
        return curFile;
    }

    /**
     * Debug fileObject
     * @param fo
     */
    public static void dumpFileObject(FileObject fo)
    {
        FanUtilities.logger.fine("---- FileObject DUMP -----");
        try
        {
            dumpFileObject(fo, "");
            FanUtilities.logger.fine("**---- FileObject root dump -----");
            //dumpFileObject(fo.getFileSystem().getRoot(),"**");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void dumpFileObject(FileObject fo, String indent) throws Exception
    {
        FanUtilities.logger.fine(indent + "toStr: " + fo.toString());
        FanUtilities.logger.fine(indent + "Name: " + fo.getNameExt());
        FanUtilities.logger.fine(indent + "Path: " + fo.getPath());
        FanUtilities.logger.fine(indent + "URL: " + fo.getURL());
        FileObject[] children = fo.getChildren();
        //indent+="  ";
        //for(int i=0;i!=children.length;i++)
        //    dumpFileObject(children[i],indent);
    }

    public static File getFanUserHome()
    {
        // netbeans.user: ex ~/.netbeans/fantom/
        String nbHome = System.getProperty("netbeans.user");
        String fantomHome = nbHome + File.separator + "fantom" + File.separator;
        File f = new File(fantomHome);
        f.mkdirs();
        return f;
    }

    public static File getPodFolderForPath(String path)
    {
        File folder = new File(path);
        if (folder.isFile())
        {
            folder = folder.getParentFile();
        }
        while (folder != null)
        {
            File f = new File(folder, FanProjectFactory.BUILD_FILE);
            if (f.exists())
            {
                return FileUtil.normalizeFile(folder);
            }
            folder = folder.getParentFile();
        }
        return null;
    }
    
    public static int getIndentSize(Document document)
    {
        return new Integer(FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FMT_IDENT_SIZE, "2")).intValue();
    }
}
