package io.sentry.util.thread;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f13237a = Thread.currentThread().getId();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f13238b = new c();

    @Override // io.sentry.util.thread.a
    public final String a() {
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long b() {
        return Thread.currentThread().getId();
    }

    @Override // io.sentry.util.thread.a
    public final boolean c() {
        return f13237a == Thread.currentThread().getId();
    }
}
