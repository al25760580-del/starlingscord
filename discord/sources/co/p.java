package co;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Iterator, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3776e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f3777i;

    public p(q qVar) {
        this.f3777i = qVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f3775d == null && !this.f3776e) {
            String line = ((BufferedReader) this.f3777i.f3779b).readLine();
            this.f3775d = line;
            if (line == null) {
                this.f3776e = true;
            }
        }
        return this.f3775d != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f3775d;
        this.f3775d = null;
        Intrinsics.checkNotNull(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
