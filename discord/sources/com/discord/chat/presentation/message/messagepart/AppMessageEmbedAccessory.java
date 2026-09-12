package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import kk.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006'"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/AppMessageEmbedAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "codedLinkIndex", "", "appMessageEmbed", "Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "constrainedWidth", "<init>", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;ILcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getMargins", "()Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getCodedLinkIndex", "()I", "getAppMessageEmbed", "()Lcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;", "getConstrainedWidth", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "component5", "copy", "copy-pPZZVto", "(Ljava/lang/String;Lcom/discord/chat/presentation/message/messagepart/MessageMargins;ILcom/discord/chat/bridge/codedlinks/AppMessageEmbedImpl;I)Lcom/discord/chat/presentation/message/messagepart/AppMessageEmbedAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class AppMessageEmbedAccessory extends MessageAccessory {

    @NotNull
    private final AppMessageEmbedImpl appMessageEmbed;
    private final int codedLinkIndex;
    private final int constrainedWidth;

    @NotNull
    private final MessageMargins margins;

    @NotNull
    private final String messageId;

    public /* synthetic */ AppMessageEmbedAccessory(String str, MessageMargins messageMargins, int i7, AppMessageEmbedImpl appMessageEmbedImpl, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageMargins, i7, appMessageEmbedImpl, i10);
    }

    /* JADX INFO: renamed from: copy-pPZZVto$default, reason: not valid java name */
    public static /* synthetic */ AppMessageEmbedAccessory m579copypPZZVto$default(AppMessageEmbedAccessory appMessageEmbedAccessory, String str, MessageMargins messageMargins, int i7, AppMessageEmbedImpl appMessageEmbedImpl, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appMessageEmbedAccessory.messageId;
        }
        if ((i11 & 2) != 0) {
            messageMargins = appMessageEmbedAccessory.margins;
        }
        if ((i11 & 4) != 0) {
            i7 = appMessageEmbedAccessory.codedLinkIndex;
        }
        if ((i11 & 8) != 0) {
            appMessageEmbedImpl = appMessageEmbedAccessory.appMessageEmbed;
        }
        if ((i11 & 16) != 0) {
            i10 = appMessageEmbedAccessory.constrainedWidth;
        }
        int i12 = i10;
        int i13 = i7;
        return appMessageEmbedAccessory.m581copypPZZVto(str, messageMargins, i13, appMessageEmbedImpl, i12);
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
    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AppMessageEmbedImpl getAppMessageEmbed() {
        return this.appMessageEmbed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConstrainedWidth() {
        return this.constrainedWidth;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-pPZZVto, reason: not valid java name */
    public final AppMessageEmbedAccessory m581copypPZZVto(@NotNull String messageId, @NotNull MessageMargins margins, int codedLinkIndex, @NotNull AppMessageEmbedImpl appMessageEmbed, int constrainedWidth) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(appMessageEmbed, "appMessageEmbed");
        return new AppMessageEmbedAccessory(messageId, margins, codedLinkIndex, appMessageEmbed, constrainedWidth, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppMessageEmbedAccessory)) {
            return false;
        }
        AppMessageEmbedAccessory appMessageEmbedAccessory = (AppMessageEmbedAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, appMessageEmbedAccessory.messageId) && Intrinsics.areEqual(this.margins, appMessageEmbedAccessory.margins) && this.codedLinkIndex == appMessageEmbedAccessory.codedLinkIndex && Intrinsics.areEqual(this.appMessageEmbed, appMessageEmbedAccessory.appMessageEmbed) && this.constrainedWidth == appMessageEmbedAccessory.constrainedWidth;
    }

    @NotNull
    public final AppMessageEmbedImpl getAppMessageEmbed() {
        return this.appMessageEmbed;
    }

    public final int getCodedLinkIndex() {
        return this.codedLinkIndex;
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
        return Integer.hashCode(this.constrainedWidth) + ((this.appMessageEmbed.hashCode() + a.u(this.codedLinkIndex, (this.margins.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        String strM1163toStringimpl = MessageId.m1163toStringimpl(this.messageId);
        MessageMargins messageMargins = this.margins;
        int i7 = this.codedLinkIndex;
        AppMessageEmbedImpl appMessageEmbedImpl = this.appMessageEmbed;
        int i10 = this.constrainedWidth;
        StringBuilder sb2 = new StringBuilder("AppMessageEmbedAccessory(messageId=");
        sb2.append(strM1163toStringimpl);
        sb2.append(", margins=");
        sb2.append(messageMargins);
        sb2.append(", codedLinkIndex=");
        sb2.append(i7);
        sb2.append(", appMessageEmbed=");
        sb2.append(appMessageEmbedImpl);
        sb2.append(", constrainedWidth=");
        return b.l(sb2, i10, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AppMessageEmbedAccessory(String messageId, MessageMargins margins, int i7, AppMessageEmbedImpl appMessageEmbed, int i10) {
        super(messageId, "app message embed " + i7, false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(appMessageEmbed, "appMessageEmbed");
        this.messageId = messageId;
        this.margins = margins;
        this.codedLinkIndex = i7;
        this.appMessageEmbed = appMessageEmbed;
        this.constrainedWidth = i10;
    }
}
