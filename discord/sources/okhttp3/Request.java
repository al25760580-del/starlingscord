package okhttp3;

import cs.r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import s0.g;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpUrl f17368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Headers f17370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestBody f17371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f17372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CacheControl f17373f;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HttpUrl f17374a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RequestBody f17377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public LinkedHashMap f17378e = new LinkedHashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17375b = "GET";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public fj.c f17376c = new fj.c(9);

        public final void a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f17376c.c(name, value);
        }

        public final Request b() {
            Map mapUnmodifiableMap;
            HttpUrl httpUrl = this.f17374a;
            if (httpUrl == null) {
                throw new IllegalStateException("url == null");
            }
            String str = this.f17375b;
            Headers headersR = this.f17376c.r();
            RequestBody requestBody = this.f17377d;
            LinkedHashMap linkedHashMap = this.f17378e;
            byte[] bArr = ds.b.f7815a;
            Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
            if (linkedHashMap.isEmpty()) {
                mapUnmodifiableMap = w0.d();
            } else {
                mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(linkedHashMap));
                Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
            }
            return new Request(httpUrl, str, headersR, requestBody, mapUnmodifiableMap);
        }

        public final void c(CacheControl cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            if (string.length() == 0) {
                g("Cache-Control");
            } else {
                d("Cache-Control", string);
            }
        }

        public final void d(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            fj.c cVar = this.f17376c;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            zs.a.m(name);
            zs.a.n(value, name);
            cVar.v(name);
            cVar.m(name, value);
        }

        public final void e(Headers headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            fj.c cVarD = headers.d();
            Intrinsics.checkNotNullParameter(cVarD, "<set-?>");
            this.f17376c = cVarD;
        }

        public final void f(String method, RequestBody requestBody) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (requestBody == null) {
                Intrinsics.checkNotNullParameter(method, "method");
                if (Intrinsics.areEqual(method, "POST") || Intrinsics.areEqual(method, "PUT") || Intrinsics.areEqual(method, "PATCH") || Intrinsics.areEqual(method, "PROPPATCH") || Intrinsics.areEqual(method, "REPORT")) {
                    throw new IllegalArgumentException(g.e("method ", method, " must have a request body.").toString());
                }
            } else if (!q.w(method)) {
                throw new IllegalArgumentException(g.e("method ", method, " must not have a request body.").toString());
            }
            Intrinsics.checkNotNullParameter(method, "<set-?>");
            this.f17375b = method;
            this.f17377d = requestBody;
        }

        public final void g(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f17376c.v(name);
        }

        public final void h(Integer num) {
            Intrinsics.checkNotNullParameter(Object.class, "type");
            if (this.f17378e.isEmpty()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Intrinsics.checkNotNullParameter(linkedHashMap, "<set-?>");
                this.f17378e = linkedHashMap;
            }
            LinkedHashMap linkedHashMap2 = this.f17378e;
            Object objCast = Object.class.cast(num);
            Intrinsics.checkNotNull(objCast);
            linkedHashMap2.put(Object.class, objCast);
        }

        public final void i(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (x.o(url, "ws:", true)) {
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.stringPlus("http:", strSubstring);
            } else if (x.o(url, "wss:", true)) {
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                url = Intrinsics.stringPlus("https:", strSubstring2);
            }
            Intrinsics.checkNotNullParameter(url, "<this>");
            r rVar = new r(0);
            rVar.g(null, url);
            HttpUrl url2 = rVar.b();
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f17374a = url2;
        }
    }

    public Request(HttpUrl url, String method, Headers headers, RequestBody requestBody, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f17368a = url;
        this.f17369b = method;
        this.f17370c = headers;
        this.f17371d = requestBody;
        this.f17372e = tags;
    }

    public final String a(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f17370c.a(name);
    }

    public final Builder b() {
        Intrinsics.checkNotNullParameter(this, "request");
        Builder builder = new Builder();
        builder.f17378e = new LinkedHashMap();
        builder.f17374a = this.f17368a;
        builder.f17375b = this.f17369b;
        builder.f17377d = this.f17371d;
        Map map = this.f17372e;
        builder.f17378e = map.isEmpty() ? new LinkedHashMap() : w0.n(map);
        builder.f17376c = this.f17370c.d();
        return builder;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{method=");
        sb2.append(this.f17369b);
        sb2.append(", url=");
        sb2.append(this.f17368a);
        Headers headers = this.f17370c;
        if (headers.size() != 0) {
            sb2.append(", headers=[");
            int i7 = 0;
            for (Object obj : headers) {
                int i10 = i7 + 1;
                if (i7 < 0) {
                    d0.k();
                    throw null;
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.f14612d;
                String str2 = (String) pair.f14613e;
                if (i7 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i7 = i10;
            }
            sb2.append(']');
        }
        Map map = this.f17372e;
        if (!map.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(map);
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
