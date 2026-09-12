package vq;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21942e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f21943i;

    public f(g gVar) {
        this.f21943i = gVar;
        this.f21942e = ((AbstractList) gVar).modCount;
    }

    public final void a() {
        g gVar = this.f21943i;
        int i7 = ((AbstractList) gVar).modCount;
        int i10 = this.f21942e;
        if (i7 == i10) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) gVar).modCount + "; expected: " + i10);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f21941d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21941d) {
            throw new NoSuchElementException();
        }
        this.f21941d = true;
        a();
        return this.f21943i.f21945e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a();
        this.f21943i.clear();
    }
}
