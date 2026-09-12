package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003JP\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/InfoLinkMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "channelId", "Lcom/discord/primitives/ChannelId;", "attachmentId", "", "embedId", "text", "icon", "Lcom/discord/react_asset_fetcher/ReactAsset;", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getChannelId-o4g7jtM", "()J", "J", "getAttachmentId", "getEmbedId", "getText", "getIcon", "()Lcom/discord/react_asset_fetcher/ReactAsset;", "component1", "component1-3Eiw7ao", "component2", "component2-o4g7jtM", "component3", "component4", "component5", "component6", "copy", "copy-eTS4JUY", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/react_asset_fetcher/ReactAsset;)Lcom/discord/chat/presentation/message/messagepart/InfoLinkMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InfoLinkMessageAccessory extends MessageAccessory {
    private final String attachmentId;
    private final long channelId;
    private final String embedId;

    @NotNull
    private final ReactAsset icon;

    @NotNull
    private final String messageId;

    @NotNull
    private final String text;

    public /* synthetic */ InfoLinkMessageAccessory(String str, long j, String str2, String str3, String str4, ReactAsset reactAsset, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, str3, str4, reactAsset);
    }

    /* JADX INFO: renamed from: copy-eTS4JUY$default, reason: not valid java name */
    public static /* synthetic */ InfoLinkMessageAccessory m649copyeTS4JUY$default(InfoLinkMessageAccessory infoLinkMessageAccessory, String str, long j, String str2, String str3, String str4, ReactAsset reactAsset, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = infoLinkMessageAccessory.messageId;
        }
        if ((i7 & 2) != 0) {
            j = infoLinkMessageAccessory.channelId;
        }
        if ((i7 & 4) != 0) {
            str2 = infoLinkMessageAccessory.attachmentId;
        }
        if ((i7 & 8) != 0) {
            str3 = infoLinkMessageAccessory.embedId;
        }
        if ((i7 & 16) != 0) {
            str4 = infoLinkMessageAccessory.text;
        }
        if ((i7 & 32) != 0) {
            reactAsset = infoLinkMessageAccessory.icon;
        }
        return infoLinkMessageAccessory.m652copyeTS4JUY(str, j, str2, str3, str4, reactAsset);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAttachmentId() {
        return this.attachmentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEmbedId() {
        return this.embedId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ReactAsset getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-eTS4JUY, reason: not valid java name */
    public final InfoLinkMessageAccessory m652copyeTS4JUY(@NotNull String messageId, long channelId, String attachmentId, String embedId, @NotNull String text, @NotNull ReactAsset icon) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new InfoLinkMessageAccessory(messageId, channelId, attachmentId, embedId, text, icon, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfoLinkMessageAccessory)) {
            return false;
        }
        InfoLinkMessageAccessory infoLinkMessageAccessory = (InfoLinkMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, infoLinkMessageAccessory.messageId) && ChannelId.m1134equalsimpl0(this.channelId, infoLinkMessageAccessory.channelId) && Intrinsics.areEqual(this.attachmentId, infoLinkMessageAccessory.attachmentId) && Intrinsics.areEqual(this.embedId, infoLinkMessageAccessory.embedId) && Intrinsics.areEqual(this.text, infoLinkMessageAccessory.text) && this.icon == infoLinkMessageAccessory.icon;
    }

    public final String getAttachmentId() {
        return this.attachmentId;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m653getChannelIdo4g7jtM() {
        return this.channelId;
    }

    public final String getEmbedId() {
        return this.embedId;
    }

    @NotNull
    public final ReactAsset getIcon() {
        return this.icon;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iD = b.d(this.channelId, MessageId.m1161hashCodeimpl(this.messageId) * 31, 31);
        String str = this.attachmentId;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.embedId;
        return this.icon.hashCode() + e.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.text);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        String str = this.attachmentId;
        String str2 = this.embedId;
        String str3 = this.text;
        ReactAsset reactAsset = this.icon;
        StringBuilder sbU = e.u("InfoLinkMessageAccessory(messageId=", strM1163toStringimpl, ", channelId=", strM1137toStringimpl, ", attachmentId=");
        e.A(sbU, str, ", embedId=", str2, ", text=");
        sbU.append(str3);
        sbU.append(", icon=");
        sbU.append(reactAsset);
        sbU.append(")");
        return sbU.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private InfoLinkMessageAccessory(String messageId, long j, String str, String str2, String text, ReactAsset icon) {
        super(messageId, "info link " + str, false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.messageId = messageId;
        this.channelId = j;
        this.attachmentId = str;
        this.embedId = str2;
        this.text = text;
        this.icon = icon;
    }
}
