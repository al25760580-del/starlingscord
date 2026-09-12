package ms;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f16094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f16095b;

    public l(k socketAdapterFactory) {
        Intrinsics.checkNotNullParameter(socketAdapterFactory, "socketAdapterFactory");
        this.f16094a = socketAdapterFactory;
    }

    @Override // ms.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f16094a.a(sslSocket);
    }

    @Override // ms.m
    public final boolean b() {
        return true;
    }

    @Override // ms.m
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        m mVarE = e(sslSocket);
        if (mVarE == null) {
            return null;
        }
        return mVarE.c(sslSocket);
    }

    @Override // ms.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        m mVarE = e(sslSocket);
        if (mVarE == null) {
            return;
        }
        mVarE.d(sslSocket, str, protocols);
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f16095b == null && this.f16094a.a(sSLSocket)) {
                this.f16095b = this.f16094a.b(sSLSocket);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f16095b;
    }
}
