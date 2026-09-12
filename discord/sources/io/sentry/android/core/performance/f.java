package io.sentry.android.core.performance;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.k0;
import io.sentry.android.core.l0;
import io.sentry.android.core.m0;
import io.sentry.android.core.v;
import io.sentry.j2;
import io.sentry.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a {
    public static volatile f M;
    public static long L = SystemClock.uptimeMillis();
    public static final io.sentry.util.a N = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f12376d = e.UNKNOWN;
    public v E = null;
    public io.sentry.android.core.g F = null;
    public e9.b G = null;
    public boolean H = false;
    public boolean I = true;
    public final AtomicInteger J = new AtomicInteger();
    public final AtomicBoolean K = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f12378i = new g();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g f12379v = new g();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f12380w = new g();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f12381x = new HashMap();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f12382y = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12377e = l0.i();

    public static f b() {
        if (M == null) {
            r rVarA = N.a();
            try {
                if (M == null) {
                    M = new f();
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
        return M;
    }

    public final g a(SentryAndroidOptions sentryAndroidOptions) {
        if (this.f12376d != e.UNKNOWN && this.f12377e) {
            if (sentryAndroidOptions.isEnablePerformanceV2()) {
                g gVar = this.f12378i;
                if (gVar.c() && gVar.a() <= TimeUnit.MINUTES.toMillis(1L)) {
                    return gVar;
                }
            }
            g gVar2 = this.f12379v;
            if (gVar2.c() && gVar2.a() <= TimeUnit.MINUTES.toMillis(1L)) {
                return gVar2;
            }
        }
        return new g();
    }

    public final synchronized void c() {
        if (!this.K.getAndSet(true)) {
            f fVarB = b();
            g gVar = fVarB.f12379v;
            gVar.getClass();
            gVar.f12386v = SystemClock.uptimeMillis();
            g gVar2 = fVarB.f12378i;
            gVar2.getClass();
            gVar2.f12386v = SystemClock.uptimeMillis();
        }
    }

    public final void d(Application application) {
        if (this.H) {
            return;
        }
        boolean z5 = true;
        this.H = true;
        if (!this.f12377e && !l0.i()) {
            z5 = false;
        }
        this.f12377e = z5;
        application.registerActivityLifecycleCallbacks(M);
        new Handler(Looper.getMainLooper()).post(new d(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m0.f12349e.a(activity);
        if (this.J.incrementAndGet() == 1 && !this.K.get()) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            g gVar = this.f12378i;
            long j = jUptimeMillis - gVar.f12385i;
            if (!this.f12377e || j > TimeUnit.MINUTES.toMillis(1L)) {
                this.f12376d = e.WARM;
                this.I = true;
                gVar.f12383d = null;
                gVar.f12385i = 0L;
                gVar.f12386v = 0L;
                gVar.f12384e = 0L;
                gVar.f12385i = SystemClock.uptimeMillis();
                gVar.f12384e = System.currentTimeMillis();
                gVar.d(jUptimeMillis);
                L = jUptimeMillis;
                this.f12381x.clear();
                g gVar2 = this.f12380w;
                gVar2.f12383d = null;
                gVar2.f12385i = 0L;
                gVar2.f12386v = 0L;
                gVar2.f12384e = 0L;
            } else {
                this.f12376d = bundle == null ? e.COLD : e.WARM;
            }
        }
        this.f12377e = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m0 m0Var = m0.f12349e;
        WeakReference weakReference = (WeakReference) m0Var.f12350d;
        if (weakReference == null || weakReference.get() == activity) {
            m0Var.f12350d = null;
        }
        if (this.J.decrementAndGet() != 0 || activity.isChangingConfigurations()) {
            return;
        }
        this.f12377e = false;
        this.I = true;
        this.K.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m0 m0Var = m0.f12349e;
        WeakReference weakReference = (WeakReference) m0Var.f12350d;
        if (weakReference == null || weakReference.get() == activity) {
            m0Var.f12350d = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m0.f12349e.a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m0.f12349e.a(activity);
        if (this.K.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            io.sentry.android.core.internal.util.h.a(activity, new d(this, 1), new k0(j2.f12781d));
        } else {
            new Handler(Looper.getMainLooper()).post(new d(this, 2));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m0 m0Var = m0.f12349e;
        WeakReference weakReference = (WeakReference) m0Var.f12350d;
        if (weakReference == null || weakReference.get() == activity) {
            m0Var.f12350d = null;
        }
    }
}
