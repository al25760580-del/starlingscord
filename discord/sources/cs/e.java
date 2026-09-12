package cs;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import mo.c0;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okio.Buffer;
import okio.ByteString;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f7413l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpUrl f7414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Headers f7415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f7417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f7419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Headers f7420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f7421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7422i;
    public final long j;

    static {
        ls.n nVar = ls.n.f15297a;
        ls.n.f15297a.getClass();
        k = Intrinsics.stringPlus("OkHttp", "-Sent-Millis");
        ls.n.f15297a.getClass();
        f7413l = Intrinsics.stringPlus("OkHttp", "-Received-Millis");
    }

    public e(Source rawSource) throws IOException {
        HttpUrl httpUrlB;
        Intrinsics.checkNotNullParameter(rawSource, "rawSource");
        try {
            rs.p pVarD = rs.v.d(rawSource);
            String strW = pVarD.w(LongCompanionObject.MAX_VALUE);
            Intrinsics.checkNotNullParameter(strW, "<this>");
            try {
                Intrinsics.checkNotNullParameter(strW, "<this>");
                r rVar = new r(0);
                rVar.g(null, strW);
                httpUrlB = rVar.b();
            } catch (IllegalArgumentException unused) {
                httpUrlB = null;
            }
            if (httpUrlB == null) {
                IOException iOException = new IOException(Intrinsics.stringPlus("Cache corruption for ", strW));
                ls.n nVar = ls.n.f15297a;
                ls.n.f15297a.getClass();
                ls.n.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.f7414a = httpUrlB;
            this.f7416c = pVarD.w(LongCompanionObject.MAX_VALUE);
            fj.c cVar = new fj.c(9);
            int iE = c0.E(pVarD);
            int i7 = 0;
            while (i7 < iE) {
                i7++;
                cVar.l(pVarD.w(LongCompanionObject.MAX_VALUE));
            }
            this.f7415b = cVar.r();
            a1.d dVarM = xr.m.M(pVarD.w(LongCompanionObject.MAX_VALUE));
            this.f7417d = (t) dVarM.f18i;
            this.f7418e = dVarM.f17e;
            this.f7419f = (String) dVarM.f19v;
            fj.c cVar2 = new fj.c(9);
            int iE2 = c0.E(pVarD);
            int i10 = 0;
            while (i10 < iE2) {
                i10++;
                cVar2.l(pVarD.w(LongCompanionObject.MAX_VALUE));
            }
            String str = k;
            String strT = cVar2.t(str);
            String str2 = f7413l;
            String strT2 = cVar2.t(str2);
            cVar2.v(str);
            cVar2.v(str2);
            long j = 0;
            this.f7422i = strT == null ? 0L : Long.parseLong(strT);
            if (strT2 != null) {
                j = Long.parseLong(strT2);
            }
            this.j = j;
            this.f7420g = cVar2.r();
            if (Intrinsics.areEqual(this.f7414a.f17320a, "https")) {
                String strW2 = pVarD.w(LongCompanionObject.MAX_VALUE);
                if (strW2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strW2 + '\"');
                }
                l cipherSuite = l.f7433b.c(pVarD.w(LongCompanionObject.MAX_VALUE));
                List peerCertificates = a(pVarD);
                List localCertificates = a(pVarD);
                x tlsVersion = !pVarD.c() ? android.support.v4.media.session.b.i(pVarD.w(LongCompanionObject.MAX_VALUE)) : x.SSL_3_0;
                Intrinsics.checkNotNullParameter(tlsVersion, "tlsVersion");
                Intrinsics.checkNotNullParameter(cipherSuite, "cipherSuite");
                Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                Intrinsics.checkNotNullParameter(localCertificates, "localCertificates");
                this.f7421h = new q(tlsVersion, cipherSuite, ds.b.w(localCertificates), new p(0, ds.b.w(peerCertificates)));
            } else {
                this.f7421h = null;
            }
            Unit unit = Unit.f14616a;
            rawSource.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(rawSource, th2);
                throw th3;
            }
        }
    }

    public static List a(rs.p pVar) throws IOException {
        int iE = c0.E(pVar);
        if (iE == -1) {
            return n0.f14659d;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iE);
            int i7 = 0;
            while (i7 < iE) {
                i7++;
                String strW = pVar.w(LongCompanionObject.MAX_VALUE);
                Buffer buffer = new Buffer();
                ByteString byteString = ByteString.f17414v;
                ByteString byteStringW = io.sentry.hints.j.w(strW);
                Intrinsics.checkNotNull(byteStringW);
                buffer.T(byteStringW);
                arrayList.add(certificateFactory.generateCertificate(new rs.e(buffer, 0)));
            }
            return arrayList;
        } catch (CertificateException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public static void b(rs.o oVar, List list) throws IOException {
        try {
            oVar.f0(list.size());
            oVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((Certificate) it.next()).getEncoded();
                ByteString byteString = ByteString.f17414v;
                Intrinsics.checkNotNullExpressionValue(bytes, "bytes");
                oVar.A(io.sentry.hints.j.E(bytes).a());
                oVar.writeByte(10);
            }
        } catch (CertificateEncodingException e10) {
            throw new IOException(e10.getMessage());
        }
    }

    public final void c(a3.f editor) {
        HttpUrl httpUrl = this.f7414a;
        q qVar = this.f7421h;
        Headers headers = this.f7420g;
        Headers headers2 = this.f7415b;
        Intrinsics.checkNotNullParameter(editor, "editor");
        rs.o oVarC = rs.v.c(editor.p(0));
        try {
            oVarC.A(httpUrl.f17327h);
            oVarC.writeByte(10);
            oVarC.A(this.f7416c);
            oVarC.writeByte(10);
            oVarC.f0(headers2.size());
            oVarC.writeByte(10);
            int size = headers2.size();
            int i7 = 0;
            while (i7 < size) {
                int i10 = i7 + 1;
                oVarC.A(headers2.b(i7));
                oVarC.A(": ");
                oVarC.A(headers2.h(i7));
                oVarC.writeByte(10);
                i7 = i10;
            }
            t protocol = this.f7417d;
            int i11 = this.f7418e;
            String message = this.f7419f;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            Intrinsics.checkNotNullParameter(message, "message");
            StringBuilder sb2 = new StringBuilder();
            if (protocol == t.HTTP_1_0) {
                sb2.append("HTTP/1.0");
            } else {
                sb2.append("HTTP/1.1");
            }
            sb2.append(' ');
            sb2.append(i11);
            sb2.append(' ');
            sb2.append(message);
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            oVarC.A(string);
            oVarC.writeByte(10);
            oVarC.f0(headers.size() + 2);
            oVarC.writeByte(10);
            int size2 = headers.size();
            for (int i12 = 0; i12 < size2; i12++) {
                oVarC.A(headers.b(i12));
                oVarC.A(": ");
                oVarC.A(headers.h(i12));
                oVarC.writeByte(10);
            }
            oVarC.A(k);
            oVarC.A(": ");
            oVarC.f0(this.f7422i);
            oVarC.writeByte(10);
            oVarC.A(f7413l);
            oVarC.A(": ");
            oVarC.f0(this.j);
            oVarC.writeByte(10);
            if (Intrinsics.areEqual(httpUrl.f17320a, "https")) {
                oVarC.writeByte(10);
                Intrinsics.checkNotNull(qVar);
                oVarC.A(qVar.f7462b.f7450a);
                oVarC.writeByte(10);
                b(oVarC, qVar.a());
                b(oVarC, qVar.f7463c);
                oVarC.A(qVar.f7461a.f7507d);
                oVarC.writeByte(10);
            }
            Unit unit = Unit.f14616a;
            oVarC.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ls.d.k(oVarC, th2);
                throw th3;
            }
        }
    }

    public e(Response response) {
        Headers headersR;
        Intrinsics.checkNotNullParameter(response, "response");
        Request request = response.f17379d;
        this.f7414a = request.f17368a;
        Intrinsics.checkNotNullParameter(response, "<this>");
        Response response2 = response.E;
        Intrinsics.checkNotNull(response2);
        Headers headers = response2.f17379d.f17370c;
        Headers headers2 = response.f17384x;
        Set setR = c0.R(headers2);
        if (setR.isEmpty()) {
            headersR = ds.b.f7816b;
        } else {
            fj.c cVar = new fj.c(9);
            int size = headers.size();
            int i7 = 0;
            while (i7 < size) {
                int i10 = i7 + 1;
                String strB = headers.b(i7);
                if (setR.contains(strB)) {
                    cVar.c(strB, headers.h(i7));
                }
                i7 = i10;
            }
            headersR = cVar.r();
        }
        this.f7415b = headersR;
        this.f7416c = request.f17369b;
        this.f7417d = response.f17380e;
        this.f7418e = response.f17382v;
        this.f7419f = response.f17381i;
        this.f7420g = headers2;
        this.f7421h = response.f17383w;
        this.f7422i = response.H;
        this.j = response.I;
    }
}
