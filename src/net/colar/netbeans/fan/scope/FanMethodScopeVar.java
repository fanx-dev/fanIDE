/*
 * Thibaut Colar Mar 5, 2010
 */

package net.colar.netbeans.fan.scope;

import java.util.Hashtable;
import java.util.List;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanMethodScopeVar extends FanFieldScopeVar
{
	boolean isCtor = false;
	Hashtable<String, FanResolvedType> parameters = new Hashtable<String, FanResolvedType>();

	public FanMethodScopeVar(AstNode node, String name, boolean isCtor)
	{
		// Same as a field basically.
		super(node, name);

		this.isCtor = isCtor;

		// parameters
		List<AstNode> params = FanLexAstUtils.getChildren(node, new NodeKindPredicate(AstKind.AST_PARAM));
		for (AstNode param : params)
		{
			//System.out.println("Param Node: " + param.toStringTree());
			AstNode id = FanLexAstUtils.getFirstChild(param, new NodeKindPredicate(AstKind.AST_ID));
			AstNode typeNode = FanLexAstUtils.getFirstChild(param, new NodeKindPredicate(AstKind.AST_TYPE));
			// shouldn;t be null, but we dont want to risk parser exceptions
			if (typeNode != null && id != null)
			{
				String pName = id.getNodeText(true);
				FanResolvedType pType = FanResolvedType.makeFromTypeSigWithWarning(typeNode);
				if (!parameters.containsKey(pName))
				{
					parameters.put(pName, pType);
				} else
				{
					param.getRoot().getParserTask().addError("Duplicated parameter name", id);
				}
			}
		}
	}

	public Hashtable<String, FanResolvedType> getParameters()
	{
		return parameters;
	}

	public boolean isCtor()
	{
		return isCtor;
	}

}