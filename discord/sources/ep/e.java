package ep;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends j0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f8531l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final vo.u a(vo.u functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        up.e name = ((yo.l) functionDescriptor).getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (b(name)) {
            return (vo.u) bq.e.b(functionDescriptor, d.f8523e);
        }
        return null;
    }

    public static boolean b(up.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        return j0.f8563e.contains(eVar);
    }
}
