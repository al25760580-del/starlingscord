package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.w5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class NdkIntegration implements l1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f12100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SentryAndroidOptions f12101e;

    public NdkIntegration(Class cls) {
        this.f12100d = cls;
    }

    public static void c(SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setEnableNdk(false);
        sentryAndroidOptions.setEnableScopeSync(false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f12101e;
        if (sentryAndroidOptions == null || !sentryAndroidOptions.isEnableNdk()) {
            return;
        }
        Class cls = this.f12100d;
        try {
            if (cls != null) {
                cls.getMethod("close", null).invoke(null, null);
                this.f12101e.getLogger().q(SentryLevel.DEBUG, "NdkIntegration removed.", new Object[0]);
            }
        } catch (NoSuchMethodException e10) {
            this.f12101e.getLogger().g(SentryLevel.ERROR, "Failed to invoke the SentryNdk.close method.", e10);
        } catch (Throwable th2) {
            this.f12101e.getLogger().g(SentryLevel.ERROR, "Failed to close SentryNdk.", th2);
        } finally {
            c(this.f12101e);
        }
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        Class cls;
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12101e = sentryAndroidOptions;
        boolean zIsEnableNdk = sentryAndroidOptions.isEnableNdk();
        ILogger logger = this.f12101e.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.q(sentryLevel, "NdkIntegration enabled: %s", Boolean.valueOf(zIsEnableNdk));
        if (!zIsEnableNdk || (cls = this.f12100d) == null) {
            c(this.f12101e);
            return;
        }
        if (this.f12101e.getCacheDirPath() == null) {
            this.f12101e.getLogger().q(SentryLevel.ERROR, "No cache dir path is defined in options.", new Object[0]);
            c(this.f12101e);
            return;
        }
        try {
            cls.getMethod("init", SentryAndroidOptions.class).invoke(null, this.f12101e);
            this.f12101e.getLogger().q(sentryLevel, "NdkIntegration installed.", new Object[0]);
            c9.a.c("Ndk");
        } catch (NoSuchMethodException e10) {
            c(this.f12101e);
            this.f12101e.getLogger().g(SentryLevel.ERROR, "Failed to invoke the SentryNdk.init method.", e10);
        } catch (Throwable th2) {
            c(this.f12101e);
            this.f12101e.getLogger().g(SentryLevel.ERROR, "Failed to initialize SentryNdk.", th2);
        }
    }
}
