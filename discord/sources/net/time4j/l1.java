package net.time4j;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends xr.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l1 f16663d = new l1("WALL_TIME");
    private static final long serialVersionUID = -3712256393866098916L;

    private Object readResolve() {
        return f16663d;
    }

    @Override // xr.d
    public final Object a() {
        return b1.y(23, 59, 59, 999999999, true);
    }

    @Override // xr.d
    public final Class getType() {
        return b1.class;
    }

    @Override // xr.d
    public final boolean i() {
        return false;
    }

    @Override // xr.a
    public final boolean l() {
        return true;
    }

    @Override // xr.d
    public final Object v() {
        return b1.J;
    }

    @Override // xr.d
    public final boolean w() {
        return true;
    }
}
