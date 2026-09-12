package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class q4 extends d2 {
    private static final q4 zzb;
    private int zzd;
    private x3 zze;
    private long zzf;

    static {
        q4 q4Var = new q4();
        zzb = q4Var;
        d2.f(q4.class, q4Var);
    }

    public static p4 r() {
        return (p4) zzb.k();
    }

    public static /* synthetic */ void s(q4 q4Var, x3 x3Var) {
        q4Var.zze = x3Var;
        q4Var.zzd |= 1;
    }

    public static /* synthetic */ void t(q4 q4Var, long j) {
        q4Var.zzd |= 2;
        q4Var.zzf = j;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i10 == 3) {
            return new q4();
        }
        if (i10 == 4) {
            return new p4(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
