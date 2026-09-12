package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.r0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.embed.Embed;
import com.discord.chat.bridge.embed.EmbedAuthor;
import com.discord.chat.bridge.embed.EmbedFailureState;
import com.discord.chat.bridge.embed.EmbedField;
import com.discord.chat.bridge.embed.EmbedFooter;
import com.discord.chat.bridge.embed.EmbedProvider;
import com.discord.chat.bridge.embed.EmbedThumbnail;
import com.discord.chat.bridge.embed.EmbedType;
import com.discord.chat.bridge.embed.EmbedUtilsKt;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.EmbedViewBinding;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.utils.GetMediaImagePlaceholderStatesListenerKt;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.media_player.MediaSource;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.misc.utilities.view.ViewGroupUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u008b\u0004\u0010?\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2 \u0010\u001e\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2\u001c\u0010!\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u001c0\u001f2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0\u001f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001c0&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001c0&2\"\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2:\u00100\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001c0&2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u001c0&2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0&2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u00142\u0006\u0010<\u001a\u00020\u0014¢\u0006\u0004\b=\u0010>J9\u0010B\u001a\u00020\u001c2\b\u0010@\u001a\u0004\u0018\u00010(2\n\b\u0001\u0010A\u001a\u0004\u0018\u00010\u00102\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001c0&H\u0002¢\u0006\u0004\bB\u0010CJK\u0010K\u001a\u00020\u001c2\u0006\u0010D\u001a\u00020\u001b2\b\u0010F\u001a\u0004\u0018\u00010E2\n\b\u0001\u0010G\u001a\u0004\u0018\u00010\u00102\b\u0010I\u001a\u0004\u0018\u00010H2\u0012\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0&H\u0002¢\u0006\u0004\bK\u0010LJ+\u0010O\u001a\u00020\u001c2\b\u0010M\u001a\u0004\u0018\u00010\u001b2\b\u0010N\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bO\u0010PJ-\u0010R\u001a\u00020\u001c2\b\u0010Q\u001a\u0004\u0018\u00010H2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001c0&H\u0002¢\u0006\u0004\bR\u0010SJ_\u0010Z\u001a\u00020\u001c2\b\u0010U\u001a\u0004\u0018\u00010T2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010V\u001a\u0004\u0018\u00010\u001b2\b\u0010W\u001a\u0004\u0018\u00010\u001b2 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002¢\u0006\u0004\bX\u0010YJ?\u0010^\u001a\u00020\u001c2\u0006\u0010[\u001a\u00020\u001b2\b\u0010\\\u001a\u0004\u0018\u00010E2\b\b\u0001\u0010]\u001a\u00020\u00102\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001c0&H\u0002¢\u0006\u0004\b^\u0010_J±\u0002\u0010f\u001a\u00020\u001c2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0`2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0\u001f2\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0&2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001c0&2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0*2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u001c0&2\"\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0\u001a2:\u00100\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0012\u0004\u0012\u00020\u001c0/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001c0&2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0&H\u0002¢\u0006\u0004\bd\u0010eJ#\u0010i\u001a\u00020\u001c2\u0006\u0010g\u001a\u00020\u00142\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bi\u0010jJ\u001b\u0010l\u001a\u00020\u001c2\n\b\u0001\u0010k\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\bl\u0010mJ7\u0010s\u001a\u00020\u001c2\u0006\u0010o\u001a\u00020n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010q\u001a\u00020p2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010r\u001a\u00020\u0010H\u0002¢\u0006\u0004\bs\u0010tJ?\u0010w\u001a\u00020\u001c2\b\u0010u\u001a\u0004\u0018\u00010\u001b2\b\u0010v\u001a\u0004\u0018\u00010\u001b2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u001c0&2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\bw\u0010xJ;\u0010}\u001a\u00020\u001c2\b\u0010y\u001a\u0004\u0018\u00010\u001b2\b\b\u0001\u0010z\u001a\u00020\u00102\n\b\u0002\u0010{\u001a\u0004\u0018\u00010\u001b2\n\b\u0003\u0010|\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b}\u0010~J4\u0010\u0080\u0001\u001a\u00020\u001c2\b\u00107\u001a\u0004\u0018\u0001062\u0006\u0010\u007f\u001a\u00020\u00142\u0006\u0010:\u001a\u00020\u00142\u0006\u0010;\u001a\u00020\u0014H\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0012\u0010\u0084\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0083\u0001J\u0012\u0010\u0085\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0083\u0001J\u0012\u0010\u0086\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0083\u0001J\u0012\u0010\u0087\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0083\u0001J\u0012\u0010\u0088\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001J\u0012\u0010\u0089\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u0083\u0001J\u0012\u0010\u008a\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0083\u0001J\u0012\u0010\u008b\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u0083\u0001J\u0012\u0010\u008c\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u0083\u0001J\u0012\u0010\u008d\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u0083\u0001J\u0012\u0010\u008e\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u0083\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000b\u0010\u0092\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/discord/chat/presentation/message/view/EmbedView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "margins", "Lcom/discord/chat/bridge/embed/Embed;", "embed", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/MessageId;", "messageId", "", "constrainedWidth", "maxHeightPx", "radiusPx", "", "shouldAutoPlayGifs", "shouldAnimateEmoji", "shouldShowLinkDecorations", "shouldShowRoleDot", "shouldShowRoleOnName", "Lkotlin/Function3;", "", "", "onTitleLinkClicked", "onAuthorLinkClicked", "Lkotlin/Function2;", "", "onMediaClicked", "Landroid/view/View$OnLongClickListener;", "onMediaLongClicked", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onLinkClicked", "Lkotlin/Function1;", "onLongTapLinkNode", "", "onTapCopyText", "Lkotlin/Function0;", "onTapSpoiler", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "onTapChannel", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "onTapTimestamp", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "spoilerConfig", "portal", "isObscure", "obscureHideControls", "obscureIsOpaque", "isForwardedContent", "setEmbed-fDtLluY", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/embed/Embed;JLjava/lang/String;IIIZZZZZLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Landroid/view/View$OnLongClickListener;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/discord/chat/bridge/spoiler/SpoilerConfig;DZZZZ)V", "setEmbed", "provider", "providerColor", "setProvider", "(Ljava/lang/CharSequence;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;)V", "rawTitle", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", AlertFragment.ARG_TITLE, "titleColor", "Landroid/view/View$OnClickListener;", "onClickListener", "onLongClickListener", "setTitle", "(Ljava/lang/String;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;Ljava/lang/Integer;Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;)V", "authorUrl", "authorName", "setAuthor", "(Ljava/lang/String;Ljava/lang/String;Z)V", "listener", "setAuthorOnClickListener", "(Landroid/view/View$OnClickListener;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/bridge/embed/EmbedThumbnail;", "thumbnail", "embedUrl", "embedTitle", "setThumbnail-xk5Fe9g", "(Lcom/discord/chat/bridge/embed/EmbedThumbnail;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)V", "setThumbnail", "rawDescription", "description", "descriptionColor", "setDescription", "(Ljava/lang/String;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ILkotlin/jvm/functions/Function1;)V", "", "Lcom/discord/chat/bridge/embed/EmbedField;", "fields", "onLinkLongClicked", "setFields-oCLp7l4", "(Ljava/util/List;Ljava/lang/String;ZZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "setFields", "isBackgroundColorEnabled", ViewProps.BACKGROUND_COLOR, "setBackgroundColorEnabled", "(ZLjava/lang/Integer;)V", ViewProps.COLOR, "setBorder", "(Ljava/lang/Integer;)V", "Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;", "mediaView", "Lcom/discord/media_player/MediaSource;", "mediaSource", "maxWidthPx", "setMediaEmbed", "(Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;Lcom/discord/chat/bridge/embed/Embed;Lcom/discord/media_player/MediaSource;II)V", "imageUrl", "text", "setFooter", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Z)V", "error", "textColor", "iconURL", "iconTint", "setError", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "isObscureAwaitingScan", "configureSpoiler", "(Lcom/discord/chat/bridge/spoiler/SpoilerConfig;ZZZ)V", "reset", "()V", "clearInlineMedia", "clearBorder", "clearThumbnail", "clearProvider", "clearAuthor", "clearTitle", "clearDescription", "clearFields", "clearMedia", "clearFooter", "clearError", "Lcom/discord/chat/databinding/EmbedViewBinding;", "binding", "Lcom/discord/chat/databinding/EmbedViewBinding;", "Lcom/discord/chat/bridge/embed/Embed;", "maxThumbnailSize", "I", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmbedView.kt\ncom/discord/chat/presentation/message/view/EmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,713:1\n257#2,2:714\n257#2,2:719\n257#2,2:722\n257#2,2:727\n257#2,2:729\n257#2,2:731\n257#2,2:733\n257#2,2:735\n257#2,2:738\n257#2,2:741\n257#2,2:743\n257#2,2:745\n257#2,2:747\n257#2,2:749\n257#2,2:751\n257#2,2:753\n1878#3,3:716\n1878#3,3:724\n1#4:721\n13472#5:737\n13473#5:740\n*S KotlinDebug\n*F\n+ 1 EmbedView.kt\ncom/discord/chat/presentation/message/view/EmbedView\n*L\n143#1:714,2\n404#1:719,2\n496#1:722,2\n557#1:727,2\n571#1:729,2\n586#1:731,2\n615#1:733,2\n628#1:735,2\n654#1:738,2\n663#1:741,2\n678#1:743,2\n691#1:745,2\n697#1:747,2\n704#1:749,2\n705#1:751,2\n710#1:753,2\n300#1:716,3\n498#1:724,3\n651#1:737\n651#1:740\n*E\n"})
public final class EmbedView extends FrameLayout {

