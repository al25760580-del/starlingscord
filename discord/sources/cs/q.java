package cs;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f7461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f7462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f7463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rn.u f7464d;

    public q(x tlsVersion, l cipherSuite, List localCertificates, Function0 peerCertificatesFn) {
        Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
        Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
        Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
        Intrinsics.checkNotNullParameter(peerCertificatesFn, "peerCertificatesFn");
        this.f7461a = tlsVersion;
        this.f7462b = cipherSuite;
        this.f7463c = localCertificates;
        this.f7464d = rn.l.b(new a3.q(peerCertificatesFn));
    }

    public final List a() {
        return (List) this.f7464d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.f7461a == this.f7461a && Intrinsics.areEqual(qVar.f7462b, this.f7462b) && Intrinsics.areEqual(qVar.a(), a()) && Intrinsics.areEqual(qVar.f7463c, this.f7463c);
    }

    public final int hashCode() {
        return this.f7463c.hashCode() + ((a().hashCode() + ((this.f7462b.hashCode() + ((this.f7461a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(e0.l(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                Intrinsics.checkNotNullExpressionValue(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f7461a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f7462b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f7463c;
        ArrayList arrayList2 = new ArrayList(e0.l(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                Intrinsics.checkNotNullExpressionValue(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
