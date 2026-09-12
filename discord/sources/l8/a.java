package l8;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f14971d = new a();

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this == ForkJoinPool.commonPool()) {
            return;
        }
        boolean z5 = false;
        boolean z6 = false;
        while (!z5) {
            try {
                TimeUnit timeUnit = TimeUnit.DAYS;
                z5 = true;
            } catch (InterruptedException unused) {
                if (!z6) {
                    shutdownNow();
                    z6 = true;
                }
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
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
    public final List shutdownNow() {
        return Collections.EMPTY_LIST;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
    }
}
