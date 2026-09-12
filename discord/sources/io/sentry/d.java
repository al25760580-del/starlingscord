package io.sentry;

import com.facebook.react.modules.dialog.AlertFragment;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12586a;

    public /* synthetic */ d(int i7) {
        this.f12586a = i7;
    }

    public static j6 b(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.protocol.v vVar = null;
        l6 l6Var = null;
        String strJ0 = null;
        ConcurrentHashMap concurrentHashMap = null;
        l6 l6Var2 = null;
        String strJ1 = null;
        m6 m6Var = null;
        String strJ2 = null;
        ConcurrentHashMap concurrentHashMapF = null;
        Map map = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            switch (strA0) {
                case "span_id":
                    l6Var = new l6(x1Var.j0());
                    break;
                case "parent_span_id":
                    l6Var2 = (l6) x1Var.e0(iLogger, new d(23));
                    break;
                case "description":
                    strJ1 = x1Var.j0();
                    break;
                case "origin":
                    strJ2 = x1Var.j0();
                    break;
                case "status":
                    m6Var = (m6) x1Var.e0(iLogger, new d(24));
                    break;
                case "op":
                    strJ0 = x1Var.j0();
                    break;
                case "data":
                    map = (Map) x1Var.c0();
                    break;
                case "tags":
                    concurrentHashMapF = xr.m.F((Map) x1Var.c0());
                    break;
                case "trace_id":
                    vVar = new io.sentry.protocol.v(x1Var.j0());
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x1Var.m0(iLogger, concurrentHashMap, strA0);
                    break;
            }
        }
        if (vVar == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"trace_id\"");
            iLogger.g(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException);
            throw illegalStateException;
        }
        if (l6Var == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"span_id\"");
            iLogger.g(SentryLevel.ERROR, "Missing required field \"span_id\"", illegalStateException2);
            throw illegalStateException2;
        }
        if (strJ0 == null) {
            strJ0 = "";
        }
        j6 j6Var = new j6(vVar, l6Var, strJ0, l6Var2);
        j6Var.f12787x = strJ1;
        j6Var.f12788y = m6Var;
        j6Var.F = strJ2;
        if (concurrentHashMapF != null) {
            j6Var.E = concurrentHashMapF;
        }
        if (map != null) {
            j6Var.G = map;
        }
        j6Var.H = concurrentHashMap;
        x1Var.i();
        return j6Var;
    }

    private final Object c(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        Date dateY = io.sentry.config.a.y();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String strL0 = null;
        String strL1 = null;
        String strL2 = null;
        String strL3 = null;
        SentryLevel sentryLevelValueOf = null;
        ConcurrentHashMap concurrentHashMap2 = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            switch (strA0) {
                case "origin":
                    strL3 = x1Var.l0();
                    break;
                case "data":
                    ConcurrentHashMap concurrentHashMapF = xr.m.F((Map) x1Var.c0());
                    if (concurrentHashMapF == null) {
                        break;
                    } else {
                        concurrentHashMap = concurrentHashMapF;
                        break;
                    }
                    break;
                case "type":
                    strL1 = x1Var.l0();
                    break;
                case "category":
                    strL2 = x1Var.l0();
                    break;
                case "timestamp":
                    Date dateQ = x1Var.q(iLogger);
                    if (dateQ == null) {
                        break;
                    } else {
                        dateY = dateQ;
                        break;
                    }
                    break;
                case "level":
                    try {
                        sentryLevelValueOf = SentryLevel.valueOf(x1Var.j0().toUpperCase(Locale.ROOT));
                        break;
                    } catch (Exception e10) {
                        iLogger.e(SentryLevel.ERROR, e10, "Error when deserializing SentryLevel", new Object[0]);
                        break;
                    }
                    break;
                case "message":
                    strL0 = x1Var.l0();
                    break;
                default:
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap();
                    }
                    x1Var.m0(iLogger, concurrentHashMap2, strA0);
                    break;
            }
        }
        Breadcrumb breadcrumb = new Breadcrumb(dateY);
        breadcrumb.f12007v = strL0;
        breadcrumb.f12008w = strL1;
        breadcrumb.f12009x = concurrentHashMap;
        breadcrumb.f12010y = strL2;
        breadcrumb.E = strL3;
        breadcrumb.F = sentryLevelValueOf;
        breadcrumb.G = concurrentHashMap2;
        x1Var.i();
        return breadcrumb;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Object d(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
        d3 d3Var = new d3(vVar, vVar, new File("dummy"), new HashMap(), Double.valueOf(0.0d), "android", w5.empty());
        ConcurrentHashMap concurrentHashMap = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            int i7 = 8;
            int i10 = 5;
            int i11 = 2;
            byte b10 = -1;
            switch (strA0.hashCode()) {
                case -1840434063:
                    if (strA0.equals("debug_meta")) {
                        b10 = 0;
                    }
                    break;
                case -362243017:
                    if (strA0.equals("measurements")) {
                        b10 = 1;
                    }
                    break;
                case -309425751:
                    if (strA0.equals("profile")) {
                        b10 = 2;
                    }
                    break;
                case -85904877:
                    if (strA0.equals("environment")) {
                        b10 = 3;
                    }
                    break;
                case 55126294:
                    if (strA0.equals("timestamp")) {
                        b10 = 4;
                    }
                    break;
                case 178573617:
                    if (strA0.equals("profiler_id")) {
                        b10 = 5;
                    }
                    break;
                case 351608024:
                    if (strA0.equals("version")) {
                        b10 = 6;
                    }
                    break;
                case 1090594823:
                    if (strA0.equals("release")) {
                        b10 = 7;
                    }
                    break;
                case 1102774726:
                    if (strA0.equals("client_sdk")) {
                        b10 = 8;
                    }
                    break;
                case 1874684019:
                    if (strA0.equals("platform")) {
                        b10 = 9;
                    }
                    break;
                case 1953158756:
                    if (strA0.equals("sampled_profile")) {
                        b10 = 10;
                    }
                    break;
                case 2005113901:
                    if (strA0.equals("chunk_id")) {
                        b10 = 11;
                    }
                    break;
            }
            int i12 = 23;
            switch (b10) {
                case 0:
                    io.sentry.protocol.d dVar = (io.sentry.protocol.d) x1Var.e0(iLogger, new io.sentry.clientreport.a(i7));
                    if (dVar != null) {
                        d3Var.f12612d = dVar;
                    }
                    break;
                case 1:
                    HashMap mapY = x1Var.Y(iLogger, new io.sentry.clientreport.a(i11));
                    if (mapY != null) {
                        d3Var.f12616w.putAll(mapY);
                    }
                    break;
                case 2:
                    io.sentry.protocol.profiling.a aVar = (io.sentry.protocol.profiling.a) x1Var.e0(iLogger, new io.sentry.protocol.b0(i10));
                    if (aVar != null) {
                        d3Var.J = aVar;
                    }
                    break;
                case 3:
                    String strL0 = x1Var.l0();
                    if (strL0 != null) {
                        d3Var.E = strL0;
                    }
                    break;
                case 4:
                    Double dY = x1Var.y();
                    if (dY != null) {
                        d3Var.G = dY.doubleValue();
                    }
                    break;
                case 5:
                    io.sentry.protocol.v vVar2 = (io.sentry.protocol.v) x1Var.e0(iLogger, new io.sentry.clientreport.a(i12));
                    if (vVar2 != null) {
                        d3Var.f12613e = vVar2;
                    }
                    break;
                case 6:
                    String strL1 = x1Var.l0();
                    if (strL1 != null) {
                        d3Var.F = strL1;
                    }
                    break;
                case 7:
                    String strL2 = x1Var.l0();
                    if (strL2 != null) {
                        d3Var.f12618y = strL2;
                    }
                    break;
                case 8:
                    io.sentry.protocol.t tVar = (io.sentry.protocol.t) x1Var.e0(iLogger, new io.sentry.clientreport.a(21));
                    if (tVar != null) {
                        d3Var.f12615v = tVar;
                    }
                    break;
                case 9:
                    String strL3 = x1Var.l0();
                    if (strL3 != null) {
                        d3Var.f12617x = strL3;
                    }
                    break;
                case 10:
                    String strL4 = x1Var.l0();
                    if (strL4 != null) {
                        d3Var.I = strL4;
                    }
                    break;
                case 11:
                    io.sentry.protocol.v vVar3 = (io.sentry.protocol.v) x1Var.e0(iLogger, new io.sentry.clientreport.a(i12));
                    if (vVar3 != null) {
                        d3Var.f12614i = vVar3;
                    }
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x1Var.m0(iLogger, concurrentHashMap, strA0);
                    break;
            }
        }
        d3Var.K = concurrentHashMap;
        x1Var.i();
        return d3Var;
    }

    private final Object e(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        e3 e3Var = new e3(io.sentry.protocol.v.f13055e);
        ConcurrentHashMap concurrentHashMap = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            if (strA0.equals("profiler_id")) {
                io.sentry.protocol.v vVar = (io.sentry.protocol.v) x1Var.e0(iLogger, new io.sentry.clientreport.a(23));
                if (vVar != null) {
                    e3Var.f12637d = vVar;
                }
            } else {
                if (concurrentHashMap == null) {
                    concurrentHashMap = new ConcurrentHashMap();
                }
                x1Var.m0(iLogger, concurrentHashMap, strA0);
            }
        }
        e3Var.f12638e = concurrentHashMap;
        x1Var.i();
        return e3Var;
    }

    public static IllegalStateException f(String str, ILogger iLogger) {
        String strE = s0.g.e("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strE);
        iLogger.g(SentryLevel.ERROR, strE, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException g(String str, ILogger iLogger) {
        String strE = s0.g.e("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strE);
        iLogger.g(SentryLevel.ERROR, strE, illegalStateException);
        return illegalStateException;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:264:0x03b2. Please report as an issue. */
    @Override // io.sentry.n1
    public final Object a(x1 x1Var, ILogger iLogger) throws IOException {
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        switch (this.f12586a) {
            case 0:
                return c(x1Var, iLogger);
            case 1:
                return d(x1Var, iLogger);
            case 2:
                return e(x1Var, iLogger);
            case 3:
                x1Var.f();
                File file = new File("dummy");
                Date dateY = io.sentry.config.a.y();
                ArrayList arrayList2 = new ArrayList();
                io.sentry.protocol.v vVar = io.sentry.protocol.v.f13055e;
                ConcurrentHashMap concurrentHashMap = null;
                g3 g3Var = new g3(file, dateY, arrayList2, "", vVar.toString(), new j6(vVar, l6.f12801e, "op", null).f12782d.toString(), "0", 0, "", new g0(2), null, null, null, null, null, null, null, null, "normal", new HashMap());
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA0 = x1Var.a0();
                    strA0.getClass();
                    switch (strA0) {
                        case "device_manufacturer":
                            String strL0 = x1Var.l0();
                            if (strL0 != null) {
                                g3Var.f12691w = strL0;
                            } else {
                                continue;
                            }
                            break;
                        case "android_api_level":
                            Integer numP = x1Var.P();
                            if (numP != null) {
                                g3Var.f12689i = numP.intValue();
                            } else {
                                continue;
                            }
                            break;
                        case "build_id":
                            String strL1 = x1Var.l0();
                            if (strL1 != null) {
                                g3Var.L = strL1;
                            } else {
                                continue;
                            }
                            break;
                        case "device_locale":
                            String strL2 = x1Var.l0();
                            if (strL2 != null) {
                                g3Var.f12690v = strL2;
                            } else {
                                continue;
                            }
                            break;
                        case "profile_id":
                            String strL3 = x1Var.l0();
                            if (strL3 != null) {
                                g3Var.T = strL3;
                            } else {
                                continue;
                            }
                            break;
                        case "device_os_build_number":
                            String strL4 = x1Var.l0();
                            if (strL4 != null) {
                                g3Var.f12693y = strL4;
                            } else {
                                continue;
                            }
                            break;
                        case "device_model":
                            String strL5 = x1Var.l0();
                            if (strL5 != null) {
                                g3Var.f12692x = strL5;
                            } else {
                                continue;
                            }
                            break;
                        case "device_is_emulator":
                            Boolean boolN = x1Var.n();
                            if (boolN != null) {
                                g3Var.G = boolN.booleanValue();
                            } else {
                                continue;
                            }
                            break;
                        case "duration_ns":
                            String strL6 = x1Var.l0();
                            if (strL6 != null) {
                                g3Var.O = strL6;
                            } else {
                                continue;
                            }
                            break;
                        case "measurements":
                            HashMap mapY = x1Var.Y(iLogger, new io.sentry.clientreport.a(2));
                            if (mapY != null) {
                                g3Var.X.putAll(mapY);
                            } else {
                                continue;
                            }
                            break;
                        case "device_physical_memory_bytes":
                            String strL7 = x1Var.l0();
                            if (strL7 != null) {
                                g3Var.J = strL7;
                                break;
                            }
                            break;
                        case "device_cpu_frequencies":
                            List list = (List) x1Var.c0();
                            if (list != null) {
                                g3Var.I = list;
                                break;
                            }
                            break;
                        case "version_code":
                            String strL8 = x1Var.l0();
                            if (strL8 != null) {
                                g3Var.P = strL8;
                                break;
                            }
                            break;
                        case "version_name":
                            String strL9 = x1Var.l0();
                            if (strL9 != null) {
                                g3Var.Q = strL9;
                                break;
                            }
                            break;
                        case "environment":
                            String strL10 = x1Var.l0();
                            if (strL10 != null) {
                                g3Var.U = strL10;
                                break;
                            }
                            break;
                        case "timestamp":
                            Date dateQ = x1Var.q(iLogger);
                            if (dateQ != null) {
                                g3Var.W = dateQ;
                                break;
                            }
                            break;
                        case "transaction_name":
                            String strL11 = x1Var.l0();
                            if (strL11 != null) {
                                g3Var.N = strL11;
                                break;
                            }
                            break;
                        case "device_os_name":
                            String strL12 = x1Var.l0();
                            if (strL12 != null) {
                                g3Var.E = strL12;
                                break;
                            }
                            break;
                        case "architecture":
                            String strL13 = x1Var.l0();
                            if (strL13 != null) {
                                g3Var.H = strL13;
                                break;
                            }
                            break;
                        case "transaction_id":
                            String strL14 = x1Var.l0();
                            if (strL14 != null) {
                                g3Var.R = strL14;
                                break;
                            }
                            break;
                        case "device_os_version":
                            String strL15 = x1Var.l0();
                            if (strL15 != null) {
                                g3Var.F = strL15;
                                break;
                            }
                            break;
                        case "truncation_reason":
                            String strL16 = x1Var.l0();
                            if (strL16 != null) {
                                g3Var.V = strL16;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strL17 = x1Var.l0();
                            if (strL17 != null) {
                                g3Var.S = strL17;
                                break;
                            }
                            break;
                        case "platform":
                            String strL18 = x1Var.l0();
                            if (strL18 != null) {
                                g3Var.K = strL18;
                                break;
                            }
                            break;
                        case "sampled_profile":
                            String strL19 = x1Var.l0();
                            if (strL19 != null) {
                                g3Var.Y = strL19;
                                break;
                            }
                            break;
                        case "transactions":
                            ArrayList arrayListQ = x1Var.Q(iLogger, new d(4));
                            if (arrayListQ != null) {
                                g3Var.M.addAll(arrayListQ);
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap, strA0);
                            break;
                    }
                }
                g3Var.Z = concurrentHashMap;
                x1Var.i();
                return g3Var;
            case 4:
                x1Var.f();
                h3 h3Var = new h3(v2.f13244a, 0L, 0L);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    switch (strA1) {
                        case "relative_start_ns":
                            Long lU = x1Var.U();
                            if (lU == null) {
                                break;
                            } else {
                                h3Var.f12706v = lU;
                                break;
                            }
                            break;
                        case "relative_end_ns":
                            Long lU2 = x1Var.U();
                            if (lU2 == null) {
                                break;
                            } else {
                                h3Var.f12707w = lU2;
                                break;
                            }
                            break;
                        case "id":
                            String strL20 = x1Var.l0();
                            if (strL20 == null) {
                                break;
                            } else {
                                h3Var.f12703d = strL20;
                                break;
                            }
                            break;
                        case "name":
                            String strL21 = x1Var.l0();
                            if (strL21 == null) {
                                break;
                            } else {
                                h3Var.f12705i = strL21;
                                break;
                            }
                            break;
                        case "trace_id":
                            String strL22 = x1Var.l0();
                            if (strL22 == null) {
                                break;
                            } else {
                                h3Var.f12704e = strL22;
                                break;
                            }
                            break;
                        case "relative_cpu_end_ms":
                            Long lU3 = x1Var.U();
                            if (lU3 == null) {
                                break;
                            } else {
                                h3Var.f12709y = lU3;
                                break;
                            }
                            break;
                        case "relative_cpu_start_ms":
                            Long lU4 = x1Var.U();
                            if (lU4 == null) {
                                break;
                            } else {
                                h3Var.f12708x = lU4;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap2, strA1);
                            break;
                    }
                }
                h3Var.E = concurrentHashMap2;
                x1Var.i();
                return h3Var;
            case 5:
                l3 l3Var = new l3();
                x1Var.f();
                HashMap map = null;
                Integer numP2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA2 = x1Var.a0();
                    strA2.getClass();
                    if (strA2.equals("segment_id")) {
                        numP2 = x1Var.P();
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        x1Var.m0(iLogger, map, strA2);
                    }
                }
                x1Var.i();
                x1Var.p0(true);
                List list2 = (List) x1Var.c0();
                x1Var.p0(false);
                if (list2 != null) {
                    arrayList = new ArrayList(list2.size());
                    for (Object obj : list2) {
                        if (obj instanceof Map) {
                            Map map2 = (Map) obj;
                            x1 x1Var2 = new x1(map2);
                            for (Map.Entry entry : map2.entrySet()) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                if (str.equals("type")) {
                                    io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                    int i12 = k3.f12791b[cVar.ordinal()];
                                    if (i12 == 1) {
                                        Map map3 = (Map) map2.get("data");
                                        if (map3 == null) {
                                            map3 = Collections.EMPTY_MAP;
                                        }
                                        Integer num = (Integer) map3.get("source");
                                        if (num != null) {
                                            io.sentry.rrweb.d dVar = io.sentry.rrweb.d.values()[num.intValue()];
                                            int i13 = k3.f12790a[dVar.ordinal()];
                                            if (i13 == 1) {
                                                arrayList.add(io.sentry.protocol.b0.c(x1Var2, iLogger));
                                            } else if (i13 != 2) {
                                                iLogger.q(SentryLevel.DEBUG, "Unsupported rrweb incremental snapshot type %s", dVar);
                                            } else {
                                                arrayList.add(io.sentry.protocol.b0.d(x1Var2, iLogger));
                                            }
                                        }
                                    } else if (i12 == 2) {
                                        arrayList.add(io.sentry.protocol.b0.e(x1Var2, iLogger));
                                    } else if (i12 == 3) {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str2 = (String) map4.get("tag");
                                        if (str2 != null) {
                                            switch (str2) {
                                                case "performanceSpan":
                                                    arrayList.add(io.sentry.protocol.b0.f(x1Var2, iLogger));
                                                    break;
                                                case "video":
                                                    arrayList.add(io.sentry.protocol.b0.g(x1Var2, iLogger));
                                                    break;
                                                case "breadcrumb":
                                                    arrayList.add(io.sentry.protocol.b0.b(x1Var2, iLogger));
                                                    break;
                                                default:
                                                    iLogger.q(SentryLevel.DEBUG, "Unsupported rrweb event type %s", cVar);
                                                    break;
                                            }
                                        }
                                    } else {
                                        iLogger.q(SentryLevel.DEBUG, "Unsupported rrweb event type %s", cVar);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                l3Var.f12793d = numP2;
                l3Var.f12794e = arrayList;
                l3Var.f12795i = map;
                return l3Var;
            case 6:
                x1Var.f();
                d4 d4Var = new d4();
                d4Var.f12621i = false;
                d4Var.f12622v = null;
                d4Var.f12619d = false;
                d4Var.f12620e = null;
                d4Var.F = false;
                d4Var.f12623w = null;
                d4Var.f12624x = false;
                d4Var.f12625y = false;
                d4Var.I = f3.MANUAL;
                d4Var.E = 0;
                d4Var.G = true;
                d4Var.H = false;
                ConcurrentHashMap concurrentHashMap3 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA3 = x1Var.a0();
                    strA3.getClass();
                    switch (strA3) {
                        case "is_enable_app_start_profiling":
                            Boolean boolN2 = x1Var.n();
                            if (boolN2 == null) {
                                break;
                            } else {
                                d4Var.G = boolN2.booleanValue();
                                break;
                            }
                            break;
                        case "trace_sampled":
                            Boolean boolN3 = x1Var.n();
                            if (boolN3 == null) {
                                break;
                            } else {
                                d4Var.f12621i = boolN3.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_dir_path":
                            String strL23 = x1Var.l0();
                            if (strL23 == null) {
                                break;
                            } else {
                                d4Var.f12623w = strL23;
                                break;
                            }
                            break;
                        case "is_continuous_profiling_enabled":
                            Boolean boolN4 = x1Var.n();
                            if (boolN4 == null) {
                                break;
                            } else {
                                d4Var.f12625y = boolN4.booleanValue();
                                break;
                            }
                            break;
                        case "is_profiling_enabled":
                            Boolean boolN5 = x1Var.n();
                            if (boolN5 == null) {
                                break;
                            } else {
                                d4Var.f12624x = boolN5.booleanValue();
                                break;
                            }
                            break;
                        case "is_start_profiler_on_app_start":
                            Boolean boolN6 = x1Var.n();
                            if (boolN6 == null) {
                                break;
                            } else {
                                d4Var.H = boolN6.booleanValue();
                                break;
                            }
                            break;
                        case "profile_sampled":
                            Boolean boolN7 = x1Var.n();
                            if (boolN7 == null) {
                                break;
                            } else {
                                d4Var.f12619d = boolN7.booleanValue();
                                break;
                            }
                            break;
                        case "profile_lifecycle":
                            String strL24 = x1Var.l0();
                            if (strL24 == null) {
                                break;
                            } else {
                                try {
                                    d4Var.I = f3.valueOf(strL24);
                                } catch (IllegalArgumentException unused) {
                                    iLogger.q(SentryLevel.ERROR, "Error when deserializing ProfileLifecycle: ".concat(strL24), new Object[0]);
                                }
                                break;
                            }
                            break;
                        case "continuous_profile_sampled":
                            Boolean boolN8 = x1Var.n();
                            if (boolN8 == null) {
                                break;
                            } else {
                                d4Var.F = boolN8.booleanValue();
                                break;
                            }
                            break;
                        case "profiling_traces_hz":
                            Integer numP3 = x1Var.P();
                            if (numP3 == null) {
                                break;
                            } else {
                                d4Var.E = numP3.intValue();
                                break;
                            }
                            break;
                        case "trace_sample_rate":
                            Double dY = x1Var.y();
                            if (dY == null) {
                                break;
                            } else {
                                d4Var.f12622v = dY;
                                break;
                            }
                            break;
                        case "profile_sample_rate":
                            Double dY2 = x1Var.y();
                            if (dY2 == null) {
                                break;
                            } else {
                                d4Var.f12620e = dY2;
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap3, strA3);
                            break;
                    }
                }
                d4Var.J = concurrentHashMap3;
                x1Var.i();
                return d4Var;
            case 7:
                x1Var.f();
                io.sentry.protocol.t tVar = null;
                o6 o6Var = null;
                Date dateQ2 = null;
                HashMap map5 = null;
                io.sentry.protocol.v vVar2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA4 = x1Var.a0();
                    strA4.getClass();
                    switch (strA4) {
                        case "sdk":
                            tVar = (io.sentry.protocol.t) x1Var.e0(iLogger, new io.sentry.clientreport.a(21));
                            continue;
                            break;
                        case "trace":
                            o6Var = (o6) x1Var.e0(iLogger, new d(25));
                            continue;
                            break;
                        case "event_id":
                            vVar2 = (io.sentry.protocol.v) x1Var.e0(iLogger, new io.sentry.clientreport.a(23));
                            continue;
                            break;
                        case "sent_at":
                            dateQ2 = x1Var.q(iLogger);
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            x1Var.m0(iLogger, map5, strA4);
                            break;
                    }
                }
                l4 l4Var = new l4(vVar2, tVar, o6Var);
                l4Var.f12799v = dateQ2;
                l4Var.f12800w = map5;
                x1Var.i();
                return l4Var;
            case 8:
                x1Var.f();
                w4 w4Var = null;
                int iO = 0;
                String strL25 = null;
                String strL26 = null;
                String strL27 = null;
                String strL28 = null;
                Integer numP4 = null;
                HashMap map6 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA5 = x1Var.a0();
                    strA5.getClass();
                    switch (strA5) {
                        case "item_count":
                            numP4 = x1Var.P();
                            continue;
                            break;
                        case "length":
                            iO = x1Var.O();
                            continue;
                            break;
                        case "filename":
                            strL26 = x1Var.l0();
                            continue;
                            break;
                        case "attachment_type":
                            strL27 = x1Var.l0();
                            continue;
                            break;
                        case "type":
                            w4Var = (w4) x1Var.e0(iLogger, new d(10));
                            continue;
                            break;
                        case "content_type":
                            strL25 = x1Var.l0();
                            break;
                        case "platform":
                            strL28 = x1Var.l0();
                            break;
                        default:
                            if (map6 == null) {
                                map6 = new HashMap();
                            }
                            x1Var.m0(iLogger, map6, strA5);
                            break;
                    }
                }
                if (w4Var == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException);
                    throw illegalStateException;
                }
                q4 q4Var = new q4(w4Var, iO, strL25, strL26, strL27, strL28, numP4);
                q4Var.F = map6;
                x1Var.i();
                return q4Var;
            case 9:
                x1Var.f();
                SentryEvent sentryEvent = new SentryEvent();
                ConcurrentHashMap concurrentHashMap4 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA6 = x1Var.a0();
                    strA6.getClass();
                    switch (strA6) {
                        case "fingerprint":
                            List list3 = (List) x1Var.c0();
                            if (list3 == null) {
                                break;
                            } else {
                                sentryEvent.T = list3;
                                break;
                            }
                            break;
                        case "threads":
                            x1Var.f();
                            x1Var.a0();
                            sentryEvent.P = new f6(x1Var.Q(iLogger, new io.sentry.protocol.b0(0)));
                            x1Var.i();
                            break;
                        case "logger":
                            sentryEvent.O = x1Var.l0();
                            break;
                        case "timestamp":
                            Date dateQ3 = x1Var.q(iLogger);
                            if (dateQ3 == null) {
                                break;
                            } else {
                                sentryEvent.M = dateQ3;
                                break;
                            }
                            break;
                        case "level":
                            sentryEvent.R = (SentryLevel) x1Var.e0(iLogger, new d(11));
                            break;
                        case "message":
                            sentryEvent.N = (io.sentry.protocol.n) x1Var.e0(iLogger, new io.sentry.clientreport.a(17));
                            break;
                        case "modules":
                            sentryEvent.V = xr.m.F((Map) x1Var.c0());
                            break;
                        case "exception":
                            x1Var.f();
                            x1Var.a0();
                            sentryEvent.Q = new f6(x1Var.Q(iLogger, new io.sentry.clientreport.a(22)));
                            x1Var.i();
                            break;
                        case "transaction":
                            sentryEvent.S = x1Var.l0();
                            break;
                        default:
                            if (!m3.m.u(sentryEvent, strA6, x1Var, iLogger)) {
                                if (concurrentHashMap4 == null) {
                                    concurrentHashMap4 = new ConcurrentHashMap();
                                }
                                x1Var.m0(iLogger, concurrentHashMap4, strA6);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                sentryEvent.U = concurrentHashMap4;
                x1Var.i();
                return sentryEvent;
            case 10:
                return w4.valueOfLabel(x1Var.j0().toLowerCase(Locale.ROOT));
            case 11:
                return SentryLevel.valueOf(x1Var.j0().toUpperCase(Locale.ROOT));
            case 12:
                x4 x4Var = new x4();
                x1Var.f();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA7 = x1Var.a0();
                    strA7.getClass();
                    switch (strA7) {
                        case "package_name":
                            x4Var.f13280i = x1Var.l0();
                            break;
                        case "thread_id":
                            x4Var.f13282w = x1Var.U();
                            break;
                        case "address":
                            x4Var.f13279e = x1Var.l0();
                            break;
                        case "class_name":
                            x4Var.f13281v = x1Var.l0();
                            break;
                        case "type":
                            x4Var.f13278d = x1Var.O();
                            break;
                        default:
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap5, strA7);
                            break;
                    }
                }
                x4Var.f13283x = concurrentHashMap5;
                x1Var.i();
                return x4Var;
            case 13:
                x1Var.f();
                Double dY3 = null;
                String strL29 = null;
                HashMap map7 = null;
                a5 a5Var = null;
                HashMap mapY2 = null;
                Integer numP5 = null;
                l6 l6Var = null;
                io.sentry.protocol.v vVar3 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA8 = x1Var.a0();
                    strA8.getClass();
                    switch (strA8) {
                        case "span_id":
                            l6Var = (l6) x1Var.e0(iLogger, new d(23));
                            continue;
                            break;
                        case "severity_number":
                            numP5 = x1Var.P();
                            continue;
                            break;
                        case "body":
                            strL29 = x1Var.l0();
                            continue;
                            break;
                        case "timestamp":
                            dY3 = x1Var.y();
                            continue;
                            break;
                        case "level":
                            a5Var = (a5) x1Var.e0(iLogger, new d(16));
                            continue;
                            break;
                        case "attributes":
                            mapY2 = x1Var.Y(iLogger, new d(14));
                            continue;
                            break;
                        case "trace_id":
                            vVar3 = (io.sentry.protocol.v) x1Var.e0(iLogger, new io.sentry.clientreport.a(23));
                            break;
                        default:
                            if (map7 == null) {
                                map7 = new HashMap();
                            }
                            x1Var.m0(iLogger, map7, strA8);
                            break;
                    }
                }
                x1Var.i();
                if (vVar3 == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"trace_id\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException2);
                    throw illegalStateException2;
                }
                if (dY3 == null) {
                    IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"timestamp\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"timestamp\"", illegalStateException3);
                    throw illegalStateException3;
                }
                if (strL29 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"body\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"body\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (a5Var == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"level\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"level\"", illegalStateException5);
                    throw illegalStateException5;
                }
                y4 y4Var = new y4();
                y4Var.f13287d = vVar3;
                y4Var.f13289i = dY3;
                y4Var.f13290v = strL29;
                y4Var.f13291w = a5Var;
                y4Var.f13293y = mapY2;
                y4Var.f13292x = numP5;
                y4Var.f13288e = l6Var;
                y4Var.E = map7;
                return y4Var;
            case 14:
                x1Var.f();
                Object objC0 = null;
                AbstractMap map8 = null;
                String strL30 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA9 = x1Var.a0();
                    strA9.getClass();
                    if (strA9.equals("type")) {
                        strL30 = x1Var.l0();
                    } else if (strA9.equals("value")) {
                        objC0 = x1Var.c0();
                    } else {
                        if (map8 == null) {
                            map8 = new HashMap();
                        }
                        x1Var.m0(iLogger, map8, strA9);
                    }
                }
                x1Var.i();
                if (strL30 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"type\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException6);
                    throw illegalStateException6;
                }
                io.sentry.protocol.l lVar = new io.sentry.protocol.l();
                lVar.f12992e = strL30;
                if (objC0 == null || !strL30.equals("string")) {
                    lVar.f12993i = objC0;
                } else {
                    lVar.f12993i = objC0.toString();
                }
                lVar.f12994v = map8;
                return lVar;
            case 15:
                x1Var.f();
                HashMap map9 = null;
                ArrayList arrayListQ2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA10 = x1Var.a0();
                    strA10.getClass();
                    if (strA10.equals(AlertFragment.ARG_ITEMS)) {
                        arrayListQ2 = x1Var.Q(iLogger, new d(13));
                    } else {
                        if (map9 == null) {
                            map9 = new HashMap();
                        }
                        x1Var.m0(iLogger, map9, strA10);
                    }
                }
                x1Var.i();
                if (arrayListQ2 != null) {
                    z4 z4Var = new z4(arrayListQ2);
                    z4Var.f13307e = map9;
                    return z4Var;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"items\"");
                iLogger.g(SentryLevel.ERROR, "Missing required field \"items\"", illegalStateException7);
                throw illegalStateException7;
            case 16:
                return a5.valueOf(x1Var.j0().toUpperCase(Locale.ROOT));
            case 17:
                x1Var.f();
                Double dY4 = null;
                String strL31 = null;
                HashMap map10 = null;
                String strL32 = null;
                Double dY5 = null;
                HashMap mapY3 = null;
                io.sentry.protocol.v vVar4 = null;
                l6 l6Var2 = null;
                String strL33 = null;
                while (true) {
                    HashMap map11 = map10;
                    if (x1Var.o0() != io.sentry.vendor.gson.stream.b.NAME) {
                        x1Var.i();
                        if (vVar4 == null) {
                            IllegalStateException illegalStateException8 = new IllegalStateException("Missing required field \"trace_id\"");
                            iLogger.g(SentryLevel.ERROR, "Missing required field \"trace_id\"", illegalStateException8);
                            throw illegalStateException8;
                        }
                        if (dY4 == null) {
                            IllegalStateException illegalStateException9 = new IllegalStateException("Missing required field \"timestamp\"");
                            iLogger.g(SentryLevel.ERROR, "Missing required field \"timestamp\"", illegalStateException9);
                            throw illegalStateException9;
                        }
                        if (strL31 == null) {
                            IllegalStateException illegalStateException10 = new IllegalStateException("Missing required field \"type\"");
                            iLogger.g(SentryLevel.ERROR, "Missing required field \"type\"", illegalStateException10);
                            throw illegalStateException10;
                        }
                        if (strL32 == null) {
                            IllegalStateException illegalStateException11 = new IllegalStateException("Missing required field \"name\"");
                            iLogger.g(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException11);
                            throw illegalStateException11;
                        }
                        if (dY5 == null) {
                            IllegalStateException illegalStateException12 = new IllegalStateException("Missing required field \"value\"");
                            iLogger.g(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException12);
                            throw illegalStateException12;
                        }
                        c5 c5Var = new c5();
                        c5Var.f12520d = vVar4;
                        c5Var.f12522i = dY4;
                        c5Var.f12523v = strL32;
                        c5Var.f12525x = strL31;
                        c5Var.f12526y = dY5;
                        c5Var.E = mapY3;
                        c5Var.f12521e = l6Var2;
                        c5Var.f12524w = strL33;
                        c5Var.F = map11;
                        return c5Var;
                    }
                    String strA11 = x1Var.a0();
                    strA11.getClass();
                    switch (strA11) {
                        case "span_id":
                            l6Var2 = (l6) x1Var.e0(iLogger, new d(23));
                            break;
                        case "name":
                            strL32 = x1Var.l0();
                            break;
                        case "type":
                            strL31 = x1Var.l0();
                            break;
                        case "unit":
                            strL33 = x1Var.l0();
                            break;
                        case "timestamp":
                            dY4 = x1Var.y();
                            break;
                        case "value":
                            dY5 = x1Var.y();
                            break;
                        case "attributes":
                            mapY3 = x1Var.Y(iLogger, new d(14));
                            break;
                        case "trace_id":
                            vVar4 = (io.sentry.protocol.v) x1Var.e0(iLogger, new io.sentry.clientreport.a(23));
                            break;
                        default:
                            map10 = map11 == null ? new HashMap() : map11;
                            x1Var.m0(iLogger, map10, strA11);
                            continue;
                            break;
                    }
                    map10 = map11;
                }
                break;
            case 18:
                x1Var.f();
                HashMap map12 = null;
                ArrayList arrayListQ3 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA12 = x1Var.a0();
                    strA12.getClass();
                    if (strA12.equals(AlertFragment.ARG_ITEMS)) {
                        arrayListQ3 = x1Var.Q(iLogger, new d(17));
                    } else {
                        if (map12 == null) {
                            map12 = new HashMap();
                        }
                        x1Var.m0(iLogger, map12, strA12);
                    }
                }
                x1Var.i();
                if (arrayListQ3 != null) {
                    d5 d5Var = new d5(arrayListQ3);
                    d5Var.f12627e = map12;
                    return d5Var;
                }
                IllegalStateException illegalStateException13 = new IllegalStateException("Missing required field \"items\"");
                iLogger.g(SentryLevel.ERROR, "Missing required field \"items\"", illegalStateException13);
                throw illegalStateException13;
            case 19:
                y5 y5Var = new y5();
                x1Var.f();
                x5 x5Var = null;
                Date dateQ4 = null;
                HashMap map13 = null;
                io.sentry.protocol.v vVar5 = null;
                Date dateQ5 = null;
                List list4 = null;
                String strL34 = null;
                List list5 = null;
                List list6 = null;
                Integer numP6 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA13 = x1Var.a0();
                    strA13.getClass();
                    switch (strA13) {
                        case "replay_id":
                            vVar5 = (io.sentry.protocol.v) x1Var.e0(iLogger, new io.sentry.clientreport.a(23));
                            break;
                        case "replay_start_timestamp":
                            dateQ5 = x1Var.q(iLogger);
                            break;
                        case "type":
                            strL34 = x1Var.l0();
                            break;
                        case "urls":
                            list4 = (List) x1Var.c0();
                            break;
                        case "timestamp":
                            dateQ4 = x1Var.q(iLogger);
                            break;
                        case "error_ids":
                            list5 = (List) x1Var.c0();
                            break;
                        case "trace_ids":
                            list6 = (List) x1Var.c0();
                            break;
                        case "replay_type":
                            x5Var = (x5) x1Var.e0(iLogger, new d(20));
                            break;
                        case "segment_id":
                            numP6 = x1Var.P();
                            break;
                        default:
                            if (!m3.m.u(y5Var, strA13, x1Var, iLogger)) {
                                if (map13 == null) {
                                    map13 = new HashMap();
                                }
                                x1Var.m0(iLogger, map13, strA13);
                                break;
                            } else {
                                break;
                            }
                            break;
                    }
                }
                x1Var.i();
                if (strL34 != null) {
                    y5Var.N = strL34;
                }
                if (x5Var != null) {
                    y5Var.O = x5Var;
                }
                if (numP6 != null) {
                    y5Var.Q = numP6.intValue();
                }
                if (dateQ4 != null) {
                    y5Var.R = dateQ4;
                }
                y5Var.P = vVar5;
                y5Var.S = dateQ5;
                y5Var.T = list4;
                y5Var.U = list5;
                y5Var.V = list6;
                y5Var.W = map13;
                return y5Var;
            case 20:
                return x5.valueOf(x1Var.j0().toUpperCase(Locale.ROOT));
            case 21:
                x1Var.f();
                ConcurrentHashMap concurrentHashMap6 = null;
                Integer numP7 = null;
                g6 g6VarValueOf = null;
                Date dateQ6 = null;
                Date dateQ7 = null;
                String strL35 = null;
                String str3 = null;
                Boolean boolN9 = null;
                Long lU5 = null;
                Double dY6 = null;
                String strL36 = null;
                String strL37 = null;
                String strL38 = null;
                String strL39 = null;
                String strL40 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA14 = x1Var.a0();
                    strA14.getClass();
                    switch (strA14) {
                        case "duration":
                            dY6 = x1Var.y();
                            continue;
                            break;
                        case "started":
                            dateQ6 = x1Var.q(iLogger);
                            continue;
                            break;
                        case "errors":
                            numP7 = x1Var.P();
                            continue;
                            break;
                        case "status":
                            String strA = io.sentry.util.l.a(x1Var.l0());
                            if (strA != null) {
                                g6VarValueOf = g6.valueOf(strA);
                            } else {
                                continue;
                            }
                            break;
                        case "did":
                            strL35 = x1Var.l0();
                            continue;
                            break;
                        case "seq":
                            lU5 = x1Var.U();
                            continue;
                            break;
                        case "sid":
                            String strL41 = x1Var.l0();
                            if (strL41 != null && (strL41.length() == 36 || strL41.length() == 32)) {
                                str3 = strL41;
                                break;
                            } else {
                                iLogger.q(SentryLevel.ERROR, "%s sid is not valid.", strL41);
                                continue;
                                break;
                            }
                            break;
                        case "init":
                            boolN9 = x1Var.n();
                            continue;
                            break;
                        case "timestamp":
                            dateQ7 = x1Var.q(iLogger);
                            continue;
                            break;
                        case "attrs":
                            x1Var.f();
                            while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                                String strA15 = x1Var.a0();
                                strA15.getClass();
                                switch (strA15) {
                                    case "environment":
                                        strL38 = x1Var.l0();
                                        break;
                                    case "release":
                                        strL39 = x1Var.l0();
                                        break;
                                    case "ip_address":
                                        strL36 = x1Var.l0();
                                        break;
                                    case "user_agent":
                                        strL37 = x1Var.l0();
                                        break;
                                    default:
                                        switch (x1Var.f13271d) {
                                            case 0:
                                                io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) x1Var.f13272e;
                                                int i14 = 0;
                                                do {
                                                    int i15 = aVar.E;
                                                    if (i15 == 0) {
                                                        i15 = aVar.i();
                                                    }
                                                    if (i15 == 3) {
                                                        i7 = 1;
                                                        aVar.l0(1);
                                                    } else {
                                                        i7 = 1;
                                                        if (i15 == 1) {
                                                            aVar.l0(3);
                                                        } else if (i15 == 4) {
                                                            aVar.J--;
                                                            i14--;
                                                            i10 = i7;
                                                            i11 = 0;
                                                        } else if (i15 == 2) {
                                                            aVar.J--;
                                                            i14--;
                                                            i10 = 1;
                                                            i11 = 0;
                                                        } else {
                                                            if (i15 == 14 || i15 == 10) {
                                                                while (true) {
                                                                    int i16 = 0;
                                                                    while (true) {
                                                                        int i17 = aVar.f13258v + i16;
                                                                        if (i17 < aVar.f13259w) {
                                                                            char c8 = aVar.f13257i[i17];
                                                                            if (c8 != '\t' && c8 != '\n' && c8 != '\f' && c8 != '\r' && c8 != ' ') {
                                                                                if (c8 != '#') {
                                                                                    if (c8 != ',') {
                                                                                        if (c8 != '/' && c8 != '=') {
                                                                                            if (c8 != '{' && c8 != '}' && c8 != ':') {
                                                                                                if (c8 != ';') {
                                                                                                    switch (c8) {
                                                                                                        case '[':
                                                                                                        case ']':
                                                                                                            break;
                                                                                                        case '\\':
                                                                                                            break;
                                                                                                        default:
                                                                                                            i16++;
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                aVar.g();
                                                                            }
                                                                            aVar.f13258v += i16;
                                                                            i10 = 1;
                                                                        } else {
                                                                            aVar.f13258v = i17;
                                                                            i10 = 1;
                                                                            if (!aVar.q(1)) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (i15 == 8 || i15 == 12) {
                                                                    aVar.n0('\'');
                                                                } else if (i15 == 9 || i15 == 13) {
                                                                    aVar.n0('\"');
                                                                } else if (i15 == 16) {
                                                                    aVar.f13258v += aVar.G;
                                                                }
                                                                i10 = 1;
                                                            }
                                                            i11 = 0;
                                                        }
                                                        aVar.E = i11;
                                                    }
                                                    i14++;
                                                    i10 = i7;
                                                    i11 = 0;
                                                    aVar.E = i11;
                                                } while (i14 != 0);
                                                int[] iArr = aVar.L;
                                                int i18 = aVar.J - i10;
                                                iArr[i18] = iArr[i18] + i10;
                                                aVar.K[i18] = "null";
                                                break;
                                        }
                                        break;
                                }
                            }
                            x1Var.i();
                            continue;
                            break;
                        case "abnormal_mechanism":
                            strL40 = x1Var.l0();
                            break;
                        default:
                            if (concurrentHashMap6 == null) {
                                concurrentHashMap6 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap6, strA14);
                            break;
                    }
                }
                if (g6VarValueOf == null) {
                    throw f("status", iLogger);
                }
                if (dateQ6 == null) {
                    throw f("started", iLogger);
                }
                if (numP7 == null) {
                    throw f("errors", iLogger);
                }
                if (strL39 == null) {
                    throw f("release", iLogger);
                }
                h6 h6Var = new h6(g6VarValueOf, dateQ6, dateQ7, numP7.intValue(), strL35, str3, boolN9, lU5, dY6, strL36, strL37, strL38, strL39, strL40);
                h6Var.M = concurrentHashMap6;
                x1Var.i();
                return h6Var;
            case 22:
                return b(x1Var, iLogger);
            case 23:
                return new l6(x1Var.j0());
            case 24:
                return m6.valueOf(x1Var.j0().toUpperCase(Locale.ROOT));
            case 25:
                x1Var.f();
                String strL42 = null;
                ConcurrentHashMap concurrentHashMap7 = null;
                String strJ0 = null;
                String strL43 = null;
                String strL44 = null;
                String strL45 = null;
                String strL46 = null;
                io.sentry.protocol.v vVar6 = null;
                String strL47 = null;
                String strL48 = null;
                io.sentry.protocol.v vVar7 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA16 = x1Var.a0();
                    strA16.getClass();
                    switch (strA16) {
                        case "replay_id":
                            vVar6 = new io.sentry.protocol.v(x1Var.j0());
                            break;
                        case "user_id":
                            strL44 = x1Var.l0();
                            break;
                        case "environment":
                            strL43 = x1Var.l0();
                            break;
                        case "sample_rand":
                            strL47 = x1Var.l0();
                            break;
                        case "sample_rate":
                            strL46 = x1Var.l0();
                            break;
                        case "release":
                            strL48 = x1Var.l0();
                            break;
                        case "trace_id":
                            vVar7 = new io.sentry.protocol.v(x1Var.j0());
                            break;
                        case "sampled":
                            strL42 = x1Var.l0();
                            break;
                        case "public_key":
                            strJ0 = x1Var.j0();
                            break;
                        case "transaction":
                            strL45 = x1Var.l0();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap7, strA16);
                            break;
                    }
                }
                if (vVar7 == null) {
                    throw g("trace_id", iLogger);
                }
                if (strJ0 == null) {
                    throw g("public_key", iLogger);
                }
                o6 o6Var2 = new o6(vVar7, strJ0, strL48, strL43, strL44, strL45, strL46, strL42, vVar6, strL47);
                o6Var2.H = concurrentHashMap7;
                x1Var.i();
                return o6Var2;
            default:
                x1Var.f();
                io.sentry.protocol.v vVar8 = null;
                String strL49 = null;
                String strL50 = null;
                String strL51 = null;
                HashMap map14 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA17 = x1Var.a0();
                    strA17.getClass();
                    switch (strA17) {
                        case "comments":
                            strL51 = x1Var.l0();
                            break;
                        case "name":
                            strL49 = x1Var.l0();
                            break;
                        case "email":
                            strL50 = x1Var.l0();
                            break;
                        case "event_id":
                            vVar8 = new io.sentry.protocol.v(x1Var.j0());
                            break;
                        default:
                            if (map14 == null) {
                                map14 = new HashMap();
                            }
                            x1Var.m0(iLogger, map14, strA17);
                            break;
                    }
                }
                x1Var.i();
                if (vVar8 != null) {
                    t6 t6Var = new t6(vVar8, strL49, strL50, strL51);
                    t6Var.f13165w = map14;
                    return t6Var;
                }
                IllegalStateException illegalStateException14 = new IllegalStateException("Missing required field \"event_id\"");
                iLogger.g(SentryLevel.ERROR, "Missing required field \"event_id\"", illegalStateException14);
                throw illegalStateException14;
        }
    }
}
