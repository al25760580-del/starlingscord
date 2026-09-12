package com.discord.chat.presentation.message;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.bridge.MessageType;
import com.discord.chat.bridge.activities.ActivityInstanceEmbed;
import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.attachment.AttachmentType;
import com.discord.chat.bridge.botuikit.Component;
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl;
import com.discord.chat.bridge.codedlinks.CodedLinkEmbed;
import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl;
import com.discord.chat.bridge.codedlinks.GuildEventInviteEmbedImpl;
import com.discord.chat.bridge.codedlinks.GuildInviteDisabledEmbedImpl;
import com.discord.chat.bridge.codedlinks.GuildInviteEmbedImpl;
import com.discord.chat.bridge.codedlinks.GuildProfileInviteEmbedImpl;
import com.discord.chat.bridge.codedlinks.VoiceChannelListInviteEmbedImpl;
import com.discord.chat.bridge.ctabutton.CtaButton;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.embed.EmbedType;
import com.discord.chat.bridge.ephemeral.EphemeralIndication;
import com.discord.chat.bridge.feedback.SurveyIndication;
import com.discord.chat.bridge.forwarding.ForwardInfo;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.chat.bridge.interaction.InteractionStatus;
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed;
import com.discord.chat.bridge.polls.PollLayoutType;
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed;
import com.discord.chat.bridge.reaction.MessageReaction;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColorsKt;
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.threads.ThreadEmbed;
import com.discord.chat.databinding.MessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.ChatListRelativeLayout;
import com.discord.chat.presentation.list.FactoryCreatable;
import com.discord.chat.presentation.list.MaskedShadowView;
import com.discord.chat.presentation.list.SwipeReplyInitiator;
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ActivityRichPresenceInviteEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.AppMessageEmbedAccessory;
import com.discord.chat.presentation.message.messagepart.CtaButtonMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar;
import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ForwardHeaderMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.GuildProfileInviteMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory;
import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MediaMosaicAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory;
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory;
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory;
import com.discord.chat.presentation.message.messagepart.SafetySystemNotificationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.SharedCustomThemeMessageAccessory;
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory;
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory;
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory;
import com.discord.chat.presentation.message.messagepart.VoiceChannelListInviteMessageAccessory;
import com.discord.chat.presentation.message.utils.DisplayNameStylesUtils;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.root.MessageContextType;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.h0;
import kotlin.collections.n0;
import kotlin.collections.r0;
import kotlin.collections.x;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001~B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u000eJ\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u000eJW\u0010'\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010&\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u000eJ\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020\u0011H\u0002¢\u0006\u0004\b2\u0010\u0018J#\u00104\u001a\u00020\f*\u0002032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b4\u00105Jo\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?2\u0006\u00107\u001a\u0002062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2@\u0010>\u001a<\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0006\u0012\u0004\u0018\u00010;\u0012\u0006\u0012\u0004\u0018\u00010<\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\f\u0018\u000108j\u0004\u0018\u0001`=H\u0002¢\u0006\u0004\bA\u0010BJ/\u0010D\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\fH\u0002¢\u0006\u0004\bF\u0010\u000eJ\u001d\u0010H\u001a\u00020\f2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002¢\u0006\u0004\bH\u0010IJ'\u0010K\u001a\u00020\f2\u0006\u0010J\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020#H\u0002¢\u0006\u0004\bK\u0010LJ'\u0010N\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020#H\u0002¢\u0006\u0004\bN\u0010LR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\"\u0010S\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010Z\u001a\u00020Y8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010bR\u0016\u0010%\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010cR(\u0010d\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010b\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001c\u0010i\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010bR(\u0010j\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010b\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010m\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bm\u0010c\u001a\u0004\bn\u0010o\"\u0004\bp\u0010\u0018R\"\u0010q\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010c\u001a\u0004\br\u0010o\"\u0004\bs\u0010\u0018R\"\u0010t\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010c\u001a\u0004\bu\u0010o\"\u0004\bv\u0010\u0018R&\u0010y\u001a\u0012\u0012\u0004\u0012\u00020@0wj\b\u0012\u0004\u0012\u00020@`x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010}\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u007f"}, d2 = {"Lcom/discord/chat/presentation/message/MessageView;", "Lcom/discord/chat/presentation/list/ChatListRelativeLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "Lcom/discord/chat/presentation/list/SwipeReplyInitiator;", "Lcom/discord/chat/presentation/list/FactoryCreatable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFactoryCreate", "()V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onSwipeStart", "onSwipeEnd", "pressed", "setPressed", "(Z)V", "onRecycledHint", "Lcom/discord/chat/bridge/Message;", "message", "Lcom/discord/chat/presentation/root/MessageContext;", "messageContext", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentProvider", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "onChainPart", "allowChildGestures", "renderContentOnly", "setMessage", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;Lkotlin/jvm/functions/Function0;ZZ)V", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "recycledViewPool", "setAccessoriesRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "", "spacingPxOverride", "()Ljava/lang/Integer;", "initReplyView", "showDivider", "configureDivider", "Landroid/view/View;", "configureAuthorClickListeners", "(Landroid/view/View;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;)V", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "margins", "Lkotlin/Function6;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/ChannelId;", "Lcom/discord/chat/bridge/MediaType;", "", "Lcom/discord/chat/presentation/events/MessageLongPress;", "onLongClick", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "generateMessageAccessories", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/root/MessageContext;Lkotlin/jvm/functions/Function6;)Ljava/util/List;", "chainPart", "configureAuthor", "(Lcom/discord/chat/bridge/Message;Lcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/MessageView$ChainPart;Lcom/discord/chat/presentation/root/MessageContext;)V", "hideHeader", AlertFragment.ARG_ITEMS, "configureAccessoriesMargin", "(Ljava/util/List;)V", "isCommunicationDisabled", "configureCommunicationDisabled", "(ZLcom/discord/chat/presentation/events/ChatEventHandler;Lcom/discord/chat/presentation/message/MessageView$ChainPart;)V", "isSuppressNotifications", "configureSuppressNotifications", "Lcom/discord/chat/databinding/MessageViewBinding;", "binding", "Lcom/discord/chat/databinding/MessageViewBinding;", "Lcom/discord/chat/presentation/message/MessageViewReplyPreview;", "replyPreview", "Lcom/discord/chat/presentation/message/MessageViewReplyPreview;", "getReplyPreview", "()Lcom/discord/chat/presentation/message/MessageViewReplyPreview;", "setReplyPreview", "(Lcom/discord/chat/presentation/message/MessageViewReplyPreview;)V", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "shadowView", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "getShadowView", "()Lcom/discord/chat/presentation/list/MaskedShadowView;", "setShadowView", "(Lcom/discord/chat/presentation/list/MaskedShadowView;)V", "messageId", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function0;", "Z", "onInitiateReply", "getOnInitiateReply", "()Lkotlin/jvm/functions/Function0;", "setOnInitiateReply", "(Lkotlin/jvm/functions/Function0;)V", "onInitiateThread", "onInitiateEdit", "getOnInitiateEdit", "setOnInitiateEdit", "enableSwipeToReply", "getEnableSwipeToReply", "()Z", "setEnableSwipeToReply", "enableSwipeToEdit", "getEnableSwipeToEdit", "setEnableSwipeToEdit", "usingGradientTheme", "getUsingGradientTheme", "setUsingGradientTheme", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "accessories", "Ljava/util/ArrayList;", "getSpineOriginView", "()Landroid/view/View;", "spineOriginView", "ChainPart", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageView.kt\ncom/discord/chat/presentation/message/MessageView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,1011:1\n257#2,2:1012\n257#2,2:1048\n257#2,2:1050\n257#2,2:1052\n257#2,2:1054\n257#2,2:1056\n257#2,2:1058\n257#2,2:1060\n257#2,2:1062\n257#2,2:1064\n257#2,2:1066\n257#2,2:1068\n257#2,2:1070\n257#2,2:1072\n257#2,2:1074\n257#2,2:1076\n257#2,2:1078\n257#2,2:1080\n257#2,2:1082\n257#2,2:1084\n257#2,2:1086\n257#2,2:1088\n257#2,2:1090\n257#2,2:1092\n257#2,2:1094\n257#2,2:1096\n257#2,2:1098\n257#2,2:1100\n257#2,2:1102\n257#2,2:1104\n257#2,2:1106\n257#2,2:1108\n257#2,2:1110\n257#2,2:1112\n257#2,2:1114\n257#2,2:1124\n257#2,2:1126\n1761#3,3:1014\n3307#3,10:1017\n1563#3:1027\n1634#3,3:1028\n1634#3,3:1031\n1878#3,3:1034\n1878#3,3:1037\n1878#3,3:1040\n1878#3,3:1043\n1869#3,2:1046\n199#4,8:1116\n*S KotlinDebug\n*F\n+ 1 MessageView.kt\ncom/discord/chat/presentation/message/MessageView\n*L\n333#1:1012,2\n804#1:1048,2\n807#1:1050,2\n810#1:1052,2\n811#1:1054,2\n812#1:1056,2\n816#1:1058,2\n819#1:1060,2\n830#1:1062,2\n832#1:1064,2\n837#1:1066,2\n839#1:1068,2\n844#1:1070,2\n846#1:1072,2\n851#1:1074,2\n853#1:1076,2\n858#1:1078,2\n860#1:1080,2\n871#1:1082,2\n873#1:1084,2\n878#1:1086,2\n892#1:1088,2\n900#1:1090,2\n901#1:1092,2\n902#1:1094,2\n903#1:1096,2\n904#1:1098,2\n905#1:1100,2\n906#1:1102,2\n907#1:1104,2\n908#1:1106,2\n909#1:1108,2\n910#1:1110,2\n911#1:1112,2\n912#1:1114,2\n957#1:1124,2\n983#1:1126,2\n430#1:1014,3\n432#1:1017,10\n444#1:1027\n444#1:1028,3\n461#1:1031,3\n485#1:1034,3\n501#1:1037,3\n549#1:1040,3\n580#1:1043,3\n647#1:1046,2\n941#1:1116,8\n*E\n"})
public final class MessageView extends ChatListRelativeLayout implements VerticalSpacingItemDecoration.SpacingProviderView, SpineParentMessage, SwipeReplyInitiator, FactoryCreatable {

