package ar;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends k {
    public final i1 F;

    public e1(i1 i1Var, Continuation continuation) {
        super(1, continuation);
        this.F = i1Var;
    }

    @Override // ar.k
    public final Throwable q(i1 i1Var) {
        Throwable thB;
        i1 i1Var2 = this.F;
        i1Var2.getClass();
        Object obj = i1.f2928d.get(i1Var2);
        if (!(obj instanceof g1) || (thB = ((g1) obj).b()) == null) {
            return obj instanceof r ? ((r) obj).f2958a : i1Var.u();
        }
        return thB;
    }

    @Override // ar.k
    public final String z() {
        return "AwaitContinuation";
    }
}
