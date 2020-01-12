/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.actions;

import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 *
 * @author tcolar
 */
public class CleanFanPodAction extends FanAction
{
	public CleanFanPodAction(FanProject project)
	{
		super(project);
	}

	@Override
	public String getCommandId()
	{
		// std clean action
		return ActionProvider.COMMAND_CLEAN;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		cleanPodAction(context).run();
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
