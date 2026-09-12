package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 extends d2 {
    private static final i4 zzb;
    private int zzd;
    private h2 zze = v2.f6159w;
    private String zzf = "";
    private boolean zzg;

    static {
        i4 i4Var = new i4();
        zzb = i4Var;
        d2.f(i4.class, i4Var);
    }

    public static i4 r() {
        return zzb;
    }

    public static /* synthetic */ void s(i4 i4Var, boolean z5) {
        i4Var.zzd |= 2;
        i4Var.zzg = z5;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", h4.class, "zzf", "zzg"});
        }
        if (i10 == 3) {
            return new i4();
        }
        if (i10 == 4) {
            return new g4(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
