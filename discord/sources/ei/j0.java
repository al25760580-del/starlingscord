package ei;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8320e;

    public j0(Object obj) {
        this.f8320e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f8319d;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8319d) {
            throw new NoSuchElementException();
        }
        this.f8319d = true;
        return this.f8320e;
    }
}
