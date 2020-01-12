/*
 * Thibaut Colar Dec 18, 2009
 */
package net.colar.netbeans.fan.indexer.model;

import java.util.Vector;
import net.colar.netbeans.fan.indexer.FanIndexerFactory;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.jot.logger.JOTLogger;
import net.jot.persistance.JOTModel;
import net.jot.persistance.JOTModelMapping;
import net.jot.persistance.JOTQueryResult;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.JOTTransaction;
import net.jot.persistance.builders.JOTQueryBuilder;

/**
 * DB Model for a "Type" (class, enum, mixin)
 *
 * @author thibautc
 */
public class FanType extends JOTModel {

    // Primary key
    public String qualifiedName = ""; // net.colar.jco -> Unique !
    public String simpleName = "";
    public String pod = ""; // name of the pod it's in (or package for java ffi)
    public Integer kind = -1; // class, enum, mixin
    public Long srcDocId = -1L; // id of the document(source) it's found in - can be null;
    public Long binDocId = -1L; // id of the document(source) it's found in - can be null;
    // wether latest indexing was done from source or binary/lib
    public Boolean fromSource = true;
    // modifiers / protection
    public Integer protection = -1; // private, public(default), internal, protected
    public Boolean isConst = false;
    // flags / modifiers
    public Boolean isAbstract = false;
    public Boolean isFinal = false;

    @Override
    protected void customize(JOTModelMapping mapping) {
        mapping.requestIndex("qualifiedName");
        mapping.defineFieldSize("qualifiedName", 255);
        mapping.defineFieldSize("superClass", 255);
        mapping.defineFieldSize("simpleName", 80);
        mapping.defineFieldSize("pod", 80);
    }

    public Long getBinDocId() {
        return binDocId;
    }

    public void setBinDocId(Long binDocId) {
        this.binDocId = binDocId;
    }

    public Long getSrcDocId() {
        return srcDocId;
    }

    public void setSrcDocId(Long srcDocId) {
        this.srcDocId = srcDocId;
    }

    public boolean isIsAbstract() {
        return isAbstract;
    }

    public void setIsAbstract(boolean isAbstract) {
        this.isAbstract = isAbstract;
    }

    public boolean isIsConst() {
        return isConst;
    }

