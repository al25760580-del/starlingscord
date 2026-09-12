package ag;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends q {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c0 f510w = new c0(0, new Object[0]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Object[] f511i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f512v;

    public c0(int i7, Object[] objArr) {
        this.f511i = objArr;
        this.f512v = i7;
    }

    @Override // ag.q, ag.l
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f511i;
        int i7 = this.f512v;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // ag.l
    public final int b() {
        return this.f512v;
    }

    @Override // ag.l
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        c.e(i7, this.f512v);
        Object obj = this.f511i[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // ag.l
    public final Object[] h() {
        return this.f511i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f512v;
    }
}
