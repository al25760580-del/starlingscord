package ip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bp.o f13308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f13309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bp.i f13310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f13311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f13312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f13313f;

    public a(bp.o jClass, Function1 memberFilter) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(memberFilter, "memberFilter");
        this.f13308a = jClass;
        this.f13309b = memberFilter;
        bp.i iVar = new bp.i(8, this);
        this.f13310c = iVar;
        xq.g gVarH = xq.r.h(CollectionsKt.C(jClass.d()), iVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        xq.d dVar = new xq.d(gVarH);
        while (dVar.hasNext()) {
            Object next = dVar.next();
            up.e eVarC = ((bp.x) next).c();
            Object arrayList = linkedHashMap.get(eVarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(eVarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f13311d = linkedHashMap;
        xq.g gVarH2 = xq.r.h(CollectionsKt.C(this.f13308a.b()), this.f13309b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        xq.d dVar2 = new xq.d(gVarH2);
        while (dVar2.hasNext()) {
            Object next2 = dVar2.next();
            linkedHashMap2.put(((bp.u) next2).c(), next2);
        }
        this.f13312e = linkedHashMap2;
        ArrayList arrayListF = this.f13308a.f();
        Function1 function1 = this.f13309b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListF) {
            if (((Boolean) function1.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iA = v0.a(kotlin.collections.e0.l(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((bp.a0) obj2).c(), obj2);
        }
        this.f13313f = linkedHashMap3;
    }

    @Override // ip.c
    public final Set a() {
        xq.g gVarH = xq.r.h(CollectionsKt.C(this.f13308a.d()), this.f13310c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xq.d dVar = new xq.d(gVarH);
        while (dVar.hasNext()) {
            linkedHashSet.add(((bp.x) dVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // ip.c
    public final bp.u b(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (bp.u) this.f13312e.get(name);
    }

    @Override // ip.c
    public final bp.a0 c(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (bp.a0) this.f13313f.get(name);
    }

    @Override // ip.c
    public final Collection d(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        List list = (List) this.f13311d.get(name);
        return list != null ? list : n0.f14659d;
    }

    @Override // ip.c
    public final Set e() {
        return this.f13313f.keySet();
    }

    @Override // ip.c
    public final Set f() {
        xq.g gVarH = xq.r.h(CollectionsKt.C(this.f13308a.b()), this.f13309b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xq.d dVar = new xq.d(gVarH);
        while (dVar.hasNext()) {
            linkedHashSet.add(((bp.u) dVar.next()).c());
        }
        return linkedHashSet;
    }
}
