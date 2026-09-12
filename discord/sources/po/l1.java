package po;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m1 f18107e;

    public /* synthetic */ l1(m1 m1Var, int i7) {
        this.f18106d = i7;
        this.f18107e = m1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18106d) {
            case 0:
                m1 m1Var = this.f18107e;
                yo.j0 setter = m1Var.j().e().getSetter();
                if (setter != null) {
                    return setter;
                }
                yo.j0 j0VarJ = mf.f.j(m1Var.j().e(), wo.g.f22379a);
                Intrinsics.checkNotNullExpressionValue(j0VarJ, "createDefaultSetter(...)");
                return j0VarJ;
            default:
                return com.facebook.imagepipeline.nativecode.c.c(this.f18107e, false);
        }
    }
}
