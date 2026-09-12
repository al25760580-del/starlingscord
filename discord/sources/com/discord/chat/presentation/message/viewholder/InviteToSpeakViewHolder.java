package com.discord.chat.presentation.message.viewholder;

import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView;
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/viewholder/InviteToSpeakViewHolder;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;", "inviteToSpeakView", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "", "onInviteToSpeakClicked", "<init>", "(Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;", "inviteToSpeakAccessory", "bind", "(Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;)V", "Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;", "Lkotlin/jvm/functions/Function1;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InviteToSpeakViewHolder extends MessagePartViewHolder {

    @NotNull
    private final InviteToSpeakView inviteToSpeakView;

    @NotNull
    private final Function1<MessageId, Unit> onInviteToSpeakClicked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InviteToSpeakViewHolder(@NotNull InviteToSpeakView inviteToSpeakView, @NotNull Function1<? super MessageId, Unit> onInviteToSpeakClicked) {
        super(inviteToSpeakView, null);
        Intrinsics.checkNotNullParameter(inviteToSpeakView, "inviteToSpeakView");
        Intrinsics.checkNotNullParameter(onInviteToSpeakClicked, "onInviteToSpeakClicked");
        this.inviteToSpeakView = inviteToSpeakView;
        this.onInviteToSpeakClicked = onInviteToSpeakClicked;
        inviteToSpeakView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
    }

    public final void bind(@NotNull InviteToSpeakAccessory inviteToSpeakAccessory) {
        Intrinsics.checkNotNullParameter(inviteToSpeakAccessory, "inviteToSpeakAccessory");
        this.inviteToSpeakView.setProps(inviteToSpeakAccessory.getMessage(), this.onInviteToSpeakClicked);
    }
}
