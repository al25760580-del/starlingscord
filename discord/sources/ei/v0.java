package ei;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Object[] f8372i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f8373v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int f8374w;

    public v0(Object[] objArr, int i7, int i10) {
        this.f8372i = objArr;
        this.f8373v = i7;
        this.f8374w = i10;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ls.l.e(i7, this.f8374w);
        Object obj = this.f8372i[(i7 * 2) + this.f8373v];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ei.z
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8374w;
    }
}
