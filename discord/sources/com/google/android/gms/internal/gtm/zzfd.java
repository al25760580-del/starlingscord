package com.google.android.gms.internal.gtm;

import af.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzfd {
    final /* synthetic */ zzfe zza;
    private int zzb;
    private final ByteArrayOutputStream zzc = new ByteArrayOutputStream();

    public zzfd(zzfe zzfeVar) {
        this.zza = zzfeVar;
    }

    public final int zza() {
        return this.zzb;
    }

    public final boolean zzb(zzex zzexVar) {
        w.g(zzexVar);
        int i7 = this.zzb;
        this.zza.zzw();
        if (i7 + 1 <= zzct.zzg()) {
            String strZza = this.zza.zza(zzexVar, false);
            if (strZza == null) {
                this.zza.zzz().zzb(zzexVar, "Error formatting hit");
                return true;
            }
            byte[] bytes = strZza.getBytes();
            int length = bytes.length;
            this.zza.zzw();
            if (length > zzct.zzf()) {
                this.zza.zzz().zzb(zzexVar, "Hit size exceeds the maximum size limit");
                return true;
            }
            if (this.zzc.size() > 0) {
                length++;
            }
            int size = this.zzc.size();
            this.zza.zzw();
            if (size + length <= zzeu.zzA.zzb().intValue()) {
                try {
                    if (this.zzc.size() > 0) {
                        this.zzc.write(zzfe.zza);
                    }
                    this.zzc.write(bytes);
                    this.zzb++;
                    return true;
                } catch (IOException e10) {
                    this.zza.zzK("Failed to write payload when batching hits", e10);
                    return true;
                }
            }
        }
        return false;
    }

    public final byte[] zzc() {
        return this.zzc.toByteArray();
    }
}
