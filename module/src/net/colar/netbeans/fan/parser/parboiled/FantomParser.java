package net.colar.netbeans.fan.parser.parboiled;

import net.colar.netbeans.fan.parser.FanParserTask;
import org.parboiled.Rule;
import net.colar.netbeans.fan.parser.parboiled.FantomLexerTokens.TokenName;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.annotations.SuppressSubnodes;

/**
 * Parboiled parser for the Fantom Language (Builds on the Lexer base)
 *
 * Current for Fantom grammar 1.0.63
 *
 * Grammar spec:
 * http://fantom.org/doc/docLang/Grammar.html
 *
 * Test Suite: net.colar.netbeans.fan.Test.FantomParserTest
 *
 * Note: ast.newNode() calls create ast nodes, using the last node matched (LAST_NODE())
 *		 ast.newScopeNode(), does the same for items that should introduce a scope.
 *
 * @author thibautc
 */
@SuppressWarnings(
{
    "InfiniteRecursion"
})
@BuildParseTree 
public class FantomParser extends FantomLexer
{
    //Note: Fields in PB parse can NOT be private

    public FantomParserAstActions ast = new FantomParserAstActions();
    boolean inFieldInit = false; // to help with differentiation of field accesor & itBlock
    boolean inEnum = false; // so we know whether to allow enumDefs
    // TODO: See if I can do away with this one and simplify  the map /simpelMap stuff
    boolean noSimpleMap = false; // to disallow ambigous simpleMaps in certain situations (within another map, ternaryExpr)
    /**Parse task that kicked in this parser*/
    final FanParserTask parserTask;
    public boolean quickScan = false; // allows for top level ony parsing (slot defs)

    public FantomParser(FanParserTask parserTask)
    {
        this.parserTask = parserTask;
    }

    /** 
     * Overrides dsl
     * We need more infos in the parser
    */ 
    @Override
    public Rule dsl()
    {
        return Sequence(Sequence(simpleType(), ast.newNode(net.colar.netbeans.fan.parser.parboiled.AstKind.AST_TYPE)),
               Sequence(DSL_OPEN, OPT_LF(), ZeroOrMore(Sequence(TestNot(DSL_CLOSE), ANY)), OPT_LF(), DSL_CLOSE));
    }
    
    /**
     * Overrides spacing
     * Unlike lexer we want to "swallow" all spacing and comments
     * @return 
     */
    @Override
    @SuppressSubnodes
    public Rule spacing()
    {
        return OneOrMore(FirstOf(
                // whitespace (Do NOT eat \n since it can be meaningful)
                whiteSpace(), comment())).label(TokenName.SPACING.name());
    }
    
    // ------------ Comp Unit --------------------------------------------------
    public Rule compilationUnit()
    {
        return Sequence(
                OPT_LF(),
                OPT_SP(),
                Sequence(
                // Missing from grammar: Optional unix env line
                Optional(unixLine()),
                ZeroOrMore(FirstOf(using(), incUsing())),
                ZeroOrMore(typeDef()),
                OPT_LF(),
                ZeroOrMore(doc()) // allow for extra docs at end of file (if last type commented out)
                // Create comp. unit AST node (root node)
                ), ast.newRootNode(AstKind.AST_COMP_UNIT, parserTask),
                OPT_LF(),
                EOI);
    }

    public Rule using()
    {
        return Sequence(OPT_LF(), Sequence(
                KW_USING,
                Optional(ffi()),
                Sequence(id(),
                ZeroOrMore(Sequence(DOT, id())),
                Optional(Sequence(SP_COLCOL, id()))), ast.newNode(AstKind.AST_ID),
                Optional(usingAs()),
                eos()), ast.newNode(AstKind.AST_USING), OPT_LF());
    }

    // Incomplete using - to allow for completion
    public Rule incUsing()
    {
        return Sequence(OPT_LF(), Sequence(
                KW_USING,
                Optional(ffi()),
                Sequence(Optional(id()), // Not Optional, but we want a valid ast for completion if missing
                ZeroOrMore(Sequence(DOT, Optional(id()))),// not enforced to allow completion
                Optional(Sequence(SP_COLCOL, Optional(id())))), ast.newNode(AstKind.AST_ID),// not enforced to allow completion
                Optional(Sequence(Sequence(KW_AS, Optional(id())), ast.newNode(AstKind.AST_USING_AS))),
                eos()), ast.newNode(AstKind.AST_INC_USING), OPT_LF());
    }

    public Rule ffi()
    {
        return Sequence(SQ_BRACKET_L, Sequence(id(), ast.newNode(AstKind.AST_USING_FFI)), SQ_BRACKET_R);
    }

    public Rule usingAs()
    {
        return Sequence(KW_AS, Sequence(id(), ast.newNode(AstKind.AST_USING_AS)));
    }

    public Rule staticBlock()
    {
        return Sequence(KW_STATIC, OPT_LF(), Sequence(BRACKET_L, ZeroOrMore(stmt()), OPT_LF(), BRACKET_R), ast.newScopeNode(AstKind.AST_BLOCK), OPT_LF());
    }

