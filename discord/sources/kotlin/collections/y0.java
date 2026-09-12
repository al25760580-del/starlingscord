package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f14673d;

    public y0(List delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f14673d = delegate;
    }

    @Override // kotlin.collections.n
    public final int a() {
        return this.f14673d.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        this.f14673d.add(j0.w(i7, this), obj);
    }

    @Override // kotlin.collections.n
    public final Object b(int i7) {
        return this.f14673d.remove(j0.v(i7, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f14673d.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.f14673d.get(j0.v(i7, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new x0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new x0(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        return this.f14673d.set(j0.v(i7, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        return new x0(this, i7);
    }
}
