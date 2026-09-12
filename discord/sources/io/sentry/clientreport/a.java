package io.sentry.clientreport;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.devsupport.StackTraceHelper;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.e3;
import io.sentry.l6;
import io.sentry.m6;
import io.sentry.n1;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.protocol.a0;
import io.sentry.protocol.e0;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.n;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.r;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.protocol.z;
import io.sentry.x1;
import io.sentry.x4;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import s0.g;
import xr.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12564a;

    public /* synthetic */ a(int i7) {
        this.f12564a = i7;
    }

    public static io.sentry.protocol.a b(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        io.sentry.protocol.a aVar = new io.sentry.protocol.a();
        ConcurrentHashMap concurrentHashMap = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            switch (strA0) {
                case "split_names":
                    List list = (List) x1Var.c0();
                    if (list == null) {
                        break;
                    } else {
                        aVar.J = list;
                        break;
                    }
                    break;
                case "device_app_hash":
                    aVar.f12909i = x1Var.l0();
                    break;
                case "start_type":
                    aVar.G = x1Var.l0();
                    break;
                case "view_names":
                    List list2 = (List) x1Var.c0();
                    if (list2 == null) {
                        break;
                    } else {
                        aVar.F = list2;
                        break;
                    }
                    break;
                case "app_version":
                    aVar.f12912x = x1Var.l0();
                    break;
                case "in_foreground":
                    aVar.H = x1Var.n();
                    break;
                case "build_type":
                    aVar.f12910v = x1Var.l0();
                    break;
                case "app_identifier":
                    aVar.f12907d = x1Var.l0();
                    break;
                case "app_start_time":
                    aVar.f12908e = x1Var.q(iLogger);
                    break;
                case "permissions":
                    aVar.E = m.F((Map) x1Var.c0());
                    break;
                case "app_name":
                    aVar.f12911w = x1Var.l0();
                    break;
                case "app_build":
                    aVar.f12913y = x1Var.l0();
                    break;
                case "is_split_apks":
                    aVar.I = x1Var.n();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x1Var.m0(iLogger, concurrentHashMap, strA0);
                    break;
            }
        }
        aVar.K = concurrentHashMap;
        x1Var.i();
        return aVar;
    }

    public static io.sentry.protocol.c c(x1 x1Var, ILogger iLogger) {
        byte b10;
        io.sentry.protocol.c cVar = new io.sentry.protocol.c();
        x1Var.f();
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            int i7 = 11;
            switch (strA0) {
                case "device":
                    b10 = 0;
                    break;
                case "spring":
                    b10 = 1;
                    break;
                case "response":
                    b10 = 2;
                    break;
                case "profile":
                    b10 = 3;
                    break;
                case "feedback":
                    b10 = 4;
                    break;
                case "os":
                    b10 = 5;
                    break;
                case "app":
                    b10 = 6;
                    break;
                case "gpu":
                    b10 = 7;
                    break;
                case "flags":
                    b10 = 8;
                    break;
                case "trace":
                    b10 = 9;
                    break;
                case "browser":
                    b10 = 10;
                    break;
                case "runtime":
                    b10 = 11;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            ArrayList arrayList = null;
            switch (b10) {
                case 0:
                    cVar.p(d(x1Var, iLogger));
                    break;
                case 1:
                    x1Var.f();
                    e0 e0Var = new e0();
                    ConcurrentHashMap concurrentHashMap = null;
                    while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strA1 = x1Var.a0();
                        strA1.getClass();
                        if (strA1.equals("active_profiles")) {
                            List list = (List) x1Var.c0();
                            if (list != null) {
                                String[] strArr = new String[list.size()];
                                list.toArray(strArr);
                                e0Var.f12935d = strArr;
                            }
                        } else {
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap, strA1);
                        }
                    }
                    e0Var.f12936e = concurrentHashMap;
                    x1Var.i();
                    cVar.v(e0Var);
                    break;
                case 2:
                    x1Var.f();
                    r rVar = new r();
                    ConcurrentHashMap concurrentHashMap2 = null;
                    while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strA2 = x1Var.a0();
                        strA2.getClass();
                        switch (strA2) {
                            case "status_code":
                                rVar.f13034i = x1Var.P();
                                break;
                            case "data":
                                rVar.f13036w = x1Var.c0();
                                break;
                            case "headers":
                                Map map = (Map) x1Var.c0();
                                if (map != null) {
                                    rVar.f13033e = m.F(map);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "cookies":
                                rVar.f13032d = x1Var.l0();
                                break;
                            case "body_size":
                                rVar.f13035v = x1Var.U();
                                break;
                            default:
                                if (concurrentHashMap2 == null) {
                                    concurrentHashMap2 = new ConcurrentHashMap();
                                }
                                x1Var.m0(iLogger, concurrentHashMap2, strA2);
                                break;
                        }
                    }
                    rVar.f13037x = concurrentHashMap2;
                    x1Var.i();
                    cVar.t(rVar);
                    break;
                case 3:
                    x1Var.f();
                    e3 e3Var = new e3(v.f13055e);
                    ConcurrentHashMap concurrentHashMap3 = null;
                    while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strA3 = x1Var.a0();
                        strA3.getClass();
                        if (strA3.equals("profiler_id")) {
                            v vVar = (v) x1Var.e0(iLogger, new a(23));
                            if (vVar != null) {
                                e3Var.f12637d = vVar;
                            }
                        } else {
                            if (concurrentHashMap3 == null) {
                                concurrentHashMap3 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap3, strA3);
                        }
                    }
                    e3Var.f12638e = concurrentHashMap3;
                    x1Var.i();
                    cVar.k(e3Var, "profile");
                    break;
                case 4:
                    cVar.k(e(x1Var, iLogger), "feedback");
                    break;
                case 5:
                    cVar.s(g(x1Var, iLogger));
                    break;
                case 6:
                    cVar.n(b(x1Var, iLogger));
                    break;
                case 7:
                    cVar.r(f(x1Var, iLogger));
                    break;
                case 8:
                    x1Var.f();
                    ConcurrentHashMap concurrentHashMap4 = null;
                    while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strA4 = x1Var.a0();
                        strA4.getClass();
                        if (strA4.equals("values")) {
                            arrayList = x1Var.Q(iLogger, new a(i7));
                        } else {
                            if (concurrentHashMap4 == null) {
                                concurrentHashMap4 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap4, strA4);
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    h hVar = new h(arrayList);
                    hVar.f12955e = concurrentHashMap4;
                    x1Var.i();
                    cVar.q(hVar);
                    break;
                case 9:
                    cVar.w(io.sentry.d.b(x1Var, iLogger));
                    break;
                case 10:
                    x1Var.f();
                    io.sentry.protocol.b bVar = new io.sentry.protocol.b();
                    ConcurrentHashMap concurrentHashMap5 = null;
                    while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strA5 = x1Var.a0();
                        strA5.getClass();
                        if (strA5.equals(StackTraceHelper.NAME_KEY)) {
                            bVar.f12919d = x1Var.l0();
                        } else if (strA5.equals("version")) {
                            bVar.f12920e = x1Var.l0();
                        } else {
                            if (concurrentHashMap5 == null) {
                                concurrentHashMap5 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap5, strA5);
                        }
                    }
                    bVar.f12921i = concurrentHashMap5;
                    x1Var.i();
                    cVar.o(bVar);
                    break;
                case 11:
                    x1Var.f();
                    x xVar = new x();
                    ConcurrentHashMap concurrentHashMap6 = null;
                    while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                        String strA6 = x1Var.a0();
                        strA6.getClass();
                        switch (strA6) {
                            case "raw_description":
                                xVar.f13062i = x1Var.l0();
                                break;
                            case "name":
                                xVar.f13060d = x1Var.l0();
                                break;
                            case "version":
                                xVar.f13061e = x1Var.l0();
                                break;
                            default:
                                if (concurrentHashMap6 == null) {
                                    concurrentHashMap6 = new ConcurrentHashMap();
                                }
                                x1Var.m0(iLogger, concurrentHashMap6, strA6);
                                break;
                        }
                    }
                    xVar.f13063v = concurrentHashMap6;
                    x1Var.i();
                    cVar.u(xVar);
                    break;
                default:
                    Object objC0 = x1Var.c0();
                    if (objC0 != null) {
                        cVar.k(objC0, strA0);
                    }
                    break;
            }
        }
        x1Var.i();
        return cVar;
    }

    public static io.sentry.protocol.f d(x1 x1Var, ILogger iLogger) throws IOException {
        TimeZone timeZone;
        x1Var.f();
        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
        ConcurrentHashMap concurrentHashMap = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            int i7 = 10;
            switch (strA0) {
                case "timezone":
                    switch (x1Var.f13271d) {
                        case 0:
                            io.sentry.vendor.gson.stream.a aVar = (io.sentry.vendor.gson.stream.a) x1Var.f13272e;
                            if (aVar.j0() != io.sentry.vendor.gson.stream.b.NULL) {
                                try {
                                    timeZone = DesugarTimeZone.getTimeZone(aVar.c0());
                                } catch (Exception e10) {
                                    iLogger.g(SentryLevel.ERROR, "Error when deserializing TimeZone", e10);
                                }
                            } else {
                                aVar.Y();
                            }
                            break;
                        default:
                            String str = (String) x1Var.n0();
                            timeZone = str == null ? null : DesugarTimeZone.getTimeZone(str);
                            break;
                    }
                    fVar.W = timeZone;
                    break;
                case "boot_time":
                    if (x1Var.o0() == io.sentry.vendor.gson.stream.b.STRING) {
                        fVar.V = x1Var.q(iLogger);
                        break;
                    } else {
                        break;
                    }
                    break;
                case "simulator":
                    fVar.I = x1Var.n();
                    break;
                case "manufacturer":
                    fVar.f12941e = x1Var.l0();
                    break;
                case "processor_count":
                    fVar.f12937b0 = x1Var.P();
                    break;
                case "orientation":
                    fVar.H = (io.sentry.protocol.e) x1Var.e0(iLogger, new a(i7));
                    break;
                case "battery_temperature":
                    fVar.a0 = x1Var.B();
                    break;
                case "family":
                    fVar.f12945v = x1Var.l0();
                    break;
                case "locale":
                    fVar.Y = x1Var.l0();
                    break;
                case "online":
                    fVar.G = x1Var.n();
                    break;
                case "battery_level":
                    fVar.E = x1Var.B();
                    break;
                case "model_id":
                    fVar.f12947x = x1Var.l0();
                    break;
                case "screen_density":
                    fVar.T = x1Var.B();
                    break;
                case "screen_dpi":
                    fVar.U = x1Var.P();
                    break;
                case "free_memory":
                    fVar.K = x1Var.U();
                    break;
                case "id":
                    fVar.X = x1Var.l0();
                    break;
                case "name":
                    fVar.f12939d = x1Var.l0();
                    break;
                case "low_memory":
                    fVar.M = x1Var.n();
                    break;
                case "archs":
                    List list = (List) x1Var.c0();
                    if (list != null) {
                        String[] strArr = new String[list.size()];
                        list.toArray(strArr);
                        fVar.f12948y = strArr;
                        break;
                    } else {
                        break;
                    }
                    break;
                case "brand":
                    fVar.f12944i = x1Var.l0();
                    break;
                case "model":
                    fVar.f12946w = x1Var.l0();
                    break;
                case "cpu_description":
                    fVar.f12940d0 = x1Var.l0();
                    break;
                case "processor_frequency":
                    fVar.f12938c0 = x1Var.y();
                    break;
                case "connection_type":
                    fVar.Z = x1Var.l0();
                    break;
                case "chipset":
                    fVar.f12942e0 = x1Var.l0();
                    break;
                case "screen_width_pixels":
                    fVar.R = x1Var.P();
                    break;
                case "external_storage_size":
                    fVar.P = x1Var.U();
                    break;
                case "storage_size":
                    fVar.N = x1Var.U();
                    break;
                case "usable_memory":
                    fVar.L = x1Var.U();
                    break;
                case "memory_size":
                    fVar.J = x1Var.U();
                    break;
                case "charging":
                    fVar.F = x1Var.n();
                    break;
                case "external_free_storage":
                    fVar.Q = x1Var.U();
                    break;
                case "free_storage":
                    fVar.O = x1Var.U();
                    break;
                case "screen_height_pixels":
                    fVar.S = x1Var.P();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x1Var.m0(iLogger, concurrentHashMap, strA0);
                    break;
            }
        }
        fVar.f12943f0 = concurrentHashMap;
        x1Var.i();
        return fVar;
    }

    public static i e(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        String strL0 = null;
        String strL1 = null;
        String strL2 = null;
        v vVar = null;
        v vVar2 = null;
        String strL3 = null;
        HashMap map = null;
        while (true) {
            if (x1Var.o0() != io.sentry.vendor.gson.stream.b.NAME) {
                x1Var.i();
                if (strL0 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"message\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"message\"", illegalStateException);
                    throw illegalStateException;
                }
                i iVar = new i();
                if (strL0.length() > 4096) {
                    iVar.f12963d = strL0.substring(0, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                } else {
                    iVar.f12963d = strL0;
                }
                iVar.f12964e = strL1;
                iVar.f12965i = strL2;
                iVar.f12966v = vVar;
                iVar.f12967w = vVar2;
                iVar.f12968x = strL3;
                iVar.f12969y = map;
                return iVar;
            }
            String strA0 = x1Var.a0();
            strA0.getClass();
            switch (strA0) {
                case "associated_event_id":
                    vVar = new v(x1Var.j0());
                    break;
                case "replay_id":
                    vVar2 = new v(x1Var.j0());
                    break;
                case "url":
                    strL3 = x1Var.l0();
                    break;
                case "name":
                    strL2 = x1Var.l0();
                    break;
                case "contact_email":
                    strL1 = x1Var.l0();
                    break;
                case "message":
                    strL0 = x1Var.l0();
                    break;
                default:
                    if (map == null) {
                        map = new HashMap();
                    }
                    x1Var.m0(iLogger, map, strA0);
                    break;
            }
        }
    }

    public static k f(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        k kVar = new k();
        ConcurrentHashMap concurrentHashMap = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            switch (strA0) {
                case "npot_support":
                    kVar.F = x1Var.l0();
                    break;
                case "vendor_id":
                    kVar.f12986i = x1Var.l0();
                    break;
                case "multi_threaded_rendering":
                    kVar.f12990y = x1Var.n();
                    break;
                case "id":
                    kVar.f12985e = x1Var.P();
                    break;
                case "name":
                    kVar.f12984d = x1Var.l0();
                    break;
                case "vendor_name":
                    kVar.f12987v = x1Var.l0();
                    break;
                case "version":
                    kVar.E = x1Var.l0();
                    break;
                case "api_type":
                    kVar.f12989x = x1Var.l0();
                    break;
                case "memory_size":
                    kVar.f12988w = x1Var.P();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x1Var.m0(iLogger, concurrentHashMap, strA0);
                    break;
            }
        }
        kVar.G = concurrentHashMap;
        x1Var.i();
        return kVar;
    }

    public static o g(x1 x1Var, ILogger iLogger) throws IOException {
        x1Var.f();
        o oVar = new o();
        ConcurrentHashMap concurrentHashMap = null;
        while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
            String strA0 = x1Var.a0();
            strA0.getClass();
            switch (strA0) {
                case "rooted":
                    oVar.f13011x = x1Var.n();
                    break;
                case "raw_description":
                    oVar.f13008i = x1Var.l0();
                    break;
                case "name":
                    oVar.f13006d = x1Var.l0();
                    break;
                case "build":
                    oVar.f13009v = x1Var.l0();
                    break;
                case "version":
                    oVar.f13007e = x1Var.l0();
                    break;
                case "kernel_version":
                    oVar.f13010w = x1Var.l0();
                    break;
                default:
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    x1Var.m0(iLogger, concurrentHashMap, strA0);
                    break;
            }
        }
        oVar.f13012y = concurrentHashMap;
        x1Var.i();
        return oVar;
    }

    public static IllegalStateException h(String str, ILogger iLogger) {
        String strE = g.e("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strE);
        iLogger.g(SentryLevel.ERROR, strE, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException i(String str, ILogger iLogger) {
        String strE = g.e("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strE);
        iLogger.g(SentryLevel.ERROR, strE, illegalStateException);
        return illegalStateException;
    }

    public static IllegalStateException j(String str, ILogger iLogger) {
        String strE = g.e("Missing required field \"", str, "\"");
        IllegalStateException illegalStateException = new IllegalStateException(strE);
        iLogger.g(SentryLevel.ERROR, strE, illegalStateException);
        return illegalStateException;
    }

    @Override // io.sentry.n1
    public final Object a(x1 x1Var, ILogger iLogger) throws IOException {
        Double dValueOf;
        int i7 = 7;
        int i10 = 3;
        int i11 = 1;
        Boolean boolN = null;
        switch (this.f12564a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                x1Var.f();
                Date dateQ = null;
                HashMap map = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA0 = x1Var.a0();
                    strA0.getClass();
                    if (strA0.equals("discarded_events")) {
                        arrayList.addAll(x1Var.Q(iLogger, new a(i11)));
                    } else if (strA0.equals("timestamp")) {
                        dateQ = x1Var.q(iLogger);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        x1Var.m0(iLogger, map, strA0);
                    }
                }
                x1Var.i();
                if (dateQ == null) {
                    throw h("timestamp", iLogger);
                }
                if (arrayList.isEmpty()) {
                    throw h("discarded_events", iLogger);
                }
                b bVar = new b(dateQ, arrayList);
                bVar.f12567i = map;
                return bVar;
            case 1:
                x1Var.f();
                String strL0 = null;
                String strL1 = null;
                Long lU = null;
                HashMap map2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA1 = x1Var.a0();
                    strA1.getClass();
                    switch (strA1) {
                        case "quantity":
                            lU = x1Var.U();
                            break;
                        case "reason":
                            strL0 = x1Var.l0();
                            break;
                        case "category":
                            strL1 = x1Var.l0();
                            break;
                        default:
                            if (map2 == null) {
                                map2 = new HashMap();
                            }
                            x1Var.m0(iLogger, map2, strA1);
                            break;
                    }
                }
                x1Var.i();
                if (strL0 == null) {
                    throw i("reason", iLogger);
                }
                if (strL1 == null) {
                    throw i("category", iLogger);
                }
                if (lU == null) {
                    throw i("quantity", iLogger);
                }
                e eVar = new e(lU, strL0, strL1);
                eVar.f12573v = map2;
                return eVar;
            case 2:
                x1Var.f();
                io.sentry.profilemeasurements.a aVar = new io.sentry.profilemeasurements.a("unknown", new ArrayList());
                ConcurrentHashMap concurrentHashMap = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA2 = x1Var.a0();
                    strA2.getClass();
                    if (strA2.equals("values")) {
                        ArrayList arrayListQ = x1Var.Q(iLogger, new a(i10));
                        if (arrayListQ != null) {
                            aVar.f12895i = arrayListQ;
                        }
                    } else if (strA2.equals("unit")) {
                        String strL2 = x1Var.l0();
                        if (strL2 != null) {
                            aVar.f12894e = strL2;
                        }
                    } else {
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        x1Var.m0(iLogger, concurrentHashMap, strA2);
                    }
                }
                aVar.f12893d = concurrentHashMap;
                x1Var.i();
                return aVar;
            case 3:
                x1Var.f();
                io.sentry.profilemeasurements.b bVar2 = new io.sentry.profilemeasurements.b(0L, 0, 0L);
                ConcurrentHashMap concurrentHashMap2 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA3 = x1Var.a0();
                    strA3.getClass();
                    switch (strA3) {
                        case "elapsed_since_start_ns":
                            String strL3 = x1Var.l0();
                            if (strL3 != null) {
                                bVar2.f12898i = strL3;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "timestamp":
                            try {
                                dValueOf = x1Var.y();
                                break;
                            } catch (NumberFormatException unused) {
                                Date dateQ2 = x1Var.q(iLogger);
                                dValueOf = dateQ2 != null ? Double.valueOf(dateQ2.getTime() / 1000.0d) : null;
                            }
                            if (dValueOf != null) {
                                bVar2.f12897e = dValueOf.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "value":
                            Double dY = x1Var.y();
                            if (dY != null) {
                                bVar2.f12899v = dY.doubleValue();
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (concurrentHashMap2 == null) {
                                concurrentHashMap2 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap2, strA3);
                            break;
                    }
                }
                bVar2.f12896d = concurrentHashMap2;
                x1Var.i();
                return bVar2;
            case 4:
                return b(x1Var, iLogger);
            case 5:
                x1Var.f();
                io.sentry.protocol.b bVar3 = new io.sentry.protocol.b();
                ConcurrentHashMap concurrentHashMap3 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA4 = x1Var.a0();
                    strA4.getClass();
                    if (strA4.equals(StackTraceHelper.NAME_KEY)) {
                        bVar3.f12919d = x1Var.l0();
                    } else if (strA4.equals("version")) {
                        bVar3.f12920e = x1Var.l0();
                    } else {
                        if (concurrentHashMap3 == null) {
                            concurrentHashMap3 = new ConcurrentHashMap();
                        }
                        x1Var.m0(iLogger, concurrentHashMap3, strA4);
                    }
                }
                bVar3.f12921i = concurrentHashMap3;
                x1Var.i();
                return bVar3;
            case 6:
                return c(x1Var, iLogger);
            case 7:
                DebugImage debugImage = new DebugImage();
                x1Var.f();
                AbstractMap map3 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA5 = x1Var.a0();
                    strA5.getClass();
                    switch (strA5) {
                        case "debug_file":
                            debugImage.debugFile = x1Var.l0();
                            break;
                        case "image_addr":
                            debugImage.imageAddr = x1Var.l0();
                            break;
                        case "image_size":
                            debugImage.imageSize = x1Var.U();
                            break;
                        case "code_file":
                            debugImage.codeFile = x1Var.l0();
                            break;
                        case "arch":
                            debugImage.arch = x1Var.l0();
                            break;
                        case "type":
                            debugImage.type = x1Var.l0();
                            break;
                        case "uuid":
                            debugImage.uuid = x1Var.l0();
                            break;
                        case "debug_id":
                            debugImage.debugId = x1Var.l0();
                            break;
                        case "code_id":
                            debugImage.codeId = x1Var.l0();
                            break;
                        default:
                            if (map3 == null) {
                                map3 = new HashMap();
                            }
                            x1Var.m0(iLogger, map3, strA5);
                            break;
                    }
                }
                x1Var.i();
                debugImage.setUnknown(map3);
                return debugImage;
            case 8:
                io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                x1Var.f();
                HashMap map4 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA6 = x1Var.a0();
                    strA6.getClass();
                    if (strA6.equals("images")) {
                        dVar.f12933e = x1Var.Q(iLogger, new a(i7));
                    } else if (strA6.equals("sdk_info")) {
                        dVar.f12932d = (s) x1Var.e0(iLogger, new a(20));
                    } else {
                        if (map4 == null) {
                            map4 = new HashMap();
                        }
                        x1Var.m0(iLogger, map4, strA6);
                    }
                }
                x1Var.i();
                dVar.f12934i = map4;
                return dVar;
            case 9:
                return d(x1Var, iLogger);
            case 10:
                return io.sentry.protocol.e.valueOf(x1Var.j0().toUpperCase(Locale.ROOT));
            case 11:
                x1Var.f();
                String strL4 = null;
                ConcurrentHashMap concurrentHashMap4 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA7 = x1Var.a0();
                    strA7.getClass();
                    if (strA7.equals("result")) {
                        boolN = x1Var.n();
                    } else if (strA7.equals("flag")) {
                        strL4 = x1Var.l0();
                    } else {
                        if (concurrentHashMap4 == null) {
                            concurrentHashMap4 = new ConcurrentHashMap();
                        }
                        x1Var.m0(iLogger, concurrentHashMap4, strA7);
                    }
                }
                if (strL4 == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"flag\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"flag\"", illegalStateException);
                    throw illegalStateException;
                }
                if (boolN == null) {
                    IllegalStateException illegalStateException2 = new IllegalStateException("Missing required field \"result\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"result\"", illegalStateException2);
                    throw illegalStateException2;
                }
                boolean zBooleanValue = boolN.booleanValue();
                io.sentry.protocol.g gVar = new io.sentry.protocol.g();
                gVar.f12951d = strL4;
                gVar.f12952e = zBooleanValue;
                gVar.f12953i = concurrentHashMap4;
                x1Var.i();
                return gVar;
            case 12:
                return e(x1Var, iLogger);
            case 13:
                x1Var.f();
                j jVar = new j();
                ConcurrentHashMap concurrentHashMap5 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA8 = x1Var.a0();
                    strA8.getClass();
                    switch (strA8) {
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
                            x1Var.m0(iLogger, concurrentHashMap5, strA8);
                            break;
                    }
                }
                jVar.f12976v = concurrentHashMap5;
                x1Var.i();
                return jVar;
            case 14:
                return f(x1Var, iLogger);
            case 15:
                x1Var.f();
                Number number = null;
                String strL5 = null;
                AbstractMap concurrentHashMap6 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA9 = x1Var.a0();
                    strA9.getClass();
                    if (strA9.equals("unit")) {
                        strL5 = x1Var.l0();
                    } else if (strA9.equals("value")) {
                        number = (Number) x1Var.c0();
                    } else {
                        if (concurrentHashMap6 == null) {
                            concurrentHashMap6 = new ConcurrentHashMap();
                        }
                        x1Var.m0(iLogger, concurrentHashMap6, strA9);
                    }
                }
                x1Var.i();
                if (number != null) {
                    l lVar = new l(number, strL5);
                    lVar.f12994v = concurrentHashMap6;
                    return lVar;
                }
                IllegalStateException illegalStateException3 = new IllegalStateException("Missing required field \"value\"");
                iLogger.g(SentryLevel.ERROR, "Missing required field \"value\"", illegalStateException3);
                throw illegalStateException3;
            case 16:
                io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                x1Var.f();
                HashMap map5 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA10 = x1Var.a0();
                    strA10.getClass();
                    switch (strA10) {
                        case "description":
                            mVar.f12996e = x1Var.l0();
                            break;
                        case "exception_id":
                            mVar.E = x1Var.P();
                            break;
                        case "data":
                            mVar.f13000x = m.F((Map) x1Var.c0());
                            break;
                        case "meta":
                            mVar.f12999w = m.F((Map) x1Var.c0());
                            break;
                        case "type":
                            mVar.f12995d = x1Var.l0();
                            break;
                        case "handled":
                            mVar.f12998v = x1Var.n();
                            break;
                        case "synthetic":
                            mVar.f13001y = x1Var.n();
                            break;
                        case "is_exception_group":
                            mVar.G = x1Var.n();
                            break;
                        case "help_link":
                            mVar.f12997i = x1Var.l0();
                            break;
                        case "parent_id":
                            mVar.F = x1Var.P();
                            break;
                        default:
                            if (map5 == null) {
                                map5 = new HashMap();
                            }
                            x1Var.m0(iLogger, map5, strA10);
                            break;
                    }
                }
                x1Var.i();
                mVar.H = map5;
                return mVar;
            case 17:
                x1Var.f();
                n nVar = new n();
                ConcurrentHashMap concurrentHashMap7 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA11 = x1Var.a0();
                    strA11.getClass();
                    switch (strA11) {
                        case "params":
                            List list = (List) x1Var.c0();
                            if (list != null) {
                                nVar.f13004i = list;
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "message":
                            nVar.f13003e = x1Var.l0();
                            break;
                        case "formatted":
                            nVar.f13002d = x1Var.l0();
                            break;
                        default:
                            if (concurrentHashMap7 == null) {
                                concurrentHashMap7 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap7, strA11);
                            break;
                    }
                }
                nVar.f13005v = concurrentHashMap7;
                x1Var.i();
                return nVar;
            case 18:
                return g(x1Var, iLogger);
            case 19:
                x1Var.f();
                p pVar = new p();
                ConcurrentHashMap concurrentHashMap8 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA12 = x1Var.a0();
                    strA12.getClass();
                    switch (strA12) {
                        case "fragment":
                            pVar.G = x1Var.l0();
                            break;
                        case "method":
                            pVar.f13014e = x1Var.l0();
                            break;
                        case "env":
                            Map map6 = (Map) x1Var.c0();
                            if (map6 != null) {
                                pVar.f13019y = m.F(map6);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "url":
                            pVar.f13013d = x1Var.l0();
                            break;
                        case "data":
                            pVar.f13016v = x1Var.c0();
                            break;
                        case "other":
                            Map map7 = (Map) x1Var.c0();
                            if (map7 != null) {
                                pVar.F = m.F(map7);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "headers":
                            Map map8 = (Map) x1Var.c0();
                            if (map8 != null) {
                                pVar.f13018x = m.F(map8);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "cookies":
                            pVar.f13017w = x1Var.l0();
                            break;
                        case "body_size":
                            pVar.E = x1Var.U();
                            break;
                        case "query_string":
                            pVar.f13015i = x1Var.l0();
                            break;
                        case "api_target":
                            pVar.H = x1Var.l0();
                            break;
                        default:
                            if (concurrentHashMap8 == null) {
                                concurrentHashMap8 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap8, strA12);
                            break;
                    }
                }
                pVar.I = concurrentHashMap8;
                x1Var.i();
                return pVar;
            case 20:
                s sVar = new s();
                x1Var.f();
                HashMap map9 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA13 = x1Var.a0();
                    strA13.getClass();
                    switch (strA13) {
                        case "sdk_name":
                            sVar.f13038d = x1Var.l0();
                            break;
                        case "version_patchlevel":
                            sVar.f13041v = x1Var.P();
                            break;
                        case "version_major":
                            sVar.f13039e = x1Var.P();
                            break;
                        case "version_minor":
                            sVar.f13040i = x1Var.P();
                            break;
                        default:
                            if (map9 == null) {
                                map9 = new HashMap();
                            }
                            x1Var.m0(iLogger, map9, strA13);
                            break;
                    }
                }
                x1Var.i();
                sVar.f13042w = map9;
                return sVar;
            case 21:
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                x1Var.f();
                String strJ0 = null;
                String strJ1 = null;
                HashMap map10 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA14 = x1Var.a0();
                    strA14.getClass();
                    switch (strA14) {
                        case "name":
                            strJ0 = x1Var.j0();
                            break;
                        case "version":
                            strJ1 = x1Var.j0();
                            break;
                        case "packages":
                            ArrayList arrayListQ2 = x1Var.Q(iLogger, new a(24));
                            if (arrayListQ2 != null) {
                                arrayList2.addAll(arrayListQ2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "integrations":
                            List list2 = (List) x1Var.c0();
                            if (list2 != null) {
                                arrayList3.addAll(list2);
                                break;
                            } else {
                                break;
                            }
                            break;
                        default:
                            if (map10 == null) {
                                map10 = new HashMap();
                            }
                            x1Var.m0(iLogger, map10, strA14);
                            break;
                    }
                }
                x1Var.i();
                if (strJ0 == null) {
                    IllegalStateException illegalStateException4 = new IllegalStateException("Missing required field \"name\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException4);
                    throw illegalStateException4;
                }
                if (strJ1 == null) {
                    IllegalStateException illegalStateException5 = new IllegalStateException("Missing required field \"version\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"version\"", illegalStateException5);
                    throw illegalStateException5;
                }
                t tVar = new t(strJ0, strJ1);
                tVar.f13045i = new CopyOnWriteArraySet(arrayList2);
                tVar.f13046v = new CopyOnWriteArraySet(arrayList3);
                tVar.f13047w = map10;
                return tVar;
            case 22:
                u uVar = new u();
                x1Var.f();
                HashMap map11 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA15 = x1Var.a0();
                    strA15.getClass();
                    switch (strA15) {
                        case "thread_id":
                            uVar.f13051v = x1Var.U();
                            break;
                        case "module":
                            uVar.f13050i = x1Var.l0();
                            break;
                        case "type":
                            uVar.f13048d = x1Var.l0();
                            break;
                        case "value":
                            uVar.f13049e = x1Var.l0();
                            break;
                        case "mechanism":
                            uVar.f13053x = (io.sentry.protocol.m) x1Var.e0(iLogger, new a(16));
                            break;
                        case "stacktrace":
                            uVar.f13052w = (a0) x1Var.e0(iLogger, new a(28));
                            break;
                        default:
                            if (map11 == null) {
                                map11 = new HashMap();
                            }
                            x1Var.m0(iLogger, map11, strA15);
                            break;
                    }
                }
                x1Var.i();
                uVar.f13054y = map11;
                return uVar;
            case 23:
                return new v(x1Var.j0());
            case 24:
                x1Var.f();
                String strJ2 = null;
                String strJ3 = null;
                HashMap map12 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA16 = x1Var.a0();
                    strA16.getClass();
                    if (strA16.equals(StackTraceHelper.NAME_KEY)) {
                        strJ2 = x1Var.j0();
                    } else if (strA16.equals("version")) {
                        strJ3 = x1Var.j0();
                    } else {
                        if (map12 == null) {
                            map12 = new HashMap();
                        }
                        x1Var.m0(iLogger, map12, strA16);
                    }
                }
                x1Var.i();
                if (strJ2 == null) {
                    IllegalStateException illegalStateException6 = new IllegalStateException("Missing required field \"name\"");
                    iLogger.g(SentryLevel.ERROR, "Missing required field \"name\"", illegalStateException6);
                    throw illegalStateException6;
                }
                if (strJ3 != null) {
                    w wVar = new w(strJ2, strJ3);
                    wVar.f13059i = map12;
                    return wVar;
                }
                IllegalStateException illegalStateException7 = new IllegalStateException("Missing required field \"version\"");
                iLogger.g(SentryLevel.ERROR, "Missing required field \"version\"", illegalStateException7);
                throw illegalStateException7;
            case 25:
                x1Var.f();
                x xVar = new x();
                ConcurrentHashMap concurrentHashMap9 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA17 = x1Var.a0();
                    strA17.getClass();
                    switch (strA17) {
                        case "raw_description":
                            xVar.f13062i = x1Var.l0();
                            break;
                        case "name":
                            xVar.f13060d = x1Var.l0();
                            break;
                        case "version":
                            xVar.f13061e = x1Var.l0();
                            break;
                        default:
                            if (concurrentHashMap9 == null) {
                                concurrentHashMap9 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap9, strA17);
                            break;
                    }
                }
                xVar.f13063v = concurrentHashMap9;
                x1Var.i();
                return xVar;
            case 26:
                x1Var.f();
                ConcurrentHashMap concurrentHashMap10 = null;
                Map map13 = null;
                HashMap map14 = null;
                Double dValueOf2 = null;
                Double dValueOf3 = null;
                v vVar = null;
                l6 l6Var = null;
                l6 l6Var2 = null;
                String strL6 = null;
                String strL7 = null;
                m6 m6Var = null;
                String strL8 = null;
                Map map15 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA18 = x1Var.a0();
                    strA18.getClass();
                    switch (strA18) {
                        case "span_id":
                            l6Var = new l6(x1Var.j0());
                            break;
                        case "parent_span_id":
                            l6Var2 = (l6) x1Var.e0(iLogger, new io.sentry.d(23));
                            break;
                        case "description":
                            strL7 = x1Var.l0();
                            break;
                        case "start_timestamp":
                            try {
                                dValueOf2 = x1Var.y();
                                break;
                            } catch (NumberFormatException unused2) {
                                Date dateQ3 = x1Var.q(iLogger);
                                dValueOf2 = dateQ3 == null ? null : Double.valueOf(dateQ3.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "origin":
                            strL8 = x1Var.l0();
                            break;
                        case "status":
                            m6Var = (m6) x1Var.e0(iLogger, new io.sentry.d(24));
                            break;
                        case "measurements":
                            map14 = x1Var.Y(iLogger, new a(15));
                            break;
                        case "op":
                            strL6 = x1Var.l0();
                            break;
                        case "data":
                            map15 = (Map) x1Var.c0();
                            break;
                        case "tags":
                            map13 = (Map) x1Var.c0();
                            break;
                        case "timestamp":
                            try {
                                dValueOf3 = x1Var.y();
                                break;
                            } catch (NumberFormatException unused3) {
                                Date dateQ4 = x1Var.q(iLogger);
                                dValueOf3 = dateQ4 == null ? null : Double.valueOf(dateQ4.getTime() / 1000.0d);
                                break;
                            }
                            break;
                        case "trace_id":
                            vVar = new v(x1Var.j0());
                            break;
                        default:
                            if (concurrentHashMap10 == null) {
                                concurrentHashMap10 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap10, strA18);
                            break;
                    }
                }
                if (dValueOf2 == null) {
                    throw j("start_timestamp", iLogger);
                }
                if (vVar == null) {
                    throw j("trace_id", iLogger);
                }
                if (l6Var == null) {
                    throw j("span_id", iLogger);
                }
                if (strL6 == null) {
                    throw j("op", iLogger);
                }
                if (map13 == null) {
                    map13 = new HashMap();
                }
                Map map16 = map13;
                if (map14 == null) {
                    map14 = new HashMap();
                }
                y yVar = new y(dValueOf2, dValueOf3, vVar, l6Var, l6Var2, strL6, strL7, m6Var, strL8, map16, map14, map15);
                yVar.J = concurrentHashMap10;
                x1Var.i();
                return yVar;
            case 27:
                SentryStackFrame sentryStackFrame = new SentryStackFrame();
                x1Var.f();
                ConcurrentHashMap concurrentHashMap11 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA19 = x1Var.a0();
                    strA19.getClass();
                    switch (strA19) {
                        case "post_context":
                            sentryStackFrame.f12901e = (List) x1Var.c0();
                            break;
                        case "image_addr":
                            sentryStackFrame.L = x1Var.l0();
                            break;
                        case "in_app":
                            sentryStackFrame.H = x1Var.n();
                            break;
                        case "raw_function":
                            sentryStackFrame.R = x1Var.l0();
                            break;
                        case "lineno":
                            sentryStackFrame.f12906y = x1Var.P();
                            break;
                        case "module":
                            sentryStackFrame.f12905x = x1Var.l0();
                            break;
                        case "native":
                            sentryStackFrame.J = x1Var.n();
                            break;
                        case "symbol":
                            sentryStackFrame.P = x1Var.l0();
                            break;
                        case "package":
                            sentryStackFrame.I = x1Var.l0();
                            break;
                        case "filename":
                            sentryStackFrame.f12903v = x1Var.l0();
                            break;
                        case "symbol_addr":
                            sentryStackFrame.M = x1Var.l0();
                            break;
                        case "lock":
                            sentryStackFrame.S = (x4) x1Var.e0(iLogger, new io.sentry.d(12));
                            break;
                        case "vars":
                            sentryStackFrame.f12902i = (Map) x1Var.c0();
                            break;
                        case "colno":
                            sentryStackFrame.E = x1Var.P();
                            break;
                        case "instruction_addr":
                            sentryStackFrame.N = x1Var.l0();
                            break;
                        case "pre_context":
                            sentryStackFrame.f12900d = (List) x1Var.c0();
                            break;
                        case "addr_mode":
                            sentryStackFrame.O = x1Var.l0();
                            break;
                        case "context_line":
                            sentryStackFrame.G = x1Var.l0();
                            break;
                        case "function":
                            sentryStackFrame.f12904w = x1Var.l0();
                            break;
                        case "abs_path":
                            sentryStackFrame.F = x1Var.l0();
                            break;
                        case "platform":
                            sentryStackFrame.K = x1Var.l0();
                            break;
                        default:
                            if (concurrentHashMap11 == null) {
                                concurrentHashMap11 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap11, strA19);
                            break;
                    }
                }
                sentryStackFrame.Q = concurrentHashMap11;
                x1Var.i();
                return sentryStackFrame;
            case 28:
                a0 a0Var = new a0();
                x1Var.f();
                ConcurrentHashMap concurrentHashMap12 = null;
                while (x1Var.o0() == io.sentry.vendor.gson.stream.b.NAME) {
                    String strA20 = x1Var.a0();
                    strA20.getClass();
                    switch (strA20) {
                        case "frames":
                            a0Var.f12914d = x1Var.Q(iLogger, new a(27));
                            break;
                        case "instruction_addr_adjustment":
                            a0Var.f12917v = (z) x1Var.e0(iLogger, new a(29));
                            break;
                        case "registers":
                            a0Var.f12915e = m.F((Map) x1Var.c0());
                            break;
                        case "snapshot":
                            a0Var.f12916i = x1Var.n();
                            break;
                        default:
                            if (concurrentHashMap12 == null) {
                                concurrentHashMap12 = new ConcurrentHashMap();
                            }
                            x1Var.m0(iLogger, concurrentHashMap12, strA20);
                            break;
                    }
                }
                a0Var.f12918w = concurrentHashMap12;
                x1Var.i();
                return a0Var;
            default:
                return z.valueOf(x1Var.j0().toUpperCase(Locale.ROOT));
        }
    }
}