    // ------------- Type def --------------------------------------------------
    public Rule typeDef()
    {
        // grouped together classdef, enumDef, mixinDef & facetDef as they are grammatically very similar (optimized)
        return Sequence(
                setInEnum(false),
                OPT_LF(),
                Sequence(
                Optional(doc()),
                ZeroOrMore(facet()),
                Optional(protection()),
                Sequence(
                FirstOf(
                // Some fantom code has protection after modifiers, so allowing that
                Sequence(Sequence(ZeroOrMore(Sequence(FirstOf(KW_NATIVE, KW_ABSTRACT, KW_FINAL, KW_CONST), ast.newNode(AstKind.AST_MODIFIER))), Optional(protection()), KW_CLASS), ast.newNode(AstKind.AST_CLASS)), // standard class
                Sequence(ENUM, KW_CLASS, setInEnum(true), ast.newNode(AstKind.AST_ENUM)), // enum class
                Sequence(FACET, KW_CLASS, ast.newNode(AstKind.AST_FACET)), // facet class
                Sequence(Sequence(Optional(Sequence(KW_CONST, ast.newNode(AstKind.AST_MODIFIER))), KW_MIXIN), ast.newNode(AstKind.AST_MIXIN)) // mixin
                ),
                Sequence(id(), ast.newNode(AstKind.AST_ID)),
                Optional(inheritance()),
                OPT_LF(),
                Sequence(Sequence(
                BRACKET_L,
                OPT_LF(),
                Optional(Sequence(Test(inEnum), Optional(enumValDefs()))), // only valid for enums, but simplifying
                // Static block missing from Fan grammar
                ZeroOrMore(FirstOf(staticBlock(), slotDef())),
                BRACKET_R), ast.newNode(AstKind.AST_BLOCK)))),
                ast.newScopeNode(AstKind.AST_TYPE_DEF), OPT_LF());
    }

    public Rule protection()
    {
        return Sequence(FirstOf(KW_PUBLIC, KW_PROTECTED, KW_INTERNAL, KW_PRIVATE), ast.newNode(AstKind.AST_MODIFIER));
    }

    public Rule inheritance()
    {
        return Sequence(SP_COL, Sequence(typeList(), ast.newNode(AstKind.AST_INHERITANCE)));
    }

    // ------------- Facets ----------------------------------------------------
    public Rule facet()
    {
        return Sequence(AT, simpleType(), Optional(facetVals()), OPT_LF());
    }

    public Rule facetVals()
    {
        return Sequence(
                OPT_LF(),
                BRACKET_L,
                Optional(
                    Sequence(
                    facetVal(),
                    ZeroOrMore(Sequence(eos(), facetVal())))
                ),
                OPT_LF(),
                BRACKET_R);
    }

    public Rule facetVal()
    {
        return Sequence(OPT_LF(), id(), AS_EQUAL, expr());
    }

    //------------------- Slot Def ---------------------------------------------
    public Rule enumValDefs()
    {
        return Sequence(Sequence(Sequence(enumValDef(), ZeroOrMore(Sequence(SP_COMMA, enumValDef()))), ast.newNode(AstKind.AST_ENUM_DEFS)), eos());
    }

    public Rule enumValDef()
    {
        // Fantom grammar is missing "doc"
        return Sequence(OPT_LF(), Optional(doc()), Sequence(id(), ast.newNode(AstKind.AST_ENUM_NAME)), Optional(Sequence(PAR_L, Optional(args()), PAR_R)));
    }

    public Rule slotDef()
    {
        // Rewrote this to "unify" slots common parts (for better performance)
        return Sequence(
                OPT_LF(),
                Sequence(Sequence(
                Optional(doc()),// common to all slots
                ZeroOrMore(facet()),// common to all slots
                Optional(protection()),// common to all slots
                FirstOf(
                ctorDef(), // look for 'new'
                methodDef(), // look for params : '('
                fieldDef())), // others
                ast.newNode(AstKind.AST_SLOT_DEF)),
                OPT_LF());
    }

    public Rule fieldDef()
    {
        return Sequence(Sequence(Sequence(
                ZeroOrMore(Sequence(FirstOf(KW_ABSTRACT, KW_CONST, KW_FINAL, KW_STATIC,
                KW_NATIVE, KW_OVERRIDE, KW_READONLY, KW_VIRTUAL), ast.newNode(AstKind.AST_MODIFIER))),
                // Some fantom code has protection after modifiers, so allowing that
                Optional(protection()),
                /*typeAndOrId(), // Type required for fields(no infered) (Grammar does not say so)*/
                Sequence(type(), ast.newNode(AstKind.AST_TYPE)),
                Sequence(id(), ast.newNode(AstKind.AST_ID)),
                setFieldInit(true),
                Optional(Sequence(AS_INIT, OPT_LF(), expr())),
                Optional(fieldAccessor()),
                setFieldInit(false)), ast.newNode(AstKind.AST_FIELD_DEF)),
                eos());
    }

