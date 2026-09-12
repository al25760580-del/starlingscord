package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\tJ\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/SafetySystemNotificationMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "safetySystemNotificationEmbed", "Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed;", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getSafetySystemNotificationEmbed", "()Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed;", "component1", "component1-3Eiw7ao", "component2", "copy", "copy-ntcYbpo", "(Ljava/lang/String;Lcom/discord/chat/bridge/safetysystemnotification/SafetySystemNotificationEmbed;)Lcom/discord/chat/presentation/message/messagepart/SafetySystemNotificationMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SafetySystemNotificationMessageAccessory extends MessageAccessory {

    @NotNull
    private final String messageId;

    @NotNull
    private final SafetySystemNotificationEmbed safetySystemNotificationEmbed;

    public /* synthetic */ SafetySystemNotificationMessageAccessory(String str, SafetySystemNotificationEmbed safetySystemNotificationEmbed, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, safetySystemNotificationEmbed);
    }

    /* JADX INFO: renamed from: copy-ntcYbpo$default, reason: not valid java name */
    public static /* synthetic */ SafetySystemNotificationMessageAccessory m694copyntcYbpo$default(SafetySystemNotificationMessageAccessory safetySystemNotificationMessageAccessory, String str, SafetySystemNotificationEmbed safetySystemNotificationEmbed, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = safetySystemNotificationMessageAccessory.messageId;
        }
        if ((i7 & 2) != 0) {
            safetySystemNotificationEmbed = safetySystemNotificationMessageAccessory.safetySystemNotificationEmbed;
        }
        return safetySystemNotificationMessageAccessory.m696copyntcYbpo(str, safetySystemNotificationEmbed);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SafetySystemNotificationEmbed getSafetySystemNotificationEmbed() {
        return this.safetySystemNotificationEmbed;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-ntcYbpo, reason: not valid java name */
    public final SafetySystemNotificationMessageAccessory m696copyntcYbpo(@NotNull String messageId, @NotNull SafetySystemNotificationEmbed safetySystemNotificationEmbed) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(safetySystemNotificationEmbed, "safetySystemNotificationEmbed");
        return new SafetySystemNotificationMessageAccessory(messageId, safetySystemNotificationEmbed, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SafetySystemNotificationMessageAccessory)) {
            return false;
        }
        SafetySystemNotificationMessageAccessory safetySystemNotificationMessageAccessory = (SafetySystemNotificationMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, safetySystemNotificationMessageAccessory.messageId) && Intrinsics.areEqual(this.safetySystemNotificationEmbed, safetySystemNotificationMessageAccessory.safetySystemNotificationEmbed);
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final SafetySystemNotificationEmbed getSafetySystemNotificationEmbed() {
        return this.safetySystemNotificationEmbed;
    }

    public int hashCode() {
        return this.safetySystemNotificationEmbed.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31);
    }

    @NotNull
    public String toString() {
        return "SafetySystemNotificationMessageAccessory(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", safetySystemNotificationEmbed=" + this.safetySystemNotificationEmbed + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SafetySystemNotificationMessageAccessory(String messageId, SafetySystemNotificationEmbed safetySystemNotificationEmbed) {
        super(messageId, "safety policy notice embed", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(safetySystemNotificationEmbed, "safetySystemNotificationEmbed");
        this.messageId = messageId;
        this.safetySystemNotificationEmbed = safetySystemNotificationEmbed;
    }
}
