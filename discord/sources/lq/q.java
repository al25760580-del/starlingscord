package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f15244e;

    public q(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f15244e = delegate;
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        return z5 == t0() ? this : this.f15244e.x0(z5).z0(q0());
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return newAttributes != q0() ? new f0(this, newAttributes) : this;
    }

    @Override // lq.p
    public final d0 C0() {
        return this.f15244e;
    }
}
