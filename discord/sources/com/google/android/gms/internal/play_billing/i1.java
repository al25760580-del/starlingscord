package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends d2 {
    private static final i1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        i1 i1Var = new i1();
        zzb = i1Var;
        d2.f(i1.class, i1Var);
    }

    public static i1 s(byte[] bArr) {
        return (i1) d2.o(zzb, bArr);
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new i1();
        }
        if (i10 == 4) {
            return new d1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int r() {
        return this.zze;
    }

    public final String t() {
        return this.zzf;
    }
}