    @NotNull
    private ArrayList<MessageAccessory> accessories;
    private boolean allowChildGestures;

    @NotNull
    private final MessageViewBinding binding;
    private boolean enableSwipeToEdit;
    private boolean enableSwipeToReply;
    private String messageId;

    @NotNull
    private Function0<? extends ChainPart> onChainPart;

    @NotNull
    private Function0<Unit> onInitiateEdit;

    @NotNull
    private Function0<Unit> onInitiateReply;

    @NotNull
    private Function0<Unit> onInitiateThread;
    public MessageViewReplyPreview replyPreview;

    @NotNull
    private MaskedShadowView shadowView;
    private boolean usingGradientTheme;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "", "<init>", "(Ljava/lang/String;I)V", "ONLY", "START", "MIDDLE", "END", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ChainPart {
        ONLY,
        START,
        MIDDLE,
        END;

        private static final /* synthetic */ EnumEntries $ENTRIES = com.facebook.imagepipeline.nativecode.b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MessageState.values().length];
            try {
                iArr[MessageState.SendFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageState.Sending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ChainPart.values().length];
            try {
                iArr2[ChainPart.END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChainPart.ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChainPart.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChainPart.MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void configureAccessoriesMargin(List<? extends MessageAccessory> items) {
        boolean z5 = CollectionsKt.firstOrNull(items) instanceof MessageContentAccessory;
        int dpToPx = 0;
        boolean z6 = true;
        boolean z7 = items.size() > 1 || !z5;
        ChainPart chainPart = (ChainPart) this.onChainPart.invoke();
        if (chainPart != ChainPart.MIDDLE && chainPart != ChainPart.START) {
            z6 = false;
        }
        int dpToPx2 = z5 ? 0 : SizeUtilsKt.getDpToPx(8);
        if (z7 && z6) {
            dpToPx = SizeUtilsKt.getDpToPx(4);
        }
        ViewGroup.LayoutParams layoutParams = this.binding.accessoriesView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i7 = marginLayoutParams.topMargin;
        int i10 = marginLayoutParams.bottomMargin;
        if (i7 == dpToPx2 && i10 == dpToPx) {
            return;
        }
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dpToPx2, marginLayoutParams.rightMargin, dpToPx);
        this.binding.accessoriesView.setLayoutParams(marginLayoutParams);
    }

    private final void configureAuthor(Message message, ChatEventHandler eventHandler, ChainPart chainPart, MessageContext messageContext) {
        if (chainPart != ChainPart.START && chainPart != ChainPart.ONLY) {
            hideHeader();
            return;
        }
        TextView textView = this.binding.authorName;
        textView.setText(message.getUsername());
        Intrinsics.checkNotNull(textView);
        configureAuthorClickListeners(textView, message, eventHandler);
        textView.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
        MessageUtilsKt.clearOrSetRoleColors(textView, message);
        DisplayNameStylesUtils.INSTANCE.applyDisplayNameStyles(textView, message.getDisplayNameStyles());
        View roleDot = this.binding.roleDot;
        Intrinsics.checkNotNullExpressionValue(roleDot, "roleDot");
        configureAuthorClickListeners(roleDot, message, eventHandler);
        this.binding.timestamp.setText(message.getTimestamp());
        String timestampTooltip = message.getTimestampTooltip();
        if (timestampTooltip == null || StringsKt.K(timestampTooltip)) {
            TextView timestamp = this.binding.timestamp;
            Intrinsics.checkNotNullExpressionValue(timestamp, "timestamp");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(timestamp, false, null, 1, null);
        } else {
            TextView timestamp2 = this.binding.timestamp;
            Intrinsics.checkNotNullExpressionValue(timestamp2, "timestamp");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(timestamp2, false, new t(0, eventHandler, timestampTooltip), 1, null);
        }
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        Intrinsics.checkNotNull(simpleDraweeView);
        Context context = simpleDraweeView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(simpleDraweeView, MessageKt.avatarUrl(message, context));
        int i7 = 0;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, new n(i7, message, eventHandler), 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeView, false, new o(i7, message, eventHandler), 1, null);
        if (message.getAvatarDecorationURL() != null) {
            SimpleDraweeView authorAvatarDecoration = this.binding.authorAvatarDecoration;
            Intrinsics.checkNotNullExpressionValue(authorAvatarDecoration, "authorAvatarDecoration");
            authorAvatarDecoration.setVisibility(0);
            SimpleDraweeView authorAvatarDecoration2 = this.binding.authorAvatarDecoration;
            Intrinsics.checkNotNullExpressionValue(authorAvatarDecoration2, "authorAvatarDecoration");
            SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(authorAvatarDecoration2, message.getAvatarDecorationURL());
        } else {
            SimpleDraweeView authorAvatarDecoration3 = this.binding.authorAvatarDecoration;
            Intrinsics.checkNotNullExpressionValue(authorAvatarDecoration3, "authorAvatarDecoration");
            authorAvatarDecoration3.setVisibility(8);
            SimpleDraweeView authorAvatarDecoration4 = this.binding.authorAvatarDecoration;
            Intrinsics.checkNotNullExpressionValue(authorAvatarDecoration4, "authorAvatarDecoration");
            SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(authorAvatarDecoration4, null);
        }
        TextView timestamp3 = this.binding.timestamp;
        Intrinsics.checkNotNullExpressionValue(timestamp3, "timestamp");
        timestamp3.setVisibility(0);
        TextView authorName = this.binding.authorName;
        Intrinsics.checkNotNullExpressionValue(authorName, "authorName");
        authorName.setVisibility(0);
        SimpleDraweeView authorAvatar = this.binding.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        authorAvatar.setVisibility(0);
        if (!message.getShouldShowRoleDot() || (message.getRoleColor() == null && message.getRoleColors() == null)) {
            RoleDotView roleDot2 = this.binding.roleDot;
            Intrinsics.checkNotNullExpressionValue(roleDot2, "roleDot");
            roleDot2.setVisibility(8);
        } else {
            RoleDotView roleDot3 = this.binding.roleDot;
            Intrinsics.checkNotNullExpressionValue(roleDot3, "roleDot");
            roleDot3.setVisibility(0);
            RoleDotView roleDotView = this.binding.roleDot;
            RoleColors androidColors = RoleColorsKt.toAndroidColors(message.getRoleColors());
            if (androidColors == null) {
                androidColors = new RoleColors(MessageKt.roleDotColor$default(message, 0, 1, null), (Integer) null, (Integer) null, 6, (DefaultConstructorMarker) null);
            }
            RoleDotView.configure$default(roleDotView, androidColors, 0, 2, null);
        }
        if (message.getClanTag() == null || message.m265getClanTagGuildIdqOKuAAo() == null) {
            ClanTagChipletView clanTagChiplet = this.binding.clanTagChiplet;
            Intrinsics.checkNotNullExpressionValue(clanTagChiplet, "clanTagChiplet");
            clanTagChiplet.setVisibility(8);
        } else {
            ClanTagChipletView.m535configureETwJlQw$default(this.binding.clanTagChiplet, message.getClanTag(), message.getClanBadgeUrl(), message.m265getClanTagGuildIdqOKuAAo().m1152unboximpl(), eventHandler, 0.0f, messageContext.getTheme(), 16, null);
            ClanTagChipletView clanTagChiplet2 = this.binding.clanTagChiplet;
            Intrinsics.checkNotNullExpressionValue(clanTagChiplet2, "clanTagChiplet");
            clanTagChiplet2.setVisibility(0);
        }
        if (message.getLobbyAdditionalName() != null) {
            ClanTagChipletView.configure$default(this.binding.lobbyTagChiplet, message.getLobbyAdditionalName(), message.getLobbyTagIconUrl(), 0.0f, 4, null);
            ClanTagChipletView lobbyTagChiplet = this.binding.lobbyTagChiplet;
            Intrinsics.checkNotNullExpressionValue(lobbyTagChiplet, "lobbyTagChiplet");
            lobbyTagChiplet.setVisibility(0);
        } else {
            ClanTagChipletView lobbyTagChiplet2 = this.binding.lobbyTagChiplet;
            Intrinsics.checkNotNullExpressionValue(lobbyTagChiplet2, "lobbyTagChiplet");
            lobbyTagChiplet2.setVisibility(8);
        }
        if (message.getRoleIcon() != null) {
            this.binding.roleIcon.configureRoleIcon(message.getRoleIcon(), eventHandler);
            RoleIconView roleIcon = this.binding.roleIcon;
            Intrinsics.checkNotNullExpressionValue(roleIcon, "roleIcon");
            roleIcon.setVisibility(0);
        } else {
            RoleIconView roleIcon2 = this.binding.roleIcon;
            Intrinsics.checkNotNullExpressionValue(roleIcon2, "roleIcon");
            roleIcon2.setVisibility(8);
        }
        if (message.getVoiceChannelBadge() != null) {
            this.binding.voiceChannelBadge.configureVoiceChannelBadge(message.getVoiceChannelBadge(), eventHandler);
            VoiceChannelBadgeView voiceChannelBadge = this.binding.voiceChannelBadge;
            Intrinsics.checkNotNullExpressionValue(voiceChannelBadge, "voiceChannelBadge");
            voiceChannelBadge.setVisibility(0);
        } else {
            VoiceChannelBadgeView voiceChannelBadge2 = this.binding.voiceChannelBadge;
            Intrinsics.checkNotNullExpressionValue(voiceChannelBadge2, "voiceChannelBadge");
            voiceChannelBadge2.setVisibility(8);
        }
        if (message.getGameApplicationId() == null || message.getTimestamp() == null) {
            GameIconView gameIcon = this.binding.gameIcon;
            Intrinsics.checkNotNullExpressionValue(gameIcon, "gameIcon");
            gameIcon.setVisibility(8);
        } else {
            this.binding.gameIcon.configureGameIcon(message.getGameApplicationId(), message.getTimestamp(), eventHandler);
            GameIconView gameIcon2 = this.binding.gameIcon;
            Intrinsics.checkNotNullExpressionValue(gameIcon2, "gameIcon");
            gameIcon2.setVisibility(0);
        }
        if (message.getConnectionsRoleTag() != null) {
            this.binding.connectionsRoleTag.m537configureConnectionsRoleTaguESh2Cg(message.m263getAuthorIdwUX8bhU(), message.m266getGuildIdqOKuAAo(), ChannelId.m1130boximpl(message.m264getChannelIdo4g7jtM()), message.getConnectionsRoleTag(), eventHandler);
            ConnectionsRoleTagView connectionsRoleTag = this.binding.connectionsRoleTag;
            Intrinsics.checkNotNullExpressionValue(connectionsRoleTag, "connectionsRoleTag");
            connectionsRoleTag.setVisibility(0);
        } else {
            ConnectionsRoleTagView connectionsRoleTag2 = this.binding.connectionsRoleTag;
            Intrinsics.checkNotNullExpressionValue(connectionsRoleTag2, "connectionsRoleTag");
            connectionsRoleTag2.setVisibility(8);
        }
        if (message.getTagText() == null && message.getOpTagText() == null) {
            MessageTagView messageTagView = this.binding.messageTagView;
            Intrinsics.checkNotNullExpressionValue(messageTagView, "messageTagView");
            messageTagView.setVisibility(8);
        } else {
            MessageTagView messageTagView2 = this.binding.messageTagView;
            Intrinsics.checkNotNullExpressionValue(messageTagView2, "messageTagView");
            messageTagView2.setVisibility(0);
            this.binding.messageTagView.m570configureTagViewUl7AT2Q(message.getTagText(), message.getTagVerified(), message.getTagTextColor(), message.getTagBackgroundColor(), message.getOpTagText(), eventHandler, message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM(), message.getTagType(), message.getTagIconUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAuthor$lambda$48$lambda$46(Message message, ChatEventHandler chatEventHandler, View view) {
        if (message.m263getAuthorIdwUX8bhU() != null) {
            chatEventHandler.mo479onTapAvatarx5gers8(message.m267getId3Eiw7ao(), message.m263getAuthorIdwUX8bhU().m1217unboximpl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configureAuthor$lambda$48$lambda$47(Message message, ChatEventHandler chatEventHandler, View view) {
        if (message.m263getAuthorIdwUX8bhU() == null) {
            return true;
        }
        chatEventHandler.mo470onLongPressAvatarx5gers8(message.m267getId3Eiw7ao(), message.m263getAuthorIdwUX8bhU().m1217unboximpl());
        return true;
    }

    private final void configureAuthorClickListeners(View view, Message message, ChatEventHandler chatEventHandler) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(view, false, new n(1, message, chatEventHandler), 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(view, false, new o(1, message, chatEventHandler), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureAuthorClickListeners$lambda$16(Message message, ChatEventHandler chatEventHandler, View view) {
        if (message.m263getAuthorIdwUX8bhU() != null) {
            chatEventHandler.mo518onTapUsernamex5gers8(message.m267getId3Eiw7ao(), message.m263getAuthorIdwUX8bhU().m1217unboximpl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean configureAuthorClickListeners$lambda$17(Message message, ChatEventHandler chatEventHandler, View view) {
        if (message.m263getAuthorIdwUX8bhU() == null) {
            return true;
        }
        chatEventHandler.mo473onLongPressUsernamex5gers8(message.m267getId3Eiw7ao(), message.m263getAuthorIdwUX8bhU().m1217unboximpl());
        return true;
    }

    private final void configureCommunicationDisabled(boolean isCommunicationDisabled, ChatEventHandler eventHandler, ChainPart chainPart) {
        boolean z5 = isCommunicationDisabled && (chainPart == ChainPart.START || chainPart == ChainPart.ONLY);
        SimpleDraweeView guildCommunicationDisabledIcon = this.binding.guildCommunicationDisabledIcon;
        Intrinsics.checkNotNullExpressionValue(guildCommunicationDisabledIcon, "guildCommunicationDisabledIcon");
        guildCommunicationDisabledIcon.setVisibility(z5 ? 0 : 8);
        if (z5) {
            SimpleDraweeView guildCommunicationDisabledIcon2 = this.binding.guildCommunicationDisabledIcon;
            Intrinsics.checkNotNullExpressionValue(guildCommunicationDisabledIcon2, "guildCommunicationDisabledIcon");
            ReactAssetUtilsKt.setReactAsset(guildCommunicationDisabledIcon2, ReactAsset.ClockWarningIcon);
            SimpleDraweeView guildCommunicationDisabledIcon3 = this.binding.guildCommunicationDisabledIcon;
            Intrinsics.checkNotNullExpressionValue(guildCommunicationDisabledIcon3, "guildCommunicationDisabledIcon");
            ColorUtilsKt.setTintColor(guildCommunicationDisabledIcon3, Integer.valueOf(ThemeManagerKt.getTheme().getIconFeedbackCritical()));
            SimpleDraweeView guildCommunicationDisabledIcon4 = this.binding.guildCommunicationDisabledIcon;
            Intrinsics.checkNotNullExpressionValue(guildCommunicationDisabledIcon4, "guildCommunicationDisabledIcon");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(guildCommunicationDisabledIcon4, false, new m(eventHandler, 2), 1, null);
        }
        this.binding.authorAvatar.setAlpha(z5 ? 0.5f : 1.0f);
        this.binding.clanTagChiplet.setAlpha(z5 ? 0.5f : 1.0f);
        this.binding.lobbyTagChiplet.setAlpha(z5 ? 0.5f : 1.0f);
        this.binding.roleIcon.setAlpha(z5 ? 0.5f : 1.0f);
        this.binding.voiceChannelBadge.setAlpha(z5 ? 0.5f : 1.0f);
        this.binding.gameIcon.setAlpha(z5 ? 0.5f : 1.0f);
        this.binding.authorAvatarDecoration.setAlpha(z5 ? 0.5f : 1.0f);
        this.binding.suppressNotificationsIcon.setAlpha(z5 ? 0.5f : 1.0f);
    }

    private final void configureDivider(boolean showDivider) {
        View messageHeaderDivider = this.binding.messageHeaderDivider;
        Intrinsics.checkNotNullExpressionValue(messageHeaderDivider, "messageHeaderDivider");
        messageHeaderDivider.setVisibility(showDivider ? 0 : 8);
    }

    private final void configureSuppressNotifications(boolean isSuppressNotifications, ChatEventHandler eventHandler, ChainPart chainPart) {
        boolean z5 = isSuppressNotifications && (chainPart == ChainPart.START || chainPart == ChainPart.ONLY);
        SimpleDraweeView suppressNotificationsIcon = this.binding.suppressNotificationsIcon;
        Intrinsics.checkNotNullExpressionValue(suppressNotificationsIcon, "suppressNotificationsIcon");
        suppressNotificationsIcon.setVisibility(z5 ? 0 : 8);
        if (z5) {
            SimpleDraweeView suppressNotificationsIcon2 = this.binding.suppressNotificationsIcon;
            Intrinsics.checkNotNullExpressionValue(suppressNotificationsIcon2, "suppressNotificationsIcon");
            ReactAssetUtilsKt.setReactAsset(suppressNotificationsIcon2, ReactAsset.BellZIcon);
            SimpleDraweeView suppressNotificationsIcon3 = this.binding.suppressNotificationsIcon;
            Intrinsics.checkNotNullExpressionValue(suppressNotificationsIcon3, "suppressNotificationsIcon");
            ColorUtilsKt.setTintColor(suppressNotificationsIcon3, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
        }
        SimpleDraweeView suppressNotificationsIcon4 = this.binding.suppressNotificationsIcon;
        Intrinsics.checkNotNullExpressionValue(suppressNotificationsIcon4, "suppressNotificationsIcon");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(suppressNotificationsIcon4, false, new m(eventHandler, 1), 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<MessageAccessory> generateMessageAccessories(MessageMargins margins, Message message, MessageContext messageContext, Function6 onLongClick) {
        boolean z5;
        int i7;
        boolean z6;
        Message message2;
        DefaultConstructorMarker defaultConstructorMarker;
        MessageAccessory voiceChannelListInviteMessageAccessory;
        int i10;
        MessageAccessory guildInviteMessageAccessory;
        Message message3;
        List<Component> components;
        boolean z7;
        String strM267getId3Eiw7ao;
        int textMuted;
        Message message4 = message;
        this.accessories.clear();
        boolean z10 = true;
        boolean z11 = message4.getForwardInfo() != null;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        if (z11) {
            this.accessories.add(new ForwardHeaderMessageAccessory(message4.m267getId3Eiw7ao(), defaultConstructorMarker2));
        }
        Integer constrainedWidth = message4.getConstrainedWidth();
        int iIntValue = constrainedWidth != null ? constrainedWidth.intValue() : getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = messageContext.getUseAttachmentGridLayout() ? getContext().getResources().getDimensionPixelSize(R.dimen.message_media_radius) : getContext().getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius);
        StructurableText content = message4.getContent();
        if (content == null || !content.getHasContent() || message4.getType() == MessageType.CUSTOM_GIFT) {
            z5 = z11;
        } else {
            ArrayList<MessageAccessory> arrayList = this.accessories;
            String strM267getId3Eiw7ao2 = message4.m267getId3Eiw7ao();
            StructurableText content2 = message4.getContent();
            boolean zShouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message4);
            boolean zShouldShowLinkDecorations = MessageKt.shouldShowLinkDecorations(message4);
            boolean shouldShowRoleDot = message4.getShouldShowRoleDot();
            boolean shouldShowRoleOnName = message4.getShouldShowRoleOnName();
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
            Integer linkColor = message4.getLinkColor();
            int iIntValue2 = linkColor != null ? linkColor.intValue() : ThemeManagerKt.getTheme().getTextLink();
            DiscordFont discordFont = DiscordFont.PrimaryMedium;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int chatTextSizeSp = MessageUtilsKt.getChatTextSizeSp(context);
            MessageState state = message4.getState();
            int i11 = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                textMuted = ThemeManagerKt.getTheme().getTextMuted();
            } else {
                Integer textColor = message4.getTextColor();
                textMuted = textColor != null ? textColor.intValue() : ThemeManagerKt.getTheme().getTextDefault();
            }
            z5 = z11;
            arrayList.add(new MessageContentAccessory(strM267getId3Eiw7ao2, margins, content2, zShouldAnimateEmoji, zShouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, dimensionPixelSize2, iIntValue2, textMuted, discordFont, chatTextSizeSp, false, iIntValue, message4.getEdited(), message4.getEditedTimestamp(), message4.getEditedColor(), z5, messageContext.getTruncation(), messageContext.getTheme(), null));
        }
        if (message4.getPollData() != null && message4.getPollData().getLayoutType() != PollLayoutType.UNKNOWN) {
            ArrayList<MessageAccessory> arrayList2 = this.accessories;
            PollMessageAccessory.Companion companion = PollMessageAccessory.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            arrayList2.add(companion.create(context2, message4, message4.getPollData()));
        }
        if (message4.getSharedClientTheme() != null) {
            this.accessories.add(SharedCustomThemeMessageAccessory.INSTANCE.create(message4, message4.getSharedClientTheme()));
        }
        if (message4.getAttachments() == null || message4.getPollData() != null || MessageFlagKt.hasMessageFlag(Long.valueOf(message4.getFlags()), MessageFlag.IS_COMPONENTS_V2)) {
            i7 = dimensionPixelSize;
            z6 = true;
        } else {
            List<Attachment> attachments = message4.getAttachments();
            if (attachments != null && attachments.isEmpty()) {
                z7 = false;
                break;
            }
            Iterator<T> it = attachments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z7 = false;
                    break;
                }
                if (Intrinsics.areEqual(((Attachment) it.next()).getObscure(), Boolean.TRUE)) {
                    z7 = true;
                    break;
                }
            }
            x xVarM0 = CollectionsKt.m0(message4.getAttachments());
            ArrayList<IndexedValue> arrayList3 = new ArrayList();
            ArrayList<IndexedValue> arrayList4 = new ArrayList();
            Iterator it2 = xVarM0.iterator();
            while (true) {
                r0 r0Var = (r0) it2;
                if (!r0Var.f14666e.hasNext()) {
                    break;
                }
                Object next = r0Var.next();
                IndexedValue indexedValue = (IndexedValue) next;
                if (((Attachment) indexedValue.f14623b).type() == AttachmentType.Image || ((Attachment) indexedValue.f14623b).type() == AttachmentType.Video) {
                    arrayList3.add(next);
                } else {
                    arrayList4.add(next);
                }
            }
            if (arrayList3.isEmpty() || !messageContext.getUseAttachmentGridLayout()) {
                z6 = true;
            } else {
                if (!Intrinsics.areEqual(message4.isCurrentUserMessageAuthor(), Boolean.TRUE) || (strM267getId3Eiw7ao = message4.m268getNonceN_6c4I0()) == null) {
                    strM267getId3Eiw7ao = message4.m267getId3Eiw7ao();
                }
                String str = strM267getId3Eiw7ao;
                ArrayList<MessageAccessory> arrayList5 = this.accessories;
                long jM264getChannelIdo4g7jtM = message4.m264getChannelIdo4g7jtM();
                ArrayList arrayList6 = new ArrayList(e0.l(arrayList3, 10));
                for (IndexedValue indexedValue2 : arrayList3) {
                    boolean z12 = z10;
                    ArrayList arrayList7 = arrayList6;
                    int i12 = iIntValue;
                    iIntValue = i12;
                    arrayList7.add(CreateAttachmentAccessoryKt.createAttachmentAccessory((Attachment) indexedValue2.f14623b, message4, indexedValue2.f14622a, i12, getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius), ((Attachment) indexedValue2.f14623b).getVerifyAge()));
                    message4 = message;
                    arrayList6 = arrayList7;
                    z10 = z12;
                }
                z6 = z10;
                ArrayList arrayList8 = arrayList6;
                MessageState state2 = message.getState();
                if (state2 == null) {
                    state2 = MessageState.Unknown;
                }
                MessageState messageState = state2;
                Boolean gifAutoPlay = message.getGifAutoPlay();
                arrayList5.add(new MediaMosaicAttachmentMessageAccessory(str, margins, jM264getChannelIdo4g7jtM, arrayList8, iIntValue, z5, messageState, gifAutoPlay != null ? gifAutoPlay.booleanValue() : false, null));
            }
            ArrayList<MessageAccessory> arrayList9 = this.accessories;
            for (IndexedValue indexedValue3 : arrayList4) {
                Attachment attachment = (Attachment) indexedValue3.f14623b;
                int i13 = iIntValue;
                int i14 = dimensionPixelSize;
                iIntValue = i13;
                arrayList9.add(CreateAttachmentAccessoryKt.createAttachmentAccessory(attachment, message, indexedValue3.f14622a, i13, i14, attachment.getVerifyAge()));
                dimensionPixelSize = i14;
            }
            message4 = message;
            i7 = dimensionPixelSize;
            if (z7) {
                ArrayList<MessageAccessory> arrayList10 = this.accessories;
                String strM267getId3Eiw7ao3 = message4.m267getId3Eiw7ao();
                long jM264getChannelIdo4g7jtM2 = message4.m264getChannelIdo4g7jtM();
                String obscureLearnMoreLabel = message4.getObscureLearnMoreLabel();
                arrayList10.add(new InfoLinkMessageAccessory(strM267getId3Eiw7ao3, jM264getChannelIdo4g7jtM2, null, null, obscureLearnMoreLabel == null ? "" : obscureLearnMoreLabel, ReactAsset.CircleInformationIcon, null));
            }
        }
        List<PostPreviewEmbed> postPreviewEmbeds = message4.getPostPreviewEmbeds();
        if (postPreviewEmbeds != null) {
            int i15 = 0;
            for (Object obj : postPreviewEmbeds) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    d0.k();
                    throw null;
                }
                PostPreviewEmbed postPreviewEmbed = (PostPreviewEmbed) obj;
                this.accessories.add(new PostPreviewEmbedMessageAccessory(message4.m267getId3Eiw7ao(), postPreviewEmbed, i15, SpoilerAttributes.INSTANCE.forMediaPostPreviewEmbed(postPreviewEmbed, message4, i15, postPreviewEmbed.getVerifyAge()), null));
                i15 = i16;
            }
            Unit unit = Unit.f14616a;
        }
        List<Embed> embeds = message4.getEmbeds();
        if (embeds != null) {
            int i17 = 0;
            for (Object obj2 : embeds) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    d0.k();
                    throw null;
                }
                Embed embed = (Embed) obj2;
                EmbedType type = embed.getType();
                EmbedType embedType = EmbedType.Components;
                if (type != embedType || (components = embed.getComponents()) == null || components.isEmpty()) {
                    message3 = message4;
                    if (embed.getType() != embedType) {
                        this.accessories.add(new EmbedMessageAccessory(message3.m267getId3Eiw7ao(), margins, i17, message3.m264getChannelIdo4g7jtM(), iIntValue, i7, embed, MessageKt.shouldAutoPlayGifs(message3), MessageKt.shouldAnimateEmoji(message3), MessageKt.shouldShowLinkDecorations(message3), message3.getShouldShowRoleDot(), message3.getShouldShowRoleOnName(), SpoilerAttributes.INSTANCE.forEmbed(embed, message3, i17, embed.getVerifyAge()), generateMessageAccessories$getLongClickListener(onLongClick, message3, i17, MediaType.Embed), z5, null));
                        if (embed.getObscureOrNull() != null) {
                            ArrayList<MessageAccessory> arrayList11 = this.accessories;
                            String strM267getId3Eiw7ao4 = message3.m267getId3Eiw7ao();
                            long jM264getChannelIdo4g7jtM3 = message3.m264getChannelIdo4g7jtM();
                            String id2 = embed.getId();
                            String strH = (id2 == null || StringsKt.K(id2)) ? kk.b.h(i17, "index_") : embed.getId();
                            String obscureLearnMoreLabel2 = message3.getObscureLearnMoreLabel();
                            arrayList11.add(new InfoLinkMessageAccessory(strM267getId3Eiw7ao4, jM264getChannelIdo4g7jtM3, null, strH, obscureLearnMoreLabel2 == null ? "" : obscureLearnMoreLabel2, ReactAsset.CircleInformationIcon, null));
                        }
                    }
                    message4 = message3;
                    i17 = i18;
                } else {
                    ArrayList<MessageAccessory> arrayList12 = this.accessories;
                    MessageComponentsAccessory messageComponentsAccessory = new MessageComponentsAccessory(message.m267getId3Eiw7ao(), margins, message, embed.getComponents(), iIntValue, embed.getId(), null);
                    message3 = message;
                    arrayList12.add(messageComponentsAccessory);
                }
                message4 = message3;
                i17 = i18;
            }
            message2 = message4;
            Unit unit2 = Unit.f14616a;
        } else {
            message2 = message4;
        }
        List<GiftEmbed> giftCodes = message2.getGiftCodes();
        if (giftCodes != null) {
            int i19 = 0;
            for (Object obj3 : giftCodes) {
                int i20 = i19 + 1;
                if (i19 < 0) {
                    d0.k();
                    throw null;
                }
                this.accessories.add(new GiftMessageAccessory(message2.m267getId3Eiw7ao(), i19, (GiftEmbed) obj3, defaultConstructorMarker2));
                i19 = i20;
            }
            Unit unit3 = Unit.f14616a;
        }
        GiftEmbed referralTrialOffer = message2.getReferralTrialOffer();
        if (referralTrialOffer != null) {
            this.accessories.add(new GiftMessageAccessory(message2.m267getId3Eiw7ao(), 0, referralTrialOffer, defaultConstructorMarker2));
        }
        ActivityInstanceEmbed activityInstanceEmbed = message2.getActivityInstanceEmbed();
        if (activityInstanceEmbed != null) {
            this.accessories.add(new ActivityInstanceEmbedMessageAccessory(message2.m267getId3Eiw7ao(), margins, activityInstanceEmbed, iIntValue, null));
        }
        List<CodedLinkEmbed> codedLinks = message2.getCodedLinks();
        if (codedLinks != null) {
            int i21 = 0;
            for (Object obj4 : codedLinks) {
                int i22 = i21 + 1;
                if (i21 < 0) {
                    d0.k();
                    throw null;
                }
                CodedLinkEmbed codedLinkEmbed = (CodedLinkEmbed) obj4;
                if (codedLinkEmbed != null) {
                    ArrayList<MessageAccessory> arrayList13 = this.accessories;
                    if (codedLinkEmbed instanceof GuildEventInviteEmbedImpl) {
                        voiceChannelListInviteMessageAccessory = new GuildEventInviteMessageAccessory(message2.m267getId3Eiw7ao(), margins, i21, (GuildEventInviteEmbedImpl) codedLinkEmbed, MessageKt.shouldAnimateEmoji(message2), MessageKt.shouldShowLinkDecorations(message2), message2.getShouldShowRoleDot(), message2.getShouldShowRoleDot(), null);
                    } else {
                        if (codedLinkEmbed instanceof GuildInviteDisabledEmbedImpl) {
                            guildInviteMessageAccessory = new GuildInviteDisabledMessageAccessory(message2.m267getId3Eiw7ao(), i21, (GuildInviteDisabledEmbedImpl) codedLinkEmbed, defaultConstructorMarker2);
                        } else if (codedLinkEmbed instanceof GuildInviteEmbedImpl) {
                            guildInviteMessageAccessory = new GuildInviteMessageAccessory(message2.m267getId3Eiw7ao(), i21, (GuildInviteEmbedImpl) codedLinkEmbed, defaultConstructorMarker2);
                        } else {
                            if (codedLinkEmbed instanceof AppMessageEmbedImpl) {
                                i10 = iIntValue;
                                voiceChannelListInviteMessageAccessory = new AppMessageEmbedAccessory(message2.m267getId3Eiw7ao(), margins, i21, (AppMessageEmbedImpl) codedLinkEmbed, i10, null);
                            } else if (codedLinkEmbed instanceof EmbeddedActivityInviteEmbedImpl) {
                                i10 = iIntValue;
                                voiceChannelListInviteMessageAccessory = new EmbeddedActivityInviteMessageAccessory(message2.m267getId3Eiw7ao(), margins, i21, (EmbeddedActivityInviteEmbedImpl) codedLinkEmbed, i10, null);
                            } else if (codedLinkEmbed instanceof GuildProfileInviteEmbedImpl) {
                                voiceChannelListInviteMessageAccessory = new GuildProfileInviteMessageAccessory(message2.m267getId3Eiw7ao(), i21, (GuildProfileInviteEmbedImpl) codedLinkEmbed, defaultConstructorMarker2);
                            } else {
                                if (!(codedLinkEmbed instanceof VoiceChannelListInviteEmbedImpl)) {
                                    throw new rn.n();
                                }
                                voiceChannelListInviteMessageAccessory = new VoiceChannelListInviteMessageAccessory(message2.m267getId3Eiw7ao(), i21, (VoiceChannelListInviteEmbedImpl) codedLinkEmbed, defaultConstructorMarker2);
                            }
                            iIntValue = i10;
                        }
                        voiceChannelListInviteMessageAccessory = guildInviteMessageAccessory;
                    }
                    arrayList13.add(voiceChannelListInviteMessageAccessory);
                    Unit unit4 = Unit.f14616a;
                }
                i21 = i22;
            }
            Unit unit5 = Unit.f14616a;
        }
        List<Sticker> stickers = message2.getStickers();
        if (stickers != null) {
            Iterator<T> it3 = stickers.iterator();
            while (it3.hasNext()) {
                this.accessories.add(new StickerMessageAccessory(message2.m267getId3Eiw7ao(), (Sticker) it3.next(), defaultConstructorMarker2));
            }
            Unit unit6 = Unit.f14616a;
        }
        if (message2.getComponents() != null) {
            defaultConstructorMarker = null;
            this.accessories.add(new MessageComponentsAccessory(message.m267getId3Eiw7ao(), margins, message, message.getComponents(), iIntValue, null, 32, null));
        } else {
            defaultConstructorMarker = null;
        }
        ActivityRichPresenceInviteEmbed activityRichPresenceInviteEmbed = message.getActivityRichPresenceInviteEmbed();
        if (activityRichPresenceInviteEmbed != null) {
            this.accessories.add(new ActivityRichPresenceInviteEmbedMessageAccessory(message.m267getId3Eiw7ao(), margins, activityRichPresenceInviteEmbed, defaultConstructorMarker));
        }
        List<MessageReaction> reactions = message.getReactions();
        boolean z13 = reactions != null && (reactions.isEmpty() ^ true) == z6;
        if ((z13 && !message.isFirstForumPostMessage()) || messageContext.getContextType() == MessageContextType.MEDIA_VIEWER) {
            List<Embed> embeds2 = message.getEmbeds();
            String str2 = (embeds2 == null || embeds2.isEmpty()) ? "shortcut" : "embed";
            ArrayList<MessageAccessory> arrayList14 = this.accessories;
            String strM267getId3Eiw7ao5 = message.m267getId3Eiw7ao();
            List<MessageReaction> reactions2 = message.getReactions();
            if (reactions2 == null) {
                reactions2 = n0.f14659d;
            }
            arrayList14.add(new ReactionsMessageAccessory(strM267getId3Eiw7ao5, reactions2, messageContext.getCanAddNewReactions(), messageContext.getAddNewReactionAccessibilityLabel(), messageContext.getReactionsTheme(), null, str2, Intrinsics.areEqual(str2, "embed") ? 0 : defaultConstructorMarker, messageContext.getContextType() == MessageContextType.MEDIA_VIEWER && !z13, 32, null));
        }
        ThreadEmbed threadEmbed = message.getThreadEmbed();
        if (threadEmbed != null) {
            this.accessories.add(new ThreadEmbedMessageAccessory(message.m267getId3Eiw7ao(), threadEmbed, defaultConstructorMarker));
        }
        InteractionStatus interactionStatus = message.getInteractionStatus();
        if (interactionStatus != null) {
            this.accessories.add(new InteractionStatusMessageAccessory(message.m267getId3Eiw7ao(), interactionStatus, defaultConstructorMarker));
        }
        CtaButton ctaButton = message.getCtaButton();
        if (ctaButton != null) {
            this.accessories.add(new CtaButtonMessageAccessory(message.m264getChannelIdo4g7jtM(), message.m267getId3Eiw7ao(), ctaButton, message.getSecondaryCtaButton(), null));
        }
        EphemeralIndication ephemeralIndication = message.getEphemeralIndication();
        if (ephemeralIndication != null) {
            this.accessories.add(new EphemeralIndicationMessageAccessory(message.m267getId3Eiw7ao(), ephemeralIndication, defaultConstructorMarker));
        }
        SurveyIndication surveyIndication = message.getSurveyIndication();
        if (surveyIndication != null) {
            this.accessories.add(new SurveyIndicationMessageAccessory(message.m267getId3Eiw7ao(), surveyIndication, defaultConstructorMarker));
        }
        if (message.isFirstForumPostMessage() && message.getPostActions() != null && messageContext.getContextType() != MessageContextType.MEDIA_VIEWER) {
            this.accessories.add(new ForumPostActionBar(message.m267getId3Eiw7ao(), message.getPostActions(), message.getReactions(), messageContext.getCanAddNewReactions(), messageContext.getAddNewReactionAccessibilityLabel(), messageContext.getReactionsTheme(), null));
        }
        SafetyPolicyNoticeEmbed safetyPolicyNoticeEmbed = message.getSafetyPolicyNoticeEmbed();
        if (safetyPolicyNoticeEmbed != null) {
            this.accessories.add(new SafetyPolicyNoticeMessageAccessory(message.m267getId3Eiw7ao(), safetyPolicyNoticeEmbed, defaultConstructorMarker));
        }
        SafetySystemNotificationEmbed safetySystemNotificationEmbed = message.getSafetySystemNotificationEmbed();
        if (safetySystemNotificationEmbed != null) {
            this.accessories.add(new SafetySystemNotificationMessageAccessory(message.m267getId3Eiw7ao(), safetySystemNotificationEmbed, defaultConstructorMarker));
        }
        ForwardInfo forwardInfo = message.getForwardInfo();
        if (forwardInfo != null && forwardInfo.getFooterInfo() != null) {
            this.accessories.add(new ForwardBreadcrumbMessageAccessory(message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM(), message.getForwardInfo(), null));
        }
        if (message.getForwardInfo() != null) {
            h0.n(this.accessories, new bd.u(1, new ar.s(4)));
        }
        return this.accessories;
    }

    private static final View.OnLongClickListener generateMessageAccessories$getLongClickListener(final Function6 function6, final Message message, final int i7, final MediaType mediaType) {
        if (function6 != null) {
            return new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.p
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return MessageView.generateMessageAccessories$getLongClickListener$lambda$19$lambda$18(function6, message, i7, mediaType, view);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean generateMessageAccessories$getLongClickListener$lambda$19$lambda$18(Function6 function6, Message message, int i7, MediaType mediaType, View view) {
        function6.invoke(MessageId.m1156boximpl(message.m267getId3Eiw7ao()), ChannelId.m1130boximpl(message.m264getChannelIdo4g7jtM()), Integer.valueOf(i7), mediaType, null, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int generateMessageAccessories$lambda$42(MessageAccessory messageAccessory, MessageAccessory messageAccessory2) {
        if (messageAccessory.getIsForwardInner() || !messageAccessory2.getIsForwardInner()) {
            return (!messageAccessory.getIsForwardInner() || messageAccessory2.getIsForwardInner()) ? 0 : -1;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int generateMessageAccessories$lambda$43(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private final void hideHeader() {
        TextView timestamp = this.binding.timestamp;
        Intrinsics.checkNotNullExpressionValue(timestamp, "timestamp");
        timestamp.setVisibility(8);
        TextView authorName = this.binding.authorName;
        Intrinsics.checkNotNullExpressionValue(authorName, "authorName");
        authorName.setVisibility(8);
        SimpleDraweeView authorAvatar = this.binding.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        authorAvatar.setVisibility(8);
        SimpleDraweeView authorAvatarDecoration = this.binding.authorAvatarDecoration;
        Intrinsics.checkNotNullExpressionValue(authorAvatarDecoration, "authorAvatarDecoration");
        authorAvatarDecoration.setVisibility(8);
        RoleDotView roleDot = this.binding.roleDot;
        Intrinsics.checkNotNullExpressionValue(roleDot, "roleDot");
        roleDot.setVisibility(8);
        ClanTagChipletView clanTagChiplet = this.binding.clanTagChiplet;
        Intrinsics.checkNotNullExpressionValue(clanTagChiplet, "clanTagChiplet");
        clanTagChiplet.setVisibility(8);
        ClanTagChipletView lobbyTagChiplet = this.binding.lobbyTagChiplet;
        Intrinsics.checkNotNullExpressionValue(lobbyTagChiplet, "lobbyTagChiplet");
        lobbyTagChiplet.setVisibility(8);
        RoleIconView roleIcon = this.binding.roleIcon;
        Intrinsics.checkNotNullExpressionValue(roleIcon, "roleIcon");
        roleIcon.setVisibility(8);
        VoiceChannelBadgeView voiceChannelBadge = this.binding.voiceChannelBadge;
        Intrinsics.checkNotNullExpressionValue(voiceChannelBadge, "voiceChannelBadge");
        voiceChannelBadge.setVisibility(8);
        GameIconView gameIcon = this.binding.gameIcon;
        Intrinsics.checkNotNullExpressionValue(gameIcon, "gameIcon");
        gameIcon.setVisibility(8);
        ConnectionsRoleTagView connectionsRoleTag = this.binding.connectionsRoleTag;
        Intrinsics.checkNotNullExpressionValue(connectionsRoleTag, "connectionsRoleTag");
        connectionsRoleTag.setVisibility(8);
        MessageTagView messageTagView = this.binding.messageTagView;
        Intrinsics.checkNotNullExpressionValue(messageTagView, "messageTagView");
        messageTagView.setVisibility(8);
        SimpleDraweeView suppressNotificationsIcon = this.binding.suppressNotificationsIcon;
        Intrinsics.checkNotNullExpressionValue(suppressNotificationsIcon, "suppressNotificationsIcon");
        suppressNotificationsIcon.setVisibility(8);
    }

    private final void initReplyView() {
        View viewInflate = this.binding.replyPreviewView.inflate();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageViewReplyPreview");
        setReplyPreview((MessageViewReplyPreview) viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setMessage$default(MessageView messageView, Message message, MessageContext messageContext, ChatEventHandler chatEventHandler, ComponentProvider componentProvider, Function0 function0, boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        ChatEventHandler chatEventHandler2 = chatEventHandler;
        if ((i7 & 8) != 0) {
            componentProvider = null;
        }
        ComponentProvider componentProvider2 = componentProvider;
        if ((i7 & 16) != 0) {
            function0 = new com.discord.chat.presentation.list.f(8);
        }
        Function0 function1 = function0;
        if ((i7 & 32) != 0) {
            z5 = true;
        }
        messageView.setMessage(message, messageContext, chatEventHandler2, componentProvider2, function1, z5, (i7 & 64) != 0 ? false : z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMessage$lambda$11$lambda$10(Function2 function2, Message message, View view) {
        function2.invoke(MessageId.m1156boximpl(message.m267getId3Eiw7ao()), ChannelId.m1130boximpl(message.m264getChannelIdo4g7jtM()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setMessage$lambda$13$lambda$12(Function6 function6, Message message, View view) {
        function6.invoke(MessageId.m1156boximpl(message.m267getId3Eiw7ao()), ChannelId.m1130boximpl(message.m264getChannelIdo4g7jtM()), null, null, null, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setMessage$lambda$15$lambda$14(Function2 function2, Message message, View view) {
        function2.invoke(MessageId.m1156boximpl(message.m267getId3Eiw7ao()), ChannelId.m1130boximpl(message.m264getChannelIdo4g7jtM()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMessage$lambda$5(ChatEventHandler chatEventHandler, Message message) {
        ChatEventHandler.DefaultImpls.m521onInitiateReply8a0ehIg$default(chatEventHandler, message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM(), null, null, 12, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMessage$lambda$6(ChatEventHandler chatEventHandler, Message message) {
        chatEventHandler.mo467onInitiateThreadpfaIj0E(message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMessage$lambda$7(ChatEventHandler chatEventHandler, Message message) {
        chatEventHandler.mo465onInitiateEditpfaIj0E(message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMessage$lambda$9(ChatEventHandler chatEventHandler, Message message) {
        chatEventHandler.mo500onTapMessageReply0eiqbug(message.m264getChannelIdo4g7jtM(), message.m267getId3Eiw7ao());
        return Unit.f14616a;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public boolean getEnableSwipeToEdit() {
        return this.enableSwipeToEdit;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public boolean getEnableSwipeToReply() {
        return this.enableSwipeToReply;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    @NotNull
    public Function0<Unit> getOnInitiateEdit() {
        return this.onInitiateEdit;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    @NotNull
    public Function0<Unit> getOnInitiateReply() {
        return this.onInitiateReply;
    }

    @NotNull
    public final MessageViewReplyPreview getReplyPreview() {
        MessageViewReplyPreview messageViewReplyPreview = this.replyPreview;
        if (messageViewReplyPreview != null) {
            return messageViewReplyPreview;
        }
        Intrinsics.throwUninitializedPropertyAccessException("replyPreview");
        return null;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    @NotNull
    public MaskedShadowView getShadowView() {
        return this.shadowView;
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    @NotNull
    public View getSpineOriginView() {
        SimpleDraweeView authorAvatar = this.binding.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        return authorAvatar;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public boolean getUsingGradientTheme() {
        return this.usingGradientTheme;
    }

    @Override // com.discord.chat.presentation.list.FactoryCreatable
    public void onFactoryCreate() {
        initReplyView();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        return !this.allowChildGestures;
    }

    public final void onRecycledHint() {
        this.binding.accessoriesView.clear(false);
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void onSwipeEnd() {
        setClipChildren(true);
        getShadowView().setVisibility(4);
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void onSwipeStart() {
        setClipChildren(false);
        getShadowView().setVisibility(0);
    }

    public final void setAccessoriesRecycledViewPool(@NotNull RecyclerView.RecycledViewPool recycledViewPool) {
        Intrinsics.checkNotNullParameter(recycledViewPool, "recycledViewPool");
        this.binding.accessoriesView.setRecycledViewPool(recycledViewPool);
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setEnableSwipeToEdit(boolean z5) {
        this.enableSwipeToEdit = z5;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setEnableSwipeToReply(boolean z5) {
        this.enableSwipeToReply = z5;
    }

    public final void setMessage(@NotNull final Message message, @NotNull MessageContext messageContext, @NotNull final ChatEventHandler eventHandler, ComponentProvider componentProvider, @NotNull Function0<? extends ChainPart> onChainPart, boolean allowChildGestures, boolean renderContentOnly) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageContext, "messageContext");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(onChainPart, "onChainPart");
        bindKey(MessageId.m1156boximpl(message.m267getId3Eiw7ao()));
        String str = this.messageId;
        boolean zM1160equalsimpl0 = str == null ? false : MessageId.m1160equalsimpl0(str, message.m267getId3Eiw7ao());
        this.messageId = message.m267getId3Eiw7ao();
        if (!zM1160equalsimpl0 && messageContext.getContextType() == MessageContextType.SEARCH) {
            MessageAccessoriesView.clear$default(this.binding.accessoriesView, false, 1, null);
        }
        this.onChainPart = onChainPart;
        final int i7 = 0;
        setOnInitiateReply(new Function0() { // from class: com.discord.chat.presentation.message.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return MessageView.setMessage$lambda$5(eventHandler, message);
                    case 1:
                        return MessageView.setMessage$lambda$6(eventHandler, message);
                    case 2:
                        return MessageView.setMessage$lambda$7(eventHandler, message);
                    default:
                        return MessageView.setMessage$lambda$9(eventHandler, message);
                }
            }
        });
        final int i10 = 1;
        this.onInitiateThread = new Function0() { // from class: com.discord.chat.presentation.message.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return MessageView.setMessage$lambda$5(eventHandler, message);
                    case 1:
                        return MessageView.setMessage$lambda$6(eventHandler, message);
                    case 2:
                        return MessageView.setMessage$lambda$7(eventHandler, message);
                    default:
                        return MessageView.setMessage$lambda$9(eventHandler, message);
                }
            }
        };
        final int i11 = 2;
        setOnInitiateEdit(new Function0() { // from class: com.discord.chat.presentation.message.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return MessageView.setMessage$lambda$5(eventHandler, message);
                    case 1:
                        return MessageView.setMessage$lambda$6(eventHandler, message);
                    case 2:
                        return MessageView.setMessage$lambda$7(eventHandler, message);
                    default:
                        return MessageView.setMessage$lambda$9(eventHandler, message);
                }
            }
        });
        setEnableSwipeToReply(messageContext.getEnableSwipeToReply());
        setEnableSwipeToEdit(messageContext.getEnableSwipeToEdit());
        setUsingGradientTheme(messageContext.getUsingGradientTheme());
        this.allowChildGestures = allowChildGestures;
        ChainPart chainPart = (ChainPart) onChainPart.invoke();
        Integer timestampColor = message.getTimestampColor();
        if (timestampColor != null) {
            this.binding.timestamp.setTextColor(timestampColor.intValue());
        }
        configureDivider(messageContext.getShowDivider());
        if (message.getReferencedMessage() != null) {
            if (this.replyPreview == null) {
                initReplyView();
            }
            final int i12 = 3;
            MessageViewReplyPreview.configureReply$default(getReplyPreview(), message.getReferencedMessage(), false, new Function0() { // from class: com.discord.chat.presentation.message.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return MessageView.setMessage$lambda$5(eventHandler, message);
                        case 1:
                            return MessageView.setMessage$lambda$6(eventHandler, message);
                        case 2:
                            return MessageView.setMessage$lambda$7(eventHandler, message);
                        default:
                            return MessageView.setMessage$lambda$9(eventHandler, message);
                    }
                }
            }, 2, null);
        } else if (message.getExecutedCommand() != null) {
            if (this.replyPreview == null) {
                initReplyView();
            }
            getReplyPreview().m571configureExecutedCommanddB0bEw(message.m267getId3Eiw7ao(), message.getExecutedCommand(), MessageKt.shouldAnimateEmoji(message), MessageKt.shouldShowLinkDecorations(message), message.getShouldShowRoleDot(), message.getShouldShowRoleOnName(), eventHandler);
        } else if (this.replyPreview != null) {
            getReplyPreview().clear();
        }
        Function2<MessageId, ChannelId, Unit> function2Mo528getOnMessageTapped = eventHandler.mo528getOnMessageTapped();
        r rVar = function2Mo528getOnMessageTapped != null ? new r(function2Mo528getOnMessageTapped, message, 0) : null;
        Function6 function6Mo527getOnMessageLongPressed = eventHandler.getOnMessageLongPressed();
        s sVar = function6Mo527getOnMessageLongPressed != null ? new s(0, function6Mo527getOnMessageLongPressed, message) : null;
        Function2<MessageId, ChannelId, Unit> function2Mo526getOnMessageDoubleTapped = eventHandler.mo526getOnMessageDoubleTapped();
        NestedScrollOnTouchUtilsKt.setOnDoubleClickListenerNested(this, true, function2Mo526getOnMessageDoubleTapped != null ? new r(function2Mo526getOnMessageDoubleTapped, message, 1) : null);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, rVar);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, sVar);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        MessageMargins messageMargins = new MessageMargins(resources, messageContext, renderContentOnly);
        List<MessageAccessory> listGenerateMessageAccessories = generateMessageAccessories(messageMargins, message, messageContext, eventHandler.getOnMessageLongPressed());
        s sVar2 = sVar;
        this.binding.accessoriesView.m567setAccessoriesdvvEyHs(messageMargins, message.m267getId3Eiw7ao(), message.m264getChannelIdo4g7jtM(), message.m266getGuildIdqOKuAAo(), listGenerateMessageAccessories, eventHandler, componentProvider, message.getForwardInfo() != null);
        configureAccessoriesMargin(listGenerateMessageAccessories);
        configureCommunicationDisabled(Intrinsics.areEqual(message.getCommunicationDisabled(), Boolean.TRUE), eventHandler, chainPart);
        configureSuppressNotifications(MessageFlagKt.hasMessageFlag(Long.valueOf(message.getFlags()), MessageFlag.SUPPRESS_NOTIFICATIONS), eventHandler, chainPart);
        if (messageContext.getContextType() == MessageContextType.SEARCH) {
            hideHeader();
        } else {
            configureAuthor(message, eventHandler, chainPart, messageContext);
        }
        u0.p(this, new MessageViewAccessibilityDelegate(message, rVar, sVar2));
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setOnInitiateEdit(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onInitiateEdit = function0;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setOnInitiateReply(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onInitiateReply = function0;
    }

    @Override // android.view.View
    public void setPressed(boolean pressed) {
        super.setPressed(pressed && (isClickable() || isFocusable()));
    }

    public final void setReplyPreview(@NotNull MessageViewReplyPreview messageViewReplyPreview) {
        Intrinsics.checkNotNullParameter(messageViewReplyPreview, "<set-?>");
        this.replyPreview = messageViewReplyPreview;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setShadowView(@NotNull MaskedShadowView maskedShadowView) {
        Intrinsics.checkNotNullParameter(maskedShadowView, "<set-?>");
        this.shadowView = maskedShadowView;
    }

    @Override // com.discord.chat.presentation.list.SwipeReplyInitiator
    public void setUsingGradientTheme(boolean z5) {
        this.usingGradientTheme = z5;
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    @NotNull
    /* JADX INFO: renamed from: spacingPxOverride */
    public Integer getBottomSpacingPx() {
        int dpToPx;
        int i7 = WhenMappings.$EnumSwitchMapping$1[((ChainPart) this.onChainPart.invoke()).ordinal()];
        if (i7 == 1 || i7 == 2) {
            dpToPx = SizeUtilsKt.getDpToPx(16);
        } else {
            if (i7 != 3 && i7 != 4) {
                throw new rn.n();
            }
            dpToPx = 0;
        }
        return Integer.valueOf(dpToPx);
    }

    public /* synthetic */ MessageView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        MessageViewBinding messageViewBindingInflate = MessageViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(messageViewBindingInflate, "inflate(...)");
        this.binding = messageViewBindingInflate;
        setPadding(0, SizeUtilsKt.getDpToPx(2), 0, SizeUtilsKt.getDpToPx(2));
        RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
        TextView timestamp = messageViewBindingInflate.timestamp;
        Intrinsics.checkNotNullExpressionValue(timestamp, "timestamp");
        DiscordFontUtilsKt.setDiscordFont(timestamp, DiscordFont.PrimaryMedium);
        messageViewBindingInflate.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        TextView timestamp2 = messageViewBindingInflate.timestamp;
        Intrinsics.checkNotNullExpressionValue(timestamp2, "timestamp");
        SetTextSizeSpKt.setTextSizeSp(timestamp2, 12.0f, 15.0f);
        TextView authorName = messageViewBindingInflate.authorName;
        Intrinsics.checkNotNullExpressionValue(authorName, "authorName");
        DiscordFontUtilsKt.setDiscordFont(authorName, DiscordFont.PrimarySemibold);
        TextView authorName2 = messageViewBindingInflate.authorName;
        Intrinsics.checkNotNullExpressionValue(authorName2, "authorName");
        SetTextSizeSpKt.setTextSizeSp(authorName2, 16.0f, 20.0f);
        SimpleDraweeView authorAvatar = messageViewBindingInflate.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        ViewClippingUtilsKt.clipToCircle(authorAvatar);
        messageViewBindingInflate.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(context, R.color.message_divider_light, R.color.message_divider_dark));
        MaskedShadowView shadowView = messageViewBindingInflate.shadowView;
        Intrinsics.checkNotNullExpressionValue(shadowView, "shadowView");
        setShadowView(shadowView);
        getShadowView().setVisibility(4);
        setClipToPadding(false);
        this.onChainPart = new com.discord.chat.presentation.list.f(9);
        this.allowChildGestures = true;
        this.onInitiateReply = new com.discord.chat.presentation.list.f(10);
        this.onInitiateThread = new com.discord.chat.presentation.list.f(11);
        this.onInitiateEdit = new com.discord.chat.presentation.list.f(12);
        this.accessories = new ArrayList<>(2);
    }
}
