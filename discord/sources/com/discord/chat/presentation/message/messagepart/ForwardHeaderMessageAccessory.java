package com.discord.chat.presentation.message.messagepart;

import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ForwardHeaderMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "component1", "component1-3Eiw7ao", "copy", "copy-1xi1bu0", "(Ljava/lang/String;)Lcom/discord/chat/presentation/message/messagepart/ForwardHeaderMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ForwardHeaderMessageAccessory extends MessageAccessory {

    @NotNull
    private final String messageId;

    public /* synthetic */ ForwardHeaderMessageAccessory(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX INFO: renamed from: copy-1xi1bu0$default, reason: not valid java name */
    public static /* synthetic */ ForwardHeaderMessageAccessory m625copy1xi1bu0$default(ForwardHeaderMessageAccessory forwardHeaderMessageAccessory, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = forwardHeaderMessageAccessory.messageId;
        }
        return forwardHeaderMessageAccessory.m627copy1xi1bu0(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-1xi1bu0, reason: not valid java name */
    public final ForwardHeaderMessageAccessory m627copy1xi1bu0(@NotNull String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new ForwardHeaderMessageAccessory(messageId, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ForwardHeaderMessageAccessory) && MessageId.m1160equalsimpl0(this.messageId, ((ForwardHeaderMessageAccessory) other).messageId);
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return MessageId.m1161hashCodeimpl(this.messageId);
    }

    @NotNull
    public String toString() {
        return g.e("ForwardHeaderMessageAccessory(messageId=", MessageId.m1163toStringimpl(this.messageId), ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ForwardHeaderMessageAccessory(String messageId) {
        super(messageId, "forwarded message header", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageId = messageId;
    }
}
