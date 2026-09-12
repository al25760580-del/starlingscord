package ag;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends x {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e0 f520y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final transient q f521x;

    static {
        m mVar = q.f567e;
        f520y = new e0(c0.f510w, a0.f499e);
    }

    public e0(q qVar, Comparator comparator) {
        super(comparator);
        this.f521x = qVar;
    }

    @Override // ag.l
    public final int a(Object[] objArr) {
        return this.f521x.a(objArr);
    }

    @Override // ag.l
    public final int b() {
        return this.f521x.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iT = t(obj, true);
        q qVar = this.f521x;
        if (iT == qVar.size()) {
            return null;
        }
        return qVar.get(iT);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f521x, obj, this.f594v) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof z) {
            collection = ((z) collection).zza();
        }
        Comparator comparator = this.f594v;
        if (!c.i(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        m mVarListIterator = this.f521x.listIterator(0);
        Iterator it = collection.iterator();
        if (mVarListIterator.hasNext()) {
            Object next = it.next();
            Object next2 = mVarListIterator.next();
            while (true) {
                try {
                    int iCompare = comparator.compare(next2, next);
                    if (iCompare >= 0) {
                        if (iCompare != 0) {
                            break;
                        }
                        if (!it.hasNext()) {
                            return true;
                        }
                        next = it.next();
                    } else {
                        if (!mVarListIterator.hasNext()) {
                            break;
                        }
                        next2 = mVarListIterator.next();
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
        }
        return false;
    }

    @Override // ag.l
    public final int d() {
        return this.f521x.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f521x.i().listIterator(0);
    }

    @Override // ag.l
    public final i0 e() {
        return this.f521x.listIterator(0);
    }

    @Override // ag.s, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            q qVar = this.f521x;
            if (qVar.size() == set.size()) {
                if (isEmpty()) {
                    return true;
                }
                Comparator comparator = this.f594v;
                if (!c.i(comparator, set)) {
                    return containsAll(set);
                }
                Iterator it = set.iterator();
                try {
                    m mVarListIterator = qVar.listIterator(0);
                    while (mVarListIterator.hasNext()) {
                        Object next = mVarListIterator.next();
                        Object next2 = it.next();
                        if (next2 == null || comparator.compare(next, next2) != 0) {
                        }
                    }
                    return true;
                } catch (ClassCastException | NoSuchElementException unused) {
                }
            }
        }
        return false;
    }

    @Override // ag.x, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f521x.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iS = s(obj, true) - 1;
        if (iS == -1) {
            return null;
        }
        return this.f521x.get(iS);
    }

    @Override // ag.l
    public final Object[] h() {
        return this.f521x.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iT = t(obj, false);
        q qVar = this.f521x;
        if (iT == qVar.size()) {
            return null;
        }
        return qVar.get(iT);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final /* synthetic */ Iterator iterator() {
        return this.f521x.listIterator(0);
    }

    @Override // ag.s
    public final q k() {
        return this.f521x;
    }

    @Override // ag.x, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        q qVar = this.f521x;
        return qVar.get(qVar.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iS = s(obj, false) - 1;
        if (iS == -1) {
            return null;
        }
        return this.f521x.get(iS);
    }

    public final int s(Object obj, boolean z5) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f521x, obj, this.f594v);
        if (iBinarySearch >= 0) {
            return z5 ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f521x.size();
    }

    public final int t(Object obj, boolean z5) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f521x, obj, this.f594v);
        if (iBinarySearch >= 0) {
            return z5 ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }

    public final e0 v(int i7, int i10) {
        q qVar = this.f521x;
        if (i7 == 0) {
            if (i10 == qVar.size()) {
                return this;
            }
            i7 = 0;
        }
        Comparator comparator = this.f594v;
        return i7 < i10 ? new e0(qVar.subList(i7, i10), comparator) : x.r(comparator);
    }
}
