package com.margelo.nitro.playagerangedeclaration;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import xn.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h implements Function1 {
    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        return new e(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e) create((Continuation) obj)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        ib.a.L(obj);
        return new DeclaredAgeRangeResult(false, null, null, null, null);
    }
}
