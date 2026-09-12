package ci;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f3711v = new l(new Object[0]);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient Object[] f3712i;

    public l(Object[] objArr) {
        this.f3712i = objArr;
    }

    @Override // ci.j, ci.g
    public final int a(Object[] objArr) {
        System.arraycopy(this.f3712i, 0, objArr, 0, 0);
        return 0;
    }

    @Override // ci.g
    public final int b() {
        return 0;
    }

    @Override // ci.g
    public final int d() {
        return 0;
    }

    @Override // ci.g
    public final Object[] e() {
        return this.f3712i;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        gn.h.g(i7, 0);
        Object obj = this.f3712i[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
