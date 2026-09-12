package gc;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p1 f9818b = new p1(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9819a;

    public p1(boolean z5) {
        this.f9819a = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && p1.class == obj.getClass() && this.f9819a == ((p1) obj).f9819a;
    }

    public final int hashCode() {
        return !this.f9819a ? 1 : 0;
    }
}
