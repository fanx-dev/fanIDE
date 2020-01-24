/*
 * Thibaut Colar Mar 24, 2010
 */
package net.colar.netbeans.fan.test;

import net.colar.netbeans.fan.test.mock.DummyAstRootNode;
import java.util.List;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.namespace.FanSlot;
import net.colar.netbeans.fan.parser.parboiled.AstKind;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parser.parboiled.FantomParser;
import net.colar.netbeans.fan.parser.parboiled.FantomParserAstActions;
import net.colar.netbeans.fan.parser.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanLocalScopeVar;
import net.colar.netbeans.fan.types.FanResolvedListType;
import net.colar.netbeans.fan.types.FanResolvedNullType;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.parboiled.Parboiled;
import org.parboiled.common.StringUtils;
import org.parboiled.parserunners.RecoveringParseRunner;
import org.parboiled.support.ParsingResult;

/**
 * Test type resolution
 *
 * @author thibautc
 */
public class FantomTypesTest extends FantomCSLTestBase {

    // List some fq imports we will use in the tests, so we can add them to the node's scope (sys types implied)
    static String[] testUsings = {
        "web::Weblet", "fwt::Button", "fwt::Widget", "concurrent::Actor", "concurrent::ActorPool",
        "web::WebUtil", "java.lang.Runtime"
    };
    // will put slots from those types in scope as well (as inherited)
    static String[] testSlots = {
        "sys::Obj", "testCompiler::CompilerTest"
    };

