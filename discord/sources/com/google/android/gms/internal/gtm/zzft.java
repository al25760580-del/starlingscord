package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzft extends zzbs {
    protected String zza;
    protected String zzb;
    protected boolean zzc;
    protected int zzd;
    protected boolean zze;
    protected boolean zzf;

    public zzft(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public final boolean zzc() {
        zzW();
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        ApplicationInfo applicationInfo;
        int i7;
        int i10;
        Context contextZzo = zzo();
        try {
            applicationInfo = contextZzo.getPackageManager().getApplicationInfo(contextZzo.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
        } catch (PackageManager.NameNotFoundException e10) {
            zzS("PackageManager doesn't know about the app package", e10);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            zzR("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i7 = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) <= 0) {
            return;
        }
        zzbv zzbvVarZzt = zzt();
        zzew zzewVar = (zzew) new zzcs(zzbvVarZzt, new zzev(zzbvVarZzt)).zza(i7);
        if (zzewVar != null) {
            zzO("Loading global XML config values");
            String str = zzewVar.zza;
            if (str != null) {
                this.zzb = str;
                zzG("XML config - app name", str);
            }
            String str2 = zzewVar.zzb;
            if (str2 != null) {
                this.zza = str2;
                zzG("XML config - app version", str2);
            }
            String str3 = zzewVar.zzc;
            if (str3 != null) {
                String lowerCase = str3.toLowerCase(Locale.US);
                if ("verbose".equals(lowerCase)) {
                    i10 = 0;
                } else if ("info".equals(lowerCase)) {
                    i10 = 1;
                } else if ("warning".equals(lowerCase)) {
                    i10 = 2;
                } else {
                    i10 = "error".equals(lowerCase) ? 3 : -1;
                }
                if (i10 >= 0) {
                    zzP("XML config - log level", Integer.valueOf(i10));
                }
            }
            int i11 = zzewVar.zzd;
            if (i11 >= 0) {
                this.zzd = i11;
                this.zzc = true;
                zzG("XML config - dispatch period (sec)", Integer.valueOf(i11));
            }
            int i12 = zzewVar.zze;
            if (i12 != -1) {
                boolean z5 = 1 == i12;
                this.zzf = z5;
                this.zze = true;
                zzG("XML config - dry run", Boolean.valueOf(z5));
            }
        }
    }

    public final boolean zze() {
        zzW();
        return this.zze;
    }

    public final boolean zzf() {
        zzW();
        return false;
    }
}
