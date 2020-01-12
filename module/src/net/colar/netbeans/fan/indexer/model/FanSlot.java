/*
 * Thibaut Colar Dec 22, 2009
 */
package net.colar.netbeans.fan.indexer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.ModifEnum;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.VarKind;
import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.JOTTransaction;
import net.jot.persistance.builders.JOTQueryBuilder;

/**
 * DB Model for a slot
 * Prameters (if any) are in FanMethodParam
 * @author thibautc
 */
public class FanSlot extends JOTModel
{

    public Long typeId = -1L; // which type it's part of
    public String name = ""; // name of the slot
    public Integer slotKind = -1; // field, method, constructor
    // qualified type of a field or returntype for method/ctor
    public String returnedType = FanIndexer.UNRESOLVED_TYPE;
    // protection
    public Integer protection = -1; // private, public(default), internal, protected
    // flags / modifiers
    public Boolean isStatic = false;
    public Boolean isVirtual = false;
    public Boolean isAbstract = false;
    public Boolean isConst = false;
    public Boolean isNative = false;
    public Boolean isOverride = false;

    // Those two are not real attributes (syntaxic sugar)
    // Maybe store privateSetter instead -> any use ??
    //public Boolean isOnce = false;
    //public Boolean isReadonly = false;
    @Override
    protected void customize(JOTModelMapping mapping)
    {
        mapping.defineFieldSize("name", 80);
        mapping.defineFieldSize("returnedType", 255);
    }

    public void setReturnedType(String type)
    {
        returnedType = type;
    }

    public String getReturnedType()
    {
        return returnedType;
    }

    public boolean isAbstract()
    {
        return isAbstract;
    }

    public void setIsAbstract(boolean isAbstract)
    {
        this.isAbstract = isAbstract;
    }

    public boolean isNative()
    {
        return isNative;
    }

    public void setIsNative(boolean isNative)
    {
        this.isNative = isNative;
    }

    public boolean isOverride()
    {
        return isOverride;
    }

    public void setIsOverride(boolean isOverride)
    {
        this.isOverride = isOverride;
    }

    public boolean isStatic()
    {
        return isStatic;
    }

    public void setIsStatic(boolean isStatic)
    {
        this.isStatic = isStatic;
    }

    public boolean isVirtual()
    {
        return isVirtual;
    }

