/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.HashSet;
import java.util.List;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.indexer.FanIndexer;
import net.colar.netbeans.fan.namespace.FanMethodParam;
import net.colar.netbeans.fan.namespace.FanSlot;
import net.colar.netbeans.fan.namespace.Namespace;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanLocalScopeVar;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;

/**
 * Propose a variable
 * @author thibautc
 */
public class FanVarProposal extends FanCompletionProposal
{

	private final FanAstScopeVarBase var;
	String html = "";
	String prefix = "";
	String rHtml = "";

	public FanVarProposal(FanAstScopeVarBase var, int anchor)
	{
		this.var = var;
		this.name = var.getName();
		html = name;
		prefix=name;
		this.anchor = anchor;
		this.kind = ElementKind.VARIABLE;
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(null);
		element = handle;
		this.modifiers = new HashSet<Modifier>();
		if (var.hasModifier(FanAstScopeVarBase.ModifEnum.PRIVATE))
		{
			modifiers.add(Modifier.PRIVATE);
		} else if (var.hasModifier(FanAstScopeVarBase.ModifEnum.PROTECTED) || var.hasModifier(FanAstScopeVarBase.ModifEnum.INTERNAL))
		{
			modifiers.add(Modifier.PROTECTED);
		} else if (var.hasModifier(FanAstScopeVarBase.ModifEnum.PUBLIC))
		{
			modifiers.add(Modifier.PUBLIC);
		}
		if (var.hasModifier(FanAstScopeVarBase.ModifEnum.STATIC))
		{
			modifiers.add(Modifier.STATIC);
		}

		if (var instanceof FanLocalScopeVar)
		{
			FanLocalScopeVar local = (FanLocalScopeVar) var;
			FanSlot slot = local.getSlot();
			//this.modifiers = new HashSet<Modifier>();
			if (slot == null)
			{
			} else if (slot.isField())
			{
				this.kind = ElementKind.FIELD;
				if (slot.isConst())
				{
					this.kind = ElementKind.CONSTANT;
				}
				html = name;
				prefix = name;
				rHtml += Namespace.getShortName(slot.getReturnedType());
				handle.setDoc(FanIndexer.getSlotDoc(slot));
				if (slot.isPrivate())
				{
					modifiers.add(Modifier.PRIVATE);
				} else if (slot.isProtected() || slot.isInternal())
				{
					modifiers.add(Modifier.PROTECTED);
				} else if (slot.isPublic())
				{
					modifiers.add(Modifier.PUBLIC);
				}
				if (slot.isStatic())
				{
					modifiers.add(Modifier.STATIC);
				}

			} else if (slot.isMethod() || slot.isCtor())
			{
				this.kind = ElementKind.METHOD;
				if (slot.isCtor())
				{
					this.kind = ElementKind.CONSTRUCTOR;
				}
				String args = "";
				html = name + "(";
				prefix = name + "(";
				rHtml = Namespace.getShortName(slot.getReturnedType());
				if (rHtml.equals("sys::Void"))
				{
					rHtml = "";
				}
				List<FanMethodParam> params = slot.getAllParameters();
				for (FanMethodParam p : params)
				{
					if (args.length() > 0)
					{
						args += " ,";
					}
					String nm = p.getName();
					if (p.hasDefault())
					{
						nm = "<font color='#662222'><i>" + p.getName() + "</i></font>";
					} else
					{
						nm = "<font color='#AA2222'>" + p.getName() + "</font>";
						// only list non-defaulted parameters by default
						if (!prefix.endsWith("("))
						{
							prefix += ", ";
						}
						prefix += p.getName();
					}
					String typeName = Namespace.getShortName(p.getQualifiedType());
					args += typeName + " " + nm;
				}

				// remove optional parenthesis when no parameters
				if (prefix.endsWith("("))
				{
					prefix = prefix.substring(0, prefix.length() - 1);
				} else
				{
					prefix += ")";
				}
				html += args + ")";
				handle.setDoc(FanIndexer.getSlotDoc(slot));
				if (slot.isPrivate())
				{
					modifiers.add(Modifier.PRIVATE);
				} else if (slot.isProtected() || slot.isInternal())
				{
					modifiers.add(Modifier.PROTECTED);
				} else if (slot.isPublic())
				{
					modifiers.add(Modifier.PUBLIC);
				}
				if (slot.isStatic())
				{
					modifiers.add(Modifier.STATIC);
				}

			} else
			{
				FanUtilities.GENERIC_LOGGER.error("Unknown Slot type: " + slot);
			}
			element = handle;

		}
	}

	@Override
	public String getInsertPrefix()
	{
		return prefix;
	}

	@Override
	public String getRhsHtml(HtmlFormatter formater)
	{
		return rHtml;
	}

	@Override
	public String getLhsHtml(HtmlFormatter formater)
	{
		return html;
	}
}