    public Rule methodDef()
    {
        return Sequence(Sequence(
                Sequence(
                // Fan grammar misses 'final'
                ZeroOrMore(Sequence(FirstOf(KW_ABSTRACT, KW_NATIVE, KW_ONCE, KW_STATIC,
                KW_OVERRIDE, KW_VIRTUAL, KW_FINAL), ast.newNode(AstKind.AST_MODIFIER))),
                // Some fantom code has protection after modifiers, so allowing that
                Optional(protection()),
                Sequence(type(), ast.newNode(AstKind.AST_TYPE)),
                Sequence(id(), ast.newNode(AstKind.AST_ID)),
                PAR_L),
                Optional(params()),
                PAR_R,
                methodBody()), ast.newNode(AstKind.AST_METHOD_DEF)); // nees own scope because of params
    }

    public Rule ctorDef()
    {
        return Sequence(Sequence(
                Optional(KW_STATIC),
                KW_NEW,
                Sequence(id(), ast.newNode(AstKind.AST_ID)),
                PAR_L,
                Optional(params()),
                PAR_R,
                Optional( // ctorChain
                // Fantom  Grammar page is missing the ':'
                Sequence(Sequence(OPT_LF(), SP_COL),
                FirstOf(
                Sequence(KW_THIS, DOT, id(), Sequence(PAR_L, Optional(args()), PAR_R)),
                Sequence(KW_SUPER, Optional(Sequence(DOT, id())), Sequence(PAR_L, Optional(args()), PAR_R))))),
                methodBody()), ast.newNode(AstKind.AST_CTOR_DEF));
    }

    public Rule methodBody()
    {
        return quickScan ? unparsedMethodBody() : Sequence(FirstOf(
                Sequence(Sequence(OPT_LF(), BRACKET_L), ZeroOrMore(stmt()), OPT_LF(), BRACKET_R),
                eos()), ast.newScopeNode(AstKind.AST_BLOCK), OPT_LF()); // method with no body
    }

    /** When doing a quick scan for types, we don't care to dig any deeper than this **/
    public Rule unparsedMethodBody()
    {
        return Sequence(FirstOf(
                Sequence(Sequence(OPT_LF(), BRACKET_L), ZeroOrMore(dummyBody()), BRACKET_R),
                eos()), ast.newScopeNode(AstKind.AST_BLOCK), OPT_LF()); // method with no body
    }
    
    /**
     * Try to quickly skip a whole method body when we don't care about it.
     * Basically looking for matching closing bracket, being careful to skip those in comments or strings...
     * @return 
     */
    public Rule dummyBody()
    {
        return FirstOf(comment(), strs(), uri(), char_(),
               Sequence(BRACKET_L, ZeroOrMore(dummyBody()), BRACKET_R),               
               Sequence(TestNot(BRACKET_R), ANY));
    }

    public Rule params()
    {
        return Sequence(param(), ZeroOrMore(Sequence(SP_COMMA, params())));
    }

    public Rule param()
    {
        return Sequence(OPT_LF(),
                Sequence(Sequence(Sequence(type(), ast.newNode(AstKind.AST_TYPE)), Sequence(id(), ast.newNode(AstKind.AST_ID)), Optional(Sequence(AS_INIT, expr()))),
                ast.newNode(AstKind.AST_PARAM)),
                OPT_LF());
    }

    public Rule fieldAccessor()
    {
        return Sequence(OPT_LF(),
                Sequence(
                BRACKET_L,
                Optional(Sequence(OPT_LF(), Sequence(GET, FirstOf(block(), eos())))),
                Optional(Sequence(OPT_LF(), Optional(protection()), Sequence(SET, FirstOf(block(), eos())))),
                // allows for setter to be before getter
                Optional(Sequence(OPT_LF(), Sequence(GET, FirstOf(block(), eos())))),
                BRACKET_R), ast.newNode(AstKind.AST_FIELD_ACCESSOR)); // do not consume trailing LF, since fieldDef looks for EOS
    }

    public Rule args()
    {
        return Sequence(Sequence(expr(), ast.newNode(AstKind.AST_ARG)),
                ZeroOrMore(
                Sequence(OPT_LF(),
                Sequence(SP_COMMA, OPT_LF(), Sequence(expr(), ast.newNode(AstKind.AST_ARG))))),
                OPT_LF());
    }

    // ------------ Statements -------------------------------------------------
    public Rule block()
    {
        if(cancel)
        {
            throw new RuntimeException("Parser cancelled");
        }
        return Sequence(OPT_LF(), FirstOf(
                Sequence(BRACKET_L, ZeroOrMore(stmt()), OPT_LF(), BRACKET_R),
                stmt() // single statement
                ), ast.newScopeNode(AstKind.AST_BLOCK), OPT_LF());
    }

