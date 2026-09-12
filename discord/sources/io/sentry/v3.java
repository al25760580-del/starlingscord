package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class v3 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v3 f13245a = new v3();

    @Override // io.sentry.x0
    public final void a(boolean z5) {
        c4.c();
    }

    @Override // io.sentry.x0
    public final void b(long j) {
        c4.e(j);
    }

    @Override // io.sentry.x0
    public final void c(Breadcrumb breadcrumb) {
        g(breadcrumb, new Hint());
    }

    @Override // io.sentry.x0
    public final io.sentry.transport.p d() {
        return c4.f().d();
    }

    @Override // io.sentry.x0
    public final boolean e() {
        return c4.f().e();
    }

    @Override // io.sentry.x0
    public final void f(String str, String str2) {
        c4.m(str, str2);
    }

    @Override // io.sentry.x0
    public final void g(Breadcrumb breadcrumb, Hint hint) {
        c4.f().g(breadcrumb, hint);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v h(d3 d3Var) {
        return c4.f().h(d3Var);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v i(e4.c cVar, Hint hint) {
        return c4.f().i(cVar, hint);
    }

    @Override // io.sentry.x0
    public final boolean isEnabled() {
        return c4.k();
    }

    @Override // io.sentry.x0
    public final void j(ac.b bVar) {
        c4.n(bVar);
    }

    @Override // io.sentry.x0
    public final f1 k(q6 q6Var, r6 r6Var) {
        return c4.f().k(q6Var, r6Var);
    }

    @Override // io.sentry.x0
    public final w5 l() {
        return c4.f().l();
    }

    @Override // io.sentry.x0
    public final Boolean m() {
        return c4.j();
    }

    @Override // io.sentry.x0
    public final f1 n() {
        return c4.f().n();
    }

    @Override // io.sentry.x0
    public final void o() {
        c4.f().o();
    }

    @Override // io.sentry.x0
    public final void p() {
        c4.f().p();
    }

    @Override // io.sentry.x0
    public final void r(t3 t3Var, r3 r3Var) {
        c4.d(t3Var, r3Var);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v s(y5 y5Var, Hint hint) {
        return c4.f().s(y5Var, hint);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v t(Throwable th2, Hint hint) {
        return c4.f().t(th2, hint);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v u(String str, SentryLevel sentryLevel) {
        return c4.b(str, sentryLevel);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v v(io.sentry.protocol.d0 d0Var, o6 o6Var, Hint hint, g3 g3Var) {
        return c4.f().v(d0Var, o6Var, hint, g3Var);
    }

    @Override // io.sentry.x0
    public final x0 w(String str) {
        return c4.f().w("getCurrentScopes");
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v x(SentryEvent sentryEvent, Hint hint) {
        return c4.f().x(sentryEvent, hint);
    }

    @Override // io.sentry.x0
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final q0 m1267clone() {
        return c4.f().m1267clone();
    }
}
