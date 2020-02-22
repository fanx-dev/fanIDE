/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.lexer;

import java.util.*;
import net.colar.netbeans.fan.lexer.FanTokenId.TokenKind;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class FanLanguageHierarchy extends LanguageHierarchy<FanTokenId> {

    private static List<FanTokenId> tokens;
    private static Map<Integer, FanTokenId> idToToken;

    private static void init() {
        tokens = Arrays.<FanTokenId>asList(new FanTokenId[]{
            new FanTokenId(TokenKind.comment),
            new FanTokenId(TokenKind.keyword),
            new FanTokenId(TokenKind.string),
            new FanTokenId(TokenKind.identifier),
            new FanTokenId(TokenKind.symbol),
            new FanTokenId(TokenKind.whitespace),
            new FanTokenId(TokenKind.dsl),
        });
        idToToken = new HashMap<Integer, FanTokenId>();
        for (FanTokenId token : tokens) {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized FanTokenId getToken(int id) {
        if (idToToken == null) {
            init();
        }
        return idToToken.get(id);
    }

    @Override
    protected synchronized Collection<FanTokenId> createTokenIds() {
        if (tokens == null) {
            init();
        }
        return tokens;
    }

    @Override
    protected synchronized Lexer<FanTokenId> createLexer(LexerRestartInfo<FanTokenId> info) {
        return new FanLexer(info);
    }

    @Override
    protected String mimeType() {
        return "text/x-fan";
    }

}
