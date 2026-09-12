package vl;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f21729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f21730b;

    public a(double d6, double d7) {
        this.f21729a = d6;
        this.f21730b = d7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Double.compare(this.f21729a, aVar.f21729a) == 0 && Double.compare(this.f21730b, aVar.f21730b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f21730b) + (Double.hashCode(this.f21729a) * 31);
    }

    public final String toString() {
        return "Dimensions(width=" + this.f21729a + ", height=" + this.f21730b + ")";
    }
}
