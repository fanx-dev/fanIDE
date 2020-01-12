/*
 * Thibaut Colar Aug 13, 2009
 */
package net.colar.netbeans.fan.project;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.colar.netbeans.fan.actions.BuildAndRunFanClassAction;
import net.colar.netbeans.fan.actions.BuildAndRunFanFileAction;
import net.colar.netbeans.fan.actions.BuildAndRunFanPodAction;
import net.colar.netbeans.fan.actions.BuildAndRunFanTestAction;
import net.colar.netbeans.fan.actions.BuildAndTestPodAction;
import net.colar.netbeans.fan.actions.BuildFanPodAction;
import net.colar.netbeans.fan.actions.CleanAndBuildFanPodAction;
import net.colar.netbeans.fan.actions.CleanFanPodAction;
import net.colar.netbeans.fan.actions.CopyPathAction;
import net.colar.netbeans.fan.actions.DebugFanPodAction;
import net.colar.netbeans.fan.actions.FanAction;
import net.colar.netbeans.fan.actions.RunFanClass;
import net.colar.netbeans.fan.actions.RunFanFile;
import net.colar.netbeans.fan.actions.RunFanPodAction;
import net.colar.netbeans.fan.actions.RunFanShellAction;
import net.colar.netbeans.fan.actions.RunFanTest;
import net.colar.netbeans.fan.actions.TestFanPodAction;
import org.netbeans.spi.project.ActionProvider;
import org.openide.LifecycleManager;
import org.openide.util.Lookup;
import org.openide.util.RequestProcessor;

/**
 * ActionProvider impl.
 * Provides supported actions for project.
 */
public class FanProjectActionProvider implements ActionProvider
{

	FanProject project;
	private final Map<String, FanAction> commands;

	public FanProjectActionProvider(FanProject project)
	{
		commands = new LinkedHashMap<String, FanAction>();
		FanAction[] commandArray = new FanAction[]
		{
			new RunFanPodAction(project),
			new BuildAndRunFanPodAction(project),
			new TestFanPodAction(project),
			new DebugFanPodAction(project),
			new BuildFanPodAction(project),
			new CleanFanPodAction(project),
			new CleanAndBuildFanPodAction(project),
			new BuildAndTestPodAction(project),
			new RunFanTest(project),
			new BuildAndRunFanTestAction(project),
            new RunFanClass(project),
            new BuildAndRunFanClassAction(project),
			new RunFanShellAction(project),
            new CopyPathAction(project),
			new RunFanFile(project),
			new BuildAndRunFanFileAction(project),
		};
		for (FanAction command : commandArray)
		{
			commands.put(command.getCommandId(), command);
		}
	}

	@Override
	public String[] getSupportedActions()
	{
		final Set<String> names = commands.keySet();
		return names.toArray(new String[names.size()]);
	}

	@Override
	public void invokeAction(final String commandName, final Lookup context) throws IllegalArgumentException
	{
		final FanAction command = findCommand(commandName);
		assert command != null;
		if (command.saveRequired())
		{
			LifecycleManager.getDefault().saveAll();
		}
		if (!command.asyncCallRequired())
		{
			command.invokeAction(context);
		} else
		{
			RequestProcessor.getDefault().post(new Runnable()
			{

				public void run()
				{
					command.invokeAction(context);
				}
			});
		}
	}

	@Override
	public boolean isActionEnabled(String commandName, Lookup context) throws IllegalArgumentException
	{
		return true;
		/*
		final Command command = findCommand(commandName);
		assert command != null;
		return command.isActionEnabled(context);
		 */
	}

	private FanAction findCommand(final String commandName)
	{
		assert commandName != null;
		return commands.get(commandName);
	}
}
