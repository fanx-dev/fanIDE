/*
 * Thibaut Colar Aug 25, 2009
 */
package net.colar.netbeans.fan.debugger;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import net.colar.netbeans.fan.project.FanProject;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.netbeans.spi.debugger.ContextProvider;
import org.netbeans.spi.debugger.jpda.SourcePathProvider;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileStateInvalidException;
import org.openide.filesystems.FileUtil;
import org.openide.filesystems.URLMapper;
import org.openide.util.Exceptions;

/**
 * We need a custom source path provider because with fan sources such as
 * MyPod/fan/Main.java doe not get mapped to fan.Main.class as in java but
 * instead to fan.MyPod.Main.class So we need a custom impl. here to find the
 * correct source path and make the debugger happy.
 *
 * @author thibautc
 */
public class FanDebugPathProvider extends SourcePathProvider {

    //private SourcePathProvider impl;
    private String[] sourceRoots;

    public FanDebugPathProvider(ContextProvider contextProvider) {
        FanUtilities.logger.fine("### FanDebugPathProvider(" + contextProvider + ")");
    }

    @Override
    public String getRelativePath(String url, char directorySeparator, boolean includeExtension) {

        FanUtilities.logger.fine("getRelativePath:" + url);

        String path = null;
        Project project = OpenProjects.getDefault().getMainProject();
        path = getRelativePathInProject(project, url, directorySeparator);
        if (path != null) {
            return path;
        }

        for (Project proj : OpenProjects.getDefault().getOpenProjects()) {
            if (proj == project) {
                continue;
            }
            path = getRelativePathInProject(proj, url, directorySeparator);
            if (path != null) {
                return path;
            }
        }

        //return impl.getRelativePath(url, directorySeparator, includeExtension);
        return null;
    }

    private String getRelativePathInProject(Project proj, String url, char directorySeparator) {
        if (!(proj instanceof FanProject)) {
            return null;
        }
        FanProject fproj = (FanProject) proj;
        FileObject dir = fproj.getProjectDirectory();
        String path = dir.toURL().toString();

        FanUtilities.logger.fine("url:" + url + " vs path:" + path);

        if (url.startsWith(path)) {
            String res = url.substring(path.length());
            res = res.replace('/', directorySeparator);
            FanUtilities.logger.fine("getRelativePath:" + url + " => " + res);
            return res;
        }
        return null;
    }

    @Override
    public String getURL(String relativePath, boolean global) {
        FanUtilities.logger.fine("getURL:" + relativePath);
        String url = null;
        
        if (relativePath.startsWith("fan") && relativePath.endsWith(".fan")) {
            String path = relativePath.replace('\\', '/');
            String[] fs = path.split("/");
            if (fs.length == 3) {
                String pod = fs[1];
                String name = fs[2];
                //System.out.println("pod:"+pod + ",name:"+name);
                url = findURLByName(pod, name);
                if (url != null) {
                    return url;
                }
            }
        }
        
        Project project = OpenProjects.getDefault().getMainProject();
        url = getURLInProject(project, relativePath);
        if (url != null) {
            return url;
        }

        for (Project proj : OpenProjects.getDefault().getOpenProjects()) {
            if (proj == project) {
                continue;
            }
            url = getURLInProject(proj, relativePath);
            if (url != null) {
                return url;
            }
        }

        //return impl.getURL(relativePath, global);
        return null;
    }
    
    private String findURLByName(String podName, String name) {
        for (Project proj : OpenProjects.getDefault().getOpenProjects()) {
            if (!(proj instanceof FanProject)) {
                continue;
            }
            FanProject fproj = ((FanProject)proj);
            if (fproj.getName().equals(podName)) {
                FileObject fo = findFilesNamedInFolder(fproj.getProjectDirectory(), name);
                //System.out.println("fproj:" + fproj + ", fo:" + fo);
                if (fo != null) {
                    String res = fo.toURL().toString();
                    FanUtilities.logger.fine("findURLByName:" + res);
                    return res;
                }
                break;
            }
        }
        return null;
    }

    private FileObject findFilesNamedInFolder(FileObject folder, String fileName) {
        if (folder.isFolder()) {
            for (FileObject child : folder.getChildren()) {
                //System.out.println("child:" + child + ", fileName:" + fileName);
                if (child.isFolder()) {
                    FileObject fo = findFilesNamedInFolder(child, fileName);
                    if (fo != null) return fo;
                } else if (child.getNameExt().equals(fileName)) {
                    return child;
                }
            }
        }
        return null;
    }

    private String getURLInProject(Project proj, String relativePath) {
        if (!(proj instanceof FanProject)) {
            return null;
        }
        FanProject fproj = (FanProject) proj;
        FileObject dir = fproj.getProjectDirectory();
        File dirF = new File(dir.getPath() + File.separator + relativePath);
        //System.out.println("test:" + dirF + ", exists:" + dirF.exists());
        if (dirF.exists()) {
            try {
                FileObject fo = FileUtil.toFileObject(dirF.getCanonicalFile());
                String url = URLMapper.findURL(fo, URLMapper.INTERNAL).toString();
                FanUtilities.logger.fine("getURL:" + relativePath + " => " + url);
                return url;
            } catch (FileStateInvalidException ex) {
                Exceptions.printStackTrace(ex);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return null;
    }

    @Override
    public String[] getSourceRoots() {
        //return impl.getSourceRoots();
        if (sourceRoots == null) {
            sourceRoots = getOriginalSourceRoots();
        }
        return sourceRoots;
    }

    @Override
    public void setSourceRoots(String[] sourceRoots) {
        //impl.setSourceRoots(sourceRoots);
        this.sourceRoots = sourceRoots;
    }

    @Override
    public String[] getOriginalSourceRoots() {
        //return impl.getOriginalSourceRoots();
        ArrayList<String> list = new ArrayList<>();
        for (Project proj : OpenProjects.getDefault().getOpenProjects()) {
            if (proj instanceof FanProject) {
                String path = proj.getProjectDirectory().getPath();
                list.add(path);
            }
        }
        return list.toArray(new String[0]);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener l) {
        //impl.addPropertyChangeListener(l);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener l) {
        //impl.removePropertyChangeListener(l);
    }
}
