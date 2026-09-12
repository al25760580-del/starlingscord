package androidx.lifecycle;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2340d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2341e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f2342i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f2343v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Function2 function2, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f2342i = function2;
        this.f2343v = obj;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f2340d) {
            case 0:
                e0 e0Var = new e0(this.f2342i, continuation);
                e0Var.f2343v = obj;
                return e0Var;
            default:
                return new e0(this.f2342i, this.f2343v, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f2340d) {
            case 0:
                break;
        }
        return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f2340d) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                int i7 = this.f2341e;
                if (i7 == 0) {
                    ib.a.L(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f2343v;
                    this.f2341e = 1;
                    if (this.f2342i.invoke(coroutineScope, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            default:
                wn.a aVar2 = wn.a.f22354d;
                int i10 = this.f2341e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return obj;
                }
                ib.a.L(obj);
                Object obj2 = this.f2343v;
                this.f2341e = 1;
                Object objInvoke = this.f2342i.invoke(obj2, this);
                return objInvoke == aVar2 ? aVar2 : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f2342i = function2;
    }
}
