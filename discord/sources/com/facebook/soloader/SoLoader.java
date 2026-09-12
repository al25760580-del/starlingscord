package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes3.dex */
public class SoLoader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i8.c f5364b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static int f5373m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ReentrantReadWriteLock f5365c = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Context f5366d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile b0[] f5367e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicInteger f5368f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static kb.a f5369g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f5370h = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashMap f5371i = new HashMap();
    public static final Set j = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final HashMap k = new HashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f5372l = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f5374n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static m f5375o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f5363a = true;

    public static void a(int i7, ArrayList arrayList) {
        a aVar = new a(f5366d, i7);
        r.b("Adding application source: " + aVar.toString());
        arrayList.add(0, aVar);
    }

    public static void b(ArrayList arrayList) {
        String strK = SysUtil$MarshmallowSysdeps.is64Bit() ? "/system/lib64:/vendor/lib64" : "/system/lib:/vendor/lib";
        String str = System.getenv("LD_LIBRARY_PATH");
        if (str != null && !str.equals("")) {
            strK = kk.b.k(str, ":", strK);
        }
        for (String str2 : new HashSet(Arrays.asList(strK.split(":")))) {
            r.b("adding system library source: " + str2);
            arrayList.add(new e(new File(str2), 2));
        }
    }

    public static void c(String str, String str2, int i7, StrictMode.ThreadPolicy threadPolicy) {
        boolean z5;
        ReentrantReadWriteLock reentrantReadWriteLock = f5365c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f5367e == null) {
                Log.e("SoLoader", "Could not load: " + str + " because SoLoader is not initialized");
                throw new UnsatisfiedLinkError("SoLoader not initialized, couldn't find DSO to load: " + str);
            }
            reentrantReadWriteLock.readLock().unlock();
            if (threadPolicy == null) {
                threadPolicy = StrictMode.allowThreadDiskReads();
                z5 = true;
            } else {
                z5 = false;
            }
            if (f5363a) {
                if (str2 != null) {
                    Api18TraceUtils.a("SoLoader.loadLibrary[", str2, "]");
                }
                Api18TraceUtils.a("SoLoader.loadLibrary[", str, "]");
            }
            try {
                reentrantReadWriteLock.readLock().lock();
                try {
                    try {
                        for (b0 b0Var : f5367e) {
                            if (q(b0Var, str, i7, threadPolicy)) {
                                f5365c.readLock().unlock();
                                if (f5363a) {
                                    if (str2 != null) {
                                        Trace.endSection();
                                    }
                                    Trace.endSection();
                                }
                                if (z5) {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    return;
                                }
                                return;
                            }
                        }
                        throw z.a(str, f5366d, f5367e);
                    } catch (IOException e10) {
                        a0 a0Var = new a0(str, e10.toString());
                        a0Var.initCause(e10);
                        throw a0Var;
                    }
                } catch (Throwable th2) {
                    f5365c.readLock().unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                if (f5363a) {
                    if (str2 != null) {
                        Trace.endSection();
                    }
                    Trace.endSection();
                }
                if (z5) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                throw th3;
            }
        } catch (Throwable th4) {
            f5365c.readLock().unlock();
            throw th4;
        }
    }

    public static int d(Context context) {
        int i7 = f5374n;
        if (i7 != 0) {
            return i7;
        }
        int i10 = 1;
        if (context == null) {
            r.b("context is null, fallback to THIRD_PARTY_APP appType");
            return 1;
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.flags;
        if ((i11 & 1) != 0) {
            i10 = (i11 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? 3 : 2;
        }
        r.b("ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i10);
        return i10;
    }

    public static synchronized a5.b0 e() {
        kb.a aVar;
        aVar = f5369g;
        return aVar == null ? null : aVar.a();
    }

    public static void f(Context context, int i7) {
        if (k()) {
            Log.w("SoLoader", "SoLoader already initialized");
            return;
        }
        Log.w("SoLoader", "Initializing SoLoader: " + i7);
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            boolean zH = h(context);
            f5372l = zH;
            if (zH) {
                int iD = d(context);
                f5374n = iD;
                if ((i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                    if (iD == 2 || (context != null && (context.getApplicationInfo().flags & 268435456) == 0)) {
                        i7 |= 8;
                    }
                }
                i(context, i7);
                j(context, i7);
                r.h("SoLoader", "Init SoLoader delegate");
                ib.a.x(new io.sentry.hints.j(4));
            } else {
                g();
                r.h("SoLoader", "Init System Loader delegate");
                ib.a.x(new pa.s());
            }
            Log.w("SoLoader", "SoLoader initialized: " + i7);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
        }
    }

    public static void g() {
        if (f5367e != null) {
            return;
        }
        f5365c.writeLock().lock();
        try {
            if (f5367e == null) {
                f5367e = new b0[0];
            }
        } finally {
            f5365c.writeLock().unlock();
        }
    }

    public static boolean h(Context context) {
        String packageName;
        if (f5375o != null) {
            return true;
        }
        Bundle bundle = null;
        try {
            packageName = context.getPackageName();
            try {
                bundle = context.getPackageManager().getApplicationInfo(packageName, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
            } catch (Exception e10) {
                e = e10;
                Log.w("SoLoader", "Unexpected issue with package manager (" + packageName + ")", e);
            }
        } catch (Exception e11) {
            e = e11;
            packageName = null;
        }
        return bundle == null || bundle.getBoolean("com.facebook.soloader.enabled", true);
    }

    public static synchronized void i(Context context, int i7) {
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    Log.w("SoLoader", "context.getApplicationContext returned null, holding reference to original context.ApplicationSoSource fallbacks to: " + context.getApplicationInfo().nativeLibraryDir);
                } else {
                    context = applicationContext;
                }
                f5366d = context;
                f5369g = new kb.a(context, (i7 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? 1 : 0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (f5364b != null) {
            return;
        }
        f5364b = new i8.c(new k8.a());
    }

    public static void init(Context context, int i7) {
        f(context, i7);
    }

    public static void j(Context context, int i7) {
        int i10;
        int i11;
        ReentrantReadWriteLock.WriteLock writeLock;
        if (f5367e != null) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f5365c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f5367e != null) {
                writeLock = reentrantReadWriteLock.writeLock();
            } else {
                f5373m = i7;
                ArrayList arrayList = new ArrayList();
                boolean z5 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0;
                boolean z6 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0;
                if (z5) {
                    d0 d0Var = new d0();
                    r.b("adding systemLoadWrapper source: " + d0Var);
                    arrayList.add(0, d0Var);
                } else if (z6) {
                    b(arrayList);
                    d dVar = new d();
                    dVar.f5384a = null;
                    dVar.f5385b = null;
                    arrayList.add(0, dVar);
                } else {
                    b(arrayList);
                    if (context != null) {
                        if ((i7 & 1) != 0) {
                            int i12 = f5374n;
                            if (i12 != 1) {
                                if (i12 != 2 && i12 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            a(i11, arrayList);
                            r.b("Adding exo package source: lib-main");
                            arrayList.add(0, new l(context, "lib-main", true));
                        } else {
                            if (f5374n == 2 || (context.getApplicationInfo().flags & 268435456) == 0) {
                                c cVar = new c(context);
                                r.b("validating/adding directApk source: " + cVar.toString());
                                if (!cVar.f5383c.isEmpty()) {
                                    arrayList.add(0, cVar);
                                }
                            }
                            int i13 = f5374n;
                            if (i13 != 1) {
                                if (i13 != 2 && i13 != 3) {
                                    throw new RuntimeException("Unsupported app type, we should not reach here");
                                }
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                            a(i10, arrayList);
                            boolean z7 = (i7 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0;
                            if ((f5373m & 8) == 0) {
                                arrayList.add(0, new b(context, "lib-main", !z7));
                            }
                        }
                    }
                }
                b0[] b0VarArr = (b0[]) arrayList.toArray(new b0[arrayList.size()]);
                reentrantReadWriteLock.writeLock().lock();
                try {
                    int i14 = f5373m;
                    int i15 = (i14 & 2) == 0 ? 0 : 1;
                    if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0) {
                        i15 |= 4;
                    }
                    if ((i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) == 0) {
                        i15 |= 8;
                    }
                    reentrantReadWriteLock.writeLock().unlock();
                    int length = b0VarArr.length;
                    while (true) {
                        int i16 = length - 1;
                        if (length <= 0) {
                            break;
                        }
                        String str = "Preparing SO source: " + b0VarArr[i16];
                        if (r.f("SoLoader", 4)) {
                            Log.i("SoLoader", str);
                        }
                        boolean z10 = f5363a;
                        if (z10) {
                            Api18TraceUtils.a("SoLoader", "_", b0VarArr[i16].getClass().getSimpleName());
                        }
                        b0VarArr[i16].d(i15);
                        if (z10) {
                            Trace.endSection();
                        }
                        length = i16;
                    }
                    f5367e = b0VarArr;
                    f5368f.getAndIncrement();
                    String str2 = "init finish: " + f5367e.length + " SO sources prepared";
                    if (r.f("SoLoader", 4)) {
                        Log.i("SoLoader", str2);
                    }
                    writeLock = f5365c.writeLock();
                } catch (Throwable th2) {
                    reentrantReadWriteLock.writeLock().unlock();
                    throw th2;
                }
            }
            writeLock.unlock();
        } catch (Throwable th3) {
            f5365c.writeLock().unlock();
            throw th3;
        }
    }

    public static boolean k() {
        if (f5367e != null) {
            return true;
        }
        f5365c.readLock().lock();
        try {
            return f5367e != null;
        } finally {
            f5365c.readLock().unlock();
        }
    }

    public static void l(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        AtomicReference atomicReference = jb.b.f13720a;
        jb.a[] aVarArr = (jb.a[]) atomicReference.get();
        if (aVarArr != null && aVarArr.length > 0) {
            jb.a aVar = aVarArr[0];
            throw null;
        }
        try {
            p(str, null, null, i7 | 1, threadPolicy);
            jb.a[] aVarArr2 = (jb.a[]) atomicReference.get();
            if (aVarArr2 == null || aVarArr2.length <= 0) {
                return;
            }
            jb.a aVar2 = aVarArr2[0];
            throw null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                jb.a[] aVarArr3 = (jb.a[]) jb.b.f13720a.get();
                if (aVarArr3 == null || aVarArr3.length <= 0) {
                    throw th3;
                }
                jb.a aVar3 = aVarArr3[0];
                throw null;
            }
        }
    }

    public static void m(String str) {
        if (f5372l) {
            n(0, str);
        } else {
            ib.a.z(str);
        }
    }

    public static boolean n(int i7, String str) {
        Boolean boolValueOf;
        if (f5367e == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f5365c;
            reentrantReadWriteLock.readLock().lock();
            try {
                if (f5367e == null) {
                    if (!"http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                        synchronized (SoLoader.class) {
                            try {
                                boolean zContains = f5370h.contains(str);
                                boolean z5 = !zContains;
                                if (!zContains) {
                                    System.loadLibrary(str);
                                }
                                boolValueOf = Boolean.valueOf(z5);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        reentrantReadWriteLock.readLock().unlock();
                    } else if (!k()) {
                        throw new IllegalStateException("SoLoader.init() not yet called");
                    }
                }
                reentrantReadWriteLock.readLock().unlock();
                boolValueOf = null;
            } catch (Throwable th3) {
                f5365c.readLock().unlock();
                throw th3;
            }
        } else {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        if (!f5372l) {
            return ib.a.z(str);
        }
        if (f5374n != 2) {
        }
        m mVar = f5375o;
        String strMapLibName = mVar != null ? mVar.mapLibName(str) : null;
        String str2 = strMapLibName != null ? strMapLibName : str;
        AtomicReference atomicReference = jb.b.f13720a;
        jb.a[] aVarArr = (jb.a[]) atomicReference.get();
        if (aVarArr != null && aVarArr.length > 0) {
            jb.a aVar = aVarArr[0];
            throw null;
        }
        try {
            boolean zO = o(System.mapLibraryName(str2), str, strMapLibName, i7);
            jb.a[] aVarArr2 = (jb.a[]) atomicReference.get();
            if (aVarArr2 == null || aVarArr2.length <= 0) {
                return zO;
            }
            jb.a aVar2 = aVarArr2[0];
            throw null;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                jb.a[] aVarArr3 = (jb.a[]) jb.b.f13720a.get();
                if (aVarArr3 == null || aVarArr3.length <= 0) {
                    throw th5;
                }
                jb.a aVar3 = aVarArr3[0];
                throw null;
            }
        }
    }

    public static boolean o(String str, String str2, String str3, int i7) {
        a5.b0 b0VarE = null;
        while (true) {
            try {
                return p(str, str2, str3, i7, null);
            } catch (UnsatisfiedLinkError e10) {
                StringBuilder sbN = com.discord.chat.presentation.list.a.n("Running a recovery step for ", str, " due to ");
                sbN.append(e10.toString());
                Log.w("SoLoader", sbN.toString());
                ReentrantReadWriteLock reentrantReadWriteLock = f5365c;
                reentrantReadWriteLock.writeLock().lock();
                if (b0VarE == null) {
                    try {
                        try {
                            b0VarE = e();
                            if (b0VarE == null) {
                                Log.w("SoLoader", "No recovery strategy");
                                throw e10;
                            }
                        } catch (Throwable th2) {
                            reentrantReadWriteLock.writeLock().unlock();
                            throw th2;
                        }
                    } catch (v e11) {
                        Log.e("SoLoader", "Base APK not found during recovery", e11);
                        throw e11;
                    } catch (Exception e12) {
                        Log.e("SoLoader", "Got an exception during recovery, will throw the initial error instead", e12);
                        throw e10;
                    }
                }
                if (!r(e10, b0VarE)) {
                    reentrantReadWriteLock.writeLock().unlock();
                    Log.w("SoLoader", "Failed to recover");
                    throw e10;
                }
                f5368f.getAndIncrement();
                reentrantReadWriteLock.writeLock().unlock();
            }
        }
    }

    public static boolean p(String str, String str2, String str3, int i7, StrictMode.ThreadPolicy threadPolicy) {
        boolean z5;
        Object obj;
        Object obj2;
        if (TextUtils.isEmpty(str2) || !j.contains(str2)) {
            Set set = f5370h;
            if (!set.contains(str) || str3 != null) {
                synchronized (SoLoader.class) {
                    try {
                        if (!set.contains(str)) {
                            z5 = false;
                        } else {
                            if (str3 == null) {
                                return false;
                            }
                            z5 = true;
                        }
                        HashMap map = f5371i;
                        if (map.containsKey(str)) {
                            obj = map.get(str);
                        } else {
                            Object obj3 = new Object();
                            map.put(str, obj3);
                            obj = obj3;
                        }
                        HashMap map2 = k;
                        if (map2.containsKey(str2)) {
                            obj2 = map2.get(str2);
                        } else {
                            Object obj4 = new Object();
                            map2.put(str2, obj4);
                            obj2 = obj4;
                        }
                        ReentrantReadWriteLock reentrantReadWriteLock = f5365c;
                        reentrantReadWriteLock.readLock().lock();
                        try {
                            synchronized (obj) {
                                if (!z5) {
                                    if (set.contains(str)) {
                                        if (str3 == null) {
                                            reentrantReadWriteLock.readLock().unlock();
                                            return false;
                                        }
                                        z5 = true;
                                    }
                                    if (!z5) {
                                        try {
                                            r.b("About to load: " + str);
                                            c(str, str2, i7, threadPolicy);
                                            r.b("Loaded: " + str);
                                            set.add(str);
                                        } catch (UnsatisfiedLinkError e10) {
                                            String message = e10.getMessage();
                                            if (message == null || !message.contains("unexpected e_machine:")) {
                                                throw e10;
                                            }
                                            x xVar = new x("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil$MarshmallowSysdeps.getSupportedAbis()) + " error: " + message.substring(message.lastIndexOf("unexpected e_machine:")));
                                            xVar.initCause(e10);
                                            throw xVar;
                                        }
                                    }
                                }
                                synchronized (obj2) {
                                    if ((i7 & 16) == 0 && str3 != null) {
                                        try {
                                            if (TextUtils.isEmpty(str2) || !j.contains(str2)) {
                                                boolean z6 = f5363a;
                                                if (z6 && f5375o == null) {
                                                    Api18TraceUtils.a("MergedSoMapping.invokeJniOnload[", str2, "]");
                                                }
                                                try {
                                                    try {
                                                        r.b("About to invoke JNI_OnLoad for merged library " + str2 + ", which was merged into " + str);
                                                        m mVar = f5375o;
                                                        if (mVar == null) {
                                                            throw new IllegalArgumentException(a3.e.l("Unknown library: ", str2));
                                                        }
                                                        mVar.invokeJniOnload(str2);
                                                        j.add(str2);
                                                        if (z6 && f5375o == null) {
                                                            Trace.endSection();
                                                        }
                                                    } catch (UnsatisfiedLinkError e11) {
                                                        throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e11);
                                                    }
                                                } catch (Throwable th2) {
                                                    if (!f5363a || f5375o != null) {
                                                        throw th2;
                                                    }
                                                    Trace.endSection();
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                                reentrantReadWriteLock.readLock().unlock();
                                return !z5;
                            }
                        } catch (Throwable th4) {
                            f5365c.readLock().unlock();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
            }
        }
        return false;
    }

    public static boolean q(b0 b0Var, String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        AtomicReference atomicReference = jb.b.f13720a;
        jb.a[] aVarArr = (jb.a[]) atomicReference.get();
        if (aVarArr != null && aVarArr.length > 0) {
            jb.a aVar = aVarArr[0];
            throw null;
        }
        try {
            boolean z5 = b0Var.c(str, i7, threadPolicy) != 0;
            jb.a[] aVarArr2 = (jb.a[]) atomicReference.get();
            if (aVarArr2 == null || aVarArr2.length <= 0) {
                return z5;
            }
            jb.a aVar2 = aVarArr2[0];
            throw null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                jb.a[] aVarArr3 = (jb.a[]) jb.b.f13720a.get();
                if (aVarArr3 == null || aVarArr3.length <= 0) {
                    throw th3;
                }
                jb.a aVar3 = aVarArr3[0];
                throw null;
            }
        }
    }

    public static boolean r(UnsatisfiedLinkError unsatisfiedLinkError, kb.b bVar) {
        AtomicReference atomicReference = jb.b.f13720a;
        jb.a[] aVarArr = (jb.a[]) atomicReference.get();
        if (aVarArr != null && aVarArr.length > 0) {
            jb.a aVar = aVarArr[0];
            throw null;
        }
        try {
            boolean zI = bVar.i(unsatisfiedLinkError, f5367e);
            jb.a[] aVarArr2 = (jb.a[]) atomicReference.get();
            if (aVarArr2 == null || aVarArr2.length <= 0) {
                return zI;
            }
            jb.a aVar2 = aVarArr2[0];
            throw null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                jb.a[] aVarArr3 = (jb.a[]) jb.b.f13720a.get();
                if (aVarArr3 == null || aVarArr3.length <= 0) {
                    throw th3;
                }
                jb.a aVar3 = aVarArr3[0];
                throw null;
            }
        }
    }
}
