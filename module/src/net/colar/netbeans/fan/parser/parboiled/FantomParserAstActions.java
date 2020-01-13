/*
 * Thibaut Colar Feb 5, 2010
 */
package net.colar.netbeans.fan.parser.parboiled;

import java.util.List;
import net.colar.netbeans.fan.parser.FanParserTask;
import org.parboiled.BaseActions;
import org.parboiled.ContextAware;
import org.parboiled.Node;
import org.parboiled.matchers.Matcher;
import org.parboiled.support.ValueStack;

/**
 * Utility actions for creating Parser AST nodes.
 *
 * @author thibautc
 */
public class FantomParserAstActions extends BaseActions<AstNode> implements ContextAware<AstNode> {

    int id = 1;

    /**
     * Store temp. orphaned(no parent) node while the AST is being built
     * (bottom-up)
     */
    //public List<AstNode> orphanNodes = new ArrayList<AstNode>();
    /**
     * Utility to create a new AST Node from the last parsed Node The new
     * ASTNode gets set as the Value() of the parseNode (set()) The new Node
     * gets properly linked with it's parent/children Nodes automatically
     *
     * @param name
     * @return
     */
    public boolean litNode(AstKind kind) {
        AstNode node = new AstNode(id++, kind, getContext());
        if (getContext().getSubNodes().size() > 0) {
            Node<AstNode> nodes = getContext().getSubNodes().get(0); //firstoff
            if (nodes.getChildren().size() > 0) {
                node.setLabel(nodes.getChildren().get(0).getLabel());
            }
        }
        push(node);
        return true;
    }

    public boolean newNode(AstKind kind) {
        AstNode node = new AstNode(id++, kind, getContext());
        push(node);
        return true;
    }

    /**
     * Create a node that defines a scope (holds scope vars)
     *
     * @param kind
     * @return
     */
    public boolean newScopeNode(AstKind kind) {
        AstNode node = new AstNode(id++, kind, getContext());
        node.setIsScopeNode();
        push(node);
        return true;
    }

    /**
     * Create the root node
     *
     * @param kind
     * @return
     */
    public boolean newRootNode(AstKind kind, FanParserTask task) {
        AstNode node = new RootNode(kind, getContext(), task);
        push(node);
        return true;
    }

    public static void linkNodes(ValueStack<AstNode> stack) {
        AstNode prev = null;
        while (!stack.isEmpty()) {
            AstNode node = stack.pop();
            if (prev != null) {
                AstNode parent = prev;
                while (!(node.getStartIndex() <= parent.getEndIndex()
                        && node.getStartIndex() >= parent.getStartIndex())) {
                    parent = parent.getParent();
                }
                //System.out.println("Tying "+node+" to parent: "+parent);
                int index = -1;
                List<AstNode> children = parent.getChildren();
                if( ! children.isEmpty())
                {
                    for(int i=0; i!=children.size(); i++)
                    {
                        if(node.getStartIndex() > children.get(i).getStartIndex())
                        {
                            index = i;
                            break;
                        }
                    }
                }
                parent.addChildAt(node, index+1);
                node.setParent(parent);
            }
            prev = node;
        }

    }

    public String getPath() {
        return getContext().getPath().toString() + "/" + "??";
    }
}
