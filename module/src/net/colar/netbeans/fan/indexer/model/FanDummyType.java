package net.colar.netbeans.fan.indexer.model;

import net.colar.netbeans.fan.indexer.model.FanType;
import net.jot.persistance.JOTTransaction;

/**
 * Dummy type to carry virtual type such as "null"
 * and unknown types.
 * @author tcolar
 */
public class FanDummyType extends FanType
{

	public FanDummyType(String typeString)
	{
		super.id = -2;
		// we need qualifiedName to be filled in for indexing generics
		super.qualifiedName = typeString;
		super.isAbstract = false;
		super.isConst = false;
		super.isFinal = false;
		super.pod = "n/a";
		super.protection = 0;
		super.simpleName = getShortName(typeString);
	}

	@Override
	public void delete() throws Exception
	{
		throw new RuntimeException("Dummy FanType!");
	}

	@Override
	public void delete(JOTTransaction trans) throws Exception
	{
		throw new RuntimeException("Dummy FanType!");
	}

	@Override
	public void save() throws Exception
	{
		throw new RuntimeException("Dummy FanType!");
	}

	@Override
	public void save(JOTTransaction transaction) throws Exception
	{
		throw new RuntimeException("Dummy FanType!");
	}
}
