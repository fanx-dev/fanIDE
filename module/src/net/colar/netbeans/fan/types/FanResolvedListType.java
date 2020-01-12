/*
 * Thibaut Colar Jan 8, 2010
 */

package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.parboiled.AstNode;

/**
 *
 * @author thibautc
 */
public class FanResolvedListType extends FanResolvedType
{
	private final FanResolvedType itemType;

	public FanResolvedListType(AstNode scopeNode, FanResolvedType itemType)
	{
		super(scopeNode, "sys::List", scopeNode.getRoot().getParserTask().findCachedQualifiedType("sys::List"));
		if(itemType==null)
			throw new RuntimeException("Null List item type");
		this.itemType = itemType;
	}

	public FanResolvedType getItemType()
	{
		return itemType;
	}

	@Override
	public String toTypeSig(boolean fullyQualified)
	{
		return itemType.toTypeSig(fullyQualified)+"[]"+(isNullable()?"?":"");
	}

	@Override
	public FanResolvedType parameterize(FanResolvedType baseType, AstNode errNode)
	{
		FanResolvedType t = new FanResolvedListType(getScopeNode(),
				itemType.parameterize(baseType, errNode));
		if (this.isNullable() != t.isNullable())
		{
			t = t.asNullableContext(this.isNullable());
		}
		return t;
	}
}
