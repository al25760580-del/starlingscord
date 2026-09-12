package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ArrayDeque extends n {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public static final s f14617v = new s(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object[] f14618w = new Object[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object[] f14620e = f14618w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14621i;

    @Override // kotlin.collections.n
    public final int a() {
        return this.f14621i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        m();
        e(elements.size() + a());
        d(k(a() + this.f14619d), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        m();
        e(this.f14621i + 1);
        int length = this.f14619d;
        if (length == 0) {
            Object[] objArr = this.f14620e;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length;
        }
        int i7 = length - 1;
        this.f14619d = i7;
        this.f14620e[i7] = obj;
        this.f14621i++;
    }

    public final void addLast(Object obj) {
        m();
        e(a() + 1);
        this.f14620e[k(a() + this.f14619d)] = obj;
        this.f14621i = a() + 1;
    }

    @Override // kotlin.collections.n
    public final Object b(int i7) {
        d dVar = h.f14644d;
        int i10 = this.f14621i;
        dVar.getClass();
        d.b(i7, i10);
        if (i7 == d0.f(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        m();
        int iK = k(this.f14619d + i7);
        Object[] objArr = this.f14620e;
        Object obj = objArr[iK];
        if (i7 < (this.f14621i >> 1)) {
            int i11 = this.f14619d;
            if (iK >= i11) {
                w.d(i11 + 1, i11, iK, objArr, objArr);
            } else {
                w.d(1, 0, iK, objArr, objArr);
                Object[] objArr2 = this.f14620e;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i12 = this.f14619d;
                w.d(i12 + 1, i12, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f14620e;
            int i13 = this.f14619d;
            objArr3[i13] = null;
            this.f14619d = h(i13);
        } else {
            int iK2 = k(d0.f(this) + this.f14619d);
            if (iK <= iK2) {
                Object[] objArr4 = this.f14620e;
                w.d(iK, iK + 1, iK2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f14620e;
                w.d(iK, iK + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f14620e;
                objArr6[objArr6.length - 1] = objArr6[0];
                w.d(0, 1, iK2 + 1, objArr6, objArr6);
            }
            this.f14620e[iK2] = null;
        }
        this.f14621i--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            j(this.f14619d, k(a() + this.f14619d));
        }
        this.f14619d = 0;
        this.f14621i = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f14620e.length;
        while (i7 < length && it.hasNext()) {
            this.f14620e[i7] = it.next();
            i7++;
        }
        int i10 = this.f14619d;
        for (int i11 = 0; i11 < i10 && it.hasNext(); i11++) {
            this.f14620e[i11] = it.next();
        }
        this.f14621i = collection.size() + this.f14621i;
    }

    public final void e(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f14620e;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f14618w) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f14620e = new Object[i7];
            return;
        }
        d dVar = h.f14644d;
        int length = objArr.length;
        dVar.getClass();
        Object[] objArr2 = new Object[d.e(length, i7)];
        Object[] objArr3 = this.f14620e;
        w.d(0, this.f14619d, objArr3.length, objArr3, objArr2);
        Object[] objArr4 = this.f14620e;
        int length2 = objArr4.length;
        int i10 = this.f14619d;
        w.d(length2 - i10, 0, i10, objArr4, objArr2);
        this.f14619d = 0;
        this.f14620e = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        d dVar = h.f14644d;
        int i10 = this.f14621i;
        dVar.getClass();
        d.b(i7, i10);
        return this.f14620e[k(this.f14619d + i7)];
    }

    public final int h(int i7) {
        Object[] objArr = this.f14620e;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (i7 == objArr.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    public final int i(int i7) {
        return i7 < 0 ? i7 + this.f14620e.length : i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int iK = k(a() + this.f14619d);
        int length = this.f14619d;
        if (length < iK) {
            while (length < iK) {
                if (Intrinsics.areEqual(obj, this.f14620e[length])) {
                    i7 = this.f14619d;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iK) {
            return -1;
        }
        int length2 = this.f14620e.length;
        while (length < length2) {
            if (Intrinsics.areEqual(obj, this.f14620e[length])) {
                i7 = this.f14619d;
            } else {
                length++;
            }
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (Intrinsics.areEqual(obj, this.f14620e[i10])) {
                length = i10 + this.f14620e.length;
                i7 = this.f14619d;
            }
        }
        return -1;
        return length - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final void j(int i7, int i10) {
        if (i7 < i10) {
            w.k(this.f14620e, null, i7, i10);
            return;
        }
        Object[] objArr = this.f14620e;
        w.k(objArr, null, i7, objArr.length);
        w.k(this.f14620e, null, 0, i10);
    }

    public final int k(int i7) {
        Object[] objArr = this.f14620e;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int iK = k(this.f14621i + this.f14619d);
        int i10 = this.f14619d;
        if (i10 < iK) {
            length = iK - 1;
            if (i10 <= length) {
                while (!Intrinsics.areEqual(obj, this.f14620e[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i7 = this.f14619d;
                return length - i7;
            }
            return -1;
        }
        if (i10 > iK) {
            for (int i11 = iK - 1; -1 < i11; i11--) {
                if (Intrinsics.areEqual(obj, this.f14620e[i11])) {
                    length = i11 + this.f14620e.length;
                    i7 = this.f14619d;
                    return length - i7;
                }
            }
            Object[] objArr = this.f14620e;
            Intrinsics.checkNotNullParameter(objArr, "<this>");
            length = objArr.length - 1;
            int i12 = this.f14619d;
            if (i12 <= length) {
                while (!Intrinsics.areEqual(obj, this.f14620e[length])) {
                    if (length != i12) {
                        length--;
                    }
                }
                i7 = this.f14619d;
                return length - i7;
            }
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int iK;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f14620e.length != 0) {
            int iK2 = k(a() + this.f14619d);
            int i7 = this.f14619d;
            if (i7 < iK2) {
                iK = i7;
                while (i7 < iK2) {
                    Object obj = this.f14620e[i7];
                    if (elements.contains(obj)) {
                        z5 = true;
                    } else {
                        this.f14620e[iK] = obj;
                        iK++;
                    }
                    i7++;
                }
                w.k(this.f14620e, null, iK, iK2);
            } else {
                int length = this.f14620e.length;
                boolean z6 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f14620e;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        z6 = true;
                    } else {
                        this.f14620e[i10] = obj2;
                        i10++;
                    }
                    i7++;
                }
                iK = k(i10);
                for (int i11 = 0; i11 < iK2; i11++) {
                    Object[] objArr2 = this.f14620e;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        z6 = true;
                    } else {
                        this.f14620e[iK] = obj3;
                        iK = h(iK);
                    }
                }
                z5 = z6;
            }
            if (z5) {
                m();
                this.f14621i = i(iK - this.f14619d);
            }
        }
        return z5;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        Object[] objArr = this.f14620e;
        int i7 = this.f14619d;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f14619d = h(i7);
        this.f14621i = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m();
        int iK = k(d0.f(this) + this.f14619d);
        Object[] objArr = this.f14620e;
        Object obj = objArr[iK];
        objArr[iK] = null;
        this.f14621i = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i10) {
        d dVar = h.f14644d;
        int i11 = this.f14621i;
        dVar.getClass();
        d.d(i7, i10, i11);
        int i12 = i10 - i7;
        if (i12 == 0) {
            return;
        }
        if (i12 == this.f14621i) {
            clear();
            return;
        }
        if (i12 == 1) {
            b(i7);
            return;
        }
        m();
        if (i7 < this.f14621i - i10) {
            int iK = k((i7 - 1) + this.f14619d);
            int iK2 = k((i10 - 1) + this.f14619d);
            while (i7 > 0) {
                int i13 = iK + 1;
                int iMin = Math.min(i7, Math.min(i13, iK2 + 1));
                Object[] objArr = this.f14620e;
                int i14 = iK2 - iMin;
                int i15 = iK - iMin;
                w.d(i14 + 1, i15 + 1, i13, objArr, objArr);
                iK = i(i15);
                iK2 = i(i14);
                i7 -= iMin;
            }
            int iK3 = k(this.f14619d + i12);
            j(this.f14619d, iK3);
            this.f14619d = iK3;
        } else {
            int iK4 = k(this.f14619d + i10);
            int iK5 = k(this.f14619d + i7);
            int i16 = this.f14621i;
            while (true) {
                i16 -= i10;
                if (i16 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f14620e;
                i10 = Math.min(i16, Math.min(objArr2.length - iK4, objArr2.length - iK5));
                Object[] objArr3 = this.f14620e;
                int i17 = iK4 + i10;
                w.d(iK5, iK4, i17, objArr3, objArr3);
                iK4 = k(i17);
                iK5 = k(iK5 + i10);
            }
            int iK6 = k(this.f14621i + this.f14619d);
            j(i(iK6 - i12), iK6);
        }
        this.f14621i -= i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int iK;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z5 = false;
        z5 = false;
        z5 = false;
        if (!isEmpty() && this.f14620e.length != 0) {
            int iK2 = k(a() + this.f14619d);
            int i7 = this.f14619d;
            if (i7 < iK2) {
                iK = i7;
                while (i7 < iK2) {
                    Object obj = this.f14620e[i7];
                    if (elements.contains(obj)) {
                        this.f14620e[iK] = obj;
                        iK++;
                    } else {
                        z5 = true;
                    }
                    i7++;
                }
                w.k(this.f14620e, null, iK, iK2);
            } else {
                int length = this.f14620e.length;
                boolean z6 = false;
                int i10 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f14620e;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (elements.contains(obj2)) {
                        this.f14620e[i10] = obj2;
                        i10++;
                    } else {
                        z6 = true;
                    }
                    i7++;
                }
                iK = k(i10);
                for (int i11 = 0; i11 < iK2; i11++) {
                    Object[] objArr2 = this.f14620e;
                    Object obj3 = objArr2[i11];
                    objArr2[i11] = null;
                    if (elements.contains(obj3)) {
                        this.f14620e[iK] = obj3;
                        iK = h(iK);
                    } else {
                        z6 = true;
                    }
                }
                z5 = z6;
            }
            if (z5) {
                m();
                this.f14621i = i(iK - this.f14619d);
            }
        }
        return z5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        d dVar = h.f14644d;
        int i10 = this.f14621i;
        dVar.getClass();
        d.b(i7, i10);
        int iK = k(this.f14619d + i7);
        Object[] objArr = this.f14620e;
        Object obj2 = objArr[iK];
        objArr[iK] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int length;
        d dVar = h.f14644d;
        int i10 = this.f14621i;
        dVar.getClass();
        d.c(i7, i10);
        if (i7 == this.f14621i) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        m();
        e(this.f14621i + 1);
        int iK = k(this.f14619d + i7);
        int i11 = this.f14621i;
        if (i7 < ((i11 + 1) >> 1)) {
            if (iK == 0) {
                Object[] objArr = this.f14620e;
                Intrinsics.checkNotNullParameter(objArr, "<this>");
                iK = objArr.length;
            }
            int i12 = iK - 1;
            int i13 = this.f14619d;
            if (i13 == 0) {
                Object[] objArr2 = this.f14620e;
                Intrinsics.checkNotNullParameter(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i13 - 1;
            }
            int i14 = this.f14619d;
            if (i12 >= i14) {
                Object[] objArr3 = this.f14620e;
                objArr3[length] = objArr3[i14];
                w.d(i14, i14 + 1, i12 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f14620e;
                w.d(i14 - 1, i14, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f14620e;
                objArr5[objArr5.length - 1] = objArr5[0];
                w.d(0, 1, i12 + 1, objArr5, objArr5);
            }
            this.f14620e[i12] = obj;
            this.f14619d = length;
        } else {
            int iK2 = k(i11 + this.f14619d);
            if (iK < iK2) {
                Object[] objArr6 = this.f14620e;
                w.d(iK + 1, iK, iK2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f14620e;
                w.d(1, 0, iK2, objArr7, objArr7);
                Object[] objArr8 = this.f14620e;
                objArr8[0] = objArr8[objArr8.length - 1];
                w.d(iK + 1, iK, objArr8.length - 1, objArr8, objArr8);
            }
            this.f14620e[iK] = obj;
        }
        this.f14621i++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] reference) {
        Intrinsics.checkNotNullParameter(reference, "array");
        int length = reference.length;
        int i7 = this.f14621i;
        if (length < i7) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), i7);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            reference = (Object[]) objNewInstance;
        }
        int iK = k(this.f14621i + this.f14619d);
        int i10 = this.f14619d;
        if (i10 < iK) {
            w.g(i10, iK, 2, this.f14620e, reference);
        } else if (!isEmpty()) {
            Object[] objArr = this.f14620e;
            w.d(0, this.f14619d, objArr.length, objArr, reference);
            Object[] objArr2 = this.f14620e;
            w.d(objArr2.length - this.f14619d, 0, iK, objArr2, reference);
        }
        c0.d(this.f14621i, reference);
        return reference;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d dVar = h.f14644d;
        int i10 = this.f14621i;
        dVar.getClass();
        d.c(i7, i10);
        if (elements.isEmpty()) {
            return false;
        }
        if (i7 == this.f14621i) {
            return addAll(elements);
        }
        m();
        e(elements.size() + this.f14621i);
        int iK = k(this.f14621i + this.f14619d);
        int iK2 = k(this.f14619d + i7);
        int size = elements.size();
        if (i7 < ((this.f14621i + 1) >> 1)) {
            int i11 = this.f14619d;
            int length = i11 - size;
            if (iK2 < i11) {
                Object[] objArr = this.f14620e;
                w.d(length, i11, objArr.length, objArr, objArr);
                if (size >= iK2) {
                    Object[] objArr2 = this.f14620e;
                    w.d(objArr2.length - size, 0, iK2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f14620e;
                    w.d(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f14620e;
                    w.d(0, size, iK2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f14620e;
                w.d(length, i11, iK2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f14620e;
                length += objArr6.length;
                int i12 = iK2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    w.d(length, i11, iK2, objArr6, objArr6);
                } else {
                    w.d(length, i11, i11 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.f14620e;
                    w.d(0, this.f14619d + length2, iK2, objArr7, objArr7);
                }
            }
            this.f14619d = length;
            d(i(iK2 - size), elements);
            return true;
        }
        int i13 = iK2 + size;
        if (iK2 < iK) {
            int i14 = size + iK;
            Object[] objArr8 = this.f14620e;
            if (i14 <= objArr8.length) {
                w.d(i13, iK2, iK, objArr8, objArr8);
            } else if (i13 >= objArr8.length) {
                w.d(i13 - objArr8.length, iK2, iK, objArr8, objArr8);
            } else {
                int length3 = iK - (i14 - objArr8.length);
                w.d(0, length3, iK, objArr8, objArr8);
                Object[] objArr9 = this.f14620e;
                w.d(i13, iK2, length3, objArr9, objArr9);
            }
        } else {
            Object[] objArr10 = this.f14620e;
            w.d(size, 0, iK, objArr10, objArr10);
            Object[] objArr11 = this.f14620e;
            if (i13 >= objArr11.length) {
                w.d(i13 - objArr11.length, iK2, objArr11.length, objArr11, objArr11);
            } else {
                w.d(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                Object[] objArr12 = this.f14620e;
                w.d(i13, iK2, objArr12.length - size, objArr12, objArr12);
            }
        }
        d(iK2, elements);
        return true;
    }
}
