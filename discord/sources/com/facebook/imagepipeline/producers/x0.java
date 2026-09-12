package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5098a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f5100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5101d;

    public x0(ga.i iVar, DefaultCacheKeyFactory defaultCacheKeyFactory, x0 x0Var) {
        this.f5099b = iVar;
        this.f5100c = defaultCacheKeyFactory;
        this.f5101d = x0Var;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        switch (this.f5098a) {
            case 0:
                ga.i iVar = (ga.i) this.f5099b;
                x0 x0Var = (x0) this.f5101d;
                a1 a1VarO = producerContext.O();
                ImageRequest imageRequestG = producerContext.g();
                Object objC = producerContext.c();
                Postprocessor postprocessor = imageRequestG.getPostprocessor();
                if (postprocessor == null || postprocessor.getPostprocessorCacheKey() == null) {
                    x0Var.b(consumer, producerContext);
                } else {
                    a1VarO.c(producerContext, "PostprocessedBitmapMemoryCacheProducer");
                    CacheKey postprocessedBitmapCacheKey = ((DefaultCacheKeyFactory) this.f5100c).getPostprocessedBitmapCacheKey(imageRequestG, objC);
                    CloseableReference closeableReference = producerContext.g().isCacheEnabled(1) ? iVar.get(postprocessedBitmapCacheKey) : null;
                    if (closeableReference == null) {
                        i iVar2 = new i(consumer, postprocessedBitmapCacheKey, iVar, producerContext.g().isCacheEnabled(2));
                        a1VarO.i(producerContext, "PostprocessedBitmapMemoryCacheProducer", a1VarO.f(producerContext, "PostprocessedBitmapMemoryCacheProducer") ? n8.e.a("cached_value_found", "false") : null);
                        x0Var.b(iVar2, producerContext);
                    } else {
                        a1VarO.i(producerContext, "PostprocessedBitmapMemoryCacheProducer", a1VarO.f(producerContext, "PostprocessedBitmapMemoryCacheProducer") ? n8.e.a("cached_value_found", "true") : null);
                        a1VarO.b(producerContext, "PostprocessedBitmapMemoryCacheProducer", true);
                        producerContext.n("memory_bitmap", "postprocessed");
                        consumer.c(1.0f);
                        consumer.b(1, closeableReference);
                        closeableReference.close();
                    }
                }
                break;
            default:
                a1 a1VarO2 = producerContext.O();
                Postprocessor postprocessor2 = producerContext.g().getPostprocessor();
                postprocessor2.getClass();
                ((z0) this.f5099b).b(new a(new y0(this, consumer, a1VarO2, postprocessor2, producerContext), 1), producerContext);
                break;
        }
    }

    public x0(z0 z0Var, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        z0Var.getClass();
        this.f5099b = z0Var;
        this.f5100c = platformBitmapFactory;
        executor.getClass();
        this.f5101d = executor;
    }
}
