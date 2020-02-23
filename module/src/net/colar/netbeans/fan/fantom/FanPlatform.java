/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.fantom;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.colar.netbeans.fan.execution.FanExecution;
import javax.swing.JOptionPane;
import net.colar.netbeans.fan.indexer.IndexerHelper;
import net.colar.netbeans.fan.project.FanProject;
import net.colar.netbeans.fan.project.FanProjectFactory;
import net.colar.netbeans.fan.project.FanProjectProperties;
import net.colar.netbeans.fan.wizard.FanMainSettingsController;
import org.netbeans.api.java.classpath.ClassPath;
import org.netbeans.api.options.OptionsDisplayer;
import org.netbeans.spi.java.classpath.support.ClassPathSupport;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;

/**
 * Provides acces to "plaform" settings For exampel FAN_HOME etc...
 *
 * @author thibautc
 */
public class FanPlatform {

    private static boolean configWarningAlreadyDisplayed = false;
    
    public static final boolean IS_WIN = System.getProperty("os.name").toLowerCase().indexOf("windows") != -1;
    public static final boolean IS_MAC = System.getProperty("os.name").toLowerCase().startsWith("mac");
    //private static final String ARCH = System.getProperty("os.arch").toLowerCase();
    
    public final static String FAN_CLASS = "fanx.tools.Fan";
    public final static String FANT_CLASS = "std::Test";
    public final static String FANT_CLASS_OLD = "fanx.tools.Fant";
    public final static String FAN_SH = "fansh";
//    public final static String FAN_TALES_POD_NAME = "tales";
//    public final static String FAN_TALES_CREATE_CMD = "new";
//    public final static String FAN_TALES_RUN_CMD = "run";
    
    private static final FanPlatform instance = new FanPlatform();
    
    private String fanHome;
    //private String podsDir;
    private String fanSrc;
    private Set<ClassPath> sourcePaths = null;
    private boolean isFanx = true;
    private int debugPort = 8018;

    private FanPlatform() {
        readSettings();
    }

    private void readSettings() {
        
        fanHome = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FAN_HOME);
        if (fanHome == null) {
            fanHome = System.getenv("FANX_HOME");
            if (fanHome != null) {
                if (!checkFanHome(fanHome)) {
                    fanHome = null;
                }
            }
        }
        
        if (fanHome != null) {
            try {
                fanHome = new File(fanHome).getCanonicalPath();
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
            if (!fanHome.endsWith(File.separator)) {
                fanHome += File.separator;
            }
            //fanBin = fanHome + "bin" + File.separator + (IS_WIN ? "fan.exe" : "fan");
            //fanshBin = fanHome + "bin" + File.separator + (IS_WIN ? "fansh.exe" : "fansh");
            fanSrc = fanHome + "src" + File.separator;
            //podsDir = fanHome + "lib" + File.separator + "fan" + File.separator;
            
            isFanx = new File (fanHome + "bin", "fanc").exists();
        }
        // force updating paths
        sourcePaths = null;
        
        String port = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_DEBUG_PORT);
        if (port != null) debugPort = Integer.valueOf(port);
    }
    
    public static boolean isFanx() {
        return instance.isFanx;
    }
    
    public static int debugPort() {
        return instance.debugPort;
    }

    public static boolean checkFanHome(String path) {
        if (path != null && !"".equals(path)) {
            File f = new File(path);
            if (f.exists() && f.isDirectory()) {
                File exe = new File(path + File.separator + "bin", "fan");
                return exe.exists() && exe.isFile();
            }
        }
        return false;
    }

    public static boolean checkConfigured(int time) {
        // send to settings the first time isConfigured is called
        synchronized (FanPlatform.class) {
            if (instance.fanHome == null && !configWarningAlreadyDisplayed) {
                configWarningAlreadyDisplayed = true;
                Runnable task = new Runnable() {
                    public void run() {
                        // Open after a delay or it tends to appear behind the main window
                        OptionsDisplayer.getDefault().open(FanMainSettingsController.ID);
                    }
                };
                Executors.newSingleThreadScheduledExecutor().schedule(task, time, TimeUnit.SECONDS);
            }
        }
        return instance.fanHome != null;
    }
    
    public static boolean isConfigured() {
        return instance.fanHome != null;
    }

    public static FanPlatform getInstance() {
        // throw an exception ?
        return instance;
    }

    public String getFanSrcPath() {
        return fanSrc;
    }

    /**
     * Add Fan Source items (pods src)
     *
     * @return
     */
    public synchronized Set<ClassPath> getSourceClassPaths() {
        // Do it only once.
        if (sourcePaths == null && fanSrc != null) {
            sourcePaths = new HashSet<ClassPath>();
            File f = new File(fanSrc);
            if (f.exists()) {
                File[] files = f.listFiles();
                for (File file : files) {
                    if (file.isDirectory() && new File(file, FanProjectFactory.BUILD_FILE).exists()) {
                        addFolder(file);
                    }
                }
            }
            //GlobalPathRegistry.getDefault().register(ClassPath.SOURCE, sourcePaths.toArray(new ClassPath[sourcePaths.size()]));
        }
        return sourcePaths;
    }

    private void addFolder(File folder) {
        if (folder.exists() && folder.isDirectory()) {
            ClassPath jcp = ClassPathSupport.createClassPath(folder.getAbsolutePath());
            sourcePaths.add(jcp);
        }
    }

    /**
     * Same as buildFanCall(fanExec, -1);
     *
     * @param fanExec
     */
    public void buildFanCall(FanProject project, FanExecution fanExec) {
        buildFanCall(project, fanExec, false, null);
    }

    /**
     * Updated the FanExecution object such as the fanlaunch shell script would
     * IE: set classpath, library path etc ....
     *
     * @param fanExec
     * @param debugPort (-1 = no debugger)
     */
    public void buildFanCall(FanProject project, FanExecution fanExec, boolean enableDebug, String extraClasspath) {
        if ("".equals(fanHome) || fanHome == null) {
            JOptionPane.showMessageDialog(null, "Fanx runtime path is not defined\nDefine in Options/Misc - Fantom Tab");
            return;
        }

        // We will be spawning a new java VM
        String separator = System.getProperty("file.separator");
        String path = System.getProperty("java.home") + separator + "bin" + separator + "java";
        fanExec.setCommand(path);

        // classpath
        //String classpath = System.getProperty("java.class.path");
        //String classpath = buildFanClasspath(extraClasspath);
        fanExec.addCommandArg("-cp");
        if (isFanx) {
            fanExec.addCommandArg(fanHome + "lib/java/fanx.jar");
        }
        else {
            fanExec.addCommandArg(fanHome + "lib/java/sys.jar");
        }

        //Set lib path
        //String libPath = buildLibraryPath();
        //fanExec.addCommandArg("-Djava.library.path=" + libPath);

        //Set fan.home
        fanExec.addCommandArg("-Dfan.home=" + fanHome);

        //Enable debugger
        if (enableDebug) {
            // java debugger
            fanExec.addCommandArg("-Xdebug");
            //fanExec.addCommandArg("-Xrunjdwp:transport=dt_socket,address=" + debugPort + ",server=y,suspend=y");
            fanExec.addCommandArg("-agentlib:jdwp=transport=dt_socket,address=" + debugPort + ",server=y,suspend=y");
            // fan debug
            fanExec.addCommandArg("-Dfan.debug=true");
        }

        // global options
//        String option = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_RUN_OPTIONS, "-Xmx512m");
//        String[] options = option.split(" ");
//        for (String opt : options) {
//            fanExec.addCommandArg(opt);
//        }

        // project JVM options
        if (project != null) {
            FanProjectProperties props = project.getLookup().lookup(FanProjectProperties.class);
            String jvmOption = props.getJvmArgs();
            String[] jvmOptions = jvmOption.split(" ");
            for (String opt : jvmOptions) {
                fanExec.addCommandArg(opt);
            }
        }

        //OSX only flag needed for SWT (as in fanlaunch)
//        if (IS_MAC) {
//            fanExec.addCommandArg("-XstartOnFirstThread");
//        }
    }

    /**
     * Builds fan std classpath (jars)
     *
     * @return
     */
