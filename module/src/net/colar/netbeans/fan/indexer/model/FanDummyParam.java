/*
 * Thibaut Colar Apr 9, 2010
 */

package net.colar.netbeans.fan.indexer.model;

import net.colar.netbeans.fan.indexer.model.FanMethodParam;
import net.jot.persistance.JOTTransaction;

/**
 *
 * @author thibautc
 */
public class FanDummyParam extends FanMethodParam
{
	public FanDummyParam(long slotId, String name, String qualifiedType, int paramIndex, boolean hasDefault)
	{
		super();
		super.id = -2;
		super.name=name;
		super.paramIndex = paramIndex;
		super.qualifiedType = qualifiedType;
		super.hasDefault = hasDefault;
		super.slotId = slotId;
	}

	@Override
	public void delete() throws Exception
	{
		throw new RuntimeException("Dummy FanDummyParam!");
	}

	@Override
	public void delete(JOTTransaction trans) throws Exception
	{
		throw new RuntimeException("Dummy FanDummyParam!");
	}

	@Override
	public void save() throws Exception
	{
		throw new RuntimeException("Dummy FanDummyParam!");
	}

	@Override
	public void save(JOTTransaction transaction) throws Exception
	{
		throw new RuntimeException("Dummy FanDummyParam!");
	}

}
