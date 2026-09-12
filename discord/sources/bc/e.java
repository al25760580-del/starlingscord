package bc;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import com.discord.misc.utilities.activity.ActivityUtilities;
import com.facebook.react.modules.core.PermissionListener;
import e4.m;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3099e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3100i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3101v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3102w;

    public /* synthetic */ e(int i7, int i10, Object obj, Object obj2, Object obj3) {
        this.f3098d = i10;
        this.f3100i = obj;
        this.f3101v = obj2;
        this.f3099e = i7;
        this.f3102w = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3098d) {
            case 0:
                k kVar = (k) this.f3100i;
                vb.i iVar = (vb.i) this.f3101v;
                int i7 = this.f3099e;
                Runnable runnable = (Runnable) this.f3102w;
                dc.c cVar = (dc.c) kVar.f3127y;
                try {
                    try {
                        cc.d dVar = (cc.d) kVar.f3124v;
                        Objects.requireNonNull(dVar);
                        ((cc.h) cVar).n(new app.rive.runtime.kotlin.core.a(2, dVar));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) kVar.f3122e).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((cc.h) cVar).n(new f(kVar, iVar, i7, 0));
                        } else {
                            kVar.d(iVar, i7);
                        }
                        break;
                    } catch (dc.a unused) {
                        ((m) kVar.f3125w).J(iVar, i7 + 1, false);
                        break;
                    }
                    return;
                } finally {
                    runnable.run();
                }
            case 1:
                ActivityUtilities.startActivityForResultAsync$lambda$0((WeakReference) this.f3100i, (Intent) this.f3101v, this.f3099e, (Bundle) this.f3102w);
                return;
            default:
                super/*com.facebook.react.ReactActivityDelegate*/.requestPermissions((String[]) this.f3101v, this.f3099e, (PermissionListener) this.f3102w);
                return;
        }
    }
}
