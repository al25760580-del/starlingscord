package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface b0 {
    default y5 c(y5 y5Var, Hint hint) {
        return y5Var;
    }

    SentryEvent f(SentryEvent sentryEvent, Hint hint);

    default io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, Hint hint) {
        return d0Var;
    }
}
