/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import fan.parser.IncCompiler;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.colar.netbeans.fan.project.path.FanClassPathProvider;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.java.classpath.GlobalPathRegistry;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.project.ProjectState;
import org.netbeans.spi.project.ui.PrivilegedTemplates;
import org.netbeans.spi.project.ui.ProjectOpenedHook;
import org.netbeans.spi.project.ui.RecommendedTemplates;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.RequestProcessor;
import org.openide.util.lookup.Lookups;

/**
 * Inspired/copied from Docbook project Fan Project implementation Provides
 * detection of fan project(folder with build.fan) Provides actions
 * list(Actionprovider innerclass) allowed to be run on project item (run/debug
 * etc...)
 *
 * @author thibautc
 */
public class FanProject implements Project, ProjectInformation {
    //public static final String HARDCODED_JAVA_SRC_FOLDER = "java";
    //public static final String HARDCODED_FAN_SRC_FOLDER = "fan";
    //public static final String HARDCODED_TEST_SRC_FOLDER = "test";

    private final FileObject dir;
    private final Lookup lkp;
    private final RequestProcessor rp;
    //private final Properties props = new Properties();
    private String name;
    
    public IncCompiler compiler = null;
    
    private Map<FileObject, List<ErrorDescription> > curErrors;
    public Map<FileObject, List<ErrorDescription> > nextErrors;

    public FanProject(FileObject dir, ProjectState state) {
        // Most projects "services" are registered through the lookup.
        this.dir = dir;
        lkp = Lookups.fixed(new Object[]{
            this,
            new FanLogicalView(this),
            new FanProjectActionProvider(this),
            new FanCustomizedProperties(this),
            new FanProjectProperties(this),
            new FanClassPathProvider(this),
            //new FanDebugPathProvider(),
            new ProjectOpenedHookImpl(),
            new RecommendedTemplatesImpl(),
            });
        rp = new RequestProcessor("Resolver thread for " + dir.getName() + " Fan Project", Thread.MIN_PRIORITY,
                true);
        name = FanProjectFactory.getPodName(FileUtil.toFile(dir));
    }

    @Override
    public FileObject getProjectDirectory() {
        return dir;
    }

    @Override
    public Lookup getLookup() {
        return lkp;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDisplayName() {
        return name;
    }

    @StaticResource()
    public static final String CUSTOMER_ICON = "net/colar/netbeans/fan/resources/fan.png";
    @Override
    public Icon getIcon() {
        return new ImageIcon(ImageUtilities.loadImage(CUSTOMER_ICON));
    }
    
    public static Icon getFanIcon() {
        return new ImageIcon(ImageUtilities.loadImage(CUSTOMER_ICON));
    }

    @Override
    public Project getProject() {
        return this;
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
    }

//    public static boolean isProject(FileObject projectDirectory) {
//        return projectDirectory.getFileObject(FanProjectFactory.FAN_BUILD_FILE) != null;
//    }

    // Find the project for a given path
    public static FanProject findSourceProject(String sourcePath) {
        Lookup lookup = Lookups.forPath(sourcePath);
        if (lookup == null) {
            return null;
        }
        return lookup.lookup(FanProject.class);
    }

    private final class ProjectOpenedHookImpl extends ProjectOpenedHook {

        @Override
        protected void projectOpened() {
            FanClassPathProvider cpProvider = lkp.lookup(FanClassPathProvider.class);
            //GlobalPathRegistry.getDefault().register(PATH_BOOT, cpProvider.getProjectClassPaths(PATH_BOOT));
            GlobalPathRegistry.getDefault().register(ClassPath.SOURCE, cpProvider.getProjectClassPaths(ClassPath.SOURCE));
        }

        @Override
        protected void projectClosed() {
            FanClassPathProvider cpProvider = lkp.lookup(FanClassPathProvider.class);
            GlobalPathRegistry.getDefault().unregister(ClassPath.SOURCE, cpProvider.getProjectClassPaths(ClassPath.SOURCE));
        }
    }

    /**
     * Inner class for recommended templates Proposed on right click / new
     */
    private static final class RecommendedTemplatesImpl implements PrivilegedTemplates {

        RecommendedTemplatesImpl() {
        }

        private static final String[] PRIVILEGED_NAMES = new String[]{
            "Templates/Fantom/FantomFile",
            "Templates/Fantom/FantomTest",
            "Templates/Other/html.html",
            "Templates/Other/CascadeStyleSheet.css",
            "Templates/Other/javascript.js",
            "Templates/Other/xhtml.xhtml",
            "Templates/Other/SQLTemplate.sql",
            "Templates/Classes/Class.java",
            };

        @Override
        public String[] getPrivilegedTemplates() {
            return PRIVILEGED_NAMES;
        }
    }
    
    public void updateIcon() {
        try {
            Map<FileObject, List<ErrorDescription> > lastErrors = this.curErrors;
            Map<FileObject, List<ErrorDescription> > errors = this.nextErrors;
            
            if (errors == null) {
                this.curErrors = null;
                return;
            }
            
            FanLogicalView view = (FanLogicalView)getLookup().lookup(FanLogicalView.class);
            Map<FileObject, Boolean > errorFiles = new HashMap<>();
            
            if (lastErrors != null) {
                for (Map.Entry<FileObject, List<ErrorDescription>> entry : lastErrors.entrySet()) {
                    FileObject key = (FileObject)entry.getKey();
                    errorFiles.put(key, false);
                }
            }
            
            for (Map.Entry<FileObject, List<ErrorDescription>> entry : errors.entrySet()) {
                FileObject key = (FileObject)entry.getKey();
                errorFiles.put(key, true);
            }
            
            for (Map.Entry<FileObject, Boolean> entry : errorFiles.entrySet()) {
                FileObject key = (FileObject)entry.getKey();
                Boolean val = entry.getValue();
                Node node = view.findPath(view.root, key);
                if (node != null && node instanceof FanNode) {
                    ((FanNode)node).setError(val.booleanValue());
                }
            }
            
            this.curErrors = this.nextErrors;
            this.nextErrors = null;

        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
