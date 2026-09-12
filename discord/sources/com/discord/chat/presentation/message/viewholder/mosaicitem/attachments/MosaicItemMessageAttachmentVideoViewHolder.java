package com.discord.chat.presentation.message.viewholder.mosaicitem.attachments;

import android.view.View;
import com.discord.chat.R;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.bridge.media.UnfurledMediaItem;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.delegate.a;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.MediaVideoView;
import com.discord.chat.presentation.message.view.UploadItemProps;
import com.discord.chat.presentation.message.viewholder.MediaVideoViewHolder;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics;
import com.discord.primitives.ChannelId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jy\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u00142\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0014j\u0002`\u0016¢\u0006\u0004\b\u0018\u0010\u0019JY\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/mosaicitem/attachments/MosaicItemMessageAttachmentVideoViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MediaVideoViewHolder;", "Lcom/discord/chat/presentation/message/view/MediaVideoView;", "view", "<init>", "(Lcom/discord/chat/presentation/message/view/MediaVideoView;)V", "", "containerId", "componentId", "Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;", "mediaGalleryItem", "", "isSingleItemMosaic", "Landroid/view/View$OnClickListener;", "onClicked", "Landroid/view/View$OnLongClickListener;", "onLongClicked", "Lkotlin/Function0;", "", "onTapSpoiler", "Lkotlin/Function1;", "onTapObscureToggle", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onAltTextButtonClicked", "bindGalleryItem", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;ZLandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;", "item", "bindAttachment", "(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/messagepart/VideoAttachmentMessageAccessory;ZLandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MosaicItemMessageAttachmentVideoViewHolder extends MediaVideoViewHolder {

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder$bindAttachment$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.f14616a;
        }

        public final void invoke(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapShowAltText(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder$bindAttachment$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<MediaPlayFinishedAnalytics, Unit> {
        public AnonymousClass2(Object obj) {
            super(1, obj, ChatEventHandler.class, "onMediaPlayFinishedAnalytics", "onMediaPlayFinishedAnalytics(Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((MediaPlayFinishedAnalytics) obj);
            return Unit.f14616a;
        }

        public final void invoke(MediaPlayFinishedAnalytics p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onMediaPlayFinishedAnalytics(p3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosaicItemMessageAttachmentVideoViewHolder(@NotNull MediaVideoView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindGalleryItem$lambda$0(MediaPlayFinishedAnalytics it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    public final void bindAttachment(@NotNull ChatEventHandler eventHandler, @NotNull VideoAttachmentMessageAccessory item, boolean isSingleItemMosaic, @NotNull View.OnClickListener onClicked, View.OnLongClickListener onLongClicked, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super Boolean, Unit> onTapObscureToggle) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapObscureToggle, "onTapObscureToggle");
        Attachment attachment = item.getAttachment();
        UploadItemProps uploadItemProps = item.getUploadItemProps(new MosaicItemMessageAttachmentVideoViewHolder$bindAttachment$uploadItemProps$1(eventHandler));
        long jM718getChannelIdo4g7jtM = item.m718getChannelIdo4g7jtM();
        String messageId = item.getMessageId();
        int attachmentIndex = item.getAttachmentIndex();
        String videoUrl = attachment.getVideoUrl();
        Intrinsics.checkNotNull(videoUrl);
        String url = attachment.getUrl();
        int width = attachment.getWidth();
        int height = attachment.getHeight();
        String placeholder = attachment.getPlaceholder();
        Integer placeholderVersion = attachment.getPlaceholderVersion();
        int radiusPx = item.getRadiusPx();
        boolean z5 = !isSingleItemMosaic;
        boolean zIsSpoiler = attachment.isSpoiler();
        SpoilerAttributes spoilerAttributes = item.getSpoilerAttributes();
        SpoilerConfig spoilerConfigConfigure = spoilerAttributes != null ? spoilerAttributes.configure(onTapSpoiler, onTapObscureToggle) : null;
        Boolean obscure = attachment.getObscure();
        boolean zBooleanValue = obscure != null ? obscure.booleanValue() : false;
        Boolean obscureAwaitingScan = attachment.getObscureAwaitingScan();
        boolean zBooleanValue2 = obscureAwaitingScan != null ? obscureAwaitingScan.booleanValue() : false;
        Boolean obscureHideControls = attachment.getObscureHideControls();
        boolean zBooleanValue3 = obscureHideControls != null ? obscureHideControls.booleanValue() : false;
        Boolean obscureIsOpaque = attachment.getObscureIsOpaque();
        m777bindl_cVQvE(ChannelId.m1130boximpl(jM718getChannelIdo4g7jtM), messageId, Integer.valueOf(attachmentIndex), videoUrl, url, height, width, placeholder, placeholderVersion, zIsSpoiler, spoilerConfigConfigure, zBooleanValue, zBooleanValue2, zBooleanValue3, obscureIsOpaque != null ? obscureIsOpaque.booleanValue() : false, attachment.getShowDescription(), attachment.getDescription(), attachment.getHint(), item.getUseNewAltTextButton(), new AnonymousClass1(eventHandler), radiusPx, z5, uploadItemProps, isSingleItemMosaic, item.getHideMediaPlayButton(), attachment.getAttachmentTagText(), attachment.getAttachmentTagIcon(), attachment.getAttachmentTagBackgroundColor(), attachment.getAttachmentTagTextColor(), attachment.getRole(), item.getPortal(), onClicked, onLongClicked, new AnonymousClass2(eventHandler), attachment.getPlayerSettings());
    }

    public final void bindGalleryItem(@NotNull String containerId, @NotNull String componentId, @NotNull MediaGalleryItem mediaGalleryItem, boolean isSingleItemMosaic, @NotNull View.OnClickListener onClicked, View.OnLongClickListener onLongClicked, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super Boolean, Unit> onTapObscureToggle, @NotNull Function1<? super String, Unit> onAltTextButtonClicked) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        Intrinsics.checkNotNullParameter(mediaGalleryItem, "mediaGalleryItem");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapObscureToggle, "onTapObscureToggle");
        Intrinsics.checkNotNullParameter(onAltTextButtonClicked, "onAltTextButtonClicked");
        UnfurledMediaItem media = mediaGalleryItem.getMedia();
        SpoilerAttributes spoilerAttributesForGenericMedia = SpoilerAttributes.INSTANCE.forGenericMedia(mediaGalleryItem, containerId, g.e("MediaGalleryDisplayComponent(", componentId, ").item[image]"), mediaGalleryItem.getMedia().getProxyUrl(), mediaGalleryItem.getVerifyAge());
        String proxyUrl = media.getProxyUrl();
        String videoPreviewUrl = mediaGalleryItem.getVideoPreviewUrl();
        Intrinsics.checkNotNull(videoPreviewUrl);
        Integer width = media.getWidth();
        int iIntValue = width != null ? width.intValue() : 0;
        Integer height = media.getHeight();
        int iIntValue2 = height != null ? height.intValue() : 0;
        String placeholder = media.getPlaceholder();
        Integer placeholderVersion = media.getPlaceholderVersion();
        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
        boolean z5 = !isSingleItemMosaic;
        boolean zIsSpoiler = mediaGalleryItem.isSpoiler();
        SpoilerConfig spoilerConfigConfigure = spoilerAttributesForGenericMedia != null ? spoilerAttributesForGenericMedia.configure(onTapSpoiler, onTapObscureToggle) : null;
        boolean zIsObscure = mediaGalleryItem.isObscure();
        boolean zIsObscureAwaitingScan = mediaGalleryItem.isObscureAwaitingScan();
        boolean obscureHideControls = mediaGalleryItem.getObscureHideControls();
        boolean obscureIsOpaque = mediaGalleryItem.getObscureIsOpaque();
        boolean showDescription = mediaGalleryItem.getShowDescription();
        String description = mediaGalleryItem.getDescription();
        String descriptionHint = mediaGalleryItem.getDescriptionHint();
        boolean showDescription2 = mediaGalleryItem.getShowDescription();
        String accessibilityRole = mediaGalleryItem.getAccessibilityRole();
        Double portalId = mediaGalleryItem.getPortalId();
        Intrinsics.checkNotNull(portalId);
        m777bindl_cVQvE(null, null, null, proxyUrl, videoPreviewUrl, iIntValue2, iIntValue, placeholder, placeholderVersion, zIsSpoiler, spoilerConfigConfigure, zIsObscure, zIsObscureAwaitingScan, obscureHideControls, obscureIsOpaque, showDescription, description, descriptionHint, showDescription2, onAltTextButtonClicked, dimensionPixelSize, z5, null, isSingleItemMosaic, false, null, null, null, null, accessibilityRole, portalId.doubleValue(), onClicked, onLongClicked, new a(25), MediaPlayer.INSTANCE.getDefaultSettings());
    }
}
