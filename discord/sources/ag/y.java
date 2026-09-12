package ag;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f599e;

    public y(Object obj) {
        this.f598d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f599e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f599e) {
            throw new NoSuchElementException();
        }
        this.f599e = true;
        return this.f598d;
    }
}
