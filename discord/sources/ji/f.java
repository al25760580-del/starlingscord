package ji;

import a5.l0;
import af.w;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mi.m;
import ni.i;
import pa.s;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final Object j = new Object();
    public static final s.e k = new s.e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f13892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final mi.f f13893d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f13896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi.a f13897h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f13894e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f13895f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f13898i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public f(Context context, String str, h hVar) {
        ?? arrayList;
        int i7 = 0;
        new CopyOnWriteArrayList();
        this.f13890a = context;
        w.d(str);
        this.f13891b = str;
        this.f13892c = hVar;
        a aVar = FirebaseInitProvider.f6646d;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new mi.d(i7, (String) it.next()));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        i iVar = i.f16951d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i10 = 1;
        arrayList3.add(new mi.d(i10, new FirebaseCommonRegistrar()));
        arrayList3.add(new mi.d(i10, new ExecutorsRegistrar()));
        arrayList4.add(mi.b.b(context, Context.class, new Class[0]));
        arrayList4.add(mi.b.b(this, f.class, new Class[0]));
        arrayList4.add(mi.b.b(hVar, h.class, new Class[0]));
        s sVar = new s();
        if (l0.K(context) && FirebaseInitProvider.f6647e.get()) {
            arrayList4.add(mi.b.b(aVar, a.class, new Class[0]));
        }
        mi.f fVar = new mi.f(arrayList3, arrayList4, sVar);
        this.f13893d = fVar;
        Trace.endSection();
        this.f13896g = new m(new b(i7, this, context));
        this.f13897h = fVar.c(vi.c.class);
        c cVar = new c(this);
        a();
        if (this.f13894e.get()) {
            ze.c.f23921w.f23922d.get();
        }
        this.f13898i.add(cVar);
        Trace.endSection();
    }

    public static f b() {
        f fVar;
        synchronized (j) {
            try {
                fVar = (f) k.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ff.e.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((vi.c) fVar.f13897h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static f e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return b();
                }
                h hVarA = h.a(context);
                if (hVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, hVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f f(Context context, h hVar) {
        f fVar;
        AtomicReference atomicReference = d.f13887a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f13887a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                do {
                    if (atomicReference2.compareAndSet(null, dVar)) {
                        ze.c.a(application);
                        ze.c cVar = ze.c.f23921w;
                        cVar.getClass();
                        synchronized (cVar) {
                            cVar.f23924i.add(dVar);
                        }
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            s.e eVar = k;
            w.i("FirebaseApp name [DEFAULT] already exists!", !eVar.containsKey("[DEFAULT]"));
            w.h(context, "Application context cannot be null.");
            fVar = new f(context, "[DEFAULT]", hVar);
            eVar.put("[DEFAULT]", fVar);
        }
        fVar.d();
        return fVar;
    }

    public final void a() {
        w.i("FirebaseApp was deleted", !this.f13895f.get());
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(ff.c.b(this.f13891b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(ff.c.b(this.f13892c.f13905b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void d() {
        HashMap map;
        if (!l0.K(this.f13890a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f13891b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f13890a;
            AtomicReference atomicReference = e.f13888b;
            if (atomicReference.get() == null) {
                e eVar = new e(context);
                while (!atomicReference.compareAndSet(null, eVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f13891b);
        Log.i("FirebaseApp", sb3.toString());
        mi.f fVar = this.f13893d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f13891b);
        AtomicReference atomicReference2 = fVar.f15813x;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((vi.c) this.f13897h.get()).b();
            }
        }
        synchronized (fVar) {
            map = new HashMap(fVar.f15808d);
        }
        fVar.a(map, zEquals);
        ((vi.c) this.f13897h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        fVar.a();
        return this.f13891b.equals(fVar.f13891b);
    }

    public final int hashCode() {
        return this.f13891b.hashCode();
    }

    public final String toString() {
        e4.e eVar = new e4.e(this);
        eVar.w(this.f13891b, StackTraceHelper.NAME_KEY);
        eVar.w(this.f13892c, "options");
        return eVar.toString();
    }
}
