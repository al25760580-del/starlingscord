package i0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends g0.t implements g0.p {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f11283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11284y;

    public static void A(f0 f0Var) {
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        f0 f0Var2 = f0Var.F;
        u uVar = f0Var.E;
        if (Intrinsics.areEqual(f0Var2 != null ? f0Var2.E : null, uVar)) {
            uVar.f11326m.f11348i.getClass();
        } else {
            uVar.f11326m.f11348i.H.d();
        }
    }

    public abstract void B();

    public abstract int s(g0.f fVar);

    public final int t(g0.f alignmentLine) {
        int iS;
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (!v() || (iS = s(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        long j = this.f9455w;
        int i7 = m0.d.f15346b;
        return iS + ((int) (j & 4294967295L));
    }

    public abstract a0 u();

    public abstract boolean v();

    public abstract u w();

    public abstract g0.o x();

    public abstract a0 y();

    public abstract long z();
}
