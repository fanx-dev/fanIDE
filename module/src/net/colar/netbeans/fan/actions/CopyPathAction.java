/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import net.colar.netbeans.fan.project.FanProject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;

/**
 * Copy a File's absolute path to the clipboard
 * 
 * NB doesn't seem to have that feature (also it's accessible in properties panel, but that's more work)
 * @author thibautc
 */
public class CopyPathAction extends FanAction
{

    public static String COMMAND_COPY_PATH = "FANTOM COMMAND COPY PATH";

    public CopyPathAction(FanProject prj)
    {
        super(prj);
    }
    
    @Override
    public String getCommandId()
    {
        return COMMAND_COPY_PATH;
    }

    @Override
    public void invokeAction(Lookup context) throws IllegalArgumentException
    {
        Node[] activatedNodes = getSelectedNodes();
        if (activatedNodes != null && activatedNodes.length > 0)
        {
            DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
            if (gdo != null && gdo.getPrimaryFile() != null)
            {
                String path = FileUtil.toFile(gdo.getPrimaryFile()).getAbsolutePath();     
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                StringSelection stringSelection = new StringSelection(path);
                clipboard.setContents(stringSelection, null);
            }
        }
    }

    @Override
    public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
    {
        return true;
    }
}
