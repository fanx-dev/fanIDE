/*
 * Thibaut Colar Mar 24, 2010
 */
package net.colar.netbeans.fan.test;

import net.colar.netbeans.fan.FanParserTask;
import net.colar.netbeans.fan.parboiled.AstKind;
import net.colar.netbeans.fan.parboiled.AstNode;
import net.colar.netbeans.fan.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.parboiled.FantomParser;
import net.colar.netbeans.fan.parboiled.pred.NodeKindPredicate;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.VarKind;
import net.colar.netbeans.fan.types.FanResolvedListType;
import net.colar.netbeans.fan.types.FanResolvedNullType;
import net.colar.netbeans.fan.types.FanResolvedType;
import net.jot.testing.JOTTester;
import org.parboiled.Parboiled;
import org.parboiled.RecoveringParseRunner;
import org.parboiled.Rule;
import org.parboiled.support.ParsingResult;

/**
 * Test type resolution
 * @author thibautc
 */
public class FantomTypesTest extends FantomCSLTest
{
	// List some fq imports we will use in the tests, so we can add them to the node's scope
	// Note: no need to add the 'sys' types (implied)
	static String[] testUsings={"web::Weblet", "fwt::Button", "fwt::Widget"};


	@Override
	public void cslTest() throws Throwable
	{
		// Dummy task & rootNode to pass along
		FanParserTask task = new FanParserTask(null);
		DummyAstRootNode node = new DummyAstRootNode(task);
		addUsingsToNode(node);

		// Testing type signature stuff
		FanResolvedType t = FanResolvedType.makeFromTypeSig(node, "sys::Str");
		JOTTester.checkIf("Type sig 1", t.getQualifiedType().equals("sys::Str") && !t.isNullable(), t.toString());
		JOTTester.checkIf("Type sig 1a", t.asNullableContext(true).isNullable() && t.asStaticContext(true).isStaticContext(), t.toString());
		t = FanResolvedType.makeFromTypeSig(node, "sys::Str?");
		JOTTester.checkIf("Type sig 2", t.getQualifiedType().equals("sys::Str") && t.isNullable(), t.toString());
		t = FanResolvedType.makeFromTypeSig(node, "sys::Str[]");
		JOTTester.checkIf("Type sig 3", (t instanceof FanResolvedListType) && t.toTypeSig(true).equals("sys::Str[]"), t.toString());
		t = FanResolvedType.makeFromTypeSig(node, "Int");
		check(t, "sys::Int", false, true);
		t = FanResolvedType.makeFromTypeSig(node, "Int?");
		check(t, "sys::Int?", true, true);

		// checking expressions
		checkExpr("5", "sys::Int", false, false);
		AstNode resultNode=checkExpr("null", "null:null?", true, false);
		JOTTester.checkIf("checking null type", resultNode.getType() instanceof FanResolvedNullType);

		resultNode=checkExpr("|str| { echo(str) }", "|sys::Obj?->sys::Void|", false, false);
		AstNode block=FanLexAstUtils.getFirstChildRecursive(resultNode, new NodeKindPredicate(AstKind.AST_BLOCK));
		JOTTester.checkIf("Infered Closure type", block!=null && block.getAllScopeVars().get("str").getType().toTypeSig(true).equals("sys::Obj?"));
		
		checkExpr("0..<20", "sys::Range", false, false);
		checkExpr("(0..<20).toList", "sys::Int[]", false, false);
		checkExpr("\"abc\".split[0]", "sys::Str", false, false);
		checkExpr("\"abc\".split[0..2]", "sys::Str[]", false, false);
		//    verify(zc[0].isRO)
		//    verifyJoin(map, '|', ["(0=zero)", "(1=one)", "(2=two)"]) |Str v, Int k->Str| { return "($k=$v)" }
		//    MxA? a := MxClsAB.make as MxA;
		//  verifyEq(a.toStr, "MxClsAB!")
		//    m := Regex<|^a.*d$|>.matcher("abcd")
		//     verifyEq(0xff.and(0x0f), 0x0f)
		//    ExprTest? b := this
		//	verifyEq(b?.mInt(4)?.toHex(2), "04")
		//    x = null
		//    verifyEq(x?.fInt?.toHex, null)
		//	    verify(EnumAbc.A is EnumAbc)
		//	    verifySame(Type.of(Month.jan), Month#)
		//	    verifyEq(buildTest { it.x="x" },    ["x", ""])

		// Testing isCompatible()
		JOTTester.checkIf("Compatibility of Enum vs Obj", mkt("sys::Enum", node).isTypeCompatible(mkt("sys::Obj", node)));
		JOTTester.checkIf("Compatibility of Obj vs Obj", mkt("sys::Obj", node).isTypeCompatible(mkt("sys::Obj", node)));
		JOTTester.checkIf("Compatibility of mixin vs Obj", !mkt("web::Weblet", node).isTypeCompatible(mkt("sys::Obj", node)));
		JOTTester.checkIf("Compatibility of Button vs Obj", mkt("fwt::Button", node).isTypeCompatible(mkt("sys::Obj", node)));
		JOTTester.checkIf("Compatibility of Button vs widget", mkt("fwt::Button", node).isTypeCompatible(mkt("fwt::Widget", node)));

		// Testing getParent()
		t = mkt("sys::Actor", node);
		FanResolvedType p = t.getParentType();
		JOTTester.checkIf("Actor parent is Obj", p.getDbType().getQualifiedName().equals("sys::Obj"), p.toString());
		t = mkt("sys::Weekday", node);
		p = t.getParentType();
		JOTTester.checkIf("Weekday parent is Enum", p.getDbType().getQualifiedName().equals("sys::Enum"), p.toString());
		t = mkt("sys::Enum", node);
		p = t.getParentType();
		JOTTester.checkIf("Enum parent is Obj", p.getDbType().getQualifiedName().equals("sys::Obj"), p.toString());
		t = mkt("web::Weblet", node);
		p = t.getParentType();
		JOTTester.checkIf("Mixin parent is null", p == null, p == null ? "null" : p.toString());
	}

