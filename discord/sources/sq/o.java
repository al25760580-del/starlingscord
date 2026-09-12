package sq;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20524d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f20525e;

    public o(p pVar) {
        this.f20525e = pVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f20524d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f20524d) {
            throw new NoSuchElementException();
        }
        this.f20524d = false;
        return this.f20525e.f20526d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
