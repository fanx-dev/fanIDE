/*
 * Thibaut Colar Dec 22, 2009
 */

package net.colar.netbeans.fan.namespace;

/**
 * DB model for a method/constructor parameters
 * @author thibautc
 */
public class FanMethodParam
{
    private String name = "";
    private String qualifiedType = ""; // qualified type of the parameter
    
    private boolean hasDefault = false;
    private int paramIndex = 0;
    
    public FanMethodParam(String name, String qualifiedType) {
        this.name = name;
        this.qualifiedType = qualifiedType;
    }

    public String getName()
    {
            return name;
    }

    public void setName(String name)
    {
            this.name = name;
    }

    public String getQualifiedType()
    {
            return qualifiedType;
    }

    public void setQualifiedType(String qualifiedType)
    {
            this.qualifiedType = qualifiedType;
    }

    public void setHasDefault(boolean b)
    {
            hasDefault = b;
    }

    public boolean hasDefault()
    {
            return hasDefault;
    }

    public void setParamIndex(int paramIndex)
    {
            this.paramIndex=paramIndex;
    }

    public int getParamIndex()
    {
            return paramIndex;
    }

    public boolean isFunctionType()
    {
        return getQualifiedType().startsWith("|") && getQualifiedType().startsWith("|");
    }

}
