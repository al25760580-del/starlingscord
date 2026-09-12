package io.sentry.logger;

import a3.h;
import com.google.firebase.messaging.r;
import ga.l;
import io.sentry.SentryLevel;
import io.sentry.android.core.p;
import io.sentry.c5;
import io.sentry.d5;
import io.sentry.h4;
import io.sentry.transport.q;
import io.sentry.w5;
import io.sentry.y4;
import io.sentry.z4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a, io.sentry.metrics.a {
    public final l E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w5 f12804e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h4 f12805i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ConcurrentLinkedQueue f12806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f12807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile Future f12808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final io.sentry.util.a f12809y;

    public c(w5 w5Var, h4 h4Var, int i7) {
        this.f12803d = i7;
        switch (i7) {
            case 1:
                this.f12809y = new io.sentry.util.a();
                this.E = new l(17);
                this.f12804e = w5Var;
                this.f12805i = h4Var;
                this.f12806v = new ConcurrentLinkedQueue();
                this.f12807w = new r(w5Var);
                break;
            default:
                this.f12809y = new io.sentry.util.a();
                this.E = new l(17);
                this.f12804e = w5Var;
                this.f12805i = h4Var;
                this.f12806v = new ConcurrentLinkedQueue();
                this.f12807w = new r(w5Var);
                break;
        }
    }

    @Override // io.sentry.logger.a, io.sentry.metrics.a
    public void a(boolean z5) {
        switch (this.f12803d) {
            case 0:
                r rVar = this.f12807w;
                if (!z5) {
                    rVar.b(this.f12804e.getShutdownTimeoutMillis());
                    while (!this.f12806v.isEmpty()) {
                        e();
                    }
                } else {
                    h(true);
                    rVar.submit(new p(8, this));
                }
                break;
            default:
                r rVar2 = this.f12807w;
                if (!z5) {
                    rVar2.b(this.f12804e.getShutdownTimeoutMillis());
                    while (!this.f12806v.isEmpty()) {
                        d();
                    }
                } else {
                    g(true);
                    rVar2.submit(new p(9, this));
                }
                break;
        }
    }

    @Override // io.sentry.logger.a, io.sentry.metrics.a
    public final void b(long j) {
        switch (this.f12803d) {
            case 0:
                h(true);
                try {
                    l lVar = this.E;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    lVar.getClass();
                    ((q) lVar.f9547e).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
                } catch (InterruptedException e10) {
                    this.f12804e.getLogger().g(SentryLevel.ERROR, "Failed to flush log events", e10);
                    Thread.currentThread().interrupt();
                    return;
                }
                break;
            default:
                g(true);
                try {
                    l lVar2 = this.E;
                    TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                    lVar2.getClass();
                    ((q) lVar2.f9547e).tryAcquireSharedNanos(1, timeUnit2.toNanos(j));
                } catch (InterruptedException e11) {
                    this.f12804e.getLogger().g(SentryLevel.ERROR, "Failed to flush metrics events", e11);
                    Thread.currentThread().interrupt();
                }
                break;
        }
    }

    public void d() {
        ArrayList arrayList = new ArrayList(1000);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f12806v;
            c5 c5Var = (c5) concurrentLinkedQueue.poll();
            if (c5Var != null) {
                arrayList.add(c5Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 1000);
        if (arrayList.isEmpty()) {
            return;
        }
        d5 d5Var = new d5(arrayList);
        h4 h4Var = this.f12805i;
        h4Var.getClass();
        try {
            h4Var.y(h4Var.p(d5Var), null);
        } catch (IOException e10) {
            ((w5) h4Var.f12711b).getLogger().e(SentryLevel.WARNING, e10, "Capturing metrics failed.", new Object[0]);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            q qVar = (q) this.E.f9547e;
            int i10 = q.f13202d;
            qVar.releaseShared(1);
        }
    }

    public void e() {
        ArrayList arrayList = new ArrayList(100);
        do {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f12806v;
            y4 y4Var = (y4) concurrentLinkedQueue.poll();
            if (y4Var != null) {
                arrayList.add(y4Var);
            }
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        z4 z4Var = new z4(arrayList);
        h4 h4Var = this.f12805i;
        h4Var.getClass();
        try {
            h4Var.y(h4Var.o(z4Var), null);
        } catch (IOException e10) {
            ((w5) h4Var.f12711b).getLogger().e(SentryLevel.WARNING, e10, "Capturing logs failed.", new Object[0]);
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            q qVar = (q) this.E.f9547e;
            int i10 = q.f13202d;
            qVar.releaseShared(1);
        }
    }

    public void g(boolean z5) {
        io.sentry.r rVarA = this.f12809y.a();
        try {
            try {
                this.f12808x = this.f12807w.h(new h(24, this), z5 ? 0 : 5000);
            } catch (RejectedExecutionException e10) {
                this.f12804e.getLogger().g(SentryLevel.WARNING, "Metrics batch processor flush task rejected", e10);
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

    public void h(boolean z5) {
        io.sentry.r rVarA = this.f12809y.a();
        try {
            try {
                this.f12808x = this.f12807w.h(new h(23, this), z5 ? 0 : 5000);
            } catch (RejectedExecutionException e10) {
                this.f12804e.getLogger().g(SentryLevel.WARNING, "Logs batch processor flush task rejected", e10);
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
}
