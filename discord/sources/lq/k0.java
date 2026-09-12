package lq;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {
    static {
        new k0();
    }

    public k0() {
        f reportStrategy = f.f15203b;
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
    }

    public final void a(wo.h hVar, wo.h hVar2) {
        HashSet hashSet = new HashSet();
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            hashSet.add(((wo.b) it.next()).a());
        }
        Iterator it2 = hVar2.iterator();
        while (it2.hasNext()) {
            wo.b annotation = (wo.b) it2.next();
            if (hashSet.contains(annotation.a())) {
                Intrinsics.checkNotNullParameter(annotation, "annotation");
            }
        }
    }

    public final d0 b(e4.i iVar, l0 l0Var, boolean z5, int i7, boolean z6) {
        l0 l0VarA;
        e1 e1Var = e1.INVARIANT;
        vo.q0 q0Var = (vo.q0) iVar.f7981i;
        t0 t0VarC = c(new i0(((jq.v) q0Var).D0(), e1Var), iVar, null, i7);
        z zVarB = t0VarC.b();
        Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
        d0 d0VarB = c.b(zVarB);
        if (c.j(d0VarB)) {
            return d0VarB;
        }
        t0VarC.a();
        a(d0VarB.getAnnotations(), k.a(l0Var));
        if (!c.j(d0VarB)) {
            if (c.j(d0VarB)) {
                l0VarA = d0VarB.q0();
            } else {
                l0 other = d0VarB.q0();
                e4.r rVar = l0.f15225e;
                Intrinsics.checkNotNullParameter(other, "other");
                if (l0Var.isEmpty() && other.isEmpty()) {
                    l0VarA = l0Var;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) rVar.f8034e).values();
                    Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        j jVar = (j) l0Var.f20499d.get(iIntValue);
                        j jVar2 = (j) other.f20499d.get(iIntValue);
                        if (jVar != null) {
                            if (jVar2 != null) {
                                jVar = new j(c9.a.g(jVar.f15217a, jVar2.f15217a));
                            }
                            jVar2 = jVar;
                        } else if (jVar2 == null) {
                            jVar2 = null;
                        } else if (jVar != null) {
                            jVar2 = new j(c9.a.g(jVar2.f15217a, jVar.f15217a));
                        }
                        vq.m.b(arrayList, jVar2);
                    }
                    l0VarA = e4.r.A(arrayList);
                }
            }
            d0VarB = c.q(d0VarB, null, l0VarA, 1);
        }
        d0 d0VarI = b1.i(d0VarB, z5);
        Intrinsics.checkNotNullExpressionValue(d0VarI, "let(...)");
        if (!z6) {
            return d0VarI;
        }
        yo.d dVar = ((yo.e) q0Var).F;
        Intrinsics.checkNotNullExpressionValue(dVar, "getTypeConstructor(...)");
        return c.F(d0VarI, c.v(eq.n.f8648b, (List) iVar.f7982v, l0Var, dVar, z5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t0 c(t0 t0Var, e4.i iVar, vo.r0 r0Var, int i7) {
        e1 variance;
        e1 e1Var;
        e1 e1Var2;
        vo.l typeAlias = (vo.q0) iVar.f7981i;
        if (i7 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + ((yo.l) typeAlias).getName());
        }
        if (t0Var.c()) {
            Intrinsics.checkNotNull(r0Var);
            i0 i0VarJ = b1.j(r0Var);
            Intrinsics.checkNotNullExpressionValue(i0VarJ, "makeStarProjection(...)");
            return i0VarJ;
        }
        z zVarB = t0Var.b();
        Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
        q0 constructor = zVarB.r0();
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        vo.i iVarG = constructor.g();
        t0 t0Var2 = iVarG instanceof vo.r0 ? (t0) ((Map) iVar.f7983w).get(iVarG) : null;
        if (t0Var2 != null) {
            if (t0Var2.c()) {
                Intrinsics.checkNotNull(r0Var);
                i0 i0VarJ2 = b1.j(r0Var);
                Intrinsics.checkNotNullExpressionValue(i0VarJ2, "makeStarProjection(...)");
                return i0VarJ2;
            }
            d1 substitutedArgument = t0Var2.b().w0();
            e1 e1VarA = t0Var2.a();
            Intrinsics.checkNotNullExpressionValue(e1VarA, "getProjectionKind(...)");
            e1 e1VarA2 = t0Var.a();
            Intrinsics.checkNotNullExpressionValue(e1VarA2, "getProjectionKind(...)");
            if (e1VarA2 != e1VarA && e1VarA2 != (e1Var2 = e1.INVARIANT)) {
                if (e1VarA == e1Var2) {
                    e1VarA = e1VarA2;
                } else {
                    Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
                    Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
                }
            }
            if (r0Var == null || (variance = r0Var.getVariance()) == null) {
                variance = e1.INVARIANT;
            }
            if (variance != e1VarA && variance != (e1Var = e1.INVARIANT)) {
                if (e1VarA == e1Var) {
                    e1VarA = e1Var;
                } else {
                    Intrinsics.checkNotNullParameter(typeAlias, "typeAlias");
                    Intrinsics.checkNotNullParameter(substitutedArgument, "substitutedArgument");
                }
            }
            a(zVarB.getAnnotations(), substitutedArgument.getAnnotations());
            d0 d0VarI = b1.i(c.b(substitutedArgument), zVarB.t0());
            Intrinsics.checkNotNullExpressionValue(d0VarI, "makeNullableIfNeeded(...)");
            l0 l0VarQ0 = zVarB.q0();
            if (!c.j(d0VarI)) {
                if (c.j(d0VarI)) {
                    l0VarQ0 = d0VarI.q0();
                } else {
                    l0 other = d0VarI.q0();
                    l0VarQ0.getClass();
                    e4.r rVar = l0.f15225e;
                    Intrinsics.checkNotNullParameter(other, "other");
                    if (!l0VarQ0.isEmpty() || !other.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Collection collectionValues = ((ConcurrentHashMap) rVar.f8034e).values();
                        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            j jVar = (j) l0VarQ0.f20499d.get(iIntValue);
                            j jVar2 = (j) other.f20499d.get(iIntValue);
                            if (jVar != null) {
                                if (jVar2 != null) {
                                    jVar = new j(c9.a.g(jVar.f15217a, jVar2.f15217a));
                                }
                                jVar2 = jVar;
                            } else if (jVar2 == null) {
                                jVar2 = null;
                            } else if (jVar != null) {
                                jVar2 = new j(c9.a.g(jVar2.f15217a, jVar.f15217a));
                            }
                            vq.m.b(arrayList, jVar2);
                        }
                        l0VarQ0 = e4.r.A(arrayList);
                    }
                }
                d0VarI = c.q(d0VarI, null, l0VarQ0, 1);
            }
            return new i0(d0VarI, e1VarA);
        }
        d1 d1VarW0 = t0Var.b().w0();
        Intrinsics.checkNotNullParameter(d1VarW0, "<this>");
        d1VarW0.w0();
        d0 d0VarB = c.b(d1VarW0);
        if (!c.j(d0VarB)) {
            Intrinsics.checkNotNullParameter(d0VarB, "<this>");
            qq.a predicate = qq.a.f18990i;
            Intrinsics.checkNotNullParameter(d0VarB, "<this>");
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            if (b1.c(d0VarB, predicate, null)) {
                q0 q0VarR0 = d0VarB.r0();
                vo.i iVarG2 = q0VarR0.g();
                q0VarR0.getParameters().size();
                d0VarB.l0().size();
                if (!(iVarG2 instanceof vo.r0)) {
                    int i10 = 0;
                    if (!(iVarG2 instanceof vo.q0)) {
                        d0 d0VarD = d(d0VarB, iVar, i7);
                        Intrinsics.checkNotNullExpressionValue(y0.d(d0VarD), "create(...)");
                        for (Object obj : d0VarD.l0()) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                kotlin.collections.d0.k();
                                throw null;
                            }
                            t0 t0Var3 = (t0) obj;
                            if (!t0Var3.c()) {
                                z zVarB2 = t0Var3.b();
                                Intrinsics.checkNotNullExpressionValue(zVarB2, "getType(...)");
                                Intrinsics.checkNotNullParameter(zVarB2, "<this>");
                                qq.a predicate2 = qq.a.f18989e;
                                Intrinsics.checkNotNullParameter(zVarB2, "<this>");
                                Intrinsics.checkNotNullParameter(predicate2, "predicate");
                                if (!b1.c(zVarB2, predicate2, null)) {
                                }
                            }
                            i10 = i11;
                        }
                        return new i0(d0VarD, t0Var.a());
                    }
                    vo.q0 typeAliasDescriptor = (vo.q0) iVarG2;
                    if (iVar.s(typeAliasDescriptor)) {
                        Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAlias");
                        return new i0(nq.l.c(nq.k.RECURSIVE_TYPE_ALIAS, ((yo.l) typeAliasDescriptor).getName().f21269d), e1.INVARIANT);
                    }
                    List listL0 = d0VarB.l0();
                    ArrayList arguments = new ArrayList(kotlin.collections.e0.l(listL0, 10));
                    for (Object obj2 : listL0) {
                        int i12 = i10 + 1;
                        if (i10 < 0) {
                            kotlin.collections.d0.k();
                            throw null;
                        }
                        arguments.add(c((t0) obj2, iVar, (vo.r0) q0VarR0.getParameters().get(i10), i7 + 1));
                        i10 = i12;
                    }
                    Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
                    Intrinsics.checkNotNullParameter(arguments, "arguments");
                    List parameters = ((yo.e) typeAliasDescriptor).F.getParameters();
                    Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(parameters, 10));
                    Iterator it2 = parameters.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((vo.r0) it2.next()).a());
                    }
                    d0 d0VarB2 = b(new e4.i(9, iVar, typeAliasDescriptor, arguments, kotlin.collections.w0.l(CollectionsKt.n0(arrayList2, arguments))), d0VarB.q0(), d0VarB.t0(), i7 + 1, false);
                    d0 d0VarD2 = d(d0VarB, iVar, i7);
                    Intrinsics.checkNotNullParameter(d0VarB2, "<this>");
                    d0VarB2.w0();
                    return new i0(c.F(d0VarB2, d0VarD2), t0Var.a());
                }
            }
        }
        return t0Var;
    }

    public final d0 d(d0 d0Var, e4.i iVar, int i7) {
        q0 q0VarR0 = d0Var.r0();
        List listL0 = d0Var.l0();
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(listL0, 10));
        int i10 = 0;
        for (Object obj : listL0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            t0 t0Var = (t0) obj;
            t0 t0VarC = c(t0Var, iVar, (vo.r0) q0VarR0.getParameters().get(i10), i7 + 1);
            if (!t0VarC.c()) {
                t0VarC = new i0(b1.h(t0VarC.b(), t0Var.b().t0()), t0VarC.a());
            }
            arrayList.add(t0VarC);
            i10 = i11;
        }
        return c.q(d0Var, arrayList, null, 2);
    }
}
