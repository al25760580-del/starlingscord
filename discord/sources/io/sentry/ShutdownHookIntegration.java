package io.sentry;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class ShutdownHookIntegration implements l1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runtime f12019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f12020e;

    public ShutdownHookIntegration() {
        Runtime runtime = Runtime.getRuntime();
        com.facebook.imagepipeline.nativecode.c.H(runtime, "Runtime is required");
        this.f12019d = runtime;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12020e != null) {
            try {
                this.f12019d.removeShutdownHook(this.f12020e);
            } catch (IllegalStateException e10) {
                String message = e10.getMessage();
                if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                    throw e10;
                }
            }
        }
    }

    @Override // io.sentry.l1
    public final void register(x0 x0Var, w5 w5Var) {
        if (!w5Var.isEnableShutdownHook()) {
            w5Var.getLogger().q(SentryLevel.INFO, "enableShutdownHook is disabled.", new Object[0]);
            return;
        }
        this.f12020e = new Thread(new z3(w5Var, 3), "sentry-shutdownhook");
        try {
            this.f12019d.addShutdownHook(this.f12020e);
            w5Var.getLogger().q(SentryLevel.DEBUG, "ShutdownHookIntegration installed.", new Object[0]);
            c9.a.c("ShutdownHook");
        } catch (IllegalStateException e10) {
            String message = e10.getMessage();
            if (message == null || !(message.equals("Shutdown in progress") || message.equals("VM already shutting down"))) {
                throw e10;
            }
        }
    }
}
