package i9;

import f0.e;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11402a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11403b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float[] f11404c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11405d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f11406e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11407f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f11408g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11409h = false;

    public final void a(float f2, float f7, float f10, float f11) {
        if (this.f11404c == null) {
            this.f11404c = new float[8];
        }
        float[] fArr = this.f11404c;
        fArr[1] = f2;
        fArr[0] = f2;
        fArr[3] = f7;
        fArr[2] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[7] = f11;
        fArr[6] = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11403b == bVar.f11403b && this.f11405d == bVar.f11405d && Float.compare(bVar.f11406e, this.f11406e) == 0 && this.f11407f == bVar.f11407f && Float.compare(bVar.f11408g, this.f11408g) == 0 && this.f11402a == bVar.f11402a && this.f11409h == bVar.f11409h) {
            return Arrays.equals(this.f11404c, bVar.f11404c);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f11402a;
        int iB = (((i7 != 0 ? e.b(i7) : 0) * 31) + (this.f11403b ? 1 : 0)) * 31;
        float[] fArr = this.f11404c;
        int iHashCode = (((iB + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f11405d) * 31;
        float f2 = this.f11406e;
        int iFloatToIntBits = (((iHashCode + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f11407f) * 31;
        float f7 = this.f11408g;
        return ((iFloatToIntBits + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 961) + (this.f11409h ? 1 : 0);
    }
}
