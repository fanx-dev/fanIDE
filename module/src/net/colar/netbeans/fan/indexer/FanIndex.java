/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.indexer;

import fan.parser.CNamespace;
import fan.parser.CTypeDef;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static FanIndex get() { return instance; }
    
    public synchronized List<CTypeDef> findPodTypes(String pod, String prefix) {
        fan.sys.List types = namespace.findPod(pod).types();
        List<CTypeDef> found = new ArrayList<CTypeDef>();
        for (int i=0; i<types.size(); ++i) {
            CTypeDef t = (CTypeDef)types.get(i);
            if (t.name().startsWith(prefix)) {
                found.add(t);
            }
        }
        return found;
    }
    
    public synchronized List<String> findPod(String prefix) {
        return null;
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
        return prefixMap.get(prefix);
    }
    
    public synchronized void put(CTypeDef type) {
        String name = type.name();
        for (int i=1; i<name.length(); ++i) {
            String key = name.substring(0, i);
            List<CTypeDef> list = prefixMap.get(key);
            if (list == null) {
                list = new ArrayList<CTypeDef>();
                prefixMap.put(key, list);
            }
            list.add(type);
        }
    }
    
    public synchronized void remove(CTypeDef type) {
        String name = type.name();
        for (int i=1; i<name.length(); ++i) {
            String key = name.substring(0, i);
            List<CTypeDef> list = prefixMap.get(key);
            if (list != null) {
                list.remove(type);
            }
        }
    }
}
