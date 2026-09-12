package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends p implements m, pq.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f15230e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15231i;

    public o(d0 d0Var, boolean z5) {
        this.f15230e = d0Var;
        this.f15231i = z5;
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        return z5 ? this.f15230e.x0(z5) : this;
    }

    @Override // lq.m
    public final d1 B(z replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        return c.m(replacement.w0(), this.f15231i);
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new o(this.f15230e.z0(newAttributes), this.f15231i);
    }

    @Override // lq.p
    public final d0 C0() {
        return this.f15230e;
    }

    @Override // lq.p
    public final p E0(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new o(delegate, this.f15231i);
    }

    @Override // lq.m
    public final boolean K() {
        d0 d0Var = this.f15230e;
        d0Var.r0();
        return d0Var.r0().g() instanceof vo.r0;
    }

    @Override // lq.p, lq.z
    public final boolean t0() {
        return false;
    }

    @Override // lq.d0
    public final String toString() {
        return this.f15230e + " & Any";
    }
}
