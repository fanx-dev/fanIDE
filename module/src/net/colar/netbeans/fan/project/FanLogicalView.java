/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import org.netbeans.api.project.FileOwnerQuery;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ui.LogicalViewProvider;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectNotFoundException;
import org.openide.nodes.AbstractNode;
import org.openide.nodes.FilterNode.Children;
import org.openide.nodes.Node;
import org.openide.util.Exceptions;

/**
 * Logical view for Fan project
 * Logical View provides the nodeTree for displaying project files tree in "project" tab of netbeans
 * So we can show/hide and group files ina  logical way.
 * @author thibautc
 */
public class FanLogicalView implements LogicalViewProvider
{

    public static final String REGISTERED_NODE_LOCATION =
            "Projects/net-colar-netbeans-fan-project-FanProject/Nodes";
    private final FanProject project;

    public FanLogicalView(FanProject project)
    {
        this.project = project;
    }

    @Override
    public Node createLogicalView()
    {
        try
        {
            FileObject dir = project.getProjectDirectory();

            //Get the DataObject that represents it:
            DataObject dobj = DataObject.find(dir);

            //Get its default node: we'll wrap our node around it to change the
            //display name, icon, etc:
            Node originalObj = dobj.getNodeDelegate();

            //This FilterNode will be our project node:
            return new FanProjectNode(project, originalObj, dir);

        } catch (DataObjectNotFoundException donfe)
        {
            Exceptions.printStackTrace(donfe);
            //Fallback: the directory couldn't be created -
            //read-only filesystem or something evil happened:
            return new AbstractNode(Children.LEAF);
        }
    }

    /**
     * Find the Node for a given file
     * @param root
     * @param target
     * @return 
     */
    @Override
    public Node findPath(Node root, Object target)
    {
        Project prj = root.getLookup().lookup(Project.class);
        if (prj == null)
        {
            return null;
        }

        if (target instanceof FileObject)
        {
            FileObject fo = (FileObject) target;
            Project owner = FileOwnerQuery.getOwner(fo);
            if (!prj.equals(owner))
            {
                return null;
            }

            String relativePath = FileUtil.getRelativePath(prj.getProjectDirectory(), fo);
            return findMatchingNode(root, relativePath);
        }

        return null;
    }

    /**
     * Find the subNode within the node that matches the path (relative path)
     * Note: recursive
     * @param node
     * @param path
     * @return 
     */
    public static Node findMatchingNode(Node node, String path)
    {
        if (path == null)
        {
            return null;
        }

        String[] parts = path.split("/");
        if (parts.length == 0)
        {
            return null;
        }

        for (Node nd : node.getChildren().getNodes(true))
        {
            String name = nd.getDisplayName();
            if (name.equals(parts[0]))
            {
                if (parts.length == 1)
                {
                    // that was the last part of the path to match -> we found our node.
                    return nd;
                } else
                {
                    if (path.indexOf("/") == path.length())
                    {
                        return nd; // directory, ignore extra slash
                    } else
                    {
                        // matches so far, keep digging down the path (recurse)
                        return findMatchingNode(nd, path.substring(path.indexOf("/") + 1));
                    }
                }
            }
        }
        // not found
        return null;
    }
}
