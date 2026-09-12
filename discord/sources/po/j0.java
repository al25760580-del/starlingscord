package po;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends m1 implements mo.e {
    public final k0 G;

    public j0(k0 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.G = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((j0) this.G.M.getValue()).call(obj);
        return Unit.f14616a;
    }

    @Override // po.i1
    public final n1 j() {
        return this.G;
    }
}
