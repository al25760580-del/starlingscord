package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface z0 {
    void a(boolean z5);

    void b(long j);

    void c(h6 h6Var, Hint hint);

    io.sentry.transport.p d();

    default boolean e() {
        return true;
    }

    io.sentry.protocol.v f(y5 y5Var, IScope iScope, Hint hint);

    io.sentry.protocol.v h(d3 d3Var);

    io.sentry.protocol.v i(e4.c cVar, Hint hint);

    boolean isEnabled();

    io.sentry.protocol.v j(io.sentry.protocol.d0 d0Var, o6 o6Var, IScope iScope, Hint hint, g3 g3Var);

    io.sentry.protocol.v k(SentryEvent sentryEvent, IScope iScope, Hint hint);
}
