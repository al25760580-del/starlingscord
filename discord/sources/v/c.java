package v;

import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements ListIterator, KMutableListIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21321e;

    public c(int i7, List list) {
        this.f21320d = list;
        this.f21321e = i7;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        this.f21320d.add(this.f21321e, obj);
        this.f21321e++;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21321e < this.f21320d.size();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21321e > 0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i7 = this.f21321e;
        this.f21321e = i7 + 1;
        return this.f21320d.get(i7);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21321e;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final Object previous() {
        int i7 = this.f21321e - 1;
        this.f21321e = i7;
        return this.f21320d.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21321e - 1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i7 = this.f21321e - 1;
        this.f21321e = i7;
        this.f21320d.remove(i7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        this.f21320d.set(this.f21321e, obj);
    }
}
