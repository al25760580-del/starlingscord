package bp;

import androidx.appcompat.widget.b4;
import ep.j0;
import ip.g0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lq.b1;
import lq.d1;
import lq.e1;
import lq.q0;
import lq.s0;
import lq.t0;
import pp.f1;
import pp.y0;
import vo.n0;
import vo.r0;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3358e;

    public /* synthetic */ i(int i7, Object obj) {
        this.f3357d = i7;
        this.f3358e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0474  */
    /* JADX WARN: Code duplicated, block: B:125:0x0489  */
    /* JADX WARN: Code duplicated, block: B:127:0x0496  */
    /* JADX WARN: Code duplicated, block: B:129:0x049f  */
    /* JADX WARN: Code duplicated, block: B:136:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:137:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:140:0x0507  */
    /* JADX WARN: Code duplicated, block: B:142:0x052b  */
    /* JADX WARN: Code duplicated, block: B:242:0x0776  */
    /* JADX WARN: Code duplicated, block: B:245:0x0784  */
    /* JADX WARN: Code duplicated, block: B:248:0x0789  */
    /* JADX WARN: Code duplicated, block: B:363:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:369:0x0a3a  */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x0507, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:142:0x052b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15, types: [e4.i, np.n] */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41, types: [int] */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z5;
        boolean zEquals;
        Object next;
        hq.j jVar;
        hq.e eVarJ;
        jq.j jVar2;
        Object next2;
        bc.k kVarA;
        boolean z6;
        boolean z7;
        boolean zIsEmpty;
        up.c cVarC;
        lq.y yVar;
        jp.a aVar;
        t0 t0VarA;
        pq.d dVar;
        ep.w wVar;
        mq.m mVar;
        q0 receiver;
        List<r0> parameters;
        pq.d receiver2;
        Iterator it;
        ArrayList arrayList;
        d1 d1VarF;
        mp.a aVar2;
        pq.d receiver3;
        int i7 = this.f3357d;
        boolean z10 = false;
        int i10 = 1;
        pq.d dVar2 = null;
        Object obj2 = this.f3358e;
        switch (i7) {
            case 0:
                o oVar = (o) obj2;
                Method method = (Method) obj;
                if (method.isSynthetic()) {
                    z5 = false;
                } else {
                    if (oVar.f3364a.isEnum()) {
                        Intrinsics.checkNotNull(method);
                        String name = method.getName();
                        if (Intrinsics.areEqual(name, "values")) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (Intrinsics.areEqual(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (zEquals) {
                            z5 = false;
                        }
                    }
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case 1:
                vo.d it2 = (vo.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(j0.f8567i.containsKey(com.facebook.imagepipeline.nativecode.b.g((k0) obj2)));
            case 2:
                up.c cVar = (up.c) obj;
                Intrinsics.checkNotNull(cVar);
                Map values = (Map) ((e4.r) obj2).f8034e;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : values.entrySet()) {
                    up.c packageName = (up.c) entry.getKey();
                    if (!Intrinsics.areEqual(cVar, packageName)) {
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        Intrinsics.checkNotNullParameter(packageName, "packageName");
                        Intrinsics.checkNotNullParameter(cVar, "<this>");
                        if (Intrinsics.areEqual(cVar.f21262a.c() ? null : cVar.b(), packageName)) {
                        }
                    }
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap.isEmpty()) {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    Iterator it3 = linkedHashMap.entrySet().iterator();
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (it3.hasNext()) {
                            int length = a.a.B((up.c) ((Map.Entry) next).getKey(), cVar).f21262a.f21265a.length();
                            do {
                                Object next3 = it3.next();
                                int length2 = a.a.B((up.c) ((Map.Entry) next3).getKey(), cVar).f21262a.f21265a.length();
                                if (length > length2) {
                                    next = next3;
                                    length = length2;
                                }
                            } while (it3.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    Map.Entry entry2 = (Map.Entry) next;
                    if (entry2 != null) {
                        return entry2.getValue();
                    }
                }
                return null;
            case 3:
                vo.d dVar3 = (vo.d) obj;
                if (dVar3 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'descriptor' of kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1.invoke must not be null");
                }
                ((fp.a) obj2).f9327h.b(dVar3);
                return Unit.f14616a;
            case 4:
                hp.c cVar2 = (hp.c) obj2;
                d annotation = (d) obj;
                Intrinsics.checkNotNullParameter(annotation, "annotation");
                up.e eVar = fp.d.f9337a;
                return fp.d.b(annotation, cVar2.f10981d, cVar2.f10983i);
            case 5:
                hp.e typeParameterResolver = (hp.e) obj2;
                c0 typeParameter = (c0) obj;
                Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) typeParameterResolver.f10990v;
                vo.m mVar2 = (vo.m) typeParameterResolver.f10989i;
                Integer num = (Integer) linkedHashMap2.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                e4.i iVar = (e4.i) typeParameterResolver.f10988e;
                Intrinsics.checkNotNullParameter(iVar, "<this>");
                Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
                return new g0(ls.l.l(new e4.i((hp.a) iVar.f7980e, typeParameterResolver, (Lazy) iVar.f7982v), mVar2.getAnnotations()), typeParameter, typeParameterResolver.f10987d + iIntValue, mVar2);
            case 6:
                uo.q qVar = (uo.q) obj2;
                up.c fqName = (up.c) obj;
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                iq.c cVarD = qVar.d(fqName);
                if (cVarD == null) {
                    return null;
                }
                hq.j jVar3 = qVar.f21247c;
                if (jVar3 != null) {
                    jVar = jVar3;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("components");
                    jVar = null;
                }
                cVarD.C0(jVar);
                return cVarD;
            case 7:
                hq.h hVar = (hq.h) obj2;
                hq.g key = (hq.g) obj;
                Intrinsics.checkNotNullParameter(key, "key");
                up.b bVar = key.f11013a;
                hq.j jVar4 = hVar.f11016a;
                Iterator it4 = jVar4.k.iterator();
                while (it4.hasNext()) {
                    vo.f fVarA = ((xo.c) it4.next()).a(bVar);
                    if (fVarA != null) {
                        return fVarA;
                    }
                }
                if (hq.h.f11015c.contains(bVar) || ((eVarJ = key.f11014b) == null && (eVarJ = jVar4.f11022d.j(bVar)) == null)) {
                    jVar2 = null;
                } else {
                    rp.f fVar = eVarJ.f11009a;
                    pp.k kVar = eVarJ.f11010b;
                    rp.a aVar3 = eVarJ.f11011c;
                    n0 n0Var = eVarJ.f11012d;
                    up.b bVarE = bVar.e();
                    if (bVarE != null) {
                        jVar2 = null;
                        vo.f fVarA2 = hVar.a(bVarE, null);
                        jq.j jVar5 = fVarA2 instanceof jq.j ? (jq.j) fVarA2 : null;
                        if (jVar5 != null) {
                            up.e name2 = bVar.f();
                            Intrinsics.checkNotNullParameter(name2, "name");
                            if (jVar5.l0().m().contains(name2)) {
                                kVarA = jVar5.I;
                                jVar2 = new jq.j(kVarA, kVar, fVar, aVar3, n0Var);
                            }
                        }
                    } else {
                        jVar2 = null;
                        Iterator it5 = sa.a.A(jVar4.f11024f, bVar.f21258a).iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next2 = it5.next();
                                vo.e0 e0Var = (vo.e0) next2;
                                if (e0Var instanceof iq.c) {
                                    up.e name3 = bVar.f();
                                    Intrinsics.checkNotNullParameter(name3, "name");
                                    eq.o oVarJ = ((iq.c) e0Var).J();
                                    if (oVarJ == null || !((jq.r) oVarJ).m().contains(name3)) {
                                    }
                                }
                            } else {
                                next2 = null;
                            }
                        }
                        vo.e0 e0Var2 = (vo.e0) next2;
                        if (e0Var2 != null) {
                            y0 y0Var = kVar.f18334b0;
                            Intrinsics.checkNotNullExpressionValue(y0Var, "getTypeTable(...)");
                            pf.b bVar2 = new pf.b(y0Var);
                            rp.g gVar = rp.g.f19539b;
                            f1 f1Var = kVar.f18336d0;
                            Intrinsics.checkNotNullExpressionValue(f1Var, "getVersionRequirementTable(...)");
                            kVarA = jVar4.a(e0Var2, fVar, bVar2, ls.l.n(f1Var), aVar3, null);
                            jVar2 = new jq.j(kVarA, kVar, fVar, aVar3, n0Var);
                        }
                    }
                }
                return jVar2;
            case 8:
                x m5 = (x) obj;
                Intrinsics.checkNotNullParameter(m5, "m");
                if (((Boolean) ((ip.a) obj2).f13309b.invoke(m5)).booleanValue()) {
                    Intrinsics.checkNotNullParameter(m5, "<this>");
                    Class<?> klass = ((Method) m5.b()).getDeclaringClass();
                    Intrinsics.checkNotNullExpressionValue(klass, "getDeclaringClass(...)");
                    Intrinsics.checkNotNullParameter(klass, "klass");
                    if (klass.isInterface()) {
                        String strB = m5.c().b();
                        int iHashCode = strB.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strB.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) m5.g()).isEmpty();
                                }
                            } else if (strB.equals("equals")) {
                                d0 d0Var = (d0) CollectionsKt.b0(m5.g());
                                b0 b0Var = d0Var != null ? d0Var.f3345a : null;
                                q qVar2 = b0Var instanceof q ? (q) b0Var : null;
                                if (qVar2 != null) {
                                    s sVar = qVar2.f3367b;
                                    if ((sVar instanceof o) && (cVarC = ((o) sVar).c()) != null && Intrinsics.areEqual(cVarC.f21262a.f21265a, "java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strB.equals("toString")) {
                            zIsEmpty = ((ArrayList) m5.g()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 9:
                ip.j jVar6 = (ip.j) obj2;
                mq.f it6 = (mq.f) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return new ip.p(jVar6.G, jVar6, jVar6.E, jVar6.F != null, jVar6.N);
            case 10:
                eq.o it7 = (eq.o) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return it7.a((up.e) obj2, dp.c.f7697w);
            case 11:
                lq.z zVar = (lq.z) obj;
                Intrinsics.checkNotNull(zVar);
                return ((Function1) obj2).invoke(zVar).toString();
            case 12:
                lq.y yVar2 = (lq.y) obj2;
                mq.f kotlinTypeRefiner = (mq.f) obj;
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                LinkedHashSet linkedHashSet = yVar2.f15265b;
                ArrayList typesToIntersect = new ArrayList(kotlin.collections.e0.l(linkedHashSet, 10));
                Iterator it8 = linkedHashSet.iterator();
                boolean z11 = false;
                while (it8.hasNext()) {
                    typesToIntersect.add(((lq.z) it8.next()).y0(kotlinTypeRefiner));
                    z11 = true;
                }
                if (z11) {
                    lq.z zVar2 = yVar2.f15264a;
                    lq.z zVarV0 = zVar2 != null ? zVar2.y0(kotlinTypeRefiner) : null;
                    Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
                    typesToIntersect.isEmpty();
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet(typesToIntersect);
                    linkedHashSet2.hashCode();
                    lq.y yVar3 = new lq.y(linkedHashSet2);
                    yVar3.f15264a = zVarV0;
                    yVar = yVar3;
                } else {
                    yVar = null;
                }
                if (yVar != null) {
                    yVar2 = yVar;
                }
                return yVar2.b();
            case 13:
                io.sentry.internal.debugmeta.c cVar3 = (io.sentry.internal.debugmeta.c) obj2;
                s0 s0Var = (s0) obj;
                r0 typeParameter2 = s0Var.f15250a;
                jp.a aVar4 = s0Var.f15251b;
                Set set = aVar4.f13994e;
                if (set != null && set.contains(typeParameter2.a())) {
                    return cVar3.x0(aVar4);
                }
                lq.d0 d0VarJ = typeParameter2.j();
                Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
                Intrinsics.checkNotNullParameter(d0VarJ, "<this>");
                LinkedHashSet<r0> linkedHashSet3 = new LinkedHashSet();
                c9.a.n(d0VarJ, d0VarJ, linkedHashSet3, set);
                int iA = v0.a(kotlin.collections.e0.l(linkedHashSet3, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap map = new LinkedHashMap(iA);
                for (r0 r0Var : linkedHashSet3) {
                    if (set == null || !set.contains(r0Var)) {
                        Intrinsics.checkNotNullParameter(typeParameter2, "typeParameter");
                        Set set2 = aVar4.f13994e;
                        Set setE = set2 != null ? kotlin.collections.f1.e(set2, typeParameter2) : kotlin.collections.d1.b(typeParameter2);
                        jp.a aVar5 = aVar4;
                        aVar = aVar5;
                        t0VarA = jp.e.a(r0Var, aVar, cVar3, cVar3.y0(r0Var, jp.a.a(aVar5, null, false, setE, null, 47)));
                    } else {
                        t0 t0VarK = b1.k(r0Var, aVar4);
                        Intrinsics.checkNotNullExpressionValue(t0VarK, "makeStarProjection(...)");
                        aVar = aVar4;
                        t0VarA = t0VarK;
                    }
                    map.put(r0Var.n(), t0VarA);
                    aVar4 = aVar;
                }
                jp.a aVar6 = aVar4;
                Intrinsics.checkNotNullParameter(map, "map");
                lq.y0 y0VarE = lq.y0.e(new lq.j0(i10, map));
                Intrinsics.checkNotNullExpressionValue(y0VarE, "create(...)");
                List upperBounds = typeParameter2.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                sn.n nVarH0 = cVar3.H0(y0VarE, upperBounds, aVar6);
                if (nVarH0.f20326d.isEmpty()) {
                    return cVar3.x0(aVar6);
                }
                if (nVarH0.f20326d.F == 1) {
                    return (lq.z) CollectionsKt.Y(nVarH0);
                }
                throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
            case 14:
                g3.b bVar3 = (g3.b) obj2;
                mp.a it9 = (mp.a) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!bVar3.f9462b || (receiver3 = it9.f15963a) == null) {
                    dVar = it9.f15963a;
                    wVar = it9.f15964b;
                    if (dVar != null && (receiver = (mVar = mq.m.f16035d).Q(dVar)) != null) {
                        Intrinsics.checkNotNullParameter(receiver, "$receiver");
                        if (receiver instanceof q0) {
                            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
                        }
                        parameters = receiver.getParameters();
                        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                        if (parameters != null) {
                            receiver2 = it9.f15963a;
                            Intrinsics.checkNotNullParameter(receiver2, "$receiver");
                            if (receiver2 instanceof lq.z) {
                                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver2 + ", " + Reflection.getOrCreateKotlinClass(receiver2.getClass())).toString());
                            }
                            List listL0 = ((lq.z) receiver2).l0();
                            it = listL0.iterator();
                            arrayList = new ArrayList(Math.min(kotlin.collections.e0.l(parameters, 10), kotlin.collections.e0.l(listL0, 10)));
                            while (r2.hasNext() && it.hasNext()) {
                                d1VarF = e4.f.F(mVar, (t0) it.next());
                                if (d1VarF == null) {
                                    aVar2 = new mp.a(dVar2, wVar, r0Var);
                                } else {
                                    ep.b bVar4 = ((hp.a) ((e4.i) bVar3.f9464d).f7980e).f10971q;
                                    Intrinsics.checkNotNullParameter(d1VarF, "<this>");
                                    aVar2 = new mp.a(d1VarF, bVar4.b(wVar, d1VarF.getAnnotations()), r0Var);
                                }
                                arrayList.add(aVar2);
                                dVar2 = null;
                            }
                            return arrayList;
                        }
                    }
                } else {
                    Intrinsics.checkNotNullParameter(receiver3, "$receiver");
                    if (!(receiver3 instanceof lq.z)) {
                        throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver3 + ", " + Reflection.getOrCreateKotlinClass(receiver3.getClass())).toString());
                    }
                    if (!(receiver3 instanceof jp.i)) {
                        dVar = it9.f15963a;
                        wVar = it9.f15964b;
                        if (dVar != null) {
                            Intrinsics.checkNotNullParameter(receiver, "$receiver");
                            if (receiver instanceof q0) {
                                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
                            }
                            parameters = receiver.getParameters();
                            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                            if (parameters != null) {
                                receiver2 = it9.f15963a;
                                Intrinsics.checkNotNullParameter(receiver2, "$receiver");
                                if (receiver2 instanceof lq.z) {
                                    throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver2 + ", " + Reflection.getOrCreateKotlinClass(receiver2.getClass())).toString());
                                }
                                List listL1 = ((lq.z) receiver2).l0();
                                it = listL1.iterator();
                                arrayList = new ArrayList(Math.min(kotlin.collections.e0.l(parameters, 10), kotlin.collections.e0.l(listL1, 10)));
                                for (r0 r0Var2 : parameters) {
                                    d1VarF = e4.f.F(mVar, (t0) it.next());
                                    if (d1VarF == null) {
                                        aVar2 = new mp.a(dVar2, wVar, r0Var2);
                                    } else {
                                        ep.b bVar5 = ((hp.a) ((e4.i) bVar3.f9464d).f7980e).f10971q;
                                        Intrinsics.checkNotNullParameter(d1VarF, "<this>");
                                        aVar2 = new mp.a(d1VarF, bVar5.b(wVar, d1VarF.getAnnotations()), r0Var2);
                                    }
                                    arrayList.add(aVar2);
                                    dVar2 = null;
                                }
                                return arrayList;
                            }
                        }
                    }
                }
                return null;
            case 15:
                vo.d it10 = (vo.d) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                lq.z type = ((yo.q0) it10.L().get(((yo.q0) obj2).f23468y)).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return type;
            case 16:
                ap.b kotlinClass = (ap.b) obj;
                Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                HashMap map4 = new HashMap();
                e4.e memberVisitor = new e4.e((af.c) obj2, map2, map3);
                Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
                Intrinsics.checkNotNullParameter(memberVisitor, "visitor");
                Class klass2 = kotlinClass.f2856a;
                Intrinsics.checkNotNullParameter(klass2, "klass");
                Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
                Iterator it11 = ArrayIteratorKt.iterator(klass2.getDeclaredMethods());
                while (true) {
                    String str = "toString(...)";
                    String str2 = "(";
                    if (!it11.hasNext()) {
                        Class cls = klass2;
                        Iterator it12 = ArrayIteratorKt.iterator(cls.getDeclaredConstructors());
                        while (it12.hasNext()) {
                            Constructor constructor = (Constructor) it12.next();
                            up.e eVar2 = up.g.f21277e;
                            Intrinsics.checkNotNull(constructor);
                            Intrinsics.checkNotNullParameter(constructor, "constructor");
                            StringBuilder sb2 = new StringBuilder(str2);
                            Iterator it13 = ArrayIteratorKt.iterator(constructor.getParameterTypes());
                            while (it13.hasNext()) {
                                Class cls2 = (Class) it13.next();
                                Intrinsics.checkNotNull(cls2);
                                sb2.append(c.b(cls2));
                            }
                            sb2.append(")V");
                            String string = sb2.toString();
                            Intrinsics.checkNotNullExpressionValue(string, str);
                            e4.i iVarN = memberVisitor.N(eVar2, string);
                            Iterator it14 = ArrayIteratorKt.iterator(constructor.getDeclaredAnnotations());
                            while (it14.hasNext()) {
                                Annotation annotation2 = (Annotation) it14.next();
                                Intrinsics.checkNotNull(annotation2);
                                zs.a.O(iVarN, annotation2);
                            }
                            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                            Intrinsics.checkNotNull(parameterAnnotations);
                            if (parameterAnnotations.length != 0) {
                                int length3 = constructor.getParameterTypes().length - parameterAnnotations.length;
                                int length4 = parameterAnnotations.length;
                                for (int i11 = 0; i11 < length4; i11++) {
                                    Iterator it15 = ArrayIteratorKt.iterator(parameterAnnotations[i11]);
                                    while (it15.hasNext()) {
                                        Iterator it16 = it12;
                                        Annotation annotation3 = (Annotation) it15.next();
                                        int i12 = length3;
                                        Class clsB = gn.h.B(gn.h.z(annotation3));
                                        Annotation[][] annotationArr = parameterAnnotations;
                                        String str3 = str;
                                        up.b bVarA = c.a(clsB);
                                        String str4 = str2;
                                        Intrinsics.checkNotNull(annotation3);
                                        b4 b4VarG = iVarN.G(i11 + i12, bVarA, new ap.a(annotation3));
                                        if (b4VarG != null) {
                                            zs.a.P(b4VarG, annotation3, clsB);
                                        }
                                        it12 = it16;
                                        parameterAnnotations = annotationArr;
                                        length3 = i12;
                                        str = str3;
                                        str2 = str4;
                                    }
                                }
                            }
                            Iterator it17 = it12;
                            String str5 = str;
                            String str6 = str2;
                            iVarN.i();
                            it12 = it17;
                            str = str5;
                            str2 = str6;
                        }
                        Iterator it18 = ArrayIteratorKt.iterator(cls.getDeclaredFields());
                        while (it18.hasNext()) {
                            Field field = (Field) it18.next();
                            up.e name4 = up.e.e(field.getName());
                            Intrinsics.checkNotNullExpressionValue(name4, "identifier(...)");
                            Intrinsics.checkNotNull(field);
                            Intrinsics.checkNotNullParameter(field, "field");
                            Class<?> type2 = field.getType();
                            Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                            String desc = c.b(type2);
                            Intrinsics.checkNotNullParameter(name4, "name");
                            Intrinsics.checkNotNullParameter(desc, "desc");
                            String name5 = name4.b();
                            Intrinsics.checkNotNullExpressionValue(name5, "asString(...)");
                            Intrinsics.checkNotNullParameter(name5, "name");
                            Intrinsics.checkNotNullParameter(desc, "desc");
                            np.p signature = new np.p(name5 + '#' + desc);
                            Intrinsics.checkNotNullParameter(signature, "signature");
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it19 = ArrayIteratorKt.iterator(field.getDeclaredAnnotations());
                            while (it19.hasNext()) {
                                Annotation annotation4 = (Annotation) it19.next();
                                Intrinsics.checkNotNull(annotation4);
                                Class clsB2 = gn.h.B(gn.h.z(annotation4));
                                up.b classId = c.a(clsB2);
                                ap.a source = new ap.a(annotation4);
                                Intrinsics.checkNotNullParameter(classId, "classId");
                                Intrinsics.checkNotNullParameter(source, "source");
                                b4 b4VarH = ((af.c) memberVisitor.f7971e).H(classId, source, arrayList2);
                                if (b4VarH != null) {
                                    zs.a.P(b4VarH, annotation4, clsB2);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                ((HashMap) memberVisitor.f7972i).put(signature, arrayList2);
                            }
                        }
                        return new np.c(map2, map3, map4);
                    }
                    Method method2 = (Method) it11.next();
                    up.e eVarE = up.e.e(method2.getName());
                    Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                    Intrinsics.checkNotNull(method2);
                    Intrinsics.checkNotNullParameter(method2, "method");
                    StringBuilder sb3 = new StringBuilder("(");
                    Iterator it20 = ArrayIteratorKt.iterator(method2.getParameterTypes());
                    while (it20.hasNext()) {
                        Class cls3 = (Class) it20.next();
                        Intrinsics.checkNotNull(cls3);
                        sb3.append(c.b(cls3));
                    }
                    sb3.append(")");
                    Class<?> returnType = method2.getReturnType();
                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                    sb3.append(c.b(returnType));
                    String string2 = sb3.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    ?? N = memberVisitor.N(eVarE, string2);
                    Iterator it21 = ArrayIteratorKt.iterator(method2.getDeclaredAnnotations());
                    while (it21.hasNext()) {
                        Annotation annotation5 = (Annotation) it21.next();
                        Intrinsics.checkNotNull(annotation5);
                        zs.a.O(N, annotation5);
                    }
                    Annotation[][] parameterAnnotations2 = method2.getParameterAnnotations();
                    Intrinsics.checkNotNullExpressionValue(parameterAnnotations2, "getParameterAnnotations(...)");
                    Annotation[][] annotationArr2 = parameterAnnotations2;
                    int length5 = annotationArr2.length;
                    for (?? r13 = z10; r13 < length5; r13++) {
                        Iterator it22 = ArrayIteratorKt.iterator(annotationArr2[r13]);
                        while (it22.hasNext()) {
                            Annotation annotation6 = (Annotation) it22.next();
                            Class clsB3 = gn.h.B(gn.h.z(annotation6));
                            up.b bVarA2 = c.a(clsB3);
                            Class cls4 = klass2;
                            Intrinsics.checkNotNull(annotation6);
                            b4 b4VarG2 = N.G(r13, bVarA2, new ap.a(annotation6));
                            if (b4VarG2 != null) {
                                zs.a.P(b4VarG2, annotation6, clsB3);
                            }
                            klass2 = cls4;
                        }
                    }
                    N.i();
                    z10 = false;
                }
                break;
            case 17:
                String it23 = (String) obj;
                Intrinsics.checkNotNullParameter(it23, "it");
                return Integer.valueOf(((AtomicInteger) ((e4.r) obj2).f8035i).getAndIncrement());
            case 18:
                Pair pair = (Pair) obj;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                String str7 = (String) pair.f14612d;
                String str8 = (String) pair.f14613e;
                List annotations = kotlin.collections.c0.c(wo.e.a(((uo.o) obj2).f21236a.f(), s0.g.f("'", str7, "()' member of List is redundant in Kotlin and might be removed soon. Please use '", str8, "()' stdlib extension instead"), str8 + "()", "HIDDEN"));
                Intrinsics.checkNotNullParameter(annotations, "annotations");
                return annotations.isEmpty() ? wo.g.f22379a : new wo.i(0, annotations);
            case 19:
                return Boolean.valueOf(((vo.d) obj).g() == ((vo.l) obj2));
            case 20:
                Intrinsics.checkNotNull(obj);
                ((vq.j) obj2).add(obj);
                return Unit.f14616a;
            case 21:
                yo.b descriptor = ((yo.a) obj2).f23414e;
                ((mq.f) obj).getClass();
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return (lq.d0) descriptor.f23417e.invoke();
            case 22:
                yo.e eVar3 = (yo.e) obj2;
                d1 d1Var = (d1) obj;
                Intrinsics.checkNotNull(d1Var);
                if (!lq.c.j(d1Var)) {
                    vo.i iVarG = d1Var.r0().g();
                    if ((iVarG instanceof r0) && !Intrinsics.areEqual(((r0) iVarG).g(), eVar3)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 23:
                ((mq.f) obj).getClass();
                Intrinsics.checkNotNullParameter((jq.v) obj2, "descriptor");
                return null;
            case 24:
                lq.d0 d0Var2 = (lq.d0) obj;
                yo.x xVar = (yo.x) obj2;
                if (d0Var2 != null) {
                    return xVar.f23489e.f15268a.f() ? d0Var2 : (lq.d0) xVar.e0().j(d0Var2, e1.INVARIANT);
                }
                xVar.getClass();
                return d0Var2;
            case 25:
                yo.z module = (yo.z) obj2;
                up.c fqName2 = (up.c) obj;
                Intrinsics.checkNotNullParameter(fqName2, "fqName");
                yo.e0 e0Var3 = module.f23497y;
                kq.l storageManager = module.f23494v;
                ((yo.d0) e0Var3).getClass();
                Intrinsics.checkNotNullParameter(module, "module");
                Intrinsics.checkNotNullParameter(fqName2, "fqName");
                Intrinsics.checkNotNullParameter(storageManager, "storageManager");
                return new yo.v(module, fqName2, storageManager);
            case 26:
                vo.z it24 = (vo.z) obj;
                Intrinsics.checkNotNullParameter(it24, "it");
                lq.d0 d0VarR = it24.f().r((so.k) obj2);
                Intrinsics.checkNotNullExpressionValue(d0VarR, "getPrimitiveArrayKotlinType(...)");
                return d0VarR;
            default:
                lq.z zVar3 = (lq.z) obj2;
                vo.z it25 = (vo.z) obj;
                Intrinsics.checkNotNullParameter(it25, "it");
                return zVar3;
        }
    }
}
