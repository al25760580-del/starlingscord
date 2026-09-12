package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends xn.h implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i7, Continuation continuation, int i10) {
        super(i7, continuation);
        this.f6966d = i10;
    }

    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        switch (this.f6966d) {
            case 0:
                return new p0(1, continuation, 0);
            default:
                return new p0(1, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.f6966d) {
            case 0:
                break;
        }
        return ((p0) create(continuation)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        Continuation continuation = null;
        switch (this.f6966d) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                int i7 = this.f6967e;
                if (i7 == 0) {
                    ib.a.L(obj);
                    hr.e eVar = ar.k0.f2938a;
                    br.d dVar = fr.q.f9394a;
                    o0 o0Var = new o0(2, continuation, 0);
                    this.f6967e = 1;
                    if (ar.b0.A(dVar, o0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            default:
                wn.a aVar2 = wn.a.f22354d;
                int i10 = this.f6967e;
                if (i10 == 0) {
                    ib.a.L(obj);
                    this.f6967e = 1;
                    throw null;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ib.a.L(obj);
                return Unit.f14616a;
        }
    }
}
