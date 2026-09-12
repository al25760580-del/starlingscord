package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class i1 extends AbstractList implements z, RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f1876d;

    public i1(y yVar) {
        this.f1876d = yVar;
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final Object U(int i7) {
        return this.f1876d.f1973e.get(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final List c() {
        return Collections.unmodifiableList(this.f1876d.f1973e);
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final z f() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return (String) this.f1876d.get(i7);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        h1 h1Var = new h1();
        h1Var.f1868d = this.f1876d.iterator();
        return h1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        g1 g1Var = new g1();
        g1Var.f1865d = this.f1876d.listIterator(i7);
        return g1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1876d.size();
    }

    @Override // androidx.datastore.preferences.protobuf.z
    public final void u(e eVar) {
        throw new UnsupportedOperationException();
    }
}
