package ls;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ps.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f15275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f15276b;

    public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
        this.f15275a = trustManager;
        this.f15276b = findByIssuerAndSignatureMethod;
    }

    @Override // ps.d
    public final X509Certificate a(X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        try {
            Object objInvoke = this.f15276b.invoke(this.f15275a, cert);
            if (objInvoke != null) {
                return ((TrustAnchor) objInvoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e10) {
            throw new AssertionError("unable to get issues and signature", e10);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f15275a, bVar.f15275a) && Intrinsics.areEqual(this.f15276b, bVar.f15276b);
    }

    public final int hashCode() {
        return this.f15276b.hashCode() + (this.f15275a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f15275a + ", findByIssuerAndSignatureMethod=" + this.f15276b + ')';
    }
}
