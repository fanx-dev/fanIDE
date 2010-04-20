/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import javax.swing.event.ChangeListener;
import net.colar.netbeans.fan.indexer.FanIndexer;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * Parser impl.
 * Bridges NB parser with parboiled parser
 * Base of a parsing job results
 * @author tcolar
 */
public class NBFanParser extends Parser
{

	FanParserTask result;

	@Override
	public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException
	{
		// TODO: maybe I can make my own RespositoryUpdaterImpl that does nothing
		//  instead of this ugly class name check hack.
		String taskClass = task.getClass().getName();
		boolean isIndexing = taskClass.startsWith("org.netbeans.modules.parsing.impl.indexing.RepositoryUpdater");

		String path = snapshot.getSource().getFileObject().getPath();
		if (FanIndexer.isAllowedIndexing(snapshot.getSource().getFileObject()))
		{
			parse(snapshot, isIndexing);
		} else
		{
			FanUtilities.GENERIC_LOGGER.info("Ignoring request to parse Fantom distro source file: " + path);
		}
	}

	public void parse(Snapshot snapshot, boolean isIndexing)
	{
		result = new FanParserTask(snapshot);
		result.parse();
		result.parseGlobalScope();
		if (!isIndexing && result.getRootScope()!=null)
		{
			result.parseLocalScopes();
		}
	}

	@Override
	public Result getResult(Task task) throws ParseException
	{
		return getResult();
	}

	public Result getResult()
	{
		return result;
	}

	@Override
	public void cancel()
	{
		if (result != null)
		{
			result.cancel();
		}
		//throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void addChangeListener(ChangeListener changeListener)
	{
		//throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void removeChangeListener(ChangeListener changeListener)
	{
		//throw new UnsupportedOperationException("Not supported yet.");
	}
}
