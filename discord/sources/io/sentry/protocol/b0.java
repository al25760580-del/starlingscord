package io.sentry.protocol;

import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.n1;
import io.sentry.x1;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12922a;

    public /* synthetic */ b0(int i7) {
        this.f12922a = i7;
    }

    public static io.sentry.rrweb.a b(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        HashMap map = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            if (strA0.equals("data")) {
                x1Var.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    if (strA1.equals("payload")) {
                        x1Var.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strA2 = x1Var.a0();
                            strA2.getClass();
                            switch (strA2) {
                                case "data":
                                    ConcurrentHashMap concurrentHashMapF = xr.m.F((Map) x1Var.c0());
                                    if (concurrentHashMapF == null) {
                                        break;
                                    } else {
                                        aVar.F = concurrentHashMapF;
                                        break;
                                    }
                                    break;
                                case "type":
                                    aVar.f13107w = x1Var.l0();
                                    break;
                                case "category":
                                    aVar.f13108x = x1Var.l0();
                                    break;
                                case "timestamp":
                                    aVar.f13106v = x1Var.u();
                                    break;
                                case "level":
                                    try {
                                        aVar.E = SentryLevel.valueOf(x1Var.j0().toUpperCase(Locale.ROOT));
                                        break;
                                    } catch (Exception e10) {
                                        iLogger.e(SentryLevel.DEBUG, e10, "Error when deserializing SentryLevel", new Object[0]);
                                        break;
                                    }
                                    break;
                                case "message":
                                    aVar.f13109y = x1Var.l0();
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    x1Var.m0(iLogger, concurrentHashMap2, strA2);
                                    break;
                            }
                        }
                        aVar.H = concurrentHashMap2;
                        x1Var.i();
                    } else if (strA1.equals("tag")) {
                        String strL0 = x1Var.l0();
                        if (strL0 == null) {
                            strL0 = "";
                        }
                        aVar.f13105i = strL0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x1Var.m0(iLogger, concurrentHashMap, strA1);
                    }
                }
                aVar.I = concurrentHashMap;
                x1Var.i();
            } else if (strA0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) x1Var.e0(iLogger, new b0(10));
                com.facebook.imagepipeline.nativecode.c.H(cVar, "");
                aVar.f13110d = cVar;
            } else if (strA0.equals("timestamp")) {
                aVar.f13111e = x1Var.T();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                x1Var.m0(iLogger, map, strA0);
            }
        }
        aVar.G = map;
        x1Var.i();
        return aVar;
    }

    public static io.sentry.rrweb.g c(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
        HashMap map = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            if (strA0.equals("data")) {
                x1Var.f();
                HashMap map2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    switch (strA1) {
                        case "x":
                            gVar.f13115x = x1Var.z();
                            break;
                        case "y":
                            gVar.f13116y = x1Var.z();
                            break;
                        case "id":
                            gVar.f13114w = x1Var.O();
                            break;
                        case "type":
                            gVar.f13113v = (io.sentry.rrweb.f) x1Var.e0(iLogger, new b0(13));
                            break;
                        case "pointerType":
                            gVar.E = x1Var.O();
                            break;
                        case "pointerId":
                            gVar.F = x1Var.O();
                            break;
                        default:
                            if (!strA1.equals("source")) {
                                if (map2 == null) {
                                    map2 = new HashMap();
                                }
                                x1Var.m0(iLogger, map2, strA1);
                                break;
                            } else {
                                io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) x1Var.e0(iLogger, new b0(11));
                                com.facebook.imagepipeline.nativecode.c.H(dVar, "");
                                gVar.f13112i = dVar;
                                break;
                            }
                            break;
                    }
                }
                gVar.H = map2;
                x1Var.i();
            } else if (strA0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) x1Var.e0(iLogger, new b0(10));
                com.facebook.imagepipeline.nativecode.c.H(cVar, "");
                gVar.f13110d = cVar;
            } else if (strA0.equals("timestamp")) {
                gVar.f13111e = x1Var.T();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                x1Var.m0(iLogger, map, strA0);
            }
        }
        gVar.G = map;
        x1Var.i();
        return gVar;
    }

    public static io.sentry.rrweb.i d(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        HashMap map = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            if (strA0.equals("data")) {
                x1Var.f();
                HashMap map2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    if (strA1.equals("pointerId")) {
                        iVar.f13122v = x1Var.O();
                    } else if (strA1.equals("positions")) {
                        iVar.f13123w = x1Var.Q(iLogger, new b0(15));
                    } else if (strA1.equals("source")) {
                        io.sentry.rrweb.d dVar = (io.sentry.rrweb.d) x1Var.e0(iLogger, new b0(11));
                        com.facebook.imagepipeline.nativecode.c.H(dVar, "");
                        iVar.f13112i = dVar;
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        x1Var.m0(iLogger, map2, strA1);
                    }
                }
                iVar.f13125y = map2;
                x1Var.i();
            } else if (strA0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) x1Var.e0(iLogger, new b0(10));
                com.facebook.imagepipeline.nativecode.c.H(cVar, "");
                iVar.f13110d = cVar;
            } else if (strA0.equals("timestamp")) {
                iVar.f13111e = x1Var.T();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                x1Var.m0(iLogger, map, strA0);
            }
        }
        iVar.f13124x = map;
        x1Var.i();
        return iVar;
    }

    public static io.sentry.rrweb.j e(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
        HashMap map = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            if (strA0.equals("data")) {
                x1Var.f();
                AbstractMap concurrentHashMap = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    switch (strA1) {
                        case "height":
                            Integer numP = x1Var.P();
                            jVar.f13127v = numP != null ? numP.intValue() : 0;
                            break;
                        case "href":
                            String strL0 = x1Var.l0();
                            if (strL0 == null) {
                                strL0 = "";
                            }
                            jVar.f13126i = strL0;
                            break;
                        case "width":
                            Integer numP2 = x1Var.P();
                            jVar.f13128w = numP2 != null ? numP2.intValue() : 0;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap, strA1);
                            break;
                    }
                }
                x1Var.i();
            } else if (strA0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) x1Var.e0(iLogger, new b0(10));
                com.facebook.imagepipeline.nativecode.c.H(cVar, "");
                jVar.f13110d = cVar;
            } else if (strA0.equals("timestamp")) {
                jVar.f13111e = x1Var.T();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                x1Var.m0(iLogger, map, strA0);
            }
        }
        jVar.f13129x = map;
        x1Var.i();
        return jVar;
    }

    public static io.sentry.rrweb.l f(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.rrweb.l lVar = new io.sentry.rrweb.l();
        HashMap map = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            if (strA0.equals("data")) {
                x1Var.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    if (strA1.equals("payload")) {
                        x1Var.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strA2 = x1Var.a0();
                            strA2.getClass();
                            switch (strA2) {
                                case "description":
                                    lVar.f13134w = x1Var.l0();
                                    break;
                                case "endTimestamp":
                                    lVar.f13136y = x1Var.u();
                                    break;
                                case "startTimestamp":
                                    lVar.f13135x = x1Var.u();
                                    break;
                                case "op":
                                    lVar.f13133v = x1Var.l0();
                                    break;
                                case "data":
                                    ConcurrentHashMap concurrentHashMapF = xr.m.F((Map) x1Var.c0());
                                    if (concurrentHashMapF == null) {
                                        break;
                                    } else {
                                        lVar.E = concurrentHashMapF;
                                        break;
                                    }
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    x1Var.m0(iLogger, concurrentHashMap2, strA2);
                                    break;
                            }
                        }
                        lVar.G = concurrentHashMap2;
                        x1Var.i();
                    } else if (strA1.equals("tag")) {
                        String strL0 = x1Var.l0();
                        if (strL0 == null) {
                            strL0 = "";
                        }
                        lVar.f13132i = strL0;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x1Var.m0(iLogger, concurrentHashMap, strA1);
                    }
                }
                lVar.H = concurrentHashMap;
                x1Var.i();
            } else if (strA0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) x1Var.e0(iLogger, new b0(10));
                com.facebook.imagepipeline.nativecode.c.H(cVar, "");
                lVar.f13110d = cVar;
            } else if (strA0.equals("timestamp")) {
                lVar.f13111e = x1Var.T();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                x1Var.m0(iLogger, map, strA0);
            }
        }
        lVar.F = map;
        x1Var.i();
        return lVar;
    }

    public static io.sentry.rrweb.m g(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.rrweb.m mVar = new io.sentry.rrweb.m();
        HashMap map = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            int i7 = 10;
            if (strA0.equals("data")) {
                x1Var.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    if (strA1.equals("payload")) {
                        x1Var.f();
                        ConcurrentHashMap concurrentHashMap2 = null;
                        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                            String strA2 = x1Var.a0();
                            strA2.getClass();
                            switch (strA2) {
                                case "duration":
                                    mVar.f13140x = x1Var.T();
                                    break;
                                case "segmentId":
                                    mVar.f13138v = x1Var.O();
                                    break;
                                case "height":
                                    Integer numP = x1Var.P();
                                    mVar.F = numP != null ? numP.intValue() : 0;
                                    break;
                                case "container":
                                    String strL0 = x1Var.l0();
                                    if (strL0 == null) {
                                        strL0 = "";
                                    }
                                    mVar.E = strL0;
                                    break;
                                case "frameCount":
                                    Integer numP2 = x1Var.P();
                                    mVar.H = numP2 != null ? numP2.intValue() : 0;
                                    break;
                                case "top":
                                    Integer numP3 = x1Var.P();
                                    mVar.L = numP3 != null ? numP3.intValue() : 0;
                                    break;
                                case "left":
                                    Integer numP4 = x1Var.P();
                                    mVar.K = numP4 != null ? numP4.intValue() : 0;
                                    break;
                                case "size":
                                    Long lU = x1Var.U();
                                    mVar.f13139w = lU == null ? 0L : lU.longValue();
                                    break;
                                case "width":
                                    Integer numP5 = x1Var.P();
                                    mVar.G = numP5 != null ? numP5.intValue() : 0;
                                    break;
                                case "frameRate":
                                    Integer numP6 = x1Var.P();
                                    mVar.J = numP6 != null ? numP6.intValue() : 0;
                                    break;
                                case "encoding":
                                    String strL1 = x1Var.l0();
                                    if (strL1 == null) {
                                        strL1 = "";
                                    }
                                    mVar.f13141y = strL1;
                                    break;
                                case "frameRateType":
                                    String strL2 = x1Var.l0();
                                    if (strL2 == null) {
                                        strL2 = "";
                                    }
                                    mVar.I = strL2;
                                    break;
                                default:
                                    if (concurrentHashMap2 == null) {
                                        concurrentHashMap2 = new ConcurrentHashMap();
                                    }
                                    x1Var.m0(iLogger, concurrentHashMap2, strA2);
                                    break;
                            }
                        }
                        mVar.N = concurrentHashMap2;
                        x1Var.i();
                    } else if (strA1.equals("tag")) {
                        String strL3 = x1Var.l0();
                        if (strL3 == null) {
                            strL3 = "";
                        }
                        mVar.f13137i = strL3;
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x1Var.m0(iLogger, concurrentHashMap, strA1);
                    }
                }
                mVar.O = concurrentHashMap;
                x1Var.i();
            } else if (strA0.equals("type")) {
                io.sentry.rrweb.c cVar = (io.sentry.rrweb.c) x1Var.e0(iLogger, new b0(i7));
                com.facebook.imagepipeline.nativecode.c.H(cVar, "");
                mVar.f13110d = cVar;
            } else if (strA0.equals("timestamp")) {
                mVar.f13111e = x1Var.T();
            } else {
                if (map == null) {
                    map = new HashMap();
                }
                x1Var.m0(iLogger, map, strA0);
            }
        }
        mVar.M = map;
        x1Var.i();
        return mVar;
    }

    @Override // io.sentry.n1
    public final Object a(x1 x1Var, ILogger iLogger) throws IOException {
        int i7 = 7;
        int i10 = 8;
        int i11 = 4;
        int i12 = 6;
        switch (this.f12922a) {
            case 0:
                c0 c0Var = new c0();
                x1Var.f();
                ConcurrentHashMap concurrentHashMap = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA0 = x1Var.a0();
                    strA0.getClass();
                    switch (strA0) {
                        case "daemon":
                            c0Var.f12931y = x1Var.n();
                            break;
                        case "priority":
                            c0Var.f12926e = x1Var.P();
                            break;
                        case "held_locks":
                            HashMap mapY = x1Var.Y(iLogger, new io.sentry.d(12));
                            if (mapY != null) {
                                c0Var.G = new HashMap(mapY);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "id":
                            c0Var.f12925d = x1Var.U();
                            break;
                        case "main":
                            c0Var.E = x1Var.n();
                            break;
                        case "name":
                            c0Var.f12927i = x1Var.l0();
                            break;
                        case "state":
                            c0Var.f12928v = x1Var.l0();
                            break;
                        case "crashed":
                            c0Var.f12929w = x1Var.n();
                            break;
                        case "current":
                            c0Var.f12930x = x1Var.n();
                            break;
                        case "stacktrace":
                            c0Var.F = (a0) x1Var.e0(iLogger, new io.sentry.clientreport.a(28));
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap, strA0);
                            break;
                    }
                }
                c0Var.H = concurrentHashMap;
                x1Var.i();
                return c0Var;
            case 1:
                x1Var.f();
                d0 d0Var = new d0(new ArrayList(), new HashMap(), new f0(g0.CUSTOM.apiName()));
                ConcurrentHashMap concurrentHashMap2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    switch (strA1) {
                        case "start_timestamp":
                            try {
                                Double dY = x1Var.y();
                                if (dY != null) {
                                    d0Var.N = dY;
                                }
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateQ = x1Var.q(iLogger);
                                if (dateQ != null) {
                                    d0Var.N = Double.valueOf(dateQ.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "measurements":
                            HashMap mapY2 = x1Var.Y(iLogger, new io.sentry.clientreport.a(15));
                            if (mapY2 != null) {
                                d0Var.Q.putAll(mapY2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "type":
                            x1Var.j0();
                            break;
                        case "timestamp":
                            try {
                                Double dY2 = x1Var.y();
                                if (dY2 != null) {
                                    d0Var.O = dY2;
                                }
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateQ2 = x1Var.q(iLogger);
                                if (dateQ2 != null) {
                                    d0Var.O = Double.valueOf(dateQ2.getTime() / 1000.0d);
                                }
                                break;
                            }
                            break;
                        case "spans":
                            ArrayList arrayListQ = x1Var.Q(iLogger, new io.sentry.clientreport.a(26));
                            if (arrayListQ != null) {
                                d0Var.P.addAll(arrayListQ);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "transaction_info":
                            x1Var.f();
                            String strL0 = null;
                            ConcurrentHashMap concurrentHashMap3 = null;
                            while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strA2 = x1Var.a0();
                                strA2.getClass();
                                if (strA2.equals("source")) {
                                    strL0 = x1Var.l0();
                                } else {
                                    if (concurrentHashMap3 == null) {
                                        concurrentHashMap3 = new ConcurrentHashMap();
                                    }
                                    x1Var.m0(iLogger, concurrentHashMap3, strA2);
                                }
                            }
                            f0 f0Var = new f0(strL0);
                            f0Var.f12950e = concurrentHashMap3;
                            x1Var.i();
                            d0Var.R = f0Var;
                            break;
                        case "transaction":
                            d0Var.M = x1Var.l0();
                            break;
                        default:
                            if (m3.m.u(d0Var, strA1, x1Var, iLogger)) {
                                break;
                            } else {
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                x1Var.m0(iLogger, concurrentHashMap2, strA1);
                                break;
                            }
                            break;
                    }
                }
                d0Var.S = concurrentHashMap2;
                x1Var.i();
                return d0Var;
            case 2:
                x1Var.f();
                h0 h0Var = new h0();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA3 = x1Var.a0();
                    strA3.getClass();
                    switch (strA3) {
                        case "username":
                            h0Var.f12958i = x1Var.l0();
                            break;
                        case "id":
                            h0Var.f12957e = x1Var.l0();
                            break;
                        case "geo":
                            x1Var.f();
                            j jVar = new j();
                            ConcurrentHashMap concurrentHashMap5 = null;
                            while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strA4 = x1Var.a0();
                                strA4.getClass();
                                switch (strA4) {
                                    case "region":
                                        jVar.f12975i = x1Var.l0();
                                        break;
                                    case "city":
                                        jVar.f12973d = x1Var.l0();
                                        break;
                                    case "country_code":
                                        jVar.f12974e = x1Var.l0();
                                        break;
                                    default:
                                        if (concurrentHashMap5 == null) {
                                            concurrentHashMap5 = new ConcurrentHashMap();
                                        }
                                        x1Var.m0(iLogger, concurrentHashMap5, strA4);
                                        break;
                                }
                            }
                            jVar.f12976v = concurrentHashMap5;
                            x1Var.i();
                            h0Var.f12961x = jVar;
                            break;
                        case "data":
                            h0Var.f12962y = xr.m.F((Map) x1Var.c0());
                            break;
                        case "name":
                            h0Var.f12960w = x1Var.l0();
                            break;
                        case "email":
                            h0Var.f12956d = x1Var.l0();
                            break;
                        case "ip_address":
                            h0Var.f12959v = x1Var.l0();
                            break;
                        default:
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap4, strA3);
                            break;
                    }
                }
                h0Var.E = concurrentHashMap4;
                x1Var.i();
                return h0Var;
            case 3:
                x1Var.f();
                String strL1 = null;
                ArrayList arrayListQ2 = null;
                HashMap map = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA5 = x1Var.a0();
                    strA5.getClass();
                    if (strA5.equals("rendering_system")) {
                        strL1 = x1Var.l0();
                    } else if (strA5.equals("windows")) {
                        arrayListQ2 = x1Var.Q(iLogger, new b0(i11));
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        x1Var.m0(iLogger, map, strA5);
                    }
                }
                x1Var.i();
                i0 i0Var = new i0(strL1, arrayListQ2);
                i0Var.f12972i = map;
                return i0Var;
            case 4:
                j0 j0Var = new j0();
                x1Var.f();
                HashMap map2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA6 = x1Var.a0();
                    strA6.getClass();
                    switch (strA6) {
                        case "rendering_system":
                            j0Var.f12977d = x1Var.l0();
                            break;
                        case "identifier":
                            j0Var.f12979i = x1Var.l0();
                            break;
                        case "height":
                            j0Var.f12982x = x1Var.y();
                            break;
                        case "x":
                            j0Var.f12983y = x1Var.y();
                            break;
                        case "y":
                            j0Var.E = x1Var.y();
                            break;
                        case "tag":
                            j0Var.f12980v = x1Var.l0();
                            break;
                        case "type":
                            j0Var.f12978e = x1Var.l0();
                            break;
                        case "alpha":
                            j0Var.G = x1Var.y();
                            break;
                        case "width":
                            j0Var.f12981w = x1Var.y();
                            break;
                        case "children":
                            j0Var.H = x1Var.Q(iLogger, this);
                            break;
                        case "visibility":
                            j0Var.F = x1Var.l0();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            x1Var.m0(iLogger, map2, strA6);
                            break;
                    }
                }
                x1Var.i();
                j0Var.I = map2;
                return j0Var;
            case 5:
                x1Var.f();
                io.sentry.protocol.profiling.a aVar = new io.sentry.protocol.profiling.a();
                ConcurrentHashMap concurrentHashMap6 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA7 = x1Var.a0();
                    strA7.getClass();
                    switch (strA7) {
                        case "frames":
                            ArrayList arrayListQ3 = x1Var.Q(iLogger, new io.sentry.clientreport.a(27));
                            if (arrayListQ3 != null) {
                                aVar.f13022i = arrayListQ3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "stacks":
                            List list = (List) x1Var.e0(iLogger, new b0(i12));
                            if (list != null) {
                                aVar.f13021e = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "samples":
                            ArrayList arrayListQ4 = x1Var.Q(iLogger, new b0(i7));
                            if (arrayListQ4 != null) {
                                aVar.f13020d = arrayListQ4;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "thread_metadata":
                            HashMap mapY3 = x1Var.Y(iLogger, new b0(i10));
                            if (mapY3 != null) {
                                aVar.f13023v = mapY3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap6, strA7);
                            break;
                    }
                }
                aVar.f13024w = concurrentHashMap6;
                x1Var.i();
                return aVar;
            case 6:
                ArrayList arrayList = new ArrayList();
                x1Var.c();
                while (x1Var.l()) {
                    ArrayList arrayList2 = new ArrayList();
                    x1Var.c();
                    while (x1Var.l()) {
                        arrayList2.add(Integer.valueOf(x1Var.O()));
                    }
                    x1Var.g();
                    arrayList.add(arrayList2);
                }
                x1Var.g();
                return arrayList;
            case 7:
                x1Var.f();
                io.sentry.protocol.profiling.b bVar = new io.sentry.protocol.profiling.b();
                HashMap map3 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA8 = x1Var.a0();
                    strA8.getClass();
                    switch (strA8) {
                        case "thread_id":
                            bVar.f13027i = x1Var.l0();
                            break;
                        case "timestamp":
                            bVar.f13025d = x1Var.u();
                            break;
                        case "stack_id":
                            bVar.f13026e = x1Var.O();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            x1Var.m0(iLogger, map3, strA8);
                            break;
                    }
                }
                bVar.f13028v = map3;
                x1Var.i();
                return bVar;
            case 8:
                x1Var.f();
                io.sentry.protocol.profiling.c cVar = new io.sentry.protocol.profiling.c();
                HashMap map4 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA9 = x1Var.a0();
                    strA9.getClass();
                    if (strA9.equals("priority")) {
                        cVar.f13030e = x1Var.O();
                    } else if (strA9.equals(StackTraceHelper.NAME_KEY)) {
                        cVar.f13029d = x1Var.l0();
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        x1Var.m0(iLogger, map4, strA9);
                    }
                }
                cVar.f13031i = map4;
                x1Var.i();
                return cVar;
            case 9:
                return b(x1Var, iLogger);
            case 10:
                return io.sentry.rrweb.c.values()[x1Var.O()];
            case 11:
                return io.sentry.rrweb.d.values()[x1Var.O()];
            case 12:
                return c(x1Var, iLogger);
            case 13:
                return io.sentry.rrweb.f.values()[x1Var.O()];
            case 14:
                return d(x1Var, iLogger);
            case 15:
                x1Var.f();
                io.sentry.rrweb.h hVar = new io.sentry.rrweb.h();
                HashMap map5 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA10 = x1Var.a0();
                    strA10.getClass();
                    switch (strA10) {
                        case "x":
                            hVar.f13118e = x1Var.z();
                            break;
                        case "y":
                            hVar.f13119i = x1Var.z();
                            break;
                        case "id":
                            hVar.f13117d = x1Var.O();
                            break;
                        case "timeOffset":
                            hVar.f13120v = x1Var.T();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            x1Var.m0(iLogger, map5, strA10);
                            break;
                    }
                }
                hVar.f13121w = map5;
                x1Var.i();
                return hVar;
            case 16:
                return e(x1Var, iLogger);
            case 17:
                return f(x1Var, iLogger);
            default:
                return g(x1Var, iLogger);
        }
    }
}
