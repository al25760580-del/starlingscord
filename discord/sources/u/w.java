package u;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class w extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20902e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f20903i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function2 f20904v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f20905w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Function2 function2, l lVar, Continuation continuation, int i7) {
        super(2, continuation);
        this.f20901d = i7;
        this.f20904v = function2;
        this.f20905w = lVar;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f20901d) {
            case 0:
                w wVar = new w(this.f20904v, this.f20905w, continuation, 0);
                wVar.f20903i = obj;
                return wVar;
            default:
                w wVar2 = new w(this.f20904v, this.f20905w, continuation, 1);
                wVar2.f20903i = obj;
                return wVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f20901d) {
            case 0:
                break;
        }
        return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20901d) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                int i7 = this.f20902e;
                if (i7 == 0) {
                    ib.a.L(obj);
                    q qVar = new q(this.f20905w, ((CoroutineScope) this.f20903i).getCoroutineContext());
                    this.f20902e = 1;
                    if (this.f20904v.invoke(qVar, this) == aVar) {
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
                int i10 = this.f20902e;
                if (i10 == 0) {
                    ib.a.L(obj);
                    q qVar2 = new q(this.f20905w, ((CoroutineScope) this.f20903i).getCoroutineContext());
                    this.f20902e = 1;
                    if (this.f20904v.invoke(qVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
        }
    }
}
