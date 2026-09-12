package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6957d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridViewModelListProperty f6958e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ double f6959i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(HybridViewModelListProperty hybridViewModelListProperty, double d6, Continuation continuation, int i7) {
        super(1, continuation);
        this.f6957d = i7;
        this.f6958e = hybridViewModelListProperty;
        this.f6959i = d6;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f6957d) {
            case 0:
                return new m1(this.f6958e, this.f6959i, continuation, 0);
            default:
                return new m1(this.f6958e, this.f6959i, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f6957d) {
            case 0:
                break;
        }
        return ((m1) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6957d;
        double d6 = this.f6959i;
        HybridViewModelListProperty hybridViewModelListProperty = this.f6958e;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                return hybridViewModelListProperty.getInstanceAt(d6);
            default:
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                hybridViewModelListProperty.removeInstanceAt(d6);
                return Unit.f14616a;
        }
    }
}
