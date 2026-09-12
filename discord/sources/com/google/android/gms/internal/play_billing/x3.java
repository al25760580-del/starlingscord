package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 extends d2 {
    private static final x3 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        x3 x3Var = new x3();
        zzb = x3Var;
        d2.f(x3.class, x3Var);
    }

    public static /* synthetic */ void r(x3 x3Var, int i7) {
        x3Var.zzd |= 1;
        x3Var.zze = i7;
    }

    public static w3 s() {
        return (w3) zzb.k();
    }

    public static /* synthetic */ void t(x3 x3Var, String str) {
        x3Var.zzd |= 8;
        x3Var.zzh = str;
    }

    public static /* synthetic */ void u(x3 x3Var, String str) {
        str.getClass();
        x3Var.zzd |= 2;
        x3Var.zzf = str;
    }

    public static /* synthetic */ void v(x3 x3Var, int i7) {
        x3Var.zzd |= 32;
        x3Var.zzj = i7;
    }

    public static /* synthetic */ void w(x3 x3Var, int i7) {
        x3Var.zzd |= 16;
        x3Var.zzi = i7;
    }

    public static void x(x3 x3Var, int i7) {
        x3Var.zzg = com.discord.chat.presentation.list.a.c(i7);
        x3Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", m1.f6055d, "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new x3();
        }
        if (i10 == 4) {
            return new w3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
