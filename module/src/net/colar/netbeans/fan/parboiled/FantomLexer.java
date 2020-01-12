/*
 * Thibaut Colar Apr 1, 2010
 */
package net.colar.netbeans.fan.parboiled;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.annotations.SuppressSubnodes;

/**
 * Lexer : With parboiled the Lexer is just  a lightweight parser that creates tokens
 * @author thibautc
 */
@BuildParseTree
public class FantomLexer extends BaseParser<AstNode> {

    public boolean cancel;
    
    // ============ Simulate a lexer ===========================================
    // This should just create tokens for the items we want to highlight(color) in the IDE
    // It should be able to deal with "Anything" and not ever fail if possible.
    public Rule lexer()
    {
        // If Any changes made here, keep in sync with lexerTokens list in FantomParserTokens.java
        return Sequence(
                ZeroOrMore(lexerItem()).label("lexerItems"),
                Optional(EOI)); // until end of file
    }

    public Rule lexerItem()
    {
        return FirstOf(
                comment(), unixLine(), doc(),
                strs(), uri(), char_(), dsl(),
                lexerInit(), lexerComps(), lexerAssign(), lexerOps(), lexerSeps(), // operators/separators
                BRACKET_L, BRACKET_R, SQ_BRACKET_L, SQ_BRACKET_R, PAR_L, PAR_R, DOT, AT, DSL_CLOSE, DSL_OPEN, // other known items
                keyword(), lexerId(), number(), LF(), spacing(),
                
                // "Any" includes "everything else" - items withough highlighting.
                // "Any" is also is a catchall for other unexpected items (should not happen)
                ANY.label(FantomLexerTokens.TokenName.UNEXPECTED.name()));
    }

    public Rule lexerId()
    {
        // same as ID but don't allow space/commennts
        return Sequence(TestNot(keyword()),
                Sequence(FirstOf(CharRange('A', 'Z'), CharRange('a', 'z'), "_"),
                ZeroOrMore(FirstOf(CharRange('A', 'Z'), CharRange('a', 'z'), '_', CharRange('0', '9'))))).label(FantomLexerTokens.TokenName.LEXERID.name());
    }

    public Rule lexerOps()
    {
        return FirstOf(OP_2MINUS, OP_2PLUS, OP_AND, OP_ARROW, OP_BANG, OP_CURRY, OP_DIV, OP_ELVIS,
                OP_MINUS, OP_MODULO, OP_MULT, OP_OR, OP_PLUS, OP_POUND, OP_RANGE, OP_RANGE_EXCL, OP_SAFE_CALL,
                OP_SAFE_DYN_CALL).label(FantomLexerTokens.TokenName.LEXEROPS.name());
    }

    public Rule lexerSeps()
    {
        return FirstOf(SP_COL, SP_COLCOL, SP_COMMA, SP_PIPE, SP_QMARK, SP_SEMI).label(FantomLexerTokens.TokenName.LEXERSEPS.name());
    }

    public Rule lexerComps()
    {
        return FirstOf(CP_COMPARATORS, CP_EQUALITY).label(FantomLexerTokens.TokenName.LEXERCOMPS.name());
    }

    public Rule lexerAssign()
    {
        return FirstOf(AS_EQUAL, AS_OPS).label(FantomLexerTokens.TokenName.LEXERASSIGN.name());
    }

    public Rule lexerInit()
    {
        return AS_INIT.label(FantomLexerTokens.TokenName.LEXERINIT.name());
    }

    public Rule dsl()
    {
        return Sequence(DSL_OPEN, ZeroOrMore(Sequence(TestNot(DSL_CLOSE), ANY)), DSL_CLOSE)
                .label(FantomLexerTokens.TokenName.DSL.name());
    }

    public Rule unixLine()
    {
        return Sequence("#!", ZeroOrMore(Sequence(TestNot("\n"), ANY)), "\n").label(FantomLexerTokens.TokenName.UNIXLINE.name());
    }

    @SuppressSubnodes
    public Rule comment()
    {
        return FirstOf(
                // multiline comment
                Sequence("/*", ZeroOrMore(Sequence(TestNot("*/"), ANY)), "*/"),
                // if incomplete multiline comment, then end at end of line
                Sequence("/*", ZeroOrMore(Sequence(TestNot(AnyOf("\r\n")), ANY))),
                // single line comment
                Sequence("//", ZeroOrMore(Sequence(TestNot(AnyOf("\r\n")), ANY)))).label(FantomLexerTokens.TokenName.COMMENT.name());
    }
        
