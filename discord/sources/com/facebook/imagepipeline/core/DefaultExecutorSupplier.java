package com.facebook.imagepipeline.core;

import a5.u;
import ia.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultExecutorSupplier implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f4824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f4825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f4826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f4827d;

    public DefaultExecutorSupplier(int i7) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2, new u("FrescoIoBoundExecutor", 2));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        this.f4824a = executorServiceNewFixedThreadPool;
        ExecutorService executorServiceNewFixedThreadPool2 = Executors.newFixedThreadPool(i7, new u("FrescoDecodeExecutor", 2));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool2, "newFixedThreadPool(...)");
        this.f4825b = executorServiceNewFixedThreadPool2;
        ExecutorService executorServiceNewFixedThreadPool3 = Executors.newFixedThreadPool(i7, new u("FrescoBackgroundExecutor", 2));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool3, "newFixedThreadPool(...)");
        this.f4826c = executorServiceNewFixedThreadPool3;
        ExecutorService executorServiceNewFixedThreadPool4 = Executors.newFixedThreadPool(1, new u("FrescoLightWeightBackgroundExecutor", 2));
        Intrinsics.checkNotNullExpressionValue(executorServiceNewFixedThreadPool4, "newFixedThreadPool(...)");
        this.f4827d = executorServiceNewFixedThreadPool4;
        Intrinsics.checkNotNullExpressionValue(Executors.newScheduledThreadPool(i7, new u("FrescoBackgroundExecutor", 2)), "newScheduledThreadPool(...)");
    }
}
