/*
 * Thibaut Colar Sep 2, 2009
 */
package net.colar.netbeans.fan.indexer;

import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexer;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexerFactory;
import org.netbeans.modules.parsing.spi.indexing.Indexable;
import org.openide.filesystems.FileObject;

/**
 * Indexer Factory impl. Registered through layer.xml
 *
 * @author thibautc
 */
public class FanIndexerFactory extends CustomIndexerFactory {

    public static final String NAME = "FanIndexer";
    public static final int VERSION = 4;
    private static FanIndexer indexer = new FanIndexer();

    public FanIndexerFactory() {
        FanUtilities.logger.info("Fantom - Inited indexer Factory");
    }

    public static FanIndexer getIndexer() {
        return indexer;
    }

    @Override
    public CustomIndexer createIndexer() {
        return indexer;
    }

    @Override
    public boolean supportsEmbeddedIndexers() {
        return false;
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
        for (Indexable idx : itrbl) {
            String path = idx.getURL().getPath();
            FanUtilities.logger.fine("File deleted: " + path);
            indexer.requestDelete(path);
        }
    }

    @Override
    public void filesDirty(Iterable<? extends Indexable> itrbl, Context cntxt) {
        // requestIndexing
        indexer.index(itrbl, cntxt);
    }

    /**
     * recursive
     *
     * @param root
     * @param nb
     * @return
     */
    public int scanFolder(FileObject root, int nb) {
        return indexer.indexSrcFolder(root, nb);
    }

    @Override
    public void scanFinished(Context cntxt) {
    }

    @Override
    public boolean scanStarted(Context context) {
        FileObject root = context.getRoot();
        scanFolder(root, 0);
        // what does the return mean ?
        return true;
    }
}
