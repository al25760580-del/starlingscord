package com.google.android.gms.internal.gtm;

import a3.e;
import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import pe.c;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
@Deprecated
public abstract class zzfa {
    private static volatile c zza = new zzcu();

    @SuppressLint({"LogTagMismatch"})
    public static void zzb(String str, Object obj) {
        String strO;
        zzfb zzfbVarZza = zzfb.zza();
        if (zzfbVarZza != null) {
            zzfbVarZza.zzK(str, obj);
        } else if (zzf(3)) {
            if (obj != null) {
                String str2 = (String) obj;
                strO = e.o(new StringBuilder(str.length() + 1 + str2.length()), str, ":", str2);
            } else {
                strO = str;
            }
            Log.e(zzeu.zzc.zzb(), strO);
        }
        c cVar = zza;
        if (cVar != null) {
            cVar.error(str);
        }
    }

    public static boolean zzf(int i7) {
        return zza != null && zza.getLogLevel() <= i7;
    }
}
