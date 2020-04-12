/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

//import fanx.util.FileUtil;
import fan.parser.CNode;
import fan.parser.CNode$;
import fan.parser.CTypeDef;
import fan.parser.FieldDef;
import fan.parser.Loc;
import fan.parser.MethodDef;
import fan.parser.TypeDef;
import fan.std.FanType;
import java.io.File;
import java.util.Hashtable;
import javax.swing.text.Document;
import net.colar.netbeans.fan.parser.FanParserResult;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenHierarchy;
import org.netbeans.modules.csl.api.DeclarationFinder;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 * Helper to find the declaration of a type/slot
 *
 * @author thibautc
 */
public class FanDeclarationFinder implements DeclarationFinder {

    @Override
    public DeclarationLocation findDeclaration(ParserResult result, int caretOffset) {
        FanParserResult task = (FanParserResult) result;
        fan.parser.CompilationUnit unit = task.getCUnit();
        
        CNode node = CNode$.findAt(unit, Loc.make("", 0l, 0l, caretOffset));
        
        FanUtilities.logger.fine("findDeclaration:"+caretOffset + ", node:" + FanType.typeof(node) +
                node.loc().toStr());
        
        if (node instanceof fan.parser.LocalVarExpr) {
            fan.parser.LocalVarExpr expr = (fan.parser.LocalVarExpr)node;
            if (expr.var_v != null) {
                FileObject fo = task.getSourceFile();
                return new DeclarationLocation(fo, (int)expr.var_v.loc().offset);
            }
        }
        else if (node instanceof  fan.parser.FieldExpr) {
            fan.parser.FieldExpr expr = (fan.parser.FieldExpr)node;
            if (expr.field != null && expr.field instanceof FieldDef) {
                FieldDef def = (FieldDef)expr.field;
                String file = def.loc().file;
                FileObject fo = FileUtil.toFileObject(new File(file));
                return new DeclarationLocation(fo, (int)def.loc().offset);
            }
        }
        else if (node instanceof  fan.parser.CallExpr) {
            fan.parser.CallExpr expr = (fan.parser.CallExpr)node;
            if (expr.method != null && expr.method instanceof MethodDef) {
                MethodDef def = (MethodDef)expr.method;
                String file = def.loc().file;
                FileObject fo = FileUtil.toFileObject(new File(file));
                return new DeclarationLocation(fo, (int)def.loc().offset);
            }
        }
        else if (node instanceof  fan.parser.CType) {
            fan.parser.CType expr = (fan.parser.CType)node;
            if (expr.isResolved()) {
                CTypeDef type = (CTypeDef)expr.typeDef();
                String file = type.loc().file;
                FileObject fo = FileUtil.toFileObject(new File(file));
                return new DeclarationLocation(fo, (int)type.loc().offset);
            }
        }
        else {
            CNode$.printTree(unit);
        }
        
        // Not found
        return DeclarationLocation.NONE;
    }

    @Override
    public OffsetRange getReferenceSpan(Document doc, int caretOffset) {
//        Token tk = FanLexAstUtils.getFanTokenAt(doc, caretOffset);
//        TokenHierarchy th = TokenHierarchy.get(doc);
//        int start = tk.offset(th);
//        int end = start + tk.length();
        //TODO
        int start = caretOffset;
        int end = caretOffset;
        OffsetRange range = new OffsetRange(start, end);
        //System.out.println("getRefSpan: " + start + "-" + end);
        return range;
    }

}
