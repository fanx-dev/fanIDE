/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.editor;

import org.netbeans.spi.editor.highlighting.HighlightsLayer;
import org.netbeans.spi.editor.highlighting.HighlightsLayerFactory;
import org.netbeans.spi.editor.highlighting.HighlightsLayerFactory.Context;
import org.netbeans.spi.editor.highlighting.ZOrder;

/**
 * Highlights factory
 *
 * @author tcolar
 */
public class FanHighlightsFactory implements HighlightsLayerFactory {

    @Override
    public HighlightsLayer[] createLayers(Context context) {
        return new HighlightsLayer[]{
                    HighlightsLayer.create("fantom-embedding-highlight-layer",
                    ZOrder.BOTTOM_RACK.forPosition(100), //we need to have lower priority than the default syntax from options - 0
                    true,
                    new FanHighlightsContainer(context.getDocument()))
                };
    }
}
