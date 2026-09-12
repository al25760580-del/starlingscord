package lq;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static y0 A(List list, w0 w0Var, vo.l lVar, ArrayList arrayList) {
        if (w0Var == null) {
            a(1);
            throw null;
        }
        if (lVar == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        y0 y0VarB = B(list, w0Var, lVar, arrayList, null);
        if (y0VarB != null) {
            return y0VarB;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c2  */
    public static y0 B(List list, w0 w0Var, vo.l lVar, List list2, boolean[] zArr) {
        y0 y0Var;
        if (w0Var == null) {
            a(6);
            throw null;
        }
        if (lVar == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            vo.r0 r0Var = (vo.r0) it.next();
            yo.o0 o0VarE0 = yo.o0.E0(lVar, r0Var.getAnnotations(), r0Var.u(), r0Var.getVariance(), r0Var.getName(), i7, r0Var.T());
            map.put(r0Var.n(), new i0(o0VarE0.j()));
            map2.put(r0Var, o0VarE0);
            list2.add(o0VarE0);
            i7++;
        }
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(map, "map");
        j0 j0Var = new j0(1, map);
        y0 y0VarF = y0.f(w0Var, j0Var);
        y0 y0VarF2 = y0.f(new v0(w0Var, 0), j0Var);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            vo.r0 r0Var2 = (vo.r0) it2.next();
            yo.o0 o0Var = (yo.o0) map2.get(r0Var2);
            for (z zVar : r0Var2.getUpperBounds()) {
                vo.i iVarG = zVar.r0().g();
                if (iVarG instanceof vo.r0) {
                    vo.r0 typeParameter = (vo.r0) iVarG;
                    Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                    if (c9.a.y(typeParameter, null, 6)) {
                        y0Var = y0VarF;
                    } else {
                        y0Var = y0VarF2;
                    }
                } else {
                    y0Var = y0VarF2;
                }
                z zVarJ = y0Var.j(zVar, e1.OUT_VARIANCE);
                if (zVarJ == null) {
                    return null;
                }
                if (zVarJ != zVar && zArr != null) {
                    zArr[0] = true;
                }
                if (o0Var.J) {
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + o0Var.G0());
                }
                if (!j(zVarJ)) {
                    o0Var.I.add(zVarJ);
                }
            }
            if (o0Var.J) {
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + o0Var.G0());
            }
            o0Var.J = true;
        }
        return y0VarF;
    }

    public static final l0 C(wo.h annotations) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (annotations.isEmpty()) {
            l0.f15225e.getClass();
            return l0.f15226i;
        }
        e4.r rVar = l0.f15225e;
        List listC = kotlin.collections.c0.c(new j(annotations));
        rVar.getClass();
        return e4.r.A(listC);
    }

    public static final d0 E(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        d1 d1VarW0 = zVar.w0();
        if (d1VarW0 instanceof s) {
            return ((s) d1VarW0).f15249i;
        }
        if (d1VarW0 instanceof d0) {
            return (d0) d1VarW0;
        }
        throw new rn.n();
    }

    public static final d0 F(d0 d0Var, d0 abbreviatedType) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(abbreviatedType, "abbreviatedType");
        return j(d0Var) ? d0Var : new a(d0Var, abbreviatedType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final d1 G(d1 d1Var, z zVar) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        if (d1Var instanceof c1) {
            return G(((c1) d1Var).e0(), zVar);
        }
        if (zVar == null || Intrinsics.areEqual(zVar, d1Var)) {
            return d1Var;
        }
        if (d1Var instanceof d0) {
            return new g0((d0) d1Var, zVar);
        }
        if (d1Var instanceof s) {
            return new u((s) d1Var, zVar);
        }
        throw new rn.n();
    }

    public static /* synthetic */ void a(int i7) {
        String str = i7 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 4 ? 3 : 2];
        switch (i7) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i7 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i7 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final d0 b(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        d1 d1VarW0 = zVar.w0();
        d0 d0Var = d1VarW0 instanceof d0 ? (d0) d1VarW0 : null;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException(("This is should be simple type: " + zVar).toString());
    }

    public static final z c(ArrayList arrayList, List list, so.i iVar) {
        z zVarJ = y0.e(new j0(0, arrayList)).j((z) CollectionsKt.K(list), e1.OUT_VARIANCE);
        if (zVarJ != null) {
            return zVarJ;
        }
        d0 d0VarN = iVar.n();
        Intrinsics.checkNotNullExpressionValue(d0VarN, "getDefaultBound(...)");
        return d0VarN;
    }

    public static final pq.d d(pq.d receiver, HashSet hashSet) {
        pq.d dVarD;
        mq.m mVar = mq.m.f16035d;
        q0 q0VarQ = mVar.Q(receiver);
        if (!hashSet.add(q0VarQ)) {
            return null;
        }
        vo.r0 receiver2 = e4.f.G(q0VarQ);
        if (receiver2 != null) {
            Intrinsics.checkNotNullParameter(receiver2, "$receiver");
            pq.d dVarU = c9.a.u(receiver2);
            pq.d dVarD2 = d(dVarU, hashSet);
            if (dVarD2 == null) {
                return null;
            }
            boolean z5 = e4.f.T(mVar.Q(dVarU)) || ((dVarU instanceof pq.f) && e4.f.Z((pq.f) dVarU));
            if ((dVarD2 instanceof pq.f) && e4.f.Z((pq.f) dVarD2) && e4.f.Y(receiver) && z5) {
                return mVar.U(dVarU);
            }
            return (e4.f.Y(dVarD2) || !e4.f.W(receiver)) ? dVarD2 : mVar.U(dVarD2);
        }
        if (e4.f.T(q0VarQ)) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof z)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
            }
            d0 d0VarI = xp.g.i((z) receiver);
            if (d0VarI == null || (dVarD = d(d0VarI, hashSet)) == null) {
                return null;
            }
            if (!e4.f.Y(receiver)) {
                return dVarD;
            }
            if (!e4.f.Y(dVarD) && (!(dVarD instanceof pq.f) || !e4.f.Z((pq.f) dVarD))) {
                return mVar.U(dVarD);
            }
        }
        return receiver;
    }

    public static final d1 e(d0 lowerBound, d0 upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.areEqual(lowerBound, upperBound) ? lowerBound : new t(lowerBound, upperBound);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final z f(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        if (zVar instanceof c1) {
            return ((c1) zVar).i();
        }
        return null;
    }

    public static boolean g(p0 p0Var, pq.e type, c supertypesPolicy) {
        o0 o0Var = o0.f15233c;
        Intrinsics.checkNotNullParameter(p0Var, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        mq.b bVar = p0Var.f15238c;
        if ((bVar.r(type) && !bVar.Y(type)) || bVar.B(type)) {
            return true;
        }
        p0Var.c();
        ArrayDeque arrayDeque = p0Var.f15242g;
        Intrinsics.checkNotNull(arrayDeque);
        vq.j jVar = p0Var.f15243h;
        Intrinsics.checkNotNull(jVar);
        arrayDeque.push(type);
        while (!arrayDeque.isEmpty()) {
            pq.e eVar = (pq.e) arrayDeque.pop();
            Intrinsics.checkNotNull(eVar);
            if (jVar.add(eVar)) {
                c cVar = bVar.Y(eVar) ? o0Var : supertypesPolicy;
                if (Intrinsics.areEqual(cVar, o0Var)) {
                    cVar = null;
                }
                if (cVar == null) {
                    continue;
                } else {
                    mq.b bVar2 = p0Var.f15238c;
                    Iterator it = bVar2.l0(bVar2.D(eVar)).iterator();
                    while (it.hasNext()) {
                        pq.e eVarD = cVar.D(p0Var, (pq.d) it.next());
                        if ((bVar.r(eVarD) && !bVar.Y(eVarD)) || bVar.B(eVarD)) {
                            p0Var.a();
                            return true;
                        }
                        arrayDeque.add(eVarD);
                    }
                }
            }
        }
        p0Var.a();
        return false;
    }

    public static final d1 h(d1 d1Var, z origin) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return G(d1Var, f(origin));
    }

    public static boolean i(p0 p0Var, pq.e eVar, pq.h hVar) {
        mq.b bVar = p0Var.f15238c;
        if (bVar.n(eVar)) {
            return true;
        }
        if (bVar.Y(eVar)) {
            return false;
        }
        if (p0Var.f15237b) {
            bVar.S(eVar);
        }
        return bVar.j0(bVar.D(eVar), hVar);
    }

    public static final boolean j(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        d1 d1VarW0 = zVar.w0();
        if (d1VarW0 instanceof nq.i) {
            return true;
        }
        return (d1VarW0 instanceof s) && (((s) d1VarW0).A0() instanceof nq.i);
    }

    public static final boolean k(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        return zVar.w0() instanceof s;
    }

    public static final d0 l(z zVar) {
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        d1 d1VarW0 = zVar.w0();
        if (d1VarW0 instanceof s) {
            return ((s) d1VarW0).f15248e;
        }
        if (d1VarW0 instanceof d0) {
            return (d0) d1VarW0;
        }
        throw new rn.n();
    }

    public static final d1 m(d1 d1Var, boolean z5) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        o oVarM = f.m(d1Var, z5);
        if (oVarM != null) {
            return oVarM;
        }
        d0 d0VarN = n(d1Var);
        return d0VarN != null ? d0VarN : d1Var.x0(false);
    }

    public static final d0 n(d1 d1Var) {
        y yVar;
        q0 q0VarR0 = d1Var.r0();
        y yVar2 = q0VarR0 instanceof y ? (y) q0VarR0 : null;
        if (yVar2 != null) {
            LinkedHashSet<z> linkedHashSet = yVar2.f15265b;
            ArrayList typesToIntersect = new ArrayList(kotlin.collections.e0.l(linkedHashSet, 10));
            boolean z5 = false;
            for (z zVarM : linkedHashSet) {
                if (b1.e(zVarM)) {
                    zVarM = m(zVarM.w0(), false);
                    z5 = true;
                }
                typesToIntersect.add(zVarM);
            }
            if (z5) {
                z zVarM2 = yVar2.f15264a;
                if (zVarM2 == null) {
                    zVarM2 = null;
                } else if (b1.e(zVarM2)) {
                    zVarM2 = m(zVarM2.w0(), false);
                }
                Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
                typesToIntersect.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(typesToIntersect);
                linkedHashSet2.hashCode();
                yVar = new y(linkedHashSet2);
                yVar.f15264a = zVarM2;
            } else {
                yVar = null;
            }
            if (yVar != null) {
                return yVar.b();
            }
        }
        return null;
    }

    public static final d0 o(d0 d0Var, List newArguments, l0 newAttributes) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        if (newArguments.isEmpty() && newAttributes == d0Var.q0()) {
            return d0Var;
        }
        if (newArguments.isEmpty()) {
            return d0Var.z0(newAttributes);
        }
        if (!(d0Var instanceof nq.i)) {
            return t(newArguments, newAttributes, d0Var.r0(), d0Var.t0());
        }
        nq.i iVar = (nq.i) d0Var;
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        q0 q0Var = iVar.f17043e;
        nq.g gVar = iVar.f17044i;
        nq.k kVar = iVar.f17045v;
        boolean z5 = iVar.f17047x;
        String[] strArr = iVar.f17048y;
        return new nq.i(q0Var, gVar, kVar, newArguments, z5, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static z p(z zVar, List newArgumentsForUpperBound, wo.h newAnnotations, int i7) {
        if ((i7 & 2) != 0) {
            newAnnotations = zVar.getAnnotations();
        }
        Intrinsics.checkNotNullParameter(zVar, "<this>");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArgumentsForUpperBound.isEmpty() || newArgumentsForUpperBound == zVar.l0()) && newAnnotations == zVar.getAnnotations()) {
            return zVar;
        }
        l0 l0VarQ0 = zVar.q0();
        if ((newAnnotations instanceof wo.l) && ((wo.l) newAnnotations).isEmpty()) {
            newAnnotations = wo.g.f22379a;
        }
        l0 l0VarR = r(l0VarQ0, newAnnotations);
        d1 d1VarW0 = zVar.w0();
        if (d1VarW0 instanceof s) {
            s sVar = (s) d1VarW0;
            return e(o(sVar.f15248e, newArgumentsForUpperBound, l0VarR), o(sVar.f15249i, newArgumentsForUpperBound, l0VarR));
        }
        if (d1VarW0 instanceof d0) {
            return o((d0) d1VarW0, newArgumentsForUpperBound, l0VarR);
        }
        throw new rn.n();
    }

    public static /* synthetic */ d0 q(d0 d0Var, List list, l0 l0Var, int i7) {
        if ((i7 & 1) != 0) {
            list = d0Var.l0();
        }
        if ((i7 & 2) != 0) {
            l0Var = d0Var.q0();
        }
        return o(d0Var, list, l0Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    public static final l0 r(l0 l0Var, wo.h newAnnotations) {
        l0 l0VarA;
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        if (k.a(l0Var) == newAnnotations) {
            return l0Var;
        }
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        j attribute = (j) k.f15221b.getValue(l0Var, k.f15220a[0]);
        if (attribute != null) {
            Intrinsics.checkNotNullParameter(attribute, "attribute");
            if (l0Var.isEmpty()) {
                l0VarA = l0Var;
            } else {
                sq.a aVar = l0Var.f20499d;
                ArrayList arrayList = new ArrayList();
                for (Object obj : aVar) {
                    if (!Intrinsics.areEqual((j) obj, attribute)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.size() == l0Var.f20499d.a()) {
                    l0VarA = l0Var;
                } else {
                    l0.f15225e.getClass();
                    l0VarA = e4.r.A(arrayList);
                }
            }
            if (l0VarA != null) {
                l0Var = l0VarA;
            }
        }
        if (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) {
            j attribute2 = new j(newAnnotations);
            Intrinsics.checkNotNullParameter(attribute2, "attribute");
            Intrinsics.checkNotNullParameter(attribute2, "attribute");
            e4.r rVar = l0.f15225e;
            KClass kClass = Reflection.getOrCreateKotlinClass(j.class);
            rVar.getClass();
            Intrinsics.checkNotNullParameter(kClass, "kClass");
            String qualifiedName = kClass.getQualifiedName();
            Intrinsics.checkNotNull(qualifiedName);
            if (l0Var.f20499d.get(rVar.H(qualifiedName)) == null) {
                return l0Var.isEmpty() ? new l0(kotlin.collections.c0.c(attribute2)) : e4.r.A(CollectionsKt.W(CollectionsKt.i0(l0Var), attribute2));
            }
        }
        return l0Var;
    }

    public static final d0 s(l0 attributes, vo.f descriptor, List arguments) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        q0 q0VarN = descriptor.n();
        Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
        return t(arguments, attributes, q0VarN, false);
    }

    public static d0 t(List arguments, l0 attributes, q0 constructor, boolean z5) {
        eq.o oVarM;
        yo.y yVar;
        eq.o oVarI;
        eq.o oVar;
        eq.o oVarB;
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (attributes.isEmpty() && arguments.isEmpty() && !z5 && constructor.g() != null) {
            vo.i iVarG = constructor.g();
            Intrinsics.checkNotNull(iVarG);
            d0 d0VarJ = iVarG.j();
            Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
            return d0VarJ;
        }
        vo.l lVarG = constructor.g();
        if (lVarG instanceof vo.r0) {
            oVarM = ((vo.r0) lVarG).j().J();
        } else {
            if (lVarG instanceof vo.f) {
                bq.e.i(bq.e.j(lVarG));
                boolean zIsEmpty = arguments.isEmpty();
                mq.f kotlinTypeRefiner = mq.f.f16018a;
                if (zIsEmpty) {
                    vo.f fVar = (vo.f) lVarG;
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                    yVar = fVar instanceof yo.y ? (yo.y) fVar : null;
                    if (yVar == null || (oVarB = yVar.B(kotlinTypeRefiner)) == null) {
                        oVarM = fVar.n0();
                        Intrinsics.checkNotNullExpressionValue(oVarM, "getUnsubstitutedMemberScope(...)");
                    } else {
                        oVar = oVarB;
                    }
                } else {
                    vo.f fVar2 = (vo.f) lVarG;
                    w0 typeSubstitution = r0.f15247b.f(constructor, arguments);
                    Intrinsics.checkNotNullParameter(fVar2, "<this>");
                    Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
                    Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                    Intrinsics.checkNotNullParameter(fVar2, "<this>");
                    Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
                    Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                    yVar = fVar2 instanceof yo.y ? (yo.y) fVar2 : null;
                    if (yVar == null || (oVarI = yVar.i(typeSubstitution, kotlinTypeRefiner)) == null) {
                        oVarM = fVar2.x(typeSubstitution);
                        Intrinsics.checkNotNullExpressionValue(oVarM, "getMemberScope(...)");
                    } else {
                        oVar = oVarI;
                    }
                }
                return w(attributes, constructor, arguments, z5, oVar, new a0(arguments, attributes, constructor, z5));
            }
            if (lVarG instanceof vo.q0) {
                oVarM = nq.l.a(nq.h.SCOPE_FOR_ABBREVIATION_TYPE, true, ((yo.l) ((vo.q0) lVarG)).getName().f21269d);
            } else {
                if (!(constructor instanceof y)) {
                    throw new IllegalStateException("Unsupported classifier: " + lVarG + " for constructor: " + constructor);
                }
                oVarM = w3.q.m("member scope for intersection type", ((y) constructor).f15265b);
            }
        }
        oVar = oVarM;
        return w(attributes, constructor, arguments, z5, oVar, new a0(arguments, attributes, constructor, z5));
    }

    public static d0 u(d0 baseType, q0 constructor) {
        l0 annotations = baseType.q0();
        List arguments = baseType.l0();
        boolean zT0 = baseType.t0();
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return t(arguments, annotations, constructor, zT0);
    }

    public static final d0 v(eq.o memberScope, List arguments, l0 attributes, q0 constructor, boolean z5) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        e0 e0Var = new e0(constructor, arguments, z5, memberScope, new a0(memberScope, arguments, attributes, constructor, z5));
        return attributes.isEmpty() ? e0Var : new f0(e0Var, attributes);
    }

    public static final d0 w(l0 attributes, q0 constructor, List arguments, boolean z5, eq.o memberScope, Function1 refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        e0 e0Var = new e0(constructor, arguments, z5, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? e0Var : new f0(e0Var, attributes);
    }

    public static final z x(vo.r0 r0Var) {
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        vo.l lVarG = r0Var.g();
        Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
        if (lVarG instanceof vo.j) {
            List parameters = ((vo.j) lVarG).n().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(parameters, 10));
            Iterator it = parameters.iterator();
            while (it.hasNext()) {
                q0 q0VarN = ((vo.r0) it.next()).n();
                Intrinsics.checkNotNullExpressionValue(q0VarN, "getTypeConstructor(...)");
                arrayList.add(q0VarN);
            }
            List upperBounds = r0Var.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            return c(arrayList, upperBounds, bq.e.e(r0Var));
        }
        if (!(lVarG instanceof vo.u)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((vo.u) lVarG).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(typeParameters, 10));
        Iterator it2 = typeParameters.iterator();
        while (it2.hasNext()) {
            q0 q0VarN2 = ((vo.r0) it2.next()).n();
            Intrinsics.checkNotNullExpressionValue(q0VarN2, "getTypeConstructor(...)");
            arrayList2.add(q0VarN2);
        }
        List upperBounds2 = r0Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        return c(arrayList2, upperBounds2, bq.e.e(r0Var));
    }

    public static boolean y(mq.b bVar, pq.e eVar, pq.e eVar2) {
        if (bVar.h0(eVar) == bVar.h0(eVar2) && bVar.Y(eVar) == bVar.Y(eVar2) && bVar.B(eVar) == bVar.B(eVar2) && bVar.j0(bVar.D(eVar), bVar.D(eVar2))) {
            if (bVar.H(eVar, eVar2)) {
                return true;
            }
            int iH0 = bVar.h0(eVar);
            for (int i7 = 0; i7 < iH0; i7++) {
                t0 t0VarQ = bVar.q(eVar, i7);
                t0 t0VarQ2 = bVar.q(eVar2, i7);
                if (bVar.F(t0VarQ) == bVar.F(t0VarQ2)) {
                    if (!bVar.F(t0VarQ)) {
                        if (bVar.R(t0VarQ) == bVar.R(t0VarQ2)) {
                            d1 d1VarC = bVar.C(t0VarQ);
                            Intrinsics.checkNotNull(d1VarC);
                            d1 d1VarC2 = bVar.C(t0VarQ2);
                            Intrinsics.checkNotNull(d1VarC2);
                            if (!z(bVar, d1VarC, d1VarC2)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(mq.b bVar, pq.d dVar, pq.d dVar2) {
        if (dVar == dVar2) {
            return true;
        }
        d0 d0VarE = bVar.e(dVar);
        d0 d0VarE2 = bVar.e(dVar2);
        if (d0VarE != null && d0VarE2 != null) {
            return y(bVar, d0VarE, d0VarE2);
        }
        s sVarO0 = bVar.o0(dVar);
        s sVarO1 = bVar.o0(dVar2);
        return sVarO0 != null && sVarO1 != null && y(bVar, bVar.b(sVarO0), bVar.b(sVarO1)) && y(bVar, bVar.m0(sVarO0), bVar.m0(sVarO1));
    }

    public abstract pq.e D(p0 p0Var, pq.d dVar);
}
