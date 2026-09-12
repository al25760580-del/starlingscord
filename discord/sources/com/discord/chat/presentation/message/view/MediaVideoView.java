package com.discord.chat.presentation.message.view;

import android.content.Context;
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
import com.discord.chat.databinding.VideoAttachmentViewBinding;
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.R;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaSource;
import com.discord.media_player.MediaType;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002^_B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJó\u0001\u00100\u001a\u00020-2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00172\b\u0010$\u001a\u0004\u0018\u00010\u000f2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\r2\b\u0010(\u001a\u0004\u0018\u00010\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b.\u0010/J+\u00104\u001a\u00020-2\b\u00101\u001a\u0004\u0018\u00010\u000f2\b\u00102\u001a\u0004\u0018\u00010\u000f2\b\u00103\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020-2\u0006\u00106\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b7\u00108J;\u0010<\u001a\u00020-2\u0006\u00106\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u00010\u000f2\u001a\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020-\u0018\u000109j\u0004\u0018\u0001`:¢\u0006\u0004\b<\u0010=J\u001f\u0010B\u001a\u00020-2\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@¢\u0006\u0004\bB\u0010CJ!\u0010F\u001a\u00020-2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020-09¢\u0006\u0004\bF\u0010GJ\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020-2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\bK\u0010LR\u0016\u0010N\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010Q\u001a\u00020P8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]¨\u0006`"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaVideoView;", "Landroid/widget/FrameLayout;", "Lcom/discord/chat/presentation/message/view/mosaic_recycler/MosaicView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/MessageId;", "messageId", "", "attachmentIndex", "", "sourceUrl", "previewUrl", "width", "height", "placeholder", "placeholderVersion", "radiusPx", "", "isPartOfMosaic", "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "isObscure", "isObscureAwaitingScan", "obscureHideControls", "obscureIsOpaque", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "uploadItemProps", "canPlayInline", "hideMediaPlayButton", "overlayTagText", "Lcom/discord/react_asset_fetcher/ReactAsset;", "overlayTagIcon", "overlayTagBackgroundColor", "overlayTagTextColor", "", "portal", "Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "playerSettings", "", "setContent-w--JTRs", "(Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;IZZLcom/discord/chat/bridge/spoiler/SpoilerConfig;ZZZZLcom/discord/chat/presentation/message/view/UploadItemProps;ZZLjava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;Ljava/lang/Integer;DLcom/discord/media_player/MediaPlayer$PlayerSettings;)V", "setContent", "description", "hint", ViewProps.ROLE, "setAccessibility", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "show", "showDescription", "(ZLjava/lang/String;)V", "Lkotlin/Function1;", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onAltTextButtonClicked", "showAltTextButton", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "setOnMediaClickListeners", "(Landroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;)V", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "onMediaPlayFinishedAnalytics", "setMediaAnalyticsListener", "(Lkotlin/jvm/functions/Function1;)V", "", "getSingleAspectRatio", "()F", "setMosaicSize", "(II)V", "Lcom/discord/chat/presentation/message/view/MediaVideoView$TargetSize;", "targetSize", "Lcom/discord/chat/presentation/message/view/MediaVideoView$TargetSize;", "Lcom/discord/chat/presentation/message/view/MediaVideoView$TargetUrl;", "targetUrl", "Lcom/discord/chat/presentation/message/view/MediaVideoView$TargetUrl;", "Lcom/discord/chat/databinding/VideoAttachmentViewBinding;", "binding", "Lcom/discord/chat/databinding/VideoAttachmentViewBinding;", "Lcom/discord/chat/presentation/message/view/SpoilerViewManager;", "spoilerViewManager", "Lcom/discord/chat/presentation/message/view/SpoilerViewManager;", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayViewManager;", "attachmentUploadOverlay", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayViewManager;", "thumbnailFadeDuration", "I", "TargetSize", "TargetUrl", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMediaVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaVideoView.kt\ncom/discord/chat/presentation/message/view/MediaVideoView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,230:1\n1#2:231\n257#3,2:232\n311#3:234\n327#3,4:235\n312#3:239\n*S KotlinDebug\n*F\n+ 1 MediaVideoView.kt\ncom/discord/chat/presentation/message/view/MediaVideoView\n*L\n193#1:232,2\n224#1:234\n224#1:235,4\n224#1:239\n*E\n"})
public final class MediaVideoView extends FrameLayout implements MosaicView {

    @NotNull
    private final AttachmentUploadOverlayViewManager attachmentUploadOverlay;

    @NotNull
    private final VideoAttachmentViewBinding binding;

    @NotNull
    private final SpoilerViewManager spoilerViewManager;
    private TargetSize targetSize;
    private TargetUrl targetUrl;
    private final int thumbnailFadeDuration;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaVideoView$TargetSize;", "", "width", "", "height", "<init>", "(II)V", "getWidth", "()I", "getHeight", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TargetSize {
        private final int height;
        private final int width;

        public TargetSize(int i7, int i10) {
            this.width = i7;
            this.height = i10;
        }

