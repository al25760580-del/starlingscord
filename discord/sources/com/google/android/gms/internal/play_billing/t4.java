package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class t4 extends d2 {
    private static final t4 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        t4 t4Var = new t4();
        zzb = t4Var;
        d2.f(t4.class, t4Var);
    }

    public static s4 r() {
        return (s4) zzb.k();
    }

    public static /* synthetic */ void s(t4 t4Var, boolean z5) {
        t4Var.zzd |= 8;
        t4Var.zzh = z5;
    }

    public static /* synthetic */ void t(t4 t4Var) {
        t4Var.zzd |= 16;
        t4Var.zzi = 0;
    }

    public static /* synthetic */ void u(t4 t4Var, long j) {
        t4Var.zzd |= 4;
        t4Var.zzg = j;
    }

    public static /* synthetic */ void v(t4 t4Var, int i7) {
        t4Var.zzd |= 32;
        t4Var.zzj = i7;
    }

    public static /* synthetic */ void w(t4 t4Var) {
        t4Var.zzd |= 2;
        t4Var.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i10 == 3) {
            return new t4();
        }
        if (i10 == 4) {
            return new s4(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
