package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/FlaggedMessageEmbedViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "embeddedMessageView", "Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "messageEmbedAccessory", "Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlaggedMessageEmbedViewHolder extends MessagePartViewHolder {

    @NotNull
    private final FlaggedMessageEmbedView embeddedMessageView;
    private final ChatEventHandler eventHandler;

    public /* synthetic */ FlaggedMessageEmbedViewHolder(FlaggedMessageEmbedView flaggedMessageEmbedView, ChatEventHandler chatEventHandler, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(flaggedMessageEmbedView, (i7 & 2) != 0 ? null : chatEventHandler);
    }

    public final void bind(@NotNull FlaggedMessageEmbedAccessory messageEmbedAccessory) {
        Intrinsics.checkNotNullParameter(messageEmbedAccessory, "messageEmbedAccessory");
        FlaggedMessageEmbedView flaggedMessageEmbedView = this.embeddedMessageView;
        MessageMargins margins = messageEmbedAccessory.getMargins();
        Message message = messageEmbedAccessory.getMessage();
        ChatEventHandler chatEventHandler = this.eventHandler;
        if (chatEventHandler == null) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        FlaggedMessageEmbedView.setMessage$default(flaggedMessageEmbedView, margins, message, chatEventHandler, false, 8, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlaggedMessageEmbedViewHolder(@NotNull FlaggedMessageEmbedView embeddedMessageView, ChatEventHandler chatEventHandler) {
        super(embeddedMessageView, null);
        Intrinsics.checkNotNullParameter(embeddedMessageView, "embeddedMessageView");
        this.embeddedMessageView = embeddedMessageView;
        this.eventHandler = chatEventHandler;
    }
}
