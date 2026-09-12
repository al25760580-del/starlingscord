package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14632e;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f14631d;
        if (i7 == 0) {
            this.f14631d = 3;
            a();
            return this.f14631d == 1;
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f14631d;
        if (i7 == 1) {
            this.f14631d = 0;
            return this.f14632e;
        }
        if (i7 != 2) {
            this.f14631d = 3;
            a();
            if (this.f14631d == 1) {
                this.f14631d = 0;
                return this.f14632e;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
