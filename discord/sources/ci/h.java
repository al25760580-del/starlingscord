package ci;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends n implements ListIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3702e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3703i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final j f3704v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, int i7) {
        super(0);
        int size = jVar.size();
        if (i7 < 0 || i7 > size) {
            throw new IndexOutOfBoundsException(gn.h.t(i7, size, "index"));
        }
        this.f3702e = size;
        this.f3703i = i7;
        this.f3704v = jVar;
    }

    public final Object a(int i7) {
        return this.f3704v.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f3703i < this.f3702e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3703i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f3703i;
        this.f3703i = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3703i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f3703i - 1;
        this.f3703i = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3703i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
