package c4;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;
import v3.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3463a;

    static {
        String strF = q.f("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strF, "tagWithPrefix(\"NetworkStateTracker\")");
        f3463a = strF;
    }

    public static final a4.d a(ConnectivityManager connectivityManager) {
        boolean zB;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z5 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = f4.g.a(connectivityManager, f4.h.a(connectivityManager));
            zB = networkCapabilitiesA != null ? f4.g.b(networkCapabilitiesA, 16) : false;
        } catch (SecurityException e10) {
            q.d().c(f3463a, "Unable to validate active network", e10);
        }
        return new a4.d(z5, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
