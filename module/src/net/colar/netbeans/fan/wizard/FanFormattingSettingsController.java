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
@OptionsPanelController.SubRegistration(location="Fantom", id=FanFormattingSettingsController.ID, displayName="Formatting")
public class FanFormattingSettingsController extends OptionsPanelController
{
  public static final String ID = "Formatting";
	private FanFormattingSettingsPanel panel;
	private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	private boolean changed;

	public void update()
	{
		panel.setIdentSize(new Integer(FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FMT_IDENT_SIZE, "2")));
		//panel.setExpandTabs(FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FMT_TABS_TO_SPACES, true).equalsIgnoreCase("true"));
		changed();
	}

	public void applyChanges()
	{
		int indentSize = panel.getIndentSize();
		//boolean expandTabs = panel.getExpandTabs();
		FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_FMT_IDENT_SIZE, ""+indentSize);
		//FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_FMT_TABS_TO_SPACES, (expandTabs?"true":"false");
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

	private FanFormattingSettingsPanel getPanel()
	{
		if (panel == null)
		{
			panel = new FanFormattingSettingsPanel(this);
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
