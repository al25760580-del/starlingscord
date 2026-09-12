package ym;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23396e = new a(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f23397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f23398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f23399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f23400d;

    public a(float f2, float f7, float f10, float f11) {
        this.f23397a = f2;
        this.f23398b = f7;
        this.f23399c = f10;
        this.f23400d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f23397a, aVar.f23397a) == 0 && Float.compare(this.f23398b, aVar.f23398b) == 0 && Float.compare(this.f23399c, aVar.f23399c) == 0 && Float.compare(this.f23400d, aVar.f23400d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23400d) + a3.e.a(a3.e.a(Float.hashCode(this.f23397a) * 31, 31, this.f23398b), 31, this.f23399c);
    }

    public final String toString() {
        return "EdgeInsets(left=" + this.f23397a + ", top=" + this.f23398b + ", right=" + this.f23399c + ", bottom=" + this.f23400d + ")";
    }
}
