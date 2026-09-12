package dn;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7691b;

    public b(int i7, boolean z5) {
        this.f7690a = i7;
        this.f7691b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7690a == bVar.f7690a && this.f7691b == bVar.f7691b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7691b) + (Integer.hashCode(this.f7690a) * 31);
    }

    public final String toString() {
        return "CacheKey(fontSize=" + this.f7690a + ", isTitleEmpty=" + this.f7691b + ")";
    }
}
