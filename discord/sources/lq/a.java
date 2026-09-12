package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f15169e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f15170i;

    public a(d0 delegate, d0 abbreviation) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(abbreviation, "abbreviation");
        this.f15169e = delegate;
        this.f15170i = abbreviation;
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new a(this.f15169e.z0(newAttributes), this.f15170i);
    }

    @Override // lq.p
    public final d0 C0() {
        return this.f15169e;
    }

    @Override // lq.p
    public final p E0(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new a(delegate, this.f15170i);
    }

    @Override // lq.d0, lq.d1
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    public final a x0(boolean z5) {
        return new a(this.f15169e.x0(z5), this.f15170i.x0(z5));
    }

    @Override // lq.p, lq.d1
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final a y0(mq.f kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.getClass();
        d0 type = this.f15169e;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 type2 = this.f15170i;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNull(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new a(type, type2);
    }
}
