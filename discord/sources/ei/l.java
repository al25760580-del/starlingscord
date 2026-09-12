package ei;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class l extends AbstractCollection implements List {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f8325e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f8326i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Collection f8327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n0 f8328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n0 f8329x;

    public l(n0 n0Var, Object obj, List list, l lVar) {
        this.f8329x = n0Var;
        this.f8328w = n0Var;
        this.f8324d = obj;
        this.f8325e = list;
        this.f8326i = lVar;
        this.f8327v = lVar == null ? null : lVar.f8325e;
    }

    public final void a() {
        l lVar = this.f8326i;
        if (lVar != null) {
            lVar.a();
        } else {
            this.f8328w.f8335v.put(this.f8324d, this.f8325e);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.f8325e.isEmpty();
        boolean zAdd = this.f8325e.add(obj);
        if (zAdd) {
            this.f8328w.f8336w++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f8325e.addAll(collection);
        if (zAddAll) {
            this.f8328w.f8336w += this.f8325e.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        l lVar = this.f8326i;
        if (lVar != null) {
            lVar.b();
            if (lVar.f8325e != this.f8327v) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f8325e.isEmpty() || (collection = (Collection) this.f8328w.f8335v.get(this.f8324d)) == null) {
                return;
            }
            this.f8325e = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f8325e.clear();
        this.f8328w.f8336w -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        b();
        return this.f8325e.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        b();
        return this.f8325e.containsAll(collection);
    }

    public final void d() {
        l lVar = this.f8326i;
        if (lVar != null) {
            lVar.d();
        } else if (this.f8325e.isEmpty()) {
            this.f8328w.f8335v.remove(this.f8324d);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.f8325e.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i7) {
        b();
        return ((List) this.f8325e).get(i7);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        b();
        return this.f8325e.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.f8325e).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        b();
        return new c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.f8325e).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.f8325e.remove(obj);
        if (zRemove) {
            this.f8328w.f8336w--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f8325e.removeAll(collection);
        if (zRemoveAll) {
            this.f8328w.f8336w += this.f8325e.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f8325e.retainAll(collection);
        if (zRetainAll) {
            this.f8328w.f8336w += this.f8325e.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i7, Object obj) {
        b();
        return ((List) this.f8325e).set(i7, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        b();
        return this.f8325e.size();
    }

    @Override // java.util.List
    public final List subList(int i7, int i10) {
        b();
        List listSubList = ((List) this.f8325e).subList(i7, i10);
        l lVar = this.f8326i;
        if (lVar == null) {
            lVar = this;
        }
        boolean z5 = listSubList instanceof RandomAccess;
        n0 n0Var = this.f8329x;
        Object obj = this.f8324d;
        return z5 ? new h(n0Var, obj, listSubList, lVar) : new l(n0Var, obj, listSubList, lVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.f8325e.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i7) {
        b();
        return new k(this, i7);
    }

    @Override // java.util.List
    public final Object remove(int i7) {
        b();
        Object objRemove = ((List) this.f8325e).remove(i7);
        this.f8329x.f8336w--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i7, Object obj) {
        b();
        boolean zIsEmpty = this.f8325e.isEmpty();
        ((List) this.f8325e).add(i7, obj);
        this.f8329x.f8336w++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i7, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f8325e).addAll(i7, collection);
        if (zAddAll) {
            this.f8329x.f8336w += this.f8325e.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }
}
