/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.editor;

import net.colar.netbeans.fan.FanLanguage;
import net.colar.netbeans.fan.indexer.FanTokenID;
import net.colar.netbeans.fan.parser.parboiled.FantomLexerTokens.TokenName;
import org.netbeans.api.lexer.InputAttributes;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.LanguageEmbedding;
import org.netbeans.spi.lexer.LanguageProvider;
import org.openide.util.lookup.ServiceProvider;
import org.netbeans.api.editor.mimelookup.MimeLookup;
//import org.netbeans.modules.db.sql.lexer.SQLTokenId;

/**
 * Provide syntax highlighting for DSL's (embedded language)
 * 
 * @author tcolar
 */
@ServiceProvider(service = LanguageProvider.class)
public class FanDslEmbeddingProvider extends LanguageProvider
{

    public static final String DSL_OPEN = "<|";
    public static final String DSL_CLOSE = "|>";
    public static final String DSL_CLIENT_ID = "Js";
    public static final String DSL_SQL_ID = "Sql";
    Language jscript;
    Language sql;

    @Override
    public Language<?> findLanguage(String mimeType)
    {
        if (FanLanguage.FAN_MIME_TYPE.equals (mimeType))
            return FanTokenID.language();
        return null;
    }

    @Override
    @SuppressWarnings(value="unchecked")
    public LanguageEmbedding<?> findLanguageEmbedding(Token<?> token, LanguagePath lp, InputAttributes ia)
    {
        if (jscript == null)
        {
            jscript = MimeLookup.getLookup(FanHighlightsContainer.JAVASCRIPT_MIME_TYPE).lookup(Language.class);
        }
        if (sql == null)
        {
            // NOTE: Required adding (non public/friend) SQL editor (specific revision)
            sql = /*SQLTokenId.language();*/
						MimeLookup.getLookup(FanHighlightsContainer.SQL_MIME_TYPE).lookup(Language.class);
        }
        if (token != null && token.id() != null && token.text() != null)
        {
            if (token.id().name().equalsIgnoreCase(TokenName.DSL.name()))
            {
                if (jscript!=null && token.text().toString().startsWith(DSL_CLIENT_ID + DSL_OPEN))
                {
                    int start = DSL_CLIENT_ID.length() + DSL_OPEN.length();
                    return LanguageEmbedding.create(jscript, start, DSL_CLOSE.length());
                }
                else if (sql!=null && token.text().toString().startsWith(DSL_SQL_ID + DSL_OPEN))
                {
                    int start = DSL_SQL_ID.length() + DSL_OPEN.length();
                    return LanguageEmbedding.create(sql, start, DSL_CLOSE.length());
                }
            }
        }
        return null;
    }
}
