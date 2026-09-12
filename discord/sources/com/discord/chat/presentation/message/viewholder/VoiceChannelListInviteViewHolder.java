package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.VoiceChannelListInviteMessageAccessory;
import com.discord.chat.presentation.message.view.VoiceChannelListInviteView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/VoiceChannelListInviteViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "view", "Lcom/discord/chat/presentation/message/view/VoiceChannelListInviteView;", "<init>", "(Lcom/discord/chat/presentation/message/view/VoiceChannelListInviteView;)V", "bind", "", "accessory", "Lcom/discord/chat/presentation/message/messagepart/VoiceChannelListInviteMessageAccessory;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "measureAndLayout", "Lkotlin/Function0;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VoiceChannelListInviteViewHolder extends MessagePartViewHolder {

    @NotNull
    private final VoiceChannelListInviteView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChannelListInviteViewHolder(@NotNull VoiceChannelListInviteView view) {
        super(view, null);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public final void bind(@NotNull VoiceChannelListInviteMessageAccessory accessory, @NotNull ChatEventHandler eventHandler, @NotNull Function0<Unit> measureAndLayout) {
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(measureAndLayout, "measureAndLayout");
        String messageId = accessory.getMessageId();
        int codedLinkIndex = accessory.getCodedLinkIndex();
        this.view.configure(accessory.getInvite(), new e(eventHandler, messageId, codedLinkIndex, 2), new e(eventHandler, messageId, codedLinkIndex, 3), measureAndLayout);
    }
}
