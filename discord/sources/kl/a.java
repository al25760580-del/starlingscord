package kl;

import a3.h;
import a5.k0;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import com.facebook.react.bridge.ReactApplicationContext;
import com.reactnativecommunity.netinfo.NetInfoModule;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f14567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NetInfoModule f14568c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f14570e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f14566a = new k0(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f14569d = new h(25, this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14571f = false;

    public a(ReactApplicationContext reactApplicationContext, NetInfoModule netInfoModule) {
        this.f14567b = reactApplicationContext;
        this.f14568c = netInfoModule;
    }

    public static boolean a() {
        if (!Build.MANUFACTURER.equals("Amazon")) {
            return false;
        }
        String str = Build.MODEL;
        return str.startsWith("AF") || str.startsWith("KF");
    }
}
