/*
 * Thibaut Colar Aug 18, 2009
 */

package net.colar.netbeans.fan.structure;

import java.util.Collections;
import java.util.Set;
import net.colar.netbeans.fan.FanLanguage;
import org.netbeans.modules.csl.api.ElementHandle;
import org.netbeans.modules.csl.api.ElementKind;
import org.netbeans.modules.csl.api.Modifier;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.openide.filesystems.FileObject;

/**
 * "Dummy" ElementHandle (used for Not-ast items such as keywords).
 * @author thibautc
 */
public class FanBasicElementHandle implements ElementHandle
{
	private String doc;

	private final String name;
	private final ElementKind kind;
	private FileObject fo;

	public FanBasicElementHandle(String name, ElementKind kind)
	{
		this.name=name;
		this.kind=kind;
	}


	public String getMimeType()
	{
		return FanLanguage.FAN_MIME_TYPE;
	}

	public ElementKind getKind()
	{
		return kind;
	}

	public String getName()
	{
		return name;
	}

	public FileObject getFileObject()
	{
		return fo;
	}

	public String getIn()
	{
		return null;
	}

	public Set<Modifier> getModifiers()
	{
		return Collections.emptySet();
	}

	public boolean signatureEquals(ElementHandle arg0)
	{
		return false;
	}

	public OffsetRange getOffsetRange(ParserResult arg0)
	{
		return OffsetRange.NONE;
	}

	public void setFo(FileObject fo)
	{
		this.fo = fo;
	}

	public void setDoc(String doc)
	{
		this.doc=doc;
	}
	public String getDoc()
	{
		return doc;
	}


}
