package com.discord.chat.presentation.message.viewholder;

import android.view.View;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.message.view.MediaVideoView;
import com.discord.chat.presentation.message.view.UploadItemProps;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.primitives.ChannelId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jã\u0002\u0010;\u001a\u00020 2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001e\u001a\u00020\u00132\u001a\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 \u0018\u00010\u001fj\u0004\u0018\u0001`!2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00132\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u0010,\u001a\u0004\u0018\u00010\n2\b\u0010-\u001a\u0004\u0018\u00010\n2\b\u0010.\u001a\u0004\u0018\u00010\f2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u0001032\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020 0\u001f2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010<¨\u0006="}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/MediaVideoViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/MediaVideoView;", "view", "<init>", "(Lcom/discord/chat/presentation/message/view/MediaVideoView;)V", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/MessageId;", "messageId", "", "attachmentIndex", "", "url", "previewUrl", "height", "width", "placeholder", "placeholderVersion", "", "isSpoiler", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "isObscure", "isObscureAwaitingScan", "obscureHideControls", "obscureIsOpaque", "showDescription", "description", "descriptionHint", "useNewAltTextButton", "Lkotlin/Function1;", "", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onAltTextButtonClicked", "radiusPx", "isPartOfMosaic", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "uploadItemProps", "canPlayInline", "hideMediaPlayButton", "overlayTagText", "Lcom/discord/react_asset_fetcher/ReactAsset;", "overlayTagIcon", "overlayTagBackgroundColor", "overlayTagTextColor", ViewProps.ACCESSIBILITY_ROLE, "", "portal", "Landroid/view/View$OnClickListener;", "onClicked", "Landroid/view/View$OnLongClickListener;", "onLongClicked", "Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;", "onMediaPlayFinishedAnalytics", "Lcom/discord/media_player/MediaPlayer$PlayerSettings;", "playerSettings", "bind-l_cVQvE", "(Lcom/discord/primitives/ChannelId;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;ZLcom/discord/chat/bridge/spoiler/SpoilerConfig;ZZZZZLjava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;IZLcom/discord/chat/presentation/message/view/UploadItemProps;ZZLjava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;DLandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function1;Lcom/discord/media_player/MediaPlayer$PlayerSettings;)V", "bind", "Lcom/discord/chat/presentation/message/view/MediaVideoView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MediaVideoViewHolder extends MessagePartViewHolder {

    @NotNull
    private final MediaVideoView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaVideoViewHolder(@NotNull MediaVideoView view) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    /* JADX INFO: renamed from: bind-l_cVQvE, reason: not valid java name */
    public final void m777bindl_cVQvE(ChannelId channelId, String messageId, Integer attachmentIndex, @NotNull String url, @NotNull String previewUrl, int height, int width, String placeholder, Integer placeholderVersion, boolean isSpoiler, SpoilerConfig spoilerConfig, boolean isObscure, boolean isObscureAwaitingScan, boolean obscureHideControls, boolean obscureIsOpaque, boolean showDescription, String description, String descriptionHint, boolean useNewAltTextButton, Function1<? super String, Unit> onAltTextButtonClicked, int radiusPx, boolean isPartOfMosaic, UploadItemProps uploadItemProps, boolean canPlayInline, boolean hideMediaPlayButton, String overlayTagText, ReactAsset overlayTagIcon, Integer overlayTagBackgroundColor, Integer overlayTagTextColor, String accessibilityRole, double portal, @NotNull View.OnClickListener onClicked, View.OnLongClickListener onLongClicked, @NotNull Function1<? super MediaPlayFinishedAnalytics, Unit> onMediaPlayFinishedAnalytics, @NotNull MediaPlayer.PlayerSettings playerSettings) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(previewUrl, "previewUrl");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Intrinsics.checkNotNullParameter(onMediaPlayFinishedAnalytics, "onMediaPlayFinishedAnalytics");
        Intrinsics.checkNotNullParameter(playerSettings, "playerSettings");
        this.view.m746setContentwJTRs(channelId, messageId, attachmentIndex, url, previewUrl, width, height, placeholder, placeholderVersion, radiusPx, isPartOfMosaic, isSpoiler, spoilerConfig, isObscure, isObscureAwaitingScan, obscureHideControls, obscureIsOpaque, uploadItemProps, canPlayInline, hideMediaPlayButton, overlayTagText, overlayTagIcon, overlayTagBackgroundColor, overlayTagTextColor, portal, playerSettings);
        this.view.setAccessibility(description, descriptionHint, accessibilityRole);
        boolean z5 = false;
        this.view.showAltTextButton(useNewAltTextButton && showDescription, description, onAltTextButtonClicked);
        MediaVideoView mediaVideoView = this.view;
        if (!useNewAltTextButton && showDescription) {
            z5 = true;
        }
        mediaVideoView.showDescription(z5, description);
        this.view.setOnMediaClickListeners(onClicked, onLongClicked);
        this.view.setMediaAnalyticsListener(onMediaPlayFinishedAnalytics);
    }
}
