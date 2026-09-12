package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(24)
public final class AnalyticsJobService extends JobService implements zzfm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzfn f5892d;

    public final zzfn a() {
        if (this.f5892d == null) {
            this.f5892d = new zzfn(this);
        }
        return this.f5892d;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final boolean callServiceStopSelfResult(int i7) {
        return stopSelfResult(i7);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        a().zze();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a().zzf();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i10) {
        a().zza(intent, i7, i10);
        return 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a().zzi(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final void zza(JobParameters jobParameters, boolean z5) {
        jobFinished(jobParameters, false);
    }
}
