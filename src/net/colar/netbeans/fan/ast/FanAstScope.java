/*
 * Thibaut Colar Nov 24, 2009
 */
package net.colar.netbeans.fan.ast;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import org.antlr.runtime.tree.CommonTree;

/**
 * Base object for scope.
 * @author thibautc
 */
public abstract class FanAstScope
{
	// the AST node this scope is for
	private CommonTree astNode = null;
	// parent scope -> If root scope: null
	private FanAstScope parent = null;
	// Lits of defined/named items in this (local) scope
	private Hashtable<String, FanAstScopeVar> scopeVars = new Hashtable<String, FanAstScopeVar>();
	// root scope of the tree - lazy inited
	private FanRootScope root;
	// Node childs
	private List<FanAstScope> children= new ArrayList<FanAstScope>();

	public FanAstScope(FanAstScope parent, CommonTree astNode)
	{
		this.parent = parent;
		this.astNode = astNode;
	}

	public void dump()
	{
		System.out.println("Ast Scope Node: " + toString());
		for (FanAstScopeVar var : scopeVars.values())
		{
			System.out.println("Scope Var: " + var.toString());
		}
	}

	public FanAstScope getParent()
	{
		return parent;
	}

	/**
	 * Return the root node .. lazily cached
	 * @return
	 */
	public FanRootScope getRoot()
	{
		if (root == null)
		{
			synchronized (this)
			{
				FanAstScope current = this;
				while (current.parent != null)
				{
					current = current.getParent();
				}
				root = (FanRootScope) current;
			}
		}
		return root;
	}

	/**
	 * If allowOverride is false and the name is duplicated, it will shiw an error
	 * @param slot
	 * @param allowOverride
	 */
	public void addScopeVar(FanAstScopeVar var, boolean allowOverride)
	{
		String name = var.getName();
		// Can't have duplicated slot name in scope no matter what ?
		// no could be if overriden virtual slot etc..
		FanAstScope scope = this;
		while (scope != null)
		{
			if (scope.hasScopevar(name))
			{
				if (!allowOverride)
				{
					getRoot().addError("Duplicated var name: " + name, var.getNode());
					return;
				}
			}
			scope = scope.getParent();
		}
		//TODO: check inherited(type) vars (slots) using allowOverride
		scopeVars.put(name, var);
	}

	public boolean hasScopevar(String name)
	{
		return scopeVars.containsKey(name);
	}

	public FanAstScopeVar getScopeVar(String name)
	{
		return scopeVars.get(name);
	}

	public CommonTree getAstNode()
	{
		return astNode;
	}

	public List<FanAstScope> getChildren()
	{
		return children;
	}

	public void addChild(FanAstScope child)
	{
		children.add(child);
	}

	FanAstResolvedType resolveVar(String type)
	{
		FanAstScope scope = this;
		do
		{
			if(scope.hasScopevar(type))
				return scope.getScopeVar(type).getType();
			scope=scope.getParent();
		}
		while(scope!=null);
		// Not found
		return FanAstResolvedType.makeUnresolved();
	}
}
