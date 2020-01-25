/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.FanLanguage;
import net.colar.netbeans.fan.project.FanProject;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;

/**
 * Run a single fan file (.fan, .fwt)
 *
 * @author tcolar
 */
public class RunFanFile extends FanAction {

    public static final String COMMAND_RUN_FAN_SCRIPT = "COMMAND_RUN_FAN_SCRIPT";

    public RunFanFile(FanProject project) {
        super(project);
    }

    @Override
    public String getCommandId() {
        // std run single command
        return COMMAND_RUN_FAN_SCRIPT;
    }

    @Override
    public void invokeAction(Lookup context) throws IllegalArgumentException {
        runFileAction().run();
    }

    @Override
    public boolean isActionEnabled(Lookup context) throws IllegalArgumentException {
        boolean results = false;
        Node[] activatedNodes = getSelectedNodes();
        if (activatedNodes != null && activatedNodes.length > 0) {
            DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
            if (gdo != null && gdo.getPrimaryFile() != null) {
                results = gdo.getPrimaryFile().getMIMEType().equals(
                        FanLanguage.FAN_MIME_TYPE);
            }
        }
        return results;
    }
}
