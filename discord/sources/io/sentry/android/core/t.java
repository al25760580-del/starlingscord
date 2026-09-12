package io.sentry.android.core;

import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.discord.jank_stats.JankRecordStore;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.a3;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f12409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12410c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f12413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.o f12414g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final io.sentry.a1 f12417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ILogger f12418m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12408a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Future f12411d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public File f12412e = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayDeque f12415h = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayDeque f12416i = new ArrayDeque();
    public final ArrayDeque j = new ArrayDeque();
    public final HashMap k = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f12419n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final io.sentry.util.a f12420o = new io.sentry.util.a();

    public t(String str, int i7, io.sentry.android.core.internal.util.o oVar, io.sentry.a1 a1Var, ILogger iLogger) {
        com.facebook.imagepipeline.nativecode.c.H(str, "TracesFilesDirPath is required");
        this.f12409b = new File(str);
        this.f12410c = i7;
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "Logger is required");
        this.f12418m = iLogger;
        this.f12417l = a1Var;
        com.facebook.imagepipeline.nativecode.c.H(oVar, "SentryFrameMetricsCollector is required");
        this.f12414g = oVar;
    }

    public final r a(List list, boolean z5) {
        io.sentry.r rVarA = this.f12420o.a();
        try {
            if (!this.f12419n) {
                this.f12418m.q(SentryLevel.WARNING, "Profiler not running", new Object[0]);
                rVarA.close();
                return null;
            }
            try {
                Debug.stopMethodTracing();
            } catch (Throwable th2) {
                try {
                    this.f12418m.g(SentryLevel.ERROR, "Error while stopping profiling: ", th2);
                } catch (Throwable th3) {
                    this.f12419n = false;
                    throw th3;
                }
            }
            this.f12419n = false;
            this.f12414g.b(this.f12413f);
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            if (this.f12412e == null) {
                this.f12418m.q(SentryLevel.ERROR, "Trace file does not exists", new Object[0]);
                rVarA.close();
                return null;
            }
            if (!this.f12416i.isEmpty()) {
                this.k.put("slow_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.f12416i));
            }
            if (!this.j.isEmpty()) {
                this.k.put("frozen_frame_renders", new io.sentry.profilemeasurements.a("nanosecond", this.j));
            }
            if (!this.f12415h.isEmpty()) {
                this.k.put("screen_frame_rates", new io.sentry.profilemeasurements.a("hz", this.f12415h));
            }
            b(list);
            Future future = this.f12411d;
            if (future != null) {
                future.cancel(true);
                this.f12411d = null;
            }
            r rVar = new r(jElapsedRealtimeNanos, elapsedCpuTime, z5, this.f12412e, this.k);
            rVarA.close();
            return rVar;
        } catch (Throwable th4) {
            try {
                rVarA.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public final void b(List list) {
        long jElapsedRealtimeNanos = (SystemClock.elapsedRealtimeNanos() - this.f12408a) - TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        if (list != null) {
            ArrayDeque arrayDeque = new ArrayDeque(list.size());
            ArrayDeque arrayDeque2 = new ArrayDeque(list.size());
            ArrayDeque arrayDeque3 = new ArrayDeque(list.size());
            synchronized (list) {
                try {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a3 a3Var = (a3) it.next();
                        long j = a3Var.f12045d;
                        long j5 = j + jElapsedRealtimeNanos;
                        Double d6 = a3Var.f12042a;
                        Long l6 = a3Var.f12043b;
                        Long l7 = a3Var.f12044c;
                        if (d6 != null) {
                            arrayDeque3.add(new io.sentry.profilemeasurements.b(Long.valueOf(j5), d6, j));
                        }
                        if (l6 != null) {
                            arrayDeque.add(new io.sentry.profilemeasurements.b(Long.valueOf(j5), l6, j));
                        }
                        if (l7 != null) {
                            arrayDeque2.add(new io.sentry.profilemeasurements.b(Long.valueOf(j5), l7, j));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!arrayDeque3.isEmpty()) {
                this.k.put("cpu_usage", new io.sentry.profilemeasurements.a("percent", arrayDeque3));
            }
            if (!arrayDeque.isEmpty()) {
                this.k.put("memory_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque));
            }
            if (arrayDeque2.isEmpty()) {
                return;
            }
            this.k.put("memory_native_footprint", new io.sentry.profilemeasurements.a("byte", arrayDeque2));
        }
    }

    public final s c() {
        String strR;
        io.sentry.r rVarA = this.f12420o.a();
        try {
            int i7 = this.f12410c;
            if (i7 == 0) {
                this.f12418m.q(SentryLevel.WARNING, "Disabling profiling because intervaUs is set to %d", Integer.valueOf(i7));
                rVarA.close();
                return null;
            }
            if (this.f12419n) {
                this.f12418m.q(SentryLevel.WARNING, "Profiling has already started...", new Object[0]);
                rVarA.close();
                return null;
            }
            this.f12412e = new File(this.f12409b, ls.l.r().concat(".trace"));
            this.k.clear();
            this.f12415h.clear();
            this.f12416i.clear();
            this.j.clear();
            io.sentry.android.core.internal.util.o oVar = this.f12414g;
            q qVar = new q(this);
            if (oVar.f12326y) {
                strR = ls.l.r();
                oVar.f12325x.put(strR, qVar);
                oVar.c();
            } else {
                strR = null;
            }
            this.f12413f = strR;
            try {
                io.sentry.a1 a1Var = this.f12417l;
                if (a1Var != null) {
                    this.f12411d = a1Var.h(new p(0, this), JankRecordStore.FLUSH_INTERVAL_MS);
                }
            } catch (RejectedExecutionException e10) {
                this.f12418m.g(SentryLevel.ERROR, "Failed to call the executor. Profiling will not be automatically finished. Did you call Sentry.close()?", e10);
            }
            this.f12408a = SystemClock.elapsedRealtimeNanos();
            Date dateY = io.sentry.config.a.y();
            long elapsedCpuTime = Process.getElapsedCpuTime();
            try {
                Debug.startMethodTracingSampling(this.f12412e.getPath(), 3000000, this.f12410c);
                this.f12419n = true;
                s sVar = new s(this.f12408a, elapsedCpuTime, dateY);
                rVarA.close();
                return sVar;
            } catch (Throwable th2) {
                a(null, false);
                this.f12418m.g(SentryLevel.ERROR, "Unable to start a profile: ", th2);
                this.f12419n = false;
                rVarA.close();
                return null;
            }
        } catch (Throwable th3) {
            try {
                rVarA.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }
}
