package kotlin.collections;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Iterator f14652e;

    public /* synthetic */ j(Iterator it, int i7) {
        this.f14651d = i7;
        this.f14652e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f14651d) {
            case 0:
                break;
        }
        return this.f14652e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f14651d) {
            case 0:
                return ((Map.Entry) this.f14652e.next()).getKey();
            default:
                return ((Map.Entry) this.f14652e.next()).getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f14651d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
