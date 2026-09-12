package com.google.android.gms.internal.gtm;

import af.w;
import android.os.Handler;
import ff.b;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzcw {
    private static volatile Handler zza;
    private final zzbv zzb;
    private final Runnable zzc;
    private volatile long zzd;

    public zzcw(zzbv zzbvVar) {
        w.g(zzbvVar);
        this.zzb = zzbvVar;
        this.zzc = new zzcv(this);
    }

    private final Handler zzi() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzcw.class) {
            try {
                if (zza == null) {
                    zza = new zzga(this.zzb.zza().getMainLooper());
                }
                handler = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public abstract void zza();

    public final long zzb() {
        if (this.zzd == 0) {
            return 0L;
        }
        ((b) this.zzb.zzr()).getClass();
        return Math.abs(System.currentTimeMillis() - this.zzd);
    }

    public final void zze(long j) {
        if (zzh()) {
            if (j < 0) {
                zzf();
                return;
            }
            ((b) this.zzb.zzr()).getClass();
            long jAbs = j - Math.abs(System.currentTimeMillis() - this.zzd);
            long j5 = jAbs >= 0 ? jAbs : 0L;
            zzi().removeCallbacks(this.zzc);
            if (zzi().postDelayed(this.zzc, j5)) {
                return;
            }
            this.zzb.zzm().zzK("Failed to adjust delayed post. time", Long.valueOf(j5));
        }
    }

    public final void zzf() {
        this.zzd = 0L;
        zzi().removeCallbacks(this.zzc);
    }

    public final void zzg(long j) {
        zzf();
        if (j >= 0) {
            ((b) this.zzb.zzr()).getClass();
            this.zzd = System.currentTimeMillis();
            if (zzi().postDelayed(this.zzc, j)) {
                return;
            }
            this.zzb.zzm().zzK("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean zzh() {
        return this.zzd != 0;
    }
}
