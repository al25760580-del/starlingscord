package hj;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends AbstractList implements x, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f10917d;

    public x0(w wVar) {
        this.f10917d = wVar;
    }

    @Override // hj.x
    public final void B(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // hj.x
    public final List c() {
        return Collections.unmodifiableList(this.f10917d.f10915e);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f10917d.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        w0 w0Var = new w0();
        w0Var.f10916d = this.f10917d.iterator();
        return w0Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        v0 v0Var = new v0();
        v0Var.f10914d = this.f10917d.listIterator(i7);
        return v0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10917d.f10915e.size();
    }

    @Override // hj.x
    public final x f() {
        return this;
    }
}
