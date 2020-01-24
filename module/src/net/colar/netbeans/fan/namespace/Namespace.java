/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.namespace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import net.colar.netbeans.fan.indexer.FanIndex;

/**
 *
 * @author yangjiandong
 */
public class Namespace {
    private static Namespace cur = new Namespace();
    
    public Map<String, List<FanType>> pods = new HashMap<String, List<FanType>>();
    Map<String, FanType> types = new HashMap<String, FanType>();
    
    public static Namespace get() {
        return cur;
    }
    
    private Namespace() {
    }
    
    public void put(FanType type) {
        String qname = type.getQualifiedName();
        types.put(qname, type);
        List<FanType> list = pods.get(type.getPod());
        if (list == null) {
            list = new ArrayList<FanType>();
            pods.put(type.getPod(), list);
        }
        list.add(type);
        
        FanIndex.get().put(type);
    }
    
    public void remove(FanType type) {
        String qname = type.getQualifiedName();
        types.remove(qname);
        List<FanType> list = pods.get(type.getPod());
        if (list != null) {
            list.remove(type);
        }
        
        FanIndex.get().remove(type);
    }
    
    @SuppressWarnings("unchecked")
    public List<String> findAllPodNames() {
        List<String> list = new ArrayList<String>();
        for (Map.Entry<String, List<FanType>> e : pods.entrySet()) {
            list.add(e.getKey());
        }
        return list;
    }

    public boolean hasPod(String podName) {
        return pods.containsKey(podName);
    }
    
    public List<FanType> findPodTypes(String podName) {
        return pods.get(podName);
    }
    
    /**
     * During parsing we use this through fanParserTask.findCachedQualifiedType
     * (cached)
     *
     * @param qName
     * @return
     */
    public FanType findByQualifiedName(String qName) {
        return types.get(qName);
    }

    public FanType findByPodAndType(String pod, String type) {
        String qname = pod + "::" + type;
        return findByQualifiedName(qname);
    }
    
    /**
     * Get simple name from qname
     * @param qualifiedType
     * @return 
     */
    public static String getShortName(String qualifiedType) {
        if (qualifiedType != null && qualifiedType.indexOf("::") > -1) {
            return qualifiedType.substring(qualifiedType.indexOf("::") + 2);
        }
        return qualifiedType;
    }
}
