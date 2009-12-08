/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.completion;

import fan.sys.Field;
import fan.sys.Method;
import fan.sys.Param;
import fan.sys.Slot;
import java.util.Collections;
import net.colar.netbeans.fan.indexer.FanPodIndexer;
import net.colar.netbeans.fan.structure.FanBasicElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;

/**
 * Completion for slots
 * @author tcolar
 */
public class FanSlotProposal extends FanCompletionProposal
{
//TODO : != icon for static slots
	private final Slot slot;
	private String html="";
	private String rHtml="";
	private String prefix="";

	public FanSlotProposal(Slot slot, int anchor)
	{
		this.kind = ElementKind.OTHER;
		this.name=slot.name();
		this.anchor=anchor;
		this.slot = slot;
		this.modifiers = Collections.EMPTY_SET;
		if (slot.isField())
		{
			this.kind = ElementKind.FIELD;
			html = slot.name();
			prefix=slot.name();
			rHtml += ((Field)slot).of().name();
		} else if(slot.isMethod() || slot.isCtor())
		{
			this.kind = ElementKind.METHOD;
			if(slot.isCtor())
				this.kind=ElementKind.CONSTRUCTOR;
			String args = "";
			Method m = (Method) slot;
			html=m.name()+"(";
			prefix=slot.name()+"(";
			Param[] params = (Param[]) m.params().asArray(Param.class);
			for (Param p : params)
			{
				if (args.length() > 0)
				{
					args += " ,";
				}
				String nm=p.name();
				if(p.hasDefault())
				{
					nm="<font color='#662222'><i>" + p.name()+"</i></font>";
				}
				else
				{
					nm="<font color='#AA2222'>" + p.name()+"</font>";
					// only list non-defaulted parameters by default
					if(!prefix.endsWith("("))
						prefix+=", ";
					prefix+=p.name();
				}
				args += p.type().name() + " " +nm;
			}
			// remove optional parenthesis when no parameters
			if(prefix.endsWith("("))
				prefix=prefix.substring(0,prefix.length() - 1);
			else
				prefix+=")";
			html+=args+")";
			rHtml = m.returns().name();

		}
		FanBasicElementHandle handle = new FanBasicElementHandle(name, kind);
		handle.setDoc(FanPodIndexer.fanDocToHtml(slot.doc()));
		element=handle;
	}

	@Override
	public String getInsertPrefix()
	{
		return prefix;
	}

	/**
	 * left side html
	 * @param formater
	 * @return
	 */
	@Override
	public String getLhsHtml(HtmlFormatter formater)
	{
		return html;
	}

	/**
	 * right side html
	 * @param formater
	 * @return
	 */
	@Override
	public String getRhsHtml(HtmlFormatter formater)
	{
		return rHtml;
	}

}
