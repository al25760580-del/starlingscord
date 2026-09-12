package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ HybridViewModelPropertySpec f6910e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(HybridViewModelPropertySpec hybridViewModelPropertySpec, Continuation continuation, int i7) {
        super(1, continuation);
        this.f6909d = i7;
        this.f6910e = hybridViewModelPropertySpec;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f6909d) {
            case 0:
                return new a1((HybridViewModelBooleanProperty) this.f6910e, continuation, 0);
            case 1:
                return new a1((HybridViewModelColorProperty) this.f6910e, continuation, 1);
            case 2:
                return new a1((HybridViewModelEnumProperty) this.f6910e, continuation, 2);
            case 3:
                return new a1((HybridViewModelListProperty) this.f6910e, continuation, 3);
            case 4:
                return new a1((HybridViewModelNumberProperty) this.f6910e, continuation, 4);
            default:
                return new a1((HybridViewModelStringProperty) this.f6910e, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f6909d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((a1) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f6909d;
        HybridViewModelPropertySpec hybridViewModelPropertySpec = this.f6910e;
        switch (i7) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                ib.a.L(obj);
                return Boolean.valueOf(((HybridViewModelBooleanProperty) hybridViewModelPropertySpec).getValue());
            case 1:
                wn.a aVar2 = wn.a.f22354d;
                ib.a.L(obj);
                return new Double(((HybridViewModelColorProperty) hybridViewModelPropertySpec).getValue());
            case 2:
                wn.a aVar3 = wn.a.f22354d;
                ib.a.L(obj);
                return ((HybridViewModelEnumProperty) hybridViewModelPropertySpec).getValue();
            case 3:
                wn.a aVar4 = wn.a.f22354d;
                ib.a.L(obj);
                return new Double(((HybridViewModelListProperty) hybridViewModelPropertySpec).getLength());
            case 4:
                wn.a aVar5 = wn.a.f22354d;
                ib.a.L(obj);
                return new Double(((HybridViewModelNumberProperty) hybridViewModelPropertySpec).getValue());
            default:
                wn.a aVar6 = wn.a.f22354d;
                ib.a.L(obj);
                return ((HybridViewModelStringProperty) hybridViewModelPropertySpec).getValue();
        }
    }
}
