package sn;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20295d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20296e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20297i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kotlin.collections.n f20299w;

    public b(e list, int i7) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f20299w = list;
        this.f20296e = i7;
        this.f20297i = -1;
        this.f20298v = ((AbstractList) list).modCount;
    }

    public void a() {
        if (((AbstractList) ((c) this.f20299w).f20304w).modCount != this.f20298v) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f20295d) {
            case 0:
                a();
                c cVar = (c) this.f20299w;
                int i7 = this.f20296e;
                this.f20296e = i7 + 1;
                cVar.add(i7, obj);
                this.f20297i = -1;
                this.f20298v = ((AbstractList) cVar).modCount;
                break;
            default:
                b();
                e eVar = (e) this.f20299w;
                int i10 = this.f20296e;
                this.f20296e = i10 + 1;
                eVar.add(i10, obj);
                this.f20297i = -1;
                this.f20298v = ((AbstractList) eVar).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((e) this.f20299w)).modCount != this.f20298v) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f20295d) {
            case 0:
                return this.f20296e < ((c) this.f20299w).f20302i;
            default:
                return this.f20296e < ((e) this.f20299w).f20308e;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f20295d) {
            case 0:
                return this.f20296e > 0;
            default:
                return this.f20296e > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f20295d) {
            case 0:
                a();
                int i7 = this.f20296e;
                c cVar = (c) this.f20299w;
                if (i7 >= cVar.f20302i) {
                    throw new NoSuchElementException();
                }
                this.f20296e = i7 + 1;
                this.f20297i = i7;
                return cVar.f20300d[cVar.f20301e + i7];
            default:
                b();
                int i10 = this.f20296e;
                e eVar = (e) this.f20299w;
                if (i10 >= eVar.f20308e) {
                    throw new NoSuchElementException();
                }
                this.f20296e = i10 + 1;
                this.f20297i = i10;
                return eVar.f20307d[i10];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f20295d) {
            case 0:
                break;
        }
        return this.f20296e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f20295d) {
            case 0:
                a();
                int i7 = this.f20296e;
                if (i7 <= 0) {
                    throw new NoSuchElementException();
                }
                int i10 = i7 - 1;
                this.f20296e = i10;
                this.f20297i = i10;
                c cVar = (c) this.f20299w;
                return cVar.f20300d[cVar.f20301e + i10];
            default:
                b();
                int i11 = this.f20296e;
                if (i11 <= 0) {
                    throw new NoSuchElementException();
                }
                int i12 = i11 - 1;
                this.f20296e = i12;
                this.f20297i = i12;
                return ((e) this.f20299w).f20307d[i12];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i7;
        switch (this.f20295d) {
            case 0:
                i7 = this.f20296e;
                break;
            default:
                i7 = this.f20296e;
                break;
        }
        return i7 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f20295d) {
            case 0:
                c cVar = (c) this.f20299w;
                a();
                int i7 = this.f20297i;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                cVar.b(i7);
                this.f20296e = this.f20297i;
                this.f20297i = -1;
                this.f20298v = ((AbstractList) cVar).modCount;
                return;
            default:
                e eVar = (e) this.f20299w;
                b();
                int i10 = this.f20297i;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                eVar.b(i10);
                this.f20296e = this.f20297i;
                this.f20297i = -1;
                this.f20298v = ((AbstractList) eVar).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f20295d) {
            case 0:
                a();
                int i7 = this.f20297i;
                if (i7 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((c) this.f20299w).set(i7, obj);
                return;
            default:
                b();
                int i10 = this.f20297i;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                ((e) this.f20299w).set(i10, obj);
                return;
        }
    }

    public b(c list, int i7) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f20299w = list;
        this.f20296e = i7;
        this.f20297i = -1;
        this.f20298v = ((AbstractList) list).modCount;
    }
}
