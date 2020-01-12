/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.colar.netbeans.fan.hints;

import org.netbeans.modules.csl.api.HintSeverity;
import org.netbeans.modules.csl.api.Rule;
import org.netbeans.modules.csl.api.RuleContext;

/**
 *
 * @author thibautc
 */
public class FanHintRule implements Rule
{

    public boolean appliesTo(RuleContext rc)
    {
        return true;
    }

    public String getDisplayName()
    {
        return "Fantom Hint";
    }

    public boolean showInTasklist()
    {
        return false;
    }

    public HintSeverity getDefaultSeverity()
    {
        return HintSeverity.WARNING;
    }

}
