package jq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.z;
import mo.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mq.f f14027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kq.i f14028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kq.i f14029i;
    public final /* synthetic */ j j;

    public h(j jVar, mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.j = jVar;
        bc.k kVar = jVar.I;
        pp.k kVar2 = jVar.f14030w;
        List list = kVar2.N;
        Intrinsics.checkNotNullExpressionValue(list, "getFunctionList(...)");
        List list2 = kVar2.O;
        Intrinsics.checkNotNullExpressionValue(list2, "getPropertyList(...)");
        List list3 = kVar2.P;
        Intrinsics.checkNotNullExpressionValue(list3, "getTypeAliasList(...)");
        List list4 = kVar2.H;
        Intrinsics.checkNotNullExpressionValue(list4, "getNestedClassNameList(...)");
        rp.f fVar = (rp.f) jVar.I.f3123i;
        ArrayList arrayList = new ArrayList(e0.l(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(c0.w(fVar, ((Number) it.next()).intValue()));
        }
        super(kVar, list, list2, list3, new e(0, arrayList));
        hq.j jVar2 = (hq.j) kVar.f3122e;
        this.f14027g = kotlinTypeRefiner;
        kq.l lVar = jVar2.f11019a;
        f fVar2 = new f(this, 0);
        lVar.getClass();
        this.f14028h = new kq.i(lVar, fVar2);
        kq.l lVar2 = jVar2.f11019a;
        f fVar3 = new f(this, 1);
        lVar2.getClass();
        this.f14029i = new kq.i(lVar2, fVar3);
    }

    @Override // jq.r, eq.p, eq.o
    public final Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        s(name, location);
        return super.a(name, location);
    }

    @Override // jq.r, eq.p, eq.o
    public final Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        s(name, location);
        return super.c(name, location);
    }

    @Override // eq.p, eq.q
    public final Collection d(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f14028h.invoke();
    }

    @Override // jq.r, eq.p, eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        s(name, location);
        e4.i iVar = this.j.M;
        if (iVar != null) {
            Intrinsics.checkNotNullParameter(name, "name");
            vo.f fVar = (vo.f) ((kq.j) iVar.f7981i).invoke(name);
            if (fVar != null) {
                return fVar;
            }
        }
        return super.g(name, location);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // jq.r
    public final void h(ArrayList result, Function1 nameFilter) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        e4.i iVar = this.j.M;
        if (iVar != null) {
            Set<up.e> setKeySet = ((LinkedHashMap) iVar.f7980e).keySet();
            arrayList = new ArrayList();
            for (up.e name : setKeySet) {
                Intrinsics.checkNotNullParameter(name, "name");
                vo.f fVar = (vo.f) ((kq.j) iVar.f7981i).invoke(name);
                if (fVar != null) {
                    arrayList.add(fVar);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = n0.f14659d;
        }
        result.addAll(arrayList);
    }

    @Override // jq.r
    public final void j(ArrayList functions, up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(functions, "functions");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Collection) this.f14029i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((z) it.next()).J().c(name, dp.c.f7695i));
        }
        bc.k kVar = this.f14055b;
        functions.addAll(((hq.j) kVar.f3122e).f11030n.a(name, this.j));
        ArrayList arrayList2 = new ArrayList(functions);
        ((mq.l) ((hq.j) kVar.f3122e).f11033q).f16034c.h(name, arrayList, arrayList2, this.j, new g(functions, 0));
    }

    @Override // jq.r
    public final void k(ArrayList descriptors, up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Collection) this.f14029i.invoke()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((z) it.next()).J().a(name, dp.c.f7695i));
        }
        ArrayList arrayList2 = new ArrayList(descriptors);
        ((mq.l) ((hq.j) this.f14055b.f3122e).f11033q).f16034c.h(name, arrayList, arrayList2, this.j, new g(descriptors, 0));
    }

    @Override // jq.r
    public final up.b l(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.j.E.d(name);
    }

    @Override // jq.r
    public final Set n() {
        List listH = this.j.K.h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            Set setE = ((z) it.next()).J().e();
            if (setE == null) {
                return null;
            }
            i0.o(linkedHashSet, setE);
        }
        return linkedHashSet;
    }

    @Override // jq.r
    public final Set o() {
        j jVar = this.j;
        List listH = jVar.K.h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            i0.o(linkedHashSet, ((z) it.next()).J().b());
        }
        linkedHashSet.addAll(((hq.j) this.f14055b.f3122e).f11030n.d(jVar));
        return linkedHashSet;
    }

    @Override // jq.r
    public final Set p() {
        List listH = this.j.K.h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            i0.o(linkedHashSet, ((z) it.next()).J().f());
        }
        return linkedHashSet;
    }

    @Override // jq.r
    public final boolean r(u function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return ((hq.j) this.f14055b.f3122e).f11031o.e(this.j, function);
    }

    public final void s(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        m3.m.Q(((hq.j) this.f14055b.f3122e).f11027i, location, this.j, name);
    }
}
