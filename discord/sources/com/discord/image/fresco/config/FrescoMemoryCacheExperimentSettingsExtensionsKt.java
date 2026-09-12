package com.discord.image.fresco.config;

import android.net.Uri;
import com.discord.image.fresco.DiskCachePolicyKt;
import com.discord.image.fresco.FrescoModuleDiscord;
import com.discord.native_experiments.FrescoMemoryCacheExperimentSettings;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.views.image.ReactImageRequestBuilderHook;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"configureFresco", "", "Lcom/discord/native_experiments/FrescoMemoryCacheExperimentSettings;", "configureReactImageRequestBuilderHook", "fresco_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FrescoMemoryCacheExperimentSettingsExtensionsKt {
    public static final void configureFresco(@NotNull FrescoMemoryCacheExperimentSettings frescoMemoryCacheExperimentSettings) {
        Intrinsics.checkNotNullParameter(frescoMemoryCacheExperimentSettings, "<this>");
        FrescoModuleDiscord.Companion companion = FrescoModuleDiscord.INSTANCE;
        companion.configureMemoryCacheReductionPercent(frescoMemoryCacheExperimentSettings.getReductionPercent());
        companion.configureDiskCacheRoutingEnabled(frescoMemoryCacheExperimentSettings.getUseDiskCacheRouting());
        companion.configureDisableLowPriorityMemoryCache(frescoMemoryCacheExperimentSettings.getDisableLowPriorityMemoryCache());
        configureReactImageRequestBuilderHook(frescoMemoryCacheExperimentSettings);
    }

    private static final void configureReactImageRequestBuilderHook(FrescoMemoryCacheExperimentSettings frescoMemoryCacheExperimentSettings) {
        if (frescoMemoryCacheExperimentSettings.getUseDiskCacheRouting() || frescoMemoryCacheExperimentSettings.getDisableLowPriorityMemoryCache()) {
            ReactImageRequestBuilderHook.setHook(new a());
        } else {
            ReactImageRequestBuilderHook.clearHook();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureReactImageRequestBuilderHook$lambda$0(Uri sourceUri, ImageRequestBuilder imageRequestBuilder) {
        Intrinsics.checkNotNullParameter(sourceUri, "sourceUri");
        Intrinsics.checkNotNullParameter(imageRequestBuilder, "imageRequestBuilder");
        DiskCachePolicyKt.applyDiscordDiskCachePolicy(imageRequestBuilder, sourceUri);
    }
}
