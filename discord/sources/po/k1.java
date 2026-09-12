package po;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k1 extends i1 implements mo.n {
    public static final /* synthetic */ KProperty[] F = {kk.b.p(k1.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0)};

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u1 f18104y = e4.f.f0(null, new j1(this, 0));
    public final Object E = rn.l.a(rn.m.f19486e, new j1(this, 1));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.s
    public final qo.g b() {
        return (qo.g) this.E.getValue();
    }

    @Override // po.s
    public final vo.d e() {
        KProperty kProperty = F[0];
        Object objInvoke = this.f18104y.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (yo.i0) objInvoke;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k1) && Intrinsics.areEqual(j(), ((k1) obj).j());
    }

    @Override // kotlin.reflect.KCallable
    public final String getName() {
        return s0.g.g(new StringBuilder("<get-"), j().E, '>');
    }

    public final int hashCode() {
        return j().hashCode();
    }

    @Override // po.i1
    public final vo.k0 i() {
        KProperty kProperty = F[0];
        Object objInvoke = this.f18104y.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (yo.i0) objInvoke;
    }

    public final String toString() {
        return "getter of " + j();
    }
}
