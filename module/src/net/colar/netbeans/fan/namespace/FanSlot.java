/*
 * Thibaut Colar Dec 22, 2009
 */
package net.colar.netbeans.fan.namespace;

import java.util.ArrayList;
import java.util.List;

/**
 * DB Model for a slot
 * Prameters (if any) are in FanMethodParam
 * @author thibautc
 */
public class FanSlot extends FanElement
{
    public FanType parent; // which type it's part of
    public String name = ""; // name of the slot
    // qualified type of a field or returntype for method/ctor
    public String returnedType = "";
    
    public boolean isMethod = false;
    public List<FanMethodParam> params = new ArrayList<FanMethodParam>();

    public FanSlot(String name, String type, boolean isMethod) {
        this.name = name;
        this.returnedType = type;
        this.isMethod = isMethod;
    }
    
    public void addParam(FanMethodParam param) {
        params.add(param);
    }
    
    public void setReturnedType(String type)
    {
        returnedType = type;
    }

    public String getReturnedType()
    {
        return returnedType;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Note: this does not look into inheritance
     * Use FanResolvedType.resolveSlotBaseType() first to find the slot baseType
     * @param qualifiedType
     * @param slotName
     * @return
     */
    public static FanSlot findByTypeAndName(String qualifiedType, String slotName)
    {
        FanType type = Namespace.get().findByQualifiedName(qualifiedType);
        if (type == null) return null;
        return type.findSlot(slotName);
    }

    public boolean isCtor()
    {
        return (flags & FanConst.Ctor) != 0;
    }

    public boolean isMethod()
    {
        return isMethod;
    }

    public boolean isField()
    {
        return !isMethod;
    }

    public List<FanMethodParam> getAllParameters()
    {
        return params;
    }

    @Override
    public String toString()
    {
        return "FanSlot: " + getName() + "(" + getReturnedType() + ")";
    }
}
