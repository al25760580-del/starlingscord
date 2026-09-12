package com.facebook.imagepipeline.producers;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Supplier f5079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DefaultCacheKeyFactory f5080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f5081c;

    public u(Supplier supplier, DefaultCacheKeyFactory defaultCacheKeyFactory, w wVar) {
        this.f5079a = supplier;
        this.f5080b = defaultCacheKeyFactory;
        this.f5081c = wVar;
    }

    public static Map c(a1 a1Var, ProducerContext producerContext, boolean z5, int i7) {
        if (a1Var.f(producerContext, "DiskCacheProducer")) {
            return z5 ? n8.e.b("cached_value_found", String.valueOf(z5), "encodedImageSize", String.valueOf(i7)) : n8.e.a("cached_value_found", String.valueOf(z5));
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public final void b(Consumer consumer, ProducerContext producerContext) {
        j4.e eVarB;
        boolean z5;
        w wVar = this.f5081c;
        ImageRequest imageRequestG = producerContext.g();
        int i7 = 1;
        if (!producerContext.g().isCacheEnabled(16)) {
            if (producerContext.Q().f5124d < 2) {
                wVar.b(consumer, producerContext);
                return;
            } else {
                producerContext.n("disk", "nil-result_read");
                consumer.b(1, null);
                return;
            }
        }
        producerContext.O().c(producerContext, "DiskCacheProducer");
        CacheKey key = this.f5080b.getEncodedCacheKey(imageRequestG, producerContext.c());
        ia.c cVar = (ia.c) this.f5079a.get();
        ga.b bVarA = s.a(imageRequestG, cVar.c(), cVar.b(), cVar.a());
        if (bVarA == null) {
            producerContext.O().k(producerContext, "DiskCacheProducer", new ag.b("Got no disk cache for CacheChoice: " + Integer.valueOf(imageRequestG.getCacheChoice().ordinal()).toString(), 1), null);
            if (producerContext.Q().f5124d < 2) {
                wVar.b(consumer, producerContext);
                return;
            } else {
                producerContext.n("disk", "nil-result_read");
                consumer.b(1, null);
                return;
            }
        }
        AtomicBoolean isCancelled = new AtomicBoolean(false);
        bVarA.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(isCancelled, "isCancelled");
        sa.a.w();
        EncodedImage encodedImageK = bVarA.f9530g.k(key);
        if (encodedImageK != null) {
            o8.a.q("Found image for %s in staging area", key.c(), ga.b.class);
            bVarA.f9529f.getClass();
            eVarB = new j4.e();
            if (!eVarB.g(encodedImageK)) {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
            Intrinsics.checkNotNullExpressionValue(eVarB, "forResult(...)");
        } else {
            try {
                eVarB = j4.e.a(new com.facebook.react.runtime.q(isCancelled, bVarA, key, i7), bVarA.f9527d);
            } catch (Exception e10) {
                o8.a.u(e10, "Failed to schedule disk-cache read for %s", key.c());
                eVarB = j4.e.b(e10);
            }
        }
        t tVar = new t(this, producerContext.O(), producerContext, consumer);
        eVarB.getClass();
        h4.a aVar = j4.e.f13656h;
        ue.i iVar = new ue.i(20, false);
        synchronized (eVarB.f13658a) {
            try {
                synchronized (eVarB.f13658a) {
                    z5 = eVarB.f13659b;
                }
                if (!z5) {
                    eVarB.f13663f.add(new j4.d(iVar, tVar, aVar));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            try {
                aVar.execute(new a5.t(iVar, tVar, eVarB, 9));
            } catch (Exception e11) {
                iVar.s(new androidx.datastore.preferences.protobuf.d1(e11));
            }
        }
        producerContext.i(new o(i7, isCancelled));
    }
}
