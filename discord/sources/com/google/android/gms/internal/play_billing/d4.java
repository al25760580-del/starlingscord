package com.google.android.gms.internal.play_billing;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 extends d2 {
    private static final d4 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        d4 d4Var = new d4();
        zzb = d4Var;
        d2.f(d4.class, d4Var);
    }

    public static /* synthetic */ void A(d4 d4Var, String str) {
        d4Var.zzd |= 2;
        d4Var.zzf = str;
    }

    public static c4 B() {
        return (c4) zzb.k();
    }

    public static /* synthetic */ void C(d4 d4Var, int i7) {
        d4Var.zzd |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        d4Var.zzl = i7;
    }

    public static /* synthetic */ void D(d4 d4Var, int i7) {
        d4Var.zzd |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        d4Var.zzm = i7;
    }

    public static /* synthetic */ void E(d4 d4Var, int i7) {
        d4Var.zzd |= 8;
        d4Var.zzh = i7;
    }

    public static /* synthetic */ void F(d4 d4Var, long j) {
        d4Var.zzd |= 16;
        d4Var.zzi = j;
    }

    public static /* synthetic */ void G(d4 d4Var, long j) {
        d4Var.zzd |= 32;
        d4Var.zzj = j;
    }

    public static /* synthetic */ void r(d4 d4Var) {
        d4Var.zzd |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        d4Var.zzn = 926300087L;
    }

    public static /* synthetic */ void s(d4 d4Var, String str) {
        str.getClass();
        d4Var.zzd |= 4;
        d4Var.zzg = str;
    }

    public static /* synthetic */ void t(d4 d4Var) {
        String str = Build.BRAND;
        str.getClass();
        d4Var.zzd |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        d4Var.zzo = str;
    }

    public static /* synthetic */ void u(d4 d4Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        d4Var.zzd |= 8192;
        d4Var.zzr = str;
    }

    public static /* synthetic */ void v(d4 d4Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        d4Var.zzd |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        d4Var.zzq = str;
    }

    public static /* synthetic */ void w(d4 d4Var) {
        String str = Build.MODEL;
        str.getClass();
        d4Var.zzd |= RecyclerView.ItemAnimator.FLAG_MOVED;
        d4Var.zzp = str;
    }

    public static /* synthetic */ void x(d4 d4Var, int i7) {
        d4Var.zzd |= 16384;
        d4Var.zzs = i7;
    }

    public static /* synthetic */ void y(d4 d4Var) {
        d4Var.zzd |= 64;
        d4Var.zzk = false;
    }

    public static /* synthetic */ void z(d4 d4Var) {
        d4Var.zzd |= 1;
        d4Var.zze = z4.a.f23597a;
    }

    @Override // com.google.android.gms.internal.play_billing.d2
    public final Object j(int i7) {
        int i10 = i7 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return new w2(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i10 == 3) {
            return new d4();
        }
        if (i10 == 4) {
            return new c4(zzb);
        }
        if (i10 == 5) {
            return zzb;
        }
        throw null;
    }
}
