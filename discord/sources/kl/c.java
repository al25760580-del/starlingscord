package kl;

import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c4.h;
import com.facebook.react.bridge.ReactApplicationContext;
import io.sentry.android.core.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends b {
    public final h j;
    public Network k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public NetworkCapabilities f14581l;

    public c(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.k = null;
        this.f14581l = null;
        this.j = new h(1, this);
    }

    public final void d(int i7) {
        new Handler(Looper.getMainLooper()).postDelayed(new p(15, this), i7);
    }

    public final void e() {
        boolean z5;
        int i7;
        boolean z6;
        Network network = this.k;
        NetworkCapabilities networkCapabilities = this.f14581l;
        int i10 = 0;
        int i11 = 4;
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(2)) {
                i7 = 1;
            } else if (networkCapabilities.hasTransport(0)) {
                i7 = 2;
            } else if (networkCapabilities.hasTransport(3)) {
                i7 = 3;
            } else if (networkCapabilities.hasTransport(1)) {
                i7 = 6;
            } else {
                i7 = networkCapabilities.hasTransport(4) ? 8 : 5;
            }
            NetworkInfo networkInfo = null;
            if (network != null) {
                try {
                    networkInfo = this.f14572a.getNetworkInfo(network);
                } catch (SecurityException unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z6 = !networkCapabilities.hasCapability(21);
            } else {
                z6 = (network == null || networkInfo == null || networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) ? false : true;
            }
            z5 = networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) && !z6;
            if (networkCapabilities.hasTransport(4)) {
                z5 = z5 && networkCapabilities.getLinkDownstreamBandwidthKbps() != 0;
            }
            if (network != null && i7 == 2 && z5 && networkInfo != null) {
                int subtype = networkInfo.getSubtype();
                if (subtype != 20) {
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            i10 = 1;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                            i10 = 2;
                            break;
                        case 13:
                        case 15:
                            i10 = 3;
                            break;
                    }
                } else {
                    i10 = 4;
                }
            }
            i11 = i7;
        } else {
            z5 = false;
        }
        c(i11, i10, z5);
    }
}
