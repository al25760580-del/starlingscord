package po;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends m1 implements mo.i {
    public final o0 G;

    public n0(o0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.G = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((n0) this.G.M.getValue()).call(obj, obj2, obj3);
        return Unit.f14616a;
    }

    @Override // po.i1
    public final n1 j() {
        return this.G;
    }
}
