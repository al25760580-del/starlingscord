package hs;

import cs.u;
import gc.k;
import gs.i;
import gs.l;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import rs.o;
import rs.v;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11125a;

    public b(boolean z5) {
        this.f11125a = z5;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01db  */
    /* JADX WARN: Code duplicated, block: B:101:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f0 A[Catch: IOException -> 0x01b3, TryCatch #4 {IOException -> 0x01b3, blocks: (B:88:0x019e, B:92:0x01a6, B:96:0x01c4, B:98:0x01d0, B:102:0x01dd, B:107:0x01f0, B:113:0x0201, B:117:0x021e, B:118:0x0228, B:116:0x0216, B:110:0x01f7, B:95:0x01b6), top: B:134:0x019e }] */
    /* JADX WARN: Code duplicated, block: B:109:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01f7 A[Catch: IOException -> 0x01b3, TryCatch #4 {IOException -> 0x01b3, blocks: (B:88:0x019e, B:92:0x01a6, B:96:0x01c4, B:98:0x01d0, B:102:0x01dd, B:107:0x01f0, B:113:0x0201, B:117:0x021e, B:118:0x0228, B:116:0x0216, B:110:0x01f7, B:95:0x01b6), top: B:134:0x019e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0201 A[Catch: IOException -> 0x01b3, TryCatch #4 {IOException -> 0x01b3, blocks: (B:88:0x019e, B:92:0x01a6, B:96:0x01c4, B:98:0x01d0, B:102:0x01dd, B:107:0x01f0, B:113:0x0201, B:117:0x021e, B:118:0x0228, B:116:0x0216, B:110:0x01f7, B:95:0x01b6), top: B:134:0x019e }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0214  */
    /* JADX WARN: Code duplicated, block: B:116:0x0216 A[Catch: IOException -> 0x01b3, TryCatch #4 {IOException -> 0x01b3, blocks: (B:88:0x019e, B:92:0x01a6, B:96:0x01c4, B:98:0x01d0, B:102:0x01dd, B:107:0x01f0, B:113:0x0201, B:117:0x021e, B:118:0x0228, B:116:0x0216, B:110:0x01f7, B:95:0x01b6), top: B:134:0x019e }] */
    /* JADX WARN: Code duplicated, block: B:121:0x022c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0230  */
    /* JADX WARN: Code duplicated, block: B:124:0x0231  */
    /* JADX WARN: Code duplicated, block: B:126:0x0234  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:70:0x0123 A[Catch: IOException -> 0x0130, TryCatch #8 {IOException -> 0x0130, blocks: (B:68:0x011a, B:70:0x0123, B:74:0x0132, B:82:0x015f, B:84:0x0168, B:85:0x016f, B:86:0x018d), top: B:142:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Code duplicated, block: B:84:0x0168 A[Catch: IOException -> 0x0130, TryCatch #8 {IOException -> 0x0130, blocks: (B:68:0x011a, B:70:0x0123, B:74:0x0132, B:82:0x015f, B:84:0x0168, B:85:0x016f, B:86:0x018d), top: B:142:0x011a }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01b6 A[Catch: IOException -> 0x01b3, TryCatch #4 {IOException -> 0x01b3, blocks: (B:88:0x019e, B:92:0x01a6, B:96:0x01c4, B:98:0x01d0, B:102:0x01dd, B:107:0x01f0, B:113:0x0201, B:117:0x021e, B:118:0x0228, B:116:0x0216, B:110:0x01f7, B:95:0x01b6), top: B:134:0x019e }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01d0 A[Catch: IOException -> 0x01b3, TryCatch #4 {IOException -> 0x01b3, blocks: (B:88:0x019e, B:92:0x01a6, B:96:0x01c4, B:98:0x01d0, B:102:0x01dd, B:107:0x01f0, B:113:0x0201, B:117:0x021e, B:118:0x0228, B:116:0x0216, B:110:0x01f7, B:95:0x01b6), top: B:134:0x019e }] */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        u uVarH;
        IOException iOException;
        Response response;
        int i7;
        Response responseA;
        Long l6;
        ResponseBody responseBody;
        long jContentLength;
        ResponseBody responseBody2;
        Long lValueOf;
        e eVar;
        boolean z5;
        u uVar;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        k kVar = gVar.f11133d;
        Intrinsics.checkNotNull(kVar);
        Request request = gVar.f11134e;
        RequestBody requestBody = request.f17371d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z6 = true;
        try {
            i call = (i) kVar.f9733i;
            i call2 = (i) kVar.f9733i;
            e eVar2 = (e) kVar.f9735w;
            Intrinsics.checkNotNullParameter(request, "request");
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                eVar2.b(request);
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(request, "request");
                if (!q.w(request.f17369b) || requestBody == null) {
                    eVar = eVar2;
                    call2.h(kVar, true, false, null);
                    uVarH = null;
                } else {
                    if ("100-continue".equalsIgnoreCase(request.a("Expect"))) {
                        try {
                            eVar2.f();
                            uVarH = kVar.h(true);
                            try {
                                Intrinsics.checkNotNullParameter(call2, "call");
                                z5 = false;
                            } catch (IOException e10) {
                                e = e10;
                                if (!(e instanceof js.a)) {
                                    throw e;
                                }
                                if (kVar.f9732e) {
                                    throw e;
                                }
                                iOException = e;
                            }
                        } catch (IOException ioe) {
                            i call3 = (i) kVar.f9733i;
                            Intrinsics.checkNotNullParameter(call3, "call");
                            Intrinsics.checkNotNullParameter(ioe, "ioe");
                            kVar.i(ioe);
                            throw ioe;
                        }
                    } else {
                        z5 = true;
                        uVarH = null;
                    }
                    if (uVarH == null) {
                        try {
                            if (requestBody.isDuplex()) {
                                try {
                                    eVar2.f();
                                    requestBody.writeTo(v.c(kVar.e(request, true)));
                                } catch (IOException ioe2) {
                                    i call4 = (i) kVar.f9733i;
                                    Intrinsics.checkNotNullParameter(call4, "call");
                                    Intrinsics.checkNotNullParameter(ioe2, "ioe");
                                    kVar.i(ioe2);
                                    throw ioe2;
                                }
                            } else {
                                o oVarC = v.c(kVar.e(request, false));
                                requestBody.writeTo(oVarC);
                                oVarC.close();
                            }
                            uVar = uVarH;
                            eVar = eVar2;
                        } catch (IOException e11) {
                            e = e11;
                            z6 = z5;
                            if (!(e instanceof js.a)) {
                                throw e;
                            }
                            if (kVar.f9732e) {
                                throw e;
                            }
                            iOException = e;
                        }
                    } else {
                        uVar = uVarH;
                        eVar = eVar2;
                        try {
                            call2.h(kVar, true, false, null);
                            if (((l) kVar.f9736x).f10230g == null) {
                                z6 = false;
                            }
                            if (!z6) {
                                eVar.e().k();
                            }
                        } catch (IOException e12) {
                            e = e12;
                            z6 = z5;
                            uVarH = uVar;
                            if (!(e instanceof js.a)) {
                                throw e;
                            }
                            if (kVar.f9732e) {
                                throw e;
                            }
                            iOException = e;
                        }
                    }
                    z6 = z5;
                    uVarH = uVar;
                }
                if (requestBody == null || !requestBody.isDuplex()) {
                    try {
                        eVar.a();
                    } catch (IOException ioe3) {
                        i call5 = (i) kVar.f9733i;
                        Intrinsics.checkNotNullParameter(call5, "call");
                        Intrinsics.checkNotNullParameter(ioe3, "ioe");
                        kVar.i(ioe3);
                        throw ioe3;
                    }
                }
                iOException = null;
                if (uVarH == null) {
                    try {
                        uVarH = kVar.h(false);
                        Intrinsics.checkNotNull(uVarH);
                        if (z6) {
                            i call6 = (i) kVar.f9733i;
                            Intrinsics.checkNotNullParameter(call6, "call");
                            z6 = false;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        if (iOException != null) {
                            throw e;
                        }
                        rn.f.a(iOException, e);
                        throw iOException;
                    }
                }
                uVarH.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                uVarH.f7483a = request;
                uVarH.f7487e = ((l) kVar.f9736x).f10228e;
                uVarH.k = jCurrentTimeMillis;
                uVarH.f7492l = System.currentTimeMillis();
                response = uVarH.a();
                i7 = response.f17382v;
                if (i7 != 100 || (102 <= i7 && i7 < 200)) {
                    u uVarH2 = kVar.h(false);
                    Intrinsics.checkNotNull(uVarH2);
                    if (z6) {
                        i call7 = (i) kVar.f9733i;
                        Intrinsics.checkNotNullParameter(call7, "call");
                    }
                    uVarH2.getClass();
                    Intrinsics.checkNotNullParameter(request, "request");
                    uVarH2.f7483a = request;
                    uVarH2.f7487e = ((l) kVar.f9736x).f10228e;
                    uVarH2.k = jCurrentTimeMillis;
                    uVarH2.f7492l = System.currentTimeMillis();
                    response = uVarH2.a();
                    i7 = response.f17382v;
                }
                Intrinsics.checkNotNullParameter(response, "response");
                i call8 = (i) kVar.f9733i;
                Intrinsics.checkNotNullParameter(call8, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    if (this.f11125a || i7 != 101) {
                        u uVarI = response.i();
                        uVarI.f7489g = kVar.g(response);
                        responseA = uVarI.a();
                    } else {
                        u uVarI2 = response.i();
                        uVarI2.f7489g = ds.b.f7817c;
                        responseA = uVarI2.a();
                    }
                    if (!"close".equalsIgnoreCase(responseA.f17379d.a("Connection"))) {
                        l6 = null;
                        if ("close".equalsIgnoreCase(responseA.f("Connection", null))) {
                        }
                        if (i7 != 204 || i7 == 205) {
                            responseBody = responseA.f17385y;
                            if (responseBody == null) {
                                jContentLength = -1;
                            } else {
                                jContentLength = responseBody.contentLength();
                            }
                            if (jContentLength > 0) {
                                StringBuilder sb2 = new StringBuilder("HTTP ");
                                sb2.append(i7);
                                sb2.append(" had non-zero Content-Length: ");
                                responseBody2 = responseA.f17385y;
                                if (responseBody2 == null) {
                                    lValueOf = l6;
                                } else {
                                    lValueOf = Long.valueOf(responseBody2.contentLength());
                                }
                                sb2.append(lValueOf);
                                throw new ProtocolException(sb2.toString());
                            }
                        }
                        return responseA;
                    }
                    l6 = null;
                    ((e) kVar.f9735w).e().k();
                    if (i7 != 204) {
                        responseBody = responseA.f17385y;
                        if (responseBody == null) {
                            jContentLength = -1;
                        } else {
                            jContentLength = responseBody.contentLength();
                        }
                        if (jContentLength > 0) {
                            StringBuilder sb3 = new StringBuilder("HTTP ");
                            sb3.append(i7);
                            sb3.append(" had non-zero Content-Length: ");
                            responseBody2 = responseA.f17385y;
                            if (responseBody2 == null) {
                                lValueOf = l6;
                            } else {
                                lValueOf = Long.valueOf(responseBody2.contentLength());
                            }
                            sb3.append(lValueOf);
                            throw new ProtocolException(sb3.toString());
                        }
                    } else {
                        responseBody = responseA.f17385y;
                        if (responseBody == null) {
                            jContentLength = -1;
                        } else {
                            jContentLength = responseBody.contentLength();
                        }
                        if (jContentLength > 0) {
                            StringBuilder sb4 = new StringBuilder("HTTP ");
                            sb4.append(i7);
                            sb4.append(" had non-zero Content-Length: ");
                            responseBody2 = responseA.f17385y;
                            if (responseBody2 == null) {
                                lValueOf = l6;
                            } else {
                                lValueOf = Long.valueOf(responseBody2.contentLength());
                            }
                            sb4.append(lValueOf);
                            throw new ProtocolException(sb4.toString());
                        }
                    }
                    return responseA;
                } catch (IOException e14) {
                    e = e14;
                    if (iOException != null) {
                        throw e;
                    }
                    rn.f.a(iOException, e);
                    throw iOException;
                }
            } catch (IOException ioe4) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe4, "ioe");
                kVar.i(ioe4);
                throw ioe4;
            }
        } catch (IOException e15) {
            e = e15;
            uVarH = null;
            if (!(e instanceof js.a)) {
                throw e;
            }
            if (kVar.f9732e) {
                throw e;
            }
            iOException = e;
            if (uVarH == null) {
                uVarH = kVar.h(false);
                Intrinsics.checkNotNull(uVarH);
                if (z6) {
                    i call9 = (i) kVar.f9733i;
                    Intrinsics.checkNotNullParameter(call9, "call");
                    z6 = false;
                }
            }
            uVarH.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            uVarH.f7483a = request;
            uVarH.f7487e = ((l) kVar.f9736x).f10228e;
            uVarH.k = jCurrentTimeMillis;
            uVarH.f7492l = System.currentTimeMillis();
            response = uVarH.a();
            i7 = response.f17382v;
            if (i7 != 100) {
                u uVarH3 = kVar.h(false);
                Intrinsics.checkNotNull(uVarH3);
                if (z6) {
                    i call10 = (i) kVar.f9733i;
                    Intrinsics.checkNotNullParameter(call10, "call");
                }
                uVarH3.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                uVarH3.f7483a = request;
                uVarH3.f7487e = ((l) kVar.f9736x).f10228e;
                uVarH3.k = jCurrentTimeMillis;
                uVarH3.f7492l = System.currentTimeMillis();
                response = uVarH3.a();
                i7 = response.f17382v;
            } else {
                u uVarH4 = kVar.h(false);
                Intrinsics.checkNotNull(uVarH4);
                if (z6) {
                    i call11 = (i) kVar.f9733i;
                    Intrinsics.checkNotNullParameter(call11, "call");
                }
                uVarH4.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                uVarH4.f7483a = request;
                uVarH4.f7487e = ((l) kVar.f9736x).f10228e;
                uVarH4.k = jCurrentTimeMillis;
                uVarH4.f7492l = System.currentTimeMillis();
                response = uVarH4.a();
                i7 = response.f17382v;
            }
            Intrinsics.checkNotNullParameter(response, "response");
            i call12 = (i) kVar.f9733i;
            Intrinsics.checkNotNullParameter(call12, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (this.f11125a) {
                u uVarI3 = response.i();
                uVarI3.f7489g = kVar.g(response);
                responseA = uVarI3.a();
            } else {
                u uVarI4 = response.i();
                uVarI4.f7489g = kVar.g(response);
                responseA = uVarI4.a();
            }
            if (!"close".equalsIgnoreCase(responseA.f17379d.a("Connection"))) {
                l6 = null;
                if ("close".equalsIgnoreCase(responseA.f("Connection", null))) {
                }
                if (i7 != 204) {
                    responseBody = responseA.f17385y;
                    if (responseBody == null) {
                        jContentLength = -1;
                    } else {
                        jContentLength = responseBody.contentLength();
                    }
                    if (jContentLength > 0) {
                        StringBuilder sb5 = new StringBuilder("HTTP ");
                        sb5.append(i7);
                        sb5.append(" had non-zero Content-Length: ");
                        responseBody2 = responseA.f17385y;
                        if (responseBody2 == null) {
                            lValueOf = l6;
                        } else {
                            lValueOf = Long.valueOf(responseBody2.contentLength());
                        }
                        sb5.append(lValueOf);
                        throw new ProtocolException(sb5.toString());
                    }
                } else {
                    responseBody = responseA.f17385y;
                    if (responseBody == null) {
                        jContentLength = -1;
                    } else {
                        jContentLength = responseBody.contentLength();
                    }
                    if (jContentLength > 0) {
                        StringBuilder sb6 = new StringBuilder("HTTP ");
                        sb6.append(i7);
                        sb6.append(" had non-zero Content-Length: ");
                        responseBody2 = responseA.f17385y;
                        if (responseBody2 == null) {
                            lValueOf = l6;
                        } else {
                            lValueOf = Long.valueOf(responseBody2.contentLength());
                        }
                        sb6.append(lValueOf);
                        throw new ProtocolException(sb6.toString());
                    }
                }
                return responseA;
            }
            l6 = null;
            ((e) kVar.f9735w).e().k();
            if (i7 != 204) {
                responseBody = responseA.f17385y;
                if (responseBody == null) {
                    jContentLength = -1;
                } else {
                    jContentLength = responseBody.contentLength();
                }
                if (jContentLength > 0) {
                    StringBuilder sb7 = new StringBuilder("HTTP ");
                    sb7.append(i7);
                    sb7.append(" had non-zero Content-Length: ");
                    responseBody2 = responseA.f17385y;
                    if (responseBody2 == null) {
                        lValueOf = l6;
                    } else {
                        lValueOf = Long.valueOf(responseBody2.contentLength());
                    }
                    sb7.append(lValueOf);
                    throw new ProtocolException(sb7.toString());
                }
            } else {
                responseBody = responseA.f17385y;
                if (responseBody == null) {
                    jContentLength = -1;
                } else {
                    jContentLength = responseBody.contentLength();
                }
                if (jContentLength > 0) {
                    StringBuilder sb8 = new StringBuilder("HTTP ");
                    sb8.append(i7);
                    sb8.append(" had non-zero Content-Length: ");
                    responseBody2 = responseA.f17385y;
                    if (responseBody2 == null) {
                        lValueOf = l6;
                    } else {
                        lValueOf = Long.valueOf(responseBody2.contentLength());
                    }
                    sb8.append(lValueOf);
                    throw new ProtocolException(sb8.toString());
                }
            }
            return responseA;
        }
    }
}
