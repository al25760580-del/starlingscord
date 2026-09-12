package ps;

import a3.e;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f18545a = new c();

    public static List a(X509Certificate x509Certificate, int i7) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return n0.f14659d;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return n0.f14659d;
        }
    }

    public static boolean b(String str) {
        int i7;
        int length = str.length();
        int length2 = str.length();
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (length2 < 0) {
            throw new IllegalArgumentException(g.d(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbS = e.s(length2, "endIndex > string.length: ", " > ");
            sbS.append(str.length());
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        long j = 0;
        int i10 = 0;
        while (i10 < length2) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i7 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i7 = 3;
                } else {
                    int i11 = i10 + 1;
                    char cCharAt2 = i11 < length2 ? str.charAt(i11) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i10 = i11;
                    } else {
                        j += (long) 4;
                        i10 += 2;
                    }
                }
                j += (long) i7;
            }
            i10++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    public static boolean c(String host, X509Certificate certificate) {
        boolean zAreEqual;
        int length;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        byte[] bArr = ds.b.f7815a;
        Intrinsics.checkNotNullParameter(host, "<this>");
        if (ds.b.f7820f.d(host)) {
            String strJ = sa.a.J(host);
            List listA = a(certificate, 7);
            if (listA == null || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(strJ, sa.a.J((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(host)) {
            Locale locale = Locale.US;
            host = e.p(locale, "US", host, locale, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(certificate, 2);
        if (listA2 == null || !listA2.isEmpty()) {
            for (String strP : listA2) {
                if (host == null || host.length() == 0 || x.o(host, ".", false) || x.h(host, "..", false) || strP == null || strP.length() == 0 || x.o(strP, ".", false) || x.h(strP, "..", false)) {
                    zAreEqual = false;
                } else {
                    String strStringPlus = !x.h(host, ".", false) ? Intrinsics.stringPlus(host, ".") : host;
                    if (!x.h(strP, ".", false)) {
                        strP = Intrinsics.stringPlus(strP, ".");
                    }
                    if (b(strP)) {
                        Locale locale2 = Locale.US;
                        strP = e.p(locale2, "US", strP, locale2, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!StringsKt.D(strP, "*", false)) {
                        zAreEqual = Intrinsics.areEqual(strStringPlus, strP);
                    } else if (!x.o(strP, "*.", false) || StringsKt.I(strP, '*', 1, 4) != -1 || strStringPlus.length() < strP.length() || Intrinsics.areEqual("*.", strP)) {
                        zAreEqual = false;
                    } else {
                        String strSubstring = strP.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (x.h(strStringPlus, strSubstring, false) && ((length = strStringPlus.length() - strSubstring.length()) <= 0 || StringsKt.L('.', length - 1, 4, strStringPlus) == -1)) {
                            zAreEqual = true;
                        } else {
                            zAreEqual = false;
                        }
                    }
                }
                if (zAreEqual) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                if (certificate != null) {
                    return c(host, (X509Certificate) certificate);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
