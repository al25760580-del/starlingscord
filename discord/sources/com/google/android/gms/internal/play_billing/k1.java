package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends d2 {
    private static final k1 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        k1 k1Var = new k1();
        zzb = k1Var;
        d2.f(k1.class, k1Var);
    }

    public static j1 r() {
        return (j1) zzb.k();
    }

    public static /* synthetic */ void s(k1 k1Var, String str) {
        k1Var.zzd |= 4;
        k1Var.zzg = str;
    }

    public static /* synthetic */ void t(k1 k1Var, String str) {
        str.getClass();
        k1Var.zzd |= 16;
        k1Var.zzi = str;
    }

    public static /* synthetic */ void u(k1 k1Var) {
        k1Var.zzd |= 32;
        k1Var.zzj = "getBillingConfig";
    }

    public static /* synthetic */ void v(k1 k1Var) {
        k1Var.zzd |= 8;
        k1Var.zzh = z4.a.f23597a;
    }

    public static /* synthetic */ void w(k1 k1Var) {
        k1Var.zzd |= 1;
        k1Var.zze = 24;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new k1();
        }
        if (i10 == 4) {
            return new j1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
