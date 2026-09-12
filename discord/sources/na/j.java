package na;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f16536d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16539c;

    static {
        j jVar = new j();
        jVar.f16537a = Integer.MAX_VALUE;
        jVar.f16538b = true;
        jVar.f16539c = true;
        f16536d = jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f16537a == jVar.f16537a && this.f16538b == jVar.f16538b && this.f16539c == jVar.f16539c;
    }

    public final int hashCode() {
        return (this.f16537a ^ (this.f16538b ? 4194304 : 0)) ^ (this.f16539c ? 8388608 : 0);
    }
}
