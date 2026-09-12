package io.sentry;

import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements io.sentry.hints.d, io.sentry.hints.h, io.sentry.hints.k, io.sentry.hints.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13205d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13206e = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CountDownLatch f13207i = new CountDownLatch(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f13208v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ILogger f13209w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f13210x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Queue f13211y;

    public u(long j, ILogger iLogger, String str, n6 n6Var) {
        this.f13208v = j;
        this.f13210x = str;
        this.f13211y = n6Var;
        this.f13209w = iLogger;
    }

    @Override // io.sentry.hints.h
    public final boolean a() {
        return this.f13205d;
    }

    @Override // io.sentry.hints.k
    public final void b(boolean z5) {
        this.f13206e = z5;
        this.f13207i.countDown();
    }

    @Override // io.sentry.hints.h
    public final void c(boolean z5) {
        this.f13205d = z5;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f13207i.await(this.f13208v, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f13209w.g(SentryLevel.ERROR, "Exception while awaiting on lock.", e10);
            return false;
        }
    }

    @Override // io.sentry.hints.k
    public final boolean e() {
        return this.f13206e;
    }
}
