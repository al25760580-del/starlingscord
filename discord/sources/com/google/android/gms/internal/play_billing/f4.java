package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class f4 extends d2 {
    private static final f4 zzb;
    private int zzd;
    private int zze;

    static {
        f4 f4Var = new f4();
        zzb = f4Var;
        d2.f(f4.class, f4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", m1.f6058g});
        }
        if (i10 == 3) {
            return new f4();
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
