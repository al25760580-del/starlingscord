package vp;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21883b;

    public f(int i7, Object obj) {
        this.f21882a = obj;
        this.f21883b = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f21882a == fVar.f21882a && this.f21883b == fVar.f21883b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f21882a) * 65535) + this.f21883b;
    }
}
