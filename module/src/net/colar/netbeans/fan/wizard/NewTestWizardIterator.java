/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.wizard;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Set;
import javax.swing.JComponent;
import javax.swing.event.ChangeListener;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.templates.TemplateUtils;
import net.colar.netbeans.fan.templates.TemplateView;
import org.netbeans.spi.project.ui.templates.support.Templates;
import org.openide.WizardDescriptor;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 * Iterator for new Fan test file wizard
 * @author thibautc
 */
public final class NewTestWizardIterator implements WizardDescriptor.InstantiatingIterator
{

	private int index;
	private WizardDescriptor wizard;
	private WizardDescriptor.Panel[] panels;

	/**
	 * Initialize panels representing individual wizard's steps and sets
	 * various properties for them influencing wizard appearance.
	 */
	private WizardDescriptor.Panel[] getPanels()
	{
		if (panels == null)
		{
			FileObject targetFolder = Templates.getTargetFolder(wizard);
                        if (targetFolder == null) {
                            targetFolder = Templates.getProject(wizard).getProjectDirectory();
                        }
                        String folder = targetFolder.getPath();
			panels = new WizardDescriptor.Panel[]
				{
					new NewTestWizardPanel1(folder)
				};
			String[] steps = createSteps();
			for (int i = 0; i < panels.length; i++)
			{
				Component c = panels[i].getComponent();
				if (steps[i] == null)
				{
					// Default step name to component name of panel. Mainly
					// useful for getting the name of the target chooser to
					// appear in the list of steps.
					steps[i] = c.getName();
				}
				if (c instanceof JComponent)
				{ // assume Swing components
					JComponent jc = (JComponent) c;
					// Sets step number of a component
					jc.putClientProperty("WizardPanel_contentSelectedIndex", new Integer(i));
					// Sets steps names for a panel
					jc.putClientProperty("WizardPanel_contentData", steps);
					// Turn on subtitle creation on each step
					jc.putClientProperty("WizardPanel_autoWizardStyle", Boolean.TRUE);
					// Show steps on the left side with the image on the background
					jc.putClientProperty("WizardPanel_contentDisplayed", Boolean.TRUE);
					// Turn on numbering of all steps
					jc.putClientProperty("WizardPanel_contentNumbered", Boolean.TRUE);
				}
			}
		}
		return panels;
	}

	public Set instantiate() throws IOException
	{
		NewTestWizardPanel1 panel = getPanel();
		
		String file = panel.getFile();
		String name = panel.getName();

		File newFile = FileUtil.normalizeFile(new File(file));

		// create file folder
		File folder = newFile.getParentFile();
		folder.mkdirs();

		//create file
		FileObject template = Templates.getTemplate(wizard);

		TemplateView view = new TemplateView(template, name);

		FileObject license = FanUtilities.getRelativeFileObject(template, "../Licenses/FanDefaultLicense.txt");
		view.addVariable("license", license.asText());

		String templateText = template.asText();

		TemplateUtils.createFromTemplate(view, templateText, newFile);

		FanUtilities.openFileInEditor(newFile);
                // Note: refresh the parent folder, otherwise it lags
		FileUtil.refreshFor(newFile.getParentFile());

		return Collections.singleton(newFile);
	}

	public NewTestWizardPanel1 getPanel()
	{
		return (NewTestWizardPanel1) panels[0];
	}

	public void initialize(WizardDescriptor wizard)
	{
		this.wizard = wizard;
	}

	public void uninitialize(WizardDescriptor wizard)
	{
		panels = null;
	}

	public WizardDescriptor.Panel current()
	{
		return getPanels()[index];
	}

	public String name()
	{
		return index + 1 + ". from " + getPanels().length;
	}

	public boolean hasNext()
	{
		return index < getPanels().length - 1;
	}

	public boolean hasPrevious()
	{
		return index > 0;
	}

	public void nextPanel()
	{
		if (!hasNext())
		{
			throw new NoSuchElementException();
		}
		index++;
	}

	public void previousPanel()
	{
		if (!hasPrevious())
		{
			throw new NoSuchElementException();
		}
		index--;
	}

	// If nothing unusual changes in the middle of the wizard, simply:
	public void addChangeListener(ChangeListener l)
	{
	}

	public void removeChangeListener(ChangeListener l)
	{
	}

	// If something changes dynamically (besides moving between panels), e.g.
	// the number of panels changes in response to user input, then uncomment
	// the following and call when needed: fireChangeEvent();
    /*
	private Set<ChangeListener> listeners = new HashSet<ChangeListener>(1); // or can use ChangeSupport in NB 6.0
	public final void addChangeListener(ChangeListener l) {
	synchronized (listeners) {
	listeners.add(l);
	}
	}
	public final void removeChangeListener(ChangeListener l) {
	synchronized (listeners) {
	listeners.remove(l);
	}
	}
	protected final void fireChangeEvent() {
	Iterator<ChangeListener> it;
	synchronized (listeners) {
	it = new HashSet<ChangeListener>(listeners).iterator();
	}
	ChangeEvent ev = new ChangeEvent(this);
	while (it.hasNext()) {
	it.next().stateChanged(ev);
	}
	}
	 */
	// You could safely ignore this method. Is is here to keep steps which were
	// there before this wizard was instantiated. It should be better handled
	// by NetBeans Wizard API itself rather than needed to be implemented by a
	// client code.
	private String[] createSteps()
	{
		String[] beforeSteps = null;
		Object prop = wizard.getProperty("WizardPanel_contentData");
		if (prop != null && prop instanceof String[])
		{
			beforeSteps = (String[]) prop;
		}

		if (beforeSteps == null)
		{
			beforeSteps = new String[0];
		}

		String[] res = new String[(beforeSteps.length - 1) + panels.length];
		for (int i = 0; i < res.length; i++)
		{
			if (i < (beforeSteps.length - 1))
			{
				res[i] = beforeSteps[i];
			} else
			{
				res[i] = panels[i - beforeSteps.length + 1].getComponent().getName();
			}
		}
		return res;
	}
}
