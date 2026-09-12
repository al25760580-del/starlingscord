package ep;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f1;
import kotlin.collections.m0;
import kotlin.collections.p0;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import lq.e1;
import lq.y0;
import po.o0;
import po.q1;
import po.r1;
import po.t1;
import vo.l0;
import vo.r0;
import yo.k0;
import yo.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8601e;

    public /* synthetic */ x(int i7, Object obj) {
        this.f8600d = i7;
        this.f8601e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v11, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [xp.l] */
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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException {
        ?? arrayList;
        zp.i iVar;
        wo.m mVar;
        zp.b bVarA;
        int iHashCode;
        yo.h hVarB;
        List list;
        n0 n0Var;
        int i7 = this.f8600d;
        int i10 = 10;
        Object obj = this.f8601e;
        switch (i7) {
            case 0:
                y yVar = (y) obj;
                sn.e eVarB = kotlin.collections.c0.b();
                eVarB.add(yVar.f8602a.f8536d);
                e0 e0Var = yVar.f8603b;
                if (e0Var != null) {
                    eVarB.add("under-migration:".concat(e0Var.f8536d));
                }
                yVar.f8604c.getClass();
                p0.f14661d.getClass();
                m0.f14658d.getClass();
                return (String[]) kotlin.collections.c0.a(eVarB).toArray(new String[0]);
            case 1:
                eq.h hVar = (eq.h) obj;
                List listH = hVar.h();
                ArrayList arrayList2 = new ArrayList(3);
                yo.b bVar = hVar.f8635b;
                Collection collectionH = bVar.n().h();
                Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
                ArrayList arrayList3 = new ArrayList();
                Iterator it = collectionH.iterator();
                while (it.hasNext()) {
                    kotlin.collections.i0.o(arrayList3, sa.a.m(((lq.z) it.next()).J(), null, 3));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (obj2 instanceof vo.d) {
                        arrayList4.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList4) {
                    up.e name = ((vo.d) obj3).getName();
                    Object arrayList5 = linkedHashMap.get(name);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(name, arrayList5);
                    }
                    ((List) arrayList5).add(obj3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "component1(...)");
                    up.e eVar = (up.e) key;
                    List list2 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((vo.d) obj4) instanceof vo.u);
                        Object arrayList6 = linkedHashMap2.get(boolValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj4);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list3 = (List) entry2.getValue();
                        ?? r7 = xp.l.f23012c;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj5 : listH) {
                                if (Intrinsics.areEqual(((yo.l) ((vo.u) obj5)).getName(), eVar)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = kotlin.collections.n0.f14659d;
                        }
                        r7.h(eVar, list3, arrayList, bVar, new eq.g(arrayList2, hVar));
                    }
                }
                return CollectionsKt.V(listH, vq.m.e(arrayList2));
            case 2:
                return ((y0) obj).g().c();
            case 3:
                eq.t tVar = (eq.t) obj;
                return tVar.h(sa.a.m(tVar.f8657b, null, 3));
            case 4:
                Object obj6 = fp.f.f9342a;
                lp.a aVar = ((fp.j) obj).f9336d;
                bp.t tVar2 = aVar instanceof bp.t ? (bp.t) aVar : null;
                if (tVar2 == null || (mVar = (wo.m) fp.f.f9343b.get(up.e.e(tVar2.f3369b.name()).b())) == null) {
                    iVar = null;
                } else {
                    up.c topLevelFqName = so.o.f20388v;
                    Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                    up.b bVar2 = new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
                    up.e eVarE = up.e.e(mVar.name());
                    Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                    iVar = new zp.i(bVar2, eVarE);
                }
                Map mapB = iVar != null ? v0.b(new Pair(fp.d.f9339c, iVar)) : null;
                return mapB == null ? w0.d() : mapB;
            case 5:
                lp.a aVar2 = ((fp.k) obj).f9336d;
                if (aVar2 instanceof bp.g) {
                    Object obj7 = fp.f.f9342a;
                    bVarA = fp.f.a(((bp.g) aVar2).a());
                } else if (aVar2 instanceof bp.t) {
                    Object obj8 = fp.f.f9342a;
                    bVarA = fp.f.a(kotlin.collections.c0.c(aVar2));
                } else {
                    bVarA = null;
                }
                Map mapB2 = bVarA != null ? v0.b(new Pair(fp.d.f9338b, bVarA)) : null;
                return mapB2 == null ? w0.d() : mapB2;
            case 6:
                Set setKeySet = ((LinkedHashMap) ((iq.c) obj).G.f6613v).keySet();
                ArrayList arrayList7 = new ArrayList();
                for (Object obj9 : setKeySet) {
                    up.b bVar3 = (up.b) obj9;
                    if (!bVar3.g() && !hq.h.f11015c.contains(bVar3)) {
                        arrayList7.add(obj9);
                    }
                }
                ArrayList arrayList8 = new ArrayList(kotlin.collections.e0.l(arrayList7, 10));
                Iterator it2 = arrayList7.iterator();
                while (it2.hasNext()) {
                    arrayList8.add(((up.b) it2.next()).f());
                }
                return arrayList8;
            case 7:
                ip.d dVar = (ip.d) obj;
                ip.r rVar = dVar.f13332c;
                Collection collectionValues = ((Map) io.sentry.config.a.H(rVar.G, ip.r.K[0])).values();
                ArrayList arrayList9 = new ArrayList();
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    jq.s sVarA = ((hp.a) dVar.f13331b.f7980e).f10960d.a(rVar, (ap.b) it3.next());
                    if (sVarA != null) {
                        arrayList9.add(sVarA);
                    }
                }
                return (eq.o[]) android.support.v4.media.session.b.p(arrayList9).toArray(new eq.o[0]);
            case 8:
                HashSet hashSet = new HashSet();
                jq.j jVar = (jq.j) ((e4.i) obj).f7983w;
                ip.h hVar2 = jVar.K;
                bc.k kVar = jVar.I;
                pp.k kVar2 = jVar.f14030w;
                Iterator it4 = hVar2.h().iterator();
                while (it4.hasNext()) {
                    for (vo.l lVar : sa.a.m(((lq.z) it4.next()).J(), null, 3)) {
                        if ((lVar instanceof k0) || (lVar instanceof l0)) {
                            hashSet.add(((vo.d) lVar).getName());
                        }
                    }
                }
                List list4 = kVar2.N;
                Intrinsics.checkNotNullExpressionValue(list4, "getFunctionList(...)");
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    hashSet.add(mo.c0.w((rp.f) kVar.f3123i, ((pp.a0) it5.next()).f18203x));
                }
                List list5 = kVar2.O;
                Intrinsics.checkNotNullExpressionValue(list5, "getPropertyList(...)");
                Iterator it6 = list5.iterator();
                while (it6.hasNext()) {
                    hashSet.add(mo.c0.w((rp.f) kVar.f3123i, ((pp.i0) it6.next()).f18320x));
                }
                return f1.d(hashSet, hashSet);
            case 9:
                jq.r rVar2 = (jq.r) obj;
                Set setN = rVar2.n();
                if (setN == null) {
                    return null;
                }
                return f1.d(f1.d(rVar2.m(), rVar2.f14056c.f14047c.keySet()), setN);
            case 10:
                jq.w wVar = (jq.w) obj;
                bc.k kVar3 = wVar.I;
                return CollectionsKt.i0(((hq.j) kVar3.f3122e).f11023e.l(wVar.J, (rp.f) kVar3.f3123i));
            case 11:
                return new lq.h(((lq.i) obj).b());
            case 12:
                return lq.c.x((r0) ((lq.i0) obj).f15215b);
            case 13:
                return nq.l.c(nq.k.CANNOT_COMPUTE_ERASED_BOUND, ((io.sentry.internal.debugmeta.c) obj).toString());
            case 14:
                Function0 function0 = ((mq.i) obj).f16027b;
                if (function0 != null) {
                    return (List) function0.invoke();
                }
                return null;
            case 15:
                return t1.a(((po.g0) obj).getJClass());
            case 16:
                return new po.j0((po.k0) obj);
            case 17:
                return new po.l0((po.m0) obj);
            case 18:
                return new po.n0((o0) obj);
            case 19:
                List upperBounds = ((r1) obj).f18142d.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                ArrayList arrayList10 = new ArrayList(kotlin.collections.e0.l(upperBounds, 10));
                Iterator it7 = upperBounds.iterator();
                while (it7.hasNext()) {
                    arrayList10.add(new q1((lq.z) it7.next(), null));
                }
                return arrayList10;
            case 20:
                int iHashCode2 = 0;
                for (Map.Entry entry3 : ((Map) obj).entrySet()) {
                    String str = (String) entry3.getKey();
                    Object value = entry3.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 21:
                uo.j jVar2 = (uo.j) obj;
                so.l lVar2 = jVar2.f21223f;
                if (lVar2 == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                uo.i iVar2 = (uo.i) lVar2.invoke();
                jVar2.f21223f = null;
                return iVar2;
            case 22:
                return (eq.o) ((vo.m0) obj).f21819b.invoke(mq.f.f16018a);
            case 23:
                wo.j jVar3 = (wo.j) obj;
                return jVar3.f22382a.j(jVar3.f22383b).j();
            case 24:
                wp.h hVar3 = (wp.h) obj;
                wp.d changeOptions = wp.d.L;
                Intrinsics.checkNotNullParameter(changeOptions, "changeOptions");
                Intrinsics.checkNotNull(hVar3, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
                wp.k kVar4 = hVar3.f22428d;
                wp.k kVar5 = new wp.k();
                Iterator it8 = ArrayIteratorKt.iterator(wp.k.class.getDeclaredFields());
                while (it8.hasNext()) {
                    Field field = (Field) it8.next();
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj10 = field.get(kVar4);
                        io.c cVar = obj10 instanceof io.c ? (io.c) obj10 : null;
                        if (cVar != null) {
                            String name2 = field.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                            kotlin.text.x.o(name2, "is", false);
                            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(wp.k.class);
                            String name3 = field.getName();
                            StringBuilder sb2 = new StringBuilder("get");
                            String name4 = field.getName();
                            Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
                            if (name4.length() > 0) {
                                char upperCase = Character.toUpperCase(name4.charAt(0));
                                String strSubstring = name4.substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                name4 = upperCase + strSubstring;
                            }
                            sb2.append(name4);
                            field.set(kVar5, new tm.e(cVar.getValue(kVar4, new PropertyReference1Impl(orCreateKotlinClass, name3, sb2.toString())), kVar5));
                        }
                    }
                }
                changeOptions.invoke(kVar5);
                kVar5.f22437a = true;
                wp.h hVar4 = new wp.h(kVar5);
                Intrinsics.checkNotNull(hVar4, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
                return hVar4;
            case 25:
                yo.e typeAliasDescriptor = (yo.e) obj;
                jq.v vVar = (jq.v) typeAliasDescriptor;
                vo.f fVarB0 = vVar.B0();
                if (fVarB0 == null) {
                    return kotlin.collections.n0.f14659d;
                }
                Collection<yo.h> collectionP = fVarB0.p();
                Intrinsics.checkNotNullExpressionValue(collectionP, "getConstructors(...)");
                ArrayList arrayList11 = new ArrayList();
                for (yo.h constructor : collectionP) {
                    yo.d0 d0Var = n0.f23458e0;
                    kq.o storageManager = typeAliasDescriptor.f23426x;
                    Intrinsics.checkNotNull(constructor);
                    d0Var.getClass();
                    Intrinsics.checkNotNullParameter(storageManager, "storageManager");
                    Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
                    Intrinsics.checkNotNullParameter(constructor, "constructor");
                    y0 y0VarD = vVar.B0() == null ? null : y0.d(vVar.C0());
                    if (y0VarD == null || (hVarB = constructor.b(y0VarD)) == null) {
                        n0Var = null;
                    } else {
                        wo.h annotations = constructor.getAnnotations();
                        vo.c cVarC = constructor.c();
                        Intrinsics.checkNotNullExpressionValue(cVarC, "getKind(...)");
                        vo.n0 n0VarD = typeAliasDescriptor.d();
                        Intrinsics.checkNotNullExpressionValue(n0VarD, "getSource(...)");
                        y0 y0Var = y0VarD;
                        n0 n0Var2 = new n0(storageManager, typeAliasDescriptor, hVarB, null, annotations, cVarC, n0VarD);
                        List listL = constructor.L();
                        if (listL == null) {
                            yo.s.v0(28);
                            throw null;
                        }
                        ArrayList arrayListF0 = yo.s.F0(n0Var2, listL, y0Var, false, false, null);
                        if (arrayListF0 == null) {
                            n0Var = null;
                        } else {
                            lq.d0 d0VarL = lq.c.l(hVarB.E.w0());
                            lq.d0 d0VarJ = vVar.j();
                            Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
                            lq.d0 d0VarF = lq.c.F(d0VarL, d0VarJ);
                            yo.t tVar3 = constructor.H;
                            wo.f fVar = wo.g.f22379a;
                            yo.t tVarN = tVar3 != null ? mf.f.n(n0Var2, y0Var.h(tVar3.getType(), e1.INVARIANT), fVar) : null;
                            vo.f fVarB1 = vVar.B0();
                            if (fVarB1 != null) {
                                List listZ = constructor.Z();
                                Intrinsics.checkNotNullExpressionValue(listZ, "getContextReceiverParameters(...)");
                                ArrayList arrayList12 = new ArrayList(kotlin.collections.e0.l(listZ, i10));
                                int i11 = 0;
                                for (Object obj11 : listZ) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        kotlin.collections.d0.k();
                                        throw null;
                                    }
                                    yo.t tVar4 = (yo.t) obj11;
                                    lq.z zVarH = y0Var.h(tVar4.getType(), e1.INVARIANT);
                                    fq.e eVarB0 = tVar4.B0();
                                    Intrinsics.checkNotNull(eVarB0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                    arrayList12.add(new yo.t(fVarB1, new fq.b(fVarB1, zVarH, ((fq.b) eVarB0).z0()), fVar, up.f.a(i11)));
                                    i11 = i12;
                                }
                                list = arrayList12;
                            } else {
                                list = kotlin.collections.n0.f14659d;
                            }
                            n0Var2.G0(tVarN, null, list, typeAliasDescriptor.l(), arrayListF0, d0VarF, vo.y.f21852e, typeAliasDescriptor.f23427y);
                            n0Var = n0Var2;
                        }
                    }
                    if (n0Var != null) {
                        arrayList11.add(n0Var);
                    }
                    i10 = 10;
                }
                return arrayList11;
            case 26:
                StringBuilder sb3 = new StringBuilder("Scope for type parameter ");
                fp.b bVar4 = (fp.b) obj;
                sb3.append(((up.e) bVar4.f9330e).b());
                return w3.q.m(sb3.toString(), ((yo.g) bVar4.f9331i).getUpperBounds());
            case 27:
                yo.o oVar = (yo.o) obj;
                HashSet hashSet2 = new HashSet();
                for (up.e eVar2 : (Set) oVar.f23466e.F.invoke()) {
                    dp.c cVar2 = dp.c.f7698x;
                    hashSet2.addAll(oVar.c(eVar2, cVar2));
                    hashSet2.addAll(oVar.a(eVar2, cVar2));
                }
                return hashSet2;
            default:
                return (List) obj;
        }
    }
}
