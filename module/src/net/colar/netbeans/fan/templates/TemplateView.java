package net.colar.netbeans.fan.templates;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.openide.filesystems.FileObject;

/**
 * Custom view for tJOT templates used in netbeans.
 *
 * @author thibautc
 */
public class TemplateView {

    private Map<String, String> args = new HashMap< String, String>();

    public TemplateView(FileObject file, String name) {
        Date d = new Date();
        addVariable("name", name);
        addVariable("date", DateFormat.getDateInstance().format(d));
        addVariable("time", DateFormat.getTimeInstance().format(d));
        addVariable("user", System.getProperty("user.name"));
    }

    public void addVariable(String name, Object val) {
        if (name.equals("doClass")) {
            addVariable("type", "class");
        } else if (name.equals("doMixin")) {
            addVariable("type", "mixin");
        } else if (name.equals("doEnum")) {
            addVariable("type", "enum class");
        }
        args.put(name, val.toString());
    }

    public String parse(String text, Object arg) {
        for (Map.Entry<String, String> e : args.entrySet()) {
            text = text.replace("${"+e.getKey()+"}", e.getValue());
        }
        return text;
    }

    /**
     * Support for including subtemplates (NOT parsed) Standard jot:include is
     * not supported in LightweightViews Also NB doesn't use standard files, but
     * FileObjects
     *
     * @param path
     * @return
     */
//	public String includeFile(String path)
//	{
//		String result = "";
//		FanUtilities.dumpFileObject(file);
//		try
//		{
//			FileObject include = FanUtilities.getRelativeFileObject(file, path);
//			result = include.asText();
//		} catch (Exception e)
//		{
//			result = "// Include failed for:" + path + "->" + e.toString();
//		}
//		return result;
//	}
}
