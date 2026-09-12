package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class p6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f12892a;

    public p6(w5 w5Var) {
        this.f12892a = w5Var;
    }

    public final e9.b a(e4.r rVar) {
        Double d6 = (Double) rVar.f8035i;
        q6 q6Var = (q6) rVar.f8034e;
        e9.b bVar = q6Var.f12785v;
        if (bVar != null) {
            return e4.f.o(bVar);
        }
        w5 w5Var = this.f12892a;
        w5Var.getProfilesSampler();
        Double profilesSampleRate = w5Var.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && profilesSampleRate.doubleValue() >= d6.doubleValue());
        w5Var.getTracesSampler();
        e9.b bVar2 = q6Var.O;
        if (bVar2 != null) {
            return e4.f.o(bVar2);
        }
        Double tracesSampleRate = w5Var.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, w5Var.getBackpressureMonitor().a()));
        if (dValueOf == null) {
            Boolean bool = Boolean.FALSE;
            return new e9.b(bool, (Double) null, d6, bool, (Double) null);
        }
        boolean z5 = false;
        if (dValueOf.doubleValue() >= d6.doubleValue()) {
            z5 = true;
        }
        return new e9.b(Boolean.valueOf(z5), dValueOf, d6, boolValueOf, profilesSampleRate);
    }
}
