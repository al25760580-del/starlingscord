package dr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends er.e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final xn.h f7710v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final xn.h f7711w;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Function2 function2, CoroutineContext coroutineContext, int i7, cr.a aVar) {
        super(coroutineContext, i7, aVar);
        xn.h hVar = (xn.h) function2;
        this.f7710v = hVar;
        this.f7711w = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // er.e
    public final Object c(ProducerScope producerScope, Continuation continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i7 = bVar.f7709v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                bVar.f7709v = i7 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (xn.c) continuation);
            }
        } else {
            bVar = new b(this, (xn.c) continuation);
        }
        Object obj = bVar.f7707e;
        Object obj2 = wn.a.f22354d;
        int i10 = bVar.f7709v;
        if (i10 == 0) {
            ib.a.L(obj);
            bVar.f7706d = producerScope;
            bVar.f7709v = 1;
            Object objInvoke = this.f7710v.invoke(producerScope, bVar);
            if (objInvoke != obj2) {
                objInvoke = Unit.f14616a;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            producerScope = bVar.f7706d;
            ib.a.L(obj);
        }
        if (producerScope.r()) {
            return Unit.f14616a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function2, xn.h] */
    @Override // er.e
    public final er.e e(CoroutineContext coroutineContext, int i7, cr.a aVar) {
        return new c(this.f7711w, coroutineContext, i7, aVar);
    }

    @Override // er.e
    public final String toString() {
        return "block[" + this.f7710v + "] -> " + super.toString();
    }
}