    public Rule stmt()
    {
        if(cancel){
            throw new RuntimeException("Parser cancelled");
        }
        return Sequence(TestNot(BRACKET_R), OPT_LF(),
                FirstOf(
                Sequence(KW_BREAK, eos()),
                Sequence(KW_CONTINUE, eos()),
                Sequence(KW_RETURN, Sequence(Optional(expr()), eos())),
                Sequence(KW_THROW, expr(), eos()),
                if_(),
                for_(),
                switch_(),
                while_(),
                try_(),
                // check local var definition as it's faster to parse ':='
                localDef(),
                // otherwise expression (Optional Comma for itAdd expression)
                // using FirstOf, because "," in this case can be considered an end of statement
                Sequence(expr(), FirstOf(Sequence(SP_COMMA, Optional(eos())), eos()))),
                OPT_LF());
    }

    public Rule for_()
    {
        return Sequence(Sequence(KW_FOR, PAR_L,
                // LocalDef consumes the SEMI as part of loking for EOS, so rewrote to deal with this
                FirstOf(SP_SEMI, FirstOf(localDef(), Sequence(expr(), SP_SEMI))),
                FirstOf(SP_SEMI, Sequence(expr(), SP_SEMI)),
                Optional(expr()),
                PAR_R,
                block()), ast.newScopeNode(AstKind.AST_FOR_LOOP)); // introducing a scopr for the loop var
    }

    public Rule if_()
    {
        // using condExpr rather than expr
        return Sequence(KW_IF, PAR_L, condOrExpr(), PAR_R, block(),
                Optional(Sequence(KW_ELSE, block())));
    }

    public Rule while_()
    {
        // using condExpr rather than expr
        return Sequence(KW_WHILE, PAR_L, condOrExpr(), PAR_R, block());
    }

    public Rule localDef()
    {
        // slight change from the grammar to match either:
        // 'Int j', 'j:=27', 'Int j:=27'
        return Sequence(
                FirstOf(
                // fan parser says if it's start with "id :=" or "Type, id", then it gotta be a localDef (enforce)
                Sequence(typeAndId(), AS_INIT, OPT_LF(), expr()),
                // same if it starts with "id :="
                Sequence(Sequence(id(), ast.newNode(AstKind.AST_ID), AS_INIT), OPT_LF(), expr()),
                // var def with no value
                typeAndId()),
                ast.newNode(AstKind.AST_LOCAL_DEF),
                eos());
    }

    public Rule typeAndId()
    {
        return Sequence(Sequence(Sequence(type(), ast.newNode(AstKind.AST_TYPE)), Sequence(id(), ast.newNode(AstKind.AST_ID))), ast.newNode(AstKind.AST_TYPE_AND_ID));
    }

    public Rule try_()
    {
        return Sequence(KW_TRY, block(), ZeroOrMore(catch_()),
                Optional(Sequence(KW_FINALLY, block())));
    }

    public Rule catch_()
    {
        return Sequence(Sequence(KW_CATCH,
                Optional(Sequence(PAR_L, Sequence(type(),
                ast.newNode(AstKind.AST_TYPE)), Sequence(id(),
                ast.newNode(AstKind.AST_ID)), PAR_R)), block()),
                ast.newNode(AstKind.AST_CATCH_BLOCK));
    }

    public Rule switch_()
    {
        // Note: unlike java, fan as a scope for each 'case'
        return Sequence(Sequence(KW_SWITCH, PAR_L, expr(), PAR_R,
                OPT_LF(), BRACKET_L, OPT_LF(),
                ZeroOrMore(Sequence(Sequence(
                OneOrMore(Sequence(KW_CASE, setNoSimpleMap(true), expr(), setNoSimpleMap(false), SP_COL, OPT_LF())),
                ZeroOrMore(Sequence(stmt(), OPT_LF()))), ast.newScopeNode(AstKind.AST_SWITCH_CASE))),
                Optional(Sequence(Sequence(KW_DEFAULT, SP_COL, ZeroOrMore(Sequence(stmt(), OPT_LF()))),
                ast.newScopeNode(AstKind.AST_SWITCH_CASE))),
                OPT_LF(), BRACKET_R), ast.newScopeNode(AstKind.AST_SWITCH));
    }

    // ----------- Expressions -------------------------------------------------
    public Rule expr()
    {
        return Sequence(assignExpr(), ast.newNode(AstKind.AST_EXPR));
    }

    public Rule assignExpr()
    {
        // check '=' first as is most common
        // moved localDef to statement since it can't be on the right hand side
        return Sequence(ifExpr(), Optional(Sequence(FirstOf(AS_EQUAL, AS_OPS), OPT_LF(), Sequence(assignExpr(), ast.newNode(AstKind.AST_EXPR_ASSIGN)))));
    }

    public Rule ifExpr()
    {
        // rewritten (together with ternaryTail, elvisTail) such as we check condOrExpr only once
        // this makes a gigantic difference in parser speed form original grammar
        return Sequence(condOrExpr(),
                Optional(FirstOf(elvisTail(), ternaryTail())));
    }

