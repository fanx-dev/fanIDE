/*
 * Thibaut Colar Jan 8, 2010
 */

package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.parboiled.AstNode;

/**
 *
 * @author thibautc
 */
public class FanResolvedMapType extends FanResolvedType
{
	private final FanResolvedType keyType;
	private final FanResolvedType valType;

	public FanResolvedMapType(AstNode scopeNode, FanResolvedType keyType, FanResolvedType valType)
	{
		super(scopeNode, "sys::Map", scopeNode.getRoot().getParserTask().findCachedQualifiedType("sys::Map"));
		this.keyType = keyType;
		this.valType = valType;
	}

	public FanResolvedType getKeyType()
	{
		return keyType;
	}

	public FanResolvedType getValType()
	{
		return valType;
	}

	@Override
	public String toTypeSig(boolean fullyQualified)
	{
		return "["+keyType.toTypeSig(fullyQualified)+" : "+valType.toTypeSig(fullyQualified)+"]"+(isNullable()?"?":"");
	}

}
