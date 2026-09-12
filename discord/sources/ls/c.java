package ls;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.appcompat.widget.b3;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f15277e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b3 f15279d;

    static {
        boolean z5 = false;
        if (kh.f.f() && Build.VERSION.SDK_INT < 30) {
            z5 = true;
        }
        f15277e = z5;
    }

    public c() throws NoSuchMethodException {
        ms.n nVar;
        Method method;
        Method method2;
        int i7 = ms.n.f16096g;
        Intrinsics.checkNotNullParameter("com.android.org.conscrypt", "packageName");
        Method method3 = null;
        try {
            Class<?> sslSocketClass = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            Class<?> sslSocketFactoryClass = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl"));
            Class<?> paramClass = Class.forName(Intrinsics.stringPlus("com.android.org.conscrypt", ".SSLParametersImpl"));
            Intrinsics.checkNotNullExpressionValue(paramClass, "paramsClass");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            nVar = new ms.n(sslSocketClass);
        } catch (Exception e10) {
            n.f15297a.getClass();
            n.i(5, "unable to load android socket classes", e10);
            nVar = null;
        }
        ms.m[] elements = {nVar, new ms.l(ms.f.f16086f), new ms.l(ms.j.f16093a), new ms.l(ms.h.f16092a)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayListR = y.r(elements);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (((ms.m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f15278c = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", null);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f15279d = new b3(method3, method2, method);
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
    public final ps.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // ls.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f15278c.iterator();
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
    public final void e(Socket socket, InetSocketAddress address, int i7) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        try {
            socket.connect(address, i7);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // ls.n
    public final String f(SSLSocket sslSocket) {
        Object next;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f15278c.iterator();
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
    public final Object g() {
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        b3 b3Var = this.f15279d;
        b3Var.getClass();
        Intrinsics.checkNotNullParameter("response.body().close()", "closer");
        Method method = b3Var.f906a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = b3Var.f907b;
                Intrinsics.checkNotNull(method2);
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // ls.n
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // ls.n
    public final void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        b3 b3Var = this.f15279d;
        b3Var.getClass();
        if (obj != null) {
            try {
                Method method = b3Var.f908c;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(5, message, null);
    }
}
