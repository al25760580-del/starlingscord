package hi;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gn.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10779f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f10775b = atomicReferenceFieldUpdater;
        this.f10776c = atomicReferenceFieldUpdater2;
        this.f10777d = atomicReferenceFieldUpdater3;
        this.f10778e = atomicReferenceFieldUpdater4;
        this.f10779f = atomicReferenceFieldUpdater5;
    }

    @Override // gn.h
    public final void P(l lVar, l lVar2) {
        this.f10776c.lazySet(lVar, lVar2);
    }

    @Override // gn.h
    public final void Q(l lVar, Thread thread) {
        this.f10775b.lazySet(lVar, thread);
    }

    @Override // gn.h
    public final boolean k(m mVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10778e;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == cVar);
        return false;
    }

    @Override // gn.h
    public final boolean l(m mVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10779f;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == obj);
        return false;
    }

    @Override // gn.h
    public final boolean m(m mVar, l lVar, l lVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10777d;
            if (atomicReferenceFieldUpdater.compareAndSet(mVar, lVar, lVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(mVar) == lVar);
        return false;
    }

    @Override // gn.h
    public final c x(m mVar) {
        return (c) this.f10778e.getAndSet(mVar, c.f10771d);
    }

    @Override // gn.h
    public final l y(m mVar) {
        return (l) this.f10777d.getAndSet(mVar, l.f10786c);
    }
}
