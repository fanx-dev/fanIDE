/*
 * Thibaut Colar Aug 20, 2009
 */

package net.colar.netbeans.fan.debugger;

import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.debugger.DebuggerEngine.Destructor;
import org.netbeans.spi.debugger.DebuggerEngineProvider;

/**
 * UNUSED, so far
 *
 * Debugger engine impl.
 * Gets registered with Annotation
 * @author thibautc
 */
//@DebuggerEngineProvider.Registration // TODO: doesn't work
public class FanDebuggerEngineProvider extends DebuggerEngineProvider 
{
	static{FanUtilities.logger.info("### Registering: "+FanDebuggerEngineProvider.class.getName());}

	public static final String ID="FanDebuggerEngine";
	public static final String[] langs = new String[] {"fan"};
	private Destructor destructor;

	@Override
	public String[] getLanguages()
	{
		return langs;
	}

	@Override
	public String getEngineTypeID()
	{
		return ID;
	}

	@Override
	public Object[] getServices()
	{
		return new Object[] {};
	}

	@Override
	public void setDestructor(Destructor destructor)
	{
		this.destructor=destructor;
	}

	public Destructor getDestructor()
	{
		return destructor;
	}

}
