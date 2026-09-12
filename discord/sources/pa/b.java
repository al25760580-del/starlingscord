package pa;

import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.datastore.preferences.protobuf.d1;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements q8.d {
    public final c5.e E;
    public final w F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f17796d = getClass();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q8.b f17797e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f17798i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final SparseArray f17799v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set f17800w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f17801x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c5.e f17802y;

    public b(q8.b bVar, v vVar, w wVar) {
        bVar.getClass();
        this.f17797e = bVar;
        vVar.getClass();
        this.f17798i = vVar;
        wVar.getClass();
        this.F = wVar;
        SparseArray sparseArray = new SparseArray();
        this.f17799v = sparseArray;
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            try {
                sparseArray.clear();
                SparseIntArray sparseIntArray2 = vVar.f17848c;
                if (sparseIntArray2 != null) {
                    for (int i7 = 0; i7 < sparseIntArray2.size(); i7++) {
                        int iKeyAt = sparseIntArray2.keyAt(i7);
                        int iValueAt = sparseIntArray2.valueAt(i7);
                        int i10 = sparseIntArray.get(iKeyAt, 0);
                        SparseArray sparseArray2 = this.f17799v;
                        int iG = g(iKeyAt);
                        this.f17798i.getClass();
                        sparseArray2.put(iKeyAt, new f(iG, iValueAt, i10));
                    }
                    this.f17801x = false;
                } else {
                    this.f17801x = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f17800w = Collections.newSetFromMap(new IdentityHashMap());
        int i11 = 7;
        this.E = new c5.e(i11);
        this.f17802y = new c5.e(i11);
    }

    public abstract Object a(int i7);

    public final synchronized boolean b(int i7) {
        v vVar = this.f17798i;
        int i10 = vVar.f17846a;
        int i11 = this.f17802y.f3486c;
        if (i7 > i10 - i11) {
            this.F.getClass();
            return false;
        }
        int i12 = vVar.f17847b;
        if (i7 > i12 - (i11 + this.E.f3486c)) {
            l(i12 - i7);
        }
        if (i7 <= i10 - (this.f17802y.f3486c + this.E.f3486c)) {
            return true;
        }
        this.F.getClass();
        return false;
    }

    public abstract void c(Object obj);

    public final synchronized f d(int i7) {
        try {
            f fVar = (f) this.f17799v.get(i7);
            if (fVar == null && this.f17801x) {
                if (o8.a.f17171a.isLoggable(2)) {
                    o8.a.q("creating new bucket %s", Integer.valueOf(i7), this.f17796d);
                }
                int iG = g(i7);
                this.f17798i.getClass();
                f fVar2 = new f(iG, Integer.MAX_VALUE, 0);
                this.f17799v.put(i7, fVar2);
                return fVar2;
            }
            return fVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public abstract int e(int i7);

    public abstract int f(Object obj);

    public abstract int g(int i7);

    @Override // q8.d
    public final Object get(int i7) {
        Object objA;
        Object objH;
        synchronized (this) {
            try {
                n8.i.e(!i() || this.E.f3486c == 0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iE = e(i7);
        synchronized (this) {
            try {
                f fVarD = d(iE);
                if (fVarD != null && (objH = h(fVarD)) != null) {
                    n8.i.e(this.f17800w.add(objH));
                    int iF = f(objH);
                    int iG = g(iF);
                    c5.e eVar = this.f17802y;
                    eVar.f3485b++;
                    eVar.f3486c += iG;
                    this.E.a(iG);
                    this.F.getClass();
                    k();
                    if (o8.a.f17171a.isLoggable(2)) {
                        o8.a.o(this.f17796d, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objH)), Integer.valueOf(iF));
                    }
                    return objH;
                }
                int iG2 = g(iE);
                if (!b(iG2)) {
                    int i10 = this.f17798i.f17846a;
                    int i11 = this.f17802y.f3486c;
                    int i12 = this.E.f3486c;
                    StringBuilder sbR = a3.e.r(i10, "Pool hard cap violation? Hard cap = ", i11, " Used size = ", " Free size = ");
                    sbR.append(i12);
                    sbR.append(" Request size = ");
                    sbR.append(iG2);
                    throw new d1(sbR.toString());
                }
                c5.e eVar2 = this.f17802y;
                eVar2.f3485b++;
                eVar2.f3486c += iG2;
                if (fVarD != null) {
                    fVarD.f17814d++;
                }
                try {
                    objA = a(iE);
                } catch (Throwable th3) {
                    synchronized (this) {
                        this.f17802y.a(iG2);
                        f fVarD2 = d(iE);
                        if (fVarD2 != null) {
                            n8.i.e(fVarD2.f17814d > 0);
                            fVarD2.f17814d--;
                        }
                        if (Error.class.isInstance(th3)) {
                            throw ((Throwable) Error.class.cast(th3));
                        }
                        if (RuntimeException.class.isInstance(th3)) {
                            throw ((Throwable) RuntimeException.class.cast(th3));
                        }
                        objA = null;
                    }
                }
                synchronized (this) {
                    try {
                        n8.i.e(this.f17800w.add(objA));
                        synchronized (this) {
                            if (i()) {
                                l(this.f17798i.f17847b);
                            }
                        }
                        return objA;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                this.F.getClass();
                k();
                if (o8.a.f17171a.isLoggable(2)) {
                    o8.a.o(this.f17796d, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(objA)), Integer.valueOf(iE));
                }
                return objA;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    public synchronized Object h(f fVar) {
        Object objA;
        objA = fVar.a();
        if (objA != null) {
            fVar.f17814d++;
        }
        return objA;
    }

    public final synchronized boolean i() {
        boolean z5;
        z5 = this.f17802y.f3486c + this.E.f3486c > this.f17798i.f17847b;
        if (z5) {
            this.F.getClass();
        }
        return z5;
    }

    public boolean j(Object obj) {
        obj.getClass();
        return true;
    }

    public final void k() {
        if (o8.a.f17171a.isLoggable(2)) {
            c5.e eVar = this.f17802y;
            Integer numValueOf = Integer.valueOf(eVar.f3485b);
            Integer numValueOf2 = Integer.valueOf(eVar.f3486c);
            c5.e eVar2 = this.E;
            Integer numValueOf3 = Integer.valueOf(eVar2.f3485b);
            Integer numValueOf4 = Integer.valueOf(eVar2.f3486c);
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.f17171a.v(this.f17796d.getSimpleName(), String.format(null, "Used = (%d, %d); Free = (%d, %d)", numValueOf, numValueOf2, numValueOf3, numValueOf4));
            }
        }
    }

    public final synchronized void l(int i7) {
        try {
            int i10 = this.f17802y.f3486c;
            int i11 = this.E.f3486c;
            int iMin = Math.min((i10 + i11) - i7, i11);
            if (iMin <= 0) {
                return;
            }
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.p(this.f17796d, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i7), Integer.valueOf(this.f17802y.f3486c + this.E.f3486c), Integer.valueOf(iMin));
            }
            k();
            for (int i12 = 0; i12 < this.f17799v.size() && iMin > 0; i12++) {
                f fVar = (f) this.f17799v.valueAt(i12);
                fVar.getClass();
                while (iMin > 0) {
                    Object objA = fVar.a();
                    if (objA == null) {
                        break;
                    }
                    c(objA);
                    int i13 = fVar.f17811a;
                    iMin -= i13;
                    this.E.a(i13);
                }
            }
            k();
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.o(this.f17796d, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i7), Integer.valueOf(this.f17802y.f3486c + this.E.f3486c));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ad A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:4:0x000c, B:6:0x0015, B:7:0x0016, B:9:0x001e, B:39:0x00e4, B:40:0x00e7, B:14:0x0046, B:17:0x0054, B:19:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x0079, B:28:0x0097, B:25:0x006e, B:30:0x00ad, B:34:0x00b4, B:35:0x00bc, B:37:0x00c4, B:38:0x00d7, B:44:0x00eb, B:5:0x000d), top: B:49:0x000c, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:4:0x000c, B:6:0x0015, B:7:0x0016, B:9:0x001e, B:39:0x00e4, B:40:0x00e7, B:14:0x0046, B:17:0x0054, B:19:0x005a, B:22:0x0061, B:24:0x0065, B:26:0x0079, B:28:0x0097, B:25:0x006e, B:30:0x00ad, B:34:0x00b4, B:35:0x00bc, B:37:0x00c4, B:38:0x00d7, B:44:0x00eb, B:5:0x000d), top: B:49:0x000c, inners: #0 }] */
    @Override // r8.c
    public final void release(Object obj) {
        f fVar;
        boolean z5;
        obj.getClass();
        int iF = f(obj);
        int iG = g(iF);
        synchronized (this) {
            try {
                synchronized (this) {
                    fVar = (f) this.f17799v.get(iF);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!this.f17800w.remove(obj)) {
            o8.a.f(this.f17796d, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iF));
            c(obj);
            this.F.getClass();
        } else if (fVar != null) {
            if (fVar.f17813c.size() + fVar.f17814d <= fVar.f17812b && !i() && j(obj)) {
                int i7 = fVar.f17814d;
                if (i7 > 0) {
                    fVar.f17814d = i7 - 1;
                    fVar.f17813c.add(obj);
                } else {
                    o8.a.i("BUCKET", "Tried to release value %s from an empty bucket!", obj);
                }
                c5.e eVar = this.E;
                eVar.f3485b++;
                eVar.f3486c += iG;
                this.f17802y.a(iG);
                this.F.getClass();
                if (o8.a.f17171a.isLoggable(2)) {
                    o8.a.o(this.f17796d, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iF));
                }
            } else {
                if (fVar != null) {
                    if (fVar.f17814d > 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    n8.i.e(z5);
                    fVar.f17814d--;
                }
                if (o8.a.f17171a.isLoggable(2)) {
                    o8.a.o(this.f17796d, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iF));
                }
                c(obj);
                this.f17802y.a(iG);
                this.F.getClass();
            }
        } else {
            if (fVar != null) {
                if (fVar.f17814d > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                n8.i.e(z5);
                fVar.f17814d--;
            }
            if (o8.a.f17171a.isLoggable(2)) {
                o8.a.o(this.f17796d, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(iF));
            }
            c(obj);
            this.f17802y.a(iG);
            this.F.getClass();
        }
        k();
    }
}
