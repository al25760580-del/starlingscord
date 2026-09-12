package ee;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f8169e;

    public g(int i7, c cVar) {
        this.f8168d = i7;
        this.f8169e = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f8168d, ((g) obj).f8168d);
    }
}
