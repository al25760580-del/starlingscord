package ei;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e0 extends z implements List, RandomAccess {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c0 f8303e = new c0(r0.f8352w, 0);

    public static r0 j(int i7, Object[] objArr) {
        return i7 == 0 ? r0.f8352w : new r0(i7, objArr);
    }

    public static e0 k(Collection collection) {
        if (!(collection instanceof z)) {
            Object[] array = collection.toArray();
            p.b(array.length, array);
            return j(array.length, array);
        }
        e0 e0VarA = ((z) collection).a();
        if (!e0VarA.i()) {
            return e0VarA;
        }
        Object[] array2 = e0VarA.toArray(z.f8394d);
        return j(array2.length, array2);
    }

    public static r0 m(Object[] objArr) {
        if (objArr.length == 0) {
            return r0.f8352w;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        p.b(objArr2.length, objArr2);
        return j(objArr2.length, objArr2);
    }

    public static r0 p(Long l6, Long l7, Long l10, Long l11, Long l12) {
        Object[] objArr = {l6, l7, l10, l11, l12};
        p.b(5, objArr);
        return j(5, objArr);
    }

    public static r0 r(Object obj) {
        Object[] objArr = {obj};
        p.b(1, objArr);
        return j(1, objArr);
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // ei.z
    public int b(int i7, Object[] objArr) {
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            objArr[i7 + i10] = get(i10);
        }
        return i7 + size;
    }

    @Override // ei.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && ls.d.n(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i7 = 0; i7 < size; i7++) {
                        if (ls.d.n(get(i7), list.get(i7))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i7 = 1;
        for (int i10 = 0; i10 < size; i10++) {
            i7 = ~(~(get(i10).hashCode() + (i7 * 31)));
        }
        return i7;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            if (obj.equals(get(i7))) {
                return i7;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final c0 listIterator(int i7) {
        ls.l.g(i7, size());
        return isEmpty() ? f8303e : new c0(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e0 subList(int i7, int i10) {
        ls.l.h(i7, i10, size());
        int i11 = i10 - i7;
        if (i11 == size()) {
            return this;
        }
        return i11 == 0 ? r0.f8352w : new d0(this, i7, i11);
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ei.z
    public final e0 a() {
        return this;
    }
}
