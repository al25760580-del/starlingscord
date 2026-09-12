package po;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class a1 extends n1 implements mo.p {
    public final Object K;
    public final Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(g0 container, vo.l0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        rn.m mVar = rn.m.f19486e;
        this.K = rn.l.a(mVar, new y0(this, 0));
        this.L = rn.l.a(mVar, new y0(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mo.p
    public final Object getDelegate() {
        return this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final mo.n getGetter() {
        return (z0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((z0) this.K.getValue()).call(new Object[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.n1
    public final k1 l() {
        return (z0) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final mo.o getGetter() {
        return (z0) this.K.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(g0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        rn.m mVar = rn.m.f19486e;
        this.K = rn.l.a(mVar, new y0(this, 0));
        this.L = rn.l.a(mVar, new y0(this, 1));
    }
}
