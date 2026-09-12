package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.Message;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "message", "Lcom/discord/chat/bridge/Message;", "<init>", "(Lcom/discord/chat/bridge/Message;)V", "getMessage", "()Lcom/discord/chat/bridge/Message;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InviteToSpeakAccessory extends MessageAccessory {

    @NotNull
    private final Message message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteToSpeakAccessory(@NotNull Message message) {
        super(message.m267getId3Eiw7ao(), "invite to speak", false, 4, null);
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
    }

    public static /* synthetic */ InviteToSpeakAccessory copy$default(InviteToSpeakAccessory inviteToSpeakAccessory, Message message, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            message = inviteToSpeakAccessory.message;
        }
        return inviteToSpeakAccessory.copy(message);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Message getMessage() {
        return this.message;
    }

    @NotNull
    public final InviteToSpeakAccessory copy(@NotNull Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new InviteToSpeakAccessory(message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InviteToSpeakAccessory) && Intrinsics.areEqual(this.message, ((InviteToSpeakAccessory) other).message);
    }

    @NotNull
    public final Message getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return "InviteToSpeakAccessory(message=" + this.message + ")";
    }
}
