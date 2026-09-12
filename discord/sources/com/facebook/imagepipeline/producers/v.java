package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProducerContext f5086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Supplier f5087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final DefaultCacheKeyFactory f5088e;

    public v(Consumer consumer, ProducerContext producerContext, Supplier supplier, DefaultCacheKeyFactory defaultCacheKeyFactory) {
        super(consumer);
        this.f5086c = producerContext;
        this.f5087d = supplier;
        this.f5088e = defaultCacheKeyFactory;
    }

    @Override // com.facebook.imagepipeline.producers.c
    public final void h(int i7, Object obj) {
        EncodedImage encodedImage = (EncodedImage) obj;
        Consumer consumer = this.f5061b;
        ProducerContext producerContext = this.f5086c;
        producerContext.O().c(producerContext, "DiskCacheWriteProducer");
        if (c.e(i7) || encodedImage == null || (i7 & 10) != 0 || encodedImage.getImageFormat() == z9.c.f23631c) {
            producerContext.O().i(producerContext, "DiskCacheWriteProducer", null);
            consumer.b(i7, encodedImage);
            return;
        }
        ImageRequest imageRequestG = producerContext.g();
        CacheKey key = this.f5088e.getEncodedCacheKey(imageRequestG, producerContext.c());
        ia.c cVar = (ia.c) this.f5087d.get();
        ga.b bVarA = s.a(imageRequestG, cVar.c(), cVar.b(), cVar.a());
        if (bVarA == null) {
            producerContext.O().k(producerContext, "DiskCacheWriteProducer", new ag.b("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequestG.getCacheChoice().ordinal()).toString(), 1), null);
            consumer.b(i7, encodedImage);
            return;
        }
        ga.l lVar = bVarA.f9530g;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
        sa.a.w();
        if (!EncodedImage.isValid(encodedImage)) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (lVar) {
            key.getClass();
            if (!EncodedImage.isValid(encodedImage)) {
                throw new IllegalArgumentException();
            }
            EncodedImage.closeSafely((EncodedImage) ((HashMap) lVar.f9547e).put(key, EncodedImage.cloneOrNull(encodedImage)));
            lVar.o();
        }
        EncodedImage encodedImageCloneOrNull = EncodedImage.cloneOrNull(encodedImage);
        try {
            bVarA.f9528e.execute(new ac.a(bVarA, key, encodedImageCloneOrNull, 15));
        } catch (Exception e10) {
            o8.a.u(e10, "Failed to schedule disk-cache write for %s", key.c());
            lVar.s(key, encodedImage);
            EncodedImage.closeSafely(encodedImageCloneOrNull);
        }
        producerContext.O().i(producerContext, "DiskCacheWriteProducer", null);
        consumer.b(i7, encodedImage);
    }
}
