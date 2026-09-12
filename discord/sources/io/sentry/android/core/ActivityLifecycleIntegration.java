package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import androidx.appcompat.widget.b4;
import androidx.core.app.FrameMetricsAggregator;
import io.sentry.ISpan;
import io.sentry.SentryLevel;
import io.sentry.b2;
import io.sentry.b5;
import io.sentry.c4;
import io.sentry.e5;
import io.sentry.j4;
import io.sentry.l1;
import io.sentry.m6;
import io.sentry.q6;
import io.sentry.r6;
import io.sentry.v2;
import io.sentry.v3;
import io.sentry.w5;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityLifecycleIntegration implements l1, Closeable, Application.ActivityLifecycleCallbacks {
    public ISpan G;
    public final b4 N;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Application f12071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f12072e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v3 f12073i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SentryAndroidOptions f12074v;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f12077y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12075w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12076x = false;
    public boolean E = false;
    public io.sentry.f0 F = null;
    public final WeakHashMap H = new WeakHashMap();
    public final WeakHashMap I = new WeakHashMap();
    public final WeakHashMap J = new WeakHashMap();
    public j4 K = new e5(new Date(0), 0);
    public Future L = null;
    public final WeakHashMap M = new WeakHashMap();
    public final io.sentry.util.a O = new io.sentry.util.a();
    public final io.sentry.util.a P = new io.sentry.util.a();

    public ActivityLifecycleIntegration(Application application, k0 k0Var, b4 b4Var) {
        com.facebook.imagepipeline.nativecode.c.H(application, "Application is required");
        this.f12071d = application;
        this.f12072e = k0Var;
        this.N = b4Var;
        if (Build.VERSION.SDK_INT >= 29) {
            this.f12077y = true;
        }
    }

    public static void f(ISpan iSpan, ISpan iSpan2) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        String description = iSpan.getDescription();
        if (description == null || !description.endsWith(" - Deadline Exceeded")) {
            description = iSpan.getDescription() + " - Deadline Exceeded";
        }
        iSpan.j(description);
        j4 j4VarP = iSpan2 != null ? iSpan2.p() : null;
        if (j4VarP == null) {
            j4VarP = iSpan.s();
        }
        g(iSpan, j4VarP, m6.DEADLINE_EXCEEDED);
    }

    public static void g(ISpan iSpan, j4 j4Var, m6 m6Var) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        if (m6Var == null) {
            m6Var = iSpan.a() != null ? iSpan.a() : m6.OK;
        }
        iSpan.q(m6Var, j4Var);
    }

    public final void c() {
        b5 b5Var;
        io.sentry.android.core.performance.g gVarA = io.sentry.android.core.performance.f.b().a(this.f12074v);
        if (gVarA.f12386v != 0) {
            b5Var = new b5((gVarA.c() ? gVarA.f12384e + gVarA.a() : 0L) * 1000000);
        } else {
            b5Var = null;
        }
        if (!this.f12075w || b5Var == null) {
            return;
        }
        g(this.G, b5Var, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12071d.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f12074v;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        b4 b4Var = this.N;
        io.sentry.r rVarA = ((io.sentry.util.a) b4Var.f914x).a();
        try {
            if (b4Var.d()) {
                b4Var.e("FrameMetricsAggregator.stop", new com.google.firebase.messaging.s(28, b4Var));
                je.u uVar = ((FrameMetricsAggregator) ((io.sentry.util.e) b4Var.f909d).a()).f1460a;
                Object obj = uVar.f13849b;
                uVar.f13849b = new SparseIntArray[9];
            }
            ((ConcurrentHashMap) b4Var.f911i).clear();
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

    public final void i(io.sentry.f1 f1Var, ISpan iSpan, ISpan iSpan2) {
        if (f1Var == null || f1Var.isFinished()) {
            return;
        }
        m6 m6Var = m6.DEADLINE_EXCEEDED;
        if (iSpan != null && !iSpan.isFinished()) {
            iSpan.f(m6Var);
        }
        f(iSpan2, iSpan);
        Future future = this.L;
        if (future != null) {
            future.cancel(false);
            this.L = null;
        }
        m6 m6VarA = f1Var.a();
        if (m6VarA == null) {
            m6VarA = m6.OK;
        }
        f1Var.f(m6VarA);
        if (this.f12073i != null) {
            c4.d(null, new gc.o(12, this, f1Var));
        }
    }

    public final void l(ISpan iSpan, ISpan iSpan2) {
        io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
        io.sentry.android.core.performance.g gVar = fVarB.f12378i;
        io.sentry.android.core.performance.g gVar2 = fVarB.f12379v;
        if (gVar.c() && gVar.f12386v == 0) {
            gVar.f12386v = SystemClock.uptimeMillis();
        }
        if (gVar2.c() && gVar2.f12386v == 0) {
            gVar2.f12386v = SystemClock.uptimeMillis();
        }
        c();
        io.sentry.r rVarA = this.P.a();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.f12074v;
            if (sentryAndroidOptions != null && iSpan2 != null) {
                j4 j4VarNow = sentryAndroidOptions.getDateProvider().now();
                iSpan2.n("time_to_initial_display", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j4VarNow.b(iSpan2.s()))), b2.MILLISECOND);
                g(iSpan2, j4VarNow, null);
            } else if (iSpan2 != null && !iSpan2.isFinished()) {
                iSpan2.g();
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

    public final void n(Activity activity) {
        WeakHashMap weakHashMap;
        WeakHashMap weakHashMap2;
        Boolean boolValueOf;
        b5 b5Var;
        j4 j4Var;
        e9.b bVar;
        a3.f fVar;
        io.sentry.f1 f1Var;
        WeakReference weakReference = new WeakReference(activity);
        if (this.f12073i != null) {
            WeakHashMap weakHashMap3 = this.M;
            if (weakHashMap3.containsKey(activity)) {
                return;
            }
            if (!this.f12075w) {
                weakHashMap3.put(activity, v2.f13244a);
                if (this.f12074v.isEnableAutoTraceIdGeneration()) {
                    this.f12073i.r(null, new io.sentry.react.b(1));
                    return;
                }
                return;
            }
            Iterator it = weakHashMap3.entrySet().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                weakHashMap = this.I;
                weakHashMap2 = this.H;
                if (!zHasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                i((io.sentry.f1) entry.getValue(), (ISpan) weakHashMap2.get(entry.getKey()), (ISpan) weakHashMap.get(entry.getKey()));
            }
            String simpleName = activity.getClass().getSimpleName();
            io.sentry.android.core.performance.g gVarA = io.sentry.android.core.performance.f.b().a(this.f12074v);
            if (l0.i() && gVarA.c()) {
                b5 b5VarB = gVarA.b();
                boolValueOf = Boolean.valueOf(io.sentry.android.core.performance.f.b().f12376d == io.sentry.android.core.performance.e.COLD);
                b5Var = b5VarB;
            } else {
                boolValueOf = null;
                b5Var = null;
            }
            r6 r6Var = new r6();
            long deadlineTimeout = this.f12074v.getDeadlineTimeout();
            r6Var.f13094h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
            if (this.f12074v.isEnableActivityLifecycleTracingAutoFinish()) {
                r6Var.f13093g = this.f12074v.getIdleTimeout();
                r6Var.f67a = true;
            }
            r6Var.f13092f = true;
            r6Var.f13095i = new e(this, weakReference, simpleName);
            if (this.E || b5Var == null || boolValueOf == null) {
                j4Var = this.K;
                bVar = null;
            } else {
                e9.b bVar2 = io.sentry.android.core.performance.f.b().G;
                io.sentry.android.core.performance.f.b().G = null;
                bVar = bVar2;
                j4Var = b5Var;
            }
            r6Var.f68b = j4Var;
            r6Var.f13091e = bVar != null;
            r6Var.f70d = "auto.ui.activity";
            io.sentry.f1 f1VarK = this.f12073i.k(new q6(simpleName, io.sentry.protocol.g0.COMPONENT, "ui.load", bVar), r6Var);
            a3.f fVar2 = new a3.f(6, false);
            fVar2.f70d = "auto.ui.activity";
            if (this.E || b5Var == null || boolValueOf == null) {
                fVar = fVar2;
            } else {
                ISpan iSpanR = f1VarK.r(boolValueOf.booleanValue() ? "app.start.cold" : "app.start.warm", boolValueOf.booleanValue() ? "Cold Start" : "Warm Start", b5Var, io.sentry.k1.SENTRY, fVar2);
                f1VarK = f1VarK;
                fVar = fVar2;
                this.G = iSpanR;
                c();
            }
            String strConcat = simpleName.concat(" initial display");
            io.sentry.k1 k1Var = io.sentry.k1.SENTRY;
            j4 j4Var2 = j4Var;
            ISpan iSpanR2 = f1VarK.r("ui.load.initial_display", strConcat, j4Var2, k1Var, fVar);
            weakHashMap2.put(activity, iSpanR2);
            if (!this.f12076x || this.F == null || this.f12074v == null) {
                f1Var = f1VarK;
            } else {
                ISpan iSpanR3 = f1VarK.r("ui.load.full_display", simpleName.concat(" full display"), j4Var2, k1Var, fVar);
                f1Var = f1VarK;
                try {
                    weakHashMap.put(activity, iSpanR3);
                    this.L = this.f12074v.getExecutorService().h(new com.mkuczera.haptic.a(this, iSpanR3, iSpanR2), 25000L);
                } catch (RejectedExecutionException e10) {
                    this.f12074v.getLogger().g(SentryLevel.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
                }
            }
            v3 v3Var = this.f12073i;
            bc.i iVar = new bc.i(29, this, f1Var);
            v3Var.getClass();
            c4.d(null, iVar);
            weakHashMap3.put(activity, f1Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.f0 f0Var;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.f12077y) {
            onActivityPreCreated(activity, bundle);
        }
        io.sentry.r rVarA = this.O.a();
        try {
            if (this.f12073i != null && (sentryAndroidOptions = this.f12074v) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                String strT = mf.f.t(activity);
                v3 v3Var = this.f12073i;
                app.rive.runtime.kotlin.b bVar = new app.rive.runtime.kotlin.b(strT, 3);
                v3Var.getClass();
                c4.d(null, bVar);
            }
            n(activity);
            ISpan iSpan = (ISpan) this.H.get(activity);
            ISpan iSpan2 = (ISpan) this.I.get(activity);
            this.E = true;
            if (this.f12075w && iSpan != null && iSpan2 != null && (f0Var = this.F) != null) {
                f0Var.f12668a.add(new bc.i(27, iSpan, iSpan2));
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        WeakHashMap weakHashMap = this.I;
        WeakHashMap weakHashMap2 = this.H;
        WeakHashMap weakHashMap3 = this.J;
        io.sentry.r rVarA = this.O.a();
        try {
            io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) weakHashMap3.remove(activity);
            if (bVar != null) {
                ISpan iSpan = bVar.f12370d;
                if (iSpan != null && !iSpan.isFinished()) {
                    bVar.f12370d.f(m6.CANCELLED);
                }
                bVar.f12370d = null;
                ISpan iSpan2 = bVar.f12371e;
                if (iSpan2 != null && !iSpan2.isFinished()) {
                    bVar.f12371e.f(m6.CANCELLED);
                }
                bVar.f12371e = null;
            }
            boolean z5 = this.f12075w;
            WeakHashMap weakHashMap4 = this.M;
            if (z5) {
                ISpan iSpan3 = this.G;
                m6 m6Var = m6.CANCELLED;
                if (iSpan3 != null && !iSpan3.isFinished()) {
                    iSpan3.f(m6Var);
                }
                ISpan iSpan4 = (ISpan) weakHashMap2.get(activity);
                ISpan iSpan5 = (ISpan) weakHashMap.get(activity);
                m6 m6Var2 = m6.DEADLINE_EXCEEDED;
                if (iSpan4 != null && !iSpan4.isFinished()) {
                    iSpan4.f(m6Var2);
                }
                f(iSpan5, iSpan4);
                Future future = this.L;
                if (future != null) {
                    future.cancel(false);
                    this.L = null;
                }
                if (this.f12075w) {
                    i((io.sentry.f1) weakHashMap4.get(activity), null, null);
                }
                this.G = null;
                weakHashMap2.remove(activity);
                weakHashMap.remove(activity);
            }
            weakHashMap4.remove(activity);
            if (weakHashMap4.isEmpty() && !activity.isChangingConfigurations()) {
                this.E = false;
                this.K = new e5(new Date(0L), 0L);
                weakHashMap3.clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.r rVarA = this.O.a();
        try {
            if (!this.f12077y) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.J.get(activity);
        if (bVar != null) {
            ISpan iSpan = this.G;
            if (iSpan == null) {
                iSpan = (ISpan) this.M.get(activity);
            }
            if (bVar.f12368b == null || iSpan == null) {
                return;
            }
            ISpan iSpanA = io.sentry.android.core.performance.b.a(iSpan, bVar.f12367a.concat(".onCreate"), bVar.f12368b);
            bVar.f12370d = iSpanA;
            iSpanA.g();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.J.get(activity);
        if (bVar != null) {
            ISpan iSpan = this.G;
            if (iSpan == null) {
                iSpan = (ISpan) this.M.get(activity);
            }
            if (bVar.f12369c != null && iSpan != null) {
                ISpan iSpanA = io.sentry.android.core.performance.b.a(iSpan, bVar.f12367a.concat(".onStart"), bVar.f12369c);
                bVar.f12371e = iSpanA;
                iSpanA.g();
            }
            ISpan iSpan2 = bVar.f12370d;
            if (iSpan2 == null || bVar.f12371e == null) {
                return;
            }
            j4 j4VarP = iSpan2.p();
            j4 j4VarP2 = bVar.f12371e.p();
            if (j4VarP == null || j4VarP2 == null) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            i.f12225a.getClass();
            e5 e5Var = new e5();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long millis = timeUnit.toMillis(e5Var.b(bVar.f12370d.s()));
            long millis2 = timeUnit.toMillis(e5Var.b(j4VarP));
            long millis3 = timeUnit.toMillis(e5Var.b(bVar.f12371e.s()));
            long millis4 = timeUnit.toMillis(e5Var.b(j4VarP2));
            io.sentry.android.core.performance.c cVar = new io.sentry.android.core.performance.c();
            String description = bVar.f12370d.getDescription();
            long millis5 = timeUnit.toMillis(bVar.f12370d.s().d());
            io.sentry.android.core.performance.g gVar = cVar.f12372d;
            gVar.f12383d = description;
            gVar.f12384e = millis5;
            gVar.f12385i = jUptimeMillis - millis;
            gVar.f12386v = jUptimeMillis - millis2;
            String description2 = bVar.f12371e.getDescription();
            long millis6 = timeUnit.toMillis(bVar.f12371e.s().d());
            io.sentry.android.core.performance.g gVar2 = cVar.f12373e;
            gVar2.f12383d = description2;
            gVar2.f12384e = millis6;
            gVar2.f12385i = jUptimeMillis - millis3;
            gVar2.f12386v = jUptimeMillis - millis4;
            io.sentry.android.core.performance.f.b().f12382y.add(cVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        j4 e5Var;
        io.sentry.android.core.performance.b bVar = new io.sentry.android.core.performance.b(activity.getClass().getName());
        this.J.put(activity, bVar);
        if (this.E) {
            return;
        }
        v3 v3Var = this.f12073i;
        if (v3Var != null) {
            e5Var = v3Var.l().getDateProvider().now();
        } else {
            i.f12225a.getClass();
            e5Var = new e5();
        }
        this.K = e5Var;
        bVar.f12368b = e5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPrePaused(Activity activity) {
        j4 e5Var;
        this.E = true;
        v3 v3Var = this.f12073i;
        if (v3Var != null) {
            e5Var = v3Var.l().getDateProvider().now();
        } else {
            i.f12225a.getClass();
            e5Var = new e5();
        }
        this.K = e5Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreStarted(Activity activity) {
        j4 e5Var;
        io.sentry.android.core.performance.b bVar = (io.sentry.android.core.performance.b) this.J.get(activity);
        if (bVar != null) {
            SentryAndroidOptions sentryAndroidOptions = this.f12074v;
            if (sentryAndroidOptions != null) {
                e5Var = sentryAndroidOptions.getDateProvider().now();
            } else {
                i.f12225a.getClass();
                e5Var = new e5();
            }
            bVar.f12369c = e5Var;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.r rVarA = this.O.a();
        try {
            if (!this.f12077y) {
                onActivityPostStarted(activity);
            }
            if (this.f12075w) {
                final ISpan iSpan = (ISpan) this.H.get(activity);
                final ISpan iSpan2 = (ISpan) this.I.get(activity);
                if (activity.getWindow() != null) {
                    final int i7 = 0;
                    io.sentry.android.core.internal.util.h.a(activity, new Runnable(this) { // from class: io.sentry.android.core.d

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ ActivityLifecycleIntegration f12169e;

                        {
                            this.f12169e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    this.f12169e.l(iSpan2, iSpan);
                                    break;
                                default:
                                    this.f12169e.l(iSpan2, iSpan);
                                    break;
                            }
                        }
                    }, this.f12072e);
                } else {
                    final int i10 = 1;
                    new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.d

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ ActivityLifecycleIntegration f12169e;

                        {
                            this.f12169e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f12169e.l(iSpan2, iSpan);
                                    break;
                                default:
                                    this.f12169e.l(iSpan2, iSpan);
                                    break;
                            }
                        }
                    });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.r rVarA = this.O.a();
        try {
            if (!this.f12077y) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.f12075w) {
                this.N.b(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12074v = sentryAndroidOptions;
        this.f12073i = v3.f13245a;
        this.f12075w = sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
        this.F = this.f12074v.getFullyDisplayedReporter();
        this.f12076x = this.f12074v.isEnableTimeToFullDisplayTracing();
        this.f12071d.registerActivityLifecycleCallbacks(this);
        this.f12074v.getLogger().q(SentryLevel.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        c9.a.c("ActivityLifecycle");
    }
}
