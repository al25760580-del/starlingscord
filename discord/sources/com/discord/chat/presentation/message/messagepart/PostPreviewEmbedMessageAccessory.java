package com.discord.chat.presentation.message.messagepart;

import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.presentation.list.a;
import com.discord.primitives.MessageId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\rJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "messageId", "Lcom/discord/primitives/MessageId;", "postPreviewEmbed", "Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "index", "", "spoilerAttributes", "Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "<init>", "(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;ILcom/discord/chat/bridge/spoiler/SpoilerAttributes;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getPostPreviewEmbed", "()Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;", "getIndex", "()I", "getSpoilerAttributes", "()Lcom/discord/chat/bridge/spoiler/SpoilerAttributes;", "component1", "component1-3Eiw7ao", "component2", "component3", "component4", "copy", "copy-AFFcxXc", "(Ljava/lang/String;Lcom/discord/chat/bridge/postpreviewembed/PostPreviewEmbed;ILcom/discord/chat/bridge/spoiler/SpoilerAttributes;)Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "equals", "", "other", "", "hashCode", "toString", "", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PostPreviewEmbedMessageAccessory extends MessageAccessory {
    private final int index;

    @NotNull
    private final String messageId;

    @NotNull
    private final PostPreviewEmbed postPreviewEmbed;
    private final SpoilerAttributes spoilerAttributes;

    public /* synthetic */ PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i7, SpoilerAttributes spoilerAttributes, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, postPreviewEmbed, i7, spoilerAttributes);
    }

    /* JADX INFO: renamed from: copy-AFFcxXc$default, reason: not valid java name */
    public static /* synthetic */ PostPreviewEmbedMessageAccessory m673copyAFFcxXc$default(PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory, String str, PostPreviewEmbed postPreviewEmbed, int i7, SpoilerAttributes spoilerAttributes, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = postPreviewEmbedMessageAccessory.messageId;
        }
        if ((i10 & 2) != 0) {
            postPreviewEmbed = postPreviewEmbedMessageAccessory.postPreviewEmbed;
        }
        if ((i10 & 4) != 0) {
            i7 = postPreviewEmbedMessageAccessory.index;
        }
        if ((i10 & 8) != 0) {
            spoilerAttributes = postPreviewEmbedMessageAccessory.spoilerAttributes;
        }
        return postPreviewEmbedMessageAccessory.m675copyAFFcxXc(str, postPreviewEmbed, i7, spoilerAttributes);
    }

    @NotNull
    /* JADX INFO: renamed from: component1-3Eiw7ao, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PostPreviewEmbed getPostPreviewEmbed() {
        return this.postPreviewEmbed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-AFFcxXc, reason: not valid java name */
    public final PostPreviewEmbedMessageAccessory m675copyAFFcxXc(@NotNull String messageId, @NotNull PostPreviewEmbed postPreviewEmbed, int index, SpoilerAttributes spoilerAttributes) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(postPreviewEmbed, "postPreviewEmbed");
        return new PostPreviewEmbedMessageAccessory(messageId, postPreviewEmbed, index, spoilerAttributes, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostPreviewEmbedMessageAccessory)) {
            return false;
        }
        PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory = (PostPreviewEmbedMessageAccessory) other;
        return MessageId.m1160equalsimpl0(this.messageId, postPreviewEmbedMessageAccessory.messageId) && Intrinsics.areEqual(this.postPreviewEmbed, postPreviewEmbedMessageAccessory.postPreviewEmbed) && this.index == postPreviewEmbedMessageAccessory.index && Intrinsics.areEqual(this.spoilerAttributes, postPreviewEmbedMessageAccessory.spoilerAttributes);
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // com.discord.chat.presentation.message.messagepart.MessageAccessory
    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao */
    public String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final PostPreviewEmbed getPostPreviewEmbed() {
        return this.postPreviewEmbed;
    }

    public final SpoilerAttributes getSpoilerAttributes() {
        return this.spoilerAttributes;
    }

    public int hashCode() {
        int iU = a.u(this.index, (this.postPreviewEmbed.hashCode() + (MessageId.m1161hashCodeimpl(this.messageId) * 31)) * 31, 31);
        SpoilerAttributes spoilerAttributes = this.spoilerAttributes;
        return iU + (spoilerAttributes == null ? 0 : spoilerAttributes.hashCode());
    }

    @NotNull
    public String toString() {
        return "PostPreviewEmbedMessageAccessory(messageId=" + MessageId.m1163toStringimpl(this.messageId) + ", postPreviewEmbed=" + this.postPreviewEmbed + ", index=" + this.index + ", spoilerAttributes=" + this.spoilerAttributes + ")";
    }

    public /* synthetic */ PostPreviewEmbedMessageAccessory(String str, PostPreviewEmbed postPreviewEmbed, int i7, SpoilerAttributes spoilerAttributes, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, postPreviewEmbed, i7, (i10 & 8) != 0 ? null : spoilerAttributes, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PostPreviewEmbedMessageAccessory(String messageId, PostPreviewEmbed postPreviewEmbed, int i7, SpoilerAttributes spoilerAttributes) {
        super(messageId, "post preview embed " + i7, false, 4, null);
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(postPreviewEmbed, "postPreviewEmbed");
        this.messageId = messageId;
        this.postPreviewEmbed = postPreviewEmbed;
        this.index = i7;
        this.spoilerAttributes = spoilerAttributes;
    }
}