    @SuppressSubnodes
    public Rule doc()
    {
        // In theory there are no empty lines betwen doc and type ... but that does happen so allowing it
        return OneOrMore(Sequence(OPT_SP, "**", ZeroOrMore(Sequence(TestNot("\n"), ANY)), OPT_LF())).label(FantomLexerTokens.TokenName.DOC.name());
    }

    @SuppressSubnodes
    public Rule whiteSpace()
    {
        // checking this somewhere that is likely to be called a lot
        if(cancel){
            throw new RuntimeException("Parser cancelled!");
        }
        return OneOrMore(AnyOf(" \t\u000c")).label(FantomLexerTokens.TokenName.WHITESPACE.name());
    }
    
    public Rule spacing() {
        return whiteSpace().label(FantomLexerTokens.TokenName.SPACING.name());
    }

    // ------------ Litteral items ---------------------------------------------
    @SuppressSubnodes
    public Rule strs()
    {
        return FirstOf(
                Sequence("\"\"\"", // triple quoted string, // (not using 3QUOTE terminal, since it could consume empty space inside the string)
                ZeroOrMore(FirstOf(
                unicodeChar(),
                escapedChar(),
                Sequence(TestNot(QUOTES3), ANY))), QUOTES3),
                Sequence("\"", // simple string, (not using QUOTE terminal, since it could consume empty space inside the string)
                ZeroOrMore(FirstOf(
                unicodeChar(),
                escapedChar(),
                Sequence(TestNot(QUOTE), ANY))), QUOTE)).label(FantomLexerTokens.TokenName.STRS.name());
    }

    @SuppressSubnodes
    public Rule uri()
    {
        return Sequence("`",// (not using TICK terminal, since it could consume empty space inside the string)
                ZeroOrMore(FirstOf(
                unicodeChar(),
                // missing from Fantom litteral page, special URI escape Sequences
                Sequence('\\', FirstOf(':', '/', '#', '[', ']', '@', '&', '=', ';', '?')),
                escapedChar(),
                Sequence(TestNot(TICK), ANY))),
                TICK).label(FantomLexerTokens.TokenName.URI.name());
    }

    @SuppressSubnodes
    public Rule char_()
    {
        return Sequence('\'',// (not using SINGLE_Q terminal, since it could consume empty space inside the char)
                FirstOf(
                unicodeChar(),
                escapedChar(), // standard esapes
                ANY), //all else
                SINGLE_Q).label(FantomLexerTokens.TokenName.CHAR_.name());
    }

    @SuppressSubnodes
    public Rule escapedChar()
    {
        return Sequence('\\', FirstOf('b', 'f', 'n', 'r', 't', '"', '\'', '`', '$', '\\'));
    }

    @SuppressSubnodes
    public Rule unicodeChar()
    {
        return Sequence("\\u", hexDigit(), hexDigit(), hexDigit(), hexDigit());
    }

    @SuppressSubnodes
    public Rule hexDigit()
    {
        return FirstOf(digit(),
                CharRange('a', 'f'),
                CharRange('A', 'F'));
    }

    @SuppressSubnodes
    public Rule digit()
    {
        return CharRange('0', '9');
    }

    @SuppressSubnodes
    public Rule number()
    {
        return Sequence(
                Optional(OP_MINUS),
                FirstOf(
                // hex number
                Sequence(FirstOf("0x", "0X"), OneOrMore(FirstOf("_", hexDigit()))),
                // decimal
                // fractional
                Sequence(fraction(), Optional(exponent())),
                Sequence(digit(),
                ZeroOrMore(Sequence(ZeroOrMore("_"), digit())),
                Optional(fraction()),
                Optional(exponent()))),
                Optional(nbType()), OPT_SP).label(FantomLexerTokens.TokenName.NUMBER.name());
    }

    @SuppressSubnodes
    public Rule fraction()
    {
        // not enfored to allow: "3.times ||" constructs as well as ranges 3..5
        return Sequence(DOT, digit(), ZeroOrMore(Sequence(ZeroOrMore("_"), digit())));
    }

    @SuppressSubnodes
    public Rule exponent()
    {
        return Sequence(AnyOf("eE"),
                Optional(FirstOf(OP_PLUS, OP_MINUS)),
                digit(),
                ZeroOrMore(Sequence(ZeroOrMore("_"), digit())));
    }

