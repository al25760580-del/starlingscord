package ei;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends e0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final transient int f8297i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient int f8298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f8299w;

    public d0(e0 e0Var, int i7, int i10) {
        this.f8299w = e0Var;
        this.f8297i = i7;
        this.f8298v = i10;
    }

    @Override // ei.z
    public final Object[] d() {
        return this.f8299w.d();
    }

    @Override // ei.z
    public final int e() {
        return this.f8299w.h() + this.f8297i + this.f8298v;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        ls.l.e(i7, this.f8298v);
        return this.f8299w.get(i7 + this.f8297i);
    }

    @Override // ei.z
    public final int h() {
        return this.f8299w.h() + this.f8297i;
    }

    @Override // ei.z
    public final boolean i() {
        return true;
    }

    @Override // ei.e0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // ei.e0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // ei.e0, java.util.List
    /* JADX INFO: renamed from: s */
    public final e0 subList(int i7, int i10) {
        ls.l.h(i7, i10, this.f8298v);
        int i11 = this.f8297i;
        return this.f8299w.subList(i7 + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8298v;
    }

    @Override // ei.e0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i7) {
        return listIterator(i7);
    }
}