    public Rule ternaryTail()
    {
        return Sequence(Sequence(OPT_LF(), SP_QMARK), OPT_LF(), setNoSimpleMap(true), ifExprBody(), setNoSimpleMap(false), OPT_LF(), SP_COL, OPT_LF(), ifExprBody());
    }

    public Rule elvisTail()
    {
        return Sequence(Sequence(OPT_LF(), OP_ELVIS), OPT_LF(), ifExprBody());
    }

    public Rule ifExprBody()
    {
        return FirstOf(Sequence(KW_THROW, expr()), condOrExpr());
    }

    public Rule condOrExpr()
    {
        return Sequence(condAndExpr(), ZeroOrMore(Sequence(OP_OR, OPT_LF(), condAndExpr())));
    }

    public Rule condAndExpr()
    {
        return Sequence(equalityExpr(), ZeroOrMore(Sequence(OP_AND, OPT_LF(), equalityExpr())));
    }

    public Rule equalityExpr()
    {
        return Sequence(relationalExpr(), ZeroOrMore(Sequence(CP_EQUALITY, OPT_LF(), relationalExpr())));
    }

    public Rule relationalExpr()
    {
        // Changed (with typeCheckTail, compareTail) to check for rangeExpr only once (way faster)
        return Sequence(rangeExpr(), Optional(FirstOf(typeCheckTail(), compareTail())));
    }

    public Rule typeCheckTail()
    {
        // changed to required, otherwise consumes all rangeExpr and compare never gets evaled
        return Sequence(Sequence(
                FirstOf(KW_IS, KW_ISNOT, KW_AS),
                Sequence(type(),
                ast.newNode(AstKind.AST_TYPE))),
                ast.newNode(AstKind.AST_EXPR_TYPE_CHECK));
    }

    public Rule compareTail()
    {
        // changed to not be ZeroOrMore as there can be only one comparaison check in an expression (no 3< x <5)
        return /*ZeroOrMore(*/ Sequence(CP_COMPARATORS, OPT_LF(), rangeExpr())/*)*/;
    }

    public Rule rangeExpr()
    {
        // changed to not be ZeroOrMore(opt instead) as there can be only one range in an expression (no [1..3..5])
        return Sequence(Sequence(Sequence(addExpr(), ast.newNode(AstKind.AST_EXPR)),
                Optional(Sequence(FirstOf(OP_RANGE_EXCL, OP_RANGE), OPT_LF(), Sequence(addExpr(), ast.newNode(AstKind.AST_EXPR))))),
                ast.newNode(AstKind.AST_EXPR_RANGE));
    }

    public Rule addExpr()
    {
        return Sequence(multExpr(),
                // checking it's not '+=' or '-=', so we can let assignExpr happen
                ZeroOrMore(Sequence(Sequence(FirstOf(OP_PLUS, OP_MINUS), TestNot(AS_EQUAL)), OPT_LF(), Sequence(multExpr(), ast.newNode(AstKind.AST_EXPR_ADD)))));
    }

    public Rule multExpr()
    {
        return Sequence(parExpr(),
                // checking it's not '*=', '/=' or '%=', so we can let assignExpr happen
                ZeroOrMore(Sequence(Sequence(FirstOf(OP_MULT, OP_DIV, OP_MODULO), TestNot(AS_EQUAL)), OPT_LF(), Sequence(parExpr(), ast.newNode(AstKind.AST_EXPR_MULT)))));
    }

    public Rule parExpr()
    {
        return FirstOf(castExpr(), groupedExpr(), unaryExpr());
    }

    public Rule castExpr()
    {
        return Sequence(Sequence(PAR_L, Sequence(type(), ast.newNode(AstKind.AST_TYPE)), PAR_R, Sequence(parExpr(), ast.newNode(AstKind.AST_EXPR))), ast.newNode(AstKind.AST_EXR_CAST));
    }

    public Rule groupedExpr()
    {
        return Sequence(PAR_L, OPT_LF(), expr(), OPT_LF(), PAR_R, ZeroOrMore(termChain()));
    }

    public Rule unaryExpr()
    {
        // grouped with postfixEpr to avoid looking for termExpr twice (very slow parsing !)
        return FirstOf(prefixExpr(), Sequence(termExpr(), Optional(FirstOf(OP_2MINUS, OP_2PLUS))));
    }

    public Rule prefixExpr()
    {
        return Sequence(
                FirstOf(OP_CURRY, OP_BANG, OP_2PLUS, OP_2MINUS, OP_PLUS, OP_MINUS),
                parExpr());
    }

    public Rule termExpr()
    {
        return Sequence(termBase(), ZeroOrMore(termChain()));
    }

    public Rule termBase()
    {
        // check for ID alone last (and not as part of idExpr) otherwise it would never check literal & typebase !
        return FirstOf(idExprReq(), litteral(), typeBase(), Sequence(id(), ast.newNode(AstKind.AST_ID)));
    }

