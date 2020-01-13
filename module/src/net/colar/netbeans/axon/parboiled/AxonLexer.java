package net.colar.netbeans.axon.parboiled;

import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FantomLexerTokens;
import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;
import org.parboiled.annotations.SuppressSubnodes;

/**
 * Lexer : With parboiled the Lexer is just a lightweight parser that creates
 * tokens
 *
 * @author thibautc
 */
@BuildParseTree
public class AxonLexer extends BaseParser<AstNode> {

    // ============ Simulate a lexer ===========================================
    // This should just create tokens for the items we want to highlight(color) in the IDE
    // It should be able to deal with "Anything" and not ever fail if possible.
    public Rule lexer() {
        // If Any changes made here, keep in sync with lexerTokens list in FantomParserTokens.java
        return Sequence(
                ZeroOrMore(lexerItem()).label("lexerItems"),
                Optional(EOI)); // until end of file
    }

    public Rule lexerItem() {
        return FirstOf(
                comment(), strs(), uri(), char_(),
                lexerInit(), lexerComps(), lexerAssign(), lexerOps(), lexerSeps(), // operators/separators
                keyword(), lexerId(), number(), LF(), spacing(),
                // "Any" includes "everything else" - items withough highlighting.
                // "Any" is also is a catchall for other unexpected items (should not happen)
                ANY.label(FantomLexerTokens.TokenName.UNEXPECTED.name()));
    }

    public Rule lexerId() {
        // same as ID but don't allow space/commennts
        return Sequence(TestNot(keyword()),
                Sequence(FirstOf(CharRange('A', 'Z'), CharRange('a', 'z'), "_"),
                ZeroOrMore(FirstOf(CharRange('A', 'Z'), CharRange('a', 'z'), '_', CharRange('0', '9'))))).label(FantomLexerTokens.TokenName.LEXERID.name());
    }

    public Rule lexerOps() {
        return FirstOf(OP_ARROW, OP_DIV, 
                OP_MINUS, OP_MODULO, OP_MULT, OP_PLUS).label(FantomLexerTokens.TokenName.LEXEROPS.name());
    }

    public Rule lexerSeps() {
        return FirstOf(SP_COMMA, SP_PIPE, SP_SEMI, BRACKET_L, BRACKET_R, SQ_BRACKET_L, SQ_BRACKET_R, PAR_L, PAR_R, DOT).label(FantomLexerTokens.TokenName.LEXERSEPS.name());
    }

    public Rule lexerComps() {
        return FirstOf(CP_COMPARATORS, CP_EQUALITY).label(FantomLexerTokens.TokenName.LEXERCOMPS.name());
    }

    public Rule lexerAssign() {
        return FirstOf(AS_EQUAL, AS_OPS).label(FantomLexerTokens.TokenName.LEXERASSIGN.name());
    }

    public Rule lexerInit() {
        return FirstOf(AS_FUNC, AS_INIT).label(FantomLexerTokens.TokenName.LEXERINIT.name());
    }

    @SuppressSubnodes
    public Rule comment() {
        return FirstOf(
                // multiline comment
                Sequence("/*", ZeroOrMore(Sequence(TestNot("*/"), ANY)), "*/"),
                // if incomplete multiline comment, then end at end of line
                Sequence("/*", ZeroOrMore(Sequence(TestNot(AnyOf("\r\n")), ANY))),
                // single line comment
                Sequence("//", ZeroOrMore(Sequence(TestNot(AnyOf("\r\n")), ANY)))).label(FantomLexerTokens.TokenName.COMMENT.name());
    }

    @SuppressSubnodes
    public Rule doc() {
        // In theory there are no empty lines betwen doc and type ... but that does happen so allowing it
        return OneOrMore(Sequence(OPT_SP, "**", ZeroOrMore(Sequence(TestNot("\n"), ANY)), OPT_LF())).label(FantomLexerTokens.TokenName.DOC.name());
    }

    @SuppressSubnodes
    public Rule whiteSpace() {
        return OneOrMore(AnyOf(" \t\u000c")).label(FantomLexerTokens.TokenName.WHITESPACE.name());
    }

    public Rule spacing() {
        return whiteSpace().label(FantomLexerTokens.TokenName.SPACING.name());
    }

    // ------------ Litteral items ---------------------------------------------
    @SuppressSubnodes
    public Rule strs() {
        return Sequence("\"", ZeroOrMore(Sequence(TestNot("\""), ANY)), "\"");
    }

    @SuppressSubnodes
    public Rule uri() {
        return Sequence("`",// (not using TICK terminal, since it could consume empty space inside the string)
                ZeroOrMore(FirstOf(
                unicodeChar(),
                // missing from Fantom litteral page, special URI escape Sequences
                Sequence('\\', FirstOf(':', '/', '#', '[', ']', '@', '&', '=', ';', '?')),
                escapedChar(),
                Sequence(TestNot("`"), ANY))),
                "`").label(FantomLexerTokens.TokenName.URI.name());
    }

    @SuppressSubnodes
    public Rule char_() {
        return Sequence('\'',// (not using SINGLE_Q terminal, since it could consume empty space inside the char)
                FirstOf(
                unicodeChar(),
                escapedChar(), // standard esapes
                ANY), //all else
                '\'').label(FantomLexerTokens.TokenName.CHAR_.name());
    }

    @SuppressSubnodes
    public Rule escapedChar() {
        return Sequence('\\', FirstOf('b', 'f', 'n', 'r', 't', '"', '\'', '`', '$', '\\'));
    }

