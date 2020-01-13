/*
 * Thibaut Colar Mar 5, 2010
 */

package net.colar.netbeans.fan.scope;

import java.util.Hashtable;
import java.util.List;
import net.colar.netbeans.fan.parser.FanParserErrorKey;
import net.colar.netbeans.fan.parser.parboiled.AstKind;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parser.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanMethodScopeVar extends FanFieldScopeVar
{
	boolean isCtor = false;
	Hashtable<String, FanScopeMethodParam> parameters = new Hashtable<String, FanScopeMethodParam>();

        @SuppressWarnings("unchecked")
	public FanMethodScopeVar(AstNode node, String name, boolean isCtor)
	{
		// Same as a field basically.
		super(node, name);
		this.kind = isCtor?VarKind.CTOR:VarKind.METHOD;
		
		this.isCtor = isCtor;

		AstNode block = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_BLOCK));

		// parameters
		List<AstNode> params = FanLexAstUtils.getChildren(node, new NodeKindPredicate(AstKind.AST_PARAM));
		int cpt=0;
		for (AstNode param : params)
		{
			//System.out.println("Param Node: " + param.toStringTree());
			AstNode id = FanLexAstUtils.getFirstChild(param, new NodeKindPredicate(AstKind.AST_ID));
			AstNode typeNode = FanLexAstUtils.getFirstChild(param, new NodeKindPredicate(AstKind.AST_TYPE));
			AstNode exprNode = FanLexAstUtils.getFirstChild(param, new NodeKindPredicate(AstKind.AST_EXPR));
			// shouldn't be null, but we dont want to risk parser exceptions
			if (typeNode != null && id != null)
			{
				String pName = id.getNodeText(true);
				FanResolvedType pType = FanResolvedType.makeFromTypeSigWithWarning(typeNode);
				FanScopeMethodParam mp = new FanScopeMethodParam(pType, exprNode, cpt);
				if (!parameters.containsKey(pName))
				{
					parameters.put(pName, mp);
					// Add the param as a scope variable
					if(block!=null)
						block.addScopeVar(new FanLocalScopeVar(typeNode, VarKind.LOCAL, pName, pType.asStaticContext(false)), false);
					// if no block then it must be an abstract methd, no need to introduce the vars to scope
				} else
				{
					param.getRoot().getParserTask().addError(FanParserErrorKey.DUPLICATED_PARAM, "Duplicated parameter name", id);
				}
			}
			cpt++;
		}
	}

	public Hashtable<String, FanScopeMethodParam> getParameters()
	{
		return parameters;
	}

	public boolean isCtor()
	{
		return isCtor;
	}

}
