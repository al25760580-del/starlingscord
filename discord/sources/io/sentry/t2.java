package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class t2 implements ISpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2 f13155a = new t2();

    @Override // io.sentry.ISpan
    public final m6 a() {
        return null;
    }

    @Override // io.sentry.ISpan
    public final ISpan c(String str, j4 j4Var, k1 k1Var) {
        return f13155a;
    }

    @Override // io.sentry.ISpan
    public final void f(m6 m6Var) {
    }

    @Override // io.sentry.ISpan
    public final void g() {
    }

    @Override // io.sentry.ISpan
    public final String getDescription() {
        return null;
    }

    @Override // io.sentry.ISpan
    public final boolean isFinished() {
        return false;
    }

    @Override // io.sentry.ISpan
    public final void j(String str) {
    }

    @Override // io.sentry.ISpan
    public final ISpan l(String str) {
        return f13155a;
    }

    @Override // io.sentry.ISpan
    public final j6 o() {
        return new j6(io.sentry.protocol.v.f13055e, l6.f12801e, "op", null);
    }

    @Override // io.sentry.ISpan
    public final j4 p() {
        return new e5();
    }

    @Override // io.sentry.ISpan
    public final void q(m6 m6Var, j4 j4Var) {
    }

    @Override // io.sentry.ISpan
    public final j4 s() {
        return new e5();
    }

    @Override // io.sentry.ISpan
    public final void e(Number number, String str) {
    }

    @Override // io.sentry.ISpan
    public final void h(Object obj, String str) {
    }

    @Override // io.sentry.ISpan
    public final void n(String str, Long l6, c2 c2Var) {
    }
}
