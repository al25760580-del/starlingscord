package com.google.android.gms.internal.gtm;

import af.w;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.PersistableBundle;
import android.os.SystemClock;
import ff.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcy extends zzbs {
    private boolean zza;
    private boolean zzb;
    private final AlarmManager zzc;
    private Integer zzd;

    public zzcy(zzbv zzbvVar) {
        super(zzbvVar);
        this.zzc = (AlarmManager) zzo().getSystemService("alarm");
    }

    private final int zzf() {
        if (this.zzd == null) {
            String strValueOf = String.valueOf(zzo().getPackageName());
            this.zzd = Integer.valueOf((strValueOf.length() != 0 ? "analytics".concat(strValueOf) : new String("analytics")).hashCode());
        }
        return this.zzd.intValue();
    }

    private final PendingIntent zzg() {
        Context contextZzo = zzo();
        return zzfu.zza(contextZzo, 0, new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsReceiver")), zzfu.zza);
    }

    public final void zza() {
        this.zzb = false;
        try {
            this.zzc.cancel(zzg());
        } catch (NullPointerException unused) {
        }
        JobScheduler jobScheduler = (JobScheduler) zzo().getSystemService("jobscheduler");
        int iZzf = zzf();
        zzP("Cancelling job. JobID", Integer.valueOf(iZzf));
        jobScheduler.cancel(iZzf);
    }

    public final void zzb() {
        zzW();
        w.i("Receiver not registered", this.zza);
        zzw();
        long jZzd = zzct.zzd();
        if (jZzd > 0) {
            zza();
            ((b) zzC()).getClass();
            SystemClock.elapsedRealtime();
            this.zzb = true;
            zzeu.zzR.zzb().getClass();
            zzO("Scheduling upload with JobScheduler");
            Context contextZzo = zzo();
            ComponentName componentName = new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsJobService");
            int iZzf = zzf();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            JobInfo jobInfoBuild = new JobInfo.Builder(iZzf, componentName).setMinimumLatency(jZzd).setOverrideDeadline(jZzd + jZzd).setExtras(persistableBundle).build();
            zzP("Scheduling job. JobID", Integer.valueOf(iZzf));
            zzfv.zza(contextZzo, jobInfoBuild, "com.google.android.gms", "DispatchAlarm");
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        try {
            zza();
            zzw();
            if (zzct.zzd() > 0) {
                Context contextZzo = zzo();
                ActivityInfo receiverInfo = contextZzo.getPackageManager().getReceiverInfo(new ComponentName(contextZzo, "com.google.android.gms.analytics.AnalyticsReceiver"), 0);
                if (receiverInfo == null || !receiverInfo.enabled) {
                    return;
                }
                zzO("Receiver registered for local dispatch.");
                this.zza = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean zze() {
        return this.zzb;
    }
}