    public Rule typeBase()
    {
        return FirstOf(
                Sequence(Sequence(OP_POUND, id()), ast.newNode(AstKind.AST_TYPE_LITTERAL)), // slot litteral (without type)
                closure(),
                Sequence(dsl(), ast.newNode(AstKind.AST_DSL)), // DSL
                // Optimized by grouping all the items that start with "type" (since looking for type if resource intensive)
                Sequence(Sequence(type(), ast.newNode(AstKind.AST_ID)),
                FirstOf(
                Sequence(Sequence(OP_POUND, Optional(id())), ast.newNode(AstKind.AST_TYPE_LITTERAL)), // type/slot litteral
                Sequence(DOT, Sequence(KW_SUPER, ast.newNode(AstKind.AST_CALL))), // named super
                Sequence(Sequence(Sequence(DOT, ast.newNode(AstKind.LBL_OP)), idExpr()), ast.newNode(AstKind.AST_CALL_EXPR)), // static call
                Sequence(PAR_L, expr(), PAR_R), // simple ?? (ctor call)
                ctorBlock() // ctor block
                )));
    }

    public Rule ctorBlock()
    {
        return Sequence(
                OPT_LF(),
                Sequence(Sequence(BRACKET_L,
                // Note, don't allow field accesors to be parsed as ctorBlock
                TestNot(Sequence(inFieldInit, OPT_LF(), FirstOf(protection(), KW_STATIC, KW_READONLY, GET, SET, GET, SET)))),
                ZeroOrMore(stmt()), BRACKET_R), ast.newScopeNode(AstKind.AST_CTOR_BLOCK));
    }

    public Rule closure()
    {
        return Sequence(Sequence(OPT_LF(), funcType(), OPT_LF(),
                Sequence(Sequence(BRACKET_L, ZeroOrMore(stmt()), BRACKET_R), ast.newScopeNode(AstKind.AST_BLOCK))), ast.newNode(AstKind.AST_CLOSURE));
    }

    public Rule itBlock()
    {
        return Sequence(
                OPT_LF(),
                Sequence(Sequence(BRACKET_L,
                // Note, don't allow field accesors to be parsed as itBlock
                TestNot(Sequence(inFieldInit, OPT_LF(), FirstOf(protection(), KW_STATIC, KW_READONLY, GET, SET, GET, SET)/*, echo("Skipping itBlock")*/))),
                ZeroOrMore(stmt()), BRACKET_R), ast.newScopeNode(AstKind.AST_IT_BLOCK));
    }

    public Rule termChain()
    {
        return Sequence(OPT_LF(),
                FirstOf(safeDotCall(), safeDynCall(), dotCall(), dynCall(), indexExpr(),
                callOp(), itBlock(), incCall()));
    }

    public Rule dotCall()
    {
        // Test not "..", as this would be a range
        return Sequence(Sequence(Sequence(Sequence(DOT, TestNot(DOT)), ast.newNode(AstKind.LBL_OP)), idExpr()), ast.newNode(AstKind.AST_CALL_EXPR));
    }

    public Rule dynCall()
    {
        return Sequence(Sequence(Sequence(OP_ARROW, ast.newNode(AstKind.LBL_OP)), idExpr()), ast.newNode(AstKind.AST_CALL_EXPR));
    }

    public Rule safeDotCall()
    {
        return Sequence(Sequence(Sequence(OP_SAFE_CALL, ast.newNode(AstKind.LBL_OP)), idExpr()), ast.newNode(AstKind.AST_CALL_EXPR));
    }

    public Rule safeDynCall()
    {
        return Sequence(Sequence(Sequence(OP_SAFE_DYN_CALL, ast.newNode(AstKind.LBL_OP)), idExpr()), ast.newNode(AstKind.AST_CALL_EXPR));
    }

    // incomplete dot call, make valid to allow for completion
    //TODO: this is not shown as an error
    public Rule incCall()
    {
        return Sequence(TestNot(Sequence(DOT, DOT)), // DOT DOT would be a range.
                FirstOf(OP_SAFE_DYN_CALL, OP_SAFE_CALL, OP_ARROW, DOT), ast.newNode(AstKind.AST_INC_CALL));
    }

    public Rule idExpr()
    {
        // this can be either a local def(toto.value) or a call(toto.getValue or toto.getValue(<params>)) + opt. closure
        return FirstOf(idExprReq(),
                Sequence(
                Sequence(id(), ast.newNode(AstKind.AST_ID)), ast.newNode(AstKind.AST_CALL)));
    }

    public Rule idExprReq()
    {
        // Same but without matching ID by itself (this would prevent termbase from checking literals).
        return FirstOf(field(), call());
    }

    // require '*' otherwise it's just and ID (this would prevent termbase from checking literals)
    public Rule field()
    {
        return Sequence(OP_CURRY, Sequence(id(), ast.newNode(AstKind.AST_ID)));
    }

