package com.google.android.gms.internal.gtm;

import af.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.util.VisibleForTesting;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
final class zzfc extends BroadcastReceiver {

    @VisibleForTesting
    static final String zza = "com.google.android.gms.internal.gtm.zzfc";
    private final zzbv zzb;
    private boolean zzc;
    private boolean zzd;

    public zzfc(zzbv zzbvVar) {
        w.g(zzbvVar);
        this.zzb = zzbvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.zzm();
        this.zzb.zzf();
        String action = intent.getAction();
        this.zzb.zzm().zzP("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
                this.zzb.zzm().zzS("NetworkBroadcastReceiver received unknown action", action);
                return;
            } else {
                if (intent.hasExtra(zza)) {
                    return;
                }
                zzbq zzbqVarZzf = this.zzb.zzf();
                zzbqVarZzf.zzO("Radio powered up");
                zzbqVarZzf.zzc();
                return;
            }
        }
        boolean zZze = zze();
        if (this.zzd != zZze) {
            this.zzd = zZze;
            zzbq zzbqVarZzf2 = this.zzb.zzf();
            zzbqVarZzf2.zzP("Network connectivity status changed", Boolean.valueOf(zZze));
            i iVarZzq = zzbqVarZzf2.zzq();
            zzbj zzbjVar = new zzbj(zzbqVarZzf2, zZze);
            iVarZzq.getClass();
            iVarZzq.f18023b.submit(zzbjVar);
        }
    }

    public final void zza() {
        this.zzb.zzm();
        this.zzb.zzf();
        if (this.zzc) {
            return;
        }
        Context contextZza = this.zzb.zza();
        contextZza.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(contextZza.getPackageName());
        contextZza.registerReceiver(this, intentFilter);
        this.zzd = zze();
        this.zzb.zzm().zzP("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    @VisibleForTesting
    public final void zzb() {
        Context contextZza = this.zzb.zza();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(contextZza.getPackageName());
        intent.putExtra(zza, true);
        contextZza.sendOrderedBroadcast(intent, null);
    }

    public final void zzc() {
        if (this.zzc) {
            this.zzb.zzm().zzO("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.zzb.zzm().zzK("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final boolean zzd() {
        if (!this.zzc) {
            this.zzb.zzm().zzR("Connectivity unknown. Receiver not registered");
        }
        return this.zzd;
    }

    @VisibleForTesting
    public final boolean zze() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.zza().getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (SecurityException unused) {
        }
    }
}
