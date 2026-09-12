package mi;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f15818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15819b;

    public h(q qVar, boolean z5) {
        this.f15818a = qVar;
        this.f15819b = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f15818a.equals(this.f15818a) && hVar.f15819b == this.f15819b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f15818a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f15819b).hashCode();
    }
}
