package e2;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class n extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f7886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.f7886e = a0Var;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        n nVar = new n(this.f7886e, continuation);
        nVar.f7885d = obj;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((a0) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        ib.a.L(obj);
        a0 a0Var = (a0) this.f7885d;
        a0 a0Var2 = this.f7886e;
        boolean z5 = false;
        if (!(a0Var2 instanceof b) && !(a0Var2 instanceof e) && a0Var == a0Var2) {
            z5 = true;
        }
        return Boolean.valueOf(z5);
    }
}
