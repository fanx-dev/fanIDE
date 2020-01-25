/*
 * Thibaut Colar Dec 9, 2009
 */
package net.colar.netbeans.fan.scope;

import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.types.FanResolvedType;

/**
 * scope variable
 *
 * @author thibautc
 */
public abstract class FanAstScopeVar extends FanAstScopeVarBase {

    public FanAstScopeVar(AstNode node, VarKind kind, String name, FanResolvedType type) {
        super(node, name);
        super.type = type;
        super.kind = kind;
        if (type == null) {
            FanUtilities.logger.severe(getClass().getName() + " Null type for: " + name);
            super.type = FanResolvedType.makeUnresolved(node);
        }

    }
}
