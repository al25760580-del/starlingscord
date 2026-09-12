package com.discord.chat.presentation.message.system;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.gift_intent.GiftIntentEmbed;
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed;
import com.discord.chat.bridge.premium_group_invite.PremiumGroupInviteEmbed;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.referral.ReferralEmbed;
import com.discord.chat.bridge.referral.ReferralEmbedRedesign;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.databinding.SystemMessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListConstraintLayout;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.MessageViewAccessibilityDelegate;
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GiftIntentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.messagepart.PremiumGroupInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReferralRedesignMessageAccessory;
import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory;
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory;
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory;
import com.discord.chat.presentation.message.o;
import com.discord.chat.presentation.message.r;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.root.MessageContextType;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.fonts.DiscordFont;
import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react.utilities.ReactColorToAndroidColorKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 J&\u0010%\u001a\b\u0012\u0004\u0012\u00020#0&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u001aH\u0002J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\n0*2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#0\"j\b\u0012\u0004\u0012\u00020#`$X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/discord/chat/presentation/message/system/SystemMessageView;", "Lcom/discord/chat/presentation/list/ChatListConstraintLayout;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "normalIconColor", "", "greenIconColor", "redIconColor", "warnIconColor", "pinkIconColor", "mutedIconColor", "binding", "Lcom/discord/chat/databinding/SystemMessageViewBinding;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "setMessage", "", "message", "Lcom/discord/chat/bridge/Message;", "Lcom/discord/chat/presentation/root/MessageContext;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "resetIconViews", "setAccessoriesRecycledViewPool", "recycledViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "accessories", "Ljava/util/ArrayList;", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "Lkotlin/collections/ArrayList;", "generateMessageAccessories", "", "margins", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "getIconAndColor", "Lkotlin/Pair;", "Lcom/discord/react_asset_fetcher/ReactAsset;", "messageType", "Lcom/discord/chat/bridge/MessageType;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemMessageView.kt\ncom/discord/chat/presentation/message/system/SystemMessageView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,450:1\n255#2:451\n255#2:452\n257#2,2:453\n257#2,2:456\n257#2,2:458\n257#2,2:460\n257#2,2:462\n257#2,2:464\n257#2,2:466\n257#2,2:468\n257#2,2:470\n1#3:455\n1878#4,3:472\n*S KotlinDebug\n*F\n+ 1 SystemMessageView.kt\ncom/discord/chat/presentation/message/system/SystemMessageView\n*L\n69#1:451\n70#1:452\n117#1:453,2\n124#1:456,2\n129#1:458,2\n133#1:460,2\n159#1:462,2\n172#1:464,2\n174#1:466,2\n177#1:468,2\n179#1:470,2\n276#1:472,3\n*E\n"})
public final class SystemMessageView extends ChatListConstraintLayout implements SpineParentMessage {

    @NotNull
    private ArrayList<MessageAccessory> accessories;

