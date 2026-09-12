package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f5091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultCacheKeyFactory f5092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f5093c;

    public w(Supplier supplier, DefaultCacheKeyFactory defaultCacheKeyFactory, z0 z0Var) {
        this.f5091a = supplier;
        this.f5092b = defaultCacheKeyFactory;
        this.f5093c = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        if (producerContext.Q().f5124d >= 2) {
            producerContext.n("disk", "nil-result_write");
            consumer.b(1, null);
        } else {
            if (producerContext.g().isCacheEnabled(32)) {
                consumer = new v(consumer, producerContext, this.f5091a, this.f5092b);
            }
            this.f5093c.b(consumer, producerContext);
        }
    }
}
