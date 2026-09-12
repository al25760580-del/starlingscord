package com.google.android.gms.internal.gtm;

import af.w;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbw {
    private final Context zza;
    private final Context zzb;

    public zzbw(Context context) {
        w.g(context);
        Context applicationContext = context.getApplicationContext();
        w.h(applicationContext, "Application context can't be null");
        this.zza = applicationContext;
        this.zzb = applicationContext;
    }

    public final Context zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }
}
