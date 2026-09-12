package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f13074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f13075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w5 f13077g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f13071a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Timer f13072b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f13073c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f13078h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13079i = 0;

    public q(SentryAndroidOptions sentryAndroidOptions) {
        boolean z5 = false;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "The options object is required.");
        this.f13077g = sentryAndroidOptions;
        this.f13074d = new ArrayList();
        this.f13075e = new ArrayList();
        for (s0 s0Var : sentryAndroidOptions.getPerformanceCollectors()) {
            if (s0Var instanceof u0) {
                this.f13074d.add((u0) s0Var);
            }
            if (s0Var instanceof t0) {
                this.f13075e.add((t0) s0Var);
            }
        }
        if (this.f13074d.isEmpty() && this.f13075e.isEmpty()) {
            z5 = true;
        }
        this.f13076f = z5;
    }

    @Override // io.sentry.k
    public final void a(String str) {
        if (this.f13076f) {
            this.f13077g.getLogger().q(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f13073c.containsKey(str)) {
            this.f13073c.put(str, new p(this, null));
        }
        if (this.f13078h.getAndSet(true)) {
            return;
        }
        r rVarA = this.f13071a.a();
        try {
            if (this.f13072b == null) {
                this.f13072b = new Timer(true);
            }
            this.f13072b.schedule(new n(0, this), 0L);
            this.f13072b.scheduleAtFixedRate(new o(this, new ArrayList()), 100L, 100L);
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // io.sentry.k
    public final void b(i6 i6Var) {
        Iterator it = this.f13075e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.h1) ((t0) it.next())).e(i6Var);
        }
    }

    @Override // io.sentry.k
    public final List c(String str) {
        ConcurrentHashMap concurrentHashMap = this.f13073c;
        p pVar = (p) concurrentHashMap.remove(str);
        this.f13077g.getLogger().q(SentryLevel.DEBUG, a3.e.l("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (pVar != null) {
            return pVar.f12860a;
        }
        return null;
    }

    @Override // io.sentry.k
    public final void close() {
        this.f13077g.getLogger().q(SentryLevel.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f13073c.clear();
        Iterator it = this.f13075e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.h1) ((t0) it.next())).d();
        }
        if (this.f13078h.getAndSet(false)) {
            r rVarA = this.f13071a.a();
            try {
                if (this.f13072b != null) {
                    this.f13072b.cancel();
                    this.f13072b = null;
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

    @Override // io.sentry.k
    public final void d(i6 i6Var) {
        Iterator it = this.f13075e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.h1) ((t0) it.next())).f(i6Var);
        }
    }

    @Override // io.sentry.k
    public final void e(e6 e6Var) {
        if (this.f13076f) {
            this.f13077g.getLogger().q(SentryLevel.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f13075e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.h1) ((t0) it.next())).f(e6Var);
        }
        String string = e6Var.f12642a.toString();
        ConcurrentHashMap concurrentHashMap = this.f13073c;
        if (!concurrentHashMap.containsKey(string)) {
            concurrentHashMap.put(string, new p(this, e6Var));
        }
        a(string);
    }

    @Override // io.sentry.k
    public final List f(f1 f1Var) {
        this.f13077g.getLogger().q(SentryLevel.DEBUG, "stop collecting performance info for transactions %s (%s)", f1Var.getName(), f1Var.o().f12782d.toString());
        Iterator it = this.f13075e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.h1) ((t0) it.next())).e(f1Var);
        }
        return c(f1Var.k().toString());
    }
}
