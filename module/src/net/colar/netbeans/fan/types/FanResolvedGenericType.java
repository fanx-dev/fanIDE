/*
 * Thibaut Colar Mar 31, 2010
 */
package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.namespace.FanType;
import java.util.Vector;
import net.colar.netbeans.fan.namespace.Namespace;
import net.colar.netbeans.fan.parser.parboiled.AstNode;

/**
 *
 * @author thibautc
 */
public class FanResolvedGenericType extends FanResolvedType
{

	public FanResolvedGenericType(AstNode node, String enteredType)
	{
		super(node, enteredType, FanType.makeDummy());
	}

	/**
	 * Get the physical type of the generic: ie: L is a List
	 * @return
	 */
	public FanResolvedType getPhysicalType()
	{
		FanResolvedType objType = new FanResolvedType(getScopeNode(), "sys::Obj", Namespace.get().findByQualifiedName("sys::Obj"));
		if (getShortAsTypedType().equals("L"))
		{ // List
			return new FanResolvedListType(getScopeNode(), objType);
		} else if (getShortAsTypedType().equals("M"))
		{ // Map
			return new FanResolvedMapType(getScopeNode(), objType, objType);
		} else if (getShortAsTypedType().equals("R"))
		{ // Function
			return new FanResolvedFuncType(getScopeNode(), new Vector<FanResolvedType>(), objType);
		}
		//all others: V, K, A-H are just objects
		return objType;
	}

	@Override
	public FanResolvedType getParentType()
	{
		return getPhysicalType().getParentType();
	}
}
