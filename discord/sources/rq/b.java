package rq;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.d1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f19543d = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d1 d1Var = (d1) obj;
        Intrinsics.checkNotNull(d1Var);
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        return Boolean.valueOf(d1Var.r0() instanceof yp.b);
    }
}
