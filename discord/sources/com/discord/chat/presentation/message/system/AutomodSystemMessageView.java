package com.discord.chat.presentation.message.system;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.activities.ActivityInstanceEmbed;
import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed;
import com.discord.chat.bridge.automod.AutoModerationContext;
import com.discord.chat.bridge.automod.FlaggedMessageEmbed;
import com.discord.chat.bridge.channelprompt.ChannelPromptData;
import com.discord.chat.bridge.connectionsroletag.ConnectionsRoleTag;
import com.discord.chat.bridge.ctabutton.CtaButton;
import com.discord.chat.bridge.customthemes.SharedCustomThemeData;
import com.discord.chat.bridge.displaynamestyles.DisplayNameStyles;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.bridge.feedback.SurveyIndication;
import com.discord.chat.bridge.forums.ForumPostActions;
import com.discord.chat.bridge.forwarding.ForwardInfo;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.chat.bridge.gift_intent.GiftIntentEmbed;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed;
import com.discord.chat.bridge.polls.PollData;
import com.discord.chat.bridge.premium_group_invite.PremiumGroupInviteEmbed;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.chat.bridge.referral.ReferralEmbed;
import com.discord.chat.bridge.referral.ReferralEmbedRedesign;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.bridge.voicechannelbadges.VoiceChannelBadge;
import com.discord.chat.databinding.AutomodSystemMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListConstraintLayout;
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory;
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.t;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J6\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!J&\u0010&\u001a\b\u0012\u0004\u0012\u00020$0'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010*\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0011H\u0002J\u0010\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0011H\u0002J\r\u00101\u001a\u000202H\u0016¢\u0006\u0002\u00103R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/discord/chat/presentation/message/system/AutomodSystemMessageView;", "Lcom/discord/chat/presentation/list/ChatListConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/AutomodSystemMessageViewBinding;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "allowChildGestures", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "setMessage", "", "message", "Lcom/discord/chat/bridge/Message;", "messageContext", "Lcom/discord/chat/presentation/root/MessageContext;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "setAccessoriesRecycledViewPool", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "accessories", "Ljava/util/ArrayList;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lkotlin/collections/ArrayList;", "generateMessageAccessories", "", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "configureAuthor", "automodContext", "Lcom/discord/chat/bridge/automod/AutoModerationContext;", "configureDivider", "showDivider", "configureCommunicationDisabled", "isCommunicationDisabled", "spacingPxOverride", "", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAutomodSystemMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutomodSystemMessageView.kt\ncom/discord/chat/presentation/message/system/AutomodSystemMessageView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,294:1\n257#2,2:295\n257#2,2:297\n257#2,2:299\n*S KotlinDebug\n*F\n+ 1 AutomodSystemMessageView.kt\ncom/discord/chat/presentation/message/system/AutomodSystemMessageView\n*L\n262#1:295,2\n274#1:297,2\n281#1:299,2\n*E\n"})
public final class AutomodSystemMessageView extends ChatListConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView, SpineParentMessage {

    @NotNull
    private ArrayList<MessageAccessory> accessories;
    private boolean allowChildGestures;

    @NotNull
    private final AutomodSystemMessageViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutomodSystemMessageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @SuppressLint({"SetTextI18n"})
    private final void configureAuthor(Message message, AutoModerationContext automodContext, ChatEventHandler eventHandler) {
        SimpleDraweeView authorAvatar = this.binding.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(authorAvatar, MessageKt.avatarUrl(message, context));
        this.binding.authorName.setText(message.getUsername());
        this.binding.messageTagView.m570configureTagViewUl7AT2Q(automodContext.getHeaderBadgeText(), Boolean.TRUE, null, null, null, eventHandler, message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM(), message.getTagType(), (IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : null);
        this.binding.automodMessageContextHeader.setText(automodContext.getHeaderText());
        this.binding.timestamp.setText(message.getTimestamp());
        TextView textView = this.binding.automodMessageChannel;
        String channelName = automodContext.getMessage().getChannelName();
        if (channelName == null) {
            channelName = AppsFlyerProperties.CHANNEL;
        }
        textView.setText("#".concat(channelName));
        Intrinsics.checkNotNull(textView);
        textView.setVisibility(automodContext.getMessage().getChannelName() != null ? 0 : 8);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(textView, false, new t(2, eventHandler, automodContext), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAuthor$lambda$8$lambda$7(ChatEventHandler chatEventHandler, AutoModerationContext autoModerationContext, View view) {
        String strM1137toStringimpl = ChannelId.m1137toStringimpl(autoModerationContext.getMessage().m279getChannelIdo4g7jtM());
        GuildId guildIdM280getGuildIdqOKuAAo = autoModerationContext.getMessage().m280getGuildIdqOKuAAo();
        chatEventHandler.onTapChannel(strM1137toStringimpl, guildIdM280getGuildIdqOKuAAo != null ? GuildId.m1150toStringimpl(guildIdM280getGuildIdqOKuAAo.m1152unboximpl()) : null, null);
    }

    private final void configureCommunicationDisabled(boolean isCommunicationDisabled) {
        SimpleDraweeView simpleDraweeView = this.binding.guildCommunicationDisabledIcon;
        Intrinsics.checkNotNull(simpleDraweeView);
        simpleDraweeView.setVisibility(isCommunicationDisabled ? 0 : 8);
        if (isCommunicationDisabled) {
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.ClockWarningIcon);
            ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getIconFeedbackCritical()));
        }
        this.binding.authorAvatar.setAlpha(isCommunicationDisabled ? 0.5f : 1.0f);
    }

