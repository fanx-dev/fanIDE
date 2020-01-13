/*

// Deprecated (2/22/10) - using parboiled parser from now on
// Last updated for Fantom 1.0.50


Thibaut Colar http://www.colar.net/	       2009
ANTLR3 Grammar for the Fan programming language
http://fandev.org/doc/docLang/Grammar.html

This actually took a LOT of work !
Probably cause i'm new to both Fan and Antlr, and Fan as pretty adavanced features
and a fairly tricky syntax.

On my machine the default timeout is too short -> use -Xconversiontimeout 30000
in antlrWorks add "-Xconversiontimeout 30000" in file/prefs : antlr options
Also it needs >600M to generate the code in antlWorks (-Xmx600M). ~900M to debug.

## List of special Token types, that will be used for syntax highlighting
KW_* -> Keyword
AS_* -> assignment
OP_* -> Operation
SP_* -> separator
CP_* -> comparator
NUMBER
STR
QUOTSTR
DSL
URI
CHAR
LINE_COMMENT
EXEC_COMMENT
MULTI_COMMENT
*/

grammar Fan;
options {output=AST;memoize=true;backtrack=true;}

// ########################## TOKENS
// Define tokens for keywords used in the grammar, so they can be referenced.
tokens
{
KW_BREAK	='break';
KW_CONTINUE	='continue';
KW_FOR		='for';
KW_IF		='if';
KW_RETURN	='return';
KW_SWITCH	='switch';
KW_THROW	='throw ';
KW_WHILE	='while';
KW_TRY		='try';
KW_CASE		='case';
KW_DEFAULT	='default';
KW_CATCH	='catch';
KW_FINALLY	='finally';
KW_USING	='using';
KW_AS		='as';
KW_RD_ONLY	='readonly';
KW_CONST	='const';
KW_STATIC	='static';
KW_NATIVE	='native';
KW_VOLATILE	='volatile';
KW_OVERRIDE	='override';
KW_VIRTUAL	='virtual';
KW_FINAL	='final';
KW_VOID		='void';
KW_CLASS	='class';
KW_ENUM		='enum';
KW_MIXIN	='mixin';
KW_ABSTRACT	='abstract';
KW_PRIVATE	='private';
KW_PROTECTED	='protected';
KW_PUBLIC	='public';
KW_INTERNAL	='internal';
KW_NEW		='new';
KW_ONCE		='once';
KW_THIS		='this';
KW_SUPER	='super';
KW_ELSE		='else';
KW_IS		='is';
KW_ISNOT	='isnot';
KW_NULL		='null';
KW_IT		='it';
KW_TRUE		='true';
KW_FALSE	='false';

// "Fake" token types used for incomplete lexer items (like unclosed string)
INC_STR;
INC_URI;
INC_COMMENT;
INC_DSL;

// AST elements
AST_CLASS;
AST_ENUM;
AST_MIXIN;
AST_METHOD;
AST_CONSTRUCTOR;
AST_FIELD;
AST_CONSTRUCTOR_CHAIN;
AST_CODE_BLOCK;
AST_DOCS;
AST_STR;
AST_CALL;
AST_TERM_EXPR;
AST_DOT_CALL;
AST_SAFE_DOT_CALL;
AST_STATIC_CALL;
AST_USING_POD;
AST_MAP;
AST_LOCAL_DEF;
AST_TYPE_LIT;
AST_SLOT_LIT;
AST_SYMBOL;
AST_NAMED_SUPER;
AST_LIST;
AST_MAP;
AST_IT_BLOCK;
AST_CTOR_BLOCK;
AST_FOR_INIT;
AST_CATCH_DEF;
AST_FORMAL;
AST_CAST;
AST_FUNC_TYPE;
AST_INDEX_EXPR;
// help getting valid AST for completion: (INC means incomplete)
AST_INC_USING;
AST_INC_DOTCALL;
AST_INC_SAFEDOTCALL;
// generic items
AST_SCOPE; // introduce a scope for thing like loops, catches, closures scopes
AST_ID;
AST_MODIFIER;
AST_INHERITANCE;
AST_PARAM;
AST_TYPE;
// used to "group" generic stuff together
AST_CHILD;
}

// ########################## code.

@header		{package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;
}
@lexer::header	{package net.colar.netbeans.fan.antlr;
import net.colar.netbeans.fan.FanParserResult;
}

