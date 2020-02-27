/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parser;

import fan.parser.CompilerErr;
import fan.parser.Loc;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.text.NbDocument;
import org.openide.util.Exceptions;

/**
 *
 * @author yangjiandong
 */
public class FanParserResult extends ParserResult {
    
    private fan.parser.CompilationUnit unit;
    private fan.parser.CompilerLog log;
    private boolean valid = true;
    ArrayList<Error> errors = new ArrayList<Error>();

    FanParserResult(Snapshot snapshot, fan.parser.CompilationUnit unit, fan.parser.CompilerLog log) {
        super(snapshot);
        this.unit = unit;
        this.log = log;
    }

    public fan.parser.CompilationUnit getCUnit() {
        //if (!valid) throw new org.netbeans.modules.parsing.spi.ParseException ();
        return unit;
    }

    @Override
    protected void invalidate() {
        valid = false;
    }

    @Override
    public List<? extends Error> getDiagnostics() {
//        try {
//            fan.sys.List syntaxErrors = log.errs();
//            FileObject curFile = getSourceFile();
//            //Document document = this.getSnapshot().getSource().getDocument(false);
//            for (int i = 0; i < syntaxErrors.size(); ++i) {
//                CompilerErr syntaxError = (CompilerErr) syntaxErrors.get(i);
//                Loc loc = syntaxError.loc;
//                int start = (int)loc.offset;
//                int end = (int)loc.end();
//                
//                //System.out.println("erro:"+syntaxError.file + ","+start + "," + end);
//                //if (start == -1) continue;
//                
//                FileObject sourceFile = FileUtil.toFileObject(new File(syntaxError.loc.file));
//                
//                if (!sourceFile.equals(curFile)) continue;
//                
//                Error error = DefaultError.createDefaultError("ErrorKind"
//                        , syntaxError.msg()
//                        , syntaxError.msg()
//                        , sourceFile
//                        , start, end
//                        , false
//                        , org.netbeans.modules.csl.api.Severity.ERROR);
//                errors.add(error);
//            }
//            //HintsController.setErrors (document, "simple-java", errors);
//        } catch (Exception ex1) {
//            Exceptions.printStackTrace(ex1);
//        }
        return errors;
    }

    public FileObject getSourceFile() {
        FileObject sourceFile = null;
        if (getSnapshot() != null) {
            sourceFile = getSnapshot().getSource().getFileObject();
        }
        return sourceFile;
    }
    
}
