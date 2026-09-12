package fr;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9387e = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f9388f = AtomicLongFieldUpdater.newUpdater(p.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a5.h f9389g = new a5.h("REMOVE_FROZEN", 2);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f9393d;

    public p(int i7, boolean z5) {
        this.f9390a = i7;
        this.f9391b = z5;
        int i10 = i7 - 1;
        this.f9392c = i10;
        this.f9393d = new AtomicReferenceArray(i7);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i7 & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9388f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i7 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            int i11 = this.f9392c;
            if (((i10 + 2) & i11) == (i7 & i11)) {
                return 1;
            }
            boolean z5 = this.f9391b;
            AtomicReferenceArray atomicReferenceArray = this.f9393d;
            if (z5 || atomicReferenceArray.get(i10 & i11) == null) {
                if (f9388f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i10 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i10 & i11, obj);
                    p pVarC = this;
                    while ((atomicLongFieldUpdater.get(pVarC) & 1152921504606846976L) != 0) {
                        pVarC = pVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = pVarC.f9393d;
                        int i12 = pVarC.f9392c & i10;
                        Object obj2 = atomicReferenceArray2.get(i12);
                        if ((obj2 instanceof o) && ((o) obj2).f9386a == i10) {
                            atomicReferenceArray2.set(i12, obj);
                        } else {
                            pVarC = null;
                        }
                        if (pVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f9390a;
                if (i13 < 1024 || ((i10 - i7) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f9388f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final p c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        p pVar;
        while (true) {
            atomicLongFieldUpdater = f9388f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                pVar = this;
                break;
            }
            long j5 = 1152921504606846976L | j;
            pVar = this;
            if (atomicLongFieldUpdater.compareAndSet(pVar, j, j5)) {
                j = j5;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9387e;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(this);
            if (pVar2 != null) {
                return pVar2;
            }
            p pVar3 = new p(pVar.f9390a * 2, pVar.f9391b);
            int i7 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i11 = pVar.f9392c;
                int i12 = i7 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object oVar = pVar.f9393d.get(i12);
                if (oVar == null) {
                    oVar = new o(i7);
                }
                pVar3.f9393d.set(pVar3.f9392c & i7, oVar);
                i7++;
            }
            atomicLongFieldUpdater.set(pVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        p pVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9388f;
            long j = atomicLongFieldUpdater.get(pVarC);
            if ((j & 1152921504606846976L) != 0) {
                return f9389g;
            }
            int i7 = (int) (j & 1073741823);
            int i10 = pVarC.f9392c;
            int i11 = i7 & i10;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i10) != i11) {
                AtomicReferenceArray atomicReferenceArray = pVarC.f9393d;
                Object obj = atomicReferenceArray.get(i11);
                boolean z5 = pVarC.f9391b;
                if (obj == null) {
                    if (z5) {
                    }
                } else if (!(obj instanceof o)) {
                    long j5 = (i7 + 1) & 1073741823;
                    if (f9388f.compareAndSet(pVarC, j, (j & (-1073741824)) | j5)) {
                        atomicReferenceArray.set(i11, null);
                        return obj;
                    }
                    pVarC = this;
                    if (z5) {
                        while (true) {
                            long j7 = atomicLongFieldUpdater.get(pVarC);
                            int i12 = (int) (j7 & 1073741823);
                            if ((j7 & 1152921504606846976L) != 0) {
                                pVarC = pVarC.c();
                            } else {
                                p pVar = pVarC;
                                if (f9388f.compareAndSet(pVar, j7, (j7 & (-1073741824)) | j5)) {
                                    pVar.f9393d.set(i12 & pVar.f9392c, null);
                                    pVarC = null;
                                } else {
                                    pVarC = pVar;
                                }
                            }
                            if (pVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
