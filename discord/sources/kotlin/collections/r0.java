package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14665d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Iterator f14666e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14667i;

    public r0(Iterator iterator) {
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f14666e = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f14665d) {
            case 0:
                return this.f14666e.hasNext();
        }
        while (true) {
            int i7 = this.f14667i;
            it = this.f14666e;
            if (i7 > 0 && it.hasNext()) {
                it.next();
                this.f14667i--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f14665d) {
            case 0:
                int i7 = this.f14667i;
                this.f14667i = i7 + 1;
                if (i7 >= 0) {
                    return new IndexedValue(i7, this.f14666e.next());
                }
                d0.k();
                throw null;
        }
        while (true) {
            int i10 = this.f14667i;
            it = this.f14666e;
            if (i10 > 0 && it.hasNext()) {
                it.next();
                this.f14667i--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14665d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public r0(xq.b bVar) {
        this.f14666e = bVar.f23018a.iterator();
        this.f14667i = bVar.f23019b;
    }
}