    @Override
    public void cslTest() throws Throwable {
        // Dummy task & rootNode to pass along
        FanParserTask task = new FanParserTask(null);
        DummyAstRootNode node = new DummyAstRootNode(task);
        addUsingsToNode(node, testUsings);
        addTypeSlotsToNode(node, task, testSlots);


        // Testing type signature stuff
        FanResolvedType t = FanResolvedType.makeFromTypeSig(node, "sys::Str");
        assertTrue("Type sig 1:" + t.toString(), t.getQualifiedType().equals("sys::Str") && !t.isNullable());
        assertTrue("Type sig 1a:"+t.toString(), t.asNullableContext(true).isNullable() && t.asStaticContext(true).isStaticContext());
        t = FanResolvedType.makeFromTypeSig(node, "sys::Str?");
        assertTrue("Type sig 2:"+t.toString(), t.getQualifiedType().equals("sys::Str") && t.isNullable());
        t = FanResolvedType.makeFromTypeSig(node, "sys::Str[]");
        assertTrue("Type sig 3:"+t.toString(), (t instanceof FanResolvedListType) && t.toTypeSig(true).equals("sys::Str[]"));
        t = FanResolvedType.makeFromTypeSig(node, "Int");
        check(t, "sys::Int", false, true);
        t = FanResolvedType.makeFromTypeSig(node, "Int?");
        check(t, "sys::Int?", true, true);

        // checking expressions
        checkExpr("5", "sys::Int", false, false);
        checkExpr("0x5A", "sys::Int", false, false);
        AstNode resultNode = checkExpr("null", "null::null?", true, false);
        assertTrue("checking null type", resultNode.getType() instanceof FanResolvedNullType);
        checkExpr("\"a\"", "sys::Str", false, false);

        checkExpr("0x3bca.not.and(0xffff)", "sys::Int", false, false);
        checkExpr("0x3bc7.not.and(0xffff)", "sys::Int", false, false);
        checkExpr("0..<20", "sys::Range", false, false);
        checkExpr("(0..<20).toList", "sys::Int[]", false, false);
        checkExpr("\"abc\".split[0]", "sys::Str", false, false);
        checkExpr("\"abc\".split[0..2]", "sys::Str[]", false, false);
        checkExpr("Obj", "sys::Obj", false, true);
        checkExpr("Obj()", "sys::Obj", false, false);
        checkExpr("Str.defVal", "sys::Str", false, false);
        checkExpr("\"abc\".isEmpty", "sys::Bool", false, false);
        checkExpr("[3,4]", "sys::Int[]", false, false);
        checkExpr("[3, 2f ,4]", "sys::Num[]", false, false);

        // lists
        checkExpr("[3,null,4]", "sys::Int?[]", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "Obj?[]");
        check(t, "sys::Obj?[]", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "Obj[]?");
        check(t, "sys::Obj[]?", true, false);
        t = FanResolvedType.makeFromTypeSig(node, "Str[][]?");
        check(t, "sys::Str[][]?", true, false);
        assertTrue("List of List type:"+t.toString(),
                (t instanceof FanResolvedListType)
                && ((FanResolvedListType) t).getItemType().toTypeSig(true).equals("sys::Str[]"));

        // maps
        t = FanResolvedType.makeFromTypeSig(node, "[sys::Str : sys::Str]");
        check(t, "[sys::Str:sys::Str]", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "sys::Str : sys::Str[]");
        check(t, "[sys::Str:sys::Str[]]", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "[Str : Str]");
        check(t, "[sys::Str:sys::Str]", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "Str:Str");
        check(t, "[sys::Str:sys::Str]", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "Str:[Str:Int]");
        check(t, "[sys::Str:[sys::Str:sys::Int]]", false, false);
        checkExpr("[\"a\":[\"a\"]].keys.sort", null, false, false);

        //functions:
        t = FanResolvedType.makeFromTypeSig(node, "|->|");
        check(t, "|sys::Void->sys::Void|", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "|->Int|");
        check(t, "|sys::Void->sys::Int|", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "|Int|");
        check(t, "|sys::Int->sys::Void|", false, false);
        t = FanResolvedType.makeFromTypeSig(node, "|Int,Str,Str:Int->Str:Bool|");
        check(t, "|sys::Int,sys::Str,[sys::Str:sys::Int]->[sys::Str:sys::Bool]|", false, false);
        checkExpr("[Str:Str].keys.random", null, true, false);

        // closures / itblocks
        resultNode = checkExpr("|str| { echo(str) }", "|sys::Obj?->sys::Void|", false, false);
        AstNode block = FanLexAstUtils.getFirstChildRecursive(resultNode, new NodeKindPredicate(AstKind.AST_BLOCK));
        resultNode = checkExpr("|Int i| { echo(i) }", "|sys::Int->sys::Void|", false, false);
        block = FanLexAstUtils.getFirstChildRecursive(resultNode, new NodeKindPredicate(AstKind.AST_BLOCK));
        checkExpr("Button {text=\"aa\"; it.text=\"aa\"}", null, false, false);
        checkExpr("Button.make {text=\"aa\"; it.text=\"aa\"}", null, false, false);
        checkExpr("Button.make() {text=\"aa\"; it.text=\"aa\"}", null, false, false);
        checkExpr("Str[,].with { fill(\"x\", 3) }", null, false, false);
        checkExpr("Str[,] { fill(\"x\", 3) }", null, false, false);
        checkExpr("[\"a\", \"b\"].each { echo(toStr); echo(it.toStr) }", null, false, false);
        checkExpr("[5:3].each |Str val| { echo(val)}", null, false, false);
        checkExpr("Actor(ActorPool()) |msg| {echo(msg)}", null, false, false);
        checkExpr("Actor.make(ActorPool()) |msg| {echo(msg)}", null, false, false);
        checkExpr("Buf() {capacity=100}", null, false, false);
        checkExpr("Button(\"meh\") {text=100}", null, false, false);
        FanResolvedType.forcedThisType = "testCompiler::CompilerTest";
        checkExpr("compile(\"class Foo {}\") {it.isScript = false}", null, false, false); //compile method in CompilerTest
        FanResolvedType.forcedThisType = null;
        checkExpr("WebUtil.parseMultiPart(\"abc\").null, null) |h, in| {}", null, false, false);

        // enums
        checkExpr("Month.vals", null, false, false);
        checkExpr("Month.mar", null, false, false);
        checkExpr("Month.mar.name", null, false, false);
        // Facet
        checkExpr("Transient.defVal", null, false, false);

        // java
        checkExpr("Runtime.getRuntime().gc", null, false, false);

        // others
        checkExpr("Process().in", null, true, false);
        checkExpr("Obj.super.hash", null, false, false);
        FanResolvedType.forcedThisType = "sys::TimeoutErr";
        checkExpr("Err.super.toStr)", null, false, false);
        FanResolvedType.forcedThisType = null;
        checkExpr("Obj.trap?.toStr", null, false, false);
        checkExpr("500ms.ticks.abs", null, false, false);

        // Testing isCompatible()
        assertTrue("Compatibility of Enum vs Obj", mkt("sys::Enum", node).isTypeCompatible(mkt("sys::Obj", node)));
        assertTrue("Compatibility of Obj vs Obj", mkt("sys::Obj", node).isTypeCompatible(mkt("sys::Obj", node)));
        assertTrue("Un-Compatibility of mixin vs Enum", !mkt("web::Weblet", node).isTypeCompatible(mkt("sys::Enum", node)));
        assertTrue("Compatibility of Button vs Obj", mkt("fwt::Button", node).isTypeCompatible(mkt("sys::Obj", node)));
        assertTrue("Compatibility of Button vs widget", mkt("fwt::Button", node).isTypeCompatible(mkt("fwt::Widget", node)));

        // Testing getParent()
        t = mkt("concurrent::Actor", node);
        FanResolvedType p = t.getParentType();
        assertTrue("Actor parent is Obj:"+p.toString(), p.getDbType().getQualifiedName().equals("sys::Obj"));
        t = mkt("sys::Weekday", node);
        p = t.getParentType();
        assertTrue("Weekday parent is Enum:"+p.toString(), p.getDbType().getQualifiedName().equals("sys::Enum"));
        t = mkt("sys::Enum", node);
        p = t.getParentType();
        assertTrue("Enum parent is Obj:"+p.toString(), p.getDbType().getQualifiedName().equals("sys::Obj"));
        t = mkt("web::Weblet", node);
        p = t.getParentType();
        assertTrue("Mixin parent is Obj:"+p.toString(), p.getDbType().getQualifiedName().equals("sys::Obj"));

        checkExpr("Str<|{\"foo\": 1234}|>.in", "sys::InStream", false, false); // DSL too

        // Still failing items:
        //checkExpr("3>2 ? `gg` : null ", "sys::Uri[]?", true, false); // ternary result
        //checkExpr("Regex<|(a*)(a+)|>", "sys::Regex", false, false); // DSL call
        //checkExpr("Obj.trap?.toStr?.toStr", null, false, false);
        
        // Resolving slots 
        t = FanResolvedType.makeFromTypeSig(node, "Actor");
        FanResolvedType t2 = t.resolveSlotType("pool", task);
        check(t2, "concurrent::ActorPool", false, true);
        // static slot
        t2 = t.resolveSlotType("locals", task);
        check(t2, "[sys::Str:sys::Obj?]", false, false);
        
        
        System.out.println("done");
    }

