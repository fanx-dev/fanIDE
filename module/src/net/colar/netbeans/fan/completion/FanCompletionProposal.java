/*
 * Thibaut Colar Aug 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.Set;
import javax.swing.ImageIcon;
import org.netbeans.modules.csl.api.CompletionProposal;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;

/**
 *
 * @author thibautc
 */
public abstract class FanCompletionProposal implements CompletionProposal
{

	protected int anchor;
	protected ElementHandle element;
	protected String name;
	protected Set<Modifier> modifiers;
	protected ElementKind kind;
	protected ImageIcon icon;
	private int prio = 5;

	@Override
	public int getAnchorOffset()
	{
		return anchor;
	}

	@Override
	public ElementHandle getElement()
	{
		return element;
	}

	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * What's actually inserted
	 * @return
	 */
	@Override
	public String getInsertPrefix()
	{
		return getName();
	}

	@Override
	public String getSortText()
	{
		return getName();
	}

	@Override
	public String getLhsHtml(HtmlFormatter formater)
	{
		formater.name(getKind(), true);
		formater.appendText(getName());
		formater.name(getKind(), false);
		return formater.getText();
	}

	@Override
	public String getRhsHtml(HtmlFormatter formater)
	{
		if (element != null)
		{
			String in = element.getIn();
			if (in != null)
			{
				formater.appendText(null);
			}
		}
		return formater.getText();
	}

	@Override
	public ElementKind getKind()
	{
		return kind;
	}

	@Override
	public ImageIcon getIcon()
	{
		return icon;
	}

	@Override
	public Set<Modifier> getModifiers()
	{
		return modifiers;
	}

	@Override
	public boolean isSmart()
	{
		return false; // Yeah it's stupid :)
	}

	@Override
	public int getSortPrioOverride()
	{
		return prio;
	}

	@Override
	public String getCustomInsertTemplate()
	{
		return null;
	}

	public void setSortPrio(int i)
	{
		prio=i;
	}


}
