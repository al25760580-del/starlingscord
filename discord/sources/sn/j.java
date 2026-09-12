package sn;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f20321d;

    public j(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f20321d = backing;
    }

    @Override // kotlin.collections.o
    public final int a() {
        return this.f20321d.F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // sn.a
    public final boolean b(Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f20321d.f(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20321d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f20321d.e(elements);
    }

    @Override // sn.a
    public final boolean d(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        i iVar = this.f20321d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        iVar.c();
        int iH = iVar.h(entry.getKey());
        if (iH < 0) {
            return false;
        }
        Object[] objArr = iVar.f20315e;
        Intrinsics.checkNotNull(objArr);
        if (!Intrinsics.areEqual(objArr[iH], entry.getValue())) {
            return false;
        }
        iVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f20321d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i map = this.f20321d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new g(map, 0);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f20321d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f20321d.c();
        return super.retainAll(elements);
    }
}