    private FanResolvedType mkt(String qType, AstNode node) {
        return FanResolvedType.makeFromDbType(node, qType);
    }

    /**
     * Check a type against expected values
     *
     * @param t
     * @param typeSig
     * @param isNullable
     * @param isStatic
     * @throws Exception
     */
    private void check(FanResolvedType t, String typeSig, boolean isNullable, boolean isStatic) throws Exception {
        check(t.getAsTypedType(), t, typeSig, isNullable, isStatic);
    }

    /**
     * if typeSig is null, not checked
     *
     * @param infoStr
     * @param t
     * @param typeSig
     * @param isNullable
     * @param isStatic
     * @throws Exception
     */
    private void check(String infoStr, FanResolvedType t, String typeSig, boolean isNullable, boolean isStatic) throws Exception {
        boolean good = t != null
                && t.isResolved()
                && (typeSig == null || t.toTypeSig(true).equals(typeSig))
                && t.isNullable() == isNullable
                && t.isStaticContext() == isStatic;
        String expected = "got: " + t + ", expected: " + typeSig + ", ST:" + isStatic + ", NL:" + isNullable;
        assertTrue("Checking " + infoStr + "expected:" + expected, good);
    }

    /**
     * Parse the expression into a type and check it against expected values
     *
     * @param expr
     * @param typeSig
     * @param isNullable
     * @param isStatic
     * @throws Exception
     */
    private AstNode checkExpr(String expr, String typeSig, boolean isNullable, boolean isStatic) throws Exception {
        FanParserTask task = new FanParserTask(null);
        FantomParser parser = Parboiled.createParser(FantomParser.class, task);
        ParsingResult<AstNode> result = new RecoveringParseRunner<AstNode>(parser.testExpr()).run(expr);
        assertTrue("Checking for parsing errors: " + expr+":"+StringUtils.join(result.parseErrors, "\n"), !result.hasErrors());
        AstNode node = result.parseTreeRoot.getValue();
        FantomParserAstActions.linkNodes(result.valueStack);

        addUsingsToNode(node, testUsings);
        addTypeSlotsToNode(node, task, testSlots);
        task.parseVars(node, null);
        //System.out.println("Node for "+expr+" : ");
        if(!task.getDiagnostics().isEmpty())
        {
            FanLexAstUtils.dumpTree(node, 0);
        }
        assertTrue("Checking for Semantic errors: " + expr+ ":" + StringUtils.join(task.getDiagnostics(), "\n"), task.getDiagnostics().isEmpty());
        FanResolvedType t = node.getType();
        check(expr, t, typeSig, isNullable, isStatic);
        return node;
    }

//    public static void main(String[] args) {
//        try {
//            JOTTester.singleTest(new FantomTypesTest(), true);
//        } catch (Throwable t) {
//            t.printStackTrace();
//        }
//    }

    public static void addUsingsToNode(AstNode node, String[] usings) {
        for (String using : usings) {
            String name = null;
            if (using.indexOf(":") >= 0) {
                name = using.substring(using.indexOf("::") + 2);
            } else {
                name = using.substring(using.lastIndexOf(".") + 1);
            }
            FanParserTask.addUsingToNode(name, using, node, FanAstScopeVarBase.VarKind.IMPORT);
        }
    }

    public static void addTypeSlotsToNode(AstNode node, FanParserTask task, String[] types) {
        for (String type : types) {
            FanResolvedType baseType = FanResolvedType.makeFromDbType(node, type);
            List<FanSlot> slots = baseType.getDbType().getAllSlots();
            for (FanSlot slot : slots) {
                FanAstScopeVarBase newVar = new FanLocalScopeVar(node, baseType, slot, slot.getName());
                node.addScopeVar(newVar, true);
            }
        }
    }
}
