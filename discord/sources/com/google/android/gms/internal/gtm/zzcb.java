package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import ef.a;
import pe.i;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzcb implements ServiceConnection {
    final /* synthetic */ zzcc zza;
    private volatile boolean zzb;
    private volatile zzey zzc;

    public zzcb(zzcc zzccVar) {
        this.zza = zzccVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzey zzeyVar;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("AnalyticsServiceConnection.onServiceConnected");
        }
        synchronized (this) {
            try {
                if (iBinder == null) {
                    this.zza.zzJ("Service connected with null binder");
                    notifyAll();
                    return;
                }
                try {
                    String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(interfaceDescriptor)) {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                        zzeyVar = iInterfaceQueryLocalInterface instanceof zzey ? (zzey) iInterfaceQueryLocalInterface : new zzey(iBinder);
                        try {
                            this.zza.zzO("Bound to IAnalyticsService interface");
                        } catch (RemoteException unused) {
                            this.zza.zzJ("Service connect failed to get IAnalyticsService");
                        }
                    } else {
                        this.zza.zzK("Got binder with a wrong descriptor", interfaceDescriptor);
                        zzeyVar = null;
                    }
                } catch (RemoteException unused2) {
                    zzeyVar = null;
                }
                if (zzeyVar == null) {
                    try {
                        a.a().b(this.zza.zzo(), this.zza.zza);
                    } catch (IllegalArgumentException unused3) {
                    }
                } else if (this.zzb) {
                    this.zzc = zzeyVar;
                } else {
                    this.zza.zzR("onServiceConnected received after the timeout limit");
                    i iVarZzq = this.zza.zzq();
                    zzbz zzbzVar = new zzbz(this, zzeyVar, null);
                    iVarZzq.getClass();
                    iVarZzq.f18023b.submit(zzbzVar);
                }
                notifyAll();
            } catch (Throwable th2) {
                notifyAll();
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("AnalyticsServiceConnection.onServiceDisconnected");
        }
        i iVarZzq = this.zza.zzq();
        zzca zzcaVar = new zzca(this, componentName);
        iVarZzq.getClass();
        iVarZzq.f18023b.submit(zzcaVar);
    }

    public final zzey zza() {
        i.a();
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        Context contextZzo = this.zza.zzo();
        intent.putExtra("app_package_name", contextZzo.getPackageName());
        a aVarA = a.a();
        synchronized (this) {
            this.zzc = null;
            this.zzb = true;
            boolean zC = aVarA.c(contextZzo, contextZzo.getClass().getName(), intent, this.zza.zza, 129, null);
            this.zza.zzP("Bind to service requested", Boolean.valueOf(zC));
            if (!zC) {
                this.zzb = false;
                return null;
            }
            try {
                this.zza.zzw();
                wait(zzeu.zzL.zzb().longValue());
            } catch (InterruptedException unused) {
                this.zza.zzR("Wait for service connect was interrupted");
            }
            this.zzb = false;
            zzey zzeyVar = this.zzc;
            this.zzc = null;
            if (zzeyVar == null) {
                this.zza.zzJ("Successfully bound to service but never got onServiceConnected callback");
            }
            return zzeyVar;
        }
    }
}
