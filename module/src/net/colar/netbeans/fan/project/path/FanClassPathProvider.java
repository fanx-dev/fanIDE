/*
 * Thibaut Colar Aug 21, 2009
 */
package net.colar.netbeans.fan.project.path;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashSet;
import java.util.Set;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.project.FanProject;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.project.JavaProjectConstants;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectUtils;
import org.netbeans.api.project.SourceGroup;
import org.netbeans.api.project.Sources;
import org.netbeans.api.project.ui.OpenProjects;
import org.netbeans.spi.java.classpath.ClassPathProvider;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;
import org.openide.filesystems.FileObject;

/**
 * Classpath provider for Fan projects See
 * http://bits.netbeans.org/dev/javadoc/org-netbeans-api-java-classpath/
 *
 * @author thibautc
 */
public class FanClassPathProvider implements ClassPathProvider, PropertyChangeListener {

    ClassPath sourcePath = null;
    private final FanProject project;

    public FanClassPathProvider(FanProject project) {
        this.project = project;
        Set<FileObject> srcRoots = new HashSet<FileObject>();
        srcRoots.add(project.getProjectDirectory());
        //srcRoots.add(project.getProjectDirectory().getFileObject(FanProject.HARDCODED_JAVA_SRC_FOLDER));
        //srcRoots.add(project.getProjectDirectory().getFileObject(FanProject.HARDCODED_FAN_SRC_FOLDER));
        //srcRoots.add(project.getProjectDirectory().getFileObject(FanProject.HARDCODED_TEST_SRC_FOLDER));

        Project[] projects = OpenProjects.getDefault().getOpenProjects();
        if (projects != null) {
            for (Project prj : projects) {
                if (prj != null) {
                    SourceGroup[] sgs;
                    if (prj instanceof FanProject) {
                        sgs = ProjectUtils.getSources(prj).getSourceGroups(Sources.TYPE_GENERIC);
                    } else {
                        sgs = ProjectUtils.getSources(prj).getSourceGroups(JavaProjectConstants.SOURCES_TYPE_JAVA);
                    }

                    for (SourceGroup sg : sgs) {
                        ClassPath cp = ClassPath.getClassPath(sg.getRootFolder(), ClassPath.SOURCE);
                        if (cp != null) {
                            for (FileObject root : cp.getRoots()) {
                                srcRoots.add(root);
                            }
                        }
                    }
                }
            }
        }
        // No need for that, already added by NB platform
        // causes error if added again.
        // Jdk sources
		/*
         * JavaPlatform platform =
         * JavaPlatformManager.getDefault().getDefaultPlatform(); if (platform
         * != null) { ClassPath cp = platform.getSourceFolders(); if (cp !=
         * null) { for (FileObject root : cp.getRoots()) { srcRoots.add(root); }
         * }
		}
         */
        // Fan distro sources
        /*if (!FanPlatform.isConfigured()) {
            throw new RuntimeException("Fantom SDK is not defined");
        }
        Set<ClassPath> cps = FanPlatform.getInstance().getSourceClassPaths();
        if (cps != null) {
            for (ClassPath cp : cps) {
                for (FileObject root : cp.getRoots()) {
                    srcRoots.add(root);
                }
            }
        }*/

        sourcePath = ClassPathSupport.createClassPath(srcRoots.toArray(new FileObject[srcRoots.size()]));
    }

    public void propertyChange(PropertyChangeEvent arg0) {
    }

    public ClassPath[] getProjectClassPaths(String type) {
        ClassPath[] cps = {};
        if (type.equals(ClassPath.SOURCE)) {
            //System.out.println(getClass().getName() + " -> getprojectcps " + type);
            cps = new ClassPath[1];
            cps[0] = sourcePath;
        }
        return cps;
    }

    public ClassPath findClassPath(FileObject file, String type) {
        //System.out.println(getClass().getName() + " -> findclasspath " + file + " " + type);
        ClassPath result = null;
        if (type.equals(ClassPath.SOURCE)) {
            result = sourcePath;
        }
        //System.out.println(getClass().getName() + " -> Result: " + result);
        return result;
    }
}
