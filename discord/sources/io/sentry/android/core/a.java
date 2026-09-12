package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.c4;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {
    public volatile long E;
    public final AtomicBoolean F;
    public final Context G;
    public final com.google.firebase.messaging.s H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f12138e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m0 f12139i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final hm.a f12140v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f12141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f12142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ILogger f12143y;

    public a(long j, boolean z5, x xVar, ILogger iLogger, Context context) {
        hm.a aVar = new hm.a(15);
        m0 m0Var = new m0(3);
        super("|ANR-WatchDog|");
        this.E = 0L;
        this.F = new AtomicBoolean(false);
        this.f12140v = aVar;
        this.f12142x = j;
        this.f12141w = 500L;
        this.f12137d = z5;
        this.f12138e = xVar;
        this.f12143y = iLogger;
        this.f12139i = m0Var;
        this.G = context;
        this.H = new com.google.firebase.messaging.s(this, aVar);
        if (j < 1000) {
            throw new IllegalArgumentException(String.format("ANRWatchDog: timeoutIntervalMillis has to be at least %d ms", 1000L));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        this.H.run();
        while (!isInterrupted()) {
            ((Handler) this.f12139i.f12350d).post(this.H);
            try {
                Thread.sleep(this.f12141w);
                this.f12140v.getClass();
                if (SystemClock.uptimeMillis() - this.E > this.f12142x) {
                    if (this.f12137d || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        ActivityManager activityManager = (ActivityManager) this.G.getSystemService("activity");
                        if (activityManager != null) {
                            try {
                                processesInErrorState = activityManager.getProcessesInErrorState();
                            } catch (Throwable th2) {
                                this.f12143y.g(SentryLevel.ERROR, "Error getting ActivityManager#getProcessesInErrorState.", th2);
                                processesInErrorState = null;
                            }
                            if (processesInErrorState != null) {
                                Iterator<ActivityManager.ProcessErrorStateInfo> it = processesInErrorState.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (it.next().condition == 2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (this.F.compareAndSet(false, true)) {
                            ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(a3.e.n(new StringBuilder("Application Not Responding for at least "), this.f12142x, " ms."), ((Handler) this.f12139i.f12350d).getLooper().getThread());
                            x xVar = this.f12138e;
                            Object obj = xVar.f12441e;
                            SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) xVar.f12442i;
                            a aVar = AnrIntegration.f12078w;
                            sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "ANR triggered with message: %s", applicationNotResponding.getMessage());
                            boolean zEquals = Boolean.TRUE.equals(f0.f12181w.f12185v);
                            String strL = "ANR for at least " + sentryAndroidOptions.getAnrTimeoutIntervalMillis() + " ms.";
                            if (zEquals) {
                                strL = a3.e.l("Background ", strL);
                            }
                            ApplicationNotResponding applicationNotResponding2 = new ApplicationNotResponding(strL, applicationNotResponding.f12095d);
                            io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                            mVar.f12995d = "ANR";
                            SentryEvent sentryEvent = new SentryEvent(new io.sentry.exception.a(mVar, applicationNotResponding2, applicationNotResponding2.f12095d, true));
                            sentryEvent.R = SentryLevel.ERROR;
                            c4.f().x(sentryEvent, a5.l0.p(new y(zEquals)));
                        }
                    } else {
                        this.f12143y.q(SentryLevel.DEBUG, "An ANR was detected but ignored because the debugger is connected.", new Object[0]);
                        this.F.set(true);
                    }
                }
            } catch (InterruptedException e10) {
                try {
                    Thread.currentThread().interrupt();
                    this.f12143y.q(SentryLevel.WARNING, "Interrupted: %s", e10.getMessage());
                    return;
                } catch (SecurityException unused) {
                    this.f12143y.q(SentryLevel.WARNING, "Failed to interrupt due to SecurityException: %s", e10.getMessage());
                    return;
                }
            }
        }
    }
}
