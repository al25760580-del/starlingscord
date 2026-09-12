package gs;

import a5.l0;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import cs.q;
import cs.t;
import cs.u;
import cs.w;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import js.a0;
import js.p;
import js.x;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.r;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okio.Timeout;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class l extends js.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f10225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Socket f10226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f10227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f10228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f10229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f10230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public rs.p f10231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public rs.o f10232i;
    public boolean j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f10237p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f10238q;

    public l(m connectionPool, w route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f10225b = route;
        this.f10236o = 1;
        this.f10237p = new ArrayList();
        this.f10238q = LongCompanionObject.MAX_VALUE;
    }

    public static void d(OkHttpClient client, w failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f7499b.type() != Proxy.Type.DIRECT) {
            cs.a aVar = failedRoute.f7498a;
            aVar.f7403g.connectFailed(aVar.f7404h.g(), failedRoute.f7499b.address(), failure);
        }
        ue.i iVar = client.Y;
        synchronized (iVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((LinkedHashSet) iVar.f21117d).add(failedRoute);
        }
    }

    @Override // js.i
    public final synchronized void a(p connection, a0 settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f10236o = (settings.f14088a & 16) != 0 ? settings.f14089b[4] : Integer.MAX_VALUE;
    }

    @Override // js.i
    public final void b(js.w stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(js.b.REFUSED_STREAM, null);
    }

    public final void c(int i7, int i10, int i11, boolean z5, Call call) throws Throwable {
        cs.o eventListener = cs.o.f7458d;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        if (this.f10229f != null) {
            throw new IllegalStateException("already connected");
        }
        List list = this.f10225b.f7498a.j;
        b bVar = new b(list);
        cs.a aVar = this.f10225b.f7498a;
        if (aVar.f7399c == null) {
            if (!list.contains(cs.m.f7452f)) {
                throw new n(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.f10225b.f7498a.f7404h.f17323d;
            ls.n nVar = ls.n.f15297a;
            if (!ls.n.f15297a.h(str)) {
                throw new n(new UnknownServiceException(s0.g.e("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (aVar.f7405i.contains(t.H2_PRIOR_KNOWLEDGE)) {
            throw new n(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        n nVar2 = null;
        while (true) {
            try {
                w wVar = this.f10225b;
                if (wVar.f7498a.f7399c != null && wVar.f7499b.type() == Proxy.Type.HTTP) {
                    f(i7, i10, i11, call);
                    if (this.f10226c != null) {
                        break;
                    } else {
                        break;
                    }
                }
                e(i7, i10, call);
                g(bVar, call);
                w wVar2 = this.f10225b;
                InetSocketAddress inetSocketAddress = wVar2.f7500c;
                Proxy proxy = wVar2.f7499b;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(proxy, "proxy");
                break;
            } catch (IOException e10) {
                Socket socket = this.f10227d;
                if (socket != null) {
                    ds.b.d(socket);
                }
                Socket socket2 = this.f10226c;
                if (socket2 != null) {
                    ds.b.d(socket2);
                }
                this.f10227d = null;
                this.f10226c = null;
                this.f10231h = null;
                this.f10232i = null;
                this.f10228e = null;
                this.f10229f = null;
                this.f10230g = null;
                this.f10236o = 1;
                w wVar3 = this.f10225b;
                InetSocketAddress inetSocketAddress2 = wVar3.f7500c;
                Proxy proxy2 = wVar3.f7499b;
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(inetSocketAddress2, "inetSocketAddress");
                Intrinsics.checkNotNullParameter(proxy2, "proxy");
                Intrinsics.checkNotNullParameter(e10, "ioe");
                if (nVar2 == null) {
                    nVar2 = new n(e10);
                } else {
                    Intrinsics.checkNotNullParameter(e10, "e");
                    rn.f.a(nVar2.f10243d, e10);
                    nVar2.f10244e = e10;
                }
                if (!z5) {
                    throw nVar2;
                }
                Intrinsics.checkNotNullParameter(e10, "e");
                bVar.f10186d = true;
                if (!bVar.f10185c) {
                    throw nVar2;
                }
                if (e10 instanceof ProtocolException) {
                    throw nVar2;
                }
                if (e10 instanceof InterruptedIOException) {
                    throw nVar2;
                }
                if ((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) {
                    throw nVar2;
                }
                if (e10 instanceof SSLPeerUnverifiedException) {
                    throw nVar2;
                }
                if (!(e10 instanceof SSLException)) {
                    throw nVar2;
                }
            }
        }
        w wVar4 = this.f10225b;
        if (wVar4.f7498a.f7399c != null && wVar4.f7499b.type() == Proxy.Type.HTTP && this.f10226c == null) {
            throw new n(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.f10238q = System.nanoTime();
    }

    public final void e(int i7, int i10, Call call) throws IOException {
        Socket socketCreateSocket;
        w wVar = this.f10225b;
        Proxy proxy = wVar.f7499b;
        cs.a aVar = wVar.f7498a;
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : j.f10219a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            socketCreateSocket = aVar.f7398b.createSocket();
            Intrinsics.checkNotNull(socketCreateSocket);
        } else {
            socketCreateSocket = new Socket(proxy);
        }
        this.f10226c = socketCreateSocket;
        InetSocketAddress inetSocketAddress = this.f10225b.f7500c;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        socketCreateSocket.setSoTimeout(i10);
        try {
            ls.n nVar = ls.n.f15297a;
            ls.n.f15297a.e(socketCreateSocket, this.f10225b.f7500c, i7);
            try {
                this.f10231h = v.d(v.n(socketCreateSocket));
                this.f10232i = v.c(v.j(socketCreateSocket));
            } catch (NullPointerException e10) {
                if (Intrinsics.areEqual(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", this.f10225b.f7500c));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i7, int i10, int i11, Call call) throws IOException {
        Request.Builder builder = new Request.Builder();
        w wVar = this.f10225b;
        HttpUrl url = wVar.f7498a.f7404h;
        Intrinsics.checkNotNullParameter(url, "url");
        builder.f17374a = url;
        builder.f("CONNECT", null);
        cs.a aVar = wVar.f7498a;
        builder.d("Host", ds.b.v(aVar.f7404h, true));
        builder.d("Proxy-Connection", "Keep-Alive");
        builder.d("User-Agent", "okhttp/4.11.0");
        Request request = builder.b();
        fj.c cVar = new fj.c(9);
        Intrinsics.checkNotNullParameter(request, "request");
        t protocol = t.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", "message");
        okhttp3.e eVar = ds.b.f7817c;
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", StackTraceHelper.NAME_KEY);
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        Intrinsics.checkNotNullParameter("Proxy-Authenticate", StackTraceHelper.NAME_KEY);
        Intrinsics.checkNotNullParameter("OkHttp-Preemptive", "value");
        zs.a.m("Proxy-Authenticate");
        zs.a.n("OkHttp-Preemptive", "Proxy-Authenticate");
        cVar.v("Proxy-Authenticate");
        cVar.m("Proxy-Authenticate", "OkHttp-Preemptive");
        Response response = new Response(request, protocol, "Preemptive Authenticate", 407, null, cVar.r(), eVar, null, null, null, -1L, -1L, null);
        ((cs.o) aVar.f7402f).getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        HttpUrl httpUrl = request.f17368a;
        e(i7, i10, call);
        String str = "CONNECT " + ds.b.v(httpUrl, true) + " HTTP/1.1";
        rs.p pVar = this.f10231h;
        Intrinsics.checkNotNull(pVar);
        rs.o oVar = this.f10232i;
        Intrinsics.checkNotNull(oVar);
        o oVar2 = new o(null, this, pVar, oVar);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        pVar.f19593d.timeout().g(i10, timeUnit);
        oVar.f19590d.timeout().g(i11, timeUnit);
        oVar2.m(request.f17370c, str);
        oVar2.a();
        u uVarD = oVar2.d(false);
        Intrinsics.checkNotNull(uVarD);
        uVarD.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        uVarD.f7483a = request;
        Response response2 = uVarD.a();
        int i12 = response2.f17382v;
        Intrinsics.checkNotNullParameter(response2, "response");
        long j = ds.b.j(response2);
        if (j != -1) {
            is.d dVarL = oVar2.l(j);
            ds.b.t(dVarL, Integer.MAX_VALUE);
            dVarL.close();
        }
        if (i12 == 200) {
            if (!pVar.f19594e.l() || !oVar.f19591e.l()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            if (i12 != 407) {
                throw new IOException(Intrinsics.stringPlus("Unexpected response code for CONNECT: ", Integer.valueOf(i12)));
            }
            ((cs.o) aVar.f7402f).getClass();
            Intrinsics.checkNotNullParameter(response2, "response");
            throw new IOException("Failed to authenticate with proxy");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g(b bVar, Call call) throws Throwable {
        t tVarW = t.HTTP_1_1;
        cs.a aVar = this.f10225b.f7498a;
        if (aVar.f7399c == null) {
            List list = aVar.f7405i;
            t tVar = t.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(tVar)) {
                this.f10227d = this.f10226c;
                this.f10229f = tVarW;
                return;
            } else {
                this.f10227d = this.f10226c;
                this.f10229f = tVar;
                l();
                return;
            }
        }
        Intrinsics.checkNotNullParameter(call, "call");
        cs.a aVar2 = this.f10225b.f7498a;
        SSLSocketFactory sSLSocketFactory = aVar2.f7399c;
        SSLSocket sSLSocket = null;
        String strF = null;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory);
            Socket socket = this.f10226c;
            HttpUrl httpUrl = aVar2.f7404h;
            int i7 = 1;
            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket, httpUrl.f17323d, httpUrl.f17324e, true);
            if (socketCreateSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) socketCreateSocket;
            try {
                cs.m mVarA = bVar.a(sSLSocket2);
                if (mVarA.f7454b) {
                    ls.n nVar = ls.n.f15297a;
                    ls.n.f15297a.d(sSLSocket2, aVar2.f7404h.f17323d, aVar2.f7405i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                q qVarO = yk.a.o(sslSocketSession);
                HostnameVerifier hostnameVerifier = aVar2.f7400d;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (!hostnameVerifier.verify(aVar2.f7404h.f17323d, sslSocketSession)) {
                    List listA = qVarO.a();
                    if (listA.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + aVar2.f7404h.f17323d + " not verified (no certificates)");
                    }
                    X509Certificate certificate = (X509Certificate) listA.get(0);
                    StringBuilder sb2 = new StringBuilder("\n              |Hostname ");
                    sb2.append(aVar2.f7404h.f17323d);
                    sb2.append(" not verified:\n              |    certificate: ");
                    cs.j jVar = cs.j.f7430c;
                    sb2.append(w3.q.x(certificate));
                    sb2.append("\n              |    DN: ");
                    sb2.append((Object) certificate.getSubjectDN().getName());
                    sb2.append("\n              |    subjectAltNames: ");
                    Intrinsics.checkNotNullParameter(certificate, "certificate");
                    sb2.append(CollectionsKt.V(ps.c.a(certificate, 7), ps.c.a(certificate, 2)));
                    sb2.append("\n              ");
                    throw new SSLPeerUnverifiedException(r.c(sb2.toString()));
                }
                cs.j jVar2 = aVar2.f7401e;
                Intrinsics.checkNotNull(jVar2);
                this.f10228e = new q(qVarO.f7461a, qVarO.f7462b, qVarO.f7463c, new cs.i(jVar2, qVarO, aVar2, i7));
                jVar2.a(aVar2.f7404h.f17323d, new a3.q(4, this));
                if (mVarA.f7454b) {
                    ls.n nVar2 = ls.n.f15297a;
                    strF = ls.n.f15297a.f(sSLSocket2);
                }
                this.f10227d = sSLSocket2;
                this.f10231h = v.d(v.n(sSLSocket2));
                this.f10232i = v.c(v.j(sSLSocket2));
                if (strF != null) {
                    tVarW = l0.w(strF);
                }
                this.f10229f = tVarW;
                ls.n nVar3 = ls.n.f15297a;
                ls.n.f15297a.a(sSLSocket2);
                Intrinsics.checkNotNullParameter(call, "call");
                if (this.f10229f == t.HTTP_2) {
                    l();
                }
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    ls.n nVar4 = ls.n.f15297a;
                    ls.n.f15297a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    ds.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean h(cs.a address, List list) {
        q qVar;
        Intrinsics.checkNotNullParameter(address, "address");
        byte[] bArr = ds.b.f7815a;
        int i7 = 0;
        if (this.f10237p.size() < this.f10236o && !this.j) {
            w wVar = this.f10225b;
            cs.a aVar = wVar.f7498a;
            cs.a aVar2 = wVar.f7498a;
            boolean zA = aVar.a(address);
            HttpUrl httpUrl = address.f7404h;
            if (zA) {
                String str = httpUrl.f17323d;
                String hostname = httpUrl.f17323d;
                if (!Intrinsics.areEqual(str, aVar2.f7404h.f17323d)) {
                    if (this.f10230g != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            w wVar2 = (w) it.next();
                            Proxy.Type type = wVar2.f7499b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && wVar.f7499b.type() == type2 && Intrinsics.areEqual(wVar.f7500c, wVar2.f7500c)) {
                                if (address.f7400d != ps.c.f18545a) {
                                    break;
                                }
                                byte[] bArr2 = ds.b.f7815a;
                                HttpUrl httpUrl2 = aVar2.f7404h;
                                if (httpUrl.f17324e != httpUrl2.f17324e) {
                                    break;
                                }
                                if (!Intrinsics.areEqual(hostname, httpUrl2.f17323d)) {
                                    if (!this.k && (qVar = this.f10228e) != null) {
                                        Intrinsics.checkNotNull(qVar);
                                        List listA = qVar.a();
                                        if (listA.isEmpty() || !ps.c.c(hostname, (X509Certificate) listA.get(0))) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    cs.j jVar = address.f7401e;
                                    Intrinsics.checkNotNull(jVar);
                                    q qVar2 = this.f10228e;
                                    Intrinsics.checkNotNull(qVar2);
                                    List peerCertificates = qVar2.a();
                                    jVar.getClass();
                                    Intrinsics.checkNotNullParameter(hostname, "hostname");
                                    Intrinsics.checkNotNullParameter(peerCertificates, "peerCertificates");
                                    jVar.a(hostname, new cs.i(jVar, peerCertificates, hostname, i7));
                                    return true;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean i(boolean z5) {
        long j;
        byte[] bArr = ds.b.f7815a;
        long jNanoTime = System.nanoTime();
        Socket socket = this.f10226c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f10227d;
        Intrinsics.checkNotNull(socket2);
        rs.p source = this.f10231h;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        p pVar = this.f10230g;
        if (pVar != null) {
            synchronized (pVar) {
                if (pVar.f14155x) {
                    return false;
                }
                return pVar.K >= pVar.J || jNanoTime < pVar.L;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f10238q;
        }
        if (j < 10000000000L || !z5) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !source.c();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final hs.e j(OkHttpClient client, hs.g chain) throws SocketException {
        int i7 = chain.f11136g;
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f10227d;
        Intrinsics.checkNotNull(socket);
        rs.p pVar = this.f10231h;
        Intrinsics.checkNotNull(pVar);
        rs.o oVar = this.f10232i;
        Intrinsics.checkNotNull(oVar);
        p pVar2 = this.f10230g;
        if (pVar2 != null) {
            return new js.q(client, this, chain, pVar2);
        }
        socket.setSoTimeout(i7);
        Timeout timeout = pVar.f19593d.timeout();
        long j = i7;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.g(j, timeUnit);
        oVar.f19590d.timeout().g(chain.f11137h, timeUnit);
        return new o(client, this, pVar, oVar);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l() throws SocketException {
        int i7;
        Socket socket = this.f10227d;
        Intrinsics.checkNotNull(socket);
        rs.p source = this.f10231h;
        Intrinsics.checkNotNull(source);
        rs.o sink = this.f10232i;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        fs.c taskRunner = fs.c.f9420h;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        af.c cVar = new af.c();
        cVar.f393d = taskRunner;
        cVar.f398x = js.i.f14128a;
        String peerName = this.f10225b.f7498a.f7404h.f17323d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        cVar.f394e = socket;
        String str = ds.b.f7821g + ' ' + peerName;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        cVar.f395i = str;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        cVar.f396v = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        cVar.f397w = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        cVar.f398x = this;
        p pVar = new p(cVar);
        this.f10230g = pVar;
        a0 a0Var = p.W;
        this.f10236o = (a0Var.f14088a & 16) != 0 ? a0Var.f14089b[4] : Integer.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        x xVar = pVar.T;
        synchronized (xVar) {
            try {
                if (xVar.f14201v) {
                    throw new IOException("closed");
                }
                Logger logger = x.f14197x;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(ds.b.h(Intrinsics.stringPlus(">> CONNECTION ", js.g.f14124a.d()), new Object[0]));
                }
                xVar.f14198d.X(js.g.f14124a);
                xVar.f14198d.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        x xVar2 = pVar.T;
        a0 settings = pVar.M;
        synchronized (xVar2) {
            try {
                Intrinsics.checkNotNullParameter(settings, "settings");
                if (xVar2.f14201v) {
                    throw new IOException("closed");
                }
                xVar2.g(0, Integer.bitCount(settings.f14088a) * 6, 4, 0);
                int i10 = 0;
                while (i10 < 10) {
                    int i11 = i10 + 1;
                    boolean z5 = true;
                    if (((1 << i10) & settings.f14088a) == 0) {
                        z5 = false;
                    }
                    if (z5) {
                        if (i10 != 4) {
                            i7 = i10 != 7 ? i10 : 4;
                        } else {
                            i7 = 3;
                        }
                        xVar2.f14198d.writeShort(i7);
                        xVar2.f14198d.writeInt(settings.f14089b[i10]);
                    }
                    i10 = i11;
                }
                xVar2.f14198d.flush();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        int iA = pVar.M.a();
        if (iA != 65535) {
            pVar.T.u(0, iA - 65535);
        }
        taskRunner.e().c(new es.g(pVar.f14152i, pVar.U, 1), 0L);
    }

    public final String toString() {
        cs.l lVar;
        StringBuilder sb2 = new StringBuilder("Connection{");
        w wVar = this.f10225b;
        sb2.append(wVar.f7498a.f7404h.f17323d);
        sb2.append(':');
        sb2.append(wVar.f7498a.f7404h.f17324e);
        sb2.append(", proxy=");
        sb2.append(wVar.f7499b);
        sb2.append(" hostAddress=");
        sb2.append(wVar.f7500c);
        sb2.append(" cipherSuite=");
        q qVar = this.f10228e;
        Object obj = ViewProps.NONE;
        if (qVar != null && (lVar = qVar.f7462b) != null) {
            obj = lVar;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f10229f);
        sb2.append('}');
        return sb2.toString();
    }
}
