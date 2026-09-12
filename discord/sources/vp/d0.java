package vp;

import ei.l0;
import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends AbstractList implements RandomAccess, s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f21872d;

    public d0(r rVar) {
        this.f21872d = rVar;
    }

    @Override // vp.s
    public final d O(int i7) {
        return this.f21872d.O(i7);
    }

    @Override // vp.s
    public final void T(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override // vp.s
    public final List c() {
        return Collections.unmodifiableList(this.f21872d.f21918d);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f21872d.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        l0 l0Var = new l0();
        l0Var.f8331e = this.f21872d.iterator();
        return l0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        c0 c0Var = new c0();
        c0Var.f21870d = this.f21872d.listIterator(i7);
        return c0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21872d.size();
    }

    @Override // vp.s
    public final d0 f() {
        return this;
    }
}
