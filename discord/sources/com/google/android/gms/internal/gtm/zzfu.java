package com.google.android.gms.internal.gtm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfu {
    public static final int zza;

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    static {
        int i7 = Build.VERSION.SDK_INT;
        int i10 = 33554432;
        if (i7 < 31) {
            if (i7 >= 30) {
                String str = Build.VERSION.CODENAME;
                if (str.length() != 1 || str.charAt(0) < 'S' || str.charAt(0) > 'Z') {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
        }
        zza = i10;
    }

    public static PendingIntent zza(Context context, int i7, Intent intent, int i10) {
        return PendingIntent.getBroadcast(context, 0, intent, i10);
    }
}
