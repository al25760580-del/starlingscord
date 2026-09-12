package v;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: loaded from: classes.dex */
public final class b implements List, KMutableList {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21318e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21319i;

    public b(List list, int i7, int i10) {
        this.f21317d = list;
        this.f21318e = i7;
        this.f21319i = i10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i7 = this.f21319i;
        this.f21319i = i7 + 1;
        this.f21317d.add(i7, obj);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        this.f21317d.addAll(i7 + this.f21318e, collection);
        int size = collection.size();
        this.f21319i += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i7 = this.f21319i - 1;
        int i10 = this.f21318e;
        if (i10 <= i7) {
            while (true) {
                this.f21317d.remove(i7);
                if (i7 == i10) {
                    break;
                } else {
                    i7--;
                }
            }
        }
        this.f21319i = i10;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i7 = this.f21319i;
        for (int i10 = this.f21318e; i10 < i7; i10++) {
            if (Intrinsics.areEqual(this.f21317d.get(i10), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i7) {
        e.a(i7, this);
        return this.f21317d.get(i7 + this.f21318e);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i7 = this.f21319i;
        int i10 = this.f21318e;
        for (int i11 = i10; i11 < i7; i11++) {
            if (Intrinsics.areEqual(this.f21317d.get(i11), obj)) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21319i == this.f21318e;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i7 = this.f21319i - 1;
        int i10 = this.f21318e;
        if (i10 > i7) {
            return -1;
        }
        while (!Intrinsics.areEqual(this.f21317d.get(i7), obj)) {
            if (i7 == i10) {
                return -1;
            }
            i7--;
        }
        return i7 - i10;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i7 = this.f21319i;
        for (int i10 = this.f21318e; i10 < i7; i10++) {
            ?? r5 = this.f21317d;
            if (Intrinsics.areEqual(r5.get(i10), obj)) {
                r5.remove(i10);
                this.f21319i--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i7 = this.f21319i;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i7 != this.f21319i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i7 = this.f21319i;
        int i10 = i7 - 1;
        int i11 = this.f21318e;
        if (i11 <= i10) {
            while (true) {
                ?? r5 = this.f21317d;
                if (!collection.contains(r5.get(i10))) {
                    r5.remove(i10);
                    this.f21319i--;
                }
                if (i10 == i11) {
                    break;
                }
                i10--;
            }
        }
        return i7 != this.f21319i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        e.a(i7, this);
        return this.f21317d.set(i7 + this.f21318e, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21319i - this.f21318e;
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        e.b(this, i7, i10);
        return new b(this, i7, i10);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i7, Object obj) {
        this.f21317d.add(i7 + this.f21318e, obj);
        this.f21319i++;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new c(i7, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        this.f21317d.addAll(this.f21319i, collection);
        int size = collection.size();
        this.f21319i += size;
        return size > 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i7) {
        e.a(i7, this);
        Object objRemove = this.f21317d.remove(i7 + this.f21318e);
        this.f21319i--;
        return objRemove;
    }
}
