/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JComponent;
import net.colar.netbeans.fan.fantom.FanPlatformSettings;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;

/**
 * Controller for Fan options panel - Indexer
 *
 * @author tcolar
 */
@OptionsPanelController.SubRegistration(location = "Fantom", id = FanIndexerSettingsController.ID, displayName = "Indexer")
public class FanIndexerSettingsController extends OptionsPanelController {

    public static final String ID = "Indexer";
    private FanIndexerSettingsPanel panel;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private boolean changed;

    public void update() {
        changed();
    }

    public void applyChanges() {
        FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_INDEXER_EXCLUDES,
                panel.getExcludes());
        FanPlatformSettings.getInstance().put(FanPlatformSettings.PREF_JAVA_INDEXING,
                ""+panel.getJavaIndexing());
        changed = false;
    }

    public void cancel() {
        // need not do anything special, if no changes have been persisted yet
    }

    public boolean isValid() {
        return true;
    }

    public boolean isChanged() {
        return changed;
    }

    public HelpCtx getHelpCtx() {
        return null;
    }

    public JComponent getComponent(Lookup masterLookup) {
        return getPanel();
    }

    public void addPropertyChangeListener(PropertyChangeListener l) {
        pcs.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        pcs.removePropertyChangeListener(l);
    }

    private FanIndexerSettingsPanel getPanel() {
        if (panel == null) {
            panel = new FanIndexerSettingsPanel(this);
        }
        return panel;
    }

    void changed() {
        if (!changed) {
            changed = true;
            pcs.firePropertyChange(OptionsPanelController.PROP_CHANGED, false, true);
        }
        pcs.firePropertyChange(OptionsPanelController.PROP_VALID, null, null);
    }
}
