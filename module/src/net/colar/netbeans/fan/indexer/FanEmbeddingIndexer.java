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
import net.colar.netbeans.fan.parser.FanParser.FanParserResult;
import net.colar.netbeans.fan.parser.FanParser;
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
        FanParserResult fanResult = (FanParserResult) parserResult;
        //IndexerHelper.doIndexSrc(path, fanResult.getRootScope());
    }
    
    public static boolean checkIfNeedsReindexing(String path, long tstamp) {
        //TODO
//        FanSrcFile file = FanSrcFile.findByPath(path);
//        if (file == null) {
//            return true;
//        }
//        if (file.getTstamp() < tstamp) {
//            return true;
//        }
//        return false;
        return true;
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

        log.info("Indexing requested for: " + path);
        // Get a snaphost of the source
        File f = new File(path);

        FileObject fo = FileUtil.toFileObject(FileUtil.normalizeFile(f));
        Source source = Source.create(fo);
        Snapshot snapshot = source.createSnapshot();
        // Parse the snaphot
        FanParser parser = new FanParser();
        try {
            parser.parse(snapshot);
        } catch (Throwable e) {
            log.throwing("Parsing failed for: " + path, "indexSrc", e);
            return;
        }
        Result result = parser.getResult(null);
        // Index the parsed doc
//        indexSrc(path, result);
//        FanParserTask fanResult = (FanParserTask) result;
//        IndexerHelper.doIndexSrc(path, fanResult.getRootScope());
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
                        //TODO
                        //parseAndIndexSrc(child.getPath());
                    }
                }
            }
        }
        return nb;
    }
    
}
