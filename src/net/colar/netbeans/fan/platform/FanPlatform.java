/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.platform;

import fan.sys.Sys;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import net.colar.netbeans.fan.actions.FanExecution;
import net.colar.netbeans.fan.indexer.FanIndexerFactory;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 * Provides acces to "plaform" settings
 * For exampel FAN_HOME etc...
 * @author thibautc
 */
public class FanPlatform
{
	//TODO: too much hardcoded

	private Set<ClassPath> sourcePaths = null;
	private static final boolean IS_WIN = System.getProperty("os.name").toLowerCase().indexOf("windows") != -1;
	private static final boolean IS_MAC = System.getProperty("os.name").toLowerCase().startsWith("mac");
	private static FanPlatform instance = new FanPlatform();
	public final static String FAN_CLASS = "fanx.tools.Fan";
	public final static String FAN_SH = "fansh";
	//private String fanBin;
	//private String fanshBin;
	private String fanHome;
	private String podsDir;
	private String fanSrc;

	public FanPlatform()
	{
		readSettings();
	}

	public void readSettings()
	{
		fanHome = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FAN_HOME);
		if (fanHome != null)
		{
			if (!fanHome.endsWith(File.separator))
			{
				fanHome += File.separator;
			}
			//fanBin = fanHome + "bin" + File.separator + (IS_WIN ? "fan.exe" : "fan");
			//fanshBin = fanHome + "bin" + File.separator + (IS_WIN ? "fansh.exe" : "fansh");
			fanSrc = fanHome + "src" + File.separator;
			podsDir = fanHome + "lib" + File.separator + "fan" + File.separator;

			// Set fan.home property, so we casn use Fan code later
			System.setProperty("fan.home", fanHome);
			// boot fan env.
			Sys.boot();
		}
		// force updating paths
		sourcePaths = null;
	}

	public static boolean checkFanHome(String path)
	{
		if (path != null)
		{
			File f = new File(path);
			if (f.exists() && f.isDirectory())
			{
				File exe = new File(path + File.separator + "bin", "fan");
				return exe.exists() && exe.isFile();
			}
		}
		return false;
	}

	public boolean isConfigured()
	{
		return fanHome != null;
	}

	public static FanPlatform getInstance()
	{
		return getInstance(true);
	}

	public static FanPlatform getInstance(boolean checkNull)
	{
		if (checkNull && instance.fanHome == null)
		{
			//TODO: handle this cleanly (warning dialog)
			throw new RuntimeException("Fan Home is undefined, update Netbeans options!");
		}
		return instance;
	}

	/*public String getFanBinaryPath()
	{
	return fanBin;
	}*/
	public String getFanSrcPath()
	{
		return fanSrc;
	}

	/*public String getFanShellBinaryPath()
	{
	return fanshBin;
	}*/

	/**
	 * Add Fan Source items (pods src)
	 * @return
	 */
	public synchronized Set<ClassPath> getSourceClassPaths()
	{
		// Do it only once.
		if (sourcePaths == null && fanSrc != null)
		{
			sourcePaths = new HashSet<ClassPath>();
			File f = new File(fanSrc);
			File[] files = f.listFiles();
			for (File file : files)
			{
				if (file.isDirectory() && new File(file, "build.fan").exists())
				{
					addFolder(new File(file, FanProject.HARDCODED_JAVA_SRC_FOLDER));
					addFolder(new File(file, FanProject.HARDCODED_FAN_SRC_FOLDER));
					addFolder(new File(file, FanProject.HARDCODED_TEST_SRC_FOLDER));
				}
			}
			GlobalPathRegistry.getDefault().register(ClassPath.SOURCE, sourcePaths.toArray(new ClassPath[sourcePaths.size()]));
		}
		return sourcePaths;
	}

	private void addFolder(File folder)
	{
		if (folder.exists() && folder.isDirectory())
		{
			ClassPath jcp = ClassPathSupport.createClassPath(folder.getAbsolutePath());
			sourcePaths.add(jcp);
			//System.out.println("### " + folder.getAbsolutePath());
		}
	}

	/**
	 * Same as buildFanCall(fanExec, -1);
	 * @param fanExec
	 */
	public void buildFanCall(FanExecution fanExec)
	{
		buildFanCall(fanExec, false);
	}

	/**
	 * Updated the FanExecution object such as the fanlaunch shell script would
	 * IE: set classpath, library path etc ....
	 * @param fanExec
	 * @param debugPort (-1 = no debugger)
	 */
	public void buildFanCall(FanExecution fanExec, boolean enableDebug)
	{
		// We will be spawning a new java VM
		String separator = System.getProperty("file.separator");
		String path = System.getProperty("java.home") + separator + "bin" + separator + "java";
		fanExec.setCommand(path);

		// classpath
		//String classpath = System.getProperty("java.class.path");
		String classpath = buildFanClasspath();
		fanExec.addCommandArg("-cp");
		fanExec.addCommandArg(classpath);

		//Set lib path
		String libPath = buildLibraryPath();
		fanExec.addCommandArg("-Djava.library.path=" + libPath);

		//Set fan.home 
		fanExec.addCommandArg("-Dfan.home=" + fanHome);

		//Enable debugger
		if (enableDebug)
		{
			String debugPort = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_DEBUG_PORT, "8000");
			// java debugger
			fanExec.addCommandArg("-Xdebug");
			fanExec.addCommandArg("-Xrunjdwp:transport=dt_socket,address=" + debugPort + ",server=y,suspend=y");
			// fan debug
			fanExec.addCommandArg("-Dfan.debug=true");
		}

		// custom options
		String option=FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_RUN_OPTIONS, "-Xmx128m");
		String[] options = option.split(" ");
		for(String opt : options)
			fanExec.addCommandArg(opt);
		

		//OSX only flag needed for SWT (as in fanlaunch)
		if (IS_MAC)
		{
			fanExec.addCommandArg("-XstartOnFirstThread");
		}
	}

	/**
	 * Builds fan std classpath (jars)
	 * @return
	 */
	private String buildFanClasspath()
	{
		String cp = "";
		String cpSeparator = IS_WIN ? ";" : ":";
		String s = File.separator;
		// sys.jar
		cp += fanHome + "lib" + s + "java" + s + "sys.jar";
		// add jars in lib/java/ext
		String extDir = fanHome + "lib" + s + "java" + s + "ext";
		File dir = new File(extDir);
		if (dir.exists() && dir.isDirectory())
		{
			File[] jars = dir.listFiles();
			for (File jar : jars)
			{
				if (jar.isFile() && jar.getName().toLowerCase().endsWith(".jar"))
				{
					cp += cpSeparator + extDir + s + jar.getName();
				}
			}
		}
		// add jars file in lib/java/ext/{os}
		String os = "linux";
		if (IS_MAC)
		{
			os = "mac";
		} else if (IS_WIN)
		{
			os = "win";
		}
		extDir += s + os;
		dir = new File(extDir);
		if (dir.exists() && dir.isDirectory())
		{
			File[] jars = dir.listFiles();
			for (File jar : jars)
			{
				if (jar.isFile() && jar.getName().toLowerCase().endsWith(".jar"))
				{
					cp += cpSeparator + extDir + s + jar.getName();
				}
			}
		}

		return cp;
	}

	private String buildLibraryPath()
	{
		String s = File.separator;
		String extDir = fanHome + "lib" + s + "java" + s + "ext";
		String os = "linux";
		if (IS_MAC)
		{
			os = "mac";
		} else if (IS_WIN)
		{
			os = "win";
		}
		extDir += s + os;
		return extDir;
	}

	public FileObject getFanHome()
	{
		File f=new File(fanHome);
		return FileUtil.toFileObject(f);
	}

	public void update()
	{
		// called when FAN_HOME is changed/updated.
		readSettings();
		FanIndexerFactory.getIndexer().indexAll(true);
	}

	public String getPodsDir()
	{
		return podsDir;
	}
}
