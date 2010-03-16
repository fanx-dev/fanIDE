/*
 * Thibaut Colar Aug 19, 2009
 */
package net.colar.netbeans.fan.completion;

import javax.swing.text.Document;
import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.FanTokenID;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import org.netbeans.api.lexer.TokenSequence;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler.QueryType;

/**
 * Store completion context data
 * and determine which completion type to provide (ie: pod etc...)
 *
 * See javadoc of determineCompletionType() for much more details
 * 
 * @author thibautc
 */
public class FanCompletionContext
{

	private completionTypes completionType;
	private int offset;
	private QueryType queryType;
	private boolean caseSensitive;
	private boolean isPrefixMatch;
	private Document doc;
	//private CommonTree rootNode;
	private TokenSequence<? extends FanTokenID> tokenStream;
	//private CommonTree curNode;

	public static enum completionTypes
	{

		UNKNOWN, ROOT_LEVEL, IMPORT_POD, IMPORT_FFI_JAVA, CALL, ID
	};
	private CodeCompletionContext context;
	FanParserTask result;
	private String preamble = "";

	public FanCompletionContext(CodeCompletionContext context)
	{
		this.context = context;
		result = (FanParserTask) context.getParserResult();

		offset = context.getCaretOffset();
		String prefix = context.getPrefix();
		if (prefix == null)
		{
			prefix = "";
		}
		queryType = context.getQueryType();// what's this ?
		caseSensitive = context.isCaseSensitive();
		isPrefixMatch = context.isPrefixMatch(); // ?
		doc = result.getSnapshot().getSource().getDocument(true);
		tokenStream = FanLexAstUtils.getFanTokenSequence(doc);

		AstNode rootNode = result.getAstTree();
		AstNode curNode = FanLexAstUtils.findASTNodeAt(rootNode, offset);

		completionType = determineCompletionType(curNode);
		FanUtilities.GENERIC_LOGGER.debug("Compl. type:" + completionType.toString());
	}

	/**
	 * Figure out what type of completion we will propose
	 *
	 * NOTE: Call can be after '.' or '?.'
	 * NOTE: For inferred vars ... try to recognize the 'easy' ones (literals): http://wiki.colar.net/fan_cheat_sheet#literals
	 *		Easy: Local Fields, Local method calls, Bool, Numbers(Char), Str, Uri, 'Type (#)'??
	 *		Less easy: Lists, Maps, Range, Inherited methods calls, Inherited fields, Static method/field
	 *		More Difficult: External fields, methods.
	 *
	 * What to complete ?
	 * - Outside of type, default: propose root level items (Class, public etc...)
	 *
	 * - In using statement
	 *   * before '::' give pod lists + 'java'
	 *   * after '::' give type list of given pod
	 *
	 * - In a Type (class,mixin, enum)
	 *   * After 'super.' -> Propose methods to override (abstract, override)
	 *   * After '.' -> if type before '.' can be determined, propose that type's slot.
	 *					Since we are in Type .. must be another (possibly inherited) Field or a static call .. so the type must be known.
	 *   * Default -> List all Types ? (favor/only? 'using' types ?), autoadd new types to using ?
	 *
	 * - In a Method (incl constructors)
	 *	 * Default: Propose other slots (fields/methods) including inerited, propose method params,
	 *				propose localVars. Propose all Types too ?
	 *   * After 'this.' : Propose fields (incl. inherited), methods?(no)
	 *   * After '.': if type before '.' can be determined, propose that type's slot.
	 *				  Otherwise ? propose nothing ? or just Obj slots ?
	 *   * After 'super.' : Propose inherited slots.
	 *
	 * - It block
	 *	 * Try to propose right stuff for 'it.'
	 *
	 * - Closure
	 *	 * Propose closure params
	 *
	 * - Switch Case: Propose enum values if switching over enum
	 *
	 * - Try/Catch : No completion for now - fantom unchecked
	 *
	 * TODO: Propositions visibility (Don't propose things that are not accesible)
	 * - Propose localVars only within same "block"
	 * - Propose private slots only within same Type
	 * - Propose internal slots only within same Pod
	 * - Propose protected slots only within "subtypes"
	 *
	 */
	private completionTypes determineCompletionType(AstNode node)
	{
		//result.dumpTree();
		if (node==null)
		{
			FanUtilities.GENERIC_LOGGER.info("Node : Null !");
			// Root level (not in type) default
			return completionTypes.ROOT_LEVEL;
		} else
		{
			FanUtilities.GENERIC_LOGGER.debug("Node : "+node.toString());
			AstNode usingNode = FanLexAstUtils.findParentNode(node, AstKind.AST_USING);
			if (usingNode == null)
			{
				usingNode = FanLexAstUtils.findParentNode(node, AstKind.AST_INC_USING);
			}
			if (usingNode != null)
			{
				//System.out.println("usingNode :" + usingNode.toString() + " " + usingNode.toStringTree());
				return completionTypes.IMPORT_POD;
			}
			// expression completion after a '.' or '?.'
			//System.out.println("Node :" + node.toString() + " " + node.toStringTree());
			AstNode callExpr=FanLexAstUtils.findParentNode(node, AstKind.AST_CALL);
			if(callExpr == null)
				callExpr=FanLexAstUtils.findParentNode(node, AstKind.AST_INC_CALL);
			if(callExpr!=null)
			{
					return completionType.CALL;
			}
			// Default proposal for ID's (local vars etc..)
			if(FanLexAstUtils.findParentNode(node, AstKind.AST_ID)!=null)
			{
				return completionType.ID;
			}
		}
		if(FanLexAstUtils.findParentNode(node, AstKind.AST_TYPE_DEF) == null)
			return completionTypes.ROOT_LEVEL;
		// restore ts offset
		//tokenStream.move(offset);
		return completionTypes.UNKNOWN;
	}

	public boolean isCaseSensitive()
	{
		return caseSensitive;
	}

	public completionTypes getCompletionType()
	{
		return completionType;
	}

	public CodeCompletionContext getContext()
	{
		return context;
	}

/*	public CommonTree getCurNode()
	{
		return curNode;
	}*/

	public Document getDoc()
	{
		return doc;
	}

	public boolean isIsPrefixMatch()
	{
		return isPrefixMatch;
	}

	public int getOffset()
	{
		return offset;
	}

	public QueryType getQueryType()
	{
		return queryType;
	}

	public FanParserTask getResult()
	{
		return result;
	}

	/*public CommonTree getRootNode()
	{
		return rootNode;
	}*/

	public TokenSequence<? extends FanTokenID> getTokenStream()
	{
		return tokenStream;
	}

	public String getPreamble()
	{
		return preamble;
	}
}