	private FanResolvedType mkt(String qType, AstNode node)
	{
		return FanResolvedType.makeFromDbType(node, qType);
	}

	/**
	 * Chceck a type against expected values
	 * @param t
	 * @param typeSig
	 * @param isNullable
	 * @param isStatic
	 * @throws Exception
	 */
	private void check(FanResolvedType t, String typeSig, boolean isNullable, boolean isStatic) throws Exception
	{
		check(t.getAsTypedType(), t, typeSig, isNullable, isStatic);
	}

	private void check(String infoStr, FanResolvedType t, String typeSig, boolean isNullable, boolean isStatic) throws Exception
	{
		boolean good = t!=null
				&& t.isResolved()
				&& t.toTypeSig(true).equals(typeSig)
				&& t.isNullable() == isNullable
				&& t.isStaticContext() == isStatic;
		String expected = "got: " + t + ", expected: " + typeSig + ", ST:" + isStatic + ", NL:" + isNullable;
		JOTTester.checkIf("Checking " + infoStr, good, expected);
	}

	/**
	 * Parse the expression into a type and check it against expected values
	 * @param expr
	 * @param typeSig
	 * @param isNullable
	 * @param isStatic
	 * @throws Exception
	 */
	private AstNode checkExpr(String expr, String typeSig, boolean isNullable, boolean isStatic) throws Exception
	{
		FanParserTask task = new FanParserTask(null);
		FantomParser parser = Parboiled.createParser(FantomParser.class, task);
		ParsingResult<AstNode> result = RecoveringParseRunner.run(parser.testExpr(), expr);
		AstNode node = result.parseTreeRoot.getValue();
		task.prune(node, task.getRootLabel(node));
		addUsingsToNode(node);
		task.parseVars(node, null);
		FanResolvedType t = node.getType();
		check(expr, t, typeSig, isNullable, isStatic);
		return node;
	}

	public static void main(String[] args)
	{
		try
		{
			JOTTester.singleTest(new FantomTypesTest(), false);
		} catch (Throwable t)
		{
			t.printStackTrace();
		}
	}

	private void addUsingsToNode(AstNode node)
	{
		for(String using : testUsings)
		{
			String shortName = using.substring(using.indexOf("::")+2);
			node.addScopeVar(shortName, VarKind.IMPORT, FanResolvedType.makeFromDbType(node, using), false);
		}
	}
}
