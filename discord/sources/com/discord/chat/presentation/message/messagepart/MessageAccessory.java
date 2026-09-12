package com.discord.chat.presentation.message.messagepart;

import com.discord.misc.utilities.ids.IdUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.recycler_view.utils.ItemDiffableType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B#\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001+\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=¨\u0006>"}, d2 = {"Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lcom/discord/recycler_view/utils/ItemDiffableType;", "messageId", "Lcom/discord/primitives/MessageId;", "accessoryDescription", "", "isForwardInner", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getMessageId-3Eiw7ao", "()Ljava/lang/String;", "Ljava/lang/String;", "getAccessoryDescription", "()Z", "itemId", "", "getItemId", "()Ljava/lang/Long;", "Lcom/discord/chat/presentation/message/messagepart/ActivityInstanceEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ActivityRichPresenceInviteEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/AppMessageEmbedAccessory;", "Lcom/discord/chat/presentation/message/messagepart/AutoModerationNotificationEmbedAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ChannelPromptActionsAccessory;", "Lcom/discord/chat/presentation/message/messagepart/CtaButtonMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/EmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/EmbeddedActivityInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/EphemeralIndicationMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageActionBarAccessory;", "Lcom/discord/chat/presentation/message/messagepart/FlaggedMessageEmbedAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ForumPostActionBar;", "Lcom/discord/chat/presentation/message/messagepart/ForwardBreadcrumbMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ForwardHeaderMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/GiftIntentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/GuildEventInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/GuildInviteDisabledMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/GuildInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/GuildProfileInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/InfoLinkMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/InteractionStatusMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/InviteToSpeakAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MediaMosaicAttachmentMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageAttachmentAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageComponentsAccessory;", "Lcom/discord/chat/presentation/message/messagepart/MessageContentAccessory;", "Lcom/discord/chat/presentation/message/messagepart/PollMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/PostPreviewEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/PremiumGroupInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ReactionsMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ReferralMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ReferralRedesignMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/RoleSubscriptionPurchaseAccessory;", "Lcom/discord/chat/presentation/message/messagepart/SafetyPolicyNoticeMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/SafetySystemNotificationMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/SharedCustomThemeMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/StickerMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/SurveyIndicationMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/ThreadEmbedMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/TimestampMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/VoiceChannelListInviteMessageAccessory;", "Lcom/discord/chat/presentation/message/messagepart/WelcomeStickerAccessory;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class MessageAccessory implements ItemDiffableType {

    @NotNull
    private final String accessoryDescription;
    private final boolean isForwardInner;

    @NotNull
    private final String messageId;

    public /* synthetic */ MessageAccessory(String str, String str2, boolean z5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z5);
    }

    @NotNull
    public final String getAccessoryDescription() {
        return this.accessoryDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: getMessageId-3Eiw7ao, reason: from getter */
    public String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: isForwardInner, reason: from getter */
    public final boolean getIsForwardInner() {
        return this.isForwardInner;
    }

    private MessageAccessory(String messageId, String accessoryDescription, boolean z5) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(accessoryDescription, "accessoryDescription");
        this.messageId = messageId;
        this.accessoryDescription = accessoryDescription;
        this.isForwardInner = z5;
    }

    @Override // com.discord.recycler_view.utils.ItemDiffableType
    @NotNull
    public Long getItemId() {
        return Long.valueOf(IdUtilsKt.convertToId(MessageId.m1163toStringimpl(getMessageId()) + " - " + this.accessoryDescription));
    }

    public /* synthetic */ MessageAccessory(String str, String str2, boolean z5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? true : z5, null);
    }
}
