/*
 * Thibaut Colar Aug 20, 2009
 */
package net.colar.netbeans.fan.debugger;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Collections;
import java.util.Set;
import net.colar.netbeans.fan.plugin.FanLanguage;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.debugger.ActionsManager;
import org.netbeans.api.debugger.Breakpoint;
import org.netbeans.api.debugger.DebuggerManager;
import org.netbeans.api.debugger.jpda.LineBreakpoint;
import org.netbeans.spi.debugger.ActionsProviderSupport;
import org.netbeans.spi.debugger.ui.EditorContextDispatcher;
import org.openide.filesystems.FileObject;
import org.openide.text.Line;
import org.openide.util.WeakListeners;

/**
 * Breakpoint action provider Handles setting/unsettings breakpoints request
 * from JPDA
 *
 * Registered through annotation - Mot anymore - that only works 1/2 the time !
 *
 * @author thibautc
 */
//@ActionsProvider.Registration()
public class FanBkptActionProvider extends ActionsProviderSupport implements PropertyChangeListener {

    private static final Set actions = Collections.singleton(ActionsManager.ACTION_TOGGLE_BREAKPOINT);
    private EditorContextDispatcher context = EditorContextDispatcher.getDefault();

    public FanBkptActionProvider() {
        super();
        FanUtilities.logger.info("### Registering: " + FanBkptActionProvider.class.getName());
        // listen on fan files
        context.addPropertyChangeListener(FanLanguage.FAN_MIME_TYPE, WeakListeners.propertyChange(this, context));
        setEnabled(ActionsManager.ACTION_TOGGLE_BREAKPOINT, false);
    }

    @Override
    public void propertyChange(PropertyChangeEvent arg0) {
        boolean enabled = EditorContextDispatcher.getDefault().getCurrentLine() != null;
        setEnabled(ActionsManager.ACTION_TOGGLE_BREAKPOINT, enabled);
        //FanUtilities.logger.info("Fan - BkptProvider enabling");
    }

    @Override
    public void doAction(Object action) {
        FanUtilities.logger.info("Fan - BkptProvider doaction");
        FileObject fo = EditorContextDispatcher.getDefault().getCurrentFile();
        if (fo == null /*|| !fo.getMIMEType().equals(FanLanguage.FAN_MIME_TYPE)*/) {
            return;
        }
        Line line = EditorContextDispatcher.getDefault().getCurrentLine();
        String url = EditorContextDispatcher.getDefault().getCurrentURLAsString();
        //FanUtilities.logger.info("Dbg line:" + line);
        if (line == null) {
            return;
        }
        // Seems like this is off by 1 compared to breakpoints (one starts at 0, other at 1 ?)
        int lineNb = line.getLineNumber() + 1;
        // Loop through existing breakpoints and see if there is already one on that line
        Breakpoint[] breakpoints = DebuggerManager.getDebuggerManager().getBreakpoints();
        for (int i = 0; i != breakpoints.length; i++) {
            if (breakpoints[i] instanceof LineBreakpoint) {
                LineBreakpoint bp = ((LineBreakpoint) breakpoints[i]);
                // Other plugins check linenumber but not also url - seems wrong to me
                if (bp.getURL().equals(url) && bp.getLineNumber() == lineNb) {
                    // Found existing BP, remove and quit
                    FanUtilities.logger.info("Removing bkpt:" + lineNb);
                    DebuggerManager.getDebuggerManager().removeBreakpoint(bp);
                    return;
                }
            }
        }
        // If we get here, it's a new bkpt, so create it.
        FanUtilities.logger.info("creating BP:" + lineNb);
        LineBreakpoint bp = FanDebugHelper.createFanBp(url, lineNb);
        DebuggerManager.getDebuggerManager().addBreakpoint(bp);
        
        
//        Breakpoint[] bkpts = DebuggerManager.getDebuggerManager().getBreakpoints();
//        for (int i = 0; i != bkpts.length; i++) {
//            if (bkpts[i] instanceof LineBreakpoint) {
//                LineBreakpoint bkpt = (LineBreakpoint) bkpts[i];
//                System.out.println("BKPT: " + i + " " + bkpt.getSourcePath() + bkpt.getLineNumber());
//            }
//        }
    }

    @Override
    public Set getActions() {
        return actions;
    }
}
