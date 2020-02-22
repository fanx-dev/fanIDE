/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.execution.FanExecutionGroup;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.extexecution.ExecutionService;
import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 * Build & Run a test
 * @author tcolar
 */
public class BuildAndRunFanTestAction extends FanAction
{
    public static final String COMMAND_BUILD_RUN_FAN_TEST = ActionProvider.COMMAND_TEST_SINGLE;

	public BuildAndRunFanTestAction(FanProject project)
	{
		super(project);		
	}

	@Override
	public String getCommandId()
	{
		return COMMAND_BUILD_RUN_FAN_TEST;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		FanExecutionGroup group = new FanExecutionGroup(
				buildPodAction(context),
				testFileAction(context, RunFanTest.getFileName(context,getSelectedNodes()))
        );

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
