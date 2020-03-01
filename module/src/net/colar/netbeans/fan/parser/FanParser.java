/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parser;

import fan.parser.IncCompiler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ChangeListener;
import net.colar.netbeans.fan.indexer.IndexerHelper;
import net.colar.netbeans.fan.project.ErrorReport;
import net.colar.netbeans.fan.project.FanProject;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;
import org.openide.filesystems.FileObject;

public class FanParser extends Parser {

    private Snapshot snapshot;
    private FanParserResult result;

    @Override
    public void parse (Snapshot snapshot, Task task, SourceModificationEvent event) {
        parse(snapshot);
    }
    
    public void parse (Snapshot snapshot) {
        FanUtilities.logger.fine("parser: " + snapshot.getSource());
        
        this.snapshot = snapshot;
        String code = snapshot.getText().toString();
        FanProject proj = null;
        try {
            IncCompiler compiler = null;
            FileObject fo = snapshot.getSource().getFileObject();
            if (fo != null) {
                Project prj = FileOwnerQuery.getOwner(fo);
                if (prj != null && (prj instanceof FanProject)) {
                    proj = (FanProject)prj;
                    compiler = proj.compiler;
                }
            }
            
            if (compiler != null) {
                fan.std.File file = fan.std.File.os(fo.getPath());
                compiler.updateSource(file.osPath(), code);
                fan.parser.CompilationUnit unit = (fan.parser.CompilationUnit)compiler.compiler.cunits().last();
                compiler.resolveAll();
                ErrorReport.reportErrors(proj, compiler.compiler.log());
                result = new FanParserResult(snapshot, unit, compiler.compiler.log());
                return;
            }
        } catch (Exception ex) {
            Logger.getLogger(FanParser.class.getName()).log(Level.WARNING, null, ex);
        }
        
        try {
            fan.parser.Parser fanParser = fan.parser.Parser.makeSimple(code, "podName");
            fanParser.parse();
            ErrorReport.reportErrors(proj, fanParser.log());
            result = new FanParserResult (snapshot, fanParser.unit(), fanParser.log());
        } catch (Exception ex) {
            Logger.getLogger(FanParser.class.getName()).log(Level.WARNING, null, ex);
        }
    }

    @Override
    public Result getResult (Task task) {
        return result;
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

    
    
}