    @NotNull
    private final SystemMessageViewBinding binding;
    private final int greenIconColor;
    private final int mutedIconColor;
    private final int normalIconColor;
    private final int pinkIconColor;
    private final int redIconColor;
    private final int warnIconColor;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MessageType.values().length];
            try {
                iArr[MessageType.USER_JOIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageType.ROLE_SUBSCRIPTION_PURCHASE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageType.RECIPIENT_ADD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MessageType.GUILD_STREAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MessageType.GUILD_INVITE_REMINDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MessageType.PRIVATE_CHANNEL_INTEGRATION_ADDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MessageType.GUILD_DEADCHAT_REVIVE_PROMPT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MessageType.GUILD_GAMING_STATS_PROMPT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MessageType.RECIPIENT_REMOVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MessageType.PRIVATE_CHANNEL_INTEGRATION_REMOVED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[MessageType.CHANNEL_NAME_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[MessageType.CHANNEL_ICON_CHANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[MessageType.CHAT_WALLPAPER_SET.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[MessageType.CHAT_WALLPAPER_REMOVED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[MessageType.EMOJI_ADDED.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[MessageType.CHANNEL_PINNED_MESSAGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[MessageType.GUILD_APPLICATION_PREMIUM_SUBSCRIPTION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[MessageType.USER_PREMIUM_GUILD_SUBSCRIPTION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[MessageType.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_1.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[MessageType.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_2.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[MessageType.USER_PREMIUM_GUILD_SUBSCRIPTION_TIER_3.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[MessageType.CHANNEL_FOLLOW_ADD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[MessageType.GUILD_DISCOVERY_DISQUALIFIED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[MessageType.GUILD_DISCOVERY_REQUALIFIED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[MessageType.GUILD_DISCOVERY_GRACE_PERIOD_INITIAL_WARNING.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[MessageType.GUILD_DISCOVERY_GRACE_PERIOD_FINAL_WARNING.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[MessageType.THREAD_CREATED.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[MessageType.THREAD_STARTER_MESSAGE.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[MessageType.STAGE_START.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[MessageType.STAGE_END.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[MessageType.STAGE_TOPIC.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[MessageType.STAGE_SPEAKER.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[MessageType.STAGE_RAISE_HAND.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[MessageType.GUILD_INCIDENT_ALERT_MODE_ENABLED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[MessageType.GUILD_INCIDENT_ALERT_MODE_DISABLED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[MessageType.POLL_RESULT.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[MessageType.CHANNEL_LINKED_TO_LOBBY.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[MessageType.IN_GAME_MESSAGE_NUX.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[MessageType.GUILD_JOIN_REQUEST_ACCEPT_NOTIFICATION.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[MessageType.GUILD_JOIN_REQUEST_REJECT_NOTIFICATION.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[MessageType.GUILD_JOIN_REQUEST_WITHDRAWN_NOTIFICATION.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[MessageType.VOICE_SESSION.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[MessageType.FRIEND_REQUEST_ACCEPTED.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SystemMessageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private final List<MessageAccessory> generateMessageAccessories(MessageMargins margins, Message message, MessageContext context) {
        int i7;
        Message message2;
        int i10;
        DefaultConstructorMarker defaultConstructorMarker;
        String timestamp;
        this.accessories.clear();
        Integer constrainedWidth = message.getConstrainedWidth();
        int iIntValue = constrainedWidth != null ? constrainedWidth.intValue() : getResources().getDisplayMetrics().widthPixels;
        int i11 = 0;
        ?? r5 = (message.getTimestamp() == null || message.getType() == MessageType.IN_GAME_MESSAGE_NUX) ? false : true;
        StructurableText content = message.getContent();
        if (content != null) {
            ArrayList<MessageAccessory> arrayList = this.accessories;
            String strM267getId3Eiw7ao = message.m267getId3Eiw7ao();
            boolean zShouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
            boolean zShouldShowLinkDecorations = MessageKt.shouldShowLinkDecorations(message);
            boolean shouldShowRoleDot = message.getShouldShowRoleDot();
            boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
            int dimensionPixelSize = r5 != false ? 0 : getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
            Integer linkColor = message.getLinkColor();
            int iIntValue2 = linkColor != null ? linkColor.intValue() : ThemeManagerKt.getTheme().getTextDefault();
            Integer textColor = message.getTextColor();
            i7 = 1;
            arrayList.add(new MessageContentAccessory(strM267getId3Eiw7ao, margins, content, zShouldAnimateEmoji, zShouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, dimensionPixelSize, iIntValue2, textColor != null ? textColor.intValue() : ThemeManagerKt.getTheme().getTextDefault(), DiscordFont.PrimaryNormal, 16, true, iIntValue, null, null, message.getEditedColor(), false, null, null, 786432, null));
        } else {
            i7 = 1;
        }
        if (r5 != false && (timestamp = message.getTimestamp()) != null) {
            this.accessories.add(new TimestampMessageAccessory(message.m267getId3Eiw7ao(), timestamp, ThemeManagerKt.getTheme().getTextMuted(), DiscordFont.PrimaryMedium, null));
        }
        Integer totalMonthsSubscribed = message.getTotalMonthsSubscribed();
        if (totalMonthsSubscribed == null || totalMonthsSubscribed.intValue() > i7) {
            message2 = message;
        } else {
            ArrayList<MessageAccessory> arrayList2 = this.accessories;
            String strM267getId3Eiw7ao2 = message.m267getId3Eiw7ao();
            String username = message.getUsername();
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            message2 = message;
            arrayList2.add(new RoleSubscriptionPurchaseAccessory(strM267getId3Eiw7ao2, margins, username, MessageKt.avatarUrl(message2, context2), iIntValue, false, null));
        }
        Sticker sticker = message2.getSticker();
        if (sticker != null) {
            this.accessories.add(new WelcomeStickerAccessory(message2, sticker));
        }
        if (message2.getType() == MessageType.STAGE_RAISE_HAND && Intrinsics.areEqual(message2.getShowInviteToSpeakButton(), Boolean.TRUE)) {
            this.accessories.add(new InviteToSpeakAccessory(message2));
        }
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        if (message2.getType() == MessageType.GUILD_DEADCHAT_REVIVE_PROMPT || message2.getType() == MessageType.GUILD_GAMING_STATS_PROMPT) {
            List<Embed> embeds = message2.getEmbeds();
            if (embeds != null) {
                Iterator it = embeds.iterator();
                while (true) {
                    int i12 = i11;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    i11 = i12 + 1;
                    if (i12 < 0) {
                        ?? r6 = defaultConstructorMarker2;
                        d0.k();
                        throw r6;
                    }
                    int i13 = iIntValue;
                    iIntValue = i13;
                    this.accessories.add(new EmbedMessageAccessory(message.m267getId3Eiw7ao(), margins, i12, message.m264getChannelIdo4g7jtM(), i13, 16, (Embed) next, false, false, false, false, false, null, null, false, null));
                    defaultConstructorMarker2 = defaultConstructorMarker2;
                    it = it;
                    i7 = i7;
                }
            }
            i10 = i7;
            defaultConstructorMarker = defaultConstructorMarker2;
            message2 = message;
            this.accessories.add(new ChannelPromptActionsAccessory(message2));
        } else {
            i10 = i7;
            defaultConstructorMarker = null;
        }
        List<MessageReaction> reactions = message2.getReactions();
        if (reactions != null && (!reactions.isEmpty() ? 1 : 0) == i10) {
            this.accessories.add(new ReactionsMessageAccessory(message2.m267getId3Eiw7ao(), message2.getReactions(), context.getCanAddNewReactions(), context.getAddNewReactionAccessibilityLabel(), context.getReactionsTheme(), null, null, null, false, 448, null));
        }
        ThreadEmbed threadEmbed = message2.getThreadEmbed();
        if (threadEmbed != null) {
            this.accessories.add(new ThreadEmbedMessageAccessory(message2.m267getId3Eiw7ao(), threadEmbed, defaultConstructorMarker));
        }
        GiftIntentEmbed giftIntentInfo = message2.getGiftIntentInfo();
        if (giftIntentInfo != null) {
            this.accessories.add(new GiftIntentMessageAccessory(message2.m267getId3Eiw7ao(), giftIntentInfo, defaultConstructorMarker));
        }
        EphemeralIndication ephemeralIndication = message2.getEphemeralIndication();
        if (ephemeralIndication != null) {
            this.accessories.add(new EphemeralIndicationMessageAccessory(message2.m267getId3Eiw7ao(), ephemeralIndication, defaultConstructorMarker));
        }
        SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = message2.getSafetyPolicyNoticeEmbed();
        if (safetyPolicyNoticeEmbed != null) {
            this.accessories.add(new SafetyPolicyNoticeMessageAccessory(message2.m267getId3Eiw7ao(), safetyPolicyNoticeEmbed, defaultConstructorMarker));
        }
        ReferralEmbedRedesign referralTrialOfferInfoRedesign = message2.getReferralTrialOfferInfoRedesign();
        if (referralTrialOfferInfoRedesign != null) {
            this.accessories.add(new ReferralRedesignMessageAccessory(message2.m267getId3Eiw7ao(), referralTrialOfferInfoRedesign, defaultConstructorMarker));
        } else {
            ReferralEmbed referralTrialOfferInfo = message2.getReferralTrialOfferInfo();
            if (referralTrialOfferInfo != null) {
                this.accessories.add(new ReferralMessageAccessory(message2.m267getId3Eiw7ao(), referralTrialOfferInfo, defaultConstructorMarker));
            }
        }
        PremiumGroupInviteEmbed premiumGroupInviteInfo = message2.getPremiumGroupInviteInfo();
        if (premiumGroupInviteInfo != null) {
            this.accessories.add(new PremiumGroupInviteMessageAccessory(message2.m267getId3Eiw7ao(), premiumGroupInviteInfo, defaultConstructorMarker));
        }
        return this.accessories;
    }

    private final Pair<ReactAsset, Integer> getIconAndColor(MessageType messageType) {
        switch (WhenMappings.$EnumSwitchMapping$0[messageType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new Pair<>(ReactAsset.ArrowLargeRightIcon, Integer.valueOf(this.greenIconColor));
            case 9:
            case 10:
                return new Pair<>(ReactAsset.ArrowLargeLeftIcon, Integer.valueOf(this.redIconColor));
            case 11:
            case 12:
            case 13:
            case 14:
                return new Pair<>(ReactAsset.PencilIcon, Integer.valueOf(this.normalIconColor));
            case 15:
                return new Pair<>(ReactAsset.ReactionIcon, Integer.valueOf(this.normalIconColor));
            case 16:
                return new Pair<>(ReactAsset.PinIcon, Integer.valueOf(this.normalIconColor));
            case 17:
                return new Pair<>(ReactAsset.TicketIcon, Integer.valueOf(this.normalIconColor));
            case 18:
            case 19:
            case 20:
            case 21:
                return new Pair<>(ReactAsset.BoostGemIcon, Integer.valueOf(this.pinkIconColor));
            case 22:
                return new Pair<>(ReactAsset.AnnouncementsIcon, Integer.valueOf(this.normalIconColor));
            case 23:
                return new Pair<>(ReactAsset.XSmallIcon, Integer.valueOf(this.redIconColor));
            case 24:
                return new Pair<>(ReactAsset.CheckmarkSmallIcon, Integer.valueOf(this.greenIconColor));
            case 25:
            case 26:
                return new Pair<>(ReactAsset.CircleErrorIcon, Integer.valueOf(this.warnIconColor));
            case 27:
            case 28:
                return new Pair<>(ReactAsset.ThreadIcon, Integer.valueOf(this.normalIconColor));
            case 29:
                return new Pair<>(ReactAsset.StageIcon, Integer.valueOf(this.greenIconColor));
            case 30:
            case 31:
                return new Pair<>(ReactAsset.StageIcon, Integer.valueOf(this.normalIconColor));
            case 32:
                return new Pair<>(ReactAsset.MicrophoneArrowRightIcon, Integer.valueOf(this.normalIconColor));
            case 33:
                return new Pair<>(ReactAsset.HandRequestSpeakIcon, Integer.valueOf(this.normalIconColor));
            case 34:
                return new Pair<>(ReactAsset.LockIcon, Integer.valueOf(this.normalIconColor));
            case 35:
                return new Pair<>(ReactAsset.LockUnlockedIcon, Integer.valueOf(this.normalIconColor));
            case 36:
                return new Pair<>(ReactAsset.PollsIcon, Integer.valueOf(this.normalIconColor));
            case ChatViewRecyclerTypes.POLL_TEXT_AND_IMAGE /* 37 */:
                return new Pair<>(ReactAsset.RefreshIcon, Integer.valueOf(this.greenIconColor));
            case ChatViewRecyclerTypes.POLL_IMAGE_ONLY /* 38 */:
                return new Pair<>(ReactAsset.GameControllerIcon, Integer.valueOf(this.mutedIconColor));
            case ChatViewRecyclerTypes.SAFETY_SYSTEM_NOTIFICATION /* 39 */:
                return new Pair<>(ReactAsset.CheckmarkSmallIcon, Integer.valueOf(this.greenIconColor));
            case 40:
                return new Pair<>(ReactAsset.XSmallIcon, Integer.valueOf(this.redIconColor));
            case 41:
                return new Pair<>(ReactAsset.ArrowLargeLeftIcon, Integer.valueOf(this.normalIconColor));
            case 42:
                return new Pair<>(ReactAsset.VoiceNormalIcon, Integer.valueOf(this.greenIconColor));
            case ChatViewRecyclerTypes.FORWARD_HEADER /* 43 */:
                return new Pair<>(ReactAsset.UserCheckIcon, Integer.valueOf(this.greenIconColor));
            default:
                if (messageType.isPremiumSystem()) {
                    return new Pair<>(ReactAsset.BoostGemIcon, Integer.valueOf(this.pinkIconColor));
                }
                throw new IllegalArgumentException("Unhandled message type: " + messageType);
        }
    }

    private final void resetIconViews() {
        SimpleDraweeView systemIcon = this.binding.systemIcon;
        Intrinsics.checkNotNullExpressionValue(systemIcon, "systemIcon");
        systemIcon.setVisibility(8);
        SimpleDraweeView simpleDraweeView = this.binding.premiumIcon;
        Intrinsics.checkNotNull(simpleDraweeView);
        simpleDraweeView.setVisibility(8);
        ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, null);
        FrameLayout giftingPromptIconContainer = this.binding.giftingPromptIconContainer;
        Intrinsics.checkNotNullExpressionValue(giftingPromptIconContainer, "giftingPromptIconContainer");
        giftingPromptIconContainer.setVisibility(8);
        SimpleDraweeView giftingPromptIcon = this.binding.giftingPromptIcon;
        Intrinsics.checkNotNullExpressionValue(giftingPromptIcon, "giftingPromptIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(giftingPromptIcon, null);
        View leftBorder = this.binding.leftBorder;
        Intrinsics.checkNotNullExpressionValue(leftBorder, "leftBorder");
        leftBorder.setVisibility(8);
    }

    public static /* synthetic */ void setMessage$default(SystemMessageView systemMessageView, Message message, MessageContext messageContext, ChatEventHandler chatEventHandler, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        systemMessageView.setMessage(message, messageContext, chatEventHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setMessage$lambda$0(Message message, ChatEventHandler chatEventHandler, View view) {
        if (MessageKt.isEphemeral(message)) {
            return false;
        }
        Function6 function6Mo527getOnMessageLongPressed = chatEventHandler.getOnMessageLongPressed();
        if (function6Mo527getOnMessageLongPressed == null) {
            return true;
        }
        function6Mo527getOnMessageLongPressed.invoke(MessageId.m1156boximpl(message.m267getId3Eiw7ao()), ChannelId.m1130boximpl(message.m264getChannelIdo4g7jtM()), null, null, null, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMessage$lambda$2$lambda$1(Function2 function2, Message message, View view) {
        function2.invoke(MessageId.m1156boximpl(message.m267getId3Eiw7ao()), ChannelId.m1130boximpl(message.m264getChannelIdo4g7jtM()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMessage$lambda$9(View view) {
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    @NotNull
    public View getSpineOriginView() {
        FrameLayout giftingPromptIconContainer = this.binding.giftingPromptIconContainer;
        Intrinsics.checkNotNullExpressionValue(giftingPromptIconContainer, "giftingPromptIconContainer");
        if (giftingPromptIconContainer.getVisibility() == 0) {
            FrameLayout giftingPromptIconContainer2 = this.binding.giftingPromptIconContainer;
            Intrinsics.checkNotNullExpressionValue(giftingPromptIconContainer2, "giftingPromptIconContainer");
            return giftingPromptIconContainer2;
        }
        SimpleDraweeView premiumIcon = this.binding.premiumIcon;
        Intrinsics.checkNotNullExpressionValue(premiumIcon, "premiumIcon");
        if (premiumIcon.getVisibility() == 0) {
            SimpleDraweeView premiumIcon2 = this.binding.premiumIcon;
            Intrinsics.checkNotNullExpressionValue(premiumIcon2, "premiumIcon");
            return premiumIcon2;
        }
        SimpleDraweeView systemIcon = this.binding.systemIcon;
        Intrinsics.checkNotNullExpressionValue(systemIcon, "systemIcon");
        return systemIcon;
    }

    public final void setAccessoriesRecycledViewPool(@NotNull RecyclerView.RecycledViewPool recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        this.binding.accessoriesView.setRecycledViewPool(recycledViewPool);
    }

    public final void setMessage(@NotNull Message message, @NotNull MessageContext context, @NotNull ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        o oVar = new o(2, message, eventHandler);
        Function2<MessageId, ChannelId, Unit> function2Mo526getOnMessageDoubleTapped = eventHandler.mo526getOnMessageDoubleTapped();
        r rVar = null;
        if (function2Mo526getOnMessageDoubleTapped != null && !MessageKt.isEphemeral(message)) {
            rVar = new r(function2Mo526getOnMessageDoubleTapped, message, 2);
        }
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, oVar);
        NestedScrollOnTouchUtilsKt.setOnDoubleClickListenerNested(this, true, rVar);
        resetIconViews();
        if (message.getType() == MessageType.GIFTING_PROMPT) {
            FrameLayout giftingPromptIconContainer = this.binding.giftingPromptIconContainer;
            Intrinsics.checkNotNullExpressionValue(giftingPromptIconContainer, "giftingPromptIconContainer");
            giftingPromptIconContainer.setVisibility(0);
            SimpleDraweeView simpleDraweeView = this.binding.giftingPromptIcon;
            Intrinsics.checkNotNull(simpleDraweeView);
            ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView, message.getIconUrl());
            Integer iconTintColor = message.getIconTintColor();
            ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(iconTintColor != null ? ReactColorToAndroidColorKt.reactColorToAndroidColor(iconTintColor.intValue()) : ThemeManagerKt.getTheme().getControlPrimaryBackgroundDefault()));
            Intrinsics.checkNotNull(simpleDraweeView);
        } else if (!message.getType().isPremiumSystem() || message.getIconUrl() == null) {
            Pair<ReactAsset, Integer> iconAndColor = getIconAndColor(message.getType());
            ReactAsset reactAsset = (ReactAsset) iconAndColor.f14612d;
            int iIntValue = ((Number) iconAndColor.f14613e).intValue();
            SimpleDraweeView simpleDraweeView2 = this.binding.systemIcon;
            Intrinsics.checkNotNull(simpleDraweeView2);
            simpleDraweeView2.setVisibility(0);
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, reactAsset);
            ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(iIntValue));
            Intrinsics.checkNotNull(simpleDraweeView2);
        } else {
            SimpleDraweeView simpleDraweeView3 = this.binding.premiumIcon;
            Intrinsics.checkNotNull(simpleDraweeView3);
            simpleDraweeView3.setVisibility(0);
            ReactAssetUtilsKt.setOptionalReactImageUrl(simpleDraweeView3, message.getIconUrl());
            Integer iconTintColor2 = message.getIconTintColor();
            ColorUtilsKt.setTintColor(simpleDraweeView3, Integer.valueOf(iconTintColor2 != null ? ReactColorToAndroidColorKt.reactColorToAndroidColor(iconTintColor2.intValue()) : ThemeManagerKt.getTheme().getTextDefault()));
            View view = this.binding.leftBorder;
            Integer iconDividerColor = message.getIconDividerColor();
            view.setBackgroundColor(iconDividerColor != null ? ReactColorToAndroidColorKt.reactColorToAndroidColor(iconDividerColor.intValue()) : ThemeManagerKt.getTheme().getBorderNormal());
            View leftBorder = this.binding.leftBorder;
            Intrinsics.checkNotNullExpressionValue(leftBorder, "leftBorder");
            leftBorder.setVisibility(0);
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        MessageMargins messageMargins = new MessageMargins(resources, context, false);
        if (context.getContextType() == MessageContextType.SEARCH) {
            messageMargins = MessageMargins.copy$default(messageMargins, getResources().getDimensionPixelSize(R.dimen.message_start_guideline), 0, 0, 6, null);
        }
        MessageMargins messageMargins2 = messageMargins;
        List<MessageAccessory> listGenerateMessageAccessories = generateMessageAccessories(messageMargins2, message, context);
        this.binding.accessoriesView.m567setAccessoriesdvvEyHs(messageMargins2, message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM(), message.m266getGuildIdqOKuAAo(), listGenerateMessageAccessories, eventHandler, null, false);
        MessageAccessoriesView accessoriesView = this.binding.accessoriesView;
        Intrinsics.checkNotNullExpressionValue(accessoriesView, "accessoriesView");
        accessoriesView.setVisibility(listGenerateMessageAccessories.isEmpty() ? 8 : 0);
        u0.p(this, new MessageViewAccessibilityDelegate(message, new b(0), oVar));
    }

    public /* synthetic */ SystemMessageView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemMessageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.normalIconColor = ThemeManagerKt.getTheme().getInteractiveTextDefault();
        this.greenIconColor = ColorUtilsKt.getColorCompat(this, com.discord.theme.R.color.green_360);
        this.redIconColor = ColorUtilsKt.getColorCompat(this, com.discord.theme.R.color.red_400);
        this.warnIconColor = ColorUtilsKt.getColorCompat(this, com.discord.theme.R.color.yellow_300);
        this.pinkIconColor = ColorUtilsKt.getColorCompat(this, com.discord.theme.R.color.guild_boosting_pink);
        this.mutedIconColor = ThemeManagerKt.getTheme().getTextMuted();
        SystemMessageViewBinding systemMessageViewBindingInflate = SystemMessageViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(systemMessageViewBindingInflate, "inflate(...)");
        this.binding = systemMessageViewBindingInflate;
        RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
        this.accessories = new ArrayList<>(2);
    }
}
