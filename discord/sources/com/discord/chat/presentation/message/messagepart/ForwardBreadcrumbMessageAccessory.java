package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.forwarding.ForwardInfo;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/ForwardBreadcrumbMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "forwardInfo", "Lcom/discord/chat/bridge/forwarding/ForwardInfo;", "<init>", "(Ljava/lang/String;JLcom/discord/chat/bridge/forwarding/ForwardInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getForwardInfo", "()Lcom/discord/chat/bridge/forwarding/ForwardInfo;", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "copy", "copy-Eqy5D80", "(Ljava/lang/String;JLcom/discord/chat/bridge/forwarding/ForwardInfo;)Lcom/discord/chat/presentation/message/messagepart/ForwardBreadcrumbMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ForwardBreadcrumbMessageAccessory extends MessageAccessory {
    private final long channelId;

    @NotNull
    private final ForwardInfo forwardInfo;

    @NotNull
    private final String messageId;

    public /* synthetic */ ForwardBreadcrumbMessageAccessory(String str, long j, ForwardInfo forwardInfo, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, forwardInfo);
    }

    /* JADX INFO: renamed from: copy-Eqy5D80$default, reason: not valid java name */
    public static /* synthetic */ ForwardBreadcrumbMessageAccessory m620copyEqy5D80$default(ForwardBreadcrumbMessageAccessory forwardBreadcrumbMessageAccessory, String str, long j, ForwardInfo forwardInfo, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = forwardBreadcrumbMessageAccessory.messageId;
        }
        if ((i7 & 2) != 0) {
            j = forwardBreadcrumbMessageAccessory.channelId;
        }
        if ((i7 & 4) != 0) {
            forwardInfo = forwardBreadcrumbMessageAccessory.forwardInfo;
        }
        return forwardBreadcrumbMessageAccessory.m623copyEqy5D80(str, j, forwardInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ForwardInfo getForwardInfo() {
        return this.forwardInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-Eqy5D80, reason: not valid java name */
    public final ForwardBreadcrumbMessageAccessory m623copyEqy5D80(@NotNull String messageId, long channelId, @NotNull ForwardInfo forwardInfo) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(forwardInfo, "forwardInfo");
        return new ForwardBreadcrumbMessageAccessory(messageId, channelId, forwardInfo, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ForwardBreadcrumbMessageAccessory)) {
            return false;
        }
        ForwardBreadcrumbMessageAccessory forwardBreadcrumbMessageAccessory = (ForwardBreadcrumbMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, forwardBreadcrumbMessageAccessory.messageId) && ChannelId.m1134equalsimpl0(this.channelId, forwardBreadcrumbMessageAccessory.channelId) && Intrinsics.areEqual(this.forwardInfo, forwardBreadcrumbMessageAccessory.forwardInfo);
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m624getChannelIdo4g7jtM() {
        return this.channelId;
    }

    @NotNull
    public final ForwardInfo getForwardInfo() {
        return this.forwardInfo;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return this.forwardInfo.hashCode() + b.d(this.channelId, MessageId.m1161hashCodeimpl(this.messageId) * 31, 31);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        ForwardInfo forwardInfo = this.forwardInfo;
        StringBuilder sbU = e.u("ForwardBreadcrumbMessageAccessory(messageId=", strM1163toStringimpl, ", channelId=", strM1137toStringimpl, ", forwardInfo=");
        sbU.append(forwardInfo);
        sbU.append(")");
        return sbU.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private ForwardBreadcrumbMessageAccessory(String messageId, long j, ForwardInfo forwardInfo) {
        super(messageId, "forwarded message breadcrumb", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(forwardInfo, "forwardInfo");
        this.messageId = messageId;
        this.channelId = j;
        this.forwardInfo = forwardInfo;
    }
}
