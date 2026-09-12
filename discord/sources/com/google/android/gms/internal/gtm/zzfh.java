package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import ff.b;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfh extends zzbs {
    private SharedPreferences zza;
    private long zzb;
    private long zzc;
    private final zzfg zzd;

    public zzfh(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = -1L;
        zzw();
        this.zzd = new zzfg(this, "monitoring", zzeu.zzP.zzb().longValue(), null);
    }

    public final long zza() {
        i.a();
        zzW();
        long j = this.zzb;
        if (j != 0) {
            return j;
        }
        long j5 = this.zza.getLong("first_run", 0L);
        if (j5 != 0) {
            this.zzb = j5;
            return j5;
        }
        ((b) zzC()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.putLong("first_run", jCurrentTimeMillis);
        if (!editorEdit.commit()) {
            zzR("Failed to commit first run time");
        }
        this.zzb = jCurrentTimeMillis;
        return jCurrentTimeMillis;
    }

    public final long zzb() {
        i.a();
        zzW();
        long j = this.zzc;
        if (j != -1) {
            return j;
        }
        long j5 = this.zza.getLong("last_dispatch", 0L);
        this.zzc = j5;
        return j5;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zza = zzo().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    }

    public final zzfg zze() {
        return this.zzd;
    }

    public final void zzi() {
        i.a();
        zzW();
        ((b) zzC()).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = this.zza.edit();
        editorEdit.putLong("last_dispatch", jCurrentTimeMillis);
        editorEdit.apply();
        this.zzc = jCurrentTimeMillis;
    }
}
