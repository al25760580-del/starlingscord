package ni;

import af.w;
import hi.o;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Executor {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Logger f16945x = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f16946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f16947e = new ArrayDeque();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16948i = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f16949v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f16950w = new o(this);

    public h(Executor executor) {
        w.g(executor);
        this.f16946d = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        w.g(runnable);
        synchronized (this.f16947e) {
            int i7 = this.f16948i;
            if (i7 != 4 && i7 != 3) {
                long j = this.f16949v;
                gf.a aVar = new gf.a(1, runnable);
                this.f16947e.add(aVar);
                this.f16948i = 2;
                try {
                    this.f16946d.execute(this.f16950w);
                    if (this.f16948i != 2) {
                        return;
                    }
                    synchronized (this.f16947e) {
                        try {
                            if (this.f16949v == j && this.f16948i == 2) {
                                this.f16948i = 3;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f16947e) {
                        try {
                            int i10 = this.f16948i;
                            boolean z5 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f16947e.removeLastOccurrence(aVar)) {
                                z5 = false;
                            }
                            if (!(e10 instanceof RejectedExecutionException) || z5) {
                                throw e10;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
            }
            this.f16947e.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f16946d + "}";
    }
}
