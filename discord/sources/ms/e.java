package ms;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;

/* JADX INFO: loaded from: classes.dex */
public final class e implements k {
    @Override // ms.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return x.o(name, Intrinsics.stringPlus("com.google.android.gms.org.conscrypt", "."), false);
    }

    @Override // ms.k
    public final m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        e eVar = f.f16086f;
        Class<?> cls = sslSocket.getClass();
        Class<?> superclass = cls;
        while (!Intrinsics.areEqual(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(Intrinsics.stringPlus("No OpenSSLSocketImpl superclass of socket of type ", cls));
            }
        }
        Intrinsics.checkNotNull(superclass);
        return new f(superclass);
    }
}
