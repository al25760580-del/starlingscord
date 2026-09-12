package po;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends k1 implements mo.q {
    public final d1 G;

    public c1(d1 property) {
        Intrinsics.checkNotNullParameter(property, "property");
        this.G = property;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c1) this.G.K.getValue()).call(obj);
    }

    @Override // po.i1
    public final n1 j() {
        return this.G;
    }
}
