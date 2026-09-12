package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class y3 extends d2 {
    private static final y3 zzb;

    static {
        y3 y3Var = new y3();
        zzb = y3Var;
        d2.f(y3.class, y3Var);
    }

    public static y3 r() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0000", null);
        }
        if (i10 == 3) {
            return new y3();
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
