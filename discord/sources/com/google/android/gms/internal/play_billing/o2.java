package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class o2 extends d2 {
    private static final o2 zzb;
    private h2 zzd = v2.f6159w;

    static {
        o2 o2Var = new o2();
        zzb = o2Var;
        d2.f(o2.class, o2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", p3.class});
        }
        if (i10 == 3) {
            return new o2();
        }
        if (i10 == 4) {
            return new d1(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
