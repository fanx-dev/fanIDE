/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.axon.parboiled;

import java.util.Hashtable;
import net.colar.netbeans.fan.FanTokenID;

/**
 *
 * @author tcolar
 */
public class AxonLexerTokens {
    public enum TokenName {

        COMMENT, LEXEROPS, LEXERSEPS, LEXERASSIGN, LEXERINIT, LEXERCOMPS, LEXERITEMS,
        STRS, URI, CHAR_, KEYWORD, ID, LEXERID, NUMBER, WHITESPACE, SPACING, LF, ANY, ERROR, UNEXPECTED,
        //Items we use a lot in the lexer
        SQ_BRACKET_L, SQ_BRACKET_R, BRACKET_L, BRACKET_R, PAR_L, PAR_R, DOT, AT, DSL_OPEN, DSL_CLOSE
    }
    // lazy inited
    private static Hashtable<Integer, FanTokenID> tokens = new Hashtable<Integer, FanTokenID>();
    private static Hashtable<String, Integer> tokenIdByName = new Hashtable<String, Integer>();

    // Map Token labels with Netbeans color entries (textColors.xml)
    private static Hashtable<TokenName, String> getColorIds() {
        Hashtable<TokenName, String> cats = new Hashtable<TokenName, String>();
        cats.put(TokenName.COMMENT, "comment");
        cats.put(TokenName.NUMBER, "number");
        cats.put(TokenName.CHAR_, "character");
        cats.put(TokenName.KEYWORD, "keyword");
        cats.put(TokenName.LEXEROPS, "operator");
        cats.put(TokenName.LEXERSEPS, "sepaxon");
        cats.put(TokenName.LEXERCOMPS, "comparator");
        cats.put(TokenName.LEXERASSIGN, "assignment");
        cats.put(TokenName.LEXERINIT, "initialization");
        cats.put(TokenName.STRS, "string");
        cats.put(TokenName.URI, "string");
        cats.put(TokenName.ERROR, "error"); //error token in case of problem with lexer
        cats.put(TokenName.UNEXPECTED, "error"); //should NOT happen
        return cats;
    }

    /**
     * Get a token object by it's label/name
     *
     * @param name
     * @return
     */
    public static FanTokenID getTokenByName(String name) {
        if (name == null) {
            return getTokenByName(TokenName.ERROR);
        }
        Integer id = tokenIdByName.get(name.toUpperCase());
        if (id == null) {
            return getTokenByName(TokenName.ERROR);
        }
        return tokens.get(id);
    }

    public static FanTokenID getTokenByName(TokenName name) {
        return getTokenByName(name.name().toUpperCase());
    }

    /**
     * Get all the defined token (lazilly cached)
     *
     * @return
     */
    public static Hashtable<Integer, FanTokenID> getTokens() {
        if (tokens.isEmpty()) {
            synchronized (AxonLexer.class) {
                if (tokens.isEmpty()) {
                    tokens = new Hashtable<Integer, FanTokenID>();
                    Hashtable<TokenName, String> colorIds = getColorIds();

                    int id = 0;
                    for (TokenName name : TokenName.values()) {
                        id++;
                        FanTokenID token;
                        String cat = "";
                        if (colorIds.containsKey(name)) {
                            cat = colorIds.get(name);
                        }
                        //System.out.println("New token: " + name + "(" + id + ") : " + cat);
                        token = new FanTokenID(name.name(), id, cat);
                        tokens.put(id, token);
                        tokenIdByName.put(name.name(), id);
                    }
                }
            }
        }
        return tokens;
    }
}
