package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.Window;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.k0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Application.ActivityLifecycleCallbacks {
    public static final long K = TimeUnit.SECONDS.toNanos(1);
    public static final long L = TimeUnit.MILLISECONDS.toNanos(700);
    public static final /* synthetic */ int M = 0;
    public final d E;
    public final m F;
    public Choreographer G;
    public final Field H;
    public long I;
    public long J;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0 f12320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f12321e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ILogger f12322i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Handler f12323v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f12324w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ConcurrentHashMap f12325x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f12326y;

    public o(Context context, final ILogger iLogger, k0 k0Var) {
        d dVar = new d();
        this.f12321e = new CopyOnWriteArraySet();
        this.f12325x = new ConcurrentHashMap();
        this.f12326y = false;
        this.I = 0L;
        this.J = 0L;
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "Logger is required");
        this.f12322i = iLogger;
        com.facebook.imagepipeline.nativecode.c.H(k0Var, "BuildInfoProvider is required");
        this.f12320d = k0Var;
        this.E = dVar;
        if (context instanceof Application) {
            this.f12326y = true;
            HandlerThread handlerThread = new HandlerThread("io.sentry.android.core.internal.util.SentryFrameMetricsCollector");
            handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: io.sentry.android.core.internal.util.l
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th2) {
                    iLogger.g(SentryLevel.ERROR, "Error during frames measurements.", th2);
                }
            });
            handlerThread.start();
            this.f12323v = new Handler(handlerThread.getLooper());
            ((Application) context).registerActivityLifecycleCallbacks(this);
            new Handler(Looper.getMainLooper()).post(new com.mkuczera.haptic.a(17, this, iLogger));
            try {
                Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
                this.H = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                iLogger.g(SentryLevel.ERROR, "Unable to get the frame timestamp from the choreographer: ", e10);
            }
            this.F = new m(0, this, k0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    public static void a(o oVar, k0 k0Var, Window window, FrameMetrics frameMetrics) {
        long jLongValue;
        Field field;
        long jNanoTime = System.nanoTime();
        k0Var.getClass();
        int i7 = Build.VERSION.SDK_INT;
        float refreshRate = i7 >= 30 ? window.getContext().getDisplay().getRefreshRate() : window.getWindowManager().getDefaultDisplay().getRefreshRate();
        float f2 = K;
        long metric = frameMetrics.getMetric(5) + frameMetrics.getMetric(4) + frameMetrics.getMetric(3) + frameMetrics.getMetric(2) + frameMetrics.getMetric(1) + frameMetrics.getMetric(0);
        long jMax = Math.max(0L, metric - ((long) (f2 / refreshRate)));
        oVar.f12320d.getClass();
        if (i7 >= 26) {
            jLongValue = frameMetrics.getMetric(10);
        } else {
            Choreographer choreographer = oVar.G;
            if (choreographer == null || (field = oVar.H) == null) {
                jLongValue = -1;
            } else {
                try {
                    Long l6 = (Long) field.get(choreographer);
                    if (l6 != null) {
                        jLongValue = l6.longValue();
                    } else {
                        jLongValue = -1;
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
        if (jLongValue < 0) {
            jLongValue = jNanoTime - metric;
        }
        long jMax2 = Math.max(jLongValue, oVar.J);
        if (jMax2 == oVar.I) {
            return;
        }
        oVar.I = jMax2;
        oVar.J = jMax2 + metric;
        boolean z5 = metric > ((long) (f2 / (refreshRate - 1.0f)));
        boolean z6 = z5 && metric > L;
        Iterator it = oVar.f12325x.values().iterator();
        while (it.hasNext()) {
            long j = metric;
            long j5 = jMax;
            ((n) it.next()).b(jMax2, oVar.J, j, j5, z5, z6, refreshRate);
            jMax = j5;
            metric = j;
        }
    }

    public final void b(String str) {
        if (this.f12326y) {
            ConcurrentHashMap concurrentHashMap = this.f12325x;
            if (str != null) {
                concurrentHashMap.remove(str);
            }
            WeakReference weakReference = this.f12324w;
            Window window = weakReference != null ? (Window) weakReference.get() : null;
            if (window == null || !concurrentHashMap.isEmpty()) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new k(this, window, 1));
        }
    }

    public final void c() {
        WeakReference weakReference = this.f12324w;
        Window window = weakReference != null ? (Window) weakReference.get() : null;
        if (window == null || !this.f12326y || this.f12325x.isEmpty() || this.f12323v == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new k(this, window, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Window window = activity.getWindow();
        WeakReference weakReference = this.f12324w;
        if (weakReference == null || weakReference.get() != window) {
            this.f12324w = new WeakReference(window);
            c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new k(this, activity.getWindow(), 1));
        WeakReference weakReference = this.f12324w;
        if (weakReference == null || weakReference.get() != activity.getWindow()) {
            return;
        }
        this.f12324w = null;
    }
}
