/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.parser.parboiled;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.parboiled.Rule;
import org.parboiled.parserunners.RecoveringParseRunner;
import org.parboiled.support.ParsingResult;

/**
 *
 * @author thibautc
 */
public class CancellableRecoveringParserRunner<V> extends RecoveringParseRunner<V>  implements Callable<ParsingResult>
{
  private final String input;

  public CancellableRecoveringParserRunner(Rule rule, String input, long timeout)
  {
    super(rule, timeout);
    this.input = input;
  }

  public Future<ParsingResult> start() throws InterruptedException, ExecutionException
  {
    ExecutorService es = Executors.newSingleThreadExecutor ();
    Future<ParsingResult> future = es.submit(this);
    return future;
  }

  public ParsingResult call() throws Exception
  {
    return run(input);
  }
}
