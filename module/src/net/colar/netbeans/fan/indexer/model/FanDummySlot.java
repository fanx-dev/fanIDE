/*
 * Thibaut Colar Apr 9, 2010
 */

package net.colar.netbeans.fan.indexer.model;

import java.util.Vector;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.ModifEnum;
import net.jot.persistance.JOTTransaction;

/**
 *
 * @author thibautc
 */
public class FanDummySlot extends FanSlot
{
	private Vector<FanMethodParam> dummyParams=new Vector<FanMethodParam>();

	public FanDummySlot(String name, String returnType, int slotKind)
	{
		super();
		super.id = -2;
		super.returnedType = returnType;
		super.slotKind = slotKind;
		super.name=name;
		// Default to public
		super.protection=ModifEnum.PUBLIC.value();
	}

	@Override
	public void delete() throws Exception
	{
		throw new RuntimeException("Dummy FanSlot!");
	}

	@Override
	public void delete(JOTTransaction trans) throws Exception
	{
		throw new RuntimeException("Dummy FanSlot!");
	}

	@Override
	public void save() throws Exception
	{
		throw new RuntimeException("Dummy FanSlot!");
	}

	@Override
	public void save(JOTTransaction transaction) throws Exception
	{
		throw new RuntimeException("Dummy FanSlot!");
	}

	@Override
	public Vector<FanMethodParam> getAllParameters()
	{
		return dummyParams;
	}

	public void addDummyParam(FanDummyParam param)
	{
		dummyParams.add(param);
	}
}
