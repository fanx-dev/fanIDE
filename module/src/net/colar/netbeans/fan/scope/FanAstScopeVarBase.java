/*
 * Thibaut Colar Dec 3, 2009
 */
package net.colar.netbeans.fan.scope;

import java.util.ArrayList;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 * Base class for scope vars (Fields, methods, local defs etc...)
 * @author thibautc
 */
public abstract class FanAstScopeVarBase
{

	protected String name;
	// The type of the field / or returned type for a method
	protected FanResolvedType type = FanResolvedType.makeUnresolved(null);
	protected ArrayList<FanAstScopeVarBase.ModifEnum> modifiers = new ArrayList<FanAstScopeVarBase.ModifEnum>();
	protected AstNode node;
	protected VarKind kind;
        //protected int documentId;
        //protected int documentOffset;

	public enum VarKind
	{
		IMPORT(1), IMPORT_JAVA(2),
		TYPE_CLASS(11), TYPE_MIXIN(12), TYPE_ENUM(13), TYPE_FACET(14), // fantom types
		TYPE_JAVA_CLASS(21), TYPE_JAVA_INTERFACE(22), TYPE_JAVA_ENUM(23), TYPE_JAVA_ANNOTATION(24), // fantom types
		FIELD(31), METHOD(32), CTOR(33), //slots
		LOCAL(41), //local def
		IMPLIED(51), INHERITED(55); // this, it etc...}

		public static VarKind makeFromVal(int val)
		{
			for(VarKind vk : values())
			{
				if(vk.value() == val)
					return vk;
			}
			throw new RuntimeException("Invalid Value for Varkind: "+val);
		}
		
		private int val;

		private VarKind(int i)
		{
			val = i;
		}

		public int value()
		{
			return val;
		}

                public boolean isLocal()
                {
                    return ! (
                                val == VarKind.IMPLIED.value() ||
                                val == VarKind.IMPORT.value() ||
                                val == VarKind.IMPORT_JAVA.value() ||
                                val==VarKind.INHERITED.value()
                            );
                }
	}

	// Modifiers
	public enum ModifEnum
	{

		PRIVATE(1), PROTECTED(2), INTERNAL(3), PUBLIC(4), STATIC(5), CONST(6),
		ABSTRACT(7), NATIVE(8), OVERRIDE(9), VIRTUAL(10), READONLY(11), ONCE(12),
		FINAL(13);
		int val;

		ModifEnum(int i)
		{
			val = i;
		}

		public int value()
		{
			return val;
		}
	}

	public FanAstScopeVarBase(AstNode node, String name)
	{
		this.node = node;
		this.name=name;
	}

	public String getName()
	{
		return name;
	}

	public AstNode getNode()
	{
		return node;
	}

	public ArrayList<FanAstScopeVarBase.ModifEnum> getModifiers()
	{
		return modifiers;
	}

	public FanResolvedType getType()
	{
		return type;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder(getClass().getSimpleName()).append(" :").append(name).append(" -> ").append(type==null?"null":type.toString()).append(" [");
		for (FanAstScopeVarBase.ModifEnum m : modifiers)
		{
			sb = sb.append(m.toString()).append(", ");
		}
		return sb.append("]").toString();
	}

	/**
	 * Read a modifier string and return enum type
	 * @param m
	 * @return
	 */
	public static ModifEnum parseModifier(String m)
	{
		if (m.toLowerCase().equalsIgnoreCase("private"))
		{
			return ModifEnum.PRIVATE;
		} else if (m.toLowerCase().equalsIgnoreCase("public"))
		{
			return ModifEnum.PUBLIC;
		} else if (m.toLowerCase().equalsIgnoreCase("protected"))
		{
			return ModifEnum.PROTECTED;
		} else if (m.toLowerCase().equalsIgnoreCase("internal"))
		{
			return ModifEnum.INTERNAL;
		} else if (m.toLowerCase().equalsIgnoreCase("const"))
		{
			return ModifEnum.CONST;
		} else if (m.toLowerCase().equalsIgnoreCase("static"))
		{
			return ModifEnum.STATIC;
		} else if (m.toLowerCase().equalsIgnoreCase("once"))
		{
			return ModifEnum.ONCE;
		} else if (m.toLowerCase().equalsIgnoreCase("abstract"))
		{
			return ModifEnum.ABSTRACT;
		} else if (m.toLowerCase().equalsIgnoreCase("native"))
		{
			return ModifEnum.NATIVE;
		} else if (m.toLowerCase().equalsIgnoreCase("override"))
		{
			return ModifEnum.OVERRIDE;
		} else if (m.toLowerCase().equalsIgnoreCase("readonly"))
		{
			return ModifEnum.READONLY;
		} else if (m.toLowerCase().equalsIgnoreCase("virtual"))
		{
			return ModifEnum.VIRTUAL;
		} else if (m.toLowerCase().equalsIgnoreCase("final"))
		{
			return ModifEnum.FINAL;
		} else
		{
			FanUtilities.GENERIC_LOGGER.info("Unrecognized modifier: " + m);
			//throw new RuntimeException();
		}
		return null;
	}

	public boolean hasModifier(ModifEnum modifier)
	{
		return modifiers.contains(modifier);
	}

	public ModifEnum getProtection()
	{
		if (hasModifier(ModifEnum.PRIVATE))
		{
			return ModifEnum.PRIVATE;
		}
		if (hasModifier(ModifEnum.PROTECTED))
		{
			return ModifEnum.PROTECTED;
		}
		if (hasModifier(ModifEnum.INTERNAL))
		{
			return ModifEnum.INTERNAL;
		}
		// default is public
		return ModifEnum.PUBLIC;
	}

	/**
	 * Add or or multiple modifiers (Space separated);
	 * @param modifs
	 */
	public void addModifiers(String modifs)
	{
                String[] mStrs = modifs.split(" ");
                for (String mStr : mStrs)
                {
                        FanAstScopeVarBase.ModifEnum modif = parseModifier(mStr.trim());
                        if (modif != null)
                        {
                                modifiers.add(modif);
                        }
                }
	}

	public VarKind getKind()
	{
		return kind;
	}

	
}
