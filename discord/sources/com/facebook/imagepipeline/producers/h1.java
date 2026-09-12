package com.facebook.imagepipeline.producers;

import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class h1 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Pair f4998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i1 f4999e;

    public h1(i1 i1Var, Pair pair) {
        this.f4999e = i1Var;
        this.f4998d = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var = this.f4999e.f5006c;
        Pair pair = this.f4998d;
        Consumer consumer = (Consumer) pair.first;
        ProducerContext producerContext = (ProducerContext) pair.second;
        producerContext.O().i(producerContext, "ThrottlingProducer", null);
        j1Var.f5012a.b(new i1(j1Var, consumer), producerContext);
    }
}
