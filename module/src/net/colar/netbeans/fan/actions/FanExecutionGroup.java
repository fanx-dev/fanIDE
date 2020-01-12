/*
 * Thibaut Colar Apr 28, 2010
 */
package net.colar.netbeans.fan.actions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.netbeans.api.extexecution.ExternalProcessBuilder;

/**
 * This manages Executing several Execution (ext program calls) as "One"
 * Main reason for that is that several commands can be executed within one ExternalProcessBuilder
 * This is important because of the "Rerun" feature of the IDE that reruns the last ExternalProcessBuilder
 * This allow having actions such as "build & Run" and the like and Rerun them in one click
 *
 * @author tcolar
 */
public class FanExecutionGroup implements Callable<Process>
{

	private List<FanExecution> cmds = new ArrayList<FanExecution>();

	/**
	 * Pass a list of individual execution commands
	 * Note: there individual run() method won't be called, instead we will
	 * call buildProcess() on each an dthen run them together as one process.
	 * @param cmds
	 */
	public FanExecutionGroup(FanExecution... cmds)
	{
		this.cmds.addAll(Arrays.asList(cmds));
	}

	/**
	 * Spawns the call (run the actions)
	 * Spawns a thread because multiple "run" can be running in parallel
	 * @return
	 * @throws Exception
	 */
	public Process call() throws Exception
	{
		FanExecutionGrpThread thread = new FanExecutionGrpThread();
		thread.start();
		return thread.getGroupProcess();
	}

	// #########################################################################
	/**
	 * Internal class
	 * This executes the command sets in it's own thread.
	 */
	class FanExecutionGrpThread extends Thread
	{

		int exitValue = -1;
		volatile boolean done = false;
		// Using Piped Streams to append each subprocess output into one common
		// output for the whole execution group
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		PipedInputStream globalInput = new PipedInputStream();
		PipedOutputStream globalOutput;
		// Whole procfess (all commands)
		Process process = new FanExecGrpProcess();
		// Currently running subprocess
		Process curSubprocess = null;

		public FanExecutionGrpThread()
		{
			try
			{
				globalOutput = new PipedOutputStream(globalInput);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		}

		@Override
		public void run()
		{
			done = false;
			for (FanExecution cmd : cmds)
			{
				try
				{
					ExternalProcessBuilder processBuilder = cmd.buildProcess();
					// We send errorStream into outputStream -> simpler handling
					processBuilder.redirectErrorStream(true);
					curSubprocess = processBuilder.call();
					final InputStream processStream = curSubprocess.getInputStream();
					/*
					 * Start Internal thread that reads all the subprocess output
					 * and append it to the global output stream
					 */
					new Thread(
							new Runnable()
							{

								public void run()
								{
									int i = 0;
									try
									{
										while ((i = processStream.read()) != -1)
										{
											globalOutput.write(i);
											globalOutput.flush();
										}
									} catch (Exception e)
									{
										e.printStackTrace();
									}
								}
							}).start();
					// End internal stream reader thread

					curSubprocess.waitFor();
					Integer result = curSubprocess.exitValue();
					exitValue = result;
					if (result != 0)
					{
						// If failed don't continue -> make that an option ?
						done = true;
						return;
					}
				} catch (Exception e)
				{
					e.printStackTrace();
					done = true;
					return;
				}
			}
			// Try to close all the streams properly
			if (bos != null)
			{
				try
				{
					bos.flush();
					bos.close();
				} catch (Exception e)
				{
				}
			}
			if (globalInput != null)
			{
				try
				{
					globalInput.close();
				} catch (Exception e)
				{
				}
			}
			if (globalOutput != null)
			{
				try
				{
					globalOutput.close();
				} catch (Exception e)
				{
				}
			}
			;
			done = true;
		}

		public Process getGroupProcess()
		{
			return process;
		}

		// #####################################################################
		/**
		 * Internal class
		 * Implements the global "Process"
		 */
		class FanExecGrpProcess extends Process
		{

			@Override
			public OutputStream getOutputStream()
			{
				// not needed but can't be null
				return new ByteArrayOutputStream();
			}

			@Override
			public InputStream getInputStream()
			{
				return globalInput;
			}

			@Override
			public InputStream getErrorStream()
			{
				// Not needed, Errors are sent int outputstream
				byte[] b = new byte[0];
				return new ByteArrayInputStream(b);
			}

			@Override
			public int waitFor() throws InterruptedException
			{
				while (!done)
				{
					sleep(200);
				}
				return exitValue();
			}

			@Override
			public int exitValue()
			{
				return exitValue;
			}

			@Override
			public void destroy()
			{
				// Stop any current process, this should terminate the process thread
				if (curSubprocess != null)
				{
					curSubprocess.destroy();
				}
				// also try cleaning up all streams just in case
				if (bos != null)
				{
					try
					{
						bos.close();
					} catch (Exception e)
					{
					}
				}
				if (globalInput != null)
				{
					try
					{
						globalInput.close();
					} catch (Exception e)
					{
					}
				}
				if (globalOutput != null)
				{
					try
					{
						globalOutput.close();
					} catch (Exception e)
					{
					}
				}
			}
		}
	}
}
