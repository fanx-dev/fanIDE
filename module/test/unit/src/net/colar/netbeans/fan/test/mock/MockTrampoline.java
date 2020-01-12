/*
 * Thibaut Colar Mar 10, 2010
 */

package net.colar.netbeans.fan.test.mock;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Future;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.ui.OpenProjects;
import org.netbeans.api.project.ui.ProjectGroup;
import org.netbeans.api.project.ui.ProjectGroupChangeListener;
import org.netbeans.modules.project.uiapi.OpenProjectsTrampoline;

/**
 * Some CSL tests require a 'Trampoline' obj to be in the lookup.
 * @author thibautc
 */
public class MockTrampoline implements OpenProjectsTrampoline {
    private PropertyChangeSupport pchSupport;

    private final Collection<Project> openProjects = new ArrayList<Project>();

    public MockTrampoline() {

    }

    public Project[] getOpenProjectsAPI() {
        Project[] projects = new Project[openProjects.size()];
        openProjects.toArray(projects);
        return projects;
    }

    public void openAPI(Project[] projects, boolean openRequiredProjects, boolean showProgress) {
        Project[] oldProjects = getOpenProjectsAPI();
        for (Project project : projects) {
            openProjects.add(project);
            mainProject = project;
        }
        Project[] newProjects = getOpenProjectsAPI();
        if (pchSupport != null) {
            pchSupport.firePropertyChange(OpenProjects.PROPERTY_OPEN_PROJECTS, oldProjects, newProjects);
        }
    }

    public void closeAPI(Project[] projects) {
        Project[] oldProjects = getOpenProjectsAPI();
        for (Project project : projects) {
            openProjects.remove(project);
        }
        Project[] newProjects = getOpenProjectsAPI();
        if (pchSupport != null) {
            pchSupport.firePropertyChange(OpenProjects.PROPERTY_OPEN_PROJECTS, oldProjects, newProjects);
        }
    }

    public void addPropertyChangeListenerAPI(PropertyChangeListener listener, Object source) {
        if (pchSupport == null) {
            pchSupport = new PropertyChangeSupport(this);
        }
        pchSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListenerAPI(PropertyChangeListener listener) {
        if (pchSupport == null) {
            pchSupport = new PropertyChangeSupport(this);
        }
        pchSupport.removePropertyChangeListener(listener);
    }

    private Project mainProject;

    public Project getMainProject() {
        return mainProject;
    }

    public void setMainProject(Project project) {
        if (project != null && !openProjects.contains(project)) {
            throw new IllegalArgumentException("Project " + ProjectUtils.getInformation(project).getDisplayName() + " is not open and cannot be set as main.");
        }
        this.mainProject = project;
    }

    public Future<Project[]> openProjectsAPI() {
        return null;
    }
    
    public void addProjectGroupChangeListenerAPI(ProjectGroupChangeListener listener) {
        
    }

    public void removeProjectGroupChangeListenerAPI(ProjectGroupChangeListener listener) {
        
    }
    
    public ProjectGroup getActiveProjectGroupAPI() {
        return null;
    }
}
