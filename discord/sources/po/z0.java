package po;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends k1 implements mo.o {
    public final a1 G;

    public z0(a1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.G = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return ((z0) this.G.K.getValue()).call(new Object[0]);
    }

    @Override // po.i1
    public final n1 j() {
        return this.G;
    }
}