    private final void configureDivider(boolean showDivider) {
        View messageHeaderDivider = this.binding.messageHeaderDivider;
        Intrinsics.checkNotNullExpressionValue(messageHeaderDivider, "messageHeaderDivider");
        messageHeaderDivider.setVisibility(showDivider ? 0 : 8);
    }

    private final List<MessageAccessory> generateMessageAccessories(MessageMargins margins, Message message, MessageContext messageContext) {
        this.accessories.clear();
        AutoModerationContext autoModerationContext = message.getAutoModerationContext();
        if (autoModerationContext == null) {
            return this.accessories;
        }
        FlaggedMessageEmbed message2 = autoModerationContext.getMessage();
        MessageType messageType = MessageType.DEFAULT;
        String strM281getId3Eiw7ao = message2.m281getId3Eiw7ao();
        long jM279getChannelIdo4g7jtM = message2.m279getChannelIdo4g7jtM();
        GuildId guildIdM280getGuildIdqOKuAAo = message2.m280getGuildIdqOKuAAo();
        UserId userIdM282getUserIdwUX8bhU = message2.m282getUserIdwUX8bhU();
        String username = message2.getUsername();
        String avatarURL = message2.getAvatarURL();
        StructurableText content = message2.getContent();
        int usernameColor = message2.getUsernameColor();
        Integer roleColor = message2.getRoleColor();
        boolean shouldShowRoleDot = message2.getShouldShowRoleDot();
        Boolean communicationDisabled = message2.getCommunicationDisabled();
        Message message3 = new Message(messageType, strM281getId3Eiw7ao, (String) null, jM279getChannelIdo4g7jtM, guildIdM280getGuildIdqOKuAAo, (MessageState) null, userIdM282getUserIdwUX8bhU, 0L, (String) null, (String) null, (Integer) null, (Float) null, (Integer) null, (Integer) null, (String) null, (String) null, (Integer) null, username, Integer.valueOf(usernameColor), roleColor, (RoleColors) null, shouldShowRoleDot, false, (Integer) null, avatarURL, (String) null, (List) null, (List) null, (Float) null, content, (List) null, (List) null, (ActivityInstanceEmbed) null, (List) null, message.getRoleIcon(), (VoiceChannelBadge) null, (ConnectionsRoleTag) null, (ThreadEmbed) null, false, (Boolean) null, (Boolean) null, (Boolean) null, (ReferencedMessage) null, (ExecutedCommand) null, (List) null, Boolean.valueOf(communicationDisabled != null ? communicationDisabled.booleanValue() : false), (String) null, (String) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (EphemeralIndication) null, (SurveyIndication) null, (InteractionStatus) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (String) null, (List) null, (Boolean) null, (Boolean) null, (Long) null, (Sticker) null, (String) null, (String) null, (Boolean) null, (ActivityRichPresenceInviteEmbed) null, false, (ForumPostActions) null, autoModerationContext, (String) null, (Integer) null, (Integer) null, (ReferralEmbed) null, (ReferralEmbedRedesign) null, (PremiumGroupInviteEmbed) null, (GiftIntentEmbed) null, (List) null, (GiftEmbed) null, (Integer) null, (List) null, (ChannelPromptData) null, (SafetyPolicyNoticeEmbed) null, (SafetySystemNotificationEmbed) null, (PollData) null, (SharedCustomThemeData) null, (CtaButton) null, (CtaButton) null, (Integer) null, (ForwardInfo) null, (Boolean) null, (GuildId) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (DisplayNameStyles) null, -556662876, -8261, -4097, 1023, (DefaultConstructorMarker) null);
        if (autoModerationContext.getNotification() != null) {
            this.accessories.add(new AutoModerationNotificationEmbedAccessory(message3.m267getId3Eiw7ao(), message, autoModerationContext, null));
        } else {
            this.accessories.add(new FlaggedMessageEmbedAccessory(message3.m267getId3Eiw7ao(), margins, message3, messageContext, null));
            this.accessories.add(new FlaggedMessageActionBarAccessory(message3.m267getId3Eiw7ao(), message, autoModerationContext, null));
        }
        List<MessageReaction> reactions = message.getReactions();
        if (reactions != null && (!reactions.isEmpty())) {
            this.accessories.add(new ReactionsMessageAccessory(message.m267getId3Eiw7ao(), message.getReactions(), messageContext.getCanAddNewReactions(), messageContext.getAddNewReactionAccessibilityLabel(), messageContext.getReactionsTheme(), null, null, null, false, 448, null));
        }
        ThreadEmbed threadEmbed = message.getThreadEmbed();
        if (threadEmbed != null) {
            this.accessories.add(new ThreadEmbedMessageAccessory(message.m267getId3Eiw7ao(), threadEmbed, null));
        }
        return this.accessories;
    }

