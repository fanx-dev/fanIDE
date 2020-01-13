/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.types;

import net.colar.netbeans.fan.indexer.model.FanDummyType;
import net.colar.netbeans.fan.parser.parboiled.AstNode;

/**
 * Special type that is marked as resolved (ie no warnings)
 * But is not known (no completion etc..)
 * Typically for dynamic calls for example.
 *
 * Maybe also types that are not supported yet.
 * @author tcolar
 */
public class FanUnknownType extends FanResolvedType
{
	public FanUnknownType(AstNode node, String enteredType)
	{
		super(node, enteredType, new FanDummyType(enteredType), false, true);
	}
}
