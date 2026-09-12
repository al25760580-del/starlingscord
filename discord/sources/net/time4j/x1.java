package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class x1 extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w1 f16789d = new w1();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x1 f16790e = new x1("YEAR_OF_WEEKDATE");
    private static final long serialVersionUID = -6907291758376370420L;

    public static int m(int i7) {
        p1 p1VarD = p1.d(xr.m.r(i7, 1, 1));
        v1 v1Var = v1.G;
        int iB = p1VarD.b(v1Var);
        return iB <= 8 - v1Var.f16773e ? 2 - iB : 9 - iB;
    }

    private Object readResolve() {
        return f16790e;
    }

    @Override // xr.d
    public final Object a() {
        return x0.f16785y;
    }

    @Override // xr.d
    public final Class getType() {
        return Integer.class;
    }

    @Override // xr.d
    public final boolean i() {
        return true;
    }

    @Override // xr.a
    public final boolean l() {
        return true;
    }

    @Override // xr.d
    public final Object v() {
        return x0.f16784x;
    }

    @Override // xr.d
    public final boolean w() {
        return false;
    }
}
