/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.extexecution.ExecutionService;
import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class CleanAndBuildFanPodAction extends FanAction
{
	public CleanAndBuildFanPodAction(FanProject project)
	{
		super(project);
	}

	@Override
	public String getCommandId()
	{
		// std clean&build action
		return ActionProvider.COMMAND_REBUILD;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		FanExecutionGroup group = new FanExecutionGroup(
				cleanPodAction(context),
				buildPodAction(context));

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
