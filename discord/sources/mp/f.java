package mp;

import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.d0;
import lq.d1;
import lq.l0;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends lq.p implements lq.m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f15975e;

    public f(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f15975e = delegate;
    }

    public static d0 F0(d0 d0Var) {
        d0 d0VarX0 = d0Var.x0(false);
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        return !b1.f(d0Var) ? d0VarX0 : new f(d0VarX0);
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: A0 */
    public final d0 x0(boolean z5) {
        return z5 ? this.f15975e.x0(true) : this;
    }

    @Override // lq.m
    public final d1 B(z replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        d1 d1VarW0 = replacement.w0();
        Intrinsics.checkNotNullParameter(d1VarW0, "<this>");
        if (!b1.f(d1VarW0) && !b1.e(d1VarW0)) {
            return d1VarW0;
        }
        if (d1VarW0 instanceof d0) {
            return F0((d0) d1VarW0);
        }
        if (!(d1VarW0 instanceof lq.s)) {
            throw new rn.n();
        }
        lq.s sVar = (lq.s) d1VarW0;
        return lq.c.G(lq.c.e(F0(sVar.f15248e), F0(sVar.f15249i)), lq.c.f(d1VarW0));
    }

    @Override // lq.d0
    /* JADX INFO: renamed from: B0 */
    public final d0 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new f(this.f15975e.z0(newAttributes));
    }

    @Override // lq.p
    public final d0 C0() {
        return this.f15975e;
    }

    @Override // lq.p
    public final lq.p E0(d0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new f(delegate);
    }

    @Override // lq.m
    public final boolean K() {
        return true;
    }

    @Override // lq.p, lq.z
    public final boolean t0() {
        return false;
    }

    @Override // lq.d0, lq.d1
    public final d1 z0(l0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new f(this.f15975e.z0(newAttributes));
    }
}
