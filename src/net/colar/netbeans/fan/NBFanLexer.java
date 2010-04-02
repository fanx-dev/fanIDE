/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parboiled.FantomParser;
import net.colar.netbeans.fan.parboiled.FantomParserTokens;
import net.colar.netbeans.fan.parboiled.FantomParserTokens.TokenName;
import net.colar.netbeans.fan.parboiled.pred.NodeLabelPredicate;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerInput;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.parboiled.Node;
import org.parboiled.BasicParseRunner;
import org.parboiled.Parboiled;
import org.parboiled.common.StringUtils;
import org.parboiled.support.ParsingResult;

/**
 * Lexer implementation
 * Bridges NB lexer with parboiled parser (No real lexer when using parboiled, so we use the parser wiht a basic lexer rule).
 * @author thibautc
 */
public class NBFanLexer implements Lexer<FanTokenID>
{

	private static Hashtable<Integer, FanTokenID> tokenIds = FantomParserTokens.getTokens();
	private LexerRestartInfo<FanTokenID> info;
	// Iterator for the parser Nodes (like a token stream).
	Iterator<Node<Object>> lexerIterator = null;
	boolean inited = false;
	FantomParser parser;

	public static Collection<FanTokenID> getTokenIds()
	{
		return tokenIds.values();
	}

	public NBFanLexer(LexerRestartInfo<FanTokenID> info)
	{
		this.info = info;
		// we don't run the parser now, because aparently input is empty at this time
		// will do it on first call to nextToken()
	}

	public Token<FanTokenID> nextToken()
	{
		if (!inited)
		{
			synchronized (this)
			{
				if (!inited)
				{
					inited = true;
					// on the first nextToken() call we parse the input (init the lexerIterator)
					parseInput();
				}
			}
		}
		if (lexerIterator == null)
		{
			return null;
		}
		Token<FanTokenID> result = null;
		if (lexerIterator.hasNext())
		{
			Node<Object> node = lexerIterator.next();
			// the node we get is the "firstOf" parent node, we want the child of it.
			node = node.getChildren().get(0);
			int nodeStart = node.getStartLocation().getIndex();
			int nodeEnd = node.getEndLocation().getIndex();

			//System.err.println("Node: " + node.getLabel()+" "+nodeStart+" "+nodeEnd);

			FanTokenID tk = FantomParserTokens.getTokenByName(node.getLabel());
			// Lexer will fail if null token returned, so use the default error token "error" in case that happens
			if (tk == null)
			{
				//System.err.println("Unknown token: " + node.getLabel());
				tk = FantomParserTokens.getTokenByName(TokenName.ERROR);
			}

			result = info.tokenFactory().createToken(tk, (nodeEnd - nodeStart));
			//System.err.println("Token: " + result.id().name() + "(" + result.id().primaryCategory() + ")");
		}
		return result;
	}

	private void parseInput()
	{
		LexerInput input = info.input();
		// Read the whole data into a string (parboiled works of a string, not a stream)
		StringBuffer data = new StringBuffer();
		int i = 0;
		while ((i = input.read()) != LexerInput.EOF)
		{
			data.append((char) i);
		}
		parser = Parboiled.createParser(FantomParser.class, (FanParserTask) null);

		try
		{
			long start = new Date().getTime();
			ParsingResult<AstNode> result = BasicParseRunner.run(parser.lexer(), data.toString());
			System.out.println("Finished lexing in " + (new Date().getTime() - start));
			if (result.hasErrors() || !result.matched)
			{
				// This really should never happen, since lexer should be able to deal with almost anything.
				System.err.println("Lexer parse errors: " + StringUtils.join(result.parseErrors, "---\n"));
				throw new RuntimeException("Lexer did not match content");
			}
			Node lexerItems = FanLexAstUtils.getFirstChild(result.parseTreeRoot, new NodeLabelPredicate(TokenName.LEXERITEMS.name()));
			lexerIterator = lexerItems.getChildren().iterator();
		} catch (IllegalStateException e)
		{
			System.out.println("Lexer task cancelled");
		}
	}

	public Object state()
	{
		return null;
	}

	public void release()
	{
	}
}
