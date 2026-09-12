package com.margelo.nitro.rive;

import app.rive.runtime.kotlin.fonts.FontFallbackStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends xn.h implements Function1 {
    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        return new i0(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i0) create((Continuation) obj)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        ib.a.L(obj);
        FontFallbackStrategy.INSTANCE.setStylePicker(new h0());
        g0.a(HybridRiveFontConfig.Companion);
        return Unit.f14616a;
    }
}
