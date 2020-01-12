package net.colar.netbeans.fan.indexer;

import fan.sys.Env;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.regex.Pattern;
import net.colar.netbeans.fan.FanUtilities;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase.ModifEnum;
import net.colar.netbeans.fan.indexer.model.FanDocument;
import net.colar.netbeans.fan.indexer.model.FanType;
import net.colar.netbeans.fan.platform.FanPlatformSettings;
import net.colar.netbeans.fan.scope.FanAstScopeVarBase;
import net.jot.logger.JOTLoggerLocation;
import net.jot.persistance.JOTSQLCondition;
import net.jot.persistance.builders.JOTQueryBuilder;
import org.netbeans.api.java.platform.JavaPlatform;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
import org.openide.filesystems.FileAttributeEvent;
import org.openide.filesystems.FileChangeListener;
import org.openide.filesystems.FileEvent;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileRenameEvent;
import org.openide.filesystems.FileUtil;
import org.openide.util.Cancellable;

/**
 * Index for Java classes. We only store and types in DB (no slots etc...)
 *
 * We resolve classes on a as-needed basis (lazy cache).
 *
 * Index java jars - used through FanIndexer
 *
 * @author tcolar
 */
public class FanJarsIndexer implements FileChangeListener {

    public static final String UNRESOLVED_TYPE = "!!UNRESOLVED!!";
    private final static Pattern CLOSURECLASS = Pattern.compile(".*?\\$\\d+\\z");
    static JOTLoggerLocation log = new JOTLoggerLocation(FanIndexer.class);
    public static volatile boolean shutdown = false;
    Hashtable<String, Long> toBeIndexed = new Hashtable<String, Long>();
    private FanJavaClassLoader cl;
    // temp.
    private ArrayList<String> classes = new ArrayList<String>();
    // In memory caches
    private List<String> packagesCache = new ArrayList<String>();
    private Hashtable<String, Class> classesCache = new Hashtable<String, Class>();
    String excludes = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_INDEXER_EXCLUDES,
            "sun.;com.sun.;com.apple.;javax.faces.;javax.jms.;javax.ejb.;javax.mail.;javax.net.;javax.xml.;javax.rmi.;javax.swing.;java.awt.;org.xml.;org.omg.;org.w3c.;org.xml.;org.eclipse.swt.");
    boolean indexJava = FanPlatformSettings.getInstance().get(FanPlatformSettings.PREF_INDEXER_EXCLUDES, "false").equals("true");

    public FanJarsIndexer() {
    }

    public void indexJars(boolean runInBackground) {
        if (!indexJava) {
            return;
        }

        // call that fisrt because it fails the first time called (TimeZone exception)
        try {
            Env.cur().homeDir();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        long then = new Date().getTime();
        cl = new FanJavaClassLoader();
        classes.clear();
        FanJarsIndexerThread thread = new FanJarsIndexerThread();
        thread.start();
        if (!runInBackground) {
            thread.waitFor();
        }
        long now = new Date().getTime();
        log.info("Fantom Jars Parsing completed in " + (now - then) + " ms.");
        File extDir = new File(Env.cur().homeDir().osPath(), "lib" + File.separator + "java" + File.separator + "ext");
        //TODO doesn't seem to work right'
        FileUtil.addFileChangeListener(this, extDir);
    }

    private void indexJar(String j) {

        if (j.endsWith("rt.jar")) {
            FanIndexerFactory.getIndexer().warnIfNecessary();
        }

        log.info("Indexing jar: " + j);
        if (j.toLowerCase().endsWith(".jar")) {
            FanDocument doc = null;
            try {
                // create the doc
                doc = FanDocument.findOrCreateOne(null, j);
                if (doc.isNew()) {
                    doc.setPath(j);
                    doc.setTstamp(0L);
                    doc.setIsSource(false);
                    doc.save();
                }
                Vector<FanType> types = FanType.findAllForDoc(null, doc.getId());

                JarFile jar = new JarFile(j);

                Enumeration<JarEntry> jarEntries = jar.entries();
                while (jarEntries.hasMoreElements()) {
                    JarEntry entry = jarEntries.nextElement();
                    String ename = entry.getName();
                    if (ename.toLowerCase().endsWith(".class")) {
                        String cname = ename.substring(0, ename.length() - 6).replace("/", ".").replace("\\", ".");
                        // also not bothering with classes matching exclude pattern
                        boolean excluded = false;
                        for (String exclude : excludes.split(";")) {
                            if (cname.startsWith(exclude)) {
                                excluded = true;
                                break;
                            }
                        }
                        if (excluded) {
                            continue;
                        }

                        // trying to findclass same class twice = no good !
                        if (!classes.contains(cname)) {

                            Class c = null;
                            try {
                                c = findClass(cname);
                            } catch (ClassNotFoundException ce) {
                            }
                            if (c != null && !c.isSynthetic()) {
                                try {
                                    indexClass(doc, c, true);
                                    classes.add(cname);
                                    for (int i = 0; i != types.size(); i++) {
                                        if (types.get(i).getQualifiedName().equals(cname)) {
                                            types.remove(i);
                                        }
                                        break;
                                    }
                                } catch (IncompatibleClassChangeError e) {
                                }
                            }
                        }
                    }
                }
                // remove obsolete type entries
                for (FanType type : types) {
                    type.delete();
                }
                // only mark valid once done.
                doc.setTstamp(new Date().getTime());
                doc.save();
            } catch (Exception e) {
                log.exception("Jar indexing error", e);
                if (doc != null) {
                    try {
                        // Invalidate the doc
                        doc.setTstamp(0L);
                        doc.delete();
                    } catch (Exception e2) {
                    }
                }
            }
        }
        log.info("Done Indexing jar: " + j);
    }

    private Class findClass(String name) throws ClassNotFoundException {
        // Try Fan classloader first (Fan classes)
        Class c = null;
        try {
            c = cl.find(name);
        } catch (NoClassDefFoundError e) {
        } catch (ClassNotFoundException e) {
        } catch (IllegalAccessError e) {
        }
        if (c == null) {
            // try standard class loader (java)
            try {
                c = getClass().getClassLoader().loadClass(name);
            } catch (NoClassDefFoundError e) {
            } catch (ClassNotFoundException e) {
            } catch (IllegalAccessError e) {
            }
        }
        if (c == null) {
            throw (new ClassNotFoundException("Class not found: " + name));
        }
        return c;
    }

    public static void shutdown() {
        shutdown = true;
    }

    //*********** File listeners ****************************
    public void fileFolderCreated(FileEvent fe) {
        // Listen for changes
        String path = fe.getFile().getPath();
        log.debug("Folder created: " + path);
        FileUtil.addFileChangeListener(this, FileUtil.toFile(fe.getFile()));
    }

    //TODO all events, use thread to delete/reindex etc...
    public void fileDataCreated(FileEvent fe) {
        String path = fe.getFile().getPath();
        log.debug("File created: " + path);
        indexJar(
                path);
    }

    public void fileChanged(FileEvent fe) {
        String path = fe.getFile().getPath();
        log.debug("File changed: " + path);
        indexJar(
                path);
    }

    public void fileDeleted(FileEvent fe) {
        String path = fe.getFile().getPath();
        log.debug("File deleted: " + path);
        //TODO: add this to a hashtable and do it in the thread
        // ptherwise might get multithreading issues
        FanDocument doc = FanDocument.findByPath(path);
        try {
            if (doc != null) {
                doc.delete();
            }
        } catch (Exception e) {
            log.exception("Error deleting doc", e);
        }
    }

    public void setExcludes(String str) {
        excludes = str;
    }

    public void fileRenamed(FileRenameEvent fre) {
        // TODO: not sure if that's good
        FileObject src = (FileObject) fre.getSource();
        log.debug("File renamed: " + src.getPath() + " -> " + fre.getFile().getPath());
        FanDocument.renameDoc(src.getPath(), fre.getFile().getPath());
    }

    public void fileAttributeChanged(FileAttributeEvent fae) {
        int bkpt = 0;
        // don't care
    }

    /**
     * Places we are going to look for jars at.
     *
     * @return
     */
    public List<URL> getJarPaths() {
        ArrayList<URL> urls = new ArrayList<URL>();
        // adding Fan jars
        URL[] fanUrls = FanJavaClassLoader.getExtUrls();
        for (URL url : fanUrls) {
            urls.add(url);
        }
        // JVM cp
        String javaHome = JavaPlatform.getDefault().getSystemProperties().get("java.home");
        String lib = javaHome + File.separator + "lib" + File.separator;
        String[] cps = JavaPlatform.getDefault().getSystemProperties().get("sun.boot.class.path").split(File.pathSeparator);
        for (String cp : cps) {
            String f = new File(cp).getName();
            File file = new File(f);
            // skip those large resources jars to save time.
            if (f.equals("deploy.jar") || f.equals("charsets.jar") || f.equals("javaws.jar")) {
                continue;
            } //System.out.println("jbcp: " + cp);
            try {
                urls.add(new URL("file://" + cp));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // use lib/rt.jar as the backup
        if (cps.length == 0) {
            String cp = lib + "rt.jar";
            FanUtilities.GENERIC_LOGGER.debug("jrtcp: " + cp);
            try {
                urls.add(new URL("file://" + cp));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // jvm lib/ext/*
        File[] ext = new File(lib + "ext").listFiles();
        for (File jar : ext) {
            //System.out.println("jecp: " + jar.getAbsolutePath());
            try {
                urls.add(new URL("file://" + jar.getAbsolutePath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return urls;
    }

    private void indexClass(FanDocument doc, Class c, boolean delay) {
        int flags = c.getModifiers();
        // Don't bother with classes not useable from fan
        boolean usable = false;
        if (Modifier.isPublic(flags)
                || Modifier.isProtected(flags)
                || (c.getPackage().getName().startsWith("fan") && !Modifier.isPrivate(flags))) // package private "fan" is ok.
        {
            usable = true;
        }

        if (!usable) {
            return;
        }

        try {
            String pack = c.getPackage().getName();
            String qname = c.getName();
            String name = c.getSimpleName();

            log.info("Indexing class: " + c.getName());

            Vector<FanType> types = FanType.findAllForDoc(null, doc.getId());

            // Skipping "internal" classes - closures and the likes
            // synthetic means generated by compiler
            if (c.isSynthetic() || c.isAnonymousClass() || CLOSURECLASS.matcher(c.getName()).matches()) {
                return;
            }

            JOTSQLCondition cond = new JOTSQLCondition("qualifiedName", JOTSQLCondition.IS_EQUAL, qname);
            FanType dbType = (FanType) JOTQueryBuilder.selectQuery(null, FanType.class).where(cond).findOrCreateOne();
            if (!dbType.isNew()) {
                for (int i = 0; i != types.size(); i++) {
                    FanType t = types.get(i);
                    if (t.getId() == dbType.getId()) {
                        types.remove(i);
                        break;
                    }
                }
            }
            dbType.setBinDocId(doc.getId());
            dbType.setKind(getKind(c));
            dbType.setIsAbstract(Modifier.isAbstract(flags));
            dbType.setIsConst(Modifier.isFinal(flags) && Modifier.isStatic(flags));
            dbType.setIsFinal(Modifier.isFinal(flags));
            dbType.setQualifiedName(qname);
            dbType.setSimpleName(name);
            dbType.setPod(pack);
            dbType.setProtection(getProtection(flags));
            dbType.setIsFromSource(false);

            dbType.save();

            // Try to leave a little cpu for the IDE
            if (delay) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
            }


            // Slots
            // Try to reuse existing db entries.
			/*Vector<FanSlot> currentSlots = FanSlot.findAllForType(dbType.getId());
             Vector<Member> slots = new Vector();
             slots.addAll(Arrays.asList(c.getDeclaredFields()));
             slots.addAll(Arrays.asList(c.getDeclaredMethods()));
             slots.addAll(Arrays.asList(c.getDeclaredConstructors()));
             //slots.addAll(Arrays.asList(c.getDeclaredAnnotations()));
             for (Member slot : slots)
             {
             // determine kind of slot
             FanModelConstants.SlotKind kind = FanModelConstants.SlotKind.FIELD;
             Class<?> retType = null;
             if (slot instanceof Field)
             {
             kind = FanModelConstants.SlotKind.FIELD;
             retType = ((Field) slot).getType();
             } else if (slot instanceof Constructor)
             {
             retType = c.getClass();
             kind = FanModelConstants.SlotKind.CTOR;
             } else if (slot instanceof Method)
             {
             retType = ((Method) slot).getReturnType();
             kind = FanModelConstants.SlotKind.METHOD;
             } else
             {
             throw new RuntimeException("Unexpected Slot kind: " + slot.getClass().getName());
             }

             JOTSQLCondition cond2 = new JOTSQLCondition("typeId", JOTSQLCondition.IS_EQUAL, dbType.getId());
             JOTSQLCondition cond3 = new JOTSQLCondition("name", JOTSQLCondition.IS_EQUAL, slot.getName());
             FanSlot dbSlot = (FanSlot) JOTQueryBuilder.selectQuery(null, FanSlot.class).where(cond2).where(cond3).findOrCreateOne();
             if (!dbSlot.isNew())
             {
             for (int i = 0; i != currentSlots.size(); i++)
             {
             FanSlot s = currentSlots.get(i);
             if (s.getId() == dbSlot.getId())
             {
             currentSlots.remove(i);
             break;
             }
             }
             }
             int sflags = slot.getModifiers();
             dbSlot.setTypeId(dbType.getId());
             dbSlot.setSlotKind(kind.value());
             dbSlot.setReturnedType(retType.getName());
             dbSlot.setName(slot.getName());
             dbSlot.setIsAbstract(Modifier.isAbstract(sflags));
             dbSlot.setIsNative(Modifier.isNative(sflags));
             // N/A
             dbSlot.setIsOverride(false);
             dbSlot.setIsStatic(Modifier.isStatic(sflags));
             // java always true
             dbSlot.setIsVirtual(true);
             dbSlot.setIsConst(Modifier.isStatic(sflags) && Modifier.isFinal(sflags));
             dbSlot.setProtection(getProtection(sflags));
             // java always nullable
             dbSlot.setIsNullable(true);

             dbSlot.save();
             // deal with parameters of method/ctor
             if (slot instanceof Method)
             {

             Method method = (Method) slot;
             TypeVariable<Method>[] parameters = method.getTypeParameters();
             // Try to reuse existing db entries.
             Vector<FanMethodParam> currentParams = FanMethodParam.findAllForSlot(dbSlot.getId());
             for (TypeVariable<Method> param : parameters)
             {
             JOTSQLCondition cond4 = new JOTSQLCondition("slotId", JOTSQLCondition.IS_EQUAL, dbSlot.getId());
             FanMethodParam dbParam = (FanMethodParam) JOTQueryBuilder.selectQuery(null, FanMethodParam.class).where(cond4).findOrCreateOne();
             if (!dbParam.isNew())
             {
             for (int i = 0; i != currentParams.size(); i++)
             {
             FanMethodParam p = currentParams.get(i);
             if (p.getId() == dbParam.getId())
             {
             currentParams.remove(i);
             break;
             }
             }
             }
             dbParam.setSlotId(dbSlot.getId());
             dbParam.setName(param.getName());
             dbParam.setQualifiedType((param.getBounds()[0]).toString());
             // always true for java
             dbParam.setIsNullable(true);
             // always false for java
             dbParam.setHasDefault(false);

             dbParam.save();

             } // end param loop
             // Whatever param wasn't removed from the vector is not needed anymore.
             for (FanMethodParam param : currentParams)
             {
             param.delete();
             }
             }
             } // end slot loop
             // Whatever slot wasn't removed from the vector is not needed anymore.
             for (FanSlot s : currentSlots)
             {
             s.delete();
             }
             */
        } catch (Exception e) {
            log.exception("Indexing failed for: " + c, e);
            try {
                // remove broken enrty, will try again next time
                if (doc != null) {
                    doc.delete();
                }
            } catch (Exception e2) {
                log.exception("Indexing 'rollback' failed for: " + c, e);
            }
        } catch (NoClassDefFoundError ncdf) {
            log.error("Indexing failed(NCDF) for: " + c);
        } finally {
            // cache is dirty.
            packagesCache.clear();
            classesCache.clear();
        }
    }

    private int getKind(Class c) {
        if (c.isInterface()) {
            return FanAstScopeVarBase.VarKind.TYPE_JAVA_INTERFACE.value();
        }
        if (c.isAnnotation()) {
            return FanAstScopeVarBase.VarKind.TYPE_JAVA_ANNOTATION.value();
        }
        if (c.isEnum()) {
            return FanAstScopeVarBase.VarKind.TYPE_JAVA_ENUM.value();
        }
        // class is default
        return FanAstScopeVarBase.VarKind.TYPE_JAVA_CLASS.value();
    }

    private int getProtection(int flags) {
        if (Modifier.isPrivate(flags)) {
            return ModifEnum.PRIVATE.value();
        }
        if (Modifier.isProtected(flags)) {
            return ModifEnum.PROTECTED.value();
        }
        if (Modifier.isPublic(flags)) {
            return ModifEnum.PUBLIC.value();
        }
        // default is package private
        return ModifEnum.INTERNAL.value();
    }

    public List<String> listSubPackages(String base) {
        base = base.toLowerCase();
        readPackages();
        List<String> results = new ArrayList<String>();
        for (String pack : packagesCache) {
            if (pack.toLowerCase().startsWith(base)) {
                results.add(pack);
            }
        }
        return results;
    }

    public void readPackages() {
        if (packagesCache.isEmpty()) {
            packagesCache = FanType.findAllPackagesNames();
        }
    }

    public List<String> listTypes(String pack, String prefix) {
        readPackages();
        if (pack != null && !packagesCache.contains(pack)) {
            return Collections.emptyList();
        }
        Vector<FanType> types = FanType.findPodTypes(pack, prefix);
        ArrayList<String> items = new ArrayList<String>();
        for (FanType type : types) {
            items.add(type.simpleName);
        }
        return items;
    }

    public List<Member> findTypeSlots(String qualifiedType) {
        List<Member> slots = new ArrayList<Member>();
        if (!classesCache.containsKey(qualifiedType)) {
            try {
                Class c = cl.loadClass(qualifiedType);
                classesCache.put(qualifiedType, c);
            } catch (ClassNotFoundException e) {
                log.info("ClassNotFound: " + qualifiedType);
            }
        }
        Class c = classesCache.get(qualifiedType);
        if (c != null) {
            slots.addAll(Arrays.asList(c.getConstructors()));
            slots.addAll(Arrays.asList(c.getMethods()));
            slots.addAll(Arrays.asList(c.getFields()));
            //c.getDeclaredAnnotations();
        }
        return slots;
    }

    public String getReturnType(Member member) {
        if (member instanceof Constructor) {
            return member.getClass().getName();
        }
        if (member instanceof Method) {
            return ((Method) member).getReturnType().getName();
        }
        if (member instanceof Field) {
            return ((Field) member).getType().getName();
        }
        return FanIndexer.UNRESOLVED_TYPE;
    }

    /**
     * *******************************************************************
     * Indexer Thread class
     */
    class FanJarsIndexerThread extends Thread implements Runnable {

        volatile boolean done = false;

        @Override
        public void run() {
            done = false;
            try {
                if (!getJarPaths().isEmpty()) {
                    ProgressHandle progressHandle = ProgressHandleFactory.createHandle("Fantom java indexing", (Cancellable) null);
                    progressHandle.setInitialDelay(5000);
                    progressHandle.start();

                    for (URL url : getJarPaths()) {
                        if (shutdown) {
                            break;
                        }
                        String file = url.getFile();
                        progressHandle.progress("Indexing: " + file);
                        if (file.toLowerCase().endsWith(".jar")) {
                            // boot clasppath lists sme jars that do not necerally exists (optional)
                            File jar = new File(file);
                            if (jar.exists()) {
                                FanUtilities.GENERIC_LOGGER.debug("Indexing jar:  " + jar);
                                // listen to changes
                                FileUtil.addFileChangeListener(FanJarsIndexer.this, FileUtil.normalizeFile(jar));
                                // index the pods if not up to date
                                String path = jar.getAbsolutePath();
                                if (FanIndexer.checkIfNeedsReindexing(path, jar.lastModified())) {
                                    indexJar(path);
                                }
                            }
                        }
                        yield();
                    }
                    progressHandle.finish();
                }
            } catch (Throwable t) {
                log.exception("Pod indexing thread error", t);
            }
            done = true;
        }

        protected void waitFor() {
            while (!done && !shutdown) {
                try {
                    sleep(250);
                    yield();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
