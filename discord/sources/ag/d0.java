package ag;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends s {
    public static final Object[] F;
    public static final d0 G;
    public final transient int E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient Object[] f515v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final transient int f516w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient Object[] f517x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final transient int f518y;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new d0(0, 0, 0, objArr, objArr);
    }

    public d0(int i7, int i10, int i11, Object[] objArr, Object[] objArr2) {
        this.f515v = objArr;
        this.f516w = i7;
        this.f517x = objArr2;
        this.f518y = i10;
        this.E = i11;
    }

    @Override // ag.l
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f515v;
        int i7 = this.E;
        System.arraycopy(objArr2, 0, objArr, 0, i7);
        return i7;
    }

    @Override // ag.l
    public final int b() {
        return this.E;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f517x;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i7 = iRotateLeft & this.f518y;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i7 + 1;
        }
    }

    @Override // ag.l
    public final int d() {
        return 0;
    }

    @Override // ag.l
    public final i0 e() {
        return k().listIterator(0);
    }

    @Override // ag.l
    public final Object[] h() {
        return this.f515v;
    }

    @Override // ag.s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f516w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return k().listIterator(0);
    }

    @Override // ag.s
    public final q m() {
        return q.k(this.E, this.f515v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E;
    }
}
