/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.actions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Future;
import javax.swing.JOptionPane;
import net.colar.netbeans.fan.FanLanguage;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.fantom.FanPlatformSettings;
import net.colar.netbeans.fan.project.FanBuildFileHelper;
import net.colar.netbeans.fan.project.FanProject;
import net.colar.netbeans.fan.project.FanProjectProperties;
import org.netbeans.api.debugger.jpda.DebuggerStartException;
import org.netbeans.api.debugger.jpda.JPDADebugger;
import org.netbeans.api.extexecution.ExecutionDescriptor;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ui.OpenProjects;
import org.openide.awt.HtmlBrowser;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.nodes.Node;
import org.openide.util.Lookup;
import org.openide.windows.TopComponent;

/**
 * Command / Action Base
 * Copied/modified from Python module
 */
public abstract class FanAction {

    public final ExecutionDescriptor descriptor = new ExecutionDescriptor().frontWindow(true).controllable(true).inputVisible(true).showProgress(true).showSuspended(true);
    private final FanProject project;
    private FanJpdaThread jpdaThread = null;
//    protected static Future<Integer> talesHandle;

    public FanAction(FanProject project) {
        this.project = project;
        assert project != null;
    }

    public abstract String getCommandId();

    public abstract void invokeAction(Lookup context) throws IllegalArgumentException;

    public abstract boolean isActionEnabled(Lookup context) throws IllegalArgumentException;

    public boolean asyncCallRequired() {
        return true;
    }

    public boolean saveRequired() {
        return true;
    }

    public final FanProject getProject() {
        return project;
    }

    public Node[] getSelectedNodes() {
        return TopComponent.getRegistry().getCurrentNodes();
    }

    protected void showLaunchError(String message) {
        JOptionPane.showMessageDialog(null, message, "Fantom Launch Error", JOptionPane.ERROR_MESSAGE);

    }

    protected FanExecution buildPodAction(Lookup lookup) {
        return buildAction(lookup, "");
    }

    protected FanExecution cleanPodAction(Lookup lookup) {
        return buildAction(lookup, "clean");
    }

    protected FanExecution testPodAction(Lookup lookup) {
        return buildAction(lookup, "test");
    }

    protected FanExecution customBuildAction(Lookup lookup, String buildTarget) {
        return buildAction(lookup, buildTarget);
    }

    protected FanExecution runPodAction(Lookup lookup, boolean debug) {
//        FanProjectProperties props = project.getLookup().lookup(FanProjectProperties.class);

        return runPodAction(lookup, debug, null);
    }

    private FanExecution runPodAction(Lookup lookup, boolean debug, String clazz) 
    {
        FileObject file = findTargetProject(lookup);
        FanProjectProperties props = project.getLookup().lookup(FanProjectProperties.class);
        if (file != null) {
            String podName = file.getName();
            String path = FileUtil.toFile(file.getParent()).getAbsolutePath();
            // see if user specified custom main method
            String target = clazz == null ?
                    podName + "::" + FanProjectProperties.getProperties(project).getMainMethod()
                    :podName + "::" + clazz;
            if (target == null || target.length() == 0) {
                // otherwise use default
                target = podName + "::" + "Main" + "." + "main";
            }
            FanExecution fanExec = new FanExecution();
            fanExec.setDisplayName(getProjectName(lookup));
            fanExec.setWorkingDirectory(path);

            FanPlatform.getInstance().buildFanCall(project, fanExec, debug, "");

            fanExec.addCommandArg(FanPlatform.FAN_CLASS);
            fanExec.addCommandArg(target);
            if (debug) {
                if (jpdaThread != null && jpdaThread.isAlive()) {
                    jpdaThread.shutdown();
                    jpdaThread.interrupt();
                }
                jpdaThread = new FanJpdaThread();
                jpdaThread.start();
            }

            // Add project custom "run" arguments
            if (props != null) {
                String[] args = props.getArgs().split(" ");
                for (String arg : args) {
                    fanExec.addCommandArg(arg);
                }
            }
            FanUtilities.logger.info(fanExec.toString());

            return fanExec;
        }
        return null;
    }

    protected FanExecution testFileAction(Lookup lookup, String testClass) {
        FileObject file = findTargetProject(lookup);
        if (file != null) {
            String podName = file.getName();
            String path = FileUtil.toFile(file).getAbsolutePath();
            // see if user specified custom main method
            String target = podName + (testClass == null ? "" : "::" + testClass);
            FanExecution fanExec = new FanExecution();
            fanExec.setDisplayName(getProjectName(lookup));
            fanExec.setWorkingDirectory(path);
            FanPlatform.getInstance().buildFanCall(project, fanExec, false, null);
            fanExec.addCommandArg(FanPlatform.FANT_CLASS);
            fanExec.addCommandArg(target);
            return fanExec;
        }
        return null;
    }

    public String getProjectName(Lookup lookup) {
        return findTargetProject(lookup).getName();
    }

