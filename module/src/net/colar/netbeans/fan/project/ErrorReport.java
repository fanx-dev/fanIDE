/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import fan.parser.CompilerErr;
import fan.parser.CompilerLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.spi.editor.hints.ErrorDescription;
import org.netbeans.spi.editor.hints.ErrorDescriptionFactory;
import org.netbeans.spi.editor.hints.HintsController;
import org.netbeans.spi.editor.hints.Severity;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 *
 * @author yangjiandong
 */
public class ErrorReport {
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
        
        FanLogicalView view = null;
        if (proj != null) view = (FanLogicalView)proj.getLookup().lookup(FanLogicalView.class);
        
        for (Map.Entry<FileObject, List<ErrorDescription>> entry : errorMap.entrySet()) {
            FileObject key = (FileObject)entry.getKey();
            List<ErrorDescription> value = entry.getValue();
            HintsController.setErrors (key, "Fan", value);
            
            if (view != null) {
                updateIcon(view, key, value);
            }
        }
        
        
        if (proj == null) return;
        //clear old errors
        Map<FileObject, List<ErrorDescription> > lastErrors = proj.curErrors;
        if (lastErrors != null) {
            for (Map.Entry<FileObject, List<ErrorDescription>> entry : lastErrors.entrySet()) {
                FileObject key = (FileObject)entry.getKey();
                if (errorMap.containsKey(key)) {
                    continue;
                }
                List<ErrorDescription> value = entry.getValue();
                value.clear();
                HintsController.setErrors (key, "Fan", value);
                updateIcon(view, key, value);
            }
        }
        proj.curErrors = errorMap;
    }
    
    public static void updateIcon(FanLogicalView view, FileObject file, List<ErrorDescription> errors) {
        try {
            Node node = view.findPath(view.root, file);
            if (node != null && node instanceof FanNode) {
                ((FanNode)node).setError(errors.size()>0);
            }
        } catch (Exception ex) {
            Exceptions.printStackTrace(ex);
        }
    }
}
