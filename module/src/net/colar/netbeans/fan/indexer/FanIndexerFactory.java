/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexer;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexerFactory;
import org.netbeans.modules.parsing.spi.indexing.EmbeddingIndexer;
import org.netbeans.modules.parsing.spi.indexing.EmbeddingIndexerFactory;
import org.netbeans.modules.parsing.spi.indexing.Indexable;
import org.openide.filesystems.FileObject;

/**
 *
 */
public class FanIndexerFactory extends CustomIndexerFactory{

    private FanIndexer indexer = new FanIndexer();
    
    public static final String NAME = "FanIndexer";
    public static final int VERSION = 4;

    public FanIndexerFactory() {
        FanUtilities.logger.info("Fantom - Inited indexer Factory");
    }

    @Override
    public String getIndexerName() {
        return NAME;
    }

    @Override
    public int getIndexVersion() {
        return VERSION;
    }

    @Override
    public void filesDeleted(Iterable<? extends Indexable> itrbl, Context cntxt) {
//        for (Indexable idx : itrbl) {
//            String path = idx.getURL().getPath();
//            FanUtilities.logger.fine("File deleted: " + path);
//            indexer.requestDelete(path);
//        }
        FanUtilities.logger.info("FanEmbeddingIndexerFactory: filesDeleted");
    }

    @Override
    public void filesDirty(Iterable<? extends Indexable> itrbl, Context cntxt) {
        // requestIndexing
        //indexer.index(itrbl, cntxt);
        FanUtilities.logger.info("FanEmbeddingIndexerFactory: filesDirty");
    }

    @Override
    public void scanFinished(Context cntxt) {
        FanUtilities.logger.info("FanEmbeddingIndexerFactory: scanFinished");
    }

    @Override
    public boolean scanStarted(Context context) {
        FanUtilities.logger.info("FanEmbeddingIndexerFactory: scanStarted:" + context.getRootURI());
        
        FileObject root = context.getRoot();
        IndexerHelper.index(root);
        return true;
    }

    @Override
    public CustomIndexer createIndexer() {
        FanUtilities.logger.info("createIndexer");
        return indexer;
    }

    @Override
    public boolean supportsEmbeddedIndexers() {
        return false;
    }
    
}
