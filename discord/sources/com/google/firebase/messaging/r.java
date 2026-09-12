package com.google.firebase.messaging;

import android.content.Context;
import android.graphics.Typeface;
import android.opengl.EGL14;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import androidx.appcompat.widget.b4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.b1;
import androidx.lifecycle.u0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.savedstate.SavedStateRegistry;
import com.discord.media.utils.Transcoder$convertCompress$3$2;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.sentry.SentryLevel;
import io.sentry.a1;
import io.sentry.r4;
import io.sentry.w5;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import sh.f1;
import sh.h0;
import sh.i1;
import sh.k0;
import sh.m0;
import sh.t1;
import sh.u1;
import vo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements hq.f, a1, np.l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static r f6608w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f6609x = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f6610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f6611e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f6612i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f6613v;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6610d = obj;
        this.f6611e = obj2;
        this.f6612i = obj3;
        this.f6613v = obj4;
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbO = kk.b.o(str, ": EGL error: 0x");
        sbO.append(Integer.toHexString(iEglGetError));
        throw new RuntimeException(sbO.toString());
    }

    public static synchronized r f() {
        try {
            if (f6608w == null) {
                f6608w = new r(0);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6608w;
    }

    @Override // np.l
    public np.l F(up.b classId, up.e eVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return ((b4) this.f6610d).F(classId, eVar);
    }

    @Override // np.l
    public void G(up.e eVar, up.b enumClassId, up.e enumEntryName) {
        Intrinsics.checkNotNullParameter(enumClassId, "enumClassId");
        Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
        ((b4) this.f6610d).G(eVar, enumClassId, enumEntryName);
    }

    @Override // np.l
    public void K(up.e eVar, zp.f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ((b4) this.f6610d).K(eVar, value);
    }

    @Override // np.l
    public void M(up.e eVar, Object obj) {
        ((b4) this.f6610d).M(eVar, obj);
    }

    @Override // io.sentry.a1
    public void b(long j) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f6610d;
        io.sentry.r rVarA = ((io.sentry.util.a) this.f6611e).a();
        try {
            if (!scheduledThreadPoolExecutor.isShutdown()) {
                scheduledThreadPoolExecutor.shutdown();
                try {
                    if (!scheduledThreadPoolExecutor.awaitTermination(j, TimeUnit.MILLISECONDS)) {
                        scheduledThreadPoolExecutor.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    scheduledThreadPoolExecutor.shutdownNow();
                    Thread.currentThread().interrupt();
                }
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.a1
    public void c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f6610d;
        try {
            scheduledThreadPoolExecutor.submit(new s(26, this));
        } catch (RejectedExecutionException e10) {
            w5 w5Var = (w5) this.f6613v;
            if (w5Var != null) {
                w5Var.getLogger().g(SentryLevel.WARNING, "Prewarm task rejected from " + scheduledThreadPoolExecutor, e10);
            }
        }
    }

    public vo.f d(up.b classId, List typeParametersCount) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(typeParametersCount, "typeParametersCount");
        return (vo.f) ((kq.e) this.f6613v).invoke(new vo.c0(classId, typeParametersCount));
    }

    public CloseableReference e() {
        CloseableReference closeableReference;
        CacheKey cacheKey;
        ga.d dVar;
        boolean z5;
        do {
            synchronized (this) {
                Iterator it = ((LinkedHashSet) this.f6613v).iterator();
                closeableReference = null;
                if (it.hasNext()) {
                    cacheKey = (CacheKey) it.next();
                    it.remove();
                } else {
                    cacheKey = null;
                }
            }
            if (cacheKey == null) {
                return null;
            }
            ga.h hVar = (ga.h) ((ga.e) this.f6611e);
            hVar.getClass();
            synchronized (hVar) {
                try {
                    dVar = (ga.d) hVar.f9539d.e(cacheKey);
                    z5 = false;
                    if (dVar != null) {
                        ga.d dVar2 = (ga.d) hVar.f9540e.e(cacheKey);
                        dVar2.getClass();
                        n8.i.e(dVar2.f9536c == 0);
                        closeableReference = dVar2.f9535b;
                        z5 = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z5) {
                ga.h.f(dVar);
            }
        } while (closeableReference == null);
        return closeableReference;
    }

    public y0 g(String key, KClass modelClass) {
        y0 viewModel;
        y0 y0VarA;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (((i8.c) this.f6613v)) {
            try {
                ViewModelStore viewModelStore = (ViewModelStore) this.f6610d;
                viewModelStore.getClass();
                Intrinsics.checkNotNullParameter(key, "key");
                viewModel = (y0) viewModelStore.f2325a.get(key);
                if (modelClass.isInstance(viewModel)) {
                    ViewModelProvider$Factory viewModelProvider$Factory = (ViewModelProvider$Factory) this.f6611e;
                    if (viewModelProvider$Factory instanceof u0) {
                        u0 u0Var = (u0) viewModelProvider$Factory;
                        Intrinsics.checkNotNull(viewModel);
                        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                        Lifecycle lifecycle = u0Var.f2397d;
                        if (lifecycle != null) {
                            SavedStateRegistry savedStateRegistry = u0Var.f2398e;
                            Intrinsics.checkNotNull(savedStateRegistry);
                            Intrinsics.checkNotNull(lifecycle);
                            androidx.lifecycle.k.a(viewModel, savedStateRegistry, lifecycle);
                        }
                    }
                    Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    t2.c extras = new t2.c((CreationExtras) this.f6612i);
                    extras.b(b1.f2333a, key);
                    ViewModelProvider$Factory factory = (ViewModelProvider$Factory) this.f6611e;
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    Intrinsics.checkNotNullParameter(extras, "extras");
                    try {
                        try {
                            y0VarA = factory.c(modelClass, extras);
                        } catch (AbstractMethodError unused) {
                            y0VarA = factory.b(gn.h.B(modelClass), extras);
                        }
                    } catch (AbstractMethodError unused2) {
                        y0VarA = factory.a(gn.h.B(modelClass));
                    }
                    viewModel = y0VarA;
                    ViewModelStore viewModelStore2 = (ViewModelStore) this.f6610d;
                    viewModelStore2.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                    y0 y0Var = (y0) viewModelStore2.f2325a.put(key, viewModel);
                    if (y0Var != null) {
                        y0Var.a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return viewModel;
    }

    @Override // io.sentry.a1
    public Future h(Runnable runnable, long j) {
        return ((ScheduledThreadPoolExecutor) this.f6610d).schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // np.l
    public void i() {
        ((b4) this.f6611e).i();
        ((ArrayList) ((e4.i) this.f6612i).f7980e).add(new zp.a((wo.b) CollectionsKt.Z((ArrayList) this.f6613v)));
    }

    @Override // io.sentry.a1
    public boolean isClosed() {
        io.sentry.r rVarA = ((io.sentry.util.a) this.f6611e).a();
        try {
            boolean zIsShutdown = ((ScheduledThreadPoolExecutor) this.f6610d).isShutdown();
            rVarA.close();
            return zIsShutdown;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // hq.f
    public hq.e j(up.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        pp.k kVar = (pp.k) ((LinkedHashMap) this.f6613v).get(classId);
        if (kVar == null) {
            return null;
        }
        return new hq.e((e4.c) this.f6610d, kVar, (qp.a) this.f6611e, (n0) ((hq.a0) this.f6612i).invoke(classId));
    }

    public boolean k(Context context) {
        if (((Boolean) this.f6612i) == null) {
            this.f6612i = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f6611e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f6612i).booleanValue();
    }

    public boolean l(Context context) {
        if (((Boolean) this.f6611e) == null) {
            this.f6611e = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f6611e).booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return ((Boolean) this.f6611e).booleanValue();
    }

    @Override // np.l
    public np.m m(up.e eVar) {
        return ((b4) this.f6610d).m(eVar);
    }

    public void n(String str, ArrayList arrayList) {
        Bundle bundle = (Bundle) this.f6612i;
        ((Map) this.f6610d).remove(str);
        bd.d dVar = (bd.d) this.f6613v;
        if (dVar == null) {
            ((Transcoder$convertCompress$3$2) this.f6611e).onCancelled(str, arrayList);
            return;
        }
        Message messageObtain = Message.obtain(dVar, 4);
        messageObtain.obj = arrayList;
        bundle.putString("jobId", str);
        messageObtain.setData(bundle);
        messageObtain.sendToTarget();
    }

    public void o(String str, Exception exc, ArrayList arrayList) {
        Bundle bundle = (Bundle) this.f6612i;
        ((Map) this.f6610d).remove(str);
        bd.d dVar = (bd.d) this.f6613v;
        if (dVar == null) {
            ((Transcoder$convertCompress$3$2) this.f6611e).onError(str, exc, arrayList);
            return;
        }
        Message messageObtain = Message.obtain(dVar, 2);
        messageObtain.obj = arrayList;
        bundle.putString("jobId", str);
        bundle.putSerializable("throwable", exc);
        messageObtain.setData(bundle);
        messageObtain.sendToTarget();
    }

    @Override // io.sentry.a1
    public Future submit(Runnable runnable) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) this.f6610d;
        if (scheduledThreadPoolExecutor.getQueue().size() >= 271) {
            scheduledThreadPoolExecutor.purge();
        }
        if (scheduledThreadPoolExecutor.getQueue().size() < 271) {
            return scheduledThreadPoolExecutor.submit(runnable);
        }
        w5 w5Var = (w5) this.f6613v;
        if (w5Var != null) {
            w5Var.getLogger().q(SentryLevel.WARNING, "Task " + runnable + " rejected from " + scheduledThreadPoolExecutor, new Object[0]);
        }
        return new r4();
    }

    public r(u1 u1Var) {
        pf.b bVar = new pf.b(6, u1Var);
        th.f fVarB = th.f.b(new i1(bVar, 0));
        th.f fVarB2 = th.f.b(new e4.l(18, bVar, fVarB));
        th.f fVarB3 = th.f.b(sh.a.f19974b);
        th.f fVarB4 = th.f.b(new e4.l(19, fVarB2, fVarB));
        th.f fVarB5 = th.f.b(new sh.n(bVar, fVarB3, fVarB4, 0));
        th.f fVarB6 = th.f.b(new f1(bVar, 1));
        po.d dVar = new po.d(4);
        th.f fVarB7 = th.f.b(m0.f20104c);
        th.f fVarB8 = th.f.b(new e4.i(15, fVarB2, dVar, fVarB3, fVarB7));
        th.f fVarB9 = th.f.b(sh.a.f19973a);
        th.f fVarB10 = th.f.b(new o9.c(fVarB2, dVar, fVarB9, fVarB3, fVarB4));
        th.f fVarB11 = th.f.b(new pc.r(fVarB2));
        th.f fVarB12 = th.f.b(new pf.b(5, fVarB2));
        af.c cVar = new af.c();
        cVar.f393d = fVarB2;
        cVar.f394e = dVar;
        cVar.f395i = fVarB8;
        cVar.f396v = fVarB7;
        cVar.f397w = fVarB3;
        cVar.f398x = fVarB4;
        th.f fVarB13 = th.f.b(cVar);
        th.f fVarB14 = th.f.b(new e4.r(21, fVarB2, dVar));
        zl.e eVar = new zl.e();
        eVar.f24044d = fVarB2;
        eVar.f24045e = dVar;
        eVar.f24046i = fVarB8;
        eVar.f24047v = fVarB7;
        eVar.f24048w = fVarB3;
        th.f fVarB15 = th.f.b(new bc.k(fVarB8, dVar, fVarB10, fVarB11, fVarB12, fVarB13, fVarB14, th.f.b(eVar), th.f.b(new k0(fVarB8, fVarB2, th.f.b(new ph.c(dVar)), 1)), 4));
        th.f fVarB16 = th.f.b(m0.f20103b);
        th.f fVarB17 = th.f.b(sh.a.f19975c);
        th.f fVarB18 = th.f.b(new bc.k(bVar, fVarB8, fVarB15, dVar, fVarB3, fVarB16, fVarB7, fVarB17, fVarB4, 3));
        th.f fVarB19 = th.f.b(new sh.n(bVar, fVarB5, th.f.b(new b4(fVarB6, fVarB18, fVarB3, bVar, fVarB, fVarB7, fVarB4)), 1));
        if (((th.f) dVar.f18079e) != null) {
            throw new IllegalStateException();
        }
        dVar.f18079e = fVarB19;
        th.f fVarB20 = th.f.b(new t1(fVarB2, dVar, fVarB18, fVarB9, th.f.b(new h0(bVar, 1)), fVarB8, fVarB3, fVarB16, fVarB7, fVarB4));
        this.f6610d = th.f.b(new io.sentry.internal.debugmeta.c(fVarB20, bVar, 21, false));
        int i7 = 0;
        th.f fVarB21 = th.f.b(new h0(bVar, i7));
        th.f fVarB22 = th.f.b(new f1(bVar, i7));
        this.f6611e = th.f.b(new e9.b(bVar, fVarB2, fVarB20, fVarB21, fVarB22));
        this.f6612i = th.f.b(new k0(fVarB8, fVarB15, fVarB22, 0));
        this.f6613v = th.f.b(new pa.u(fVarB8, fVarB3, fVarB4, fVarB16, th.f.b(new i1(bVar, 1)), dVar, fVarB9, fVarB17));
    }

    public r(kq.l storageManager, vo.z module) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f6610d = storageManager;
        this.f6611e = module;
        this.f6612i = storageManager.c(new vo.b0(this, 0));
        this.f6613v = storageManager.c(new vo.b0(this, 1));
    }

    public r(e4.i iVar) {
        ArrayList arrayList;
        aa.b bVar = (aa.b) iVar.f7980e;
        bVar.getClass();
        this.f6611e = bVar;
        this.f6612i = CloseableReference.g((CloseableReference) iVar.f7981i);
        ArrayList arrayList2 = (ArrayList) iVar.f7982v;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(CloseableReference.g((CloseableReference) it.next()));
            }
            arrayList = arrayList3;
        }
        this.f6613v = arrayList;
        this.f6610d = (String) iVar.f7983w;
    }

    public r(ViewModelStore store, ViewModelProvider$Factory factory, CreationExtras defaultExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        this.f6610d = store;
        this.f6611e = factory;
        this.f6612i = defaultExtras;
        this.f6613v = new i8.c(17);
    }

    public r(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, w5 w5Var) {
        this.f6611e = new io.sentry.util.a();
        this.f6612i = new bc.a(9);
        this.f6610d = scheduledThreadPoolExecutor;
        this.f6613v = w5Var;
    }

    public r(w5 w5Var) {
        this(new ScheduledThreadPoolExecutor(1, new io.sentry.h0(1)), w5Var);
    }

    public r(Typeface typeface, l2.b bVar) {
        int i7;
        int i10;
        int i11;
        int i12;
        this.f6613v = typeface;
        this.f6610d = bVar;
        this.f6612i = new k2.r(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        int iA = bVar.a(6);
        if (iA != 0) {
            int i13 = iA + bVar.f1671d;
            i7 = ((ByteBuffer) bVar.f1674v).getInt(((ByteBuffer) bVar.f1674v).getInt(i13) + i13);
        } else {
            i7 = 0;
        }
        this.f6611e = new char[i7 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i14 = iA2 + bVar.f1671d;
            i10 = ((ByteBuffer) bVar.f1674v).getInt(((ByteBuffer) bVar.f1674v).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            k2.u uVar = new k2.u(this, i15);
            l2.a aVarB = uVar.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? ((ByteBuffer) aVarB.f1674v).getInt(iA3 + aVarB.f1671d) : 0, (char[]) this.f6611e, i15 * 2);
            l2.a aVarB2 = uVar.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i16 = iA4 + aVarB2.f1671d;
                i11 = ((ByteBuffer) aVarB2.f1674v).getInt(((ByteBuffer) aVarB2.f1674v).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            yk.a.a("invalid metadata codepoint length", i11 > 0);
            k2.r rVar = (k2.r) this.f6612i;
            l2.a aVarB3 = uVar.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i17 = iA5 + aVarB3.f1671d;
                i12 = ((ByteBuffer) aVarB3.f1674v).getInt(((ByteBuffer) aVarB3.f1674v).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            rVar.a(uVar, 0, i12 - 1);
        }
    }

    public r(n9.a aVar, ga.e eVar) {
        this.f6610d = aVar;
        this.f6611e = eVar;
        this.f6613v = new LinkedHashSet();
        this.f6612i = new ue.i(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(int i7) {
        this(new ScheduledThreadPoolExecutor(1, new io.sentry.h0(1)), (w5) null);
        switch (i7) {
            case 7:
                break;
            case 10:
                this.f6610d = new s.e(0);
                this.f6611e = new SparseArray();
                this.f6612i = new s.k();
                this.f6613v = new s.e(0);
                break;
            default:
                this.f6610d = null;
                this.f6611e = null;
                this.f6612i = null;
                this.f6613v = new ArrayDeque();
                break;
        }
    }
}
