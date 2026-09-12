package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.android.core.f0;
import io.sentry.k0;
import io.sentry.l0;
import io.sentry.r;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f12280e;

    public /* synthetic */ a(c cVar, int i7) {
        this.f12279d = i7;
        this.f12280e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12279d) {
            case 0:
                c cVar = this.f12280e;
                cVar.z(true);
                r rVarA = c.K.a();
                try {
                    c.L.clear();
                    rVarA.close();
                    r rVarA2 = c.I.a();
                    try {
                        c.J = null;
                        rVarA2.close();
                        f0.f12181w.i(cVar);
                        return;
                    } catch (Throwable th2) {
                        try {
                            rVarA2.close();
                            break;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        rVarA.close();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            case 1:
                this.f12280e.i();
                return;
            case 2:
                this.f12280e.z(false);
                return;
            default:
                c cVar2 = this.f12280e;
                cVar2.B(null);
                k0 k0VarL = cVar2.l();
                if (k0VarL == k0.DISCONNECTED) {
                    cVar2.H.set(false);
                    r rVarA3 = c.K.a();
                    try {
                        Iterator it = c.L.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        rVarA3.close();
                    } catch (Throwable th6) {
                        try {
                            rVarA3.close();
                            break;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                        }
                        throw th6;
                    }
                }
                r rVarA4 = cVar2.f12287x.a();
                try {
                    Iterator it2 = cVar2.f12286w.iterator();
                    while (it2.hasNext()) {
                        ((l0) it2.next()).onConnectionStatusChanged(k0VarL);
                    }
                    rVarA4.close();
                    cVar2.i();
                    return;
                } catch (Throwable th8) {
                    try {
                        rVarA4.close();
                        break;
                    } catch (Throwable th9) {
                        th8.addSuppressed(th9);
                    }
                    throw th8;
                }
        }
    }
}
