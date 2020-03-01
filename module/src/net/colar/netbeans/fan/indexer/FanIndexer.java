/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import java.util.logging.Logger;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexer;
import org.netbeans.modules.parsing.spi.indexing.EmbeddingIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;

/**
 *
 * @author yangjiandong
 */
public class FanIndexer extends CustomIndexer {

    private static Logger log = FanUtilities.logger;

    @Override
    protected void index(Iterable<? extends Indexable> iterable, Context context) {
        for (Indexable indexable : iterable) {
            String path = indexable.getURL().getPath();
            log.fine("FanIndexer: " + path);
        }
    }
}
