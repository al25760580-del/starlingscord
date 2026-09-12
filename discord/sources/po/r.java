package po;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vo.d f18136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18137e;

    public r(vo.d dVar, int i7) {
        this.f18136d = dVar;
        this.f18137e = i7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.f18136d.L().get(this.f18137e);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (vo.j0) obj;
    }
}
