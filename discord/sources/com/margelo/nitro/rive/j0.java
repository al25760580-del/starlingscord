package com.margelo.nitro.rive;

import app.rive.runtime.kotlin.fonts.FontFallbackStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends xn.h implements Function1 {
    @Override // xn.a
    public final Continuation create(Continuation continuation) {
        return new j0(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((j0) create((Continuation) obj)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        ib.a.L(obj);
        synchronized (HybridRiveFontConfig.fontsByWeight) {
            HybridRiveFontConfig.fontsByWeight.clear();
            Unit unit = Unit.f14616a;
        }
        FontFallbackStrategy.INSTANCE.setStylePicker(null);
        g0.a(HybridRiveFontConfig.Companion);
        return Unit.f14616a;
    }
}
