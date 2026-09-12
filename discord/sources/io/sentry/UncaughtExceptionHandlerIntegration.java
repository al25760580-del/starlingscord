package io.sentry;

import java.io.Closeable;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class UncaughtExceptionHandlerIntegration implements l1, Thread.UncaughtExceptionHandler, Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final io.sentry.util.a f12024w = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f12025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v3 f12026e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public w5 f12027i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f12028v = false;

    public final void c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, HashSet hashSet) {
        if (uncaughtExceptionHandler == null) {
            w5 w5Var = this.f12027i;
            if (w5Var != null) {
                w5Var.getLogger().q(SentryLevel.DEBUG, "Found no UncaughtExceptionHandler to remove.", new Object[0]);
                return;
            }
            return;
        }
        if (!hashSet.add(uncaughtExceptionHandler)) {
            w5 w5Var2 = this.f12027i;
            if (w5Var2 != null) {
                w5Var2.getLogger().q(SentryLevel.WARNING, "Cycle detected in UncaughtExceptionHandler chain while removing handler.", new Object[0]);
                return;
            }
            return;
        }
        if (uncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) {
            UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) uncaughtExceptionHandler;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = uncaughtExceptionHandlerIntegration.f12025d;
            if (this != uncaughtExceptionHandler2) {
                c(uncaughtExceptionHandler2, hashSet);
                return;
            }
            uncaughtExceptionHandlerIntegration.f12025d = this.f12025d;
            w5 w5Var3 = this.f12027i;
            if (w5Var3 != null) {
                w5Var3.getLogger().q(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        r rVarA = f12024w.a();
        try {
            if (this == Thread.getDefaultUncaughtExceptionHandler()) {
                Thread.setDefaultUncaughtExceptionHandler(this.f12025d);
                w5 w5Var = this.f12027i;
                if (w5Var != null) {
                    w5Var.getLogger().q(SentryLevel.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
                }
            } else {
                c(Thread.getDefaultUncaughtExceptionHandler(), new HashSet());
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

    @Override // io.sentry.l1
    public final void register(x0 x0Var, w5 w5Var) {
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration;
        v3 v3Var;
        v3 v3Var2 = v3.f13245a;
        if (this.f12028v) {
            w5Var.getLogger().q(SentryLevel.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f12028v = true;
        this.f12026e = v3Var2;
        this.f12027i = w5Var;
        ILogger logger = w5Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.q(sentryLevel, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f12027i.isEnableUncaughtExceptionHandler()));
        if (this.f12027i.isEnableUncaughtExceptionHandler()) {
            r rVarA = f12024w.a();
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                if (defaultUncaughtExceptionHandler != null) {
                    this.f12027i.getLogger().q(sentryLevel, "default UncaughtExceptionHandler class='" + defaultUncaughtExceptionHandler.getClass().getName() + "'", new Object[0]);
                    if (!(defaultUncaughtExceptionHandler instanceof UncaughtExceptionHandlerIntegration) || (v3Var = (uncaughtExceptionHandlerIntegration = (UncaughtExceptionHandlerIntegration) defaultUncaughtExceptionHandler).f12026e) == null) {
                        this.f12025d = defaultUncaughtExceptionHandler;
                    } else {
                        y0 y0Var = c4.f12513a;
                        v3Var.getClass();
                        this.f12025d = uncaughtExceptionHandlerIntegration.f12025d;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(this);
                rVarA.close();
                this.f12027i.getLogger().q(sentryLevel, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
                c9.a.c("UncaughtExceptionHandler");
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

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        io.sentry.protocol.v vVar;
        w5 w5Var = this.f12027i;
        if (w5Var == null || this.f12026e == null) {
            return;
        }
        w5Var.getLogger().q(SentryLevel.INFO, "Uncaught exception received.", new Object[0]);
        try {
            s6 s6Var = new s6(this.f12027i.getFlushTimeoutMillis(), this.f12027i.getLogger());
            io.sentry.protocol.m mVar = new io.sentry.protocol.m();
            mVar.f12998v = Boolean.FALSE;
            mVar.f12995d = "UncaughtExceptionHandler";
            SentryEvent sentryEvent = new SentryEvent(new io.sentry.exception.a(mVar, th2, thread, false));
            sentryEvent.R = SentryLevel.FATAL;
            if (this.f12026e.n() == null && (vVar = sentryEvent.f12670d) != null) {
                s6Var.f(vVar);
            }
            Hint hintP = a5.l0.p(s6Var);
            boolean zEquals = this.f12026e.x(sentryEvent, hintP).equals(io.sentry.protocol.v.f13055e);
            io.sentry.hints.e eVar = (io.sentry.hints.e) hintP.c(io.sentry.hints.e.class, "sentry:eventDropReason");
            if ((!zEquals || io.sentry.hints.e.MULTITHREADED_DEDUPLICATION.equals(eVar)) && !s6Var.d()) {
                this.f12027i.getLogger().q(SentryLevel.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", sentryEvent.f12670d);
            }
        } catch (Throwable th3) {
            this.f12027i.getLogger().g(SentryLevel.ERROR, "Error sending uncaught exception to Sentry.", th3);
        }
        if (this.f12025d != null) {
            this.f12027i.getLogger().q(SentryLevel.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f12025d.uncaughtException(thread, th2);
        } else if (this.f12027i.isPrintUncaughtStackTrace()) {
            th2.printStackTrace();
        }
    }
}
