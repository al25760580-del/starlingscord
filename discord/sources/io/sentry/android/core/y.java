package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements io.sentry.hints.a, io.sentry.hints.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12450d;

    public y(boolean z5) {
        this.f12450d = z5;
    }

    @Override // io.sentry.hints.a
    public final Long a() {
        return null;
    }

    @Override // io.sentry.hints.a
    public final boolean b() {
        return true;
    }

    @Override // io.sentry.hints.a
    public final String c() {
        return this.f12450d ? "anr_background" : "anr_foreground";
    }
}
