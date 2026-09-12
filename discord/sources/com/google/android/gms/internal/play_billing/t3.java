package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class t3 extends d2 {
    private static final t3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private x3 zzh;
    private int zzi;

    static {
        t3 t3Var = new t3();
        zzb = t3Var;
        d2.f(t3.class, t3Var);
    }

    public static /* synthetic */ void r(t3 t3Var, i4 i4Var) {
        t3Var.zzf = i4Var;
        t3Var.zze = 7;
    }

    public static /* synthetic */ void s(t3 t3Var, t4 t4Var) {
        t3Var.zzf = t4Var;
        t3Var.zze = 6;
    }

    public static /* synthetic */ void t(t3 t3Var, int i7) {
        t3Var.zzg = i7 - 1;
        t3Var.zzd |= 1;
    }

    public static s3 u() {
        return (s3) zzb.k();
    }

    public static t3 v(byte[] bArr) {
        return (t3) d2.o(zzb, bArr);
    }

    public static void x(t3 t3Var, z3 z3Var) {
        t3Var.zzi = z3Var.f6210d;
        t3Var.zzd |= 4;
    }

    public static /* synthetic */ void y(t3 t3Var, x3 x3Var) {
        t3Var.zzh = x3Var;
        t3Var.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", m1.f6054c, "zzh", f4.class, "zzi", m1.f6056e, t4.class, i4.class});
        }
        if (i10 == 3) {
            return new t3();
        }
        if (i10 == 4) {
            return new s3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }

    public final i4 w() {
        return this.zze == 7 ? (i4) this.zzf : i4.r();
    }
}
