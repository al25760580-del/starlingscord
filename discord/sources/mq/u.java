package mq;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lq.d0;
import lq.d1;
import lq.l0;
import lq.q0;
import lq.y;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f16044a = new u();

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList<d0> arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            d0 d0Var = (d0) it.next();
            if (!arrayList.isEmpty()) {
                for (d0 d0Var2 : arrayList) {
                    if (d0Var2 != d0Var) {
                        Intrinsics.checkNotNull(d0Var2);
                        Intrinsics.checkNotNull(d0Var);
                        if (((Boolean) function2.invoke(d0Var2, d0Var)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, lq.l0, sq.d] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [lq.l0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, lq.d0, lq.z] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21, types: [lq.d0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.LinkedHashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final d0 b(ArrayList types) {
        d0 d0Var;
        d0 d0VarB;
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList<d0> arrayList = new ArrayList();
        Iterator it = types.iterator();
        while (it.hasNext()) {
            d0 d0Var2 = (d0) it.next();
            if (d0Var2.r0() instanceof y) {
                Collection collectionH = d0Var2.r0().h();
                Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
                Collection<z> collection = collectionH;
                ArrayList arrayList2 = new ArrayList(e0.l(collection, 10));
                for (z zVar : collection) {
                    Intrinsics.checkNotNull(zVar);
                    d0 d0VarE = lq.c.E(zVar);
                    if (d0Var2.t0()) {
                        d0VarE = d0VarE.x0(true);
                    }
                    arrayList2.add(d0VarE);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(d0Var2);
            }
        }
        s sVarA = s.f16038d;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            sVarA = sVarA.a((d1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (d0 d0VarX0 : arrayList) {
            if (sVarA == s.f16041v) {
                if (d0VarX0 instanceof h) {
                    h hVar = (h) d0VarX0;
                    Intrinsics.checkNotNullParameter(hVar, "<this>");
                    d0VarX0 = new h(hVar.f16020e, hVar.f16021i, hVar.f16022v, hVar.f16023w, hVar.f16024x, true);
                }
                Intrinsics.checkNotNullParameter(d0VarX0, "<this>");
                d0 d0VarM = lq.f.m(d0VarX0, false);
                d0VarX0 = (d0VarM == null && (d0VarM = lq.c.n(d0VarX0)) == null) ? d0VarX0.x0(false) : d0VarM;
            }
            linkedHashSet.add(d0VarX0);
        }
        ArrayList arrayList3 = new ArrayList(e0.l(types, 10));
        Iterator it3 = types.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((d0) it3.next()).q0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it4.next();
        while (true) {
            d0Var = null;
            if (!it4.hasNext()) {
                break;
            }
            l0 other = (l0) it4.next();
            next = (l0) next;
            next.getClass();
            e4.r rVar = l0.f15225e;
            Intrinsics.checkNotNullParameter(other, "other");
            if (!next.isEmpty() || !other.isEmpty()) {
                ArrayList arrayList4 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) rVar.f8034e).values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                Iterator it5 = collectionValues.iterator();
                while (it5.hasNext()) {
                    int iIntValue = ((Number) it5.next()).intValue();
                    lq.j jVar = (lq.j) next.f20499d.get(iIntValue);
                    lq.j jVar2 = (lq.j) other.f20499d.get(iIntValue);
                    if (jVar != null) {
                        if (!Intrinsics.areEqual(jVar2, jVar)) {
                            jVar = null;
                        }
                        jVar2 = jVar;
                    } else if (jVar2 == null || !Intrinsics.areEqual(jVar, jVar2)) {
                        jVar2 = null;
                    }
                    vq.m.b(arrayList4, jVar2);
                }
                next = e4.r.A(arrayList4);
            }
        }
        l0 l0Var = (l0) next;
        if (linkedHashSet.size() == 1) {
            d0VarB = (d0) CollectionsKt.Y(linkedHashSet);
        } else {
            ArrayList types2 = a(linkedHashSet, new t(2, this, u.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 0));
            types2.isEmpty();
            Intrinsics.checkNotNullParameter(types2, "types");
            zp.n[] nVarArr = zp.n.f24071d;
            if (!types2.isEmpty()) {
                Iterator it6 = types2.iterator();
                if (!it6.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                ?? next2 = it6.next();
                while (it6.hasNext()) {
                    d0 d0Var3 = (d0) it6.next();
                    next2 = (d0) next2;
                    if (next2 != 0 && d0Var3 != null) {
                        q0 q0VarR0 = next2.r0();
                        q0 q0VarR1 = d0Var3.r0();
                        boolean z5 = q0VarR0 instanceof zp.o;
                        if (z5 && (q0VarR1 instanceof zp.o)) {
                            LinkedHashSet linkedHashSet2 = ((zp.o) q0VarR0).f24072a;
                            LinkedHashSet other2 = ((zp.o) q0VarR1).f24072a;
                            Intrinsics.checkNotNullParameter(linkedHashSet2, "<this>");
                            Intrinsics.checkNotNullParameter(other2, "other");
                            LinkedHashSet linkedHashSetK0 = CollectionsKt.k0(linkedHashSet2);
                            i0.o(linkedHashSetK0, other2);
                            zp.o constructor = new zp.o(linkedHashSetK0);
                            l0.f15225e.getClass();
                            l0 attributes = l0.f15226i;
                            Intrinsics.checkNotNullParameter(attributes, "attributes");
                            Intrinsics.checkNotNullParameter(constructor, "constructor");
                            next2 = lq.c.v(nq.l.a(nq.h.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"), n0.f14659d, attributes, constructor, false);
                        } else if (z5) {
                            if (((zp.o) q0VarR0).f24072a.contains(d0Var3)) {
                                next2 = d0Var3;
                            }
                        } else if (!(q0VarR1 instanceof zp.o) || !((zp.o) q0VarR1).f24072a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                d0Var = (d0) next2;
            }
            if (d0Var != null) {
                d0VarB = d0Var;
            } else {
                k.f16033b.getClass();
                ArrayList arrayListA = a(types2, new t(j.f16032b));
                arrayListA.isEmpty();
                d0VarB = arrayListA.size() < 2 ? (d0) CollectionsKt.Y(arrayListA) : new y(linkedHashSet).b();
            }
        }
        return d0VarB.z0(l0Var);
    }
}
