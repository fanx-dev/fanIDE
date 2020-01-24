/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.indexer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.colar.netbeans.fan.namespace.FanType;
import net.colar.netbeans.fan.namespace.Namespace;

/**
 * Indexer queries (for Java types) - reuisng builtin java indexer (lucene)
 * Fan types are dealt directly in the FanType class
 * @author tcolar
 */
public class FanIndex
{
    private static FanIndex instance = new FanIndex();
    private Map<String, List<FanType>> prefixMap = new HashMap<String, List<FanType>>();

    public static FanIndex get() { return instance; }
    
    public List<FanType> findPodTypes(String pod, String prefix) {
        List<FanType> types = Namespace.get().findPodTypes(pod);
        List<FanType> found = new ArrayList<FanType>();
        for (FanType t : types) {
            if (t.getSimpleName().startsWith(prefix)) {
                found.add(t);
            }
        }
        return found;
    }

    /**
     * Find all types of exact specified type (in any pod).
     *
     * @param type
     * @param prefix
     * @return
     */
    public List<FanType> findTypes(String type) {
        List<FanType> types = findAllFantomTypes(type);
        List<FanType> found = new ArrayList<FanType>();
        for (FanType t : types) {
            if (t.getSimpleName().equals(type)) {
                found.add(t);
            }
        }
        return found;
    }

    public List<FanType> findAllFantomTypes(String prefix) {
        return prefixMap.get(prefix);
    }
    
    public void put(FanType type) {
        String name = type.getSimpleName();
        for (int i=1; i<name.length(); ++i) {
            String key = name.substring(0, i);
            List<FanType> list = prefixMap.get(key);
            if (list == null) {
                list = new ArrayList<FanType>();
                prefixMap.put(key, list);
            }
            list.add(type);
        }
    }
    
    public void remove(FanType type) {
        String name = type.getSimpleName();
        for (int i=1; i<name.length(); ++i) {
            String key = name.substring(0, i);
            List<FanType> list = prefixMap.get(key);
            if (list != null) {
                list.remove(type);
            }
        }
    }
}
