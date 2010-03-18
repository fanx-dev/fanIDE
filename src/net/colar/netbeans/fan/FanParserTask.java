/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.io.File;
import java.util.List;
import java.util.Vector;
import javax.swing.text.Document;
import net.colar.netbeans.fan.scope.FanAstScopeVar;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FantomParser;
import net.colar.netbeans.fan.parboiled.FantomParserTokens.TokenName;
import net.colar.netbeans.fan.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.VarKind;
import net.colar.netbeans.fan.scope.FanTypeScopeVar;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.Severity;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.parboiled.Node;
import org.parboiled.Parboiled;
import org.parboiled.RecoveringParseRunner;
import org.parboiled.errors.ErrorUtils;
import org.parboiled.errors.ParseError;
import org.parboiled.support.ParseTreeUtils;
import org.parboiled.support.ParsingResult;

/**
 * Parse a fan file and holds the results
 * parse() parses the file
 * parseScope() adds to the tree scope vraiables etc...
 * @author  tcolar
 */
public class FanParserTask extends ParserResult
{

	List<Error> errors = new Vector<Error>(); // -> use parsingResult.errors ?
	// full path of the source file
	private final FileObject sourceFile;
	// simple name of the source file
	private final String sourceName;
	// pod name
	private final String pod;
	// once parse() is called, will contain the parboiled parsing result
	private ParsingResult<AstNode> parsingResult;
	private AstNode astRoot;

	public FanParserTask(Snapshot snapshot)
	{
		super(snapshot);
		sourceName = snapshot.getSource().getFileObject().getName();
		sourceFile = FileUtil.toFileObject(new File(snapshot.getSource().getFileObject().getPath()));
		pod = FanUtilities.getPodForPath(sourceFile.getPath());
	}

	@Override
	public List<? extends Error> getDiagnostics()
	{
		return errors;
	}

	@Override
	protected void invalidate()
	{
		// what should this do ?
	}

	/**
	 * Return AST tree generated by this parsing
	 * @return
	 */
	public Node getParseNodeTree()
	{
		if (parsingResult != null)
		{
			return parsingResult.parseTreeRoot;
		}
		return null;
	}

	public AstNode getAstTree()
	{
		Node<AstNode> nd = getParseNodeTree();
		return nd == null ? null : nd.getValue();
	}

	/**
	 * Dump AST tree 
	 */
	public void dumpTree()
	{
		FanUtilities.GENERIC_LOGGER.trace("-------------------Start AST Tree dump-----------------------");
		ParseTreeUtils.printNodeTree(parsingResult);
		FanUtilities.GENERIC_LOGGER.trace("-------------------End AST Tree dump-----------------------");
	}

	/**
	 * Shotcut method for getSnapshot().getSource().getDocument(true);
	 * @return
	 */
	public Document getDocument()
	{
		return getSnapshot().getSource().getDocument(true);
	}

	public void addError(String title, Throwable t)
	{
		// "High level error"
		Error error = DefaultError.createDefaultError(title, title, title, null, 0, 0, true, Severity.ERROR);
		errors.add(error);
	}

	/**
	 * The root scope
	 * @return
	 */
	public AstNode getRootScope()
	{
		return astRoot;
	}

	public FileObject getSourceFile()
	{
		return sourceFile;
	}

	/**
	 * Add an error (not the parser errors, but others like semantic etc..)
	 * @param info
	 * @param node
	 */
	public void addError(String info, AstNode node)
	{
		if (node == null)
		{
			return;
		}
		String key = "FanParserTask";
		OffsetRange range = FanLexAstUtils.getNodeRange(node);
		int start = range.getStart();
		int end = range.getEnd();
		//System.out.println("Start: "+start+"End:"+end);
		Error error = DefaultError.createDefaultError(key, info, "Syntax Error", sourceFile, start, end, true, Severity.ERROR);
		errors.add(error);
	}

