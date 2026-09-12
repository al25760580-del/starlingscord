package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f13142a = new ThreadLocal();

    @Override // io.sentry.y0
    public final b1 a(x0 x0Var) {
        x0 x0Var2 = get();
        f13142a.set(x0Var);
        return new r(0, x0Var2);
    }

    @Override // io.sentry.y0
    public final void close() {
        f13142a.remove();
    }

    @Override // io.sentry.y0
    public final x0 get() {
        return (x0) f13142a.get();
    }
}
