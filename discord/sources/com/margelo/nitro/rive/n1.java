package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class n1 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HybridViewModelListProperty f6961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f6962e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f6963i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(HybridViewModelListProperty hybridViewModelListProperty, double d6, double d7, Continuation continuation) {
        super(1, continuation);
        this.f6961d = hybridViewModelListProperty;
        this.f6962e = d6;
        this.f6963i = d7;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        return new n1(this.f6961d, this.f6962e, this.f6963i, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((n1) create((Continuation) obj)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        ib.a.L(obj);
        this.f6961d.swap(this.f6962e, this.f6963i);
        return Unit.f14616a;
    }
}
