package po;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends g1 implements mo.j {
    public final Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(g0 container, String name, String signature) {
        super(container, name, signature);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        this.M = rn.l.a(rn.m.f19486e, new ep.x(18, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mo.k
    public final mo.d getSetter() {
        return (n0) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mo.j, mo.k
    public final mo.i getSetter() {
        return (n0) this.M.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(g0 container, vo.l0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.M = rn.l.a(rn.m.f19486e, new ep.x(18, this));
    }
}
