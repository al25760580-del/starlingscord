package io.sentry;

import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class u3 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IScope f13215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IScope f13216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IScope f13217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f13218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f13219e;

    public u3(IScope iScope, IScope iScope2, IScope iScope3) {
        this.f13219e = new j(iScope3, iScope2, iScope);
        this.f13215a = iScope;
        this.f13216b = iScope2;
        this.f13217c = iScope3;
        w5 w5VarL = l();
        com.facebook.imagepipeline.nativecode.c.H(w5VarL, "SentryOptions is required.");
        if (w5VarL.getDsn() == null || w5VarL.getDsn().isEmpty()) {
            throw new IllegalArgumentException("Scopes requires a DSN to be instantiated. Considering using the NoOpScopes if no DSN is available.");
        }
        this.f13218d = w5VarL.getCompositePerformanceCollector();
    }

    @Override // io.sentry.x0
    public final void a(boolean z5) {
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'close' call is a no-op.", new Object[0]);
            return;
        }
        try {
            for (l1 l1Var : l().getIntegrations()) {
                if (l1Var instanceof Closeable) {
                    try {
                        ((Closeable) l1Var).close();
                    } catch (Throwable th2) {
                        l().getLogger().q(SentryLevel.WARNING, "Failed to close the integration {}.", l1Var, th2);
                    }
                }
            }
            boolean zIsEnabled = isEnabled();
            j jVar = this.f13219e;
            if (zIsEnabled) {
                try {
                    jVar.b(null).clear();
                } catch (Throwable th3) {
                    l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th3);
                }
            } else {
                l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t3 t3Var = t3.ISOLATION;
            if (isEnabled()) {
                try {
                    jVar.b(t3Var).clear();
                } catch (Throwable th4) {
                    l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th4);
                }
            } else {
                l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            l().getBackpressureMonitor().close();
            l().getTransactionProfiler().close();
            l().getContinuousProfiler().a(true);
            l().getCompositePerformanceCollector().close();
            l().getConnectionStatusProvider().close();
            a1 executorService = l().getExecutorService();
            if (z5) {
                try {
                    executorService.submit(new com.mkuczera.haptic.a(12, this, executorService));
                } catch (RejectedExecutionException e10) {
                    l().getLogger().g(SentryLevel.WARNING, "Failed to submit executor service shutdown task during restart. Shutting down synchronously.", e10);
                    executorService.b(l().getShutdownTimeoutMillis());
                }
            } else {
                executorService.b(l().getShutdownTimeoutMillis());
            }
            t3 t3Var2 = t3.CURRENT;
            if (isEnabled()) {
                try {
                    jVar.b(t3Var2).C().a(z5);
                } catch (Throwable th5) {
                    l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th5);
                }
            } else {
                l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t3 t3Var3 = t3.ISOLATION;
            if (isEnabled()) {
                try {
                    jVar.b(t3Var3).C().a(z5);
                } catch (Throwable th6) {
                    l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th6);
                }
            } else {
                l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            }
            t3 t3Var4 = t3.GLOBAL;
            if (!isEnabled()) {
                l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
                return;
            }
            try {
                jVar.b(t3Var4).C().a(z5);
            } catch (Throwable th7) {
                l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th7);
            }
        } catch (Throwable th8) {
            l().getLogger().g(SentryLevel.ERROR, "Error while closing the Scopes.", th8);
        }
    }

    @Override // io.sentry.x0
    public final void b(long j) {
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'flush' call is a no-op.", new Object[0]);
            return;
        }
        try {
            this.f13219e.C().b(j);
        } catch (Throwable th2) {
            l().getLogger().g(SentryLevel.ERROR, "Error in the 'client.flush'.", th2);
        }
    }

    @Override // io.sentry.x0
    public final void c(Breadcrumb breadcrumb) {
        g(breadcrumb, new Hint());
    }

    @Override // io.sentry.x0
    public final io.sentry.transport.p d() {
        return this.f13219e.C().d();
    }

    @Override // io.sentry.x0
    public final boolean e() {
        return this.f13219e.C().e();
    }

    @Override // io.sentry.x0
    public final void f(String str, String str2) {
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'setTag' call is a no-op.", new Object[0]);
        } else if (str == null || str2 == null) {
            l().getLogger().q(SentryLevel.WARNING, "setTag called with null parameter.", new Object[0]);
        } else {
            this.f13219e.f(str, str2);
        }
    }

    @Override // io.sentry.x0
    public final void g(Breadcrumb breadcrumb, Hint hint) {
        if (isEnabled()) {
            this.f13219e.g(breadcrumb, hint);
        } else {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'addBreadcrumb' call is a no-op.", new Object[0]);
        }
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v h(d3 d3Var) {
        com.facebook.imagepipeline.nativecode.c.H(d3Var, "profilingContinuousData is required");
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            return this.f13219e.C().h(d3Var);
        } catch (Throwable th2) {
            l().getLogger().g(SentryLevel.ERROR, "Error while capturing profile chunk with id: " + d3Var.f12614i, th2);
            return vVar;
        }
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v i(e4.c cVar, Hint hint) {
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'captureEnvelope' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            io.sentry.protocol.v vVarI = this.f13219e.C().i(cVar, hint);
            return vVarI != null ? vVarI : vVar;
        } catch (Throwable th2) {
            l().getLogger().g(SentryLevel.ERROR, "Error while capturing envelope.", th2);
            return vVar;
        }
    }

    @Override // io.sentry.x0
    public final boolean isEnabled() {
        return this.f13219e.C().isEnabled();
    }

    @Override // io.sentry.x0
    public final void j(ac.b bVar) {
        if (!isEnabled()) {
            try {
                bVar.g(m2.f12815b);
                return;
            } catch (Throwable th2) {
                l().getLogger().g(SentryLevel.ERROR, "Error in the 'withScope' callback.", th2);
                return;
            }
        }
        IScope iScopeClone = this.f13215a.m1261clone();
        try {
            b1 b1VarA = c4.f12513a.a(new u3(iScopeClone, this.f13216b, this.f13217c));
            try {
                bVar.g(iScopeClone);
                b1VarA.close();
            } catch (Throwable th3) {
                try {
                    b1VarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            l().getLogger().g(SentryLevel.ERROR, "Error in the 'withScope' callback.", th5);
        }
    }

    @Override // io.sentry.x0
    public final f1 k(q6 q6Var, r6 r6Var) {
        Double dValueOf;
        q6Var.F = (String) r6Var.f70d;
        boolean zIsEnabled = isEnabled();
        f1 f1VarA = v2.f13244a;
        if (!zIsEnabled) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        } else if (io.sentry.util.k.a(q6Var.F, l().getIgnoredSpanOrigins())) {
            l().getLogger().q(SentryLevel.DEBUG, "Returning no-op for span origin %s as the SDK has been configured to ignore it", q6Var.F);
        } else if (!l().getInstrumenter().equals(q6Var.I)) {
            l().getLogger().q(SentryLevel.DEBUG, "Returning no-op for instrumenter %s as the SDK has been configured to use instrumenter %s", q6Var.I, l().getInstrumenter());
        } else if (l().isTracingEnabled()) {
            c cVar = q6Var.J;
            if (cVar == null || (dValueOf = cVar.f12505d) == null) {
                Double d6 = ((c) this.f13219e.z().f7995v).f12505d;
                dValueOf = Double.valueOf(d6 == null ? 0.0d : d6.doubleValue());
            }
            e9.b bVarA = l().getInternalTracesSampler().a(new e4.r(q6Var, dValueOf));
            Boolean bool = (Boolean) bVarA.f8109d;
            q6Var.a(bVarA);
            e1 spanFactory = l().getSpanFactory();
            if (bool.booleanValue() && l().isContinuousProfilingEnabled()) {
                f3 profileLifecycle = l().getProfileLifecycle();
                f3 f3Var = f3.TRACE;
                if (profileLifecycle == f3Var && q6Var.L.equals(io.sentry.protocol.v.f13055e)) {
                    l().getContinuousProfiler().c(f3Var, l().getInternalTracesSampler());
                }
            }
            f1VarA = spanFactory.a(q6Var, this, r6Var, this.f13218d);
            if (bool.booleanValue() && ((Boolean) bVarA.f8112v).booleanValue()) {
                g1 transactionProfiler = l().getTransactionProfiler();
                if (!transactionProfiler.isRunning()) {
                    transactionProfiler.start();
                    transactionProfiler.d(f1VarA);
                } else if (r6Var.f13091e) {
                    transactionProfiler.d(f1VarA);
                }
            }
        } else {
            l().getLogger().q(SentryLevel.INFO, "Tracing is disabled and this 'startTransaction' returns a no-op.", new Object[0]);
        }
        if (q3.ON == ((q3) r6Var.f69c)) {
            f1VarA.makeCurrent();
        }
        return f1VarA;
    }

    @Override // io.sentry.x0
    public final w5 l() {
        return this.f13219e.f12777a.l();
    }

    @Override // io.sentry.x0
    public final Boolean m() {
        i4 i4Var = i4.f12740d;
        String cacheDirPath = l().getCacheDirPath();
        boolean zIsEnableAutoSessionTracking = l().isEnableAutoSessionTracking();
        r rVarA = i4Var.f12743c.a();
        try {
            if (i4Var.f12741a) {
                Boolean bool = i4Var.f12742b;
                rVarA.close();
                return bool;
            }
            if (cacheDirPath == null) {
                rVarA.close();
                return null;
            }
            boolean z5 = true;
            i4Var.f12741a = true;
            File file = new File(cacheDirPath, "last_crash");
            File file2 = new File(cacheDirPath, ".sentry-native/last_crash");
            try {
                try {
                    if (!file.exists()) {
                        if (!file2.exists()) {
                            z5 = false;
                        } else if (!zIsEnableAutoSessionTracking) {
                            file2.delete();
                        }
                        i4Var.f12742b = Boolean.valueOf(z5);
                        rVarA.close();
                        return i4Var.f12742b;
                    }
                    file.delete();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            i4Var.f12742b = Boolean.valueOf(z5);
            rVarA.close();
            return i4Var.f12742b;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.x0
    public final f1 n() {
        if (isEnabled()) {
            return this.f13219e.n();
        }
        l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'getTransaction' call is a no-op.", new Object[0]);
        return null;
    }

    @Override // io.sentry.x0
    public final void o() {
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'endSession' call is a no-op.", new Object[0]);
            return;
        }
        j jVar = this.f13219e;
        h6 h6VarO = jVar.o();
        if (h6VarO != null) {
            jVar.C().c(h6VarO, a5.l0.p(new k8.a()));
        }
    }

    @Override // io.sentry.x0
    public final void p() {
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'startSession' call is a no-op.", new Object[0]);
            return;
        }
        j jVar = this.f13219e;
        io.sentry.internal.debugmeta.c cVarP = jVar.p();
        if (cVarP == null) {
            l().getLogger().q(SentryLevel.WARNING, "Session could not be started.", new Object[0]);
            return;
        }
        h6 h6Var = (h6) cVarP.f12759e;
        if (h6Var != null) {
            jVar.C().c(h6Var, a5.l0.p(new k8.a()));
        }
        jVar.C().c((h6) cVarP.f12760i, a5.l0.p(new io.sentry.hints.j(0)));
    }

    @Override // io.sentry.x0
    public final void r(t3 t3Var, r3 r3Var) {
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'configureScope' call is a no-op.", new Object[0]);
            return;
        }
        try {
            r3Var.g(this.f13219e.b(t3Var));
        } catch (Throwable th2) {
            l().getLogger().g(SentryLevel.ERROR, "Error in the 'configureScope' callback.", th2);
        }
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v s(y5 y5Var, Hint hint) {
        IScope iScope = this.f13219e;
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'captureReplay' call is a no-op.", new Object[0]);
            return vVar;
        }
        try {
            return iScope.C().f(y5Var, iScope, hint);
        } catch (Throwable th2) {
            l().getLogger().g(SentryLevel.ERROR, "Error while capturing replay", th2);
            return vVar;
        }
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v t(Throwable th2, Hint hint) {
        io.sentry.protocol.v vVarK = io.sentry.protocol.v.f13055e;
        boolean zIsEnabled = isEnabled();
        IScope iScope = this.f13219e;
        if (!zIsEnabled) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'captureException' call is a no-op.", new Object[0]);
        } else if (th2 == null) {
            l().getLogger().q(SentryLevel.WARNING, "captureException called with null parameter.", new Object[0]);
        } else {
            try {
                SentryEvent sentryEvent = new SentryEvent(th2);
                iScope.I(sentryEvent);
                vVarK = iScope.C().k(sentryEvent, iScope, hint);
            } catch (Throwable th3) {
                l().getLogger().g(SentryLevel.ERROR, "Error while capturing exception: " + th2.getMessage(), th3);
            }
        }
        iScope.N(vVarK);
        return vVarK;
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v u(String str, SentryLevel sentryLevel) {
        io.sentry.protocol.v vVarK = io.sentry.protocol.v.f13055e;
        boolean zIsEnabled = isEnabled();
        IScope iScope = this.f13219e;
        if (!zIsEnabled) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'captureMessage' call is a no-op.", new Object[0]);
        } else if (str == null) {
            l().getLogger().q(SentryLevel.WARNING, "captureMessage called with null parameter.", new Object[0]);
        } else {
            try {
                z0 z0VarC = iScope.C();
                z0VarC.getClass();
                SentryEvent sentryEvent = new SentryEvent();
                io.sentry.protocol.n nVar = new io.sentry.protocol.n();
                nVar.f13002d = str;
                sentryEvent.N = nVar;
                sentryEvent.R = sentryLevel;
                vVarK = z0VarC.k(sentryEvent, iScope, null);
            } catch (Throwable th2) {
                l().getLogger().g(SentryLevel.ERROR, "Error while capturing message: ".concat(str), th2);
            }
        }
        iScope.N(vVarK);
        return vVarK;
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v v(io.sentry.protocol.d0 d0Var, o6 o6Var, Hint hint, g3 g3Var) {
        io.sentry.protocol.d0 d0Var2;
        IScope iScope = this.f13219e;
        ArrayList arrayList = d0Var.P;
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'captureTransaction' call is a no-op.", new Object[0]);
            return vVar;
        }
        if (d0Var.O == null) {
            l().getLogger().q(SentryLevel.WARNING, "Transaction: %s is not finished and this 'captureTransaction' call is a no-op.", d0Var.f12670d);
            return vVar;
        }
        Boolean bool = Boolean.TRUE;
        j6 j6VarI = d0Var.f12671e.i();
        e9.b bVar = j6VarI == null ? null : j6VarI.f12785v;
        if (!bool.equals(Boolean.valueOf(bVar != null ? ((Boolean) bVar.f8109d).booleanValue() : false))) {
            l().getLogger().q(SentryLevel.DEBUG, "Transaction %s was dropped due to sampling decision.", d0Var.f12670d);
            if (l().getBackpressureMonitor().a() > 0) {
                io.sentry.clientreport.f clientReportRecorder = l().getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.BACKPRESSURE;
                clientReportRecorder.b(dVar, l.Transaction);
                l().getClientReportRecorder().m(dVar, l.Span, arrayList.size() + 1);
                return vVar;
            }
            io.sentry.clientreport.f clientReportRecorder2 = l().getClientReportRecorder();
            io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.SAMPLE_RATE;
            clientReportRecorder2.b(dVar2, l.Transaction);
            l().getClientReportRecorder().m(dVar2, l.Span, arrayList.size() + 1);
            return vVar;
        }
        try {
            d0Var2 = d0Var;
            try {
                return iScope.C().j(d0Var2, o6Var, iScope, hint, g3Var);
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                l().getLogger().g(SentryLevel.ERROR, "Error while capturing transaction with id: " + d0Var2.f12670d, th3);
                return vVar;
            }
        } catch (Throwable th4) {
            th = th4;
            d0Var2 = d0Var;
        }
    }

    @Override // io.sentry.x0
    public final x0 w(String str) {
        return new u3(this.f13215a.m1261clone(), this.f13216b.m1261clone(), this.f13217c);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v x(SentryEvent sentryEvent, Hint hint) {
        IScope iScope = this.f13219e;
        io.sentry.protocol.v vVarK = io.sentry.protocol.v.f13055e;
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Instance is disabled and this 'captureEvent' call is a no-op.", new Object[0]);
            return vVarK;
        }
        try {
            iScope.I(sentryEvent);
            vVarK = iScope.C().k(sentryEvent, iScope, hint);
            iScope.N(vVarK);
            return vVarK;
        } catch (Throwable th2) {
            l().getLogger().g(SentryLevel.ERROR, "Error while capturing event with id: " + sentryEvent.f12670d, th2);
            return vVarK;
        }
    }

    @Override // io.sentry.x0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final q0 m1266clone() {
        if (!isEnabled()) {
            l().getLogger().q(SentryLevel.WARNING, "Disabled Scopes cloned.", new Object[0]);
        }
        return new j0((u3) w("scopes clone"));
    }
}
