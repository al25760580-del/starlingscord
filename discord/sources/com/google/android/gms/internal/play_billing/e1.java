package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends d2 {
    private static final e1 zzb;
    private int zzd;
    private String zze = "";

    static {
        e1 e1Var = new e1();
        zzb = e1Var;
        d2.f(e1.class, e1Var);
    }

    public static e1 r(byte[] bArr) {
        return (e1) d2.o(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i10 == 3) {
            return new e1();
        }
        if (i10 == 4) {
            return new d1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String s() {
        return this.zze;
    }
}
