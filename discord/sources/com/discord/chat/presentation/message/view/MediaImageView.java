package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.u0;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.databinding.MediaImageViewBinding;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.utils.GetMediaImagePlaceholderStatesListenerKt;
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.R;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0002XWB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0013J)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ§\u0001\u0010.\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u00172\b\u0010\"\u001a\u0004\u0018\u00010\t2\u0006\u0010#\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000f¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00103\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u00104J+\u00108\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u00172\b\u00106\u001a\u0004\u0018\u00010\u00172\b\u00107\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b8\u00109J\u001f\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b;\u0010<J;\u0010@\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u00172\u001a\u0010?\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\f\u0018\u00010=j\u0004\u0018\u0001`>¢\u0006\u0004\b@\u0010AR\u0017\u0010C\u001a\u00020B8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0018\u0010T\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010\u0019\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010SR\u0018\u0010!\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010UR\u0018\u0010\"\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010V¨\u0006Y"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaImageView;", "Landroid/widget/FrameLayout;", "Lcom/discord/chat/presentation/message/view/mosaic_recycler/MosaicView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "resizeWidthPx", "resizeHeightPx", "", "loadImage", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "", "isEligibleForMinConstraints", "width", "getWidth", "(ZI)I", "height", "getHeight", "shouldAutoPlayGif", "", "filename", "srcIsAnimated", "shouldShowGifIndicator", "(ZLjava/lang/String;Z)Z", "configureGifIndicator", "(ZLjava/lang/String;Z)V", "url", "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", ViewProps.RESIZE_MODE, "placeholder", "placeholderVersion", "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "radiusPx", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "uploadItemProps", "isObscure", "isObscureAwaitingScan", "obscureHideControls", "obscureIsOpaque", "isPartOfMosaic", "setContent", "(Ljava/lang/String;IILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;Ljava/lang/String;Ljava/lang/Integer;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;ILcom/discord/chat/presentation/message/view/UploadItemProps;ZZZZZZLjava/lang/String;Z)V", "", "getSingleAspectRatio", "()F", "setMosaicSize", "(II)V", "description", "hint", ViewProps.ROLE, "setAccessibility", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "show", "showDescription", "(ZLjava/lang/String;)V", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onAltTextButtonClicked", "showAltTextButton", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/databinding/MediaImageViewBinding;", "binding", "Lcom/discord/chat/databinding/MediaImageViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/MediaImageViewBinding;", "Lcom/discord/chat/presentation/message/view/SpoilerViewManager;", "spoilerViewManager", "Lcom/discord/chat/presentation/message/view/SpoilerViewManager;", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayViewManager;", "attachmentUploadOverlay", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayViewManager;", "imageFadeDuration", "I", "Lcom/discord/chat/presentation/message/view/MediaImageView$TargetSize;", "targetSize", "Lcom/discord/chat/presentation/message/view/MediaImageView$TargetSize;", "imageLoaded", "Z", "imageUrl", "Ljava/lang/String;", "Ljava/lang/Integer;", "Companion", "TargetSize", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaImageView.kt\ncom/discord/chat/presentation/message/view/MediaImageView\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n27#2:282\n311#3:283\n327#3,4:284\n312#3:288\n257#3,2:290\n257#3,2:292\n1#4:289\n*S KotlinDebug\n*F\n+ 1 MediaImageView.kt\ncom/discord/chat/presentation/message/view/MediaImageView\n*L\n66#1:282\n163#1:283\n163#1:284,4\n163#1:288\n229#1:290,2\n272#1:292,2\n*E\n"})
public class MediaImageView extends FrameLayout implements MosaicView {

    @NotNull
    private final AttachmentUploadOverlayViewManager attachmentUploadOverlay;

    @NotNull
    private final MediaImageViewBinding binding;
    private final int imageFadeDuration;
    private boolean imageLoaded;
    private String imageUrl;
    private String placeholder;
    private Integer placeholderVersion;

