package gs;

import cs.u;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import rs.p;
import rs.t;

/* JADX INFO: loaded from: classes.dex */
public final class o implements hs.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10245a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f10250f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f10251g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f10252h;

    public /* synthetic */ o() {
    }

    public static final void i(o oVar, rs.h hVar) {
        Timeout timeout = hVar.f19569e;
        t delegate = Timeout.f17418d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        hVar.f19569e = delegate;
        timeout.a();
        timeout.b();
    }

    @Override // hs.e
    public void a() {
        ((BufferedSink) this.f10250f).flush();
    }

    @Override // hs.e
    public void b(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = ((l) this.f10248d).f10225b.f7499b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f17369b);
        sb2.append(' ');
        HttpUrl url = request.f17368a;
        if (url.f17328i || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String strB = url.b();
            String strD = url.d();
            if (strD != null) {
                strB = strB + '?' + ((Object) strD);
            }
            sb2.append(strB);
        } else {
            sb2.append(url);
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        m(request.f17370c, string);
    }

    @Override // hs.e
    public Source c(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!hs.f.a(response)) {
            return l(0L);
        }
        if ("chunked".equalsIgnoreCase(response.f("Transfer-Encoding", null))) {
            HttpUrl httpUrl = response.f17379d.f17368a;
            int i7 = this.f10246b;
            if (i7 != 4) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i7)).toString());
            }
            this.f10246b = 5;
            return new is.c(this, httpUrl);
        }
        long j = ds.b.j(response);
        if (j != -1) {
            return l(j);
        }
        int i10 = this.f10246b;
        if (i10 != 4) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i10)).toString());
        }
        this.f10246b = 5;
        ((l) this.f10248d).k();
        Intrinsics.checkNotNullParameter(this, "this$0");
        return new is.f(this);
    }

    @Override // hs.e
    public void cancel() {
        Socket socket = ((l) this.f10248d).f10226c;
        if (socket == null) {
            return;
        }
        ds.b.d(socket);
    }

    @Override // hs.e
    public u d(boolean z5) throws IOException {
        androidx.recyclerview.widget.h hVar = (androidx.recyclerview.widget.h) this.f10251g;
        int i7 = this.f10246b;
        if (i7 != 1 && i7 != 2 && i7 != 3) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i7)).toString());
        }
        try {
            String strW = ((BufferedSource) hVar.f2615i).w(hVar.f2614e);
            hVar.f2614e -= (long) strW.length();
            a1.d dVarM = xr.m.M(strW);
            int i10 = dVarM.f17e;
            u uVar = new u();
            cs.t protocol = (cs.t) dVarM.f18i;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            uVar.f7484b = protocol;
            uVar.f7485c = i10;
            String message = (String) dVarM.f19v;
            Intrinsics.checkNotNullParameter(message, "message");
            uVar.f7486d = message;
            fj.c cVar = new fj.c(9);
            while (true) {
                String strW2 = ((BufferedSource) hVar.f2615i).w(hVar.f2614e);
                hVar.f2614e -= (long) strW2.length();
                if (strW2.length() == 0) {
                    break;
                }
                cVar.l(strW2);
            }
            uVar.c(cVar.r());
            if (z5 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f10246b = 3;
                return uVar;
            }
            if (102 > i10 || i10 >= 200) {
                this.f10246b = 4;
                return uVar;
            }
            this.f10246b = 3;
            return uVar;
        } catch (EOFException e10) {
            throw new IOException(Intrinsics.stringPlus("unexpected end of stream on ", ((l) this.f10248d).f10225b.f7498a.f7404h.f()), e10);
        }
    }

    @Override // hs.e
    public l e() {
        return (l) this.f10248d;
    }

    @Override // hs.e
    public void f() {
        ((BufferedSink) this.f10250f).flush();
    }

    @Override // hs.e
    public long g(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (!hs.f.a(response)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(response.f("Transfer-Encoding", null))) {
            return -1L;
        }
        return ds.b.j(response);
    }

    @Override // hs.e
    public Sink h(Request request, long j) throws ProtocolException {
        Intrinsics.checkNotNullParameter(request, "request");
        RequestBody requestBody = request.f17371d;
        if (requestBody != null && requestBody.isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(request.a("Transfer-Encoding"))) {
            int i7 = this.f10246b;
            if (i7 != 1) {
                throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i7)).toString());
            }
            this.f10246b = 2;
            return new is.b(this);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i10 = this.f10246b;
        if (i10 != 1) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i10)).toString());
        }
        this.f10246b = 2;
        return new is.e(this);
    }

    public zi.a j() {
        String strJ = this.f10246b == 0 ? " registrationStatus" : "";
        if (((Long) this.f10250f) == null) {
            strJ = strJ.concat(" expiresInSecs");
        }
        if (((Long) this.f10251g) == null) {
            strJ = kk.b.j(strJ, " tokenCreationEpochInSecs");
        }
        if (strJ.isEmpty()) {
            return new zi.a((String) this.f10247c, this.f10246b, (String) this.f10248d, (String) this.f10249e, ((Long) this.f10250f).longValue(), ((Long) this.f10251g).longValue(), (String) this.f10252h);
        }
        throw new IllegalStateException("Missing required properties:".concat(strJ));
    }

    public boolean k() {
        return this.f10246b < ((List) this.f10250f).size() || !((ArrayList) this.f10252h).isEmpty();
    }

    public is.d l(long j) {
        int i7 = this.f10246b;
        if (i7 != 4) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i7)).toString());
        }
        this.f10246b = 5;
        return new is.d(this, j);
    }

    public void m(Headers headers, String requestLine) {
        BufferedSink bufferedSink = (BufferedSink) this.f10250f;
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        int i7 = this.f10246b;
        if (i7 != 0) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i7)).toString());
        }
        bufferedSink.A(requestLine).A("\r\n");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            bufferedSink.A(headers.b(i10)).A(": ").A(headers.h(i10)).A("\r\n");
        }
        bufferedSink.A("\r\n");
        this.f10246b = 1;
    }

    public String toString() {
        switch (this.f10245a) {
            case 2:
                return ((op.a) this.f10247c) + " version=" + ((rp.e) this.f10248d);
            default:
                return super.toString();
        }
    }

    public o(op.a kind, rp.e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i7) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        this.f10247c = kind;
        this.f10248d = metadataVersion;
        this.f10249e = strArr;
        this.f10250f = strArr2;
        this.f10251g = strArr3;
        this.f10252h = str;
        this.f10246b = i7;
    }

    public o(cs.a address, ue.i routeDatabase, Call call) {
        List proxies;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        cs.o eventListener = cs.o.f7458d;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f10247c = address;
        this.f10248d = routeDatabase;
        this.f10249e = call;
        n0 n0Var = n0.f14659d;
        this.f10250f = n0Var;
        this.f10251g = n0Var;
        this.f10252h = new ArrayList();
        HttpUrl url = address.f7404h;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        URI uriG = url.g();
        if (uriG.getHost() == null) {
            proxies = ds.b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = address.f7403g.select(uriG);
            if (proxiesOrNull != null && !proxiesOrNull.isEmpty()) {
                Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                proxies = ds.b.w(proxiesOrNull);
            } else {
                proxies = ds.b.k(Proxy.NO_PROXY);
            }
        }
        this.f10250f = proxies;
        this.f10246b = 0;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public o(OkHttpClient okHttpClient, l connection, p source, rs.o sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f10247c = okHttpClient;
        this.f10248d = connection;
        this.f10249e = source;
        this.f10250f = sink;
        this.f10251g = new androidx.recyclerview.widget.h(source);
    }
}
