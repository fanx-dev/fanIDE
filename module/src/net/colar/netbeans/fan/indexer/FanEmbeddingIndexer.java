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
import org.netbeans.modules.parsing.spi.indexing.EmbeddingIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;

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
        //FanParserResult fanResult = (FanParserResult) parserResult;
    }
}
