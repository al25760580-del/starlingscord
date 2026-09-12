package d0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7576b;

    public r(float f2, float f7) {
        this.f7575a = f2;
        this.f7576b = f7;
    }

    public final float[] a() {
        float f2 = this.f7575a;
        float f7 = this.f7576b;
        return new float[]{f2 / f7, 1.0f, ((1.0f - f2) - f7) / f7};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Float.compare(this.f7575a, rVar.f7575a) == 0 && Float.compare(this.f7576b, rVar.f7576b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7576b) + (Float.hashCode(this.f7575a) * 31);
    }

    public final String toString() {
        return "WhitePoint(x=" + this.f7575a + ", y=" + this.f7576b + ')';
    }
}
