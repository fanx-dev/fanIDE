/*
 * Thibaut Colar Dec 22, 2009
 */
package net.colar.netbeans.fan.indexer.model;

import java.util.Vector;
import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.JOTTransaction;
import net.jot.persistance.builders.JOTQueryBuilder;

/**
 * DB model for a Type inherance
 * @author thibautc
 */
public class FanTypeInheritance extends JOTModel
{

	public String mainType = ""; // fully qualified
	public String inheritedType = ""; // fully qualified

	@Override
	protected void customize(JOTModelMapping mapping)
	{
		mapping.defineFieldSize("inheritedType", 255);
		mapping.defineFieldSize("mainType", 255);
	}

	public String getInheritedType()
	{
		return inheritedType;
	}

	public void setInheritedType(String inheritedType)
	{
		this.inheritedType = inheritedType;
	}

	public String getMainType()
	{
		return mainType;
	}

	public void setMainType(String mainType)
	{
		this.mainType = mainType;
	}

	/**
	 * Find all the types mainType inherits from
	 * @param transaction
	 * @param mainType
	 * @return
	 */
        @SuppressWarnings("unchecked")
	public static Vector<FanTypeInheritance> findAllForMainType(JOTTransaction transaction, String mainType)
	{
		try
		{
			JOTSQLCondition cond = new JOTSQLCondition("mainType", JOTSQLCondition.IS_EQUAL, mainType);
			return (Vector<FanTypeInheritance>) JOTQueryBuilder.selectQuery(transaction, FanTypeInheritance.class).where(cond).find().getAllResults();
		} catch (Exception e)
		{
		}
		return new Vector<FanTypeInheritance>();
	}

}
