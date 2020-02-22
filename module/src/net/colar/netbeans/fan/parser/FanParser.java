/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parser;

import fan.parser.CompilerErr;
import fan.parser.Loc;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyledDocument;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;
import org.openide.filesystems.FileObject;
import org.openide.text.NbDocument;
import org.openide.util.Exceptions;

public class FanParser extends Parser {

    private Snapshot snapshot;
    private fan.parser.Parser fanParser;

    @Override
    public void parse (Snapshot snapshot, Task task, SourceModificationEvent event) {
        parse(snapshot);
    }
    
    public void parse (Snapshot snapshot) {
        FanUtilities.logger.fine("parser:" + snapshot);
        
        this.snapshot = snapshot;
        Reader reader = new StringReader(snapshot.getText().toString ());
        
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                int ch = reader.read();
                if (ch == -1) break;
                sb.appendCodePoint(ch);
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        String code = sb.toString();
        
        fanParser = fan.parser.Parser.makeSimple(code, "podName");
        try {
            fanParser.parse();
        } catch (Exception ex) {
            Logger.getLogger(FanParser.class.getName()).log(Level.WARNING, null, ex);
        }
    }

    @Override
    public Result getResult (Task task) {
        return new FanParserResult (snapshot, fanParser.unit(), fanParser.log());
    }

    @Override
    public void cancel () {
    }

    @Override
    public void addChangeListener (ChangeListener changeListener) {
    }

    @Override
    public void removeChangeListener (ChangeListener changeListener) {
    }

    
    public static class FanParserResult extends ParserResult {

        private fan.parser.CompilationUnit unit;
        private fan.parser.CompilerLog log;
        private boolean valid = true;

        FanParserResult (Snapshot snapshot, fan.parser.CompilationUnit unit, fan.parser.CompilerLog log) {
            super(snapshot);
            this.unit = unit;
            this.log = log;
        }

        public fan.parser.CompilationUnit getCUnit() {
            //if (!valid) throw new org.netbeans.modules.parsing.spi.ParseException ();
            return unit;
        }

        @Override
        protected void invalidate () {
            valid = false;
        }

        @Override
        public List<? extends Error> getDiagnostics() {
            ArrayList<Error> errors = new ArrayList<Error> ();
            try {
                fan.sys.List syntaxErrors = log.errs();
                Document document = this.getSnapshot ().getSource ().getDocument (false);
                
                for (int i=0; i<syntaxErrors.size(); ++i) {
                    CompilerErr syntaxError = (CompilerErr)syntaxErrors.get(i);
                    Loc loc = syntaxError.loc();
                    int start = 1;
                    int end = start;
                    if (loc.line() != null) {
                        start = NbDocument.findLineOffset ((StyledDocument) document, loc.line().intValue() - 1) + loc.col().intValue() - 1;
                        end = start;
                    }
//                    ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
//                        Severity.ERROR,
//                        syntaxError.getMessage (),
//                        document,
//                        document.createPosition(start),
//                        document.createPosition(end)
//                    );
                    
                    FileObject sourceFile =  this.getSnapshot().getSource().getFileObject();
                    Error error = DefaultError.createDefaultError(loc.toLocStr(), syntaxError.msg(), "Syntax Error"
                            , sourceFile, start, end, true, org.netbeans.modules.csl.api.Severity.ERROR);
                    errors.add (error);
                }
                //HintsController.setErrors (document, "simple-java", errors);
            } catch (Exception ex1) {
                Exceptions.printStackTrace (ex1);
            }
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
    
}