package gn;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10137d;

    public c(float f2, float f7, float f10, float f11) {
        this.f10134a = f2;
        this.f10135b = f7;
        this.f10136c = f10;
        this.f10137d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f10134a, cVar.f10134a) == 0 && Float.compare(this.f10135b, cVar.f10135b) == 0 && Float.compare(this.f10136c, cVar.f10136c) == 0 && Float.compare(this.f10137d, cVar.f10137d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10137d) + a3.e.a(a3.e.a(Float.hashCode(this.f10134a) * 31, 31, this.f10135b), 31, this.f10136c);
    }

    public final String toString() {
        return "Rect(x=" + this.f10134a + ", y=" + this.f10135b + ", width=" + this.f10136c + ", height=" + this.f10137d + ")";
    }
}
