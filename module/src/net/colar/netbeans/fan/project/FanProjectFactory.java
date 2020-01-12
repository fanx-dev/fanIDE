/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.io.IOException;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectFactory;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;

/**
 * Factory for Fan projects
 * Will be invoked by NB (using the annotation)
 * Will create FanProject instances when a Fan project is found
 * @author tcolar
 */
//This annotation will register this factory with NB
@org.openide.util.lookup.ServiceProvider(service = org.netbeans.spi.project.ProjectFactory.class, position = 661)
public final class FanProjectFactory implements ProjectFactory
{

	public static final String FAN_BUILD_FILE = "build.fan";

	public boolean isProject(FileObject projectDirectory)
	{
		return projectDirectory.getFileObject(FAN_BUILD_FILE) != null;
	}

	public Project loadProject(FileObject projectDirectory, ProjectState projectState) throws IOException
	{
		return isProject(projectDirectory) ? new FanProject(projectDirectory, projectState) : null;
	}

	public void saveProject(Project project) throws IOException, ClassCastException
	{
		//TODO: what do we need to do here ??
		//throw new UnsupportedOperationException("Not supported yet.");
	}
}
