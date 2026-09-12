package com.margelo.nitro.rive;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f6953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6954e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1 f6955i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(f1 f1Var, Continuation continuation) {
        super(continuation);
        this.f6955i = f1Var;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f6953d = obj;
        this.f6954e |= Integer.MIN_VALUE;
        return this.f6955i.emit(null, this);
    }
}
