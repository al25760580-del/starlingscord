package io.sentry.android.core;

import android.content.Context;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.w5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public class TombstoneIntegration implements l1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.transport.d f12128e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SentryAndroidOptions f12129i;

    public TombstoneIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12127d = applicationContext != null ? applicationContext : context;
        this.f12128e = io.sentry.transport.d.f13180d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f12129i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12129i = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.f12129i.isTombstoneEnabled()));
        if (this.f12129i.isTombstoneEnabled()) {
            if (this.f12129i.getCacheDirPath() == null) {
                this.f12129i.getLogger().q(SentryLevel.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                io.sentry.a1 executorService = w5Var.getExecutorService();
                Context context = this.f12127d;
                SentryAndroidOptions sentryAndroidOptions2 = this.f12129i;
                executorService.submit(new j0(context, sentryAndroidOptions2, this.f12128e, new a0(sentryAndroidOptions2, 1)));
            } catch (Throwable th2) {
                w5Var.getLogger().g(SentryLevel.DEBUG, "Failed to start tombstone processor.", th2);
            }
            w5Var.getLogger().q(SentryLevel.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            c9.a.c("Tombstone");
        }
    }
}
