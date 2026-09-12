package vq;

import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Iterator f21946d;

    public h(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f21946d = ArrayIteratorKt.iterator(array);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21946d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f21946d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