    // require params or/and closure, otherwise it's just and ID (this would prevent termbase from checking literals)
    public Rule call()
    {
        return Sequence(Sequence(Sequence(id(), ast.newNode(AstKind.AST_ID)),
                FirstOf(
                Sequence(noSpace(), Sequence(PAR_L, OPT_LF(), Optional(args()), PAR_R), Optional(closure())), //params & opt. closure
                closure())), ast.newNode(AstKind.AST_CALL)); // closure only
    }

    public Rule indexExpr()
    {
        return Sequence(noSpace(), SQ_BRACKET_L, Sequence(expr(), ast.newNode(AstKind.AST_EXPR_INDEX)), SQ_BRACKET_R);
    }

    public Rule callOp()
    {
        return Sequence(noSpace(), PAR_L, Optional(args()), PAR_R, Optional(closure()));
    }

    public Rule litteral()
    {
        return FirstOf(litteralBase(), list(), map());
    }

    public Rule litteralBase()
    {
        if(cancel){
            throw new RuntimeException("Parser cancelled!");
        }
        return Sequence(FirstOf(KW_NULL.label("null"), KW_THIS.label("this"), KW_SUPER.label("super"), 
                KW_IT.label("it"), KW_TRUE.label("true"), KW_FALSE.label("false"),
                strs(), uri(), number(), char_())
                // copy child label as the ast node label, will help with litteral resolution
                , ast.litNode(AstKind.AST_EXPR_LIT_BASE));
    }

    public Rule list()
    {
        return Sequence(Sequence(
                Optional(Sequence(type(), ast.newNode(AstKind.AST_TYPE))), OPT_LF(),
                SQ_BRACKET_L, OPT_LF(), listItems(), OPT_LF(), SQ_BRACKET_R), ast.newNode(AstKind.AST_LIST));
    }

    public Rule listItems()
    {
        return FirstOf(
                SP_COMMA,
                // allow extra comma
                Sequence(expr(), ZeroOrMore(Sequence(SP_COMMA, OPT_LF(), expr())), Optional(SP_COMMA)));
    }

    public Rule map()
    {
        return Sequence(Sequence(
                Optional(Sequence(FirstOf(mapType(), simpleMapType()), ast.newNode(AstKind.AST_TYPE))),
                // Not enforced to allow resolving list of typed maps like [Str:Int][]
                Sequence(SQ_BRACKET_L, OPT_LF(), mapItems(), OPT_LF(), SQ_BRACKET_R)), ast.newNode(AstKind.AST_MAP));
    }

    public Rule mapItems()
    {
        return FirstOf(SP_COL,//empty map
                // allow extra comma
                Sequence(mapPair(), ZeroOrMore(Sequence(SP_COMMA, OPT_LF(), mapPair())), Optional(SP_COMMA)));
    }

    public Rule mapPair()
    {
        // allowing all expressions is probably more than really needed
        return Sequence(Sequence(expr(), Sequence(SP_COL, expr())), ast.newNode(AstKind.AST_MAP_PAIR));
    }

    public Rule mapItem()
    {
        return expr();
    }

    /** Rewrote more like Fantom Parser (simpler & faster) - look for type base then listOfs, mapOfs notations
     * Added check so that the "?" (nullable type indicator) cannot be separated from it's type (noSpace)
     * @return
     */
    public Rule type()
    {
        return Sequence(
                FirstOf(
                mapType(),
                funcType(),
                Sequence(id(), Optional(Sequence(noSpace(), SP_COLCOL, noSpace(), id())))),
                // Look for Optional map/list/nullable items
                // Note: ? folowed by a dot is nor part of the type (null check call)
                Optional(Sequence(noSpace(), SP_QMARK, TestNot(DOT))), //nullable
                ZeroOrMore(Sequence(noSpace(), SQ_BRACKET_L, SQ_BRACKET_R)),//list(s)
                // Do not allow simple maps within left side of expressions ... this causes issues with ":"
                Optional(Sequence(TestNot(noSimpleMap), SP_COL, type())),//simple map Int:Str
                Optional(Sequence(noSpace(), SP_QMARK, TestNot(DOT))) // nullable list/map
                );
    }

    public Rule simpleMapType()
    {
        // It has to be other nonSimpleMapTypes, otherwise it's left recursive (loops forever)
        return Sequence(nonSimpleMapTypes(), SP_COL, nonSimpleMapTypes(),
                Optional(
                // Not enforcing [] because of problems with maps like this Str:int["":5]
                Sequence(Optional(Sequence(noSpace(), SP_QMARK, TestNot(DOT))), SQ_BRACKET_L, SQ_BRACKET_R)), // list of '?[]'
                Optional(Sequence(noSpace(), SP_QMARK, TestNot(DOT)))); // nullable
    }

