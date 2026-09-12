package com.google.android.gms.internal.gtm;

import af.w;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import ff.b;
import hf.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pe.a;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
final class zzck extends zzbs {
    private boolean zza;
    private final zzce zzb;
    private final zzfe zzc;
    private final zzfc zzd;
    private final zzcc zze;
    private long zzf;
    private final zzcw zzg;
    private final zzcw zzh;
    private final zzfo zzi;
    private long zzj;
    private boolean zzk;

    public zzck(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        w.g(zzbwVar);
        this.zzf = Long.MIN_VALUE;
        this.zzd = new zzfc(zzbvVar);
        this.zzb = new zzce(zzbvVar);
        this.zzc = new zzfe(zzbvVar);
        this.zze = new zzcc(zzbvVar);
        this.zzi = new zzfo(zzC());
        this.zzg = new zzcg(this, zzbvVar);
        this.zzh = new zzch(this, zzbvVar);
    }

    private final void zzag() {
        zzcy zzcyVarZzy = zzy();
        if (zzcyVarZzy.zze()) {
            zzcyVarZzy.zza();
        }
    }

    private final void zzah() {
        if (this.zzg.zzh()) {
            zzO("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzai() {
        long jZzc;
        zzcy zzcyVarZzy = zzy();
        if (zzcyVarZzy.zzc() && !zzcyVarZzy.zze()) {
            i.a();
            zzW();
            try {
                jZzc = this.zzb.zzc();
            } catch (SQLiteException e10) {
                zzK("Failed to get min/max hit times from local store", e10);
                jZzc = 0;
            }
            if (jZzc != 0) {
                ((b) zzC()).getClass();
                long jAbs = Math.abs(System.currentTimeMillis() - jZzc);
                zzw();
                if (jAbs <= zzeu.zzn.zzb().longValue()) {
                    zzw();
                    zzP("Dispatch alarm scheduled (ms)", Long.valueOf(zzct.zzd()));
                    zzcyVarZzy.zzb();
                }
            }
        }
    }

    private final boolean zzak(String str) {
        return c.a(zzo()).f10726a.checkCallingOrSelfPermission(str) == 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzck zzckVar) {
        try {
            zzckVar.zzb.zza();
            zzckVar.zzae();
        } catch (SQLiteException e10) {
            zzckVar.zzS("Failed to delete stale hits", e10);
        }
        zzcw zzcwVar = zzckVar.zzh;
        zzckVar.zzw();
        zzcwVar.zzg(86400000L);
    }

    public final long zza() {
        long j = this.zzf;
        if (j != Long.MIN_VALUE) {
            return j;
        }
        zzw();
        long jLongValue = zzeu.zzi.zzb().longValue();
        zzft zzftVarZzB = zzB();
        zzftVarZzB.zzW();
        if (!zzftVarZzB.zzc) {
            return jLongValue;
        }
        zzft zzftVarZzB2 = zzB();
        zzftVarZzB2.zzW();
        return ((long) zzftVarZzB2.zzd) * 1000;
    }

    public final void zzaa() {
        zzW();
        w.i("Analytics backend already started", !this.zza);
        this.zza = true;
        i iVarZzq = zzq();
        zzci zzciVar = new zzci(this);
        iVarZzq.getClass();
        iVarZzq.f18023b.submit(zzciVar);
    }

    public final void zzab() {
        zzW();
        zzw();
        i.a();
        Context contextZza = zzt().zza();
        if (!zzfi.zza(contextZza)) {
            zzR("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        } else if (!zzfn.zzh(contextZza)) {
            zzJ("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!a.zzb(contextZza)) {
            zzR("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        zzA().zza();
        if (!zzak("android.permission.ACCESS_NETWORK_STATE")) {
            zzJ("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (!zzak("android.permission.INTERNET")) {
            zzJ("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            zzad();
        }
        if (zzfn.zzh(zzo())) {
            zzO("AnalyticsService registered in the app manifest and enabled");
        } else {
            zzw();
            zzR("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if (!this.zzk) {
            zzw();
            if (!this.zzb.zzac()) {
                zzi();
            }
        }
        zzae();
    }

    public final void zzad() {
        zzW();
        i.a();
        this.zzk = true;
        this.zze.zzc();
        zzae();
    }

    public final void zzae() {
        long jMin;
        i.a();
        zzW();
        if (!this.zzk) {
            zzw();
            if (zza() > 0) {
                if (this.zzb.zzac()) {
                    this.zzd.zzc();
                    zzah();
                    zzag();
                    return;
                }
                if (!zzeu.zzJ.zzb().booleanValue()) {
                    this.zzd.zza();
                    if (!this.zzd.zzd()) {
                        zzah();
                        zzag();
                        zzai();
                        return;
                    }
                }
                zzai();
                long jZza = zza();
                long jZzb = zzA().zzb();
                if (jZzb != 0) {
                    ((b) zzC()).getClass();
                    jMin = jZza - Math.abs(System.currentTimeMillis() - jZzb);
                    if (jMin <= 0) {
                        zzw();
                        jMin = Math.min(zzct.zze(), jZza);
                    }
                } else {
                    zzw();
                    jMin = Math.min(zzct.zze(), jZza);
                }
                zzP("Dispatch scheduled (ms)", Long.valueOf(jMin));
                if (!this.zzg.zzh()) {
                    this.zzg.zzg(jMin);
                    return;
                } else {
                    this.zzg.zze(Math.max(1L, jMin + this.zzg.zzb()));
                    return;
                }
            }
        }
        this.zzd.zzc();
        zzah();
        zzag();
    }

    public final boolean zzaf() {
        boolean z5;
        i.a();
        zzW();
        zzO("Dispatching a batch of local hits");
        if (this.zze.zzg()) {
            z5 = false;
        } else {
            zzw();
            z5 = true;
        }
        boolean zZze = this.zzc.zze();
        if (z5 && !zZze) {
            zzO("No network or service available. Will retry later");
            return false;
        }
        zzw();
        int iZzh = zzct.zzh();
        zzw();
        long jMax = Math.max(iZzh, zzct.zzg());
        ArrayList arrayList = new ArrayList();
        long jMax2 = 0;
        while (true) {
            try {
                try {
                    this.zzb.zzm();
                    arrayList.clear();
                    try {
                        List<zzex> listZzj = this.zzb.zzj(jMax);
                        if (listZzj.isEmpty()) {
                            zzO("Store is empty, nothing to dispatch");
                            zzah();
                            zzag();
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e10) {
                                zzK("Failed to commit local dispatch transaction", e10);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                        zzP("Hits loaded from store. count", Integer.valueOf(listZzj.size()));
                        Iterator<zzex> it = listZzj.iterator();
                        while (it.hasNext()) {
                            if (it.next().zzb() == jMax2) {
                                zzL("Database contains successfully uploaded hit", Long.valueOf(jMax2), Integer.valueOf(listZzj.size()));
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e11) {
                                    zzK("Failed to commit local dispatch transaction", e11);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                        if (this.zze.zzg()) {
                            zzw();
                            zzO("Service connected, sending hits to the service");
                            while (!listZzj.isEmpty()) {
                                zzex zzexVar = listZzj.get(0);
                                if (!this.zze.zzh(zzexVar)) {
                                    break;
                                }
                                jMax2 = Math.max(jMax2, zzexVar.zzb());
                                listZzj.remove(zzexVar);
                                zzG("Hit sent do device AnalyticsService for delivery", zzexVar);
                                try {
                                    this.zzb.zzn(zzexVar.zzb());
                                    arrayList.add(Long.valueOf(zzexVar.zzb()));
                                } catch (SQLiteException e12) {
                                    zzK("Failed to remove hit that was send for delivery", e12);
                                    zzah();
                                    zzag();
                                    try {
                                        this.zzb.zzab();
                                        this.zzb.zzaa();
                                        return false;
                                    } catch (SQLiteException e13) {
                                        zzK("Failed to commit local dispatch transaction", e13);
                                        zzah();
                                        zzag();
                                        return false;
                                    }
                                }
                            }
                        }
                        if (this.zzc.zze()) {
                            List<Long> listZzc = this.zzc.zzc(listZzj);
                            Iterator<Long> it2 = listZzc.iterator();
                            while (it2.hasNext()) {
                                jMax2 = Math.max(jMax2, it2.next().longValue());
                            }
                            try {
                                this.zzb.zzZ(listZzc);
                                arrayList.addAll(listZzc);
                            } catch (SQLiteException e14) {
                                zzK("Failed to remove successfully uploaded hits", e14);
                                zzah();
                                zzag();
                                try {
                                    this.zzb.zzab();
                                    this.zzb.zzaa();
                                    return false;
                                } catch (SQLiteException e15) {
                                    zzK("Failed to commit local dispatch transaction", e15);
                                    zzah();
                                    zzag();
                                    return false;
                                }
                            }
                        }
                        if (arrayList.isEmpty()) {
                            try {
                                this.zzb.zzab();
                                this.zzb.zzaa();
                                return false;
                            } catch (SQLiteException e16) {
                                zzK("Failed to commit local dispatch transaction", e16);
                                zzah();
                                zzag();
                                return false;
                            }
                        }
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                        } catch (SQLiteException e17) {
                            zzK("Failed to commit local dispatch transaction", e17);
                            zzah();
                            zzag();
                            return false;
                        }
                    } catch (SQLiteException e18) {
                        zzS("Failed to read hits from persisted store", e18);
                        zzah();
                        zzag();
                        try {
                            this.zzb.zzab();
                            this.zzb.zzaa();
                            return false;
                        } catch (SQLiteException e19) {
                            zzK("Failed to commit local dispatch transaction", e19);
                            zzah();
                            zzag();
                            return false;
                        }
                    }
                } catch (Throwable th2) {
                    this.zzb.zzab();
                    this.zzb.zzaa();
                    throw th2;
                }
                this.zzb.zzab();
                this.zzb.zzaa();
                throw th2;
            } catch (SQLiteException e20) {
                zzK("Failed to commit local dispatch transaction", e20);
                zzah();
                zzag();
                return false;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zzb.zzX();
        this.zzc.zzX();
        this.zze.zzX();
    }

    public final void zzf(zzcz zzczVar) {
        zzg(zzczVar, this.zzj);
    }

    public final void zzg(zzcz zzczVar, long j) {
        long jAbs;
        i.a();
        zzW();
        long jZzb = zzA().zzb();
        if (jZzb != 0) {
            ((b) zzC()).getClass();
            jAbs = Math.abs(System.currentTimeMillis() - jZzb);
        } else {
            jAbs = -1;
        }
        zzG("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(jAbs));
        zzw();
        zzi();
        try {
            zzaf();
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(null);
            }
            if (this.zzj != j) {
                this.zzd.zzb();
            }
        } catch (Exception e10) {
            zzK("Local dispatch failed", e10);
            zzA().zzi();
            zzae();
            if (zzczVar != null) {
                zzczVar.zza(e10);
            }
        }
    }

    public final void zzi() {
        if (this.zzk) {
            return;
        }
        zzw();
        if (zzct.zzl() && !this.zze.zzg()) {
            zzw();
            if (this.zzi.zzc(zzeu.zzO.zzb().longValue())) {
                this.zzi.zzb();
                zzO("Connecting to service");
                if (this.zze.zzf()) {
                    zzO("Connected to service");
                    this.zzi.zza();
                    zzm();
                }
            }
        }
    }

    public final void zzl() {
        i.a();
        ((b) zzC()).getClass();
        this.zzj = System.currentTimeMillis();
    }

    public final void zzm() {
        i.a();
        zzw();
        i.a();
        zzW();
        zzE();
        zzw();
        if (!zzct.zzl()) {
            zzR("Service client disabled. Can't dispatch local hits to device AnalyticsService");
        }
        if (!this.zze.zzg()) {
            zzO("Service not connected");
            return;
        }
        if (this.zzb.zzac()) {
            return;
        }
        zzO("Dispatching local hits to device AnalyticsService");
        while (true) {
            try {
                zzce zzceVar = this.zzb;
                zzw();
                List<zzex> listZzj = zzceVar.zzj(zzct.zzh());
                if (listZzj.isEmpty()) {
                    zzae();
                    return;
                }
                while (!listZzj.isEmpty()) {
                    zzex zzexVar = listZzj.get(0);
                    if (!this.zze.zzh(zzexVar)) {
                        zzae();
                        return;
                    }
                    listZzj.remove(zzexVar);
                    try {
                        this.zzb.zzn(zzexVar.zzb());
                    } catch (SQLiteException e10) {
                        zzK("Failed to remove hit that was send for delivery", e10);
                        zzah();
                        zzag();
                        return;
                    }
                }
            } catch (SQLiteException e11) {
                zzK("Failed to read hits from store", e11);
                zzah();
                zzag();
                return;
            }
        }
    }
}
