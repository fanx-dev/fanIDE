/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import fan.parser.CompilationUnit;
import fan.parser.SlotDef;
import fan.parser.TypeDef;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.text.Document;
import net.colar.netbeans.fan.parser.FanParser;
import org.netbeans.api.annotations.common.NullAllowed;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.HtmlFormatter;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.api.StructureItem;
import org.netbeans.modules.csl.api.StructureScanner;
import org.netbeans.modules.csl.api.StructureScanner.Configuration;
import org.netbeans.modules.csl.spi.ParserResult;

public class FanStructureScanner implements StructureScanner {
    @Override
    public List<? extends StructureItem> scan(ParserResult pr) {
        FanParser.FanParserResult res = (FanParser.FanParserResult)pr;
        CompilationUnit unit = res.getCUnit();
        List<StructureItem> list =  new ArrayList<>();
        for (int i=0; i<unit.types().size(); ++i) {
            TypeDef type = (TypeDef)unit.types().get(i);
            ElementKind kind = fan.parser.TypeMixin$.isMixin(type) ? ElementKind.INTERFACE : ElementKind.CLASS;
            FanStructureItem sitem = new FanStructureItem(type, kind, res);
            list.add(sitem);
        }
        return list;
    }
    @Override
    public Map<String, List<OffsetRange>> folds(ParserResult pr) {
        return new HashMap<>();
    }
    @Override
    public Configuration getConfiguration() {
        return null;
    }
}