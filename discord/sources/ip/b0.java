package ip;

import a5.i0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.n0;
import kotlin.collections.r0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import lq.d1;
import lq.z0;
import vo.o0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 extends eq.p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f13319m = {kk.b.p(b0.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), kk.b.p(b0.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), kk.b.p(b0.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.i f13320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f13321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kq.c f13322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kq.i f13323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kq.e f13324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kq.j f13325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kq.e f13326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final kq.i f13327i;
    public final kq.i j;
    public final kq.i k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final kq.e f13328l;

    public b0(e4.i c8, p pVar) {
        Intrinsics.checkNotNullParameter(c8, "c");
        this.f13320b = c8;
        this.f13321c = pVar;
        hp.a aVar = (hp.a) c8.f7980e;
        hp.a aVar2 = (hp.a) c8.f7980e;
        kq.o oVar = aVar.f10957a;
        x xVar = new x(this, 0);
        n0 n0Var = n0.f14659d;
        kq.l lVar = (kq.l) oVar;
        lVar.getClass();
        if (n0Var == null) {
            kq.l.a(27);
            throw null;
        }
        this.f13322d = new kq.c(lVar, xVar, n0Var);
        kq.o oVar2 = aVar2.f10957a;
        x xVar2 = new x(this, 1);
        kq.l lVar2 = (kq.l) oVar2;
        lVar2.getClass();
        this.f13323e = new kq.i(lVar2, xVar2);
        this.f13324f = ((kq.l) aVar2.f10957a).c(new z(this, 0));
        this.f13325g = ((kq.l) aVar2.f10957a).d(new z(this, 1));
        int i7 = 2;
        this.f13326h = ((kq.l) aVar2.f10957a).c(new z(this, i7));
        kq.o oVar3 = aVar2.f10957a;
        x xVar3 = new x(this, i7);
        kq.l lVar3 = (kq.l) oVar3;
        lVar3.getClass();
        this.f13327i = new kq.i(lVar3, xVar3);
        kq.o oVar4 = aVar2.f10957a;
        x xVar4 = new x(this, 3);
        kq.l lVar4 = (kq.l) oVar4;
        lVar4.getClass();
        this.j = new kq.i(lVar4, xVar4);
        kq.o oVar5 = aVar2.f10957a;
        x xVar5 = new x(this, 4);
        kq.l lVar5 = (kq.l) oVar5;
        lVar5.getClass();
        this.k = new kq.i(lVar5, xVar5);
        this.f13328l = ((kq.l) aVar2.f10957a).c(new z(this, 3));
    }

    public static lq.z l(bp.x method, e4.i c8) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c8, "c");
        Class<?> klass = ((Method) method.b()).getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(klass, "getDeclaringClass(...)");
        Intrinsics.checkNotNullParameter(klass, "klass");
        return ((e4.m) c8.f7983w).M(method.f(), xr.m.S(z0.f15271e, klass.isAnnotation(), null, 6));
    }

    public static i0 u(e4.i c8, yo.s sVar, List jValueParameters) {
        Pair pair;
        up.e eVarE;
        Intrinsics.checkNotNullParameter(c8, "c");
        yo.s function = sVar;
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        kotlin.collections.x xVarM0 = CollectionsKt.m0(jValueParameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(xVarM0, 10));
        Iterator it = xVarM0.iterator();
        boolean z5 = false;
        boolean z6 = false;
        while (true) {
            r0 r0Var = (r0) it;
            if (!r0Var.f14666e.hasNext()) {
                return new i0(CollectionsKt.i0(arrayList), z6);
            }
            IndexedValue indexedValue = (IndexedValue) r0Var.next();
            int i7 = indexedValue.f14622a;
            bp.d0 d0Var = (bp.d0) indexedValue.f14623b;
            hp.c cVarF = mf.f.F(c8, d0Var);
            e4.m mVar = (e4.m) c8.f7983w;
            hp.a aVar = (hp.a) c8.f7980e;
            vo.z zVar = aVar.f10969o;
            jp.a aVarS = xr.m.S(z0.f15271e, z5, null, 7);
            boolean z7 = d0Var.f3348d;
            bp.b0 b0Var = d0Var.f3345a;
            if (z7) {
                bp.h hVar = b0Var instanceof bp.h ? (bp.h) b0Var : null;
                if (hVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + d0Var);
                }
                d1 d1VarL = mVar.L(hVar, aVarS, true);
                pair = new Pair(d1VarL, zVar.f().f(d1VarL));
            } else {
                pair = new Pair(mVar.M(b0Var, aVarS), null);
            }
            lq.z zVar2 = (lq.z) pair.f14612d;
            lq.z zVar3 = (lq.z) pair.f14613e;
            if (Intrinsics.areEqual(function.getName().b(), "equals") && jValueParameters.size() == 1 && Intrinsics.areEqual(zVar.f().p(), zVar2)) {
                eVarE = up.e.e("other");
            } else {
                String str = d0Var.f3347c;
                up.e eVarD = str != null ? up.e.d(str) : null;
                if (eVarD == null) {
                    z6 = true;
                }
                if (eVarD == null) {
                    eVarE = up.e.e("p" + i7);
                    Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
                } else {
                    eVarE = eVarD;
                }
            }
            boolean z10 = z6;
            Intrinsics.checkNotNull(eVarE);
            arrayList.add(new q0(function, null, i7, cVarF, eVarE, zVar2, false, false, false, zVar3, aVar.j.c(d0Var)));
            function = sVar;
            z5 = false;
            z6 = z10;
        }
    }

    @Override // eq.p, eq.o
    public Collection a(up.e name, dp.c location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !f().contains(name) ? n0.f14659d : (Collection) this.f13328l.invoke(name);
    }

    @Override // eq.p, eq.o
    public final Set b() {
        return (Set) io.sentry.config.a.H(this.f13327i, f13319m[0]);
    }

    @Override // eq.p, eq.o
    public Collection c(up.e name, dp.a location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !b().contains(name) ? n0.f14659d : (Collection) this.f13326h.invoke(name);
    }

    @Override // eq.p, eq.q
    public Collection d(eq.f kindFilter, Function1 nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f13322d.invoke();
    }

    @Override // eq.p, eq.o
    public final Set e() {
        return (Set) io.sentry.config.a.H(this.k, f13319m[2]);
    }

    @Override // eq.p, eq.o
    public final Set f() {
        return (Set) io.sentry.config.a.H(this.j, f13319m[1]);
    }

    public abstract Set h(eq.f fVar, Function1 function1);

    public abstract Set i(eq.f fVar, eq.l lVar);

    public void j(ArrayList result, up.e name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public abstract c k();

    public abstract void m(LinkedHashSet linkedHashSet, up.e eVar);

    public abstract void n(ArrayList arrayList, up.e eVar);

    public abstract Set o(eq.f fVar);

    public abstract yo.t p();

    public abstract vo.l q();

    public boolean r(gp.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return true;
    }

    public abstract a0 s(bp.x xVar, ArrayList arrayList, lq.z zVar, List list);

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    public final gp.e t(bp.x typeParameterOwner) {
        vo.y yVar;
        Intrinsics.checkNotNullParameter(typeParameterOwner, "method");
        e4.i iVar = this.f13320b;
        gp.e containingDeclaration = gp.e.Q0(q(), mf.f.F(iVar, typeParameterOwner), typeParameterOwner.c(), ((hp.a) iVar.f7980e).j.c(typeParameterOwner), ((c) this.f13323e.invoke()).c(typeParameterOwner.c()) != null && ((ArrayList) typeParameterOwner.g()).isEmpty());
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "createJavaMethod(...)");
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        e4.i iVar2 = new e4.i((hp.a) iVar.f7980e, new hp.e(iVar, containingDeclaration, typeParameterOwner, 0), (Lazy) iVar.f7982v);
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            vo.r0 r0VarA = ((hp.f) iVar2.f7981i).a((bp.c0) it.next());
            Intrinsics.checkNotNull(r0VarA);
            arrayList.add(r0VarA);
        }
        i0 i0VarU = u(iVar2, containingDeclaration, typeParameterOwner.g());
        a0 a0VarS = s(typeParameterOwner, arrayList, l(typeParameterOwner, iVar2), (List) i0VarU.f215i);
        List list = a0VarS.f13317d;
        yo.t tVarP = p();
        n0 n0Var = n0.f14659d;
        ArrayList arrayList2 = a0VarS.f13316c;
        List list2 = a0VarS.f13315b;
        lq.z zVar = a0VarS.f13314a;
        o0 o0Var = vo.y.f21851d;
        boolean zIsAbstract = Modifier.isAbstract(((Method) typeParameterOwner.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) typeParameterOwner.b()).getModifiers());
        o0Var.getClass();
        if (zIsAbstract) {
            yVar = vo.y.f21855w;
        } else {
            yVar = !zIsFinal ? vo.y.f21854v : vo.y.f21852e;
        }
        containingDeclaration.P0(null, tVarP, n0Var, arrayList2, list2, zVar, yVar, ls.l.B(typeParameterOwner.e()), w0.d());
        containingDeclaration.R0(false, i0VarU.f214e);
        if (list.isEmpty()) {
            return containingDeclaration;
        }
        ((hp.a) iVar2.f7980e).f10961e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
