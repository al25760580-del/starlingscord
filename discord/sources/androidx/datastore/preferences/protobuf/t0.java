package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends b implements RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t0 f1933v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f1934e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1935i;

    static {
        t0 t0Var = new t0(0, new Object[0]);
        f1933v = t0Var;
        t0Var.f1821d = false;
    }

    public t0(int i7, Object[] objArr) {
        this.f1934e = objArr;
        this.f1935i = i7;
    }

    @Override // androidx.datastore.preferences.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i7 = this.f1935i;
        Object[] objArr = this.f1934e;
        if (i7 == objArr.length) {
            this.f1934e = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1934e;
        int i10 = this.f1935i;
        this.f1935i = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 >= this.f1935i) {
            StringBuilder sbS = a3.e.s(i7, "Index:", ", Size:");
            sbS.append(this.f1935i);
            throw new IndexOutOfBoundsException(sbS.toString());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t
    public final t g(int i7) {
        if (i7 < this.f1935i) {
            throw new IllegalArgumentException();
        }
        return new t0(this.f1935i, Arrays.copyOf(this.f1934e, i7));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        b(i7);
        return this.f1934e[i7];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        b(i7);
        Object[] objArr = this.f1934e;
        Object obj = objArr[i7];
        int i10 = this.f1935i;
        if (i7 < i10 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i10 - i7) - 1);
        }
        this.f1935i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        b(i7);
        Object[] objArr = this.f1934e;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1935i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        a();
        if (i7 >= 0 && i7 <= (i10 = this.f1935i)) {
            Object[] objArr = this.f1934e;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i10 - i7);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f1934e, i7, objArr2, i7 + 1, this.f1935i - i7);
                this.f1934e = objArr2;
            }
            this.f1934e[i7] = obj;
            this.f1935i++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbS = a3.e.s(i7, "Index:", ", Size:");
        sbS.append(this.f1935i);
        throw new IndexOutOfBoundsException(sbS.toString());
    }
}
