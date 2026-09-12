package lq;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f15202a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f15203b = new f();

    public static final boolean a(mq.b bVar, pq.e eVar) {
        d1 d1VarC;
        d0 d0VarX;
        return bVar.c(eVar) || ((eVar instanceof pq.c) && (d1VarC = bVar.C(bVar.j(bVar.g((pq.c) eVar)))) != null && (d0VarX = bVar.x(d1VarC)) != null && bVar.c(d0VarX));
    }

    public static final boolean b(mq.b bVar, p0 p0Var, pq.e eVar, pq.e eVar2, boolean z5) {
        Collection<pq.d> collectionI = bVar.I(eVar);
        if ((collectionI instanceof Collection) && collectionI.isEmpty()) {
            return false;
        }
        for (pq.d dVar : collectionI) {
            if (Intrinsics.areEqual(bVar.Q(dVar), bVar.D(eVar2))) {
                return true;
            }
            if (z5 && k(f15202a, p0Var, eVar2, dVar)) {
                return true;
            }
        }
        return false;
    }

    public static List c(p0 p0Var, pq.e eVar, pq.h hVar) {
        c cVarK;
        o0 o0Var = o0.f15233c;
        mq.b bVar = p0Var.f15238c;
        bVar.E(eVar, hVar);
        if (!bVar.G(hVar) && bVar.r(eVar)) {
            return kotlin.collections.n0.f14659d;
        }
        if (bVar.A(hVar)) {
            if (!bVar.j0(bVar.D(eVar), hVar)) {
                return kotlin.collections.n0.f14659d;
            }
            pq.b bVar2 = pq.b.f18511d;
            d0 d0VarI0 = bVar.i0(eVar);
            if (d0VarI0 != null) {
                eVar = d0VarI0;
            }
            return kotlin.collections.c0.c(eVar);
        }
        vq.g gVar = new vq.g();
        p0Var.c();
        ArrayDeque arrayDeque = p0Var.f15242g;
        Intrinsics.checkNotNull(arrayDeque);
        vq.j jVar = p0Var.f15243h;
        Intrinsics.checkNotNull(jVar);
        arrayDeque.push(eVar);
        while (!arrayDeque.isEmpty()) {
            pq.e eVar2 = (pq.e) arrayDeque.pop();
            Intrinsics.checkNotNull(eVar2);
            if (jVar.add(eVar2)) {
                pq.b bVar3 = pq.b.f18511d;
                pq.e eVarI0 = bVar.i0(eVar2);
                if (eVarI0 == null) {
                    eVarI0 = eVar2;
                }
                if (bVar.j0(bVar.D(eVarI0), hVar)) {
                    gVar.add(eVarI0);
                    cVarK = o0Var;
                } else {
                    cVarK = bVar.h0(eVarI0) == 0 ? o0.f15232b : bVar.K(eVarI0);
                }
                if (Intrinsics.areEqual(cVarK, o0Var)) {
                    cVarK = null;
                }
                if (cVarK != null) {
                    Iterator it = bVar.l0(bVar.D(eVar2)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(cVarK.D(p0Var, (pq.d) it.next()));
                    }
                }
            }
        }
        p0Var.a();
        return gVar;
    }

    public static List d(p0 p0Var, pq.e eVar, pq.h hVar) {
        List listC = c(p0Var, eVar, hVar);
        mq.b bVar = p0Var.f15238c;
        if (listC.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                pq.g gVarF0 = bVar.f0((pq.e) obj);
                int iS = bVar.s(gVarF0);
                int i7 = 0;
                while (true) {
                    if (i7 >= iS) {
                        arrayList.add(obj);
                        break;
                    }
                    d1 d1VarC = bVar.C(bVar.f(gVarF0, i7));
                    if ((d1VarC != null ? bVar.o0(d1VarC) : null) != null) {
                        break;
                    }
                    i7++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listC;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x022f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0292  */
    /* JADX WARN: Code duplicated, block: B:23:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0095  */
    /* JADX WARN: Code duplicated, block: B:322:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:? A[LOOP:11: B:31:0x0099->B:324:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:? A[LOOP:12: B:47:0x00d8->B:327:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static boolean e(p0 state, pq.d dVar, pq.d dVar2) {
        Boolean boolValueOf;
        Boolean bool;
        List<pq.e> listC;
        o0 o0Var;
        boolean z5;
        d1 d1VarC;
        q0 q0VarD;
        q0 q0VarD2;
        vo.r0 r0VarH;
        Collection collectionL0;
        Iterator it;
        Collection collectionL1;
        Iterator it2;
        boolean z6;
        mq.b context = state.f15238c;
        d1 subType = state.d(state.e(dVar));
        d1 superType = state.d(state.e(dVar2));
        d0 subType2 = context.O(subType);
        d0 d0VarX = context.x(superType);
        boolean z7 = false;
        if (!context.p(subType2) && !context.p(d0VarX)) {
            context.Z(subType2);
            context.S(subType2);
            context.S(d0VarX);
            pq.c superType2 = context.g0(d0VarX);
            pq.d dVarE0 = superType2 != null ? context.e0(superType2) : null;
            f fVar = f15202a;
            if (superType2 == null || dVarE0 == null) {
                q0VarD = context.D(d0VarX);
                if (context.a0(q0VarD)) {
                    context.Y(d0VarX);
                    collectionL1 = context.l0(q0VarD);
                    if (!(collectionL1 instanceof Collection) && collectionL1.isEmpty()) {
                        z6 = true;
                        break;
                    }
                    it2 = collectionL1.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z6 = true;
                            break;
                        }
                        if (!k(fVar, state, subType2, (pq.d) it2.next())) {
                            z6 = false;
                            break;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z6);
                } else {
                    q0VarD2 = context.D(subType2);
                    if (subType2 instanceof pq.c) {
                        r0VarH = h(context, d0VarX, subType2);
                        if (r0VarH == null && context.n0(r0VarH, context.D(d0VarX))) {
                            boolValueOf = Boolean.TRUE;
                        } else {
                            boolValueOf = null;
                        }
                    } else {
                        if (context.a0(q0VarD2)) {
                            collectionL0 = context.l0(q0VarD2);
                            if ((collectionL0 instanceof Collection) || !collectionL0.isEmpty()) {
                                it = collectionL0.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        r0VarH = h(context, d0VarX, subType2);
                                        if (r0VarH == null) {
                                        }
                                    } else if (!(((pq.d) it.next()) instanceof pq.c)) {
                                    }
                                }
                            } else {
                                r0VarH = h(context, d0VarX, subType2);
                                if (r0VarH == null) {
                                }
                            }
                        }
                        boolValueOf = null;
                    }
                }
            } else {
                if (context.Y(d0VarX)) {
                    dVarE0 = context.b0(dVarE0);
                } else if (context.B(d0VarX)) {
                    dVarE0 = context.d0(dVarE0);
                }
                Intrinsics.checkNotNullParameter(subType2, "subType");
                Intrinsics.checkNotNullParameter(superType2, "superType");
                n0[] n0VarArr = n0.f15229d;
                if (k(fVar, state, subType2, dVarE0)) {
                    boolValueOf = Boolean.TRUE;
                } else {
                    q0VarD = context.D(d0VarX);
                    if (context.a0(q0VarD)) {
                        context.Y(d0VarX);
                        collectionL1 = context.l0(q0VarD);
                        if (!(collectionL1 instanceof Collection)) {
                            it2 = collectionL1.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z6 = true;
                                    break;
                                }
                                if (!k(fVar, state, subType2, (pq.d) it2.next())) {
                                    z6 = false;
                                    break;
                                }
                            }
                        } else {
                            it2 = collectionL1.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z6 = true;
                                    break;
                                }
                                if (!k(fVar, state, subType2, (pq.d) it2.next())) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        boolValueOf = Boolean.valueOf(z6);
                    } else {
                        q0VarD2 = context.D(subType2);
                        if (subType2 instanceof pq.c) {
                            r0VarH = h(context, d0VarX, subType2);
                            if (r0VarH == null) {
                                boolValueOf = null;
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            if (context.a0(q0VarD2)) {
                                collectionL0 = context.l0(q0VarD2);
                                if (collectionL0 instanceof Collection) {
                                    it = collectionL0.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            r0VarH = h(context, d0VarX, subType2);
                                            if (r0VarH == null) {
                                            }
                                        } else if (!(((pq.d) it.next()) instanceof pq.c)) {
                                        }
                                    }
                                } else {
                                    it = collectionL0.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            r0VarH = h(context, d0VarX, subType2);
                                            if (r0VarH == null) {
                                            }
                                        } else if (!(((pq.d) it.next()) instanceof pq.c)) {
                                        }
                                    }
                                }
                            }
                            boolValueOf = null;
                        }
                    }
                }
            }
        } else if (state.f15236a) {
            boolValueOf = Boolean.TRUE;
        } else if (!context.Y(subType2) || context.Y(d0VarX)) {
            d0 a10 = context.X(subType2);
            d0 b10 = context.X(d0VarX);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(a10, "a");
            Intrinsics.checkNotNullParameter(b10, "b");
            boolValueOf = Boolean.valueOf(c.z(context, a10, b10));
        } else {
            boolValueOf = Boolean.FALSE;
        }
        if (boolValueOf != null) {
            boolean zBooleanValue = boolValueOf.booleanValue();
            Intrinsics.checkNotNullParameter(subType, "subType");
            Intrinsics.checkNotNullParameter(superType, "superType");
            return zBooleanValue;
        }
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        pq.e subType3 = context.O(subType);
        d0 superType3 = context.x(superType);
        o0 o0Var2 = o0.f15233c;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType3, "subType");
        Intrinsics.checkNotNullParameter(superType3, "superType");
        o0 o0Var3 = o0.f15232b;
        if (!context.Y(superType3) && !context.B(subType3) && !context.P(subType3) && ((!(subType3 instanceof pq.c) || !context.z((pq.c) subType3)) && !c.g(state, subType3, o0Var3))) {
            if (context.B(superType3) || c.g(state, superType3, o0.f15234d) || context.r(subType3)) {
                return false;
            }
            q0 end = context.D(superType3);
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(subType3, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            if (!c.i(state, subType3, end)) {
                state.c();
                ArrayDeque arrayDeque = state.f15242g;
                Intrinsics.checkNotNull(arrayDeque);
                vq.j jVar = state.f15243h;
                Intrinsics.checkNotNull(jVar);
                arrayDeque.push(subType3);
                loop0: while (true) {
                    if (arrayDeque.isEmpty()) {
                        state.a();
                        return false;
                    }
                    pq.e eVar = (pq.e) arrayDeque.pop();
                    Intrinsics.checkNotNull(eVar);
                    if (jVar.add(eVar)) {
                        o0 o0Var4 = context.Y(eVar) ? o0Var2 : o0Var3;
                        if (Intrinsics.areEqual(o0Var4, o0Var2)) {
                            o0Var4 = null;
                        }
                        if (o0Var4 == null) {
                            continue;
                        } else {
                            Iterator it3 = context.l0(context.D(eVar)).iterator();
                            while (it3.hasNext()) {
                                pq.e eVarD = o0Var4.D(state, (pq.d) it3.next());
                                if (c.i(state, eVarD, end)) {
                                    state.a();
                                    break loop0;
                                }
                                arrayDeque.add(eVarD);
                            }
                        }
                    }
                }
            }
        }
        if (!context.c(subType3) && !context.c(superType3)) {
            bool = null;
        } else if (a(context, subType3) && a(context, superType3)) {
            bool = Boolean.TRUE;
        } else if (context.c(subType3)) {
            if (b(context, state, subType3, superType3, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (context.c(superType3)) {
            q0 q0VarD3 = context.D(subType3);
            if (q0VarD3 instanceof y) {
                Collection collectionL2 = context.l0(q0VarD3);
                if (!(collectionL2 instanceof Collection) || !collectionL2.isEmpty()) {
                    Iterator it4 = collectionL2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            d0 d0VarE = context.e((pq.d) it4.next());
                            if (d0VarE != null && context.c(d0VarE)) {
                            }
                        } else if (!b(context, state, superType3, subType3, true)) {
                            bool = null;
                        }
                    }
                } else if (!b(context, state, superType3, subType3, true)) {
                    bool = null;
                }
            } else if (!b(context, state, superType3, subType3, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            Intrinsics.checkNotNullParameter(subType3, "subType");
            Intrinsics.checkNotNullParameter(superType3, "superType");
            return zBooleanValue2;
        }
        q0 superConstructor = context.D(superType3);
        if ((context.j0(context.D(subType3), superConstructor) && context.h(superConstructor) == 0) || context.M(context.D(superType3))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType3, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        if (context.r(subType3)) {
            listC = d(state, subType3, superConstructor);
        } else if (context.G(superConstructor) || context.l(superConstructor)) {
            vq.g<pq.e> gVar = new vq.g();
            state.c();
            ArrayDeque arrayDeque2 = state.f15242g;
            Intrinsics.checkNotNull(arrayDeque2);
            vq.j jVar2 = state.f15243h;
            Intrinsics.checkNotNull(jVar2);
            arrayDeque2.push(subType3);
            while (!arrayDeque2.isEmpty()) {
                pq.e eVar2 = (pq.e) arrayDeque2.pop();
                Intrinsics.checkNotNull(eVar2);
                if (jVar2.add(eVar2)) {
                    if (context.r(eVar2)) {
                        gVar.add(eVar2);
                        o0Var = o0Var2;
                    } else {
                        o0Var = o0Var3;
                    }
                    if (Intrinsics.areEqual(o0Var, o0Var2)) {
                        o0Var = null;
                    }
                    if (o0Var != null) {
                        Iterator it5 = context.l0(context.D(eVar2)).iterator();
                        while (it5.hasNext()) {
                            arrayDeque2.add(o0Var.D(state, (pq.d) it5.next()));
                        }
                    }
                }
            }
            state.a();
            ArrayList arrayList = new ArrayList();
            for (pq.e eVar3 : gVar) {
                Intrinsics.checkNotNull(eVar3);
                kotlin.collections.i0.o(arrayList, d(state, eVar3, superConstructor));
            }
            listC = arrayList;
        } else {
            listC = c(state, subType3, superConstructor);
        }
        listC.size();
        int i7 = 10;
        ArrayList<pq.e> arrayList2 = new ArrayList(kotlin.collections.e0.l(listC, 10));
        for (pq.e eVar4 : listC) {
            d0 d0VarE2 = context.e(state.d(eVar4));
            if (d0VarE2 != null) {
                eVar4 = d0VarE2;
            }
            arrayList2.add(eVar4);
        }
        int size = arrayList2.size();
        if (size == 0) {
            q0 q0VarD4 = context.D(subType3);
            if (context.G(q0VarD4)) {
                return context.k(q0VarD4);
            }
            if (context.k(context.D(subType3))) {
                return true;
            }
            state.c();
            ArrayDeque arrayDeque3 = state.f15242g;
            Intrinsics.checkNotNull(arrayDeque3);
            vq.j jVar3 = state.f15243h;
            Intrinsics.checkNotNull(jVar3);
            arrayDeque3.push(subType3);
            while (!arrayDeque3.isEmpty()) {
                pq.e eVar5 = (pq.e) arrayDeque3.pop();
                Intrinsics.checkNotNull(eVar5);
                if (jVar3.add(eVar5)) {
                    o0 o0Var5 = context.r(eVar5) ? o0Var2 : o0Var3;
                    if (Intrinsics.areEqual(o0Var5, o0Var2)) {
                        o0Var5 = null;
                    }
                    if (o0Var5 == null) {
                        continue;
                    } else {
                        Iterator it6 = context.l0(context.D(eVar5)).iterator();
                        while (it6.hasNext()) {
                            pq.e eVarD2 = o0Var5.D(state, (pq.d) it6.next());
                            if (context.k(context.D(eVarD2))) {
                                state.a();
                                return true;
                            }
                            arrayDeque3.add(eVarD2);
                        }
                    }
                }
            }
            state.a();
            return false;
        }
        if (size == 1) {
            return j(state, context.f0((pq.e) CollectionsKt.J(arrayList2)), superType3);
        }
        pq.a aVar = new pq.a(context.h(superConstructor));
        int iH = context.h(superConstructor);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < iH) {
            z10 = (z10 || context.m(context.W(superConstructor, i10)) != pq.i.OUT) ? true : z7;
            if (z10) {
                z5 = z7;
            } else {
                ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.l(arrayList2, i7));
                for (pq.e eVar6 : arrayList2) {
                    t0 t0VarL = context.L(eVar6, i10);
                    if (t0VarL != null) {
                        boolean z11 = z7;
                        if (context.R(t0VarL) != pq.i.INV) {
                            t0VarL = null;
                        }
                        if (t0VarL != null && (d1VarC = context.C(t0VarL)) != null) {
                            arrayList3.add(d1VarC);
                            z7 = z11;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + eVar6 + ", subType: " + subType3 + ", superType: " + superType3).toString());
                }
                z5 = z7;
                aVar.add(context.N(context.T(arrayList3)));
            }
            i10++;
            z7 = z5;
            i7 = 10;
        }
        if (!z10 && j(state, aVar, superType3)) {
            return true;
        }
        d block = new d(arrayList2, state, context, superType3);
        Intrinsics.checkNotNullParameter(block, "block");
        m0 m0Var = new m0();
        block.invoke(m0Var);
        return m0Var.f15227a;
    }

    public static boolean g(p0 state, pq.d a10, pq.d b10) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        mq.b bVar = state.f15238c;
        if (a10 == b10) {
            return true;
        }
        if (i(bVar, a10) && i(bVar, b10)) {
            d1 d1VarD = state.d(state.e(a10));
            d1 d1VarD2 = state.d(state.e(b10));
            d0 d0VarO = bVar.O(d1VarD);
            if (!bVar.j0(bVar.Q(d1VarD), bVar.Q(d1VarD2))) {
                return false;
            }
            if (bVar.h0(d0VarO) == 0) {
                return bVar.t(d1VarD) || bVar.t(d1VarD2) || bVar.Y(d0VarO) == bVar.Y(bVar.O(d1VarD2));
            }
        }
        f fVar = f15202a;
        return k(fVar, state, a10, b10) && k(fVar, state, b10, a10);
    }

    public static vo.r0 h(mq.b bVar, pq.d dVar, pq.d dVar2) {
        d1 d1VarC;
        int iH0 = bVar.h0(dVar);
        int i7 = 0;
        while (true) {
            if (i7 >= iH0) {
                return null;
            }
            t0 t0VarQ = bVar.q(dVar, i7);
            t0 t0Var = bVar.F(t0VarQ) ? null : t0VarQ;
            if (t0Var != null && (d1VarC = bVar.C(t0Var)) != null) {
                boolean z5 = bVar.o(bVar.O(d1VarC)) && bVar.o(bVar.O(dVar2));
                if (Intrinsics.areEqual(d1VarC, dVar2) || (z5 && Intrinsics.areEqual(bVar.Q(d1VarC), bVar.Q(dVar2)))) {
                    return bVar.W(bVar.Q(dVar), i7);
                }
                vo.r0 r0VarH = h(bVar, d1VarC, dVar2);
                if (r0VarH != null) {
                    return r0VarH;
                }
            }
            i7++;
        }
    }

    public static boolean i(mq.b bVar, pq.d dVar) {
        if (!bVar.k0(bVar.Q(dVar))) {
            return false;
        }
        bVar.v(dVar);
        return (bVar.d(dVar) || bVar.P(dVar) || bVar.i(dVar)) ? false : true;
    }

    public static boolean j(p0 p0Var, pq.g capturedSubArguments, pq.e superType) {
        boolean zK;
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        mq.b bVar = p0Var.f15238c;
        q0 q0VarD = bVar.D(superType);
        int iS = bVar.s(capturedSubArguments);
        int iH = bVar.h(q0VarD);
        if (iS == iH && iS == bVar.h0(superType)) {
            for (int i7 = 0; i7 < iH; i7++) {
                t0 t0VarQ = bVar.q(superType, i7);
                d1 d1VarC = bVar.C(t0VarQ);
                if (d1VarC != null) {
                    t0 t0VarF = bVar.f(capturedSubArguments, i7);
                    bVar.R(t0VarF);
                    pq.i iVar = pq.i.INV;
                    d1 d1VarC2 = bVar.C(t0VarF);
                    Intrinsics.checkNotNull(d1VarC2);
                    pq.i declared = bVar.m(bVar.W(q0VarD, i7));
                    pq.i useSite = bVar.R(t0VarQ);
                    Intrinsics.checkNotNullParameter(declared, "declared");
                    Intrinsics.checkNotNullParameter(useSite, "useSite");
                    if (declared == iVar) {
                        declared = useSite;
                    } else if (useSite != iVar && declared != useSite) {
                        declared = null;
                    }
                    if (declared == null) {
                        return p0Var.f15236a;
                    }
                    if (declared == iVar) {
                        l(bVar, d1VarC2, d1VarC);
                        l(bVar, d1VarC, d1VarC2);
                    }
                    int i10 = p0Var.f15241f;
                    if (i10 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + d1VarC2).toString());
                    }
                    p0Var.f15241f = i10 + 1;
                    int iOrdinal = declared.ordinal();
                    f fVar = f15202a;
                    if (iOrdinal == 0) {
                        zK = k(fVar, p0Var, d1VarC, d1VarC2);
                    } else if (iOrdinal == 1) {
                        zK = k(fVar, p0Var, d1VarC2, d1VarC);
                    } else {
                        if (iOrdinal != 2) {
                            throw new rn.n();
                        }
                        zK = g(p0Var, d1VarC2, d1VarC);
                    }
                    p0Var.f15241f--;
                    if (!zK) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean k(f fVar, p0 state, pq.d subType, pq.d superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.b(subType, superType)) {
            return e(state, subType, superType);
        }
        return false;
    }

    public static void l(mq.b bVar, pq.d dVar, pq.d dVar2) {
        pq.d dVarE = bVar.e(dVar);
        if (dVarE instanceof pq.c) {
            pq.c cVar = (pq.c) dVarE;
            if (!bVar.u(cVar) && bVar.F(bVar.j(bVar.g(cVar))) && bVar.p0(cVar) == pq.b.f18511d) {
                bVar.Q(dVar2);
            }
        }
    }

    public static o m(d1 type, boolean z5) {
        boolean zG;
        Intrinsics.checkNotNullParameter(type, "type");
        if (type instanceof o) {
            return (o) type;
        }
        type.r0();
        if ((type.r0().g() instanceof vo.r0) || (type instanceof mq.h)) {
            vo.i iVarG = type.r0().g();
            yo.o0 o0Var = iVarG instanceof yo.o0 ? (yo.o0) iVarG : null;
            zG = true;
            if (o0Var == null || o0Var.J) {
                if (z5 && (type.r0().g() instanceof vo.r0)) {
                    zG = b1.e(type);
                } else {
                    Intrinsics.checkNotNullParameter(type, "type");
                    zG = true ^ c.g(mq.m.f16035d.r0(), c.l(type), o0.f15232b);
                }
            }
        } else {
            zG = false;
        }
        if (!zG) {
            return null;
        }
        if (type instanceof s) {
            s sVar = (s) type;
            Intrinsics.areEqual(sVar.f15248e.r0(), sVar.f15249i.r0());
        }
        return new o(c.l(type).x0(false), z5);
    }

    public w0 f(q0 typeConstructor, List argumentsList) {
        Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
        Intrinsics.checkNotNullParameter(argumentsList, "arguments");
        List parameters = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        vo.r0 r0Var = (vo.r0) CollectionsKt.S(parameters);
        if (r0Var == null || !r0Var.X()) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
            return new v((vo.r0[]) parameters.toArray(new vo.r0[0]), (t0[]) argumentsList.toArray(new t0[0]), false);
        }
        List parameters2 = typeConstructor.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(parameters2, 10));
        Iterator it = parameters2.iterator();
        while (it.hasNext()) {
            arrayList.add(((vo.r0) it.next()).n());
        }
        Map map = kotlin.collections.w0.l(CollectionsKt.n0(arrayList, argumentsList));
        Intrinsics.checkNotNullParameter(map, "map");
        return new j0(1, map);
    }
}
