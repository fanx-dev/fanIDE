/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.indexer;

import fan.parser.CNamespace;
import fan.parser.CPod;
import fan.parser.CTypeDef;
import fan.parser.FPodNamespace;
import fan.parser.Loc;
import fan.parser.TypeMixin;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.utils.FanUtilities;

/**
 * Indexer queries (for Java types) - reuisng builtin java indexer (lucene)
 * Fan types are dealt directly in the FanType class
 * @author tcolar
 */
public class FanIndex
{
    private static FanIndex instance = new FanIndex();
    private Map<String, List<CTypeDef>> prefixMap = new HashMap<String, List<CTypeDef>>();
    
    private CNamespace namespace;
    private boolean indexInited = false;
    
    private fan.parser.CNamespace getNamespace() {
        if (!FanPlatform.isConfigured()) {
            return null;
        }
        if (namespace == null) {
            String dir = FanPlatform.getInstance().getFanHome().getPath() + "/lib/fan";
            fan.std.File dirF = fan.std.File.os(dir);
            namespace = fan.parser.FPodNamespace.make(dirF);
        }
        return namespace;
    }
    
    
    public static FanIndex get() { return instance; }
    
    public synchronized void indexNamespace() {
        final fan.parser.CNamespace ns = getNamespace();
        if (ns == null) return;
        if (indexInited) {
            ns.checkUpdate();
            return;
        }
        indexInited = true;
        
        new Thread() {
            @Override
            public void run() {
                doIndexNamespace(ns);
            }
        }.start();
    }
    
    private void doIndexNamespace(fan.parser.CNamespace ns) {

        if (ns instanceof FPodNamespace) {
            fan.std.File file = ((FPodNamespace)ns).dir;
            if (file != null) {
                fan.sys.List list = file.list();
                for (int i=0; i<list.size(); ++i) {
                    fan.std.File podFile = (fan.std.File)list.get(i);
                    String podName = podFile.basename();
                    try {
                        synchronized(this) {
                            CPod pod = namespace.resolvePod(podName, Loc.makeUninit());

                            FanUtilities.logger.fine("index pod:"+pod.name());

                            fan.sys.List types = pod.types();
                            
                            for (int j=0; j<types.size(); ++j) {
                                CTypeDef type = (CTypeDef)types.get(j);
                                if (fan.parser.TypeMixin$.isSynthetic(type)) continue;
                                FanIndex.get().putType(type);
                            }
                        }
                    } catch (Exception e) {
                        FanUtilities.logger.warning("load pod error:"+podName);
                        e.printStackTrace();
                    }
                }
            }
        }
    }
    
    public synchronized List<CTypeDef> findPodTypes(String pod, String prefix) {
        List<CTypeDef> found = new ArrayList<CTypeDef>();
        CNamespace namespace = getNamespace();
        if (namespace == null) return found;
        
        fan.sys.List types = namespace.resolvePod(pod, Loc.makeUninit()).types();
        
        for (int i=0; i<types.size(); ++i) {
            CTypeDef t = (CTypeDef)types.get(i);
            if (t.name().startsWith(prefix)) {
                found.add(t);
            }
        }
        return found;
    }
    
    public synchronized List<String> findPod(String prefix) {
        List<String> res = new ArrayList<>();
        CNamespace namespace = getNamespace();
        if (namespace == null) return res;
        
        if (namespace instanceof FPodNamespace) {
            fan.std.File file = ((FPodNamespace)namespace).dir;
            if (file != null) {
                fan.sys.List list = file.list();
                for (int i=0; i<list.size(); ++i) {
                    fan.std.File podFile = (fan.std.File)list.get(i);
                    if (podFile.basename().startsWith(prefix)) {
                        res.add(podFile.basename());
                    }
                }
            }
        }
        return res;
    }

    /**
     * Find all types of exact specified type (in any pod).
     *
     * @param type
     * @param prefix
     * @return
     */
    public synchronized List<CTypeDef> findTypes(String type) {
        List<CTypeDef> types = findAllFantomTypes(type);
        List<CTypeDef> found = new ArrayList<CTypeDef>();
        for (CTypeDef t : types) {
            if (t.name().equals(type)) {
                found.add(t);
            }
        }
        return found;
    }

    public synchronized List<CTypeDef> findAllFantomTypes(String prefix) {
        List<CTypeDef> res = prefixMap.get(prefix);
        if (res == null) return Collections.emptyList();
        return res;
    }
    
    public synchronized void putType(CTypeDef type) {
        String name = type.name();
        for (int i=1; i<name.length()+1; ++i) {
            String key = name.substring(0, i);
            List<CTypeDef> list = prefixMap.get(key);
            if (list == null) {
                list = new ArrayList<CTypeDef>();
                prefixMap.put(key, list);
            }
            list.add(type);
        }
    }
    
    public synchronized void removeType(CTypeDef type) {
        String name = type.name();
        for (int i=1; i<name.length()+1; ++i) {
            String key = name.substring(0, i);
            List<CTypeDef> list = prefixMap.get(key);
            if (list != null) {
                for (int j=0; j<list.size(); ++j) {
                    if (list.get(j).qname().equals(type.qname())) {
                        list.remove(j);
                        --j;
                    }
                }
            }
        }
    }
}
