package sh;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f20246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f20250f;

    public z(String str, long j, int i7, boolean z5, boolean z6, byte[] bArr) {
        this.f20245a = str;
        this.f20246b = j;
        this.f20247c = i7;
        this.f20248d = z5;
        this.f20249e = z6;
        this.f20250f = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        String str = zVar.f20245a;
        String str2 = this.f20245a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f20246b == zVar.f20246b && this.f20247c == zVar.f20247c && this.f20248d == zVar.f20248d && this.f20249e == zVar.f20249e && Arrays.equals(this.f20250f, zVar.f20250f);
    }

    public final int hashCode() {
        String str = this.f20245a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i7 = true != this.f20248d ? 1237 : 1231;
        long j = this.f20246b;
        return ((((((((((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.f20247c) * 1000003) ^ i7) * 1000003) ^ (true != this.f20249e ? 1237 : 1231)) * 1000003) ^ Arrays.hashCode(this.f20250f);
    }

    public final String toString() {
        return "ZipEntry{name=" + this.f20245a + ", size=" + this.f20246b + ", compressionMethod=" + this.f20247c + ", isPartial=" + this.f20248d + ", isEndOfArchive=" + this.f20249e + ", headerBytes=" + Arrays.toString(this.f20250f) + "}";
    }
}
