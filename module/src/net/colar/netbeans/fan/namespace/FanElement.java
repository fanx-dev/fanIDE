package net.colar.netbeans.fan.namespace;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chunquedong
 */
public abstract class FanElement {
    public int flags;
    
    public boolean hasFlag(int mask) {
        return (flags & mask) != 0;
    }
    
    public void setFlag(int mask, boolean mark) {
        if (mark) flags |= mask;
        else flags &= ~mask;
    }
    
    public boolean isPrivate()
    {
        return (flags & FanConst.Private) != 0;
    }

    public boolean isPublic()
    {
        return (flags & FanConst.Public) != 0;
    }

    public boolean isProtected()
    {
        return (flags & FanConst.Protected) != 0;
    }

    public boolean isInternal()
    {
        return (flags & FanConst.Internal) != 0;
    }

    
    public boolean isAbstract()
    {
        return (flags & FanConst.Abstract) != 0;
    }

    public void setIsAbstract(boolean isAbstract)
    {
        setFlag(FanConst.Abstract, isAbstract);
    }

    
    public boolean isNative()
    {
        return (flags & FanConst.Native) != 0;
    }

    public void setIsNative(boolean isNative)
    {
        setFlag(FanConst.Native, isNative);
    }

    
    public Boolean isConst()
    {
        return (flags & FanConst.Const) != 0;
    }

    public void setIsConst(Boolean isConst)
    {
        setFlag(FanConst.Const, isConst);
    }

    
    public Boolean isFinal() {
        return (flags & FanConst.Final) != 0;
    }

    public void setIsFinal(Boolean isFinal) {
        setFlag(FanConst.Final, isFinal);
    }
    
    
    public boolean isOverride()
    {
        return (flags & FanConst.Override) != 0;
    }

    public void setIsOverride(boolean isOverride)
    {
        setFlag(FanConst.Override, isOverride);
    }

    public boolean isStatic()
    {
        return (flags & FanConst.Static) != 0;
    }

    public void setIsStatic(boolean isStatic)
    {
        setFlag(FanConst.Static, isStatic);
    }

    public boolean isVirtual()
    {
        return (flags & FanConst.Virtual) != 0;
    }

    public void setIsVirtual(boolean isVirtual)
    {
        setFlag(FanConst.Virtual, isVirtual);
    }
}
