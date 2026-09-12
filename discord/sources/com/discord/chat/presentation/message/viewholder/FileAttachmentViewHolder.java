package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory;
import com.discord.chat.presentation.message.view.FileAttachmentView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/FileAttachmentViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/message/view/FileAttachmentView;", "view", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "<init>", "(Lcom/discord/chat/presentation/message/view/FileAttachmentView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;", "fileAttachmentItem", "Lkotlin/Function2;", "", "", ViewProps.ON_CLICK, "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "bind", "(Lcom/discord/chat/presentation/message/messagepart/FileAttachmentMessageAccessory;Lkotlin/jvm/functions/Function2;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;)V", "Lcom/discord/chat/presentation/message/view/FileAttachmentView;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileAttachmentViewHolder extends MessagePartViewHolder {

    @NotNull
    private final ChatEventHandler eventHandler;

    @NotNull
    private final FileAttachmentView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileAttachmentViewHolder(@NotNull FileAttachmentView view, @NotNull ChatEventHandler eventHandler) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.view = view;
        this.eventHandler = eventHandler;
    }

    public final void bind(@NotNull FileAttachmentMessageAccessory fileAttachmentItem, @NotNull Function2<? super String, ? super String, Unit> onClick, SpoilerConfig spoilerConfig) {
        Intrinsics.checkNotNullParameter(fileAttachmentItem, "fileAttachmentItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Attachment attachment = fileAttachmentItem.getAttachment();
        this.view.setContent(attachment.getFilename(), attachment.getSize(), attachment.getUrl(), attachment.isSuspiciousDownload(), onClick, attachment.isSpoiler(), spoilerConfig, fileAttachmentItem.getUploadItemProps(new FileAttachmentViewHolder$bind$uploadItemProps$1(this.eventHandler)), attachment.getBackgroundColor());
    }
}
