package np;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Function2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f16981e = new a(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f16982i = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16983d;

    public /* synthetic */ a(int i7) {
        this.f16983d = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        c loadConstantFromProperty = (c) obj;
        p it = (p) obj2;
        switch (this.f16983d) {
            case 0:
                Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
                Intrinsics.checkNotNullParameter(it, "it");
                return loadConstantFromProperty.f16990c.get(it);
            default:
                Intrinsics.checkNotNullParameter(loadConstantFromProperty, "$this$loadConstantFromProperty");
                Intrinsics.checkNotNullParameter(it, "it");
                return loadConstantFromProperty.f16989b.get(it);
        }
    }
}