    // all types except simple map
    public Rule nonSimpleMapTypes()
    {
        return Sequence(
                FirstOf(funcType(), mapType(), simpleType()),
                Optional(
                // Not enforcing [] because of problems with maps like this Str:int["":5]
                Sequence(Optional(Sequence(noSpace(), SP_QMARK, TestNot(DOT))), SQ_BRACKET_L, SQ_BRACKET_R)), // list of '?[]'
                Optional(Sequence(noSpace(), SP_QMARK, TestNot(DOT)))); // nullable
    }

    public Rule simpleType()
    {
        return Sequence(
                id(),
                Optional(Sequence(SP_COLCOL, id())));
    }

    public Rule mapType()
    {
        // We use nonSimpleMapTypes here as well, because [Str:Int:Str] would be confusing
        // not enforced to allow map rule to work ([Int:Str][5,""])
        return Sequence(SQ_BRACKET_L, nonSimpleMapTypes(), SP_COL, nonSimpleMapTypes(), SQ_BRACKET_R);
    }

    public Rule funcType()
    {
        return Sequence(
                TestNot(OP_OR), // '||' that's a logical OR not a function type
                // '|' could be the closing pipe so we can't enforce
                Sequence(SP_PIPE,
                FirstOf(
                // First we check for one with no formals |->| or |->Str|
                Sequence(OP_ARROW, Optional(Sequence(type(), ast.newNode(AstKind.AST_TYPE)))),
                // Then we check for one with formals |Int i| or maybe full: |Int i -> Str|
                Sequence(formals(), Optional(Sequence(OP_ARROW, Optional(Sequence(type(), ast.newNode(AstKind.AST_TYPE))))))),
                SP_PIPE));
    }

    public Rule formals()
    {
        // Allowing funcType within formals | |Int-Str a| -> Str|
        return Sequence(
                formal(),
                ZeroOrMore(Sequence(SP_COMMA, formal())));
    }

    public Rule typeList()
    {
        return Sequence(Sequence(type(), ast.newNode(AstKind.AST_TYPE)), ZeroOrMore(Sequence(SP_COMMA, Sequence(type(), ast.newNode(AstKind.AST_TYPE)))));
    }

    public Rule formal()
    {
        // Note it can be "type id", "type" or "id"
        // but parser can't know if it's "type" or "id" so always recognize as type
        // so would never actually hit id()
        return Sequence(FirstOf(
                typeAndId(),
                Sequence(type(), ast.newNode(AstKind.AST_ID))) /*, id()*/, ast.newNode(AstKind.AST_FORMAL));
    }
    // ------------ Misc -------------------------------------------------------

    @SuppressSubnodes
    public Rule id()
    {
        return Sequence(TestNot(keyword()),
                Sequence(FirstOf(CharRange('A', 'Z'), CharRange('a', 'z'), "_"),
                ZeroOrMore(FirstOf(CharRange('A', 'Z'), CharRange('a', 'z'), '_', CharRange('0', '9')))),
                OPT_SP).label(TokenName.ID.name());
    }

    // A Few "special" Non keyword but meningful items
    public final Rule ENUM = keyword("enum");
    public final Rule FACET = keyword("facet");
    public final Rule GET = keyword("get");
    public final Rule SET = keyword("set");

    // ----------- Custom action rules -----------------------------------------
    /**
     * Custom action to find an end of statement
     * @return
     */
    @SuppressSubnodes
    public Rule eos()
    {
        return Sequence(OPT_SP, FirstOf(
                SP_SEMI, // ;
                LF(), // \n
                Test(BRACKET_R), // '}' is end of statement too, but do NOT consume it !
                Test(EOI))); // EOI is end of statement too, but do NOT consume it !
    }

    /**Pass if not following some whitespace*/
    public Rule noSpace()
    {
        return TestNot(toRule(afterSpace()));
    }

    public boolean afterSpace()
    {
        //char c = getContext().getCurrentLocation().lookAhead(getContext().getInputBuffer(), -1);
        int index = getContext().getCurrentIndex();
        char c = getContext().getInputBuffer().charAt(index - 1);
        return Character.isWhitespace(c);
    }

    public boolean setFieldInit(boolean val)
    {
        inFieldInit = val;
        return true;
    }

    public boolean setNoSimpleMap(boolean val)
    {
        noSimpleMap = val;
        return true;
    }

    public boolean setInEnum(boolean val)
    {
        inEnum = val;
        return true;
    }

    // Debugging utils
    /** System.out - eval to true*/
    public boolean echo(String str)
    {
        System.out.println(str);
        return true;
    }

    /** System.out - eval to false*/
    public boolean echof(String str)
    {
        System.out.println(str);
        return false;
    }

    /** System.out current node path - eval to true*/
    public boolean printPath()
    {
        System.out.println(getContext().getPath());
        return true;
    }

    // for unit tsting
    public Rule testExpr()
    {
        return Sequence(expr(), ast.newRootNode(AstKind.DUMMY_ROOT_NODE, parserTask));
    }

    public void setQuickScan(boolean quickScan) {
        this.quickScan = quickScan;
    }

    public boolean getQuicScan() {
        return quickScan;
    }        
}
