package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.v3;
import io.sentry.w5;
import io.sentry.z2;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EnvelopeFileObserverIntegration implements l1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s0 f12096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ILogger f12097e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12098i = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final io.sentry.util.a f12099v = new io.sentry.util.a();

    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        public /* synthetic */ OutboxEnvelopeFileObserverIntegration(int i7) {
            this();
        }
    }

    public final void c(w5 w5Var, String str) {
        s0 s0Var = new s0(str, new z2(v3.f13245a, w5Var.getEnvelopeReader(), w5Var.getSerializer(), w5Var.getLogger(), w5Var.getFlushTimeoutMillis(), w5Var.getMaxQueueSize()), w5Var.getLogger(), w5Var.getFlushTimeoutMillis());
        this.f12096d = s0Var;
        try {
            s0Var.startWatching();
            w5Var.getLogger().q(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration installed.", new Object[0]);
            c9.a.c("EnvelopeFileObserver");
        } catch (Throwable th2) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.f12099v.a();
        try {
            this.f12098i = true;
            rVarA.close();
            s0 s0Var = this.f12096d;
            if (s0Var != null) {
                s0Var.stopWatching();
                ILogger iLogger = this.f12097e;
                if (iLogger != null) {
                    iLogger.q(SentryLevel.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
                }
            }
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
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        this.f12097e = w5Var.getLogger();
        String outboxPath = w5Var.getOutboxPath();
        if (outboxPath == null) {
            this.f12097e.q(SentryLevel.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        this.f12097e.q(SentryLevel.DEBUG, "Registering EnvelopeFileObserverIntegration for path: %s", outboxPath);
        try {
            w5Var.getExecutorService().submit(new c1(this, w5Var, outboxPath, 3));
        } catch (Throwable th2) {
            this.f12097e.g(SentryLevel.DEBUG, "Failed to start EnvelopeFileObserverIntegration on executor thread.", th2);
        }
    }
}
