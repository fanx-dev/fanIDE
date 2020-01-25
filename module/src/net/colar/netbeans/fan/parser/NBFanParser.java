/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parser;

import javax.swing.event.ChangeListener;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.indexer.FanIndexer;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * Parser impl. Bridges NB parser with parboiled parser Base of a parsing job
 * results
 *
 * @author tcolar
 */
public class NBFanParser extends Parser {

    FanParserTask result;

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException {
        // TODO: maybe I can make my own RespositoryUpdaterImpl that does nothing
        //  instead of this ugly class name check hack.
        String taskClass = task.getClass().getName();
        boolean isIndexing = taskClass.startsWith("org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater");

        if (!FanIndexer.sysPodIsIndexed) {
            isIndexing = true;
        }
        
        String path = snapshot.getSource().getFileObject().getPath();
        if (FanIndexer.isAllowedIndexing(snapshot.getSource().getFileObject())) {
            parse(snapshot, isIndexing);
        } else {
            FanUtilities.logger.info("Ignoring request to parse Fantom distro source file: " + path);
        }
    }

    public void parse(Snapshot snapshot, boolean isIndexing) {
        System.out.println("> Parsing of "+snapshot.getSource().getFileObject().getPath());
        result = new FanParserTask(snapshot);
        result.parse(isIndexing, 2000);
        result.parseGlobalScope();
        if (!isIndexing) {
            result.parseLocalScopes();
        }
        System.out.println("< Parsing of "+snapshot.getSource().getFileObject().getPath());
    }

    @Override
    public Result getResult(Task task) throws ParseException {
        return getResult();
    }

    public Result getResult() {
        return result;
    }

    // TODO: This is now deprecated -> remove/replace
    @Override
    public void cancel() {
        if (result != null) {
            result.cancel();
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
