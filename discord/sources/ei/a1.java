package ei;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class a1 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f8283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final di.g f8284e;

    public a1(Set set, di.g gVar) {
        this.f8283d = set;
        this.f8284e = gVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.f8284e.apply(obj)) {
            return this.f8283d.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f8284e.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f8283d.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f8283d;
        boolean z5 = set instanceof RandomAccess;
        di.g gVar = this.f8284e;
        if (!z5 || !(set instanceof List)) {
            Iterator it = set.iterator();
            gVar.getClass();
            while (it.hasNext()) {
                if (gVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        gVar.getClass();
        int i7 = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            if (!gVar.apply(obj)) {
                if (i10 > i7) {
                    try {
                        list.set(i7, obj);
                    } catch (IllegalArgumentException unused) {
                        p.o(list, gVar, i7, i10);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        p.o(list, gVar, i7, i10);
                        return;
                    }
                }
                i7++;
            }
        }
        list.subList(i7, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f8283d;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f8284e.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return p.f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return p.j(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f8283d.iterator();
        di.g gVar = this.f8284e;
        ls.l.f(gVar, "predicate");
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (gVar.apply(it.next())) {
                break;
            }
            i7++;
        }
        return true ^ (i7 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f8283d.iterator();
        it.getClass();
        di.g gVar = this.f8284e;
        gVar.getClass();
        return new i0(it, gVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f8283d.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f8283d.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f8284e.apply(next) && collection.contains(next)) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f8283d.iterator();
        boolean z5 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f8284e.apply(next) && !collection.contains(next)) {
                it.remove();
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f8283d.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (this.f8284e.apply(it.next())) {
                i7++;
            }
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        i0 i0Var = (i0) iterator();
        ArrayList arrayList = new ArrayList();
        while (i0Var.hasNext()) {
            arrayList.add(i0Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        i0 i0Var = (i0) iterator();
        ArrayList arrayList = new ArrayList();
        while (i0Var.hasNext()) {
            arrayList.add(i0Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
