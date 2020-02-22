/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan;

import java.io.IOException;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.nodes.Children;
import org.openide.util.Lookup;
import org.openide.text.DataEditorSupport;
import org.openide.util.NbBundle.Messages;

/**
 * Standard data object
 * @author thibautc
 */
@Messages({
    "LBL_Fan_LOADER=Files of Fan"
})
@MIMEResolver.ExtensionRegistration(
        displayName = "#LBL_Fan_LOADER",
        mimeType = "text/x-fan",
        extension = {"fan", "fwt"}
)
public class FanDataObject extends MultiDataObject
{

    public FanDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException
    {
	super(pf, loader);
	CookieSet cookies = getCookieSet();
	cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
    }

    @Override
    protected Node createNodeDelegate()
    {
	return new DataNode(this, Children.LEAF, getLookup());
    }

    @Override
    public Lookup getLookup()
    {
	return getCookieSet().getLookup();
    }
    
}
