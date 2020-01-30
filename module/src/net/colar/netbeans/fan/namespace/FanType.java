/*
 * Thibaut Colar Dec 18, 2009
 */
package net.colar.netbeans.fan.namespace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DB Model for a "Type" (class, enum, mixin)
 *
 * @author thibautc
 */
public class FanType extends FanElement {

    // Primary key
    private String qualifiedName = ""; // net.colar.jco -> Unique !
    private String simpleName = "";
    
    private String pod = ""; // name of the pod it's in (or package for java ffi)
    private List<String> inheritedTypes = new ArrayList<String>();
    
    private String doc = ""; // id of the document(source) it's found in - can be null;
    
    // wether latest indexing was done from source or binary/lib
    private FanSrcFile sourceFile = new FanSrcFile();
    
    private List<FanSlot> slots = new ArrayList<FanSlot>();
    private Map<String, FanSlot> allSlotMap = null;
    
    public static FanType makeDummy() {
        FanType t = new FanType();
        t.qualifiedName = "null::null";
        t.simpleName = "null";
        return t;
    }
    
    public void setSrcFile(FanSrcFile sourceFile) {
        this.sourceFile = sourceFile;
    }
    
    public String getSourcePath() {
        if (sourceFile == null) return null;
        return sourceFile.getPath();
    }
    
    public FanSlot findSlot(String slotName) {
        return getAllSlotMap().get(slotName);
    }
    
    public boolean isValid() {
        return qualifiedName.length() > 0;
    }
    
    public FanType getBaseType() {
        if (inheritedTypes.size() == 0) return null;
        return Namespace.get().findByQualifiedName(inheritedTypes.get(0));
    }
    
    public List<FanType> getInherited() {
        List<FanType> ss = new ArrayList<FanType>();
        for (String type : inheritedTypes) {
            ss.add(Namespace.get().findByQualifiedName(type));
        }
        return ss;
    }
    
    public List<String> getInheritedTypes() {
        return inheritedTypes;
    }
    
    public boolean fits(FanType t) {
        if (t.inheritedTypes.size() == 0) return true;
        if (!this.isValid() || !t.isValid()) return true;
        
        String qname = t.getQualifiedName();
        if (this.getQualifiedName().equals(qname)) return true;
        
        if (inheritedTypes.contains(qname)) return true;
        for (String type : inheritedTypes) {
            if (Namespace.get().findByQualifiedName(type).fits(t)) {
                return true;
            }
        }
        return false;
    }
    
    public List<FanSlot> getSlots() {
        return slots;
    }
    
    public void addSlot(FanSlot s) {
        slots.add(s);
        s.parent = this;
    }
    
    public Map<String, FanSlot> getAllSlotMap() {
        if (allSlotMap == null) {
            Map<String, FanSlot> all = new HashMap<String, FanSlot>();
            for (String type : inheritedTypes) {
                FanType t = Namespace.get().findByQualifiedName(type);
                if (t == null) continue;
                Map<String, FanSlot> slots = t.getAllSlotMap();
                for (Map.Entry<String, FanSlot> s : slots.entrySet()) {
                    all.put(s.getKey(), s.getValue());
                }
            }
            for (FanSlot s : this.slots) {
                all.put(s.getName(), s);
            }
            allSlotMap = all;
        }
        return allSlotMap;
    }
    
    public List<FanSlot> getAllSlots() {
        Map<String, FanSlot> all = getAllSlotMap();
        List<FanSlot> ss = new ArrayList<FanSlot>();
        for (Map.Entry<String, FanSlot> e : all.entrySet()) {
            ss.add(e.getValue());
        }
        return ss;
    }
    
    public void setPod(String pod) {
        this.pod = pod;
    }
    
    public String getPod() {
        return pod;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public boolean isFromSource() {
        return sourceFile.isSource();
    }
    
    public boolean isMixin() {
        return (flags & FanConst.Mixin) != 0;
    }

    public boolean isEnum() {
        return (flags & FanConst.Enum) != 0;
    }

    public boolean isJava() {
        return pod.startsWith("[java]");
    }
    
    @Override
    public String toString() {
        return qualifiedName;
    }
}
