package com.facebook.imagepipeline.core;

import android.net.Uri;
import android.os.StrictMode;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.d1;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.g1;
import com.facebook.imagepipeline.producers.z0;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import e4.e;
import ga.i;
import ia.f;
import ia.j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import n8.h;
import rn.n;
import x8.g;

/* JADX INFO: loaded from: classes3.dex */
public final class ImagePipeline {
    public static final CancellationException k = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final CancellationException f4832l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f4833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Supplier f4834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Supplier f4835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oa.c f4836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final oa.b f4837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f4838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f4839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DefaultCacheKeyFactory f4840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicLong f4841i;
    public final f j;

    static {
        new CancellationException("ImageRequest is null");
        f4832l = new CancellationException("Modified URL is null");
    }

    public ImagePipeline(j producerSequenceFactory, Set requestListeners, Set requestListener2s, Supplier isPrefetchEnabledSupplier, e bitmapMemoryCache, e encodedMemoryCache, Supplier diskCachesStoreSupplier, DefaultCacheKeyFactory cacheKeyFactory, g1 threadHandoffProducerQueue, j8.c suppressBitmapPrefetchingSupplier, h lazyDataSource, f config) {
        Intrinsics.checkNotNullParameter(producerSequenceFactory, "producerSequenceFactory");
        Intrinsics.checkNotNullParameter(requestListeners, "requestListeners");
        Intrinsics.checkNotNullParameter(requestListener2s, "requestListener2s");
        Intrinsics.checkNotNullParameter(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        Intrinsics.checkNotNullParameter(bitmapMemoryCache, "bitmapMemoryCache");
        Intrinsics.checkNotNullParameter(encodedMemoryCache, "encodedMemoryCache");
        Intrinsics.checkNotNullParameter(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        Intrinsics.checkNotNullParameter(cacheKeyFactory, "cacheKeyFactory");
        Intrinsics.checkNotNullParameter(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        Intrinsics.checkNotNullParameter(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        Intrinsics.checkNotNullParameter(lazyDataSource, "lazyDataSource");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f4833a = producerSequenceFactory;
        this.f4834b = isPrefetchEnabledSupplier;
        this.f4835c = diskCachesStoreSupplier;
        this.f4836d = new oa.c(requestListeners);
        this.f4837e = new oa.b(requestListener2s);
        this.f4841i = new AtomicLong();
        this.f4838f = bitmapMemoryCache;
        this.f4839g = encodedMemoryCache;
        this.f4840h = cacheKeyFactory;
        this.j = config;
    }

    public final x8.a a(ImageRequest imageRequest, Object obj, ImageRequest.RequestLevel requestLevel, RequestListener requestListener, String str) {
        if (imageRequest == null) {
            g gVarW = ib.a.w(new NullPointerException());
            Intrinsics.checkNotNullExpressionValue(gVarW, "immediateFailedDataSource(...)");
            return gVarW;
        }
        try {
            j jVar = this.f4833a;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
            sa.a.w();
            z0 z0VarA = jVar.a(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                z0VarA = jVar.d(z0VarA);
            }
            z0 z0Var = z0VarA;
            if (requestLevel == null) {
                requestLevel = ImageRequest.RequestLevel.FULL_FETCH;
            }
            return f(z0Var, imageRequest, requestLevel, obj, requestListener, str);
        } catch (Exception e10) {
            return ib.a.w(e10);
        }
    }

    public final x8.a b(ImageRequest imageRequest, Object obj) {
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.getSourceUri() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        try {
            z0 z0VarC = this.f4833a.c(imageRequest);
            if (imageRequest.getResizeOptions() != null) {
                ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(imageRequest);
                imageRequestBuilderB.f5129d = null;
                imageRequest = imageRequestBuilderB.a();
            }
            return f(z0VarC, imageRequest, ImageRequest.RequestLevel.FULL_FETCH, obj, null, null);
        } catch (Exception e10) {
            return ib.a.w(e10);
        }
    }

    public final oa.c c(ImageRequest imageRequest, RequestListener requestListener) {
        if (imageRequest == null) {
            throw new IllegalStateException("Required value was null.");
        }
        oa.c cVar = this.f4836d;
        if (requestListener == null) {
            return imageRequest.getRequestListener() == null ? cVar : new oa.c(cVar, imageRequest.getRequestListener());
        }
        return imageRequest.getRequestListener() == null ? new oa.c(cVar, requestListener) : new oa.c(cVar, requestListener, imageRequest.getRequestListener());
    }

    public final boolean d(Uri uri, ImageRequest.CacheChoice cacheChoice) {
        boolean zB;
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri);
        imageRequestBuilderD.f5132g = cacheChoice;
        ImageRequest imageRequest = imageRequestBuilderD.a();
        Intrinsics.checkNotNull(imageRequest);
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        Object obj = this.f4835c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ia.c cVar = (ia.c) obj;
        CacheKey encodedCacheKey = this.f4840h.getEncodedCacheKey(imageRequest, null);
        ImageRequest.CacheChoice cacheChoice2 = imageRequest.getCacheChoice();
        Intrinsics.checkNotNullExpressionValue(cacheChoice2, "getCacheChoice(...)");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int iOrdinal = cacheChoice2.ordinal();
            if (iOrdinal == 0) {
                ga.b bVarC = cVar.c();
                Intrinsics.checkNotNull(encodedCacheKey);
                zB = bVarC.b(encodedCacheKey);
            } else if (iOrdinal == 1) {
                ga.b bVarB = cVar.b();
                Intrinsics.checkNotNull(encodedCacheKey);
                zB = bVarB.b(encodedCacheKey);
            } else {
                if (iOrdinal != 2) {
                    throw new n();
                }
                zB = e(imageRequest);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zB;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e(ImageRequest imageRequest) {
        Object obj = this.f4835c.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        ia.c cVar = (ia.c) obj;
        CacheKey encodedCacheKey = this.f4840h.getEncodedCacheKey(imageRequest, null);
        String diskCacheId = imageRequest.getDiskCacheId();
        if (diskCacheId != null) {
            ga.b bVar = (ga.b) cVar.a().get(diskCacheId);
            if (bVar == null) {
                return false;
            }
            Intrinsics.checkNotNull(encodedCacheKey);
            return bVar.b(encodedCacheKey);
        }
        Iterator it = cVar.a().entrySet().iterator();
        while (it.hasNext()) {
            ga.b bVar2 = (ga.b) ((Map.Entry) it.next()).getValue();
            Intrinsics.checkNotNull(encodedCacheKey);
            if (bVar2.b(encodedCacheKey)) {
                return true;
            }
        }
        return false;
    }

    public final x8.a f(z0 z0Var, ImageRequest imageRequest, ImageRequest.RequestLevel requestLevel, Object obj, RequestListener requestListener, String str) {
        sa.a.w();
        e0 e0Var = new e0(c(imageRequest, requestListener), this.f4837e);
        try {
            ImageRequest.RequestLevel lowestPermittedRequestLevel = imageRequest.getLowestPermittedRequestLevel();
            ImageRequest.RequestLevel requestLevel2 = lowestPermittedRequestLevel.f5124d > requestLevel.f5124d ? lowestPermittedRequestLevel : requestLevel;
            Intrinsics.checkNotNullExpressionValue(requestLevel2, "getMax(...)");
            d1 d1Var = new d1(imageRequest, String.valueOf(this.f4841i.getAndIncrement()), str, e0Var, obj, requestLevel2, false, imageRequest.getProgressiveRenderingEnabled() || !v8.a.c(imageRequest.getSourceUri()), imageRequest.getPriority(), this.j);
            sa.a.w();
            ja.b bVar = new ja.b(z0Var, d1Var, e0Var, 0);
            sa.a.w();
            return bVar;
        } catch (Exception e10) {
            return ib.a.w(e10);
        }
    }

    public final x8.a g(z0 producer, ImageRequest imageRequest, Object obj) {
        Priority priority = Priority.f4814i;
        e0 listener = new e0(c(imageRequest, null), this.f4837e);
        Uri uri = imageRequest.getSourceUri();
        Intrinsics.checkNotNullExpressionValue(uri, "getSourceUri(...)");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (uri == null) {
            g gVarW = ib.a.w(f4832l);
            Intrinsics.checkNotNullExpressionValue(gVarW, "immediateFailedDataSource(...)");
            return gVarW;
        }
        if (!Intrinsics.areEqual(uri, uri)) {
            ImageRequestBuilder imageRequestBuilderB = ImageRequestBuilder.b(imageRequest);
            imageRequestBuilderB.f5126a = uri;
            imageRequest = imageRequestBuilderB.a();
        }
        ImageRequest imageRequest2 = imageRequest;
        try {
            ImageRequest.RequestLevel lowestPermittedRequestLevel = imageRequest2.getLowestPermittedRequestLevel();
            if (lowestPermittedRequestLevel.f5124d <= 1) {
                lowestPermittedRequestLevel = ImageRequest.RequestLevel.FULL_FETCH;
            }
            ImageRequest.RequestLevel requestLevel = lowestPermittedRequestLevel;
            Intrinsics.checkNotNullExpressionValue(requestLevel, "getMax(...)");
            String strValueOf = String.valueOf(this.f4841i.getAndIncrement());
            f fVar = this.j;
            b bVar = ((ImagePipelineConfig) fVar).f4860u;
            d1 settableProducerContext = new d1(imageRequest2, strValueOf, null, listener, obj, requestLevel, true, false, priority, fVar);
            Intrinsics.checkNotNullParameter(producer, "producer");
            Intrinsics.checkNotNullParameter(settableProducerContext, "settableProducerContext");
            Intrinsics.checkNotNullParameter(listener, "listener");
            return new ja.b(producer, settableProducerContext, listener, 1);
        } catch (Exception e10) {
            return ib.a.w(e10);
        }
    }
}
