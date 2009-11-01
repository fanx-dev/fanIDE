/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.antlr.LexerUtils;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;
import org.netbeans.modules.csl.api.ColoringAttributes;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.SemanticAnalyzer;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;

/**
 * The semantic Analyzer looks at the structure(AST tree),
 * and uses this to highlight source items,
 * display semantic errors and so on.
 * @author thibautc
 */
public class FanSemanticAnalyzer extends SemanticAnalyzer
{

	private volatile boolean cancelled = false;
	private Map<OffsetRange, Set<ColoringAttributes>> highlights = null;
	private static final Pattern INTERPOLATION = Pattern.compile("[^\\\\]\\$\\{?[a-zA-Z0-9\\.]*\\}?");

	@Override
	public Map getHighlights()
	{
		return highlights;
	}

	@Override
	public void run(Result result, SchedulerEvent event)
	{
		FanParserResult res = (FanParserResult) result;
		Map<OffsetRange, Set<ColoringAttributes>> newHighlights = new HashMap();
		// If there where parsing error, we skip semantic analysis
		if (res.getDiagnostics().isEmpty())
		{
			CommonTree ast = res.getTree();
			System.out.println("AST TREE: " + ast.toStringTree());
			scanTree(res, ast, newHighlights);
			highlights = newHighlights.size() == 0 ? null : newHighlights;
		} else
		{
			//System.out.println("AST TREE HAS ERRORS");
		}
	}

	@Override
	public int getPriority()
	{
		return 0;
	}

	@Override
	public Class<? extends Scheduler> getSchedulerClass()
	{
		return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
	}

	@Override
	public void cancel()
	{
		this.cancelled = true;
	}

	/**
	 * Run though AST tree and highlight relevant items
	 * @param ast
	 * @param newHighlights
	 */
	private void scanTree(FanParserResult result, CommonTree node, Map<OffsetRange, Set<ColoringAttributes>> newHighlights)
	{
		// It seems that even parsing is good again, the cancel flag stays ON
		// this prevent parsing to restart after then was an error
		if (node != null /*&& !cancelled*/)
		{
			// DEBUGGING - inneficient
			String par = "";
			Tree parNode=node;
			while((parNode=parNode.getParent()) != null)
			{
				par += "  ";// nesting level
			}
			System.out.println("Node: " + par + node.getText());
			
			switch (node.getType())
			{
				case FanParser.AST_STR:
					addInterpolationHighlights(result, newHighlights, node);
					break;
				case FanParser.AST_CLASS:
				case FanParser.AST_ENUM:
				case FanParser.AST_MIXIN:
					addIdToHighlights(result, newHighlights, node, ColoringAttributes.CLASS_SET);
					break;
				case FanParser.AST_CONSTRUCTOR:
					addIdToHighlights(result, newHighlights, node, ColoringAttributes.CONSTRUCTOR_SET);
					break;
				case FanParser.AST_METHOD:
					addIdToHighlights(result, newHighlights, node, ColoringAttributes.METHOD_SET);
					break;
				case FanParser.AST_FIELD: // global field
					addIdToHighlights(result, newHighlights, node, ColoringAttributes.GLOBAL_SET);
					break;
				// static field ?
				case FanParser.AST_PARAMS:
				case FanParser.AST_CONSTRUCTOR_CHAIN:
					addToHighlights(result, newHighlights, node, ColoringAttributes.PARAMETER_SET);
					break;
				//case FanParser.AST_CLASS:
				//    newHighlights.put(range, ColoringAttributes.UNUSED_SET);
			}
			// recurse into subnodes
			for (int i = 0; i < node.getChildCount(); i++)
			{
				CommonTree subNode = (CommonTree) node.getChild(i);
				scanTree(result, subNode, newHighlights);
			}
		}
		else
		{
			System.out.println("Node: "+node+" Cancelled:"+cancelled);
		}
	}

	private void addIdToHighlights(FanParserResult result, Map<OffsetRange, Set<ColoringAttributes>> newHighlights, CommonTree node, EnumSet<ColoringAttributes> colorAttributes)
	{
		// We can't mess the enumset, so work of a copy (slower though)
		Set<ColoringAttributes> newAttributes = EnumSet.copyOf(colorAttributes);

		CommonTree idNode = (CommonTree) node.getFirstChildWithType(FanParser.AST_ID);
		if (hasModifier(node, "static"))
		{
			newAttributes.add(ColoringAttributes.STATIC);
		} else if (hasModifier(node, "override"))
		{
			newAttributes.add(ColoringAttributes.CUSTOM1);
		}

		addToHighlights(result, newHighlights, idNode, newAttributes);
	}

	private void addToHighlights(FanParserResult result, Map<OffsetRange, Set<ColoringAttributes>> newHighlights, CommonTree node, Set<ColoringAttributes> colorAttributes)
	{
		if (node != null && !node.isNil() && node.getChildCount() > 0)
		{
			OffsetRange range = LexerUtils.getContentNodeRange((FanParserResult) result, node);
			if (range != null)
			{
				newHighlights.put(range, colorAttributes);
			}
		}

	}

	private static boolean hasModifier(CommonTree node, String modifier)
	{
		if (node != null && !node.isNil())
		{
			for (int i = 0; i != node.getChildCount(); i++)
			{
				Tree subNode = node.getChild(i);
				if (subNode.getType() == FanParser.AST_MODIFIER && subNode.getChildCount() > 0)
				{
					if (subNode.getChild(0).getText().equals(modifier))
					{
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Highlight interpolated variables in Strings
	 */
	private void addInterpolationHighlights(FanParserResult result, Map<OffsetRange, Set<ColoringAttributes>> newHighlights, CommonTree node)
	{
		//System.out.println(">interpolation");
		if (node.getChildCount() == 0)
		{
			return; // shouldn't happen but being safe
		}
		CommonTree textNode = (CommonTree) node.getChild(0);
		OffsetRange strRange = LexerUtils.getContentNodeRange((FanParserResult) result, node);
		String str = textNode.getText();
		//System.out.println("interpolation : " + str);
		Matcher matcher = INTERPOLATION.matcher(str);
		while (matcher.find())
		{
			int start = strRange.getStart() + matcher.start();
			int end = strRange.getStart() + matcher.end();
			OffsetRange range = new OffsetRange(start, end);
			newHighlights.put(range, ColoringAttributes.CUSTOM2_SET);
			//System.out.println("interpolation added : " + start + "-" + end);
		}
		//System.out.println("<interpolation");
	}
}
