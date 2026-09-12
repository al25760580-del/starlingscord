package ar;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends kotlinx.coroutines.c implements e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f2970i;

    public u0(Executor executor) {
        Method method;
        this.f2970i = executor;
        Method method2 = fr.a.f9363a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = fr.a.f9363a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // ar.e0
    public final m0 P(long j, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f2970i;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                Job job = (Job) coroutineContext.l(w.f2975e);
                if (job != null) {
                    job.f(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new l0(scheduledFutureSchedule) : kotlinx.coroutines.a.G.P(j, runnable, coroutineContext);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f2970i;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // ar.e0
    public final void e0(long j, k kVar) {
        Executor executor = this.f2970i;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            hi.o oVar = new hi.o(3, this, kVar);
            CoroutineContext coroutineContext = kVar.f2937w;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(oVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e10);
                Job job = (Job) coroutineContext.l(w.f2975e);
                if (job != null) {
                    job.f(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            kVar.w(new h(0, scheduledFutureSchedule));
        } else {
            kotlinx.coroutines.a.G.e0(j, kVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof u0) && ((u0) obj).f2970i == this.f2970i;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f2970i);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f2970i.execute(runnable);
        } catch (RejectedExecutionException e10) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e10);
            Job job = (Job) coroutineContext.l(w.f2975e);
            if (job != null) {
                job.f(cancellationException);
            }
            hr.e eVar = k0.f2938a;
            hr.d.f11103i.l0(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.f2970i.toString();
    }
}
