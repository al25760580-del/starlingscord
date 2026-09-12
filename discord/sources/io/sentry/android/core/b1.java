package io.sentry.android.core;

import androidx.appcompat.widget.b4;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.b2;
import io.sentry.j6;
import io.sentry.l6;
import io.sentry.m6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 implements io.sentry.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b4 f12154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SentryAndroidOptions f12155e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.util.a f12156i = new io.sentry.util.a();

    public b1(SentryAndroidOptions sentryAndroidOptions, b4 b4Var) {
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12155e = sentryAndroidOptions;
        this.f12154d = b4Var;
    }

    public static void a(io.sentry.android.core.performance.f fVar, io.sentry.protocol.d0 d0Var) {
        l6 l6Var;
        if (fVar.f12376d != io.sentry.android.core.performance.e.COLD) {
            return;
        }
        io.sentry.protocol.c cVar = d0Var.f12671e;
        ArrayList arrayList = d0Var.P;
        j6 j6VarI = cVar.i();
        if (j6VarI == null) {
            return;
        }
        io.sentry.protocol.v vVar = j6VarI.f12782d;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                l6Var = null;
                break;
            }
            io.sentry.protocol.y yVar = (io.sentry.protocol.y) it.next();
            if (yVar.f13069x.contentEquals("app.start.cold")) {
                l6Var = yVar.f13067v;
                break;
            }
        }
        io.sentry.android.core.performance.g gVar = new io.sentry.android.core.performance.g();
        io.sentry.android.core.performance.g gVar2 = fVar.f12378i;
        long j = gVar2.f12384e;
        long j5 = gVar2.f12385i;
        long j7 = io.sentry.android.core.performance.f.L;
        gVar.f12383d = "Process Initialization";
        gVar.f12384e = j;
        gVar.f12385i = j5;
        gVar.f12386v = j7;
        if (gVar.c() && Math.abs(gVar.a()) <= 10000) {
            arrayList.add(e(gVar, l6Var, vVar, "process.load"));
        }
        ArrayList arrayList2 = new ArrayList(fVar.f12381x.values());
        Collections.sort(arrayList2);
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(e((io.sentry.android.core.performance.g) it2.next(), l6Var, vVar, "contentprovider.load"));
            }
        }
        io.sentry.android.core.performance.g gVar3 = fVar.f12380w;
        if (gVar3.f12386v != 0) {
            arrayList.add(e(gVar3, l6Var, vVar, "application.load"));
        }
    }

    public static boolean b(io.sentry.protocol.d0 d0Var) {
        for (io.sentry.protocol.y yVar : d0Var.P) {
            if (yVar.f13069x.contentEquals("app.start.cold") || yVar.f13069x.contentEquals("app.start.warm")) {
                return true;
            }
        }
        j6 j6VarI = d0Var.f12671e.i();
        if (j6VarI == null) {
            return false;
        }
        String str = j6VarI.f12786w;
        return str.equals("app.start.cold") || str.equals("app.start.warm");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    public static void d(io.sentry.protocol.d0 d0Var) {
        boolean z5;
        Double d6;
        Double d7;
        Object obj;
        ArrayList<io.sentry.protocol.y> arrayList = d0Var.P;
        io.sentry.protocol.y yVar = null;
        io.sentry.protocol.y yVar2 = null;
        for (io.sentry.protocol.y yVar3 : arrayList) {
            if ("ui.load.initial_display".equals(yVar3.f13069x)) {
                yVar = yVar3;
            } else if ("ui.load.full_display".equals(yVar3.f13069x)) {
                yVar2 = yVar3;
            }
            if (yVar != null && yVar2 != null) {
                break;
            }
        }
        if (yVar == null && yVar2 == null) {
            return;
        }
        for (io.sentry.protocol.y yVar4 : arrayList) {
            if (yVar4 != yVar && yVar4 != yVar2) {
                Map map = yVar4.H;
                Double d8 = yVar4.f13064d;
                boolean z6 = false;
                boolean z7 = map == null || (obj = map.get("thread.name")) == null || "main".equals(obj);
                if (yVar != null) {
                    double dDoubleValue = d8.doubleValue();
                    if (dDoubleValue < yVar.f13064d.doubleValue() || (((d7 = yVar.f13065e) != null && dDoubleValue > d7.doubleValue()) || !z7)) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                } else {
                    z5 = false;
                }
                if (yVar2 != null) {
                    double dDoubleValue2 = d8.doubleValue();
                    if (dDoubleValue2 >= yVar2.f13064d.doubleValue() && ((d6 = yVar2.f13065e) == null || dDoubleValue2 <= d6.doubleValue())) {
                        z6 = true;
                    }
                }
                if (z5 || z6) {
                    Map concurrentHashMap = yVar4.H;
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                        yVar4.H = concurrentHashMap;
                    }
                    if (z5) {
                        concurrentHashMap.put("ui.contributes_to_ttid", Boolean.TRUE);
                    }
                    if (z6) {
                        concurrentHashMap.put("ui.contributes_to_ttfd", Boolean.TRUE);
                    }
                }
            }
        }
    }

    public static io.sentry.protocol.y e(io.sentry.android.core.performance.g gVar, l6 l6Var, io.sentry.protocol.v vVar, String str) {
        long jA;
        HashMap map = new HashMap(2);
        map.put("thread.id", Long.valueOf(io.sentry.android.core.internal.util.e.f12291b));
        map.put("thread.name", "main");
        Boolean bool = Boolean.TRUE;
        map.put("ui.contributes_to_ttid", bool);
        map.put("ui.contributes_to_ttfd", bool);
        Double dValueOf = Double.valueOf(gVar.f12384e / 1000.0d);
        if (gVar.c()) {
            jA = gVar.a() + gVar.f12384e;
        } else {
            jA = 0;
        }
        return new io.sentry.protocol.y(dValueOf, Double.valueOf(jA / 1000.0d), vVar, new l6(), l6Var, str, gVar.f12383d, m6.OK, "auto.ui", new ConcurrentHashMap(), new ConcurrentHashMap(), map);
    }

    @Override // io.sentry.b0
    public final SentryEvent f(SentryEvent sentryEvent, Hint hint) {
        return sentryEvent;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, Hint hint) {
        Map map;
        SentryAndroidOptions sentryAndroidOptions = this.f12155e;
        io.sentry.r rVarA = this.f12156i.a();
        try {
            if (!sentryAndroidOptions.isTracingEnabled()) {
                rVarA.close();
                return d0Var;
            }
            io.sentry.android.core.performance.f fVarB = io.sentry.android.core.performance.f.b();
            boolean zB = b(d0Var);
            HashMap map2 = d0Var.Q;
            io.sentry.protocol.c cVar = d0Var.f12671e;
            if (zB) {
                if (fVarB.I && fVarB.f12377e) {
                    long jA = fVarB.a(sentryAndroidOptions).a();
                    if (jA != 0) {
                        map2.put(fVarB.f12376d == io.sentry.android.core.performance.e.COLD ? "app_start_cold" : "app_start_warm", new io.sentry.protocol.l(Float.valueOf(jA), b2.MILLISECOND.apiName()));
                        a(fVarB, d0Var);
                        fVarB.I = false;
                        fVarB.f12381x.clear();
                        fVarB.f12382y.clear();
                    }
                }
                io.sentry.protocol.a aVarD = cVar.d();
                if (aVarD == null) {
                    aVarD = new io.sentry.protocol.a();
                    cVar.n(aVarD);
                }
                aVarD.G = fVarB.f12376d == io.sentry.android.core.performance.e.COLD ? "cold" : "warm";
            }
            d(d0Var);
            io.sentry.protocol.v vVar = d0Var.f12670d;
            j6 j6VarI = cVar.i();
            if (vVar != null && j6VarI != null && j6VarI.f12786w.contentEquals("ui.load")) {
                b4 b4Var = this.f12154d;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) b4Var.f911i;
                io.sentry.r rVarA2 = ((io.sentry.util.a) b4Var.f914x).a();
                try {
                    if (b4Var.d()) {
                        Map map3 = (Map) concurrentHashMap.get(vVar);
                        concurrentHashMap.remove(vVar);
                        rVarA2.close();
                        map = map3;
                    } else {
                        rVarA2.close();
                        map = null;
                    }
                    if (map != null) {
                        map2.putAll(map);
                    }
                } catch (Throwable th2) {
                    try {
                        rVarA2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            rVarA.close();
            return d0Var;
        } catch (Throwable th4) {
            try {
                rVarA.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }
}