    @SuppressSubnodes
    public Rule nbType()
    {
        return FirstOf(
                "day", "hr", "min", "sec", "ms", "ns", //durations
                "f", "F", "D", "d" // float / decimal
                );
    }
    
    @SuppressSubnodes
    public Rule terminal(String string)
    {
        return Sequence(string, Optional(spacing())).label(string);
    }

    @SuppressSubnodes
    public Rule terminal(String string, Rule mustNotFollow)
    {
        return Sequence(string, TestNot(mustNotFollow), Optional(spacing())).label(string);
    }
    
    @SuppressSubnodes
    public Rule LF()
    {
        return Sequence(OneOrMore(Sequence(OPT_SP, AnyOf("\r\n"))), OPT_SP).label(FantomLexerTokens.TokenName.LF.name());
    }    

    @SuppressSubnodes
    public Rule OPT_SP()
    {
        return Optional(spacing());
    }
     
    @SuppressSubnodes
    public Rule OPT_LF()
    {
        return Optional(LF());
    }
    
    @SuppressSubnodes
    public Rule keyword()
    {
        return Sequence(
                // don't bother unless it starts with 'a'-'z'
                Test(CharRange('a', 'z')),
                FirstOf(KW_ABSTRACT, KW_AS, KW_ASSERT, KW_BREAK, KW_CATCH, KW_CASE, KW_CLASS,
                KW_CONST, KW_CONTINUE, KW_DEFAULT, KW_DO, KW_ELSE, KW_FALSE, KW_FINAL,
                KW_FINALLY, KW_FOR, KW_FOREACH, KW_IF, KW_INTERNAL, KW_IS, KW_ISNOT, KW_IT,
                KW_MIXIN, KW_NATIVE, KW_NEW, KW_NULL, KW_ONCE, KW_OVERRIDE, KW_PRIVATE,
                KW_PROTECTED, KW_PUBLIC, KW_READONLY, KW_RETURN, KW_STATIC, KW_SUPER, KW_SWITCH,
                KW_THIS, KW_THROW, KW_TRUE, KW_TRY, KW_USING, KW_VIRTUAL, KW_VOID, KW_VOLATILE,
                KW_WHILE)).label(FantomLexerTokens.TokenName.KEYWORD.name());
    }
 
    @SuppressSubnodes
    public Rule keyword(String string)
    {
        // Makes sure not to match things that START with a keyword like "thisisaTest"
        return Sequence(string,
                TestNot(FirstOf(digit(), CharRange('A', 'Z'), CharRange('a', 'z'), "_")),
                Optional(spacing())).label(string);
    }
        
    // -------------- Terminal items -------------------------------------------
    // -- Keywords --
    public final Rule KW_ABSTRACT = keyword("abstract");
    public final Rule KW_AS = keyword("as");
    public final Rule KW_ASSERT = keyword("assert"); // not a grammar kw
    public final Rule KW_BREAK = keyword("break");
    public final Rule KW_CATCH = keyword("catch");
    public final Rule KW_CASE = keyword("case");
    public final Rule KW_CLASS = keyword("class");
    public final Rule KW_CONST = keyword("const");
    public final Rule KW_CONTINUE = keyword("continue");
    public final Rule KW_DEFAULT = keyword("default");
    public final Rule KW_DO = keyword("do"); // unused, reserved
    public final Rule KW_ELSE = keyword("else");
    public final Rule KW_FALSE = keyword("false");
    public final Rule KW_FINAL = keyword("final");
    public final Rule KW_FINALLY = keyword("finally");
    public final Rule KW_FOR = keyword("for");
    public final Rule KW_FOREACH = keyword("foreach"); // unused, reserved
    public final Rule KW_IF = keyword("if");
    public final Rule KW_INTERNAL = keyword("internal");
    public final Rule KW_IS = keyword("is");
    public final Rule KW_IT = keyword("it");
    public final Rule KW_ISNOT = keyword("isnot");
    public final Rule KW_MIXIN = keyword("mixin");
    public final Rule KW_NATIVE = keyword("native");
    public final Rule KW_NEW = keyword("new");
    public final Rule KW_NULL = keyword("null");
    public final Rule KW_ONCE = keyword("once");
    public final Rule KW_OVERRIDE = keyword("override");
    public final Rule KW_PRIVATE = keyword("private");
    public final Rule KW_PUBLIC = keyword("public");
    public final Rule KW_PROTECTED = keyword("protected");
    public final Rule KW_READONLY = keyword("readonly");
    public final Rule KW_RETURN = keyword("return");
    public final Rule KW_STATIC = keyword("static");
    public final Rule KW_SUPER = keyword("super");
    public final Rule KW_SWITCH = keyword("switch");
    public final Rule KW_THIS = keyword("this");
    public final Rule KW_THROW = keyword("throw");
    public final Rule KW_TRUE = keyword("true");
    public final Rule KW_TRY = keyword("try");
    public final Rule KW_USING = keyword("using");
    public final Rule KW_VIRTUAL = keyword("virtual");
    public final Rule KW_VOID = keyword("void"); // unused, reserved
    public final Rule KW_VOLATILE = keyword("volatile"); // unused, reserved
    public final Rule KW_WHILE = keyword("while");
    
