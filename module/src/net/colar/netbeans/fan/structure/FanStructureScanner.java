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
import net.colar.netbeans.fan.parser.FanParserResult;
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
    public static final String CODE_FOLDS = "codeblocks";
    public static final String DOC_FOLDS = "comments";
    public static final String COMMENT_FOLDS = "comments";
    public static final String IMPORT_FOLDS = "imports";
    
    private Configuration config = new Configuration(false, true);
    
    @Override
    public List<? extends StructureItem> scan(ParserResult pr) {
        FanParserResult res = (FanParserResult)pr;
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
        Map<String, List<OffsetRange>> folds = new HashMap<String, List<OffsetRange>>();
        
//        FanParser.FanParserResult res = (FanParser.FanParserResult)pr;
//        CompilationUnit unit = res.getCUnit();
//        for (int i=0; i<unit.types().size(); ++i) {
//            TypeDef type = (TypeDef)unit.types().get(i);
//            List<OffsetRange> fold = folds.get(CODE_FOLDS);
//            if (fold == null) {
//                fold = new ArrayList<OffsetRange>();
//                folds.put(CODE_FOLDS, fold);
//            }
//            fold.add(new OffsetRange((int)type.loc.offset, (int)type.loc.end()));
//            
//            
//            for (int j=0; j<type.slotDefs().size(); ++j) {
//                SlotDef slot = (SlotDef)type.slotDefs().get(j);
//                if (slot.isGetter() || slot.isSetter() || slot.isOverload()) continue;
//                fold.add(new OffsetRange((int)slot.loc.offset, (int)slot.loc.end()));
//            }
//        }
        return folds;
    }
    @Override
    public Configuration getConfiguration() {
        return config;
    }
}