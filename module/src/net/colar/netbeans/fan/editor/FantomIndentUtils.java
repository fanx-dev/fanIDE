/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.editor;

import javax.swing.text.Document;
import net.colar.netbeans.fan.platform.FanPlatformSettings;

/**
 *
 * @author thibautc
 */
public class FantomIndentUtils
{

    /**
     * Use spaces
     * @param document
     * @param indent
     * @return 
     */
    public static String createIndentString(Document document, int indent)
    {
        int indentSize = getIndentSize(document);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i != indent; i++)
        {
            for (int j = 0; j != indentSize; j++)
            {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public static int getIndentSize(Document document)
    {
        return new Integer(FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_FMT_IDENT_SIZE, "2")).intValue();
    }
    
}