@lexer::members{
	//typeOverride
	int too=-1;
	public int getTypeOverride() {return too;}
	public void clearTypeOverride() {too=-1;}
}

// A little bit of code necessary to deal with the Linebreaks which are usually neaningless but not always
// They can mean "end of statement" for some statements.
@members{
		public boolean nbErrors=false;
	/*
       		Thibaut. C
       		 This looks for a linebreak/newline, which are usually ignored (hidden channel)
   	      	Yet in other case they are meaningful (IE: end of expression)
     		index is the index of the current "next non-hidden" token, what that means is that it will
       		have skipped the linebreaks and be pointing at the NEXT token after the line breaks
       		So we need to look BACKWARD at the hidden tokens to check for newLine.
       		Note that the hiden tokens might include other things like tabs or whitespace that does not qualify
    	*/
      	private boolean lookupNL()
       	{
       		int index=input.index();
		int start=input.mark();
		if(index < input.size())
		{
			// Always allowing comma as end of line might be a bit too "loose"
			// it's neeed for itBlocks Add feature
			// maybe i shoul match only when in an itBlock ?
			if(input.get(index).getType() == SP_COMMA)
				return true;
			// if next token is a '}', that counts as a newline
			if(input.get(index).getType() == BRACKET_R)
				return true;
		}
 		Token token;
		boolean result=false;
		while (index > 0)
		{
			// look back in the hidden channel until we find a linebreak
			index--;
			token = input.get(index);
			if (token.getChannel() != Token.HIDDEN_CHANNEL)
			{
				/* We are out of the hidden channel, in other word we found a "real" item,
				which means we didn't find a linebreak, so we are done (false)
				*/
				break;
			}
			if (token.getType() == LB)
			{
				// found our LineBreak (true)
				result=true;
				break;
			}
		}
		if(index==0)
			result=true;
		input.rewind(start);
		return result;
    	}

    	/**
    	Some items ("(" "[") cannot be preceded by an EndOfLine in an expression
    	*/
    	private boolean notAfterEol()
    	{
       		int index=input.index();
		int start=input.mark();
 		Token token;
		boolean result=false;
		while (index > 0)
		{
			index--;
			token = input.get(index);
			if (token.getChannel() != Token.HIDDEN_CHANNEL)
			{
				result=true;
				break;
			}
			if (token.getType() == LB)
			{
				result=false;
				break;
			}
		}
		input.rewind(start);
		return result;
    	}

    /* Error Handling */
    FanParserResult parsingResult=null;
    public FanParserResult parse(FanParserResult parsingResult) throws RecognitionException
    {
	this.parsingResult=parsingResult;
	// Parse from grammar root and save the result
	ParserRuleReturnScope result=prog();
	this.parsingResult.setAntlrScope(result);
	return this.parsingResult;
    }
    @Override
    public void reportError(RecognitionException e)
    {
		if(! nbErrors)
			throw(new RuntimeException("Parser Exception",e));
		else
			parsingResult.addAntlrError(e,paraphrase);
    }

    Stack<String> paraphrase = new Stack<String>();

}

//###################### GRAMMAR RULES ##########################################################
// "Prog" Is the grammar starting point

// allow extra "docs" at the end of file, as seen in some files (last slot commented out)
prog		: 	 using* (podDef | typeDef*) docs EOF;
using		@init {paraphrase.push("Using statements");} @after{paraphrase.pop();}
		:	(usingPod | usingType | usingAs | incUsing);
usingPod
		:	(KW_USING podSpec eos)
			-> ^(AST_USING_POD ^(AST_CHILD podSpec) eos?);
usingType
		:	(KW_USING podSpec SP_COLCOL id eos)
			-> ^(AST_USING_POD ^(AST_CHILD podSpec) ^(AST_CHILD id));
// pod id can have a $ in it(java ffi) but then "as" is required
usingAs		:	(KW_USING podSpec SP_COLCOL podId KW_AS as=id eos)
			-> ^(AST_USING_POD ^(AST_CHILD podSpec) ^(AST_CHILD podId) ^(AST_CHILD $as));
// incomplete using -> Need good AST for Completion
podId		:	id ('$' id)*;
incUsing	:   ((KW_USING eos) | (KW_USING ffi eos) | (KW_USING podSpec DOT eos) | (KW_USING podSpec SP_COLCOL eos))
			-> ^(AST_INC_USING ^(AST_CHILD KW_USING) ^(AST_CHILD ffi? podSpec? DOT? SP_COLCOL?));
