package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qf.x f524d;

    public g(qf.x xVar) {
        this.f524d = xVar;
    }

    @Override // ag.f
    public final Object a() {
        return this.f524d;
    }

    @Override // ag.f
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f524d.equals(((g) obj).f524d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f524d.hashCode() + 1502476572;
    }

    public final String toString() {
        return s0.g.e("Optional.of(", this.f524d.toString(), ")");
    }
}
