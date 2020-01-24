/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.test.mock;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.spi.project.ProjectManagerImplementation;
import org.openide.filesystems.FileObject;
import org.openide.util.Mutex;

/**
 *
 * @author chunquedong
 */
public final class MockProjectManager implements ProjectManagerImplementation {

    private final Mutex MUTEX = new Mutex();

    @Override
    public void init(ProjectManagerCallBack callBack) {
    }

    @Override
    public Mutex getMutex() {
        return MUTEX;
    }

    @Override
    public Mutex getMutex(boolean autoSave, Project project, Project... otherProjects) {
        return MUTEX;
    }

    @Override
    public Project findProject(FileObject projectDirectory) throws IOException, IllegalArgumentException {
        return null;
    }

    @Override
    public ProjectManager.Result isProject(FileObject projectDirectory) throws IllegalArgumentException {
        return null;
    }

    @Override
    public void clearNonProjectCache() {
    }

    @Override
    public Set<Project> getModifiedProjects() {
        return Collections.emptySet();
    }

    @Override
    public boolean isModified(Project p) {
        return false;
    }

    @Override
    public boolean isValid(Project p) {
        return true;
    }

    @Override
    public void saveProject(Project p) throws IOException {
    }

    @Override
    public void saveAllProjects() throws IOException {
    }
}
