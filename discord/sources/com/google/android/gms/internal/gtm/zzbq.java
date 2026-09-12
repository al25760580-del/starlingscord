package com.google.android.gms.internal.gtm;

import af.w;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbq extends zzbs {
    private final zzck zza;

    public zzbq(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        w.g(zzbwVar);
        this.zza = new zzck(zzbvVar, zzbwVar);
    }

    public final void zzc() {
        zzW();
        Context contextZzo = zzo();
        if (!zzfi.zza(contextZzo) || !zzfn.zzh(contextZzo)) {
            zze(null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsService"));
        contextZzo.startService(intent);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zza.zzX();
    }

    public final void zze(zzcz zzczVar) {
        zzW();
        i iVarZzq = zzq();
        zzbo zzboVar = new zzbo(this, zzczVar);
        iVarZzq.getClass();
        iVarZzq.f18023b.submit(zzboVar);
    }

    public final void zzi() {
        i.a();
        this.zza.zzl();
    }

    public final void zzj() {
        i.a();
        this.zza.zzm();
    }

    public final void zzk() {
        zzW();
        i.a();
        zzck zzckVar = this.zza;
        i.a();
        zzckVar.zzW();
        zzckVar.zzO("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzaa();
    }
}
