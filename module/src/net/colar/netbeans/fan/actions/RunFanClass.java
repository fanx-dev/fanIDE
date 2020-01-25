/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.FanLanguage;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.spi.project.ActionProvider;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;

/**
 * Run a single class
 *
 * @author tcolar
 */
public class RunFanClass extends FanAction {

    public static String COMMAND_RUN_FAN_CLASS = "COMMAND_RUN_FAN_CLASS";

    public RunFanClass(FanProject project) {
        super(project);
    }

    @Override
    public String getCommandId() {
        return COMMAND_RUN_FAN_CLASS;
    }

    @Override
    public void invokeAction(Lookup context) throws IllegalArgumentException {
        runClassAction().run();
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
