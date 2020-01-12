/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.test.mock;

import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.RootNode;
import org.netbeans.modules.csl.api.OffsetRange;
import org.parboiled.support.IndexRange;

/**
 * Dummy minimal rootNode for unit testing
 *
 * @author tcolar
 */
public class DummyAstRootNode extends RootNode {

    public DummyAstRootNode(FanParserTask task) {
        super(AstKind.DUMMY_NODE, new IndexRange(0, 0), "ROOT", task);
        setIsScopeNode();
    }

    @Override
    public RootNode getRoot() {
        return this;
    }

    @Override
    public OffsetRange getRelevantTextRange() {
        return new OffsetRange(0, 0);
    }

    @Override
    public String getNodeText(boolean relevantOnly) {
        return "Dummy";
    }
}
