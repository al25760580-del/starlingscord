package es;

import com.facebook.react.devsupport.StackTraceHelper;
import cs.o;
import cs.t;
import cs.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.x;
import mo.c0;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Source;
import rs.v;
import xr.m;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cs.g f8728a;

    public b(cs.g gVar) {
        this.f8728a = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:116:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:117:0x02da  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:127:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:130:0x0305  */
    /* JADX WARN: Code duplicated, block: B:132:0x030d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0315  */
    /* JADX WARN: Code duplicated, block: B:137:0x0330  */
    /* JADX WARN: Code duplicated, block: B:142:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x0361  */
    /* JADX WARN: Code duplicated, block: B:144:0x0365 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x0367  */
    /* JADX WARN: Code duplicated, block: B:146:0x036b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x036d  */
    /* JADX WARN: Code duplicated, block: B:149:0x0394  */
    /* JADX WARN: Code duplicated, block: B:271:0x062f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0677  */
    /* JADX WARN: Code duplicated, block: B:292:0x06af  */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        Response cachedResponse;
        Response response;
        long j;
        int i7;
        Date dateA;
        long j5;
        long jLongValue;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        io.sentry.internal.debugmeta.c cacheStrategy;
        Date date;
        long jMax;
        long j7;
        long j10;
        long time;
        String string;
        int i10;
        int i11;
        long millis;
        long millis2;
        String str4;
        String str5;
        long j11;
        u uVarI;
        int i12;
        ResponseBody responseBody;
        r9.a aVar;
        a3.f fVar;
        a3.f fVarG;
        ResponseBody responseBody2;
        Intrinsics.checkNotNullParameter(chain, "chain");
        hs.g gVar = (hs.g) chain;
        gs.i call = gVar.f11130a;
        cs.g gVar2 = this.f8728a;
        if (gVar2 == null) {
            response = null;
        } else {
            Request newRequest = gVar.f11134e;
            Intrinsics.checkNotNullParameter(newRequest, "request");
            try {
                f snapshot = gVar2.f7425d.i(c0.D(newRequest.f17368a));
                if (snapshot == null) {
                    cachedResponse = null;
                } else {
                    try {
                        cs.e eVar = new cs.e((Source) snapshot.f8746i.get(0));
                        Headers cachedRequest = eVar.f7415b;
                        String str6 = eVar.f7416c;
                        HttpUrl url = eVar.f7414a;
                        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
                        Headers headers = eVar.f7420g;
                        String strA = headers.a("Content-Type");
                        String strA2 = headers.a("Content-Length");
                        Request.Builder builder = new Request.Builder();
                        Intrinsics.checkNotNullParameter(url, "url");
                        builder.f17374a = url;
                        builder.f(str6, null);
                        builder.e(cachedRequest);
                        Request request = builder.b();
                        u uVar = new u();
                        Intrinsics.checkNotNullParameter(request, "request");
                        uVar.f7483a = request;
                        t protocol = eVar.f7417d;
                        Intrinsics.checkNotNullParameter(protocol, "protocol");
                        uVar.f7484b = protocol;
                        uVar.f7485c = eVar.f7418e;
                        String message = eVar.f7419f;
                        Intrinsics.checkNotNullParameter(message, "message");
                        uVar.f7486d = message;
                        uVar.c(headers);
                        uVar.f7489g = new cs.d(snapshot, strA, strA2);
                        uVar.f7487e = eVar.f7421h;
                        uVar.k = eVar.f7422i;
                        uVar.f7492l = eVar.j;
                        cachedResponse = uVar.a();
                        Intrinsics.checkNotNullParameter(newRequest, "request");
                        Intrinsics.checkNotNullParameter(cachedResponse, "response");
                        if (Intrinsics.areEqual(url, newRequest.f17368a) && Intrinsics.areEqual(str6, newRequest.f17369b)) {
                            Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
                            Intrinsics.checkNotNullParameter(cachedRequest, "cachedRequest");
                            Intrinsics.checkNotNullParameter(newRequest, "newRequest");
                            Set setR = c0.R(cachedResponse.f17384x);
                            if (!(setR instanceof Collection) || !setR.isEmpty()) {
                                Iterator it = setR.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        String name = (String) it.next();
                                        List listI = cachedRequest.i(name);
                                        Intrinsics.checkNotNullParameter(name, "name");
                                        if (!Intrinsics.areEqual(listI, newRequest.f17370c.i(name))) {
                                        }
                                    }
                                }
                            }
                        }
                        ResponseBody responseBody3 = cachedResponse.f17385y;
                        if (responseBody3 != null) {
                            ds.b.c(responseBody3);
                        }
                    } catch (IOException unused) {
                        ds.b.c(snapshot);
                    }
                    cachedResponse = null;
                }
            } catch (IOException unused2) {
            }
            response = cachedResponse;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Request request2 = gVar.f11134e;
        Intrinsics.checkNotNullParameter(request2, "request");
        if (response != null) {
            j5 = response.H;
            jLongValue = response.I;
            Headers headers2 = response.f17384x;
            int size = headers2.size();
            int i13 = 0;
            dateA = null;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
            int iX = -1;
            while (i13 < size) {
                int i14 = i13 + 1;
                String strB = headers2.b(i13);
                String strH = headers2.h(i13);
                long j12 = jCurrentTimeMillis;
                if (x.i(strB, "Date", true)) {
                    dateA3 = hs.d.a(strH);
                    str3 = strH;
                } else if (x.i(strB, "Expires", true)) {
                    dateA = hs.d.a(strH);
                } else if (x.i(strB, "Last-Modified", true)) {
                    dateA2 = hs.d.a(strH);
                    str2 = strH;
                } else if (x.i(strB, "ETag", true)) {
                    str = strH;
                } else if (x.i(strB, "Age", true)) {
                    iX = ds.b.x(-1, strH);
                }
                i13 = i14;
                jCurrentTimeMillis = j12;
            }
            j = jCurrentTimeMillis;
            i7 = iX;
        } else {
            j = jCurrentTimeMillis;
            i7 = -1;
            dateA = null;
            j5 = 0;
            jLongValue = 0;
            dateA2 = null;
            dateA3 = null;
            str = null;
            str2 = null;
            str3 = null;
        }
        int i15 = 6;
        if (response == null) {
            cacheStrategy = new io.sentry.internal.debugmeta.c(request2, null, i15, false);
        } else {
            boolean z5 = false;
            Object obj = null;
            if (request2.f17368a.f17328i && response.f17383w == null) {
                cacheStrategy = new io.sentry.internal.debugmeta.c(request2, obj, 6, z5);
            } else {
                int i16 = 6;
                if (m.z(response, request2)) {
                    CacheControl cacheControlB = request2.f17373f;
                    if (cacheControlB == null) {
                        int i17 = CacheControl.f17289n;
                        cacheControlB = sa.a.B(request2.f17370c);
                        request2.f17373f = cacheControlB;
                    }
                    if (!cacheControlB.f17290a && request2.a("If-Modified-Since") == null && request2.a("If-None-Match") == null) {
                        CacheControl cacheControlC = response.c();
                        if (dateA3 != null) {
                            date = dateA;
                            jMax = Math.max(0L, jLongValue - dateA3.getTime());
                        } else {
                            date = dateA;
                            jMax = 0;
                        }
                        if (i7 != -1) {
                            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i7));
                        }
                        long j13 = jMax + (jLongValue - j5) + (j - jLongValue);
                        Intrinsics.checkNotNull(response);
                        int i18 = response.c().f17292c;
                        if (i18 != -1) {
                            j7 = j13;
                            time = TimeUnit.SECONDS.toMillis(i18);
                        } else {
                            j7 = j13;
                            if (date != null) {
                                Long lValueOf = dateA3 == null ? null : Long.valueOf(dateA3.getTime());
                                if (lValueOf != null) {
                                    jLongValue = lValueOf.longValue();
                                }
                                time = date.getTime() - jLongValue;
                                if (time <= 0) {
                                    time = 0;
                                }
                            } else if (dateA2 == null) {
                                j10 = 0;
                                time = j10;
                            } else {
                                List list = response.f17379d.f17368a.f17325f;
                                if (list == null) {
                                    string = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    o.g(sb2, list);
                                    string = sb2.toString();
                                }
                                if (string == null) {
                                    Long lValueOf2 = dateA3 == null ? null : Long.valueOf(dateA3.getTime());
                                    long jLongValue2 = lValueOf2 == null ? j5 : lValueOf2.longValue();
                                    Intrinsics.checkNotNull(dateA2);
                                    long time2 = jLongValue2 - dateA2.getTime();
                                    j10 = 0;
                                    if (time2 > 0) {
                                        time = time2 / ((long) 10);
                                    }
                                } else {
                                    j10 = 0;
                                }
                                time = j10;
                            }
                            i10 = cacheControlB.f17292c;
                            if (i10 != -1) {
                                time = Math.min(time, TimeUnit.SECONDS.toMillis(i10));
                            }
                            i11 = cacheControlB.f17298i;
                            if (i11 != -1) {
                                millis = TimeUnit.SECONDS.toMillis(i11);
                            } else {
                                millis = j10;
                            }
                            if (!cacheControlC.f17296g || (i12 = cacheControlB.f17297h) == -1) {
                                millis2 = j10;
                            } else {
                                millis2 = TimeUnit.SECONDS.toMillis(i12);
                            }
                            if (cacheControlC.f17290a) {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                    str5 = str;
                                } else if (dateA2 != null) {
                                    str4 = "If-Modified-Since";
                                    str5 = str2;
                                } else if (dateA3 != null) {
                                    str4 = "If-Modified-Since";
                                    str5 = str3;
                                } else {
                                    cacheStrategy = new io.sentry.internal.debugmeta.c(request2, null, 6, false);
                                }
                                fj.c cVarD = request2.f17370c.d();
                                Intrinsics.checkNotNull(str5);
                                cVarD.m(str4, str5);
                                Request.Builder builderB = request2.b();
                                builderB.e(cVarD.r());
                                cacheStrategy = new io.sentry.internal.debugmeta.c(builderB.b(), response, 6, false);
                            } else {
                                j11 = j7 + millis;
                                if (j11 < time + millis2) {
                                    uVarI = response.i();
                                    if (j11 >= time) {
                                        Intrinsics.checkNotNullParameter("Warning", StackTraceHelper.NAME_KEY);
                                        Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", "value");
                                        uVarI.f7488f.c("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j7 > 86400000) {
                                        Intrinsics.checkNotNull(response);
                                        if (response.c().f17292c == -1 && date == null) {
                                            Intrinsics.checkNotNullParameter("Warning", StackTraceHelper.NAME_KEY);
                                            Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", "value");
                                            uVarI.f7488f.c("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                    }
                                    cacheStrategy = new io.sentry.internal.debugmeta.c(null, uVarI.a(), 6, false);
                                } else {
                                    if (str != null) {
                                        str4 = "If-None-Match";
                                        str5 = str;
                                    } else if (dateA2 != null) {
                                        str4 = "If-Modified-Since";
                                        str5 = str2;
                                    } else if (dateA3 != null) {
                                        str4 = "If-Modified-Since";
                                        str5 = str3;
                                    } else {
                                        cacheStrategy = new io.sentry.internal.debugmeta.c(request2, null, 6, false);
                                    }
                                    fj.c cVarD2 = request2.f17370c.d();
                                    Intrinsics.checkNotNull(str5);
                                    cVarD2.m(str4, str5);
                                    Request.Builder builderB2 = request2.b();
                                    builderB2.e(cVarD2.r());
                                    cacheStrategy = new io.sentry.internal.debugmeta.c(builderB2.b(), response, 6, false);
                                }
                            }
                        }
                        j10 = 0;
                        i10 = cacheControlB.f17292c;
                        if (i10 != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(i10));
                        }
                        i11 = cacheControlB.f17298i;
                        if (i11 != -1) {
                            millis = TimeUnit.SECONDS.toMillis(i11);
                        } else {
                            millis = j10;
                        }
                        if (cacheControlC.f17296g) {
                            millis2 = j10;
                        } else {
                            millis2 = j10;
                        }
                        if (cacheControlC.f17290a) {
                            j11 = j7 + millis;
                            if (j11 < time + millis2) {
                                uVarI = response.i();
                                if (j11 >= time) {
                                    Intrinsics.checkNotNullParameter("Warning", StackTraceHelper.NAME_KEY);
                                    Intrinsics.checkNotNullParameter("110 HttpURLConnection \"Response is stale\"", "value");
                                    uVarI.f7488f.c("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j7 > 86400000) {
                                    Intrinsics.checkNotNull(response);
                                    if (response.c().f17292c == -1) {
                                        Intrinsics.checkNotNullParameter("Warning", StackTraceHelper.NAME_KEY);
                                        Intrinsics.checkNotNullParameter("113 HttpURLConnection \"Heuristic expiration\"", "value");
                                        uVarI.f7488f.c("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                }
                                cacheStrategy = new io.sentry.internal.debugmeta.c(null, uVarI.a(), 6, false);
                            } else {
                                if (str != null) {
                                    str4 = "If-None-Match";
                                    str5 = str;
                                } else if (dateA2 != null) {
                                    str4 = "If-Modified-Since";
                                    str5 = str2;
                                } else if (dateA3 != null) {
                                    str4 = "If-Modified-Since";
                                    str5 = str3;
                                } else {
                                    cacheStrategy = new io.sentry.internal.debugmeta.c(request2, null, 6, false);
                                }
                                fj.c cVarD3 = request2.f17370c.d();
                                Intrinsics.checkNotNull(str5);
                                cVarD3.m(str4, str5);
                                Request.Builder builderB3 = request2.b();
                                builderB3.e(cVarD3.r());
                                cacheStrategy = new io.sentry.internal.debugmeta.c(builderB3.b(), response, 6, false);
                            }
                        } else {
                            if (str != null) {
                                str4 = "If-None-Match";
                                str5 = str;
                            } else if (dateA2 != null) {
                                str4 = "If-Modified-Since";
                                str5 = str2;
                            } else if (dateA3 != null) {
                                str4 = "If-Modified-Since";
                                str5 = str3;
                            } else {
                                cacheStrategy = new io.sentry.internal.debugmeta.c(request2, null, 6, false);
                            }
                            fj.c cVarD4 = request2.f17370c.d();
                            Intrinsics.checkNotNull(str5);
                            cVarD4.m(str4, str5);
                            Request.Builder builderB4 = request2.b();
                            builderB4.e(cVarD4.r());
                            cacheStrategy = new io.sentry.internal.debugmeta.c(builderB4.b(), response, 6, false);
                        }
                    } else {
                        cacheStrategy = new io.sentry.internal.debugmeta.c(request2, null, 6, false);
                    }
                } else {
                    cacheStrategy = new io.sentry.internal.debugmeta.c(request2, obj, i16, z5);
                }
            }
        }
        if (((Request) cacheStrategy.f12759e) != null) {
            CacheControl cacheControlB2 = request2.f17373f;
            if (cacheControlB2 == null) {
                int i19 = CacheControl.f17289n;
                cacheControlB2 = sa.a.B(request2.f17370c);
                request2.f17373f = cacheControlB2;
            }
            if (cacheControlB2.j) {
                Object obj2 = null;
                cacheStrategy = new io.sentry.internal.debugmeta.c(obj2, obj2, 6, false);
            }
        }
        Request request3 = (Request) cacheStrategy.f12759e;
        Response cached = (Response) cacheStrategy.f12760i;
        cs.g gVar3 = this.f8728a;
        if (gVar3 != null) {
            synchronized (gVar3) {
                Intrinsics.checkNotNullParameter(cacheStrategy, "cacheStrategy");
            }
        }
        if (response != null && cached == null && (responseBody2 = response.f17385y) != null) {
            ds.b.c(responseBody2);
        }
        if (request3 == null && cached == null) {
            ArrayList arrayList = new ArrayList(20);
            Request request4 = gVar.f11134e;
            Intrinsics.checkNotNullParameter(request4, "request");
            t protocol2 = t.HTTP_1_1;
            Intrinsics.checkNotNullParameter(protocol2, "protocol");
            Intrinsics.checkNotNullParameter("Unsatisfiable Request (only-if-cached)", "message");
            okhttp3.e eVar2 = ds.b.f7817c;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (request4 == null) {
                throw new IllegalStateException("request == null");
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Response response2 = new Response(request4, protocol2, "Unsatisfiable Request (only-if-cached)", 504, null, new Headers((String[]) array), eVar2, null, null, null, -1L, jCurrentTimeMillis2, null);
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response2, "response");
            return response2;
        }
        if (request3 == null) {
            Intrinsics.checkNotNull(cached);
            u uVarI2 = cached.i();
            Response responseV = i8.b.v(cached);
            u.b("cacheResponse", responseV);
            uVarI2.f7491i = responseV;
            Response response3 = uVarI2.a();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response3, "response");
            return response3;
        }
        if (cached != null) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(cached, "cachedResponse");
        } else if (this.f8728a != null) {
            Intrinsics.checkNotNullParameter(call, "call");
        }
        try {
            Response responseA = ((hs.g) chain).a(request3);
            if (cached != null) {
                if (responseA.f17382v == 304) {
                    u uVarI3 = cached.i();
                    Headers headers3 = cached.f17384x;
                    Headers headers4 = responseA.f17384x;
                    fj.c cVar = new fj.c(9);
                    int size2 = headers3.size();
                    int i20 = 0;
                    while (i20 < size2) {
                        int i21 = i20 + 1;
                        String strB2 = headers3.b(i20);
                        String strH2 = headers3.h(i20);
                        if (!"Warning".equalsIgnoreCase(strB2) || !x.o(strH2, "1", false)) {
                            if ("Content-Length".equalsIgnoreCase(strB2) || "Content-Encoding".equalsIgnoreCase(strB2) || "Content-Type".equalsIgnoreCase(strB2) || !i8.b.w(strB2) || headers4.a(strB2) == null) {
                                cVar.m(strB2, strH2);
                            }
                        }
                        i20 = i21;
                    }
                    int i22 = 0;
                    int size3 = headers4.size();
                    while (i22 < size3) {
                        int i23 = i22 + 1;
                        String strB3 = headers4.b(i22);
                        if (!"Content-Length".equalsIgnoreCase(strB3) && !"Content-Encoding".equalsIgnoreCase(strB3) && !"Content-Type".equalsIgnoreCase(strB3) && i8.b.w(strB3)) {
                            cVar.m(strB3, headers4.h(i22));
                        }
                        i22 = i23;
                    }
                    uVarI3.c(cVar.r());
                    uVarI3.k = responseA.H;
                    uVarI3.f7492l = responseA.I;
                    Response responseV2 = i8.b.v(cached);
                    u.b("cacheResponse", responseV2);
                    uVarI3.f7491i = responseV2;
                    Response responseV3 = i8.b.v(responseA);
                    u.b("networkResponse", responseV3);
                    uVarI3.f7490h = responseV3;
                    Response response4 = uVarI3.a();
                    ResponseBody responseBody4 = responseA.f17385y;
                    Intrinsics.checkNotNull(responseBody4);
                    responseBody4.close();
                    cs.g gVar4 = this.f8728a;
                    Intrinsics.checkNotNull(gVar4);
                    synchronized (gVar4) {
                    }
                    this.f8728a.getClass();
                    Intrinsics.checkNotNullParameter(cached, "cached");
                    Intrinsics.checkNotNullParameter(response4, "network");
                    cs.e eVar3 = new cs.e(response4);
                    ResponseBody responseBody5 = cached.f17385y;
                    if (responseBody5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
                    }
                    f fVar2 = ((cs.d) responseBody5).f7409d;
                    try {
                        fVarG = fVar2.f8747v.g(fVar2.f8745e, fVar2.f8744d);
                        if (fVarG != null) {
                            try {
                                eVar3.c(fVarG);
                                fVarG.d();
                            } catch (IOException unused3) {
                                if (fVarG != null) {
                                    try {
                                        fVarG.a();
                                    } catch (IOException unused4) {
                                    }
                                }
                            }
                        }
                    } catch (IOException unused5) {
                        fVarG = null;
                    }
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response4, "response");
                    return response4;
                }
                ResponseBody responseBody6 = cached.f17385y;
                if (responseBody6 != null) {
                    ds.b.c(responseBody6);
                }
            }
            Intrinsics.checkNotNull(responseA);
            u uVarI4 = responseA.i();
            Response responseV4 = i8.b.v(cached);
            u.b("cacheResponse", responseV4);
            uVarI4.f7491i = responseV4;
            Response responseV5 = i8.b.v(responseA);
            u.b("networkResponse", responseV5);
            uVarI4.f7490h = responseV5;
            Response response5 = uVarI4.a();
            if (this.f8728a != null) {
                if (hs.f.a(response5) && m.z(response5, request3)) {
                    cs.g gVar5 = this.f8728a;
                    gVar5.getClass();
                    Intrinsics.checkNotNullParameter(response5, "response");
                    Request request5 = response5.f17379d;
                    String method = request5.f17369b;
                    Intrinsics.checkNotNullParameter(method, "method");
                    try {
                        if (!Intrinsics.areEqual(method, "POST") && !Intrinsics.areEqual(method, "PATCH") && !Intrinsics.areEqual(method, "PUT") && !Intrinsics.areEqual(method, "DELETE") && !Intrinsics.areEqual(method, "MOVE")) {
                            if (Intrinsics.areEqual(method, "GET")) {
                                Intrinsics.checkNotNullParameter(response5, "<this>");
                                if (c0.R(response5.f17384x).contains("*")) {
                                    aVar = null;
                                } else {
                                    cs.e eVar4 = new cs.e(response5);
                                    try {
                                        h hVar = gVar5.f7425d;
                                        String strD = c0.D(request5.f17368a);
                                        Regex regex = h.P;
                                        a3.f fVarG2 = hVar.g(-1L, strD);
                                        if (fVarG2 == null) {
                                            aVar = null;
                                        } else {
                                            try {
                                                eVar4.c(fVarG2);
                                                aVar = new r9.a(gVar5, fVarG2);
                                            } catch (IOException unused6) {
                                                fVar = fVarG2;
                                                if (fVar != null) {
                                                    fVar.a();
                                                }
                                                aVar = null;
                                            }
                                        }
                                    } catch (IOException unused7) {
                                        fVar = null;
                                    }
                                }
                            } else {
                                aVar = null;
                            }
                            if (aVar != null) {
                                cs.f fVar3 = (cs.f) aVar.f19217d;
                                ResponseBody responseBody7 = response5.f17385y;
                                Intrinsics.checkNotNull(responseBody7);
                                a aVar2 = new a(responseBody7.source(), aVar, v.c(fVar3));
                                String strF = response5.f("Content-Type", null);
                                long jContentLength = response5.f17385y.contentLength();
                                u uVarI5 = response5.i();
                                uVarI5.f7489g = new hs.h(strF, jContentLength, v.d(aVar2));
                                response5 = uVarI5.a();
                            }
                            if (cached != null) {
                                Intrinsics.checkNotNullParameter(call, "call");
                            }
                            return response5;
                        }
                        gVar5.c(request5);
                    } catch (IOException unused8) {
                    }
                    aVar = null;
                    if (aVar != null) {
                        cs.f fVar4 = (cs.f) aVar.f19217d;
                        ResponseBody responseBody8 = response5.f17385y;
                        Intrinsics.checkNotNull(responseBody8);
                        a aVar3 = new a(responseBody8.source(), aVar, v.c(fVar4));
                        String strF2 = response5.f("Content-Type", null);
                        long jContentLength2 = response5.f17385y.contentLength();
                        u uVarI6 = response5.i();
                        uVarI6.f7489g = new hs.h(strF2, jContentLength2, v.d(aVar3));
                        response5 = uVarI6.a();
                    }
                    if (cached != null) {
                        Intrinsics.checkNotNullParameter(call, "call");
                    }
                    return response5;
                }
                String method2 = request3.f17369b;
                Intrinsics.checkNotNullParameter(method2, "method");
                if (Intrinsics.areEqual(method2, "POST") || Intrinsics.areEqual(method2, "PATCH") || Intrinsics.areEqual(method2, "PUT") || Intrinsics.areEqual(method2, "DELETE") || Intrinsics.areEqual(method2, "MOVE")) {
                    try {
                        this.f8728a.c(request3);
                    } catch (IOException unused9) {
                    }
                }
            }
            return response5;
        } catch (Throwable th2) {
            if (response != null && (responseBody = response.f17385y) != null) {
                ds.b.c(responseBody);
            }
            throw th2;
        }
    }
}
