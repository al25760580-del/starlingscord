package l8;

import a3.h;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractExecutorService implements d, AutoCloseable {
    public static final /* synthetic */ int E = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f14973e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f14974i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final LinkedBlockingQueue f14975v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f14976w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicInteger f14977x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicInteger f14978y;

    public b(Executor executor) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f14972d = "SerialExecutor";
        this.f14973e = executor;
        this.f14974i = 1;
        this.f14975v = linkedBlockingQueue;
        this.f14976w = new h(26, this);
        this.f14977x = new AtomicInteger(0);
        this.f14978y = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        LinkedBlockingQueue linkedBlockingQueue = this.f14975v;
        boolean zOffer = linkedBlockingQueue.offer(runnable);
        String str = this.f14972d;
        if (!zOffer) {
            StringBuilder sbO = kk.b.o(str, " queue is full, size=");
            sbO.append(linkedBlockingQueue.size());
            throw new RejectedExecutionException(sbO.toString());
        }
        int size = linkedBlockingQueue.size();
        AtomicInteger atomicInteger = this.f14978y;
        int i7 = atomicInteger.get();
        if (size > i7 && atomicInteger.compareAndSet(i7, size)) {
            o8.a.o(b.class, "%s: max pending work in queue = %d", str, Integer.valueOf(size));
        }
        f();
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        c(runnable);
    }

    public final void f() {
        int i7 = this.f14977x.get();
        while (i7 < this.f14974i) {
            int i10 = i7 + 1;
            if (this.f14977x.compareAndSet(i7, i10)) {
                o8.a.p(b.class, "%s: starting worker %d of %d", this.f14972d, Integer.valueOf(i10), Integer.valueOf(this.f14974i));
                this.f14973e.execute(this.f14976w);
                return;
            } else {
                o8.a.q("%s: race in startWorkerIfNeeded; retrying", this.f14972d, b.class);
                i7 = this.f14977x.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
