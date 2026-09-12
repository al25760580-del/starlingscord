package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.customthemes.SharedCustomThemeData;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006&"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/SharedCustomThemeMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "channelId", "Lcom/discord/primitives/ChannelId;", "messageId", "Lcom/discord/primitives/MessageId;", "data", "Lcom/discord/chat/bridge/customthemes/SharedCustomThemeData;", "author", "", "<init>", "(JLjava/lang/String;Lcom/discord/chat/bridge/customthemes/SharedCustomThemeData;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getChannelId-o4g7jtM", "()J", "J", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getData", "()Lcom/discord/chat/bridge/customthemes/SharedCustomThemeData;", "getAuthor", "component1", "component1-o4g7jtM", "component2", "component2-3Eiw7ao", "component3", "component4", "copy", "copy-JjTCmh4", "(JLjava/lang/String;Lcom/discord/chat/bridge/customthemes/SharedCustomThemeData;Ljava/lang/String;)Lcom/discord/chat/presentation/message/messagepart/SharedCustomThemeMessageAccessory;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SharedCustomThemeMessageAccessory extends MessageAccessory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String author;
    private final long channelId;

    @NotNull
    private final SharedCustomThemeData data;

    @NotNull
    private final String messageId;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/SharedCustomThemeMessageAccessory$Companion;", "", "<init>", "()V", "create", "Lcom/discord/chat/presentation/message/messagepart/SharedCustomThemeMessageAccessory;", "message", "Lcom/discord/chat/bridge/Message;", "sharedCustomThemeData", "Lcom/discord/chat/bridge/customthemes/SharedCustomThemeData;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SharedCustomThemeMessageAccessory create(@NotNull Message message, @NotNull SharedCustomThemeData sharedCustomThemeData) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(sharedCustomThemeData, "sharedCustomThemeData");
            return new SharedCustomThemeMessageAccessory(message.m264getChannelIdo4g7jtM(), message.m267getId3Eiw7ao(), sharedCustomThemeData, message.getUsername(), null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ SharedCustomThemeMessageAccessory(long j, String str, SharedCustomThemeData sharedCustomThemeData, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, sharedCustomThemeData, str2);
    }

    /* JADX INFO: renamed from: copy-JjTCmh4$default, reason: not valid java name */
    public static /* synthetic */ SharedCustomThemeMessageAccessory m697copyJjTCmh4$default(SharedCustomThemeMessageAccessory sharedCustomThemeMessageAccessory, long j, String str, SharedCustomThemeData sharedCustomThemeData, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = sharedCustomThemeMessageAccessory.channelId;
        }
        long j5 = j;
        if ((i7 & 2) != 0) {
            str = sharedCustomThemeMessageAccessory.messageId;
        }
        String str3 = str;
        if ((i7 & 4) != 0) {
            sharedCustomThemeData = sharedCustomThemeMessageAccessory.data;
        }
        SharedCustomThemeData sharedCustomThemeData2 = sharedCustomThemeData;
        if ((i7 & 8) != 0) {
            str2 = sharedCustomThemeMessageAccessory.author;
        }
        return sharedCustomThemeMessageAccessory.m700copyJjTCmh4(j5, str3, sharedCustomThemeData2, str2);
    }

    /* JADX INFO: renamed from: component1-o4g7jtM, reason: not valid java name and from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SharedCustomThemeData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthor() {
        return this.author;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-JjTCmh4, reason: not valid java name */
    public final SharedCustomThemeMessageAccessory m700copyJjTCmh4(long channelId, @NotNull String messageId, @NotNull SharedCustomThemeData data, String author) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(data, "data");
        return new SharedCustomThemeMessageAccessory(channelId, messageId, data, author, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedCustomThemeMessageAccessory)) {
            return false;
        }
        SharedCustomThemeMessageAccessory sharedCustomThemeMessageAccessory = (SharedCustomThemeMessageAccessory) other;
        return ChannelId.m1134equalsimpl0(this.channelId, sharedCustomThemeMessageAccessory.channelId) && MessageId.m1160equalsimpl0(this.messageId, sharedCustomThemeMessageAccessory.messageId) && Intrinsics.areEqual(this.data, sharedCustomThemeMessageAccessory.data) && Intrinsics.areEqual(this.author, sharedCustomThemeMessageAccessory.author);
    }

    public final String getAuthor() {
        return this.author;
    }

    /* JADX INFO: renamed from: getChannelId-o4g7jtM, reason: not valid java name */
    public final long m701getChannelIdo4g7jtM() {
        return this.channelId;
    }

    @NotNull
    public final SharedCustomThemeData getData() {
        return this.data;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        int iHashCode = (this.data.hashCode() + ((MessageId.m1161hashCodeimpl(this.messageId) + (ChannelId.m1135hashCodeimpl(this.channelId) * 31)) * 31)) * 31;
        String str = this.author;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(this.channelId);
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        SharedCustomThemeData sharedCustomThemeData = this.data;
        String str = this.author;
        StringBuilder sbU = e.u("SharedCustomThemeMessageAccessory(channelId=", strM1137toStringimpl, ", messageId=", strM1163toStringimpl, ", data=");
        sbU.append(sharedCustomThemeData);
        sbU.append(", author=");
        sbU.append(str);
        sbU.append(")");
        return sbU.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private SharedCustomThemeMessageAccessory(long j, String messageId, SharedCustomThemeData data, String str) {
        super(messageId, "shared client theme", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(data, "data");
        this.channelId = j;
        this.messageId = messageId;
        this.data = data;
        this.author = str;
    }
}
