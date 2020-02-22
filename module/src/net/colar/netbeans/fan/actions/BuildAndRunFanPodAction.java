/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.execution.FanExecutionGroup;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.extexecution.ExecutionDescriptor;
import org.netbeans.api.extexecution.ExecutionService;
import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class BuildAndRunFanPodAction extends FanAction
{
	// Make this the standard RUN command for now
	public static final String COMMAND_BUILD_RUN_FAN_POD = ActionProvider.COMMAND_RUN;

	public BuildAndRunFanPodAction(FanProject project)
	{
		super(project);
		
	}

	@Override
	public String getCommandId()
	{
		return COMMAND_BUILD_RUN_FAN_POD;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		//TODO: only build if files changed ?
		FanExecutionGroup group = new FanExecutionGroup(
				buildPodAction(context),
				runPodAction(context, false));

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