podSpec		:	ffi? id (DOT id)*;
ffi 		:	sq_bracketL id sq_bracketR;
// pod support
podDef		:	podHeader BRACKET_L symbolDef* BRACKET_R;
podHeader	:	docs facet* pod id;
symbolDef	:	docs facet* symbolFlag* typeId AS_INIT_VAL expr eos;
symbolFlag	:	'virtual';

// refactored
typeDef 	:	docs facet* ((classFlags* KW_CLASS)=>classDef |
			(protection? KW_ENUM)=>enumDef | mixinDef);
classDef 	@init {paraphrase.push("Class definition");} @after{paraphrase.pop();}
		:  	(classHeader classBody)
		    -> ^(AST_CLASS classHeader classBody);
classHeader	:	(docs facet* m=classFlags* KW_CLASS id inheritance?)
			-> ^(AST_MODIFIER $m)* KW_CLASS id  ^(AST_INHERITANCE inheritance)?;
classFlags 	:	protection | KW_ABSTRACT | KW_FINAL | KW_CONST | KW_STATIC;
classBody 	:	(bracketL slotDef* bracketR)  -> ^(AST_CODE_BLOCK bracketL slotDef* bracketR);
protection	:	KW_PUBLIC | KW_PROTECTED | KW_PRIVATE | KW_INTERNAL;
mixinDef	@init {paraphrase.push("Mixin definition");} @after{paraphrase.pop();}
		:	(mixinHeader mixinBody)
		    -> ^(AST_MIXIN mixinHeader mixinBody);
mixinHeader	:	(docs facet* m=mixinFlags* KW_MIXIN id inheritance?)
			->  ^(AST_MODIFIER $m)* KW_MIXIN id ^(AST_INHERITANCE inheritance)?;
mixinFlags	:	protection | KW_CONST | KW_STATIC | KW_FINAL;
mixinBody	:	bracketL slotDef* bracketR  -> ^(AST_CODE_BLOCK bracketL slotDef* bracketR);
enumDef		@init {paraphrase.push("Enumeration definition");} @after{paraphrase.pop();}
		:	(enumHeader enumBody)
		    -> ^(AST_ENUM enumHeader enumBody);
enumHeader	:   	(docs facet* m=protection? KW_ENUM id inheritance?)
			->  ^(AST_MODIFIER $m)* KW_ENUM id ^(AST_INHERITANCE inheritance)?;
enumBody	:	bracketL enumValDefs slotDef* bracketR   -> ^(AST_CODE_BLOCK bracketL enumValDefs slotDef* bracketR);
inheritance 	:	SP_COLON typeList;
	//	    -> ^(AST_INHERITANCE typeList);
enumValDefs 	:	enumValDef (SP_COMMA  enumValDef)* eos;
enumValDef 	:	docs id (parL args? parR)?;
typeList	:  	type (SP_COMMA type)*;

type	        :  	(typeRoot SP_QMARK? typeTail)
					-> ^(AST_TYPE typeRoot SP_QMARK? typeTail?);
typeTail	:   (LIST_TYPE SP_QMARK?)*;
typeRoot	:	mapType | nonMapType;
nonMapType	:	funcType | simpleType;
simpleType     	:  	id (SP_COLCOL id)?;
// this was left recursive -> changed into tail recursive
mapType		:	sq_bracketL? nonMapType SP_QMARK? (LIST_TYPE SP_QMARK?)*
				({notAfterEol()}? SP_COLON {notAfterEol()}? type)+ sq_bracketR?
			-> ^(AST_MAP ^(AST_CHILD nonMapType) ^(AST_CHILD type));
// TODO: SP_COMMA deprecated Fan 1.0.49
funcType 	:	(SP_PIPE funcTypeContent SP_PIPE)
				-> ^(AST_FUNC_TYPE funcTypeContent);
// op_safe_dyn_call elxer confusion between |Str?->| (formal) and Str?->  (dyn call)
funcTypeContent : (formals OP_SAFEDYN_CALL type?) | (formals ((OP_ARROW)=>assignedType)?) | ((OP_ARROW)=>assignedType);
assignedType	:	OP_ARROW type?;
formals 	:  	formal (SP_COMMA formal)*;
formal		:	(formal_content)
					-> ^(AST_FORMAL formal_content);
