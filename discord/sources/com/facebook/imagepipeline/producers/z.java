package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.image.EncodedImage;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ga.i f5113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultCacheKeyFactory f5114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f5115c;

    public z(ga.i iVar, DefaultCacheKeyFactory defaultCacheKeyFactory, z0 z0Var) {
        this.f5113a = iVar;
        this.f5114b = defaultCacheKeyFactory;
        this.f5115c = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        try {
            sa.a.w();
            a1 a1VarO = producerContext.O();
            a1VarO.c(producerContext, "EncodedMemoryCacheProducer");
            CacheKey encodedCacheKey = this.f5114b.getEncodedCacheKey(producerContext.g(), producerContext.c());
            CloseableReference closeableReference = producerContext.g().isCacheEnabled(4) ? this.f5113a.get(encodedCacheKey) : null;
            try {
                if (closeableReference != null) {
                    EncodedImage encodedImage = new EncodedImage(closeableReference);
                    try {
                        a1VarO.i(producerContext, "EncodedMemoryCacheProducer", a1VarO.f(producerContext, "EncodedMemoryCacheProducer") ? n8.e.a("cached_value_found", "true") : null);
                        a1VarO.b(producerContext, "EncodedMemoryCacheProducer", true);
                        producerContext.z("memory_encoded");
                        consumer.c(1.0f);
                        consumer.b(1, encodedImage);
                        EncodedImage.closeSafely(encodedImage);
                        closeableReference.close();
                        sa.a.w();
                        return;
                    } catch (Throwable th2) {
                        EncodedImage.closeSafely(encodedImage);
                        throw th2;
                    }
                }
                if (producerContext.Q().f5124d < 3) {
                    y yVar = new y(consumer, this.f5113a, encodedCacheKey, producerContext.g().isCacheEnabled(8), ((ImagePipelineConfig) producerContext.l()).f4860u.f4889e);
                    a1VarO.i(producerContext, "EncodedMemoryCacheProducer", a1VarO.f(producerContext, "EncodedMemoryCacheProducer") ? n8.e.a("cached_value_found", "false") : null);
                    this.f5115c.b(yVar, producerContext);
                    CloseableReference.l(closeableReference);
                    sa.a.w();
                    return;
                }
                a1VarO.i(producerContext, "EncodedMemoryCacheProducer", a1VarO.f(producerContext, "EncodedMemoryCacheProducer") ? n8.e.a("cached_value_found", "false") : null);
                a1VarO.b(producerContext, "EncodedMemoryCacheProducer", false);
                producerContext.n("memory_encoded", "nil-result");
                consumer.b(1, null);
                CloseableReference.l(closeableReference);
                sa.a.w();
            } catch (Throwable th3) {
                CloseableReference.l(closeableReference);
                throw th3;
            }
        } catch (Throwable th4) {
            sa.a.w();
            throw th4;
        }
    }
}
