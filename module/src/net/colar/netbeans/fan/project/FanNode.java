/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.Action;
import net.colar.netbeans.fan.actions.BuildAndRunFanFileAction;
import net.colar.netbeans.fan.actions.BuildAndRunFanPodAction;
import net.colar.netbeans.fan.actions.BuildAndRunFanTestAction;
import net.colar.netbeans.fan.actions.CopyPathAction;
import net.colar.netbeans.fan.actions.DebugFanPodAction;
import net.colar.netbeans.fan.actions.RunFanClass;
import net.colar.netbeans.fan.actions.RunFanFile;
import net.colar.netbeans.fan.actions.RunFanPodAction;
import net.colar.netbeans.fan.actions.RunFanShellAction;
import net.colar.netbeans.fan.actions.RunFanTest;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ActionProvider;
import org.netbeans.spi.project.ui.support.CommonProjectActions;
import org.netbeans.spi.project.ui.support.ProjectSensitiveActions;
import org.openide.filesystems.FileObject;
import org.openide.nodes.Node;
import org.openide.util.lookup.Lookups;
import org.openide.actions.*;
import org.openide.nodes.FilterNode;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.actions.SystemAction;
import org.openide.util.lookup.ProxyLookup;

/**
 * Fan project individual Node (used within logical view)
 *
 * @author tcolar
 */
public class FanNode extends FilterNode {

    @StaticResource()
    public static final String FAN_FILE_ICON = "net/colar/netbeans/fan/resources/fanFile.png";

    //private static final Pattern MAIN_METHOD = Pattern.compile("\\s+main\\([^)]*\\)\\s*\\{");
    //private static final Pattern TEST_METHOD = Pattern.compile("Void\\s+test\\S*\\([^)]*\\)\\s*\\{");
    //private static final String ATTR_NODE_FILEOBJECT = "NODE_FILEOBJECT";
    //private boolean isPod = false;
    protected boolean isRoot = false;
    //boolean isRunnable = false;
    private boolean isTestFolder = false;
    private final FileObject file;
    private String icon;
    private String desc;
    private List<Action> actions;

    public FanNode(Project project, Node originalNode, org.openide.nodes.Children children, FileObject file) {
        super(originalNode, children, new ProxyLookup(new Lookup[]{
            Lookups.singleton(project),
            originalNode.getLookup()
        }));
        this.file = file;
        // customize the node
        if (!file.isFolder()) {
            if (file.getExt().equalsIgnoreCase("fan")) {
                setIcon(FAN_FILE_ICON);
            } else if (file.getExt().equalsIgnoreCase("fwt")) {
                setIcon(FAN_FILE_ICON);
            }

            if (file.getExt().equalsIgnoreCase("fan")) {
                //isRunnable = isRunnable(file);
                isTestFolder = isTesteable(file);
            }
        }
    }

