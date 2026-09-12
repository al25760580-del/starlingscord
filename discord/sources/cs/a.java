package cs;

import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f7397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SocketFactory f7398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f7399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f7400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f7401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f7402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f7403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HttpUrl f7404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f7405i;
    public final List j;

    public a(String uriHost, int i7, n dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, j jVar, o proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(uriHost, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f7397a = dns;
        this.f7398b = socketFactory;
        this.f7399c = sSLSocketFactory;
        this.f7400d = hostnameVerifier;
        this.f7401e = jVar;
        this.f7402f = proxyAuthenticator;
        this.f7403g = proxySelector;
        r rVar = new r(0);
        rVar.h(sSLSocketFactory != null ? "https" : "http");
        rVar.e(uriHost);
        if (1 > i7 || i7 >= 65536) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(i7)).toString());
        }
        rVar.f7466b = i7;
        this.f7404h = rVar.b();
        this.f7405i = ds.b.w(protocols);
        this.j = ds.b.w(connectionSpecs);
    }

    public final boolean a(a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f7397a, that.f7397a) && Intrinsics.areEqual(this.f7402f, that.f7402f) && Intrinsics.areEqual(this.f7405i, that.f7405i) && Intrinsics.areEqual(this.j, that.j) && Intrinsics.areEqual(this.f7403g, that.f7403g) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f7399c, that.f7399c) && Intrinsics.areEqual(this.f7400d, that.f7400d) && Intrinsics.areEqual(this.f7401e, that.f7401e) && this.f7404h.f17324e == that.f7404h.f17324e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f7404h, aVar.f7404h) && a(aVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f7401e) + ((Objects.hashCode(this.f7400d) + ((Objects.hashCode(this.f7399c) + ((this.f7403g.hashCode() + a3.e.f(this.j, a3.e.f(this.f7405i, (this.f7402f.hashCode() + ((this.f7397a.hashCode() + a3.e.d(527, 31, this.f7404h.f17327h)) * 31)) * 31, 31), 31)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f7404h;
        sb2.append(httpUrl.f17323d);
        sb2.append(':');
        sb2.append(httpUrl.f17324e);
        sb2.append(", ");
        sb2.append(Intrinsics.stringPlus("proxySelector=", this.f7403g));
        sb2.append('}');
        return sb2.toString();
    }
}
