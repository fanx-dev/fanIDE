/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.util.concurrent.Future;
import net.colar.netbeans.fan.project.FanProject;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class RunFanPodAction extends FanAction {

    public static final String COMMAND_RUN_FAN_POD = "COMMAND_RUN_FAN_POD";

    public RunFanPodAction(FanProject project) {
        super(project);
    }

    @Override
    public String getCommandId() {
        return COMMAND_RUN_FAN_POD;
    }

    @Override
    public void invokeAction(Lookup context) throws IllegalArgumentException {
        Future<Integer> f = runPodAction(context, false).run();
    }

    @Override
    public boolean isActionEnabled(Lookup context) throws IllegalArgumentException {
        return true;
    }

}
