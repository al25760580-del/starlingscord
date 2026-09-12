package er;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d[] f8662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8663e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8664i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a0 f8665v;

    public final d c() {
        d dVarE;
        a0 a0Var;
        synchronized (this) {
            try {
                d[] dVarArrG = this.f8662d;
                if (dVarArrG == null) {
                    dVarArrG = g();
                    this.f8662d = dVarArrG;
                } else if (this.f8663e >= dVarArrG.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(dVarArrG, dVarArrG.length * 2);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    this.f8662d = (d[]) objArrCopyOf;
                    dVarArrG = (d[]) objArrCopyOf;
                }
                int i7 = this.f8664i;
                do {
                    dVarE = dVarArrG[i7];
                    if (dVarE == null) {
                        dVarE = e();
                        dVarArrG[i7] = dVarE;
                    }
                    i7++;
                    if (i7 >= dVarArrG.length) {
                        i7 = 0;
                    }
                    Intrinsics.checkNotNull(dVarE, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVarE.a(this));
                this.f8664i = i7;
                this.f8663e++;
                a0Var = this.f8665v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (a0Var != null) {
            a0Var.v(1);
        }
        return dVarE;
    }

    public abstract d e();

    public final a0 f() {
        a0 a0Var;
        synchronized (this) {
            a0Var = this.f8665v;
            if (a0Var == null) {
                int i7 = this.f8663e;
                a0Var = new a0(1, Integer.MAX_VALUE, cr.a.f7343e);
                a0Var.d(Integer.valueOf(i7));
                this.f8665v = a0Var;
            }
        }
        return a0Var;
    }

    public abstract d[] g();

    public final void h(d dVar) {
        a0 a0Var;
        int i7;
        Continuation[] continuationArrB;
        synchronized (this) {
            try {
                int i10 = this.f8663e - 1;
                this.f8663e = i10;
                a0Var = this.f8665v;
                if (i10 == 0) {
                    this.f8664i = 0;
                }
                Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                continuationArrB = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation continuation : continuationArrB) {
            if (continuation != null) {
                rn.q qVar = Result.f14614e;
                continuation.resumeWith(Unit.f14616a);
            }
        }
        if (a0Var != null) {
            a0Var.v(-1);
        }
    }
}