    public void setIsVirtual(boolean isVirtual)
    {
        this.isVirtual = isVirtual;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getProtection()
    {
        return protection;
    }

    public void setProtection(int protection)
    {
        this.protection = protection;
    }

    public int getSlotKind()
    {
        return slotKind;
    }

    public void setSlotKind(int slotKind)
    {
        this.slotKind = slotKind;
    }

    public Long getTypeId()
    {
        return typeId;
    }

    public void setTypeId(Long typeId)
    {
        this.typeId = typeId;
    }

    public Boolean isConst()
    {
        return isConst;
    }

    public void setIsConst(Boolean isConst)
    {
        this.isConst = isConst;
    }

    @SuppressWarnings("unchecked")
    public static Vector<FanSlot> findAllForType(long type)
    {
        try
        {
            JOTSQLCondition cond = new JOTSQLCondition("typeId", JOTSQLCondition.IS_EQUAL, type);
            return (Vector<FanSlot>) JOTQueryBuilder.selectQuery(null, FanSlot.class).where(cond).find().getAllResults();
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        //return null;
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
        try
        {
            FanType type = FanType.findByQualifiedName(qualifiedType);
            if (type != null)
            {
                JOTSQLCondition cond = new JOTSQLCondition("typeId", JOTSQLCondition.IS_EQUAL, type.getId());
                JOTSQLCondition cond2 = new JOTSQLCondition("name", JOTSQLCondition.IS_EQUAL, slotName);
                return (FanSlot) JOTQueryBuilder.selectQuery(null, FanSlot.class).where(cond).where(cond2).findOne();
            }
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void delete(JOTTransaction trans) throws Exception
    {
        Vector<FanMethodParam> params = getAllParameters();
        for (FanMethodParam param : params)
        {
            param.delete(trans);
        }
        super.delete(trans);
    }

    public boolean isCtor()
    {
        return slotKind == VarKind.CTOR.value();
    }

    public boolean isMethod()
    {
        return slotKind == VarKind.METHOD.value();
    }

    public boolean isField()
    {
        return slotKind == VarKind.FIELD.value();
    }

    public boolean isPrivate()
    {
        return protection == ModifEnum.PRIVATE.value();
    }

    public boolean isPublic()
    {
        return protection == ModifEnum.PUBLIC.value();
    }

    public boolean isProtected()
    {
        return protection == ModifEnum.PROTECTED.value();
    }

    public boolean isInternal()
    {
        return protection == ModifEnum.INTERNAL.value();
    }

    @Override
    public void save(JOTTransaction transaction) throws Exception
    {
        super.save(transaction);
    }

    public static List<FanSlot> getAllSlotsForType(String fanType, Boolean includeImpliedTypes, FanParserTask task)
    {
        List<String> types = new ArrayList<String>();
        return getAllSlotsForType(fanType, types, includeImpliedTypes, task);
    }

    /**
     * Recursive
     * Get all slots, including inheritance
     * @param dbType
     * @param cache : optional cache
     * @return
     */
    public static List<FanSlot> getAllSlotsForType(String fanType, List<String> doneTypes, boolean includeImpliedTypes, FanParserTask task)
    {
        if (task != null && task.getTypeSlotCache().containsKey(fanType))
        {
            return task.getTypeSlotCache().get(fanType);
        }

        // If a type was already done in this recursion, do not do again, also avoid potential cyclic dependencies etc...
        if (doneTypes.contains(fanType))
        {
            return new ArrayList<FanSlot>();
        }

        doneTypes.add(fanType);
        FanType dbType = null;
        if (task != null)
        {
            dbType = task.findCachedQualifiedType(fanType);
        } else
        {
            dbType = FanType.findByQualifiedName(fanType);
        }
        if (dbType == null)
        {
            if (task != null)
            {
                task.getTypeSlotCache().put(fanType, new Vector<FanSlot>(0));
            }
            return new Vector<FanSlot>(0);
        }
        Vector<FanSlot> slots = FanSlot.findAllForType(dbType.getId());

        Vector<FanTypeInheritance> inhs = FanTypeInheritance.findAllForMainType(null, fanType);
        // get inherited slots
        for (FanTypeInheritance inh : inhs)
        {
            String typeName = inh.getInheritedType();
            // add slots that are not already in
            List<FanSlot> subSlots = getAllSlotsForType(typeName, doneTypes, includeImpliedTypes, task);
            for (FanSlot s : subSlots)
            {
                boolean skip = false;
                for (FanSlot slot : slots)
                {
                    if (slot.name.equals(s.name))
                    {
                        skip = true;
                        break;
                    }
                }
                if (!skip)
                {
                    slots.add(s);
                }
            }
        }
        if (includeImpliedTypes)
        {
            // Add implicit super types
            if (dbType.isMixin() && !doneTypes.contains("sys::Mixin"))
            {
                slots.addAll(getAllSlotsForType("sys::Mixin", false, task));
            }
            // for enum, add implicit enum (this will add Obj as well)
            if (dbType.isEnum() && !doneTypes.contains("sys::Enum"))
            {
                slots.addAll(getAllSlotsForType("sys::Enum", false, task));
            }
            // and everybody get the Obj slots. (Todo: mixins too? -> apparently yes)
            if (!doneTypes.contains("sys::Obj"))
            {
                slots.addAll(getAllSlotsForType("sys::Obj", false, task));
            }
        }
        if (task != null)
        {
            task.getTypeSlotCache().put(fanType, slots);
        }
        return slots;
    }

    @SuppressWarnings("unchecked")
    public Vector<FanMethodParam> getAllParameters()
    {
        try
        {
            JOTSQLCondition cond = new JOTSQLCondition("slotId", JOTSQLCondition.IS_EQUAL, id);
            return (Vector<FanMethodParam>) JOTQueryBuilder.selectQuery(null, FanMethodParam.class).where(cond).orderBy("PARAM_INDEX").find().getAllResults();
        } catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString()
    {
        return "FanSlot: " + id + " : " + getName() + "(" + getReturnedType() + ")";
    }
}
