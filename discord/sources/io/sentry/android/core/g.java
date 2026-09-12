package io.sentry.android.core;

import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.c3;
import io.sentry.c4;
import io.sentry.e5;
import io.sentry.f3;
import io.sentry.j4;
import io.sentry.n2;
import io.sentry.p6;
import io.sentry.w5;
import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements io.sentry.n0, io.sentry.transport.o {
    public io.sentry.x0 G;
    public Future H;
    public io.sentry.k I;
    public io.sentry.protocol.v K;
    public io.sentry.protocol.v L;
    public final AtomicBoolean M;
    public j4 N;
    public volatile boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public final io.sentry.util.a S;
    public final io.sentry.util.a T;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ILogger f12186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12187e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12188i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final io.sentry.a1 f12189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k0 f12190w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.o f12192y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12191x = false;
    public t E = null;
    public boolean F = false;
    public final ArrayList J = new ArrayList();

    public g(k0 k0Var, io.sentry.android.core.internal.util.o oVar, ILogger iLogger, String str, int i7, io.sentry.a1 a1Var) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        this.K = vVar;
        this.L = vVar;
        this.M = new AtomicBoolean(false);
        this.N = new e5();
        this.O = true;
        this.P = false;
        this.Q = false;
        this.R = 0;
        this.S = new io.sentry.util.a();
        this.T = new io.sentry.util.a();
        this.f12186d = iLogger;
        this.f12192y = oVar;
        this.f12190w = k0Var;
        this.f12187e = str;
        this.f12188i = i7;
        this.f12189v = a1Var;
    }

    @Override // io.sentry.n0
    public final void a(boolean z5) {
        io.sentry.r rVarA = this.S.a();
        try {
            this.R = 0;
            this.P = true;
            if (z5) {
                h(false);
                this.M.set(true);
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

    @Override // io.sentry.n0
    public final void b(f3 f3Var) {
        io.sentry.r rVarA = this.S.a();
        try {
            int i7 = f.f12180a[f3Var.ordinal()];
            if (i7 == 1) {
                int i10 = this.R - 1;
                this.R = i10;
                if (i10 > 0) {
                    rVarA.close();
                    return;
                } else {
                    if (i10 < 0) {
                        this.R = 0;
                    }
                    this.P = true;
                }
            } else if (i7 == 2) {
                this.P = true;
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

    @Override // io.sentry.n0
    public final void c(f3 f3Var, p6 p6Var) {
        io.sentry.r rVarA = this.S.a();
        try {
            if (this.O) {
                double dC = io.sentry.util.j.a().c();
                Double profileSessionSampleRate = p6Var.f12892a.getProfileSessionSampleRate();
                this.Q = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dC;
                this.O = false;
            }
            if (!this.Q) {
                this.f12186d.q(SentryLevel.DEBUG, "Profiler was not started due to sampling decision.", new Object[0]);
                rVarA.close();
                return;
            }
            int i7 = f.f12180a[f3Var.ordinal()];
            if (i7 == 1) {
                if (this.R < 0) {
                    this.R = 0;
                }
                this.R++;
            } else if (i7 == 2 && this.F) {
                this.f12186d.q(SentryLevel.DEBUG, "Profiler is already running.", new Object[0]);
                rVarA.close();
                return;
            }
            if (!this.F) {
                this.f12186d.q(SentryLevel.DEBUG, "Started Profiler.", new Object[0]);
                g();
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

    @Override // io.sentry.n0
    public final void d() {
        this.O = true;
    }

    @Override // io.sentry.n0
    public final io.sentry.protocol.v e() {
        return this.K;
    }

    public final void f() {
        io.sentry.x0 x0Var = this.G;
        if ((x0Var == null || x0Var == n2.f12827b) && c4.f() != n2.f12827b) {
            this.G = c4.f();
            this.I = c4.f().l().getCompositePerformanceCollector();
            io.sentry.transport.p pVarD = this.G.d();
            if (pVarD != null) {
                pVarD.f13199v.add(this);
            }
        }
    }

    public final void g() {
        f();
        this.f12190w.getClass();
        boolean z5 = this.f12191x;
        ILogger iLogger = this.f12186d;
        if (!z5) {
            this.f12191x = true;
            String str = this.f12187e;
            if (str == null) {
                iLogger.q(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            } else {
                int i7 = this.f12188i;
                if (i7 <= 0) {
                    iLogger.q(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i7));
                } else {
                    this.E = new t(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / i7, this.f12192y, null, this.f12186d);
                }
            }
        }
        if (this.E == null) {
            return;
        }
        io.sentry.x0 x0Var = this.G;
        if (x0Var != null) {
            io.sentry.transport.p pVarD = x0Var.d();
            if (pVarD != null && (pVarD.f(io.sentry.l.All) || pVarD.f(io.sentry.l.ProfileChunkUi))) {
                iLogger.q(SentryLevel.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
                h(false);
                return;
            } else {
                if (this.G.l().getConnectionStatusProvider().I() == io.sentry.k0.DISCONNECTED) {
                    iLogger.q(SentryLevel.WARNING, "Device is offline. Stopping profiler.", new Object[0]);
                    h(false);
                    return;
                }
                this.N = this.G.l().getDateProvider().now();
            }
        } else {
            this.N = new e5();
        }
        if (this.E.c() == null) {
            return;
        }
        this.F = true;
        io.sentry.protocol.v vVar = this.K;
        io.sentry.protocol.v vVar2 = io.sentry.protocol.v.f13055e;
        if (vVar.equals(vVar2)) {
            this.K = new io.sentry.protocol.v();
        }
        if (this.L.equals(vVar2)) {
            this.L = new io.sentry.protocol.v();
        }
        io.sentry.k kVar = this.I;
        if (kVar != null) {
            kVar.a(this.L.toString());
        }
        try {
            this.H = this.f12189v.h(new com.google.firebase.messaging.s(29, this), LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE);
        } catch (RejectedExecutionException e10) {
            iLogger.g(SentryLevel.ERROR, "Failed to schedule profiling chunk finish. Did you call Sentry.close()?", e10);
            this.P = true;
        }
    }

    public final void h(boolean z5) {
        f();
        io.sentry.r rVarA = this.S.a();
        try {
            Future future = this.H;
            if (future != null) {
                future.cancel(true);
            }
            if (this.E != null && this.F) {
                this.f12190w.getClass();
                io.sentry.k kVar = this.I;
                r rVarA2 = this.E.a(kVar != null ? kVar.c(this.L.toString()) : null, false);
                ILogger iLogger = this.f12186d;
                if (rVarA2 == null) {
                    iLogger.q(SentryLevel.ERROR, "An error occurred while collecting a profile chunk, and it won't be sent.", new Object[0]);
                } else {
                    io.sentry.r rVarA3 = this.T.a();
                    try {
                        this.J.add(new c3(this.K, this.L, (Map) rVarA2.f12395w, (File) rVarA2.f12394v, this.N));
                        rVarA3.close();
                    } catch (Throwable th2) {
                        try {
                            rVarA3.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                this.F = false;
                this.L = io.sentry.protocol.v.f13055e;
                io.sentry.x0 x0Var = this.G;
                if (x0Var != null) {
                    w5 w5VarL = x0Var.l();
                    try {
                        w5VarL.getExecutorService().submit(new c1(this, w5VarL, x0Var, 2));
                    } catch (Throwable th4) {
                        w5VarL.getLogger().g(SentryLevel.DEBUG, "Failed to send profile chunks.", th4);
                    }
                }
                if (!z5 || this.P) {
                    this.K = io.sentry.protocol.v.f13055e;
                    iLogger.q(SentryLevel.DEBUG, "Profile chunk finished.", new Object[0]);
                } else {
                    iLogger.q(SentryLevel.DEBUG, "Profile chunk finished. Starting a new one.", new Object[0]);
                    g();
                }
                rVarA.close();
                return;
            }
            io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
            this.K = vVar;
            this.L = vVar;
            rVarA.close();
        } catch (Throwable th5) {
            try {
                rVarA.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    @Override // io.sentry.transport.o
    public final void onRateLimitChanged(io.sentry.transport.p pVar) {
        if (pVar.f(io.sentry.l.All) || pVar.f(io.sentry.l.ProfileChunkUi)) {
            this.f12186d.q(SentryLevel.WARNING, "SDK is rate limited. Stopping profiler.", new Object[0]);
            h(false);
        }
    }
}
