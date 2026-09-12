package ar;

import kotlin.Result;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends d1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f2946x;

    public /* synthetic */ n0(int i7, Object obj) {
        this.f2945w = i7;
        this.f2946x = obj;
    }

    @Override // ar.d1
    public final boolean j() {
        switch (this.f2945w) {
        }
        return false;
    }

    @Override // ar.d1
    public final void k(Throwable th2) {
        int i7 = this.f2945w;
        Object obj = this.f2946x;
        switch (i7) {
            case 0:
                ((m0) obj).dispose();
                break;
            case 1:
                ((Function1) obj).invoke(th2);
                break;
            default:
                e1 e1Var = (e1) obj;
                i1 i1VarI = i();
                i1VarI.getClass();
                Object obj2 = i1.f2928d.get(i1VarI);
                if (!(obj2 instanceof r)) {
                    rn.q qVar = Result.f14614e;
                    e1Var.resumeWith(b0.z(obj2));
                } else {
                    rn.q qVar2 = Result.f14614e;
                    e1Var.resumeWith(ib.a.o(((r) obj2).f2958a));
                }
                break;
        }
    }
}
