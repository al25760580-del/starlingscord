package ei;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends e1 implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8291e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0 f8292i;

    public c0(e0 e0Var, int i7) {
        int size = e0Var.size();
        ls.l.g(i7, size);
        this.f8290d = size;
        this.f8291e = i7;
        this.f8292i = e0Var;
    }

    public final Object a(int i7) {
        return this.f8292i.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f8291e < this.f8290d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8291e > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f8291e;
        this.f8291e = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8291e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f8291e - 1;
        this.f8291e = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8291e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
