/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import fan.parser.CPod;
import fan.parser.CTypeDef;
import fan.parser.CompilerErr;
import fan.parser.CompilerLog;
import fan.parser.FPodNamespace;
import fan.parser.IncCompiler;
import fan.parser.Loc;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.project.FanLogicalView;
import net.colar.netbeans.fan.project.FanNode;
import net.colar.netbeans.fan.project.FanProject;
import static net.colar.netbeans.fan.project.FanProjectFactory.BUILD_FILE;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileStateInvalidException;
import org.openide.filesystems.FileStatusEvent;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 */
public class IndexerHelper {
    private static Logger log = FanUtilities.logger;
    
    private static fan.parser.CNamespace namespace;
    public static fan.parser.CNamespace getNamespace() {
        if (!FanPlatform.isConfigured()) {
            return null;
        }
        if (namespace == null) {
            String dir = FanPlatform.getInstance().getFanHome().getPath() + "/lib/fan";
            fan.std.File dirF = fan.std.File.os(dir);
            namespace = fan.parser.FPodNamespace.make(dirF);
        }
        return namespace;
    }
    
    public static void index(FileObject rootFile) {
        if (!FanPlatform.isConfigured()) {
            return;
        }
        
        Project prj = FileOwnerQuery.getOwner(rootFile);
        if (prj == null || !(prj instanceof FanProject)) {
            return;
        }
        
        fan.parser.CNamespace ns = getNamespace();
        if (ns == null) return;
        
        FanIndex.get().indexNamespace();
        
        indexProject((FanProject)prj);
    }
    
    private static void indexProject(FanProject proj) {
        if (!compile(proj)) return;
        CPod pod = proj.compiler.compiler.pod;
        fan.sys.List types = pod.types();
        for (int j=0; j<types.size(); ++j) {
            CTypeDef type = (CTypeDef)types.get(j);
            FanIndex.get().put(type);
        }
    }
    
    private static boolean compile(FanProject prj) {
        FileObject rootFile = prj.getProjectDirectory();
        FileObject podFile = rootFile.getFileObject(BUILD_FILE);
        if (podFile == null) return false;
        
        FanUtilities.logger.fine("do compiler:"+podFile.getPath());
        
        fan.std.File file = fan.std.File.fromPath(podFile.getPath());
        IncCompiler compiler = IncCompiler.fromProps(file, getNamespace());
        
        
        compiler.resolveAll();
        ((FanProject)prj).compiler = compiler;
        
        //reportErrors(compiler.compiler().log());
        return true;
    }
    
    public static void reportErrors(FanProject proj, CompilerLog log) {
        Map<FileObject, List<ErrorDescription> > errorMap = new HashMap<>();
        for (int i=0; i<log.errs().size(); ++i) {
            CompilerErr err = (CompilerErr)log.errs().get(i);
            
            try {
                FanUtilities.logger.fine("reportErrors:"+err.toStr());

                int start = (int)err.loc.offset;
                int end = (int)err.loc.end();
                if (start == -1) start = 0;
                if (end == -1) end = 0;
                
                if (err.loc.file == null || err.loc.file.equals("Unknown")) {
                    continue;
                }
                
                FileObject fo = FileUtil.toFileObject(new File(err.loc.file));
                ErrorDescription errorDescription = ErrorDescriptionFactory.createErrorDescription(
                        Severity.ERROR,
                        err.msg(),
                        fo,
                        start,
                        end
                );

                List<ErrorDescription> errors = errorMap.get(err.loc.file);
                if (errors == null) {
                    errors = new ArrayList<ErrorDescription> ();
                    errorMap.put(fo, errors);
                }
                errors.add(errorDescription);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        for (Map.Entry<FileObject, List<ErrorDescription>> entry : errorMap.entrySet()) {
            FileObject key = (FileObject)entry.getKey();
            List<ErrorDescription> value = entry.getValue();
            HintsController.setErrors (key, "Fan", value);
        }
        
        if (proj != null) {
            try {
                proj.nextErrors = errorMap;
                proj.updateIcon();
            } catch (Exception ex) {
                Exceptions.printStackTrace(ex);
            }
        }
    }
}