    @NotNull
    private final SpoilerViewManager spoilerViewManager;
    private boolean srcIsAnimated;
    private TargetSize targetSize;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int GIF_INDICATOR_HEIGHT = SizeUtilsKt.getDpToPx(22);
    private static final int GIF_INDICATOR_WIDTH = SizeUtilsKt.getDpToPx(36);
    private static final int GIF_INDICATOR_PADDING = SizeUtilsKt.getDpToPx(8);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaImageView$Companion;", "", "<init>", "()V", "GIF_INDICATOR_HEIGHT", "", "getGIF_INDICATOR_HEIGHT", "()I", "GIF_INDICATOR_WIDTH", "getGIF_INDICATOR_WIDTH", "GIF_INDICATOR_PADDING", "getGIF_INDICATOR_PADDING", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getGIF_INDICATOR_HEIGHT() {
            return MediaImageView.GIF_INDICATOR_HEIGHT;
        }

        public final int getGIF_INDICATOR_PADDING() {
            return MediaImageView.GIF_INDICATOR_PADDING;
        }

        public final int getGIF_INDICATOR_WIDTH() {
            return MediaImageView.GIF_INDICATOR_WIDTH;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaImageView$TargetSize;", "", "width", "", "height", ViewProps.RESIZE_MODE, "Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "<init>", "(IILcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;)V", "getWidth", "()I", "getHeight", "getResizeMode", "()Lcom/discord/chat/presentation/media/MediaContainingViewResizer$ResizeMode;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TargetSize {
        private final int height;

        @NotNull
        private final MediaContainingViewResizer.ResizeMode resizeMode;
        private final int width;

        public TargetSize(int i7, int i10, @NotNull MediaContainingViewResizer.ResizeMode resizeMode) {
            Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
            this.width = i7;
            this.height = i10;
            this.resizeMode = resizeMode;
        }

        public static /* synthetic */ TargetSize copy$default(TargetSize targetSize, int i7, int i10, MediaContainingViewResizer.ResizeMode resizeMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i7 = targetSize.width;
            }
            if ((i11 & 2) != 0) {
                i10 = targetSize.height;
            }
            if ((i11 & 4) != 0) {
                resizeMode = targetSize.resizeMode;
            }
            return targetSize.copy(i7, i10, resizeMode);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final MediaContainingViewResizer.ResizeMode getResizeMode() {
            return this.resizeMode;
        }

        @NotNull
        public final TargetSize copy(int width, int height, @NotNull MediaContainingViewResizer.ResizeMode resizeMode) {
            Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
            return new TargetSize(width, height, resizeMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetSize)) {
                return false;
            }
            TargetSize targetSize = (TargetSize) other;
            return this.width == targetSize.width && this.height == targetSize.height && this.resizeMode == targetSize.resizeMode;
        }

        public final int getHeight() {
            return this.height;
        }

        @NotNull
        public final MediaContainingViewResizer.ResizeMode getResizeMode() {
            return this.resizeMode;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.resizeMode.hashCode() + com.discord.chat.presentation.list.a.u(this.height, Integer.hashCode(this.width) * 31, 31);
        }

        @NotNull
        public String toString() {
            int i7 = this.width;
            int i10 = this.height;
            MediaContainingViewResizer.ResizeMode resizeMode = this.resizeMode;
            StringBuilder sbR = a3.e.r(i7, "TargetSize(width=", i10, ", height=", ", resizeMode=");
            sbR.append(resizeMode);
            sbR.append(")");
            return sbR.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaImageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void configureGifIndicator(boolean shouldAutoPlayGif, String filename, boolean srcIsAnimated) {
        SimpleDraweeView gifIndicator = this.binding.gifIndicator;
        Intrinsics.checkNotNullExpressionValue(gifIndicator, "gifIndicator");
        gifIndicator.setVisibility(shouldShowGifIndicator(shouldAutoPlayGif, filename, srcIsAnimated) ? 0 : 8);
    }

    private final int getHeight(boolean isEligibleForMinConstraints, int height) {
        return (!isEligibleForMinConstraints || height > 212) ? height : SizeUtilsKt.getDpToPx(MediaImageViewKt.OBSCURED_IMAGE_MIN_HEIGHT);
    }

    private final int getWidth(boolean isEligibleForMinConstraints, int width) {
        return (!isEligibleForMinConstraints || width > 146) ? width : SizeUtilsKt.getDpToPx(MediaImageViewKt.OBSCURED_IMAGE_MIN_WIDTH);
    }

    private final void loadImage(Integer resizeWidthPx, Integer resizeHeightPx) {
        String str = this.imageUrl;
        if (str == null) {
            return;
        }
        SimpleDraweeView image = this.binding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        Boolean bool = Boolean.TRUE;
        Boolean boolValueOf = Boolean.valueOf(this.srcIsAnimated);
        SimpleDraweeView image2 = this.binding.image;
        Intrinsics.checkNotNullExpressionValue(image2, "image");
        SetOptionalImageUrlKt.setOptionalImageUrl(image, str, bool, boolValueOf, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(image2, this.placeholder, this.placeholderVersion), resizeWidthPx, resizeHeightPx);
        this.imageLoaded = true;
    }

    public static /* synthetic */ void loadImage$default(MediaImageView mediaImageView, Integer num, Integer num2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadImage");
        }
        if ((i7 & 1) != 0) {
            num = null;
        }
        if ((i7 & 2) != 0) {
            num2 = null;
        }
        mediaImageView.loadImage(num, num2);
    }

    private final boolean shouldShowGifIndicator(boolean shouldAutoPlayGif, String filename, boolean srcIsAnimated) {
        if (shouldAutoPlayGif) {
            return false;
        }
        int i7 = getLayoutParams().height;
        int i10 = GIF_INDICATOR_HEIGHT;
        int i11 = GIF_INDICATOR_PADDING;
        if (i7 > (i11 * 2) + i10) {
            if (getLayoutParams().width > (i11 * 2) + GIF_INDICATOR_WIDTH && filename != null) {
                return kotlin.text.x.h(filename, ".gif", true) || kotlin.text.x.h(filename, ".gifv", true) || (kotlin.text.x.h(filename, ".webp", false) && srcIsAnimated) || (kotlin.text.x.h(filename, ".avif", false) && srcIsAnimated);
            }
            return false;
        }
        return false;
    }

    @NotNull
    public final MediaImageViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
    public float getSingleAspectRatio() {
        TargetSize targetSize = this.targetSize;
        TargetSize targetSize2 = null;
        if (targetSize == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetSize");
            targetSize = null;
        }
        float width = targetSize.getWidth();
        TargetSize targetSize3 = this.targetSize;
        if (targetSize3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetSize");
        } else {
            targetSize2 = targetSize3;
        }
        return width / targetSize2.getHeight();
    }

    public final void setAccessibility(String description, String hint, final String role) {
        String strO;
        String str = description == null ? role : description;
        SimpleDraweeView simpleDraweeView = this.binding.image;
        if (str != null) {
            String[] elements = {str, hint};
            Intrinsics.checkNotNullParameter(elements, "elements");
            strO = CollectionsKt.O(kotlin.collections.y.r(elements), ", ", null, null, null, 62);
        } else {
            strO = null;
        }
        simpleDraweeView.setContentDescription(strO);
        if (description == null) {
            role = null;
        }
        u0.p(this.binding.image, new androidx.core.view.b() { // from class: com.discord.chat.presentation.message.view.MediaImageView.setAccessibility.2
            @Override // androidx.core.view.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.w(role);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    public final void setContent(@NotNull String url, int width, int height, @NotNull MediaContainingViewResizer.ResizeMode resizeMode, String placeholder, Integer placeholderVersion, boolean isSpoiler, SpoilerConfig spoilerConfig, int radiusPx, UploadItemProps uploadItemProps, boolean isObscure, boolean isObscureAwaitingScan, boolean obscureHideControls, boolean obscureIsOpaque, boolean isPartOfMosaic, boolean shouldAutoPlayGif, String filename, boolean srcIsAnimated) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(resizeMode, "resizeMode");
        String str = this.imageUrl;
        if (str == null || !Intrinsics.areEqual(str, url)) {
            this.imageLoaded = false;
            this.imageUrl = url;
            this.srcIsAnimated = srcIsAnimated;
            this.placeholder = placeholder;
            this.placeholderVersion = placeholderVersion;
            ((GenericDraweeHierarchy) this.binding.image.getHierarchy()).l(isObscure ? 0 : this.imageFadeDuration);
            if (!isPartOfMosaic) {
                loadImage(Integer.valueOf(width), Integer.valueOf(height));
            }
        }
        boolean z5 = (isObscure || isObscureAwaitingScan) && !isPartOfMosaic;
        TargetSize targetSize = new TargetSize(getWidth(z5, width), getHeight(z5, height), resizeMode);
        TargetSize targetSize2 = this.targetSize;
        if (targetSize2 == null) {
            this.targetSize = targetSize;
        } else {
            if (targetSize2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("targetSize");
                targetSize2 = null;
            }
            if (!Intrinsics.areEqual(targetSize2, targetSize)) {
                this.targetSize = targetSize;
            }
        }
        this.binding.image.setBackgroundColor(0);
        SimpleDraweeView image = this.binding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        ViewClippingUtilsKt.clipToRoundedRectangle(image, radiusPx);
        this.binding.imageBlurBg.setBackgroundColor(0);
        FrameLayout imageBlurBg = this.binding.imageBlurBg;
        Intrinsics.checkNotNullExpressionValue(imageBlurBg, "imageBlurBg");
        ViewClippingUtilsKt.clipToRoundedRectangle(imageBlurBg, radiusPx);
        SpoilerViewManager spoilerViewManager = this.spoilerViewManager;
        ConstraintLayout container = this.binding.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        SimpleDraweeView image2 = this.binding.image;
        Intrinsics.checkNotNullExpressionValue(image2, "image");
        spoilerViewManager.configureSpoiler(spoilerConfig, this, container, image2, this.binding.imageBlurBg, isObscure && !isPartOfMosaic, isObscureAwaitingScan, isSpoiler || isObscure, radiusPx, obscureHideControls, obscureIsOpaque);
        AttachmentUploadOverlayViewManager attachmentUploadOverlayViewManager = this.attachmentUploadOverlay;
        ConstraintLayout container2 = this.binding.container;
        Intrinsics.checkNotNullExpressionValue(container2, "container");
        attachmentUploadOverlayViewManager.configureAttachmentOverlay(this, container2, radiusPx, uploadItemProps);
        configureGifIndicator(shouldAutoPlayGif, filename, srcIsAnimated);
    }

    @Override // com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
    public void setMosaicSize(int width, int height) {
        ViewGroup.LayoutParams layoutParams = this.binding.container.getLayoutParams();
        Integer numValueOf = layoutParams != null ? Integer.valueOf(layoutParams.width) : null;
        ViewGroup.LayoutParams layoutParams2 = this.binding.container.getLayoutParams();
        Integer numValueOf2 = layoutParams2 != null ? Integer.valueOf(layoutParams2.height) : null;
        boolean z5 = numValueOf == null || numValueOf.intValue() != width || numValueOf2 == null || numValueOf2.intValue() != height;
        ConstraintLayout container = this.binding.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewGroup.LayoutParams layoutParams3 = container.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams3.width = width;
        layoutParams3.height = height;
        container.setLayoutParams(layoutParams3);
        if (!this.imageLoaded || z5) {
            loadImage(Integer.valueOf(width), Integer.valueOf(height));
        }
    }

    public final void showAltTextButton(boolean show, String description, Function1<? super String, Unit> onAltTextButtonClicked) {
        AltTextButtonView altTextButtonView = this.binding.mediaViewAltTextButton;
        if (!show) {
            description = null;
        }
        altTextButtonView.configure(description, onAltTextButtonClicked);
    }

    public final void showDescription(boolean show, String description) {
        TextView textView = this.binding.imageAltText;
        Intrinsics.checkNotNull(textView);
        ViewUtilsKt.setOptionalText(textView, description);
        textView.setVisibility(description != null && show ? 0 : 8);
    }

    public /* synthetic */ MediaImageView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaImageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        MediaImageViewBinding mediaImageViewBindingInflate = MediaImageViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(mediaImageViewBindingInflate, "inflate(...)");
        this.binding = mediaImageViewBindingInflate;
        this.spoilerViewManager = new SpoilerViewManager();
        this.attachmentUploadOverlay = new AttachmentUploadOverlayViewManager();
        this.imageFadeDuration = getResources().getInteger(R.integer.image_fade_duration);
        ((GenericDraweeHierarchy) mediaImageViewBindingInflate.image.getHierarchy()).k(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundModNormal()), 1);
        TextView textView = mediaImageViewBindingInflate.imageAltText;
        textView.setImportantForAccessibility(4);
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryNormal);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
        mediaImageViewBindingInflate.imageBlurBg.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLower());
    }
}
