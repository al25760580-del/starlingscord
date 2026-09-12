package com.margelo.nitro.core;

import ar.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static Promise a(f fVar, Function1 run) {
        CoroutineScope scope = Promise.defaultScope;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(run, "run");
        Promise promise = new Promise();
        b0.t(scope, null, new b4.d(run, promise, (Continuation) null), 3);
        return promise;
    }
}
