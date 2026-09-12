package js;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.ByteString;
import okio.Sink;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class q implements hs.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f14157g = ds.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f14158h = ds.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gs.l f14159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hs.g f14160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f14161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile w f14162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cs.t f14163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f14164f;

    public q(OkHttpClient client, gs.l connection, hs.g chain, p http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f14159a = connection;
        this.f14160b = chain;
        this.f14161c = http2Connection;
        List list = client.P;
        cs.t tVar = cs.t.H2_PRIOR_KNOWLEDGE;
        this.f14163e = list.contains(tVar) ? tVar : cs.t.HTTP_2;
    }

    @Override // hs.e
    public final void a() throws IOException {
        w wVar = this.f14162d;
        Intrinsics.checkNotNull(wVar);
        wVar.g().close();
    }

    @Override // hs.e
    public final void b(Request request) throws IOException {
        int i7;
        w wVar;
        boolean z5;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f14162d != null) {
            return;
        }
        boolean z6 = request.f17371d != null;
        Intrinsics.checkNotNullParameter(request, "request");
        Headers headers = request.f17370c;
        ArrayList requestHeaders = new ArrayList(headers.size() + 4);
        requestHeaders.add(new c(c.f14100f, request.f17369b));
        ByteString byteString = c.f14101g;
        HttpUrl url = request.f17368a;
        Intrinsics.checkNotNullParameter(url, "url");
        String strB = url.b();
        String strD = url.d();
        if (strD != null) {
            strB = strB + '?' + ((Object) strD);
        }
        requestHeaders.add(new c(byteString, strB));
        String strA = request.a("Host");
        if (strA != null) {
            requestHeaders.add(new c(c.f14103i, strA));
        }
        requestHeaders.add(new c(c.f14102h, url.f17320a));
        int size = headers.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String strB2 = headers.b(i10);
            Locale locale = Locale.US;
            String strP = a3.e.p(locale, "US", strB2, locale, "this as java.lang.String).toLowerCase(locale)");
            if (!f14157g.contains(strP) || (Intrinsics.areEqual(strP, "te") && Intrinsics.areEqual(headers.h(i10), "trailers"))) {
                requestHeaders.add(new c(strP, headers.h(i10)));
            }
            i10 = i11;
        }
        p pVar = this.f14161c;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z7 = !z6;
        synchronized (pVar.T) {
            synchronized (pVar) {
                try {
                    if (pVar.f14154w > 1073741823) {
                        pVar.l(b.REFUSED_STREAM);
                    }
                    if (pVar.f14155x) {
                        throw new a();
                    }
                    i7 = pVar.f14154w;
                    pVar.f14154w = i7 + 2;
                    wVar = new w(i7, pVar, z7, false, null);
                    z5 = !z6 || pVar.Q >= pVar.R || wVar.f14189e >= wVar.f14190f;
                    if (wVar.i()) {
                        pVar.f14151e.put(Integer.valueOf(i7), wVar);
                    }
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            pVar.T.l(z7, i7, requestHeaders);
        }
        if (z5) {
            pVar.T.flush();
        }
        this.f14162d = wVar;
        if (this.f14164f) {
            w wVar2 = this.f14162d;
            Intrinsics.checkNotNull(wVar2);
            wVar2.e(b.CANCEL);
            throw new IOException("Canceled");
        }
        w wVar3 = this.f14162d;
        Intrinsics.checkNotNull(wVar3);
        gs.h hVar = wVar3.k;
        long j = this.f14160b.f11136g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(j, timeUnit);
        w wVar4 = this.f14162d;
        Intrinsics.checkNotNull(wVar4);
        wVar4.f14194l.g(this.f14160b.f11137h, timeUnit);
    }

    @Override // hs.e
    public final Source c(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        w wVar = this.f14162d;
        Intrinsics.checkNotNull(wVar);
        return wVar.f14193i;
    }

    @Override // hs.e
    public final void cancel() {
        this.f14164f = true;
        w wVar = this.f14162d;
        if (wVar == null) {
            return;
        }
        wVar.e(b.CANCEL);
    }

    @Override // hs.e
    public final cs.u d(boolean z5) throws IOException {
        Headers headerBlock;
        w wVar = this.f14162d;
        if (wVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (wVar) {
            wVar.k.i();
            while (wVar.f14191g.isEmpty() && wVar.f14195m == null) {
                try {
                    try {
                        wVar.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th2) {
                    wVar.k.l();
                    throw th2;
                }
            }
            wVar.k.l();
            if (wVar.f14191g.isEmpty()) {
                IOException iOException = wVar.f14196n;
                if (iOException != null) {
                    throw iOException;
                }
                b bVar = wVar.f14195m;
                Intrinsics.checkNotNull(bVar);
                throw new b0(bVar);
            }
            Object objRemoveFirst = wVar.f14191g.removeFirst();
            Intrinsics.checkNotNullExpressionValue(objRemoveFirst, "headersQueue.removeFirst()");
            headerBlock = (Headers) objRemoveFirst;
        }
        cs.t protocol = this.f14163e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = headerBlock.size();
        a1.d dVarM = null;
        int i7 = 0;
        while (i7 < size) {
            int i10 = i7 + 1;
            String name = headerBlock.b(i7);
            String value = headerBlock.h(i7);
            if (Intrinsics.areEqual(name, ":status")) {
                dVarM = xr.m.M(Intrinsics.stringPlus("HTTP/1.1 ", value));
            } else if (!f14158h.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                arrayList.add(StringsKt.b0(value).toString());
            }
            i7 = i10;
        }
        if (dVarM == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        cs.u uVar = new cs.u();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        uVar.f7484b = protocol;
        uVar.f7485c = dVarM.f17e;
        String message = (String) dVarM.f19v;
        Intrinsics.checkNotNullParameter(message, "message");
        uVar.f7486d = message;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        uVar.c(new Headers((String[]) array));
        if (z5 && uVar.f7485c == 100) {
            return null;
        }
        return uVar;
    }

    @Override // hs.e
    public final gs.l e() {
        return this.f14159a;
    }

    @Override // hs.e
    public final void f() {
        this.f14161c.flush();
    }

    @Override // hs.e
    public final long g(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (hs.f.a(response)) {
            return ds.b.j(response);
        }
        return 0L;
    }

    @Override // hs.e
    public final Sink h(Request request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        w wVar = this.f14162d;
        Intrinsics.checkNotNull(wVar);
        return wVar.g();
    }
}
