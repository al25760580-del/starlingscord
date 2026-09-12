package sn;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.c0;
import kotlin.collections.w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends kotlin.collections.n implements List, RandomAccess, Serializable, KMutableList {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final d f20305v = new d(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f20306w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f20307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20308e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20309i;

    static {
        e eVar = new e(0);
        eVar.f20309i = true;
        f20306w = eVar;
    }

    public e() {
        this(0, 1, null);
    }

    @Override // kotlin.collections.n
    public final int a() {
        return this.f20308e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i7 = this.f20308e;
        ((AbstractList) this).modCount++;
        j(i7, 1);
        this.f20307d[i7] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i();
        int size = elements.size();
        e(this.f20308e, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.n
    public final Object b(int i7) {
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20308e;
        dVar.getClass();
        kotlin.collections.d.b(i7, i10);
        return k(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        m(0, this.f20308e);
    }

    public final void e(int i7, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        j(i7, i10);
        Iterator it = collection.iterator();
        for (int i11 = 0; i11 < i10; i11++) {
            this.f20307d[i7 + i11] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f20307d;
            int i7 = this.f20308e;
            if (i7 == list.size()) {
                for (int i10 = 0; i10 < i7; i10++) {
                    if (Intrinsics.areEqual(objArr[i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20308e;
        dVar.getClass();
        kotlin.collections.d.b(i7, i10);
        return this.f20307d[i7];
    }

    public final void h(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        j(i7, 1);
        this.f20307d[i7] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f20307d;
        int i7 = this.f20308e;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (this.f20309i) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i7 = 0; i7 < this.f20308e; i7++) {
            if (Intrinsics.areEqual(this.f20307d[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f20308e == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i7, int i10) {
        int i11 = this.f20308e + i10;
        if (i11 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f20307d;
        if (i11 > objArr.length) {
            kotlin.collections.d dVar = kotlin.collections.h.f14644d;
            int length = objArr.length;
            dVar.getClass();
            int iE = kotlin.collections.d.e(length, i11);
            Object[] objArr2 = this.f20307d;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f20307d = objArrCopyOf;
        }
        Object[] objArr3 = this.f20307d;
        w.d(i7 + i10, i7, this.f20308e, objArr3, objArr3);
        this.f20308e += i10;
    }

    public final Object k(int i7) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f20307d;
        Object obj = objArr[i7];
        w.d(i7, i7 + 1, this.f20308e, objArr, objArr);
        Object[] objArr2 = this.f20307d;
        int i10 = this.f20308e - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i10] = null;
        this.f20308e--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i7 = this.f20308e - 1; i7 >= 0; i7--) {
            if (Intrinsics.areEqual(this.f20307d[i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i7, int i10) {
        if (i10 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f20307d;
        w.d(i7, i7 + i10, this.f20308e, objArr, objArr);
        Object[] objArr2 = this.f20307d;
        int i11 = this.f20308e;
        sa.a.D(objArr2, i11 - i10, i11);
        this.f20308e -= i10;
    }

    public final int o(int i7, int i10, Collection collection, boolean z5) {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int i13 = i7 + i11;
            if (collection.contains(this.f20307d[i13]) == z5) {
                Object[] objArr = this.f20307d;
                i11++;
                objArr[i12 + i7] = objArr[i13];
                i12++;
            } else {
                i11++;
            }
        }
        int i14 = i10 - i12;
        Object[] objArr2 = this.f20307d;
        w.d(i7 + i12, i10 + i7, this.f20308e, objArr2, objArr2);
        Object[] objArr3 = this.f20307d;
        int i15 = this.f20308e;
        sa.a.D(objArr3, i15 - i14, i15);
        if (i14 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f20308e -= i14;
        return i14;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i();
        return o(0, this.f20308e, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i();
        return o(0, this.f20308e, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20308e;
        dVar.getClass();
        kotlin.collections.d.b(i7, i10);
        Object[] objArr = this.f20307d;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i11 = this.f20308e;
        dVar.getClass();
        kotlin.collections.d.d(i7, i10, i11);
        return new c(this.f20307d, i7, i10 - i7, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i7 = this.f20308e;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f20307d, 0, i7, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        w.d(0, 0, i7, this.f20307d, array);
        c0.d(this.f20308e, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return sa.a.b(this.f20307d, 0, this.f20308e, this);
    }

    public /* synthetic */ e(int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 10 : i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20308e;
        dVar.getClass();
        kotlin.collections.d.c(i7, i10);
        return new b(this, i7);
    }

    public e(int i7) {
        if (i7 >= 0) {
            this.f20307d = new Object[i7];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20308e;
        dVar.getClass();
        kotlin.collections.d.c(i7, i10);
        int size = elements.size();
        e(i7, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return w.j(this.f20307d, 0, this.f20308e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20308e;
        dVar.getClass();
        kotlin.collections.d.c(i7, i10);
        ((AbstractList) this).modCount++;
        j(i7, 1);
        this.f20307d[i7] = obj;
    }
}
