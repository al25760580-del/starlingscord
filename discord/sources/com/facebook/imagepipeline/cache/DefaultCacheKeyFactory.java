package com.facebook.imagepipeline.cache;

import android.net.Uri;
import com.facebook.cache.common.CacheKey;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import ga.a;
import i8.d;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultCacheKeyFactory {
    private static DefaultCacheKeyFactory sInstance = null;
    private static boolean sShouldRemoveCallerContextFromCacheKey = false;

    public static synchronized DefaultCacheKeyFactory getInstance() {
        try {
            if (sInstance == null) {
                sInstance = new DefaultCacheKeyFactory();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sInstance;
    }

    public static void setShouldRemoveCallerContextFromCacheKey(boolean z5) {
        sShouldRemoveCallerContextFromCacheKey = z5;
    }

    public CacheKey getBitmapCacheKey(ImageRequest imageRequest, Object obj) {
        a aVar = new a(getCacheKeySourceUri(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), null, null);
        if (sShouldRemoveCallerContextFromCacheKey) {
            return aVar;
        }
        aVar.f9522g = obj;
        return aVar;
    }

    public Uri getCacheKeySourceUri(Uri uri) {
        return uri;
    }

    public CacheKey getEncodedCacheKey(ImageRequest imageRequest, Object obj) {
        return getEncodedCacheKey(imageRequest, imageRequest.getSourceUri(), obj);
    }

    public CacheKey getPostprocessedBitmapCacheKey(ImageRequest imageRequest, Object obj) {
        CacheKey cacheKey;
        String name;
        Postprocessor postprocessor = imageRequest.getPostprocessor();
        if (postprocessor != null) {
            CacheKey postprocessorCacheKey = postprocessor.getPostprocessorCacheKey();
            name = postprocessor.getClass().getName();
            cacheKey = postprocessorCacheKey;
        } else {
            cacheKey = null;
            name = null;
        }
        a aVar = new a(getCacheKeySourceUri(imageRequest.getSourceUri()).toString(), imageRequest.getResizeOptions(), imageRequest.getRotationOptions(), imageRequest.getImageDecodeOptions(), cacheKey, name);
        if (sShouldRemoveCallerContextFromCacheKey) {
            return aVar;
        }
        aVar.f9522g = obj;
        return aVar;
    }

    public CacheKey getEncodedCacheKey(ImageRequest imageRequest, Uri uri, Object obj) {
        return new d(getCacheKeySourceUri(uri).toString());
    }
}
