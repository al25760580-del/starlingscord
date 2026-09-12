package com.google.android.gms.internal.gtm;

import af.w;
import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import ef.a;
import java.util.Collections;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzcc extends zzbs {
    private final zzcb zza;
    private final zzcw zzb;
    private final zzfo zzc;
    private zzey zzd;

    public zzcc(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = new zzfo(zzbvVar.zzr());
        this.zza = new zzcb(this);
        this.zzb = new zzby(this, zzbvVar);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzcc zzccVar, ComponentName componentName) {
        i.a();
        if (zzccVar.zzd != null) {
            zzccVar.zzd = null;
            zzccVar.zzP("Disconnected from device AnalyticsService", componentName);
            zzccVar.zzs().zzk();
        }
    }

    public static /* bridge */ /* synthetic */ void zzi(zzcc zzccVar, zzey zzeyVar) {
        i.a();
        zzccVar.zzd = zzeyVar;
        zzccVar.zzj();
        zzccVar.zzs().zzj();
    }

    private final void zzj() {
        this.zzc.zzb();
        zzcw zzcwVar = this.zzb;
        zzw();
        zzcwVar.zzg(zzeu.zzK.zzb().longValue());
    }

    public final void zzc() {
        i.a();
        zzW();
        try {
            a.a().b(zzo(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzd != null) {
            this.zzd = null;
            zzs().zzk();
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }

    public final boolean zzf() {
        i.a();
        zzW();
        if (this.zzd != null) {
            return true;
        }
        zzey zzeyVarZza = this.zza.zza();
        if (zzeyVarZza == null) {
            return false;
        }
        this.zzd = zzeyVarZza;
        zzj();
        return true;
    }

    public final boolean zzg() {
        i.a();
        zzW();
        return this.zzd != null;
    }

    public final boolean zzh(zzex zzexVar) {
        String strZzk;
        w.g(zzexVar);
        i.a();
        zzW();
        zzey zzeyVar = this.zzd;
        if (zzeyVar == null) {
            return false;
        }
        if (zzexVar.zzh()) {
            zzw();
            strZzk = zzct.zzi();
        } else {
            zzw();
            strZzk = zzct.zzk();
        }
        try {
            zzeyVar.zzf(zzexVar.zzg(), zzexVar.zzd(), strZzk, Collections.EMPTY_LIST);
            zzj();
            return true;
        } catch (RemoteException unused) {
            zzO("Failed to send hits to AnalyticsService");
            return false;
        }
    }
}