    public final Rule OP_PLUS = terminal("+");
    public final Rule OP_MINUS = terminal("-");
    public final Rule OP_ARROW = terminal("->");
    public final Rule OP_ELVIS = terminal("?:");
    public final Rule OP_OR = terminal("||");
    public final Rule OP_AND = terminal("&&");
    public final Rule OP_RANGE = terminal("..");
    public final Rule OP_RANGE_EXCL = terminal("..<");
    public final Rule OP_CURRY = terminal("&");
    public final Rule OP_BANG = terminal("!");
    public final Rule OP_2PLUS = terminal("++");
    public final Rule OP_2MINUS = terminal("--");
    public final Rule OP_MULT = terminal("*");
    public final Rule OP_DIV = terminal("/");
    public final Rule OP_MODULO = terminal("%");
    public final Rule OP_POUND = terminal("#");
    public final Rule OP_SAFE_CALL = terminal("?.");
    public final Rule OP_SAFE_DYN_CALL = terminal("?->");

    // separators
    public final Rule SP_PIPE = terminal("|");
    public final Rule SP_QMARK = terminal("?");
    public final Rule SP_COLCOL = terminal("::");
    public final Rule SP_COL = terminal(":");
    public final Rule SP_COMMA = terminal(",");
    public final Rule SP_SEMI = terminal(";");

    // brackets
    public final Rule DOT = terminal(".").label(FantomLexerTokens.TokenName.DOT.name());
    public final Rule BRACKET_L = terminal("{").label(FantomLexerTokens.TokenName.BRACKET_L.name());
    public final Rule BRACKET_R = terminal("}").label(FantomLexerTokens.TokenName.BRACKET_R.name());
    public final Rule PAR_L = terminal("(").label(FantomLexerTokens.TokenName.PAR_L.name());
    public final Rule PAR_R = terminal(")").label(FantomLexerTokens.TokenName.PAR_R.name());
    public final Rule AT = terminal("@").label(FantomLexerTokens.TokenName.AT.name());
    public final Rule DSL_OPEN = terminal("<|").label(FantomLexerTokens.TokenName.DSL_OPEN.name());
    public final Rule DSL_CLOSE = terminal("|>").label(FantomLexerTokens.TokenName.DSL_CLOSE.name());
    public final Rule SQ_BRACKET_L = terminal("[").label(FantomLexerTokens.TokenName.SQ_BRACKET_L.name());
    public final Rule SQ_BRACKET_R = terminal("]").label(FantomLexerTokens.TokenName.SQ_BRACKET_R.name());
    
    // comparators
    public final Rule CP_EQUALITY = FirstOf(terminal("==="), terminal("!=="),
            terminal("=="), terminal("!="));
    public final Rule CP_COMPARATORS = FirstOf(terminal("<=>"), terminal("<="),
            terminal(">="), terminal("<"), terminal(">"));
    
    // assignment
    public final Rule AS_INIT = terminal(":=");
    public final Rule AS_EQUAL = terminal("=");
    public final Rule AS_OPS = FirstOf(terminal("*="), terminal("/="),
            terminal("%="), terminal("+="), terminal("-="));

    // others
    public final Rule QUOTES3 = terminal("\"\"\"");
    public final Rule QUOTE = terminal("\"");
    public final Rule TICK = terminal("`");
    public final Rule SINGLE_Q = terminal("'");
    
    // shortcut for Optional spacing
    public final Rule OPT_SP = Optional(spacing());
    
    /**
     * Trying to cancel a running parser
     */
    public void cancel()
    {
        System.out.println("cancelling parser!");
        cancel = true;
    }


}
