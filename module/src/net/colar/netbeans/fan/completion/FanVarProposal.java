/*
 * Thibaut Colar Nov 18, 2009
 */
package net.colar.netbeans.fan.completion;

import fan.parser.MethodVar;
import java.util.HashSet;
import java.util.List;
import net.colar.netbeans.fan.indexer.IndexerHelper;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.structure.FanElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;

/**
 * Propose a variable
 *
 * @author thibautc
 */
public class FanVarProposal extends FanCompletionProposal {

    private final MethodVar var;
    String html = "";
    String prefix = "";
    String rHtml = "";

    public FanVarProposal(MethodVar var, int anchor) {
        this.var = var;
        this.name = var.name();
        html = name;
        prefix = name;
        this.anchor = anchor;
        this.kind = ElementKind.VARIABLE;
        FanElementHandle handle = new FanElementHandle(name, kind);
        //handle.setDoc(null);
        element = handle;
    }

    @Override
    public String getInsertPrefix() {
        return prefix;
    }

    @Override
    public String getRhsHtml(HtmlFormatter formater) {
        return rHtml;
    }

    @Override
    public String getLhsHtml(HtmlFormatter formater) {
        return html;
    }
}
