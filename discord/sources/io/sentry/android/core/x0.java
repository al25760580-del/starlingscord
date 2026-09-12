package io.sentry.android.core;

import com.facebook.react.modules.appstate.AppStateModule;
import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.c4;
import io.sentry.v3;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements c0 {
    public final boolean E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12444e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.sentry.n f12445i;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f12449y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f12443d = new AtomicLong(0);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final io.sentry.util.e f12446v = new io.sentry.util.e(new hm.a(23));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final io.sentry.util.a f12447w = new io.sentry.util.a();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final v3 f12448x = v3.f13245a;
    public final io.sentry.transport.d F = io.sentry.transport.d.f13180d;

    public x0(long j, boolean z5, boolean z6) {
        this.f12444e = j;
        this.f12449y = z5;
        this.E = z6;
    }

    public final void a(String str) {
        if (this.E) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.f12008w = "navigation";
            breadcrumb.c(str, "state");
            breadcrumb.f12010y = "app.lifecycle";
            breadcrumb.F = SentryLevel.INFO;
            this.f12448x.c(breadcrumb);
        }
    }

    public final void b() {
        io.sentry.r rVarA = this.f12447w.a();
        try {
            io.sentry.n nVar = this.f12445i;
            if (nVar != null) {
                nVar.cancel();
                this.f12445i = null;
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

    @Override // io.sentry.android.core.c0
    public final void c() {
        b();
        this.F.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gc.o oVar = new gc.o(17, this);
        v3 v3Var = this.f12448x;
        v3Var.getClass();
        c4.d(null, oVar);
        AtomicLong atomicLong = this.f12443d;
        long j = atomicLong.get();
        if (j == 0 || j + this.f12444e <= jCurrentTimeMillis) {
            if (this.f12449y) {
                v3Var.p();
            }
            v3Var.l().getReplayController().start();
        }
        v3Var.l().getReplayController().resume();
        atomicLong.set(jCurrentTimeMillis);
        a("foreground");
    }

    @Override // io.sentry.android.core.c0
    public final void f() {
        this.F.getClass();
        this.f12443d.set(System.currentTimeMillis());
        this.f12448x.l().getReplayController().pause();
        io.sentry.r rVarA = this.f12447w.a();
        try {
            b();
            this.f12445i = new io.sentry.n(1, this);
            ((Timer) this.f12446v.a()).schedule(this.f12445i, this.f12444e);
            rVarA.close();
            a(AppStateModule.APP_STATE_BACKGROUND);
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
