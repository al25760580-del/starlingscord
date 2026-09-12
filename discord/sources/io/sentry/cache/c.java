package io.sentry.cache;

import a5.l0;
import gc.o;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.k1;
import io.sentry.c1;
import io.sentry.g6;
import io.sentry.h6;
import io.sentry.hints.i;
import io.sentry.hints.j;
import io.sentry.i4;
import io.sentry.l4;
import io.sentry.p4;
import io.sentry.r;
import io.sentry.s6;
import io.sentry.w4;
import io.sentry.w5;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import ls.l;

/* JADX INFO: loaded from: classes3.dex */
public class c implements d {
    public static final Charset F = Charset.forName("UTF-8");
    public static final /* synthetic */ int G = 0;
    public final io.sentry.util.a E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5 f12530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.util.e f12531e = new io.sentry.util.e(new o(22, this));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final File f12532i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f12533v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CountDownLatch f12534w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final WeakHashMap f12535x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final io.sentry.util.a f12536y;

    public c(w5 w5Var, String str, int i7) {
        com.facebook.imagepipeline.nativecode.c.H(w5Var, "SentryOptions is required.");
        this.f12530d = w5Var;
        this.f12532i = new File(str);
        this.f12533v = i7;
        this.f12535x = new WeakHashMap();
        this.f12536y = new io.sentry.util.a();
        this.E = new io.sentry.util.a();
        this.f12534w = new CountDownLatch(1);
    }

    @Override // io.sentry.cache.d
    public final void Q(e4.c cVar) {
        com.facebook.imagepipeline.nativecode.c.H(cVar, "Envelope is required.");
        File fileB = b(cVar);
        boolean zDelete = fileB.delete();
        w5 w5Var = this.f12530d;
        if (zDelete) {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Discarding envelope from cache: %s", fileB.getAbsolutePath());
        } else {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Envelope was not cached or could not be deleted: %s", fileB.getAbsolutePath());
        }
    }

