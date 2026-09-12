package com.discord.chat.presentation.message.viewholder.mosaicitem.attachments;

import android.view.View;
import com.discord.chat.R;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.botuikit.MediaGalleryItem;
import com.discord.chat.bridge.media.UnfurledMediaItem;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.MediaImageView;
import com.discord.chat.presentation.message.view.UploadItemProps;
import com.discord.chat.presentation.message.viewholder.MediaImageViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0081\u0001\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u00142\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u0014j\u0002`\u00162\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJa\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u00142\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/mosaicitem/attachments/MosaicItemMessageAttachmentImageViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MediaImageViewHolder;", "Lcom/discord/chat/presentation/message/view/MediaImageView;", "view", "<init>", "(Lcom/discord/chat/presentation/message/view/MediaImageView;)V", "", "containerId", "componentId", "Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;", "mediaGalleryItem", "", "isSingleItemMosaic", "Landroid/view/View$OnClickListener;", "onClicked", "Landroid/view/View$OnLongClickListener;", "onLongClicked", "Lkotlin/Function0;", "", "onTapSpoiler", "Lkotlin/Function1;", "onTapObscureToggle", "Lcom/discord/chat/presentation/events/MessageTapShowAltText;", "onAltTextButtonClicked", "shouldAutoPlayGif", "bindGalleryItem", "(Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/botuikit/MediaGalleryItem;ZLandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)V", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;", "imageAttachmentMessageAccessory", "bindAttachment", "(Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/messagepart/ImageAttachmentMessageAccessory;ZLandroid/view/View$OnClickListener;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Z)V", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MosaicItemMessageAttachmentImageViewHolder extends MediaImageViewHolder {

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder$bindAttachment$1, reason: invalid class name */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MosaicItemMessageAttachmentImageViewHolder(@NotNull MediaImageView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public final void bindAttachment(@NotNull ChatEventHandler eventHandler, @NotNull ImageAttachmentMessageAccessory imageAttachmentMessageAccessory, boolean isSingleItemMosaic, @NotNull View.OnClickListener onClicked, View.OnLongClickListener onLongClicked, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super Boolean, Unit> onTapObscureToggle, boolean shouldAutoPlayGif) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(imageAttachmentMessageAccessory, "imageAttachmentMessageAccessory");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapObscureToggle, "onTapObscureToggle");
        Attachment attachment = imageAttachmentMessageAccessory.getAttachment();
        UploadItemProps uploadItemProps = imageAttachmentMessageAccessory.getUploadItemProps(new MosaicItemMessageAttachmentImageViewHolder$bindAttachment$uploadItemProps$1(eventHandler));
        String url = attachment.getUrl();
        int width = attachment.getWidth();
        int height = attachment.getHeight();
        String placeholder = attachment.getPlaceholder();
        Integer placeholderVersion = attachment.getPlaceholderVersion();
        int radiusPx = imageAttachmentMessageAccessory.getRadiusPx();
        MediaContainingViewResizer.ResizeMode resizeMode = isSingleItemMosaic ? MediaContainingViewResizer.ResizeMode.Fill : MediaContainingViewResizer.ResizeMode.Cover;
        boolean z5 = !isSingleItemMosaic;
        boolean zIsSpoiler = attachment.isSpoiler();
        SpoilerAttributes spoilerAttributes = imageAttachmentMessageAccessory.getSpoilerAttributes();
        SpoilerConfig spoilerConfigConfigure = spoilerAttributes != null ? spoilerAttributes.configure(onTapSpoiler, onTapObscureToggle) : null;
        Boolean obscure = attachment.getObscure();
        boolean zBooleanValue = obscure != null ? obscure.booleanValue() : false;
        Boolean obscureAwaitingScan = attachment.getObscureAwaitingScan();
        boolean zBooleanValue2 = obscureAwaitingScan != null ? obscureAwaitingScan.booleanValue() : false;
        Boolean obscureHideControls = attachment.getObscureHideControls();
        boolean zBooleanValue3 = obscureHideControls != null ? obscureHideControls.booleanValue() : false;
        Boolean obscureIsOpaque = attachment.getObscureIsOpaque();
        boolean zBooleanValue4 = obscureIsOpaque != null ? obscureIsOpaque.booleanValue() : false;
        boolean showDescription = attachment.getShowDescription();
        String description = attachment.getDescription();
        String hint = attachment.getHint();
        boolean useNewAltTextButton = imageAttachmentMessageAccessory.getUseNewAltTextButton();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(eventHandler);
        String role = attachment.getRole();
        String filename = attachment.getFilename();
        Boolean srcIsAnimated = attachment.getSrcIsAnimated();
        bind(url, width, height, placeholder, placeholderVersion, zIsSpoiler, spoilerConfigConfigure, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, showDescription, description, hint, useNewAltTextButton, anonymousClass1, radiusPx, resizeMode, z5, onClicked, onLongClicked, uploadItemProps, role, shouldAutoPlayGif, filename, srcIsAnimated != null ? srcIsAnimated.booleanValue() : false);
    }

    public final void bindGalleryItem(@NotNull String containerId, @NotNull String componentId, @NotNull MediaGalleryItem mediaGalleryItem, boolean isSingleItemMosaic, @NotNull View.OnClickListener onClicked, View.OnLongClickListener onLongClicked, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super Boolean, Unit> onTapObscureToggle, @NotNull Function1<? super String, Unit> onAltTextButtonClicked, boolean shouldAutoPlayGif) {
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
        Integer width = media.getWidth();
        int iIntValue = width != null ? width.intValue() : 0;
        Integer height = media.getHeight();
        bind(proxyUrl, iIntValue, height != null ? height.intValue() : 0, media.getPlaceholder(), media.getPlaceholderVersion(), mediaGalleryItem.isSpoiler(), spoilerAttributesForGenericMedia != null ? spoilerAttributesForGenericMedia.configure(onTapSpoiler, onTapObscureToggle) : null, mediaGalleryItem.isObscure(), mediaGalleryItem.isObscureAwaitingScan(), mediaGalleryItem.getObscureHideControls(), mediaGalleryItem.getObscureIsOpaque(), mediaGalleryItem.getShowDescription(), mediaGalleryItem.getDescription(), mediaGalleryItem.getDescriptionHint(), mediaGalleryItem.getShowDescription(), onAltTextButtonClicked, this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius), isSingleItemMosaic ? MediaContainingViewResizer.ResizeMode.Fill : MediaContainingViewResizer.ResizeMode.Cover, !isSingleItemMosaic, onClicked, onLongClicked, null, mediaGalleryItem.getAccessibilityRole(), shouldAutoPlayGif, null, mediaGalleryItem.getMedia().getSrcIsAnimated());
    }
}
