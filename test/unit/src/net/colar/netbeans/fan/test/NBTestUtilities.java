/*
 * Thibaut Colar Mar 10, 2010
 */
package net.colar.netbeans.fan.test;

import java.io.File;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import javax.swing.text.StyledDocument;
import org.netbeans.editor.BaseDocument;
import org.netbeans.modules.csl.api.DataLoadersBridge;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.openide.cookies.EditorCookie;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 * @author thibautc
 */
public class NBTestUtilities
{

	public static Snapshot textToSnapshot(String text, String mimeType) throws Exception
	{
		BaseDocument doc = new BaseDocument(true, mimeType);
		StringReader reader=new StringReader(text);
		doc.read(reader, 0);
		Source source = Source.create(doc);
		Snapshot snap = source.createSnapshot();
		return snap;
	}

	public static Snapshot fileToSnapshot(File f) throws Exception
	{
		FileObject fo = FileUtil.toFileObject(FileUtil.normalizeFile(f));
        // throws ClassCastExcpetion in NB 6.9 ??
		//BaseDocument doc = GsfUtilities.getDocument(fo, true);
        // so using this intead
        EditorCookie ec = DataLoadersBridge.getDefault().getCookie(fo, EditorCookie.class);
        StyledDocument doc = ec.openDocument();
        Source source = Source.create(doc);
		Snapshot snap = source.createSnapshot();
        return snap;
	}

	public static List<File> listAllFanFilesUnder(String folderPath) throws Exception
	{
		List<File> results = new ArrayList<File>();
		File folder = new File(folderPath);
		File[] files = folder.listFiles();
		for (File f : files)
		{
			if (f.isDirectory())
			{
				results.addAll(listAllFanFilesUnder(f.getAbsolutePath()));
			} else
			{
				if (f.getName().equals("gamma.fan")) // Known invalid file
				{
					continue;
				}
				if (f.getName().endsWith(".fan") || f.getName().endsWith(".fwt"))
				{
					results.add(f);
				}
			}
		}
		return results;
	}

}
