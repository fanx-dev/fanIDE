/*
 * Thibaut Colar Nov 30, 2009
 */
package net.colar.netbeans.fan.indexer;

import fan.sys.Env;
import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

/**
 * Classloader made of the fan jars
 *
 * TODO: have this update when jars chnages in getExtUrls() are modified.
 * @author thibautc
 */
public class FanJavaClassLoader extends URLClassLoader
{

	public FanJavaClassLoader()
	{
		// create with the standard jars + the fan jars
		super(getExtUrls(), ClassLoader.getSystemClassLoader());
	}

	/**
	 * Fan jars, see: Fantom's src/sys/java/fan/sys/FanClassLoader.java
	 * @return
	 */
	public static URL[] getExtUrls()
	{
		try
		{
			String sep = File.separator;
			File stdDir = new File(Env.cur().homeDir().osPath(), "lib" + sep + "java");
			File extDir = new File(stdDir, "ext");
			File platDir = new File(extDir, Env.cur().platform());
			List<URL> acc = new ArrayList<URL>();
			addExtJars(acc, stdDir);
			addExtJars(acc, extDir);
			addExtJars(acc, platDir);
			return acc.toArray(new URL[acc.size()]);
		} catch (Exception e)
		{
			e.printStackTrace();
			return new URL[0];
		}
	}

	private static void addExtJars(List<URL> acc, File extDir) throws Exception
	{
		File[] list = extDir.listFiles();
		for (int i = 0; list != null && i < list.length; ++i)
		{
			if (list[i].getName().endsWith(".jar"))
			{
				acc.add(list[i].toURI().toURL());
			}
		}
	}

	protected Class find(String name) throws ClassNotFoundException
	{
		Class c = findLoadedClass(name);
		if (c == null)
		{
			c = findClass(name);
		}
		return c;
	}
}


