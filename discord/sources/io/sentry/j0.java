package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3 f12780a;

    public j0(u3 u3Var) {
        this.f12780a = u3Var;
    }

    @Override // io.sentry.x0
    public final void a(boolean z5) {
        this.f12780a.a(z5);
    }

    @Override // io.sentry.x0
    public final void b(long j) {
        this.f12780a.b(j);
    }

    @Override // io.sentry.x0
    public final void c(Breadcrumb breadcrumb) {
        this.f12780a.c(breadcrumb);
    }

    @Override // io.sentry.x0
    /* JADX INFO: renamed from: clone */
    public final q0 m1267clone() {
        return this.f12780a.m1267clone();
    }

    @Override // io.sentry.x0
    public final io.sentry.transport.p d() {
        return this.f12780a.d();
    }

    @Override // io.sentry.x0
    public final boolean e() {
        return this.f12780a.e();
    }

    @Override // io.sentry.x0
    public final void f(String str, String str2) {
        this.f12780a.f(str, str2);
    }

    @Override // io.sentry.x0
    public final void g(Breadcrumb breadcrumb, Hint hint) {
        this.f12780a.g(breadcrumb, hint);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v h(d3 d3Var) {
        return this.f12780a.h(d3Var);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v i(e4.c cVar, Hint hint) {
        return this.f12780a.i(cVar, hint);
    }

    @Override // io.sentry.x0
    public final boolean isEnabled() {
        return this.f12780a.isEnabled();
    }

    @Override // io.sentry.x0
    public final void j(ac.b bVar) {
        this.f12780a.j(bVar);
    }

    @Override // io.sentry.x0
    public final f1 k(q6 q6Var, r6 r6Var) {
        return this.f12780a.k(q6Var, r6Var);
    }

    @Override // io.sentry.x0
    public final w5 l() {
        return this.f12780a.l();
    }

    @Override // io.sentry.x0
    public final Boolean m() {
        return this.f12780a.m();
    }

    @Override // io.sentry.x0
    public final f1 n() {
        return this.f12780a.n();
    }

    @Override // io.sentry.x0
    public final void o() {
        this.f12780a.o();
    }

    @Override // io.sentry.x0
    public final void p() {
        this.f12780a.p();
    }

    @Override // io.sentry.x0
    public final void r(t3 t3Var, r3 r3Var) {
        this.f12780a.r(t3Var, r3Var);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v s(y5 y5Var, Hint hint) {
        return this.f12780a.s(y5Var, hint);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v t(Throwable th2, Hint hint) {
        return this.f12780a.t(th2, hint);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v u(String str, SentryLevel sentryLevel) {
        return this.f12780a.u(str, sentryLevel);
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v v(io.sentry.protocol.d0 d0Var, o6 o6Var, Hint hint, g3 g3Var) {
        return this.f12780a.v(d0Var, o6Var, hint, g3Var);
    }

    @Override // io.sentry.x0
    public final x0 w(String str) {
        return this.f12780a.w("getCurrentScopes");
    }

    @Override // io.sentry.x0
    public final io.sentry.protocol.v x(SentryEvent sentryEvent, Hint hint) {
        return this.f12780a.x(sentryEvent, hint);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m1262clone() {
        return this.f12780a.m1267clone();
    }
}
