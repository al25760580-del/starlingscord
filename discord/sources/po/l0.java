package po;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends m1 implements mo.g {
    public final m0 G;

    public l0(m0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.G = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((l0) this.G.M.getValue()).call(obj, obj2);
        return Unit.f14616a;
    }

    @Override // po.i1
    public final n1 j() {
        return this.G;
    }
}
