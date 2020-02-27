/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import fan.parser.Loc;
import fan.parser.SlotDef;
import fan.sys.FanObj;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.spi.ParserResult;
import org.openide.filesystems.FileObject;

/**
 * Implementation of a StructureItem Represents an item(ex: class) as found by
 * the structureanalyzer
 *
 * @author thibautc
 */
public class FanStructureItem implements StructureItem {

    private final fan.parser.CNode node;
    private final ParserResult result;
    private final FanElementHandle handle;
    private String name;
    private List<StructureItem> items = new ArrayList<>();
    private String html;
    private int start = 0;
    private int stop = 0;
    private ElementKind kind;

    public FanStructureItem(fan.parser.CNode node, ElementKind kind, ParserResult result) {
        this.node = node;
        this.kind = kind;
        this.result = result;
        //TODO: modifiers
        this.name = (String)FanObj.trap(node, "name");
        // node gives up index of 1st and last token part of this struct. item
        // then we find those tokens by index in tokenStream (from lexer)
        // from that we can find start and end location of struct. text in source file.
        Loc range = node.loc();
        start = (int)range.offset;
        stop = start + (int)range.len;
        
        FileObject file = null;
        if (result.getSnapshot().getSource() != null) {
            file = result.getSnapshot().getSource().getFileObject();
        }
        this.handle = new FanElementHandle(kind, node, file);
        
        if (node instanceof fan.parser.TypeDef) {
            fan.parser.TypeDef type = (fan.parser.TypeDef)node;
            for (int j=0; j<type.slotDefs().size(); ++j) {
                SlotDef slot = (SlotDef)type.slotDefs().get(j);
                if (slot.isGetter() || slot.isSetter() || slot.isOverload()) continue;
                if (slot.isSynthetic()) continue;

                ElementKind skind = (slot instanceof fan.parser.FieldDef) ? ElementKind.FIELD : ElementKind.METHOD;
                FanStructureItem sitem = new FanStructureItem(slot, skind, result);
                items.add(sitem);
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSortText() {
        return "";
    }

    @Override
    public String getHtml(HtmlFormatter arg0) {
        return html != null ? html : getName();
    }

    @Override
    public ElementHandle getElementHandle() {
        return handle;
    }

    @Override
    public ElementKind getKind() {
        return handle.getKind();
    }

    @Override
    public Set<Modifier> getModifiers() {
        return handle.getModifiers();
    }

    @Override
    public boolean isLeaf() {
        return items.isEmpty();
    }

    @Override
    public List<? extends StructureItem> getNestedItems() {
        return items;
    }

    @Override
    public long getPosition() {
        return start;
    }

    @Override
    public long getEndPosition() {
        return stop;
    }

    @Override
    public ImageIcon getCustomIcon() {
        return null;
    }

//    void setName(String text) {
//        name = text;
//    }
//
//    void addModifier(Modifier modifier) {
//        getModifiers().add(modifier);
//    }
//
//    void setNestedItems(List<StructureItem> subList) {
//        items = subList;
//    }
//
//    void setHtml(String string) {
//        html = string;
//    }

    @Override
    public int hashCode() {
        int hash = 7;

        hash = (29 * hash) + ((this.getName() != null) ? this.getName().hashCode() : 0);
        hash = (29 * hash) + (kind != null ? this.kind.hashCode() : 0);

        return hash;
    }

    /**
     * Note: If this is not implemented(together with hashcode), the navigator
     * does not work quite right In particular it "collapses/folds down" when
     * dbl-clicking an item
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FanStructureItem other = (FanStructureItem) obj;
        if (this.kind != other.kind || !this.getName().equals(other.getName())) {
            return false;
        }
        return true;
    }
}
