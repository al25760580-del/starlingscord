package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import io.sentry.SentryLevel;
import io.sentry.k0;
import io.sentry.l0;
import io.sentry.r;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f12281a;

    public b(c cVar) {
        this.f12281a = cVar;
    }

    public final void a() {
        this.f12281a.H.set(false);
        r rVarA = this.f12281a.f12287x.a();
        try {
            this.f12281a.E = null;
            this.f12281a.F = null;
            c cVar = this.f12281a;
            cVar.f12285v.getClass();
            cVar.G = SystemClock.uptimeMillis();
            this.f12281a.f12283e.getLogger().q(SentryLevel.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);
            Iterator it = this.f12281a.f12286w.iterator();
            while (it.hasNext()) {
                ((l0) it.next()).onConnectionStatusChanged(k0.DISCONNECTED);
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f12281a.F = network;
        if (this.f12281a.H.getAndSet(true)) {
            return;
        }
        r rVarA = c.K.a();
        try {
            Iterator it = c.L.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onAvailable(network);
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006c A[Catch: all -> 0x0076, TRY_LEAVE, TryCatch #2 {all -> 0x0076, blocks: (B:30:0x005e, B:31:0x0066, B:33:0x006c), top: B:63:0x005e }] */
    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        k0 k0VarL;
        r rVarA;
        Iterator it;
        if (network.equals(this.f12281a.F)) {
            NetworkCapabilities networkCapabilities2 = this.f12281a.E;
            int i7 = 0;
            if ((networkCapabilities2 == null) != (networkCapabilities == null)) {
                this.f12281a.B(networkCapabilities);
                k0VarL = this.f12281a.l();
                rVarA = this.f12281a.f12287x.a();
                it = this.f12281a.f12286w.iterator();
                while (it.hasNext()) {
                    ((l0) it.next()).onConnectionStatusChanged(k0VarL);
                }
                rVarA.close();
            } else if (networkCapabilities2 != null || networkCapabilities != null) {
                int[] iArr = c.N;
                int length = iArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        int[] iArr2 = c.M;
                        int length2 = iArr2.length;
                        while (true) {
                            if (i7 < length2) {
                                int i11 = iArr2[i7];
                                if (networkCapabilities2.hasTransport(i11) == networkCapabilities.hasTransport(i11)) {
                                    i7++;
                                }
                            }
                        }
                    } else {
                        int i12 = iArr[i10];
                        if (i12 == 0 || networkCapabilities2.hasCapability(i12) == networkCapabilities.hasCapability(i12)) {
                            i10++;
                        }
                    }
                    this.f12281a.B(networkCapabilities);
                    k0VarL = this.f12281a.l();
                    rVarA = this.f12281a.f12287x.a();
                    try {
                        it = this.f12281a.f12286w.iterator();
                        while (it.hasNext()) {
                            ((l0) it.next()).onConnectionStatusChanged(k0VarL);
                        }
                        rVarA.close();
                    } catch (Throwable th2) {
                        try {
                            rVarA.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            }
            r rVarA2 = c.K.a();
            try {
                Iterator it2 = c.L.iterator();
                while (it2.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it2.next()).onCapabilitiesChanged(network, networkCapabilities);
                }
                rVarA2.close();
            } catch (Throwable th4) {
                try {
                    rVarA2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (network.equals(this.f12281a.F)) {
            a();
            r rVarA = c.K.a();
            try {
                Iterator it = c.L.iterator();
                while (it.hasNext()) {
                    ((ConnectivityManager.NetworkCallback) it.next()).onLost(network);
                }
                rVarA.close();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        a();
        r rVarA = c.K.a();
        try {
            Iterator it = c.L.iterator();
            while (it.hasNext()) {
                ((ConnectivityManager.NetworkCallback) it.next()).onUnavailable();
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
