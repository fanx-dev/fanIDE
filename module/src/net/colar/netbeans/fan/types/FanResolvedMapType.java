/*
 * Thibaut Colar Jan 8, 2010
 */
package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.namespace.Namespace;
import net.colar.netbeans.fan.parser.parboiled.AstNode;

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
		super(scopeNode, "sys::Map", Namespace.get().findByQualifiedName("sys::Map"));
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
		return "[" + keyType.toTypeSig(fullyQualified) + ":" + valType.toTypeSig(fullyQualified) + "]" + (isNullable() ? "?" : "");
	}

	@Override
	public FanResolvedType parameterize(FanResolvedType baseType, AstNode errNode)
	{
		FanResolvedType t = new FanResolvedMapType(getScopeNode(),
			keyType.parameterize(baseType, errNode),
			valType.parameterize(baseType, errNode));
		// Could be something like V?
		if (this.isNullable() != t.isNullable())
		{
			t = (FanResolvedMapType) t.asNullableContext(this.isNullable());
		}
		return t;

	}
}
