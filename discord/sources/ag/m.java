package ag;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends i0 implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f542e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f543i;

    public m(q qVar, int i7) {
        int size = qVar.size();
        if (i7 < 0 || i7 > size) {
            throw new IndexOutOfBoundsException(c.n(i7, size, "index"));
        }
        this.f541d = size;
        this.f542e = i7;
        this.f543i = qVar;
    }

    public final Object a(int i7) {
        return this.f543i.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f542e < this.f541d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f542e > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f542e;
        this.f542e = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f542e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f542e - 1;
        this.f542e = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f542e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
