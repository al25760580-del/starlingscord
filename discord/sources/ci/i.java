package ci;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f3705i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f3706v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f3707w;

    public i(j jVar, int i7, int i10) {
        this.f3707w = jVar;
        this.f3705i = i7;
        this.f3706v = i10;
    }

    @Override // ci.g
    public final int b() {
        return this.f3707w.d() + this.f3705i + this.f3706v;
    }

    @Override // ci.g
    public final int d() {
        return this.f3707w.d() + this.f3705i;
    }

    @Override // ci.g
    public final Object[] e() {
        return this.f3707w.e();
    }

    @Override // java.util.List
    public final Object get(int i7) {
        gn.h.g(i7, this.f3706v);
        return this.f3707w.get(i7 + this.f3705i);
    }

    @Override // ci.j, java.util.List
    /* JADX INFO: renamed from: h */
    public final j subList(int i7, int i10) {
        gn.h.i(i7, i10, this.f3706v);
        int i11 = this.f3705i;
        return this.f3707w.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3706v;
    }
}
