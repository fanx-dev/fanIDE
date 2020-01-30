/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.axon;

import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import net.colar.netbeans.axon.parboiled.AxonLexer;
import net.colar.netbeans.axon.parboiled.AxonLexerTokens;
import net.colar.netbeans.axon.parboiled.AxonLexerTokens.TokenName;
import net.colar.netbeans.fan.parser.FanTokenID;
import net.colar.netbeans.fan.parser.parboiled.pred.NodeLabelPredicate;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerInput;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.parboiled.Node;
import org.parboiled.Parboiled;
import org.parboiled.common.StringUtils;
import org.parboiled.parserunners.BasicParseRunner;
import org.parboiled.support.ParsingResult;
import org.parboiled.trees.GraphNode;

/**
 *
 * @author tcolar
 */
public class NBAxonLexer implements Lexer<FanTokenID> {

    private static Hashtable<Integer, FanTokenID> tokenIds = AxonLexerTokens.getTokens();
    private LexerRestartInfo<FanTokenID> info;
    // Iterator for the parser Nodes (like a token stream).
    Iterator<Node<Object>> lexerIterator = null;
    boolean inited = false;
    AxonLexer lexer;

    public static Collection<FanTokenID> getTokenIds() {
        return tokenIds.values();
    }

    public NBAxonLexer(LexerRestartInfo<FanTokenID> info) {
        this.info = info;
        // we don't run the parser now, because aparently input is empty at this time
        // will do it on first call to nextToken()
    }

    public Token<FanTokenID> nextToken() {
        if (!inited) {
            synchronized (this) {
                if (!inited) {
                    inited = true;
                    // on the first nextToken() call we parse the input (init the lexerIterator)
                    parseInput();
                }
            }
        }
        if (lexerIterator == null) {
            return null;
        }
        Token<FanTokenID> result = null;
        if (lexerIterator.hasNext()) {
            Node<Object> node = lexerIterator.next();
            // the node we get is the "firstOf" parent node, we want the child of it.
            node = node.getChildren().get(0);
            int nodeStart = node.getStartIndex();
            int nodeEnd = node.getEndIndex();

            //System.err.println("Node: " + node.getLabel()+" "+nodeStart+" "+nodeEnd);

            FanTokenID tk = AxonLexerTokens.getTokenByName(node.getLabel());
            // Lexer will fail if null token returned, so use the default error token "error" in case that happens
            if (tk == null) {
                //System.err.println("Unknown token: " + node.getLabel());
                tk = AxonLexerTokens.getTokenByName(TokenName.ERROR);
            }

            result = info.tokenFactory().createToken(tk, (nodeEnd - nodeStart));
            //System.err.println("Token: " + result.id().name() + "(" + result.id().primaryCategory() + ")");
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    private void parseInput() {
        LexerInput input = info.input();
        // Read the whole data into a string (parboiled works of a string, not a stream)
        StringBuffer data = new StringBuffer();
        int i = 0;
        while ((i = input.read()) != LexerInput.EOF) {
            data.append((char) i);
        }
        lexer = Parboiled.createParser(AxonLexer.class);

        try {
            long start = new Date().getTime();
            System.out.println("> Starting lexer");
            ParsingResult<GraphNode> result = new BasicParseRunner(lexer.lexer()).run(data.toString());
            System.out.println("< Finished lexing in " + (new Date().getTime() - start));
            if (result.hasErrors() || !result.matched) {
                // This really should never happen, since lexer should be able to deal with almost anything.
                System.err.println("Lexer parse errors: " + StringUtils.join(result.parseErrors, "---\n"));
                throw new RuntimeException("Lexer did not match content");
            }
            Node lexerItems = NBAxonLexer.getFirstChild(result.parseTreeRoot, new NodeLabelPredicate(TokenName.LEXERITEMS.name()));
            lexerIterator = lexerItems.getChildren().iterator();
        } catch (Throwable e) {
            new RuntimeException("Lexer Failed !", e);
        }
    }

    public Object state() {
        return null;
    }

    public void release() {
    }

    @SuppressWarnings("unchecked")
    public static Node<GraphNode> getFirstChild(Node<GraphNode> parentNode, NodeLabelPredicate pred) {
        if (parentNode != null) {
            for (Node<GraphNode> child : parentNode.getChildren()) {
                if (pred.apply(child)) {
                    return child;
                }
            }
        }
        return null;
    }
}
