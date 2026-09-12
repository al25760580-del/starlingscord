package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4.e f4958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f4959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f4960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ta.b f4961e;

    public c1(Executor executor, e4.e eVar, z0 z0Var, boolean z5, ta.b bVar) {
        executor.getClass();
        this.f4957a = executor;
        eVar.getClass();
        this.f4958b = eVar;
        this.f4959c = z0Var;
        bVar.getClass();
        this.f4961e = bVar;
        this.f4960d = z5;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        this.f4959c.b(new b1(this, consumer, producerContext, this.f4960d, this.f4961e), producerContext);
    }
}
