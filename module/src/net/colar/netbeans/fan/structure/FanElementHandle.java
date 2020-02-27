/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import fan.parser.Loc;
import fan.sys.FanObj;
import java.util.HashSet;
import java.util.Set;
import net.colar.netbeans.fan.plugin.FanLanguage;
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

    private FileObject file;
    private fan.parser.CNode node;
    private ElementKind kind;
    private OffsetRange offsetRange;
    private Set<Modifier> modifiers = new HashSet<Modifier>();
    private String name;
    private String doc;

    public FanElementHandle(ElementKind kind, fan.parser.CNode node, FileObject file) {
        this.node = node;
        this.file = file;
        this.kind = kind;
        
        int start = (int)node.loc().offset;
        int stop = start + (int)node.loc().len;
        this.offsetRange = new OffsetRange(start, stop);
        this.name = (String)FanObj.trap(node, "name");
    }
    
    public FanElementHandle(String name, ElementKind kind) {
        this.kind = kind;
        this.name = name;
    }
    
    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    @Override
    public FileObject getFileObject() {
        return file;
    }

    @Override
    public String getMimeType() {
        return FanLanguage.FAN_MIME_TYPE;
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
