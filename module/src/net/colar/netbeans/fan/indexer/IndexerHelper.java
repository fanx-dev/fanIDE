/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import fanx.fcode.FConst;
import fanx.fcode.FField;
import fanx.fcode.FMethod;
import fanx.fcode.FMethodVar;
import fanx.fcode.FPod;
import fanx.fcode.FStore;
import fanx.fcode.FType;
import fanx.fcode.FTypeRef;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import net.colar.netbeans.fan.fantom.FanPlatform;
import static net.colar.netbeans.fan.indexer.FanEmbeddingIndexer.checkIfNeedsReindexing;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 */
public class IndexerHelper {
    private static Logger log = FanUtilities.logger;
    
    public static boolean isAllowedIndexing(FileObject srcFile) {
        FileObject fanHome = FanPlatform.getInstance().getFanHome();
        if (fanHome == null) return false;
        if (fanHome.getPath().equals(srcFile.getPath())
                || FileUtil.isParentOf(fanHome, srcFile)) {
            return false;
        }
        return true;
    }
    
}
