package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class p3 extends d2 {
    private static final p3 zzb;
    private int zzd = 0;
    private Object zze;

    static {
        p3 p3Var = new p3();
        zzb = p3Var;
        d2.f(p3.class, p3Var);
    }

    public static o3 r() {
        return (o3) zzb.k();
    }

    public static p3 s() {
        return zzb;
    }

    public static /* synthetic */ void t(p3 p3Var, String str) {
        str.getClass();
        p3Var.zzd = 3;
        p3Var.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"zze", "zzd", d3.class, o2.class});
        }
        if (i10 == 3) {
            return new p3();
        }
        if (i10 == 4) {
            return new o3(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
