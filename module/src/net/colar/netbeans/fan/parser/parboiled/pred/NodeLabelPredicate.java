/*
 * Thibaut Colar Mar 1, 2010
 */
package net.colar.netbeans.fan.parser.parboiled.pred;

import net.colar.netbeans.fan.parser.parboiled.AstNode;
import org.parboiled.Node;
import org.parboiled.common.Predicate;

/**
 *
 * @author thibautc
 */
public class NodeLabelPredicate<AstKind> implements Predicate<Node<AstNode>>
{

	private final String label;

	public NodeLabelPredicate(String label)
	{
		this.label = label;
	}

	public boolean apply(Node<AstNode> t)
	{
		return t.getLabel().equalsIgnoreCase(label);
	}
}

