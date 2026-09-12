package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HybridViewModelListProperty f6947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridViewModelInstanceSpec f6948e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f6949i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(HybridViewModelListProperty hybridViewModelListProperty, HybridViewModelInstanceSpec hybridViewModelInstanceSpec, double d6, Continuation continuation) {
        super(1, continuation);
        this.f6947d = hybridViewModelListProperty;
        this.f6948e = hybridViewModelInstanceSpec;
        this.f6949i = d6;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        return new k1(this.f6947d, this.f6948e, this.f6949i, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((k1) create((Continuation) obj)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        ib.a.L(obj);
        this.f6947d.addInstanceAt(this.f6948e, this.f6949i);
        return Unit.f14616a;
    }
}
