/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import static fan.std.MimeType.dir;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectManager;
import org.netbeans.spi.project.ProjectFactory;
import org.netbeans.spi.project.ProjectFactory2;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.util.Exceptions;

/**
 * Factory for Fan projects Will be invoked by NB (using the annotation) Will
 * create FanProject instances when a Fan project is found
 *
 * @author tcolar
 */
//This annotation will register this factory with NB
@org.openide.util.lookup.ServiceProvider(service = org.netbeans.spi.project.ProjectFactory.class, position = 661)
public final class FanProjectFactory implements ProjectFactory2 {

    public static final String BUILD_FILE = "pod.props";
    public static final String BUILD_FILE_OLD = "build.fan";

    private final static Pattern POD_NAME_PATTERN = Pattern.compile("podName\\s*=\\s*\"(\\S+)\"");

    @Override
    public boolean isProject(FileObject projectDirectory) {
        return isFanProject(projectDirectory);
    }

    @Override
    public Project loadProject(FileObject projectDirectory, ProjectState projectState) throws IOException {
        if (isProject(projectDirectory)) {
            normalizeProject(projectDirectory);
            return new FanProject(projectDirectory, projectState);
        }
        return null;
    }

    @Override
    public void saveProject(Project project) throws IOException, ClassCastException {
    }

    @Override
    public ProjectManager.Result isProject2(FileObject dir) {
        return isProject(dir) ? new ProjectManager.Result(FanProject.getFanIcon()) : null;
    }

    public static boolean isFanProject(FileObject projectDirectory) {
        if (projectDirectory.getFileObject(BUILD_FILE) != null) {
            return true;
        }
        if (projectDirectory.getFileObject(BUILD_FILE_OLD) != null) {
            return true;
        }
        return false;
    }

    private static void normalizeProject(FileObject projectDirectory) {
        if (projectDirectory.getFileObject(BUILD_FILE) == null
                && projectDirectory.getFileObject(BUILD_FILE_OLD) != null) {
            try {
                String podName = getPodName(FileUtil.toFile(projectDirectory));
                FileObject buildFile = projectDirectory.createData(BUILD_FILE);
                OutputStream out = buildFile.getOutputStream();
                Writer writer = new OutputStreamWriter(out);
                writer.write("podName = " + podName + "\n"
                        + "summary = " + podName + " discription\n"
                        + "version = 1.0\n"
                        + "depends = sys 2.0, std 1.0\n"
                        + "srcDirs = fan/*, test/*\n");
                writer.close();
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }

    private static Map<String, String> readProps(InputStream in) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(in));
        String line;
        Map<String, String> map = new HashMap<String, String>();
        while (true) {
            line = r.readLine();
            if (line == null) {
                break;
            }
            line = line.trim();
            if (line.startsWith("//")) {
                continue;
            }
            String[] fs = line.split("=", 2);
            if (fs.length != 2) {
                //System.out.println("ERROR read:" + line);
                continue;
            }
            String key = fs[0].trim();
            String val = fs[1].trim();
            map.put(key, val);
        }
        return map;
    }

    public static String getPodName(File folder) {
        try {
            String pod = null;

            File podFile = new File(folder, BUILD_FILE);
            if (podFile.exists()) {
                InputStream in = new FileInputStream(podFile);
                Map<String, String> map = readProps(in);
                pod = (String) map.get("podName");
                in.close();
                return pod;
            }

            File buildFan = new File(folder, BUILD_FILE_OLD);
            if (buildFan.exists()) {
                String buildText = FileUtil.toFileObject(FileUtil.normalizeFile(buildFan)).asText();
                Matcher m = POD_NAME_PATTERN.matcher(buildText);
                if (m.find()) {
                    pod = m.group(1);
                    return pod;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return folder.getName();
    }

    /**
     * Try to resolve the pod name given a source path
     *
     * Changed from using fantom script parser, because it always fails on
     * partial files. It is very possible for the file to be unparseable
     * (incomplete)
     *
     * @param path
     * @return
     */
    public static String getPodForPath(String path) {
        File folder = new File(path).getParentFile();
        File scriptFolder = folder;
        try {
            String pod = null;
            while (folder != null) {
                File podFile = new File(folder, BUILD_FILE);
                if (podFile.exists()) {
                    fan.std.Map map = fan.std.File.fromPath(podFile.getCanonicalPath()).in().readProps();
                    pod = (String) map.get("podName");
                    return pod;

                } else {
                    folder = folder.getParentFile();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //FanUtilities.logger.severe("Could not find pod for: " + path);
        // Must be a script, make-up a "pod" from folder name .. should probably normalize it
        return "_SCRIPT_" + scriptFolder.getName();
    }
}
