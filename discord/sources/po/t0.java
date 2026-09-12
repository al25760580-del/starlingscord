package po;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t0 extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f18159d = new t0(2, hq.t.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        hq.t p3 = (hq.t) obj;
        pp.i0 p5 = (pp.i0) obj2;
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p5, "p1");
        return p3.f(p5);
    }
}
