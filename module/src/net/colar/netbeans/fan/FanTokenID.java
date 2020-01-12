/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.Collection;
import net.colar.netbeans.fan.parboiled.FantomLexerTokens;
import net.colar.netbeans.fan.parboiled.FantomLexerTokens.TokenName;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 * Represent a TokenID as found in the lexer (In this case actually the parboiled parser)
 * @author thibautc
 */
public class FanTokenID implements TokenId
{

	private final String name;
	private final String category;
	private final int ordinal;
	private String fixedText;

	public FanTokenID(String name, int ordinal, String category)
	{
		this.name = name;
		this.ordinal = ordinal;
		this.category = category;
	}

	public String name()
	{
		return name;
	}

	public int ordinal()
	{
		return ordinal;
	}

	public String primaryCategory()
	{
		return category;
	}

	public void setFixedText(String text)
	{
		fixedText = text;
	}

	public String getFixedText()
	{
		return fixedText;
	}

	/**
	 * Check whether this token is of the TokenName sort (ny ID)
	 * @param name
	 * @return
	 */
	public boolean matches(TokenName name)
	{
		TokenId tk = FantomLexerTokens.getTokenByName(name);
		if (tk == null)
		{
			return false;
		}
		return tk.ordinal() == ordinal;
	}
	/**
	 * Basic language hierarchy impl.
	 * (Static init block)
	 */
	private static final Language<FanTokenID> language = new LanguageHierarchy<FanTokenID>()
	{

		@Override
		protected String mimeType()
		{
			return FanLanguage.FAN_MIME_TYPE;
		}

		@Override
		protected Collection<FanTokenID> createTokenIds()
		{
			return FantomLexerTokens.getTokens().values();
		}

		@Override
		protected Lexer<FanTokenID> createLexer(LexerRestartInfo<FanTokenID> info)
		{
			return new NBFanLexer(info);
		}
	}.language();

	public static Language<FanTokenID> language()
	{
		return language;
	}
        
        private static final Language<FanTokenID> axon = new AxonLanguageHierarchy().language();
        
	public static Language<FanTokenID> axonlanguage()
	{
		return axon;
	}
}
