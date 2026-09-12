package c4;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.recyclerview.widget.h0;
import kotlin.jvm.internal.Intrinsics;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3460b;

    public /* synthetic */ h(int i7, Object obj) {
        this.f3459a = i7;
        this.f3460b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f3459a) {
            case 1:
                kl.c cVar = (kl.c) this.f3460b;
                cVar.k = network;
                cVar.d(h0.DEFAULT_SWIPE_ANIMATION_DURATION);
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        switch (this.f3459a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                Intrinsics.checkNotNullParameter(capabilities, "capabilities");
                q.d().a(j.f3463a, "Network capabilities changed: " + capabilities);
                i iVar = (i) this.f3460b;
                iVar.b(j.a(iVar.f3461f));
                break;
            default:
                kl.c cVar = (kl.c) this.f3460b;
                cVar.k = network;
                cVar.f14581l = capabilities;
                cVar.e();
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.f3459a) {
            case 1:
                kl.c cVar = (kl.c) this.f3460b;
                if (cVar.k != null) {
                    cVar.k = network;
                }
                cVar.d(h0.DEFAULT_SWIPE_ANIMATION_DURATION);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLosing(Network network, int i7) {
        switch (this.f3459a) {
            case 1:
                kl.c cVar = (kl.c) this.f3460b;
                cVar.k = network;
                cVar.e();
                break;
            default:
                super.onLosing(network, i7);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f3459a) {
            case 0:
                Intrinsics.checkNotNullParameter(network, "network");
                q.d().a(j.f3463a, "Network connection lost");
                i iVar = (i) this.f3460b;
                iVar.b(j.a(iVar.f3461f));
                break;
            default:
                kl.c cVar = (kl.c) this.f3460b;
                cVar.k = null;
                cVar.f14581l = null;
                cVar.e();
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.f3459a) {
            case 1:
                kl.c cVar = (kl.c) this.f3460b;
                cVar.k = null;
                cVar.f14581l = null;
                cVar.e();
                break;
            default:
                super.onUnavailable();
                break;
        }
    }
}