    public final File[] a() {
        File file = this.f12532i;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.f12530d.getLogger().q(SentryLevel.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File b(e4.c cVar) {
        String str;
        WeakHashMap weakHashMap = this.f12535x;
        r rVarA = this.f12536y.a();
        try {
            if (weakHashMap.containsKey(cVar)) {
                str = (String) weakHashMap.get(cVar);
            } else {
                String strConcat = l.r().concat(".envelope");
                weakHashMap.put(cVar, strConcat);
                str = strConcat;
            }
            File file = new File(this.f12532i.getAbsolutePath(), str);
            rVarA.close();
            return file;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void d(File file, File file2) {
        r rVarA = this.E.a();
        try {
            if (!file.exists()) {
                rVarA.close();
                return;
            }
            boolean zExists = file2.exists();
            w5 w5Var = this.f12530d;
            if (zExists) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    w5Var.getLogger().q(SentryLevel.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            w5Var.getLogger().q(SentryLevel.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    w5Var.getLogger().q(SentryLevel.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th2) {
                w5Var.getLogger().g(SentryLevel.ERROR, "Error moving current session to previous session.", th2);
            }
            rVarA.close();
        } catch (Throwable th3) {
            try {
                rVarA.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final e4.c e(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                e4.c cVarE = ((c1) this.f12531e.a()).e(bufferedInputStream);
                bufferedInputStream.close();
                return cVarE;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            this.f12530d.getLogger().g(SentryLevel.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    public final h6 h(p4 p4Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p4Var.f()), F));
            try {
                h6 h6Var = (h6) ((c1) this.f12531e.a()).d(bufferedReader, h6.class);
                bufferedReader.close();
                return h6Var;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            this.f12530d.getLogger().g(SentryLevel.ERROR, "Failed to deserialize the session.", th4);
            return null;
        }
    }

    public final boolean i() {
        w5 w5Var = this.f12530d;
        try {
            return this.f12534w.await(w5Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            w5Var.getLogger().q(SentryLevel.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        w5 w5Var = this.f12530d;
        File[] fileArrA = a();
        ArrayList arrayList = new ArrayList(fileArrA.length);
        for (File file : fileArrA) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((c1) this.f12531e.a()).e(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                w5Var.getLogger().g(SentryLevel.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e10);
            }
        }
        return arrayList.iterator();
    }

    public final void j(File file, h6 h6Var) {
        String str = h6Var.f12720w;
        w5 w5Var = this.f12530d;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, F));
                try {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((c1) this.f12531e.a()).b(h6Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            w5Var.getLogger().e(SentryLevel.ERROR, th6, "Error writing Session to offline storage: %s", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059 A[EDGE_INSN: B:13:0x0059->B:107:0x021a BREAK  A[LOOP:2: B:40:0x00b5->B:106:0x020b], PHI: r4 r6 r8 r15
      0x0059: PHI (r4v29 java.io.File[]) = 
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v28 java.io.File[])
      (r4v32 java.io.File[])
     binds: [B:10:0x0049, B:12:0x0057, B:25:0x0091, B:32:0x00a5, B:35:0x00aa, B:37:0x00b0, B:297:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r6v22 io.sentry.util.e) = 
      (r6v21 io.sentry.util.e)
      (r6v21 io.sentry.util.e)
      (r6v21 io.sentry.util.e)
      (r6v21 io.sentry.util.e)
      (r6v21 io.sentry.util.e)
      (r6v21 io.sentry.util.e)
      (r6v24 io.sentry.util.e)
     binds: [B:10:0x0049, B:12:0x0057, B:25:0x0091, B:32:0x00a5, B:35:0x00aa, B:37:0x00b0, B:297:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r8v5 io.sentry.w5) = 
      (r8v4 io.sentry.w5)
      (r8v4 io.sentry.w5)
      (r8v4 io.sentry.w5)
      (r8v4 io.sentry.w5)
      (r8v4 io.sentry.w5)
      (r8v4 io.sentry.w5)
      (r8v7 io.sentry.w5)
     binds: [B:10:0x0049, B:12:0x0057, B:25:0x0091, B:32:0x00a5, B:35:0x00aa, B:37:0x00b0, B:297:0x0059] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r15v20 ??) = (r15v21 ??), (r15v23 ??), (r15v25 ??), (r15v26 ??), (r15v26 ??), (r15v26 ??), (r15v28 ??) binds: [B:10:0x0049, B:12:0x0057, B:25:0x0091, B:32:0x00a5, B:35:0x00aa, B:37:0x00b0, B:297:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:179:0x0398  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e0 A[Catch: all -> 0x03f0, TryCatch #9 {all -> 0x03f0, blocks: (B:184:0x03d2, B:186:0x03e0, B:189:0x03f3), top: B:270:0x03d2, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x03f3 A[Catch: all -> 0x03f0, TRY_LEAVE, TryCatch #9 {all -> 0x03f0, blocks: (B:184:0x03d2, B:186:0x03e0, B:189:0x03f3), top: B:270:0x03d2, outer: #18 }] */
    /* JADX WARN: Code duplicated, block: B:200:0x0411  */
    /* JADX WARN: Code duplicated, block: B:201:0x0421  */
    /* JADX WARN: Code duplicated, block: B:204:0x0445  */
    /* JADX WARN: Code duplicated, block: B:206:0x0454  */
    /* JADX WARN: Code duplicated, block: B:208:0x0468  */
    /* JADX WARN: Code duplicated, block: B:210:0x047d  */
    /* JADX WARN: Code duplicated, block: B:212:0x0489  */
    /* JADX WARN: Code duplicated, block: B:215:0x0494  */
    /* JADX WARN: Code duplicated, block: B:216:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:218:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:220:0x04da  */
    /* JADX WARN: Code duplicated, block: B:237:0x052d  */
    /* JADX WARN: Code duplicated, block: B:283:0x03bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26, types: [io.sentry.g6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v30, types: [io.sentry.w4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r5v7, types: [io.sentry.i4] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [io.sentry.g6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v28, types: [io.sentry.w4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.cache.d
    public boolean n(e4.c cVar, Hint hint) {
        ?? r15;
        ?? r16;
        Throwable th2;
        boolean z5;
        Date dateZ;
        boolean z6;
        boolean z7;
        File fileB;
        SentryLevel sentryLevel;
        ?? r7;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Iterable iterable;
        boolean zExists;
        ?? r5;
        File file;
        p4 p4Var;
        w4 w4Var;
        w4 w4Var2;
        BufferedReader bufferedReader;
        h6 h6Var;
        File[] fileArr;
        h6 h6VarH;
        Boolean bool;
        String str;
        int i7;
        p4 p4VarD;
        h6 h6VarH2;
        boolean zEquals;
        com.facebook.imagepipeline.nativecode.c.H(cVar, "Envelope is required.");
        File[] fileArrA = a();
        int length = fileArrA.length;
        io.sentry.util.e eVar = this.f12531e;
        boolean z10 = false;
        w5 w5Var = this.f12530d;
        int i10 = this.f12533v;
        if (length >= i10) {
            w5Var.getLogger().q(SentryLevel.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i11 = (length - i10) + 1;
            if (fileArrA.length > 1) {
                Arrays.sort(fileArrA, new cl.b(21));
            }
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArrA, i11, length);
            int i12 = 0;
            while (i12 < i11) {
                File file2 = fileArrA[i12];
                e4.c cVarE = e(file2);
                if (cVarE == null) {
                    fileArr = fileArrA;
                    eVar = eVar;
                    w5Var = w5Var;
                    r16 = r16;
                    break;
                }
                r16 = (Iterable) cVarE.f7967i;
                if (!r16.iterator().hasNext()) {
                    fileArr = fileArrA;
                    eVar = eVar;
                    w5Var = w5Var;
                    r16 = r16;
                    break;
                }
                w5Var.getClientReportRecorder().k(io.sentry.clientreport.d.CACHE_OVERFLOW, cVarE);
                Iterator it = r16.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        h6VarH = null;
                        r16 = r16;
                        break;
                    }
                    p4 p4Var2 = (p4) it.next();
                    if (p4Var2 == null) {
                        zEquals = z10;
                    } else {
                        ?? r10 = p4Var2.f12887a.f13085w;
                        r16 = w4.Session;
                        zEquals = r10.equals(r16);
                    }
                    if (zEquals) {
                        h6VarH = h(p4Var2);
                        r16 = r16;
                        break;
                    }
                }
                if (h6VarH == null) {
                    fileArr = fileArrA;
                    eVar = eVar;
                    w5Var = w5Var;
                    r16 = r16;
                    break;
                }
                String str2 = h6VarH.f12720w;
                ?? r11 = h6VarH.f12722y;
                r16 = g6.Ok;
                if (!((r11.equals(r16) && str2 != null) ? true : z10) || (bool = h6VarH.f12721x) == null || !bool.booleanValue()) {
                    fileArr = fileArrA;
                    eVar = eVar;
                    w5Var = w5Var;
                    r16 = r16;
                    break;
                }
                int length2 = fileArr2.length;
                r16 = z10;
                while (true) {
                    if (r16 >= length2) {
                        fileArr = fileArrA;
                        eVar = eVar;
                        w5Var = w5Var;
                        r16 = r16;
                        break;
                    }
                    File file3 = fileArr2[r16];
                    fileArr = fileArrA;
                    e4.c cVarE2 = e(file3);
                    if (cVarE2 != null) {
                        Iterable iterable2 = (Iterable) cVarE2.f7967i;
                        if (iterable2.iterator().hasNext()) {
                            Iterator it2 = iterable2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    str = str2;
                                    eVar = eVar;
                                    w5Var = w5Var;
                                    i7 = length2;
                                    p4VarD = null;
                                    break;
                                }
                                it2 = it2;
                                p4 p4Var3 = (p4) it2.next();
                                if ((p4Var3 == null ? false : p4Var3.f12887a.f13085w.equals(w4.Session)) && (h6VarH2 = h(p4Var3)) != null) {
                                    String str3 = h6VarH2.f12720w;
                                    i7 = length2;
                                    if (h6VarH2.f12722y.equals(g6.Ok) && str3 != null) {
                                        Boolean bool2 = h6VarH2.f12721x;
                                        if (bool2 != null && bool2.booleanValue()) {
                                            w5Var.getLogger().q(SentryLevel.ERROR, "Session %s has 2 times the init flag.", str2);
                                            r16 = r16;
                                            break;
                                        }
                                        if (str2 == null || !str2.equals(str3)) {
                                            length2 = i7;
                                            str2 = str2;
                                        } else {
                                            h6VarH2.f12721x = Boolean.TRUE;
                                            try {
                                                p4VarD = p4.d((c1) eVar.a(), h6VarH2);
                                                try {
                                                    it2.remove();
                                                    str = str2;
                                                    break;
                                                } catch (IOException e10) {
                                                    e = e10;
                                                    str = str2;
                                                    w5Var.getLogger().e(SentryLevel.ERROR, e, "Failed to create new envelope item for the session %s", str);
                                                    p4VarD = p4VarD;
                                                    break;
                                                }
                                            } catch (IOException e11) {
                                                e = e11;
                                                p4VarD = null;
                                            }
                                        }
                                    } else {
                                        length2 = i7;
                                    }
                                }
                            }
                            if (p4VarD != null) {
                                ArrayList arrayList = new ArrayList();
                                Iterator it3 = iterable2.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add((p4) it3.next());
                                }
                                arrayList.add(p4VarD);
                                e4.c cVar2 = new e4.c((l4) cVarE2.f7966e, arrayList);
                                long jLastModified = file3.lastModified();
                                if (!file3.delete()) {
                                    w5Var.getLogger().q(SentryLevel.WARNING, "File can't be deleted: %s", file3.getAbsolutePath());
                                }
                                try {
                                    FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                                    try {
                                        ((c1) eVar.a()).a(cVar2, fileOutputStream3);
                                        file3.setLastModified(jLastModified);
                                        fileOutputStream3.close();
                                        r16 = r16;
                                        break;
                                    } catch (Throwable th3) {
                                        try {
                                            fileOutputStream3.close();
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                        }
                                        throw th3;
                                    }
                                } catch (Throwable th5) {
                                    w5Var.getLogger().g(SentryLevel.ERROR, "Failed to serialize the new envelope to the disk.", th5);
                                    r16 = r16;
                                    break;
                                }
                            }
                        } else {
                            str = str2;
                            eVar = eVar;
                            w5Var = w5Var;
                            i7 = length2;
                        }
                    } else {
                        str = str2;
                        eVar = eVar;
                        w5Var = w5Var;
                        i7 = length2;
                    }
                    fileArrA = fileArr;
                    eVar = eVar;
                    w5Var = w5Var;
                    length2 = i7;
                    str2 = str;
                    r16++;
                }
                if (!file2.delete()) {
                    w5Var.getLogger().q(SentryLevel.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                }
                i12++;
                fileArrA = fileArr;
                eVar = eVar;
                w5Var = w5Var;
                z10 = false;
            }
        }
        io.sentry.util.e eVar2 = eVar;
        w5 w5Var2 = w5Var;
        File file4 = this.f12532i;
        File file5 = new File(file4.getAbsolutePath(), "session.json");
        File file6 = new File(file4.getAbsolutePath(), "previous_session.json");
        if (l0.E(hint, i.class) && !file5.delete()) {
            w5Var2.getLogger().q(SentryLevel.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        boolean zIsInstance = io.sentry.hints.a.class.isInstance(hint.b("sentry:typeCheckHint"));
        Charset charset = F;
        if (zIsInstance || io.sentry.hints.g.class.isInstance(hint.b("sentry:typeCheckHint"))) {
            Object objB = hint.b("sentry:typeCheckHint");
            File file7 = new File(file4.getAbsolutePath(), "previous_session.json");
            if (file7.exists()) {
                ILogger logger = w5Var2.getLogger();
                SentryLevel sentryLevel2 = SentryLevel.WARNING;
                logger.q(sentryLevel2, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(file7), charset));
                        try {
                            h6 h6Var2 = (h6) ((c1) eVar2.a()).d(bufferedReader2, h6.class);
                            if (h6Var2 != null) {
                                try {
                                    if (objB instanceof io.sentry.hints.a) {
                                        try {
                                            io.sentry.hints.a aVar = (io.sentry.hints.a) objB;
                                            Long lA = aVar.a();
                                            if (lA != null) {
                                                dateZ = io.sentry.config.a.z(lA.longValue());
                                                Date dateC = h6Var2.c();
                                                if (dateC != null) {
                                                    if (dateZ.before(dateC)) {
                                                    }
                                                }
                                                w5Var2.getLogger().q(sentryLevel2, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                                bufferedReader2.close();
                                                r15 = 1;
                                            } else {
                                                dateZ = null;
                                            }
                                            h6Var2.d(g6.Abnormal, null, true, aVar.c());
                                            z6 = true;
                                        } catch (Throwable th6) {
                                            th2 = th6;
                                            r16 = 1;
                                            try {
                                                bufferedReader2.close();
                                                throw th2;
                                            } catch (Throwable th7) {
                                                th2.addSuppressed(th7);
                                                throw th2;
                                            }
                                        }
                                    } else if (objB instanceof io.sentry.hints.g) {
                                        Date dateZ2 = io.sentry.config.a.z(((k1) ((io.sentry.hints.g) objB)).f12342v);
                                        Date dateC2 = h6Var2.c();
                                        if (dateC2 == null || dateZ2.before(dateC2)) {
                                            z5 = true;
                                            w5Var2.getLogger().q(sentryLevel2, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                        } else {
                                            z6 = true;
                                            h6Var2.d(g6.Crashed, null, true, null);
                                            dateZ = dateZ2;
                                        }
                                    } else {
                                        z6 = true;
                                        dateZ = null;
                                    }
                                    h6Var2.b(dateZ);
                                    j(file7, h6Var2);
                                    z5 = z6;
                                } catch (Throwable th8) {
                                    th = th8;
                                    th2 = th;
                                    r16 = r16;
                                    bufferedReader2.close();
                                    throw th2;
                                }
                            } else {
                                z5 = true;
                            }
                            bufferedReader2.close();
                            r15 = z5;
                        } catch (Throwable th9) {
                            th = th9;
                            r16 = 1;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        r16 = 1;
                        w5Var2.getLogger().g(SentryLevel.ERROR, "Error processing previous session.", th);
                        r15 = r16;
                    }
                } catch (Throwable th11) {
                    th = th11;
                    w5Var2.getLogger().g(SentryLevel.ERROR, "Error processing previous session.", th);
                    r15 = r16;
                    if (j.class.isInstance(hint.b("sentry:typeCheckHint"))) {
                        d(file5, file6);
                        iterable = (Iterable) cVar.f7967i;
                        if (iterable.iterator().hasNext()) {
                            p4Var = (p4) iterable.iterator().next();
                            w4Var = w4.Session;
                            w4Var2 = p4Var.f12887a.f13085w;
                            if (w4Var.equals(w4Var2)) {
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p4Var.f()), charset));
                                    try {
                                        h6Var = (h6) ((c1) eVar2.a()).d(bufferedReader, h6.class);
                                        if (h6Var == null) {
                                            w5Var2.getLogger().q(SentryLevel.ERROR, "Item of type %s returned null by the parser.", w4Var2);
                                        } else {
                                            j(file5, h6Var);
                                        }
                                        bufferedReader.close();
                                    } catch (Throwable th12) {
                                        try {
                                            bufferedReader.close();
                                            throw th12;
                                        } catch (Throwable th13) {
                                            th12.addSuppressed(th13);
                                            throw th12;
                                        }
                                    }
                                } catch (Throwable th14) {
                                    w5Var2.getLogger().g(SentryLevel.ERROR, "Item failed to process.", th14);
                                }
                            } else {
                                w5Var2.getLogger().q(SentryLevel.INFO, "Current envelope has a different envelope type %s", w4Var2);
                            }
                        } else {
                            w5Var2.getLogger().q(SentryLevel.INFO, "Current envelope %s is empty", file5.getAbsolutePath());
                        }
                        zExists = new File(w5Var2.getCacheDirPath(), ".sentry-native/last_crash").exists();
                        if (zExists) {
                            z7 = false;
                            r5 = zExists;
                        } else {
                            file = new File(w5Var2.getCacheDirPath(), "last_crash");
                            if (file.exists()) {
                                z7 = false;
                                w5Var2.getLogger().q(SentryLevel.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                                if (!file.delete()) {
                                    w5Var2.getLogger().q(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                                }
                                r5 = r15;
                            } else {
                                z7 = false;
                                r5 = zExists;
                            }
                        }
                        i4.f12740d.a(r5);
                        this.f12534w.countDown();
                    } else {
                        z7 = false;
                    }
                    fileB = b(cVar);
                    if (fileB.exists()) {
                        w5Var2.getLogger().q(SentryLevel.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileB.getAbsolutePath());
                        return r15;
                    }
                    ILogger logger2 = w5Var2.getLogger();
                    sentryLevel = SentryLevel.DEBUG;
                    logger2.q(sentryLevel, "Adding Envelope to offline storage: %s", fileB.getAbsolutePath());
                    if (fileB.exists()) {
                        w5Var2.getLogger().q(sentryLevel, "Overwriting envelope to offline storage: %s", fileB.getAbsolutePath());
                        if (!fileB.delete()) {
                            w5Var2.getLogger().q(SentryLevel.ERROR, "Failed to delete: %s", fileB.getAbsolutePath());
                        }
                    }
                    try {
                        fileOutputStream2 = new FileOutputStream(fileB);
                        try {
                            ((c1) eVar2.a()).a(cVar, fileOutputStream2);
                            fileOutputStream2.close();
                            r7 = r15;
                            if (s6.class.isInstance(hint.b("sentry:typeCheckHint"))) {
                                try {
                                    fileOutputStream = new FileOutputStream(new File(w5Var2.getCacheDirPath(), "last_crash"));
                                    try {
                                        fileOutputStream.write(io.sentry.config.a.G(io.sentry.config.a.y()).getBytes(charset));
                                        fileOutputStream.flush();
                                        fileOutputStream.close();
                                    } catch (Throwable th15) {
                                        try {
                                            fileOutputStream.close();
                                            throw th15;
                                        } catch (Throwable th16) {
                                            th15.addSuppressed(th16);
                                            throw th15;
                                        }
                                    }
                                } catch (Throwable th17) {
                                    w5Var2.getLogger().g(SentryLevel.ERROR, "Error writing the crash marker file to the disk", th17);
                                }
                            }
                            return r7;
                        } catch (Throwable th18) {
                            try {
                                fileOutputStream2.close();
                                throw th18;
                            } catch (Throwable th19) {
                                th18.addSuppressed(th19);
                                throw th18;
                            }
                        }
                    } catch (Throwable th20) {
                        w5Var2.getLogger().e(SentryLevel.ERROR, th20, "Error writing Envelope %s to offline storage", fileB.getAbsolutePath());
                        r7 = z7;
                    }
                }
            } else {
                r15 = 1;
                w5Var2.getLogger().q(SentryLevel.DEBUG, "No previous session file to end.", new Object[0]);
            }
        } else {
            r15 = 1;
        }
        if (j.class.isInstance(hint.b("sentry:typeCheckHint"))) {
            d(file5, file6);
            iterable = (Iterable) cVar.f7967i;
            if (iterable.iterator().hasNext()) {
                p4Var = (p4) iterable.iterator().next();
                w4Var = w4.Session;
                w4Var2 = p4Var.f12887a.f13085w;
                if (w4Var.equals(w4Var2)) {
                    bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p4Var.f()), charset));
                    h6Var = (h6) ((c1) eVar2.a()).d(bufferedReader, h6.class);
                    if (h6Var == null) {
                        w5Var2.getLogger().q(SentryLevel.ERROR, "Item of type %s returned null by the parser.", w4Var2);
                    } else {
                        j(file5, h6Var);
                    }
                    bufferedReader.close();
                } else {
                    w5Var2.getLogger().q(SentryLevel.INFO, "Current envelope has a different envelope type %s", w4Var2);
                }
            } else {
                w5Var2.getLogger().q(SentryLevel.INFO, "Current envelope %s is empty", file5.getAbsolutePath());
            }
            zExists = new File(w5Var2.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (zExists) {
                file = new File(w5Var2.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    z7 = false;
                    w5Var2.getLogger().q(SentryLevel.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        w5Var2.getLogger().q(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    r5 = r15;
                } else {
                    z7 = false;
                    r5 = zExists;
                }
            } else {
                z7 = false;
                r5 = zExists;
            }
            i4.f12740d.a(r5);
            this.f12534w.countDown();
        } else {
            z7 = false;
        }
        fileB = b(cVar);
        if (fileB.exists()) {
            w5Var2.getLogger().q(SentryLevel.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileB.getAbsolutePath());
            return r15;
        }
        ILogger logger3 = w5Var2.getLogger();
        sentryLevel = SentryLevel.DEBUG;
        logger3.q(sentryLevel, "Adding Envelope to offline storage: %s", fileB.getAbsolutePath());
        if (fileB.exists()) {
            w5Var2.getLogger().q(sentryLevel, "Overwriting envelope to offline storage: %s", fileB.getAbsolutePath());
            if (!fileB.delete()) {
                w5Var2.getLogger().q(SentryLevel.ERROR, "Failed to delete: %s", fileB.getAbsolutePath());
            }
        }
        fileOutputStream2 = new FileOutputStream(fileB);
        ((c1) eVar2.a()).a(cVar, fileOutputStream2);
        fileOutputStream2.close();
        r7 = r15;
        if (s6.class.isInstance(hint.b("sentry:typeCheckHint"))) {
            fileOutputStream = new FileOutputStream(new File(w5Var2.getCacheDirPath(), "last_crash"));
            fileOutputStream.write(io.sentry.config.a.G(io.sentry.config.a.y()).getBytes(charset));
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        return r7;
    }
}
