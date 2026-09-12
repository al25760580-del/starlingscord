package sn;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends o implements Set, Serializable, KMutableSet {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final m f20324e = new m(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f20325i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f20326d;

    static {
        i.K.getClass();
        f20325i = new n(i.L);
    }

    public n(i backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f20326d = backing;
    }

    @Override // kotlin.collections.o
    public final int a() {
        return this.f20326d.F;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.f20326d.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f20326d.c();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f20326d.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f20326d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f20326d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        i map = this.f20326d;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new g(map, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        i iVar = this.f20326d;
        iVar.c();
        int iH = iVar.h(obj);
        if (iH < 0) {
            return false;
        }
        iVar.l(iH);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f20326d.c();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f20326d.c();
        return super.retainAll(elements);
    }

    public n() {
        this(new i());
    }
}