formal_content	: (formalFull | formalTypeOnly | formalInferred);
formalFull      :	type id;
formalTypeOnly  :  	type;
formalInferred  :  	id;
slotDef 	:	((KW_STATIC bracketL)=> staticBlock|
				(docs facet*
					(
						(ctorFlags* KW_NEW)=>ctorDef |
						(methodFlags* (type | KW_VOID) id parL)=>methodDef |
						fieldDef
					)
				)
			);
fieldDef	@init {paraphrase.push("Field definition");} @after{paraphrase.pop();}
		:	docs facet* m=fieldFlags typeId (AS_INIT_VAL expr)?
				(
				(bracketL (protection? (getter | setter) SP_SEMI? block?)+ bracketR)
				| eos)
			-> ^(AST_FIELD typeId ^(AST_MODIFIER $m)* expr?);
typeId		:	((type id)=>typeAndId | fieldId);
fieldId		:	id;
typeAndId	:	(type id);
fieldFlags	:	(KW_ABSTRACT | KW_RD_ONLY | KW_CONST | KW_STATIC | KW_NATIVE | KW_VOLATILE | KW_OVERRIDE | KW_VIRTUAL | KW_FINAL | protection)*;
methodDef	@init {paraphrase.push("Method definition");} @after{paraphrase.pop();}
		:	docs facet* m=methodFlags* returnType=type /*| KW_VOID*/ mname=id parL params parR methodBody
		    -> ^(AST_METHOD ^($mname) $returnType params? ^(AST_MODIFIER $m)* methodBody? );
methodFlags	:	protection | KW_VIRTUAL | KW_OVERRIDE | KW_ABSTRACT | KW_STATIC | KW_ONCE |
			 KW_NATIVE | KW_FINAL;
params		:	(param (SP_COMMA param)*)?;
param 		:	(type id (AS_INIT_VAL expr)?)
			-> ^(AST_PARAM type id (AS_INIT_VAL expr)?);
methodBody	:	((multiStmt)=>multiStmt | eos);
ctorDef		@init {paraphrase.push("Constructor definition");} @after{paraphrase.pop();}
		:	docs facet* m=ctorFlags* KW_NEW cname=id parL params parR cchain=((SP_COLON)=>ctorChain)? methodBody
		    -> ^(AST_CONSTRUCTOR ^($cname) params? ^(AST_MODIFIER $m)* ^(AST_CONSTRUCTOR_CHAIN $cchain)* methodBody? );
ctorFlags	:	protection;
ctorChain	:	SP_COLON (ctorChainThis | ctorChainSuper);

ctorChainThis	:	KW_THIS DOT id parL args? parR;
ctorChainSuper	:	KW_SUPER (DOT id)? parL args? parR;

staticBlock	:	KW_STATIC block;
block 		@init {paraphrase.push("Block");} @after{paraphrase.pop();}
		:	((bracketL)=>multiStmt | stmt);
multiStmt	:	bracketL stmt* bracketR -> ^(AST_CODE_BLOCK bracketL (stmt*)? bracketR);
stmt
@init {paraphrase.push("Statement");} @after{paraphrase.pop();}
		:	(g_if | g_for | g_while | g_break |
			g_continue | g_return | g_switch |
			g_throw | g_try | exprStmt | localDef );
// list of tstements without brackets (try/catch/finaly if/esle)
stmtList	: s=(stmt*) -> ^(AST_CODE_BLOCK $s?);
/* NOTE: Can't use java keywords as grammar ID's
Because the name (ex: break) will be used as a function name in the generated java code
which if it's a java keyword is gonna be invalid java code.
so I prepand "g_" to those if needed.
*/
g_break		:	KW_BREAK eos;
g_continue	:	KW_CONTINUE eos;
g_for		:	(KW_FOR parL forInit? SP_SEMI expr? SP_SEMI expr? parR  block)
				-> ^(AST_SCOPE KW_FOR parL forInit? SP_SEMI expr? SP_SEMI expr? parR  block);
g_if		:	KW_IF parL expr parR block
				(KW_ELSE block)?;
g_return	:	KW_RETURN (eos | expr eos);
g_switch	:	KW_SWITCH parL expr parR bracketL (g_case)* (g_default)? bracketR;
g_throw		:	KW_THROW expr eos;
g_while		:	KW_WHILE parL expr parR block;
g_try		:	(KW_TRY g_try_content)
				-> ^(AST_SCOPE KW_TRY g_try_content);
