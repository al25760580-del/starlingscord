package com.google.android.gms.internal.gtm;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzcf extends zzbs {
    private final zzav zza;

    public zzcf(zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = new zzav();
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        i iVarZzq = zzq();
        if (iVarZzq.f18024c == null) {
            synchronized (iVarZzq) {
                try {
                    if (iVarZzq.f18024c == null) {
                        zzav zzavVar = new zzav();
                        PackageManager packageManager = iVarZzq.f18022a.getPackageManager();
                        String packageName = iVarZzq.f18022a.getPackageName();
                        zzavVar.zzi(packageName);
                        zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                        String str = null;
                        try {
                            PackageInfo packageInfo = packageManager.getPackageInfo(iVarZzq.f18022a.getPackageName(), 0);
                            if (packageInfo != null) {
                                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                                if (!TextUtils.isEmpty(applicationLabel)) {
                                    packageName = applicationLabel.toString();
                                }
                                str = packageInfo.versionName;
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            String strValueOf = String.valueOf(packageName);
                            Log.e("GAv4", strValueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(strValueOf) : new String("Error retrieving package info: appName set to "));
                        }
                        zzavVar.zzk(packageName);
                        zzavVar.zzl(str);
                        iVarZzq.f18024c = zzavVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        iVarZzq.f18024c.zzh(this.zza);
        zzft zzftVarZzB = zzB();
        zzftVarZzB.zzW();
        String str2 = zzftVarZzB.zzb;
        if (str2 != null) {
            this.zza.zzk(str2);
        }
        zzftVarZzB.zzW();
        String str3 = zzftVarZzB.zza;
        if (str3 != null) {
            this.zza.zzl(str3);
        }
    }
}
