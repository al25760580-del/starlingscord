package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.w5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class AnrV2Integration implements l1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.transport.d f12085e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SentryAndroidOptions f12086i;

    public AnrV2Integration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12084d = applicationContext != null ? applicationContext : context;
        this.f12085e = io.sentry.transport.d.f13180d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f12086i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12086i = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f12086i.isAnrEnabled()));
        if (this.f12086i.getCacheDirPath() == null) {
            this.f12086i.getLogger().q(SentryLevel.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f12086i.isAnrEnabled()) {
            try {
                io.sentry.a1 executorService = w5Var.getExecutorService();
                Context context = this.f12084d;
                SentryAndroidOptions sentryAndroidOptions2 = this.f12086i;
                executorService.submit(new j0(context, sentryAndroidOptions2, this.f12085e, new a0(sentryAndroidOptions2, 0)));
            } catch (Throwable th2) {
                w5Var.getLogger().g(SentryLevel.DEBUG, "Failed to start ANR processor.", th2);
            }
            w5Var.getLogger().q(SentryLevel.DEBUG, "AnrV2Integration installed.", new Object[0]);
            c9.a.c("AnrV2");
        }
    }
}
