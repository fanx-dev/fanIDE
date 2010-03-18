/*
 * Thibaut Colar Dec 9, 2009
 */

package net.colar.netbeans.fan.scope;

import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 * scope variable
 * @author thibautc
 */
public class FanAstScopeVar extends FanAstScopeVarBase
{

	public FanAstScopeVar(AstNode node, VarKind kind, String name, FanResolvedType type)
	{
		super(node, name);
		super.type=type;
		super.kind = kind;
		if(type==null)
		{
			FanUtilities.GENERIC_LOGGER.error(getClass().getName()+" Null type for: "+name);
			super.type = FanResolvedType.makeUnresolved(node);
		}

	}
}
