package com.discord.chat.presentation.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.ctabutton.CtaButton;
import com.discord.chat.bridge.polls.PollLayoutType;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.reaction.ReactionsTheme;
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.sticker.StickerFormatType;
import com.discord.chat.databinding.GiftIntentViewBinding;
import com.discord.chat.databinding.TimestampViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView;
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ActivityRichPresenceInviteEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.AppMessageEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory;
import com.discord.chat.presentation.message.messagepart.CtaButtonMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar;
import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ForwardHeaderMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GiftIntentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildProfileInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory;
import com.discord.chat.presentation.message.messagepart.MediaMosaicAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory;
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.PremiumGroupInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReferralRedesignMessageAccessory;
import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory;
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory;
import com.discord.chat.presentation.message.messagepart.SafetySystemNotificationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.SharedCustomThemeMessageAccessory;
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory;
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.VoiceChannelListInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory;
import com.discord.chat.presentation.message.view.ActivityInstanceEmbedView;
import com.discord.chat.presentation.message.view.ActivityRichPresenceInviteEmbedView;
import com.discord.chat.presentation.message.view.AppMessageEmbedView;
import com.discord.chat.presentation.message.view.AutoModerationNotificationEmbedView;
import com.discord.chat.presentation.message.view.ChannelPromptActionsView;
import com.discord.chat.presentation.message.view.CtaButtonView;
import com.discord.chat.presentation.message.view.EmbedView;
import com.discord.chat.presentation.message.view.EmbeddedActivityInviteView;
import com.discord.chat.presentation.message.view.EphemeralIndicationView;
import com.discord.chat.presentation.message.view.FileAttachmentView;
import com.discord.chat.presentation.message.view.FlaggedMessageActionBarView;
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView;
import com.discord.chat.presentation.message.view.ForumPostActionBarView;
import com.discord.chat.presentation.message.view.ForwardBreadcrumbView;
import com.discord.chat.presentation.message.view.ForwardHeaderView;
import com.discord.chat.presentation.message.view.GiftIntentView;
import com.discord.chat.presentation.message.view.GiftView;
import com.discord.chat.presentation.message.view.GuildEventInviteView;
import com.discord.chat.presentation.message.view.GuildInviteDisabledView;
import com.discord.chat.presentation.message.view.GuildInviteView;
import com.discord.chat.presentation.message.view.GuildProfileInviteView;
import com.discord.chat.presentation.message.view.InfoLinkView;
import com.discord.chat.presentation.message.view.InteractionStatusView;
import com.discord.chat.presentation.message.view.MediaImageView;
import com.discord.chat.presentation.message.view.MediaVideoView;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.message.view.PostPreviewEmbedView;
import com.discord.chat.presentation.message.view.PremiumGroupInviteView;
import com.discord.chat.presentation.message.view.ReferralRedesignView;
import com.discord.chat.presentation.message.view.ReferralView;
import com.discord.chat.presentation.message.view.RoleSubscriptionPurchaseView;
import com.discord.chat.presentation.message.view.SafetyPolicyNoticeView;
import com.discord.chat.presentation.message.view.SafetySystemNotificationView;
import com.discord.chat.presentation.message.view.SurveyIndicationView;
import com.discord.chat.presentation.message.view.ThreadEmbedView;
import com.discord.chat.presentation.message.view.VoiceChannelListInviteView;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView;
import com.discord.chat.presentation.message.view.customthemes.SharedCustomThemeView;
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView;
import com.discord.chat.presentation.message.view.polls.PollImageOnlyView;
import com.discord.chat.presentation.message.view.polls.PollTextAndImageView;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView;
import com.discord.chat.presentation.message.viewholder.ActivityInstanceEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.ActivityRichPresenceInviteEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.AppMessageEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.AttachmentMediaMosaicViewHolder;
import com.discord.chat.presentation.message.viewholder.AudioPlayerViewHolder;
import com.discord.chat.presentation.message.viewholder.AutoModerationNotificationEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.ChannelPromptActionsViewHolder;
import com.discord.chat.presentation.message.viewholder.CtaButtonViewHolder;
import com.discord.chat.presentation.message.viewholder.EmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.EmbeddedActivityInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.EphemeralIndicationViewHolder;
import com.discord.chat.presentation.message.viewholder.FileAttachmentViewHolder;
import com.discord.chat.presentation.message.viewholder.FlaggedMessageActionBarViewHolder;
import com.discord.chat.presentation.message.viewholder.FlaggedMessageEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.ForumPostActionBarViewHolder;
import com.discord.chat.presentation.message.viewholder.ForwardBreadcrumbViewHolder;
import com.discord.chat.presentation.message.viewholder.ForwardHeaderViewHolder;
import com.discord.chat.presentation.message.viewholder.GiftIntentViewHolder;
import com.discord.chat.presentation.message.viewholder.GiftViewHolder;
import com.discord.chat.presentation.message.viewholder.GuildEventInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.GuildInviteDisabledViewHolder;
import com.discord.chat.presentation.message.viewholder.GuildInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.GuildProfileInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.InfoLinkViewHolder;
import com.discord.chat.presentation.message.viewholder.InteractionStatusViewHolder;
import com.discord.chat.presentation.message.viewholder.InviteToSpeakViewHolder;
import com.discord.chat.presentation.message.viewholder.MessageComponentsViewHolder;
import com.discord.chat.presentation.message.viewholder.MessageContentViewHolder;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.presentation.message.viewholder.PollViewHolder;
import com.discord.chat.presentation.message.viewholder.PostPreviewEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.PremiumGroupInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.ReactionsViewHolder;
import com.discord.chat.presentation.message.viewholder.ReferralRedesignViewHolder;
import com.discord.chat.presentation.message.viewholder.ReferralViewHolder;
import com.discord.chat.presentation.message.viewholder.RoleSubscriptionPurchaseViewHolder;
import com.discord.chat.presentation.message.viewholder.SafetyPolicyNoticeViewHolder;
import com.discord.chat.presentation.message.viewholder.SafetySystemNotificationViewHolder;
import com.discord.chat.presentation.message.viewholder.SharedCustomThemeViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerApngViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerGifViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerLottieViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerPartViewHolder;
import com.discord.chat.presentation.message.viewholder.StickerPngViewHolder;
import com.discord.chat.presentation.message.viewholder.SurveyIndicationViewHolder;
import com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolder;
import com.discord.chat.presentation.message.viewholder.TimestampViewHolder;
import com.discord.chat.presentation.message.viewholder.VoiceChannelListInviteViewHolder;
import com.discord.chat.presentation.message.viewholder.WelcomeStickerViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder;
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder;
import com.discord.chat.presentation.stickers.WelcomeStickerView;
import com.discord.chat.reactevents.ViewResizeMode;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.discord.misc.utilities.kotlin.ForceExhaustiveKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewLocationUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.reactions.ReactionView;
import com.discord.reactions.ShortcutsFlexbox;
import com.discord.sticker.StickerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0017\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00022\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020%H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020%2\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0007¢\u0006\u0004\b3\u00104Jg\u0010C\u001a\u00020\u0004*\u0002052\u0006\u0010\r\u001a\u00020\f2\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\b\u0010;\u001a\u0004\u0018\u00010:2\u0006\u0010<\u001a\u00020%2\b\u0010=\u001a\u0004\u0018\u00010%2\b\u0010>\u001a\u0004\u0018\u0001062\b\u0010?\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010@\u001a\u0004\u0018\u000106H\u0002¢\u0006\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010DR\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010ER\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010FR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010GR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010HR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010IR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010KR\"\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/discord/chat/presentation/message/MessageAccessoriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "Lkotlin/Function0;", "", "measureAndLayout", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "recyclerViewPool", "setNestedAccessoriesRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/GuildId;", "guildId", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", AlertFragment.ARG_ITEMS, "setItems-bo5iIEc", "(Ljava/lang/String;JLcom/discord/primitives/GuildId;Ljava/util/List;)V", "setItems", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "setEventHandler", "(Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "botComponentProvider", "setComponentProvider", "(Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;)V", "holder", "onViewRecycled", "(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", ViewProps.POSITION, "onBindViewHolder", "(Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", "getItemId", "(I)J", "clear", "()V", "Landroid/view/View;", "", "type", "Lcom/discord/chat/reactevents/ViewResizeMode;", "viewResizeMode", "", "portal", "attachmentIndex", "embedIndex", "componentId", "componentMediaIndex", "embedId", "onMediaClicked-Baqrwu4", "(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/reactevents/ViewResizeMode;Ljava/lang/Double;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "onMediaClicked", "Lkotlin/jvm/functions/Function0;", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "Ljava/util/List;", "Ljava/lang/String;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/primitives/GuildId;", "Lkotlin/Function1;", "onTapSpoiler", "Lkotlin/jvm/functions/Function1;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MessageAccessoriesAdapter extends RecyclerView.Adapter {
    private ComponentProvider botComponentProvider;
    private ChannelId channelId;
    private ChatEventHandler eventHandler;
    private GuildId guildId;

    @NotNull
    private List<? extends MessageAccessory> items;

    @NotNull
    private final Function0<Unit> measureAndLayout;
    private String messageId;

    @NotNull
    private Function1<? super MessagePartViewHolder, Unit> onTapSpoiler;
    private RecyclerView.RecycledViewPool recyclerViewPool;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StickerFormatType.values().length];
            try {
                iArr[StickerFormatType.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerFormatType.APNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerFormatType.LOTTIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerFormatType.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PollLayoutType.values().length];
            try {
                iArr2[PollLayoutType.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PollLayoutType.TEXT_AND_IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PollLayoutType.IMAGE_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$11, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass11 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass11(Object obj) {
            super(3, obj, ChatEventHandler.class, "onGiftIntentCardViewed", "onGiftIntentCardViewed-gzHKzLY(Ljava/lang/String;JI)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m542invokegzHKzLY(((MessageId) obj).m1165unboximpl(), ((UserId) obj2).m1217unboximpl(), ((Number) obj3).intValue());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-gzHKzLY, reason: not valid java name */
        public final void m542invokegzHKzLY(String p3, long j, int i7) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo464onGiftIntentCardViewedgzHKzLY(p3, j, i7);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$12, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass12 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass12(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapGiftIntentPrimaryCta", "onTapGiftIntentPrimaryCta-gzHKzLY(Ljava/lang/String;JI)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m543invokegzHKzLY(((MessageId) obj).m1165unboximpl(), ((UserId) obj2).m1217unboximpl(), ((Number) obj3).intValue());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-gzHKzLY, reason: not valid java name */
        public final void m543invokegzHKzLY(String p3, long j, int i7) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo491onTapGiftIntentPrimaryCtagzHKzLY(p3, j, i7);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$13, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass13 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass13(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapGiftIntentSecondaryCta", "onTapGiftIntentSecondaryCta-gzHKzLY(Ljava/lang/String;JI)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m544invokegzHKzLY(((MessageId) obj).m1165unboximpl(), ((UserId) obj2).m1217unboximpl(), ((Number) obj3).intValue());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-gzHKzLY, reason: not valid java name */
        public final void m544invokegzHKzLY(String p3, long j, int i7) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo492onTapGiftIntentSecondaryCtagzHKzLY(p3, j, i7);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$14, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass14 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public AnonymousClass14(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapGiftCodeEmbed", "onTapGiftCodeEmbed(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.f14616a;
        }

        public final void invoke(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapGiftCodeEmbed(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$16, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass16 extends FunctionReferenceImpl implements Function2<MessageId, LinkContentNode, Unit> {
        public AnonymousClass16(Object obj) {
            super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m545invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
        public final void m545invokentcYbpo(String p3, LinkContentNode p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).mo468onLinkClickedntcYbpo(p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$17, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass17 extends FunctionReferenceImpl implements Function1<LinkContentNode, Unit> {
        public AnonymousClass17(Object obj) {
            super(1, obj, ChatEventHandler.class, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((LinkContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(LinkContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onLinkLongClicked(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$18, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass18 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass18(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((String) obj, (String) obj2, (String) obj3);
            return Unit.f14616a;
        }

        public final void invoke(String p3, String str, String str2) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapChannel(p3, str, str2);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$19, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass19 extends FunctionReferenceImpl implements Function4 {
        public AnonymousClass19(Object obj) {
            super(4, obj, ChatEventHandler.class, "onLongPressChannel", "onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((String) obj, (String) obj2, (String) obj3, (String) obj4);
            return Unit.f14616a;
        }

        public final void invoke(String p3, String str, String str2, String str3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onLongPressChannel(p3, str, str2, str3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$20, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass20 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public AnonymousClass20(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.f14616a;
        }

        public final void invoke(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapAttachmentLink(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$21, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass21 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
        public AnonymousClass21(Object obj) {
            super(2, obj, ChatEventHandler.class, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return Unit.f14616a;
        }

        public final void invoke(String p3, String p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).onLongPressAttachmentLink(p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$22, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass22 extends FunctionReferenceImpl implements Function6 {
        public AnonymousClass22(Object obj) {
            super(6, obj, ChatEventHandler.class, "onTapMention", "onTapMention(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function6
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            invoke((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6);
            return Unit.f14616a;
        }

        public final void invoke(String str, String p3, String str2, String str3, String str4, String str5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            ((ChatEventHandler) this.receiver).onTapMention(str, p3, str2, str3, str4, str5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$23, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass23 extends FunctionReferenceImpl implements Function1<CommandMentionContentNode, Unit> {
        public AnonymousClass23(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CommandMentionContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(CommandMentionContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapCommand(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$24, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass24 extends FunctionReferenceImpl implements Function1<CommandMentionContentNode, Unit> {
        public AnonymousClass24(Object obj) {
            super(1, obj, ChatEventHandler.class, "onLongPressCommand", "onLongPressCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CommandMentionContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(CommandMentionContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onLongPressCommand(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$25, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass25 extends FunctionReferenceImpl implements Function1<GameMentionContentNode, Unit> {
        public AnonymousClass25(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapGameMention", "onTapGameMention(Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((GameMentionContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(GameMentionContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapGameMention(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$26, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass26 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public AnonymousClass26(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.f14616a;
        }

        public final void invoke(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapTimestamp(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$27, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass27 extends FunctionReferenceImpl implements Function1<InlineCodeContentNode, Unit> {
        public AnonymousClass27(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapInlineCode", "onTapInlineCode(Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InlineCodeContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(InlineCodeContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapInlineCode(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$28, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass28 extends FunctionReferenceImpl implements Function1<EmojiContentNode, Unit> {
        public AnonymousClass28(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((EmojiContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(EmojiContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapEmoji(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$29, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass29 extends FunctionReferenceImpl implements Function1<MessageId, Unit> {
        public AnonymousClass29(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m546invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
        public final void m546invoke1xi1bu0(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo510onTapSeeMore1xi1bu0(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$30, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass30 extends FunctionReferenceImpl implements Function1<SoundmojiContentNode, Unit> {
        public AnonymousClass30(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapSoundmoji", "onTapSoundmoji(Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SoundmojiContentNode) obj);
            return Unit.f14616a;
        }

        public final void invoke(SoundmojiContentNode p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapSoundmoji(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$40, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass40 extends FunctionReferenceImpl implements Function1<MessageId, Unit> {
        public AnonymousClass40(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m547invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
        public final void m547invoke1xi1bu0(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo516onTapThreadEmbed1xi1bu0(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$48, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass48 extends FunctionReferenceImpl implements Function2<MessageId, LinkContentNode, Unit> {
        public AnonymousClass48(Object obj) {
            super(2, obj, ChatEventHandler.class, "onLinkClicked", "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m548invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
        public final void m548invokentcYbpo(String p3, LinkContentNode p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).mo468onLinkClickedntcYbpo(p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$55, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass55 extends FunctionReferenceImpl implements Function2<MessageId, ChannelId, Unit> {
        public AnonymousClass55(Object obj) {
            super(2, obj, ChatEventHandler.class, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m549invokepfaIj0E(((MessageId) obj).m1165unboximpl(), ((ChannelId) obj2).m1139unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-pfaIj0E, reason: not valid java name */
        public final void m549invokepfaIj0E(String p3, long j) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo477onTapAutoModerationActionspfaIj0E(p3, j);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$56, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass56 extends FunctionReferenceImpl implements Function2<MessageId, ChannelId, Unit> {
        public AnonymousClass56(Object obj) {
            super(2, obj, ChatEventHandler.class, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m550invokepfaIj0E(((MessageId) obj).m1165unboximpl(), ((ChannelId) obj2).m1139unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-pfaIj0E, reason: not valid java name */
        public final void m550invokepfaIj0E(String p3, long j) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo478onTapAutoModerationFeedbackpfaIj0E(p3, j);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$57, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass57 extends FunctionReferenceImpl implements Function2<MessageId, ChannelId, Unit> {
        public AnonymousClass57(Object obj) {
            super(2, obj, ChatEventHandler.class, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m551invokepfaIj0E(((MessageId) obj).m1165unboximpl(), ((ChannelId) obj2).m1139unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-pfaIj0E, reason: not valid java name */
        public final void m551invokepfaIj0E(String p3, long j) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo477onTapAutoModerationActionspfaIj0E(p3, j);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$58, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass58 extends FunctionReferenceImpl implements Function2<MessageId, ChannelId, Unit> {
        public AnonymousClass58(Object obj) {
            super(2, obj, ChatEventHandler.class, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m552invokepfaIj0E(((MessageId) obj).m1165unboximpl(), ((ChannelId) obj2).m1139unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-pfaIj0E, reason: not valid java name */
        public final void m552invokepfaIj0E(String p3, long j) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo478onTapAutoModerationFeedbackpfaIj0E(p3, j);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$59, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass59 extends FunctionReferenceImpl implements Function1<MessageId, Unit> {
        public AnonymousClass59(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapJoinRichPresence", "onTapJoinRichPresence-1xi1bu0(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m553invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
        public final void m553invoke1xi1bu0(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo499onTapJoinRichPresence1xi1bu0(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$61, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass61 extends FunctionReferenceImpl implements Function4 {
        public AnonymousClass61(Object obj) {
            super(4, obj, ChatEventHandler.class, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            m554invokekUTrps(((GuildId) obj).m1152unboximpl(), ((ChannelId) obj2).m1139unboximpl(), ((ChannelId) obj3).m1139unboximpl(), ((MessageId) obj4).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-kUTrp-s, reason: not valid java name */
        public final void m554invokekUTrps(long j, long j5, long j7, String p3) {
            Intrinsics.checkNotNullParameter(p3, "p3");
            ((ChatEventHandler) this.receiver).mo506onTapPostPreviewEmbedkUTrps(j, j5, j7, p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$64, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass64 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass64(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapChannelPromptButton", "onTapChannelPromptButton-Eqy5D80(Ljava/lang/String;JLjava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m555invokeEqy5D80(((MessageId) obj).m1165unboximpl(), ((ChannelId) obj2).m1139unboximpl(), (String) obj3);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-Eqy5D80, reason: not valid java name */
        public final void m555invokeEqy5D80(String p3, long j, String p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p2");
            ((ChatEventHandler) this.receiver).mo482onTapChannelPromptButtonEqy5D80(p3, j, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$65, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass65 extends FunctionReferenceImpl implements Function1<String, Unit> {
        public AnonymousClass65(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapSafetyPolicyNoticeEmbed", "onTapSafetyPolicyNoticeEmbed(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.f14616a;
        }

        public final void invoke(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).onTapSafetyPolicyNoticeEmbed(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$66, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass66 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
        public AnonymousClass66(Object obj) {
            super(2, obj, ChatEventHandler.class, "onTapSafetySystemNotificationCta", "onTapSafetySystemNotificationCta(Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (String) obj2);
            return Unit.f14616a;
        }

        public final void invoke(String p3, String p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).onTapSafetySystemNotificationCta(p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$67, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass67 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass67(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapPollAnswer", "onTapPollAnswer-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m556invokesekaTiM(((ChannelId) obj).m1139unboximpl(), ((MessageId) obj2).m1165unboximpl(), (String) obj3);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-sekaTiM, reason: not valid java name */
        public final void m556invokesekaTiM(long j, String p3, String p5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            Intrinsics.checkNotNullParameter(p5, "p2");
            ((ChatEventHandler) this.receiver).mo504onTapPollAnswersekaTiM(j, p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$68, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass68 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass68(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapPollAction", "onTapPollAction-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m557invokesekaTiM(((ChannelId) obj).m1139unboximpl(), ((MessageId) obj2).m1165unboximpl(), (String) obj3);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-sekaTiM, reason: not valid java name */
        public final void m557invokesekaTiM(long j, String p3, String p5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            Intrinsics.checkNotNullParameter(p5, "p2");
            ((ChatEventHandler) this.receiver).mo503onTapPollActionsekaTiM(j, p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$69, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass69 extends FunctionReferenceImpl implements Function8 {
        public AnonymousClass69(Object obj) {
            super(8, obj, ChatEventHandler.class, "onLongPressPollImage", "onLongPressPollImage-YVExdug(JLjava/lang/String;Ljava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function8
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
            m558invokeYVExdug(((ChannelId) obj).m1139unboximpl(), ((MessageId) obj2).m1165unboximpl(), (String) obj3, ((Number) obj4).intValue(), ((Number) obj5).intValue(), ((Number) obj6).intValue(), ((Number) obj7).intValue(), (ViewResizeMode) obj8);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-YVExdug, reason: not valid java name */
        public final void m558invokeYVExdug(long j, String p3, String p5, int i7, int i10, int i11, int i12, ViewResizeMode p10) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            Intrinsics.checkNotNullParameter(p5, "p2");
            Intrinsics.checkNotNullParameter(p10, "p7");
            ((ChatEventHandler) this.receiver).mo471onLongPressPollImageYVExdug(j, p3, p5, i7, i10, i11, i12, p10);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$70, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass70 extends FunctionReferenceImpl implements Function1<MessageId, Unit> {
        public AnonymousClass70(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapPreviewSharedClientTheme", "onTapPreviewSharedClientTheme-1xi1bu0(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m560invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
        public final void m560invoke1xi1bu0(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo507onTapPreviewSharedClientTheme1xi1bu0(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$71, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass71 extends FunctionReferenceImpl implements Function1<MessageId, Unit> {
        public AnonymousClass71(Object obj) {
            super(1, obj, ChatEventHandler.class, "onSharedClientThemeViewed", "onSharedClientThemeViewed-1xi1bu0(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m561invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
        public final void m561invoke1xi1bu0(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo474onSharedClientThemeViewed1xi1bu0(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$72, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass72 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass72(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapCtaButton", "onTapCtaButton-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m562invokesekaTiM(((ChannelId) obj).m1139unboximpl(), ((MessageId) obj2).m1165unboximpl(), (String) obj3);
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-sekaTiM, reason: not valid java name */
        public final void m562invokesekaTiM(long j, String p3, String p5) {
            Intrinsics.checkNotNullParameter(p3, "p1");
            Intrinsics.checkNotNullParameter(p5, "p2");
            ((ChatEventHandler) this.receiver).mo486onTapCtaButtonsekaTiM(j, p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onBindViewHolder$73, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass73 extends FunctionReferenceImpl implements Function3 {
        public AnonymousClass73(Object obj) {
            super(3, obj, ChatEventHandler.class, "onTapForwardFooter", "onTapForwardFooter-SHRpUJI(IJLjava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m563invokeSHRpUJI(((Number) obj).intValue(), ((ChannelId) obj2).m1139unboximpl(), ((MessageId) obj3).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-SHRpUJI, reason: not valid java name */
        public final void m563invokeSHRpUJI(int i7, long j, String p3) {
            Intrinsics.checkNotNullParameter(p3, "p2");
            ((ChatEventHandler) this.receiver).mo489onTapForwardFooterSHRpUJI(i7, j, p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onCreateViewHolder$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<Sticker, MessageId, Unit> {
        public AnonymousClass2(Object obj) {
            super(2, obj, ChatEventHandler.class, "onWelcomeReplyClicked", "onWelcomeReplyClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m565invokeAyv7vGE((Sticker) obj, ((MessageId) obj2).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-Ayv7vGE, reason: not valid java name */
        public final void m565invokeAyv7vGE(Sticker p3, String p5) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            Intrinsics.checkNotNullParameter(p5, "p1");
            ((ChatEventHandler) this.receiver).mo519onWelcomeReplyClickedAyv7vGE(p3, p5);
        }
    }

    /* JADX INFO: renamed from: com.discord.chat.presentation.message.MessageAccessoriesAdapter$onCreateViewHolder$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<MessageId, Unit> {
        public AnonymousClass3(Object obj) {
            super(1, obj, ChatEventHandler.class, "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m566invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
            return Unit.f14616a;
        }

        /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
        public final void m566invoke1xi1bu0(String p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            ((ChatEventHandler) this.receiver).mo497onTapInviteToSpeak1xi1bu0(p3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageAccessoriesAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$10(MessageAccessoriesAdapter messageAccessoriesAdapter, String str) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        chatEventHandler.onTapReferralRedeem(null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$11(MessageAccessoriesAdapter messageAccessoriesAdapter, String str) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        chatEventHandler.onTapReferralRedeem(null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$12(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory, String giftCode) {
        Intrinsics.checkNotNullParameter(giftCode, "giftCode");
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        chatEventHandler.mo490onTapGiftCodeAcceptNU4t8f8(giftCode, ((GiftMessageAccessory) messageAccessory).getMessageId());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$13(MessageAccessoriesAdapter messageAccessoriesAdapter, int i7, MessageAccessory attachment, MessagePartViewHolder attachmentViewHolder) {
        Double dValueOf;
        Intrinsics.checkNotNullParameter(attachment, "attachment");
        Intrinsics.checkNotNullParameter(attachmentViewHolder, "attachmentViewHolder");
        View itemView = attachmentViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        String strMo575getMessageId3Eiw7ao = attachment.getMessageId();
        if (attachment instanceof ImageAttachmentMessageAccessory) {
            dValueOf = null;
        } else {
            if (!(attachment instanceof VideoAttachmentMessageAccessory)) {
                throw new IllegalStateException(("Unsupported accessory: " + attachment).toString());
            }
            dValueOf = Double.valueOf(((VideoAttachmentMessageAccessory) attachment).getPortal());
        }
        m539onMediaClickedBaqrwu4$default(messageAccessoriesAdapter, itemView, strMo575getMessageId3Eiw7ao, "attachment", ViewResizeMode.Cover, dValueOf, i7, null, null, null, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$15$lambda$14(Function4 function4, int i7) {
        function4.invoke(MediaType.Attachment, Integer.valueOf(i7), null, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$16(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        messageAccessoriesAdapter.onTapSpoiler.invoke(messagePartViewHolder);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$17(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory, boolean z5) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory = (MediaMosaicAttachmentMessageAccessory) messageAccessory;
        chatEventHandler.mo502onTapObscuredMediaToggleZQwuxwg(mediaMosaicAttachmentMessageAccessory.getMessageId(), mediaMosaicAttachmentMessageAccessory.m661getChannelIdo4g7jtM(), z5, null, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$18(MessageAccessoriesAdapter messageAccessoriesAdapter, View view) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        ChatEventHandler.DefaultImpls.m525onTapReactionAFFcxXc$default(chatEventHandler, str, null, null, "Message Shortcut", 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$19(MessageAccessoriesAdapter messageAccessoriesAdapter, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        ChatEventHandler.DefaultImpls.m525onTapReactionAFFcxXc$default(chatEventHandler, str, reaction, null, null, 12, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$20(MessageAccessoriesAdapter messageAccessoriesAdapter, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        ChannelId channelId = messageAccessoriesAdapter.channelId;
        Intrinsics.checkNotNull(channelId);
        chatEventHandler.mo472onLongPressReactionEqy5D80(str, channelId.m1139unboximpl(), reaction);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$21(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory, Sticker it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        StickerMessageAccessory stickerMessageAccessory = (StickerMessageAccessory) messageAccessory;
        chatEventHandler.mo475onStickerClickedAyv7vGE(stickerMessageAccessory.getSticker(), stickerMessageAccessory.getMessageId());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$22(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory, Sticker it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        StickerMessageAccessory stickerMessageAccessory = (StickerMessageAccessory) messageAccessory;
        chatEventHandler.mo476onStickerLongClickedAyv7vGE(stickerMessageAccessory.getSticker(), stickerMessageAccessory.getMessageId());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$23(MessageAccessoriesAdapter messageAccessoriesAdapter, View view) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        ChannelId channelId = messageAccessoriesAdapter.channelId;
        Intrinsics.checkNotNull(channelId);
        chatEventHandler.mo488onTapFollowForumPostpfaIj0E(str, channelId.m1139unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$24(MessageAccessoriesAdapter messageAccessoriesAdapter, View view) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        ChannelId channelId = messageAccessoriesAdapter.channelId;
        Intrinsics.checkNotNull(channelId);
        long jM1139unboximpl = channelId.m1139unboximpl();
        GuildId guildId = messageAccessoriesAdapter.guildId;
        Intrinsics.checkNotNull(guildId);
        chatEventHandler.mo512onTapShareForumPostmgk6anA(jM1139unboximpl, guildId.m1152unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$25(MessageAccessoriesAdapter messageAccessoriesAdapter, View view) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        ChatEventHandler.DefaultImpls.m525onTapReactionAFFcxXc$default(chatEventHandler, str, null, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$26(MessageAccessoriesAdapter messageAccessoriesAdapter, View view) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        ChannelId channelId = messageAccessoriesAdapter.channelId;
        Intrinsics.checkNotNull(channelId);
        chatEventHandler.mo509onTapReactionOverflowpfaIj0E(str, channelId.m1139unboximpl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$27(MessageAccessoriesAdapter messageAccessoriesAdapter, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        ChatEventHandler.DefaultImpls.m525onTapReactionAFFcxXc$default(chatEventHandler, str, reaction, null, null, 12, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$28(MessageAccessoriesAdapter messageAccessoriesAdapter, ReactionView.Reaction reaction) {
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        ChannelId channelId = messageAccessoriesAdapter.channelId;
        Intrinsics.checkNotNull(channelId);
        chatEventHandler.mo472onLongPressReactionEqy5D80(str, channelId.m1139unboximpl(), reaction);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$30(MessageAccessoriesAdapter messageAccessoriesAdapter, View view) {
        String str = messageAccessoriesAdapter.messageId;
        if (str != null) {
            ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
            if (chatEventHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler = null;
            }
            chatEventHandler.mo487onTapDismissMediaPostSharePrompt1xi1bu0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$31(MessageAccessoriesAdapter messageAccessoriesAdapter, String url, String filename) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filename, "filename");
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        String str = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str);
        chatEventHandler.mo469onLinkClickedu7_MRrM(str, url, filename);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$32(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        messageAccessoriesAdapter.onTapSpoiler.invoke(messagePartViewHolder);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$34$lambda$33(Function4 function4, String componentId, Integer num) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        function4.invoke(MediaType.Component, null, componentId, num);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$35(MessageAccessory messageAccessory, MessageAccessoriesAdapter messageAccessoriesAdapter, View view, String componentId, Integer num, Double d6) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        MessageComponentsAccessory messageComponentsAccessory = (MessageComponentsAccessory) messageAccessory;
        messageAccessoriesAdapter.m538onMediaClickedBaqrwu4(view, messageComponentsAccessory.getMessageId(), "component", ViewResizeMode.Fill, d6, 0, null, componentId, num, messageComponentsAccessory.getEmbedId());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$36(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        messageAccessoriesAdapter.onTapSpoiler.invoke(messagePartViewHolder);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$37(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory, boolean z5) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        MessageComponentsAccessory messageComponentsAccessory = (MessageComponentsAccessory) messageAccessory;
        chatEventHandler.mo502onTapObscuredMediaToggleZQwuxwg(messageComponentsAccessory.getMessageId(), messageComponentsAccessory.getMessage().m264getChannelIdo4g7jtM(), z5, null, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$39$lambda$38(Function4 function4, MessageAccessory messageAccessory, String str, Integer num) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        function4.invoke(MediaType.Attachment, Integer.valueOf(((AudioAttachmentMessageAccessory) messageAccessory).getAttachmentIndex()), null, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$4$lambda$3(Function6 function6, MessageAccessoriesAdapter messageAccessoriesAdapter, MediaType mediaType, Integer num, String str, Integer num2) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        String str2 = messageAccessoriesAdapter.messageId;
        Intrinsics.checkNotNull(str2);
        MessageId messageIdM1156boximpl = str2 != null ? MessageId.m1156boximpl(str2) : null;
        ChannelId channelId = messageAccessoriesAdapter.channelId;
        Intrinsics.checkNotNull(channelId);
        function6.invoke(messageIdM1156boximpl, channelId, num, mediaType, str, num2);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$40(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        messageAccessoriesAdapter.onTapSpoiler.invoke(messagePartViewHolder);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$41(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory, boolean z5) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory = (PostPreviewEmbedMessageAccessory) messageAccessory;
        chatEventHandler.mo502onTapObscuredMediaToggleZQwuxwg(postPreviewEmbedMessageAccessory.getMessageId(), postPreviewEmbedMessageAccessory.getPostPreviewEmbed().m435getThreadIdo4g7jtM(), z5, null, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$5(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        messageAccessoriesAdapter.onTapSpoiler.invoke(messagePartViewHolder);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$6(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory, boolean z5) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        EmbedMessageAccessory embedMessageAccessory = (EmbedMessageAccessory) messageAccessory;
        chatEventHandler.mo502onTapObscuredMediaToggleZQwuxwg(embedMessageAccessory.getMessageId(), embedMessageAccessory.m601getChannelIdo4g7jtM(), z5, null, embedMessageAccessory.getEmbed().getId());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$7(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder messagePartViewHolder) {
        messageAccessoriesAdapter.onTapSpoiler.invoke(messagePartViewHolder);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$8(MessagePartViewHolder messagePartViewHolder, MessageAccessory messageAccessory, MessageAccessoriesAdapter messageAccessoriesAdapter, Double d6, Integer num) {
        View itemView = messagePartViewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        EmbedMessageAccessory embedMessageAccessory = (EmbedMessageAccessory) messageAccessory;
        m539onMediaClickedBaqrwu4$default(messageAccessoriesAdapter, itemView, embedMessageAccessory.getMessageId(), "embed", ViewResizeMode.Fill, d6, embedMessageAccessory.getIndex(), num, null, null, null, IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$9(MessageAccessoriesAdapter messageAccessoriesAdapter, MessageAccessory messageAccessory) {
        ChatEventHandler chatEventHandler = messageAccessoriesAdapter.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        InfoLinkMessageAccessory infoLinkMessageAccessory = (InfoLinkMessageAccessory) messageAccessory;
        chatEventHandler.mo501onTapObscuredMediaLearnMore8a0ehIg(infoLinkMessageAccessory.getMessageId(), infoLinkMessageAccessory.m653getChannelIdo4g7jtM(), infoLinkMessageAccessory.getAttachmentId(), infoLinkMessageAccessory.getEmbedId());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateViewHolder$lambda$2(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        messageAccessoriesAdapter.onTapSpoiler.invoke(holder);
        return Unit.f14616a;
    }

    /* JADX INFO: renamed from: onMediaClicked-Baqrwu4, reason: not valid java name */
    private final void m538onMediaClickedBaqrwu4(View view, String str, String str2, ViewResizeMode viewResizeMode, Double d6, int i7, Integer num, String str3, Integer num2, String str4) {
        Point locationInWindow = ViewLocationUtilsKt.getLocationInWindow(view);
        ChatEventHandler chatEventHandler = this.eventHandler;
        if (chatEventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler = null;
        }
        chatEventHandler.mo493onTapImageJJXpD5M(str, i7, str2, (int) SizeUtilsKt.getPxToDp(view.getWidth()), (int) SizeUtilsKt.getPxToDp(view.getHeight()), (int) SizeUtilsKt.getPxToDp(locationInWindow.x), (int) SizeUtilsKt.getPxToDp(locationInWindow.y), viewResizeMode, d6, num, str3, num2, str4);
    }

    /* JADX INFO: renamed from: onMediaClicked-Baqrwu4$default, reason: not valid java name */
    public static /* synthetic */ void m539onMediaClickedBaqrwu4$default(MessageAccessoriesAdapter messageAccessoriesAdapter, View view, String str, String str2, ViewResizeMode viewResizeMode, Double d6, int i7, Integer num, String str3, Integer num2, String str4, int i10, Object obj) {
        messageAccessoriesAdapter.m538onMediaClickedBaqrwu4(view, str, str2, viewResizeMode, d6, i7, num, str3, num2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? null : str4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTapSpoiler$lambda$1(MessageAccessoriesAdapter messageAccessoriesAdapter, MessagePartViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        messageAccessoriesAdapter.notifyItemChanged(holder.getBindingAdapterPosition());
        messageAccessoriesAdapter.measureAndLayout.invoke();
        return Unit.f14616a;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void clear() {
        this.items = n0.f14659d;
        this.messageId = null;
        this.channelId = null;
        this.guildId = null;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.items.get(position).getItemId().longValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        MessageAccessory messageAccessory = this.items.get(position);
        if (messageAccessory instanceof EmbedMessageAccessory) {
            return 1;
        }
        if (messageAccessory instanceof GiftMessageAccessory) {
            return 16;
        }
        if (messageAccessory instanceof ReferralMessageAccessory) {
            return 52;
        }
        if (messageAccessory instanceof ReferralRedesignMessageAccessory) {
            return 58;
        }
        if (messageAccessory instanceof PremiumGroupInviteMessageAccessory) {
            return 57;
        }
        if (messageAccessory instanceof GiftIntentMessageAccessory) {
            return 60;
        }
        if (messageAccessory instanceof MessageContentAccessory) {
            return 0;
        }
        if (messageAccessory instanceof GuildInviteMessageAccessory) {
            return 5;
        }
        if (messageAccessory instanceof AppMessageEmbedAccessory) {
            return 54;
        }
        if (messageAccessory instanceof ActivityInstanceEmbedMessageAccessory) {
            return 40;
        }
        if (messageAccessory instanceof EmbeddedActivityInviteMessageAccessory) {
            return 31;
        }
        if (messageAccessory instanceof GuildInviteDisabledMessageAccessory) {
            return 25;
        }
        if (messageAccessory instanceof GuildEventInviteMessageAccessory) {
            return 15;
        }
        if (messageAccessory instanceof ReactionsMessageAccessory) {
            return 4;
        }
        if (messageAccessory instanceof StickerMessageAccessory) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[((StickerMessageAccessory) messageAccessory).getSticker().getFormatType().ordinal()];
            if (i7 == 1) {
                return 6;
            }
            if (i7 == 2) {
                return 7;
            }
            if (i7 == 3) {
                return 8;
            }
            if (i7 == 4) {
                return 27;
            }
            throw new rn.n();
        }
        if (messageAccessory instanceof ThreadEmbedMessageAccessory) {
            return 9;
        }
        if (messageAccessory instanceof FileAttachmentMessageAccessory) {
            return 11;
        }
        if (messageAccessory instanceof MessageComponentsAccessory) {
            return 12;
        }
        if (messageAccessory instanceof TimestampMessageAccessory) {
            return 13;
        }
        if (messageAccessory instanceof WelcomeStickerAccessory) {
            return 14;
        }
        if (messageAccessory instanceof ActivityRichPresenceInviteEmbedMessageAccessory) {
            return 55;
        }
        if (messageAccessory instanceof EphemeralIndicationMessageAccessory) {
            return 18;
        }
        if (messageAccessory instanceof SurveyIndicationMessageAccessory) {
            return 24;
        }
        if (messageAccessory instanceof InteractionStatusMessageAccessory) {
            return 19;
        }
        if (messageAccessory instanceof ForumPostActionBar) {
            return 20;
        }
        if (messageAccessory instanceof FlaggedMessageEmbedAccessory) {
            return 21;
        }
        if (messageAccessory instanceof FlaggedMessageActionBarAccessory) {
            return 22;
        }
        if (messageAccessory instanceof AutoModerationNotificationEmbedAccessory) {
            return 33;
        }
        if (messageAccessory instanceof RoleSubscriptionPurchaseAccessory) {
            return 23;
        }
        if (messageAccessory instanceof MediaMosaicAttachmentMessageAccessory) {
            return 26;
        }
        if (messageAccessory instanceof InviteToSpeakAccessory) {
            return 28;
        }
        if (messageAccessory instanceof AudioAttachmentMessageAccessory) {
            return 29;
        }
        if (messageAccessory instanceof PostPreviewEmbedMessageAccessory) {
            return 32;
        }
        if (messageAccessory instanceof ChannelPromptActionsAccessory) {
            return 34;
        }
        if (messageAccessory instanceof InfoLinkMessageAccessory) {
            return 35;
        }
        if (messageAccessory instanceof SafetyPolicyNoticeMessageAccessory) {
            return 36;
        }
        if (messageAccessory instanceof SafetySystemNotificationMessageAccessory) {
            return 39;
        }
        if (messageAccessory instanceof PollMessageAccessory) {
            int i10 = WhenMappings.$EnumSwitchMapping$1[((PollMessageAccessory) messageAccessory).getData().getLayoutType().ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("UNKNOWN Layouts should not be presented");
            }
            if (i10 == 2) {
                return 37;
            }
            if (i10 == 3) {
                return 38;
            }
            throw new rn.n();
        }
        if (messageAccessory instanceof CtaButtonMessageAccessory) {
            return 41;
        }
        if (messageAccessory instanceof ForwardHeaderMessageAccessory) {
            return 43;
        }
        if (messageAccessory instanceof ForwardBreadcrumbMessageAccessory) {
            return 44;
        }
        if (messageAccessory instanceof GuildProfileInviteMessageAccessory) {
            return 53;
        }
        if (messageAccessory instanceof SharedCustomThemeMessageAccessory) {
            return 56;
        }
        if (messageAccessory instanceof VoiceChannelListInviteMessageAccessory) {
            return 59;
        }
        if (messageAccessory instanceof ImageAttachmentMessageAccessory) {
            throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
        }
        if (messageAccessory instanceof VideoAttachmentMessageAccessory) {
            throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
        }
        throw new rn.n();
    }

    public final void setComponentProvider(ComponentProvider botComponentProvider) {
        this.botComponentProvider = botComponentProvider;
    }

    public final void setEventHandler(@NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.eventHandler = eventHandler;
    }

    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: setItems-bo5iIEc, reason: not valid java name */
    public final void m540setItemsbo5iIEc(@NotNull String messageId, long channelId, GuildId guildId, @NotNull List<? extends MessageAccessory> items) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(items, "items");
        this.messageId = messageId;
        this.channelId = ChannelId.m1130boximpl(channelId);
        this.guildId = guildId;
        this.items = items;
        notifyDataSetChanged();
    }

    public final void setNestedAccessoriesRecycledViewPool(RecyclerView.RecycledViewPool recyclerViewPool) {
        this.recyclerViewPool = recyclerViewPool;
    }

    public /* synthetic */ MessageAccessoriesAdapter(Function0 function0, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? new com.discord.chat.presentation.list.f(5) : function0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final MessagePartViewHolder holder, int position) {
        Function4 function4;
        ChatEventHandler chatEventHandler;
        SpoilerConfig spoilerConfigConfigure;
        ChatEventHandler chatEventHandler2;
        SpoilerConfig spoilerConfigConfigure$default;
        ChatEventHandler chatEventHandler3;
        ChatEventHandler chatEventHandler4;
        ChatEventHandler chatEventHandler5;
        ChatEventHandler chatEventHandler6;
        SpoilerConfig spoilerConfigConfigure2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        ChatEventHandler chatEventHandler7 = this.eventHandler;
        if (chatEventHandler7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
            chatEventHandler7 = null;
        }
        final Function6 function6Mo527getOnMessageLongPressed = chatEventHandler7.getOnMessageLongPressed();
        if (function6Mo527getOnMessageLongPressed != null) {
            final int i7 = 0;
            function4 = new Function4() { // from class: com.discord.chat.presentation.message.h
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    switch (i7) {
                        case 0:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$4$lambda$3((Function6) function6Mo527getOnMessageLongPressed, this, (MediaType) obj, (Integer) obj2, (String) obj3, (Integer) obj4);
                        default:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$35((MessageComponentsAccessory) function6Mo527getOnMessageLongPressed, this, (View) obj, (String) obj2, (Integer) obj3, (Double) obj4);
                    }
                }
            };
        } else {
            function4 = null;
        }
        MessageAccessory messageAccessory = this.items.get(position);
        if (messageAccessory instanceof EmbedMessageAccessory) {
            EmbedViewHolder embedViewHolder = (EmbedViewHolder) holder;
            ChatEventHandler chatEventHandler8 = this.eventHandler;
            if (chatEventHandler8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler6 = null;
            } else {
                chatEventHandler6 = chatEventHandler8;
            }
            EmbedMessageAccessory embedMessageAccessory = (EmbedMessageAccessory) messageAccessory;
            int dimensionPixelSize = holder.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
            int radiusPx = embedMessageAccessory.getRadiusPx();
            View.OnLongClickListener onLongClick = embedMessageAccessory.getOnLongClick();
            SpoilerAttributes spoilerAttributes = embedMessageAccessory.getSpoilerAttributes();
            if (spoilerAttributes != null) {
                final int i10 = 0;
                spoilerConfigConfigure2 = spoilerAttributes.configure(new Function0(this) { // from class: com.discord.chat.presentation.message.f

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ MessageAccessoriesAdapter f4128e;

                    {
                        this.f4128e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$5(this.f4128e, holder);
                            case 1:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$32(this.f4128e, holder);
                            case 2:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$36(this.f4128e, holder);
                            case 3:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$40(this.f4128e, holder);
                            case 4:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$7(this.f4128e, holder);
                            default:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$16(this.f4128e, holder);
                        }
                    }
                }, new b7.a(6, this, embedMessageAccessory));
            } else {
                spoilerConfigConfigure2 = null;
            }
            final int i11 = 4;
            embedViewHolder.bind(chatEventHandler6, embedMessageAccessory, dimensionPixelSize, radiusPx, new Function0(this) { // from class: com.discord.chat.presentation.message.f

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4128e;

                {
                    this.f4128e = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$5(this.f4128e, holder);
                        case 1:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$32(this.f4128e, holder);
                        case 2:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$36(this.f4128e, holder);
                        case 3:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$40(this.f4128e, holder);
                        case 4:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$7(this.f4128e, holder);
                        default:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$16(this.f4128e, holder);
                    }
                }
            }, spoilerConfigConfigure2, new j(holder, embedMessageAccessory, this, 0), onLongClick, embedMessageAccessory.getPortal());
        } else if (messageAccessory instanceof InfoLinkMessageAccessory) {
            InfoLinkMessageAccessory infoLinkMessageAccessory = (InfoLinkMessageAccessory) messageAccessory;
            ((InfoLinkViewHolder) holder).bind(infoLinkMessageAccessory.getText(), infoLinkMessageAccessory.getIcon(), new c6.a(3, this, infoLinkMessageAccessory));
        } else if (messageAccessory instanceof ReferralMessageAccessory) {
            ((ReferralViewHolder) holder).bind((ReferralMessageAccessory) messageAccessory, new g(this, 2), new Function2<MessageId, LinkContentNode, Unit>() { // from class: com.discord.chat.presentation.message.MessageAccessoriesAdapter.onBindViewHolder.7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m559invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
                public final void m559invokentcYbpo(String messageId, LinkContentNode node) {
                    Intrinsics.checkNotNullParameter(messageId, "messageId");
                    Intrinsics.checkNotNullParameter(node, "node");
                    ChatEventHandler chatEventHandler9 = MessageAccessoriesAdapter.this.eventHandler;
                    if (chatEventHandler9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                        chatEventHandler9 = null;
                    }
                    chatEventHandler9.mo468onLinkClickedntcYbpo(messageId, node);
                }
            });
        } else if (messageAccessory instanceof ReferralRedesignMessageAccessory) {
            ((ReferralRedesignViewHolder) holder).bind((ReferralRedesignMessageAccessory) messageAccessory, new g(this, 3), new Function2<MessageId, LinkContentNode, Unit>() { // from class: com.discord.chat.presentation.message.MessageAccessoriesAdapter.onBindViewHolder.9
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m564invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
                public final void m564invokentcYbpo(String messageId, LinkContentNode node) {
                    Intrinsics.checkNotNullParameter(messageId, "messageId");
                    Intrinsics.checkNotNullParameter(node, "node");
                    ChatEventHandler chatEventHandler9 = MessageAccessoriesAdapter.this.eventHandler;
                    if (chatEventHandler9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                        chatEventHandler9 = null;
                    }
                    chatEventHandler9.mo468onLinkClickedntcYbpo(messageId, node);
                }
            });
        } else if (messageAccessory instanceof PremiumGroupInviteMessageAccessory) {
            ((PremiumGroupInviteViewHolder) holder).bind((PremiumGroupInviteMessageAccessory) messageAccessory, new Function2<MessageId, LinkContentNode, Unit>() { // from class: com.discord.chat.presentation.message.MessageAccessoriesAdapter.onBindViewHolder.10
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    m541invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
                public final void m541invokentcYbpo(String messageId, LinkContentNode node) {
                    Intrinsics.checkNotNullParameter(messageId, "messageId");
                    Intrinsics.checkNotNullParameter(node, "node");
                    ChatEventHandler chatEventHandler9 = MessageAccessoriesAdapter.this.eventHandler;
                    if (chatEventHandler9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                        chatEventHandler9 = null;
                    }
                    chatEventHandler9.mo468onLinkClickedntcYbpo(messageId, node);
                }
            });
        } else if (messageAccessory instanceof GiftIntentMessageAccessory) {
            GiftIntentViewHolder giftIntentViewHolder = (GiftIntentViewHolder) holder;
            GiftIntentMessageAccessory giftIntentMessageAccessory = (GiftIntentMessageAccessory) messageAccessory;
            ChatEventHandler chatEventHandler9 = this.eventHandler;
            if (chatEventHandler9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler9 = null;
            }
            AnonymousClass11 anonymousClass11 = new AnonymousClass11(chatEventHandler9);
            ChatEventHandler chatEventHandler10 = this.eventHandler;
            if (chatEventHandler10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler10 = null;
            }
            AnonymousClass12 anonymousClass12 = new AnonymousClass12(chatEventHandler10);
            ChatEventHandler chatEventHandler11 = this.eventHandler;
            if (chatEventHandler11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler5 = null;
            } else {
                chatEventHandler5 = chatEventHandler11;
            }
            giftIntentViewHolder.bind(giftIntentMessageAccessory, anonymousClass11, anonymousClass12, new AnonymousClass13(chatEventHandler5));
        } else if (messageAccessory instanceof GiftMessageAccessory) {
            GiftViewHolder giftViewHolder = (GiftViewHolder) holder;
            GiftMessageAccessory giftMessageAccessory = (GiftMessageAccessory) messageAccessory;
            ChatEventHandler chatEventHandler12 = this.eventHandler;
            if (chatEventHandler12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler4 = null;
            } else {
                chatEventHandler4 = chatEventHandler12;
            }
            giftViewHolder.bind(giftMessageAccessory, new AnonymousClass14(chatEventHandler4), new b7.a(9, this, giftMessageAccessory));
        } else if (messageAccessory instanceof MessageContentAccessory) {
            MessageContentViewHolder messageContentViewHolder = (MessageContentViewHolder) holder;
            MessageContentAccessory messageContentAccessory = (MessageContentAccessory) messageAccessory;
            ChatEventHandler chatEventHandler13 = this.eventHandler;
            if (chatEventHandler13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler13 = null;
            }
            AnonymousClass16 anonymousClass16 = new AnonymousClass16(chatEventHandler13);
            ChatEventHandler chatEventHandler14 = this.eventHandler;
            if (chatEventHandler14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler14 = null;
            }
            AnonymousClass17 anonymousClass17 = new AnonymousClass17(chatEventHandler14);
            ChatEventHandler chatEventHandler15 = this.eventHandler;
            if (chatEventHandler15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler15 = null;
            }
            AnonymousClass18 anonymousClass18 = new AnonymousClass18(chatEventHandler15);
            ChatEventHandler chatEventHandler16 = this.eventHandler;
            if (chatEventHandler16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler16 = null;
            }
            AnonymousClass19 anonymousClass19 = new AnonymousClass19(chatEventHandler16);
            ChatEventHandler chatEventHandler17 = this.eventHandler;
            if (chatEventHandler17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler17 = null;
            }
            AnonymousClass20 anonymousClass20 = new AnonymousClass20(chatEventHandler17);
            ChatEventHandler chatEventHandler18 = this.eventHandler;
            if (chatEventHandler18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler18 = null;
            }
            AnonymousClass21 anonymousClass21 = new AnonymousClass21(chatEventHandler18);
            ChatEventHandler chatEventHandler19 = this.eventHandler;
            if (chatEventHandler19 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler19 = null;
            }
            AnonymousClass22 anonymousClass22 = new AnonymousClass22(chatEventHandler19);
            Function1<? super MessagePartViewHolder, Unit> function1 = this.onTapSpoiler;
            ChatEventHandler chatEventHandler20 = this.eventHandler;
            if (chatEventHandler20 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler20 = null;
            }
            AnonymousClass23 anonymousClass23 = new AnonymousClass23(chatEventHandler20);
            ChatEventHandler chatEventHandler21 = this.eventHandler;
            if (chatEventHandler21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler21 = null;
            }
            AnonymousClass24 anonymousClass24 = new AnonymousClass24(chatEventHandler21);
            ChatEventHandler chatEventHandler22 = this.eventHandler;
            if (chatEventHandler22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler22 = null;
            }
            AnonymousClass25 anonymousClass25 = new AnonymousClass25(chatEventHandler22);
            ChatEventHandler chatEventHandler23 = this.eventHandler;
            if (chatEventHandler23 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler23 = null;
            }
            AnonymousClass26 anonymousClass26 = new AnonymousClass26(chatEventHandler23);
            ChatEventHandler chatEventHandler24 = this.eventHandler;
            if (chatEventHandler24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler24 = null;
            }
            AnonymousClass27 anonymousClass27 = new AnonymousClass27(chatEventHandler24);
            ChatEventHandler chatEventHandler25 = this.eventHandler;
            if (chatEventHandler25 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler25 = null;
            }
            AnonymousClass28 anonymousClass28 = new AnonymousClass28(chatEventHandler25);
            ChatEventHandler chatEventHandler26 = this.eventHandler;
            if (chatEventHandler26 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler26 = null;
            }
            AnonymousClass29 anonymousClass29 = new AnonymousClass29(chatEventHandler26);
            ChatEventHandler chatEventHandler27 = this.eventHandler;
            if (chatEventHandler27 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler27 = null;
            }
            messageContentViewHolder.bind(messageContentAccessory, anonymousClass16, anonymousClass17, anonymousClass18, anonymousClass19, anonymousClass20, anonymousClass21, anonymousClass22, anonymousClass23, anonymousClass24, anonymousClass25, function1, anonymousClass26, anonymousClass27, anonymousClass28, anonymousClass29, new AnonymousClass30(chatEventHandler27));
        } else if (messageAccessory instanceof MediaMosaicAttachmentMessageAccessory) {
            AttachmentMediaMosaicViewHolder attachmentMediaMosaicViewHolder = (AttachmentMediaMosaicViewHolder) holder;
            MediaMosaicAttachmentMessageAccessory mediaMosaicAttachmentMessageAccessory = (MediaMosaicAttachmentMessageAccessory) messageAccessory;
            MessageMargins margins = mediaMosaicAttachmentMessageAccessory.getMargins();
            ChatEventHandler chatEventHandler28 = this.eventHandler;
            if (chatEventHandler28 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler3 = null;
            } else {
                chatEventHandler3 = chatEventHandler28;
            }
            List<MessageAttachmentAccessory> attachments = mediaMosaicAttachmentMessageAccessory.getAttachments();
            ar.j jVar = new ar.j(1, this);
            co.s sVar = function4 != null ? new co.s(5, function4) : null;
            final int i12 = 5;
            attachmentMediaMosaicViewHolder.bind(margins, chatEventHandler3, attachments, jVar, sVar, new Function0(this) { // from class: com.discord.chat.presentation.message.f

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4128e;

                {
                    this.f4128e = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$5(this.f4128e, holder);
                        case 1:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$32(this.f4128e, holder);
                        case 2:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$36(this.f4128e, holder);
                        case 3:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$40(this.f4128e, holder);
                        case 4:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$7(this.f4128e, holder);
                        default:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$16(this.f4128e, holder);
                    }
                }
            }, new b7.a(10, this, mediaMosaicAttachmentMessageAccessory), mediaMosaicAttachmentMessageAccessory.isForwardedContent(), mediaMosaicAttachmentMessageAccessory.getShouldAutoPlayGif(), mediaMosaicAttachmentMessageAccessory.getConstrainedWidth());
        } else if (messageAccessory instanceof ReactionsMessageAccessory) {
            ReactionsMessageAccessory reactionsMessageAccessory = (ReactionsMessageAccessory) messageAccessory;
            final int i13 = 5;
            ((ReactionsViewHolder) holder).bind(reactionsMessageAccessory.getReactions(), reactionsMessageAccessory.getCanAddNewReactions(), reactionsMessageAccessory.getAddNewReactionAccessibilityLabel(), reactionsMessageAccessory.getReactionsTheme(), new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.e

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4126e;

                {
                    this.f4126e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$23(this.f4126e, view);
                            break;
                        case 1:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$24(this.f4126e, view);
                            break;
                        case 2:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$25(this.f4126e, view);
                            break;
                        case 3:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$26(this.f4126e, view);
                            break;
                        case 4:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$30(this.f4126e, view);
                            break;
                        default:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$18(this.f4126e, view);
                            break;
                    }
                }
            }, new g(this, 6), new g(this, 7), reactionsMessageAccessory.getTheme(), reactionsMessageAccessory.getShowReactLabel());
        } else if (messageAccessory instanceof StickerMessageAccessory) {
            final StickerMessageAccessory stickerMessageAccessory = (StickerMessageAccessory) messageAccessory;
            Sticker sticker = stickerMessageAccessory.getSticker();
            final int i14 = 0;
            Function1<? super Sticker, Unit> function2 = new Function1(this) { // from class: com.discord.chat.presentation.message.k

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4143e;

                {
                    this.f4143e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$21(this.f4143e, stickerMessageAccessory, (Sticker) obj);
                        default:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$22(this.f4143e, stickerMessageAccessory, (Sticker) obj);
                    }
                }
            };
            final int i15 = 1;
            ((StickerPartViewHolder) holder).bind(sticker, function2, new Function1(this) { // from class: com.discord.chat.presentation.message.k

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4143e;

                {
                    this.f4143e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$21(this.f4143e, stickerMessageAccessory, (Sticker) obj);
                        default:
                            return MessageAccessoriesAdapter.onBindViewHolder$lambda$22(this.f4143e, stickerMessageAccessory, (Sticker) obj);
                    }
                }
            }, 160, 160);
        } else if (messageAccessory instanceof GuildInviteMessageAccessory) {
            ((GuildInviteViewHolder) holder).bind((GuildInviteMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof AppMessageEmbedAccessory) {
            ((AppMessageEmbedViewHolder) holder).bind((AppMessageEmbedAccessory) messageAccessory);
        } else if (messageAccessory instanceof ActivityInstanceEmbedMessageAccessory) {
            ((ActivityInstanceEmbedViewHolder) holder).bind((ActivityInstanceEmbedMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof EmbeddedActivityInviteMessageAccessory) {
            ((EmbeddedActivityInviteViewHolder) holder).bind((EmbeddedActivityInviteMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof GuildProfileInviteMessageAccessory) {
            GuildProfileInviteViewHolder guildProfileInviteViewHolder = (GuildProfileInviteViewHolder) holder;
            GuildProfileInviteMessageAccessory guildProfileInviteMessageAccessory = (GuildProfileInviteMessageAccessory) messageAccessory;
            ChatEventHandler chatEventHandler29 = this.eventHandler;
            if (chatEventHandler29 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler29 = null;
            }
            guildProfileInviteViewHolder.bind(guildProfileInviteMessageAccessory, chatEventHandler29);
        } else if (messageAccessory instanceof GuildInviteDisabledMessageAccessory) {
            ((GuildInviteDisabledViewHolder) holder).bind((GuildInviteDisabledMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof GuildEventInviteMessageAccessory) {
            ((GuildEventInviteViewHolder) holder).bind((GuildEventInviteMessageAccessory) messageAccessory);
        } else if (messageAccessory instanceof ThreadEmbedMessageAccessory) {
            ThreadEmbedViewHolder threadEmbedViewHolder = (ThreadEmbedViewHolder) holder;
            ThreadEmbedMessageAccessory threadEmbedMessageAccessory = (ThreadEmbedMessageAccessory) messageAccessory;
            ChatEventHandler chatEventHandler30 = this.eventHandler;
            if (chatEventHandler30 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler30 = null;
            }
            threadEmbedViewHolder.bind(threadEmbedMessageAccessory, new AnonymousClass40(chatEventHandler30));
        } else if (messageAccessory instanceof ForumPostActionBar) {
            ForumPostActionBarViewHolder forumPostActionBarViewHolder = (ForumPostActionBarViewHolder) holder;
            ForumPostActionBar forumPostActionBar = (ForumPostActionBar) messageAccessory;
            ReactionsTheme reactionsTheme = forumPostActionBar.getReactionsTheme();
            final int i16 = 0;
            View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.e

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4126e;

                {
                    this.f4126e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$23(this.f4126e, view);
                            break;
                        case 1:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$24(this.f4126e, view);
                            break;
                        case 2:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$25(this.f4126e, view);
                            break;
                        case 3:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$26(this.f4126e, view);
                            break;
                        case 4:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$30(this.f4126e, view);
                            break;
                        default:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$18(this.f4126e, view);
                            break;
                    }
                }
            };
            final int i17 = 1;
            View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.e

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4126e;

                {
                    this.f4126e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$23(this.f4126e, view);
                            break;
                        case 1:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$24(this.f4126e, view);
                            break;
                        case 2:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$25(this.f4126e, view);
                            break;
                        case 3:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$26(this.f4126e, view);
                            break;
                        case 4:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$30(this.f4126e, view);
                            break;
                        default:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$18(this.f4126e, view);
                            break;
                    }
                }
            };
            final int i18 = 2;
            View.OnClickListener onClickListener3 = new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.e

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4126e;

                {
                    this.f4126e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$23(this.f4126e, view);
                            break;
                        case 1:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$24(this.f4126e, view);
                            break;
                        case 2:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$25(this.f4126e, view);
                            break;
                        case 3:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$26(this.f4126e, view);
                            break;
                        case 4:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$30(this.f4126e, view);
                            break;
                        default:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$18(this.f4126e, view);
                            break;
                    }
                }
            };
            final int i19 = 3;
            View.OnClickListener onClickListener4 = new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.e

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4126e;

                {
                    this.f4126e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$23(this.f4126e, view);
                            break;
                        case 1:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$24(this.f4126e, view);
                            break;
                        case 2:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$25(this.f4126e, view);
                            break;
                        case 3:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$26(this.f4126e, view);
                            break;
                        case 4:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$30(this.f4126e, view);
                            break;
                        default:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$18(this.f4126e, view);
                            break;
                    }
                }
            };
            g gVar = new g(this, 0);
            g gVar2 = new g(this, 1);
            final int i20 = 4;
            View.OnClickListener onClickListener5 = new View.OnClickListener(this) { // from class: com.discord.chat.presentation.message.e

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ MessageAccessoriesAdapter f4126e;

                {
                    this.f4126e = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i20) {
                        case 0:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$23(this.f4126e, view);
                            break;
                        case 1:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$24(this.f4126e, view);
                            break;
                        case 2:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$25(this.f4126e, view);
                            break;
                        case 3:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$26(this.f4126e, view);
                            break;
                        case 4:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$30(this.f4126e, view);
                            break;
                        default:
                            MessageAccessoriesAdapter.onBindViewHolder$lambda$18(this.f4126e, view);
                            break;
                    }
                }
            };
            ChatEventHandler chatEventHandler31 = this.eventHandler;
            if (chatEventHandler31 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                chatEventHandler31 = null;
            }
            forumPostActionBarViewHolder.bind(forumPostActionBar, reactionsTheme, onClickListener, onClickListener2, onClickListener3, onClickListener4, gVar, gVar2, onClickListener5, new AnonymousClass48(chatEventHandler31));
        } else if (messageAccessory instanceof FileAttachmentMessageAccessory) {
            FileAttachmentViewHolder fileAttachmentViewHolder = (FileAttachmentViewHolder) holder;
            FileAttachmentMessageAccessory fileAttachmentMessageAccessory = (FileAttachmentMessageAccessory) messageAccessory;
            com.discord.chat.input.views.a aVar = new com.discord.chat.input.views.a(1, this);
            SpoilerAttributes spoilerAttributes2 = fileAttachmentMessageAccessory.getSpoilerAttributes();
            if (spoilerAttributes2 != null) {
                final int i21 = 1;
                spoilerConfigConfigure$default = SpoilerAttributes.configure$default(spoilerAttributes2, new Function0(this) { // from class: com.discord.chat.presentation.message.f

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ MessageAccessoriesAdapter f4128e;

                    {
                        this.f4128e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i21) {
                            case 0:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$5(this.f4128e, holder);
                            case 1:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$32(this.f4128e, holder);
                            case 2:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$36(this.f4128e, holder);
                            case 3:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$40(this.f4128e, holder);
                            case 4:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$7(this.f4128e, holder);
                            default:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$16(this.f4128e, holder);
                        }
                    }
                }, null, 2, null);
            } else {
                spoilerConfigConfigure$default = null;
            }
            fileAttachmentViewHolder.bind(fileAttachmentMessageAccessory, aVar, spoilerConfigConfigure$default);
        } else {
            ChatEventHandler chatEventHandler32 = null;
            if (messageAccessory instanceof MessageComponentsAccessory) {
                MessageComponentsViewHolder messageComponentsViewHolder = (MessageComponentsViewHolder) holder;
                final MessageComponentsAccessory messageComponentsAccessory = (MessageComponentsAccessory) messageAccessory;
                ComponentProvider componentProvider = this.botComponentProvider;
                ChatEventHandler chatEventHandler33 = this.eventHandler;
                if (chatEventHandler33 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler2 = null;
                } else {
                    chatEventHandler2 = chatEventHandler33;
                }
                com.discord.chat.input.views.a aVar2 = function4 != null ? new com.discord.chat.input.views.a(2, function4) : null;
                final int i22 = 1;
                Function4 function5 = new Function4() { // from class: com.discord.chat.presentation.message.h
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        switch (i22) {
                            case 0:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$4$lambda$3((Function6) messageComponentsAccessory, this, (MediaType) obj, (Integer) obj2, (String) obj3, (Integer) obj4);
                            default:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$35((MessageComponentsAccessory) messageComponentsAccessory, this, (View) obj, (String) obj2, (Integer) obj3, (Double) obj4);
                        }
                    }
                };
                final int i23 = 2;
                messageComponentsViewHolder.bind(messageComponentsAccessory, componentProvider, function5, aVar2, new Function0(this) { // from class: com.discord.chat.presentation.message.f

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ MessageAccessoriesAdapter f4128e;

                    {
                        this.f4128e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i23) {
                            case 0:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$5(this.f4128e, holder);
                            case 1:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$32(this.f4128e, holder);
                            case 2:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$36(this.f4128e, holder);
                            case 3:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$40(this.f4128e, holder);
                            case 4:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$7(this.f4128e, holder);
                            default:
                                return MessageAccessoriesAdapter.onBindViewHolder$lambda$16(this.f4128e, holder);
                        }
                    }
                }, new b7.a(7, this, messageComponentsAccessory), chatEventHandler2);
            } else if (messageAccessory instanceof FlaggedMessageEmbedAccessory) {
                ((FlaggedMessageEmbedViewHolder) holder).bind((FlaggedMessageEmbedAccessory) messageAccessory);
            } else if (messageAccessory instanceof FlaggedMessageActionBarAccessory) {
                FlaggedMessageActionBarViewHolder flaggedMessageActionBarViewHolder = (FlaggedMessageActionBarViewHolder) holder;
                FlaggedMessageActionBarAccessory flaggedMessageActionBarAccessory = (FlaggedMessageActionBarAccessory) messageAccessory;
                ChatEventHandler chatEventHandler34 = this.eventHandler;
                if (chatEventHandler34 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler34 = null;
                }
                AnonymousClass55 anonymousClass55 = new AnonymousClass55(chatEventHandler34);
                ChatEventHandler chatEventHandler35 = this.eventHandler;
                if (chatEventHandler35 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler35 = null;
                }
                flaggedMessageActionBarViewHolder.bind(flaggedMessageActionBarAccessory, anonymousClass55, new AnonymousClass56(chatEventHandler35));
            } else if (messageAccessory instanceof AutoModerationNotificationEmbedAccessory) {
                AutoModerationNotificationEmbedViewHolder autoModerationNotificationEmbedViewHolder = (AutoModerationNotificationEmbedViewHolder) holder;
                AutoModerationNotificationEmbedAccessory autoModerationNotificationEmbedAccessory = (AutoModerationNotificationEmbedAccessory) messageAccessory;
                ChatEventHandler chatEventHandler36 = this.eventHandler;
                if (chatEventHandler36 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler36 = null;
                }
                AnonymousClass57 anonymousClass57 = new AnonymousClass57(chatEventHandler36);
                ChatEventHandler chatEventHandler37 = this.eventHandler;
                if (chatEventHandler37 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler37 = null;
                }
                autoModerationNotificationEmbedViewHolder.bind(autoModerationNotificationEmbedAccessory, anonymousClass57, new AnonymousClass58(chatEventHandler37));
            } else if (messageAccessory instanceof TimestampMessageAccessory) {
                ((TimestampViewHolder) holder).bind((TimestampMessageAccessory) messageAccessory);
            } else if (messageAccessory instanceof WelcomeStickerAccessory) {
                ((WelcomeStickerViewHolder) holder).bind((WelcomeStickerAccessory) messageAccessory);
            } else if (messageAccessory instanceof ActivityRichPresenceInviteEmbedMessageAccessory) {
                ActivityRichPresenceInviteEmbedViewHolder activityRichPresenceInviteEmbedViewHolder = (ActivityRichPresenceInviteEmbedViewHolder) holder;
                ActivityRichPresenceInviteEmbedMessageAccessory activityRichPresenceInviteEmbedMessageAccessory = (ActivityRichPresenceInviteEmbedMessageAccessory) messageAccessory;
                ChatEventHandler chatEventHandler38 = this.eventHandler;
                if (chatEventHandler38 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler38 = null;
                }
                activityRichPresenceInviteEmbedViewHolder.bind(activityRichPresenceInviteEmbedMessageAccessory, new AnonymousClass59(chatEventHandler38));
            } else if (messageAccessory instanceof EphemeralIndicationMessageAccessory) {
                ((EphemeralIndicationViewHolder) holder).bind((EphemeralIndicationMessageAccessory) messageAccessory);
            } else if (messageAccessory instanceof SurveyIndicationMessageAccessory) {
                ((SurveyIndicationViewHolder) holder).bind((SurveyIndicationMessageAccessory) messageAccessory);
            } else if (messageAccessory instanceof InteractionStatusMessageAccessory) {
                ((InteractionStatusViewHolder) holder).bind((InteractionStatusMessageAccessory) messageAccessory);
            } else if (messageAccessory instanceof RoleSubscriptionPurchaseAccessory) {
                RoleSubscriptionPurchaseAccessory roleSubscriptionPurchaseAccessory = (RoleSubscriptionPurchaseAccessory) messageAccessory;
                ((RoleSubscriptionPurchaseViewHolder) holder).bind(roleSubscriptionPurchaseAccessory, MessageMargins.INSTANCE.getWidth(roleSubscriptionPurchaseAccessory.getMargins(), roleSubscriptionPurchaseAccessory.getConstrainedWidth(), roleSubscriptionPurchaseAccessory.isForwardedContent()));
            } else if (messageAccessory instanceof InviteToSpeakAccessory) {
                ((InviteToSpeakViewHolder) holder).bind((InviteToSpeakAccessory) messageAccessory);
            } else if (messageAccessory instanceof AudioAttachmentMessageAccessory) {
                AudioPlayerViewHolder audioPlayerViewHolder = (AudioPlayerViewHolder) holder;
                AudioAttachmentMessageAccessory audioAttachmentMessageAccessory = (AudioAttachmentMessageAccessory) messageAccessory;
                ChatEventHandler chatEventHandler39 = this.eventHandler;
                if (chatEventHandler39 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler39 = null;
                }
                audioPlayerViewHolder.bind(audioAttachmentMessageAccessory, chatEventHandler39, function4 != null ? new i(0, function4, audioAttachmentMessageAccessory) : null);
            } else if (messageAccessory instanceof PostPreviewEmbedMessageAccessory) {
                PostPreviewEmbedViewHolder postPreviewEmbedViewHolder = (PostPreviewEmbedViewHolder) holder;
                PostPreviewEmbedMessageAccessory postPreviewEmbedMessageAccessory = (PostPreviewEmbedMessageAccessory) messageAccessory;
                PostPreviewEmbed postPreviewEmbed = postPreviewEmbedMessageAccessory.getPostPreviewEmbed();
                ChatEventHandler chatEventHandler40 = this.eventHandler;
                if (chatEventHandler40 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler40 = null;
                }
                AnonymousClass61 anonymousClass61 = new AnonymousClass61(chatEventHandler40);
                SpoilerAttributes spoilerAttributes3 = postPreviewEmbedMessageAccessory.getSpoilerAttributes();
                if (spoilerAttributes3 != null) {
                    final int i24 = 3;
                    spoilerConfigConfigure = spoilerAttributes3.configure(new Function0(this) { // from class: com.discord.chat.presentation.message.f

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ MessageAccessoriesAdapter f4128e;

                        {
                            this.f4128e = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i24) {
                                case 0:
                                    return MessageAccessoriesAdapter.onBindViewHolder$lambda$5(this.f4128e, holder);
                                case 1:
                                    return MessageAccessoriesAdapter.onBindViewHolder$lambda$32(this.f4128e, holder);
                                case 2:
                                    return MessageAccessoriesAdapter.onBindViewHolder$lambda$36(this.f4128e, holder);
                                case 3:
                                    return MessageAccessoriesAdapter.onBindViewHolder$lambda$40(this.f4128e, holder);
                                case 4:
                                    return MessageAccessoriesAdapter.onBindViewHolder$lambda$7(this.f4128e, holder);
                                default:
                                    return MessageAccessoriesAdapter.onBindViewHolder$lambda$16(this.f4128e, holder);
                            }
                        }
                    }, new b7.a(8, this, postPreviewEmbedMessageAccessory));
                } else {
                    spoilerConfigConfigure = null;
                }
                postPreviewEmbedViewHolder.bind(postPreviewEmbed, anonymousClass61, spoilerConfigConfigure);
            } else if (messageAccessory instanceof ChannelPromptActionsAccessory) {
                ChannelPromptActionsViewHolder channelPromptActionsViewHolder = (ChannelPromptActionsViewHolder) holder;
                ChannelPromptActionsAccessory channelPromptActionsAccessory = (ChannelPromptActionsAccessory) messageAccessory;
                ChatEventHandler chatEventHandler41 = this.eventHandler;
                if (chatEventHandler41 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler41 = null;
                }
                channelPromptActionsViewHolder.bind(channelPromptActionsAccessory, new AnonymousClass64(chatEventHandler41));
            } else if (messageAccessory instanceof SafetyPolicyNoticeMessageAccessory) {
                SafetyPolicyNoticeViewHolder safetyPolicyNoticeViewHolder = (SafetyPolicyNoticeViewHolder) holder;
                SafetyPolicyNoticeMessageAccessory safetyPolicyNoticeMessageAccessory = (SafetyPolicyNoticeMessageAccessory) messageAccessory;
                ChatEventHandler chatEventHandler42 = this.eventHandler;
                if (chatEventHandler42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler42 = null;
                }
                safetyPolicyNoticeViewHolder.bind(safetyPolicyNoticeMessageAccessory, new AnonymousClass65(chatEventHandler42));
            } else if (messageAccessory instanceof SafetySystemNotificationMessageAccessory) {
                SafetySystemNotificationViewHolder safetySystemNotificationViewHolder = (SafetySystemNotificationViewHolder) holder;
                SafetySystemNotificationEmbed safetySystemNotificationEmbed = ((SafetySystemNotificationMessageAccessory) messageAccessory).getSafetySystemNotificationEmbed();
                ChatEventHandler chatEventHandler43 = this.eventHandler;
                if (chatEventHandler43 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler43 = null;
                }
                safetySystemNotificationViewHolder.bind(safetySystemNotificationEmbed, new AnonymousClass66(chatEventHandler43));
            } else if (messageAccessory instanceof PollMessageAccessory) {
                PollViewHolder pollViewHolder = (PollViewHolder) holder;
                PollMessageAccessory pollMessageAccessory = (PollMessageAccessory) messageAccessory;
                ChatEventHandler chatEventHandler44 = this.eventHandler;
                if (chatEventHandler44 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler44 = null;
                }
                AnonymousClass67 anonymousClass67 = new AnonymousClass67(chatEventHandler44);
                ChatEventHandler chatEventHandler45 = this.eventHandler;
                if (chatEventHandler45 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler45 = null;
                }
                AnonymousClass68 anonymousClass68 = new AnonymousClass68(chatEventHandler45);
                ChatEventHandler chatEventHandler46 = this.eventHandler;
                if (chatEventHandler46 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler32 = chatEventHandler46;
                }
                pollViewHolder.bind(pollMessageAccessory, anonymousClass67, anonymousClass68, new AnonymousClass69(chatEventHandler32));
            } else if (messageAccessory instanceof SharedCustomThemeMessageAccessory) {
                SharedCustomThemeViewHolder sharedCustomThemeViewHolder = (SharedCustomThemeViewHolder) holder;
                SharedCustomThemeMessageAccessory sharedCustomThemeMessageAccessory = (SharedCustomThemeMessageAccessory) messageAccessory;
                ChatEventHandler chatEventHandler47 = this.eventHandler;
                if (chatEventHandler47 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler47 = null;
                }
                AnonymousClass70 anonymousClass70 = new AnonymousClass70(chatEventHandler47);
                ChatEventHandler chatEventHandler48 = this.eventHandler;
                if (chatEventHandler48 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler48 = null;
                }
                sharedCustomThemeViewHolder.bind(sharedCustomThemeMessageAccessory, anonymousClass70, new AnonymousClass71(chatEventHandler48));
            } else if (messageAccessory instanceof CtaButtonMessageAccessory) {
                CtaButtonViewHolder ctaButtonViewHolder = (CtaButtonViewHolder) holder;
                CtaButtonMessageAccessory ctaButtonMessageAccessory = (CtaButtonMessageAccessory) messageAccessory;
                long jM596getChannelIdo4g7jtM = ctaButtonMessageAccessory.m596getChannelIdo4g7jtM();
                String strMo575getMessageId3Eiw7ao = ctaButtonMessageAccessory.getMessageId();
                CtaButton ctaButton = ctaButtonMessageAccessory.getCtaButton();
                CtaButton secondaryCtaButton = ctaButtonMessageAccessory.getSecondaryCtaButton();
                ChatEventHandler chatEventHandler49 = this.eventHandler;
                if (chatEventHandler49 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler = null;
                } else {
                    chatEventHandler = chatEventHandler49;
                }
                ctaButtonViewHolder.m768binduHwPWNE(jM596getChannelIdo4g7jtM, strMo575getMessageId3Eiw7ao, ctaButton, secondaryCtaButton, new AnonymousClass72(chatEventHandler));
            } else if (messageAccessory instanceof ForwardHeaderMessageAccessory) {
                ((ForwardHeaderViewHolder) holder).bind();
            } else if (messageAccessory instanceof ForwardBreadcrumbMessageAccessory) {
                ForwardBreadcrumbViewHolder forwardBreadcrumbViewHolder = (ForwardBreadcrumbViewHolder) holder;
                ForwardBreadcrumbMessageAccessory forwardBreadcrumbMessageAccessory = (ForwardBreadcrumbMessageAccessory) messageAccessory;
                ChatEventHandler chatEventHandler50 = this.eventHandler;
                if (chatEventHandler50 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler50 = null;
                }
                forwardBreadcrumbViewHolder.bind(forwardBreadcrumbMessageAccessory, new AnonymousClass73(chatEventHandler50));
            } else {
                if (!(messageAccessory instanceof VoiceChannelListInviteMessageAccessory)) {
                    if (messageAccessory instanceof ImageAttachmentMessageAccessory) {
                        throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
                    }
                    if (!(messageAccessory instanceof VideoAttachmentMessageAccessory)) {
                        throw new rn.n();
                    }
                    throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
                }
                VoiceChannelListInviteViewHolder voiceChannelListInviteViewHolder = (VoiceChannelListInviteViewHolder) holder;
                VoiceChannelListInviteMessageAccessory voiceChannelListInviteMessageAccessory = (VoiceChannelListInviteMessageAccessory) messageAccessory;
                ChatEventHandler chatEventHandler51 = this.eventHandler;
                if (chatEventHandler51 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                    chatEventHandler51 = null;
                }
                voiceChannelListInviteViewHolder.bind(voiceChannelListInviteMessageAccessory, chatEventHandler51, this.measureAndLayout);
            }
        }
        ForceExhaustiveKt.forceExhaustive(Unit.f14616a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.util.AttributeSet, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.discord.chat.presentation.events.ChatEventHandler] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public MessagePartViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i7 = 2;
        ?? r5 = 0;
        ChatEventHandler chatEventHandler = null;
        ChatEventHandler chatEventHandler2 = null;
        ChatEventHandler chatEventHandler3 = null;
        ChatEventHandler chatEventHandler4 = null;
        ChatEventHandler chatEventHandler5 = null;
        ChatEventHandler chatEventHandler6 = null;
        ChatEventHandler chatEventHandler7 = null;
        ChatEventHandler chatEventHandler8 = null;
        ChatEventHandler chatEventHandler9 = null;
        ChatEventHandler chatEventHandler10 = null;
        ChatEventHandler chatEventHandler11 = null;
        ChatEventHandler chatEventHandler12 = null;
        switch (viewType) {
            case 0:
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                return new MessageContentViewHolder(new MessageContentView(context, null, 0, 6, null));
            case 1:
                Context context2 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                return new EmbedViewHolder(new EmbedView(context2, r5, i7, r5));
            case 2:
            case 3:
            case 10:
            case 17:
            case 30:
            case 42:
            case ChatViewRecyclerTypes.REACTION_BURST_REACTION /* 45 */:
            case 46:
            case ChatViewRecyclerTypes.REACTION_ADD_REACTION /* 47 */:
            case 48:
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_VISUAL_PLACEHOLDER /* 51 */:
            default:
                throw new IllegalArgumentException(kk.b.h(viewType, "Unknown view type: "));
            case 4:
                Context context3 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                return new ReactionsViewHolder(new ShortcutsFlexbox(context3, r5, i7, r5));
            case 5:
                Context context4 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                GuildInviteView guildInviteView = new GuildInviteView(context4, null, 0, 6, null);
                ChatEventHandler chatEventHandler13 = this.eventHandler;
                if (chatEventHandler13 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    r5 = chatEventHandler13;
                }
                return new GuildInviteViewHolder(guildInviteView, r5);
            case 6:
                Context context5 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                return new StickerPngViewHolder(new StickerView(context5, null, 0, 6, null));
            case 7:
                Context context6 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
                return new StickerApngViewHolder(new StickerView(context6, null, 0, 6, null));
            case 8:
                Context context7 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                return new StickerLottieViewHolder(new StickerView(context7, null, 0, 6, null));
            case 9:
                Context context8 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context8, "getContext(...)");
                return new ThreadEmbedViewHolder(new ThreadEmbedView(context8, null, 0, 6, null));
            case 11:
                Context context9 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context9, "getContext(...)");
                FileAttachmentView fileAttachmentView = new FileAttachmentView(context9, r5, i7, r5);
                ChatEventHandler chatEventHandler14 = this.eventHandler;
                if (chatEventHandler14 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler12 = chatEventHandler14;
                }
                return new FileAttachmentViewHolder(fileAttachmentView, chatEventHandler12);
            case 12:
                Context context10 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context10, "getContext(...)");
                return new MessageComponentsViewHolder(new MessageComponentsView(context10, null, 0, 6, null));
            case 13:
                TextView root = TimestampViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false).getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                return new TimestampViewHolder(root);
            case 14:
                Context context11 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                WelcomeStickerView welcomeStickerView = new WelcomeStickerView(context11, r5, i7, r5);
                ChatEventHandler chatEventHandler15 = this.eventHandler;
                if (chatEventHandler15 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler11 = chatEventHandler15;
                }
                return new WelcomeStickerViewHolder(welcomeStickerView, new AnonymousClass2(chatEventHandler11));
            case 15:
                Context context12 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context12, "getContext(...)");
                GuildEventInviteView guildEventInviteView = new GuildEventInviteView(context12, null, 0, 6, null);
                ChatEventHandler chatEventHandler16 = this.eventHandler;
                if (chatEventHandler16 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler10 = chatEventHandler16;
                }
                return new GuildEventInviteViewHolder(guildEventInviteView, chatEventHandler10, new g(this, 4));
            case 16:
                Context context13 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context13, "getContext(...)");
                return new GiftViewHolder(new GiftView(context13, r5, i7, r5));
            case 18:
                Context context14 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context14, "getContext(...)");
                EphemeralIndicationView ephemeralIndicationView = new EphemeralIndicationView(context14, null, 0, 6, null);
                ChatEventHandler chatEventHandler17 = this.eventHandler;
                if (chatEventHandler17 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler9 = chatEventHandler17;
                }
                return new EphemeralIndicationViewHolder(ephemeralIndicationView, chatEventHandler9);
            case 19:
                Context context15 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context15, "getContext(...)");
                return new InteractionStatusViewHolder(new InteractionStatusView(context15, r5, i7, r5));
            case 20:
                Context context16 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context16, "getContext(...)");
                return new ForumPostActionBarViewHolder(new ForumPostActionBarView(context16, null, 0, 6, null));
            case 21:
                Context context17 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context17, "getContext(...)");
                FlaggedMessageEmbedView flaggedMessageEmbedView = new FlaggedMessageEmbedView(context17, r5, i7, r5);
                ChatEventHandler chatEventHandler18 = this.eventHandler;
                if (chatEventHandler18 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler8 = chatEventHandler18;
                }
                return new FlaggedMessageEmbedViewHolder(flaggedMessageEmbedView, chatEventHandler8);
            case 22:
                Context context18 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context18, "getContext(...)");
                return new FlaggedMessageActionBarViewHolder(new FlaggedMessageActionBarView(context18, null, 0, 6, null));
            case 23:
                Context context19 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context19, "getContext(...)");
                return new RoleSubscriptionPurchaseViewHolder(new RoleSubscriptionPurchaseView(context19, null, 0, 6, null));
            case 24:
                Context context20 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context20, "getContext(...)");
                SurveyIndicationView surveyIndicationView = new SurveyIndicationView(context20, null, 0, 6, null);
                ChatEventHandler chatEventHandler19 = this.eventHandler;
                if (chatEventHandler19 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler7 = chatEventHandler19;
                }
                return new SurveyIndicationViewHolder(surveyIndicationView, chatEventHandler7);
            case 25:
                Context context21 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context21, "getContext(...)");
                GuildInviteDisabledView guildInviteDisabledView = new GuildInviteDisabledView(context21, null, 0, 6, null);
                ChatEventHandler chatEventHandler20 = this.eventHandler;
                if (chatEventHandler20 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler6 = chatEventHandler20;
                }
                return new GuildInviteDisabledViewHolder(guildInviteDisabledView, chatEventHandler6);
            case 26:
                Context context22 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context22, "getContext(...)");
                return new AttachmentMediaMosaicViewHolder(new AttachmentMediaMosaicContainerView(context22, r5, i7, r5));
            case 27:
                Context context23 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context23, "getContext(...)");
                return new StickerGifViewHolder(new StickerView(context23, null, 0, 6, null));
            case 28:
                Context context24 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context24, "getContext(...)");
                InviteToSpeakView inviteToSpeakView = new InviteToSpeakView(context24, r5, i7, r5);
                ChatEventHandler chatEventHandler21 = this.eventHandler;
                if (chatEventHandler21 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler5 = chatEventHandler21;
                }
                return new InviteToSpeakViewHolder(inviteToSpeakView, new AnonymousClass3(chatEventHandler5));
            case 29:
                Context context25 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context25, "getContext(...)");
                return new AudioPlayerViewHolder(new AudioPlayerView(context25, null, 0, 6, null));
            case 31:
                Context context26 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context26, "getContext(...)");
                EmbeddedActivityInviteView embeddedActivityInviteView = new EmbeddedActivityInviteView(context26, null, 0, 6, null);
                ChatEventHandler chatEventHandler22 = this.eventHandler;
                if (chatEventHandler22 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler4 = chatEventHandler22;
                }
                return new EmbeddedActivityInviteViewHolder(embeddedActivityInviteView, chatEventHandler4);
            case 32:
                Context context27 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context27, "getContext(...)");
                return new PostPreviewEmbedViewHolder(new PostPreviewEmbedView(context27, null, 0, 6, null));
            case 33:
                Context context28 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context28, "getContext(...)");
                return new AutoModerationNotificationEmbedViewHolder(new AutoModerationNotificationEmbedView(context28, r5, i7, r5));
            case 34:
                Context context29 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context29, "getContext(...)");
                return new ChannelPromptActionsViewHolder(new ChannelPromptActionsView(context29, r5, i7, r5));
            case 35:
                Context context30 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context30, "getContext(...)");
                return new InfoLinkViewHolder(new InfoLinkView(context30, r5, i7, r5));
            case 36:
                Context context31 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context31, "getContext(...)");
                return new SafetyPolicyNoticeViewHolder(new SafetyPolicyNoticeView(context31, r5, i7, r5));
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                Context context32 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context32, "getContext(...)");
                return new PollViewHolder(new PollTextAndImageView(context32, null, 0, 6, null));
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                Context context33 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context33, "getContext(...)");
                return new PollViewHolder(new PollImageOnlyView(context33, null, 0, 6, null));
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                Context context34 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context34, "getContext(...)");
                return new SafetySystemNotificationViewHolder(new SafetySystemNotificationView(context34, r5, i7, r5));
            case 40:
                Context context35 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context35, "getContext(...)");
                ActivityInstanceEmbedView activityInstanceEmbedView = new ActivityInstanceEmbedView(context35, null, 0, 6, null);
                ChatEventHandler chatEventHandler23 = this.eventHandler;
                if (chatEventHandler23 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler3 = chatEventHandler23;
                }
                return new ActivityInstanceEmbedViewHolder(activityInstanceEmbedView, chatEventHandler3);
            case 41:
                Context context36 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context36, "getContext(...)");
                return new CtaButtonViewHolder(new CtaButtonView(context36, r5, i7, r5));
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                Context context37 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context37, "getContext(...)");
                return new ForwardHeaderViewHolder(new ForwardHeaderView(context37, r5, i7, r5));
            case ChatViewRecyclerTypes.FORWARD_BREADCRUMB /* 44 */:
                Context context38 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context38, "getContext(...)");
                return new ForwardBreadcrumbViewHolder(new ForwardBreadcrumbView(context38, r5, i7, r5));
            case ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE /* 49 */:
                Context context39 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context39, "getContext(...)");
                return new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(context39, r5, i7, r5));
            case 50:
                Context context40 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context40, "getContext(...)");
                return new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(context40, r5, i7, r5));
            case ChatViewRecyclerTypes.REFERRAL /* 52 */:
                Context context41 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context41, "getContext(...)");
                return new ReferralViewHolder(new ReferralView(context41, r5, i7, r5));
            case ChatViewRecyclerTypes.GUILD_PROFILE_INVITE /* 53 */:
                Context context42 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context42, "getContext(...)");
                return new GuildProfileInviteViewHolder(new GuildProfileInviteView(context42, null, 0, 6, null));
            case ChatViewRecyclerTypes.APP_MESSAGE_EMBED /* 54 */:
                Context context43 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context43, "getContext(...)");
                AppMessageEmbedView appMessageEmbedView = new AppMessageEmbedView(context43, null, 0, 6, null);
                ChatEventHandler chatEventHandler24 = this.eventHandler;
                if (chatEventHandler24 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler2 = chatEventHandler24;
                }
                return new AppMessageEmbedViewHolder(appMessageEmbedView, chatEventHandler2);
            case ChatViewRecyclerTypes.ACTIVITY_RICH_PRESENCE_INVITE_EMBED /* 55 */:
                Context context44 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context44, "getContext(...)");
                ActivityRichPresenceInviteEmbedView activityRichPresenceInviteEmbedView = new ActivityRichPresenceInviteEmbedView(context44, null, 0, 6, null);
                ChatEventHandler chatEventHandler25 = this.eventHandler;
                if (chatEventHandler25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                } else {
                    chatEventHandler = chatEventHandler25;
                }
                return new ActivityRichPresenceInviteEmbedViewHolder(activityRichPresenceInviteEmbedView, chatEventHandler);
            case ChatViewRecyclerTypes.SHARED_CUSTOM_THEME_EMBED /* 56 */:
                Context context45 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context45, "getContext(...)");
                return new SharedCustomThemeViewHolder(new SharedCustomThemeView(context45, r5, i7, r5));
            case ChatViewRecyclerTypes.PREMIUM_GROUP_INVITE /* 57 */:
                Context context46 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context46, "getContext(...)");
                return new PremiumGroupInviteViewHolder(new PremiumGroupInviteView(context46, r5, i7, r5));
            case ChatViewRecyclerTypes.REFERRAL_REDESIGN /* 58 */:
                Context context47 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context47, "getContext(...)");
                return new ReferralRedesignViewHolder(new ReferralRedesignView(context47, r5, i7, r5));
            case ChatViewRecyclerTypes.VOICE_CHANNEL_LIST_INVITE /* 59 */:
                Context context48 = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context48, "getContext(...)");
                return new VoiceChannelListInviteViewHolder(new VoiceChannelListInviteView(context48, null, 0, 6, null));
            case ChatViewRecyclerTypes.GIFT_INTENT /* 60 */:
                GiftIntentView root2 = GiftIntentViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false).getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                return new GiftIntentViewHolder(root2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(@NotNull MessagePartViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AudioPlayerViewHolder) {
            ((AudioPlayerViewHolder) holder).onViewRecycled();
        }
        super.onViewRecycled((RecyclerView.ViewHolder) holder);
    }

    public MessageAccessoriesAdapter(@NotNull Function0<Unit> measureAndLayout) {
        Intrinsics.checkNotNullParameter(measureAndLayout, "measureAndLayout");
        this.measureAndLayout = measureAndLayout;
        this.items = n0.f14659d;
        this.onTapSpoiler = new g(this, 5);
        setHasStableIds(true);
    }
}
