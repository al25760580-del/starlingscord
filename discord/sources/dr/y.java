package dr;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes3.dex */
public class y extends er.b implements MutableSharedFlow, Flow, er.s {
    public Object[] E;
    public long F;
    public long G;
    public int H;
    public int I;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7807w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f7808x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final cr.a f7809y;

    public y(int i7, int i10, cr.a aVar) {
        this.f7807w = i7;
        this.f7808x = i10;
        this.f7809y = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void k(y yVar, FlowCollector flowCollector, Continuation continuation) throws Throwable {
        x xVar;
        y yVar2;
        Throwable th2;
        a0 a0Var;
        FlowCollector flowCollector2;
        Job job;
        if (continuation instanceof x) {
            xVar = (x) continuation;
            int i7 = xVar.f7806y;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                xVar.f7806y = i7 - Integer.MIN_VALUE;
            } else {
                xVar = new x(yVar, continuation);
            }
        } else {
            xVar = new x(yVar, continuation);
        }
        Object obj = xVar.f7804w;
        wn.a aVar = wn.a.f22354d;
        int i10 = xVar.f7806y;
        if (i10 != 0) {
            if (i10 == 1) {
                a0Var = xVar.f7802i;
                FlowCollector flowCollector3 = xVar.f7801e;
                y yVar3 = xVar.f7800d;
                try {
                    ib.a.L(obj);
                    flowCollector2 = flowCollector3;
                    yVar = yVar3;
                    try {
                        job = (Job) xVar.getContext().l(ar.w.f2975e);
                    } catch (Throwable th3) {
                        yVar2 = yVar;
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    yVar2 = yVar3;
                }
            } else {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Job job2 = xVar.f7803v;
                a0Var = xVar.f7802i;
                FlowCollector flowCollector4 = xVar.f7801e;
                yVar2 = xVar.f7800d;
                try {
                    ib.a.L(obj);
                    flowCollector2 = flowCollector4;
                    job = job2;
                    yVar = yVar2;
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
            yVar2.h(a0Var);
            throw th2;
        }
        ib.a.L(obj);
        a0 a0Var2 = (a0) yVar.c();
        try {
            if (flowCollector instanceof g0) {
                xVar.f7800d = yVar;
                xVar.f7801e = flowCollector;
                xVar.f7802i = a0Var2;
                xVar.f7806y = 1;
                if (((g0) flowCollector).a(xVar) == aVar) {
                    return;
                }
            }
            flowCollector2 = flowCollector;
            a0Var = a0Var2;
            job = (Job) xVar.getContext().l(ar.w.f2975e);
        } catch (Throwable th6) {
            yVar2 = yVar;
            th2 = th6;
            a0Var = a0Var2;
        }
        while (true) {
            Object objS = yVar.s(a0Var);
            if (objS == z.f7810a) {
                xVar.f7800d = yVar;
                xVar.f7801e = flowCollector2;
                xVar.f7802i = a0Var;
                xVar.f7803v = job;
                xVar.f7806y = 2;
                if (yVar.i(a0Var, xVar) == aVar) {
                    return;
                }
            } else {
                if (job != null && !job.c()) {
                    throw job.u();
                }
                xVar.f7800d = yVar;
                xVar.f7801e = flowCollector2;
                xVar.f7802i = a0Var;
                xVar.f7803v = job;
                xVar.f7806y = 3;
                if (flowCollector2.emit(objS, xVar) == aVar) {
                    return;
                }
            }
        }
    }

    @Override // er.s
    public final Flow a(CoroutineContext coroutineContext, int i7, cr.a aVar) {
        return ((i7 == 0 || i7 == -3) && aVar == cr.a.f7342d) ? this : new er.g(this, coroutineContext, i7, aVar);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        k(this, flowCollector, continuation);
        return wn.a.f22354d;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean d(Object obj) {
        int i7;
        boolean z5;
        Continuation[] continuationArrN = er.c.f8669a;
        synchronized (this) {
            if (q(obj)) {
                continuationArrN = n(continuationArrN);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        for (Continuation continuation : continuationArrN) {
            if (continuation != null) {
                rn.q qVar = Result.f14614e;
                continuation.resumeWith(Unit.f14616a);
            }
        }
        return z5;
    }

    @Override // er.b
    public final er.d e() {
        a0 a0Var = new a0();
        a0Var.f7704a = -1L;
        return a0Var;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation frame) throws Throwable {
        Throwable th2;
        Continuation[] continuationArrN;
        w wVar;
        if (d(obj)) {
            return Unit.f14616a;
        }
        ar.k kVar = new ar.k(1, wn.f.b(frame));
        kVar.t();
        Continuation[] continuationArrN2 = er.c.f8669a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        rn.q qVar = Result.f14614e;
                        kVar.resumeWith(Unit.f14616a);
                        continuationArrN = n(continuationArrN2);
                        wVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        wVar = new w(this, o() + ((long) (this.H + this.I)), obj, kVar);
                        m(wVar);
                        this.I++;
                        if (this.f7808x == 0) {
                            continuationArrN2 = n(continuationArrN2);
                        }
                        continuationArrN = continuationArrN2;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (wVar != null) {
                    kVar.w(new ar.h(2, wVar));
                }
                for (Continuation continuation : continuationArrN) {
                    if (continuation != null) {
                        rn.q qVar2 = Result.f14614e;
                        continuation.resumeWith(Unit.f14616a);
                    }
                }
                Object objR = kVar.r();
                wn.a aVar = wn.a.f22354d;
                if (objR == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objR != aVar) {
                    objR = Unit.f14616a;
                }
                return objR == aVar ? objR : Unit.f14616a;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // er.b
    public final er.d[] g() {
        return new a0[2];
    }

    public final Object i(a0 a0Var, x frame) {
        ar.k kVar = new ar.k(1, wn.f.b(frame));
        kVar.t();
        synchronized (this) {
            try {
                if (r(a0Var) < 0) {
                    a0Var.f7705b = kVar;
                } else {
                    rn.q qVar = Result.f14614e;
                    kVar.resumeWith(Unit.f14616a);
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object objR = kVar.r();
        wn.a aVar = wn.a.f22354d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.f14616a;
    }

    public final void j() {
        if (this.f7808x != 0 || this.I > 1) {
            Object[] objArr = this.E;
            Intrinsics.checkNotNull(objArr);
            while (this.I > 0 && z.c(objArr, (o() + ((long) (this.H + this.I))) - 1) == z.f7810a) {
                this.I--;
                z.d(objArr, o() + ((long) (this.H + this.I)), null);
            }
        }
    }

    public final void l() {
        er.d[] dVarArr;
        Object[] objArr = this.E;
        Intrinsics.checkNotNull(objArr);
        z.d(objArr, o(), null);
        this.H--;
        long jO = o() + 1;
        if (this.F < jO) {
            this.F = jO;
        }
        if (this.G < jO) {
            if (this.f8663e != 0 && (dVarArr = this.f8662d) != null) {
                for (er.d dVar : dVarArr) {
                    if (dVar != null) {
                        a0 a0Var = (a0) dVar;
                        long j = a0Var.f7704a;
                        if (j >= 0 && j < jO) {
                            a0Var.f7704a = jO;
                        }
                    }
                }
            }
            this.G = jO;
        }
    }

    public final void m(Object obj) {
        int i7 = this.H + this.I;
        Object[] objArrP = this.E;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i7 >= objArrP.length) {
            objArrP = p(objArrP, i7, objArrP.length * 2);
        }
        z.d(objArrP, o() + ((long) i7), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation[] n(Continuation[] continuationArr) {
        er.d[] dVarArr;
        a0 a0Var;
        ar.k kVar;
        int length = continuationArr.length;
        if (this.f8663e != 0 && (dVarArr = this.f8662d) != null) {
            int length2 = dVarArr.length;
            int i7 = 0;
            while (i7 < length2) {
                er.d dVar = dVarArr[i7];
                if (dVar == null || (kVar = (a0Var = (a0) dVar).f7705b) == null || r(a0Var) < 0) {
                    continuationArr = continuationArr;
                } else {
                    if (length >= continuationArr.length) {
                        continuationArr = continuationArr;
                        continuationArr = continuationArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                        continuationArr = objArrCopyOf;
                    }
                    continuationArr = continuationArr;
                    continuationArr = continuationArr;
                    ((Continuation[]) continuationArr)[length] = kVar;
                    a0Var.f7705b = null;
                    length++;
                }
                i7++;
                continuationArr = continuationArr;
            }
            continuationArr = continuationArr;
        }
        return (Continuation[]) continuationArr;
    }

    public final long o() {
        return Math.min(this.G, this.F);
    }

    public final Object[] p(Object[] objArr, int i7, int i10) {
        if (i10 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i10];
        this.E = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i11 = 0; i11 < i7; i11++) {
                long j = ((long) i11) + jO;
                z.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    public final boolean q(Object obj) {
        int i7;
        long jO;
        long j;
        int i10 = this.f8663e;
        int i11 = this.f7807w;
        if (i10 != 0) {
            int i12 = this.H;
            int i13 = this.f7808x;
            if (i12 < i13 || this.G > this.F) {
                m(obj);
                i7 = this.H + 1;
                this.H = i7;
                if (i7 > i13) {
                    l();
                }
                jO = o() + ((long) this.H);
                j = this.F;
                if (((int) (jO - j)) > i11) {
                    t(1 + j, this.G, o() + ((long) this.H), o() + ((long) this.H) + ((long) this.I));
                }
            } else {
                int iOrdinal = this.f7809y.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    m(obj);
                    i7 = this.H + 1;
                    this.H = i7;
                    if (i7 > i13) {
                        l();
                    }
                    jO = o() + ((long) this.H);
                    j = this.F;
                    if (((int) (jO - j)) > i11) {
                        t(1 + j, this.G, o() + ((long) this.H), o() + ((long) this.H) + ((long) this.I));
                    }
                } else if (iOrdinal != 2) {
                    throw new rn.n();
                }
            }
        } else if (i11 != 0) {
            m(obj);
            int i14 = this.H + 1;
            this.H = i14;
            if (i14 > i11) {
                l();
            }
            this.G = o() + ((long) this.H);
            return true;
        }
        return true;
    }

    public final long r(a0 a0Var) {
        long j = a0Var.f7704a;
        if (j < o() + ((long) this.H)) {
            return j;
        }
        if (this.f7808x <= 0 && j <= o() && this.I != 0) {
            return j;
        }
        return -1L;
    }

    public final Object s(a0 a0Var) {
        Object obj;
        Continuation[] continuationArrU = er.c.f8669a;
        synchronized (this) {
            try {
                long jR = r(a0Var);
                if (jR < 0) {
                    obj = z.f7810a;
                } else {
                    long j = a0Var.f7704a;
                    Object[] objArr = this.E;
                    Intrinsics.checkNotNull(objArr);
                    Object objC = z.c(objArr, jR);
                    if (objC instanceof w) {
                        objC = ((w) objC).f7798i;
                    }
                    a0Var.f7704a = jR + 1;
                    Object obj2 = objC;
                    continuationArrU = u(j);
                    obj = obj2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : continuationArrU) {
            if (continuation != null) {
                rn.q qVar = Result.f14614e;
                continuation.resumeWith(Unit.f14616a);
            }
        }
        return obj;
    }

    public final void t(long j, long j5, long j7, long j10) {
        long jMin = Math.min(j5, j);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.E;
            Intrinsics.checkNotNull(objArr);
            z.d(objArr, jO, null);
        }
        this.F = j;
        this.G = j5;
        this.H = (int) (j7 - jMin);
        this.I = (int) (j10 - j7);
    }

    public final Continuation[] u(long j) {
        long j5;
        long j7;
        Continuation[] continuationArr;
        Continuation[] continuationArr2;
        er.d[] dVarArr;
        a5.h hVar = z.f7810a;
        Continuation[] continuationArr3 = er.c.f8669a;
        if (j <= this.G) {
            long jO = o();
            long j10 = ((long) this.H) + jO;
            int i7 = this.f7808x;
            if (i7 == 0 && this.I > 0) {
                j10++;
            }
            int i10 = 0;
            if (this.f8663e != 0 && (dVarArr = this.f8662d) != null) {
                for (er.d dVar : dVarArr) {
                    if (dVar != null) {
                        long j11 = ((a0) dVar).f7704a;
                        if (j11 >= 0 && j11 < j10) {
                            j10 = j11;
                        }
                    }
                }
            }
            if (j10 > this.G) {
                long jO2 = o() + ((long) this.H);
                int iMin = this.f8663e > 0 ? Math.min(this.I, i7 - ((int) (jO2 - j10))) : this.I;
                long j12 = ((long) this.I) + jO2;
                if (iMin > 0) {
                    j7 = 1;
                    Object[] objArr = this.E;
                    Intrinsics.checkNotNull(objArr);
                    Continuation[] continuationArr4 = new Continuation[iMin];
                    long j13 = jO2;
                    while (true) {
                        if (jO2 >= j12) {
                            continuationArr2 = continuationArr4;
                            j5 = j10;
                            break;
                        }
                        Object objC = z.c(objArr, jO2);
                        continuationArr2 = continuationArr4;
                        if (objC != hVar) {
                            Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            w wVar = (w) objC;
                            int i11 = i10 + 1;
                            j5 = j10;
                            continuationArr2[i10] = wVar.f7799v;
                            z.d(objArr, jO2, hVar);
                            z.d(objArr, j13, wVar.f7798i);
                            j13++;
                            if (i11 >= iMin) {
                                break;
                            }
                            i10 = i11;
                        } else {
                            j5 = j10;
                        }
                        jO2++;
                        continuationArr4 = continuationArr2;
                        j10 = j5;
                    }
                    jO2 = j13;
                    continuationArr = continuationArr2;
                } else {
                    j5 = j10;
                    j7 = 1;
                    continuationArr = continuationArr3;
                }
                int i12 = (int) (jO2 - jO);
                long j14 = this.f8663e == 0 ? jO2 : j5;
                long jMax = Math.max(this.F, jO2 - ((long) Math.min(this.f7807w, i12)));
                if (i7 == 0 && jMax < j12) {
                    Object[] objArr2 = this.E;
                    Intrinsics.checkNotNull(objArr2);
                    if (Intrinsics.areEqual(z.c(objArr2, jMax), hVar)) {
                        jO2 += j7;
                        jMax += j7;
                    }
                }
                t(jMax, j14, jO2, j12);
                j();
                return continuationArr.length == 0 ? continuationArr : n(continuationArr);
            }
        }
        return continuationArr3;
    }
}
