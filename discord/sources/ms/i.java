package ms;

import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class i implements k {
    @Override // ms.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return ls.h.f15284d && Conscrypt.isConscrypt(sslSocket);
    }

    @Override // ms.k
    public final m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return new j();
    }
}
