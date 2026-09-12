package xq;

import androidx.core.view.z0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends k implements Iterator, Continuation, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f23039e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Iterator f23040i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Continuation f23041v;

    @Override // xq.k
    public final void a(Object obj, xn.g frame) {
        this.f23039e = obj;
        this.f23038d = 3;
        this.f23041v = frame;
        wn.a aVar = wn.a.f22354d;
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    @Override // xq.k
    public final Object b(Iterator it, z0 frame) {
        if (!it.hasNext()) {
            return Unit.f14616a;
        }
        this.f23040i = it;
        this.f23038d = 2;
        this.f23041v = frame;
        wn.a aVar = wn.a.f22354d;
        Intrinsics.checkNotNullParameter(frame, "frame");
        return aVar;
    }

    public final RuntimeException d() {
        int i7 = this.f23038d;
        if (i7 == 4) {
            return new NoSuchElementException();
        }
        if (i7 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f23038d);
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f14681d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i7 = this.f23038d;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2 || i7 == 3) {
                        return true;
                    }
                    if (i7 == 4) {
                        return false;
                    }
                    throw d();
                }
                Iterator it = this.f23040i;
                Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.f23038d = 2;
                    return true;
                }
                this.f23040i = null;
            }
            this.f23038d = 5;
            Continuation continuation = this.f23041v;
            Intrinsics.checkNotNull(continuation);
            this.f23041v = null;
            rn.q qVar = Result.f14614e;
            continuation.resumeWith(Unit.f14616a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.f23038d;
        if (i7 == 0 || i7 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i7 == 2) {
            this.f23038d = 1;
            Iterator it = this.f23040i;
            Intrinsics.checkNotNull(it);
            return it.next();
        }
        if (i7 != 3) {
            throw d();
        }
        this.f23038d = 0;
        Object obj = this.f23039e;
        this.f23039e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        ib.a.L(obj);
        this.f23038d = 4;
    }
}
