package jn;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13986c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f13984a == cVar.f13984a && this.f13985b == cVar.f13985b && this.f13986c == cVar.f13986c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f13984a * 31) + this.f13985b) * 31) + this.f13986c;
    }
}
