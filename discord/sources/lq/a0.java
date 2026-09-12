package lq;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15171d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f15172e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f15173i;

    public a0(eq.o oVar, List list, l0 l0Var, q0 q0Var, boolean z5) {
        this.f15172e = q0Var;
        this.f15173i = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mq.f refiner = (mq.f) obj;
        switch (this.f15171d) {
            case 0:
                Intrinsics.checkNotNullParameter(refiner, "refiner");
                vo.i descriptor = this.f15172e.g();
                if (descriptor != null) {
                    refiner.getClass();
                    Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(refiner, "kotlinTypeRefiner");
                vo.i descriptor2 = this.f15172e.g();
                if (descriptor2 != null) {
                    refiner.getClass();
                    Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
                }
                break;
        }
        return null;
    }

    public a0(List list, l0 l0Var, q0 q0Var, boolean z5) {
        this.f15172e = q0Var;
        this.f15173i = list;
    }
}
