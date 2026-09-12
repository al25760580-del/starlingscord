package io.sentry.hints;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.protocol.v;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CountDownLatch f12723d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12724e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ILogger f12725i;

    public c(long j, ILogger iLogger) {
        this.f12724e = j;
        this.f12725i = iLogger;
    }

    @Override // io.sentry.hints.f
    public final boolean d() {
        try {
            return this.f12723d.await(this.f12724e, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            this.f12725i.g(SentryLevel.ERROR, "Exception while awaiting for flush in BlockingFlushHint", e10);
            return false;
        }
    }

    public abstract boolean e(v vVar);

    public abstract void f(v vVar);
}
