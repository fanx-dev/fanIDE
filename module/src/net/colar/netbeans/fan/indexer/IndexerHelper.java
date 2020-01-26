/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.indexer;

import fan.sys.Buf;
import fan.sys.FanObj;
import fan.sys.Pod;
import fan.sys.Slot;
import fan.sys.Type;
import fanx.fcode.FConst;
import fanx.fcode.FField;
import fanx.fcode.FMethod;
import fanx.fcode.FMethodVar;
import fanx.fcode.FPod;
import fanx.fcode.FStore;
import fanx.fcode.FType;
import fanx.fcode.FTypeRef;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import net.colar.netbeans.fan.fantom.FanPlatform;
import static net.colar.netbeans.fan.indexer.FanEmbeddingIndexer.checkIfNeedsReindexing;
import net.colar.netbeans.fan.namespace.FanConst;
import net.colar.netbeans.fan.namespace.FanElement;
import net.colar.netbeans.fan.namespace.FanMethodParam;
import net.colar.netbeans.fan.namespace.FanSlot;
import net.colar.netbeans.fan.namespace.FanSrcFile;
import net.colar.netbeans.fan.namespace.FanType;
import net.colar.netbeans.fan.namespace.Namespace;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanMethodScopeVar;
import net.colar.netbeans.fan.scope.FanScopeMethodParam;
import net.colar.netbeans.fan.scope.FanTypeScopeVar;
import net.colar.netbeans.fan.types.FanResolvedType;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 */
public class IndexerHelper {
    private static Logger log = FanUtilities.logger;
    
    private final static Pattern CLOSURECLASS = Pattern.compile(".*?\\$\\d+\\z");
    
    private static void setProtection(FanElement elem, FanAstScopeVarBase.ModifEnum modifiers) {
        switch (modifiers) {
            case PRIVATE:
                elem.setFlag(FanConst.Private, true);
                break;
            case PROTECTED:
                elem.setFlag(FanConst.Protected, true);
                break;
            case INTERNAL:
                elem.setFlag(FanConst.Internal, true);
                break;
            case PUBLIC:
                elem.setFlag(FanConst.Public, true);
                break;
        }
    }
    
    public static void doIndexSrc(String path, AstNode rootScope) {
        FanSrcFile doc = null;
        try {
            if (rootScope == null) {
                return;
            }
            // create / update the doument
            doc = FanSrcFile.findOrCreateOne(path);
            doc.setPath(path);
            doc.setTstamp(0L);
            doc.setIsSource(true);

            List<FanType> oldTypes = doc.getTypes();
            for (FanType t : oldTypes) {
                Namespace.get().remove(t);
            }

            Collection<FanAstScopeVarBase> vars = rootScope.getLocalScopeVars().values();
            for (FanAstScopeVarBase var : vars) {
                // types
                if (!(var instanceof FanTypeScopeVar)) {
                    continue;
                }
                FanTypeScopeVar typeScope = (FanTypeScopeVar) var;

                FanType dbType = Namespace.get().findByQualifiedName(typeScope.getQName());
                if (dbType == null) {
                    dbType = new FanType();
                }
                dbType.setSrcFile(doc);
                switch (typeScope.getKind()) {
                    case TYPE_MIXIN:
                        dbType.setFlag(FanConst.Mixin, true);
                    case TYPE_ENUM:
                        dbType.setFlag(FanConst.Enum, true);
                    case TYPE_FACET:
                        dbType.setFlag(FanConst.Enum, true);
                }

                dbType.setIsAbstract(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.ABSTRACT));
                dbType.setIsConst(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.CONST));
                dbType.setIsFinal(typeScope.hasModifier(FanAstScopeVarBase.ModifEnum.FINAL));
                dbType.setQualifiedName(typeScope.getQName());
                dbType.setSimpleName(typeScope.getName());
                dbType.setPod(rootScope.getRoot().getPod());
                setProtection(dbType, typeScope.getProtection());

                // Try to reuse existing db entries.
                for (FanResolvedType item : typeScope.getInheritedItems()) {
                    String mainType = typeScope.getQName();
                    String inhType = item.isResolved() ? item.getDbType().getQualifiedName() : item.getAsTypedType();
                    dbType.getInheritedTypes().add(inhType);
                }

                // Slots
                // Try to reuse existing db entries.
                Collection<FanAstScopeVarBase> localVars = FanLexAstUtils.getScopeNode(typeScope.getNode()).getLocalScopeVars().values();
                for (FanAstScopeVarBase slot : localVars) {
                    if (slot.getKind() == FanAstScopeVarBase.VarKind.CTOR || slot.getKind() == FanAstScopeVarBase.VarKind.FIELD || slot.getKind() == FanAstScopeVarBase.VarKind.METHOD) {
                        FanResolvedType slotType = slot.getType();
                        FanSlot dbSlot = new FanSlot(slot.getName(), slotType.toTypeSig(true), slot.getKind() != FanAstScopeVarBase.VarKind.FIELD);
//                dbSlot.setReturnedType(slotType.toTypeSig(true));
//                dbSlot.setName(slot.getName());
                        dbSlot.setIsAbstract(slot.hasModifier(FanAstScopeVarBase.ModifEnum.ABSTRACT));
                        dbSlot.setIsNative(slot.hasModifier(FanAstScopeVarBase.ModifEnum.NATIVE));
                        dbSlot.setIsOverride(slot.hasModifier(FanAstScopeVarBase.ModifEnum.OVERRIDE));
                        dbSlot.setIsStatic(slot.hasModifier(FanAstScopeVarBase.ModifEnum.STATIC));
                        dbSlot.setIsVirtual(slot.hasModifier(FanAstScopeVarBase.ModifEnum.VIRTUAL));
                        dbSlot.setIsConst(slot.hasModifier(FanAstScopeVarBase.ModifEnum.CONST));
//                dbSlot.setProtection(slot.getProtection());

                        // deal with parameters of method/ctor
                        if (slot instanceof FanMethodScopeVar) {
                            FanMethodScopeVar method = (FanMethodScopeVar) slot;
                            Hashtable<String, FanScopeMethodParam> parameters = method.getParameters();

                            // Try to reuse existing db entries.
                            for (String paramName : parameters.keySet()) {
                                FanScopeMethodParam paramResult = parameters.get(paramName);

                                String pType = paramResult.getType().toTypeSig(true);
                                FanMethodParam dbParam = new FanMethodParam(paramName, pType);
                                dbParam.setParamIndex(paramResult.getOrder());
                                dbParam.setHasDefault(paramResult.hasDefaultValue());
                                dbSlot.addParam(dbParam);
                            } // end param loop
                        }
                        dbType.addSlot(dbSlot);
                    }
                } // end slot loop
                Namespace.get().put(dbType);
            } // end type if

