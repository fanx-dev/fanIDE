/*
 * Thibaut Colar Jan 8, 2010
 */

package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.parboiled.AstNode;

/**
 *
 * @author thibautc
 */
public class FanResolvedListType extends FanResolvedType
{
	FanResolvedType itemType;

	public FanResolvedListType(AstNode scopeNode, FanResolvedType itemType)
	{
		super(scopeNode, "sys::List", FanType.findByQualifiedName("sys::List"));
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
		return itemType.toTypeSig(fullyQualified)+"[]";
	}

}
