package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class e2 extends p1 implements RandomAccess, g2 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f5998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e2 f5999w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f6000e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6001i;

    static {
        int[] iArr = new int[0];
        f5998v = iArr;
        f5999w = new e2(iArr, 0, false);
    }

    public e2(int[] iArr, int i7, boolean z5) {
        super(z5);
        this.f6000e = iArr;
        this.f6001i = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i7 < 0 || i7 > (i10 = this.f6001i)) {
            throw new IndexOutOfBoundsException(a3.e.g(i7, this.f6001i, "Index:", ", Size:"));
        }
        int i11 = i7 + 1;
        int[] iArr = this.f6000e;
        int length = iArr.length;
        if (i10 < length) {
            System.arraycopy(iArr, i7, iArr, i11, i10 - i7);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6000e, 0, iArr2, 0, i7);
            System.arraycopy(this.f6000e, i7, iArr2, i11, this.f6001i - i7);
            this.f6000e = iArr2;
        }
        this.f6000e[i7] = iIntValue;
        this.f6001i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.p1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof e2)) {
            return super.addAll(collection);
        }
        e2 e2Var = (e2) collection;
        int i7 = e2Var.f6001i;
        if (i7 == 0) {
            return false;
        }
        int i10 = this.f6001i;
        if (Integer.MAX_VALUE - i10 < i7) {
            throw new OutOfMemoryError();
        }
        int i11 = i10 + i7;
        int[] iArr = this.f6000e;
        if (i11 > iArr.length) {
            this.f6000e = Arrays.copyOf(iArr, i11);
        }
        System.arraycopy(e2Var.f6000e, 0, this.f6000e, this.f6001i, e2Var.f6001i);
        this.f6001i = i11;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int b(int i7) {
        h(i7);
        return this.f6000e[i7];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.h2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final e2 l(int i7) {
        if (i7 >= this.f6001i) {
            return new e2(i7 == 0 ? f5998v : Arrays.copyOf(this.f6000e, i7), this.f6001i, true);
        }
        throw new IllegalArgumentException();
    }

    public final void e(int i7) {
        a();
        int i10 = this.f6001i;
        int length = this.f6000e.length;
        if (i10 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6000e, 0, iArr, 0, this.f6001i);
            this.f6000e = iArr;
        }
        int[] iArr2 = this.f6000e;
        int i11 = this.f6001i;
        this.f6001i = i11 + 1;
        iArr2[i11] = i7;
    }

    @Override // com.google.android.gms.internal.play_billing.p1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return super.equals(obj);
        }
        e2 e2Var = (e2) obj;
        if (this.f6001i != e2Var.f6001i) {
            return false;
        }
        int[] iArr = e2Var.f6000e;
        for (int i7 = 0; i7 < this.f6001i; i7++) {
            if (this.f6000e[i7] != iArr[i7]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i7) {
        h(i7);
        return Integer.valueOf(this.f6000e[i7]);
    }

    public final void h(int i7) {
        if (i7 < 0 || i7 >= this.f6001i) {
            throw new IndexOutOfBoundsException(a3.e.g(i7, this.f6001i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = 1;
        for (int i10 = 0; i10 < this.f6001i; i10++) {
            i7 = (i7 * 31) + this.f6000e[i10];
        }
        return i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i7 = this.f6001i;
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.f6000e[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.p1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i7) {
        a();
        h(i7);
        int[] iArr = this.f6000e;
        int i10 = iArr[i7];
        int i11 = this.f6001i;
        if (i7 < i11 - 1) {
            System.arraycopy(iArr, i7 + 1, iArr, i7, (i11 - i7) - 1);
        }
        this.f6001i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        a();
        if (i10 < i7) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6000e;
        System.arraycopy(iArr, i10, iArr, i7, this.f6001i - i10);
        this.f6001i -= i10 - i7;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i7, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        h(i7);
        int[] iArr = this.f6000e;
        int i10 = iArr[i7];
        iArr[i7] = iIntValue;
        return Integer.valueOf(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6001i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
