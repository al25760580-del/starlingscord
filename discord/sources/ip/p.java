package ip;

import ar.c1;
import ep.j0;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f1;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d1;
import lq.t0;
import lq.z0;
import vo.l0;
import vo.o0;
import yo.i0;
import yo.k0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13373v = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vo.f f13374n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final bp.o f13375o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f13376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kq.i f13377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kq.i f13378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final kq.i f13379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final kq.i f13380t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final kq.j f13381u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e4.i c8, vo.f ownerDescriptor, bp.o jClass, boolean z5, p pVar) {
        super(c8, pVar);
        Intrinsics.checkNotNullParameter(c8, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f13374n = ownerDescriptor;
        this.f13375o = jClass;
        this.f13376p = z5;
        kq.o oVar = ((hp.a) c8.f7980e).f10957a;
        k kVar = new k(this, c8);
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        this.f13377q = new kq.i(lVar, kVar);
        l lVar2 = new l(this, 0);
        kq.l lVar3 = (kq.l) oVar;
        lVar3.getClass();
        this.f13378r = new kq.i(lVar3, lVar2);
        k kVar2 = new k(c8, this);
        kq.l lVar4 = (kq.l) oVar;
        lVar4.getClass();
        this.f13379s = new kq.i(lVar4, kVar2);
        l lVar5 = new l(this, 1);
        kq.l lVar6 = (kq.l) oVar;
        lVar6.getClass();
        this.f13380t = new kq.i(lVar6, lVar5);
        this.f13381u = ((kq.l) oVar).d(new m(0, this, c8));
    }

    public static k0 A(k0 k0Var, vo.u uVar, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return k0Var;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            k0 k0Var2 = (k0) it.next();
            if (!Intrinsics.areEqual(k0Var, k0Var2) && k0Var2.Z == null && D(k0Var2, uVar)) {
                vo.u uVarBuild = k0Var.m0().N().build();
                Intrinsics.checkNotNull(uVarBuild);
                return (k0) uVarBuild;
            }
        }
        return k0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    public static k0 B(k0 k0Var) {
        up.c cVarG;
        up.d dVarH;
        List listL = k0Var.L();
        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
        q0 q0Var = (q0) CollectionsKt.S(listL);
        if (q0Var != null) {
            vo.i iVarG = q0Var.getType().r0().g();
            if (iVarG == null || (dVarH = bq.e.h(iVarG)) == null) {
                cVarG = null;
            } else {
                if (!dVarH.d()) {
                    dVarH = null;
                }
                if (dVarH != null) {
                    cVarG = dVarH.g();
                } else {
                    cVarG = null;
                }
            }
            if (!Intrinsics.areEqual(cVarG, so.p.f20399g)) {
                q0Var = null;
            }
            if (q0Var != null) {
                vo.t tVarM0 = k0Var.m0();
                List listL2 = k0Var.L();
                Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
                k0 k0Var2 = (k0) tVarM0.c(CollectionsKt.G(listL2)).U(((t0) q0Var.getType().l0().get(0)).b()).build();
                if (k0Var2 != null) {
                    k0Var2.S = true;
                }
                return k0Var2;
            }
        }
        return null;
    }

    public static boolean D(vo.u uVar, vo.u uVar2) {
        xp.j jVarB = xp.l.f23012c.n(uVar2, uVar, true).b();
        Intrinsics.checkNotNullExpressionValue(jVarB, "getResult(...)");
        return jVarB == xp.j.f23004d && !io.sentry.config.a.n(uVar2, uVar);
    }

    public static boolean E(k0 k0Var, k0 k0Var2) {
        int i7 = ep.c.f8520l;
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        if (Intrinsics.areEqual(k0Var.getName().b(), "removeAt") && Intrinsics.areEqual(com.facebook.imagepipeline.nativecode.b.g(k0Var), j0.f8565g.f8545e)) {
            k0Var2 = k0Var2.a();
        }
        Intrinsics.checkNotNull(k0Var2);
        return D(k0Var2, k0Var);
    }

    public static k0 F(l0 l0Var, String str, Function1 function1) {
        k0 k0Var;
        up.e eVarE = up.e.e(str);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(eVarE)).iterator();
        do {
            k0Var = null;
            if (!it.hasNext()) {
                break;
            }
            k0 k0Var2 = (k0) it.next();
            if (k0Var2.L().size() == 0) {
                mq.l lVar = mq.d.f16016a;
                lq.z zVar = k0Var2.E;
                if (zVar == null ? false : lVar.b(zVar, l0Var.getType())) {
                    k0Var = k0Var2;
                }
            }
        } while (k0Var == null);
        return k0Var;
    }

    public static k0 H(l0 l0Var, Function1 function1) {
        k0 k0Var;
        lq.z zVar;
        String strB = l0Var.getName().b();
        Intrinsics.checkNotNullExpressionValue(strB, "asString(...)");
        up.e eVarE = up.e.e(ep.z.b(strB));
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        Iterator it = ((Iterable) function1.invoke(eVarE)).iterator();
        do {
            k0Var = null;
            if (!it.hasNext()) {
                break;
            }
            k0 k0Var2 = (k0) it.next();
            if (k0Var2.L().size() == 1 && (zVar = k0Var2.E) != null) {
                up.e eVar = so.i.f20342e;
                if (so.i.E(zVar, so.o.f20368d)) {
                    mq.l lVar = mq.d.f16016a;
                    List listL = k0Var2.L();
                    Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                    if (lVar.a(((q0) CollectionsKt.Z(listL)).getType(), l0Var.getType())) {
                        k0Var = k0Var2;
                    }
                }
            }
        } while (k0Var == null);
        return k0Var;
    }

    public static boolean K(k0 k0Var, vo.u uVar) {
        String strF = com.facebook.imagepipeline.nativecode.b.f(k0Var, 2);
        vo.u uVarA = uVar.a();
        Intrinsics.checkNotNullExpressionValue(uVarA, "getOriginal(...)");
        return Intrinsics.areEqual(strF, com.facebook.imagepipeline.nativecode.b.f(uVarA, 2)) && !D(k0Var, uVar);
    }

    public final boolean C(l0 l0Var, Function1 function1) {
        if (m3.m.F(l0Var)) {
            return false;
        }
        k0 k0VarG = G(l0Var, function1);
        k0 k0VarH = H(l0Var, function1);
        if (k0VarG == null) {
            return false;
        }
        if (l0Var.U()) {
            return k0VarH != null && k0VarH.e() == k0VarG.e();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final k0 G(l0 l0Var, Function1 function1) {
        up.e eVar;
        i0 getter = l0Var.getGetter();
        String strB = null;
        i0 i0Var = getter != null ? (i0) ls.d.p(getter) : null;
        if (i0Var != null) {
            Intrinsics.checkNotNullParameter(i0Var, "<this>");
            so.i.A(i0Var);
            vo.d dVarB = bq.e.b(bq.e.k(i0Var), ep.d.f8525v);
            if (dVarB != null && (eVar = (up.e) ep.f.f8537a.get(bq.e.g(dVarB))) != null) {
                strB = eVar.b();
            }
        }
        if (strB != null && !ls.d.r(this.f13374n, i0Var)) {
            return F(l0Var, strB, function1);
        }
        String strB2 = l0Var.getName().b();
        Intrinsics.checkNotNullExpressionValue(strB2, "asString(...)");
        return F(l0Var, ep.z.a(strB2), function1);
    }

    public final LinkedHashSet I(up.e eVar) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.o(linkedHashSet, ((lq.z) it.next()).J().c(eVar, dp.c.f7697w));
        }
        return linkedHashSet;
    }

    public final Set J(up.e eVar) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionA = ((lq.z) it.next()).J().a(eVar, dp.c.f7697w);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(collectionA, 10));
            Iterator it2 = collectionA.iterator();
            while (it2.hasNext()) {
                arrayList2.add((l0) it2.next());
            }
            kotlin.collections.i0.o(arrayList, arrayList2);
        }
        return CollectionsKt.l0(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:1: B:55:0x0151->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[LOOP:3: B:73:0x01aa->B:109:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x01da A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:51:0x0130  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0157  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    /* JADX WARN: Code duplicated, block: B:63:0x0175  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x010d A[SYNTHETIC] */
    public final boolean L(k0 k0Var) {
        Collection collectionH;
        up.e eVar;
        up.e name;
        k0 k0VarB;
        LinkedHashSet<k0> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        vo.u uVarA;
        ArrayList arrayList2;
        k0 k0Var2;
        Iterator it3;
        k0 k0Var3;
        up.e methodName = k0Var.getName();
        Intrinsics.checkNotNullExpressionValue(methodName, "getName(...)");
        Intrinsics.checkNotNullParameter(methodName, "name");
        String name2 = methodName.b();
        Intrinsics.checkNotNullExpressionValue(name2, "asString(...)");
        up.c cVar = ep.z.f8606a;
        Intrinsics.checkNotNullParameter(name2, "name");
        if (kotlin.text.x.o(name2, "get", false) || kotlin.text.x.o(name2, "is", false)) {
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            up.e eVarI = m3.m.I(methodName, "get", null, 12);
            if (eVarI == null) {
                eVarI = m3.m.I(methodName, "is", null, 8);
            }
            collectionH = kotlin.collections.d0.h(eVarI);
        } else {
            Intrinsics.checkNotNullParameter(name2, "name");
            if (kotlin.text.x.o(name2, "set", false)) {
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                up.e eVarI2 = m3.m.I(methodName, "set", null, 4);
                Intrinsics.checkNotNullParameter(methodName, "methodName");
                up.e[] elements = {eVarI2, m3.m.I(methodName, "set", "is", 4)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                collectionH = kotlin.collections.y.r(elements);
            } else {
                Object obj = ep.f.f8537a;
                Intrinsics.checkNotNullParameter(methodName, "name1");
                collectionH = (List) ep.f.f8538b.get(methodName);
                if (collectionH == null) {
                    collectionH = n0.f14659d;
                }
            }
        }
        if (collectionH != null && collectionH.isEmpty()) {
            ArrayList arrayList3 = j0.f8559a;
            up.e name3 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
            Intrinsics.checkNotNullParameter(name3, "name");
            eVar = (up.e) j0.k.get(name3);
            if (eVar == null) {
                int i7 = ep.e.f8531l;
                name = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!ep.e.b(name)) {
                    k0VarB = B(k0Var);
                    if (k0VarB == null) {
                        return true;
                    }
                    up.e name4 = k0Var.getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                    linkedHashSetI = I(name4);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    for (k0 k0Var4 : linkedHashSetI) {
                        if (k0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                up.e name5 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    uVarA = ep.e.a((k0) it.next());
                    if (uVarA != null) {
                        arrayList.add(uVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    k0VarB = B(k0Var);
                    if (k0VarB == null) {
                        return true;
                    }
                    up.e name6 = k0Var.getName();
                    Intrinsics.checkNotNullExpressionValue(name6, "getName(...)");
                    linkedHashSetI = I(name6);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (k0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(k0Var, (vo.u) it2.next())) {
                    }
                }
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name7 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name7, "getName(...)");
                linkedHashSetI = I(name7);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(eVar);
            arrayList2 = new ArrayList();
            for (Object obj2 : linkedHashSetI3) {
                k0Var3 = (k0) obj2;
                Intrinsics.checkNotNullParameter(k0Var3, "<this>");
                if (ls.d.p(k0Var3) != null) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                int i10 = ep.e.f8531l;
                name = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!ep.e.b(name)) {
                    k0VarB = B(k0Var);
                    if (k0VarB == null) {
                        return true;
                    }
                    up.e name8 = k0Var.getName();
                    Intrinsics.checkNotNullExpressionValue(name8, "getName(...)");
                    linkedHashSetI = I(name8);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (k0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                up.e name9 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name9, "getName(...)");
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    uVarA = ep.e.a((k0) it.next());
                    if (uVarA != null) {
                        arrayList.add(uVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    k0VarB = B(k0Var);
                    if (k0VarB == null) {
                        return true;
                    }
                    up.e name10 = k0Var.getName();
                    Intrinsics.checkNotNullExpressionValue(name10, "getName(...)");
                    linkedHashSetI = I(name10);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (k0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(k0Var, (vo.u) it2.next())) {
                    }
                }
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name11 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name11, "getName(...)");
                linkedHashSetI = I(name11);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            vo.t tVarM0 = k0Var.m0();
            tVarM0.B(eVar);
            tVarM0.X();
            tVarM0.n();
            vo.u uVarBuild = tVarM0.build();
            Intrinsics.checkNotNull(uVarBuild);
            k0Var2 = (k0) uVarBuild;
            if (arrayList2.isEmpty()) {
                int i11 = ep.e.f8531l;
                name = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (!ep.e.b(name)) {
                    k0VarB = B(k0Var);
                    if (k0VarB == null) {
                        return true;
                    }
                    up.e name12 = k0Var.getName();
                    Intrinsics.checkNotNullExpressionValue(name12, "getName(...)");
                    linkedHashSetI = I(name12);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (k0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                up.e name13 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name13, "getName(...)");
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    uVarA = ep.e.a((k0) it.next());
                    if (uVarA != null) {
                        arrayList.add(uVarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    k0VarB = B(k0Var);
                    if (k0VarB == null) {
                        return true;
                    }
                    up.e name14 = k0Var.getName();
                    Intrinsics.checkNotNullExpressionValue(name14, "getName(...)");
                    linkedHashSetI = I(name14);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r13.hasNext()) {
                        if (k0Var4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(k0Var, (vo.u) it2.next())) {
                    }
                }
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name15 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name15, "getName(...)");
                linkedHashSetI = I(name15);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (E((k0) it3.next(), k0Var2)) {
                }
            }
            int i12 = ep.e.f8531l;
            name = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!ep.e.b(name)) {
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name16 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name16, "getName(...)");
                linkedHashSetI = I(name16);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            up.e name17 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name17, "getName(...)");
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                uVarA = ep.e.a((k0) it.next());
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            if (arrayList.isEmpty()) {
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name18 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name18, "getName(...)");
                linkedHashSetI = I(name18);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(k0Var, (vo.u) it2.next())) {
                }
            }
            k0VarB = B(k0Var);
            if (k0VarB == null) {
                return true;
            }
            up.e name19 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name19, "getName(...)");
            linkedHashSetI = I(name19);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (k0Var4.isSuspend()) {
                }
            }
            return true;
        }
        Iterator it4 = collectionH.iterator();
        while (it4.hasNext()) {
            Set<l0> setJ = J((up.e) it4.next());
            if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                for (l0 l0Var : setJ) {
                    if (C(l0Var, new m(k0Var, this))) {
                        if (!l0Var.U()) {
                            String name20 = k0Var.getName().b();
                            Intrinsics.checkNotNullExpressionValue(name20, "asString(...)");
                            Intrinsics.checkNotNullParameter(name20, "name");
                            if (!kotlin.text.x.o(name20, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = j0.f8559a;
        up.e name21 = k0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name21, "getName(...)");
        Intrinsics.checkNotNullParameter(name21, "name");
        eVar = (up.e) j0.k.get(name21);
        if (eVar == null) {
            int i13 = ep.e.f8531l;
            name = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!ep.e.b(name)) {
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name110 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name110, "getName(...)");
                linkedHashSetI = I(name110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend() || !D(k0VarB, k0Var4)) {
                    }
                }
                return true;
            }
            up.e name111 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name111, "getName(...)");
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                uVarA = ep.e.a((k0) it.next());
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            if (arrayList.isEmpty()) {
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name112 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name112, "getName(...)");
                linkedHashSetI = I(name112);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(k0Var, (vo.u) it2.next())) {
                }
            }
            k0VarB = B(k0Var);
            if (k0VarB == null) {
                return true;
            }
            up.e name113 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name113, "getName(...)");
            linkedHashSetI = I(name113);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (k0Var4.isSuspend()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(eVar);
        arrayList2 = new ArrayList();
        while (r2.hasNext()) {
            k0Var3 = (k0) obj2;
            Intrinsics.checkNotNullParameter(k0Var3, "<this>");
            if (ls.d.p(k0Var3) != null) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            int i14 = ep.e.f8531l;
            name = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!ep.e.b(name)) {
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name114 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name114, "getName(...)");
                linkedHashSetI = I(name114);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            up.e name115 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name115, "getName(...)");
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                uVarA = ep.e.a((k0) it.next());
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            if (arrayList.isEmpty()) {
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name116 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name116, "getName(...)");
                linkedHashSetI = I(name116);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(k0Var, (vo.u) it2.next())) {
                }
            }
            k0VarB = B(k0Var);
            if (k0VarB == null) {
                return true;
            }
            up.e name117 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name117, "getName(...)");
            linkedHashSetI = I(name117);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (k0Var4.isSuspend()) {
                }
            }
            return true;
        }
        vo.t tVarM1 = k0Var.m0();
        tVarM1.B(eVar);
        tVarM1.X();
        tVarM1.n();
        vo.u uVarBuild2 = tVarM1.build();
        Intrinsics.checkNotNull(uVarBuild2);
        k0Var2 = (k0) uVarBuild2;
        if (arrayList2.isEmpty()) {
            int i15 = ep.e.f8531l;
            name = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (!ep.e.b(name)) {
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name118 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name118, "getName(...)");
                linkedHashSetI = I(name118);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            up.e name119 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name119, "getName(...)");
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                uVarA = ep.e.a((k0) it.next());
                if (uVarA != null) {
                    arrayList.add(uVarA);
                }
            }
            if (arrayList.isEmpty()) {
                k0VarB = B(k0Var);
                if (k0VarB == null) {
                    return true;
                }
                up.e name1110 = k0Var.getName();
                Intrinsics.checkNotNullExpressionValue(name1110, "getName(...)");
                linkedHashSetI = I(name1110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r13.hasNext()) {
                    if (k0Var4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(k0Var, (vo.u) it2.next())) {
                }
            }
            k0VarB = B(k0Var);
            if (k0VarB == null) {
                return true;
            }
            up.e name1111 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name1111, "getName(...)");
            linkedHashSetI = I(name1111);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (k0Var4.isSuspend()) {
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (E((k0) it3.next(), k0Var2)) {
            }
        }
        int i16 = ep.e.f8531l;
        name = k0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (!ep.e.b(name)) {
            k0VarB = B(k0Var);
            if (k0VarB == null) {
                return true;
            }
            up.e name1112 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name1112, "getName(...)");
            linkedHashSetI = I(name1112);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (k0Var4.isSuspend()) {
                }
            }
            return true;
        }
        up.e name1113 = k0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name1113, "getName(...)");
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            uVarA = ep.e.a((k0) it.next());
            if (uVarA != null) {
                arrayList.add(uVarA);
            }
        }
        if (arrayList.isEmpty()) {
            k0VarB = B(k0Var);
            if (k0VarB == null) {
                return true;
            }
            up.e name1114 = k0Var.getName();
            Intrinsics.checkNotNullExpressionValue(name1114, "getName(...)");
            linkedHashSetI = I(name1114);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r13.hasNext()) {
                if (k0Var4.isSuspend()) {
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (K(k0Var, (vo.u) it2.next())) {
            }
        }
        k0VarB = B(k0Var);
        if (k0VarB == null) {
            return true;
        }
        up.e name1115 = k0Var.getName();
        Intrinsics.checkNotNullExpressionValue(name1115, "getName(...)");
        linkedHashSetI = I(name1115);
        if (linkedHashSetI.isEmpty()) {
            return true;
        }
        while (r13.hasNext()) {
            if (k0Var4.isSuspend()) {
            }
        }
        return true;
        return false;
    }

    public final void M(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        m3.m.Q(((hp.a) this.f13320b.f7980e).f10968n, location, this.f13374n, name);
    }

    public final ArrayList N(up.e eVar) {
        Collection collectionD = ((c) this.f13323e.invoke()).d(eVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(collectionD, 10));
        Iterator it = collectionD.iterator();
        while (it.hasNext()) {
            arrayList.add(t((bp.x) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(up.e eVar) {
        LinkedHashSet linkedHashSetI = I(eVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            k0 k0Var = (k0) obj;
            Intrinsics.checkNotNullParameter(k0Var, "<this>");
            if (ls.d.p(k0Var) == null && ep.e.a(k0Var) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // ip.b0, eq.p, eq.o
    public final Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        M(name, location);
        return super.a(name, location);
    }

    @Override // ip.b0, eq.p, eq.o
    public final Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        M(name, location);
        return super.c(name, location);
    }

    @Override // eq.p, eq.q
    public final vo.i g(up.e name, dp.a location) {
        kq.j jVar;
        vo.f fVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        M(name, location);
        p pVar = (p) this.f13321c;
        return (pVar == null || (jVar = pVar.f13381u) == null || (fVar = (vo.f) jVar.invoke(name)) == null) ? (vo.i) this.f13381u.invoke(name) : fVar;
    }

    @Override // ip.b0
    public final Set h(eq.f kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return f1.d((Set) this.f13378r.invoke(), ((Map) this.f13380t.invoke()).keySet());
    }

    @Override // ip.b0
    public final Set i(eq.f kindFilter, eq.l lVar) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        vo.f fVar = this.f13374n;
        Collection collectionH = fVar.n().h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionH.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.o(linkedHashSet, ((lq.z) it.next()).J().b());
        }
        kq.i iVar = this.f13323e;
        linkedHashSet.addAll(((c) iVar.invoke()).a());
        linkedHashSet.addAll(((c) iVar.invoke()).e());
        linkedHashSet.addAll(h(kindFilter, lVar));
        e4.i iVar2 = this.f13320b;
        linkedHashSet.addAll(((cq.a) ((hp.a) iVar2.f7980e).f10978x).e(fVar, iVar2));
        return linkedHashSet;
    }

    @Override // ip.b0
    public final void j(ArrayList result, up.e name) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean zG = this.f13375o.g();
        vo.f fVar = this.f13374n;
        e4.i iVar = this.f13320b;
        if (zG) {
            kq.i iVar2 = this.f13323e;
            if (((c) iVar2.invoke()).c(name) != null) {
                if (result.isEmpty()) {
                    bp.a0 a0VarC = ((c) iVar2.invoke()).c(name);
                    Intrinsics.checkNotNull(a0VarC);
                    hp.c cVarF = mf.f.F(iVar, a0VarC);
                    hp.a aVar = (hp.a) iVar.f7980e;
                    gp.e eVarQ0 = gp.e.Q0(fVar, cVarF, a0VarC.c(), aVar.j.c(a0VarC), true);
                    Intrinsics.checkNotNullExpressionValue(eVarQ0, "createJavaMethod(...)");
                    lq.z zVarM = ((e4.m) iVar.f7983w).M(a0VarC.f(), xr.m.S(z0.f15271e, false, null, 6));
                    yo.t tVarP = p();
                    n0 n0Var = n0.f14659d;
                    vo.y.f21851d.getClass();
                    eVarQ0.P0(null, tVarP, n0Var, n0Var, n0Var, zVarM, vo.y.f21854v, vo.p.f21828e, null);
                    eVarQ0.f10170b0 = 1;
                    aVar.f10963g.getClass();
                    result.add(eVarQ0);
                } else {
                    Iterator it = result.iterator();
                    while (it.hasNext()) {
                        if (((k0) it.next()).L().isEmpty()) {
                        }
                    }
                    bp.a0 a0VarC2 = ((c) iVar2.invoke()).c(name);
                    Intrinsics.checkNotNull(a0VarC2);
                    hp.c cVarF2 = mf.f.F(iVar, a0VarC2);
                    hp.a aVar2 = (hp.a) iVar.f7980e;
                    gp.e eVarQ1 = gp.e.Q0(fVar, cVarF2, a0VarC2.c(), aVar2.j.c(a0VarC2), true);
                    Intrinsics.checkNotNullExpressionValue(eVarQ1, "createJavaMethod(...)");
                    lq.z zVarM2 = ((e4.m) iVar.f7983w).M(a0VarC2.f(), xr.m.S(z0.f15271e, false, null, 6));
                    yo.t tVarP2 = p();
                    n0 n0Var2 = n0.f14659d;
                    vo.y.f21851d.getClass();
                    eVarQ1.P0(null, tVarP2, n0Var2, n0Var2, n0Var2, zVarM2, vo.y.f21854v, vo.p.f21828e, null);
                    eVarQ1.f10170b0 = 1;
                    aVar2.f10963g.getClass();
                    result.add(eVarQ1);
                }
            }
        }
        ((cq.a) ((hp.a) iVar.f7980e).f10978x).b(fVar, name, result, iVar);
    }

    @Override // ip.b0
    public final c k() {
        return new a(this.f13375o, n.f13365e);
    }

    @Override // ip.b0
    public final void m(LinkedHashSet result, up.e name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashSet linkedHashSetI = I(name);
        ArrayList arrayList = j0.f8559a;
        Intrinsics.checkNotNullParameter(name, "<this>");
        if (!j0.j.contains(name) && !ep.e.b(name)) {
            if (!linkedHashSetI.isEmpty()) {
                Iterator it = linkedHashSetI.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((vo.u) it.next()).isSuspend()) {
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI) {
                if (L((k0) obj)) {
                    arrayList2.add(obj);
                }
            }
            w(result, name, arrayList2, false);
            return;
        }
        int i7 = vq.j.f21949i;
        vq.j jVarF = vq.m.f();
        LinkedHashSet linkedHashSetF = ib.a.F(name, linkedHashSetI, n0.f14659d, this.f13374n, hq.m.f11044a, ((mq.l) ((hp.a) this.f13320b.f7980e).f10975u).f16034c);
        Intrinsics.checkNotNullExpressionValue(linkedHashSetF, "resolveOverridesForNonStaticMembers(...)");
        x(name, result, linkedHashSetF, result, new c1(1, this, p.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 1));
        x(name, result, linkedHashSetF, jVarF, new c1(1, this, p.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 2));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((k0) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(result, name, CollectionsKt.V(arrayList3, jVarF), true);
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ip.b0
    public final void n(ArrayList result, up.e name) {
        bp.x typeParameterOwner;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zIsAnnotation = this.f13375o.f3364a.isAnnotation();
        e4.i iVar = this.f13320b;
        if (zIsAnnotation && (typeParameterOwner = (bp.x) CollectionsKt.a0(((c) this.f13323e.invoke()).d(name))) != null) {
            o0 o0Var = vo.y.f21851d;
            gp.f containingDeclaration = gp.f.J0(this.f13374n, mf.f.F(iVar, typeParameterOwner), ls.l.B(typeParameterOwner.e()), false, typeParameterOwner.c(), ((hp.a) iVar.f7980e).j.c(typeParameterOwner), false);
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "create(...)");
            i0 i0VarI = mf.f.i(containingDeclaration, wo.g.f22379a);
            Intrinsics.checkNotNullExpressionValue(i0VarI, "createDefaultGetter(...)");
            containingDeclaration.F0(i0VarI, null, null, null);
            Intrinsics.checkNotNullParameter(iVar, "<this>");
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
            lq.z zVarL = b0.l(typeParameterOwner, new e4.i((hp.a) iVar.f7980e, new hp.e(iVar, containingDeclaration, typeParameterOwner, 0), (Lazy) iVar.f7982v));
            n0 n0Var = n0.f14659d;
            containingDeclaration.I0(zVarL, n0Var, p(), null, n0Var);
            i0VarI.K = zVarL;
            result.add(containingDeclaration);
        }
        Set setJ = J(name);
        if (setJ.isEmpty()) {
            return;
        }
        int i7 = vq.j.f21949i;
        vq.j jVarF = vq.m.f();
        vq.j jVarF2 = vq.m.f();
        y(setJ, result, jVarF, new o(this, 0));
        y(f1.c(setJ, jVarF), jVarF2, null, new o(this, 1));
        LinkedHashSet linkedHashSetD = f1.d(setJ, jVarF2);
        hp.a aVar = (hp.a) iVar.f7980e;
        LinkedHashSet linkedHashSetF = ib.a.F(name, linkedHashSetD, result, this.f13374n, aVar.f10962f, ((mq.l) aVar.f10975u).f16034c);
        Intrinsics.checkNotNullExpressionValue(linkedHashSetF, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(linkedHashSetF);
    }

    @Override // ip.b0
    public final Set o(eq.f kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (this.f13375o.f3364a.isAnnotation()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((c) this.f13323e.invoke()).f());
        Collection collectionH = this.f13374n.n().h();
        Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
        Iterator it = collectionH.iterator();
        while (it.hasNext()) {
            kotlin.collections.i0.o(linkedHashSet, ((lq.z) it.next()).J().f());
        }
        return linkedHashSet;
    }

    @Override // ip.b0
    public final yo.t p() {
        vo.f fVar = this.f13374n;
        if (fVar != null) {
            int i7 = xp.e.f22999a;
            return fVar.u0();
        }
        xp.e.a(0);
        throw null;
    }

    @Override // ip.b0
    public final vo.l q() {
        return this.f13374n;
    }

    @Override // ip.b0
    public final boolean r(gp.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (this.f13375o.f3364a.isAnnotation()) {
            return false;
        }
        return L(eVar);
    }

    @Override // ip.b0
    public final a0 s(bp.x method, ArrayList methodTypeParameters, lq.z returnType, List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        ((hp.a) this.f13320b.f7980e).f10961e.getClass();
        if (method == null) {
            fp.i.a(0);
            throw null;
        }
        if (this.f13374n == null) {
            fp.i.a(1);
            throw null;
        }
        if (returnType == null) {
            fp.i.a(2);
            throw null;
        }
        if (valueParameters == null) {
            fp.i.a(3);
            throw null;
        }
        List list = Collections.EMPTY_LIST;
        Intrinsics.checkNotNullExpressionValue(new fp.l(returnType, valueParameters, methodTypeParameters), "resolvePropagatedSignature(...)");
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        Intrinsics.checkNotNullExpressionValue(methodTypeParameters, "getTypeParameters(...)");
        if (list != null) {
            Intrinsics.checkNotNullExpressionValue(list, "getErrors(...)");
            return new a0(returnType, valueParameters, methodTypeParameters, list);
        }
        fp.l.a(7);
        throw null;
    }

    @Override // ip.b0
    public final String toString() {
        return "Lazy Java member scope for " + this.f13375o.c();
    }

    public final void v(ArrayList arrayList, gp.b bVar, int i7, bp.x xVar, lq.z zVar, lq.z zVar2) {
        lp.a pVar;
        up.e eVarC = xVar.c();
        if (zVar == null) {
            b1.a(2);
            throw null;
        }
        d1 d1VarG = b1.g(zVar, false);
        Intrinsics.checkNotNullExpressionValue(d1VarG, "makeNotNullable(...)");
        Object value = xVar.f3372a.getDefaultValue();
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (bp.c.e(value.getClass())) {
                pVar = new bp.t(null, (Enum) value);
            } else if (value instanceof Annotation) {
                pVar = new bp.f(null, (Annotation) value);
            } else if (value instanceof Object[]) {
                pVar = new bp.g(null, (Object[]) value);
            } else {
                pVar = value instanceof Class ? new bp.p(null, (Class) value) : new bp.v(null, value);
            }
        } else {
            pVar = null;
        }
        arrayList.add(new q0(bVar, null, i7, wo.g.f22379a, eVarC, d1VarG, pVar != null, false, false, zVar2 != null ? b1.g(zVar2, false) : null, ((hp.a) this.f13320b.f7980e).j.c(xVar)));
    }

    public final void w(LinkedHashSet linkedHashSet, up.e eVar, ArrayList arrayList, boolean z5) {
        hp.a aVar = (hp.a) this.f13320b.f7980e;
        LinkedHashSet<k0> linkedHashSetF = ib.a.F(eVar, arrayList, linkedHashSet, this.f13374n, aVar.f10962f, ((mq.l) aVar.f10975u).f16034c);
        Intrinsics.checkNotNullExpressionValue(linkedHashSetF, "resolveOverridesForNonStaticMembers(...)");
        if (!z5) {
            linkedHashSet.addAll(linkedHashSetF);
            return;
        }
        ArrayList arrayListV = CollectionsKt.V(linkedHashSet, linkedHashSetF);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(linkedHashSetF, 10));
        for (k0 k0VarA : linkedHashSetF) {
            k0 k0Var = (k0) ls.d.q(k0VarA);
            if (k0Var == null) {
                Intrinsics.checkNotNull(k0VarA);
            } else {
                Intrinsics.checkNotNull(k0VarA);
                k0VarA = A(k0VarA, k0Var, arrayListV);
            }
            arrayList2.add(k0VarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006c  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(up.e eVar, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, Function1 function1) {
        k0 k0VarA;
        Object next;
        k0 k0Var;
        k0 k0VarA2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            k0 k0Var2 = (k0) it.next();
            k0 k0Var3 = (k0) ls.d.p(k0Var2);
            k0 k0Var4 = null;
            if (k0Var3 != null) {
                String strO = ls.d.o(k0Var3);
                Intrinsics.checkNotNull(strO);
                up.e eVarE = up.e.e(strO);
                Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                Iterator it2 = ((Collection) function1.invoke(eVarE)).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        k0VarA = null;
                        break;
                    }
                    vo.t tVarM0 = ((k0) it2.next()).m0();
                    tVarM0.B(eVar);
                    tVarM0.X();
                    tVarM0.n();
                    vo.u uVarBuild = tVarM0.build();
                    Intrinsics.checkNotNull(uVarBuild);
                    k0 k0Var5 = (k0) uVarBuild;
                    if (E(k0Var3, k0Var5)) {
                        k0VarA = A(k0Var5, k0Var3, linkedHashSet);
                        break;
                    }
                }
            } else {
                k0VarA = null;
                break;
            }
            vq.m.b(abstractSet, k0VarA);
            vo.u uVarA = ep.e.a(k0Var2);
            if (uVarA == 0) {
                k0VarA2 = null;
            } else {
                up.e name = ((yo.l) uVarA).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Iterator it3 = ((Iterable) function1.invoke(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!K((k0) next, uVarA));
                k0 k0Var6 = (k0) next;
                if (k0Var6 != null) {
                    vo.t tVarM1 = k0Var6.m0();
                    List listL = uVarA.L();
                    Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                    ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(listL, 10));
                    Iterator it4 = listL.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((q0) it4.next()).getType());
                    }
                    List listL2 = k0Var6.L();
                    Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
                    tVarM1.c(yk.a.g(arrayList, listL2, uVarA));
                    tVarM1.X();
                    tVarM1.n();
                    tVarM1.x();
                    k0Var = (k0) tVarM1.build();
                } else {
                    k0Var = null;
                }
                if (k0Var == null) {
                    k0VarA2 = null;
                } else {
                    if (!L(k0Var)) {
                        k0Var = null;
                    }
                    if (k0Var != null) {
                        k0VarA2 = A(k0Var, uVarA, linkedHashSet);
                    } else {
                        k0VarA2 = null;
                    }
                }
            }
            vq.m.b(abstractSet, k0VarA2);
            if (k0Var2.isSuspend()) {
                up.e name2 = k0Var2.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                Iterator it5 = ((Iterable) function1.invoke(name2)).iterator();
                while (it5.hasNext()) {
                    k0 k0VarB = B((k0) it5.next());
                    if (k0VarB == null || !D(k0VarB, k0Var2)) {
                        k0VarB = null;
                    }
                    if (k0VarB != null) {
                        k0Var4 = k0VarB;
                        break;
                    }
                }
            }
            vq.m.b(abstractSet, k0Var4);
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, vq.j jVar, Function1 function1) {
        k0 k0VarH;
        yo.j0 j0VarR;
        gp.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            l0 overriddenProperty = (l0) it.next();
            if (C(overriddenProperty, function1)) {
                k0 getterMethod = G(overriddenProperty, function1);
                Intrinsics.checkNotNull(getterMethod);
                if (overriddenProperty.U()) {
                    k0VarH = H(overriddenProperty, function1);
                    Intrinsics.checkNotNull(k0VarH);
                } else {
                    k0VarH = null;
                }
                if (k0VarH != null) {
                    k0VarH.e();
                    getterMethod.e();
                }
                vo.f ownerDescriptor = this.f13374n;
                Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
                Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
                Intrinsics.checkNotNullParameter(overriddenProperty, "overriddenProperty");
                gp.d dVar2 = new gp.d(ownerDescriptor, wo.g.f22379a, getterMethod.e(), getterMethod.getVisibility(), k0VarH != null, overriddenProperty.getName(), getterMethod.d(), null, vo.c.f21792d, false, null);
                lq.z zVar = getterMethod.E;
                Intrinsics.checkNotNull(zVar);
                n0 n0Var = n0.f14659d;
                dVar2.I0(zVar, n0Var, p(), null, n0Var);
                i0 i0VarQ = mf.f.q(dVar2, getterMethod.getAnnotations(), false, getterMethod.d());
                i0VarQ.J = getterMethod;
                i0VarQ.E0(dVar2.getType());
                Intrinsics.checkNotNullExpressionValue(i0VarQ, "apply(...)");
                if (k0VarH != null) {
                    List listL = k0VarH.L();
                    Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                    q0 q0Var = (q0) CollectionsKt.firstOrNull(listL);
                    if (q0Var == null) {
                        throw new AssertionError("No parameter found for " + k0VarH);
                    }
                    j0VarR = mf.f.r(dVar2, k0VarH.getAnnotations(), q0Var.getAnnotations(), false, k0VarH.getVisibility(), k0VarH.d());
                    j0VarR.J = k0VarH;
                } else {
                    j0VarR = null;
                }
                dVar2.F0(i0VarQ, j0VarR, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (jVar != null) {
                    jVar.add(overriddenProperty);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z5 = this.f13376p;
        vo.f classDescriptor = this.f13374n;
        if (z5) {
            Collection collectionH = classDescriptor.n().h();
            Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
            return collectionH;
        }
        ((mq.l) ((hp.a) this.f13320b.f7980e).f10975u).getClass();
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Collection collectionH2 = classDescriptor.n().h();
        Intrinsics.checkNotNullExpressionValue(collectionH2, "getSupertypes(...)");
        return collectionH2;
    }
}
