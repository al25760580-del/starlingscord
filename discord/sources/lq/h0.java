package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f15211a;

    public h0(so.i kotlinBuiltIns) {
        Intrinsics.checkNotNullParameter(kotlinBuiltIns, "kotlinBuiltIns");
        d0 d0VarP = kotlinBuiltIns.p();
        Intrinsics.checkNotNullExpressionValue(d0VarP, "getNullableAnyType(...)");
        this.f15211a = d0VarP;
    }

    @Override // lq.t0
    public final e1 a() {
        return e1.OUT_VARIANCE;
    }

    @Override // lq.t0
    public final z b() {
        return this.f15211a;
    }

    @Override // lq.t0
    public final boolean c() {
        return true;
    }

    @Override // lq.t0
    public final t0 d(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
