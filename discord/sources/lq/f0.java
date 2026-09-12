package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l0 f15204i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(d0 delegate, l0 attributes) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f15204i = attributes;
    }

    @Override // lq.p
    public final p E0(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new f0(delegate, this.f15204i);
    }

    @Override // lq.p, lq.z
    public final l0 q0() {
        return this.f15204i;
    }
}
