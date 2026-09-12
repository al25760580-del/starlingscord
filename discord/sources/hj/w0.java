package hj;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f10916d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10916d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f10916d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
