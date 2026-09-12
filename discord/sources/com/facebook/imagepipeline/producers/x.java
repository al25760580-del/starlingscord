package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends u0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DefaultCacheKeyFactory f5097e;

    public x(DefaultCacheKeyFactory defaultCacheKeyFactory, z0 z0Var) {
        super(z0Var, "EncodedCacheKeyMultiplexProducer", "multiplex_enc_cnt");
        this.f5097e = defaultCacheKeyFactory;
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public final Closeable c(Closeable closeable) {
        return EncodedImage.cloneOrNull((EncodedImage) closeable);
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public final Pair d(ProducerContext producerContext) {
        return Pair.create(this.f5097e.getEncodedCacheKey(producerContext.g(), producerContext.c()), producerContext.Q());
    }
}
