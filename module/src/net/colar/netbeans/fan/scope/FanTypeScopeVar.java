/*
 * Thibaut Colar Mar 2, 2010
 */
package net.colar.netbeans.fan.scope;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import net.colar.netbeans.fan.namespace.FanMethodParam;
import net.colar.netbeans.fan.parser.FanParserErrorKey;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.namespace.FanSlot;
import net.colar.netbeans.fan.namespace.FanType;
import net.colar.netbeans.fan.namespace.Namespace;
import net.colar.netbeans.fan.parser.parboiled.AstKind;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parser.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 *
 * @author thibautc
 */
public class FanTypeScopeVar extends FanAstScopeVarBase {
    // qualified Name

    String qName = "";
    List<FanResolvedType> inheritedItems = new ArrayList<FanResolvedType>();
    // To make it faster to lookup vars
    Hashtable<String, FanAstScopeVarBase> inheritedSlots = new Hashtable<String, FanAstScopeVarBase>();

    public FanTypeScopeVar(AstNode typeDefNode, String name) {
        super(typeDefNode, name);
        // not valid until parsed.
    }

    @SuppressWarnings("unchecked")
    public void parse() {
        if (node == null) {
            return;
        }
        if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_ENUM)) != null) { //TODO: Deal with enum val defs ?
            kind = VarKind.TYPE_ENUM;

        } else if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_FACET)) != null) {
            kind = VarKind.TYPE_FACET;

        } else if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_CLASS)) != null) {
            kind = VarKind.TYPE_CLASS;

        } else if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_ENUM)) != null) { //TODO: Deal with enum val defs ?
            kind = VarKind.TYPE_ENUM;

        } else if (FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_MIXIN)) != null) {
            kind = VarKind.TYPE_MIXIN;
        }
        AstNode nameNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_ID));
        if (nameNode == null) {
            return;
        }

        type = FanResolvedType.makeFromTypeSig(node, nameNode.getNodeText(true));

        if (type == null || !type.isResolved()) {
            FanUtilities.GENERIC_LOGGER.severe(getClass().getName() + " Null type for: " + nameNode.getNodeText(true));
            type = FanResolvedType.makeUnresolved(node);
        }
        node.setType(type);

        AstNode inheritance = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_INHERITANCE));

        name = nameNode.getNodeText(true);

        qName = node.getRoot().getPod() + "::" + name;

        List<AstNode> modifs = FanLexAstUtils.getChildren(node, new NodeKindPredicate(AstKind.AST_MODIFIER));
        for (AstNode m : modifs) {
            String[] mStrs = m.getNodeText(true).split(" ");
            for (String mStr : mStrs) {
                FanAstScopeVarBase.ModifEnum modif = FanAstScopeVarBase.parseModifier(mStr.trim());
                if (modif != null) {
                    modifiers.add(modif);
                }
            }
        }

        // Deal with ineritance
        parseInheritance(inheritance);
    }

    public void parseSlots(FanParserTask task) {
        // Also "cache" inherited slots, for faster var lookup later
        // TODO: there is no need looking up the slots declared here
        // we should only lookup the inherited ones
        FanType dbType = Namespace.get().findByQualifiedName(qName);
        if (dbType != null) {
            List<FanSlot> slots = dbType.getAllSlots();
            for (FanSlot slot : slots) {
                // Note: added as "local" slots, won't be indexed
                FanAstScopeVarBase newVar = new FanLocalScopeVar(node, getType(), slot, slot.getName());
                inheritedSlots.put(slot.getName(), newVar);
            }
        }

        // Deal with children - slots
        @SuppressWarnings("unchecked")
        AstNode blockNode = FanLexAstUtils.getFirstChild(node, new NodeKindPredicate(AstKind.AST_BLOCK));
        if (blockNode == null) {
            return;
        }

        // Deal with enum definitions
        if (kind == VarKind.TYPE_ENUM) {
            // Add compiler generated enum slots
            // vals
            FanSlot vals = new FanSlot("vals", getQName() + "[]", false);
            vals.setIsStatic(true);
            FanAstScopeVarBase valsVar = new FanLocalScopeVar(node, getType(), vals, vals.getName());
            node.addScopeVar(valsVar, true);
            // fromStr
            FanSlot fromStr = new FanSlot("fromStr", getQName(), true);
            fromStr.setIsStatic(true);
            fromStr.addParam(new FanMethodParam("str", getQName()));
            FanAstScopeVarBase fromStrVar = new FanLocalScopeVar(node, getType(), fromStr, fromStr.getName());
            node.addScopeVar(fromStrVar, true);
            // enum values (fields)
            List<String> enumNames = new ArrayList<String>();
            AstNode enumDefs = FanLexAstUtils.getFirstChild(blockNode, new NodeKindPredicate(AstKind.AST_ENUM_DEFS));
            if (enumDefs != null) {
                List<AstNode> enums = FanLexAstUtils.getChildren(enumDefs, new NodeKindPredicate(AstKind.AST_ENUM_NAME));
                for (AstNode enumName : enums) {
                    String nm = enumName.getNodeText(true);
                    if (!enumNames.contains(nm)) {
                        enumNames.add(nm);
                        FanSlot val = new FanSlot(nm, getQName(), false);
                        val.setIsStatic(true);
                        val.setIsConst(true);
                        FanAstScopeVarBase valVar = new FanLocalScopeVar(enumName, getType(), val, val.getName());
                        node.addScopeVar(valVar, true);
                    } else {
                        node.getRoot().getParserTask().addError(FanParserErrorKey.OTHER, "Duplicated Enum value name: " + nm, enumName);
                    }
                }
            }
        }
        if (kind == VarKind.TYPE_FACET) {
            // Field generated by compiler
            FanSlot defVal = new FanSlot("defVal", getQName(), false);
            defVal.setIsStatic(true);
            defVal.setIsStatic(true);
            FanAstScopeVarBase defValVar = new FanLocalScopeVar(node, getType(), defVal, defVal.getName());
            node.addScopeVar(defValVar, true);
        }

        // "Mormal local slots"
        for (AstNode slot : blockNode.getChildren()) {
            switch (slot.getKind()) {
                case AST_SLOT_DEF:
                    @SuppressWarnings("unchecked") List<String> slotModifs = new ArrayList<String>();
                    FanFieldScopeVar slotVar = null;
                    for (AstNode child : slot.getChildren()) {
                        @SuppressWarnings("unchecked")
                        String slotName = FanLexAstUtils.getFirstChildText(child, new NodeKindPredicate(AstKind.AST_ID), false);
                        switch (child.getKind()) {
                            // could be multiple modifiers, but only one of either field, ctor, method
                            case AST_MODIFIER:
                                //Protection is "outside" of field_def/method_def
                                slotModifs.add(child.getNodeText(true));
                                break;
                            case AST_FIELD_DEF:
                                slotVar = new FanFieldScopeVar(child, slotName);
                                break;
                            case AST_METHOD_DEF:
                            case AST_CTOR_DEF:
                                slotVar = new FanMethodScopeVar(child, slotName, child.getKind() == AstKind.AST_CTOR_DEF);
                                break;
                        }
                    }
                    // Add the "outer" modifiers(protection) to the slotVar and save it in scope.
                    for (String modif : slotModifs) {
                        if (slotVar != null) {
                            slotVar.addModifiers(modif);
                        } else {
                            node.getRoot().getParserTask().addError(FanParserErrorKey.OTHER, "Orphaned modifier in slot.", slot);
                        }
                    }
                    if (slotVar != null) //should be
                    {
                        node.addScopeVar(slotVar, false);
                    }
            }
        }
        // TODO: need to parse static block as well (init blocks)
        // TODO: need to parse field initializer blocks as well
    }

    private boolean hasInheritedClass() {
        for (FanResolvedType type : inheritedItems) {
            if (!type.isResolved() && !type.getDbType().isMixin()) {
                return true;
            }
        }
        return false;
    }

    private boolean hasInheritedItem(String qualifiedName) {
        for (FanResolvedType type : inheritedItems) {
            if (type.getAsTypedType().equals(qualifiedName)) {
                return true;
            }
        }
        return false;
    }

    private void parseInheritance(AstNode inheritance) {
        if (kind == VarKind.TYPE_FACET) {
            // implied facet mixin inheritance(nothing in there right now)
            inheritedItems.add(FanResolvedType.makeFromDbType(node, "sys::Facet"));
        }
        if (kind == VarKind.TYPE_ENUM) {
            // implied facet mixin inheritance(nothing in there right now)
            inheritedItems.add(FanResolvedType.makeFromDbType(node, "sys::Enum"));
        }
        if (inheritance != null) {
            @SuppressWarnings("unchecked")
            List<AstNode> children = FanLexAstUtils.getChildren(inheritance, new NodeKindPredicate(AstKind.AST_TYPE));
            for (AstNode child : children) {
                FanResolvedType inhType = FanResolvedType.makeFromTypeSig(child, child.getNodeText(true));
                String text = node.getNodeText(true);
                if (!inhType.isResolved()) {
                    node.getRoot().getParserTask().addError(FanParserErrorKey.UNKNOWN_TYPE, "Unresolved inherited item : " + child.getNodeText(true), child);
                } else {
                    FanType fanType = inhType.getDbType();
                    if (fanType.isFinal()) {
                        // this covers enums too
                        node.getRoot().getParserTask().addError(FanParserErrorKey.OTHER, "Can't inherit from a final class : " + child.getNodeText(true), child);
                    } else if (!fanType.isMixin()) {
                        if (hasInheritedClass()) {
                            node.getRoot().getParserTask().addError(FanParserErrorKey.OTHER, "Can only inherit from one class !", inheritance);
                        }
                    }
                }
                if (!hasInheritedItem(text)) {
                    inheritedItems.add(inhType);
                }
            }
        }
    }

    public List<FanResolvedType> getInheritedItems() {
        return inheritedItems;
    }

    public Hashtable<String, FanAstScopeVarBase> getInheritedSlots() {
        return inheritedSlots;
    }

    public String getQName() {
        return qName;
    }
}
