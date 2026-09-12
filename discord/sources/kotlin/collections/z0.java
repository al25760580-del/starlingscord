package kotlin.collections;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 implements ListIterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListIterator f14674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a1 f14675e;

    public z0(a1 a1Var, int i7) {
        this.f14675e = a1Var;
        this.f14674d = ((List) a1Var.f14627i).listIterator(j0.w(i7, a1Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14674d.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14674d.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f14674d.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return d0.f(this.f14675e) - this.f14674d.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f14674d.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return d0.f(this.f14675e) - this.f14674d.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
