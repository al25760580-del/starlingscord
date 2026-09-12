package hs;

import a5.b0;
import com.facebook.react.views.image.ReactImageView;
import cs.j;
import cs.r;
import cs.u;
import cs.w;
import gc.k;
import gs.i;
import gs.l;
import gs.m;
import gs.n;
import gs.o;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import rs.v;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11123a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11124b;

    public a(CookieJar cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f11124b = cookieJar;
    }

    public static int c(Response response, int i7) {
        String strF = response.f("Retry-After", null);
        if (strF == null) {
            return i7;
        }
        if (!new Regex("\\d+").d(strF)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strF);
        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(header)");
        return numValueOf.intValue();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0149  */
    /* JADX WARN: Code duplicated, block: B:109:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x015f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0166  */
    /* JADX WARN: Code duplicated, block: B:116:0x017d  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x0116  */
    /* JADX WARN: Code duplicated, block: B:89:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x013a  */
    public Request a(Response response, k kVar) throws ProtocolException {
        l lVar;
        OkHttpClient okHttpClient;
        String link;
        Request request;
        r rVar;
        HttpUrl url;
        Request.Builder builderB;
        boolean z5;
        RequestBody requestBody;
        Response response2;
        w wVar = (kVar == null || (lVar = (l) kVar.f9736x) == null) ? null : lVar.f10225b;
        int i7 = response.f17382v;
        Request request2 = response.f17379d;
        String method = request2.f17369b;
        if (i7 == 307 || i7 == 308) {
            okHttpClient = (OkHttpClient) this.f11124b;
            if (okHttpClient.E) {
                link = response.f("Location", null);
                request = response.f17379d;
                if (link != null) {
                    HttpUrl httpUrl = request.f17368a;
                    httpUrl.getClass();
                    Intrinsics.checkNotNullParameter(link, "link");
                    Intrinsics.checkNotNullParameter(link, "link");
                    try {
                        rVar = new r(0);
                        rVar.g(httpUrl, link);
                    } catch (IllegalArgumentException unused) {
                        rVar = null;
                    }
                    if (rVar == null) {
                        url = null;
                    } else {
                        url = rVar.b();
                    }
                    if (url != null && (Intrinsics.areEqual(url.f17320a, request.f17368a.f17320a) || okHttpClient.F)) {
                        builderB = request.b();
                        if (q.w(method)) {
                            int i10 = response.f17382v;
                            Intrinsics.checkNotNullParameter(method, "method");
                            z5 = !Intrinsics.areEqual(method, "PROPFIND") || i10 == 308 || i10 == 307;
                            Intrinsics.checkNotNullParameter(method, "method");
                            if (!Intrinsics.areEqual(method, "PROPFIND") || i10 == 308 || i10 == 307) {
                                builderB.f(method, z5 ? request.f17371d : null);
                            } else {
                                builderB.f("GET", null);
                            }
                            if (!z5) {
                                builderB.g("Transfer-Encoding");
                                builderB.g("Content-Length");
                                builderB.g("Content-Type");
                            }
                        }
                        if (!ds.b.a(request.f17368a, url)) {
                            builderB.g("Authorization");
                        }
                        Intrinsics.checkNotNullParameter(url, "url");
                        builderB.f17374a = url;
                        return builderB.b();
                    }
                }
            }
        } else {
            if (i7 == 401) {
                ((OkHttpClient) this.f11124b).f17343y.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i7 == 421) {
                RequestBody requestBody2 = request2.f17371d;
                if ((requestBody2 == null || !requestBody2.isOneShot()) && kVar != null && !Intrinsics.areEqual(((gs.e) kVar.f9734v).f10199b.f7404h.f17323d, ((l) kVar.f9736x).f10225b.f7498a.f7404h.f17323d)) {
                    l lVar2 = (l) kVar.f9736x;
                    synchronized (lVar2) {
                        lVar2.k = true;
                    }
                    return response.f17379d;
                }
            } else if (i7 == 503) {
                Response response3 = response.G;
                if ((response3 == null || response3.f17382v != 503) && c(response, Integer.MAX_VALUE) == 0) {
                    return response.f17379d;
                }
            } else {
                if (i7 == 407) {
                    Intrinsics.checkNotNull(wVar);
                    if (wVar.f7499b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((OkHttpClient) this.f11124b).K.getClass();
                    Intrinsics.checkNotNullParameter(response, "response");
                    return null;
                }
                if (i7 != 408) {
                    switch (i7) {
                        case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
                        case 301:
                        case 302:
                        case 303:
                            okHttpClient = (OkHttpClient) this.f11124b;
                            if (okHttpClient.E) {
                                link = response.f("Location", null);
                                request = response.f17379d;
                                if (link != null) {
                                    HttpUrl httpUrl2 = request.f17368a;
                                    httpUrl2.getClass();
                                    Intrinsics.checkNotNullParameter(link, "link");
                                    Intrinsics.checkNotNullParameter(link, "link");
                                    rVar = new r(0);
                                    rVar.g(httpUrl2, link);
                                    if (rVar == null) {
                                        url = null;
                                    } else {
                                        url = rVar.b();
                                    }
                                    if (url != null) {
                                        builderB = request.b();
                                        if (q.w(method)) {
                                            int i11 = response.f17382v;
                                            Intrinsics.checkNotNullParameter(method, "method");
                                            if (Intrinsics.areEqual(method, "PROPFIND")) {
                                            }
                                            Intrinsics.checkNotNullParameter(method, "method");
                                            if (Intrinsics.areEqual(method, "PROPFIND")) {
                                                builderB.f(method, z5 ? request.f17371d : null);
                                            } else {
                                                builderB.f(method, z5 ? request.f17371d : null);
                                            }
                                            if (!z5) {
                                                builderB.g("Transfer-Encoding");
                                                builderB.g("Content-Length");
                                                builderB.g("Content-Type");
                                            }
                                        }
                                        if (!ds.b.a(request.f17368a, url)) {
                                            builderB.g("Authorization");
                                        }
                                        Intrinsics.checkNotNullParameter(url, "url");
                                        builderB.f17374a = url;
                                        return builderB.b();
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (((OkHttpClient) this.f11124b).f17342x && (((requestBody = request2.f17371d) == null || !requestBody.isOneShot()) && (((response2 = response.G) == null || response2.f17382v != 408) && c(response, 0) <= 0))) {
                    return response.f17379d;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0053  */
    /* JADX WARN: Code duplicated, block: B:40:0x0058  */
    /* JADX WARN: Code duplicated, block: B:42:0x005b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0070 A[ADDED_TO_REGION, DONT_GENERATE, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:55:0x0072 A[Catch: all -> 0x0088, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:51:0x006c, B:55:0x0072, B:59:0x0084), top: B:81:0x006c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x008d  */
    /* JADX WARN: Code duplicated, block: B:67:0x008f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0091  */
    /* JADX WARN: Code duplicated, block: B:71:0x0096  */
    /* JADX WARN: Code duplicated, block: B:74:0x009d  */
    /* JADX WARN: Code duplicated, block: B:80:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public boolean b(IOException iOException, i iVar, Request request, boolean z5) {
        gs.e eVar;
        int i7;
        boolean zK;
        w wVar;
        b0 b0Var;
        o oVar;
        l lVar;
        RequestBody requestBody;
        if (!((OkHttpClient) this.f11124b).f17342x || ((z5 && (((requestBody = request.f17371d) != null && requestBody.isOneShot()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (!(iOException instanceof InterruptedIOException)) {
            if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
                return false;
            }
            eVar = iVar.E;
            Intrinsics.checkNotNull(eVar);
            i7 = eVar.f10203f;
            if (i7 != 0) {
                if (eVar.f10206i != null) {
                    zK = true;
                } else {
                    wVar = null;
                    if (i7 <= 1) {
                        synchronized (lVar) {
                            if (lVar.f10233l != 0) {
                                wVar = lVar.f10225b;
                            }
                        }
                    }
                    if (wVar != null) {
                        eVar.f10206i = wVar;
                    } else {
                        b0Var = eVar.f10201d;
                        if (b0Var != null) {
                        }
                    }
                    zK = true;
                }
            } else if (eVar.f10206i != null) {
                zK = true;
            } else {
                wVar = null;
                if (i7 <= 1) {
                    synchronized (lVar) {
                        if (lVar.f10233l != 0) {
                            wVar = lVar.f10225b;
                        }
                    }
                }
                if (wVar != null) {
                    eVar.f10206i = wVar;
                } else {
                    b0Var = eVar.f10201d;
                    if (b0Var != null) {
                    }
                }
                zK = true;
            }
            if (!zK) {
                return true;
            }
        } else if ((iOException instanceof SocketTimeoutException) && !z5) {
            eVar = iVar.E;
            Intrinsics.checkNotNull(eVar);
            i7 = eVar.f10203f;
            if (i7 != 0 && eVar.f10204g == 0 && eVar.f10205h == 0) {
                zK = false;
            } else if (eVar.f10206i != null) {
                zK = true;
            } else {
                wVar = null;
                if (i7 <= 1 && eVar.f10204g <= 1 && eVar.f10205h <= 0 && (lVar = eVar.f10200c.F) != null) {
                    synchronized (lVar) {
                        if (lVar.f10233l != 0 && ds.b.a(lVar.f10225b.f7498a.f7404h, eVar.f10199b.f7404h)) {
                            wVar = lVar.f10225b;
                        }
                    }
                }
                if (wVar != null) {
                    eVar.f10206i = wVar;
                } else {
                    b0Var = eVar.f10201d;
                    if ((b0Var != null || !b0Var.s()) && (oVar = eVar.f10202e) != null) {
                        zK = oVar.k();
                    }
                }
                zK = true;
            }
            if (!zK) {
                return true;
            }
        }
        return false;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        boolean z5;
        ResponseBody responseBody;
        Response responseA;
        boolean z6;
        SSLSocketFactory sSLSocketFactory;
        ps.c cVar;
        j jVar;
        switch (this.f11123a) {
            case 0:
                CookieJar cookieJar = (CookieJar) this.f11124b;
                Intrinsics.checkNotNullParameter(chain, "chain");
                g gVar = (g) chain;
                Request request = gVar.f11134e;
                Request.Builder builderB = request.b();
                HttpUrl httpUrl = request.f17368a;
                RequestBody requestBody = request.f17371d;
                if (requestBody != null) {
                    MediaType mediaTypeContentType = requestBody.get$mediaType();
                    if (mediaTypeContentType != null) {
                        builderB.d("Content-Type", mediaTypeContentType.f17331a);
                    }
                    long jContentLength = requestBody.contentLength();
                    if (jContentLength != -1) {
                        builderB.d("Content-Length", String.valueOf(jContentLength));
                        builderB.g("Transfer-Encoding");
                    } else {
                        builderB.d("Transfer-Encoding", "chunked");
                        builderB.g("Content-Length");
                    }
                }
                int i7 = 0;
                if (request.a("Host") == null) {
                    builderB.d("Host", ds.b.v(httpUrl, false));
                }
                if (request.a("Connection") == null) {
                    builderB.d("Connection", "Keep-Alive");
                }
                if (request.a("Accept-Encoding") == null && request.a("Range") == null) {
                    builderB.d("Accept-Encoding", "gzip");
                    z5 = true;
                } else {
                    z5 = false;
                }
                List listLoadForRequest = cookieJar.loadForRequest(httpUrl);
                if (!listLoadForRequest.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    for (Object obj : listLoadForRequest) {
                        int i10 = i7 + 1;
                        if (i7 < 0) {
                            d0.k();
                            throw null;
                        }
                        Cookie cookie = (Cookie) obj;
                        if (i7 > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(cookie.f17303a);
                        sb2.append('=');
                        sb2.append(cookie.f17304b);
                        i7 = i10;
                    }
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
                    builderB.d("Cookie", string);
                }
                if (request.a("User-Agent") == null) {
                    builderB.d("User-Agent", "okhttp/4.11.0");
                }
                Response responseA2 = gVar.a(builderB.b());
                Headers headers = responseA2.f17384x;
                f.b(cookieJar, httpUrl, headers);
                u uVarI = responseA2.i();
                Intrinsics.checkNotNullParameter(request, "request");
                uVarI.f7483a = request;
                if (z5 && "gzip".equalsIgnoreCase(responseA2.f("Content-Encoding", null)) && f.a(responseA2) && (responseBody = responseA2.f17385y) != null) {
                    rs.i iVar = new rs.i(responseBody.source());
                    fj.c cVarD = headers.d();
                    cVarD.v("Content-Encoding");
                    cVarD.v("Content-Length");
                    uVarI.c(cVarD.r());
                    uVarI.f7489g = new h(responseA2.f("Content-Type", null), -1L, v.d(iVar));
                }
                return uVarI.a();
            default:
                Intrinsics.checkNotNullParameter(chain, "chain");
                g gVar2 = (g) chain;
                Request request2 = gVar2.f11134e;
                i iVar2 = gVar2.f11130a;
                List listW = n0.f14659d;
                Response response = null;
                int i11 = 0;
                Request request3 = request2;
                while (true) {
                    boolean z7 = true;
                    while (true) {
                        Intrinsics.checkNotNullParameter(request3, "request");
                        if (iVar2.H != null) {
                            throw new IllegalStateException("Check failed.");
                        }
                        synchronized (iVar2) {
                            if (iVar2.J) {
                                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                            }
                            if (iVar2.I) {
                                throw new IllegalStateException("Check failed.");
                            }
                            Unit unit = Unit.f14616a;
                        }
                        if (z7) {
                            m mVar = iVar2.f10215v;
                            HttpUrl httpUrl2 = request3.f17368a;
                            OkHttpClient okHttpClient = iVar2.f10212d;
                            if (httpUrl2.f17328i) {
                                SSLSocketFactory sSLSocketFactory2 = okHttpClient.M;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("CLEARTEXT-only client");
                                }
                                ps.c cVar2 = okHttpClient.Q;
                                jVar = okHttpClient.R;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                jVar = null;
                            }
                            iVar2.E = new gs.e(mVar, new cs.a(httpUrl2.f17323d, httpUrl2.f17324e, okHttpClient.I, okHttpClient.L, sSLSocketFactory, cVar, jVar, okHttpClient.K, okHttpClient.P, okHttpClient.O, okHttpClient.J), iVar2);
                        }
                        try {
                            if (iVar2.L) {
                                throw new IOException("Canceled");
                            }
                            try {
                                responseA = gVar2.a(request3);
                            } catch (n e10) {
                                if (!b(e10.f10244e, iVar2, request3, false)) {
                                    IOException iOException = e10.f10243d;
                                    ds.b.z(iOException, listW);
                                    throw iOException;
                                }
                                listW = CollectionsKt.W(listW, e10.f10243d);
                                iVar2.f(true);
                                z7 = false;
                            } catch (IOException e11) {
                                if (!b(e11, iVar2, request3, !(e11 instanceof js.a))) {
                                    ds.b.z(e11, listW);
                                    throw e11;
                                }
                                listW = CollectionsKt.W(listW, e11);
                                iVar2.f(true);
                                z7 = false;
                            }
                        } catch (Throwable th2) {
                            iVar2.f(true);
                            throw th2;
                        }
                        break;
                        z7 = false;
                    }
                    if (response != null) {
                        u uVarI2 = responseA.i();
                        u uVarI3 = response.i();
                        uVarI3.f7489g = null;
                        Response responseA3 = uVarI3.a();
                        if (responseA3.f17385y != null) {
                            throw new IllegalArgumentException("priorResponse.body != null");
                        }
                        uVarI2.j = responseA3;
                        responseA = uVarI2.a();
                    }
                    response = responseA;
                    k kVar = iVar2.H;
                    request3 = a(response, kVar);
                    if (request3 == null) {
                        if (kVar != null && kVar.f9731d) {
                            if (iVar2.G) {
                                throw new IllegalStateException("Check failed.");
                            }
                            iVar2.G = true;
                            iVar2.f10216w.j();
                        }
                        z6 = false;
                    } else {
                        z6 = false;
                        RequestBody requestBody2 = request3.f17371d;
                        if (requestBody2 == null || !requestBody2.isOneShot()) {
                            ResponseBody responseBody2 = response.f17385y;
                            if (responseBody2 != null) {
                                ds.b.c(responseBody2);
                            }
                            i11++;
                            if (i11 > 20) {
                                throw new ProtocolException(Intrinsics.stringPlus("Too many follow-up requests: ", Integer.valueOf(i11)));
                            }
                            iVar2.f(true);
                        }
                    }
                    iVar2.f(z6);
                    return response;
                }
        }
    }

    public a(OkHttpClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f11124b = client;
    }
}
