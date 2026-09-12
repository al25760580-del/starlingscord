package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends s implements m {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(d0 lowerBound, d0 upperBound) {
        super(lowerBound, upperBound);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    @Override // lq.s
    public final d0 A0() {
        return this.f15248e;
    }

    @Override // lq.m
    public final d1 B(z replacement) {
        d1 d1VarE;
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        d1 d1VarW0 = replacement.w0();
        if (d1VarW0 instanceof s) {
            d1VarE = d1VarW0;
        } else {
            if (!(d1VarW0 instanceof d0)) {
                throw new rn.n();
            }
            d0 d0Var = (d0) d1VarW0;
            d1VarE = c.e(d0Var, d0Var.x0(true));
        }
        return c.h(d1VarE, d1VarW0);
    }

    @Override // lq.s
    public final String B0(wp.h renderer, wp.h options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        boolean zN = options.f22428d.n();
        d0 d0Var = this.f15249i;
        d0 d0Var2 = this.f15248e;
        if (!zN) {
            return renderer.E(renderer.X(d0Var2), renderer.X(d0Var), c9.a.o(this));
        }
        return "(" + renderer.X(d0Var2) + ".." + renderer.X(d0Var) + ')';
    }

    @Override // lq.d1
    /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final s y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.getClass();
        d0 type = this.f15248e;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 type2 = this.f15249i;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new t(type, type2);
    }

    @Override // lq.m
    public final boolean K() {
        d0 d0Var = this.f15248e;
        return (d0Var.r0().g() instanceof vo.r0) && Intrinsics.areEqual(d0Var.r0(), this.f15249i.r0());
    }

    @Override // lq.s
    public final String toString() {
        return "(" + this.f15248e + ".." + this.f15249i + ')';
    }

    @Override // lq.d1
    public final d1 x0(boolean z5) {
        return c.e(this.f15248e.x0(z5), this.f15249i.x0(z5));
    }

    @Override // lq.d1
    public final d1 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return c.e(this.f15248e.z0(newAttributes), this.f15249i.z0(newAttributes));
    }
}