    /**
     * Return list of actions available for this node.
     *
     * @param popup
     * @return
     */
    @Override
    public Action[] getActions(boolean popup) {
        actions = new ArrayList<>();

        if (isRoot) {
            // project level actions
            putAction(CommonProjectActions.newFileAction());
            putAction(null);

            putAction(ProjectSensitiveActions.projectCommandAction(BuildAndRunFanPodAction.COMMAND_BUILD_RUN_FAN_POD, "Build & Run Pod", null));
            putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_BUILD, "Build Pod", null));
            putAction(ProjectSensitiveActions.projectCommandAction(RunFanPodAction.COMMAND_RUN_FAN_POD, "Run Pod", null));
            putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_CLEAN, "Clean Pod", null));
            putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_REBUILD, "Clean & Build Pod", null));
            putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_TEST, "Test Pod", null));
            putAction(null);
            putAction(ProjectSensitiveActions.projectCommandAction(DebugFanPodAction.COMMAND_DEBUG_FAN_POD, "Build & Debug Pod", null));
            putAction(null);
            putAction(ProjectSensitiveActions.projectCommandAction(RunFanShellAction.COMMAND_RUN_FAN_SHELL, "Start Fan Shell", null));
            putAction(null);
            putAction(SystemAction.get(FindAction.class));
            putAction(SystemAction.get(PasteAction.class));
            putAction(CommonProjectActions.renameProjectAction());
            putAction(CommonProjectActions.deleteProjectAction());
            putAction(null);
            putAction(CommonProjectActions.setAsMainProjectAction());
            putAction(CommonProjectActions.closeProjectAction());
        } else {
            // Folder actions
            if (file.isFolder()) {
                putAction(CommonProjectActions.newFileAction());
                putAction(SystemAction.get(FindAction.class));
                putAction(null);
                putAction(SystemAction.get(PasteAction.class));
            } else // item actions
            {
                putAction(SystemAction.get(OpenAction.class));
                if (isTestFolder) {
                    putAction(ProjectSensitiveActions.projectCommandAction(RunFanTest.COMMAND_TEST_FILE, "Run test", null));
                    putAction(ProjectSensitiveActions.projectCommandAction(BuildAndRunFanTestAction.COMMAND_BUILD_RUN_FAN_TEST, "Build & Run test", null));
                    putAction(null);
                    putAction(ProjectSensitiveActions.projectCommandAction(RunFanClass.COMMAND_RUN_FAN_CLASS, "Run class", null));
                    putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_RUN_SINGLE, "Build & Run class", null));
                    putAction(ProjectSensitiveActions.projectCommandAction(RunFanFile.COMMAND_RUN_FAN_SCRIPT, "Run as script", null));
                    putAction(ProjectSensitiveActions.projectCommandAction(BuildAndRunFanFileAction.COMMAND_BUILD_RUN_FAN_SCRIPT, "Build & Run as script", null));
                    putAction(null);
                } else {
                    //if (isRunnable)
                    //{
                    putAction(ProjectSensitiveActions.projectCommandAction(RunFanClass.COMMAND_RUN_FAN_CLASS, "Run class", null));
                    putAction(ProjectSensitiveActions.projectCommandAction(ActionProvider.COMMAND_RUN_SINGLE, "Build & Run class", null));
                    putAction(ProjectSensitiveActions.projectCommandAction(RunFanFile.COMMAND_RUN_FAN_SCRIPT, "Run as script", null));
                    putAction(ProjectSensitiveActions.projectCommandAction(BuildAndRunFanFileAction.COMMAND_BUILD_RUN_FAN_SCRIPT, "Build & Run as script", null));
                    putAction(null);
                    putAction(ProjectSensitiveActions.projectCommandAction(RunFanTest.COMMAND_TEST_FILE, "Run test", null));
                    putAction(ProjectSensitiveActions.projectCommandAction(BuildAndRunFanTestAction.COMMAND_BUILD_RUN_FAN_TEST, "Build & Run test", null));
                    putAction(null);
                    //}
                }
            }

            putAction(SystemAction.get(CopyAction.class));
            putAction(SystemAction.get(CutAction.class));
            putAction(SystemAction.get(DeleteAction.class));
            putAction(null);
            putAction(SystemAction.get(RenameAction.class));
        }

        putAction(ProjectSensitiveActions.projectCommandAction(CopyPathAction.COMMAND_COPY_PATH, "Copy Path to Clipboard", null));
        putAction(null);
        // add OTHER standard actions
        putAction(null);
        putAction(SystemAction.get(ToolsAction.class));
        putAction(SystemAction.get(FileSystemAction.class));

        if (isRoot) { // put props last always
            putAction(null);
            putAction(CommonProjectActions.customizeProjectAction());
        }
        return actions.toArray(new Action[0]);
    }

    @Override
    public Image getIcon(int type) {
        if (icon == null) {
            return super.getIcon(type);
        }
        return ImageUtilities.loadImage(icon);
    }

    @Override
    public Image getOpenedIcon(int type) {
        return getIcon(type);
    }

    protected void setIcon(String ic) {
        icon = ic;
    }

    @Override
    public String getHtmlDisplayName() {
        if (desc == null) {
            return super.getHtmlDisplayName();
        }
        return desc;
    }

    /*private boolean isRunnable(FileObject file)
    {
        boolean result = false;
        try
        {
            // look for main method
            result = MAIN_METHOD.matcher(file.asText()).find();
        } catch (Exception e)
        {
        }
        return result;
    }*/
    private boolean isTesteable(FileObject file) {
        /*boolean result = false;
        try
        {
            // look for test method
            result = TEST_METHOD.matcher(file.asText()).find();
        } catch (Exception e)
        {
        }*/
        String path = file.getPath();
        return path.indexOf("/test/") != -1 || path.indexOf("\\test\\") != -1;
    }

    private void putAction(Action action) {
        actions.add(action);
    }

//    public String getFileName() {
//        return file.getNameExt();
//    }
    /**
     * Project (master) node.
     *
     * @author tcolar
     */
    public static class FanProjectNode extends FanNode {

        public FanProjectNode(Project project, Node originalNode, FileObject file) {
            super(project, originalNode, new FanNodeChildren(project, originalNode), file);
            setIcon(FanProject.CUSTOMER_ICON);
            isRoot = true;
        }

    }

    /**
     * Children Nodes of FanNode Nothing too special here, just lookup the
     * children
     *
     * @author tcolar
     */
    public static class FanNodeChildren extends FilterNode.Children {

        private final Project project;

        FanNodeChildren(Project project, Node projectNode) {
            super(projectNode);
            this.project = project;
        }

        @Override
        protected Node[] createNodes(Node object) {
            Node origChild = object;
            FileObject fob = origChild.getLookup().lookup(FileObject.class);

            if (fob != null) {
                if (fob.getName().startsWith(".")) {
                    return new Node[0];
                }
                org.openide.nodes.Children children = FilterNode.Children.LEAF;
                if (fob.isFolder()) {
                    if (fob.getName().equals("nbproject")) {
                        return new Node[0];
                    }
                    else {
                        children = new FanNodeChildren(project, origChild);
                    }
                }

                FanNode nd = new FanNode(project,
                        origChild,
                        children,
                        fob);

                Node[] nds = new Node[1];
                nds[0] = nd;
                return nds;
            }
            return new Node[0];
        }
    }
}
