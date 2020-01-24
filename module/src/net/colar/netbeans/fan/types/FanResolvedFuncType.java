/*
 * Thibaut Colar Jan 8, 2010
 */
package net.colar.netbeans.fan.types;

import java.util.ArrayList;
import java.util.List;
import net.colar.netbeans.fan.namespace.Namespace;
import net.colar.netbeans.fan.parser.parboiled.AstNode;

/**
 *
 * @author thibautc
 */
public class FanResolvedFuncType extends FanResolvedType
{

    private final FanResolvedType retType;
    private final List<FanResolvedType> types;
    // helper to carry type names when daling with structures
    private List<String> typeNames;

    public FanResolvedFuncType(AstNode scopeNode, List<FanResolvedType> types, FanResolvedType retType)
    {
        super(scopeNode, "sys::Func", Namespace.get().findByQualifiedName("sys::Func"));
        if (retType == null)
        {
            retType = FanResolvedType.makeFromDbType(scopeNode, "sys::Void");
        }
        this.retType = retType;
        this.types = types;
    }

    public FanResolvedType getRetType()
    {
        return retType;
    }

    public List<FanResolvedType> getTypes()
    {
        return types;
    }

    @Override
    public String toTypeSig(boolean fullyQualified)
    {
        String sig = "|";
        boolean first = true;
        for (FanResolvedType type : types)
        {
            if (!first)
            {
                sig += ",";
            }
            first = false;
            sig += type.toTypeSig(fullyQualified);
        }
        sig += "->";
        sig += retType.toTypeSig(fullyQualified) + "|";
        sig += isNullable() ? "?" : "";
        return sig;
    }

    public List<String> getTypeNames()
    {
        return typeNames;
    }

    public void setTypeNames(List<String> typeNames)
    {
        this.typeNames = typeNames;
    }

    @Override
    public FanResolvedType parameterize(FanResolvedType baseType, AstNode errNode)
    {
        List<FanResolvedType> pTypes = new ArrayList<FanResolvedType>(types.size());
        for (FanResolvedType t : types)
        {
            pTypes.add(t.parameterize(baseType, errNode));
        }
        FanResolvedType t = new FanResolvedFuncType(getScopeNode(),
                pTypes,
                retType.parameterize(baseType, errNode));
        if (this.isNullable() != t.isNullable())
        {
            t = (FanResolvedFuncType) t.asNullableContext(this.isNullable());
        }
        return t;
    }

    /**
     * Return a completion form such as
     * "", "|Str str|" "|Str str, Int i -> Bool|", "|->Bool?|"
     * @return
     */
    public String getComplProposal(FanResolvedType baseType, AstNode node)
    {
        if(!isResolved())
            return "|Unknown|";
        String sig = "|";
        boolean first = true;
        for (FanResolvedType type : types)
        {
            type = type.parameterize(baseType, node);
            if (!first)
            {
                sig += ", ";
            }
            first = false;
            String typeSig = type.toTypeSig(false);
            String nm = typeSig.toLowerCase();
            sig += /*typeSig + " " +*/ nm; // use inference
        }
        if ( ! retType.getDbType().getQualifiedName().equals("sys::Void"))
        {
            sig += (sig.length()>1?" ":"") + "-> ";
            sig += retType.parameterize(baseType, node).toTypeSig(false);
        }
        sig += "|";
        return sig;
    }
}
