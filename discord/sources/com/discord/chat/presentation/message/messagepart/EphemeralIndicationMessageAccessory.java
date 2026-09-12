package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "ephemeralIndication", "Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getEphemeralIndication", "()Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/ephemeral/EphemeralIndication;)Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class EphemeralIndicationMessageAccessory extends MessageAccessory {

    @NotNull
    private final EphemeralIndication ephemeralIndication;

    @NotNull
    private final String messageId;

    public /* synthetic */ EphemeralIndicationMessageAccessory(String str, EphemeralIndication ephemeralIndication, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, ephemeralIndication);
    }

    /* JADX INFO: renamed from: copy-ntcYbpo$default, reason: not valid java name */
    public static /* synthetic */ EphemeralIndicationMessageAccessory m605copyntcYbpo$default(EphemeralIndicationMessageAccessory ephemeralIndicationMessageAccessory, String str, EphemeralIndication ephemeralIndication, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = ephemeralIndicationMessageAccessory.messageId;
        }
        if ((i7 & 2) != 0) {
            ephemeralIndication = ephemeralIndicationMessageAccessory.ephemeralIndication;
        }
        return ephemeralIndicationMessageAccessory.m607copyntcYbpo(str, ephemeralIndication);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EphemeralIndication getEphemeralIndication() {
        return this.ephemeralIndication;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ntcYbpo, reason: not valid java name */
    public final EphemeralIndicationMessageAccessory m607copyntcYbpo(@NotNull String messageId, @NotNull EphemeralIndication ephemeralIndication) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(ephemeralIndication, "ephemeralIndication");
        return new EphemeralIndicationMessageAccessory(messageId, ephemeralIndication, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EphemeralIndicationMessageAccessory)) {
            return false;
        }
        EphemeralIndicationMessageAccessory ephemeralIndicationMessageAccessory = (EphemeralIndicationMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, ephemeralIndicationMessageAccessory.messageId) && Intrinsics.areEqual(this.ephemeralIndication, ephemeralIndicationMessageAccessory.ephemeralIndication);
    }

    @NotNull
    public final EphemeralIndication getEphemeralIndication() {
        return this.ephemeralIndication;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return this.ephemeralIndication.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31);
    }

    @NotNull
    public String toString() {
        return "EphemeralIndicationMessageAccessory(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", ephemeralIndication=" + this.ephemeralIndication + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private EphemeralIndicationMessageAccessory(String messageId, EphemeralIndication ephemeralIndication) {
        super(messageId, "ephemeral indication", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(ephemeralIndication, "ephemeralIndication");
        this.messageId = messageId;
        this.ephemeralIndication = ephemeralIndication;
    }
}