    @NotNull
    private final EmbedViewBinding binding;
    private Embed embed;
    private int maxThumbnailSize;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmbedType.values().length];
            try {
                iArr[EmbedType.Rich.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbedView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void clearAuthor() {
        TextView authorName = this.binding.authorName;
        Intrinsics.checkNotNullExpressionValue(authorName, "authorName");
        ViewUtilsKt.setOptionalText(authorName, null);
        SimpleDraweeView authorAvatar = this.binding.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(authorAvatar, null, null, null, null, null, null, 62, null);
        LinearLayout authorContainer = this.binding.authorContainer;
        Intrinsics.checkNotNullExpressionValue(authorContainer, "authorContainer");
        authorContainer.setVisibility(8);
    }

    private final void clearBorder() {
        View border = this.binding.border;
        Intrinsics.checkNotNullExpressionValue(border, "border");
        border.setVisibility(8);
    }

    private final void clearDescription() {
        SimpleDraweeSpanTextView description = this.binding.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(description, null);
    }

    private final void clearError() {
        TextView error = this.binding.error;
        Intrinsics.checkNotNullExpressionValue(error, "error");
        ViewUtilsKt.setOptionalText(error, null);
        SimpleDraweeView errorIcon = this.binding.errorIcon;
        Intrinsics.checkNotNullExpressionValue(errorIcon, "errorIcon");
        errorIcon.setVisibility(8);
    }

    private final void clearFields() {
        LinearLayout fieldsContainer = this.binding.fieldsContainer;
        Intrinsics.checkNotNullExpressionValue(fieldsContainer, "fieldsContainer");
        fieldsContainer.setVisibility(8);
    }

    private final void clearFooter() {
        TextView footerText = this.binding.footerText;
        Intrinsics.checkNotNullExpressionValue(footerText, "footerText");
        ViewUtilsKt.setOptionalText(footerText, null);
        SimpleDraweeView footerAvatar = this.binding.footerAvatar;
        Intrinsics.checkNotNullExpressionValue(footerAvatar, "footerAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(footerAvatar, null, null, null, null, null, null, 62, null);
        LinearLayout footerContainer = this.binding.footerContainer;
        Intrinsics.checkNotNullExpressionValue(footerContainer, "footerContainer");
        footerContainer.setVisibility(8);
        Space spacer = this.binding.spacer;
        Intrinsics.checkNotNullExpressionValue(spacer, "spacer");
        spacer.setVisibility(0);
    }

    private final void clearInlineMedia() {
        EmbedViewBinding embedViewBinding = this.binding;
        EmbedViewResizingMediaView[] embedViewResizingMediaViewArr = {embedViewBinding.inlineMediaView, embedViewBinding.inlineMediaView2, embedViewBinding.inlineMediaView3, embedViewBinding.inlineMediaView4};
        for (int i7 = 0; i7 < 4; i7++) {
            EmbedViewResizingMediaView embedViewResizingMediaView = embedViewResizingMediaViewArr[i7];
            MediaView.setMediaData$default(embedViewResizingMediaView, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524286, null);
            embedViewResizingMediaView.setOnMediaClickListeners(null, null);
            Intrinsics.checkNotNull(embedViewResizingMediaView);
            embedViewResizingMediaView.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = embedViewResizingMediaView.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.height = 0;
            embedViewResizingMediaView.setLayoutParams(layoutParams);
        }
    }

    private final void clearMedia() {
        EmbedViewResizingMediaView embedViewResizingMediaView = this.binding.mediaView;
        MediaView.setMediaData$default(embedViewResizingMediaView, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, null, null, 524286, null);
        Intrinsics.checkNotNull(embedViewResizingMediaView);
        embedViewResizingMediaView.setVisibility(8);
    }

    private final void clearProvider() {
        SimpleDraweeSpanTextView provider = this.binding.provider;
        Intrinsics.checkNotNullExpressionValue(provider, "provider");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(provider, null);
    }

    private final void clearThumbnail() {
        SimpleDraweeView thumbnail = this.binding.thumbnail;
        Intrinsics.checkNotNullExpressionValue(thumbnail, "thumbnail");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(thumbnail, null, null, null, null, null, null, 62, null);
        SimpleDraweeView thumbnail2 = this.binding.thumbnail;
        Intrinsics.checkNotNullExpressionValue(thumbnail2, "thumbnail");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(thumbnail2, false, null, 1, null);
    }

    private final void clearTitle() {
        SimpleDraweeSpanTextView title = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(title, null);
        SimpleDraweeSpanTextView title2 = this.binding.title;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(title2, false, null, 1, null);
    }

    private final void configureSpoiler(SpoilerConfig spoilerConfig, boolean isObscureAwaitingScan, boolean obscureHideControls, boolean obscureIsOpaque) {
        this.binding.spoiler.configure(spoilerConfig, this);
        this.binding.spoiler.handleObscureAwaitingScan(isObscureAwaitingScan);
        this.binding.spoiler.setRevealButtonVisible(!obscureHideControls);
        this.binding.spoiler.setOpaqueBackgroundVisible(obscureIsOpaque);
        FrameLayout imageBlurBg = this.binding.imageBlurBg;
        Intrinsics.checkNotNullExpressionValue(imageBlurBg, "imageBlurBg");
        imageBlurBg.setVisibility(this.binding.spoiler.getIsOverlayVisible() ? 0 : 8);
    }

    private final void reset() {
        clearProvider();
        clearTitle();
        clearDescription();
        clearAuthor();
        clearFields();
        clearInlineMedia();
        clearThumbnail();
        clearBorder();
        clearMedia();
        clearFooter();
        clearError();
    }

    private final void setAuthor(String authorUrl, String authorName, boolean shouldAutoPlayGifs) {
        LinearLayout authorContainer = this.binding.authorContainer;
        Intrinsics.checkNotNullExpressionValue(authorContainer, "authorContainer");
        authorContainer.setVisibility((authorUrl != null && !StringsKt.K(authorUrl)) || (authorName != null && !StringsKt.K(authorName)) ? 0 : 8);
        TextView authorName2 = this.binding.authorName;
        Intrinsics.checkNotNullExpressionValue(authorName2, "authorName");
        ViewUtilsKt.setOptionalText(authorName2, authorName);
        SimpleDraweeView authorAvatar = this.binding.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(authorAvatar, authorUrl, Boolean.valueOf(shouldAutoPlayGifs), null, null, null, null, 60, null);
    }

    private final void setAuthorOnClickListener(View.OnClickListener listener, Function1<? super CharSequence, Unit> onTapCopyText) {
        TextView textView = this.binding.authorName;
        Intrinsics.checkNotNull(textView);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(textView, false, listener, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(textView, false, new com.discord.chat.presentation.message.s(2, onTapCopyText, this), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setAuthorOnClickListener$lambda$22$lambda$21(Function1 function1, EmbedView embedView, View view) {
        CharSequence text = embedView.binding.authorName.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        function1.invoke(text);
        return true;
    }

    private final void setBackgroundColorEnabled(boolean isBackgroundColorEnabled, Integer backgroundColor) {
        if (isBackgroundColorEnabled) {
            this.binding.getRoot().setBackgroundColor(backgroundColor != null ? backgroundColor.intValue() : ThemeManagerKt.getTheme().getEmbedBackground());
        } else {
            this.binding.getRoot().setBackgroundColor(0);
        }
    }

    public static /* synthetic */ void setBackgroundColorEnabled$default(EmbedView embedView, boolean z5, Integer num, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            num = null;
        }
        embedView.setBackgroundColorEnabled(z5, num);
    }

    private final void setBorder(Integer color) {
        if (color != null) {
            this.binding.border.setBackgroundColor(color.intValue());
        }
        View border = this.binding.border;
        Intrinsics.checkNotNullExpressionValue(border, "border");
        border.setVisibility(color != null ? 0 : 8);
    }

    private final void setDescription(String rawDescription, DraweeSpanStringBuilder description, int descriptionColor, Function1<? super CharSequence, Unit> onTapCopyText) {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.description;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        if (description != null) {
            SpannableExtensionsKt.coverWithSpan(description, new BackgroundSpanDrawer(simpleDraweeSpanTextView));
        } else {
            description = null;
        }
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, description);
        simpleDraweeSpanTextView.setTextColor(descriptionColor);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeSpanTextView, false, new i(2, rawDescription, onTapCopyText), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setDescription$lambda$28$lambda$27(Function1 function1, String str, View view) {
        function1.invoke(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmbed_fDtLluY$lambda$11$lambda$10(Function2 function2, MediaSource mediaSource, int i7, View view) {
        Double portal = mediaSource.getPortal();
        if (portal == null || !mediaSource.getIsValid()) {
            portal = null;
        }
        function2.invoke(portal, Integer.valueOf(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmbed_fDtLluY$lambda$14$lambda$13(Function2 function2, MediaSource mediaSource, boolean z5, EmbedView embedView, View view) {
        Double portal = mediaSource.getPortal();
        if (portal == null || !mediaSource.getIsValid()) {
            portal = null;
        }
        function2.invoke(portal, null);
        if (z5) {
            embedView.binding.spoiler.makeObscureHideButtonHidden();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmbed_fDtLluY$lambda$3$lambda$2(Function2 function2, MediaSource mediaSource, boolean z5, EmbedView embedView, View view) {
        Double portal = mediaSource.getPortal();
        if (portal == null || !mediaSource.getIsValid()) {
            portal = null;
        }
        function2.invoke(portal, null);
        if (z5) {
            embedView.binding.spoiler.makeObscureHideButtonHidden();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmbed_fDtLluY$lambda$5$lambda$4(Function3 function3, String str, String str2, DraweeSpanStringBuilder draweeSpanStringBuilder, View view) {
        MessageId messageIdM1156boximpl = MessageId.m1156boximpl(str);
        String string = draweeSpanStringBuilder != null ? draweeSpanStringBuilder.toString() : null;
        if (string == null) {
            string = "";
        }
        function3.invoke(messageIdM1156boximpl, str2, string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmbed_fDtLluY$lambda$6(Function2 function2, String str, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(str), node);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setEmbed_fDtLluY$lambda$8$lambda$7(Function3 function3, String str, Embed embed, View view) {
        function3.invoke(MessageId.m1156boximpl(str), embed.getAuthor().getUrl(), embed.getAuthor().getName());
    }

    private final void setError(String error, int textColor, String iconURL, Integer iconTint) {
        TextView textView = this.binding.error;
        Intrinsics.checkNotNull(textView);
        ViewUtilsKt.setOptionalText(textView, error);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
        textView.setTextColor(textColor);
        SimpleDraweeView errorIcon = this.binding.errorIcon;
        Intrinsics.checkNotNullExpressionValue(errorIcon, "errorIcon");
        if (iconTint != null) {
            textColor = iconTint.intValue();
        }
        ColorUtilsKt.setTintColor(errorIcon, Integer.valueOf(textColor));
        SimpleDraweeView errorIcon2 = this.binding.errorIcon;
        Intrinsics.checkNotNullExpressionValue(errorIcon2, "errorIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(errorIcon2, iconURL);
        SimpleDraweeView errorIcon3 = this.binding.errorIcon;
        Intrinsics.checkNotNullExpressionValue(errorIcon3, "errorIcon");
        errorIcon3.setVisibility(error == null || StringsKt.K(error) ? 8 : 0);
    }

    public static /* synthetic */ void setError$default(EmbedView embedView, String str, int i7, String str2, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            num = null;
        }
        embedView.setError(str, i7, str2, num);
    }

    /* JADX INFO: renamed from: setFields-oCLp7l4, reason: not valid java name */
    private final void m735setFieldsoCLp7l4(List<EmbedField> fields, String messageId, boolean shouldAnimateEmoji, boolean shouldShowLinkDecorations, boolean shouldShowRoleDot, boolean shouldShowRoleOnName, Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, Function1<? super LinkContentNode, Unit> onLinkLongClicked, Function1<? super CharSequence, Unit> onTapCopyText, Function0<Unit> onTapSpoiler, Function1<? super EmojiContentNode, Unit> onTapEmoji, Function3 onTapChannel, Function6 onTapMention, Function1<? super CommandMentionContentNode, Unit> onTapCommand, Function1<? super String, Unit> onTapTimestamp) {
        LinearLayout linearLayout;
        EmbedFieldView embedFieldView;
        DraweeSpanStringBuilder spannable;
        String str;
        String str2 = messageId;
        a aVar = new a(onLinkClicked, str2, 1);
        LinearLayout linearLayout2 = this.binding.fieldsContainer;
        Intrinsics.checkNotNull(linearLayout2);
        int i7 = 0;
        linearLayout2.setVisibility(!fields.isEmpty() ? 0 : 8);
        ViewGroupUtilsKt.setUpLayoutForList(linearLayout2, fields.size(), new r0(8, linearLayout2));
        for (Object obj : fields) {
            int i10 = i7 + 1;
            DraweeSpanStringBuilder spannable2 = null;
            if (i7 < 0) {
                d0.k();
                throw null;
            }
            EmbedField embedField = (EmbedField) obj;
            View childAt = linearLayout2.getChildAt(i7);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.EmbedFieldView");
            EmbedFieldView embedFieldView2 = (EmbedFieldView) childAt;
            String rawName = embedField.getRawName();
            if (rawName == null) {
                rawName = "";
            }
            StructurableText name = embedField.getName();
            if (name != null) {
                LinearLayout linearLayout3 = linearLayout2;
                Context context = embedFieldView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TextPaint paint = embedFieldView2.getBinding().name.getPaint();
                Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
                linearLayout = linearLayout3;
                spannable = TextUtilsKt.toSpannable(name, context, str2, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : aVar, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : onLinkLongClicked, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : onTapChannel, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : onTapMention, (8388608 & 16384) != 0 ? new f6.a(22) : onTapCommand, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : onTapTimestamp, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : onTapEmoji, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : onTapSpoiler, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : 0.0f, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
                embedFieldView = embedFieldView2;
                rawName = rawName;
            } else {
                linearLayout = linearLayout2;
                embedFieldView = embedFieldView2;
                spannable = null;
            }
            embedFieldView.setName(rawName, spannable, onTapCopyText);
            String rawValue = embedField.getRawValue();
            String str3 = rawValue != null ? rawValue : "";
            StructurableText value = embedField.getValue();
            if (value != null) {
                EmbedFieldView embedFieldView3 = embedFieldView;
                Context context2 = embedFieldView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                TextPaint paint2 = embedFieldView3.getBinding().value.getPaint();
                Intrinsics.checkNotNullExpressionValue(paint2, "getPaint(...)");
                Paint.FontMetrics fontMetrics = embedFieldView3.getBinding().value.getPaint().getFontMetrics();
                Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
                spannable2 = TextUtilsKt.toSpannable(value, context2, messageId, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, paint2, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : aVar, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : onLinkLongClicked, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : onTapChannel, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : onTapMention, (8388608 & 16384) != 0 ? new f6.a(22) : onTapCommand, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : onTapTimestamp, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : onTapEmoji, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : onTapSpoiler, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : TextUtilsKt.getBaselineHeightPx(fontMetrics), (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
                embedFieldView = embedFieldView3;
                str = str3;
            } else {
                str = str3;
            }
            embedFieldView.setValue(str, spannable2, onTapCopyText);
            str2 = messageId;
            i7 = i10;
            linearLayout2 = linearLayout;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFields_oCLp7l4$lambda$29(Function2 function2, String str, LinkContentNode node) {
        Intrinsics.checkNotNullParameter(node, "node");
        function2.invoke(MessageId.m1156boximpl(str), node);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View setFields_oCLp7l4$lambda$33$lambda$30(LinearLayout linearLayout) {
        Context context = linearLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new EmbedFieldView(context, null, 0, 6, null);
    }

    private final void setFooter(String imageUrl, String text, Function1<? super CharSequence, Unit> onTapCopyText, boolean shouldAutoPlayGifs) {
        LinearLayout footerContainer = this.binding.footerContainer;
        Intrinsics.checkNotNullExpressionValue(footerContainer, "footerContainer");
        footerContainer.setVisibility(((imageUrl == null || StringsKt.K(imageUrl)) && (text == null || StringsKt.K(text))) ? 8 : 0);
        SimpleDraweeView footerAvatar = this.binding.footerAvatar;
        Intrinsics.checkNotNullExpressionValue(footerAvatar, "footerAvatar");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(footerAvatar, imageUrl, Boolean.valueOf(shouldAutoPlayGifs), null, null, null, null, 60, null);
        TextView textView = this.binding.footerText;
        Intrinsics.checkNotNull(textView);
        ViewUtilsKt.setOptionalText(textView, text);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(textView, false, text != null ? new i(3, text, onTapCopyText) : null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setFooter$lambda$38$lambda$37$lambda$36(Function1 function1, String str, View view) {
        function1.invoke(str);
        return true;
    }

    private final void setMediaEmbed(EmbedViewResizingMediaView mediaView, Embed embed, MediaSource mediaSource, int maxHeightPx, int maxWidthPx) {
        if (maxHeightPx > 0 && maxWidthPx > 0) {
            Pair<Integer, Integer> targetDimensions = EmbedUtilsKt.getTargetDimensions(embed);
            Integer num = (Integer) targetDimensions.f14612d;
            Integer num2 = (Integer) targetDimensions.f14613e;
            mediaView.setTarget(num != null ? num.intValue() : 0, num2 != null ? num2.intValue() : 0, maxHeightPx, maxWidthPx);
        }
        mediaView.setVisibility(0);
        com.facebook.drawee.drawable.o oVar = com.facebook.drawee.drawable.o.f4689c;
        EmbedThumbnail thumbnail = embed.getThumbnail();
        MediaView.setMediaData$default(mediaView, mediaSource, false, false, false, null, false, null, null, false, thumbnail != null ? Intrinsics.areEqual(thumbnail.getShowPlayButton(), Boolean.TRUE) : false, false, 0, new r0(9, this), null, null, null, null, null, oVar, 257534, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMediaEmbed$lambda$35(EmbedView embedView) {
        embedView.binding.spoiler.makeObscureHideButtonHidden();
        return Unit.f14616a;
    }

    private final void setProvider(CharSequence provider, Integer providerColor, Function1<? super CharSequence, Unit> onTapCopyText) {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.provider;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        ViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, provider);
        simpleDraweeSpanTextView.setTextColor(providerColor != null ? providerColor.intValue() : ThemeManagerKt.getTheme().getTextDefault());
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeSpanTextView, false, provider != null ? new com.discord.chat.presentation.message.s(1, onTapCopyText, provider) : null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setProvider$lambda$17$lambda$16$lambda$15(Function1 function1, CharSequence charSequence, View view) {
        function1.invoke(charSequence);
        return true;
    }

    /* JADX INFO: renamed from: setThumbnail-xk5Fe9g, reason: not valid java name */
    private final void m736setThumbnailxk5Fe9g(EmbedThumbnail thumbnail, boolean shouldAutoPlayGifs, String messageId, String embedUrl, String embedTitle, Function3 onTitleLinkClicked) {
        SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
        MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
        Intrinsics.checkNotNull(simpleDraweeView);
        int width = thumbnail != null ? thumbnail.getWidth() : 0;
        int height = thumbnail != null ? thumbnail.getHeight() : 0;
        int i7 = this.maxThumbnailSize;
        MediaContainingViewResizer.resizeLayoutParams$default(mediaContainingViewResizer, simpleDraweeView, width, height, i7, i7, null, 16, null);
        String proxyURL = thumbnail != null ? thumbnail.getProxyURL() : null;
        Boolean boolValueOf = Boolean.valueOf(shouldAutoPlayGifs);
        Boolean boolValueOf2 = Boolean.valueOf(thumbnail != null ? thumbnail.getSrcIsAnimated() : false);
        SimpleDraweeView thumbnail2 = this.binding.thumbnail;
        Intrinsics.checkNotNullExpressionValue(thumbnail2, "thumbnail");
        SetOptionalImageUrlKt.setOptionalImageUrl$default(simpleDraweeView, proxyURL, boolValueOf, boolValueOf2, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(thumbnail2, thumbnail != null ? thumbnail.getPlaceholder() : null, thumbnail != null ? thumbnail.getPlaceholderVersion() : null), null, null, 48, null);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView, false, thumbnail != null ? new com.discord.chat.presentation.message.b(onTitleLinkClicked, messageId, embedUrl, thumbnail, embedTitle, 1) : null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setThumbnail_xk5Fe9g$lambda$25$lambda$24$lambda$23(Function3 function3, String str, String str2, EmbedThumbnail embedThumbnail, String str3, View view) {
        MessageId messageIdM1156boximpl = MessageId.m1156boximpl(str);
        if (str2 == null) {
            str2 = embedThumbnail.getUrl();
        }
        function3.invoke(messageIdM1156boximpl, str2, str3);
    }

    private final void setTitle(String rawTitle, DraweeSpanStringBuilder title, Integer titleColor, View.OnClickListener onClickListener, Function1<? super String, Unit> onLongClickListener) {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = this.binding.title;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(simpleDraweeSpanTextView, title);
        simpleDraweeSpanTextView.setTextColor(titleColor != null ? titleColor.intValue() : ThemeManagerKt.getTheme().getTextDefault());
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeSpanTextView, false, onClickListener, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(simpleDraweeSpanTextView, false, title != null ? new i(4, rawTitle, onLongClickListener) : null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setTitle$lambda$20$lambda$19$lambda$18(Function1 function1, String str, View view) {
        function1.invoke(str);
        return true;
    }

    /* JADX INFO: renamed from: setEmbed-fDtLluY, reason: not valid java name */
    public final void m737setEmbedfDtLluY(@NotNull MessageMargins margins, @NotNull Embed embed, long channelId, @NotNull String messageId, int constrainedWidth, int maxHeightPx, int radiusPx, boolean shouldAutoPlayGifs, boolean shouldAnimateEmoji, boolean shouldShowLinkDecorations, boolean shouldShowRoleDot, boolean shouldShowRoleOnName, @NotNull Function3 onTitleLinkClicked, @NotNull Function3 onAuthorLinkClicked, @NotNull final Function2<? super Double, ? super Integer, Unit> onMediaClicked, View.OnLongClickListener onMediaLongClicked, @NotNull Function2<? super MessageId, ? super LinkContentNode, Unit> onLinkClicked, @NotNull Function1<? super LinkContentNode, Unit> onLongTapLinkNode, @NotNull Function1<? super CharSequence, Unit> onTapCopyText, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function3 onTapChannel, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function1<? super String, Unit> onTapTimestamp, SpoilerConfig spoilerConfig, double portal, final boolean isObscure, boolean obscureHideControls, boolean obscureIsOpaque, boolean isForwardedContent) throws Throwable {
        g gVar;
        String str;
        boolean z5;
        Function2<? super MessageId, ? super LinkContentNode, Unit> function2;
        DraweeSpanStringBuilder spannable;
        Throwable th2;
        boolean z6;
        final EmbedView embedView = this;
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(embed, "embed");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(onTitleLinkClicked, "onTitleLinkClicked");
        Intrinsics.checkNotNullParameter(onAuthorLinkClicked, "onAuthorLinkClicked");
        Intrinsics.checkNotNullParameter(onMediaClicked, "onMediaClicked");
        Intrinsics.checkNotNullParameter(onLinkClicked, "onLinkClicked");
        Intrinsics.checkNotNullParameter(onLongTapLinkNode, "onLongTapLinkNode");
        Intrinsics.checkNotNullParameter(onTapCopyText, "onTapCopyText");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onTapGameMention, "onTapGameMention");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        if (!Intrinsics.areEqual(embed, embedView.embed)) {
            embedView.reset();
            embedView.embed = embed;
        }
        View root = embedView.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ViewClippingUtilsKt.clipToRoundedRectangle(root, radiusPx);
        ConstraintLayout inlineMediaContainer = embedView.binding.inlineMediaContainer;
        Intrinsics.checkNotNullExpressionValue(inlineMediaContainer, "inlineMediaContainer");
        ViewClippingUtilsKt.clipToRoundedRectangle(inlineMediaContainer, radiusPx);
        EmbedViewResizingMediaView mediaView = embedView.binding.mediaView;
        Intrinsics.checkNotNullExpressionValue(mediaView, "mediaView");
        ViewClippingUtilsKt.clipToRoundedRectangle(mediaView, radiusPx);
        SimpleDraweeView thumbnail = embedView.binding.thumbnail;
        Intrinsics.checkNotNullExpressionValue(thumbnail, "thumbnail");
        ViewClippingUtilsKt.clipToRoundedRectangle(thumbnail, radiusPx);
        DraweeSpanStringBuilder spannable2 = null;
        if (EmbedUtilsKt.isInlineMedia(embed)) {
            final MediaSource mediaSourceM421toMediaSourceUBIQNlQ = EmbedUtilsKt.m421toMediaSourceUBIQNlQ(embed, channelId, messageId, shouldAutoPlayGifs, Double.valueOf(portal));
            if (mediaSourceM421toMediaSourceUBIQNlQ != null) {
                Space spacer = embedView.binding.spacer;
                Intrinsics.checkNotNullExpressionValue(spacer, "spacer");
                spacer.setVisibility(8);
                if (mediaSourceM421toMediaSourceUBIQNlQ.getPreviewUrl() != null) {
                    EmbedViewResizingMediaView mediaView2 = embedView.binding.mediaView;
                    Intrinsics.checkNotNullExpressionValue(mediaView2, "mediaView");
                    embedView.setMediaEmbed(mediaView2, embed, mediaSourceM421toMediaSourceUBIQNlQ, maxHeightPx, MessageMargins.INSTANCE.getWidth(margins, constrainedWidth, isForwardedContent));
                    final int i7 = 0;
                    embedView.binding.mediaView.setOnMediaClickListeners(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i7) {
                                case 0:
                                    EmbedView.setEmbed_fDtLluY$lambda$3$lambda$2(onMediaClicked, mediaSourceM421toMediaSourceUBIQNlQ, isObscure, embedView, view);
                                    break;
                                default:
                                    EmbedView.setEmbed_fDtLluY$lambda$14$lambda$13(onMediaClicked, mediaSourceM421toMediaSourceUBIQNlQ, isObscure, embedView, view);
                                    break;
                            }
                        }
                    }, onMediaLongClicked);
                    setBackgroundColorEnabled$default(embedView, false, null, 2, null);
                }
            }
            z5 = false;
            z6 = true;
        } else {
            StructurableText title = embed.getTitle();
            if (title != null) {
                Context context = embedView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                TextPaint paint = embedView.binding.title.getPaint();
                Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
                gVar = null;
                str = messageId;
                spannable2 = TextUtilsKt.toSpannable(title, context, str, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : onTapChannel, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : onTapMention, (8388608 & 16384) != 0 ? new f6.a(22) : onTapCommand, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : onTapGameMention, (131072 & 8388608) != 0 ? new f6.a(25) : onTapTimestamp, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : onTapEmoji, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : onTapSpoiler, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : 0.0f, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
            } else {
                gVar = null;
                str = messageId;
            }
            String rawTitle = embed.getRawTitle();
            if (rawTitle == null) {
                rawTitle = "";
            }
            Integer numValueOf = embed.getUrl() != null ? Integer.valueOf(ThemeManagerKt.getTheme().getTextLink()) : embed.getHeaderTextColor();
            String url = embed.getUrl();
            z5 = false;
            embedView.setTitle(rawTitle, spannable2, numValueOf, url != null ? new g(onTitleLinkClicked, str, url, spannable2) : gVar, onTapCopyText);
            String rawDescription = embed.getRawDescription();
            if (rawDescription == null) {
                rawDescription = "";
            }
            StructurableText description = embed.getDescription();
            if (description != null) {
                Context context2 = embedView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                TextPaint paint2 = embedView.binding.description.getPaint();
                Intrinsics.checkNotNullExpressionValue(paint2, "getPaint(...)");
                Paint.FontMetrics fontMetrics = embedView.binding.description.getPaint().getFontMetrics();
                Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
                function2 = onLinkClicked;
                spannable = TextUtilsKt.toSpannable(description, context2, str, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, paint2, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : new a(function2, str, 2), (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : onLongTapLinkNode, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : onTapChannel, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new d(4) : onTapMention, (8388608 & 16384) != 0 ? new f6.a(22) : onTapCommand, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : onTapGameMention, (131072 & 8388608) != 0 ? new f6.a(25) : onTapTimestamp, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : onTapEmoji, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : onTapSpoiler, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : TextUtilsKt.getBaselineHeightPx(fontMetrics), (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
            } else {
                function2 = onLinkClicked;
                spannable = null;
            }
            embedView.setDescription(rawDescription, spannable, embed.getBodyTextColor(), onTapCopyText);
            EmbedProvider provider = embed.getProvider();
            embedView.setProvider(provider != null ? provider.getName() : null, embed.getProviderColor(), onTapCopyText);
            embedView.setBackgroundColorEnabled(!Intrinsics.areEqual(embed.getDisableBackgroundColor(), Boolean.TRUE), embed.getBackgroundColor());
            embedView.setBorder(embed.getBorderLeftColor());
            EmbedAuthor author = embed.getAuthor();
            String imageUrl = author != null ? author.getImageUrl() : null;
            EmbedAuthor author2 = embed.getAuthor();
            embedView.setAuthor(imageUrl, author2 != null ? author2.getName() : null, shouldAutoPlayGifs);
            EmbedAuthor author3 = embed.getAuthor();
            embedView.setAuthorOnClickListener((author3 == null || author3.getUrl() == null) ? null : new com.discord.chat.presentation.message.d(onAuthorLinkClicked, str, embed, 3), onTapCopyText);
            List<EmbedField> fields = embed.getFields();
            if (fields == null) {
                fields = n0.f14659d;
            }
            embedView.m735setFieldsoCLp7l4(fields, str, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, function2, onLongTapLinkNode, onTapCopyText, onTapSpoiler, onTapEmoji, onTapChannel, onTapMention, onTapCommand, onTapTimestamp);
            EmbedFooter footer = embed.getFooter();
            String imageUrl2 = footer != null ? footer.getImageUrl() : null;
            EmbedFooter footer2 = embed.getFooter();
            embedView.setFooter(imageUrl2, footer2 != null ? footer2.getContent() : null, onTapCopyText, shouldAutoPlayGifs);
            if (embed.getFailureState() == EmbedFailureState.AUTO_MODERATION_BLOCKED_MESSAGE) {
                embedView.setError(embed.getMessageSendError(), ThemeManagerKt.getTheme().getTextMuted(), embed.getIconURL(), Integer.valueOf(ColorUtilsKt.getColorCompat(embedView, R.color.red_345)));
                th2 = null;
            } else {
                th2 = null;
                embedView.setError(embed.getMessageSendError(), embed.getBodyTextColor(), embed.getIconURL(), null);
            }
            List<MediaSource> listM420toImageMediaSourcesSHRpUJI = EmbedUtilsKt.m420toImageMediaSourcesSHRpUJI(embed, channelId, messageId);
            if (listM420toImageMediaSourcesSHRpUJI != null) {
                int i10 = (int) (((double) maxHeightPx) * 0.75d);
                int widthForEmbedContent = MessageMargins.INSTANCE.getWidthForEmbedContent(margins, constrainedWidth, isForwardedContent);
                MediaContainingViewResizer mediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
                ConstraintLayout inlineMediaContainer2 = embedView.binding.inlineMediaContainer;
                Intrinsics.checkNotNullExpressionValue(inlineMediaContainer2, "inlineMediaContainer");
                MediaContainingViewResizer.resizeLayoutParams$default(mediaContainingViewResizer, inlineMediaContainer2, widthForEmbedContent, i10, widthForEmbedContent, i10, null, 16, null);
                EmbedViewBinding embedViewBinding = embedView.binding;
                EmbedViewResizingMediaView[] other = {embedViewBinding.inlineMediaView, embedViewBinding.inlineMediaView2, embedViewBinding.inlineMediaView3, embedViewBinding.inlineMediaView4};
                Intrinsics.checkNotNullParameter(listM420toImageMediaSourcesSHRpUJI, "<this>");
                Intrinsics.checkNotNullParameter(other, "other");
                ArrayList arrayList = new ArrayList(Math.min(e0.l(listM420toImageMediaSourcesSHRpUJI, 10), 4));
                int i11 = 0;
                for (Object obj : listM420toImageMediaSourcesSHRpUJI) {
                    if (i11 >= 4) {
                        break;
                    }
                    arrayList.add(new Pair(obj, other[i11]));
                    i11++;
                }
                int i12 = 0;
                for (Object obj2 : arrayList) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        d0.k();
                        throw th2;
                    }
                    Pair pair = (Pair) obj2;
                    MediaSource mediaSource = (MediaSource) pair.f14612d;
                    Object obj3 = pair.f14613e;
                    Intrinsics.checkNotNullExpressionValue(obj3, "component2(...)");
                    EmbedViewResizingMediaView embedViewResizingMediaView = (EmbedViewResizingMediaView) obj3;
                    embedView.setMediaEmbed(embedViewResizingMediaView, embed, mediaSource, 0, 0);
                    embedViewResizingMediaView.setOnMediaClickListeners(new com.discord.chat.presentation.message.viewholder.e(onMediaClicked, mediaSource, i12, 4), onMediaLongClicked);
                    i12 = i13;
                }
                z6 = true;
            } else {
                final MediaSource mediaSourceM421toMediaSourceUBIQNlQ2 = EmbedUtilsKt.m421toMediaSourceUBIQNlQ(embed, channelId, messageId, shouldAutoPlayGifs, Double.valueOf(portal));
                if (mediaSourceM421toMediaSourceUBIQNlQ2 != null) {
                    EmbedViewResizingMediaView inlineMediaView = embedView.binding.inlineMediaView;
                    Intrinsics.checkNotNullExpressionValue(inlineMediaView, "inlineMediaView");
                    embedView.setMediaEmbed(inlineMediaView, embed, mediaSourceM421toMediaSourceUBIQNlQ2, maxHeightPx, MessageMargins.INSTANCE.getWidthForEmbedContent(margins, constrainedWidth, isForwardedContent));
                    final int i14 = 1;
                    embedView.binding.inlineMediaView.setOnMediaClickListeners(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            switch (i14) {
                                case 0:
                                    EmbedView.setEmbed_fDtLluY$lambda$3$lambda$2(onMediaClicked, mediaSourceM421toMediaSourceUBIQNlQ2, isObscure, embedView, view);
                                    break;
                                default:
                                    EmbedView.setEmbed_fDtLluY$lambda$14$lambda$13(onMediaClicked, mediaSourceM421toMediaSourceUBIQNlQ2, isObscure, embedView, view);
                                    break;
                            }
                        }
                    }, onMediaLongClicked);
                }
                z6 = true;
                if (WhenMappings.$EnumSwitchMapping$0[embed.getType().ordinal()] != 1 ? mediaSourceM421toMediaSourceUBIQNlQ2 != null : embed.getVideo() != null) {
                    embedView = this;
                } else {
                    m736setThumbnailxk5Fe9g(embed.getThumbnail(), shouldAutoPlayGifs, messageId, embed.getUrl(), embed.getRawTitle(), onTitleLinkClicked);
                    embedView = this;
                }
            }
        }
        String obscureAwaitingScan = embed.getObscureAwaitingScan();
        embedView.configureSpoiler(spoilerConfig, !((obscureAwaitingScan == null || StringsKt.K(obscureAwaitingScan)) ? z6 : z5), obscureHideControls, obscureIsOpaque);
    }

    public /* synthetic */ EmbedView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        EmbedViewBinding embedViewBindingInflate = EmbedViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(embedViewBindingInflate, "inflate(...)");
        this.binding = embedViewBindingInflate;
        this.maxThumbnailSize = context.getResources().getDimensionPixelSize(com.discord.chat.R.dimen.message_embed_max_thumbnail_size);
        embedViewBindingInflate.getRoot().setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSurfaceHigh());
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = embedViewBindingInflate.provider;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView, 10.0f);
        DiscordFont discordFont = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, discordFont);
        SimpleDraweeView authorAvatar = embedViewBindingInflate.authorAvatar;
        Intrinsics.checkNotNullExpressionValue(authorAvatar, "authorAvatar");
        ViewClippingUtilsKt.clipToCircle(authorAvatar);
        TextView authorName = embedViewBindingInflate.authorName;
        Intrinsics.checkNotNullExpressionValue(authorName, "authorName");
        DiscordFont discordFont2 = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(authorName, discordFont2);
        embedViewBindingInflate.authorName.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        TextView authorName2 = embedViewBindingInflate.authorName;
        Intrinsics.checkNotNullExpressionValue(authorName2, "authorName");
        SetTextSizeSpKt.setTextSizeSp(authorName2, 12.0f);
        SimpleDraweeSpanTextView title = embedViewBindingInflate.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        DiscordFontUtilsKt.setDiscordFont(title, discordFont2);
        SimpleDraweeSpanTextView title2 = embedViewBindingInflate.title;
        Intrinsics.checkNotNullExpressionValue(title2, "title");
        SetTextSizeSpKt.setTextSizeSp(title2, 16.0f);
        SimpleDraweeSpanTextView description = embedViewBindingInflate.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        DiscordFontUtilsKt.setDiscordFont(description, discordFont);
        SimpleDraweeView footerAvatar = embedViewBindingInflate.footerAvatar;
        Intrinsics.checkNotNullExpressionValue(footerAvatar, "footerAvatar");
        ViewClippingUtilsKt.clipToCircle(footerAvatar);
        TextView footerText = embedViewBindingInflate.footerText;
        Intrinsics.checkNotNullExpressionValue(footerText, "footerText");
        DiscordFontUtilsKt.setDiscordFont(footerText, discordFont2);
        embedViewBindingInflate.footerText.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        TextView footerText2 = embedViewBindingInflate.footerText;
        Intrinsics.checkNotNullExpressionValue(footerText2, "footerText");
        SetTextSizeSpKt.setTextSizeSp(footerText2, 12.0f);
        TextView error = embedViewBindingInflate.error;
        Intrinsics.checkNotNullExpressionValue(error, "error");
        DiscordFontUtilsKt.setDiscordFont(error, discordFont);
        TextView error2 = embedViewBindingInflate.error;
        Intrinsics.checkNotNullExpressionValue(error2, "error");
        SetTextSizeSpKt.setTextSizeSp(error2, 12.0f);
        SimpleDraweeView errorIcon = embedViewBindingInflate.errorIcon;
        Intrinsics.checkNotNullExpressionValue(errorIcon, "errorIcon");
        ReactAssetUtilsKt.setReactAsset(errorIcon, ReactAsset.CircleErrorIcon);
        embedViewBindingInflate.imageBlurBg.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLower());
    }
}
