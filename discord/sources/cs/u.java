package cs;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Request f7483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f7484b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f7486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q f7487e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ResponseBody f7489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Response f7490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Response f7491i;
    public Response j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gc.k f7493m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7485c = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fj.c f7488f = new fj.c(9);

    public static void b(String str, Response response) {
        if (response == null) {
            return;
        }
        if (response.f17385y != null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".body != null").toString());
        }
        if (response.E != null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".networkResponse != null").toString());
        }
        if (response.F != null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".cacheResponse != null").toString());
        }
        if (response.G != null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".priorResponse != null").toString());
        }
    }

    public final Response a() {
        int i7 = this.f7485c;
        if (i7 < 0) {
            throw new IllegalStateException(Intrinsics.stringPlus("code < 0: ", Integer.valueOf(i7)).toString());
        }
        Request request = this.f7483a;
        if (request == null) {
            throw new IllegalStateException("request == null");
        }
        t tVar = this.f7484b;
        if (tVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.f7486d;
        if (str != null) {
            return new Response(request, tVar, str, i7, this.f7487e, this.f7488f.r(), this.f7489g, this.f7490h, this.f7491i, this.j, this.k, this.f7492l, this.f7493m);
        }
        throw new IllegalStateException("message == null");
    }

    public final void c(Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        fj.c cVarD = headers.d();
        Intrinsics.checkNotNullParameter(cVarD, "<set-?>");
        this.f7488f = cVarD;
    }
}
