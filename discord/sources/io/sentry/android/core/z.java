package io.sentry.android.core;

import io.sentry.ILogger;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends io.sentry.hints.c implements io.sentry.hints.b, io.sentry.hints.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f12451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f12453x;

    public z(long j, ILogger iLogger, long j5, boolean z5, boolean z6) {
        super(j, iLogger);
        this.f12451v = j5;
        this.f12452w = z5;
        this.f12453x = z6;
    }

    @Override // io.sentry.hints.a
    public final Long a() {
        return Long.valueOf(this.f12451v);
    }

    @Override // io.sentry.hints.a
    public final boolean b() {
        return false;
    }

    @Override // io.sentry.hints.a
    public final String c() {
        return this.f12453x ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.c
    public final boolean e(io.sentry.protocol.v vVar) {
        return true;
    }

    @Override // io.sentry.hints.c
    public final void f(io.sentry.protocol.v vVar) {
    }

    @Override // io.sentry.hints.b
    public final boolean shouldEnrich() {
        return this.f12452w;
    }
}
