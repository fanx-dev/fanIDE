/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.completion;

import fan.parser.Block;
import fan.parser.CNamespace;
import fan.parser.CNode;
import fan.parser.CNode$;
import fan.parser.CSlot;
import fan.parser.CType;
import fan.parser.CTypeDef;
import fan.parser.CallExpr;
import fan.parser.FPodNamespace;
import fan.parser.Loc;
import fan.parser.MethodVar;
import fan.parser.NameExpr;
import fan.std.FanType;
import fan.sys.Func;
import java.util.ArrayList;
import java.util.List;
import net.colar.netbeans.fan.indexer.FanIndex;
import net.colar.netbeans.fan.indexer.IndexerHelper;
import net.colar.netbeans.fan.parser.FanParserResult;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.modules.csl.api.CodeCompletionContext;
import org.netbeans.modules.csl.api.CompletionProposal;

/**
 *
 * @author yangjiandong
 */
public class CodeCompletion {

    public static final String[] ROOT_ITEMS
            = {
                "class", "mixin", "enum", "public", "internal", "abstract",
                 "final", "const", "using", "fun", "let", "const",
                 "while", "switch", "case", "default"
            };
    private int caretOffset;
    private CNode curNode;
    private fan.sys.List path;
    private String prefix;
    private CodeCompletionContext context;

    private ArrayList<CompletionProposal> proposals = new ArrayList<CompletionProposal>();

    public CodeCompletion(CodeCompletionContext context) {
        this.context = context;
        prefix = context.getPrefix();
        if (prefix == null) {
            prefix = "";
        }
        caretOffset = context.getCaretOffset();
    }

