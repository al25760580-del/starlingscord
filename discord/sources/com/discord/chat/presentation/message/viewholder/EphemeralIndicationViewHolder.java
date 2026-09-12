package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import com.discord.chat.presentation.message.view.EphemeralIndicationView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/EphemeralIndicationViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "ephemeralIndicationView", "Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "<init>", "(Lcom/discord/chat/presentation/message/view/EphemeralIndicationView;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "bind", "", "ephemeralAccessory", "Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EphemeralIndicationViewHolder extends MessagePartViewHolder {

    @NotNull
    private final EphemeralIndicationView ephemeralIndicationView;

    @NotNull
    private final ChatEventHandler eventHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EphemeralIndicationViewHolder(@NotNull EphemeralIndicationView ephemeralIndicationView, @NotNull ChatEventHandler eventHandler) {
        super(ephemeralIndicationView, null);
        Intrinsics.checkNotNullParameter(ephemeralIndicationView, "ephemeralIndicationView");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.ephemeralIndicationView = ephemeralIndicationView;
        this.eventHandler = eventHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1$lambda$0(EphemeralIndicationViewHolder ephemeralIndicationViewHolder, EphemeralIndicationMessageAccessory ephemeralIndicationMessageAccessory, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ChatEventHandler.DefaultImpls.m522onLinkClickedu7_MRrM$default(ephemeralIndicationViewHolder.eventHandler, ephemeralIndicationMessageAccessory.getMessageId(), it, null, 4, null);
        return Unit.f14616a;
    }

    public final void bind(@NotNull EphemeralIndicationMessageAccessory ephemeralAccessory) {
        Intrinsics.checkNotNullParameter(ephemeralAccessory, "ephemeralAccessory");
        this.ephemeralIndicationView.m739setEphemeralIndicationAFFcxXc(ephemeralAccessory.getMessageId(), ephemeralAccessory.getEphemeralIndication(), new EphemeralIndicationViewHolder$bind$1$1(this.eventHandler), new b7.a(17, this, ephemeralAccessory));
    }
}