    public void setIsConst(boolean isConst) {
        this.isConst = isConst;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public String getPod() {
        return pod;
    }

    public void setPod(String pod) {
        this.pod = pod;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public Boolean isFinal() {
        return isFinal;
    }

    public void setIsFinal(Boolean isFinal) {
        this.isFinal = isFinal;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }

    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public String getSimpleName() {
        return simpleName;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    /**
     * All types for a document
     *
     * @param transaction
     * @param doc
     * @return
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public static Vector<FanType> findAllForDoc(JOTTransaction transaction, long doc) throws Exception {
        JOTSQLCondition cond = new JOTSQLCondition("srcDocId", JOTSQLCondition.IS_EQUAL, doc);
        JOTSQLCondition cond2 = new JOTSQLCondition("binDocId", JOTSQLCondition.IS_EQUAL, doc);
        return (Vector<FanType>) JOTQueryBuilder.selectQuery(transaction, FanType.class).where(cond).orWhere(cond2).find().getAllResults();
    }

    public Boolean isFromSource() {
        return fromSource;
    }

    public void setIsFromSource(Boolean fromSource) {
        this.fromSource = fromSource;
    }

    /**
     * We don't want to delete if either bindoc or srcdoc still there, just
     * update the entry ... only delete if both are gone. if there is a doc left
     * (wethere src or bin) we should reindex that one to make sure we are up to
     * date.
     */
    public static void unlinkDocument(JOTTransaction trans, long id, boolean isSrcDoc) throws Exception {
        try {
            Vector<FanType> types = findAllForDoc(trans, id);
            for (FanType type : types) {
                // If there will be no link left, then delete the type
                if ((isSrcDoc && type.getBinDocId() == -1)
                        || (!isSrcDoc && type.getBinDocId() == -1)) {
                    type.delete(trans);
                } // otherwise:
                else {
                    if (isSrcDoc) {
                        // I'm removing the src doc, but there is still a bin one
                        type.setSrcDocId(-1L);
                        if (type.isFromSource()) {
                            //TODO: Reindex just that type and not the whole pod !
                            // this should be pretty rare though
                            FanDocument doc = FanDocument.findById(type.getBinDocId());
                            if (doc != null) {
                                FanIndexerFactory.getIndexer().requestIndexing(doc.getPath());
                            }
                        }
                        type.save();
                    } else {
                        // I'm removing the bin doc, but there is still a src one
                        type.setBinDocId(-1L);
                        if (!type.isFromSource()) {
                            FanDocument doc = FanDocument.findById(type.getSrcDocId());
                            if (doc != null) {
                                FanIndexerFactory.getIndexer().requestIndexing(doc.getPath());
                            }
                        }
                        type.save();
                    }
                }
            }
        } catch (Exception e) {
            JOTLogger.logException(FanDocument.class, "Failed deleting type: " + id, e);
        }
    }

    @Override
    public void delete(JOTTransaction trans) throws Exception {
        Vector<FanTypeInheritance> inhs = FanTypeInheritance.findAllForMainType(null, qualifiedName);
        for (FanTypeInheritance inh : inhs) {
            inh.delete(trans);
        }
        Vector<FanSlot> slots = FanSlot.findAllForType(getId());
        for (FanSlot slot : slots) {
            slot.delete(trans);
        }
        super.delete(trans);
    }

    /**
     * During parsing we use this through fanParserTask.findCachedQualifiedType
     * (cached)
     *
     * @param qName
     * @return
     */
    public static FanType findByQualifiedName(String qName) {
        //System.out.println(">find by fqdn: "+qName);
        try {
            JOTSQLCondition cond = new JOTSQLCondition("qualifiedName", JOTSQLCondition.IS_EQUAL, qName);
            FanType type = (FanType) JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).findOne();
            return type;
        } catch (Exception e) {
            JOTLogger.logException(FanType.class, "hasPodType error", e);
        }
        return null;
    }

    public static FanType findByPodAndType(String pod, String type) {
        String qname = pod + "::" + type;
        return findByQualifiedName(qname);
    }

    public static FanType findByID(long id) {
        try {
            JOTSQLCondition cond = new JOTSQLCondition("ID", JOTSQLCondition.IS_EQUAL, id);
            return (FanType) JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).findOne();
        } catch (Exception e) {
            JOTLogger.logException(FanType.class, "findByID error", e);
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public static Vector<String> findAllPackagesNames() {
        try {
            Vector<String> results = new Vector<String>();
            JOTSQLCondition cond = new JOTSQLCondition("kind", JOTSQLCondition.IS_GREATER, 20);
            JOTQueryResult result = JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).find();
            for (FanType type : (Vector<FanType>) result.getAllResults()) {
                if (!results.contains(type.getPod())) {
                    results.add(type.getPod());
                }
            }
            return results;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static Vector<String> findAllPodNames() {
        //TODO: inneficient .... use DISTINCT ?
        try {
            Vector<String> results = new Vector<String>();
            JOTSQLCondition cond = new JOTSQLCondition("kind", JOTSQLCondition.IS_LOWER, 20);
            JOTQueryResult result = JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).find();
            Vector<FanType> v = result.getAllResults();
            for (FanType type : v) {
                if (!results.contains(type.getPod())) {
                    results.add(type.getPod());
                }
            }
            return results;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean hasPod(String podName) {
        try {
            JOTSQLCondition cond = new JOTSQLCondition("pod", JOTSQLCondition.IS_EQUAL, podName);
            return JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).findOne() != null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static Vector<FanType> findAllFantomTypes(String prefix) {
        try {
            JOTSQLCondition cond = new JOTSQLCondition("simpleName", JOTSQLCondition.IS_LIKE, prefix + "%");
            JOTSQLCondition cond2 = new JOTSQLCondition("kind", JOTSQLCondition.IS_LOWER, 20);
            return (Vector<FanType>) JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).where(cond2).find().getAllResults();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getShortName(String qualifiedType) {
        if (qualifiedType != null && qualifiedType.indexOf("::") > -1) {
            return qualifiedType.substring(qualifiedType.indexOf("::") + 2);
        }
        return qualifiedType;
    }

    @SuppressWarnings("unchecked")
    public static Vector<FanType> findPodTypes(String pod, String prefix) {
        try {
            JOTSQLCondition cond = new JOTSQLCondition("pod", JOTSQLCondition.IS_EQUAL, pod);
            JOTSQLCondition cond2 = new JOTSQLCondition("simpleName", JOTSQLCondition.IS_LIKE, prefix + "%");
            return JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).where(cond2).find().getAllResults();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Find all types of exact specified type (in any pod).
     *
     * @param type
     * @param prefix
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Vector<FanType> findTypes(String type) {
        try {
            JOTSQLCondition cond = new JOTSQLCondition("simpleName", JOTSQLCondition.IS_EQUAL, type);
            return JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).find().getAllResults();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isClass() {
        return getKind() == FanAstScopeVarBase.VarKind.TYPE_CLASS.value()
                || getKind() == FanAstScopeVarBase.VarKind.TYPE_JAVA_CLASS.value();
    }

    public boolean isMixin() {
        return getKind() == FanAstScopeVarBase.VarKind.TYPE_MIXIN.value();
    }

    public boolean isEnum() {
        return getKind() == FanAstScopeVarBase.VarKind.TYPE_ENUM.value()
                || getKind() == FanAstScopeVarBase.VarKind.TYPE_JAVA_ENUM.value();
    }

    public boolean isJava() {
        return kind > 20 && kind < 30;
    }
}
