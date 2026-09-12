package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ActivityRichPresenceInviteEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "activityRichPresenceInviteEmbed", "Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;", "<init>", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getActivityRichPresenceInviteEmbed", "()Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/activities/ActivityRichPresenceInviteEmbed;)Lcom/discord/chat/presentation/message/messagepart/ActivityRichPresenceInviteEmbedMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ActivityRichPresenceInviteEmbedMessageAccessory extends MessageAccessory {

    @NotNull
    private final ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed;

    @NotNull
    private final MessageMargins margins;

    @NotNull
    private final String messageId;

    public /* synthetic */ ActivityRichPresenceInviteEmbedMessageAccessory(String str, MessageMargins messageMargins, ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageMargins, activityRichPresenceInviteEmbed);
    }

    /* JADX INFO: renamed from: copy-u7_MRrM$default, reason: not valid java name */
    public static /* synthetic */ ActivityRichPresenceInviteEmbedMessageAccessory m576copyu7_MRrM$default(ActivityRichPresenceInviteEmbedMessageAccessory activityRichPresenceInviteEmbedMessageAccessory, String str, MessageMargins messageMargins, ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = activityRichPresenceInviteEmbedMessageAccessory.messageId;
        }
        if ((i7 & 2) != 0) {
            messageMargins = activityRichPresenceInviteEmbedMessageAccessory.margins;
        }
        if ((i7 & 4) != 0) {
            activityRichPresenceInviteEmbed = activityRichPresenceInviteEmbedMessageAccessory.activityRichPresenceInviteEmbed;
        }
        return activityRichPresenceInviteEmbedMessageAccessory.m578copyu7_MRrM(str, messageMargins, activityRichPresenceInviteEmbed);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MessageMargins getMargins() {
        return this.margins;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ActivityRichPresenceInviteEmbed getActivityRichPresenceInviteEmbed() {
        return this.activityRichPresenceInviteEmbed;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-u7_MRrM, reason: not valid java name */
    public final ActivityRichPresenceInviteEmbedMessageAccessory m578copyu7_MRrM(@NotNull String messageId, @NotNull MessageMargins margins, @NotNull ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(activityRichPresenceInviteEmbed, "activityRichPresenceInviteEmbed");
        return new ActivityRichPresenceInviteEmbedMessageAccessory(messageId, margins, activityRichPresenceInviteEmbed, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivityRichPresenceInviteEmbedMessageAccessory)) {
            return false;
        }
        ActivityRichPresenceInviteEmbedMessageAccessory activityRichPresenceInviteEmbedMessageAccessory = (ActivityRichPresenceInviteEmbedMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, activityRichPresenceInviteEmbedMessageAccessory.messageId) && Intrinsics.areEqual(this.margins, activityRichPresenceInviteEmbedMessageAccessory.margins) && Intrinsics.areEqual(this.activityRichPresenceInviteEmbed, activityRichPresenceInviteEmbedMessageAccessory.activityRichPresenceInviteEmbed);
    }

    @NotNull
    public final ActivityRichPresenceInviteEmbed getActivityRichPresenceInviteEmbed() {
        return this.activityRichPresenceInviteEmbed;
    }

    @NotNull
    public final MessageMargins getMargins() {
        return this.margins;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return this.activityRichPresenceInviteEmbed.hashCode() + ((this.margins.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "ActivityRichPresenceInviteEmbedMessageAccessory(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", margins=" + this.margins + ", activityRichPresenceInviteEmbed=" + this.activityRichPresenceInviteEmbed + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ActivityRichPresenceInviteEmbedMessageAccessory(String messageId, MessageMargins margins, ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed) {
        super(messageId, "activity rich presence invite embed message", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(activityRichPresenceInviteEmbed, "activityRichPresenceInviteEmbed");
        this.messageId = messageId;
        this.margins = margins;
        this.activityRichPresenceInviteEmbed = activityRichPresenceInviteEmbed;
    }
}
