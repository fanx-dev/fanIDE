/**
 * Annotation for custom settings tab
 */

@OptionsPanelController.ContainerRegistration
(
    id=FanMainSettingsController.ID,
    categoryName=FanMainSettingsController.ID,
    iconBase="net/colar/netbeans/fan/resources/fantom_options.png",
    position=799
)
package net.colar.netbeans.fan;

import org.netbeans.spi.options.OptionsPanelController;
import net.colar.netbeans.fan.wizard.FanMainSettingsController;
