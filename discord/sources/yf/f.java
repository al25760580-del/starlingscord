package yf;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f23324w = new f(0, new Object[0]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Object[] f23325i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f23326v;

    public f(int i7, Object[] objArr) {
        this.f23325i = objArr;
        this.f23326v = i7;
    }

    @Override // yf.a
    public final Object[] a() {
        return this.f23325i;
    }

    @Override // yf.a
    public final int b() {
        return 0;
    }

    @Override // yf.a
    public final int d() {
        return this.f23326v;
    }

    @Override // yf.e, yf.a
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f23325i;
        int i7 = this.f23326v;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        android.support.v4.media.session.b.z(i7, this.f23326v);
        Object obj = this.f23325i[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23326v;
    }
}
