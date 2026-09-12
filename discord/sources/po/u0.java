package po;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f18163e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f18164i;

    public u0(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f18163e = jClass;
        this.f18164i = rn.l.a(rn.m.f19486e, new p0(this, 0));
    }

    @Override // po.g0
    public final Collection d() {
        return kotlin.collections.n0.f14659d;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.g0
    public final Collection e(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        u1 u1Var = ((s0) this.f18164i.getValue()).f18153d;
        KProperty kProperty = s0.f18151h[1];
        Object objInvoke = u1Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return ((eq.o) objInvoke).c(name, dp.c.f7694e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u0) {
            return Intrinsics.areEqual(this.f18163e, ((u0) obj).f18163e);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.g0
    public final vo.l0 f(int i7) {
        rn.v vVar = (rn.v) ((s0) this.f18164i.getValue()).f18155f.getValue();
        if (vVar == null) {
            return null;
        }
        tp.f fVar = (tp.f) vVar.f19497d;
        pp.e0 e0Var = (pp.e0) vVar.f19498e;
        rp.e eVar = (rp.e) vVar.f19499i;
        vp.m packageLocalVariable = sp.k.f20494n;
        Intrinsics.checkNotNullExpressionValue(packageLocalVariable, "packageLocalVariable");
        pp.i0 i0Var = (pp.i0) m3.m.C(e0Var, packageLocalVariable, i7);
        if (i0Var == null) {
            return null;
        }
        pp.y0 y0Var = e0Var.f18264y;
        Intrinsics.checkNotNullExpressionValue(y0Var, "getTypeTable(...)");
        return (vo.l0) a2.f(this.f18163e, i0Var, fVar, new pf.b(y0Var), eVar, t0.f18159d);
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Class getJClass() {
        return this.f18163e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public final Collection getMembers() {
        u1 u1Var = ((s0) this.f18164i.getValue()).f18156g;
        KProperty kProperty = s0.f18151h[2];
        Object objInvoke = u1Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (Collection) objInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.g0
    public final Class h() {
        Class cls = (Class) ((s0) this.f18164i.getValue()).f18154e.getValue();
        return cls == null ? this.f18163e : cls;
    }

    public final int hashCode() {
        return this.f18163e.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.g0
    public final Collection i(up.e name) {
        Intrinsics.checkNotNullParameter(name, "name");
        u1 u1Var = ((s0) this.f18164i.getValue()).f18153d;
        KProperty kProperty = s0.f18151h[1];
        Object objInvoke = u1Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return ((eq.o) objInvoke).a(name, dp.c.f7694e);
    }

    public final String toString() {
        return "file class " + bp.c.a(this.f18163e).a();
    }
}
