/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.completion;

import fan.parser.CField;
import fan.parser.CMethod;
import fan.parser.CNode;
import fan.parser.CParam;
import fan.parser.CSlot;
import fan.parser.CTypeDef;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;
import net.colar.netbeans.fan.indexer.IndexerHelper;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.structure.FanElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;

/**
 * Completion for slots
 *
 * @author tcolar
 */
public class FanSlotProposal extends FanCompletionProposal {

    private String html = "";
    private String rHtml = "";
    private String prefix = "";

    // create from a fan slot
    public FanSlotProposal(CSlot slot, int anchor, CNode node, CTypeDef baseType) {
        this.kind = ElementKind.OTHER;
        this.name = slot.name();
        this.anchor = anchor;
        this.modifiers = new HashSet<Modifier>();
        if (slot instanceof CField) {
            this.kind = ElementKind.FIELD;
            if (slot.isConst()) {
                this.kind = ElementKind.CONSTANT;
            }
            html = name;
            prefix = name;
            rHtml += ((CField) slot).fieldType().toStr();
        } else if (slot instanceof CMethod) {
            this.kind = ElementKind.METHOD;
            if (slot.isCtor()) {
                this.kind = ElementKind.CONSTRUCTOR;
            }
            String args = "";
            html = name + "(";
            prefix = name + "(";
            rHtml = ((CMethod) slot).returnType().toStr();
            if (rHtml.equals("sys::Void")) {
                rHtml = "";
            }
            fan.sys.List params = ((CMethod) slot).params();
            int lastNotOptional = -1;
            for (int i = 0; i != params.size(); i++) {
                CParam p = (CParam) params.get(i);
                if (!p.hasDefault()) {
                    lastNotOptional = i;
                }
            }
            String funcCall = "";
            for (int i = 0; i != params.size(); i++) {
                CParam p = (CParam) params.get(i);
                if (args.length() > 0) {
                    args += " ,";
                }
                String nm = p.name();
                if (p.hasDefault()) {
                    nm = "<font color='#662222'><i>" + p.name() + "</i></font>";
                } else {
                    nm = "<font color='#AA2222'>" + p.name() + "</font>";
                    // If last non defaulted param is a function propose something like
                    // .each {}    or .call |str->int| {}
//                    if (p.isFunctionType() && i == lastNotOptional)
//                    {
//                        FanResolvedFuncType func = (FanResolvedFuncType) FanResolvedFuncType.makeFromTypeSig(node, p.getQualifiedType());
//                        if(func!=null)
//                            funcCall = " " + func.getComplProposal(baseType, node) + " {}";
//                    } else
                    {
                        // only list non-defaulted parameters by default
                        if (!prefix.endsWith("(")) {
                            prefix += ", ";
                        }
                        prefix += p.name();
                    }
                }
                String typeName = p.paramType().toStr();
                args += typeName + " " + nm;
            }

            // remove optional parenthesis when no parameters
            if (prefix.endsWith("(")) {
                prefix = prefix.substring(0, prefix.length() - 1);
            } else {
                prefix += ")";
            }
            // add possible trailing closure
            prefix += funcCall;
            html += args + ")";

        } else {
            FanUtilities.logger.severe("Unknown Slot type: " + slot);
        }
        FanElementHandle handle = new FanElementHandle(name, kind);
        //handle.setDoc(IndexerHelper.getSlotDoc(slot));
        element = handle;

        if (slot.isPrivate()) {
            modifiers.add(Modifier.PRIVATE);
        } else if (slot.isProtected() || slot.isInternal()) {
            modifiers.add(Modifier.PROTECTED);
        } else if (slot.isPublic()) {
            modifiers.add(Modifier.PUBLIC);
        }
        if (slot.isStatic()) {
            modifiers.add(Modifier.STATIC);
        }

    }

    // create form a java Member
    FanSlotProposal(Member slot, int anchor) {
        this.kind = ElementKind.OTHER;
        this.name = slot.getName();
        this.anchor = anchor;
        int flags = slot.getModifiers();
        this.modifiers = new HashSet<Modifier>();
        if (slot instanceof Field) {
            this.kind = ElementKind.FIELD;
            if (java.lang.reflect.Modifier.isStatic(flags) && java.lang.reflect.Modifier.isFinal(flags)) {
                this.kind = ElementKind.CONSTANT;
            }
            html = name;
            prefix = name;
            rHtml += ((Field) slot).getType().getSimpleName();
        } else {
            String typeName = "";
            // method or ctor
            this.kind = ElementKind.METHOD;
            Class[] params = null;
            if (slot instanceof Constructor) {
                this.kind = ElementKind.CONSTRUCTOR;
                params = ((Constructor) slot).getParameterTypes();
                rHtml = slot.getName();
            } else {
                params = ((Method) slot).getParameterTypes();
                rHtml = ((Method) slot).getReturnType().getSimpleName();
            }
            String args = "";
            html = name + "(";
            prefix = name + "(";
            for (Class p : params) {
                if (args.length() > 0) {
                    args += " ,";
                }
                String nm = p.getSimpleName();

                nm = "<font color='#AA2222'>" + p.getSimpleName() + "</font>";
                // only list non-defaulted parameters by default
                if (!prefix.endsWith("(")) {
                    prefix += ", ";
                }
                prefix += p.getSimpleName().toLowerCase();
                args += nm;
            }

            // remove optional parenthesis when no parameters
            if (prefix.endsWith("(")) {
                prefix = prefix.substring(0, prefix.length() - 1);
            } else {
                prefix += ")";
            }
            html += args + ")";
        }
        FanElementHandle handle = new FanElementHandle(name, kind);
        //handle.setDoc("");
        element = handle;

        if (java.lang.reflect.Modifier.isPrivate(flags)) {
            modifiers.add(Modifier.PRIVATE);
        } else if (java.lang.reflect.Modifier.isProtected(flags)) {
            modifiers.add(Modifier.PROTECTED);
        } else if (java.lang.reflect.Modifier.isPublic(flags)) {
            modifiers.add(Modifier.PUBLIC);
        }
        if (java.lang.reflect.Modifier.isStatic(flags)) {
            modifiers.add(Modifier.STATIC);
        }

    }

    @Override
    public String getInsertPrefix() {
        return prefix;
    }

    /**
     * left side html
     *
     * @param formater
     * @return
     */
    @Override
    public String getLhsHtml(HtmlFormatter formater) {
        return html;
    }

    /**
     * right side html
     *
     * @param formater
     * @return
     */
    @Override
    public String getRhsHtml(HtmlFormatter formater) {
        return rHtml;
    }
}
