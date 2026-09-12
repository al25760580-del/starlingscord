package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridViewModel f7001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(HybridViewModel hybridViewModel, Continuation continuation, int i7) {
        super(1, continuation);
        this.f7000d = i7;
        this.f7001e = hybridViewModel;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f7000d) {
            case 0:
                return new y0(this.f7001e, continuation, 0);
            case 1:
                return new y0(this.f7001e, continuation, 1);
            case 2:
                return new y0(this.f7001e, continuation, 2);
            default:
                return new y0(this.f7001e, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f7000d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((y0) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f7000d;
        HybridViewModel hybridViewModel = this.f7001e;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                return hybridViewModel.createInstance();
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                return hybridViewModel.createDefaultInstance();
            case 2:
                wn.a aVar3 = wn.a.f22354d;
                ib.a.L(obj);
                return new Double(hybridViewModel.getInstanceCount());
            default:
                wn.a aVar4 = wn.a.f22354d;
                ib.a.L(obj);
                return new Double(hybridViewModel.getPropertyCount());
        }
    }
}
