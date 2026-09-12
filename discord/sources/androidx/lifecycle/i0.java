package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class i0 extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f2368e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f2369i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Lifecycle.State f2370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Function2 f2371w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2369i = lifecycle;
        this.f2370v = state;
        this.f2371w = function2;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        i0 i0Var = new i0(this.f2369i, this.f2370v, this.f2371w, continuation);
        i0Var.f2368e = obj;
        return i0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f2367d;
        if (i7 == 0) {
            ib.a.L(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f2368e;
            hr.e eVar = ar.k0.f2938a;
            br.d dVar = fr.q.f9394a.f3388w;
            h0 h0Var = new h0(this.f2369i, this.f2370v, coroutineScope, this.f2371w, null);
            this.f2367d = 1;
            if (ar.b0.A(dVar, h0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        return Unit.f14616a;
    }
}
