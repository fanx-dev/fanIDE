/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import net.colar.netbeans.fan.parser.parboiled.AstNode;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 * Class structure item.
 * @author tcolar
 */
public class FanClassStructure extends FanStructureItem
{

	public FanClassStructure(AstNode node, ParserResult result)
	{
		super(node, ElementKind.CLASS, result);
	}
}
