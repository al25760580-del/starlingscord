package yf;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f23320i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f23321v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f23322w;

    public d(e eVar, int i7, int i10) {
        this.f23322w = eVar;
        this.f23320i = i7;
        this.f23321v = i10;
    }

    @Override // yf.a
    public final Object[] a() {
        return this.f23322w.a();
    }

    @Override // yf.a
    public final int b() {
        return this.f23322w.b() + this.f23320i;
    }

    @Override // yf.a
    public final int d() {
        return this.f23322w.b() + this.f23320i + this.f23321v;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        android.support.v4.media.session.b.z(i7, this.f23321v);
        return this.f23322w.get(i7 + this.f23320i);
    }

    @Override // yf.e, java.util.List
    /* JADX INFO: renamed from: i */
    public final e subList(int i7, int i10) {
        android.support.v4.media.session.b.B(i7, i10, this.f23321v);
        int i11 = this.f23320i;
        return this.f23322w.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23321v;
    }
}
