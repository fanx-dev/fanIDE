/*
 * Thibaut Colar Aug 21, 2009
 */

package net.colar.netbeans.fan.project.path;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.netbeans.spi.java.classpath.ClassPathImplementation;
import org.netbeans.spi.java.classpath.PathResourceImplementation;
import org.openide.filesystems.FileObject;

/**
 * Class path impl. for fan projects
 * @author thibautc
 */
public class FanClassPathImpl implements ClassPathImplementation
{
	private static List<PathResourceImplementation> resources = new ArrayList<PathResourceImplementation>();

	public FanClassPathImpl(FileObject fo)
	{
		add(fo);
	}

	public void add(FileObject fo)
	{
			FanPathResourceImpl impl=new FanPathResourceImpl(fo);
			//ClassPathSupport.createClassPath(fo);
			//System.out.println("---- "+getClass().getName()+ " -> ADDING "+fo.getPath());
			resources.add(impl);
	}

	public List<? extends PathResourceImplementation> getResources()
	{
		//System.out.println(getClass().getName()+" -> getresources");
		return Collections.unmodifiableList(resources);
	}

	public void addPropertyChangeListener(PropertyChangeListener arg0)
	{
	}

	public void removePropertyChangeListener(PropertyChangeListener arg0)
	{
	}

}
