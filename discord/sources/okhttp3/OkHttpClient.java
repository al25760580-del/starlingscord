package okhttp3;

import cs.g;
import cs.j;
import cs.m;
import cs.n;
import cs.o;
import cs.t;
import cs.y;
import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import ls.l;
import ue.i;

/* JADX INFO: loaded from: classes.dex */
public final class OkHttpClient implements Cloneable, Call.Factory {
    public static final List Z = ds.b.k(t.HTTP_2, t.HTTP_1_1);
    public static final List a0 = ds.b.k(m.f7451e, m.f7452f);
    public final boolean E;
    public final boolean F;
    public final CookieJar G;
    public final g H;
    public final n I;
    public final ProxySelector J;
    public final o K;
    public final SocketFactory L;
    public final SSLSocketFactory M;
    public final X509TrustManager N;
    public final List O;
    public final List P;
    public final ps.c Q;
    public final j R;
    public final l S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final long X;
    public final i Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Dispatcher f17337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f17338e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f17339i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f17340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.google.firebase.messaging.n f17341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f17342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f17343y;

    public static final class Builder {
        public long A;
        public i B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Dispatcher f17344a = new Dispatcher();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f17345b = new i(7, false);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f17346c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f17347d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public com.google.firebase.messaging.n f17348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f17349f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public o f17350g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f17351h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f17352i;
        public CookieJar j;
        public g k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public n f17353l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ProxySelector f17354m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public o f17355n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public SocketFactory f17356o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public SSLSocketFactory f17357p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public X509TrustManager f17358q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public List f17359r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f17360s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public ps.c f17361t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public j f17362u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public l f17363v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f17364w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f17365x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f17366y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f17367z;

        public Builder() {
            Intrinsics.checkNotNullParameter(o.f7458d, "<this>");
            this.f17348e = new com.google.firebase.messaging.n(8);
            this.f17349f = true;
            o oVar = cs.b.f7406f;
            this.f17350g = oVar;
            this.f17351h = true;
            this.f17352i = true;
            this.j = CookieJar.f17312t;
            this.f17353l = n.f7457g;
            this.f17355n = oVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f17356o = socketFactory;
            this.f17359r = OkHttpClient.a0;
            this.f17360s = OkHttpClient.Z;
            this.f17361t = ps.c.f18545a;
            this.f17362u = j.f7430c;
            this.f17365x = 10000;
            this.f17366y = 10000;
            this.f17367z = 10000;
            this.A = 1024L;
        }

        public final void a(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f17365x = ds.b.b(j, unit);
        }

        public final void b(CookieJar cookieJar) {
            Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
            Intrinsics.checkNotNullParameter(cookieJar, "<set-?>");
            this.j = cookieJar;
        }

        public final void c(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f17366y = ds.b.b(j, unit);
        }

        public final void d(long j, TimeUnit unit) {
            Intrinsics.checkNotNullParameter(unit, "unit");
            this.f17367z = ds.b.b(j, unit);
        }
    }