    /**
     * Call the action using internal call to Fan java class (not the wrapper scripts).
     * @param lookup
     * @param target
     * @return
     */
    private FanExecution buildAction(Lookup lookup, String target) {
        // if default target "", see what user chose in props;
        if (target.equals("")) {
            String newTarget = FanProjectProperties.getProperties(project).getBuildTarget();
            if (newTarget != null) {
                target = newTarget;
            }
        }
        FileObject file = findTargetProject(lookup);
//        FanProjectProperties props = project.getLookup().lookup(FanProjectProperties.class);
//        boolean tales = props.isIsTalesProject();
        if (file != null) {
            FileObject buildFile = file.getFileObject(FanBuildFileHelper.BUILD_FILE);
            if (buildFile != null) {
                String path = FileUtil.toFile(file).getAbsolutePath();
                FanExecution fanExec = new FanExecution();
                fanExec.setDisplayName(getProjectName(lookup));
                fanExec.setWorkingDirectory(path);
                FanPlatform.getInstance().buildFanCall(project, fanExec, false, "");
                fanExec.addCommandArg(FanPlatform.FAN_CLASS);
                fanExec.addCommandArg(FanBuildFileHelper.BUILD_FILE);
                fanExec.addCommandArg(target);
                return fanExec;
            }
        }
        return null;
    }

    protected FanExecution runFileAction() {
        Node[] activatedNodes = getSelectedNodes();
        FileObject file = null;
        DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
        if (gdo != null && gdo.getPrimaryFile() != null) {
            file = gdo.getPrimaryFile();
        }
        if (file != null && file.getMIMEType().equals(FanLanguage.FAN_MIME_TYPE)) {
            String path = FileUtil.toFile(file.getParent()).getAbsolutePath();
            String script = FileUtil.toFile(file).getAbsolutePath();

            FanExecution fanExec = new FanExecution();
            fanExec.setDisplayName(file.getName());
            fanExec.setWorkingDirectory(path);
            FanPlatform.getInstance().buildFanCall(null, fanExec);
            fanExec.addCommandArg(FanPlatform.FAN_CLASS);
            fanExec.addCommandArg(script);

            return fanExec;
        }
        return null;
    }

    protected FanExecution runClassAction() {
        Node[] activatedNodes = getSelectedNodes();
        FileObject file = null;
        DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
        if (gdo != null && gdo.getPrimaryFile() != null) {
            file = gdo.getPrimaryFile();
        }
        if (file != null && file.getMIMEType().equals(FanLanguage.FAN_MIME_TYPE)) {
//            String script = FileUtil.toFile(file).getAbsolutePath();

            return runPodAction(Lookup.EMPTY, false, file.getName());
        }
        return null;
    }

    /**
     * TODO If the user "selects" a project node it will run that one rather
     * than the 'actual' main project (when running main project)\
     * But to avoid that i would have to setup separate actions for running a project from contextual menu
     * vs running it from "run main project" button .... which seems a bit silly.
     * @param lookup
     * @return
     */
    private FileObject findTargetProject(Lookup lookup) {
        FileObject file = null;
        Node[] activatedNodes = getSelectedNodes();
        if (activatedNodes != null && activatedNodes.length > 0) {
            DataObject gdo = activatedNodes[0].getLookup().lookup(DataObject.class);
            if (gdo != null && gdo.getPrimaryFile() != null) {
                file = gdo.getPrimaryFile();
                if (FanProject.isProject(file)) {
                    return file;
                }
            }
        }
        // If we get there, current selected item is NOT a project
        // so use the "main" one
        // use "main project", if fan project
        Project prj = OpenProjects.getDefault().getMainProject();
        if (prj != null && FanProject.isProject(prj.getProjectDirectory())) {
            return OpenProjects.getDefault().getMainProject().getProjectDirectory();
        }
        // try to fall back to the selected item project folder
        return file == null ? null
                : FileUtil.toFileObject(FanUtilities.getPodFolderForPath(file.getPath()));
    }

    class FanJpdaThread extends Thread implements Runnable {

        private volatile boolean shutdown = false;

        @Override
        public void run() {
            // start JPDA
            FanUtilities.logger.info("Starting JPDA");
            String portStr = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_DEBUG_PORT, "8008");
            int port = new Integer(portStr).intValue();
            try {
                for (int i = 0; i != 15 && !shutdown; i++) {
                    // TODO: this is kinda ugly - Use JPDASupport instead ??
                    try {
                        JPDADebugger debugger = JPDADebugger.attach("localhost", port, new Object[0]);
                        // if connected, then we are good
                        return;
                    } catch (DebuggerStartException e) {
                        FanUtilities.logger.fine("Failed connecting to debugger, will try again: " + e);
                        if (i == 14) {
                            FanUtilities.logger.throwing("Failed connecting to Debugger", "fan jpda", e);
                        }
                    }
                    Thread.yield();
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void shutdown() {
            shutdown = true;
        }
    }

//    /**
//     * If this is a tales project, open the browser .. if not, do nothing.
//     * @param f 
//     */
//    public void showTalesBrowser(Future<Integer> f) {
//        FanProjectProperties props = project.getLookup().lookup(FanProjectProperties.class);
//
//        if (props != null && props.isIsTalesProject()) {
//            talesHandle = f;
//            HtmlBrowser.URLDisplayer displayer = HtmlBrowser.URLDisplayer.getDefault();
//            try {
//                Thread.sleep(5000);
//                displayer.showURLExternal(new URL("http://127.0.0.1:8000/"));
//            } catch (MalformedURLException e) {
//            } catch (InterruptedException e) {
//            }
//        }
//
//    }
//
//    /**
//     * Try to shutdown properly
//     */
//    public static void shutdownTales() {
//        if (talesHandle != null && !talesHandle.isDone()) {
//            talesHandle.cancel(true);
//        }
//    }
}
