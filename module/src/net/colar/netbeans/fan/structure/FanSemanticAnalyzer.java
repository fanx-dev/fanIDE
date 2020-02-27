/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.colar.netbeans.fan.parser.FanParserResult;
import org.netbeans.modules.csl.api.ColoringAttributes;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.SemanticAnalyzer;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.Scheduler;
import org.netbeans.modules.parsing.spi.SchedulerEvent;

/**
 * The semantic Analyzer looks at the structure(AST tree), and uses this to
 * highlight source items, display semantic errors and so on.
 *
 * @author thibautc
 */
public class FanSemanticAnalyzer extends SemanticAnalyzer {

    private Map<OffsetRange, Set<ColoringAttributes>> highlights = null;
    // not nearly perfect
    private static final Pattern INTERPOLATION = Pattern.compile("[^\\\\]\\$\\{?[a-zA-Z0-9\\.\\(\\)]*\\}?");

    @Override
    public Map getHighlights() {
        return highlights;
    }

    @Override
    public void run(Result result, SchedulerEvent event) {
        FanParserResult res = (FanParserResult) result;

        //TODO
//        Map<OffsetRange, Set<ColoringAttributes>> newHighlights = new HashMap<OffsetRange, Set<ColoringAttributes>>();
//        if (res.getParseNodeTree() != null) {
//            scanTree(res, res.getAstTree(), newHighlights);
//            highlights = newHighlights.size() == 0 ? null : newHighlights;
//        }
    }

    @Override
    public int getPriority() {
        return 0;
    }

    @Override
    public Class<? extends Scheduler> getSchedulerClass() {
        return Scheduler.EDITOR_SENSITIVE_TASK_SCHEDULER;
    }

//    /**
//     * Run though AST tree and highlight relevant items
//     *
//     * @param ast
//     * @param newHighlights
//     */
//    private void scanTree(FanParserTask result, AstNode node, Map<OffsetRange, Set<ColoringAttributes>> newHighlights) {
//        //System.out.println("Node Lbl: "+node.getLabel()+" "+TokenName.STRS.name());
//        if (node != null) {
//            switch (node.getKind()) {
//                case AST_EXPR_LIT_BASE:
//                    if (node.getType().isResolved()
//                            && node.getType().getQualifiedType().equalsIgnoreCase("sys::Str")) {
//                        addStrHighlights(result, newHighlights, node);
//                    }
//                    break;
//                case AST_TYPE_DEF:
//                    addIdToHighlights(result, newHighlights, node, ColoringAttributes.CLASS_SET);
//                    break;
//                case AST_CTOR_DEF:
//                    addIdToHighlights(result, newHighlights, node, ColoringAttributes.CONSTRUCTOR_SET);
//                    break;
//                case AST_METHOD_DEF:
//                    addIdToHighlights(result, newHighlights, node, ColoringAttributes.METHOD_SET);
//                    break;
//                case AST_FIELD_DEF: // global field
//                    addIdToHighlights(result, newHighlights, node, ColoringAttributes.GLOBAL_SET);
//                    break;
//                // static field ?
//                case AST_PARAM:
//                    //case AST_CTOR_CHAIN:
//                    addToHighlights(result, newHighlights, node, ColoringAttributes.PARAMETER_SET);
//                    break;
//            }
//        }
//
//        if (node != null) {
//            // recurse into subnodes
//            for (AstNode subNode : node.getChildren()) {
//                scanTree(result, subNode, newHighlights);
//            }
//        }
//    }
//
//    private void addIdToHighlights(FanParserTask result, Map<OffsetRange, Set<ColoringAttributes>> newHighlights, AstNode node, EnumSet<ColoringAttributes> colorAttributes) {
//        // We can't mess the enumset, so work of a copy (slower though)
//        Set<ColoringAttributes> newAttributes = EnumSet.copyOf(colorAttributes);
//        @SuppressWarnings("unchecked")
//        AstNode idNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_ID));
//        if (hasModifier(node, "static")) {
//            newAttributes.add(ColoringAttributes.STATIC);
//        } else if (hasModifier(node, "override")) {
//            newAttributes.add(ColoringAttributes.CUSTOM1);
//        }
//
//        addToHighlights(result, newHighlights, idNode, newAttributes);
//    }
//
//    private void addToHighlights(FanParserTask result, Map<OffsetRange, Set<ColoringAttributes>> newHighlights, AstNode node, Set<ColoringAttributes> colorAttributes) {
//        if (node != null) {
//            OffsetRange range = node.getRelevantTextRange();
//            if (range != null) {
//                newHighlights.put(range, colorAttributes);
//            }
//        }
//
//    }
//
//    private static boolean hasModifier(AstNode node, String modifier) {
//        if (node != null) {
//            for (AstNode subNode : node.getChildren()) {
//                if (subNode.getKind() == AstKind.AST_MODIFIER) {
//                    if (subNode.getNodeText(true).contains(modifier)) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//    /**
//     * Highlight interpolated variables in Strings
//     */
//    private void addStrHighlights(FanParserTask result, Map<OffsetRange, Set<ColoringAttributes>> newHighlights, AstNode node) {
//        OffsetRange strRange = node.getRelevantTextRange();
//        String str = node.getNodeText(true);
//        //System.out.println("interpolation : " + str);
//        Matcher matcher = INTERPOLATION.matcher(str);
//        while (matcher.find()) {
//            int start = strRange.getStart() + matcher.start();
//            int end = strRange.getStart() + matcher.end();
//            OffsetRange range = new OffsetRange(start, end);
//            newHighlights.put(range, ColoringAttributes.CUSTOM2_SET);
//        }
//    }

    @Override
    public void cancel() {
        //throw new UnsupportedOperationException("Not supported yet.");
        //TODO
    }
}
