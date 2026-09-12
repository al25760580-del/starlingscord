package kotlin.collections;

import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ListIterator f14671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f14672e;

    public x0(y0 y0Var, int i7) {
        this.f14672e = y0Var;
        this.f14671d = y0Var.f14673d.listIterator(j0.w(i7, y0Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.f14671d;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f14671d.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14671d.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f14671d.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return d0.f(this.f14672e) - this.f14671d.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f14671d.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return d0.f(this.f14672e) - this.f14671d.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        this.f14671d.remove();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f14671d.set(obj);
    }
}
