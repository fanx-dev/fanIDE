/*
 * Thibaut Colar Mar 22, 2010
 */
package net.colar.netbeans.fan.scope;

import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedGenericType;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanLocalScopeVar extends FanAstScopeVar
{

	private FanSlot slot = null;
	//Hashtable<String, FanResolvedType> parameters = new Hashtable<String, FanResolvedType>();

	private static FanResolvedType getNonGenericType(FanResolvedType type)
	{
		//Loval vars can't be generic
		if (type instanceof FanResolvedGenericType)
		{
			type = ((FanResolvedGenericType) type).getPhysicalType();
		}
		return type;
	}

	/**
	 * Use this constructor for "implied/local" variables
	 * @param node
	 * @param kind
	 * @param name
	 * @param type
	 */
	public FanLocalScopeVar(AstNode node, VarKind kind, String name, FanResolvedType type)
	{
		super(node, kind, name, getNonGenericType(type));
		type = type.asStaticContext(false);
	}

	private static FanResolvedType getSlotType(AstNode node, FanResolvedType baseType, FanSlot slot)
	{
		FanResolvedType type = FanResolvedType.makeFromTypeSig(node, slot.getReturnedType());
		//if(type.isGenericType())
		//	type = type.parameterize(baseType);
		return type;
	}

	public FanLocalScopeVar(AstNode node, FanResolvedType baseType, FanSlot slot, String name)
	{
		super(node, VarKind.makeFromVal(slot.getSlotKind()), name, getSlotType(node, baseType, slot));
		this.slot = slot;

		if (slot.isField())
		{
			this.kind = VarKind.FIELD;
		}
		if (slot.isMethod())
		{
			this.kind = VarKind.METHOD;
		}
		if (slot.isCtor())
		{
			this.kind = VarKind.CTOR;
		}

		if (slot.isAbstract)
		{
			addModifiers("abstract");
		}
		if (slot.isConst)
		{
			addModifiers("const");
		}
		if (slot.isNative)
		{
			addModifiers("native");
		}
		if (slot.isOverride)
		{
			addModifiers("override");
		}
		if (slot.isStatic)
		{
			addModifiers("static");
		}
		if (slot.isVirtual)
		{
			addModifiers("virtual");
		}
		if (slot.isPrivate())
		{
			addModifiers("private");
		}
		if (slot.isInternal())
		{
			addModifiers("internal");
		}
		if (slot.isProtected())
		{
			addModifiers("protected");
		}
		if (slot.isPublic())
		{
			addModifiers("public");
		}

	}

	public FanSlot getSlot()
	{
		return slot;
	}
}
