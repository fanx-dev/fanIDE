/*
 * Thibaut Colar Aug 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.Collections;
import net.colar.netbeans.fan.structure.FanElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.openide.util.ImageUtilities;

/**
 * Import / using completion proposal
 *
 * @author thibautc
 */
public class FanImportProposal extends FanCompletionProposal {

    public FanImportProposal(String kw, int anchor, boolean isJava) {
        this.name = kw;
        this.anchor = anchor;
        this.modifiers = Collections.emptySet();
        this.kind = ElementKind.PACKAGE;
        this.element = new FanElementHandle(name, kind);
        if (!isJava) {
            icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/resources/fan.png", false);
        } else {
            icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/project/resources/java.png", false);
        }
    }

    @Override
    public String getInsertPrefix() {
        return name;
    }

}
