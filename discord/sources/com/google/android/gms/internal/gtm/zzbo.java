package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes3.dex */
final class zzbo implements Runnable {
    final /* synthetic */ zzcz zza;
    final /* synthetic */ zzbq zzb;

    public zzbo(zzbq zzbqVar, zzcz zzczVar) {
        this.zzb = zzbqVar;
        this.zza = zzczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zza.zzf(this.zza);
    }
}
