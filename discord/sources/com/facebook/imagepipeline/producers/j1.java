package com.facebook.imagepipeline.producers;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f5012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentLinkedQueue f5014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f5015d;

    public j1(Executor executor, c1 c1Var) {
        executor.getClass();
        this.f5015d = executor;
        this.f5012a = c1Var;
        this.f5014c = new ConcurrentLinkedQueue();
        this.f5013b = 0;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        boolean z5;
        producerContext.O().c(producerContext, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i7 = this.f5013b;
                z5 = true;
                if (i7 >= 5) {
                    this.f5014c.add(Pair.create(consumer, producerContext));
                } else {
                    this.f5013b = i7 + 1;
                    z5 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            return;
        }
        producerContext.O().i(producerContext, "ThrottlingProducer", null);
        this.f5012a.b(new i1(this, consumer), producerContext);
    }
}
