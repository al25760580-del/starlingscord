package com.google.android.gms.internal.gtm;

import af.w;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.util.VisibleForTesting;
import kk.b;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public static zzfb zza() {
        return zza;
    }

    @VisibleForTesting
    public static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            if (obj instanceof Boolean) {
                return String.valueOf(obj);
            }
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l6 = (Long) obj;
        if (Math.abs(l6.longValue()) < 100) {
            return String.valueOf(obj);
        }
        String str = String.valueOf(obj).charAt(0) != '-' ? "" : "-";
        String strValueOf = String.valueOf(Math.abs(l6.longValue()));
        StringBuilder sbN = b.n(str);
        sbN.append(Math.round(Math.pow(10.0d, strValueOf.length() - 1)));
        sbN.append("...");
        sbN.append(str);
        sbN.append(Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d));
        return sbN.toString();
    }

    public final void zzb(zzex zzexVar, String str) {
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), zzexVar != null ? zzexVar.toString() : "no hit data");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i7, String str, Object obj, Object obj2, Object obj3) {
        char c8;
        try {
            w.g(str);
            if (zzw().zzb()) {
                zzw();
                c8 = 'C';
            } else {
                zzw();
                c8 = 'c';
            }
            char cCharAt = "01VDIWEA?".charAt(i7);
            String str2 = zzbt.zza;
            String strZzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(strZzD).length());
            sb2.append("3");
            sb2.append(cCharAt);
            sb2.append(c8);
            sb2.append(str2);
            sb2.append(":");
            sb2.append(strZzD);
            String string = sb2.toString();
            if (string.length() > 1024) {
                string = string.substring(0, IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            }
            zzfh zzfhVarZzp = zzt().zzp();
            if (zzfhVarZzp != null) {
                zzfhVarZzp.zze().zzc(string);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
