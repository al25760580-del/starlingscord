package hj;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends c implements RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final o0 f10891v = new o0(new Object[0], 0, false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f10892e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10893i;

    public o0(Object[] objArr, int i7, boolean z5) {
        super(z5);
        this.f10892e = objArr;
        this.f10893i = i7;
    }

    @Override // hj.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i7 = this.f10893i;
        Object[] objArr = this.f10892e;
        if (i7 == objArr.length) {
            this.f10892e = Arrays.copyOf(objArr, ((i7 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f10892e;
        int i10 = this.f10893i;
        this.f10893i = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 >= this.f10893i) {
            StringBuilder sbS = a3.e.s(i7, "Index:", ", Size:");
            sbS.append(this.f10893i);
            throw new IndexOutOfBoundsException(sbS.toString());
        }
    }

    @Override // hj.s
    public final s g(int i7) {
        if (i7 >= this.f10893i) {
            return new o0(Arrays.copyOf(this.f10892e, i7), this.f10893i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        b(i7);
        return this.f10892e[i7];
    }

    @Override // hj.c, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        b(i7);
        Object[] objArr = this.f10892e;
        Object obj = objArr[i7];
        int i10 = this.f10893i;
        if (i7 < i10 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i10 - i7) - 1);
        }
        this.f10893i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        b(i7);
        Object[] objArr = this.f10892e;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10893i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        a();
        if (i7 >= 0 && i7 <= (i10 = this.f10893i)) {
            Object[] objArr = this.f10892e;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i7, objArr, i7 + 1, i10 - i7);
            } else {
                Object[] objArr2 = new Object[((i10 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i7);
                System.arraycopy(this.f10892e, i7, objArr2, i7 + 1, this.f10893i - i7);
                this.f10892e = objArr2;
            }
            this.f10892e[i7] = obj;
            this.f10893i++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbS = a3.e.s(i7, "Index:", ", Size:");
        sbS.append(this.f10893i);
        throw new IndexOutOfBoundsException(sbS.toString());
    }
}
