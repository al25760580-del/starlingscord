package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import me.c;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InstallReferrerStateListener f3825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b f3826e;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f3826e = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.f3825d = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c aVar;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i7 = me.b.f15743f;
        if (iBinder == null) {
            aVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            aVar = iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new me.a(iBinder);
        }
        b bVar = this.f3826e;
        bVar.f3829c = aVar;
        bVar.f3827a = 2;
        this.f3825d.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f3826e;
        bVar.f3829c = null;
        bVar.f3827a = 0;
        this.f3825d.onInstallReferrerServiceDisconnected();
    }
}
