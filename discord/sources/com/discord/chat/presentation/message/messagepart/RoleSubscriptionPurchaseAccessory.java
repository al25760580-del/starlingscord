package com.discord.chat.presentation.message.messagepart;

import a3.e;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JP\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0018¨\u0006("}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "authorUsername", "", "authorAvatar", "constrainedWidth", "", "isForwardedContent", "", "<init>", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Ljava/lang/String;Ljava/lang/String;IZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getAuthorUsername", "getAuthorAvatar", "getConstrainedWidth", "()I", "()Z", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "component6", "copy", "copy-LdU2QRA", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;", "equals", "other", "", "hashCode", "toString", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RoleSubscriptionPurchaseAccessory extends MessageAccessory {
    private final String authorAvatar;
    private final String authorUsername;
    private final int constrainedWidth;
    private final boolean isForwardedContent;

    @NotNull
    private final MessageMargins margins;

    @NotNull
    private final String messageId;

    public /* synthetic */ RoleSubscriptionPurchaseAccessory(String str, MessageMargins messageMargins, String str2, String str3, int i7, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageMargins, str2, str3, i7, z5);
    }

    /* JADX INFO: renamed from: copy-LdU2QRA$default, reason: not valid java name */
    public static /* synthetic */ RoleSubscriptionPurchaseAccessory m688copyLdU2QRA$default(RoleSubscriptionPurchaseAccessory roleSubscriptionPurchaseAccessory, String str, MessageMargins messageMargins, String str2, String str3, int i7, boolean z5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = roleSubscriptionPurchaseAccessory.messageId;
        }
        if ((i10 & 2) != 0) {
            messageMargins = roleSubscriptionPurchaseAccessory.margins;
        }
        if ((i10 & 4) != 0) {
            str2 = roleSubscriptionPurchaseAccessory.authorUsername;
        }
        if ((i10 & 8) != 0) {
            str3 = roleSubscriptionPurchaseAccessory.authorAvatar;
        }
        if ((i10 & 16) != 0) {
            i7 = roleSubscriptionPurchaseAccessory.constrainedWidth;
        }
        if ((i10 & 32) != 0) {
            z5 = roleSubscriptionPurchaseAccessory.isForwardedContent;
        }
        int i11 = i7;
        boolean z6 = z5;
        return roleSubscriptionPurchaseAccessory.m690copyLdU2QRA(str, messageMargins, str2, str3, i11, z6);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthorUsername() {
        return this.authorUsername;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAuthorAvatar() {
        return this.authorAvatar;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsForwardedContent() {
        return this.isForwardedContent;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-LdU2QRA, reason: not valid java name */
    public final RoleSubscriptionPurchaseAccessory m690copyLdU2QRA(@NotNull String messageId, @NotNull MessageMargins margins, String authorUsername, String authorAvatar, int constrainedWidth, boolean isForwardedContent) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        return new RoleSubscriptionPurchaseAccessory(messageId, margins, authorUsername, authorAvatar, constrainedWidth, isForwardedContent, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoleSubscriptionPurchaseAccessory)) {
            return false;
        }
        RoleSubscriptionPurchaseAccessory roleSubscriptionPurchaseAccessory = (RoleSubscriptionPurchaseAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, roleSubscriptionPurchaseAccessory.messageId) && Intrinsics.areEqual(this.margins, roleSubscriptionPurchaseAccessory.margins) && Intrinsics.areEqual(this.authorUsername, roleSubscriptionPurchaseAccessory.authorUsername) && Intrinsics.areEqual(this.authorAvatar, roleSubscriptionPurchaseAccessory.authorAvatar) && this.constrainedWidth == roleSubscriptionPurchaseAccessory.constrainedWidth && this.isForwardedContent == roleSubscriptionPurchaseAccessory.isForwardedContent;
    }

    public final String getAuthorAvatar() {
        return this.authorAvatar;
    }

    public final String getAuthorUsername() {
        return this.authorUsername;
    }

    public final int getConstrainedWidth() {
        return this.constrainedWidth;
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
        int iHashCode = (this.margins.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31;
        String str = this.authorUsername;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.authorAvatar;
        return Boolean.hashCode(this.isForwardedContent) + a.u(this.constrainedWidth, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final boolean isForwardedContent() {
        return this.isForwardedContent;
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        MessageMargins messageMargins = this.margins;
        String str = this.authorUsername;
        String str2 = this.authorAvatar;
        int i7 = this.constrainedWidth;
        boolean z5 = this.isForwardedContent;
        StringBuilder sb2 = new StringBuilder("RoleSubscriptionPurchaseAccessory(messageId=");
        sb2.append(strM1163toStringimpl);
        sb2.append(", margins=");
        sb2.append(messageMargins);
        sb2.append(", authorUsername=");
        e.A(sb2, str, ", authorAvatar=", str2, ", constrainedWidth=");
        sb2.append(i7);
        sb2.append(", isForwardedContent=");
        sb2.append(z5);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private RoleSubscriptionPurchaseAccessory(String messageId, MessageMargins margins, String str, String str2, int i7, boolean z5) {
        super(messageId, "role subscription purchase", false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.messageId = messageId;
        this.margins = margins;
        this.authorUsername = str;
        this.authorAvatar = str2;
        this.constrainedWidth = i7;
        this.isForwardedContent = z5;
    }
}
