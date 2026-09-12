package vq;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Iterator, KMutableIterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f21947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21948e = true;

    public i(Object obj) {
        this.f21947d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21948e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f21948e) {
            throw new NoSuchElementException();
        }
        this.f21948e = false;
        return this.f21947d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
