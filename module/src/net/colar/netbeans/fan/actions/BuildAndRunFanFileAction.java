/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.extexecution.ExecutionService;
import org.openide.util.Lookup;

/**
 * Build & Run a script
 * @author tcolar
 */
public class BuildAndRunFanFileAction extends FanAction
{
    public static final String COMMAND_BUILD_RUN_FAN_SCRIPT = "COMMAND_BUILD_RUN_FAN_SCRIPT";

	public BuildAndRunFanFileAction(FanProject project)
	{
		super(project);		
	}

	@Override
	public String getCommandId()
	{
		return COMMAND_BUILD_RUN_FAN_SCRIPT;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		//TODO: only build if files changed ?
		FanExecutionGroup group = new FanExecutionGroup(
				buildPodAction(context),
				runFileAction());

		ExecutionService service =
				ExecutionService.newService(
				group,
				descriptor, getProjectName(context));

		service.run();
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