g_try_content: ((bracketL)=>try_long | stmtList) ((KW_CATCH)=>g_catch)* ((KW_FINALLY)=>g_finally)?;
try_long	:	multiStmt;
exprStmt	:	expr eos;
localDef	:	(typeId (AS_INIT_VAL expr)? eos)
				-> ^(AST_LOCAL_DEF typeId expr? eos?);
forInit 	:	forInitDef | expr;
forInitDef	:	typeId (AS_INIT_VAL expr)?
				-> ^(AST_FOR_INIT typeId (AS_INIT_VAL expr)?);
// catch is a reserved antlr keyword
// also needs it's own scope (var)
g_catch		:	(KW_CATCH g_catch_ct)
				-> ^(AST_SCOPE g_catch_ct);
g_catch_ct	:	catchDef? ((bracketL)=>catch_long | stmtList);
catch_long	:	multiStmt;
catchDef 	:	parL type id parR
				-> ^(AST_CATCH_DEF parL type id parR);
// finally is a reserved antlr keyword
g_finally	:	KW_FINALLY ((bracketL)=>finally_long | stmtList);
finally_long	:	multiStmt;
g_case		:	KW_CASE expr SP_COLON stmt*;
g_default	:	KW_DEFAULT SP_COLON stmt*;

// ########### Expressions
expr
@init {paraphrase.push("Expression");} @after{paraphrase.pop();}
		:	assignExpr;
assignExpr	:	ifExpr (assignOp assignExpr)?;
assignOp	:	AS_EQUAL | AS_ASSIGN_OP;

ifExpr      :	ternaryExpr | elvisExpr;
ternaryExpr	:	condOrExpr (ternaryTail)?;
// Problem: It will confuse the ':' of the ternary expr and then it fails.
ternaryTail	:	SP_QMARK ifExprBody SP_COLON ifExprBody;
elvisExpr 	:	condOrExpr OP_ELVIS ifExprBody ;
ifExprBody  :   condOrExpr | ifExprThrow;
ifExprThrow :   KW_THROW expr;

condOrExpr 	:	condAndExpr  (OP_OR  condAndExpr)*;
condAndExpr 	:	equalityExpr (OP_AND  equalityExpr)* ;
equalityExpr	:	relationalExpr (CP_EQUALITY relationalExpr)* ;

relationalExpr	:  	typeCheckExpr | compareExpr;
// NOTE: we compare to typeRoot instead of type, because type would eat the trailing ?, breaking ternary expressions
typeCheckExpr	:  	rangeExpr (KW_ISNOT | KW_IS | KW_AS) typeRoot (SP_QMARK? {notAfterEol()}? '[]')*;
compareExpr	:  	rangeExpr (CP_COMPARATORS rangeExpr)*;

rangeExpr 	:	addExpr (( OP_RANG_EXCL_OLD | OP_RANGE_EXCL | OP_RANGE ) addExpr)* ;
// Bitwise ops deprecated in 1.0.49
//bitOrExpr 	:	bitAndExpr ((OP_BITOR | SP_PIPE) bitAndExpr)* ;
//bitAndExpr 	:	shiftExpr (OP_CURRY shiftExpr)*  ;
//shiftExpr 	:	addExpr ((OP_LSHIFT | OP_RSHIFT) addExpr)* ;
addExpr 	:	multExpr ((OP_PLUS | OP_MINUS) multExpr)* ;
addAppend	:	(OP_PLUS | OP_MINUS) parenExpr;
multExpr 	:	parenExpr ((OP_MULTI | OP_DIV | OP_MOD) parenExpr)* ;
parenExpr 	:	castExpr | groupedExpr | unaryExpr;
// par_l on newline = end of expression
castExpr 	:	{notAfterEol()}? parL type parR parenExpr
					-> ^(AST_CAST parL type parR parenExpr);
// if PAR_l starts after newLine, this is a different exression
groupedExpr 	:	parL expr parR termChain*;
unaryExpr 	:	prefixExpr | postfixExpr | termExpr;
// ~ deprecated in 1.0.49
prefixExpr 	:	(OP_CURRY | OP_BANG | OP_2PLUS | OP_2MINUS | /*OP_TILDA |*/ OP_PLUS | OP_MINUS) parenExpr ;
postfixExpr 	:	termExpr (OP_2PLUS | OP_2MINUS) ;
termExpr 	:	termBase termChain*
			-> ^(AST_TERM_EXPR ^(AST_CHILD termBase) ^(AST_CHILD termChain*));
