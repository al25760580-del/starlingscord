package yf;

import ci.n;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends n implements ListIterator {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23316e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f23317i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f23318v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, int i7) {
        super(1);
        int size = eVar.size();
        android.support.v4.media.session.b.A(i7, size);
        this.f23316e = size;
        this.f23317i = i7;
        this.f23318v = eVar;
    }

    public final Object a(int i7) {
        return this.f23318v.get(i7);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f23317i < this.f23316e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f23317i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f23317i;
        this.f23317i = i7 + 1;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f23317i;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f23317i - 1;
        this.f23317i = i7;
        return a(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f23317i - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
