package ip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.p0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vo.l0;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends f0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f13340p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final bp.o f13341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j f13342o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(e4.i c8, bp.o jClass, j ownerDescriptor) {
        super(c8);
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f13341n = jClass;
        this.f13342o = ownerDescriptor;
    }

    public static l0 v(l0 l0Var) {
        vo.c cVarC = l0Var.c();
        cVarC.getClass();
        if (cVarC != vo.c.f21793e) {
            return l0Var;
        }
        Collection collectionH = l0Var.h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
        Collection<l0> collection = collectionH;
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(collection, 10));
        for (l0 l0Var2 : collection) {
            Intrinsics.checkNotNull(l0Var2);
            arrayList.add(v(l0Var2));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return (l0) CollectionsKt.Z(CollectionsKt.i0(CollectionsKt.k0(arrayList)));
    }

    @Override // eq.p, eq.q
    public final vo.i g(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // ip.b0
    public final Set h(eq.f kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return p0.f14661d;
    }

    @Override // ip.b0
    public final Set i(eq.f kindFilter, eq.l lVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(((c) this.f13323e.invoke()).a());
        j jVar = this.f13342o;
        e0 e0VarQ = yk.a.q(jVar);
        Set setB = e0VarQ != null ? e0VarQ.b() : null;
        if (setB == null) {
            setB = p0.f14661d;
        }
        linkedHashSetK0.addAll(setB);
        if (this.f13341n.f3364a.isEnum()) {
            linkedHashSetK0.addAll(kotlin.collections.d0.g(so.p.f20395c, so.p.f20393a));
        }
        e4.i iVar = this.f13320b;
        linkedHashSetK0.addAll(((cq.a) ((hp.a) iVar.f7980e).f10978x).g(jVar, iVar));
        return linkedHashSetK0;
    }

    @Override // ip.b0
    public final void j(ArrayList result, up.e name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        e4.i iVar = this.f13320b;
        ((cq.a) ((hp.a) iVar.f7980e).f10978x).d(this.f13342o, name, result, iVar);
    }

    @Override // ip.b0
    public final c k() {
        return new a(this.f13341n, n.f13367v);
    }

    @Override // ip.b0
    public final void m(LinkedHashSet result, up.e name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        j jVar = this.f13342o;
        e0 e0VarQ = yk.a.q(jVar);
        Collection collectionL0 = e0VarQ == null ? p0.f14661d : CollectionsKt.l0(e0VarQ.c(name, dp.c.f7697w));
        hp.a aVar = (hp.a) this.f13320b.f7980e;
        LinkedHashSet linkedHashSetG = ib.a.G(name, collectionL0, result, this.f13342o, aVar.f10962f, ((mq.l) aVar.f10975u).f16034c);
        Intrinsics.checkNotNullExpressionValue(linkedHashSetG, "resolveOverridesForStaticMembers(...)");
        result.addAll(linkedHashSetG);
        if (this.f13341n.f3364a.isEnum()) {
            if (Intrinsics.areEqual(name, so.p.f20395c)) {
                k0 k0VarL = mf.f.l(jVar);
                Intrinsics.checkNotNullExpressionValue(k0VarL, "createEnumValueOfMethod(...)");
                result.add(k0VarL);
            } else if (Intrinsics.areEqual(name, so.p.f20393a)) {
                k0 k0VarM = mf.f.m(jVar);
                Intrinsics.checkNotNullExpressionValue(k0VarM, "createEnumValuesMethod(...)");
                result.add(k0VarM);
            }
        }
    }

    @Override // ip.f0, ip.b0
    public final void n(ArrayList result, up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bp.i iVar = new bp.i(10, name);
        j jVar = this.f13342o;
        vq.m.g(kotlin.collections.c0.c(jVar), c0.f13329d, new d0(jVar, linkedHashSet, iVar));
        boolean zIsEmpty = result.isEmpty();
        e4.i iVar2 = this.f13320b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                l0 l0VarV = v((l0) obj);
                Object arrayList = linkedHashMap.get(l0VarV);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(l0VarV, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                hp.a aVar = (hp.a) iVar2.f7980e;
                LinkedHashSet linkedHashSetG = ib.a.G(name, collection, result, this.f13342o, aVar.f10962f, ((mq.l) aVar.f10975u).f16034c);
                Intrinsics.checkNotNullExpressionValue(linkedHashSetG, "resolveOverridesForStaticMembers(...)");
                i0.o(arrayList2, linkedHashSetG);
            }
            result.addAll(arrayList2);
        } else {
            hp.a aVar2 = (hp.a) iVar2.f7980e;
            LinkedHashSet linkedHashSetG2 = ib.a.G(name, linkedHashSet, result, this.f13342o, aVar2.f10962f, ((mq.l) aVar2.f10975u).f16034c);
            Intrinsics.checkNotNullExpressionValue(linkedHashSetG2, "resolveOverridesForStaticMembers(...)");
            result.addAll(linkedHashSetG2);
        }
        if (this.f13341n.f3364a.isEnum() && Intrinsics.areEqual(name, so.p.f20394b)) {
            vq.m.b(result, mf.f.k(jVar));
        }
    }

    @Override // ip.b0
    public final Set o(eq.f kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(((c) this.f13323e.invoke()).f());
        n nVar = n.f13368w;
        j jVar = this.f13342o;
        vq.m.g(kotlin.collections.c0.c(jVar), c0.f13329d, new d0(jVar, linkedHashSetK0, nVar));
        if (this.f13341n.f3364a.isEnum()) {
            linkedHashSetK0.add(so.p.f20394b);
        }
        return linkedHashSetK0;
    }

    @Override // ip.b0
    public final vo.l q() {
        return this.f13342o;
    }
}
