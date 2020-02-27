/*
 * Thibaut Colar Aug 18, 2009
 */
package net.colar.netbeans.fan.completion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import net.colar.netbeans.fan.structure.FanElementHandle;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CodeCompletionHandler;
import org.netbeans.modules.csl.api.CodeCompletionResult;
import org.netbeans.modules.csl.api.CompletionProposal;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ParameterInfo;
import org.netbeans.modules.csl.spi.DefaultCompletionResult;
import org.netbeans.modules.csl.spi.ParserResult;

/**
 * Code Completion
 *
 * @author thibautc
 */
public class FanCompletionHandler implements CodeCompletionHandler {



    @Override
    public CodeCompletionResult complete(CodeCompletionContext context) {
        ArrayList<CompletionProposal> proposals;

        CodeCompletion c = new CodeCompletion(context);
        proposals = c.propose();

        DefaultCompletionResult completionResult = new DefaultCompletionResult(proposals, false);
        return completionResult;
    }

    @Override
    public String document(ParserResult result, ElementHandle handle) {
        String doc = null;
        if (handle instanceof FanElementHandle) {
            doc = ((FanElementHandle)handle).getDoc();
        }
        return doc;
    }

    @Override
    public ElementHandle resolveLink(String link, ElementHandle handle) {
        //TODO: resolve links
        /*System.out.println("Resolve link: "+link);
        link="sys.File";
        return new ElementHandle.UrlHandle(link);*/
        return null;
    }

    @Override
    public String getPrefix(ParserResult result, int arg1, boolean arg2) {
        return null;
    }

    @Override
    public QueryType getAutoQuery(JTextComponent comp, String typedText) {
        if (typedText.length() == 0) {
            return QueryType.NONE;
        }

        if (typedText.charAt(typedText.length() - 1) == '.') {
            return QueryType.COMPLETION;
        }

        char c = typedText.charAt(0);
        if (((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
            return QueryType.COMPLETION;
        }

        return QueryType.NONE;
    }

    @Override
    public String resolveTemplateVariable(String arg0, ParserResult result, int arg2, String arg3, Map arg4) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ParameterInfo parameters(ParserResult result, int arg1, CompletionProposal proposal) {
        return ParameterInfo.NONE;
    }

    /**
     * New NB 7.0beta 2 Completion Handler abstract method (changed method
     * signature)
     *
     * @param dcmnt
     * @param i
     * @param i1
     * @return
     */
    @Override
    public Set<String> getApplicableTemplates(Document dcmnt, int i, int i1) {
        return Collections.emptySet();
    }

}
