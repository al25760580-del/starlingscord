package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.h0;
import io.sentry.j4;
import io.sentry.k4;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j4 f13192e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ILogger f13193i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k4 f13194v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ga.l f13195w;

    public n(int i7, h0 h0Var, a aVar, ILogger iLogger, k4 k4Var) {
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), h0Var, aVar);
        this.f13192e = null;
        this.f13195w = new ga.l(17);
        this.f13191d = i7;
        this.f13193i = iLogger;
        this.f13194v = k4Var;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th2) {
        ga.l lVar = this.f13195w;
        try {
            super.afterExecute(runnable, th2);
        } finally {
            q qVar = (q) lVar.f9547e;
            int i7 = q.f13202d;
            qVar.releaseShared(1);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z5 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z5) {
                    shutdownNow();
                    z5 = true;
                }
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        ga.l lVar = this.f13195w;
        q qVar = (q) lVar.f9547e;
        q qVar2 = (q) lVar.f9547e;
        int iA = q.a(qVar);
        int i7 = this.f13191d;
        ILogger iLogger = this.f13193i;
        k4 k4Var = this.f13194v;
        if (iA >= i7) {
            this.f13192e = k4Var.now();
            iLogger.q(SentryLevel.WARNING, "Submit cancelled", new Object[0]);
            return new m();
        }
        q.b(qVar2);
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e10) {
            qVar2.releaseShared(1);
            this.f13192e = k4Var.now();
            iLogger.g(SentryLevel.WARNING, "Submit rejected by thread pool executor", e10);
            return new m();
        }
    }
}
