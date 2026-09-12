package io.ktor.network.tls;

import androidx.constraintlayout.widget.ConstraintLayout;
import io.ktor.http.IpParserKt;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.slf4j.Marker;

/* JADX INFO: compiled from: HostnameUtils.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00000\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000f\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"", "serverName", "Ljava/security/cert/X509Certificate;", "certificate", "", "verifyHostnameInCertificate", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)V", "ipString", "verifyIpInCertificate", "certificateHost", "", "matchHostnameWithCertificate", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "hosts", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "ips", "", "DNS_NAME_TYPE", "I", "IP_ADDRESS_TYPE", "ktor-network-tls"}, k = 2, mv = {2, 2, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
public final class HostnameUtilsKt {
    private static final int DNS_NAME_TYPE = 2;
    private static final int IP_ADDRESS_TYPE = 7;

    public static final void verifyHostnameInCertificate(String serverName, X509Certificate certificate) throws CertificateParsingException, TLSException {
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        if (IpParserKt.hostIsIp(serverName)) {
            verifyIpInCertificate(serverName, certificate);
            return;
        }
        List<String> listHosts = hosts(certificate);
        if (listHosts.isEmpty()) {
            return;
        }
        List<String> list = listHosts;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (matchHostnameWithCertificate(serverName, (String) it.next())) {
                    return;
                }
            }
        }
        throw new TLSException("No server host: " + serverName + " in the server certificate. Provided in certificate: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, null, 63, null), null, 2, null);
    }

    public static final void verifyIpInCertificate(String ipString, X509Certificate certificate) throws CertificateParsingException, TLSException {
        Intrinsics.checkNotNullParameter(ipString, "ipString");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : subjectAlternativeNames) {
                Object obj2 = ((List) obj).get(0);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) obj2).intValue() == 7) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object obj3 = ((List) it.next()).get(1);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                arrayList3.add((String) obj3);
            }
            ArrayList arrayList4 = arrayList3;
            if (arrayList4.isEmpty()) {
                return;
            }
            ArrayList arrayList5 = arrayList4;
            if (!(arrayList5 instanceof Collection) || !arrayList5.isEmpty()) {
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.areEqual((String) it2.next(), ipString)) {
                        return;
                    }
                }
            }
            throw new TLSException("No server host: " + ipString + " in the server certificate. The certificate was issued for: " + CollectionsKt.joinToString$default(arrayList5, null, null, null, 0, null, null, 63, null) + '.', null, 2, null);
        }
    }

    public static final boolean matchHostnameWithCertificate(String serverName, String certificateHost) {
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(certificateHost, "certificateHost");
        if (StringsKt.equals(serverName, certificateHost, true)) {
            return true;
        }
        List listAsReversed = CollectionsKt.asReversed(StringsKt.split$default((CharSequence) serverName, new char[]{'.'}, false, 0, 6, (Object) null));
        List listAsReversed2 = CollectionsKt.asReversed(StringsKt.split$default((CharSequence) certificateHost, new char[]{'.'}, false, 0, 6, (Object) null));
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        while (i < listAsReversed.size() && i2 < listAsReversed2.size()) {
            String str = (String) listAsReversed.get(i);
            if (i == 0 && str.length() == 0) {
                i++;
            } else {
                String str2 = (String) listAsReversed2.get(i2);
                if (i2 != 0 || str2.length() != 0) {
                    if (!z && StringsKt.equals(str, str2, true)) {
                        i3++;
                        i++;
                    } else {
                        if (!Intrinsics.areEqual(str2, Marker.ANY_MARKER)) {
                            return false;
                        }
                        i++;
                        i2++;
                        z = true;
                    }
                }
                i2++;
            }
        }
        return i == listAsReversed.size() && i2 == listAsReversed2.size() && (!z || i3 >= 2);
    }

    private static final List<String> hosts(X509Certificate x509Certificate) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subjectAlternativeNames) {
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj2).intValue() == 2) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object obj3 = ((List) it.next()).get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            arrayList3.add((String) obj3);
        }
        return arrayList3;
    }

    private static final List<String> ips(X509Certificate x509Certificate) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        if (subjectAlternativeNames == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : subjectAlternativeNames) {
            Object obj2 = ((List) obj).get(0);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj2).intValue() == 7) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object obj3 = ((List) it.next()).get(1);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
            arrayList3.add((String) obj3);
        }
        return arrayList3;
    }
}
