/*
 * Thibaut Colar Aug 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.Collections;
import net.colar.netbeans.fan.structure.FanElementHandle;
import org.netbeans.modules.csl.api.ElementKind;

/**
 * Keyword completion proposal
 *
 * @author thibautc
 */
public class FanKeywordProposal extends FanCompletionProposal {

    public FanKeywordProposal(String kw, int anchor) {
        this.name = kw;
        this.anchor = anchor;
        this.modifiers = Collections.emptySet();
        this.kind = ElementKind.KEYWORD;
        this.element = new FanElementHandle(name, kind);
    }

}
