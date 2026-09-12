package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridViewModelListProperty f6945e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ HybridViewModelInstanceSpec f6946i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(HybridViewModelListProperty hybridViewModelListProperty, HybridViewModelInstanceSpec hybridViewModelInstanceSpec, Continuation continuation, int i7) {
        super(1, continuation);
        this.f6944d = i7;
        this.f6945e = hybridViewModelListProperty;
        this.f6946i = hybridViewModelInstanceSpec;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f6944d) {
            case 0:
                return new j1(this.f6945e, this.f6946i, continuation, 0);
            default:
                return new j1(this.f6945e, this.f6946i, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f6944d) {
            case 0:
                break;
        }
        return ((j1) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6944d;
        HybridViewModelInstanceSpec hybridViewModelInstanceSpec = this.f6946i;
        HybridViewModelListProperty hybridViewModelListProperty = this.f6945e;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                hybridViewModelListProperty.addInstance(hybridViewModelInstanceSpec);
                break;
            default:
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                hybridViewModelListProperty.removeInstance(hybridViewModelInstanceSpec);
                break;
        }
        return Unit.f14616a;
    }
}
