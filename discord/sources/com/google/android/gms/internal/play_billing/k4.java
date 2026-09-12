package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 extends d2 {
    private static final k4 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private d4 zzg;
    private e4 zzh;

    static {
        k4 k4Var = new k4();
        zzb = k4Var;
        d2.f(k4.class, k4Var);
    }

    public static /* synthetic */ void r(k4 k4Var, q4 q4Var) {
        k4Var.zzf = q4Var;
        k4Var.zze = 8;
    }

    public static /* synthetic */ void s(k4 k4Var, r4 r4Var) {
        k4Var.zzf = r4Var;
        k4Var.zze = 4;
    }

    public static j4 t() {
        return (j4) zzb.k();
    }

    public static /* synthetic */ void u(k4 k4Var, t3 t3Var) {
        k4Var.zzf = t3Var;
        k4Var.zze = 2;
    }

    public static /* synthetic */ void v(k4 k4Var, v3 v3Var) {
        k4Var.zzf = v3Var;
        k4Var.zze = 3;
    }

    public static /* synthetic */ void w(k4 k4Var, y3 y3Var) {
        y3Var.getClass();
        k4Var.zzf = y3Var;
        k4Var.zze = 7;
    }

    public static /* synthetic */ void x(k4 k4Var, b4 b4Var) {
        k4Var.zzf = b4Var;
        k4Var.zze = 5;
    }

    public static /* synthetic */ void y(k4 k4Var, d4 d4Var) {
        d4Var.getClass();
        k4Var.zzg = d4Var;
        k4Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", t3.class, v3.class, r4.class, b4.class, "zzh", y3.class, q4.class});
        }
        if (i10 == 3) {
            return new k4();
        }
        if (i10 == 4) {
            return new j4(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
