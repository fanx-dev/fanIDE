/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JComponent;
import net.colar.netbeans.fan.platform.FanPlatform;
import net.colar.netbeans.fan.platform.FanPlatformSettings;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;

/**
 * Controller for Fan options panel.
 * @author tcolar
 */
@OptionsPanelController.SubRegistration(location="Fantom", id=FanMainSettingsController.ID, displayName="General")
public class FanMainSettingsController extends OptionsPanelController
{
  public static final String ID = "Fantom";
	private FanMainSettingsPanel panel;
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	private boolean changed;

	public void update()
	{
		panel.setFanHome(FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FAN_HOME));
		panel.setDebugPort(FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_DEBUG_PORT,"8008"));
		changed();
	}

	public void applyChanges()
	{
		String home = panel.getFanHome();
		String debugPort = panel.getDebugPort();
		String runOptions = panel.getRunOptions();
		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_FAN_HOME, home);
		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_DEBUG_PORT, debugPort);
		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_RUN_OPTIONS, runOptions);
		// reread the plaform settings
		FanPlatform.update();
		changed = false;
	}

	public void cancel()
	{
		// need not do anything special, if no changes have been persisted yet
	}

	public boolean isValid()
	{
		return getPanel().valid();
	}

	public boolean isChanged()
	{
		return changed;
	}

	public HelpCtx getHelpCtx()
	{
		return null;
	}

	public JComponent getComponent(Lookup masterLookup)
	{
		return getPanel();
	}

	public void addPropertyChangeListener(PropertyChangeListener l)
	{
		pcs.addPropertyChangeListener(l);
	}

	public void removePropertyChangeListener(PropertyChangeListener l)
	{
		pcs.removePropertyChangeListener(l);
	}

	private FanMainSettingsPanel getPanel()
	{
		if (panel == null)
		{
			panel = new FanMainSettingsPanel(this);
		}
		return panel;
	}

	void changed()
	{
		if (!changed)
		{
			changed = true;
			pcs.firePropertyChange(OptionsPanelController.PROP_CHANGED, false, true);
		}
		pcs.firePropertyChange(OptionsPanelController.PROP_VALID, null, null);
	}
}
