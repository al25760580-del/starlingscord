package v;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements List, KMutableList {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f21316d;

    public a(d dVar) {
        this.f21316d = dVar;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        d dVar = this.f21316d;
        int i10 = dVar.f21324i + 1;
        if (dVar.f21322d.length < i10) {
            dVar.h(i10);
        }
        Object[] objArr = dVar.f21322d;
        int i11 = dVar.f21324i;
        if (i7 != i11) {
            System.arraycopy(objArr, i7, objArr, i7 + 1, i11 - i7);
        }
        objArr[i7] = obj;
        dVar.f21324i++;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        d dVar = this.f21316d;
        return dVar.b(dVar.f21324i, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f21316d.d();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        d dVar = this.f21316d;
        int i7 = dVar.f21324i - 1;
        if (i7 >= 0) {
            for (int i10 = 0; !Intrinsics.areEqual(dVar.f21322d[i10], obj); i10++) {
                if (i10 != i7) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        boolean z5;
        Iterator it = collection.iterator();
        loop0: while (true) {
            z5 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            d dVar = this.f21316d;
            int i7 = dVar.f21324i - 1;
            z5 = false;
            if (i7 < 0) {
                break;
            }
            for (int i10 = 0; !Intrinsics.areEqual(dVar.f21322d[i10], next); i10++) {
                if (i10 == i7) {
                    break loop0;
                }
            }
        }
        return z5;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        e.a(i7, this);
        return this.f21316d.f21322d[i7];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        d dVar = this.f21316d;
        Object[] objArr = dVar.f21322d;
        int i7 = dVar.f21324i;
        for (int i10 = 0; i10 < i7; i10++) {
            if (Intrinsics.areEqual(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21316d.f21324i == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new c(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        d dVar = this.f21316d;
        Object[] objArr = dVar.f21322d;
        for (int i7 = dVar.f21324i - 1; i7 >= 0; i7--) {
            if (Intrinsics.areEqual(obj, objArr[i7])) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        d dVar = this.f21316d;
        Object[] objArr = dVar.f21322d;
        int i7 = dVar.f21324i;
        int i10 = 0;
        while (true) {
            if (i10 >= i7) {
                i10 = -1;
                break;
            }
            if (Intrinsics.areEqual(obj, objArr[i10])) {
                break;
            }
            i10++;
        }
        if (i10 < 0) {
            return false;
        }
        dVar.e(i10);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (!collection.isEmpty()) {
            d dVar = this.f21316d;
            int i7 = dVar.f21324i;
            for (Object obj : collection) {
                Object[] objArr = dVar.f21322d;
                int i10 = dVar.f21324i;
                int i11 = 0;
                while (true) {
                    if (i11 >= i10) {
                        i11 = -1;
                        break;
                    }
                    if (Intrinsics.areEqual(obj, objArr[i11])) {
                        break;
                    }
                    i11++;
                }
                if (i11 >= 0) {
                    dVar.e(i11);
                }
            }
            if (i7 != dVar.f21324i) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        d dVar = this.f21316d;
        int i7 = dVar.f21324i;
        for (int i10 = i7 - 1; -1 < i10; i10--) {
            if (!collection.contains(dVar.f21322d[i10])) {
                dVar.e(i10);
            }
        }
        return i7 != dVar.f21324i;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        e.a(i7, this);
        Object[] objArr = this.f21316d.f21322d;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21316d.f21324i;
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

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        return new c(i7, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return CollectionToArray.toArray(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        return this.f21316d.b(i7, collection);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        e.a(i7, this);
        return this.f21316d.e(i7);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f21316d.a(obj);
        return true;
    }
}
