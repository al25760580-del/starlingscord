package hq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pp.s0;
import vo.n0;
import vo.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a0 f10997e = new a0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10998d = 0;

    public /* synthetic */ a0() {
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f10998d) {
            case 0:
                s0 it = (s0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(it.f18434v.size());
            default:
                Intrinsics.checkNotNullParameter((up.b) obj, "it");
                o0 NO_SOURCE = n0.C;
                Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
                return NO_SOURCE;
        }
    }

    public a0(iq.c cVar) {
    }
}