	/**
	 * Parse the file (using parboiled FantomParser)
	 */
	public void parse()
	{
		FantomParser parser = Parboiled.createParser(FantomParser.class, this);

		try
		{
			parsingResult = RecoveringParseRunner.run(parser.compilationUnit(), getSnapshot().getText().toString());
			// Copy parboiled parse error into a CSL errrors
			for (ParseError err : parsingResult.parseErrors)
			{
				// key, displayName, description, file, start, end, lineError?, severity
				String msg = ErrorUtils.printParseError(err, parsingResult.inputBuffer);
				Error error = DefaultError.createDefaultError(msg, msg, msg,
					sourceFile, err.getErrorLocation().getIndex(), err.getErrorLocation().getIndex() + err.getErrorCharCount(),
					false, Severity.ERROR);
				errors.add(error);
			}
			if (parsingResult.parseTreeRoot != null)
			{
				astRoot = parsingResult.parseTreeRoot.getValue();
			}
		} catch (Exception e)
		{
			addError("Parser error", e);
			e.printStackTrace();
		}
	}

	/**
	 * Call after parsing to add scope variables / type resolution to the AST tree
	 */
	public void parseScope()
	{
		if (astRoot == null)
		{
			return;
		}
		// First run : lookup using statements
		for (AstNode node : astRoot.getChildren())
		{
			switch (node.getKind())
			{
				case AST_INC_USING:
					addError("Incomplete import statement", node);
					break;

				case AST_USING:
					addUsing(node);
					break;

			}
		}

		// Second pass, lookup types and slots
		for (AstNode node : astRoot.getChildren())
		{
			switch (node.getKind())
			{
				case AST_TYPE_DEF:
					String name = FanLexAstUtils.getFirstChildText(node, new NodeKindPredicate(AstKind.AST_ID));
					FanTypeScopeVar var = new FanTypeScopeVar(node, name);
					var.parse();
					AstNode scopeNode = FanLexAstUtils.getScopeNode(node);
					if (scopeNode.getAllScopeVars().containsKey(name))
					{
						addError("Duplicated type name", node);
					} else
					{
						scopeNode.getLocalScopeVars().put(name, var);
					}
					break;
			}
		}
		// Now do all the local scopes / variables
		for (AstNode node : astRoot.getChildren())
		{
			switch (node.getKind())
			{
				case AST_TYPE_DEF:
					parseVars(node, null);
			}
		}

		//FanLexAstUtils.dumpTree(astRoot, 0);
	}

	//TODO: don't show the whole stack of errors, but just the base.
	// esp. for expressions, calls etc...
	private void parseVars(AstNode node, FanResolvedType type)
	{
		if (node == null)
		{
			return;
		}

		String text = node.getNodeText(true);
		List<AstNode> children = node.getChildren();
		switch (node.getKind())
		{
			case AST_CLOSURE:
				AstNode closureBlock = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_BLOCK));
				FanResolvedType retType=FanResolvedType.makeFromDbType(node, "sys::Void");
				for (AstNode child : children)
				{
					if(child.getKind() == AstKind.AST_FORMAL)
					{
						AstNode formalName = FanLexAstUtils.getFirstChild(child, new NodeKindPredicate(AstKind.AST_ID));
						AstNode formalTypeAndId = FanLexAstUtils.getFirstChild(child, new NodeKindPredicate(AstKind.AST_TYPE_AND_ID));
						// TODO: try to deal with inference ??
						FanResolvedType fType=FanResolvedType.makeFromDbType(child, "sys::Obj");
						if(formalTypeAndId!=null)
						{ // if inferred this is null
							formalName = FanLexAstUtils.getFirstChild(formalTypeAndId, new NodeKindPredicate(AstKind.AST_ID));
							AstNode formalType = FanLexAstUtils.getFirstChild(formalTypeAndId, new NodeKindPredicate(AstKind.AST_TYPE));
							parseVars(formalType, null);
							fType = formalType.getType();
						}
						// add the formals vars to the closure block scope
						closureBlock.addScopeVar(formalName.getNodeText(true), VarKind.LOCAL, fType, true);
					}
					if(child.getKind() == AstKind.AST_TYPE)
					{
						// save the returned type
						parseVars(child, type);
						retType = child.getType();
					}
					if(child.getKind() == AstKind.AST_BLOCK)
					{
						// parse the block content
						parseVars(child, type);
					}
				}
				type = retType;
				break;
			case AST_EXPR:
				boolean first = true;
				for (AstNode child : children)
				{
					parseVars(child, type);
					if(first || child.getKind()==AstKind.AST_CALL)
						type = child.getType();
					first=false;
				}
				break;
			case AST_CALL:
				AstNode callChild = children.get(0);
				String slotName = callChild.getNodeText(true);
				if (slotName.startsWith("?."))
				{
					slotName = slotName.substring(2);
				}
				if (slotName.startsWith("."))
				{
					slotName = slotName.substring(1);
				}
				type = FanResolvedType.resolveSlotType(type, slotName);

