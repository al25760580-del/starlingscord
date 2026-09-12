package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class b6 implements b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f12494e;

    public b6() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.f12493d = property;
        this.f12494e = property2;
    }

    public final void a(f4 f4Var) {
        io.sentry.protocol.c cVar = f4Var.f12671e;
        if (cVar.h() == null) {
            cVar.u(new io.sentry.protocol.x());
        }
        io.sentry.protocol.x xVarH = cVar.h();
        if (xVarH != null && xVarH.f13060d == null && xVarH.f13061e == null) {
            xVarH.f13060d = this.f12494e;
            xVarH.f13061e = this.f12493d;
        }
    }

    @Override // io.sentry.b0
    public final SentryEvent f(SentryEvent sentryEvent, Hint hint) {
        a(sentryEvent);
        return sentryEvent;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, Hint hint) {
        a(d0Var);
        return d0Var;
    }
}
