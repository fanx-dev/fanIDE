/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.editor;


import javax.swing.text.Document;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.api.editor.mimelookup.MimeRegistrations;
import org.netbeans.spi.editor.highlighting.HighlightsLayer;
import org.netbeans.spi.editor.highlighting.HighlightsLayerFactory;
import org.netbeans.spi.editor.highlighting.ZOrder;

@MimeRegistrations({
    @MimeRegistration(mimeType = "text/x-fan", service = HighlightsLayerFactory.class),
    @MimeRegistration(mimeType = "text/x-fanx", service = HighlightsLayerFactory.class)
})
public class MarkOccurrencesHighlightsLayerFactory implements HighlightsLayerFactory {

    public static MarkOccurrencesHighlighter getMarkOccurrencesHighlighter(Document doc) {
        MarkOccurrencesHighlighter highlighter =
               (MarkOccurrencesHighlighter) doc.getProperty(MarkOccurrencesHighlighter.class);
        if (highlighter == null) {
            doc.putProperty(MarkOccurrencesHighlighter.class,
               highlighter = new MarkOccurrencesHighlighter(doc));
        }
        return highlighter;
    }

    @Override
    public HighlightsLayer[] createLayers(Context context) {
        return new HighlightsLayer[]{
                    HighlightsLayer.create(
                    MarkOccurrencesHighlighter.class.getName(),
                    ZOrder.CARET_RACK.forPosition(2000),
                    true,
                    getMarkOccurrencesHighlighter(context.getDocument()).getHighlightsBag())
                };
    }

}