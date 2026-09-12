package com.google.android.gms.internal.gtm;

import af.w;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import ff.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import pe.b;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"StaticFieldLeak"})
public final class zzbv {
    private static volatile zzbv zza;
    private final Context zzb;
    private final Context zzc;
    private final a zzd;
    private final zzct zze;
    private final zzfb zzf;
    private final i zzg;
    private final zzbq zzh;
    private final zzcy zzi;
    private final zzft zzj;
    private final zzfh zzk;
    private final b zzl;
    private final zzcn zzm;
    private final zzbi zzn;
    private final zzcf zzo;
    private final zzcx zzp;

    public zzbv(zzbw zzbwVar) {
        Context contextZza = zzbwVar.zza();
        w.h(contextZza, "Application context can't be null");
        Context contextZzb = zzbwVar.zzb();
        w.g(contextZzb);
        this.zzb = contextZza;
        this.zzc = contextZzb;
        this.zzd = ff.b.f9150a;
        this.zze = new zzct(this);
        zzfb zzfbVar = new zzfb(this);
        zzfbVar.zzX();
        this.zzf = zzfbVar;
        zzfb zzfbVarZzm = zzm();
        String str = zzbt.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 134);
        sb2.append("Google Analytics ");
        sb2.append(str);
        sb2.append(" is starting up. To enable debug logging on a device run:\n  adb shell setprop log.tag.GAv4 DEBUG\n  adb logcat -s GAv4");
        zzfbVarZzm.zzM(sb2.toString());
        zzfh zzfhVar = new zzfh(this);
        zzfhVar.zzX();
        this.zzk = zzfhVar;
        zzft zzftVar = new zzft(this);
        zzftVar.zzX();
        this.zzj = zzftVar;
        zzbq zzbqVar = new zzbq(this, zzbwVar);
        zzcn zzcnVar = new zzcn(this);
        zzbi zzbiVar = new zzbi(this);
        zzcf zzcfVar = new zzcf(this);
        zzcx zzcxVar = new zzcx(this);
        if (i.f18021e == null) {
            synchronized (i.class) {
                try {
                    if (i.f18021e == null) {
                        i.f18021e = new i(contextZza);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        i iVar = i.f18021e;
        iVar.f18025d = new zzbu(this);
        this.zzg = iVar;
        b bVar = new b(this);
        new HashSet();
        zzcnVar.zzX();
        this.zzm = zzcnVar;
        zzbiVar.zzX();
        this.zzn = zzbiVar;
        zzcfVar.zzX();
        this.zzo = zzcfVar;
        zzcxVar.zzX();
        this.zzp = zzcxVar;
        zzcy zzcyVar = new zzcy(this);
        zzcyVar.zzX();
        this.zzi = zzcyVar;
        zzbqVar.zzX();
        this.zzh = zzbqVar;
        zzft zzftVarZzq = ((zzbv) bVar.f9357e).zzq();
        zzftVarZzq.zzf();
        if (zzftVarZzq.zze()) {
            zzftVarZzq.zzc();
        }
        zzftVarZzq.zzf();
        this.zzl = bVar;
        zzbqVar.zzm();
    }

    public static zzbv zzg(Context context) {
        w.g(context);
        if (zza == null) {
            synchronized (zzbv.class) {
                if (zza == null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    zzbv zzbvVar = new zzbv(new zzbw(context));
                    zza = zzbvVar;
                    ArrayList arrayList = b.f18018i;
                    synchronized (b.class) {
                        try {
                            ArrayList arrayList2 = b.f18018i;
                            if (arrayList2 != null) {
                                Iterator it = arrayList2.iterator();
                                while (it.hasNext()) {
                                    ((Runnable) it.next()).run();
                                }
                                b.f18018i = null;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                    Long lZzb = zzeu.zzQ.zzb();
                    if (jElapsedRealtime2 > lZzb.longValue()) {
                        zzbvVar.zzm().zzT("Slow initialization (ms)", Long.valueOf(jElapsedRealtime2), lZzb);
                    }
                }
            }
        }
        return zza;
    }

    private static final void zzs(zzbs zzbsVar) {
        w.h(zzbsVar, "Analytics service not created/initialized");
        w.a("Analytics service not initialized", zzbsVar.zzY());
    }

    public final Context zza() {
        return this.zzb;
    }

    public final Context zzb() {
        return this.zzc;
    }

    public final i zzd() {
        w.g(this.zzg);
        return this.zzg;
    }

    public final zzbq zzf() {
        zzs(this.zzh);
        return this.zzh;
    }

    public final zzct zzj() {
        return this.zze;
    }

    public final zzcy zzl() {
        zzs(this.zzi);
        return this.zzi;
    }

    public final zzfb zzm() {
        zzs(this.zzf);
        return this.zzf;
    }

    public final zzfb zzn() {
        return this.zzf;
    }

    public final zzfh zzo() {
        zzs(this.zzk);
        return this.zzk;
    }

    public final zzfh zzp() {
        zzfh zzfhVar = this.zzk;
        if (zzfhVar == null || !zzfhVar.zzY()) {
            return null;
        }
        return this.zzk;
    }

    public final zzft zzq() {
        zzs(this.zzj);
        return this.zzj;
    }

    public final a zzr() {
        return this.zzd;
    }
}
