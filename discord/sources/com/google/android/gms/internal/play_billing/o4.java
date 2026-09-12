package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class o4 extends d2 {
    private static final o4 zzb;
    private int zzd;
    private int zze;

    static {
        o4 o4Var = new o4();
        zzb = o4Var;
        d2.f(o4.class, o4Var);
    }

    public static n4 r() {
        return (n4) zzb.k();
    }

    public static /* synthetic */ void s(o4 o4Var, int i7) {
        o4Var.zze = i7 - 1;
        o4Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", m1.f6060i});
        }
        if (i10 == 3) {
            return new o4();
        }
        if (i10 == 4) {
            return new n4(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
