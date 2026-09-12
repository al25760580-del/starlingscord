package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "codedLinkIndex", "", "invite", "Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "<init>", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getCodedLinkIndex", "()I", "getInvite", "()Lcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;", "component1", "component1-3Eiw7ao", "component2", "component3", "copy", "copy-u7_MRrM", "(Ljava/lang/String;ILcom/discord/chat/bridge/codedlinks/GuildInviteDisabledEmbedImpl;)Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class GuildInviteDisabledMessageAccessory extends MessageAccessory {
    private final int codedLinkIndex;

    @NotNull
    private final GuildInviteDisabledEmbedImpl invite;

    @NotNull
    private final String messageId;

    public /* synthetic */ GuildInviteDisabledMessageAccessory(String str, int i7, GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i7, guildInviteDisabledEmbedImpl);
    }

    /* JADX INFO: renamed from: copy-u7_MRrM$default, reason: not valid java name */
    public static /* synthetic */ GuildInviteDisabledMessageAccessory m637copyu7_MRrM$default(GuildInviteDisabledMessageAccessory guildInviteDisabledMessageAccessory, String str, int i7, GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = guildInviteDisabledMessageAccessory.messageId;
        }
        if ((i10 & 2) != 0) {
            i7 = guildInviteDisabledMessageAccessory.codedLinkIndex;
        }
        if ((i10 & 4) != 0) {
            guildInviteDisabledEmbedImpl = guildInviteDisabledMessageAccessory.invite;
        }
        return guildInviteDisabledMessageAccessory.m639copyu7_MRrM(str, i7, guildInviteDisabledEmbedImpl);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GuildInviteDisabledEmbedImpl getInvite() {
        return this.invite;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-u7_MRrM, reason: not valid java name */
    public final GuildInviteDisabledMessageAccessory m639copyu7_MRrM(@NotNull String messageId, int codedLinkIndex, @NotNull GuildInviteDisabledEmbedImpl invite) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(invite, "invite");
        return new GuildInviteDisabledMessageAccessory(messageId, codedLinkIndex, invite, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuildInviteDisabledMessageAccessory)) {
            return false;
        }
        GuildInviteDisabledMessageAccessory guildInviteDisabledMessageAccessory = (GuildInviteDisabledMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, guildInviteDisabledMessageAccessory.messageId) && this.codedLinkIndex == guildInviteDisabledMessageAccessory.codedLinkIndex && Intrinsics.areEqual(this.invite, guildInviteDisabledMessageAccessory.invite);
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    @NotNull
    public final GuildInviteDisabledEmbedImpl getInvite() {
        return this.invite;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return this.invite.hashCode() + a.u(this.codedLinkIndex, MessageId.m1161hashCodeimpl(this.messageId) * 31, 31);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        int i7 = this.codedLinkIndex;
        GuildInviteDisabledEmbedImpl guildInviteDisabledEmbedImpl = this.invite;
        StringBuilder sbT = e.t("GuildInviteDisabledMessageAccessory(messageId=", strM1163toStringimpl, ", codedLinkIndex=", i7, ", invite=");
        sbT.append(guildInviteDisabledEmbedImpl);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private GuildInviteDisabledMessageAccessory(String messageId, int i7, GuildInviteDisabledEmbedImpl invite) {
        super(messageId, "guild invite disabled " + i7, false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(invite, "invite");
        this.messageId = messageId;
        this.codedLinkIndex = i7;
        this.invite = invite;
    }
}
