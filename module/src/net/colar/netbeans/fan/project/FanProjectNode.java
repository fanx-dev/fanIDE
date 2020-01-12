/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.project;

import org.netbeans.api.project.Project;
import org.openide.filesystems.FileObject;
import org.openide.nodes.Node;

/**
 * Project (master) node.
 * @author tcolar
 */
public class FanProjectNode extends FanNode
{

	public FanProjectNode(Project project, Node originalNode, FileObject file)
	{
		super(project, originalNode, new FanNodeChildren(project, originalNode), file);
		setIcon("net/colar/netbeans/fan/fan.png");
		isRoot = true;
	}

}

