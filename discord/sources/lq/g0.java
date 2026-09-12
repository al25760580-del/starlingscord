package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends p implements c1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f15207e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z f15208i;

    public g0(d0 delegate, z enhancement) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f15207e = delegate;
        this.f15208i = enhancement;
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        d1 d1VarG = c.G(this.f15207e.x0(z5), this.f15208i.w0().x0(z5));
        Intrinsics.checkNotNull(d1VarG, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (d0) d1VarG;
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        d1 d1VarG = c.G(this.f15207e.z0(newAttributes), this.f15208i);
        Intrinsics.checkNotNull(d1VarG, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (d0) d1VarG;
    }

    @Override // lq.p
    public final d0 C0() {
        return this.f15207e;
    }

    @Override // lq.p
    public final p E0(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new g0(delegate, this.f15208i);
    }

    @Override // lq.p, lq.d1
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final g0 y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.getClass();
        d0 type = this.f15207e;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        z type2 = this.f15208i;
        Intrinsics.checkNotNullParameter(type2, "type");
        return new g0(type, type2);
    }

    @Override // lq.c1
    public final d1 e0() {
        return this.f15207e;
    }

    @Override // lq.c1
    public final z i() {
        return this.f15208i;
    }

    @Override // lq.d0
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f15208i + ")] " + this.f15207e;
    }
}
