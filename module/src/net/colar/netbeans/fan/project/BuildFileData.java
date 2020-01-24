/*
 * Thibaut Colar Jun 16, 2010
 */

package net.colar.netbeans.fan.project;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.project.Project;
import org.openide.filesystems.FileObject;

/**
 *
 * @author thibautc
 */
public class BuildFileData
{
	FileObject buildFile;

	String podName = null;
	String summary = null;
	String version = "0";
	List<String> depends = new ArrayList<String>();
	Map<String, String> meta = new HashMap<String, String> ();
	Map<String, Object> index = new HashMap<String, Object>();
	boolean docApi=true;
	boolean docSrc=false;
	List<String> srcDirs = new ArrayList<String>();
	List<String> sresDirs = new ArrayList<String>();
	List<String> javaDirs = new ArrayList<String>();
	List<String> dotnetDirs = new ArrayList<String>();
	List<String> jsDirs = new ArrayList<String>();
	List<String> dependsDirs = new ArrayList<String>();
	String outDir ; // null = default

	public BuildFileData(FileObject buildFile)
	{
		this.buildFile = buildFile;
		if(buildFile.canRead())
		{
			try
			{
				String text = buildFile.asText();
				// TODO: to be continued
			}
			catch(IOException e)
			{
				FanUtilities.GENERIC_LOGGER.throwing("Failed parsing buold file: "+buildFile.getPath(), "BuildFileData", e);
			}
		}
	}

	// Getters and setters

	public List<String> getDepends()
	{
		return depends;
	}

	public List<String> getDependsDirs()
	{
		return dependsDirs;
	}

	public boolean isDocApi()
	{
		return docApi;
	}

	public boolean isDocSrc()
	{
		return docSrc;
	}

	public List<String> getDotnetDirs()
	{
		return dotnetDirs;
	}

	public Map<String, Object> getIndex()
	{
		return index;
	}

	public List<String> getJavaDirs()
	{
		return javaDirs;
	}

	public List<String> getJsDirs()
	{
		return jsDirs;
	}

	public Map<String, String> getMeta()
	{
		return meta;
	}

	public String getOutDir()
	{
		return outDir;
	}

	public String getPodName()
	{
		return podName;
	}

	public List<String> getSrcDirs()
	{
		return srcDirs;
	}

	public List<String> getSresDirs()
	{
		return sresDirs;
	}

	public String getSummary()
	{
		return summary;
	}

	public String getVersion()
	{
		return version;
	}

	public void setDocApi(boolean docApi)
	{
		this.docApi = docApi;
	}

	public void setDocSrc(boolean docSrc)
	{
		this.docSrc = docSrc;
	}

	public void setOutDir(String outDir)
	{
		this.outDir = outDir;
	}

	public void setPodName(String podName)
	{
		this.podName = podName;
	}

	public void setSummary(String summary)
	{
		this.summary = summary;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}


}
