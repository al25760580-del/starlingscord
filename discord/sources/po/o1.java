package po;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o1 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f18119e;

    public /* synthetic */ o1(q1 q1Var, int i7) {
        this.f18118d = i7;
        this.f18119e = q1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18118d) {
            case 0:
                q1 q1Var = this.f18119e;
                return q1Var.a(q1Var.f18132d);
            default:
                Type javaType = this.f18119e.getJavaType();
                Intrinsics.checkNotNull(javaType);
                return bp.c.c(javaType);
        }
    }
}
