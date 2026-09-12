package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.activity_invites.RGBAColorModel;
import com.discord.chat.bridge.activities.EmbedDisplayType;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.ActivityRichPresenceInviteEmbedViewBinding;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.discord.overlapping_circles.OverlappingItem;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.common.assets.ReactFontManager;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 Y2\u00020\u0001:\u0001YB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJÉ\u0001\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\u0010 \u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020!2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020!2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020!2\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b)\u0010*J©\u0003\u0010M\u001a\u00020!2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020!012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020!042\"\u00107\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020!062*\u00109\u001a&\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020!082\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!042\u0018\u0010;\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!012:\u0010=\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020!0<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020!042\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020!042\f\u0010B\u001a\b\u0012\u0004\u0012\u00020!0A2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!042\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020!042\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020!042\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020!042\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020!04H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020!H\u0002¢\u0006\u0004\bN\u0010OJ¥\u0005\u0010U\u001a\u00020!2\u0006\u0010,\u001a\u00020+2\u0006\u0010Q\u001a\u00020P2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\r2\b\u0010 \u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\u001c\b\u0002\u00103\u001a\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020!\u0018\u0001012\u0016\b\u0002\u00105\u001a\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020!\u0018\u0001042&\b\u0002\u00107\u001a \u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020!\u0018\u0001062.\b\u0002\u00109\u001a(\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020!\u0018\u0001082\u0016\b\u0002\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!\u0018\u0001042\u001c\b\u0002\u0010;\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!\u0018\u0001012>\b\u0002\u0010=\u001a8\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020!\u0018\u00010<2\u0016\b\u0002\u0010?\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020!\u0018\u0001042\u0016\b\u0002\u0010@\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020!\u0018\u0001042\u0010\b\u0002\u0010B\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010A2\u0016\b\u0002\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020!\u0018\u0001042\u0016\b\u0002\u0010E\u001a\u0010\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020!\u0018\u0001042\u0016\b\u0002\u0010G\u001a\u0010\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020!\u0018\u0001042\u0016\b\u0002\u0010H\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020!\u0018\u0001042\u0016\b\u0002\u0010J\u001a\u0010\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020!\u0018\u000104¢\u0006\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lcom/discord/chat/presentation/message/view/ActivityRichPresenceInviteEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "isActive", "ctaButtonEnabled", "", "ctaButtonText", "ctaButtonIsLoading", "footerLabel", "", "Lcom/discord/activity_invites/RGBAColorModel;", "gradientColors", "headerText", "iconSrc", "isSpotifyParty", "maxPartySize", "Landroid/view/View$OnClickListener;", "onTapJoinRichPresence", "partyMemberAvatarURIs", "partySizeText", "platformIconKeys", "coverImageUrl", "detailsText", "subtitle", AlertFragment.ARG_TITLE, "", "configureNormalCard", "(ZZLjava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZILandroid/view/View$OnClickListener;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "avatarURIs", "setPartyAvatars", "(Ljava/util/List;I)V", "applyGradientBackground", "(Ljava/util/List;)V", "setCoverImage", "(Ljava/lang/String;)V", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "margins", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "hiddenContent", "Lcom/discord/primitives/MessageId;", "messageId", "Lkotlin/Function2;", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "Lkotlin/Function1;", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lkotlin/Function0;", "onTapSpoiler", "onTapTimestamp", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapSeeMore", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "configureHiddenContent-2dg2Uz0", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "configureHiddenContent", "resetViewState", "()V", "Lcom/discord/chat/bridge/activities/EmbedDisplayType;", "displayType", "hiddenEmbedMessageContent", "setActivityRichPresenceInviteEmbed-Uv5W4H4", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/activities/EmbedDisplayType;ZLjava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZILandroid/view/View$OnClickListener;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setActivityRichPresenceInviteEmbed", "Lcom/discord/chat/databinding/ActivityRichPresenceInviteEmbedViewBinding;", "binding", "Lcom/discord/chat/databinding/ActivityRichPresenceInviteEmbedViewBinding;", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityRichPresenceInviteEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/chat/presentation/message/view/ActivityRichPresenceInviteEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n257#2,2:464\n257#2,2:466\n257#2,2:468\n257#2,2:470\n257#2,2:472\n257#2,2:474\n257#2,2:476\n257#2,2:478\n257#2,2:480\n257#2,2:482\n257#2,2:484\n257#2,2:486\n257#2,2:488\n257#2,2:490\n257#2,2:492\n257#2,2:494\n257#2,2:496\n257#2,2:498\n257#2,2:500\n257#2,2:502\n257#2,2:504\n257#2,2:506\n257#2,2:508\n257#2,2:510\n257#2,2:512\n257#2,2:514\n257#2,2:516\n257#2,2:518\n257#2,2:524\n257#2,2:526\n257#2,2:528\n257#2,2:530\n257#2,2:536\n257#2,2:538\n257#2,2:540\n257#2,2:542\n257#2,2:544\n1563#3:520\n1634#3,3:521\n1563#3:532\n1634#3,3:533\n*S KotlinDebug\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/chat/presentation/message/view/ActivityRichPresenceInviteEmbedView\n*L\n141#1:464,2\n145#1:466,2\n156#1:468,2\n178#1:470,2\n238#1:472,2\n243#1:474,2\n245#1:476,2\n254#1:478,2\n256#1:480,2\n268#1:482,2\n271#1:484,2\n279#1:486,2\n281#1:488,2\n284#1:490,2\n288#1:492,2\n302#1:494,2\n306#1:496,2\n312#1:498,2\n314#1:500,2\n320#1:502,2\n322#1:504,2\n328#1:506,2\n330#1:508,2\n333#1:510,2\n334#1:512,2\n335#1:514,2\n336#1:516,2\n337#1:518,2\n358#1:524,2\n360#1:526,2\n366#1:528,2\n370#1:530,2\n393#1:536,2\n454#1:538,2\n455#1:540,2\n456#1:542,2\n457#1:544,2\n355#1:520\n355#1:521,3\n373#1:532\n373#1:533,3\n*E\n"})
public final class ActivityRichPresenceInviteEmbedView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int whiteAlpha70 = Color.argb(178, 255, 255, 255);

    @NotNull
    private final ActivityRichPresenceInviteEmbedViewBinding binding;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/ActivityRichPresenceInviteEmbedView$Companion;", "", "<init>", "()V", "whiteAlpha70", "", "getWhiteAlpha70", "()I", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWhiteAlpha70() {
            return ActivityRichPresenceInviteEmbedView.whiteAlpha70;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbedDisplayType.values().length];
            try {
                iArr[EmbedDisplayType.Blocked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmbedDisplayType.DeadCompact.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmbedDisplayType.Active.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EmbedDisplayType.Dead.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityRichPresenceInviteEmbedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void applyGradientBackground(List<RGBAColorModel> gradientColors) {
        if (gradientColors == null || gradientColors.isEmpty()) {
            View gradientBackground = this.binding.gradientBackground;
            Intrinsics.checkNotNullExpressionValue(gradientBackground, "gradientBackground");
            gradientBackground.setVisibility(8);
            return;
        }
        View gradientBackground2 = this.binding.gradientBackground;
        Intrinsics.checkNotNullExpressionValue(gradientBackground2, "gradientBackground");
        gradientBackground2.setVisibility(0);
        ArrayList arrayList = new ArrayList(e0.l(gradientColors, 10));
        for (RGBAColorModel rGBAColorModel : gradientColors) {
            arrayList.add(Integer.valueOf(Color.argb((int) (rGBAColorModel.getA() * 255), (int) rGBAColorModel.getR(), (int) rGBAColorModel.getG(), (int) rGBAColorModel.getB())));
        }
        int[] iArrH0 = CollectionsKt.h0(arrayList);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(iArrH0);
        gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(12));
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        this.binding.gradientBackground.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: configureHiddenContent-2dg2Uz0, reason: not valid java name */
    private final void m727configureHiddenContent2dg2Uz0(MessageMargins margins, StructurableText hiddenContent, String messageId, Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink, Function1<? super LinkContentNode, Unit> onLongTapLink, Function3 onTapChannel, Function4 onLongPressChannel, Function1<? super String, Unit> onTapAttachmentLink, Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, Function6 onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function1<? super MessageId, Unit> onTapSeeMore, Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
        this.binding.hiddenContent.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        MessageContentView hiddenContent2 = this.binding.hiddenContent;
        Intrinsics.checkNotNullExpressionValue(hiddenContent2, "hiddenContent");
        DiscordFontUtilsKt.setDiscordFont(hiddenContent2, DiscordFont.PrimaryNormal);
        MessageContentView hiddenContent3 = this.binding.hiddenContent;
        Intrinsics.checkNotNullExpressionValue(hiddenContent3, "hiddenContent");
        SetTextSizeSpKt.setTextSizeSp(hiddenContent3, 14.0f);
        MessageContentView.m747setMessageContenthYrISQc$default(this.binding.hiddenContent, margins, hiddenContent, messageId, true, true, false, false, new a(onTapLink, messageId, 0), onLongTapLink, onTapChannel, onLongPressChannel, onTapAttachmentLink, onLongPressAttachmentLink, onTapMention, onTapCommand, onLongPressCommand, null, onTapSpoiler, onTapTimestamp, onTapInlineCode, onTapEmoji, onTapSeeMore, onTapSoundmoji, null, 0, 0, false, null, null, null, null, null, null, false, -125763584, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureHiddenContent_2dg2Uz0$lambda$24(Function2 function2, String str, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(str), node);
        return Unit.f14616a;
    }

    private final void configureNormalCard(boolean isActive, boolean ctaButtonEnabled, String ctaButtonText, boolean ctaButtonIsLoading, String footerLabel, List<RGBAColorModel> gradientColors, String headerText, String iconSrc, boolean isSpotifyParty, int maxPartySize, View.OnClickListener onTapJoinRichPresence, List<String> partyMemberAvatarURIs, String partySizeText, List<String> platformIconKeys, String coverImageUrl, String detailsText, String subtitle, String title) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ColorUtilsKt.getColorCompat(context, ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630)), SizeUtilsKt.getDpToPx(12), null, 0, 12, null);
        if (!isActive && isSpotifyParty) {
            SimpleDraweeView activityIcon = this.binding.activityIcon;
            Intrinsics.checkNotNullExpressionValue(activityIcon, "activityIcon");
            ReactAssetUtilsKt.setReactAsset(activityIcon, ReactAsset.SpotifyNeutralIcon);
            SimpleDraweeView activityIcon2 = this.binding.activityIcon;
            Intrinsics.checkNotNullExpressionValue(activityIcon2, "activityIcon");
            activityIcon2.setVisibility(0);
        } else if (iconSrc != null) {
            Uri uri = v8.a.f21502a;
            this.binding.activityIcon.setImageURI(Uri.parse(iconSrc));
            SimpleDraweeView activityIcon3 = this.binding.activityIcon;
            Intrinsics.checkNotNullExpressionValue(activityIcon3, "activityIcon");
            activityIcon3.setVisibility(0);
        } else {
            SimpleDraweeView activityIcon4 = this.binding.activityIcon;
            Intrinsics.checkNotNullExpressionValue(activityIcon4, "activityIcon");
            activityIcon4.setVisibility(8);
        }
        TextView headerText2 = this.binding.headerText;
        Intrinsics.checkNotNullExpressionValue(headerText2, "headerText");
        ViewUtilsKt.setOptionalText(headerText2, headerText);
        TextView title2 = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        ViewUtilsKt.setOptionalText(title2, title);
        if (detailsText != null) {
            this.binding.detailsText.setText(detailsText);
            TextView detailsText2 = this.binding.detailsText;
            Intrinsics.checkNotNullExpressionValue(detailsText2, "detailsText");
            detailsText2.setVisibility(0);
        } else {
            TextView detailsText3 = this.binding.detailsText;
            Intrinsics.checkNotNullExpressionValue(detailsText3, "detailsText");
            detailsText3.setVisibility(8);
        }
        TextView subtitle2 = this.binding.subtitle;
        Intrinsics.checkNotNullExpressionValue(subtitle2, "subtitle");
        ViewUtilsKt.setOptionalText(subtitle2, subtitle);
        if (isActive) {
            if (isSpotifyParty) {
                SimpleDraweeView subtitleIcon = this.binding.subtitleIcon;
                Intrinsics.checkNotNullExpressionValue(subtitleIcon, "subtitleIcon");
                ReactAssetUtilsKt.setReactAsset(subtitleIcon, ReactAsset.MusicIcon);
            } else {
                SimpleDraweeView subtitleIcon2 = this.binding.subtitleIcon;
                Intrinsics.checkNotNullExpressionValue(subtitleIcon2, "subtitleIcon");
                ReactAssetUtilsKt.setReactAsset(subtitleIcon2, ReactAsset.GameControllerIcon);
            }
            SimpleDraweeView subtitleIcon3 = this.binding.subtitleIcon;
            Intrinsics.checkNotNullExpressionValue(subtitleIcon3, "subtitleIcon");
            subtitleIcon3.setVisibility(0);
            SimpleDraweeView subtitleIcon4 = this.binding.subtitleIcon;
            Intrinsics.checkNotNullExpressionValue(subtitleIcon4, "subtitleIcon");
            ColorUtilsKt.setTintColor(subtitleIcon4, Integer.valueOf(whiteAlpha70));
        } else {
            SimpleDraweeView subtitleIcon5 = this.binding.subtitleIcon;
            Intrinsics.checkNotNullExpressionValue(subtitleIcon5, "subtitleIcon");
            subtitleIcon5.setVisibility(8);
        }
        setPartyAvatars(partyMemberAvatarURIs, maxPartySize);
        if (partySizeText != null) {
            TextView partySizeText2 = this.binding.partySizeText;
            Intrinsics.checkNotNullExpressionValue(partySizeText2, "partySizeText");
            ViewUtilsKt.setOptionalText(partySizeText2, partySizeText);
            TextView partySizeText3 = this.binding.partySizeText;
            Intrinsics.checkNotNullExpressionValue(partySizeText3, "partySizeText");
            partySizeText3.setVisibility(0);
        } else {
            TextView partySizeText4 = this.binding.partySizeText;
            Intrinsics.checkNotNullExpressionValue(partySizeText4, "partySizeText");
            partySizeText4.setVisibility(8);
        }
        ConstraintLayout partyContainer = this.binding.partyContainer;
        Intrinsics.checkNotNullExpressionValue(partyContainer, "partyContainer");
        partyContainer.setVisibility(isActive ? 0 : 8);
        if (ctaButtonText != null) {
            DCDButton button = this.binding.button;
            Intrinsics.checkNotNullExpressionValue(button, "button");
            button.setVisibility(0);
            this.binding.button.setBackgroundColor(ThemeManagerKt.getTheme().getControlOverlayPrimaryBackgroundDefault());
            this.binding.button.setTextColor(Integer.valueOf(ThemeManagerKt.getTheme().getControlOverlayPrimaryTextDefault()));
            this.binding.button.setText(ctaButtonText);
            this.binding.button.setClickable(ctaButtonEnabled && !ctaButtonIsLoading);
            if (ctaButtonEnabled) {
                this.binding.button.setOnClickButtonListener(onTapJoinRichPresence);
            } else {
                this.binding.button.setOnClickButtonListener(null);
            }
            this.binding.button.setAlpha(ctaButtonEnabled ? 1.0f : 0.5f);
            this.binding.button.setLoading(ctaButtonIsLoading, true);
        } else {
            this.binding.button.setOnClickButtonListener(null);
            DCDButton button2 = this.binding.button;
            Intrinsics.checkNotNullExpressionValue(button2, "button");
            button2.setVisibility(8);
        }
        if (footerLabel == null || footerLabel.length() <= 0) {
            ConstraintLayout footerContainer = this.binding.footerContainer;
            Intrinsics.checkNotNullExpressionValue(footerContainer, "footerContainer");
            footerContainer.setVisibility(8);
            TextView footerLabel2 = this.binding.footerLabel;
            Intrinsics.checkNotNullExpressionValue(footerLabel2, "footerLabel");
            footerLabel2.setVisibility(8);
            SimpleDraweeView xboxIcon = this.binding.xboxIcon;
            Intrinsics.checkNotNullExpressionValue(xboxIcon, "xboxIcon");
            xboxIcon.setVisibility(8);
            SimpleDraweeView playstationIcon = this.binding.playstationIcon;
            Intrinsics.checkNotNullExpressionValue(playstationIcon, "playstationIcon");
            playstationIcon.setVisibility(8);
            SimpleDraweeView desktopIcon = this.binding.desktopIcon;
            Intrinsics.checkNotNullExpressionValue(desktopIcon, "desktopIcon");
            desktopIcon.setVisibility(8);
        } else {
            ConstraintLayout footerContainer2 = this.binding.footerContainer;
            Intrinsics.checkNotNullExpressionValue(footerContainer2, "footerContainer");
            footerContainer2.setVisibility(0);
            TextView footerLabel3 = this.binding.footerLabel;
            Intrinsics.checkNotNullExpressionValue(footerLabel3, "footerLabel");
            ViewUtilsKt.setOptionalText(footerLabel3, footerLabel);
            if (platformIconKeys == null || !platformIconKeys.contains("xbox")) {
                SimpleDraweeView xboxIcon2 = this.binding.xboxIcon;
                Intrinsics.checkNotNullExpressionValue(xboxIcon2, "xboxIcon");
                xboxIcon2.setVisibility(8);
            } else {
                SimpleDraweeView xboxIcon3 = this.binding.xboxIcon;
                Intrinsics.checkNotNullExpressionValue(xboxIcon3, "xboxIcon");
                ReactAssetUtilsKt.setReactAsset(xboxIcon3, ReactAsset.XboxNeutralIcon);
                SimpleDraweeView xboxIcon4 = this.binding.xboxIcon;
                Intrinsics.checkNotNullExpressionValue(xboxIcon4, "xboxIcon");
                ColorUtilsKt.setTintColor(xboxIcon4, Integer.valueOf(whiteAlpha70));
                SimpleDraweeView xboxIcon5 = this.binding.xboxIcon;
                Intrinsics.checkNotNullExpressionValue(xboxIcon5, "xboxIcon");
                xboxIcon5.setVisibility(0);
            }
            if (platformIconKeys == null || !platformIconKeys.contains("playstation")) {
                SimpleDraweeView playstationIcon2 = this.binding.playstationIcon;
                Intrinsics.checkNotNullExpressionValue(playstationIcon2, "playstationIcon");
                playstationIcon2.setVisibility(8);
            } else {
                SimpleDraweeView playstationIcon3 = this.binding.playstationIcon;
                Intrinsics.checkNotNullExpressionValue(playstationIcon3, "playstationIcon");
                ReactAssetUtilsKt.setReactAsset(playstationIcon3, ReactAsset.PlaystationNeutralIcon);
                SimpleDraweeView playstationIcon4 = this.binding.playstationIcon;
                Intrinsics.checkNotNullExpressionValue(playstationIcon4, "playstationIcon");
                ColorUtilsKt.setTintColor(playstationIcon4, Integer.valueOf(whiteAlpha70));
                SimpleDraweeView playstationIcon5 = this.binding.playstationIcon;
                Intrinsics.checkNotNullExpressionValue(playstationIcon5, "playstationIcon");
                playstationIcon5.setVisibility(0);
            }
            if (platformIconKeys == null || !platformIconKeys.contains("desktop")) {
                SimpleDraweeView desktopIcon2 = this.binding.desktopIcon;
                Intrinsics.checkNotNullExpressionValue(desktopIcon2, "desktopIcon");
                desktopIcon2.setVisibility(8);
            } else {
                SimpleDraweeView desktopIcon3 = this.binding.desktopIcon;
                Intrinsics.checkNotNullExpressionValue(desktopIcon3, "desktopIcon");
                ReactAssetUtilsKt.setReactAsset(desktopIcon3, ReactAsset.ScreenIcon);
                SimpleDraweeView desktopIcon4 = this.binding.desktopIcon;
                Intrinsics.checkNotNullExpressionValue(desktopIcon4, "desktopIcon");
                ColorUtilsKt.setTintColor(desktopIcon4, Integer.valueOf(whiteAlpha70));
                SimpleDraweeView desktopIcon5 = this.binding.desktopIcon;
                Intrinsics.checkNotNullExpressionValue(desktopIcon5, "desktopIcon");
                desktopIcon5.setVisibility(0);
            }
        }
        setCoverImage(coverImageUrl);
        applyGradientBackground(gradientColors);
        setAlpha(isActive ? 1.0f : 0.6f);
    }

    private final void resetViewState() {
        ConstraintLayout normalContainer = this.binding.normalContainer;
        Intrinsics.checkNotNullExpressionValue(normalContainer, "normalContainer");
        normalContainer.setVisibility(8);
        MessageContentView hiddenContent = this.binding.hiddenContent;
        Intrinsics.checkNotNullExpressionValue(hiddenContent, "hiddenContent");
        hiddenContent.setVisibility(8);
        BlockedApplicationEmbedView blockedView = this.binding.blockedView;
        Intrinsics.checkNotNullExpressionValue(blockedView, "blockedView");
        blockedView.setVisibility(8);
        ActivityRichPresenceInviteCompactDeadView compactDeadView = this.binding.compactDeadView;
        Intrinsics.checkNotNullExpressionValue(compactDeadView, "compactDeadView");
        compactDeadView.setVisibility(8);
        setBackground(null);
        setAlpha(1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$10(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$11(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$12(CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$13(CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$15(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$16(InlineCodeContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$17(EmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$18(SoundmojiContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$6(LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$7(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$8(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setActivityRichPresenceInviteEmbed_Uv5W4H4$lambda$9(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    private final void setCoverImage(String coverImageUrl) {
        SimpleDraweeView coverImage = this.binding.coverImage;
        Intrinsics.checkNotNullExpressionValue(coverImage, "coverImage");
        coverImage.setVisibility(coverImageUrl != null ? 0 : 8);
        if (coverImageUrl != null) {
            Uri uri = v8.a.f21502a;
            this.binding.coverImage.setImageURI(Uri.parse(coverImageUrl));
        }
    }

    private final void setPartyAvatars(List<String> avatarURIs, int maxPartySize) {
        if (avatarURIs == null) {
            avatarURIs = n0.f14659d;
        }
        if (avatarURIs.isEmpty()) {
            OverlappingCirclesView partyAvatars = this.binding.partyAvatars;
            Intrinsics.checkNotNullExpressionValue(partyAvatars, "partyAvatars");
            partyAvatars.setVisibility(8);
            return;
        }
        int iMax = Math.max(0, maxPartySize - avatarURIs.size());
        ArrayList arrayList = new ArrayList(e0.l(avatarURIs, 10));
        Iterator<T> it = avatarURIs.iterator();
        while (it.hasNext()) {
            arrayList.add(new OverlappingItem((String) it.next()));
        }
        OverlappingItem[] elements = new OverlappingItem[iMax];
        for (int i7 = 0; i7 < iMax; i7++) {
            elements[i7] = new OverlappingItem(null);
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        ArrayList arrayList2 = new ArrayList(arrayList.size() + iMax);
        arrayList2.addAll(arrayList);
        i0.q(arrayList2, elements);
        this.binding.partyAvatars.setItems(arrayList2);
        OverlappingCirclesView partyAvatars2 = this.binding.partyAvatars;
        Intrinsics.checkNotNullExpressionValue(partyAvatars2, "partyAvatars");
        partyAvatars2.setVisibility(0);
    }

    /* JADX INFO: renamed from: setActivityRichPresenceInviteEmbed-Uv5W4H4, reason: not valid java name */
    public final void m729setActivityRichPresenceInviteEmbedUv5W4H4(@NotNull MessageMargins margins, @NotNull EmbedDisplayType displayType, boolean ctaButtonEnabled, String ctaButtonText, boolean ctaButtonIsLoading, String footerLabel, List<RGBAColorModel> gradientColors, String headerText, String iconSrc, boolean isSpotifyParty, int maxPartySize, @NotNull View.OnClickListener onTapJoinRichPresence, List<String> partyMemberAvatarURIs, String partySizeText, List<String> platformIconKeys, String coverImageUrl, String detailsText, String subtitle, String title, StructurableText hiddenEmbedMessageContent, String messageId, Function2<? super MessageId, ? super LinkContentNode, Unit> onTapLink, Function1<? super LinkContentNode, Unit> onLongTapLink, Function3 onTapChannel, Function4 onLongPressChannel, Function1<? super String, Unit> onTapAttachmentLink, Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, Function6 onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, Function0<Unit> onTapSpoiler, Function1<? super String, Unit> onTapTimestamp, Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function1<? super MessageId, Unit> onTapSeeMore, Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(displayType, "displayType");
        Intrinsics.checkNotNullParameter(onTapJoinRichPresence, "onTapJoinRichPresence");
        resetViewState();
        int i7 = WhenMappings.$EnumSwitchMapping$0[displayType.ordinal()];
        if (i7 == 1) {
            BlockedApplicationEmbedView blockedView = this.binding.blockedView;
            Intrinsics.checkNotNullExpressionValue(blockedView, "blockedView");
            blockedView.setVisibility(0);
            this.binding.blockedView.configure(headerText, subtitle);
            return;
        }
        if (i7 == 2) {
            ActivityRichPresenceInviteCompactDeadView compactDeadView = this.binding.compactDeadView;
            Intrinsics.checkNotNullExpressionValue(compactDeadView, "compactDeadView");
            compactDeadView.setVisibility(0);
            this.binding.compactDeadView.configure(headerText, title, subtitle, iconSrc, gradientColors);
            return;
        }
        if (i7 != 3 && i7 != 4) {
            throw new rn.n();
        }
        if (hiddenEmbedMessageContent == null || messageId == null) {
            ConstraintLayout normalContainer = this.binding.normalContainer;
            Intrinsics.checkNotNullExpressionValue(normalContainer, "normalContainer");
            normalContainer.setVisibility(0);
            configureNormalCard(displayType == EmbedDisplayType.Active, ctaButtonEnabled, ctaButtonText, ctaButtonIsLoading, footerLabel, gradientColors, headerText, iconSrc, isSpotifyParty, maxPartySize, onTapJoinRichPresence, partyMemberAvatarURIs, partySizeText, platformIconKeys, coverImageUrl, detailsText, subtitle, title);
            return;
        }
        MessageContentView hiddenContent = this.binding.hiddenContent;
        Intrinsics.checkNotNullExpressionValue(hiddenContent, "hiddenContent");
        hiddenContent.setVisibility(0);
        m727configureHiddenContent2dg2Uz0(margins, hiddenEmbedMessageContent, messageId, onTapLink == null ? new Function2<MessageId, LinkContentNode, Unit>() { // from class: com.discord.chat.presentation.message.view.ActivityRichPresenceInviteEmbedView$setActivityRichPresenceInviteEmbed$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m730invokentcYbpo(((MessageId) obj).m1165unboximpl(), (LinkContentNode) obj2);
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke-ntcYbpo, reason: not valid java name */
            public final void m730invokentcYbpo(String str, LinkContentNode linkContentNode) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter(linkContentNode, "<unused var>");
            }
        } : onTapLink, onLongTapLink == null ? new com.discord.chat.presentation.list.delegate.a(4) : onLongTapLink, onTapChannel == null ? new b(0) : onTapChannel, onLongPressChannel == null ? new c(0) : onLongPressChannel, onTapAttachmentLink == null ? new com.discord.chat.presentation.list.delegate.a(8) : onTapAttachmentLink, onLongPressAttachmentLink == null ? new ar.s(5) : onLongPressAttachmentLink, onTapMention == null ? new d(0) : onTapMention, onTapCommand == null ? new com.discord.chat.presentation.list.delegate.a(1) : onTapCommand, onLongPressCommand == null ? new com.discord.chat.presentation.list.delegate.a(2) : onLongPressCommand, onTapSpoiler == null ? new com.discord.chat.presentation.list.f(13) : onTapSpoiler, onTapTimestamp == null ? new com.discord.chat.presentation.list.delegate.a(3) : onTapTimestamp, onTapInlineCode == null ? new com.discord.chat.presentation.list.delegate.a(5) : onTapInlineCode, onTapEmoji == null ? new com.discord.chat.presentation.list.delegate.a(6) : onTapEmoji, onTapSeeMore == null ? new Function1<MessageId, Unit>() { // from class: com.discord.chat.presentation.message.view.ActivityRichPresenceInviteEmbedView$setActivityRichPresenceInviteEmbed$14
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m731invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
            public final void m731invoke1xi1bu0(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }
        } : onTapSeeMore, onTapSoundmoji == null ? new com.discord.chat.presentation.list.delegate.a(7) : onTapSoundmoji);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityRichPresenceInviteEmbedView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ActivityRichPresenceInviteEmbedView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityRichPresenceInviteEmbedView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        ActivityRichPresenceInviteEmbedViewBinding activityRichPresenceInviteEmbedViewBindingInflate = ActivityRichPresenceInviteEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(activityRichPresenceInviteEmbedViewBindingInflate, "inflate(...)");
        this.binding = activityRichPresenceInviteEmbedViewBindingInflate;
        setClipToOutline(true);
        setMaxWidth(SizeUtilsKt.getDpToPx(ReactFontManager.TypefaceStyle.NORMAL));
        TextView textView = activityRichPresenceInviteEmbedViewBindingInflate.headerText;
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 14.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        TextView textView2 = activityRichPresenceInviteEmbedViewBindingInflate.title;
        Intrinsics.checkNotNull(textView2);
        SetTextSizeSpKt.setTextSizeSp(textView2, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        TextView textView3 = activityRichPresenceInviteEmbedViewBindingInflate.detailsText;
        Intrinsics.checkNotNull(textView3);
        SetTextSizeSpKt.setTextSizeSp(textView3, 12.0f);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont2);
        TextView textView4 = activityRichPresenceInviteEmbedViewBindingInflate.subtitle;
        Intrinsics.checkNotNull(textView4);
        SetTextSizeSpKt.setTextSizeSp(textView4, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView4, discordFont2);
        TextView textView5 = activityRichPresenceInviteEmbedViewBindingInflate.partySizeText;
        Intrinsics.checkNotNull(textView5);
        SetTextSizeSpKt.setTextSizeSp(textView5, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView5, discordFont2);
        TextView textView6 = activityRichPresenceInviteEmbedViewBindingInflate.footerLabel;
        Intrinsics.checkNotNull(textView6);
        SetTextSizeSpKt.setTextSizeSp(textView6, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(textView6, discordFont2);
    }
}
