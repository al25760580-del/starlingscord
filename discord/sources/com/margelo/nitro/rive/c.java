package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6915e;

    public /* synthetic */ c(int i7, Object obj) {
        this.f6914d = i7;
        this.f6915e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        dr.j jVar;
        Object obj2;
        switch (this.f6914d) {
            case 0:
                ((BaseHybridViewModelPropertyImpl) this.f6915e).onChanged(obj);
                return Unit.f14616a;
            case 1:
                if (continuation instanceof dr.j) {
                    jVar = (dr.j) continuation;
                    int i7 = jVar.f7756i;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        jVar.f7756i = i7 - Integer.MIN_VALUE;
                    } else {
                        jVar = new dr.j(this, continuation);
                    }
                } else {
                    jVar = new dr.j(this, continuation);
                }
                Object obj3 = jVar.f7754d;
                Object obj4 = wn.a.f22354d;
                int i10 = jVar.f7756i;
                if (i10 == 0) {
                    ib.a.L(obj3);
                    ProducerScope producerScope = (ProducerScope) this.f6915e;
                    if (obj == 0) {
                        obj2 = obj;
                        obj2 = er.c.f8670b;
                    }
                    obj2 = obj;
                    jVar.f7756i = 1;
                    if (producerScope.p(obj2, jVar) == obj4) {
                        return obj4;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj3);
                }
                return Unit.f14616a;
            default:
                ((Ref.ObjectRef) this.f6915e).element = obj;
                throw new er.a(this);
        }
    }
}
