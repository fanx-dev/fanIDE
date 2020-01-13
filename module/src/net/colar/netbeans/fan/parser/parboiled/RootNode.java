/*
 * Thibaut Colar Mar 2, 2010
 */
package net.colar.netbeans.fan.parser.parboiled;

import net.colar.netbeans.fan.parser.FanParserTask;
import org.parboiled.Context;
import org.parboiled.support.IndexRange;

/**
 *
 * @author thibautc
 */
public class RootNode extends AstNode {

    /**
     * Reference to the ParserTask that created this node - Only maintained on
     * the root node
     */
    private final FanParserTask task;

    public RootNode(AstKind kind, Context context, FanParserTask task) {
        this(kind, context.getMatchRange(), context.getMatch(), task);
    }

    public RootNode(AstKind kind, IndexRange textRange, String text, FanParserTask task) {
        super(0, kind, "ROOT", "/", textRange, text);
        this.task = task;
        this.setIsScopeNode();
    }

    public FanParserTask getParserTask() {
        return task;
    }

    public String getPod() {
        return getParserTask().getPod();
    }
}
