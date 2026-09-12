package pb;

import ar.b0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import mq.t;
import xn.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f17860e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f17861i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f17862v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t tVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Continuation continuation) {
        super(2, continuation);
        this.f17860e = tVar;
        this.f17861i = objectRef;
        this.f17862v = objectRef2;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f17860e, this.f17861i, this.f17862v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f17859d;
        if (i7 == 0) {
            ib.a.L(obj);
            this.f17859d = 1;
            if (b0.j(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        this.f17860e.invoke(this.f17861i.element, this.f17862v.element);
        return Unit.f14616a;
    }
}
