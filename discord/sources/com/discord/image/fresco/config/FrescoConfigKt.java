package com.discord.image.fresco.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.SparseIntArray;
import com.discord.image.fresco.DiscordImageUriPolicyKt;
import com.discord.networking.ReactNetworking;
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.core.DownsampleMode;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.imagepipeline.core.a;
import com.facebook.react.modules.fresco.FrescoModule;
import ga.l;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pa.t;
import pa.u;
import pa.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0001\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SIGNED_QUERY_PARAMS", "", "", "frescoConfig", "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;", "Landroid/content/Context;", "fresco_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class FrescoConfigKt {

    @NotNull
    private static final Set<String> SIGNED_QUERY_PARAMS;

    static {
        String[] elements = {"ex", "hm", "is"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        SIGNED_QUERY_PARAMS = y.J(elements);
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [com.discord.image.fresco.config.FrescoConfigKt$frescoConfig$2] */
    @SuppressLint({"VisibleForTests"})
    @NotNull
    public static final ImagePipelineConfig frescoConfig(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        ImagePipelineConfig.Builder defaultConfigBuilder = FrescoModule.INSTANCE.getDefaultConfigBuilder(context);
        FrescoDiskCache frescoDiskCache = FrescoDiskCache.INSTANCE;
        defaultConfigBuilder.f4869f = frescoDiskCache.newRegularDiskCache(context);
        defaultConfigBuilder.k = frescoDiskCache.newSmallDiskCache(context);
        defaultConfigBuilder.f4864a = new FrescoBitmapSupplier(context);
        defaultConfigBuilder.f4868e = new FrescoEncodedSupplier();
        defaultConfigBuilder.f4870g = ReactNetworking.INSTANCE.createReactOkHttpNetworkFetcher();
        l lVar = new l(28, false);
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(16384, 5);
        lVar.f9547e = new v(81920, 1048576 * 2, sparseIntArray, -1);
        defaultConfigBuilder.f4871h = new u(new t(lVar));
        defaultConfigBuilder.f4865b = new DefaultCacheKeyFactory() { // from class: com.discord.image.fresco.config.FrescoConfigKt.frescoConfig.2
            @Override // com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
            public Uri getCacheKeySourceUri(Uri sourceUri) {
                Intrinsics.checkNotNullParameter(sourceUri, "sourceUri");
                if (!DiscordImageUriPolicyKt.isSignedAttachmentCacheKeyCandidate(sourceUri)) {
                    return sourceUri;
                }
                Uri.Builder builderBuildUpon = sourceUri.buildUpon();
                builderBuildUpon.clearQuery();
                for (String str : sourceUri.getQueryParameterNames()) {
                    if (!FrescoConfigKt.SIGNED_QUERY_PARAMS.contains(str)) {
                        Iterator<String> it = sourceUri.getQueryParameters(str).iterator();
                        while (it.hasNext()) {
                            builderBuildUpon.appendQueryParameter(str, it.next());
                        }
                    }
                }
                Uri uriBuild = builderBuildUpon.build();
                Intrinsics.checkNotNullExpressionValue(uriBuild, "build(...)");
                return uriBuild;
            }
        };
        DownsampleMode downsampleMode = DownsampleMode.f4828d;
        Intrinsics.checkNotNullParameter(downsampleMode, "downsampleMode");
        defaultConfigBuilder.f4867d = downsampleMode;
        a this$0 = defaultConfigBuilder.f4874m;
        this$0.getClass();
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f4877a = true;
        Unit unit = Unit.f14616a;
        return new ImagePipelineConfig(defaultConfigBuilder);
    }
}
