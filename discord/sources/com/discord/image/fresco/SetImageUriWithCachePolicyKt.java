package com.discord.image.fresco;

import android.net.Uri;
import com.discord.native_experiments.FrescoMemoryCacheExperimentConfig;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import v8.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, d2 = {"setImageUriWithCachePolicy", "", "Lcom/facebook/drawee/view/SimpleDraweeView;", "imageUrl", "", "fresco_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SetImageUriWithCachePolicyKt {
    public static final void setImageUriWithCachePolicy(@NotNull SimpleDraweeView simpleDraweeView, String str) {
        Intrinsics.checkNotNullParameter(simpleDraweeView, "<this>");
        if (!FrescoMemoryCacheExperimentConfig.INSTANCE.hasRequestPolicyOverrides()) {
            simpleDraweeView.setImageURI(str);
            return;
        }
        if (str == null || StringsKt.K(str)) {
            simpleDraweeView.setImageURI((String) null);
            return;
        }
        Uri uri = a.f21502a;
        Uri uri2 = Uri.parse(str);
        if (uri2 == null) {
            simpleDraweeView.setImageURI(str);
            return;
        }
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uri2);
        Intrinsics.checkNotNullExpressionValue(imageRequestBuilderD, "newBuilderWithSource(...)");
        ImageRequest imageRequestA = DiskCachePolicyKt.applyDiscordDiskCachePolicy(imageRequestBuilderD, uri2).a();
        AbstractDraweeControllerBuilder controllerBuilder = simpleDraweeView.getControllerBuilder();
        controllerBuilder.f4633b = imageRequestA;
        controllerBuilder.f4638g = simpleDraweeView.getController();
        simpleDraweeView.setController(controllerBuilder.a());
    }
}