        public static /* synthetic */ TargetSize copy$default(TargetSize targetSize, int i7, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i7 = targetSize.width;
            }
            if ((i11 & 2) != 0) {
                i10 = targetSize.height;
            }
            return targetSize.copy(i7, i10);
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
        public final TargetSize copy(int width, int height) {
            return new TargetSize(width, height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetSize)) {
                return false;
            }
            TargetSize targetSize = (TargetSize) other;
            return this.width == targetSize.width && this.height == targetSize.height;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + (Integer.hashCode(this.width) * 31);
        }

        @NotNull
        public String toString() {
            return s0.g.c(this.width, "TargetSize(width=", this.height, ", height=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaVideoView$TargetUrl;", "", "sourceUrl", "", "previewUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSourceUrl", "()Ljava/lang/String;", "getPreviewUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TargetUrl {

        @NotNull
        private final String previewUrl;

        @NotNull
        private final String sourceUrl;

        public TargetUrl(@NotNull String sourceUrl, @NotNull String previewUrl) {
            Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
            Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
            this.sourceUrl = sourceUrl;
            this.previewUrl = previewUrl;
        }

        public static /* synthetic */ TargetUrl copy$default(TargetUrl targetUrl, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = targetUrl.sourceUrl;
            }
            if ((i7 & 2) != 0) {
                str2 = targetUrl.previewUrl;
            }
            return targetUrl.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSourceUrl() {
            return this.sourceUrl;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        @NotNull
        public final TargetUrl copy(@NotNull String sourceUrl, @NotNull String previewUrl) {
            Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
            Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
            return new TargetUrl(sourceUrl, previewUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TargetUrl)) {
                return false;
            }
            TargetUrl targetUrl = (TargetUrl) other;
            return Intrinsics.areEqual(this.sourceUrl, targetUrl.sourceUrl) && Intrinsics.areEqual(this.previewUrl, targetUrl.previewUrl);
        }

        @NotNull
        public final String getPreviewUrl() {
            return this.previewUrl;
        }

        @NotNull
        public final String getSourceUrl() {
            return this.sourceUrl;
        }

        public int hashCode() {
            return this.previewUrl.hashCode() + (this.sourceUrl.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return s0.g.f("TargetUrl(sourceUrl=", this.sourceUrl, ", previewUrl=", this.previewUrl, ")");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaVideoView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setContent_w__JTRs$lambda$1(boolean z5, MediaVideoView mediaVideoView) {
        SpoilerView spoilerView;
        if (z5 && (spoilerView = mediaVideoView.spoilerViewManager.getSpoilerView()) != null) {
            spoilerView.makeObscureHideButtonHidden();
        }
        return Unit.f14616a;
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
        MediaView mediaView = this.binding.mediaView;
        if (str != null) {
            String[] elements = {str, hint};
            Intrinsics.checkNotNullParameter(elements, "elements");
            strO = CollectionsKt.O(kotlin.collections.y.r(elements), ", ", null, null, null, 62);
        } else {
            strO = null;
        }
        mediaView.setContentDescription(strO);
        if (description == null) {
            role = null;
        }
        u0.p(this.binding.mediaView, new androidx.core.view.b() { // from class: com.discord.chat.presentation.message.view.MediaVideoView.setAccessibility.2
            @Override // androidx.core.view.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.w(role);
            }
        });
    }

    /* JADX INFO: renamed from: setContent-w--JTRs, reason: not valid java name */
    public final void m746setContentwJTRs(ChannelId channelId, String messageId, Integer attachmentIndex, @NotNull String sourceUrl, @NotNull String previewUrl, int width, int height, String placeholder, Integer placeholderVersion, int radiusPx, boolean isPartOfMosaic, boolean isSpoiler, SpoilerConfig spoilerConfig, boolean isObscure, boolean isObscureAwaitingScan, boolean obscureHideControls, boolean obscureIsOpaque, UploadItemProps uploadItemProps, boolean canPlayInline, boolean hideMediaPlayButton, String overlayTagText, ReactAsset overlayTagIcon, Integer overlayTagBackgroundColor, Integer overlayTagTextColor, double portal, @NotNull MediaPlayer.PlayerSettings playerSettings) {
        final boolean z5;
        MediaVideoView mediaVideoView;
        Intrinsics.checkNotNullParameter(sourceUrl, "sourceUrl");
        Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
        Intrinsics.checkNotNullParameter(playerSettings, "playerSettings");
        MediaView mediaView = this.binding.mediaView;
        com.facebook.drawee.drawable.o oVar = isPartOfMosaic ? com.facebook.drawee.drawable.o.f4689c : com.facebook.drawee.drawable.o.f4692f;
        Intrinsics.checkNotNull(oVar);
        mediaView.setImagePreviewScaleType(oVar);
        TargetUrl targetUrl = new TargetUrl(sourceUrl, previewUrl);
        TargetUrl targetUrl2 = this.targetUrl;
        if (targetUrl2 == null || !Intrinsics.areEqual(targetUrl2, targetUrl)) {
            this.targetUrl = targetUrl;
            z5 = isObscure;
            mediaVideoView = this;
            MediaView.setMediaData$default(this.binding.mediaView, new MediaSource(sourceUrl, previewUrl, placeholder, placeholderVersion, a3.e.l("video attachment: ", sourceUrl), MediaType.VIDEO, false, channelId, messageId, attachmentIndex, Double.valueOf(portal), null, 2112, null), false, false, false, null, false, null, null, canPlayInline, false, hideMediaPlayButton, z5 ? 0 : this.thumbnailFadeDuration, new Function0() { // from class: com.discord.chat.presentation.message.view.p
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MediaVideoView.setContent_w__JTRs$lambda$1(z5, this);
                }
            }, overlayTagText, overlayTagIcon, overlayTagBackgroundColor, overlayTagTextColor, playerSettings, null, 262910, null);
        } else {
            mediaVideoView = this;
            z5 = isObscure;
        }
        TargetSize targetSize = new TargetSize(width, height);
        TargetSize targetSize2 = mediaVideoView.targetSize;
        if (targetSize2 == null || !Intrinsics.areEqual(targetSize2, targetSize)) {
            mediaVideoView.targetSize = targetSize;
        }
        MediaView mediaView2 = mediaVideoView.binding.mediaView;
        Intrinsics.checkNotNullExpressionValue(mediaView2, "mediaView");
        ViewClippingUtilsKt.clipToRoundedRectangle(mediaView2, radiusPx);
        SpoilerViewManager spoilerViewManager = mediaVideoView.spoilerViewManager;
        ConstraintLayout container = mediaVideoView.binding.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ConstraintLayout container2 = mediaVideoView.binding.container;
        Intrinsics.checkNotNullExpressionValue(container2, "container");
        MediaView mediaView3 = mediaVideoView.binding.mediaView;
        Intrinsics.checkNotNullExpressionValue(mediaView3, "mediaView");
        boolean z6 = z5 && !isPartOfMosaic;
        boolean z7 = isSpoiler || z5;
        MediaVideoView mediaVideoView2 = mediaVideoView;
        spoilerViewManager.configureSpoiler(spoilerConfig, container, container2, mediaView3, null, z6, isObscureAwaitingScan, z7, radiusPx, obscureHideControls, obscureIsOpaque);
        AttachmentUploadOverlayViewManager attachmentUploadOverlayViewManager = mediaVideoView2.attachmentUploadOverlay;
        ConstraintLayout container3 = mediaVideoView2.binding.container;
        Intrinsics.checkNotNullExpressionValue(container3, "container");
        attachmentUploadOverlayViewManager.configureAttachmentOverlay(mediaVideoView2, container3, radiusPx, uploadItemProps);
    }

    public final void setMediaAnalyticsListener(@NotNull Function1<? super MediaPlayFinishedAnalytics, Unit> onMediaPlayFinishedAnalytics) {
        Intrinsics.checkNotNullParameter(onMediaPlayFinishedAnalytics, "onMediaPlayFinishedAnalytics");
        this.binding.mediaView.setAnalyticsListener(onMediaPlayFinishedAnalytics);
    }

    @Override // com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
    public void setMosaicSize(int width, int height) {
        ConstraintLayout container = this.binding.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewGroup.LayoutParams layoutParams = container.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = width;
        layoutParams.height = height;
        container.setLayoutParams(layoutParams);
    }

    public final void setOnMediaClickListeners(@NotNull View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.binding.mediaView.setOnMediaClickListeners(onClickListener, onLongClickListener);
    }

    public final void showAltTextButton(boolean show, String description, Function1<? super String, Unit> onAltTextButtonClicked) {
        AltTextButtonView altTextButtonView = this.binding.mediaViewAltTextButton;
        if (!show) {
            description = null;
        }
        altTextButtonView.configure(description, onAltTextButtonClicked);
    }

    public final void showDescription(boolean show, String description) {
        TextView textView = this.binding.mediaViewAltText;
        Intrinsics.checkNotNull(textView);
        ViewUtilsKt.setOptionalText(textView, description);
        textView.setVisibility(description != null && show ? 0 : 8);
    }

    public /* synthetic */ MediaVideoView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVideoView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        VideoAttachmentViewBinding videoAttachmentViewBindingInflate = VideoAttachmentViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(videoAttachmentViewBindingInflate, "inflate(...)");
        this.binding = videoAttachmentViewBindingInflate;
        this.spoilerViewManager = new SpoilerViewManager();
        this.attachmentUploadOverlay = new AttachmentUploadOverlayViewManager();
        this.thumbnailFadeDuration = getResources().getInteger(R.integer.image_fade_duration);
        TextView textView = videoAttachmentViewBindingInflate.mediaViewAltText;
        textView.setImportantForAccessibility(4);
        Intrinsics.checkNotNull(textView);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryNormal);
        textView.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(textView, 12.0f);
    }
}
