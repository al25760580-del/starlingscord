package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.image.ImageInfo;

/* JADX INFO: loaded from: classes3.dex */
public class j implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ga.i f5007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultCacheKeyFactory f5008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f5009c;

    public j(ga.i iVar, DefaultCacheKeyFactory defaultCacheKeyFactory, z0 z0Var) {
        this.f5007a = iVar;
        this.f5008b = defaultCacheKeyFactory;
        this.f5009c = z0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        try {
            sa.a.w();
            a1 a1VarO = producerContext.O();
            a1VarO.c(producerContext, d());
            CacheKey bitmapCacheKey = this.f5008b.getBitmapCacheKey(producerContext.g(), producerContext.c());
            CloseableReference closeableReference = producerContext.g().isCacheEnabled(1) ? this.f5007a.get(bitmapCacheKey) : null;
            if (closeableReference != null) {
                producerContext.q(((ImageInfo) closeableReference.q()).getExtras());
                boolean z5 = ((na.j) ((na.c) closeableReference.q()).G()).f16539c;
                if (z5) {
                    a1VarO.i(producerContext, d(), a1VarO.f(producerContext, d()) ? n8.e.a("cached_value_found", "true") : null);
                    a1VarO.b(producerContext, d(), true);
                    producerContext.n("memory_bitmap", c());
                    consumer.c(1.0f);
                }
                consumer.b(z5 ? 1 : 0, closeableReference);
                closeableReference.close();
                if (z5) {
                    return;
                }
            }
            if (producerContext.Q().f5124d >= 4) {
                a1VarO.i(producerContext, d(), a1VarO.f(producerContext, d()) ? n8.e.a("cached_value_found", "false") : null);
                a1VarO.b(producerContext, d(), false);
                producerContext.n("memory_bitmap", c());
                consumer.b(1, null);
                return;
            }
            Consumer consumerE = e(consumer, bitmapCacheKey, producerContext.g().isCacheEnabled(2));
            a1VarO.i(producerContext, d(), a1VarO.f(producerContext, d()) ? n8.e.a("cached_value_found", "false") : null);
            sa.a.w();
            this.f5009c.b(consumerE, producerContext);
            sa.a.w();
        } finally {
            sa.a.w();
        }
    }

    public String c() {
        return "pipe_bg";
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public Consumer e(Consumer consumer, CacheKey cacheKey, boolean z5) {
        return new i(this, consumer, cacheKey, z5);
    }
}
