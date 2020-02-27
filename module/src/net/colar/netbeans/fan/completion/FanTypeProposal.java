/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.completion;

import fan.parser.CTypeDef;
import java.util.Collections;
import net.colar.netbeans.fan.indexer.IndexerHelper;
import net.colar.netbeans.fan.structure.FanElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.openide.util.ImageUtilities;

/**
 * Propose a Type such as Str or Int ForcedName is used for using with a "As"
 * clause, if null just use type.name()
 *
 * @author thibautc
 */
public class FanTypeProposal extends FanCompletionProposal {

    private final String pod;

    public FanTypeProposal(CTypeDef type, int anchor, String forcedName) {
        Boolean isJava = false;
        this.pod = type.podName();

        this.name = type.name();
        if (forcedName != null) {
            this.name = forcedName;
        }
        this.anchor = anchor;
        this.kind = ElementKind.CLASS;
        icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/resources/fan.png", false);
        if (isJava) {
            icon = ImageUtilities.loadImageIcon("net/colar/netbeans/fan/project/resources/java.png", false);
        }
        FanElementHandle handle = new FanElementHandle(name, kind);
        
        if (type.doc() != null) {
            handle.setDoc(type.doc().toStr());
        }
        element = handle;
    }

    @Override
    public String getInsertPrefix() {
        return name;
    }

    @Override
    public String getRhsHtml(HtmlFormatter formater) {
        return "[" + (pod == null ? "??" : pod) + "]";
    }

}
