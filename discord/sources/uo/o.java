package uo;

import ep.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.collections.d1;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KProperty;
import lq.b0;
import lq.d0;
import lq.w0;
import lq.y0;
import pp.a0;
import vo.t;
import vo.u;
import vo.y;
import vo.z;
import yo.k0;
import yo.q0;
import yo.s;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements xo.b, xo.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f21235h = {kk.b.p(o.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), kk.b.p(o.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), kk.b.p(o.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f21236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq.i f21237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f21238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.i f21239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.e f21240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kq.i f21241f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kq.e f21242g;

    public o(yo.z moduleDescriptor, kq.l storageManager, x settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.f21236a = moduleDescriptor;
        this.f21237b = new kq.i(storageManager, settingsComputation);
        yo.j jVar = new yo.j(new m(moduleDescriptor, new up.c("java.io"), 0), up.e.e("Serializable"), y.f21855w, vo.g.f21809e, c0.c(new b0(storageManager, new k(this, 1))), storageManager);
        jVar.l0(eq.n.f8648b, p0.f14661d, null);
        d0 d0VarJ = jVar.j();
        Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
        this.f21238c = d0VarJ;
        this.f21239d = new kq.i(storageManager, new fp.b(16, this, storageManager));
        this.f21240e = new kq.e(storageManager, new ConcurrentHashMap(3, 1.0f, 2), new kq.f(), 0);
        this.f21241f = new kq.i(storageManager, new k(this, 0));
        this.f21242g = storageManager.c(new bp.i(18, this));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0336  */
    /* JADX WARN: Code duplicated, block: B:105:0x034d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0352  */
    /* JADX WARN: Code duplicated, block: B:119:0x02bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0246 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0216  */
    /* JADX WARN: Code duplicated, block: B:70:0x0218  */
    /* JADX WARN: Code duplicated, block: B:72:0x0232  */
    /* JADX WARN: Code duplicated, block: B:79:0x024c  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x02b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x02b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:86:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x0333  */
    @Override // xo.b
    public final Collection a(up.e name, vo.f mutable) throws Throwable {
        Set setB;
        k0 k0Var;
        Iterable<k0> iterable;
        boolean z5;
        vo.l lVarG;
        boolean zBooleanValue;
        ArrayList arrayList;
        t tVarM0;
        int iOrdinal;
        boolean z6;
        k0 k0Var2;
        up.e name2;
        boolean zAreEqual;
        kq.e eVar;
        wo.h hVar;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(mutable, "classDescriptor");
        boolean zAreEqual2 = Intrinsics.areEqual(name, a.f21192e);
        KProperty[] kPropertyArr = f21235h;
        if (zAreEqual2 && (mutable instanceof jq.j) && (so.i.b(mutable, so.o.f20374g) || so.i.s(mutable) != null)) {
            jq.j jVar = (jq.j) mutable;
            List list = jVar.f14030w.N;
            Intrinsics.checkNotNullExpressionValue(list, "getFunctionList(...)");
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(mo.c0.w((rp.f) jVar.I.f3123i, ((a0) it.next()).f18203x), a.f21192e)) {
                        return n0.f14659d;
                    }
                }
            }
            t tVarM1 = ((k0) CollectionsKt.Y(((d0) io.sentry.config.a.H(this.f21239d, kPropertyArr[1])).J().c(name, dp.c.f7693d))).m0();
            tVarM1.V(jVar);
            tVarM1.e(vo.p.f21828e);
            tVarM1.U(jVar.j());
            tVarM1.s(jVar.u0());
            u uVarBuild = tVarM1.build();
            Intrinsics.checkNotNull(uVarBuild);
            return c0.c((k0) uVarBuild);
        }
        g().getClass();
        ip.j jVarF = f(mutable);
        if (jVarF != null) {
            up.c fqName = bq.e.g(jVarF);
            b builtIns = b.f21193f;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Intrinsics.checkNotNullParameter(builtIns, "builtIns");
            vo.f fVarC = e.c(fqName, builtIns);
            if (fVarC == null) {
                setB = p0.f14661d;
            } else {
                String str = d.f21197a;
                up.c cVar = (up.c) d.k.get(bq.e.h(fVarC));
                setB = cVar == null ? d1.b(fVarC) : kotlin.collections.d0.g(fVarC, builtIns.j(cVar));
            }
            Iterable iterable2 = setB;
            vo.f fVar = (vo.f) CollectionsKt.R(iterable2);
            if (fVar == null) {
                iterable = n0.f14659d;
            } else {
                int i7 = vq.j.f21949i;
                ArrayList set = new ArrayList(e0.l(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    set.add(bq.e.g((vo.f) it2.next()));
                }
                Intrinsics.checkNotNullParameter(set, "set");
                vq.j jVar2 = new vq.j(0);
                jVar2.addAll(set);
                Intrinsics.checkNotNullParameter(mutable, "mutable");
                String str2 = d.f21197a;
                boolean zContainsKey = d.j.containsKey(xp.e.g(mutable));
                up.c cVarG = bq.e.g(jVarF);
                fp.b bVar = new fp.b(17, jVarF, fVar);
                kq.e eVar2 = this.f21240e;
                eVar2.getClass();
                Object objInvoke = eVar2.invoke(new kq.g(cVarG, bVar));
                if (objInvoke == null) {
                    kq.e.a(3);
                    throw null;
                }
                eq.o it3 = ((vo.f) objInvoke).n0();
                Intrinsics.checkNotNullExpressionValue(it3, "getUnsubstitutedMemberScope(...)");
                Intrinsics.checkNotNullParameter(it3, "it");
                Collection collectionC = it3.c(name, dp.c.f7693d);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionC) {
                    k0 k0Var3 = (k0) obj;
                    if (k0Var3.c() == vo.c.f21792d && k0Var3.getVisibility().f8580a.f17635b && !so.i.D(k0Var3)) {
                        Collection collectionH = k0Var3.h();
                        Intrinsics.checkNotNullExpressionValue(collectionH, "getOverriddenDescriptors(...)");
                        Collection collection = collectionH;
                        if ((collection instanceof Collection) && collection.isEmpty()) {
                            lVarG = k0Var3.g();
                            Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            if (r.f21253e.contains(c9.a.I((vo.f) lVarG, com.facebook.imagepipeline.nativecode.b.f(k0Var3, 3))) ^ zContainsKey) {
                                zBooleanValue = true;
                            } else {
                                Boolean boolI = vq.m.i(c0.c(k0Var3), e.f21209d, new f(this));
                                Intrinsics.checkNotNullExpressionValue(boolI, "ifAny(...)");
                                zBooleanValue = boolI.booleanValue();
                            }
                            if (zBooleanValue) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                        } else {
                            Iterator it4 = collection.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    vo.l lVarG2 = ((u) it4.next()).g();
                                    Intrinsics.checkNotNullExpressionValue(lVarG2, "getContainingDeclaration(...)");
                                    if (jVar2.contains(bq.e.g(lVarG2))) {
                                    }
                                } else {
                                    lVarG = k0Var3.g();
                                    Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                                    if (r.f21253e.contains(c9.a.I((vo.f) lVarG, com.facebook.imagepipeline.nativecode.b.f(k0Var3, 3))) ^ zContainsKey) {
                                        zBooleanValue = true;
                                    } else {
                                        Boolean boolI2 = vq.m.i(c0.c(k0Var3), e.f21209d, new f(this));
                                        Intrinsics.checkNotNullExpressionValue(boolI2, "ifAny(...)");
                                        zBooleanValue = boolI2.booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        z5 = true;
                                    }
                                }
                                z5 = false;
                            }
                        }
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        arrayList2.add(obj);
                    }
                }
                k0Var = null;
                iterable = arrayList2;
            }
            arrayList = new ArrayList();
            for (k0 k0Var4 : iterable) {
                vo.l lVarG3 = k0Var4.g();
                Intrinsics.checkNotNull(lVarG3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                u uVarB = k0Var4.b(xr.m.j((vo.f) lVarG3, mutable).c());
                Intrinsics.checkNotNull(uVarB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
                tVarM0 = ((k0) uVarB).m0();
                tVarM0.V(mutable);
                tVarM0.s(mutable.u0());
                tVarM0.n();
                vo.l lVarG4 = k0Var4.g();
                Intrinsics.checkNotNull(lVarG4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Object objG = vq.m.g(c0.c((vo.f) lVarG4), new ph.c(this), new n(com.facebook.imagepipeline.nativecode.b.f(k0Var4, 3), new Ref.ObjectRef()));
                Intrinsics.checkNotNullExpressionValue(objG, "dfs(...)");
                iOrdinal = ((l) objG).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        Unit unit = Unit.f14616a;
                    } else if (iOrdinal != 2) {
                        name2 = k0Var4.getName();
                        zAreEqual = Intrinsics.areEqual(name2, p.f21243a);
                        eVar = this.f21242g;
                        if (zAreEqual) {
                            hVar = (wo.h) eVar.invoke(new Pair(k0Var4.getName().b(), "first"));
                        } else {
                            if (Intrinsics.areEqual(name2, p.f21244b)) {
                                throw new IllegalStateException(("Unexpected name: " + k0Var4.getName()).toString());
                            }
                            hVar = (wo.h) eVar.invoke(new Pair(k0Var4.getName().b(), "last"));
                        }
                        tVarM0.f(hVar);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new rn.n();
                        }
                        k0Var2 = k0Var;
                    } else {
                        tVarM0.f((wo.h) io.sentry.config.a.H(this.f21241f, kPropertyArr[2]));
                    }
                    u uVarBuild2 = tVarM0.build();
                    Intrinsics.checkNotNull(uVarBuild2);
                    k0Var2 = (k0) uVarBuild2;
                } else {
                    Intrinsics.checkNotNullParameter(mutable, "<this>");
                    if (mutable.e() == y.f21852e || mutable.c() == vo.g.f21810i) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (z6) {
                        k0Var2 = k0Var;
                    } else {
                        tVarM0.y();
                        u uVarBuild3 = tVarM0.build();
                        Intrinsics.checkNotNull(uVarBuild3);
                        k0Var2 = (k0) uVarBuild3;
                    }
                }
                if (k0Var2 != null) {
                    arrayList.add(k0Var2);
                }
            }
            return arrayList;
        }
        iterable = n0.f14659d;
        k0Var = null;
        arrayList = new ArrayList();
        while (r1.hasNext()) {
            vo.l lVarG5 = k0Var4.g();
            Intrinsics.checkNotNull(lVarG5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            u uVarB2 = k0Var4.b(xr.m.j((vo.f) lVarG5, mutable).c());
            Intrinsics.checkNotNull(uVarB2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            tVarM0 = ((k0) uVarB2).m0();
            tVarM0.V(mutable);
            tVarM0.s(mutable.u0());
            tVarM0.n();
            vo.l lVarG6 = k0Var4.g();
            Intrinsics.checkNotNull(lVarG6, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            Object objG2 = vq.m.g(c0.c((vo.f) lVarG6), new ph.c(this), new n(com.facebook.imagepipeline.nativecode.b.f(k0Var4, 3), new Ref.ObjectRef()));
            Intrinsics.checkNotNullExpressionValue(objG2, "dfs(...)");
            iOrdinal = ((l) objG2).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    Unit unit2 = Unit.f14616a;
                } else if (iOrdinal != 2) {
                    name2 = k0Var4.getName();
                    zAreEqual = Intrinsics.areEqual(name2, p.f21243a);
                    eVar = this.f21242g;
                    if (zAreEqual) {
                        hVar = (wo.h) eVar.invoke(new Pair(k0Var4.getName().b(), "first"));
                    } else {
                        if (Intrinsics.areEqual(name2, p.f21244b)) {
                            throw new IllegalStateException(("Unexpected name: " + k0Var4.getName()).toString());
                        }
                        hVar = (wo.h) eVar.invoke(new Pair(k0Var4.getName().b(), "last"));
                    }
                    tVarM0.f(hVar);
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new rn.n();
                    }
                    k0Var2 = k0Var;
                } else {
                    tVarM0.f((wo.h) io.sentry.config.a.H(this.f21241f, kPropertyArr[2]));
                }
                u uVarBuild4 = tVarM0.build();
                Intrinsics.checkNotNull(uVarBuild4);
                k0Var2 = (k0) uVarBuild4;
            } else {
                Intrinsics.checkNotNullParameter(mutable, "<this>");
                if (mutable.e() == y.f21852e) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (z6) {
                    k0Var2 = k0Var;
                } else {
                    tVarM0.y();
                    u uVarBuild5 = tVarM0.build();
                    Intrinsics.checkNotNull(uVarBuild5);
                    k0Var2 = (k0) uVarBuild5;
                }
            }
            if (k0Var2 != null) {
                arrayList.add(k0Var2);
            }
        }
        return arrayList;
    }

    @Override // xo.b
    public final Collection b(vo.f classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        up.d fqName = bq.e.h(classDescriptor);
        LinkedHashSet linkedHashSet = r.f21249a;
        boolean zA = r.a(fqName);
        boolean zIsAssignableFrom = false;
        d0 d0Var = this.f21238c;
        if (zA) {
            return kotlin.collections.d0.g((d0) io.sentry.config.a.H(this.f21239d, f21235h[1]), d0Var);
        }
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (r.a(fqName)) {
            zIsAssignableFrom = true;
        } else {
            String str = d.f21197a;
            up.b bVarF = d.f(fqName);
            if (bVarF != null) {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.a().f21262a.f21265a));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return zIsAssignableFrom ? c0.c(d0Var) : n0.f14659d;
    }

    @Override // xo.b
    public final Collection c(vo.f classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.c() != vo.g.f21808d) {
            return n0.f14659d;
        }
        g().getClass();
        ip.j jVarF = f(classDescriptor);
        if (jVarF == null) {
            return n0.f14659d;
        }
        vo.f fVarC = e.c(bq.e.g(jVarF), b.f21193f);
        if (fVarC == null) {
            return n0.f14659d;
        }
        y0 y0VarC = xr.m.j(fVarC, jVarF).c();
        List list = (List) jVarF.N.f13377q.invoke();
        ArrayList<yo.h> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            yo.h hVar = (yo.h) next;
            yo.h hVar2 = hVar;
            if (hVar2.getVisibility().f8580a.f17635b) {
                Collection collectionP = fVarC.p();
                Intrinsics.checkNotNullExpressionValue(collectionP, "getConstructors(...)");
                Collection collection = collectionP;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            yo.h hVar3 = (yo.h) it2.next();
                            Intrinsics.checkNotNull(hVar3);
                            if (xp.l.j(hVar3, hVar.b(y0VarC)) == xp.j.f23004d) {
                            }
                        }
                    }
                }
                if (hVar2.L().size() == 1) {
                    List listL = hVar2.L();
                    Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                    vo.i iVarG = ((q0) CollectionsKt.Z(listL)).getType().r0().g();
                    if (Intrinsics.areEqual(iVarG != null ? bq.e.h(iVarG) : null, bq.e.h(classDescriptor))) {
                    }
                }
                if (!so.i.D(hVar) && !r.f21254f.contains(c9.a.I(jVarF, com.facebook.imagepipeline.nativecode.b.f(hVar, 3)))) {
                    arrayList.add(next);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
        for (yo.h hVar4 : arrayList) {
            yo.h hVar5 = hVar4;
            hVar5.getClass();
            yo.r rVarH0 = hVar5.H0(y0.f15267b);
            rVarH0.f23470e = classDescriptor;
            rVarH0.U(classDescriptor.j());
            rVarH0.L = true;
            w0 w0VarG = y0VarC.g();
            if (w0VarG == null) {
                yo.r.a(37);
                throw null;
            }
            rVarH0.f23469d = w0VarG;
            if (!r.f21255g.contains(c9.a.I(jVarF, com.facebook.imagepipeline.nativecode.b.f(hVar4, 3)))) {
                rVarH0.f((wo.h) io.sentry.config.a.H(this.f21241f, f21235h[2]));
            }
            s sVarE0 = rVarH0.U.E0(rVarH0);
            Intrinsics.checkNotNull(sVarE0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((yo.h) sVarE0);
        }
        return arrayList2;
    }

    @Override // xo.b
    public final Collection d(vo.f classDescriptor) {
        Set setB;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        g().getClass();
        ip.j jVarF = f(classDescriptor);
        if (jVarF == null || (setB = jVarF.n0().b()) == null) {
            setB = p0.f14661d;
        }
        return setB;
    }

    @Override // xo.d
    public final boolean e(vo.f classDescriptor, jq.u functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        ip.j jVarF = f(classDescriptor);
        if (jVarF == null || !functionDescriptor.getAnnotations().P(xo.e.f22994a)) {
            return true;
        }
        g().getClass();
        String strF = com.facebook.imagepipeline.nativecode.b.f(functionDescriptor, 3);
        ip.p pVarN0 = jVarF.n0();
        up.e name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection collectionC = pVarN0.c(name, dp.c.f7693d);
        if ((collectionC instanceof Collection) && collectionC.isEmpty()) {
            return false;
        }
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(com.facebook.imagepipeline.nativecode.b.f((k0) it.next(), 3), strF)) {
                return true;
            }
        }
        return false;
    }

    public final ip.j f(vo.f fVar) {
        up.c cVarA;
        if (fVar == null) {
            so.i.a(108);
            throw null;
        }
        if (!so.i.b(fVar, so.o.f20363a) && so.i.J(fVar)) {
            up.d dVarH = bq.e.h(fVar);
            if (dVarH.d()) {
                String str = d.f21197a;
                up.b bVarF = d.f(dVarH);
                if (bVarF != null && (cVarA = bVarF.a()) != null) {
                    yo.z zVar = g().f21221a;
                    dp.c cVar = dp.c.f7693d;
                    vo.f fVarG = mf.f.G(zVar, cVarA);
                    if (fVarG instanceof ip.j) {
                        return (ip.j) fVarG;
                    }
                }
            }
        }
        return null;
    }

    public final i g() {
        return (i) io.sentry.config.a.H(this.f21237b, f21235h[0]);
    }
}
