/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.structure;

import java.util.HashSet;
import java.util.Set;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Source;
import org.openide.filesystems.FileObject;

/**
 * Element Handle impl.
 * Used by structureAnalyzer
 * @author tcolar
 */
public class FanElementHandle implements ElementHandle
{

	private final ParserResult result;
	private final Source source;
	private final AstNode node;
	private ElementKind kind;
	private OffsetRange offsetRange;
	private Set<Modifier> modifiers = new HashSet<Modifier>();

	public FanElementHandle(ElementKind kind, AstNode node, ParserResult result, OffsetRange range)
	{
		this.node = node;
		this.result = result;
		this.source = result.getSnapshot().getSource();
		this.kind = kind;
		this.offsetRange = range;
	}

	public FileObject getFileObject()
	{
		return source.getFileObject();
	}

	public String getMimeType()
	{
		return source.getMimeType();
	}

	public String getName()
	{
		return node.getNodeText(true);
	}

	public String getIn()
	{
		return "";
	}

	public ElementKind getKind()
	{
		return kind;
	}

	public Set<Modifier> getModifiers()
	{
		return modifiers;
	}

	public void setModifiers(Set<Modifier> modifiers)
	{
		this.modifiers = modifiers;
	}

	public boolean signatureEquals(ElementHandle arg0)
	{
		return false;
	}

	public OffsetRange getOffsetRange(ParserResult result)
	{
		return offsetRange;
	}

}
