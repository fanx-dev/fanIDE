/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import fan.sys.FanObj;
import java.util.HashSet;
import java.util.Set;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Source;
import org.openide.filesystems.FileObject;

/**
 * Element Handle impl. Used by structureAnalyzer
 *
 * @author tcolar
 */
public class FanElementHandle implements ElementHandle {

    private Source source;
    private fan.parser.CNode node;
    private ElementKind kind;
    private OffsetRange offsetRange;
    private Set<Modifier> modifiers = new HashSet<Modifier>();
    private String name;

    public FanElementHandle(ElementKind kind, fan.parser.CNode node, ParserResult result, OffsetRange range) {
        this.node = node;
        this.source = result.getSnapshot().getSource();
        this.kind = kind;
        this.offsetRange = range;
        this.name = (String)FanObj.trap(node, "name");
    }
    
    public FanElementHandle(String name, ElementKind kind) {
        this.kind = kind;
        this.name = name;
    }

    @Override
    public FileObject getFileObject() {
        return source.getFileObject();
    }

    @Override
    public String getMimeType() {
        return source.getMimeType();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getIn() {
        return "";
    }

    @Override
    public ElementKind getKind() {
        return kind;
    }

    @Override
    public Set<Modifier> getModifiers() {
        return modifiers;
    }

    public void setModifiers(Set<Modifier> modifiers) {
        this.modifiers = modifiers;
    }

    @Override
    public boolean signatureEquals(ElementHandle arg0) {
        return false;
    }

    @Override
    public OffsetRange getOffsetRange(ParserResult result) {
        return offsetRange;
    }

}
