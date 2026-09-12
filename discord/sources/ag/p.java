package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f562i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f564w;

    public p(q qVar, int i7, int i10) {
        this.f564w = qVar;
        this.f562i = i7;
        this.f563v = i10;
    }

    @Override // ag.l
    public final int b() {
        return this.f564w.d() + this.f562i + this.f563v;
    }

    @Override // ag.l
    public final int d() {
        return this.f564w.d() + this.f562i;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        c.e(i7, this.f563v);
        return this.f564w.get(i7 + this.f562i);
    }

    @Override // ag.l
    public final Object[] h() {
        return this.f564w.h();
    }

    @Override // ag.q, java.util.List
    /* JADX INFO: renamed from: j */
    public final q subList(int i7, int i10) {
        c.m(i7, i10, this.f563v);
        int i11 = this.f562i;
        return this.f564w.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f563v;
    }
}
