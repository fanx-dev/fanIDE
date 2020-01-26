/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import java.io.File;
import java.util.Collection;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Logger;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.namespace.FanConst;
import net.colar.netbeans.fan.namespace.FanElement;
import net.colar.netbeans.fan.namespace.FanMethodParam;
import net.colar.netbeans.fan.namespace.FanSlot;
import net.colar.netbeans.fan.namespace.FanSrcFile;
import net.colar.netbeans.fan.namespace.FanType;
import net.colar.netbeans.fan.namespace.Namespace;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.parser.NBFanParser;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanMethodScopeVar;
import net.colar.netbeans.fan.scope.FanScopeMethodParam;
import net.colar.netbeans.fan.scope.FanTypeScopeVar;
import net.colar.netbeans.fan.types.FanResolvedType;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.EmbeddingIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author yangjiandong
 */
public class FanEmbeddingIndexer extends EmbeddingIndexer {
    
    private static Logger log = FanUtilities.logger;

    /**
     * Indexes the given AST (parser result).
     *
     * @param parserResult to be indexed
     * @param context of indexer, contains information about index storage,
     * indexed root
     */
    @Override
    protected void index(Indexable indexable, Parser.Result parserResult, Context context) {
        String path = indexable.getURL().getPath();
        log.fine("FanEmbeddingIndexer: " + path);
        // Index the parsed doc
//        indexSrc(path, result);
        FanParserTask fanResult = (FanParserTask) parserResult;
        IndexerHelper.doIndexSrc(path, fanResult.getRootScope());
    }
    
    public static boolean checkIfNeedsReindexing(String path, long tstamp) {
        FanSrcFile file = FanSrcFile.findByPath(path);
        if (file == null) {
            return true;
        }
        if (file.getTstamp() < tstamp) {
            return true;
        }
        return false;
    }
    
    
    private void parseAndIndexSrc(String path) {
        if (!FanPlatform.isConfigured()) {
            log.info("Platform not ready to index: " + path);
            return;
        }

        if (!IndexerHelper.isAllowedIndexing(FileUtil.toFileObject(FileUtil.normalizeFile(new File(path))))) {
            log.info("Skipping: " + path);
            return;
        }

        long then = new Date().getTime();
        log.info("Indexing requested for: " + path);
        // Get a snaphost of the source
        File f = new File(path);

        FileObject fo = FileUtil.toFileObject(FileUtil.normalizeFile(f));
        Source source = Source.create(fo);
        Snapshot snapshot = source.createSnapshot();
        // Parse the snaphot
        NBFanParser parser = new NBFanParser();
        try {
            parser.parse(snapshot, true);
        } catch (Throwable e) {
            log.throwing("Parsing failed for: " + path, "indexSrc", e);
            return;
        }
        Result result = parser.getResult();
        long now = new Date().getTime();
        log.fine("Indexing - parsing done in " + (now - then) + " ms for: " + path);
        // Index the parsed doc
//        indexSrc(path, result);
        FanParserTask fanResult = (FanParserTask) result;
        IndexerHelper.doIndexSrc(path, fanResult.getRootScope());

        now = new Date().getTime();
        log.fine("Indexing completed in " + (now - then) + " ms for: " + path);
    }

    
    public int indexSrcFolder(FileObject root, int nb) {
        if (!FanPlatform.isConfigured()) {
            return 0;
        }
        if (!IndexerHelper.isAllowedIndexing(root)) {
            return nb;
        }
        FileObject[] children = root.getChildren();
        for (FileObject child : children) {
            if (child.isFolder()) {
                //recurse
                nb = indexSrcFolder(child, nb);
            } else {
                if (child.hasExt("fan") || child.hasExt("fwt")) {
                    if (checkIfNeedsReindexing(child.getPath(), child.lastModified().getTime())) {
                        log.info("ReIndexing: " + root.getPath());
                        nb++;
                        parseAndIndexSrc(child.getPath());
                    }
                }
            }
        }
        return nb;
    }
    
}
