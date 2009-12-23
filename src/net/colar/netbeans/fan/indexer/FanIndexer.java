/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import java.io.File;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import net.colar.netbeans.fan.FanParserResult;
import net.colar.netbeans.fan.NBFanParser;
import net.colar.netbeans.fan.antlr.FanParser;
import net.colar.netbeans.fan.ast.FanAstResolvedType;
import net.colar.netbeans.fan.ast.FanAstScope;
import net.colar.netbeans.fan.ast.FanAstScopeVarBase;
import net.colar.netbeans.fan.ast.FanRootScope;
import net.colar.netbeans.fan.ast.FanTypeScope;
import net.colar.netbeans.fan.indexer.model.FanDocUsing;
import net.colar.netbeans.fan.indexer.model.FanDocument;
import net.colar.netbeans.fan.indexer.model.FanSlot;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.indexer.model.FanTypeInheritance;
import net.jot.logger.JOTLoggerLocation;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.JOTTransaction;
import net.jot.persistance.builders.JOTQueryBuilder;
import org.antlr.runtime.tree.CommonTree;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 * Update: Will not be using lucerne anymore ...
 *
 * Index parsed files (used later for completion etc...)
 * I feel like it's not right to have the item data encoded into a string
 * This should probably be backed by a JavaDB instead ... but whatever
 * @author tcolar
 */
public class FanIndexer extends CustomIndexer
{

	JOTLoggerLocation log = new JOTLoggerLocation(getClass());

	public FanIndexer()
	{
		super();
	}

	@Override
	protected void index(Iterable<? extends Indexable> iterable, Context context)
	{
		for (Indexable indexable : iterable)
		{
			long then = new Date().getTime();
			log.info("Indexing requested for: " + indexable.getURL());
			// Get a snaphost of the source
			File f = new File(indexable.getURL().getFile());
			FileObject fo = FileUtil.toFileObject(f);
			Source source = Source.create(fo);
			Snapshot snapshot = source.createSnapshot();
			// Parse the snaphot
			NBFanParser parser = new NBFanParser();
			parser.parse(snapshot);
			Result result = parser.getResult();
			long now = new Date().getTime();
			log.debug("Indexing - parsing done in " + (now - then) + " ms for: " + indexable.getURL());
			// Index the parsed doc
			index(indexable, result, context);
			now = new Date().getTime();
			log.debug("Indexing completed in " + (now - then) + " ms for: " + indexable.getURL());
		}
	}

	public void index(Indexable indexable, Result parserResult, Context context)
	{
		log.debug("Indexing parsed result for : " + indexable.getURL());

		FanParserResult fanResult = (FanParserResult) parserResult;
		indexDoc(indexable.getURL(), fanResult.getRootScope());
	}

	/**
	 * Index the document in the DB, using the root scope.
	 * @param doc
	 * @param indexable
	 * @param rootScope
	 */
	public void indexDoc(URL docUrl, FanRootScope rootScope)
	{
		//TODO: does this need to be synchronized or is NB taking care of that ?
		JOTTransaction transaction = null;
		try
		{
			transaction = new JOTTransaction("default");
			if (rootScope != null)
			{
				// create / update the doument
				FanDocument doc = FanDocument.findOrCreateOne(transaction, docUrl.getPath());
				if (doc.isNew())
				{
					doc.setPath(docUrl.getPath());
					doc.save(transaction);
				}

				// TODO: Do I need the usings ? mostly for where used -> later ?
				// Also needed to resolve qualified types

				// Update the  "using" / try to be smart as to not delete / recreate all everytime.
				Vector<FanDocUsing> usings = FanDocUsing.findAllForDoc(transaction, doc.getId());
				for (FanAstResolvedType type : rootScope.getUsing().values())
				{
					//TODO: unresolved should work too
					String sig = type.getTypeText();
					int foundIdx = -1;
					for (int i = 0; i != usings.size(); i++)
					{
						FanDocUsing using = usings.get(i);
						if (using.getType().equals(sig))
						{
							foundIdx = i;
							break;
						}
					}
					if (foundIdx != -1)
					{
						// already in there, leave it alone
						usings.remove(foundIdx);
					} else
					{
						// new one, creating it
						FanDocUsing using = new FanDocUsing();
						using.setDocumentId(doc.getId());
						using.setType(sig);
						using.save(transaction);
					}
				}
				// Whatever type wasn't removed from the vector is old or unresolved, so we remove them.
				for (FanDocUsing using : usings)
				{
					using.delete(transaction);
				}

				// types
				for (FanAstScope child : rootScope.getChildren())
				{
					// should be but check anyway in case of future change
					if (child instanceof FanTypeScope)
					{
						FanTypeScope typeScope = (FanTypeScope) child;
						JOTSQLCondition cond = new JOTSQLCondition("qualifiedName", JOTSQLCondition.IS_EQUAL, typeScope.getQName());
						FanType dbType = (FanType) JOTQueryBuilder.selectQuery(transaction, FanType.class).where(cond).findOrCreateOne();
						dbType.setDocumentId(doc.getId());
						dbType.setKind(typeScope.getKind().value());
						dbType.setIsAbstract(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.ABSTRACT));
						dbType.setIsConst(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.CONST));
						dbType.setIsNative(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.NATIVE));
						dbType.setIsOverride(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.OVERRIDE));
						dbType.setIsReadonly(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.READONLY));
						dbType.setIsStatic(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.STATIC));
						dbType.setIsVirtual(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.VIRTUAL));
						dbType.setQualifiedName(typeScope.getQName());
						dbType.setSimpleName(typeScope.getName());
						dbType.setPod(typeScope.getPod());
						dbType.setProtection(typeScope.getProtection());
						
						dbType.save(transaction);

						// Try to reuse existing db entries.
						Vector<FanTypeInheritance> currentInh = FanTypeInheritance.findAllForMainType(transaction, typeScope.getQName());
						for (FanAstResolvedType item : typeScope.getAllInheritedItems())
						{
							String mainType = typeScope.getQName();
							String inhType = item.getTypeText();
							int foundIdx = -1;
							for (int i = 0; i != currentInh.size(); i++)
							{
								FanTypeInheritance cur = currentInh.get(i);
								if (cur.getMainType().equals("mainType") && cur.getInheritedType().equals(inhType))
								{
									foundIdx = i;
									break;
								}
							}
							if (foundIdx != -1)
							{
								// already in there, leave it alone
								currentInh.remove(foundIdx);
							} else
							{
								// new one, creating it
								FanTypeInheritance inh = new FanTypeInheritance();
								inh.setMainType(mainType);
								inh.setInheritedType(inhType);
								inh.save(transaction);
							}
						}
						// Whatever wasn't removed from the vector is not needed anymore.
						for (FanTypeInheritance inh : currentInh)
						{
							inh.delete(transaction);
						}
						// TODO: Do the slots.

						/*Collection<FanAstScopeVarBase> vars = child.getScopeVars();
						for (FanAstScopeVarBase slot : vars)
						{
						if (slot instanceof FanAstMethod)
						{
						}
						// otherwise it's a field, nothing to do with it
						}*/
					}
				}

			}

			// Only commit if everything went well.
			transaction.commit();
		} catch (Exception e)
		{
			log.exception("Indexing of: " + docUrl, e);
			try
			{
				if (transaction != null)
				{
					log.info("Rolling back failed indexing of: " + docUrl);
					transaction.rollBack();
				}
			} catch (Exception e2)
			{
				log.exception("Indexing rollback failed for: " + docUrl, e);
			}
		}
	}
}
