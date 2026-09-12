package okhttp3;

import cs.q;
import cs.t;
import cs.u;
import gc.k;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Response implements Closeable {
    public final Response E;
    public final Response F;
    public final Response G;
    public final long H;
    public final long I;
    public final k J;
    public CacheControl K;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Request f17379d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f17380e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f17381i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f17382v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q f17383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Headers f17384x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ResponseBody f17385y;

    public Response(Request request, t protocol, String message, int i7, q qVar, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j5, k kVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f17379d = request;
        this.f17380e = protocol;
        this.f17381i = message;
        this.f17382v = i7;
        this.f17383w = qVar;
        this.f17384x = headers;
        this.f17385y = responseBody;
        this.E = response;
        this.F = response2;
        this.G = response3;
        this.H = j;
        this.I = j5;
        this.J = kVar;
    }

    public final CacheControl c() {
        CacheControl cacheControl = this.K;
        if (cacheControl != null) {
            return cacheControl;
        }
        int i7 = CacheControl.f17289n;
        CacheControl cacheControlB = sa.a.B(this.f17384x);
        this.K = cacheControlB;
        return cacheControlB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ResponseBody responseBody = this.f17385y;
        if (responseBody == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        responseBody.close();
    }

    public final String f(String name, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        String strA = this.f17384x.a(name);
        return strA == null ? str : strA;
    }

    public final boolean g() {
        int i7 = this.f17382v;
        return 200 <= i7 && i7 < 300;
    }

    public final u i() {
        Intrinsics.checkNotNullParameter(this, "response");
        u uVar = new u();
        uVar.f7483a = this.f17379d;
        uVar.f7484b = this.f17380e;
        uVar.f7485c = this.f17382v;
        uVar.f7486d = this.f17381i;
        uVar.f7487e = this.f17383w;
        uVar.f7488f = this.f17384x.d();
        uVar.f7489g = this.f17385y;
        uVar.f7490h = this.E;
        uVar.f7491i = this.F;
        uVar.j = this.G;
        uVar.k = this.H;
        uVar.f7492l = this.I;
        uVar.f7493m = this.J;
        return uVar;
    }

    public final String toString() {
        return "Response{protocol=" + this.f17380e + ", code=" + this.f17382v + ", message=" + this.f17381i + ", url=" + this.f17379d.f17368a + '}';
    }
}