// check for ID alone last (and not as part of idExpr) otherwise it would never check literals !
termBase 	:	idExprReq | literal | typeBase | id;
typeBase	:	typeLiteral | slotLiteral | namedSuper | staticCall |
 	                dsl | closure | simple | ctorBlock;
ctorBlock	:	type itBlock
				-> ^(AST_CTOR_BLOCK type itBlock);
staticCall	:	type DOT idExpr
				-> ^(AST_STATIC_CALL type ^(AST_CHILD idExpr));

termChain 	:	dotCall | dynCall | safeDotCall | safeDynCall |
			indexExpr | callOp | itBlock | incDotCall | incSafeDotCall;
dsl	        :	simpleType DSL;

incDotCall	: DOT
				-> ^(AST_INC_DOTCALL);
incSafeDotCall: OP_SAFE_CALL
				-> ^(AST_INC_SAFEDOTCALL);

// itBlocks can have a COMMA after statements, which means to call it.add(expr).
itBlock 	:	(bracketL itBlockContent bracketR)
				-> ^(AST_IT_BLOCK bracketL itBlockContent? bracketR);
itBlockContent : (stmt SP_COMMA? SP_SEMI?)*;
dotCall 	:	DOT idExpr
				-> ^(AST_DOT_CALL idExpr);
dynCall 	:	OP_ARROW idExpr;
safeDotCall 	:	OP_SAFE_CALL idExpr
				-> ^(AST_SAFE_DOT_CALL idExpr);
safeDynCall	:	OP_SAFEDYN_CALL idExpr;
// TODO: does not work, will be parsed as a "list" Type because the grammar is confusing
// it's context sensitive - need to review.
// Can't cleanly differentiate Int[3] (List of Int with val '3') and var[3] : int.get[3]
// So for now I'm gonna get a List in the ast and deal with it there
indexExpr 	:	({notAfterEol()}? sq_bracketL expr sq_bracketR)
				-> ^(AST_INDEX_EXPR sq_bracketL expr sq_bracketR);
// eos = end of expression
callOp		:	{notAfterEol()}? parL args?  parR closure*;
closure 	@init {paraphrase.push("Closure");} @after{paraphrase.pop();}
		:  	(funcType multiStmt)
				->^(AST_SCOPE funcType multiStmt);
// this can be either a local def(toto.value) or a call(toto.getValue or toto.getValue(<params>)) + opt. closure
idExpr 		:	idExprReq | id;
// Same but without matching ID by itself (this would prevent termbase from checking literals).
idExprReq	:	field | call;
// require '*' otherwise it's just and ID (this would prevent termbase from checking literals)
field		:	OP_MULTI ID; // changed from @ to *
 // require params or/and closure, otherwise it's just and ID (this would prevent termbase from checking literals)
call		:	(id ((p=callParams c=closure) | p=callParams | c=closure))
			-> ^(AST_CALL id ^(AST_CHILD $p? $c?));

callParams	:	{notAfterEol()}? parL args? parR;
args 		:	expr (SP_COMMA  expr)*;

literal 	:	KW_NULL | KW_THIS | KW_SUPER | KW_IT | KW_TRUE | KW_FALSE | strs | URI |
			number | CHAR | namedSuper |
			slotLiteral | typeLiteral | list | map | symbLiteral | simple;
strs		:	(qs=QUOTSTR | s=STR)
				-> ^(AST_STR $s)? ^(AST_STR $qs)?;
// we create a scope for type litterals, because sometimes they introduce variables (func types)
typeLiteral	:  	(type {notAfterEol()}? OP_POUND)
				-> ^(AST_SCOPE ^(AST_TYPE_LIT type OP_POUND));
slotLiteral	:  	(type? OP_POUND {notAfterEol()}? id)
				-> ^(AST_SLOT_LIT type? OP_POUND id);
symbLiteral :   (AT id1=(id SP_COLON SP_COLON)? id)
				-> ^(AST_SYMBOL AT $id1? id);
namedSuper 	:	(simpleType DOT KW_SUPER)
				-> ^(AST_NAMED_SUPER simpleType DOT KW_SUPER);
list 		:	((type {notAfterEol()}?)? sq_bracketL listItems sq_bracketR)
				-> ^(AST_LIST type? sq_bracketL listItems sq_bracketR);