            // all went well, set the tstamp - mark as good
            doc.setTstamp(System.currentTimeMillis());

        } catch (Exception e) {
            log.throwing("Indexing Failed for: " + path, "doIndexSrc", e);
        }
    }
    
    
    public static String getPodDoc(String podName) {
        if (!FanPlatform.isConfigured()) {
            return null;
        }
        Pod pod = null;
        try {
            pod = Pod.find(podName);
        } catch (RuntimeException e) {
            log.fine("Pod doc not found for " + podName);
        }
        if (pod != null) {
            return fanDocToHtml((String) pod.meta().get("pod.summary"));
        }
        return null;
    }

    public static String getSlotDoc(FanSlot slot) {
        FanType type = slot.parent;
        if (type != null) {
            String sig = type.getQualifiedName() + "." + slot.getName();
            try {
                Slot fslot = Slot.find(sig);
                if (fslot != null) {
                    return fanDocToHtml(fslot.doc());
                }
            } catch (Throwable t) {
                // Fantom runtime exception if type ! found
                log.fine(t.toString());
            }
        }
        return null;
    }

    public static String getDoc(FanType type) {
        if (!FanPlatform.isConfigured()) {
            return null;
        }
        try {
            Pod pod = Pod.find(type.getPod());
            Type t = pod.type(type.getSimpleName());
            if (t != null) {
                return fanDocToHtml(t.doc());
            }
        } catch (RuntimeException e) {
            log.fine("Type doc not found for " + type);
        }
        return null;
    }

    /**
     * Parse Fandoc text into HTML using fan's builtin parser.
     *
     * @param fandoc
     * @return
     */
    public static String fanDocToHtml(String fandoc) {
        if (fandoc == null) {
            return null;
        }
        if (!FanPlatform.isConfigured()) {
            return fandoc;
        }
        String html = fandoc;
        try {
            FanObj parser = (FanObj) Type.find("fandoc::FandocParser").make();
            FanObj doc = (FanObj) parser.typeof().method("parseStr").call(parser, fandoc);
            Buf buf = Buf.make();
            FanObj writer = (FanObj) Type.find("fandoc::HtmlDocWriter").method("make").call(buf.out());
            doc.typeof().method("write").call(doc, writer);
            html = buf.flip().readAllStr();
        } catch (Exception e) {
            e.printStackTrace();
        } //System.out.println("Html doc: "+html);
        return html;
    }
    
    
    private static boolean hasFlag(int flags, int flag) {
        return (flags & flag) != 0;
    }
    
    public static void indexPod(String pod) {
        if (!pod.toLowerCase().endsWith(".pod")) {
            return;
        }
        FanSrcFile doc = null;
        try {

            //ZipFile zpod = new ZipFile(pod);
            FPod fpod = new FPod(null, FStore.makeZip(new File(pod)));
            fpod.readFully();
            log.info("Indexing pod: " + pod);
            // Create the document
            doc = FanSrcFile.findOrCreateOne(pod);
            doc.setPath(pod);
            doc.setTstamp(0L);
            doc.setIsSource(false);

            List<FanType> oldTypes = doc.getTypes();
            for (FanType t : oldTypes) {
                Namespace.get().remove(t);
            }

            for (FType type : fpod.types) {
                FTypeRef typeRef = type.pod.typeRef(type.self);
                String sig = typeRef.signature;

                int flags = type.flags;
                // Skipping "internal" classes - closures and the likes
                // synthetic means generated by compiler

                if (hasFlag(flags, FConst.Synthetic) || CLOSURECLASS.matcher(typeRef.typeName).matches()) {
                    continue;
                }

                FanType dbType = new FanType();
                dbType.setSrcFile(doc);

//          dbType.setIsAbstract(hasFlag(flags, FConst.Abstract));
//          dbType.setIsConst(hasFlag(flags, FConst.Const));
//          dbType.setIsFinal(hasFlag(flags, FConst.Final));
                dbType.setQualifiedName(sig);
                dbType.setSimpleName(typeRef.typeName);
                dbType.setPod(typeRef.podName);
                dbType.flags = type.flags;

                // Slots
                for (FField slot : type.fields) {
                    String retType = null;
                    retType = type.pod.typeRef(((FField) slot).type).signature;
                    FanSlot dbSlot = new FanSlot(slot.name, retType, false);
                    dbSlot.flags = slot.flags;
                    dbType.addSlot(dbSlot);
                }

                // It's a bit odd but type.methods has the fields in as well
                // I guess because Fan creates "internal" field getter/setters ?
                for (FMethod m : type.methods) {
                    boolean isField = (m.flags & FConst.Getter) != 0 || (m.flags & FConst.Setter) != 0;
                    if (isField) {
                        continue;
                    }
                    String retType = null;
                    FMethod slot = m;
                    if (hasFlag(m.flags, FConst.Ctor)) {
                        // This returns Void -> retType = type.pod.typeRef(((FMethod) slot).ret);
                        retType = "sys::This";
                    } else {
                        retType = type.pod.typeRef(((FMethod) slot).ret).signature;
                    }

                    FanSlot dbSlot = new FanSlot(slot.name, retType, false);
                    dbSlot.flags = slot.flags;

                    FMethod method = (FMethod) slot;
                    FMethodVar[] parameters = method.params();
                    // Try to reuse existing db entries.
                    int paramIndex = 0;
                    for (FMethodVar param : parameters) {
                        FTypeRef tRef = type.pod.typeRef(param.type);
                        String signature = tRef.signature;

                        FanMethodParam dbParam = new FanMethodParam(param.name, signature);
                        dbParam.setHasDefault(param.def != null);
                        dbParam.setParamIndex(paramIndex);
                        paramIndex++;
                        dbSlot.addParam(dbParam);
                    }
                    dbType.addSlot(dbSlot);
                }

                // Deal with Inheritance
                List<FTypeRef> inhTypes = new ArrayList<FTypeRef>();
                if (type.base >= 0 && type.base != 65535) // 65535 seem to eb value for a type with no base (Obj?)
                {
                    inhTypes.add(type.pod.typeRef(type.base));
                }

                for (int t : type.mixins) {
                    inhTypes.add(type.pod.typeRef(t));
                }

                // Try to reuse existing db entries.
                for (FTypeRef item : inhTypes) {
                    dbType.getInheritedTypes().add(item.signature);
                } // end inh

                Namespace.get().put(dbType);

            } // end type

            // all went well, set the tstamp - mark as good
            doc.setTstamp(System.currentTimeMillis());

        } catch (Exception e) {
            log.throwing("Indexing failed for: " + pod, "indexPod", e);
        }
    }
    
    public static boolean isAllowedIndexing(FileObject srcFile) {
        FileObject fanHome = FanPlatform.getInstance().getFanHome();
        if (fanHome == null) return false;
        if (fanHome.getPath().equals(srcFile.getPath())
                || FileUtil.isParentOf(fanHome, srcFile)) {
            return false;
        }
        return true;
    }
    
    public static void indexAllPods() {
        if (!FanPlatform.isConfigured()) {
            return;
        }
        try {
            String podsDir = FanPlatform.getInstance().getPodsDir();
            File f = new File(podsDir);
            // index the pods if not up to date
            File[] pods = f.listFiles();

            for (File pod : pods) {
                String path = pod.getAbsolutePath();
                if (checkIfNeedsReindexing(path, pod.lastModified())) {
                    IndexerHelper.indexPod(path);
                }
            }
        } catch (Throwable t) {
            log.throwing("Pod indexing thread error", "indexFantomPods", t);
        }
    }
}
