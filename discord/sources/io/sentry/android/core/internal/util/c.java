package io.sentry.android.core.internal.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.SystemClock;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.c0;
import io.sentry.android.core.f0;
import io.sentry.android.core.k0;
import io.sentry.l0;
import io.sentry.m0;
import io.sentry.r;
import io.sentry.w5;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements m0, c0 {
    public static volatile ConnectivityManager J;
    public volatile NetworkCapabilities E;
    public volatile Network F;
    public volatile long G;
    public final AtomicBoolean H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12282d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w5 f12283e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k0 f12284i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final d f12285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f12286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final io.sentry.util.a f12287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile b f12288y;
    public static final io.sentry.util.a I = new io.sentry.util.a();
    public static final io.sentry.util.a K = new io.sentry.util.a();
    public static final ArrayList L = new ArrayList();
    public static final int[] M = {1, 0, 3, 2};
    public static final int[] N = new int[2];

    public c(Context context, k0 k0Var, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.f12289d;
        this.f12287x = new io.sentry.util.a();
        this.G = 0L;
        this.H = new AtomicBoolean(false);
        Context applicationContext = context.getApplicationContext();
        this.f12282d = applicationContext != null ? applicationContext : context;
        this.f12283e = sentryAndroidOptions;
        this.f12284i = k0Var;
        this.f12285v = dVar;
        this.f12286w = new ArrayList();
        int[] iArr = N;
        iArr[0] = 12;
        iArr[1] = 16;
        y(new a(this, 1));
        f0.f12181w.c(this);
    }

    public static boolean g(Context context, ILogger iLogger, k0 k0Var, ConnectivityManager.NetworkCallback networkCallback) {
        k0Var.getClass();
        if (!mo.c0.y(context)) {
            iLogger.q(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return false;
        }
        r rVarA = K.a();
        try {
            L.add(networkCallback);
            rVarA.close();
            return true;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String n(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(3)) {
            return "ethernet";
        }
        if (networkCapabilities.hasTransport(1)) {
            return "wifi";
        }
        if (networkCapabilities.hasTransport(0)) {
            return "cellular";
        }
        return null;
    }

    public static ConnectivityManager u(Context context, ILogger iLogger) {
        if (J != null) {
            return J;
        }
        r rVarA = I.a();
        try {
            if (J != null) {
                ConnectivityManager connectivityManager = J;
                rVarA.close();
                return connectivityManager;
            }
            J = (ConnectivityManager) context.getSystemService("connectivity");
            if (J == null) {
                iLogger.q(SentryLevel.INFO, "ConnectivityManager is null and cannot check network status", new Object[0]);
            }
            ConnectivityManager connectivityManager2 = J;
            rVarA.close();
            return connectivityManager2;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void B(NetworkCapabilities networkCapabilities) {
        r rVarA = this.f12287x.a();
        try {
            if (networkCapabilities != null) {
                this.E = networkCapabilities;
            } else {
                if (!mo.c0.y(this.f12282d)) {
                    this.f12283e.getLogger().q(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                    this.E = null;
                    this.f12285v.getClass();
                    this.G = SystemClock.uptimeMillis();
                    rVarA.close();
                    return;
                }
                this.f12284i.getClass();
                ConnectivityManager connectivityManagerU = u(this.f12282d, this.f12283e.getLogger());
                if (connectivityManagerU != null) {
                    Network activeNetwork = connectivityManagerU.getActiveNetwork();
                    this.E = activeNetwork != null ? connectivityManagerU.getNetworkCapabilities(activeNetwork) : null;
                } else {
                    this.E = null;
                }
            }
            this.f12285v.getClass();
            this.G = SystemClock.uptimeMillis();
            this.f12283e.getLogger().q(SentryLevel.DEBUG, "Cache updated - Status: " + l() + ", Type: " + q(), new Object[0]);
        } catch (Throwable th2) {
            try {
                this.f12283e.getLogger().g(SentryLevel.WARNING, "Failed to update connection status cache", th2);
                this.E = null;
                this.f12285v.getClass();
                this.G = SystemClock.uptimeMillis();
            } catch (Throwable th3) {
                try {
                    rVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        rVarA.close();
    }

    @Override // io.sentry.m0
    public final io.sentry.k0 I() {
        this.f12285v.getClass();
        if (SystemClock.uptimeMillis() - this.G >= 120000) {
            B(null);
        }
        return l();
    }

    @Override // io.sentry.m0
    public final boolean M(l0 l0Var) {
        r rVarA = this.f12287x.a();
        try {
            this.f12286w.add(l0Var);
            rVarA.close();
            i();
            return this.f12288y != null;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.m0
    public final void W(l0 l0Var) {
        r rVarA = this.f12287x.a();
        try {
            this.f12286w.remove(l0Var);
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

    @Override // io.sentry.android.core.c0
    public final void c() {
        if (this.f12288y != null) {
            return;
        }
        y(new a(this, 3));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y(new a(this, 0));
    }

    @Override // io.sentry.android.core.c0
    public final void f() {
        if (this.f12288y == null) {
            return;
        }
        y(new a(this, 2));
    }

    public final void i() {
        if (io.sentry.android.core.l0.i() && this.f12288y == null) {
            r rVarA = this.f12287x.a();
            try {
                if (this.f12288y != null) {
                    rVarA.close();
                    return;
                }
                b bVar = new b(this);
                Context context = this.f12282d;
                ILogger logger = this.f12283e.getLogger();
                this.f12284i.getClass();
                ConnectivityManager connectivityManagerU = u(context, logger);
                if (connectivityManagerU != null) {
                    if (mo.c0.y(context)) {
                        try {
                            connectivityManagerU.registerDefaultNetworkCallback(bVar);
                            this.f12288y = bVar;
                            this.f12283e.getLogger().q(SentryLevel.DEBUG, "Network callback registered successfully", new Object[0]);
                        } catch (Throwable th2) {
                            logger.g(SentryLevel.WARNING, "registerDefaultNetworkCallback failed", th2);
                            this.f12283e.getLogger().q(SentryLevel.WARNING, "Failed to register network callback", new Object[0]);
                        }
                        rVarA.close();
                    }
                    logger.q(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                }
                this.f12283e.getLogger().q(SentryLevel.WARNING, "Failed to register network callback", new Object[0]);
                rVarA.close();
            } catch (Throwable th3) {
                try {
                    rVarA.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public final io.sentry.k0 l() {
        if (this.E != null) {
            NetworkCapabilities networkCapabilities = this.E;
            if (networkCapabilities != null) {
                boolean zHasCapability = networkCapabilities.hasCapability(12);
                this.f12284i.getClass();
                if (zHasCapability && networkCapabilities.hasCapability(16)) {
                    for (int i7 : M) {
                        if (networkCapabilities.hasTransport(i7)) {
                            return io.sentry.k0.CONNECTED;
                        }
                    }
                }
            }
            return io.sentry.k0.DISCONNECTED;
        }
        ConnectivityManager connectivityManagerU = u(this.f12282d, this.f12283e.getLogger());
        if (connectivityManagerU == null) {
            return io.sentry.k0.UNKNOWN;
        }
        Context context = this.f12282d;
        ILogger logger = this.f12283e.getLogger();
        if (!mo.c0.y(context)) {
            logger.q(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
            return io.sentry.k0.NO_PERMISSION;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManagerU.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected() ? io.sentry.k0.CONNECTED : io.sentry.k0.DISCONNECTED;
            }
            logger.q(SentryLevel.INFO, "NetworkInfo is null, there's no active network.", new Object[0]);
            return io.sentry.k0.DISCONNECTED;
        } catch (Throwable th2) {
            logger.g(SentryLevel.WARNING, "Could not retrieve Connection Status", th2);
            return io.sentry.k0.UNKNOWN;
        }
    }

    public final String q() {
        NetworkCapabilities networkCapabilities = this.E;
        if (networkCapabilities != null) {
            return n(networkCapabilities);
        }
        Context context = this.f12282d;
        ILogger logger = this.f12283e.getLogger();
        k0 k0Var = this.f12284i;
        ConnectivityManager connectivityManagerU = u(context, logger);
        if (connectivityManagerU != null) {
            if (!mo.c0.y(context)) {
                logger.q(SentryLevel.INFO, "No permission (ACCESS_NETWORK_STATE) to check network status.", new Object[0]);
                return null;
            }
            try {
                k0Var.getClass();
                Network activeNetwork = connectivityManagerU.getActiveNetwork();
                if (activeNetwork == null) {
                    logger.q(SentryLevel.INFO, "Network is null and cannot check network status", new Object[0]);
                    return null;
                }
                NetworkCapabilities networkCapabilities2 = connectivityManagerU.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities2 == null) {
                    logger.q(SentryLevel.INFO, "NetworkCapabilities is null and cannot check network type", new Object[0]);
                    return null;
                }
                boolean zHasTransport = networkCapabilities2.hasTransport(3);
                boolean zHasTransport2 = networkCapabilities2.hasTransport(1);
                boolean zHasTransport3 = networkCapabilities2.hasTransport(0);
                if (zHasTransport) {
                    return "ethernet";
                }
                if (zHasTransport2) {
                    return "wifi";
                }
                if (zHasTransport3) {
                    return "cellular";
                }
            } catch (Throwable th2) {
                logger.g(SentryLevel.ERROR, "Failed to retrieve network info", th2);
                return null;
            }
        }
        return null;
    }

    @Override // io.sentry.m0
    public final String r() {
        this.f12285v.getClass();
        if (SystemClock.uptimeMillis() - this.G >= 120000) {
            B(null);
        }
        return q();
    }

    public final void y(Runnable runnable) {
        w5 w5Var = this.f12283e;
        try {
            w5Var.getExecutorService().submit(runnable);
        } catch (Throwable th2) {
            w5Var.getLogger().g(SentryLevel.ERROR, "AndroidConnectionStatusProvider submit failed", th2);
        }
    }

    public final void z(boolean z5) {
        r rVarA = this.f12287x.a();
        if (z5) {
            try {
                this.f12286w.clear();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        b bVar = this.f12288y;
        this.f12288y = null;
        if (bVar != null) {
            Context context = this.f12282d;
            ILogger logger = this.f12283e.getLogger();
            ConnectivityManager connectivityManagerU = u(context, logger);
            if (connectivityManagerU != null) {
                try {
                    connectivityManagerU.unregisterNetworkCallback(bVar);
                } catch (Throwable th4) {
                    logger.g(SentryLevel.WARNING, "unregisterNetworkCallback failed", th4);
                }
            }
        }
        this.E = null;
        this.F = null;
        this.G = 0L;
        rVarA.close();
        this.f12283e.getLogger().q(SentryLevel.DEBUG, "Network callback unregistered", new Object[0]);
    }
}
