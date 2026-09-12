package cr;

import ar.a2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends fr.u {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f7387w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f7388x;

    public o(long j, o oVar, h hVar, int i7) {
        super(j, oVar, i7);
        this.f7387w = hVar;
        this.f7388x = new AtomicReferenceArray(j.f7366b * 2);
    }

    @Override // fr.u
    public final int g() {
        return j.f7366b;
    }

    @Override // fr.u
    public final void h(int i7, CoroutineContext coroutineContext) {
        h hVar;
        int i10 = j.f7366b;
        boolean z5 = i7 >= i10;
        if (z5) {
            i7 -= i10;
        }
        this.f7388x.get(i7 * 2);
        while (true) {
            Object objL = l(i7);
            boolean z6 = objL instanceof a2;
            hVar = this.f7387w;
            if (z6 || (objL instanceof x)) {
                if (k(i7, objL, z5 ? j.j : j.k)) {
                    n(i7, null);
                    m(i7, !z5);
                    if (z5) {
                        Intrinsics.checkNotNull(hVar);
                        hVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objL == j.j || objL == j.k) {
                    break;
                }
                if (objL != j.f7371g && objL != j.f7370f) {
                    if (objL == j.f7373i || objL == j.f7368d || objL == j.f7374l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
        n(i7, null);
        if (z5) {
            Intrinsics.checkNotNull(hVar);
            hVar.getClass();
        }
    }

    public final boolean k(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f7388x;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i7) {
        return this.f7388x.get((i7 * 2) + 1);
    }

    public final void m(int i7, boolean z5) {
        if (z5) {
            h hVar = this.f7387w;
            Intrinsics.checkNotNull(hVar);
            hVar.L((this.f9398i * ((long) j.f7366b)) + ((long) i7));
        }
        i();
    }

    public final void n(int i7, Object obj) {
        this.f7388x.set(i7 * 2, obj);
    }

    public final void o(int i7, Object obj) {
        this.f7388x.set((i7 * 2) + 1, obj);
    }
}
