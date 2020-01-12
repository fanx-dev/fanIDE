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
public class BuildFanPodAction extends FanAction
{
	public BuildFanPodAction(FanProject project)
	{
		super(project);
	}

	@Override
	public String getCommandId()
	{
		return ActionProvider.COMMAND_BUILD;
	}

	@Override
	public void invokeAction(Lookup context) throws IllegalArgumentException
	{
		buildPodAction(context).run();
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		return true;
	}
}
