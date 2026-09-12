package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends e implements ListIterator {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f14640v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, int i7) {
        super(hVar);
        this.f14640v = hVar;
        d dVar = h.f14644d;
        int iA = hVar.a();
        dVar.getClass();
        d.c(i7, iA);
        this.f14638e = i7;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14638e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14638e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f14638e - 1;
        this.f14638e = i7;
        return this.f14640v.get(i7);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14638e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
