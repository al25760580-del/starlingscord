package po;

import java.lang.reflect.Member;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty1;

/* JADX INFO: loaded from: classes3.dex */
public class d1 extends n1 implements KProperty1 {
    public final Object K;
    public final Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(g0 container, String name, String signature, Object obj) {
        super(container, name, signature, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
        rn.m mVar = rn.m.f19486e;
        this.K = rn.l.a(mVar, new b1(this, 0));
        this.L = rn.l.a(mVar, new b1(this, 1));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty1
    public final Object getDelegate(Object obj) {
        return j((Member) this.L.getValue(), obj, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final mo.n getGetter() {
        return (c1) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((c1) this.K.getValue()).call(obj);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // po.n1
    public final k1 l() {
        return (c1) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KProperty
    public final mo.q getGetter() {
        return (c1) this.K.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(g0 container, vo.l0 descriptor) {
        super(container, descriptor);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        rn.m mVar = rn.m.f19486e;
        this.K = rn.l.a(mVar, new b1(this, 0));
        this.L = rn.l.a(mVar, new b1(this, 1));
    }
}
