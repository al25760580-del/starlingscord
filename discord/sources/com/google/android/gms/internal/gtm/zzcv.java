package com.google.android.gms.internal.gtm;

import android.os.Looper;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
final class zzcv implements Runnable {
    final /* synthetic */ zzcw zza;

    public zzcv(zzcw zzcwVar) {
        this.zza = zzcwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            i iVarZzd = this.zza.zzb.zzd();
            iVarZzd.getClass();
            iVarZzd.f18023b.submit(this);
        } else {
            boolean zZzh = this.zza.zzh();
            this.zza.zzd = 0L;
            if (zZzh) {
                this.zza.zza();
            }
        }
    }
}
