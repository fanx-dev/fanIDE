/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.namespace;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DB model for a document (source)
 *
 * @author thibautc
 */
public class FanSrcFile {

    private static Map<String, FanSrcFile> srcFiles = new HashMap<String, FanSrcFile>();

    /**
     * Filesystem path Source path for sources LIBRARY/POD PATH for pods (libs)
     */
    private String path = "";
    
    // source or binary/lib ?
    private boolean isSource = true;
    
    private long tstamp = new Date().getTime();
    
    private List<FanType> types = new ArrayList<FanType>();

    public static synchronized Map<String, FanSrcFile> getSrcFiles() {
        return srcFiles;
    }

    public static synchronized void setSrcFiles(Map<String, FanSrcFile> srcFiles) {
        FanSrcFile.srcFiles = srcFiles;
    }

    public List<FanType> getTypes() {
        return types;
    }

    public static synchronized FanSrcFile findOrCreateOne(String path) throws Exception {
        FanSrcFile file = srcFiles.get(path);
        if (file == null) {
            file = new FanSrcFile();
            srcFiles.put(path, file);
        }
        return file;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public long getTstamp() {
        return tstamp;
    }

    public void setTstamp(long tstamp) {
        this.tstamp = tstamp;
    }

    public boolean isSource() {
        return isSource;
    }

    public void setIsSource(boolean isSource) {
        this.isSource = isSource;
    }

    public static synchronized void renameDoc(String oldPath, String newPath) {
        FanSrcFile doc = findByPath(oldPath);
        srcFiles.remove(oldPath);
        if (doc == null) return;
        srcFiles.put(newPath, doc);
    }

    public static synchronized FanSrcFile findByPath(String path) {
        return srcFiles.get(path);
    }
    
    public synchronized void delete() {
        srcFiles.remove(path);
        this.types.clear();
    }
}
