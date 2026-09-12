package ei;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8330d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f8331e;

    public /* synthetic */ l0() {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8330d) {
            case 0:
                break;
        }
        return this.f8331e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8330d) {
            case 0:
                return ((Map.Entry) this.f8331e.next()).getValue();
            default:
                return (String) this.f8331e.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8330d) {
            case 0:
                this.f8331e.remove();
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public l0(Iterator it) {
        it.getClass();
        this.f8331e = it;
    }
}
