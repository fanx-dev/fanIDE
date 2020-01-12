/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.Collection;
import net.colar.netbeans.axon.parboiled.AxonLexerTokens;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author tcolar
 */
public class AxonLanguageHierarchy extends LanguageHierarchy<FanTokenID> {

    @Override
    protected String mimeType() {
        return "text/x-axon";
    }

    @Override
    protected Collection<FanTokenID> createTokenIds() {
        return AxonLexerTokens.getTokens().values();
    }

    @Override
    protected Lexer<FanTokenID> createLexer(LexerRestartInfo<FanTokenID> info) {
        return new NBAxonLexer(info);
    }
}
