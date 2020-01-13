/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.hints;

import java.awt.EventQueue;
import java.awt.Frame;
import java.util.HashMap;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.netbeans.modules.csl.api.HintFix;
import org.openide.windows.WindowManager;

/**
 *
 * @author thibautc
 */
class FanCreateMethodFix implements HintFix
{

    private final String method;
    private final FanResolvedType targetType;
    private final HashMap<String, FanResolvedType> args;
    private final FanResolvedType assignedTo;

    public FanCreateMethodFix(AstNode node, String method, FanResolvedType targetType, FanResolvedType assignedToType, HashMap<String, FanResolvedType> args)
    {
        this.method=method;
        this.targetType = targetType;
        this.assignedTo = assignedToType;
        this.args = args;
    }

    public String getDescription()
    {
        return "Create Method: " + method +(targetType==null?"":" in "+targetType.getQualifiedType());
    }

    public void implement() throws Exception
    {
        // Need to use eventqueueu to avoid AWT threading warning/bugs
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Frame win = WindowManager.getDefault().getMainWindow();
                FanAddMethodDialog d = new FanAddMethodDialog(win, method, targetType, assignedTo, args);
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
