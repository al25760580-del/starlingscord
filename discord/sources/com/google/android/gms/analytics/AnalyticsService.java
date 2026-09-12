package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsService extends Service implements zzfm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zzfn f5894d;

    public final zzfn a() {
        if (this.f5894d == null) {
            this.f5894d = new zzfn(this);
        }
        return this.f5894d;
    }

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final boolean callServiceStopSelfResult(int i7) {
        return stopSelfResult(i7);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        a();
        return null;
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

    @Override // com.google.android.gms.internal.gtm.zzfm
    public final void zza(JobParameters jobParameters, boolean z5) {
        throw new UnsupportedOperationException();
    }
}
