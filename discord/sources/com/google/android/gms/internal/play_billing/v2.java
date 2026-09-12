package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class v2 extends p1 implements RandomAccess {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object[] f6158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v2 f6159w;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f6160e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6161i;

    static {
        Object[] objArr = new Object[0];
        f6158v = objArr;
        f6159w = new v2(objArr, 0, false);
    }

    public v2(Object[] objArr, int i7, boolean z5) {
        super(z5);
        this.f6160e = objArr;
        this.f6161i = i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i10;
        a();
        if (i7 < 0 || i7 > (i10 = this.f6161i)) {
            throw new IndexOutOfBoundsException(a3.e.g(i7, this.f6161i, "Index:", ", Size:"));
        }
        int i11 = i7 + 1;
        Object[] objArr = this.f6160e;
        int length = objArr.length;
        if (i10 < length) {
            System.arraycopy(objArr, i7, objArr, i11, i10 - i7);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f6160e, 0, objArr2, 0, i7);
            System.arraycopy(this.f6160e, i7, objArr2, i11, this.f6161i - i7);
            this.f6160e = objArr2;
        }
        this.f6160e[i7] = obj;
        this.f6161i++;
        ((AbstractList) this).modCount++;
    }

    public final void b(int i7) {
        if (i7 < 0 || i7 >= this.f6161i) {
            throw new IndexOutOfBoundsException(a3.e.g(i7, this.f6161i, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.p1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i7 = this.f6161i;
        if (i7 != list.size()) {
            return false;
        }
        if (!(obj instanceof v2)) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (!this.f6160e[i10].equals(list.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        v2 v2Var = (v2) obj;
        for (int i11 = 0; i11 < i7; i11++) {
            if (!this.f6160e[i11].equals(v2Var.f6160e[i11])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        b(i7);
        return this.f6160e[i7];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i7 = this.f6161i;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i7; i10++) {
            iHashCode = (iHashCode * 31) + this.f6160e[i10].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.h2
    public final /* bridge */ /* synthetic */ h2 l(int i7) {
        if (i7 >= this.f6161i) {
            return new v2(i7 == 0 ? f6158v : Arrays.copyOf(this.f6160e, i7), this.f6161i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.play_billing.p1, java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        a();
        b(i7);
        Object[] objArr = this.f6160e;
        Object obj = objArr[i7];
        int i10 = this.f6161i;
        if (i7 < i10 - 1) {
            System.arraycopy(objArr, i7 + 1, objArr, i7, (i10 - i7) - 1);
        }
        this.f6161i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        a();
        b(i7);
        Object[] objArr = this.f6160e;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6161i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i7 = this.f6161i;
        int length = this.f6160e.length;
        if (i7 == length) {
            this.f6160e = Arrays.copyOf(this.f6160e, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f6160e;
        int i10 = this.f6161i;
        this.f6161i = i10 + 1;
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
