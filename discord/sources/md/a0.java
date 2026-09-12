package md;

import gc.q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements q, p {
    public q[] E;
    public u4.b F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q[] f15586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IdentityHashMap f15587e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i8.c f15588i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f15589v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final HashMap f15590w = new HashMap();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p f15591x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y0 f15592y;

    public a0(i8.c cVar, long[] jArr, q... qVarArr) {
        this.f15588i = cVar;
        this.f15586d = qVarArr;
        cVar.getClass();
        this.F = new u4.b(24, new q0[0]);
        this.f15587e = new IdentityHashMap();
        this.E = new q[0];
        for (int i7 = 0; i7 < qVarArr.length; i7++) {
            long j = jArr[i7];
            if (j != 0) {
                this.f15586d[i7] = new y(qVarArr[i7], j);
            }
        }
    }

    @Override // md.q0
    public final boolean C() {
        return this.F.C();
    }

    @Override // md.q
    public final long I() {
        long j = -9223372036854775807L;
        for (q qVar : this.E) {
            long jI = qVar.I();
            if (jI == -9223372036854775807L) {
                if (j != -9223372036854775807L && qVar.v(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (q qVar2 : this.E) {
                    if (qVar2 == qVar) {
                        break;
                    }
                    if (qVar2.v(jI) != jI) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jI;
            } else if (jI != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr = new int[pVarArr.length];
        int[] iArr2 = new int[pVarArr.length];
        int i7 = 0;
        int i10 = 0;
        while (true) {
            int length = pVarArr.length;
            identityHashMap = this.f15587e;
            if (i10 >= length) {
                break;
            }
            o0 o0Var = o0VarArr[i10];
            Integer num = o0Var == null ? null : (Integer) identityHashMap.get(o0Var);
            iArr[i10] = num == null ? -1 : num.intValue();
            fe.p pVar = pVarArr[i10];
            if (pVar != null) {
                String str = pVar.c().f15728e;
                iArr2[i10] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = pVarArr.length;
        o0[] o0VarArr2 = new o0[length2];
        o0[] o0VarArr3 = new o0[pVarArr.length];
        fe.p[] pVarArr2 = new fe.p[pVarArr.length];
        q[] qVarArr = this.f15586d;
        ArrayList arrayList = new ArrayList(qVarArr.length);
        long j5 = j;
        int i11 = 0;
        while (i11 < qVarArr.length) {
            int i12 = i7;
            while (i12 < pVarArr.length) {
                o0VarArr3[i12] = iArr[i12] == i11 ? o0VarArr[i12] : null;
                if (iArr2[i12] == i11) {
                    fe.p pVar2 = pVarArr[i12];
                    pVar2.getClass();
                    x0 x0Var = (x0) this.f15590w.get(pVar2.c());
                    x0Var.getClass();
                    pVarArr2[i12] = new x(pVar2, x0Var);
                } else {
                    pVarArr2[i12] = null;
                }
                i12++;
                iArr = iArr;
            }
            int[] iArr3 = iArr;
            q[] qVarArr2 = qVarArr;
            int i13 = i11;
            long jP = qVarArr2[i11].P(pVarArr2, zArr, o0VarArr3, zArr2, j5);
            if (i13 == 0) {
                j5 = jP;
            } else if (jP != j5) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z5 = false;
            for (int i14 = 0; i14 < pVarArr.length; i14++) {
                if (iArr2[i14] == i13) {
                    o0 o0Var2 = o0VarArr3[i14];
                    o0Var2.getClass();
                    o0VarArr2[i14] = o0VarArr3[i14];
                    identityHashMap.put(o0Var2, Integer.valueOf(i13));
                    z5 = true;
                } else if (iArr3[i14] == i13) {
                    je.b.k(o0VarArr3[i14] == null);
                }
            }
            if (z5) {
                arrayList.add(qVarArr2[i13]);
            }
            i11 = i13 + 1;
            qVarArr = qVarArr2;
            iArr = iArr3;
            i7 = 0;
        }
        int i15 = i7;
        System.arraycopy(o0VarArr2, i15, o0VarArr, i15, length2);
        q[] qVarArr3 = (q[]) arrayList.toArray(new q[i15]);
        this.E = qVarArr3;
        this.f15588i.getClass();
        this.F = new u4.b(24, qVarArr3);
        return j5;
    }

    @Override // md.q
    public final y0 Q() {
        y0 y0Var = this.f15592y;
        y0Var.getClass();
        return y0Var;
    }

    @Override // md.q0
    public final long S() {
        return this.F.S();
    }

    @Override // md.q0
    public final void W(long j) {
        this.F.W(j);
    }

    @Override // md.q
    public final long a(long j, q1 q1Var) {
        q[] qVarArr = this.E;
        return (qVarArr.length > 0 ? qVarArr[0] : this.f15586d[0]).a(j, q1Var);
    }

    @Override // md.p0
    public final void c(q0 q0Var) {
        p pVar = this.f15591x;
        pVar.getClass();
        pVar.c(this);
    }

    @Override // md.p
    public final void d(q qVar) {
        ArrayList arrayList = this.f15589v;
        arrayList.remove(qVar);
        if (arrayList.isEmpty()) {
            q[] qVarArr = this.f15586d;
            int i7 = 0;
            for (q qVar2 : qVarArr) {
                i7 += qVar2.Q().f15737d;
            }
            x0[] x0VarArr = new x0[i7];
            int i10 = 0;
            for (int i11 = 0; i11 < qVarArr.length; i11++) {
                y0 y0VarQ = qVarArr[i11].Q();
                int i12 = y0VarQ.f15737d;
                int i13 = 0;
                while (i13 < i12) {
                    x0 x0VarA = y0VarQ.a(i13);
                    x0 x0Var = new x0(i11 + ":" + x0VarA.f15728e, x0VarA.f15730v);
                    this.f15590w.put(x0Var, x0VarA);
                    x0VarArr[i10] = x0Var;
                    i13++;
                    i10++;
                }
            }
            this.f15592y = new y0(x0VarArr);
            p pVar = this.f15591x;
            pVar.getClass();
            pVar.d(this);
        }
    }

    @Override // md.q0
    public final long k() {
        return this.F.k();
    }

    @Override // md.q
    public final void l(p pVar, long j) {
        this.f15591x = pVar;
        ArrayList arrayList = this.f15589v;
        q[] qVarArr = this.f15586d;
        Collections.addAll(arrayList, qVarArr);
        for (q qVar : qVarArr) {
            qVar.l(this, j);
        }
    }

    @Override // md.q
    public final void r() {
        for (q qVar : this.f15586d) {
            qVar.r();
        }
    }

    @Override // md.q
    public final long v(long j) {
        long jV = this.E[0].v(j);
        int i7 = 1;
        while (true) {
            q[] qVarArr = this.E;
            if (i7 >= qVarArr.length) {
                return jV;
            }
            if (qVarArr[i7].v(jV) != jV) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // md.q
    public final void w(long j) {
        for (q qVar : this.E) {
            qVar.w(j);
        }
    }

    @Override // md.q0
    public final boolean z(long j) {
        ArrayList arrayList = this.f15589v;
        if (arrayList.isEmpty()) {
            return this.F.z(j);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((q) arrayList.get(i7)).z(j);
        }
        return false;
    }
}
