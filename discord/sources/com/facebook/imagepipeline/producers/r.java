package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Consumer f5061b;

    public r(Consumer consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.f5061b = consumer;
    }

    @Override // com.facebook.imagepipeline.producers.c
    public void f() {
        this.f5061b.a();
    }

    @Override // com.facebook.imagepipeline.producers.c
    public void g(Throwable t5) {
        Intrinsics.checkNotNullParameter(t5, "t");
        this.f5061b.onFailure(t5);
    }

    @Override // com.facebook.imagepipeline.producers.c
    public void i(float f2) {
        this.f5061b.c(f2);
    }
}
