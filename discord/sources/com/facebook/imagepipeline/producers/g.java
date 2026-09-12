package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends j {
    @Override // com.facebook.imagepipeline.producers.j
    public final String c() {
        return "pipe_ui";
    }

    @Override // com.facebook.imagepipeline.producers.j
    public final String d() {
        return "BitmapMemoryCacheGetProducer";
    }

    @Override // com.facebook.imagepipeline.producers.j
    public final Consumer e(Consumer consumer, CacheKey cacheKey, boolean z5) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
        return consumer;
    }
}
