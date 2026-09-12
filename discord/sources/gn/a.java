package gn;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10131d;

    public a(float f2, float f7, float f10, float f11) {
        this.f10128a = f2;
        this.f10129b = f7;
        this.f10130c = f10;
        this.f10131d = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f10128a, aVar.f10128a) == 0 && Float.compare(this.f10129b, aVar.f10129b) == 0 && Float.compare(this.f10130c, aVar.f10130c) == 0 && Float.compare(this.f10131d, aVar.f10131d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f10131d) + a3.e.a(a3.e.a(Float.hashCode(this.f10128a) * 31, 31, this.f10129b), 31, this.f10130c);
    }

    public final String toString() {
        return "EdgeInsets(top=" + this.f10128a + ", right=" + this.f10129b + ", bottom=" + this.f10130c + ", left=" + this.f10131d + ")";
    }
}
