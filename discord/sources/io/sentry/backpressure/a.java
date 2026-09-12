package io.sentry.backpressure;

import io.sentry.SentryLevel;
import io.sentry.a1;
import io.sentry.r;
import io.sentry.v3;
import io.sentry.w5;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w5 f12495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v3 f12496e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12497i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile Future f12498v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final io.sentry.util.a f12499w;

    public a(w5 w5Var) {
        v3 v3Var = v3.f13245a;
        this.f12497i = 0;
        this.f12498v = null;
        this.f12499w = new io.sentry.util.a();
        this.f12495d = w5Var;
        this.f12496e = v3Var;
    }

    @Override // io.sentry.backpressure.b
    public final int a() {
        return this.f12497i;
    }

    public final void b(int i7) {
        a1 executorService = this.f12495d.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        r rVarA = this.f12499w.a();
        try {
            try {
                this.f12498v = executorService.h(this, i7);
            } catch (RejectedExecutionException e10) {
                this.f12495d.getLogger().g(SentryLevel.WARNING, "Backpressure monitor reschedule task rejected", e10);
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

    @Override // io.sentry.backpressure.b
    public final void close() {
        Future future = this.f12498v;
        if (future != null) {
            r rVarA = this.f12499w.a();
            try {
                future.cancel(true);
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
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zE = this.f12496e.e();
        w5 w5Var = this.f12495d;
        if (zE) {
            if (this.f12497i > 0) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f12497i = 0;
        } else {
            int i7 = this.f12497i;
            if (i7 < 10) {
                this.f12497i = i7 + 1;
                w5Var.getLogger().q(SentryLevel.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f12497i));
            }
        }
        b(10000);
    }

    @Override // io.sentry.backpressure.b
    public final void start() {
        b(500);
    }
}
