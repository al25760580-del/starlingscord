package ar;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 implements Runnable, Comparable, m0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2960e = -1;

    public r0(long j) {
        this.f2959d = j;
    }

    public final int b(long j, s0 s0Var, kotlinx.coroutines.b bVar) {
        synchronized (this) {
            if (this._heap == b0.f2887b) {
                return 2;
            }
            synchronized (s0Var) {
                try {
                    r0[] r0VarArr = s0Var.f9406a;
                    r0 r0Var = r0VarArr != null ? r0VarArr[0] : null;
                    if (kotlinx.coroutines.b.F.get(bVar) == 1) {
                        return 1;
                    }
                    if (r0Var == null) {
                        s0Var.f2962c = j;
                    } else {
                        long j5 = r0Var.f2959d;
                        if (j5 - j < 0) {
                            j = j5;
                        }
                        if (j - s0Var.f2962c > 0) {
                            s0Var.f2962c = j;
                        }
                    }
                    long j7 = this.f2959d;
                    long j10 = s0Var.f2962c;
                    if (j7 - j10 < 0) {
                        this.f2959d = j10;
                    }
                    s0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(s0 s0Var) {
        if (this._heap == b0.f2887b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = s0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f2959d - ((r0) obj).f2959d;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // ar.m0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                a5.h hVar = b0.f2887b;
                if (obj == hVar) {
                    return;
                }
                s0 s0Var = obj instanceof s0 ? (s0) obj : null;
                if (s0Var != null) {
                    synchronized (s0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof fr.y ? (fr.y) obj2 : null) != null) {
                            s0Var.b(this.f2960e);
                        }
                    }
                }
                this._heap = hVar;
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f2959d + ']';
    }
}
