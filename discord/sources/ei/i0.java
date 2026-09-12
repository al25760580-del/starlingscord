package ei;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f8314e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8315i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Iterator f8316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f8317w;

    public i0() {
        this.f8313d = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i7 = this.f8313d;
        if (i7 == 4) {
            throw new IllegalStateException();
        }
        int iB = f0.e.b(i7);
        if (iB == 0) {
            return true;
        }
        if (iB == 2) {
            return false;
        }
        this.f8313d = 4;
        switch (this.f8315i) {
            case 0:
                do {
                    Iterator it = this.f8316v;
                    if (!it.hasNext()) {
                        this.f8313d = 3;
                        next = null;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((di.g) this.f8317w).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.f8316v;
                    if (!it2.hasNext()) {
                        this.f8313d = 3;
                        next = null;
                    } else {
                        next = it2.next();
                    }
                    break;
                } while (!((z0) this.f8317w).f8396e.contains(next));
                break;
        }
        this.f8314e = next;
        if (this.f8313d == 3) {
            return false;
        }
        this.f8313d = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f8313d = 2;
        Object obj = this.f8314e;
        this.f8314e = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(Iterator it, di.g gVar) {
        this();
        this.f8315i = 0;
        this.f8316v = it;
        this.f8317w = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(z0 z0Var) {
        this();
        this.f8315i = 1;
        this.f8317w = z0Var;
        this.f8316v = z0Var.f8395d.iterator();
    }
}
