package io.sentry;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class s6 extends io.sentry.hints.c implements io.sentry.hints.i, io.sentry.hints.l {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicReference f13151v;

    public s6(long j, ILogger iLogger) {
        super(j, iLogger);
        this.f13151v = new AtomicReference();
    }

    @Override // io.sentry.hints.c
    public final boolean e(io.sentry.protocol.v vVar) {
        io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) this.f13151v.get();
        return vVar2 != null && vVar2.equals(vVar);
    }

    @Override // io.sentry.hints.c
    public final void f(io.sentry.protocol.v vVar) {
        this.f13151v.set(vVar);
    }
}
