package sn;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.c0;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends kotlin.collections.n implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f20300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20301e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20302i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f20303v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f20304w;

    public c(Object[] backing, int i7, int i10, c cVar, e root) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f20300d = backing;
        this.f20301e = i7;
        this.f20302i = i10;
        this.f20303v = cVar;
        this.f20304w = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // kotlin.collections.n
    public final int a() {
        i();
        return this.f20302i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        j();
        i();
        h(this.f20301e + this.f20302i, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        j();
        i();
        int size = elements.size();
        e(this.f20301e + this.f20302i, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.n
    public final Object b(int i7) {
        j();
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20302i;
        dVar.getClass();
        kotlin.collections.d.b(i7, i10);
        return k(this.f20301e + i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        j();
        i();
        m(this.f20301e, this.f20302i);
    }

    public final void e(int i7, Collection collection, int i10) {
        ((AbstractList) this).modCount++;
        e eVar = this.f20304w;
        c cVar = this.f20303v;
        if (cVar != null) {
            cVar.e(i7, collection, i10);
        } else {
            e eVar2 = e.f20306w;
            eVar.e(i7, collection, i10);
        }
        this.f20300d = eVar.f20307d;
        this.f20302i += i10;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        i();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f20300d;
            int i7 = this.f20302i;
            if (i7 == list.size()) {
                for (int i10 = 0; i10 < i7; i10++) {
                    if (Intrinsics.areEqual(objArr[this.f20301e + i10], list.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20302i;
        dVar.getClass();
        kotlin.collections.d.b(i7, i10);
        return this.f20300d[this.f20301e + i7];
    }

    public final void h(int i7, Object obj) {
        ((AbstractList) this).modCount++;
        e eVar = this.f20304w;
        c cVar = this.f20303v;
        if (cVar != null) {
            cVar.h(i7, obj);
        } else {
            e eVar2 = e.f20306w;
            eVar.h(i7, obj);
        }
        this.f20300d = eVar.f20307d;
        this.f20302i++;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        i();
        Object[] objArr = this.f20300d;
        int i7 = this.f20302i;
        int iHashCode = 1;
        for (int i10 = 0; i10 < i7; i10++) {
            Object obj = objArr[this.f20301e + i10];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (((AbstractList) this.f20304w).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        i();
        for (int i7 = 0; i7 < this.f20302i; i7++) {
            if (Intrinsics.areEqual(this.f20300d[this.f20301e + i7], obj)) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        i();
        return this.f20302i == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j() {
        if (this.f20304w.f20309i) {
            throw new UnsupportedOperationException();
        }
    }

    public final Object k(int i7) {
        Object objK;
        ((AbstractList) this).modCount++;
        c cVar = this.f20303v;
        if (cVar != null) {
            objK = cVar.k(i7);
        } else {
            e eVar = e.f20306w;
            objK = this.f20304w.k(i7);
        }
        this.f20302i--;
        return objK;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        i();
        for (int i7 = this.f20302i - 1; i7 >= 0; i7--) {
            if (Intrinsics.areEqual(this.f20300d[this.f20301e + i7], obj)) {
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
        c cVar = this.f20303v;
        if (cVar != null) {
            cVar.m(i7, i10);
        } else {
            e eVar = e.f20306w;
            this.f20304w.m(i7, i10);
        }
        this.f20302i -= i10;
    }

    public final int o(int i7, int i10, Collection collection, boolean z5) {
        int iO;
        c cVar = this.f20303v;
        if (cVar != null) {
            iO = cVar.o(i7, i10, collection, z5);
        } else {
            e eVar = e.f20306w;
            iO = this.f20304w.o(i7, i10, collection, z5);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f20302i -= iO;
        return iO;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        j();
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
        j();
        i();
        return o(this.f20301e, this.f20302i, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        j();
        i();
        return o(this.f20301e, this.f20302i, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        j();
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20302i;
        dVar.getClass();
        kotlin.collections.d.b(i7, i10);
        Object[] objArr = this.f20300d;
        int i11 = this.f20301e + i7;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i7, int i10) {
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i11 = this.f20302i;
        dVar.getClass();
        kotlin.collections.d.d(i7, i10, i11);
        return new c(this.f20300d, this.f20301e + i7, i10 - i7, this, this.f20304w);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        i();
        int length = array.length;
        int i7 = this.f20302i;
        int i10 = this.f20301e;
        if (length < i7) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f20300d, i10, i7 + i10, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        w.d(0, i10, i7 + i10, this.f20300d, array);
        c0.d(this.f20302i, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        i();
        return sa.a.b(this.f20300d, this.f20301e, this.f20302i, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20302i;
        dVar.getClass();
        kotlin.collections.d.c(i7, i10);
        return new b(this, i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        j();
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20302i;
        dVar.getClass();
        kotlin.collections.d.c(i7, i10);
        h(this.f20301e + i7, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        j();
        i();
        kotlin.collections.d dVar = kotlin.collections.h.f14644d;
        int i10 = this.f20302i;
        dVar.getClass();
        kotlin.collections.d.c(i7, i10);
        int size = elements.size();
        e(this.f20301e + i7, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        i();
        Object[] objArr = this.f20300d;
        int i7 = this.f20302i;
        int i10 = this.f20301e;
        return w.j(objArr, i10, i7 + i10);
    }
}
