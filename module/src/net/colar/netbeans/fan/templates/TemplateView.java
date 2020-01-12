package net.colar.netbeans.fan.templates;

import java.text.DateFormat;
import java.util.Date;
import net.colar.netbeans.fan.FanUtilities;
import net.jot.web.views.JOTLightweightView;
import org.openide.filesystems.FileObject;

/**
 * Custom view for tJOT templates used in netbeans.
 * @author thibautc
 */
public class TemplateView extends JOTLightweightView
{

	private final FileObject file;

	public TemplateView(FileObject file, String name)
	{
		this.file = file;
		Date d = new Date();
		addVariable("name", name);
		addVariable("date", DateFormat.getDateInstance().format(d));
		addVariable("time", DateFormat.getTimeInstance().format(d));
		addVariable("user", System.getProperty("user.name"));
	}

	/**
	 * Support for including subtemplates (NOT parsed)
	 * Standard jot:include is not supported in LightweightViews
	 * Also NB doesn't use standard files, but FileObjects
	 * @param path
	 * @return
	 */
	public String includeFile(String path)
	{
		String result = "";
		FanUtilities.dumpFileObject(file);
		try
		{
			FileObject include = FanUtilities.getRelativeFileObject(file, path);
			result = include.asText();
		} catch (Exception e)
		{
			result = "// Include failed for:" + path + "->" + e.toString();
		}
		return result;
	}
}
