package vp;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListIterator f21870d;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21870d.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21870d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f21870d.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21870d.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f21870d.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21870d.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
