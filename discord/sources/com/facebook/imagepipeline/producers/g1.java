package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f4987b;

    public g1(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f4986a = executor;
        this.f4987b = new ArrayDeque();
    }
}
