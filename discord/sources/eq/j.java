package eq;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f8639e;

    public /* synthetic */ j(int i7, Function0 function0) {
        this.f8638d = i7;
        this.f8639e = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f8638d) {
            case 0:
                o oVar = (o) this.f8639e.invoke();
                return oVar instanceof k ? ((k) oVar).h() : oVar;
            default:
                return CollectionsKt.l0((Iterable) this.f8639e.invoke());
        }
    }
}
