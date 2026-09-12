package com.google.android.gms.internal.gtm;

/* JADX INFO: loaded from: classes3.dex */
final class zzbu implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ zzbv zza;

    public zzbu(zzbv zzbvVar) {
        this.zza = zzbvVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        zzfb zzfbVarZzn = this.zza.zzn();
        if (zzfbVarZzn != null) {
            zzfbVarZzn.zzK("Job execution failed", th2);
        }
    }
}
