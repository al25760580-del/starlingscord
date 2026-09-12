package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.request.ImageRequest;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {
    public static final ga.b a(ImageRequest imageRequest, ga.b bVar, ga.b bVar2, n8.e eVar) {
        String diskCacheId;
        Intrinsics.checkNotNullParameter(imageRequest, "imageRequest");
        if (imageRequest.getCacheChoice() == ImageRequest.CacheChoice.f5116d) {
            return bVar;
        }
        if (imageRequest.getCacheChoice() == ImageRequest.CacheChoice.f5117e) {
            return bVar2;
        }
        if (imageRequest.getCacheChoice() != ImageRequest.CacheChoice.f5118i || eVar == null || (diskCacheId = imageRequest.getDiskCacheId()) == null) {
            return null;
        }
        return (ga.b) eVar.get(diskCacheId);
    }
}
