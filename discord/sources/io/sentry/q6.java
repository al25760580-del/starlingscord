package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class q6 extends j6 {
    public static final io.sentry.protocol.g0 P = io.sentry.protocol.g0.CUSTOM;
    public String M;
    public io.sentry.protocol.g0 N;
    public e9.b O;

    public q6(String str, String str2) {
        this(str, io.sentry.protocol.g0.CUSTOM, str2, null);
    }

    public static q6 b(e4.m mVar) {
        mVar.getClass();
        c cVar = (c) mVar.f7995v;
        Double d6 = cVar.f12504c;
        q6 q6Var = new q6((io.sentry.protocol.v) mVar.f7993e, (l6) mVar.f7994i, "default", (l6) null);
        q6Var.M = "<unlabeled transaction>";
        q6Var.O = null;
        q6Var.N = P;
        q6Var.J = gn.h.u(cVar, null, null, null);
        return q6Var;
    }

    public q6(String str, io.sentry.protocol.g0 g0Var, String str2, e9.b bVar) {
        super(new io.sentry.protocol.v(), new l6(), str2, null);
        com.facebook.imagepipeline.nativecode.c.H(str, "name is required");
        this.M = str;
        this.N = g0Var;
        a(bVar);
        this.J = gn.h.u(null, bVar == null ? null : (Boolean) bVar.f8109d, bVar == null ? null : (Double) bVar.f8110e, bVar == null ? null : (Double) bVar.f8111i);
    }
}
