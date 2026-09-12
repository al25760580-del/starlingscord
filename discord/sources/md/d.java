package md;

import gc.q1;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements q, p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f15599e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c[] f15600i = new c[0];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f15601v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f15602w;

    public d(q qVar, long j) {
        this.f15598d = qVar;
        this.f15602w = j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q0] */
    @Override // md.q0
    public final boolean C() {
        return this.f15598d.C();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, md.q] */
    @Override // md.q
    public final long I() {
        if (b()) {
            long j = this.f15601v;
            this.f15601v = -9223372036854775807L;
            long jI = I();
            return jI != -9223372036854775807L ? jI : j;
        }
        long jI2 = this.f15598d.I();
        if (jI2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        je.b.k(jI2 >= 0);
        long j5 = this.f15602w;
        je.b.k(j5 == Long.MIN_VALUE || jI2 <= j5);
        return jI2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, md.q] */
    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) {
        boolean z5;
        this.f15600i = new c[o0VarArr.length];
        o0[] o0VarArr2 = new o0[o0VarArr.length];
        int i7 = 0;
        while (true) {
            o0 o0Var = null;
            if (i7 >= o0VarArr.length) {
                break;
            }
            c[] cVarArr = this.f15600i;
            c cVar = (c) o0VarArr[i7];
            cVarArr[i7] = cVar;
            if (cVar != null) {
                o0Var = cVar.f15593d;
            }
            o0VarArr2[i7] = o0Var;
            i7++;
        }
        long jP = this.f15598d.P(pVarArr, zArr, o0VarArr2, zArr2, j);
        this.f15601v = -9223372036854775807L;
        if (jP != j) {
            if (jP >= 0) {
                long j5 = this.f15602w;
                z5 = j5 == Long.MIN_VALUE || jP <= j5;
            }
        }
        je.b.k(z5);
        for (int i10 = 0; i10 < o0VarArr.length; i10++) {
            o0 o0Var2 = o0VarArr2[i10];
            if (o0Var2 == null) {
                this.f15600i[i10] = null;
            } else {
                c[] cVarArr2 = this.f15600i;
                c cVar2 = cVarArr2[i10];
                if (cVar2 == null || cVar2.f15593d != o0Var2) {
                    cVarArr2[i10] = new c(this, o0Var2);
                }
            }
            o0VarArr[i10] = this.f15600i[i10];
        }
        return jP;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q] */
    @Override // md.q
    public final y0 Q() {
        return this.f15598d.Q();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q0] */
    @Override // md.q0
    public final long S() {
        long jS = this.f15598d.S();
        if (jS != Long.MIN_VALUE) {
            long j = this.f15602w;
            if (j == Long.MIN_VALUE || jS < j) {
                return jS;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q0] */
    @Override // md.q0
    public final void W(long j) {
        this.f15598d.W(j);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, md.q] */
    @Override // md.q
    public final long a(long j, q1 q1Var) {
        if (j == 0) {
            return 0L;
        }
        long j5 = je.e0.j(q1Var.f9829a, 0L, j);
        long j7 = q1Var.f9830b;
        long j10 = this.f15602w;
        long j11 = je.e0.j(j7, 0L, j10 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j10 - j);
        if (j5 != q1Var.f9829a || j11 != q1Var.f9830b) {
            q1Var = new q1(j5, j11);
        }
        return this.f15598d.a(j, q1Var);
    }

    public final boolean b() {
        return this.f15601v != -9223372036854775807L;
    }

    @Override // md.p0
    public final void c(q0 q0Var) {
        p pVar = this.f15599e;
        pVar.getClass();
        pVar.c(this);
    }

    @Override // md.p
    public final void d(q qVar) {
        p pVar = this.f15599e;
        pVar.getClass();
        pVar.d(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q0] */
    @Override // md.q0
    public final long k() {
        long jK = this.f15598d.k();
        if (jK != Long.MIN_VALUE) {
            long j = this.f15602w;
            if (j == Long.MIN_VALUE || jK < j) {
                return jK;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, md.q] */
    @Override // md.q
    public final void l(p pVar, long j) {
        this.f15599e = pVar;
        this.f15598d.l(this, j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q] */
    @Override // md.q
    public final void r() {
        this.f15598d.r();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, md.q] */
    @Override // md.q
    public final long v(long j) {
        this.f15601v = -9223372036854775807L;
        boolean z5 = false;
        for (c cVar : this.f15600i) {
            if (cVar != null) {
                cVar.f15594e = false;
            }
        }
        long jV = this.f15598d.v(j);
        if (jV == j) {
            z5 = true;
        } else if (jV >= 0) {
            long j5 = this.f15602w;
            if (j5 == Long.MIN_VALUE || jV <= j5) {
                z5 = true;
            }
        }
        je.b.k(z5);
        return jV;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q] */
    @Override // md.q
    public final void w(long j) {
        this.f15598d.w(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, md.q0] */
    @Override // md.q0
    public final boolean z(long j) {
        return this.f15598d.z(j);
    }
}
