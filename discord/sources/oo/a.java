package oo;

import hq.t;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import pp.a0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f17479d = new a(2, t.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        t p3 = (t) obj;
        a0 p5 = (a0) obj2;
        Intrinsics.checkNotNullParameter(p3, "p0");
        Intrinsics.checkNotNullParameter(p5, "p1");
        return p3.e(p5);
    }
}
