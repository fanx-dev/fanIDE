/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.lexer;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author yangjiandong
 */
public class FanTokenId implements TokenId  {
    
    private final String name;
    private final String primaryCategory;
    private final int id;
    
    public enum TokenKind {
        comment, keyword, string, identifier, whitespace, symbol, dsl
    }

    FanTokenId(
            String name,
            String primaryCategory,
            int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }
    
    FanTokenId(TokenKind kind) {
        this.name = kind.name();
        this.primaryCategory = kind.name();
        this.id = kind.ordinal();
    }

    @Override
    public String primaryCategory() {
        return primaryCategory;
    }

    @Override
    public int ordinal() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }
    
    public static Language<FanTokenId> getLanguage() {
        return new FanLanguageHierarchy().language();
    }
}
