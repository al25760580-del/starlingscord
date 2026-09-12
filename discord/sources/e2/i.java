package e2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xn.h f7874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ar.p f7875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f7876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f7877d;

    /* JADX WARN: Multi-variable type inference failed */
    public i(Function2 transform, ar.p ack, a0 a0Var, CoroutineContext callerContext) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Intrinsics.checkNotNullParameter(ack, "ack");
        Intrinsics.checkNotNullParameter(callerContext, "callerContext");
        this.f7874a = (xn.h) transform;
        this.f7875b = ack;
        this.f7876c = a0Var;
        this.f7877d = callerContext;
    }
}
