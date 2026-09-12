package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Flow f6922e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6923i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BaseHybridViewModelPropertyImpl f6924v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Flow flow, int i7, BaseHybridViewModelPropertyImpl baseHybridViewModelPropertyImpl, Continuation continuation) {
        super(2, continuation);
        this.f6922e = flow;
        this.f6923i = i7;
        this.f6924v = baseHybridViewModelPropertyImpl;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f6922e, this.f6923i, this.f6924v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f6921d;
        if (i7 == 0) {
            ib.a.L(obj);
            int i10 = this.f6923i;
            if (i10 < 0) {
                throw new IllegalArgumentException(kk.b.h(i10, "Drop count should be non-negative, but had ").toString());
            }
            c cVar = new c(0, this.f6924v);
            this.f6921d = 1;
            Object objCollect = this.f6922e.collect(new dr.m(new Ref.IntRef(), i10, cVar), this);
            if (objCollect != aVar) {
                objCollect = Unit.f14616a;
            }
            if (objCollect == aVar) {
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
