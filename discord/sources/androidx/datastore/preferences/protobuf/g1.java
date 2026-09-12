package androidx.datastore.preferences.protobuf;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements ListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ListIterator f1865d;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1865d.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1865d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f1865d.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1865d.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f1865d.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1865d.previousIndex();
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
