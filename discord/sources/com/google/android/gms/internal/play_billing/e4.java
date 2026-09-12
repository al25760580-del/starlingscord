package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class e4 extends d2 {
    private static final e4 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        e4 e4Var = new e4();
        zzb = e4Var;
        d2.f(e4.class, e4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new e4();
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