				List<AstNode> args = FanLexAstUtils.getChildren(node, new NodeKindPredicate(AstKind.AST_ARG));
				for(AstNode arg : args)
				{
					parseVars(arg, null);
				}
				//TODO: Check that param types matches slot declaration
				break;
			case AST_ARG:
				// arg contains one expression - parse it to check for errors
				AstNode argExprNode = node.getChildren().get(0);
				parseVars(argExprNode, null);
				type = argExprNode.getType();
				break;
			case AST_CAST:
				for (AstNode child : children)
				{
					parseVars(child, null);
				}
				AstNode castTypeNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_TYPE));
				type = castTypeNode.getType();
				//TODO: check if cast is valid
				break;
			case AST_LITTERAL_BASE:
				Node<AstNode> parseNode = node.getParseNode().getChildren().get(0); // firstOf
				type = resolveLitteral(node, parseNode);
				break;
			case AST_ID:
				type = FanResolvedType.makeFromLocalType(node, text);
				break;
			case AST_TYPE:
				type = FanResolvedType.fromTypeSig(node, text);
				break;
			case AST_LOCAL_DEF: // specila case, since it introduces scope vars
				AstNode typeAndIdNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_TYPE_AND_ID));
				AstNode idNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_ID));
				AstNode exprNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_EXPR));
				if (typeAndIdNode != null)
				{
					idNode = FanLexAstUtils.getFirstChild(typeAndIdNode, new NodeKindPredicate(AstKind.AST_ID));
					AstNode typeNode = FanLexAstUtils.getFirstChild(typeAndIdNode, new NodeKindPredicate(AstKind.AST_TYPE));
					parseVars(typeNode, null);
					type = typeNode.getType();
				}

				String name = idNode.getNodeText(true);

				if (exprNode != null)
				{
					parseVars(exprNode, null);
					if (type == null) // Prefer the type in TypeNode if specified
					{
						type = exprNode.getType();
						//TODO: check types are compatible
					}
				}
				node.addScopeVar(new FanAstScopeVar(node, VarKind.LOCAL, name, type), false);
				break;
			default:
				// recurse into children
				for (AstNode child : node.getChildren())
				{
					parseVars(child, null);
				}
		}
		node.setType(type);
		if (type != null && !type.isResolved())
		{
			node.getRoot().getParserTask().addError("Could not resolve item type -> " + text, node);
		}
	}

	public FanResolvedType resolveLitteral(AstNode astNode, Node<AstNode> parseNode)
	{
		FanResolvedType type = FanResolvedType.makeUnresolved(astNode);
		String lbl = parseNode.getLabel();
		String txt = astNode.getNodeText(true);
		if (lbl.equalsIgnoreCase(TokenName.ID.name()))
		{
			type = FanResolvedType.makeFromLocalType(astNode, txt);
		} else if (lbl.equalsIgnoreCase(TokenName.CHAR.name()))
		{
			type = FanResolvedType.fromTypeSig(astNode, "sys::Char");
		} else if (lbl.equalsIgnoreCase(TokenName.NUMBER.name()))
		{
			char lastChar = txt.charAt(txt.length() - 1);
			if (lastChar == 'f' || lastChar == 'F')
			{
				type = FanResolvedType.fromTypeSig(astNode, "sys::Float");
			} else if (lastChar == 'd' || lastChar == 'D')
			{
				type = FanResolvedType.fromTypeSig(astNode, "sys::Decimal");
			} else if (Character.isLetter(lastChar) && lastChar != '_')
			{
				type = FanResolvedType.fromTypeSig(astNode, "sys::Duration");
			} else if (txt.indexOf(".") != -1)
			{
				type = FanResolvedType.fromTypeSig(astNode, "sys::Float");
			} else
			{
				type = FanResolvedType.fromTypeSig(astNode, "sys::Int"); // Default
			}
		} else if (lbl.equalsIgnoreCase(TokenName.STRS.name()))
		{
			type = FanResolvedType.fromTypeSig(astNode, "sys::Str");
		} else if (lbl.equalsIgnoreCase(TokenName.URI.name()))
		{
			type = FanResolvedType.fromTypeSig(astNode, "sys::Uri");
		} else if (lbl.equals("true") || lbl.equals("false"))
		{
			type = FanResolvedType.fromTypeSig(astNode, "sys::Bool");
		}
			//TODO: Deal with null, super, this, it
		return type;
	}

	private void addUsing(AstNode usingNode)
	{
		String type = FanLexAstUtils.getFirstChildText(usingNode, new NodeKindPredicate(AstKind.AST_ID));
		String as = FanLexAstUtils.getFirstChildText(usingNode, new NodeKindPredicate(AstKind.AST_USING_AS));
		String ffi = FanLexAstUtils.getFirstChildText(usingNode, new NodeKindPredicate(AstKind.AST_USING_FFI));

		String name = as != null ? as : type;
		if(name.indexOf("::")>-1)
			name=name.substring(name.indexOf("::")+2);

		if (ffi != null && ffi.toLowerCase().equals("java"))
		{
			if (type.indexOf("::") != -1)
			{
				// Individual Item
				String qname = type.replaceAll("::", "\\.");

				if (FanType.findByQualifiedName(qname) == null)
				{
					addError("Unresolved Java Item: " + qname, usingNode);
				} else
				{
					addUsing(name, qname, usingNode);
				}
			} else
			{
				// whole package
				if (!FanType.hasPod(name))
				{
					addError("Unresolved Java package: " + name, usingNode);
				} else
				{
					Vector<FanType> items = FanType.findPodTypes(name, "");
					for (FanType t : items)
					{
						addUsing(t.getSimpleName(), t.getQualifiedName(), usingNode);
					}
				}
			}
		} else
		{
			if (type.indexOf("::") > 0)
			{
				// Adding a specific type
				String[] data = type.split("::");
				if (!FanType.hasPod(data[0]))
				{
					addError("Unresolved Pod: " + data[0], usingNode);
				} else if (FanType.findByQualifiedName(type) == null)
				{
					addError("Unresolved Type: " + type, usingNode);
				}

				//Type t = FanPodIndexer.getInstance().getPodType(data[0], data[1]);
				addUsing(name, type, usingNode);
			} else
			{
				// Adding all the types of a Pod
				if (name.equalsIgnoreCase("sys")) // sys is always avail.
				{
					return;
				}
				if (!FanType.hasPod(name))
				{
					addError("Unresolved Pod: " + name, usingNode);
				} else
				{
					Vector<FanType> items = FanType.findPodTypes(name, "");
					for (FanType t : items)
					{
						addUsing(t.getSimpleName(), t.getQualifiedName(), usingNode);
					}
				}
			}
		}
	}

	private void addUsing(String name, String qType, AstNode node)
	{
		AstNode scopeNode = FanLexAstUtils.getScopeNode(node);
		if (scopeNode == null)
		{
			return;
		}
		if (scopeNode.getLocalScopeVars().containsKey(name))
		{
			// This is 'legal' ... maybe show a warning later ?
			//addError("Duplicated using: " + qType + " / " + scopeNode.getLocalScopeVars().get(name), node);
			System.out.println("Already have a using called: " + qType + " (" + scopeNode.getLocalScopeVars().get(name) + ")");
			// Note: only keeping the 'last' definition (ie: override)
		}
		FanType type = FanType.findByPodAndType("sys", name);
		if (type != null)
		{
			/*if (type.getPod().equals("sys"))
			{
			addError("Duplicated using: " + qType + " / " + "sys::" + name, node);
			}*/
		}
		FanResolvedType rType = FanResolvedType.makeFromDbType(node, qType);
		scopeNode.addScopeVar(name, FanAstScopeVar.VarKind.IMPORT, rType, true);
	}

	public ParsingResult<AstNode> getParsingResult()
	{
		return parsingResult;
	}

	public String getPod()
	{
		return pod;
	}
}


