/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import fan.parser.CPod;
import fan.parser.CTypeDef;
import fan.parser.IncCompiler;
import java.util.logging.Logger;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.project.FanProject;
import static net.colar.netbeans.fan.project.FanProjectFactory.BUILD_FILE;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.openide.filesystems.FileObject;

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
        
        CPod oldPod = null;
        if (proj.compiler != null) {
            oldPod = proj.compiler.compiler.pod;
        }
        
        if (!compile(proj)) return;
        
        if (oldPod != null) {
            fan.sys.List types = oldPod.types();
            for (int j=0; j<types.size(); ++j) {
                CTypeDef type = (CTypeDef)types.get(j);
                FanIndex.get().removeType(type);
            }
        }
        
        CPod pod = proj.compiler.compiler.pod;
        fan.sys.List types = pod.types();
        for (int j=0; j<types.size(); ++j) {
            CTypeDef type = (CTypeDef)types.get(j);
            FanIndex.get().putType(type);
        }
    }
    
    private static boolean compile(FanProject prj) {
        FileObject rootFile = prj.getProjectDirectory();
        FileObject podFile = rootFile.getFileObject(BUILD_FILE);
        if (podFile == null) return false;
        
        FanUtilities.logger.fine("do compiler:"+podFile.getPath());
        
        fan.std.File file = fan.std.File.os(podFile.getPath());
        IncCompiler compiler = IncCompiler.fromProps(file, getNamespace());
        
        
        compiler.resolveAll();
        ((FanProject)prj).compiler = compiler;
        
        //reportErrors(compiler.compiler().log());
        return true;
    }
    
}
