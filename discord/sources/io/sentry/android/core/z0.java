package io.sentry.android.core;

import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12459f;

    public z0(NetworkCapabilities networkCapabilities, k0 k0Var, long j) {
        com.facebook.imagepipeline.nativecode.c.H(networkCapabilities, "NetworkCapabilities is required");
        com.facebook.imagepipeline.nativecode.c.H(k0Var, "BuildInfoProvider is required");
        this.f12454a = networkCapabilities.getLinkDownstreamBandwidthKbps();
        this.f12455b = networkCapabilities.getLinkUpstreamBandwidthKbps();
        int signalStrength = Build.VERSION.SDK_INT >= 29 ? networkCapabilities.getSignalStrength() : 0;
        this.f12456c = signalStrength > -100 ? signalStrength : 0;
        this.f12458e = networkCapabilities.hasTransport(4);
        String strN = io.sentry.android.core.internal.util.c.n(networkCapabilities);
        this.f12459f = strN == null ? "" : strN;
        this.f12457d = j;
    }
}
