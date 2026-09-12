package jq;

import com.google.android.gms.internal.play_billing.v1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import mo.c0;
import pp.a0;
import pp.i0;
import pp.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class q {
    public static final /* synthetic */ KProperty[] j = {kk.b.p(q.class, "functionNames", "getFunctionNames()Ljava/util/Set;", 0), kk.b.p(q.class, "variableNames", "getVariableNames()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f14047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.e f14048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.e f14049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kq.j f14050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kq.i f14051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kq.i f14052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f14053i;

    public q(r rVar, List functionList, List propertyList, List typeAliasList) {
        Intrinsics.checkNotNullParameter(functionList, "functionList");
        Intrinsics.checkNotNullParameter(propertyList, "propertyList");
        Intrinsics.checkNotNullParameter(typeAliasList, "typeAliasList");
        this.f14053i = rVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : functionList) {
            up.e eVarW = c0.w((rp.f) rVar.f14055b.f3123i, ((a0) ((vp.a) obj)).f18203x);
            Object arrayList = linkedHashMap.get(eVarW);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarW, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f14045a = c(linkedHashMap);
        r rVar2 = this.f14053i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : propertyList) {
            up.e eVarW2 = c0.w((rp.f) rVar2.f14055b.f3123i, ((i0) ((vp.a) obj2)).f18320x);
            Object arrayList2 = linkedHashMap2.get(eVarW2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(eVarW2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f14046b = c(linkedHashMap2);
        ((hq.j) this.f14053i.f14055b.f3122e).f11021c.getClass();
        r rVar3 = this.f14053i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : typeAliasList) {
            up.e eVarW3 = c0.w((rp.f) rVar3.f14055b.f3123i, ((u0) ((vp.a) obj3)).f18454w);
            Object arrayList3 = linkedHashMap3.get(eVarW3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(eVarW3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f14047c = c(linkedHashMap3);
        this.f14048d = ((hq.j) this.f14053i.f14055b.f3122e).f11019a.c(new n(this, 0));
        this.f14049e = ((hq.j) this.f14053i.f14055b.f3122e).f11019a.c(new n(this, 1));
        this.f14050f = ((hq.j) this.f14053i.f14055b.f3122e).f11019a.d(new n(this, 2));
        r rVar4 = this.f14053i;
        kq.l lVar = ((hq.j) rVar4.f14055b.f3122e).f11019a;
        o oVar = new o(this, rVar4, 0);
        lVar.getClass();
        this.f14051g = new kq.i(lVar, oVar);
        r rVar5 = this.f14053i;
        kq.l lVar2 = ((hq.j) rVar5.f14055b.f3122e).f11019a;
        o oVar2 = new o(this, rVar5, 1);
        lVar2.getClass();
        this.f14052h = new kq.i(lVar2, oVar2);
    }

    public static LinkedHashMap c(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<vp.a> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(e0.l(iterable, 10));
            for (vp.a aVar : iterable) {
                int iC = aVar.c();
                int iH = v1.h(iC) + iC;
                if (iH > 4096) {
                    iH = 4096;
                }
                v1 v1VarM = v1.m(byteArrayOutputStream, iH);
                v1VarM.A(iC);
                aVar.f(v1VarM);
                v1VarM.l();
                arrayList.add(Unit.f14616a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    public final Collection a(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !((Set) io.sentry.config.a.H(this.f14051g, j[0])).contains(name) ? n0.f14659d : (Collection) this.f14048d.invoke(name);
    }

    public final Collection b(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !((Set) io.sentry.config.a.H(this.f14052h, j[1])).contains(name) ? n0.f14659d : (Collection) this.f14049e.invoke(name);
    }
}
