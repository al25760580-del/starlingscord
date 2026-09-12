package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class d3 extends d2 {
    private static final d3 zzb;
    private q2 zzd = q2.f6097e;

    static {
        d3 d3Var = new d3();
        zzb = d3Var;
        d2.f(d3.class, d3Var);
    }

    public static b3 r() {
        return (b3) zzb.k();
    }

    public static q2 s(d3 d3Var) {
        q2 q2Var = d3Var.zzd;
        if (!q2Var.f6098d) {
            d3Var.zzd = q2Var.a();
        }
        return d3Var.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zzd", c3.f5995a});
        }
        if (i10 == 3) {
            return new d3();
        }
        if (i10 == 4) {
            return new b3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
