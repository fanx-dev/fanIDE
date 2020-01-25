/*
 * To change this template, choose Tools | Templates
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
import fanx.fcode.FSlot;
import fanx.fcode.FStore;
import fanx.fcode.FType;
import fanx.fcode.FTypeRef;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import net.colar.netbeans.fan.parser.FanParserTask;
import net.colar.netbeans.fan.utils.FanUtilities;
import net.colar.netbeans.fan.parser.NBFanParser;
//import net.colar.netbeans.fan.ast.FanAstField;
//import net.colar.netbeans.fan.ast.FanAstMethod;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.ModifEnum;
//import net.colar.netbeans.fan.ast.FanTypeScope;
import net.colar.netbeans.fan.namespace.FanMethodParam;
import net.colar.netbeans.fan.namespace.FanSlot;
import net.colar.netbeans.fan.namespace.FanType;
import net.colar.netbeans.fan.parser.parboiled.AstNode;
import net.colar.netbeans.fan.parser.parboiled.FanLexAstUtils;
import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.namespace.FanConst;
import net.colar.netbeans.fan.namespace.FanElement;
import net.colar.netbeans.fan.namespace.FanSrcFile;
import net.colar.netbeans.fan.namespace.Namespace;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.VarKind;
import net.colar.netbeans.fan.scope.FanMethodScopeVar;
import net.colar.netbeans.fan.scope.FanScopeMethodParam;
import net.colar.netbeans.fan.scope.FanTypeScopeVar;
import net.colar.netbeans.fan.types.FanResolvedType;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.spi.Parser.Result;
import org.netbeans.modules.parsing.spi.indexing.Context;
import org.netbeans.modules.parsing.spi.indexing.CustomIndexer;
import org.netbeans.modules.parsing.spi.indexing.Indexable;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.FileUtil;
import org.openide.util.Cancellable;
//import org.netbeans.modules.java.source.indexing.JavaBinaryIndexer;

/**
 * This indexer is backed by a DB(H2 database) This class does all the Index
 * updates(write) Use FanIndexQyery to search it.
 *
 * @author tcolar
 */
public class FanIndexer extends CustomIndexer implements FileChangeListener {
    // Can bump -up when we want to force a full-reindexing after fixes/chnages.

    private static Integer VERSION = 2;
    public static final String UNRESOLVED_TYPE = "!!UNRESOLVED!!";
    private final static Pattern CLOSURECLASS = Pattern.compile(".*?\\$\\d+\\z");
    static Logger log = FanUtilities.logger;

    private final FanIndexerThread indexerThread;
    public static volatile boolean shutdown = false;
    //TODO: will that work or should they all be in the same fifo stack
    Hashtable<String, Long> fanSrcToBeIndexed = new Hashtable<String, Long>();
    Hashtable<String, Long> fanPodsToBeIndexed = new Hashtable<String, Long>();
    Hashtable<String, Long> toBeDeleted = new Hashtable<String, Long>();
//  private FanJarsIndexer jarsIndexer;
    private boolean alreadyWarned;

    public FanIndexer() {
        super();
        indexerThread = new FanIndexerThread();
        indexerThread.start();
    }

    synchronized void warnIfNecessary() {
        if (!alreadyWarned) {
            alreadyWarned = true;
//            NotifyDescriptor desc = new NotifyDescriptor.Message("Initial Fantom/Java API Indexing just started\nThis might take a while and use a lot of CPU (once).\nSome features such as completion will not be available until it's completed.", NotifyDescriptor.WARNING_MESSAGE);
//            DialogDisplayer.getDefault().notify(desc);
        }
    }

    /**
     * Rerun whole indexing (called on FAN_HOME change, see FanPlatform)
     *
     * @param backgroundJava
     */
    public void indexAll() {
        this.indexFantomPods();
    }

    @Override
    protected void index(Iterable<? extends Indexable> iterable, Context context) {
        for (Indexable indexable : iterable) {
            requestIndexing(indexable.getURL().getPath());
        }
    }