    public static /* synthetic */ void setMessage$default(AutomodSystemMessageView automodSystemMessageView, Message message, MessageContext messageContext, ChatEventHandler chatEventHandler, ComponentProvider componentProvider, boolean z5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        ChatEventHandler chatEventHandler2 = chatEventHandler;
        if ((i7 & 8) != 0) {
            componentProvider = null;
        }
        ComponentProvider componentProvider2 = componentProvider;
        if ((i7 & 16) != 0) {
            z5 = true;
        }
        automodSystemMessageView.setMessage(message, messageContext, chatEventHandler2, componentProvider2, z5);
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    @NotNull
    public View getSpineOriginView() {
        SimpleDraweeView authorAvatar = this.binding.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        return authorAvatar;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        return !this.allowChildGestures;
    }

    public final void setAccessoriesRecycledViewPool(@NotNull RecyclerView.RecycledViewPool recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        this.binding.accessoriesView.setRecycledViewPool(recycledViewPool);
    }

    public final void setMessage(@NotNull Message message, @NotNull MessageContext messageContext, @NotNull ChatEventHandler eventHandler, ComponentProvider componentProvider, boolean allowChildGestures) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        this.allowChildGestures = allowChildGestures;
        AutoModerationContext autoModerationContext = message.getAutoModerationContext();
        if (autoModerationContext == null) {
            return;
        }
        configureAuthor(message, autoModerationContext, eventHandler);
        configureCommunicationDisabled(Intrinsics.areEqual(message.getCommunicationDisabled(), Boolean.TRUE));
        configureDivider(messageContext.getShowDivider());
        this.binding.replyPreview.clear();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        MessageMargins messageMargins = new MessageMargins(resources, messageContext, false);
        this.binding.accessoriesView.m567setAccessoriesdvvEyHs(messageMargins, message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM(), message.m266getGuildIdqOKuAAo(), generateMessageAccessories(messageMargins, message, messageContext), eventHandler, componentProvider, message.getForwardInfo() != null);
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    @NotNull
    /* JADX INFO: renamed from: spacingPxOverride */
    public Integer getBottomSpacingPx() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(8));
    }

    public /* synthetic */ AutomodSystemMessageView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomodSystemMessageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        AutomodSystemMessageViewBinding automodSystemMessageViewBindingInflate = AutomodSystemMessageViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(automodSystemMessageViewBindingInflate, "inflate(...)");
        this.binding = automodSystemMessageViewBindingInflate;
        this.allowChildGestures = true;
        RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(4), 1, null);
        automodSystemMessageViewBindingInflate.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(context, R.color.message_divider_light, R.color.message_divider_dark));
        TextView textView = automodSystemMessageViewBindingInflate.messageHeaderTitle;
        textView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = automodSystemMessageViewBindingInflate.messageHeaderSubtitle;
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        Intrinsics.checkNotNull(textView2);
        DiscordFontUtilsKt.setDiscordFont(textView2, DiscordFont.PrimaryNormal);
        TextView textView3 = automodSystemMessageViewBindingInflate.authorName;
        textView3.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
        Intrinsics.checkNotNull(textView3);
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView3, 16.0f, 20.0f);
        SimpleDraweeView authorAvatar = automodSystemMessageViewBindingInflate.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        ViewClippingUtilsKt.clipToCircle(authorAvatar);
        TextView textView4 = automodSystemMessageViewBindingInflate.automodMessageContextHeader;
        Intrinsics.checkNotNull(textView4);
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont);
        textView4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(textView4, 16.0f, 20.0f);
        TextView textView5 = automodSystemMessageViewBindingInflate.automodMessageChannel;
        textView5.setBackgroundColor(ColorUtilsKt.getThemeColor(context, com.discord.theme.R.color.brand_500, com.discord.theme.R.color.brand_600));
        int i7 = com.discord.theme.R.color.white;
        textView5.setTextColor(ColorUtilsKt.getThemeColor(context, i7, i7));
        Intrinsics.checkNotNull(textView5);
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView5, 12.0f, 15.0f);
        ViewClippingUtilsKt.clipToRoundedRectangle(textView5, SizeUtilsKt.getDpToPx(4));
        TextView textView6 = automodSystemMessageViewBindingInflate.timestamp;
        Intrinsics.checkNotNull(textView6);
        DiscordFontUtilsKt.setDiscordFont(textView6, DiscordFont.PrimaryMedium);
        textView6.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SetTextSizeSpKt.setTextSizeSp(textView6, 12.0f, 15.0f);
        this.accessories = new ArrayList<>(2);
    }
}
