package io.sentry.cache.tape;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12553d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12554e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12555i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f12556v;

    public g(h hVar) {
        this.f12556v = hVar;
        this.f12554e = hVar.f12561w.f12551a;
        this.f12555i = hVar.E;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        h hVar = this.f12556v;
        if (hVar.G) {
            throw new IllegalStateException("closed");
        }
        if (hVar.E == this.f12555i) {
            return this.f12553d != hVar.f12560v;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() throws IOException {
        byte[] bArr = h.H;
        h hVar = this.f12556v;
        if (hVar.G) {
            throw new IllegalStateException("closed");
        }
        if (hVar.E != this.f12555i) {
            throw new ConcurrentModificationException();
        }
        int i7 = hVar.f12560v;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        if (this.f12553d >= i7) {
            throw new NoSuchElementException();
        }
        try {
            f fVarY = hVar.y(this.f12554e);
            int i10 = fVarY.f12552b;
            long j = fVarY.f12551a;
            byte[] bArr2 = new byte[i10];
            long j5 = j + 4;
            long jN0 = hVar.n0(j5);
            this.f12554e = jN0;
            if (!hVar.l0(jN0, bArr2, i10)) {
                this.f12553d = hVar.f12560v;
                return bArr;
            }
            this.f12554e = hVar.n0(j5 + ((long) i10));
            this.f12553d++;
            return bArr2;
        } catch (IOException e10) {
            throw e10;
        } catch (OutOfMemoryError unused) {
            hVar.j0();
            this.f12553d = hVar.f12560v;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        h hVar = this.f12556v;
        if (hVar.E != this.f12555i) {
            throw new ConcurrentModificationException();
        }
        if (hVar.f12560v == 0) {
            throw new NoSuchElementException();
        }
        if (this.f12553d != 1) {
            throw new UnsupportedOperationException("Removal is only permitted from the head.");
        }
        hVar.e0(1);
        this.f12555i = hVar.E;
        this.f12553d--;
    }
}
