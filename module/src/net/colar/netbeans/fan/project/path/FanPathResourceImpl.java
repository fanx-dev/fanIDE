/*
 * Thibaut Colar Aug 21, 2009
 */

package net.colar.netbeans.fan.project.path;

import java.beans.PropertyChangeListener;
import java.net.URL;
import org.netbeans.spi.java.classpath.ClassPathImplementation;
import org.netbeans.spi.java.classpath.PathResourceImplementation;
import org.openide.filesystems.FileObject;

/**
 *
 * @author thibautc
 */
public class FanPathResourceImpl implements PathResourceImplementation
{
	private URL[] roots;

	public FanPathResourceImpl(FileObject file)
	{
		try
		{
			roots = new URL[1];
			roots[0] = file.getURL();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			roots = new URL[0];
		}
	}

	public URL[] getRoots()
	{
		//System.out.println(getClass().getName()+" -> getroots");
		return roots;
	}

	public ClassPathImplementation getContent()
	{
		//System.out.println(getClass().getName()+" -> getContent ");
		return null;
	}

	public void addPropertyChangeListener(PropertyChangeListener arg0)
	{
	}

	public void removePropertyChangeListener(PropertyChangeListener arg0)
	{
	}
}
