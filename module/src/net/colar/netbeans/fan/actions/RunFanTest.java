/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.colar.netbeans.fan.FanLanguage;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.spi.project.ActionProvider;
import org.openide.filesystems.FileObject;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;

/**
 * Run a single fan test
 * @author tcolar
 */
public class RunFanTest extends FanAction
{

	public static final Pattern TEST_CLASS = Pattern.compile("class\\s+(\\S+)");
	public static final String COMMAND_TEST_FILE = "COMMAND_TEST_FILE";

	public RunFanTest(FanProject project)
	{
		super(project);
	}

	@Override
	public String getCommandId()
	{
		// std run single command
		return COMMAND_TEST_FILE;
	}

	@Override
	public void invokeAction(Lookup lookup) throws IllegalArgumentException
	{
		testFileAction(lookup, getFileName(lookup,getSelectedNodes())).run();
	}

	public static String getFileName(Lookup lookup, Node[] activatedNodes)
	{
		FileObject file = null;
		DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
		if (gdo != null && gdo.getPrimaryFile() != null)
		{
			file = gdo.getPrimaryFile();
		}
		String name = null;
		if (file != null)
		{
			try
			{
				String txt = file.asText();
				Matcher m = TEST_CLASS.matcher(txt);
				if (m.find())
				{
					name = m.group(1);
				}
			} catch (Exception e)
			{
			}
		}
		return name;
	}

	@Override
	public boolean isActionEnabled(Lookup context) throws IllegalArgumentException
	{
		boolean results = false;
		Node[] activatedNodes = getSelectedNodes();
		if (activatedNodes != null && activatedNodes.length > 0)
		{
			DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
			if (gdo != null && gdo.getPrimaryFile() != null)
			{
				results = gdo.getPrimaryFile().getMIMEType().equals(
					FanLanguage.FAN_MIME_TYPE);
			}
		}
		return results;
	}
}
