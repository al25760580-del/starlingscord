package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class r4 extends d2 {
    private static final r4 zzb;
    private int zzd;
    private int zze;

    static {
        r4 r4Var = new r4();
        zzb = r4Var;
        d2.f(r4.class, r4Var);
    }

    public static r4 r() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", m1.j});
        }
        if (i10 == 3) {
            return new r4();
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
