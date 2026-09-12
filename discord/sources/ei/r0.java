package ei;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends e0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final r0 f8352w = new r0(0, new Object[0]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Object[] f8353i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f8354v;

    public r0(int i7, Object[] objArr) {
        this.f8353i = objArr;
        this.f8354v = i7;
    }

    @Override // ei.e0, ei.z
    public final int b(int i7, Object[] objArr) {
        Object[] objArr2 = this.f8353i;
        int i10 = this.f8354v;
        System.arraycopy(objArr2, 0, objArr, i7, i10);
        return i7 + i10;
    }

    @Override // ei.z
    public final Object[] d() {
        return this.f8353i;
    }

    @Override // ei.z
    public final int e() {
        return this.f8354v;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ls.l.e(i7, this.f8354v);
        Object obj = this.f8353i[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ei.z
    public final int h() {
        return 0;
    }

    @Override // ei.z
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8354v;
    }
}
