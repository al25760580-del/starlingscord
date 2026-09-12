package po;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 extends k1 implements mo.r {
    public final g1 G;

    public f1(g1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.G = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) this.G.K.getValue()).call(obj, obj2);
    }

    @Override // po.i1
    public final n1 j() {
        return this.G;
    }
}