//    private String buildFanClasspath(String extraClasspath) {
//        String cp = "";
//        String cpSeparator = IS_WIN ? ";" : ":";
//        String s = File.separator;
//        // sys.jar
//        cp += fanHome + "lib" + s + "java" + s + "sys.jar";
//        // add jars in lib/java/ext
//        String extDir = fanHome + "lib" + s + "java" + s + "ext";
//        File dir = new File(extDir);
//        if (dir.exists() && dir.isDirectory()) {
//            File[] jars = dir.listFiles();
//            for (File jar : jars) {
//                if (jar.isFile() && jar.getName().toLowerCase().endsWith(".jar")) {
//                    cp += cpSeparator + extDir + s + jar.getName();
//                }
//            }
//        }
//        // add jars file in lib/java/ext/{os}
//        String os = "linux";
//        if (IS_MAC) {
//            os = "mac";
//        } else if (IS_WIN) {
//            os = "win";
//        }
//        extDir += s + os;
//        dir = new File(extDir);
//        if (dir.exists() && dir.isDirectory()) {
//            File[] jars = dir.listFiles();
//            for (File jar : jars) {
//                if (jar.isFile() && jar.getName().toLowerCase().endsWith(".jar")) {
//                    cp += cpSeparator + extDir + s + jar.getName();
//                }
//            }
//        }
//        if (extraClasspath != null) {
//            cp += cpSeparator + extraClasspath;
//        }
//        return cp;
//    }

//    private String buildLibraryPath() {
//        String s = File.separator;
//        String extDir = fanHome + "lib" + s + "java" + s + "ext";
//        String os = "linux";
//        if (IS_MAC) {
//            os = "mac";
//        } else if (IS_WIN) {
//            os = "win";
//        }
//        extDir += s + os;
//        return extDir;
//    }

    public FileObject getFanHome() {
        if ("".equals(fanHome) || fanHome == null) {
            //JOptionPane.showMessageDialog(null, "Fantom SDK path is not defined\nDefine in Options/Misc - Fantom Tab");
            return null;
        }
        File f = new File(fanHome);
        return FileUtil.toFileObject(FileUtil.normalizeFile(f));
    }
//
//    public FileObject getFanSrcHome() {
//        if ("".equals(fanHome) || fanHome == null) {
//            JOptionPane.showMessageDialog(null, "Fantom SDK path is not defined\nDefine in Tools|Options, Fantom Tab");
//            return null;
//        }
//        File f = new File(fanSrc);
//        return FileUtil.toFileObject(FileUtil.normalizeFile(f));
//    }

    public static void update() {
        // called when FAN_HOME is changed/updated.
        instance.readSettings();
        //IndexerHelper.indexAllPods();
    }

//    public String getPodsDir() {
//        return podsDir;
//    }
}
