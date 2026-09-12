package com.google.android.gms.internal.play_billing;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class b4 extends d2 {
    private static final b4 zzb;
    private int zzd;
    private int zzf;
    private x3 zzi;
    private boolean zzj;
    private boolean zzk;
    private o4 zzl;
    private String zze = "";
    private g2 zzg = e2.f5999w;
    private h2 zzh = v2.f6159w;

    static {
        b4 b4Var = new b4();
        zzb = b4Var;
        d2.f(b4.class, b4Var);
    }

    public static a4 r() {
        return (a4) zzb.k();
    }

    public static void s(b4 b4Var, z3 z3Var) {
        RandomAccess randomAccess = b4Var.zzg;
        if (!((p1) randomAccess).f6091d) {
            e2 e2Var = (e2) randomAccess;
            int i7 = e2Var.f6001i;
            b4Var.zzg = e2Var.l(i7 + i7);
        }
        ((e2) b4Var.zzg).e(z3Var.f6210d);
    }

    public static /* synthetic */ void t(b4 b4Var, x3 x3Var) {
        b4Var.zzi = x3Var;
        b4Var.zzd |= 4;
    }

    public static /* synthetic */ void u(b4 b4Var) {
        b4Var.zzd |= 1;
        b4Var.zze = "ProxyBillingBroadcastReceiver";
    }

    public static /* synthetic */ void v(b4 b4Var, o4 o4Var) {
        b4Var.zzl = o4Var;
        b4Var.zzd |= 32;
    }

    public static /* synthetic */ void w(b4 b4Var, int i7) {
        b4Var.zzf = i7 - 1;
        b4Var.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", m1.f6057f, "zzg", m1.f6056e, "zzh", l4.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i10 == 3) {
            return new b4();
        }
        if (i10 == 4) {
            return new a4(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
