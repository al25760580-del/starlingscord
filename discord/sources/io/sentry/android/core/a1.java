package io.sentry.android.core;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.SentryLevel;
import io.sentry.k4;
import io.sentry.v3;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f12147b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k4 f12150e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NetworkCapabilities f12148c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12149d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v3 f12146a = v3.f13245a;

    public a1(k0 k0Var, k4 k4Var) {
        com.facebook.imagepipeline.nativecode.c.H(k0Var, "BuildInfoProvider is required");
        this.f12147b = k0Var;
        com.facebook.imagepipeline.nativecode.c.H(k4Var, "SentryDateProvider is required");
        this.f12150e = k4Var;
    }

    public static Breadcrumb a(String str) {
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.f12008w = "system";
        breadcrumb.f12010y = "network.event";
        breadcrumb.c(str, "action");
        breadcrumb.F = SentryLevel.INFO;
        return breadcrumb;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f12146a.c(a("NETWORK_AVAILABLE"));
        this.f12148c = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        z0 z0Var;
        long jD = this.f12150e.now().d();
        NetworkCapabilities networkCapabilities2 = this.f12148c;
        long j = this.f12149d;
        k0 k0Var = this.f12147b;
        if (networkCapabilities2 == null) {
            z0Var = new z0(networkCapabilities, k0Var, jD);
        } else {
            z0 z0Var2 = new z0(networkCapabilities2, k0Var, j);
            z0Var = new z0(networkCapabilities, k0Var, jD);
            int iAbs = Math.abs(z0Var2.f12456c - z0Var.f12456c);
            int i7 = z0Var.f12454a;
            int i10 = z0Var2.f12454a;
            int iAbs2 = Math.abs(i10 - i7);
            int i11 = z0Var.f12455b;
            int i12 = z0Var2.f12455b;
            int iAbs3 = Math.abs(i12 - i11);
            boolean z5 = ((double) Math.abs(z0Var2.f12457d - z0Var.f12457d)) / 1000000.0d < 5000.0d;
            boolean z6 = z5 || iAbs <= 5;
            boolean z7 = z5 || ((double) iAbs2) <= Math.max(1000.0d, ((double) Math.abs(i10)) * 0.1d);
            boolean z10 = z5 || ((double) iAbs3) <= Math.max(1000.0d, ((double) Math.abs(i12)) * 0.1d);
            if (z0Var2.f12458e == z0Var.f12458e && z0Var2.f12459f.equals(z0Var.f12459f) && z6 && z7 && z10) {
                z0Var = null;
            }
        }
        if (z0Var == null) {
            return;
        }
        this.f12148c = networkCapabilities;
        this.f12149d = jD;
        Breadcrumb breadcrumbA = a("NETWORK_CAPABILITIES_CHANGED");
        breadcrumbA.c(Integer.valueOf(z0Var.f12454a), "download_bandwidth");
        breadcrumbA.c(Integer.valueOf(z0Var.f12455b), "upload_bandwidth");
        breadcrumbA.c(Boolean.valueOf(z0Var.f12458e), "vpn_active");
        breadcrumbA.c(z0Var.f12459f, "network_type");
        int i13 = z0Var.f12456c;
        if (i13 != 0) {
            breadcrumbA.c(Integer.valueOf(i13), "signal_strength");
        }
        Hint hint = new Hint();
        hint.d(z0Var, "android:networkCapabilities");
        this.f12146a.g(breadcrumbA, hint);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f12146a.c(a("NETWORK_LOST"));
        this.f12148c = null;
    }
}
