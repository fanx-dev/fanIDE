/*
 * Thibaut Colar Mar 1, 2010
 */
package net.colar.netbeans.fan.parser.parboiled.pred;

import net.colar.netbeans.fan.parser.parboiled.AstKind;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import org.parboiled.common.Predicate;

/**
 *
 * @author thibautc
 */
public class NodeKindPredicate implements Predicate<AstNode>
{

	private final AstKind kind;

	@SuppressWarnings("unchecked")
	public NodeKindPredicate(AstKind kind)
	{
		this.kind = kind;
	}

	public boolean apply(AstNode t)
	{
		return t.getKind() == kind;
	}
}

