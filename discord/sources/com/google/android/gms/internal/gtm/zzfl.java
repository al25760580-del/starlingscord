package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes3.dex */
final class zzfl implements zzcz {
    final /* synthetic */ Runnable zza;
    final /* synthetic */ zzfn zzb;

    public zzfl(zzfn zzfnVar, Runnable runnable) {
        this.zzb = zzfnVar;
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.gtm.zzcz
    public final void zza(Throwable th2) {
        this.zzb.zzb.post(this.zza);
    }
}
