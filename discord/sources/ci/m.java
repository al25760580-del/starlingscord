package ci;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object[] f3713x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final m f3714y;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object[] f3715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient Object[] f3716w;

    static {
        Object[] objArr = new Object[0];
        f3713x = objArr;
        f3714y = new m(objArr, objArr);
    }

    public m(Object[] objArr, Object[] objArr2) {
        this.f3715v = objArr;
        this.f3716w = objArr2;
    }

    @Override // ci.g
    public final int a(Object[] objArr) {
        System.arraycopy(this.f3715v, 0, objArr, 0, 0);
        return 0;
    }

    @Override // ci.g
    public final int b() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f3716w.length;
        return false;
    }

    @Override // ci.g
    public final int d() {
        return 0;
    }

    @Override // ci.g
    public final Object[] e() {
        return this.f3715v;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        l lVar = this.f3710e;
        if (lVar == null) {
            h hVar = j.f3708e;
            lVar = l.f3711v;
            this.f3710e = lVar;
        }
        return lVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }
}