listItems 	:	(expr (SP_COMMA expr )* SP_COMMA?) | SP_COMMA;
map 		:	((mapType {notAfterEol()}?)? sq_bracketL mapItems sq_bracketR)
				-> ^(AST_MAP mapType? sq_bracketL mapItems sq_bracketR);
mapItems 	:	(mapPair (SP_COMMA mapPair)* SP_COMMA?) | SP_COLON;
mapPair		:	expr SP_COLON expr;
simple		:	type parL expr parR;

docs		:	d=(DOC*) -> ^(AST_DOCS $d?);

number		: 	OP_MINUS? NUMBER;
facet		:	AT id (AS_EQUAL expr)?;

// endOfLine: semicolumn, or look for newLine
eos
@init {paraphrase.push("Semicolumn or LineBreak");} @after{paraphrase.pop();}
		:	SP_SEMI | {lookupNL()}?;

id
@init {paraphrase.push("Identifier");} @after{paraphrase.pop();}
		: 	ID -> ^(AST_ID ID);
/*Those are a bit special, they can't be a lexer rule, because they can be a valid ID as well 
(or part of one) and they can't be just parsed as 'get' or 'set' because they are Tokens of type ID
 so I check them as ID's an look if the content matches. 
Not sure that's the best way to o this, but it's the best i could come up with that works.
 */
getter			: t=ID {t.getText().equals("get")}?;
setter			: t=ID {t.getText().equals("set")}?;
pod				: t=ID {t.getText().equals("pod")}?;

// For better error reporting
bracketL
@init {paraphrase.push("{");} @after{paraphrase.pop();}
		:	BRACKET_L;
bracketR
@init {paraphrase.push("}");} @after{paraphrase.pop();}
		:	BRACKET_R;
sq_bracketL
@init {paraphrase.push("[");} @after{paraphrase.pop();}
		:	SQ_BRACKET_L;
sq_bracketR
@init {paraphrase.push("]");} @after{paraphrase.pop();}
		:	SQ_BRACKET_R;
parL
@init {paraphrase.push("(");} @after{paraphrase.pop();}
		:	PAR_L;
parR
@init {paraphrase.push(")");} @after{paraphrase.pop();}
		:	PAR_R;


// ####################### LEXER items ################################################################

// linebreaks go into hidden channel which means they are usually ignored
// but we can still programmatically access them as done in the lookupNL() method.
LB		: (('\r\n') | '\n')+ {$channel=HIDDEN;};
// Other ignored data: whitespaces, comments
WS  		:  (' '|'\t') {$channel=HIDDEN;}; // whitespace
LINE_COMMENT	: '//' (~('\n'))* {$channel=HIDDEN;};
EXEC_COMMENT	: '#!' (~('\n'))* {$channel=HIDDEN;};

// need to use a predicate for incomplete item detection to work right.
// backtracking in lexer wiithout predicate doesn't seem to happen right, with greedy=false.
// if incomplete we match till end of line since most likely just started new comment
MULTI_COMMENT	: '/*' ((COMPL_ML_COMMENT)=>COMPL_ML_COMMENT | ~'\n'* {too=INC_COMMENT;}){$channel=HIDDEN;};
fragment
COMPL_ML_COMMENT: (options{greedy=false;}:.)* '*/';

DSL		:'<|' ((COMPL_DSL)=>COMPL_DSL | ~'\n'* {too=INC_DSL;});
fragment
COMPL_DSL	: (options{greedy=false;}:.)* '|>';

CHAR		:'\'' (('\\' .) | ('\\u' (DIGIT | HEXLETTER) (DIGIT | HEXLETTER)
			(DIGIT | HEXLETTER) (DIGIT | HEXLETTER)) | .)? '\''; //Letter possibly bacquoted or unicode char
//RAWSTR		: 'r"' ~('"')* '"'; // obsoteted
QUOTSTR		: '"""' ((COMPL_QSTR)=>COMPL_QSTR | ~'\n'* {too=INC_STR;});
fragment
COMPL_QSTR	: (options{greedy=false;}:.)* '"""';
STR		: '"' ((COMPL_STR)=>COMPL_STR | ~'\n'* {too=INC_STR;});// accept strings incl. \"
fragment
COMPL_STR	: ('\\\\' | '\\"' | ~'"')* '"';
URI		: '`'  ((COMPL_URI)=>COMPL_URI | ~'\n'* {too=INC_URI;});
fragment
COMPL_URI	: (('\\\\') | ('\\`') | ~('`') )* '`';

