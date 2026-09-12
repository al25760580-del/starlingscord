package com.discord.image.fresco;

import android.net.Uri;
import com.discord.native_experiments.FrescoMemoryCacheExperimentConfig;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"applyDiscordDiskCachePolicy", "Lcom/facebook/imagepipeline/request/ImageRequestBuilder;", "sourceUri", "Landroid/net/Uri;", "fresco_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class DiskCachePolicyKt {
    @NotNull
    public static final ImageRequestBuilder applyDiscordDiskCachePolicy(@NotNull ImageRequestBuilder imageRequestBuilder, @NotNull Uri sourceUri) {
        Intrinsics.checkNotNullParameter(imageRequestBuilder, "<this>");
        Intrinsics.checkNotNullParameter(sourceUri, "sourceUri");
        FrescoMemoryCacheExperimentConfig frescoMemoryCacheExperimentConfig = FrescoMemoryCacheExperimentConfig.INSTANCE;
        if (frescoMemoryCacheExperimentConfig.disableLowPriorityMemoryCache() && DiscordImageUriPolicyKt.isLowPriorityDiscordImagePath(sourceUri)) {
            imageRequestBuilder.f5128c |= 15;
        }
        if (frescoMemoryCacheExperimentConfig.useDiskCacheRouting() && DiscordImageUriPolicyKt.shouldUseSmallDiskCacheForDiscordImage(sourceUri)) {
            imageRequestBuilder.f5132g = ImageRequest.CacheChoice.f5116d;
        }
        return imageRequestBuilder;
    }
}
