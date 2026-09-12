package gs;

import androidx.appcompat.widget.m3;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10186d;

    public b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f10183a = connectionSpecs;
    }

    public final cs.m a(SSLSocket sslSocket) throws UnknownServiceException {
        cs.m connectionSpec;
        int i7;
        boolean z5;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f10184b;
        List list = this.f10183a;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            int i11 = i10 + 1;
            connectionSpec = (cs.m) list.get(i10);
            if (connectionSpec.b(sslSocket)) {
                this.f10184b = i11;
                break;
            }
            i10 = i11;
        }
        if (connectionSpec == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f10186d);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i12 = this.f10184b;
        int size2 = list.size();
        while (true) {
            i7 = 0;
            if (i12 >= size2) {
                z5 = false;
                break;
            }
            int i13 = i12 + 1;
            if (((cs.m) list.get(i12)).b(sslSocket)) {
                z5 = true;
                break;
            }
            i12 = i13;
        }
        this.f10185c = z5;
        boolean z6 = this.f10186d;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = connectionSpec.f7456d;
        String[] strArr2 = connectionSpec.f7455c;
        if (strArr2 != null) {
            String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = ds.b.o(enabledCipherSuites, strArr2, cs.l.f7434c);
        } else {
            cipherSuitesIntersection = sslSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tn.b bVar = tn.b.f20850d;
            Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
            tlsVersionsIntersection = ds.b.o(enabledProtocols2, strArr, bVar);
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        cs.k comparator = cs.l.f7434c;
        byte[] bArr = ds.b.f7815a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        Intrinsics.checkNotNullParameter("TLS_FALLBACK_SCSV", "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i7++;
        }
        if (z6 && i7 != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String value = supportedCipherSuites[i7];
            Intrinsics.checkNotNullExpressionValue(value, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            Intrinsics.checkNotNullParameter(cipherSuitesIntersection, "<this>");
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = value;
        }
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        m3 m3Var = new m3();
        m3Var.f1032a = connectionSpec.f7453a;
        m3Var.f1034c = strArr2;
        m3Var.f1035d = strArr;
        m3Var.f1033b = connectionSpec.f7454b;
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        m3Var.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        m3Var.f((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        cs.m mVarA = m3Var.a();
        if (mVarA.c() != null) {
            sslSocket.setEnabledProtocols(mVarA.f7456d);
        }
        if (mVarA.a() != null) {
            sslSocket.setEnabledCipherSuites(mVarA.f7455c);
        }
        return connectionSpec;
    }
}
