package com.margelo.nitro.rive;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class p1 extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6969e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1 f6970i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(f1 f1Var, Continuation continuation) {
        super(continuation);
        this.f6970i = f1Var;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f6968d = obj;
        this.f6969e |= Integer.MIN_VALUE;
        return this.f6970i.emit(null, this);
    }
}
