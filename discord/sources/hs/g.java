package hs;

import gc.k;
import gs.i;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Interceptor.Chain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f11130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f11133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Request f11134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11136g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11137h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11138i;

    public g(i call, ArrayList interceptors, int i7, k kVar, Request request, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f11130a = call;
        this.f11131b = interceptors;
        this.f11132c = i7;
        this.f11133d = kVar;
        this.f11134e = request;
        this.f11135f = i10;
        this.f11136g = i11;
        this.f11137h = i12;
    }

    public static g b(g gVar, int i7, k kVar, Request request, int i10) {
        if ((i10 & 1) != 0) {
            i7 = gVar.f11132c;
        }
        int i11 = i7;
        if ((i10 & 2) != 0) {
            kVar = gVar.f11133d;
        }
        k kVar2 = kVar;
        if ((i10 & 4) != 0) {
            request = gVar.f11134e;
        }
        Request request2 = request;
        int i12 = gVar.f11135f;
        int i13 = gVar.f11136g;
        int i14 = gVar.f11137h;
        Intrinsics.checkNotNullParameter(request2, "request");
        return new g(gVar.f11130a, gVar.f11131b, i11, kVar2, request2, i12, i13, i14);
    }

    @Override // okhttp3.Interceptor.Chain
    public final Response a(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f11131b;
        int size = arrayList.size();
        int i7 = this.f11132c;
        if (i7 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f11138i++;
        k kVar = this.f11133d;
        if (kVar != null) {
            if (!((gs.e) kVar.f9734v).b(request.f17368a)) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must retain the same host and port").toString());
            }
            if (this.f11138i != 1) {
                throw new IllegalStateException(("network interceptor " + arrayList.get(i7 - 1) + " must call proceed() exactly once").toString());
            }
        }
        int i10 = i7 + 1;
        g gVarB = b(this, i10, null, request, 58);
        Interceptor interceptor = (Interceptor) arrayList.get(i7);
        Response responseIntercept = interceptor.intercept(gVarB);
        if (responseIntercept == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (kVar != null && i10 < arrayList.size() && gVarB.f11138i != 1) {
            throw new IllegalStateException(("network interceptor " + interceptor + " must call proceed() exactly once").toString());
        }
        if (responseIntercept.f17385y != null) {
            return responseIntercept;
        }
        throw new IllegalStateException(("interceptor " + interceptor + " returned a response with no body").toString());
    }

    @Override // okhttp3.Interceptor.Chain
    public final Request i() {
        return this.f11134e;
    }
}
