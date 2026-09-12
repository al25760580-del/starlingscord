package gc;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u1 f9937a = new u1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v1 f9938b = new v1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc.a f9939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final je.a0 f9940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v0 f9944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public v0 f9945i;
    public v0 j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f9946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9947m;

    public x0(hc.a aVar, je.a0 a0Var) {
        this.f9939c = aVar;
        this.f9940d = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062 A[LOOP:0: B:3:0x0013->B:28:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[EDGE_INSN: B:40:0x006d->B:29:0x006d BREAK  A[LOOP:0: B:3:0x0013->B:28:0x0062], SYNTHETIC] */
    public static md.s m(Timeline timeline, Object obj, long j, long j5, v1 v1Var, u1 u1Var) {
        timeline.g(obj, u1Var);
        timeline.n(u1Var.f9888i, v1Var);
        int iB = timeline.b(obj);
        Object obj2 = obj;
        while (true) {
            int i7 = u1Var.f9892y.f16557d;
            if (i7 == 0) {
                break;
            }
            if ((i7 == 1 && u1Var.g(0)) || !u1Var.h(u1Var.f9892y.f16560v)) {
                break;
            }
            long j7 = 0;
            if (u1Var.c(0L) != -1) {
                break;
            }
            if (u1Var.f9889v == 0) {
                if (iB <= v1Var.M) {
                    break;
                    break;
                }
                timeline.f(iB, u1Var, true);
                obj2 = u1Var.f9887e;
                obj2.getClass();
                iB++;
            } else {
                int i10 = i7 - (u1Var.g(i7 + (-1)) ? 2 : 1);
                for (int i11 = 0; i11 <= i10; i11++) {
                    j7 += u1Var.f9892y.a(i11).f16554y;
                }
                if (u1Var.f9889v > j7) {
                    break;
                }
                if (iB <= v1Var.M) {
                    break;
                }
                timeline.f(iB, u1Var, true);
                obj2 = u1Var.f9887e;
                obj2.getClass();
                iB++;
            }
        }
        timeline.g(obj2, u1Var);
        int iC = u1Var.c(j);
        return iC == -1 ? new md.s(obj2, j5, u1Var.b(j)) : new md.s(obj2, iC, u1Var.f(iC), j5, -1);
    }

    public final v0 a() {
        v0 v0Var = this.f9944h;
        if (v0Var == null) {
            return null;
        }
        if (v0Var == this.f9945i) {
            this.f9945i = v0Var.f9902l;
        }
        v0Var.f();
        int i7 = this.k - 1;
        this.k = i7;
        if (i7 == 0) {
            this.j = null;
            v0 v0Var2 = this.f9944h;
            this.f9946l = v0Var2.f9894b;
            this.f9947m = v0Var2.f9898f.f9917a.f15692d;
        }
        this.f9944h = this.f9944h.f9902l;
        k();
        return this.f9944h;
    }

    public final void b() {
        if (this.k == 0) {
            return;
        }
        v0 v0Var = this.f9944h;
        je.b.l(v0Var);
        this.f9946l = v0Var.f9894b;
        this.f9947m = v0Var.f9898f.f9917a.f15692d;
        while (v0Var != null) {
            v0Var.f();
            v0Var = v0Var.f9902l;
        }
        this.f9944h = null;
        this.j = null;
        this.f9945i = null;
        this.k = 0;
        k();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    public final w0 c(Timeline timeline, v0 v0Var, long j) {
        Object obj;
        long j5;
        long j7;
        long j10;
        w0 w0Var = v0Var.f9898f;
        md.s sVar = w0Var.f9917a;
        long j11 = w0Var.f9919c;
        int iD = timeline.d(timeline.b(sVar.f15689a), this.f9937a, this.f9938b, this.f9942f, this.f9943g);
        if (iD == -1) {
            return null;
        }
        u1 u1Var = this.f9937a;
        int i7 = timeline.f(iD, u1Var, true).f9888i;
        Object obj2 = u1Var.f9887e;
        obj2.getClass();
        long j12 = sVar.f15692d;
        long j13 = 0;
        if (timeline.m(i7, this.f9938b, 0L).L == iD) {
            Pair pairJ = timeline.j(this.f9938b, this.f9937a, i7, -9223372036854775807L, Math.max(0L, j));
            if (pairJ == null) {
                return null;
            }
            Object obj3 = pairJ.first;
            long jLongValue = ((Long) pairJ.second).longValue();
            v0 v0Var2 = v0Var.f9902l;
            if (v0Var2 == null || !v0Var2.f9894b.equals(obj3)) {
                j12 = this.f9941e;
                this.f9941e = 1 + j12;
            } else {
                j12 = v0Var2.f9898f.f9917a.f15692d;
            }
            obj = obj3;
            j5 = jLongValue;
            j13 = -9223372036854775807L;
        } else {
            obj = obj2;
            j5 = 0;
        }
        md.s sVarM = m(timeline, obj, j5, j12, this.f9938b, this.f9937a);
        if (j13 == -9223372036854775807L || j11 == -9223372036854775807L) {
            j7 = j5;
            j10 = j13;
        } else {
            int i10 = timeline.g(sVar.f15689a, u1Var).f9892y.f16557d;
            int i11 = u1Var.f9892y.f16560v;
            boolean z5 = i10 > 0 && u1Var.h(i11) && (i10 > 1 || u1Var.d(i11) != Long.MIN_VALUE);
            if (sVarM.a() && z5) {
                j7 = j5;
                j10 = j11;
            } else {
                if (z5) {
                    j7 = j11;
                } else {
                    j7 = j5;
                }
                j10 = j13;
            }
        }
        return e(timeline, sVarM, j10, j7);
    }

    public final w0 d(Timeline timeline, v0 v0Var, long j) {
        Timeline timeline2;
        w0 w0Var = v0Var.f9898f;
        long j5 = (v0Var.f9905o + w0Var.f9921e) - j;
        if (w0Var.f9923g) {
            return c(timeline, v0Var, j5);
        }
        md.s sVar = w0Var.f9917a;
        Object obj = sVar.f15689a;
        int i7 = sVar.f15693e;
        u1 u1Var = this.f9937a;
        timeline.g(obj, u1Var);
        if (!sVar.a()) {
            if (i7 != -1 && u1Var.g(i7)) {
                return c(timeline, v0Var, j5);
            }
            int iF = u1Var.f(i7);
            boolean z5 = u1Var.h(i7) && u1Var.e(i7, iF) == 3;
            if (iF != u1Var.f9892y.a(i7).f16549e && !z5) {
                return f(timeline, sVar.f15689a, sVar.f15693e, iF, w0Var.f9921e, sVar.f15692d);
            }
            timeline.g(obj, u1Var);
            long jD = u1Var.d(i7);
            return g(timeline, sVar.f15689a, jD == Long.MIN_VALUE ? u1Var.f9889v : u1Var.f9892y.a(i7).f16554y + jD, w0Var.f9921e, sVar.f15692d);
        }
        int i10 = sVar.f15690b;
        int i11 = u1Var.f9892y.a(i10).f16549e;
        if (i11 == -1) {
            return null;
        }
        int iA = u1Var.f9892y.a(i10).a(sVar.f15691c);
        if (iA < i11) {
            return f(timeline, sVar.f15689a, i10, iA, w0Var.f9919c, sVar.f15692d);
        }
        long jLongValue = w0Var.f9919c;
        if (jLongValue == -9223372036854775807L) {
            Pair pairJ = timeline.j(this.f9938b, u1Var, u1Var.f9888i, -9223372036854775807L, Math.max(0L, j5));
            timeline2 = timeline;
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            timeline2 = timeline;
        }
        int i12 = sVar.f15690b;
        timeline2.g(obj, u1Var);
        long jD2 = u1Var.d(i12);
        return g(timeline, sVar.f15689a, Math.max(jD2 == Long.MIN_VALUE ? u1Var.f9889v : u1Var.f9892y.a(i12).f16554y + jD2, jLongValue), w0Var.f9919c, sVar.f15692d);
    }

    public final w0 e(Timeline timeline, md.s sVar, long j, long j5) {
        timeline.g(sVar.f15689a, this.f9937a);
        return sVar.a() ? f(timeline, sVar.f15689a, sVar.f15690b, sVar.f15691c, j, sVar.f15692d) : g(timeline, sVar.f15689a, j5, j, sVar.f15692d);
    }

    public final w0 f(Timeline timeline, Object obj, int i7, int i10, long j, long j5) {
        md.s sVar = new md.s(obj, i7, i10, j5, -1);
        u1 u1Var = this.f9937a;
        long jA = timeline.g(obj, u1Var).a(i7, i10);
        long jMax = i10 == u1Var.f(i7) ? u1Var.f9892y.f16558e : 0L;
        boolean zH = u1Var.h(i7);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new w0(sVar, jMax, j, -9223372036854775807L, jA, zH, false, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    public final w0 g(Timeline timeline, Object obj, long j, long j5, long j7) {
        boolean z5;
        boolean z6;
        long j10;
        long jD;
        long j11;
        long jMax = j;
        u1 u1Var = this.f9937a;
        timeline.g(obj, u1Var);
        int iB = u1Var.b(jMax);
        boolean z7 = iB != -1 && u1Var.g(iB);
        if (iB == -1) {
            nd.b bVar = u1Var.f9892y;
            if (bVar.f16557d <= 0 || !u1Var.h(bVar.f16560v)) {
                z6 = false;
            } else {
                z6 = true;
            }
        } else if (u1Var.h(iB) && u1Var.d(iB) == u1Var.f9889v) {
            nd.a aVarA = u1Var.f9892y.a(iB);
            int i7 = aVarA.f16549e;
            if (i7 == -1) {
                z5 = true;
                break;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= i7) {
                    z5 = false;
                    break;
                }
                int i11 = aVarA.f16552w[i10];
                if (i11 == 0 || i11 == 1) {
                    z5 = true;
                    break;
                }
                i10++;
            }
            if (z5) {
                z6 = false;
            } else {
                z6 = true;
                iB = -1;
            }
        } else {
            z6 = false;
        }
        md.s sVar = new md.s(obj, j7, iB);
        boolean z10 = !sVar.a() && iB == -1;
        boolean zJ = j(timeline, sVar);
        boolean zI = i(timeline, sVar, z10);
        boolean z11 = (iB == -1 || !u1Var.h(iB) || z7) ? false : true;
        if (iB == -1 || z7) {
            if (z6) {
                jD = u1Var.f9889v;
            } else {
                j10 = -9223372036854775807L;
            }
            if (j10 != -9223372036854775807L || j10 == Long.MIN_VALUE) {
                j11 = u1Var.f9889v;
            } else {
                j11 = j10;
            }
            if (j11 != -9223372036854775807L && jMax >= j11) {
                jMax = Math.max(0L, j11 - ((long) ((zI && z6) ? 0 : 1)));
            }
            return new w0(sVar, jMax, j5, j10, j11, z11, z10, zJ, zI);
        }
        jD = u1Var.d(iB);
        j10 = jD;
        if (j10 != -9223372036854775807L) {
            j11 = u1Var.f9889v;
        } else {
            j11 = u1Var.f9889v;
        }
        if (j11 != -9223372036854775807L) {
            jMax = Math.max(0L, j11 - ((long) ((zI && z6) ? 0 : 1)));
        }
        return new w0(sVar, jMax, j5, j10, j11, z11, z10, zJ, zI);
    }

    public final w0 h(Timeline timeline, w0 w0Var) {
        long jA;
        boolean zH;
        md.s sVar = w0Var.f9917a;
        boolean zA = sVar.a();
        int i7 = sVar.f15693e;
        boolean z5 = !zA && i7 == -1;
        int i10 = sVar.f15690b;
        boolean zJ = j(timeline, sVar);
        boolean zI = i(timeline, sVar, z5);
        Object obj = sVar.f15689a;
        u1 u1Var = this.f9937a;
        timeline.g(obj, u1Var);
        long jD = (sVar.a() || i7 == -1) ? -9223372036854775807L : u1Var.d(i7);
        if (sVar.a()) {
            jA = u1Var.a(i10, sVar.f15691c);
        } else {
            jA = (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? u1Var.f9889v : jD;
        }
        if (sVar.a()) {
            zH = u1Var.h(i10);
        } else {
            zH = i7 != -1 && u1Var.h(i7);
        }
        return new w0(sVar, w0Var.f9918b, w0Var.f9919c, jD, jA, zH, z5, zJ, zI);
    }

    public final boolean i(Timeline timeline, md.s sVar, boolean z5) {
        int iB = timeline.b(sVar.f15689a);
        if (!timeline.m(timeline.f(iB, this.f9937a, false).f9888i, this.f9938b, 0L).F) {
            if (timeline.d(iB, this.f9937a, this.f9938b, this.f9942f, this.f9943g) == -1 && z5) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(Timeline timeline, md.s sVar) {
        boolean z5 = !sVar.a() && sVar.f15693e == -1;
        Object obj = sVar.f15689a;
        if (z5) {
            if (timeline.m(timeline.g(obj, this.f9937a).f9888i, this.f9938b, 0L).M == timeline.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        ei.c0 c0Var = ei.e0.f8303e;
        ei.b0 b0Var = new ei.b0();
        for (v0 v0Var = this.f9944h; v0Var != null; v0Var = v0Var.f9902l) {
            b0Var.a(v0Var.f9898f.f9917a);
        }
        v0 v0Var2 = this.f9945i;
        this.f9940d.c(new ac.a(this, b0Var, v0Var2 == null ? null : v0Var2.f9898f.f9917a, 16));
    }

    public final boolean l(v0 v0Var) {
        boolean z5 = false;
        je.b.k(v0Var != null);
        if (v0Var.equals(this.j)) {
            return false;
        }
        this.j = v0Var;
        while (true) {
            v0Var = v0Var.f9902l;
            if (v0Var == null) {
                break;
            }
            if (v0Var == this.f9945i) {
                this.f9945i = this.f9944h;
                z5 = true;
            }
            v0Var.f();
            this.k--;
        }
        v0 v0Var2 = this.j;
        if (v0Var2.f9902l != null) {
            v0Var2.b();
            v0Var2.f9902l = null;
            v0Var2.c();
        }
        k();
        return z5;
    }

    public final md.s n(Timeline timeline, Object obj, long j) {
        long j5;
        int iB;
        Object obj2 = obj;
        u1 u1Var = this.f9937a;
        int i7 = timeline.g(obj2, u1Var).f9888i;
        Object obj3 = this.f9946l;
        if (obj3 == null || (iB = timeline.b(obj3)) == -1 || timeline.f(iB, u1Var, false).f9888i != i7) {
            v0 v0Var = this.f9944h;
            while (true) {
                if (v0Var == null) {
                    v0 v0Var2 = this.f9944h;
                    while (true) {
                        if (v0Var2 == null) {
                            j5 = this.f9941e;
                            this.f9941e = 1 + j5;
                            if (this.f9944h != null) {
                                break;
                            }
                            this.f9946l = obj2;
                            this.f9947m = j5;
                            break;
                        }
                        int iB2 = timeline.b(v0Var2.f9894b);
                        if (iB2 != -1 && timeline.f(iB2, u1Var, false).f9888i == i7) {
                            j5 = v0Var2.f9898f.f9917a.f15692d;
                            break;
                        }
                        v0Var2 = v0Var2.f9902l;
                    }
                } else {
                    if (v0Var.f9894b.equals(obj2)) {
                        j5 = v0Var.f9898f.f9917a.f15692d;
                        break;
                    }
                    v0Var = v0Var.f9902l;
                }
            }
        } else {
            j5 = this.f9947m;
        }
        timeline.g(obj2, u1Var);
        int i10 = u1Var.f9888i;
        v1 v1Var = this.f9938b;
        timeline.n(i10, v1Var);
        boolean z5 = false;
        for (int iB3 = timeline.b(obj); iB3 >= v1Var.L; iB3--) {
            timeline.f(iB3, u1Var, true);
            boolean z6 = u1Var.f9892y.f16557d > 0;
            z5 |= z6;
            if (u1Var.c(u1Var.f9889v) != -1) {
                obj2 = u1Var.f9887e;
                obj2.getClass();
            }
            if (z5 && (!z6 || u1Var.f9889v != 0)) {
                break;
            }
        }
        return m(timeline, obj2, j, j5, this.f9938b, this.f9937a);
    }

    public final boolean o(Timeline timeline) {
        Timeline timeline2;
        v0 v0Var;
        v0 v0Var2 = this.f9944h;
        if (v0Var2 == null) {
            return true;
        }
        int iB = timeline.b(v0Var2.f9894b);
        while (true) {
            timeline2 = timeline;
            iB = timeline2.d(iB, this.f9937a, this.f9938b, this.f9942f, this.f9943g);
            while (true) {
                v0Var = v0Var2.f9902l;
                if (v0Var == null || v0Var2.f9898f.f9923g) {
                    break;
                }
                v0Var2 = v0Var;
            }
            if (iB == -1 || v0Var == null || timeline2.b(v0Var.f9894b) != iB) {
                break;
            }
            v0Var2 = v0Var;
            timeline = timeline2;
        }
        boolean zL = l(v0Var2);
        v0Var2.f9898f = h(timeline2, v0Var2.f9898f);
        return !zL;
    }

    public final boolean p(Timeline timeline, long j, long j5) {
        boolean zL;
        w0 w0VarH;
        v0 v0Var = this.f9944h;
        v0 v0Var2 = null;
        while (v0Var != null) {
            w0 w0Var = v0Var.f9898f;
            if (v0Var2 != null) {
                w0 w0VarD = d(timeline, v0Var2, j);
                if (w0VarD == null) {
                    zL = l(v0Var2);
                } else if (w0Var.f9918b == w0VarD.f9918b && w0Var.f9917a.equals(w0VarD.f9917a)) {
                    w0VarH = w0VarD;
                } else {
                    zL = l(v0Var2);
                }
                return !zL;
            }
            w0VarH = h(timeline, w0Var);
            long j7 = w0VarH.f9921e;
            v0Var.f9898f = w0VarH.a(w0Var.f9919c);
            long j10 = w0Var.f9921e;
            if (j10 == -9223372036854775807L || j10 == j7) {
                v0Var2 = v0Var;
                v0Var = v0Var.f9902l;
            } else {
                v0Var.h();
                boolean z5 = v0Var == this.f9945i && !v0Var.f9898f.f9922f && (j5 == Long.MIN_VALUE || j5 >= ((j7 > (-9223372036854775807L) ? 1 : (j7 == (-9223372036854775807L) ? 0 : -1)) == 0 ? LongCompanionObject.MAX_VALUE : v0Var.f9905o + j7));
                if (l(v0Var) || z5) {
                    return false;
                }
            }
        }
        return true;
    }
}