    public void requestDelete(String path) {
        toBeDeleted.put(path, new Date().getTime());
    }

    /**
     * all Fantom indexing should be requested through here (no direct call to
     * index() for threading safety
     *
     * @param path
     */
    public void requestIndexing(String path) {
        if (!FanPlatform.isConfigured()) {
            return;
        }
        boolean isPod = path.toLowerCase().endsWith(".pod");

        FileObject fo = FileUtil.toFileObject(FileUtil.normalizeFile(new File(path)));
        if (fo.getNameExt().equalsIgnoreCase("sys.pod")) {
            warnIfNecessary();
        }
        if (isPod) {
            fanPodsToBeIndexed.put(path, new Date().getTime());
        } else if (isAllowedIndexing(fo)) {
            fanSrcToBeIndexed.put(path, new Date().getTime());
        }
    }

    private void indexSrc(String path) {
        if (!FanPlatform.isConfigured()) {
            log.info("Platform not ready to index: " + path);
            return;
        }

        if (!isAllowedIndexing(FileUtil.toFileObject(FileUtil.normalizeFile(new File(path))))) {
            log.info("Skipping: " + path);
            return;
        }

        long then = new Date().getTime();
        log.info("Indexing requested for: " + path);
        // Get a snaphost of the source
        File f = new File(path);

        FileObject fo = FileUtil.toFileObject(FileUtil.normalizeFile(f));
        Source source = Source.create(fo);
        Snapshot snapshot = source.createSnapshot();
        // Parse the snaphot
        NBFanParser parser = new NBFanParser();
        try {
            parser.parse(snapshot, true);
        } catch (Throwable e) {
            log.throwing("Parsing failed for: " + path, "indexSrc", e);
            return;
        }
        Result result = parser.getResult();
        long now = new Date().getTime();
        log.fine("Indexing - parsing done in " + (now - then) + " ms for: " + path);
        // Index the parsed doc
        indexSrc(path, result);
        now = new Date().getTime();
        log.fine("Indexing completed in " + (now - then) + " ms for: " + path);
    }

    private void indexSrc(String path, Result parserResult) {
        log.fine("Indexing parsed result for : " + path);

        FanParserTask fanResult = (FanParserTask) parserResult;
        doIndexSrc(path, fanResult.getRootScope());
    }

