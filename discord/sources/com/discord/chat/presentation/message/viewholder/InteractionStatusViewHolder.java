package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory;
import com.discord.chat.presentation.message.view.InteractionStatusView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/InteractionStatusViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "interactionStatusView", "Lcom/discord/chat/presentation/message/view/InteractionStatusView;", "<init>", "(Lcom/discord/chat/presentation/message/view/InteractionStatusView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InteractionStatusViewHolder extends MessagePartViewHolder {

    @NotNull
    private final InteractionStatusView interactionStatusView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractionStatusViewHolder(@NotNull InteractionStatusView interactionStatusView) {
        super(interactionStatusView, null);
        Intrinsics.checkNotNullParameter(interactionStatusView, "interactionStatusView");
        this.interactionStatusView = interactionStatusView;
    }

    public final void bind(@NotNull InteractionStatusMessageAccessory accessory) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        this.interactionStatusView.m745setInteractionStatusntcYbpo(accessory.getMessageId(), accessory.getInteractionStatus());
    }
}
