package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.v3;
import io.sentry.w5;
import io.sentry.x3;
import io.sentry.y3;
import java.io.Closeable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class SendCachedEnvelopeIntegration implements l1, io.sentry.l0, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y3 f12109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.util.e f12110e;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public io.sentry.m0 f12112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v3 f12113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SentryAndroidOptions f12114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x3 f12115y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f12111i = new AtomicBoolean(false);
    public final AtomicBoolean E = new AtomicBoolean(false);
    public final AtomicBoolean F = new AtomicBoolean(false);
    public final io.sentry.util.a G = new io.sentry.util.a();

    public SendCachedEnvelopeIntegration(y3 y3Var, io.sentry.util.e eVar) {
        this.f12109d = y3Var;
        this.f12110e = eVar;
    }

    public final void c(v3 v3Var, SentryAndroidOptions sentryAndroidOptions) {
        try {
            io.sentry.r rVarA = this.G.a();
            try {
                Future futureSubmit = sentryAndroidOptions.getExecutorService().submit(new c1(this, sentryAndroidOptions, v3Var, 0));
                if (((Boolean) this.f12110e.a()).booleanValue() && this.f12111i.compareAndSet(false, true)) {
                    sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Startup Crash marker exists, blocking flush.", new Object[0]);
                    try {
                        futureSubmit.get(sentryAndroidOptions.getStartupCrashFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (TimeoutException unused) {
                        sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Synchronous send timed out, continuing in the background.", new Object[0]);
                    }
                }
                sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "SendCachedEnvelopeIntegration installed.", new Object[0]);
                rVarA.close();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (RejectedExecutionException e10) {
            sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent. Did you call Sentry.close()?", e10);
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Failed to call the executor. Cached events will not be sent", th4);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.F.set(true);
        io.sentry.m0 m0Var = this.f12112v;
        if (m0Var != null) {
            m0Var.W(this);
        }
    }

    @Override // io.sentry.l0
    public final void onConnectionStatusChanged(io.sentry.k0 k0Var) {
        SentryAndroidOptions sentryAndroidOptions;
        v3 v3Var = this.f12113w;
        if (v3Var == null || (sentryAndroidOptions = this.f12114x) == null || k0Var == io.sentry.k0.DISCONNECTED) {
            return;
        }
        c(v3Var, sentryAndroidOptions);
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        v3 v3Var = v3.f13245a;
        this.f12113w = v3Var;
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12114x = sentryAndroidOptions;
        String cacheDirPath = w5Var.getCacheDirPath();
        ILogger logger = w5Var.getLogger();
        this.f12109d.getClass();
        if (!y3.T(cacheDirPath, logger)) {
            w5Var.getLogger().q(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
        } else {
            c9.a.c("SendCachedEnvelope");
            c(v3Var, this.f12114x);
        }
    }
}
