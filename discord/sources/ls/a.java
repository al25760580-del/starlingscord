package ls;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15273d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15274c;

    static {
        f15273d = kh.f.f() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ms.m[] elements = {(!kh.f.f() || Build.VERSION.SDK_INT < 29) ? null : new ms.a(), new ms.l(ms.f.f16086f), new ms.l(ms.j.f16093a), new ms.l(ms.h.f16092a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListR = y.r(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (((ms.m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f15274c = arrayList;
    }

    @Override // ls.n
    public final l b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        ms.b bVar = x509TrustManagerExtensions != null ? new ms.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar == null ? super.b(trustManager) : bVar;
    }

    @Override // ls.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f15274c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ms.m) next).a(sslSocket));
        ms.m mVar = (ms.m) next;
        if (mVar == null) {
            return;
        }
        mVar.d(sslSocket, str, protocols);
    }

    @Override // ls.n
    public final String f(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f15274c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ms.m) next).a(sslSocket));
        ms.m mVar = (ms.m) next;
        if (mVar == null) {
            return null;
        }
        return mVar.c(sslSocket);
    }

    @Override // ls.n
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
