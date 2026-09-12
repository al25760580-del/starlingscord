package po;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends g0 implements KClass, c0, s1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f18066v = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f18067e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f18068i;

    public b0(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f18067e = jClass;
        this.f18068i = rn.l.a(rn.m.f19486e, new t(this, 0));
    }

    public static yo.j n(up.b bVar, ap.e eVar) {
        hq.j jVar = eVar.f2861a;
        uo.m mVar = new uo.m(jVar.f11020b, bVar.f21258a, 1);
        up.e eVarF = bVar.f();
        vo.y yVar = vo.y.f21852e;
        vo.g gVar = vo.g.f21808d;
        List listC = kotlin.collections.c0.c(jVar.f11020b.f().k("Any").j());
        kq.l lVar = jVar.f11019a;
        yo.j jVar2 = new yo.j(mVar, eVarF, yVar, gVar, listC, lVar);
        jVar2.l0(new z(lVar, jVar2), kotlin.collections.p0.f14661d, null);
        return jVar2;
    }

    @Override // po.g0
    public final Collection d() {
        vo.f descriptor = getDescriptor();
        if (descriptor.c() == vo.g.f21809e || descriptor.c() == vo.g.f21813x) {
            return kotlin.collections.n0.f14659d;
        }
        Collection collectionP = descriptor.p();
        Intrinsics.checkNotNullExpressionValue(collectionP, "getConstructors(...)");
        return collectionP;
    }

    @Override // po.g0
    public final Collection e(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        eq.o oVarJ = getDescriptor().j().J();
        dp.c cVar = dp.c.f7694e;
        Collection collectionC = oVarJ.c(name, cVar);
        eq.o oVarF = getDescriptor().F();
        Intrinsics.checkNotNullExpressionValue(oVarF, "getStaticScope(...)");
        return CollectionsKt.V(collectionC, oVarF.c(name, cVar));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && Intrinsics.areEqual(gn.h.C(this), gn.h.C((KClass) obj));
    }

    @Override // po.g0
    public final vo.l0 f(int i7) {
        Class<?> declaringClass;
        Class cls = this.f18067e;
        if (Intrinsics.areEqual(cls.getSimpleName(), "DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            Intrinsics.checkNotNullParameter(declaringClass, "<this>");
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(declaringClass);
            Intrinsics.checkNotNull(orCreateKotlinClass, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            return ((b0) orCreateKotlinClass).f(i7);
        }
        vo.f descriptor = getDescriptor();
        jq.j jVar = descriptor instanceof jq.j ? (jq.j) descriptor : null;
        if (jVar != null) {
            pp.k kVar = jVar.f14030w;
            vp.m classLocalVariable = sp.k.j;
            Intrinsics.checkNotNullExpressionValue(classLocalVariable, "classLocalVariable");
            pp.i0 i0Var = (pp.i0) m3.m.C(kVar, classLocalVariable, i7);
            if (i0Var != null) {
                bc.k kVar2 = jVar.I;
                return (vo.l0) a2.f(this.f18067e, i0Var, (rp.f) kVar2.f3123i, (pf.b) kVar2.f3125w, jVar.f14031x, a0.f18057d);
            }
        }
        return null;
    }

    @Override // mo.b
    public final List getAnnotations() {
        throw null;
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Class getJClass() {
        return this.f18067e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Collection getMembers() {
        u1 u1Var = ((x) this.f18068i.getValue()).f18186n;
        KProperty kProperty = x.f18176o[16];
        Object objInvoke = u1Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final String getQualifiedName() {
        u1 u1Var = ((x) this.f18068i.getValue()).f18179e;
        KProperty kProperty = x.f18176o[3];
        return (String) u1Var.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final String getSimpleName() {
        u1 u1Var = ((x) this.f18068i.getValue()).f18178d;
        KProperty kProperty = x.f18176o[2];
        return (String) u1Var.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        u1 u1Var = ((x) this.f18068i.getValue()).f18181g;
        KProperty kProperty = x.f18176o[6];
        Object objInvoke = u1Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return gn.h.C(this).hashCode();
    }

    @Override // po.g0
    public final Collection i(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        eq.o oVarJ = getDescriptor().j().J();
        dp.c cVar = dp.c.f7694e;
        Collection collectionA = oVarJ.a(name, cVar);
        eq.o oVarF = getDescriptor().F();
        Intrinsics.checkNotNullExpressionValue(oVarF, "getStaticScope(...)");
        return CollectionsKt.V(collectionA, oVarF.a(name, cVar));
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInstance(Object obj) {
        List list = bp.c.f3339a;
        Class cls = this.f18067e;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Integer num = (Integer) bp.c.f3342d.get(cls);
        if (num != null) {
            return TypeIntrinsics.isFunctionOfArity(obj, num.intValue());
        }
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Class cls2 = (Class) bp.c.f3341c.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.isInstance(obj);
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        return getDescriptor().isValue();
    }

    public final up.b o() {
        so.k kVarD;
        up.b bVar = y1.f18196a;
        Class klass = this.f18067e;
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            kVarD = componentType.isPrimitive() ? cq.c.b(componentType.getSimpleName()).d() : null;
            if (kVarD != null) {
                return new up.b(so.p.f20402l, kVarD.f20353e);
            }
            up.c topLevelFqName = so.o.f20374g.g();
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            return new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
        }
        if (Intrinsics.areEqual(klass, Void.TYPE)) {
            return y1.f18196a;
        }
        kVarD = klass.isPrimitive() ? cq.c.b(klass.getSimpleName()).d() : null;
        if (kVarD != null) {
            return new up.b(so.p.f20402l, kVarD.f20352d);
        }
        up.b bVarA = bp.c.a(klass);
        if (!bVarA.f21260c) {
            String str = uo.d.f21197a;
            up.c fqName = bVarA.a();
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            up.b bVar2 = (up.b) uo.d.f21204h.get(fqName.f21262a);
            if (bVar2 != null) {
                return bVar2;
            }
        }
        return bVarA;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.c0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final vo.f getDescriptor() {
        return ((x) this.f18068i.getValue()).a();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("class ");
        up.b bVarO = o();
        up.c cVar = bVarO.f21258a;
        String strG = cVar.f21262a.c() ? "" : s0.g.g(new StringBuilder(), cVar.f21262a.f21265a, '.');
        sb2.append(strG + kotlin.text.x.m(bVarO.f21259b.f21262a.f21265a, '.', '$'));
        return sb2.toString();
    }
}