    public ArrayList<CompletionProposal> propose() {
        try {
            FanUtilities.logger.info("complete caretOffset: " + caretOffset + ", prefix:" + prefix);

            FanParserResult result = (FanParserResult) context.getParserResult();
            path = fan.sys.List.make(10);
            
            Loc loc = Loc.make(null, 0l, 0l, caretOffset, 0l);
            curNode = CNode$.findAt(result.getCUnit(), loc, path);

            FanUtilities.logger.info("complete node: " + FanType.typeof(curNode) + ", prefix:" + prefix);

            if (curNode instanceof fan.parser.Using) {
                proposeUsing();
            }
            else if (curNode instanceof fan.parser.ShortcutExpr) {
                proposeVars();
            }
            else if (curNode instanceof fan.parser.CallExpr) {
                proposeChain();
            }
            else if (curNode instanceof fan.parser.NameExpr) {
                if (!proposeChain()) {
                    proposeVars();
                }
            }
            else {
                proposeRootItems();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return proposals;
    }

    /**
     * Root level (outside class/mixin/enum) propose slot begining keywords
     * (class,enum,mixin , public, abstract and so on) also propose imports
     * items (if within "using ...") proposeImports(proposals);
     */
    private void proposeRootItems() {
        if (prefix.length() == 0) return;
        for (String item : ROOT_ITEMS) {
            if (item.startsWith(prefix)) {
                proposals.add(new FanKeywordProposal(item, caretOffset - prefix.length()));
            }
        }
    }

    /**
     * Complete imports (using) If not in an import do nothing and return false
     * Forms of imports: using id('. id)* eos // whole pod using id('. id)* '::'
     * id eos // Particular type using ([id])? id('.' id)* '::' id eos // FFI
     * using ([id])? id('.' id)* '::' (id | '$') as id eos // with 'as'
     *
     * @param proposals
     * @param anchor
     * @return
     */
    private void proposePods() {
        List<String> names = FanIndex.get().findPod(prefix);
        for (String name : names) {
            proposals.add(new FanImportProposal(name, caretOffset - prefix.length(), false));
        }
    }

    /**
     * Propose Types (class, enum, mixin)
     *
     * @param podName null means all
     * @param proposals
     * @param anchor
     * @param prefix
     */
    private void proposeTypes(String podName) {
        List<CTypeDef> types;
        if (podName == null) {
            types = FanIndex.get().findAllFantomTypes(prefix);
        } else {
            types = FanIndex.get().findPodTypes(podName, prefix);
        }
        for (CTypeDef type : types) {
            // TODO: filter out internals / private ?
            proposals.add(new FanTypeProposal(type, caretOffset - prefix.length(), null));
        }
    }

    /**
     * Propose slots(functions, methods etc...) of a specific types.
     *
     * @param pod
     * @param type
     * @param proposals
     * @param anchor
     * @param prefix
     */
    private void proposeSlots(CType type, int anchor, String prefix) {
        /*if(type instanceof FanResolvedGenericType)
        {
        type = ((FanResolvedGenericType)type).getPhysicalType();
        }*/
        // Not using a cache here.
        fan.std.Map slotMap = type.slots();
        fan.sys.List slots = slotMap.vals();
        for (int i = 0; i < slots.size(); ++i) {
            CSlot slot = (CSlot) slots.get(i);
            if (slot.isPrivate() || slot.isSynthetic()) continue;
            
            if (slot.name().toLowerCase().startsWith(prefix)) {
                // constructor are not marked as static ... but fot this purpose they are
                //boolean isStatic = slot.isStatic() || slot.isCtor();
                proposals.add(new FanSlotProposal(slot, anchor - prefix.length()));
            }
        }
    }

    private void proposeUsing() {
        proposePods();
    }

    /**
     * Propose options for a DOT_CALL ex: SomeClass._ SomeClass.get_
     * object.method()._ Window{title="a"}._
     *
     * @param proposals
     * @param context
     */
    private boolean proposeChain() {
        if (!(curNode instanceof NameExpr)) return false;
        NameExpr node = (NameExpr) curNode;
        if (node.target() == null) return false;
        CType type = node.target().ctype();
        if (type == null) return false;
        String txt = node.name();
        //System.out.println("Call text: " + txt + " type: " + type);

        int offset = caretOffset;
        String prefix = txt.toLowerCase();
        //TODO: could be ?., -> or ?->
        int idx = 0;
        // TODO: kinda ugly -> look for AST_OP instead ??
        if (prefix.startsWith("?->")) {
            idx = 3;
        } else if (prefix.startsWith("->")) {
            idx = 2;
        } else if (prefix.startsWith("~>")) {
            idx = 2;
        } else if (prefix.startsWith("?.")) {
            idx = 2;
        } else if (prefix.startsWith(".")) {
            idx = 1;
        }
        if (idx != 0) {
            prefix = prefix.substring(idx);
        }
        if (type != null && type.isResolved()) {
            proposeSlots(type, offset, prefix);
        }
        return true;
    }

    private void proposeVars() {
        for (int i = (int) path.size() - 1; i >= 0; --i) {
            CNode n = (CNode) path.get(i);
            if (n instanceof Block) {
                Block b = (Block) n;
                for (int j = 0; j < b.vars().size(); ++j) {
                    MethodVar var = (MethodVar) b.vars().get(j);
                    if (var.name().startsWith(prefix)) {
                        CompletionProposal prop = new FanVarProposal(var,
                                caretOffset - prefix.length());
                        proposals.add(prop);
                    }
                }
            } else if (n instanceof CTypeDef) {
                CTypeDef type = ((CTypeDef) n);
                fan.std.Map slots = type.slots();
                slots.each(new Func() {
                    @Override
                    public Object call(Object v, Object k) {
                        CSlot slot = (CSlot) v;
                        if (slot.name().startsWith(prefix)) {
                            FanSlotProposal prop = new FanSlotProposal(slot,
                                    caretOffset - prefix.length());
                            proposals.add(prop);
                        }
                        return null;
                    }
                });

                if (type.name().startsWith(prefix)) {
                    FanTypeProposal prop = new FanTypeProposal(type,
                            caretOffset - prefix.length(), null);
                    proposals.add(prop);
                }
            }
        }
        proposeTypes(null);
    }

}
