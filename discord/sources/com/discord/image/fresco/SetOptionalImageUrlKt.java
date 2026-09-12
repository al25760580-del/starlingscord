package com.discord.image.fresco;

import android.net.Uri;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.reactnativecommunity.clipboard.ClipboardModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import v8.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a]\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\b\u0002\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"setOptionalImageUrl", "", "Lcom/facebook/drawee/view/SimpleDraweeView;", "imageUrl", "", "autoPlayAnimations", "", "srcIsAnimated", "controllerListener", "Lcom/facebook/drawee/controller/ControllerListener;", "", "resizeWidthPx", "", "resizeHeightPx", "(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/facebook/drawee/controller/ControllerListener;Ljava/lang/Integer;Ljava/lang/Integer;)V", "fresco_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SetOptionalImageUrlKt {
    public static final void setOptionalImageUrl(@NotNull SimpleDraweeView simpleDraweeView, String str, Boolean bool, Boolean bool2, ControllerListener controllerListener, Integer num, Integer num2) {
        String type;
        Intrinsics.checkNotNullParameter(simpleDraweeView, "<this>");
        if (str == null || StringsKt.K(str)) {
            simpleDraweeView.setVisibility(8);
            return;
        }
        Uri uri = a.f21502a;
        Uri uri2 = Uri.parse(str);
        if (uri2 == null) {
            return;
        }
        String lastPathSegment = uri2.getLastPathSegment();
        ResizeOptions resizeOptions = null;
        if (Intrinsics.areEqual(uri2.getScheme(), "content")) {
            try {
                type = simpleDraweeView.getContext().getContentResolver().getType(uri2);
            } catch (Exception unused) {
                type = null;
            }
        } else {
            type = null;
        }
        boolean z5 = Intrinsics.areEqual(type, "image/gif") || (lastPathSegment != null && x.h(lastPathSegment, ".gif", true));
        boolean z6 = Intrinsics.areEqual(bool2, Boolean.TRUE) && ((Intrinsics.areEqual(type, ClipboardModule.MIMETYPE_WEBP) || (lastPathSegment != null && x.h(lastPathSegment, ".webp", true))) || (Intrinsics.areEqual(type, "image/avif") || (lastPathSegment != null && x.h(lastPathSegment, ".avif", true))));
        boolean z7 = (z5 || z6) && !Intrinsics.areEqual(bool, Boolean.FALSE);
        Uri.Builder builderBuildUpon = uri2.buildUpon();
        String lastPathSegment2 = uri2.getLastPathSegment();
        if (lastPathSegment2 != null && x.h(lastPathSegment2, ".avif", true)) {
            builderBuildUpon.appendQueryParameter("format", "webp");
        }
        if (z7 && z6) {
            builderBuildUpon.appendQueryParameter("animated", "true");
        }
        Uri uriBuild = builderBuildUpon.build();
        ImageRequestBuilder imageRequestBuilderD = ImageRequestBuilder.d(uriBuild);
        Intrinsics.checkNotNullExpressionValue(imageRequestBuilderD, "newBuilderWithSource(...)");
        Intrinsics.checkNotNull(uriBuild);
        ImageRequestBuilder imageRequestBuilderApplyDiscordDiskCachePolicy = DiskCachePolicyKt.applyDiscordDiskCachePolicy(imageRequestBuilderD, uriBuild);
        if (num != null && num.intValue() > 0 && num2 != null && num2.intValue() > 0) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            if (iIntValue > 0 && iIntValue2 > 0) {
                resizeOptions = new ResizeOptions(iIntValue, iIntValue2);
            }
            imageRequestBuilderApplyDiscordDiskCachePolicy.f5129d = resizeOptions;
        }
        ImageRequest imageRequestA = imageRequestBuilderApplyDiscordDiskCachePolicy.a();
        AbstractDraweeControllerBuilder controllerBuilder = simpleDraweeView.getControllerBuilder();
        controllerBuilder.f4636e = z7;
        controllerBuilder.f4635d = controllerListener;
        controllerBuilder.f4633b = imageRequestA;
        controllerBuilder.f4638g = simpleDraweeView.getController();
        simpleDraweeView.setController(controllerBuilder.a());
        simpleDraweeView.setVisibility(0);
    }

    public static /* synthetic */ void setOptionalImageUrl$default(SimpleDraweeView simpleDraweeView, String str, Boolean bool, Boolean bool2, ControllerListener controllerListener, Integer num, Integer num2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            bool = null;
        }
        if ((i7 & 4) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i7 & 8) != 0) {
            controllerListener = null;
        }
        if ((i7 & 16) != 0) {
            num = null;
        }
        if ((i7 & 32) != 0) {
            num2 = null;
        }
        setOptionalImageUrl(simpleDraweeView, str, bool, bool2, controllerListener, num, num2);
    }
}
