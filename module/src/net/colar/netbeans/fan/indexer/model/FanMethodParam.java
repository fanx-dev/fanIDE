/*
 * Thibaut Colar Dec 22, 2009
 */

package net.colar.netbeans.fan.indexer.model;

import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;

/**
 * DB model for a method/constructor parameters
 * @author thibautc
 */
public class FanMethodParam extends JOTModel
{

	public Long slotId = -1L;
	public String name = "";
	public String qualifiedType = ""; // qualified type of the parameter
	public boolean hasDefault = false;
	public int paramIndex = 0;

	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.defineFieldSize("qualifiedType", 255);
		mapping.defineFieldSize("name", 80);
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

	public long getSlotId()
	{
		return slotId;
	}

	public void setSlotId(long slotId)
	{
		this.slotId = slotId;
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
