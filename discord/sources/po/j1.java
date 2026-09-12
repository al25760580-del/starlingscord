package po;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k1 f18101e;

    public /* synthetic */ j1(k1 k1Var, int i7) {
        this.f18100d = i7;
        this.f18101e = k1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18100d) {
            case 0:
                k1 k1Var = this.f18101e;
                yo.i0 getter = k1Var.j().e().getGetter();
                if (getter != null) {
                    return getter;
                }
                yo.i0 i0VarI = mf.f.i(k1Var.j().e(), wo.g.f22379a);
                Intrinsics.checkNotNullExpressionValue(i0VarI, "createDefaultGetter(...)");
                return i0VarI;
            default:
                return com.facebook.imagepipeline.nativecode.c.c(this.f18101e, true);
        }
    }
}
