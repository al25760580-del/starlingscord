package vp;

import ag.w0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Iterator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.cache.tape.c f21921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w0 f21922e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21923i;

    public w(x xVar) {
        io.sentry.cache.tape.c cVar = new io.sentry.cache.tape.c(xVar);
        this.f21921d = cVar;
        this.f21922e = new w0(cVar.a());
        this.f21923i = xVar.f21924e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21923i > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f21922e.hasNext()) {
            this.f21922e = new w0(this.f21921d.a());
        }
        this.f21923i--;
        return Byte.valueOf(this.f21922e.a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