// ######## Start NOT Hidden items ####
// TODO: probably should use \r?\n  ... but that seem to cause issues when testing in antlrworks -> why ?
DOC	 	:   '**' ( options {greedy=false;} : . )* '\n' ; // ~ javadoc (fandoc)

// Fan language keywords
KEYWORD		: ('abstract' | 'as' | 'assert' | 'break' | 'case' | 'catch' |
		'class' | 'const' | 'continue' | 'default' | 'do' | 'else' | 'enum' | 'false' |
 		'final' | 'finally' | 'for' | 'foreach' | 'if' | 'internal' | 'is' | 'isnot' |
 		'mixin' | 'native' | 'new' | 'null' | 'once' | 'override' | 'private' |
 		'protected' | 'public' | 'readonly' | 'return' | 'static' | 'super' | 'switch' |
		'this' | 'throw' | 'true' | 'try' | 'using' | 'virtual' | 'volatile' | 'void' |
		'while');


// Symbols
CP_EQUALITY	:'===' | '!==' | '==' | '!=';
CP_COMPARATORS  :'<=' | '>=' | '<=>' | '<' | '>';
AS_ASSIGN_OP	:'*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=';
LIST_TYPE	:'[]';
OP_SAFEDYN_CALL	:'?->';
OP_ARROW	:'->';
OP_SAFE_CALL	:'?.';
OP_RANG_EXCL_OLD:'...';
OP_RANGE_EXCL	:'..<';
OP_RANGE	:'..';
OP_ELVIS	:'?:';
SP_COLCOL	:'::';
BRACKET_L	:'{';
BRACKET_R	:'}';
SQ_BRACKET_L	:'[';
SQ_BRACKET_R	:']';
PAR_L		:'(';
PAR_R		:')';
SP_COLON	:':';
SP_SEMI		:';';
SP_COMMA	:',';
SP_PIPE		:'|';
AS_INIT_VAL	:':=';
SP_QMARK	:'?';
AT		:'@';
OP_POUND	:'#';
OP_CURRY	:'&';
AS_EQUAL	:'=';
OP_BITOR	:'^';
UNDERSCORE	:'_';
OP_AND		:'&&';
OP_OR		:'||';
DOT		:'.';
OP_2PLUS	:'++';
OP_2MINUS	:'--';
OP_MINUS	:'-';
OP_PLUS		:'+';
OP_LSHIFT	:'<<';
OP_RSHIFT	:'>>';
OP_MULTI	:'*';
OP_DIV		:'/';
OP_MOD		:'%';
OP_BANG		:'!';
OP_TILDA	:'~';

// Numbers / Letters matching
// Apparently fan allows syntax like var=var-1 so we can't 'eat' the - as part as the number (lexer) since it could be a minus operand

fragment HEX_HEADER	: 	'0x' | '0X';

NUMBER			: 	((HEXNB)=>HEXNB | (DECIMAL)=>DECIMAL | FRACTIONAL);
fragment HEXNB		:	HEXHEADER (UNDERSCORE* (DIGIT | HEXLETTER))+;
fragment DECIMAL	:	DIGIT (UNDERSCORE* DIGIT)* ((FRACTION)=>FRACTION)? 
					((EXPONENT)=>EXPONENT)? NBTYPE?;
fragment FRACTIONAL	:	FRACTION EXPONENT? NBTYPE?;
fragment FRACTION	:	DOT DIGIT (UNDERSCORE* DIGIT)*;
fragment EXPONENT	:	('e'|'E') ('+' | OP_MINUS)? DIGIT (UNDERSCORE* DIGIT)*;
// d,f are for float or decimal
fragment NBTYPE		:	'F' | 'f' | 'D' | ('d' 'ay'?) | 'ms' | 'ns' | 
					'sec' | 'min' | 'hr';
fragment HEXLETTER	: 	'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
fragment HEXHEADER	: 	'0x' | '0X';

// any other "word" is an "ID"
ID			: (UNDERSCORE* LETTER) ( LETTER | DIGIT | UNDERSCORE )*;

fragment LETTER		: ('a'..'z' | 'A'..'Z');
fragment DIGIT		: '0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';

// catch all
INC_UNKNOWN_ITEM	: .;

// ################################### end ##############################
