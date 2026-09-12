package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f12399v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ILogger f12400w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CountDownLatch f12398i = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12396d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12397e = false;

    public r0(long j, ILogger iLogger) {
        this.f12399v = j;
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "ILogger is required.");
        this.f12400w = iLogger;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.f12396d;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z5) {
        this.f12397e = z5;
        this.f12398i.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z5) {
        this.f12396d = z5;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f12398i.await(this.f12399v, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f12400w.g(SentryLevel.ERROR, "Exception while awaiting on lock.", e10);
            return false;
        }
    }

    @Override // io.sentry.hints.k
    public final boolean e() {
        return this.f12397e;
    }
}
