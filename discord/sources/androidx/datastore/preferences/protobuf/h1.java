package androidx.datastore.preferences.protobuf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f1868d;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1868d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f1868d.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