    public OkHttpClient(Builder builder) throws NoSuchAlgorithmException, KeyStoreException {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f17337d = builder.f17344a;
        this.f17338e = builder.f17345b;
        this.f17339i = ds.b.w(builder.f17346c);
        this.f17340v = ds.b.w(builder.f17347d);
        this.f17341w = builder.f17348e;
        this.f17342x = builder.f17349f;
        this.f17343y = builder.f17350g;
        this.E = builder.f17351h;
        this.F = builder.f17352i;
        this.G = builder.j;
        this.H = builder.k;
        this.I = builder.f17353l;
        ProxySelector proxySelector = builder.f17354m;
        proxySelector = proxySelector == null ? ProxySelector.getDefault() : proxySelector;
        this.J = proxySelector == null ? ns.a.f17067a : proxySelector;
        this.K = builder.f17355n;
        this.L = builder.f17356o;
        List list = builder.f17359r;
        this.O = list;
        this.P = builder.f17360s;
        this.Q = builder.f17361t;
        this.T = builder.f17364w;
        this.U = builder.f17365x;
        this.V = builder.f17366y;
        this.W = builder.f17367z;
        this.X = builder.A;
        i iVar = builder.B;
        this.Y = iVar == null ? new i(11, false) : iVar;
        if (list != null && list.isEmpty()) {
            this.M = null;
            this.S = null;
            this.N = null;
            this.R = j.f7430c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.M = null;
                this.S = null;
                this.N = null;
                this.R = j.f7430c;
                break;
            }
            if (((m) it.next()).f7453a) {
                SSLSocketFactory sSLSocketFactory = builder.f17357p;
                if (sSLSocketFactory == null) {
                    ls.n nVar = ls.n.f15297a;
                    X509TrustManager trustManager = ls.n.f15297a.m();
                    this.N = trustManager;
                    ls.n nVar2 = ls.n.f15297a;
                    Intrinsics.checkNotNull(trustManager);
                    this.M = nVar2.l(trustManager);
                    Intrinsics.checkNotNull(trustManager);
                    Intrinsics.checkNotNullParameter(trustManager, "trustManager");
                    l certificateChainCleaner = ls.n.f15297a.b(trustManager);
                    this.S = certificateChainCleaner;
                    j jVar = builder.f17362u;
                    Intrinsics.checkNotNull(certificateChainCleaner);
                    jVar.getClass();
                    Intrinsics.checkNotNullParameter(certificateChainCleaner, "certificateChainCleaner");
                    this.R = Intrinsics.areEqual(jVar.f7432b, certificateChainCleaner) ? jVar : new j(jVar.f7431a, certificateChainCleaner);
                    break;
                }
                this.M = sSLSocketFactory;
                l certificateChainCleaner2 = builder.f17363v;
                Intrinsics.checkNotNull(certificateChainCleaner2);
                this.S = certificateChainCleaner2;
                X509TrustManager x509TrustManager = builder.f17358q;
                Intrinsics.checkNotNull(x509TrustManager);
                this.N = x509TrustManager;
                j jVar2 = builder.f17362u;
                Intrinsics.checkNotNull(certificateChainCleaner2);
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(certificateChainCleaner2, "certificateChainCleaner");
                this.R = Intrinsics.areEqual(jVar2.f7432b, certificateChainCleaner2) ? jVar2 : new j(jVar2.f7431a, certificateChainCleaner2);
                break;
            }
        }
        X509TrustManager x509TrustManager2 = this.N;
        l lVar = this.S;
        SSLSocketFactory sSLSocketFactory2 = this.M;
        List list2 = this.f17340v;
        List list3 = this.f17339i;
        if (list3.contains(null)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null interceptor: ", list3).toString());
        }
        if (list2.contains(null)) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null network interceptor: ", list2).toString());
        }
        List list4 = this.O;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((m) it2.next()).f7453a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (lVar == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager2 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (lVar != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!Intrinsics.areEqual(this.R, j.f7430c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // okhttp3.Call.Factory
    public final gs.i a(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new gs.i(this, request, false);
    }

    public final Builder b() {
        Intrinsics.checkNotNullParameter(this, "okHttpClient");
        Builder builder = new Builder();
        builder.f17344a = this.f17337d;
        builder.f17345b = this.f17338e;
        i0.o(builder.f17346c, this.f17339i);
        i0.o(builder.f17347d, this.f17340v);
        builder.f17348e = this.f17341w;
        builder.f17349f = this.f17342x;
        builder.f17350g = this.f17343y;
        builder.f17351h = this.E;
        builder.f17352i = this.F;
        builder.j = this.G;
        builder.k = this.H;
        builder.f17353l = this.I;
        builder.f17354m = this.J;
        builder.f17355n = this.K;
        builder.f17356o = this.L;
        builder.f17357p = this.M;
        builder.f17358q = this.N;
        builder.f17359r = this.O;
        builder.f17360s = this.P;
        builder.f17361t = this.Q;
        builder.f17362u = this.R;
        builder.f17363v = this.S;
        builder.f17364w = this.T;
        builder.f17365x = this.U;
        builder.f17366y = this.V;
        builder.f17367z = this.W;
        builder.A = this.X;
        builder.B = this.Y;
        return builder;
    }

    public final qs.g c(Request request, y listener) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        qs.g gVar = new qs.g(fs.c.f9420h, request, listener, new Random(), 0, this.X);
        Intrinsics.checkNotNullParameter(this, "client");
        if (request.a("Sec-WebSocket-Extensions") != null) {
            gVar.f(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
            return gVar;
        }
        Builder builderB = b();
        o eventListener = o.f7458d;
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(eventListener, "<this>");
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(8);
        Intrinsics.checkNotNullParameter(nVar, "<set-?>");
        builderB.f17348e = nVar;
        List protocols = qs.g.f19082w;
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayListJ0 = CollectionsKt.j0(protocols);
        t tVar = t.H2_PRIOR_KNOWLEDGE;
        if (!arrayListJ0.contains(tVar) && !arrayListJ0.contains(t.HTTP_1_1)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("protocols must contain h2_prior_knowledge or http/1.1: ", arrayListJ0).toString());
        }
        if (arrayListJ0.contains(tVar) && arrayListJ0.size() > 1) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("protocols containing h2_prior_knowledge cannot use other protocols: ", arrayListJ0).toString());
        }
        if (arrayListJ0.contains(t.HTTP_1_0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("protocols must not contain http/1.0: ", arrayListJ0).toString());
        }
        if (arrayListJ0.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayListJ0.remove(t.SPDY_3);
        if (!Intrinsics.areEqual(arrayListJ0, builderB.f17360s)) {
            builderB.B = null;
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayListJ0);
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(protocolsCopy)");
        Intrinsics.checkNotNullParameter(listUnmodifiableList, "<set-?>");
        builderB.f17360s = listUnmodifiableList;
        OkHttpClient okHttpClient = new OkHttpClient(builderB);
        Request.Builder builderB2 = request.b();
        builderB2.d("Upgrade", "websocket");
        builderB2.d("Connection", "Upgrade");
        builderB2.d("Sec-WebSocket-Key", gVar.f19088f);
        builderB2.d("Sec-WebSocket-Version", "13");
        builderB2.d("Sec-WebSocket-Extensions", "permessage-deflate");
        Request requestB = builderB2.b();
        gs.i iVar = new gs.i(okHttpClient, requestB, true);
        gVar.f19089g = iVar;
        Intrinsics.checkNotNull(iVar);
        iVar.d(new e4.l(17, gVar, requestB));
        return gVar;
    }

    public final Object clone() {
        return super.clone();
    }

    public OkHttpClient() {
        this(new Builder());
    }
}
