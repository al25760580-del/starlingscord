package com.google.android.gms.internal.gtm;

import xe.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbt {
    public static final String zza;
    public static final String zzb;

    static {
        String strReplaceAll = String.valueOf(f.f22923a / 1000).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        zza = strReplaceAll;
        String strValueOf = String.valueOf(strReplaceAll);
        zzb = strValueOf.length() != 0 ? "ma".concat(strValueOf) : new String("ma");
    }
}
