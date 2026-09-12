package w;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f21970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21971e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21972i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f21973v;

    public f(int i7) {
        this.f21973v = i7;
        e eVar = e.f21968b;
        this.f21970d = e.f21968b.f21969a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21972i < this.f21971e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f21973v) {
            case 0:
                int i7 = this.f21972i;
                this.f21972i = i7 + 2;
                Object[] objArr = this.f21970d;
                return new a(objArr[i7], objArr[i7 + 1]);
            case 1:
                int i10 = this.f21972i;
                this.f21972i = i10 + 2;
                return this.f21970d[i10];
            default:
                int i11 = this.f21972i;
                this.f21972i = i11 + 2;
                return this.f21970d[i11 + 1];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
