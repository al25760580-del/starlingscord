package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class v3 extends d2 {
    private static final v3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        v3 v3Var = new v3();
        zzb = v3Var;
        d2.f(v3.class, v3Var);
    }

    public static /* synthetic */ void r(v3 v3Var, int i7) {
        v3Var.zzg = i7 - 1;
        v3Var.zzd |= 1;
    }

    public static u3 s() {
        return (u3) zzb.k();
    }

    public static void u(v3 v3Var, z3 z3Var) {
        v3Var.zzh = z3Var.f6210d;
        v3Var.zzd |= 2;
    }

    public static /* synthetic */ void v(v3 v3Var, i4 i4Var) {
        v3Var.zzf = i4Var;
        v3Var.zze = 4;
    }

    public static /* synthetic */ void w(v3 v3Var, t4 t4Var) {
        v3Var.zzf = t4Var;
        v3Var.zze = 3;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", m1.f6054c, f4.class, t4.class, i4.class, "zzh", m1.f6056e});
        }
        if (i10 == 3) {
            return new v3();
        }
        if (i10 == 4) {
            return new u3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }

    public final i4 t() {
        return this.zze == 4 ? (i4) this.zzf : i4.r();
    }
}