    @SuppressSubnodes
    public Rule unicodeChar() {
        return Sequence("\\u", hexDigit(), hexDigit(), hexDigit(), hexDigit());
    }

    @SuppressSubnodes
    public Rule hexDigit() {
        return FirstOf(digit(),
                CharRange('a', 'f'),
                CharRange('A', 'F'));
    }

    @SuppressSubnodes
    public Rule digit() {
        return CharRange('0', '9');
    }

    @SuppressSubnodes
    public Rule number() {
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
    public Rule fraction() {
        // not enfored to allow: "3.times ||" constructs as well as ranges 3..5
        return Sequence(DOT, digit(), ZeroOrMore(Sequence(ZeroOrMore("_"), digit())));
    }

    @SuppressSubnodes
    public Rule exponent() {
        return Sequence(AnyOf("eE"),
                Optional(FirstOf(OP_PLUS, OP_MINUS)),
                digit(),
                ZeroOrMore(Sequence(ZeroOrMore("_"), digit())));
    }

    @SuppressSubnodes
    public Rule nbType() {
        return FirstOf(
                "day", "hr", "min", "sec", "ms", "ns", //durations
                "f", "F", "D", "d" // float / decimal
                );
    }

    @SuppressSubnodes
    public Rule terminal(String string) {
        return Sequence(string, Optional(spacing())).label(string);
    }

    @SuppressSubnodes
    public Rule terminal(String string, Rule mustNotFollow) {
        return Sequence(string, TestNot(mustNotFollow), Optional(spacing())).label(string);
    }

    @SuppressSubnodes
    public Rule LF() {
        return Sequence(OneOrMore(Sequence(OPT_SP, AnyOf("\r\n"))), OPT_SP).label(FantomLexerTokens.TokenName.LF.name());
    }

    @SuppressSubnodes
    public Rule OPT_SP() {
        return Optional(spacing());
    }

    @SuppressSubnodes
    public Rule OPT_LF() {
        return Optional(LF());
    }

    @SuppressSubnodes
    public Rule keyword() {
        return Sequence(
                // don't bother unless it starts with 'a'-'z'
                Test(CharRange('a', 'z')),
                FirstOf(KW_AND, KW_DO, KW_ELSE, KW_END, KW_FALSE,
                KW_IF, KW_NOT, KW_NULL, KW_OR, KW_RETURN, KW_THROW, KW_TRUE,
                KW_TRY)).label(FantomLexerTokens.TokenName.KEYWORD.name());
    }

    @SuppressSubnodes
    public Rule keyword(String string) {
        // Makes sure not to match things that START with a keyword like "thisisaTest"
        return Sequence(string,
                TestNot(FirstOf(digit(), CharRange('A', 'Z'), CharRange('a', 'z'), "_")),
                Optional(spacing())).label(string);
    }
    // -------------- Terminal items -------------------------------------------
    // -- Keywords --
    public final Rule KW_AND = keyword("and");
    public final Rule KW_DO = keyword("do");
    public final Rule KW_ELSE = keyword("else");
    public final Rule KW_END = keyword("end");
    public final Rule KW_FALSE = keyword("false");
    public final Rule KW_IF = keyword("if");
    public final Rule KW_NOT = keyword("not");
    public final Rule KW_NULL = keyword("null");
    public final Rule KW_OR = keyword("or");
    public final Rule KW_RETURN = keyword("return");
    public final Rule KW_THROW = keyword("throw");
    public final Rule KW_TRUE = keyword("true");
    public final Rule KW_TRY = keyword("try");
    public final Rule OP_PLUS = terminal("+");
    public final Rule OP_MINUS = terminal("-");
    public final Rule OP_ARROW = terminal("->");
    public final Rule OP_MULT = terminal("*");
    public final Rule OP_DIV = terminal("/");
    public final Rule OP_MODULO = terminal("%");
    // separators
    public final Rule SP_PIPE = terminal("|");
    public final Rule SP_COMMA = terminal(",");
    public final Rule SP_SEMI = terminal(";");
    // brackets
    public final Rule DOT = terminal(".").label(FantomLexerTokens.TokenName.DOT.name());
    public final Rule BRACKET_L = terminal("{").label(FantomLexerTokens.TokenName.BRACKET_L.name());
    public final Rule BRACKET_R = terminal("}").label(FantomLexerTokens.TokenName.BRACKET_R.name());
    public final Rule PAR_L = terminal("(").label(FantomLexerTokens.TokenName.PAR_L.name());
    public final Rule PAR_R = terminal(")").label(FantomLexerTokens.TokenName.PAR_R.name());
    public final Rule SQ_BRACKET_L = terminal("[").label(FantomLexerTokens.TokenName.SQ_BRACKET_L.name());
    public final Rule SQ_BRACKET_R = terminal("]").label(FantomLexerTokens.TokenName.SQ_BRACKET_R.name());
    // comparators
    public final Rule CP_EQUALITY = FirstOf(terminal("==="), terminal("!=="),
            terminal("=="), terminal("!="));
    public final Rule CP_COMPARATORS = FirstOf(terminal("<=>"), terminal("<="),
            terminal(">="), terminal("<"), terminal(">"));
    // assignment
    public final Rule AS_INIT = terminal(":");
    public final Rule AS_FUNC = terminal("=>");
    public final Rule AS_EQUAL = terminal("=");
    public final Rule AS_OPS = FirstOf(terminal("*="), terminal("/="),
            terminal("%="), terminal("+="), terminal("-="));
    // others
    public final Rule QUOTE = terminal("\"");
    // shortcut for Optional spacing
    public final Rule OPT_SP = Optional(spacing());
}
