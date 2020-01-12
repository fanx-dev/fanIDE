/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.hints;

import java.awt.EventQueue;
import java.awt.Frame;
import net.colar.netbeans.fan.FanParserTask;
import org.netbeans.modules.csl.api.HintFix;
import org.netbeans.modules.csl.api.RuleContext;
import org.openide.windows.WindowManager;
import org.openide.filesystems.FileUtil;

/**
 * Propose/handles creating a new type
 *
 * @author thibautc
 */
public class FanCreateTypeFix implements HintFix
{

    private final RuleContext ctx;
    private final String name;

    public FanCreateTypeFix(RuleContext ctx, String typeName)
    {
        this.ctx = ctx;
        this.name = typeName;
    }

    public String getDescription()
    {
        return "Create new type: " + name;
    }

    public void implement() throws Exception
    {
        // Need to use eventqueueu to avoid AWT threading warning/bugs
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                FanParserTask result = (FanParserTask) ctx.parserResult;
                String folder = FileUtil.toFile(result.getSourceFile().getParent()).getAbsolutePath();

                Frame win = WindowManager.getDefault().getMainWindow();
                FanCreateTypeDialog d = new FanCreateTypeDialog(win, folder, name);
                d.setLocationRelativeTo(win);
                d.pack();
                d.setVisible(true);
            }
        });
    }

    public boolean isSafe()
    {
        return true;
    }

    public boolean isInteractive()
    {
        return true;
    }
}
