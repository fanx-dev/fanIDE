/*
 * Thibaut Colar Apr 2, 2010
 */
package net.colar.netbeans.fan.scope;

import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanScopeMethodParam
{

	private final AstNode defaultValNode;
	private FanResolvedType type;
	private final int order; // order of the parameter (first, second ...)

	public FanScopeMethodParam(FanResolvedType type, AstNode defaultValNode, int order)
	{
		this.defaultValNode = defaultValNode;
		this.type = type;
		this.order=order;
	}

	public AstNode getDefaultValNode()
	{
		return defaultValNode;
	}

	public FanResolvedType getType()
	{
		return type;
	}

	public boolean hasDefaultValue()
	{
		return defaultValNode != null;
	}

	public int getOrder()
	{
		return order;
	}
	
}
