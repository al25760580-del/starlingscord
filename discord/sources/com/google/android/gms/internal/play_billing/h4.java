package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class h4 extends d2 {
    private static final h4 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        h4 h4Var = new h4();
        zzb = h4Var;
        d2.f(h4.class, h4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", m1.f6059h, "zzf"});
        }
        if (i10 == 3) {
            return new h4();
        }
        if (i10 == 4) {
            return new d1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
