package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DefaultCacheKeyFactory f4988e;

    public h(DefaultCacheKeyFactory defaultCacheKeyFactory, j jVar) {
        super(jVar, "BitmapMemoryCacheKeyMultiplexProducer", "multiplex_bmp_cnt");
        this.f4988e = defaultCacheKeyFactory;
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public final Closeable c(Closeable closeable) {
        return CloseableReference.g((CloseableReference) closeable);
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public final Pair d(ProducerContext producerContext) {
        return Pair.create(this.f4988e.getBitmapCacheKey(producerContext.g(), producerContext.c()), producerContext.Q());
    }
}
