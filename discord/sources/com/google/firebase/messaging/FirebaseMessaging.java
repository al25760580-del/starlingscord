package com.google.firebase.messaging;

import a5.l0;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.core.view.e1;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {
    public static ue.i k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f6530m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ji.f f6531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final af.c f6533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f6534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a3.f f6535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f6537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f6538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6539i;
    public static final long j = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static xi.a f6529l = new j(0);

    public FirebaseMessaging(ji.f fVar, xi.a aVar, xi.a aVar2, yi.d dVar, xi.a aVar3, ui.b bVar) {
        fVar.a();
        Context context = fVar.f13890a;
        final p pVar = new p();
        final int i7 = 0;
        pVar.f6603b = 0;
        pVar.f6604c = context;
        fVar.a();
        Rpc rpc = new Rpc(fVar.f13890a);
        final af.c cVar = new af.c();
        cVar.f393d = fVar;
        cVar.f394e = pVar;
        cVar.f395i = rpc;
        cVar.f396v = aVar;
        cVar.f397w = aVar2;
        cVar.f398x = dVar;
        final int i10 = 1;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new a5.u("Firebase-Messaging-Task", 1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new a5.u("Firebase-Messaging-Init", 1));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a5.u("Firebase-Messaging-File-Io", 1));
        this.f6539i = false;
        f6529l = aVar3;
        this.f6531a = fVar;
        a3.f fVar2 = new a3.f();
        fVar2.f70d = this;
        fVar2.f68b = bVar;
        this.f6535e = fVar2;
        fVar.a();
        final Context context2 = fVar.f13890a;
        this.f6532b = context2;
        i iVar = new i();
        this.f6538h = pVar;
        this.f6533c = cVar;
        this.f6534d = new h(executorServiceNewSingleThreadExecutor);
        this.f6536f = scheduledThreadPoolExecutor;
        this.f6537g = threadPoolExecutor;
        fVar.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(iVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.k

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f6593e;

            {
                this.f6593e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ig.l lVarU;
                int i11;
                switch (i7) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f6593e;
                        if (firebaseMessaging.f6535e.m() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f6539i) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f6593e;
                        Context context3 = firebaseMessaging2.f6532b;
                        e1.e(context3);
                        af.c cVar2 = firebaseMessaging2.f6533c;
                        boolean zF = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesR = yk.a.r(context3);
                            if (!sharedPreferencesR.contains("proxy_retention") || sharedPreferencesR.getBoolean("proxy_retention", false) != zF) {
                                Rpc rpc2 = (Rpc) cVar2.f395i;
                                if (rpc2.f5924c.h() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    we.k kVarE = we.k.e(rpc2.f5923b);
                                    synchronized (kVarE) {
                                        i11 = kVarE.f22219b;
                                        kVarE.f22219b = i11 + 1;
                                    }
                                    lVarU = kVarE.f(new we.j(i11, 4, bundle, 0));
                                } else {
                                    lVarU = l0.u(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                lVarU.e(new com.discord.misc.utilities.threading.a(1), new hc.d(context3, zF, 4));
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new a5.u("Firebase-Messaging-Topics-Io", 1));
        int i11 = y.j;
        l0.k(new Callable() { // from class: com.google.firebase.messaging.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                w wVar;
                Context context3 = context2;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor3 = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                p pVar2 = pVar;
                af.c cVar2 = cVar;
                synchronized (w.class) {
                    try {
                        WeakReference weakReference = w.f6628b;
                        wVar = weakReference != null ? (w) weakReference.get() : null;
                        if (wVar == null) {
                            SharedPreferences sharedPreferences = context3.getSharedPreferences("com.google.android.gms.appid", 0);
                            w wVar2 = new w();
                            synchronized (wVar2) {
                                wVar2.f6629a = zl.e.h(sharedPreferences, scheduledThreadPoolExecutor3);
                            }
                            w.f6628b = new WeakReference(wVar2);
                            wVar = wVar2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return new y(firebaseMessaging, pVar2, wVar, cVar2, context3, scheduledThreadPoolExecutor3);
            }
        }, scheduledThreadPoolExecutor2).e(scheduledThreadPoolExecutor, new l(this, i7));
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: com.google.firebase.messaging.k

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f6593e;

            {
                this.f6593e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ig.l lVarU;
                int i12;
                switch (i10) {
                    case 0:
                        FirebaseMessaging firebaseMessaging = this.f6593e;
                        if (firebaseMessaging.f6535e.m() && firebaseMessaging.h(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.f6539i) {
                                    firebaseMessaging.g(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        FirebaseMessaging firebaseMessaging2 = this.f6593e;
                        Context context3 = firebaseMessaging2.f6532b;
                        e1.e(context3);
                        af.c cVar2 = firebaseMessaging2.f6533c;
                        boolean zF = firebaseMessaging2.f();
                        if (Build.VERSION.SDK_INT >= 29) {
                            SharedPreferences sharedPreferencesR = yk.a.r(context3);
                            if (!sharedPreferencesR.contains("proxy_retention") || sharedPreferencesR.getBoolean("proxy_retention", false) != zF) {
                                Rpc rpc2 = (Rpc) cVar2.f395i;
                                if (rpc2.f5924c.h() >= 241100000) {
                                    Bundle bundle = new Bundle();
                                    bundle.putBoolean("proxy_retention", zF);
                                    we.k kVarE = we.k.e(rpc2.f5923b);
                                    synchronized (kVarE) {
                                        i12 = kVarE.f22219b;
                                        kVarE.f22219b = i12 + 1;
                                    }
                                    lVarU = kVarE.f(new we.j(i12, 4, bundle, 0));
                                } else {
                                    lVarU = l0.u(new IOException("SERVICE_NOT_AVAILABLE"));
                                }
                                lVarU.e(new com.discord.misc.utilities.threading.a(1), new hc.d(context3, zF, 4));
                            }
                        }
                        if (firebaseMessaging2.f()) {
                            firebaseMessaging2.e();
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static void b(Runnable runnable, long j5) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f6530m == null) {
                    f6530m = new ScheduledThreadPoolExecutor(1, new a5.u("TAG", 1));
                }
                f6530m.schedule(runnable, j5, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized ue.i c(Context context) {
        try {
            if (k == null) {
                k = new ue.i(context, 6);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return k;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull ji.f fVar) {
        FirebaseMessaging firebaseMessaging;
        fVar.a();
        firebaseMessaging = (FirebaseMessaging) fVar.f13893d.b(FirebaseMessaging.class);
        af.w.h(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public final String a() {
        Task taskG;
        t tVarD = d();
        if (!h(tVarD)) {
            return tVarD.f6617a;
        }
        String strC = p.c(this.f6531a);
        h hVar = this.f6534d;
        synchronized (hVar) {
            taskG = (Task) ((s.e) hVar.f6589b).get(strC);
            if (taskG == null) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Making new request for: " + strC);
                }
                af.c cVar = this.f6533c;
                taskG = cVar.p(cVar.N(p.c((ji.f) cVar.f393d), "*", new Bundle())).n(this.f6537g, new ac.b(this, strC, tVarD, 6)).g((Executor) hVar.f6588a, new bc.i(10, hVar, strC));
                ((s.e) hVar.f6589b).put(strC, taskG);
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + strC);
            }
        }
        try {
            return (String) l0.h(taskG);
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    public final t d() {
        t tVarB;
        ue.i iVarC = c(this.f6532b);
        ji.f fVar = this.f6531a;
        fVar.a();
        String strC = "[DEFAULT]".equals(fVar.f13891b) ? "" : fVar.c();
        String strC2 = p.c(this.f6531a);
        synchronized (iVarC) {
            tVarB = t.b(((SharedPreferences) iVarC.f21117d).getString(strC + "|T|" + strC2 + "|*", null));
        }
        return tVarB;
    }

    public final void e() {
        Task taskU;
        int i7;
        Rpc rpc = (Rpc) this.f6533c.f395i;
        if (rpc.f5924c.h() >= 241100000) {
            we.k kVarE = we.k.e(rpc.f5923b);
            Bundle bundle = Bundle.EMPTY;
            synchronized (kVarE) {
                i7 = kVarE.f22219b;
                kVarE.f22219b = i7 + 1;
            }
            taskU = kVarE.f(new we.j(i7, 5, bundle, 1)).f(we.g.f22202i, we.c.f22196i);
        } else {
            taskU = l0.u(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        taskU.e(this.f6536f, new l(this, 1));
    }

    public final boolean f() {
        Context context = this.f6532b;
        e1.e(context);
        if (!e1.g(context)) {
            return false;
        }
        ji.f fVar = this.f6531a;
        fVar.a();
        if (fVar.f13893d.b(ki.a.class) != null) {
            return true;
        }
        return xr.m.n() && f6529l != null;
    }

    public final synchronized void g(long j5) {
        b(new u(this, Math.min(Math.max(30L, 2 * j5), j)), j5);
        this.f6539i = true;
    }

    public final boolean h(t tVar) {
        if (tVar != null) {
            return System.currentTimeMillis() > tVar.f6619c + t.f6616d || !this.f6538h.b().equals(tVar.f6618b);
        }
        return true;
    }
}
