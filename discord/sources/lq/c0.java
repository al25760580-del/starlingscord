package lq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15182i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i7) {
        super(d0Var);
        this.f15182i = i7;
    }

    @Override // lq.p
    public final p E0(d0 delegate) {
        switch (this.f15182i) {
            case 0:
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return new c0(delegate, 0);
            default:
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                Intrinsics.checkNotNullParameter(delegate, "delegate");
                return new c0(delegate, 1);
        }
    }

    @Override // lq.p, lq.z
    public final boolean t0() {
        switch (this.f15182i) {
            case 0:
                return false;
            default:
                return true;
        }
    }
}
