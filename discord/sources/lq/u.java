package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends s implements c1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final s f15252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f15253w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s origin, z enhancement) {
        super(origin.f15248e, origin.f15249i);
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(enhancement, "enhancement");
        this.f15252v = origin;
        this.f15253w = enhancement;
    }

    @Override // lq.s
    public final d0 A0() {
        return this.f15252v.A0();
    }

    @Override // lq.s
    public final String B0(wp.h renderer, wp.h options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        wp.k kVar = options.f22428d;
        return ((Boolean) kVar.f22447m.getValue(kVar, wp.k.Y[11])).booleanValue() ? renderer.X(this.f15253w) : this.f15252v.B0(renderer, options);
    }

    @Override // lq.c1
    public final d1 e0() {
        return this.f15252v;
    }

    @Override // lq.c1
    public final z i() {
        return this.f15253w;
    }

    @Override // lq.s
    public final String toString() {
        return "[@EnhancedForWarnings(" + this.f15253w + ")] " + this.f15252v;
    }

    @Override // lq.z
    /* JADX INFO: renamed from: v0 */
    public final z y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.getClass();
        s type = this.f15252v;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        z type2 = this.f15253w;
        Intrinsics.checkNotNullParameter(type2, "type");
        return new u(type, type2);
    }

    @Override // lq.d1
    public final d1 x0(boolean z5) {
        return c.G(this.f15252v.x0(z5), this.f15253w.w0().x0(z5));
    }

    @Override // lq.d1
    public final d1 y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.getClass();
        s type = this.f15252v;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        z type2 = this.f15253w;
        Intrinsics.checkNotNullParameter(type2, "type");
        return new u(type, type2);
    }

    @Override // lq.d1
    public final d1 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return c.G(this.f15252v.z0(newAttributes), this.f15253w);
    }
}