    private void setProtection(FanElement elem, ModifEnum modifiers) {
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
    
    private FanType findOrCreateType(List<FanType> list, String qname) {
        for (FanType t : list) {
            if (t.getQualifiedName().equals(qname)) {
                return t;
            }
        }
        FanType t = new FanType();
        t.setQualifiedName(qname);
        return t;
    }

    /**
     * Index the document in the DB, using the root scope.
     *
     * @param doc
     * @param indexable
     * @param rootScope
     */
    private void doIndexSrc(String path, AstNode rootScope) {
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
                    if (slot.getKind() == VarKind.CTOR || slot.getKind() == VarKind.FIELD || slot.getKind() == VarKind.METHOD) {
                        FanResolvedType slotType = slot.getType();
                        FanSlot dbSlot = new FanSlot(slot.getName(), slotType.toTypeSig(true), slot.getKind() != VarKind.FIELD);
//                dbSlot.setReturnedType(slotType.toTypeSig(true));
//                dbSlot.setName(slot.getName());
                        dbSlot.setIsAbstract(slot.hasModifier(ModifEnum.ABSTRACT));
                        dbSlot.setIsNative(slot.hasModifier(ModifEnum.NATIVE));
                        dbSlot.setIsOverride(slot.hasModifier(ModifEnum.OVERRIDE));
                        dbSlot.setIsStatic(slot.hasModifier(ModifEnum.STATIC));
                        dbSlot.setIsVirtual(slot.hasModifier(ModifEnum.VIRTUAL));
                        dbSlot.setIsConst(slot.hasModifier(ModifEnum.CONST));
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

    public static boolean checkIfNeedsReindexing(String path, long tstamp) {
        FanSrcFile file = FanSrcFile.findByPath(path);
        if (file == null) {
            return true;
        }
        if (file.getTstamp() < tstamp) {
            return true;
        }
        return false;
    }

    public void indexFantomPods() {
        if (!FanPlatform.isConfigured()) {
            return;
        }
        try {
            String podsDir = FanPlatform.getInstance().getPodsDir();
            File f = new File(podsDir);
            // listen to changes in pod folder
            try {
                FileUtil.addRecursiveListener(this, f);
            } catch (IllegalArgumentException e) {/*already listening*/

            }
            // index the pods if not up to date
            File[] pods = f.listFiles();

            for (File pod : pods) {
                String path = pod.getAbsolutePath();
                if (checkIfNeedsReindexing(path, pod.lastModified())) {
                    requestIndexing(path);
                }
            }
        } catch (Throwable t) {
            log.throwing("Pod indexing thread error", "indexFantomPods", t);
        }
    }

    private void indexPod(String pod) {
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
                log.fine("Indexing Pod Type: " + sig);

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

                // allow for quicker exit on shutdown
                if (shutdown) {
                    break;
                }
            } // end type

            // all went well, set the tstamp - mark as good
            doc.setTstamp(System.currentTimeMillis());

        } catch (Exception e) {
            log.throwing("Indexing failed for: " + pod, "indexPod", e);
        }
    }

//    private int getKind(FType type) {
//        if (hasFlag(type.flags, FConst.Mixin)) {
//            return FanAstScopeVarBase.VarKind.TYPE_MIXIN.value();
//        }
//        if (hasFlag(type.flags, FConst.Enum)) {
//            return FanAstScopeVarBase.VarKind.TYPE_ENUM.value();
//        } // class is default
//        return FanAstScopeVarBase.VarKind.TYPE_CLASS.value();
//    }

    private boolean hasFlag(int flags, int flag) {
        return (flags & flag) != 0;
    }

    public static void shutdown() {
//        FanJarsIndexer.shutdown();
        shutdown = true;
    }

    private int getProtection(int flags) {
        if (hasFlag(flags, FConst.Private)) {
            return ModifEnum.PRIVATE.value();
        }
        if (hasFlag(flags, FConst.Protected)) {
            return ModifEnum.PROTECTED.value();
        }
        if (hasFlag(flags, FConst.Internal)) {
            return ModifEnum.INTERNAL.value();
        } // default is public
        return ModifEnum.PUBLIC.value();
    }

    /**
     * Index a fantom source folder recursively
     *
     * @param root
     * @param nb - nb of files parsed
     * @return
     */
    public int indexSrcFolder(FileObject root, int nb) {
        if (!FanPlatform.isConfigured()) {
            return 0;
        }
        if (!isAllowedIndexing(root)) {
            return nb;
        }
        FileObject[] children = root.getChildren();
        for (FileObject child : children) {
            if (child.isFolder()) {
                //recurse
                nb = indexSrcFolder(child, nb);
            } else {
                if (child.hasExt("fan") || child.hasExt("fwt")) {
                    if (FanIndexer.checkIfNeedsReindexing(child.getPath(), child.lastModified().getTime())) {
                        log.info("ReIndexing: " + root.getPath());
                        nb++;
                        requestIndexing(child.getPath());
                    }
                }
            }
        }
        return nb;
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

    //*********** File listeners ****************************
    public void fileFolderCreated(FileEvent fe) {
        // Listen for changes
        String path = fe.getFile().getPath();
        log.fine("Folder created: " + path);
        FileUtil.addFileChangeListener(this, FileUtil.toFile(fe.getFile()));
    }

    public void fileDataCreated(FileEvent fe) {
        String path = fe.getFile().getPath();
        log.fine("File created: " + path);
        requestIndexing(
                path);
    }

    public void fileChanged(FileEvent fe) {
        String path = fe.getFile().getPath();
        log.fine("File changed: " + path);
        requestIndexing(
                path);
    }

    public void fileDeleted(FileEvent fe) {
        // synced because we don't want to do it at the same time as the thread
        String path = fe.getFile().getPath();
        log.fine("File deleted: " + path);
        toBeDeleted.put(path, new Date().getTime());
    }

    public void fileRenamed(FileRenameEvent fre) {
        // synced because we don't want to do it at the same time as the thread
        FileObject src = (FileObject) fre.getSource();
        log.fine("File renamed: " + src.getPath() + " -> " + fre.getFile().getPath());
        //TODO add this to a hashtable and do it in the thread
        FanSrcFile.renameDoc(src.getPath(), fre.getFile().getPath());
    }

    public void fileAttributeChanged(FileAttributeEvent fae) {
        int bkpt = 0;
        // don't care
    }

    public void waitForEmptyFantomQueue() {
        while (true) {
            if (fanPodsToBeIndexed.size() == 0 && fanSrcToBeIndexed.size() == 0) {
                return;
            }

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * *******************************************************************
     * Indexer Thread class All indexing request should go through here to avoid
     * issues.
     */
    class FanIndexerThread extends Thread implements Runnable {

        @Override
        public void run() {

            while (!shutdown) {
                try {
                    Thread.yield();
                    sleep(100);
                } catch (Exception e) {
                }

                if (!toBeDeleted.isEmpty() || !fanPodsToBeIndexed.isEmpty() || !fanSrcToBeIndexed.isEmpty()) {
                    // Will show a progress bar if it takes more than 5 sec
                    ProgressHandle progressHandle = ProgressHandleFactory.createHandle("Fantom indexing", (Cancellable) null);
                    progressHandle.setInitialDelay(5000);
                    progressHandle.start();
                    Enumeration<String> tbd = toBeDeleted.keys();
                    // to be deleted
                    {
                        while (tbd.hasMoreElements()) {
                            if (shutdown) {
                                return;
                            }
                            String path = tbd.nextElement();

                            FanSrcFile doc = FanSrcFile.findByPath(path);
                            try {
                                if (doc != null) {
                                    progressHandle.progress("De-Indexing: " + path);
                                    doc.delete();
                                }
                            } catch (Exception e) {
                                log.throwing("Error deleting doc", "FanIndexerThread", e);
                            }
                        }
                    }
                    // always do binaries first
                    do {
                        // Usig keys() since it uses a "snapshot"
                        // no concurrentmodif error
                        // also nextElement() should be safe since we only remove elements from within here
                        // elems can be added outside ... but that should be fine.
                        Enumeration<String> it = fanPodsToBeIndexed.keys();
                        while (it.hasMoreElements()) {
                            if (shutdown) {
                                return;
                            }
                            String path = it.nextElement();
                            Long l = fanPodsToBeIndexed.get(path);
                            long now = new Date().getTime();
                            if (l != null && l.longValue() < now - 1000) {
                                fanPodsToBeIndexed.remove(path);
                                progressHandle.progress("Indexing: " + path);
                                indexPod(path);
                            }
                        }
                    } while (!fanPodsToBeIndexed.isEmpty());
                    // then do the sources
                    Enumeration<String> it = fanSrcToBeIndexed.keys();
                    while (it.hasMoreElements()) {
                        if (shutdown) {
                            return;
                        }
                        String path = it.nextElement();
                        Long l = fanSrcToBeIndexed.get(path);
                        // Hasn't changed in a couple seconds
                        long now = new Date().getTime();
                        if (path != null && l != null && l.longValue() < now - 2000) {
                            fanSrcToBeIndexed.remove(path);
                            progressHandle.progress("Indexing: " + path);
                            indexSrc(path);
                        }
                    }
                    progressHandle.finish();
                }
            }
        }
    }

    public static boolean isAllowedIndexing(FileObject srcFile) {
        FileObject fanHome = FanPlatform.getInstance().getFanHome();
        if (fanHome.getPath().equals(srcFile.getPath())
                || FileUtil.isParentOf(fanHome, srcFile)) {
            return false;
        }
        return true;
    }
}
