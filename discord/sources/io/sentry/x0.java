package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface x0 {
    void a(boolean z5);

    void b(long j);

    void c(Breadcrumb breadcrumb);

    q0 clone();

    io.sentry.transport.p d();

    boolean e();

    void f(String str, String str2);

    void g(Breadcrumb breadcrumb, Hint hint);

    io.sentry.protocol.v h(d3 d3Var);

    io.sentry.protocol.v i(e4.c cVar, Hint hint);

    boolean isEnabled();

    void j(ac.b bVar);

    f1 k(q6 q6Var, r6 r6Var);

    w5 l();

    Boolean m();

    f1 n();

    void o();

    void p();

    default boolean q() {
        return false;
    }

    void r(t3 t3Var, r3 r3Var);

    io.sentry.protocol.v s(y5 y5Var, Hint hint);

    io.sentry.protocol.v t(Throwable th2, Hint hint);

    io.sentry.protocol.v u(String str, SentryLevel sentryLevel);

    io.sentry.protocol.v v(io.sentry.protocol.d0 d0Var, o6 o6Var, Hint hint, g3 g3Var);

    x0 w(String str);

    io.sentry.protocol.v x(SentryEvent sentryEvent, Hint hint);
}
