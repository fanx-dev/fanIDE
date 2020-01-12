/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.hints;

import java.awt.EventQueue;
import java.awt.Frame;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.netbeans.modules.csl.api.HintFix;
import org.openide.windows.WindowManager;

/**
 *
 * @author thibautc
 */
class FanCreateFieldFix implements HintFix
{

    private final String field;
    private final FanResolvedType targetType; // null  = local
    private final FanResolvedType assignedFromType;

    public FanCreateFieldFix(AstNode node, String field, FanResolvedType targetType, FanResolvedType assignedFromType)
    {
        this.field=field;
        this.targetType = targetType;
        this.assignedFromType = assignedFromType;
    }

    public String getDescription()
    {
        return "Create Field: " + field +(targetType==null?"":" in "+targetType.getQualifiedType());
    }

    public void implement() throws Exception
    {
        // Need to use eventqueueu to avoid AWT threading warning/bugs
        EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                Frame win = WindowManager.getDefault().getMainWindow();
                FanAddFieldDialog d = new FanAddFieldDialog(win, field, targetType, assignedFromType);
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
