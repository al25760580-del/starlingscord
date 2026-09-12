package im;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f11885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f11886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f11887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11888e;

    public e(float f2, float f7, float f10, float f11, int i7) {
        this.f11884a = i7;
        this.f11885b = f2;
        this.f11886c = f7;
        this.f11887d = f10;
        this.f11888e = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f11884a == eVar.f11884a && Float.compare(this.f11885b, eVar.f11885b) == 0 && Float.compare(this.f11886c, eVar.f11886c) == 0 && Float.compare(this.f11887d, eVar.f11887d) == 0 && Float.compare(this.f11888e, eVar.f11888e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f11888e) + a3.e.a(a3.e.a(a3.e.a(Integer.hashCode(this.f11884a) * 31, 31, this.f11885b), 31, this.f11886c), 31, this.f11887d);
    }

    public final String toString() {
        return "PointerData(pointerId=" + this.f11884a + ", x=" + this.f11885b + ", y=" + this.f11886c + ", absoluteX=" + this.f11887d + ", absoluteY=" + this.f11888e + ")";
    }
}
