package com.discord.chat.presentation.message;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.channel_spine.ChannelSpineView;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.LinkContextData;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import com.discord.chat.bridge.executedcommand.ExecutedCommandBackgroundStyles;
import com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage;
import com.discord.chat.bridge.referencedmessage.ReferencedMessage;
import com.discord.chat.bridge.referencedmessage.SystemReferencedMessage;
import com.discord.chat.bridge.rolecolors.RoleColors;
import com.discord.chat.bridge.rolecolors.RoleColorsKt;
import com.discord.chat.bridge.structurabletext.AnnotatedStructurableText;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.MessageViewReplyPreviewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.utils.DisplayNameStylesUtils;
import com.discord.chat.presentation.message.utils.ReplyUtilsKt;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.chat.presentation.textutils.LinkBackgroundStyle;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.react_strings.RenderContext;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0012H\u0002J&\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eJE\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)¢\u0006\u0004\b*\u0010+J\u0006\u0010,\u001a\u00020\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006-"}, d2 = {"Lcom/discord/chat/presentation/message/MessageViewReplyPreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/MessageViewReplyPreviewBinding;", "replyTextLineBounds", "Landroid/graphics/Rect;", "spineOriginView", "Landroid/view/View;", "getSpineOriginView", "()Landroid/view/View;", "configureLeadingIcon", "", "message", "Lcom/discord/chat/bridge/Message;", "configureTrailingIcon", "configureClanTagChiplet", "measureAndSetReplyLeadingViewsHeight", "configureReply", "reply", "Lcom/discord/chat/bridge/referencedmessage/ReferencedMessage;", "showSpine", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "configureExecutedCommand", "messageId", "Lcom/discord/primitives/MessageId;", "executedCommand", "Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;", "shouldAnimateEmoji", "shouldShowLinkDecorations", "shouldShowRoleDot", "shouldShowRoleOnName", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureExecutedCommand-dB0-bEw", "(Ljava/lang/String;Lcom/discord/chat/bridge/executedcommand/ExecutedCommand;ZZZZLcom/discord/chat/presentation/events/ChatEventHandler;)V", "clear", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMessageViewReplyPreview.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageViewReplyPreview.kt\ncom/discord/chat/presentation/message/MessageViewReplyPreview\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n327#2,4:458\n255#2:463\n257#2,2:464\n257#2,2:466\n257#2,2:468\n257#2,2:470\n311#2:472\n327#2,4:473\n312#2:477\n257#2,2:478\n257#2,2:480\n257#2,2:482\n257#2,2:484\n257#2,2:486\n257#2,2:488\n257#2,2:490\n257#2,2:492\n257#2,2:494\n257#2,2:496\n257#2,2:498\n257#2,2:500\n257#2,2:502\n257#2,2:504\n257#2,2:506\n257#2,2:508\n257#2,2:510\n257#2,2:512\n257#2,2:514\n37#2,2:516\n55#2:518\n257#2,2:519\n257#2,2:521\n257#2,2:523\n257#2,2:525\n257#2,2:527\n257#2,2:529\n257#2,2:531\n257#2,2:533\n257#2,2:535\n257#2,2:537\n257#2,2:539\n257#2,2:541\n257#2,2:543\n1#3:462\n*S KotlinDebug\n*F\n+ 1 MessageViewReplyPreview.kt\ncom/discord/chat/presentation/message/MessageViewReplyPreview\n*L\n105#1:458,4\n72#1:463\n121#1:464,2\n135#1:466,2\n141#1:468,2\n143#1:470,2\n160#1:472\n160#1:473,4\n160#1:477\n186#1:478,2\n187#1:480,2\n188#1:482,2\n192#1:484,2\n198#1:486,2\n204#1:488,2\n206#1:490,2\n209#1:492,2\n220#1:494,2\n221#1:496,2\n222#1:498,2\n271#1:500,2\n272#1:502,2\n273#1:504,2\n276#1:506,2\n277#1:508,2\n279#1:510,2\n285#1:512,2\n286#1:514,2\n300#1:516,2\n300#1:518\n364#1:519,2\n365#1:521,2\n367#1:523,2\n368#1:525,2\n369#1:527,2\n379#1:529,2\n380#1:531,2\n381#1:533,2\n450#1:535,2\n451#1:537,2\n452#1:539,2\n453#1:541,2\n454#1:543,2\n*E\n"})
public final class MessageViewReplyPreview extends ConstraintLayout implements SpineParentMessage {

    @NotNull
    private final MessageViewReplyPreviewBinding binding;

    @NotNull
    private final Rect replyTextLineBounds;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageViewReplyPreview(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void configureClanTagChiplet(Message message) {
        if (message.getClanTag() == null || message.m265getClanTagGuildIdqOKuAAo() == null) {
            ClanTagChipletView tagChiplet = this.binding.tagChiplet;
            Intrinsics.checkNotNullExpressionValue(tagChiplet, "tagChiplet");
            tagChiplet.setVisibility(8);
        } else {
            ClanTagChipletView.m535configureETwJlQw$default(this.binding.tagChiplet, message.getClanTag(), message.getClanBadgeUrl(), message.m265getClanTagGuildIdqOKuAAo().m1152unboximpl(), null, 0.89f, null, 32, null);
            ClanTagChipletView tagChiplet2 = this.binding.tagChiplet;
            Intrinsics.checkNotNullExpressionValue(tagChiplet2, "tagChiplet");
            tagChiplet2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureExecutedCommand_dB0_bEw$lambda$12(ChatEventHandler chatEventHandler, String str, ExecutedCommand executedCommand, View view) {
        chatEventHandler.mo479onTapAvatarx5gers8(str, executedCommand.m425getUserIdre6GcUE());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureExecutedCommand_dB0_bEw$lambda$13(ExecutedCommand executedCommand, RenderContext i18nFormat) {
        Intrinsics.checkNotNullParameter(i18nFormat, "$this$i18nFormat");
        i18nFormat.getArgs().put("nickname", executedCommand.getUsername());
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureExecutedCommand_dB0_bEw$lambda$14(ChatEventHandler chatEventHandler, String str, LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        chatEventHandler.mo468onLinkClickedntcYbpo(str, it);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureExecutedCommand_dB0_bEw$lambda$15(ChatEventHandler chatEventHandler, CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        chatEventHandler.onTapCommand(it);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureExecutedCommand_dB0_bEw$lambda$16(ChatEventHandler chatEventHandler, CommandMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        chatEventHandler.onLongPressCommand(it);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStyle configureExecutedCommand_dB0_bEw$lambda$17(ExecutedCommand executedCommand, LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LinkContextData target = it.getTarget();
        if (target instanceof LinkContextData.BindUserMenu) {
            Integer linkColor = it.getLinkColor();
            return new LinkStyle(DiscordFont.PrimarySemibold, linkColor != null ? linkColor.intValue() : ThemeManagerKt.getTheme().getTextLink(), null, null, 12, null);
        }
        if (!(target instanceof LinkContextData.BindTapCommandName)) {
            return new LinkStyle(DiscordFont.PrimarySemibold, 0, null, null, 14, null);
        }
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        ExecutedCommandBackgroundStyles commandNameBackgroundStyles = executedCommand.getCommandNameBackgroundStyles();
        ReactAsset reactAsset = null;
        Integer color = commandNameBackgroundStyles != null ? commandNameBackgroundStyles.getColor() : null;
        ExecutedCommandBackgroundStyles commandNameBackgroundStyles2 = executedCommand.getCommandNameBackgroundStyles();
        Integer borderRadius = commandNameBackgroundStyles2 != null ? commandNameBackgroundStyles2.getBorderRadius() : null;
        ExecutedCommandBackgroundStyles commandNameBackgroundStyles3 = executedCommand.getCommandNameBackgroundStyles();
        LinkBackgroundStyle linkBackgroundStyle = new LinkBackgroundStyle(color, borderRadius, commandNameBackgroundStyles3 != null ? commandNameBackgroundStyles3.getSpaceAround() : null);
        Boolean showAppsIcon = executedCommand.getShowAppsIcon();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(showAppsIcon, bool)) {
            reactAsset = Intrinsics.areEqual(executedCommand.getShowControllerIcon(), bool) ? ReactAsset.GameControllerIcon : ReactAsset.AppsIcon;
        }
        return new LinkStyle(discordFont, 0, linkBackgroundStyle, reactAsset, 2, null);
    }

    private final void configureLeadingIcon(Message message) {
        ReactAsset reactAsset;
        boolean z5 = message.getForwardInfo() != null;
        if (message.isPollResult()) {
            reactAsset = ReactAsset.PollsIcon;
        } else {
            reactAsset = z5 ? ReactAsset.ArrowAngleRightUpIcon : null;
        }
        if (reactAsset != null) {
            SimpleDraweeView replyLeadingIcon = this.binding.replyLeadingIcon;
            Intrinsics.checkNotNullExpressionValue(replyLeadingIcon, "replyLeadingIcon");
            ReactAssetUtilsKt.setReactAsset(replyLeadingIcon, reactAsset);
        }
        SimpleDraweeView replyLeadingIcon2 = this.binding.replyLeadingIcon;
        Intrinsics.checkNotNullExpressionValue(replyLeadingIcon2, "replyLeadingIcon");
        replyLeadingIcon2.setVisibility(reactAsset != null ? 0 : 8);
    }

    public static /* synthetic */ void configureReply$default(MessageViewReplyPreview messageViewReplyPreview, ReferencedMessage referencedMessage, boolean z5, Function0 function0, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z5 = true;
        }
        messageViewReplyPreview.configureReply(referencedMessage, z5, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureReply$lambda$10(MessageViewReplyPreview messageViewReplyPreview, String str, int i7) {
        messageViewReplyPreview.binding.replyText.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContent(i7, str));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureReply$lambda$9(StructurableText structurableText, MessageViewReplyPreview messageViewReplyPreview, Message message, int i7) {
        if (structurableText != null) {
            MessageContentView messageContentView = messageViewReplyPreview.binding.replyText;
            Context context = messageViewReplyPreview.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String strM267getId3Eiw7ao = message.m267getId3Eiw7ao();
            boolean zShouldAnimateEmoji = MessageKt.shouldAnimateEmoji(message);
            boolean zShouldShowLinkDecorations = MessageKt.shouldShowLinkDecorations(message);
            boolean shouldShowRoleDot = message.getShouldShowRoleDot();
            boolean shouldShowRoleOnName = message.getShouldShowRoleOnName();
            Paint.FontMetrics fontMetrics = messageViewReplyPreview.binding.replyText.getPaint().getFontMetrics();
            Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
            float baselineHeightPx = TextUtilsKt.getBaselineHeightPx(fontMetrics);
            TextPaint paint = messageViewReplyPreview.binding.replyText.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
            DraweeSpanStringBuilder spannable = TextUtilsKt.toSpannable(structurableText, context, strM267getId3Eiw7ao, zShouldAnimateEmoji, zShouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new com.discord.chat.presentation.message.view.b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new com.discord.chat.presentation.message.view.c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new com.discord.chat.presentation.message.view.d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : true, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
            MessageContentView replyText = messageViewReplyPreview.binding.replyText;
            Intrinsics.checkNotNullExpressionValue(replyText, "replyText");
            SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(replyText));
            Unit unit = Unit.f14616a;
            messageContentView.setDraweeSpanStringBuilder(ReplyUtilsKt.createSystemReplyContentFromBuilder(i7, spannable));
        } else if (message.getContent() != null) {
            MessageContentView messageContentView2 = messageViewReplyPreview.binding.replyText;
            StructurableText content = message.getContent();
            Context context2 = messageViewReplyPreview.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            String strM267getId3Eiw7ao2 = message.m267getId3Eiw7ao();
            boolean zShouldAnimateEmoji2 = MessageKt.shouldAnimateEmoji(message);
            boolean zShouldShowLinkDecorations2 = MessageKt.shouldShowLinkDecorations(message);
            boolean shouldShowRoleDot2 = message.getShouldShowRoleDot();
            boolean shouldShowRoleOnName2 = message.getShouldShowRoleOnName();
            Paint.FontMetrics fontMetrics2 = messageViewReplyPreview.binding.replyText.getPaint().getFontMetrics();
            Intrinsics.checkNotNullExpressionValue(fontMetrics2, "getFontMetrics(...)");
            float baselineHeightPx2 = TextUtilsKt.getBaselineHeightPx(fontMetrics2);
            TextPaint paint2 = messageViewReplyPreview.binding.replyText.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint2, "getPaint(...)");
            DraweeSpanStringBuilder spannable2 = TextUtilsKt.toSpannable(content, context2, strM267getId3Eiw7ao2, zShouldAnimateEmoji2, zShouldShowLinkDecorations2, shouldShowRoleDot2, shouldShowRoleOnName2, paint2, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new com.discord.chat.presentation.message.view.b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new com.discord.chat.presentation.message.view.c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new com.discord.chat.presentation.message.view.d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : null, (32768 & 8388608) != 0 ? new f6.a(23) : null, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : null, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : true, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx2, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
            MessageContentView replyText2 = messageViewReplyPreview.binding.replyText;
            Intrinsics.checkNotNullExpressionValue(replyText2, "replyText");
            SpannableExtensionsKt.coverWithSpan(spannable2, new BackgroundSpanDrawer(replyText2));
            Unit unit2 = Unit.f14616a;
            messageContentView2.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(i7, spannable2));
        } else {
            messageViewReplyPreview.binding.replyText.setText((CharSequence) null);
        }
        return Unit.f14616a;
    }

    private final void configureTrailingIcon(Message message) {
        ReactAsset reactAsset;
        if (message.hasStickers()) {
            reactAsset = ReactAsset.StickerIcon;
        } else if (message.hasCommand()) {
            reactAsset = ReactAsset.SlashBoxIcon;
        } else if (message.isVoiceMessage()) {
            reactAsset = ReactAsset.MicrophoneIcon;
        } else {
            reactAsset = message.hasAttachmentsOrEmbeds() ? ReactAsset.ImageIcon : null;
        }
        if (reactAsset != null) {
            SimpleDraweeView replyTrailingIcon = this.binding.replyTrailingIcon;
            Intrinsics.checkNotNullExpressionValue(replyTrailingIcon, "replyTrailingIcon");
            ReactAssetUtilsKt.setReactAsset(replyTrailingIcon, reactAsset);
        }
        SimpleDraweeView replyTrailingIcon2 = this.binding.replyTrailingIcon;
        Intrinsics.checkNotNullExpressionValue(replyTrailingIcon2, "replyTrailingIcon");
        replyTrailingIcon2.setVisibility(reactAsset != null ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void measureAndSetReplyLeadingViewsHeight() {
        if (this.binding.replyText.getWidth() <= 0) {
            return;
        }
        MessageContentView messageContentView = this.binding.replyText;
        messageContentView.measure(View.MeasureSpec.makeMeasureSpec(messageContentView.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.binding.replyText.getLineBounds(0, this.replyTextLineBounds);
        Rect rect = this.replyTextLineBounds;
        int i7 = rect.bottom - rect.top;
        LinearLayout replyLeadingViews = this.binding.replyLeadingViews;
        Intrinsics.checkNotNullExpressionValue(replyLeadingViews, "replyLeadingViews");
        ViewGroup.LayoutParams layoutParams = replyLeadingViews.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i7;
        replyLeadingViews.setLayoutParams(layoutParams);
    }

    public final void clear() {
        ChannelSpineView replySpline = this.binding.replySpline;
        Intrinsics.checkNotNullExpressionValue(replySpline, "replySpline");
        replySpline.setVisibility(8);
        LinearLayout replyLeadingViews = this.binding.replyLeadingViews;
        Intrinsics.checkNotNullExpressionValue(replyLeadingViews, "replyLeadingViews");
        replyLeadingViews.setVisibility(8);
        MessageContentView replyText = this.binding.replyText;
        Intrinsics.checkNotNullExpressionValue(replyText, "replyText");
        replyText.setVisibility(8);
        SimpleDraweeView replyTrailingIcon = this.binding.replyTrailingIcon;
        Intrinsics.checkNotNullExpressionValue(replyTrailingIcon, "replyTrailingIcon");
        replyTrailingIcon.setVisibility(8);
        ClanTagChipletView tagChiplet = this.binding.tagChiplet;
        Intrinsics.checkNotNullExpressionValue(tagChiplet, "tagChiplet");
        tagChiplet.setVisibility(8);
    }

    /* JADX INFO: renamed from: configureExecutedCommand-dB0-bEw, reason: not valid java name */
    public final void m571configureExecutedCommanddB0bEw(@NotNull String messageId, @NotNull final ExecutedCommand executedCommand, boolean shouldAnimateEmoji, boolean shouldShowLinkDecorations, boolean shouldShowRoleDot, boolean shouldShowRoleOnName, @NotNull final ChatEventHandler eventHandler) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(executedCommand, "executedCommand");
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        ChannelSpineView replySpline = this.binding.replySpline;
        Intrinsics.checkNotNullExpressionValue(replySpline, "replySpline");
        final int i7 = 0;
        replySpline.setVisibility(0);
        MessageContentView replyText = this.binding.replyText;
        Intrinsics.checkNotNullExpressionValue(replyText, "replyText");
        replyText.setVisibility(0);
        LinearLayout replyLeadingViews = this.binding.replyLeadingViews;
        Intrinsics.checkNotNullExpressionValue(replyLeadingViews, "replyLeadingViews");
        replyLeadingViews.setVisibility(0);
        SimpleDraweeView replyAuthorAvatar = this.binding.replyAuthorAvatar;
        Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar, "replyAuthorAvatar");
        replyAuthorAvatar.setVisibility(0);
        TextView replyAuthorName = this.binding.replyAuthorName;
        Intrinsics.checkNotNullExpressionValue(replyAuthorName, "replyAuthorName");
        replyAuthorName.setVisibility(8);
        SimpleDraweeView replyAuthorAvatar2 = this.binding.replyAuthorAvatar;
        Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar2, "replyAuthorAvatar");
        final int i10 = 1;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(replyAuthorAvatar2, false, new d(eventHandler, messageId, executedCommand, i10), 1, null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.binding.replyAuthorAvatar.setContentDescription(I18nUtilsKt.i18nFormat(context, I18nMessage.AVATAR_A11Y_LABEL, new Function1() { // from class: com.discord.chat.presentation.message.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$13(executedCommand, (RenderContext) obj);
                    default:
                        return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$17(executedCommand, (LinkContentNode) obj);
                }
            }
        }));
        SimpleDraweeView replyIcon = this.binding.replyIcon;
        Intrinsics.checkNotNullExpressionValue(replyIcon, "replyIcon");
        replyIcon.setVisibility(8);
        SimpleDraweeView replyTrailingIcon = this.binding.replyTrailingIcon;
        Intrinsics.checkNotNullExpressionValue(replyTrailingIcon, "replyTrailingIcon");
        replyTrailingIcon.setVisibility(8);
        ClanTagChipletView tagChiplet = this.binding.tagChiplet;
        Intrinsics.checkNotNullExpressionValue(tagChiplet, "tagChiplet");
        tagChiplet.setVisibility(8);
        this.binding.replyLeadingViews.measure(0, 0);
        MessageViewReplyPreviewBinding messageViewReplyPreviewBinding = this.binding;
        MessageContentView messageContentView = messageViewReplyPreviewBinding.replyText;
        int measuredWidth = messageViewReplyPreviewBinding.replyLeadingViews.getMeasuredWidth();
        AnnotatedStructurableText content = executedCommand.getContent();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Paint.FontMetrics fontMetrics = this.binding.replyText.getPaint().getFontMetrics();
        Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
        float baselineHeightPx = TextUtilsKt.getBaselineHeightPx(fontMetrics);
        TextPaint paint = this.binding.replyText.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        DraweeSpanStringBuilder spannable = TextUtilsKt.toSpannable(content, context2, messageId, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : new v(eventHandler, messageId, i7), (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new com.discord.chat.presentation.message.view.b(5) : null, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new com.discord.chat.presentation.message.view.c(5) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : null, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : null, (8388608 & 8192) != 0 ? new com.discord.chat.presentation.message.view.d(4) : null, (8388608 & 16384) != 0 ? new f6.a(22) : new Function1() { // from class: com.discord.chat.presentation.message.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$15(eventHandler, (CommandMentionContentNode) obj);
                    default:
                        return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$16(eventHandler, (CommandMentionContentNode) obj);
                }
            }
        }, (32768 & 8388608) != 0 ? new f6.a(23) : new Function1() { // from class: com.discord.chat.presentation.message.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$15(eventHandler, (CommandMentionContentNode) obj);
                    default:
                        return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$16(eventHandler, (CommandMentionContentNode) obj);
                }
            }
        }, (65536 & 8388608) != 0 ? new f6.a(24) : null, (131072 & 8388608) != 0 ? new f6.a(25) : null, (262144 & 8388608) != 0 ? new f6.a(26) : null, (524288 & 8388608) != 0 ? new f6.a(27) : null, (1048576 & 8388608) != 0 ? new f6.a(28) : new Function1() { // from class: com.discord.chat.presentation.message.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$13(executedCommand, (RenderContext) obj);
                    default:
                        return MessageViewReplyPreview.configureExecutedCommand_dB0_bEw$lambda$17(executedCommand, (LinkContentNode) obj);
                }
            }
        }, (2097152 & 8388608) != 0 ? new i5.a(22) : null, (4194304 & 8388608) != 0 ? new f6.a(29) : null, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : null, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx, (67108864 & 8388608) != 0 ? null : null, (8388608 & 134217728) != 0 ? false : false);
        MessageContentView replyText2 = this.binding.replyText;
        Intrinsics.checkNotNullExpressionValue(replyText2, "replyText");
        SpannableExtensionsKt.coverWithSpan(spannable, new BackgroundSpanDrawer(replyText2));
        Unit unit = Unit.f14616a;
        messageContentView.setDraweeSpanStringBuilder(ReplyUtilsKt.createReplyContent(measuredWidth, spannable));
        MessageContentView replyText3 = this.binding.replyText;
        Intrinsics.checkNotNullExpressionValue(replyText3, "replyText");
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(replyText3, true);
        SimpleDraweeView replyAuthorAvatar3 = this.binding.replyAuthorAvatar;
        Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar3, "replyAuthorAvatar");
        SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(replyAuthorAvatar3, executedCommand.getAvatarURL());
    }

    public final void configureReply(@NotNull ReferencedMessage reply, boolean showSpine, @NotNull final Function0<Unit> onClick) {
        Function1 aVar;
        Intrinsics.checkNotNullParameter(reply, "reply");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new a6.a(1, onClick), 1, null);
        if (reply instanceof LoadedReferencedMessage) {
            LoadedReferencedMessage loadedReferencedMessage = (LoadedReferencedMessage) reply;
            Message message = loadedReferencedMessage.getMessage();
            StructurableText systemContent = loadedReferencedMessage.getSystemContent();
            configureLeadingIcon(message);
            configureTrailingIcon(message);
            configureClanTagChiplet(message);
            ChannelSpineView replySpline = this.binding.replySpline;
            Intrinsics.checkNotNullExpressionValue(replySpline, "replySpline");
            replySpline.setVisibility(showSpine ? 0 : 8);
            LinearLayout replyLeadingViews = this.binding.replyLeadingViews;
            Intrinsics.checkNotNullExpressionValue(replyLeadingViews, "replyLeadingViews");
            replyLeadingViews.setVisibility(0);
            MessageContentView replyText = this.binding.replyText;
            Intrinsics.checkNotNullExpressionValue(replyText, "replyText");
            replyText.setVisibility(0);
            if (!message.getShouldShowRoleDot() || (message.getRoleColor() == null && message.getRoleColors() == null)) {
                RoleDotView replyRoleDot = this.binding.replyRoleDot;
                Intrinsics.checkNotNullExpressionValue(replyRoleDot, "replyRoleDot");
                replyRoleDot.setVisibility(8);
            } else {
                RoleDotView replyRoleDot2 = this.binding.replyRoleDot;
                Intrinsics.checkNotNullExpressionValue(replyRoleDot2, "replyRoleDot");
                replyRoleDot2.setVisibility(0);
                RoleDotView roleDotView = this.binding.replyRoleDot;
                RoleColors androidColors = RoleColorsKt.toAndroidColors(message.getRoleColors());
                if (androidColors == null) {
                    androidColors = new RoleColors(MessageKt.roleDotColor$default(message, 0, 1, null), (Integer) null, (Integer) null, 6, (DefaultConstructorMarker) null);
                }
                roleDotView.configure(androidColors, 16);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            String strAvatarUrl = MessageKt.avatarUrl(message, context);
            if (strAvatarUrl == null || message.getUsername() == null || message.m263getAuthorIdwUX8bhU() == null) {
                SimpleDraweeView replyAuthorAvatar = this.binding.replyAuthorAvatar;
                Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar, "replyAuthorAvatar");
                replyAuthorAvatar.setVisibility(8);
                TextView replyAuthorName = this.binding.replyAuthorName;
                Intrinsics.checkNotNullExpressionValue(replyAuthorName, "replyAuthorName");
                replyAuthorName.setVisibility(8);
                SimpleDraweeView replyIcon = this.binding.replyIcon;
                Intrinsics.checkNotNullExpressionValue(replyIcon, "replyIcon");
                replyIcon.setVisibility(message.isPollResult() ? 8 : 0);
            } else {
                SimpleDraweeView replyAuthorAvatar2 = this.binding.replyAuthorAvatar;
                Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar2, "replyAuthorAvatar");
                replyAuthorAvatar2.setVisibility(0);
                SimpleDraweeView replyIcon2 = this.binding.replyIcon;
                Intrinsics.checkNotNullExpressionValue(replyIcon2, "replyIcon");
                replyIcon2.setVisibility(8);
                SimpleDraweeView replyAuthorAvatar3 = this.binding.replyAuthorAvatar;
                Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar3, "replyAuthorAvatar");
                SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(replyAuthorAvatar3, strAvatarUrl);
                this.binding.replyAuthorAvatar.setContentDescription(null);
                TextView replyAuthorName2 = this.binding.replyAuthorName;
                Intrinsics.checkNotNullExpressionValue(replyAuthorName2, "replyAuthorName");
                replyAuthorName2.setVisibility(0);
                this.binding.replyAuthorName.setText(message.getUsername());
                TextView textView = this.binding.replyAuthorName;
                textView.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
                Intrinsics.checkNotNull(textView);
                MessageUtilsKt.clearOrSetRoleColors(textView, message);
                DisplayNameStylesUtils.INSTANCE.applyDisplayNameStyles(textView, message.getDisplayNameStyles());
                Intrinsics.checkNotNull(textView);
            }
            aVar = new com.discord.age_assurance.a(systemContent, this, message, 2);
        } else {
            if (!(reply instanceof SystemReferencedMessage)) {
                throw new rn.n();
            }
            String content = ((SystemReferencedMessage) reply).getContent();
            ChannelSpineView replySpline2 = this.binding.replySpline;
            Intrinsics.checkNotNullExpressionValue(replySpline2, "replySpline");
            replySpline2.setVisibility(showSpine ? 0 : 8);
            LinearLayout replyLeadingViews2 = this.binding.replyLeadingViews;
            Intrinsics.checkNotNullExpressionValue(replyLeadingViews2, "replyLeadingViews");
            replyLeadingViews2.setVisibility(0);
            SimpleDraweeView replyAuthorAvatar4 = this.binding.replyAuthorAvatar;
            Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar4, "replyAuthorAvatar");
            replyAuthorAvatar4.setVisibility(0);
            SimpleDraweeView replyAuthorAvatar5 = this.binding.replyAuthorAvatar;
            Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar5, "replyAuthorAvatar");
            ReactAssetUtilsKt.setReactAsset(replyAuthorAvatar5, ReactAsset.DefaultAvatar0);
            this.binding.replyAuthorAvatar.setContentDescription(null);
            TextView replyAuthorName3 = this.binding.replyAuthorName;
            Intrinsics.checkNotNullExpressionValue(replyAuthorName3, "replyAuthorName");
            replyAuthorName3.setVisibility(8);
            SimpleDraweeView replyIcon3 = this.binding.replyIcon;
            Intrinsics.checkNotNullExpressionValue(replyIcon3, "replyIcon");
            replyIcon3.setVisibility(8);
            this.binding.replyIcon.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundBaseLowest());
            MessageContentView replyText2 = this.binding.replyText;
            Intrinsics.checkNotNullExpressionValue(replyText2, "replyText");
            replyText2.setVisibility(0);
            aVar = new b7.a(11, this, content);
            SimpleDraweeView replyTrailingIcon = this.binding.replyTrailingIcon;
            Intrinsics.checkNotNullExpressionValue(replyTrailingIcon, "replyTrailingIcon");
            replyTrailingIcon.setVisibility(8);
            ClanTagChipletView tagChiplet = this.binding.tagChiplet;
            Intrinsics.checkNotNullExpressionValue(tagChiplet, "tagChiplet");
            tagChiplet.setVisibility(8);
        }
        this.binding.replyLeadingViews.measure(0, 0);
        aVar.invoke(Integer.valueOf(this.binding.replyLeadingViews.getMeasuredWidth()));
        if (!this.binding.replyText.isLaidOut() || this.binding.replyText.isLayoutRequested()) {
            MessageContentView replyText3 = this.binding.replyText;
            Intrinsics.checkNotNullExpressionValue(replyText3, "replyText");
            replyText3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.chat.presentation.message.MessageViewReplyPreview$configureReply$$inlined$doOnNextLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    if (this.this$0.binding.replyText.getWidth() <= 0) {
                        return;
                    }
                    this.this$0.measureAndSetReplyLeadingViewsHeight();
                    ViewMeasureExtensionsKt.measureAndLayout(this.this$0);
                }
            });
        } else {
            measureAndSetReplyLeadingViewsHeight();
        }
        setImportantForAccessibility(1);
        u0.p(this, new androidx.core.view.b() { // from class: com.discord.chat.presentation.message.MessageViewReplyPreview.configureReply.6
            @Override // androidx.core.view.b
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfoCompat info) {
                Intrinsics.checkNotNullParameter(host, "host");
                Intrinsics.checkNotNullParameter(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.o("android.widget.Button");
                Context context2 = MessageViewReplyPreview.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(I18nUtilsKt.i18nFormat$default(context2, I18nMessage.MOBILE_REPLY_PREVIEW_A11Y_LABEL, null, 2, null));
                spannableStringBuilder.append((CharSequence) ", ");
                spannableStringBuilder.append(MessageViewReplyPreview.this.binding.replyAuthorName.getText());
                spannableStringBuilder.append((CharSequence) ", ");
                spannableStringBuilder.append(MessageViewReplyPreview.this.binding.replyText.getText());
                info.s(spannableStringBuilder);
                Context context3 = MessageViewReplyPreview.this.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                info.b(new androidx.core.view.accessibility.a(16, I18nUtilsKt.i18nFormat$default(context3, I18nMessage.MOBILE_SCROLL_TO_MESSAGE_ACTION_A11Y_LABEL, null, 2, null)));
            }

            @Override // androidx.core.view.b
            public boolean performAccessibilityAction(View host, int action, Bundle args) {
                Intrinsics.checkNotNullParameter(host, "host");
                if (action == 16) {
                    onClick.invoke();
                }
                return super.performAccessibilityAction(host, action, args);
            }
        });
    }

    @Override // com.discord.chat.presentation.spine.SpineParentMessage
    @NotNull
    public View getSpineOriginView() {
        SimpleDraweeView simpleDraweeView = this.binding.replyAuthorAvatar;
        Intrinsics.checkNotNull(simpleDraweeView);
        if (simpleDraweeView.getVisibility() != 0) {
            simpleDraweeView = null;
        }
        if (simpleDraweeView != null) {
            return simpleDraweeView;
        }
        SimpleDraweeView replyIcon = this.binding.replyIcon;
        Intrinsics.checkNotNullExpressionValue(replyIcon, "replyIcon");
        return replyIcon;
    }

    public /* synthetic */ MessageViewReplyPreview(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageViewReplyPreview(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        MessageViewReplyPreviewBinding messageViewReplyPreviewBindingInflate = MessageViewReplyPreviewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(messageViewReplyPreviewBindingInflate, "inflate(...)");
        this.binding = messageViewReplyPreviewBindingInflate;
        this.replyTextLineBounds = new Rect();
        SimpleDraweeView simpleDraweeView = messageViewReplyPreviewBindingInflate.replyIcon;
        if (!simpleDraweeView.isInEditMode()) {
            Intrinsics.checkNotNull(simpleDraweeView);
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.ArrowAngleLeftUpIcon);
            ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
            ViewBackgroundUtilsKt.setBackgroundOval$default(simpleDraweeView, ThemeManagerKt.getTheme().getBackgroundBaseLowest(), 0, 2, null);
        }
        TextView replyAuthorName = messageViewReplyPreviewBindingInflate.replyAuthorName;
        Intrinsics.checkNotNullExpressionValue(replyAuthorName, "replyAuthorName");
        DiscordFontUtilsKt.setDiscordFont(replyAuthorName, DiscordFont.PrimarySemibold);
        TextView replyAuthorName2 = messageViewReplyPreviewBindingInflate.replyAuthorName;
        Intrinsics.checkNotNullExpressionValue(replyAuthorName2, "replyAuthorName");
        SetTextSizeSpKt.setTextSizeSp(replyAuthorName2, 12.0f);
        messageViewReplyPreviewBindingInflate.replyAuthorName.setMaxWidth((int) (((double) getResources().getDisplayMetrics().widthPixels) * 0.4d));
        SimpleDraweeView replyLeadingIcon = messageViewReplyPreviewBindingInflate.replyLeadingIcon;
        Intrinsics.checkNotNullExpressionValue(replyLeadingIcon, "replyLeadingIcon");
        ColorUtilsKt.setTintColor(replyLeadingIcon, Integer.valueOf(ThemeManagerKt.getTheme().getTextSubtle()));
        SimpleDraweeView replyTrailingIcon = messageViewReplyPreviewBindingInflate.replyTrailingIcon;
        Intrinsics.checkNotNullExpressionValue(replyTrailingIcon, "replyTrailingIcon");
        ColorUtilsKt.setTintColor(replyTrailingIcon, Integer.valueOf(ThemeManagerKt.getTheme().getTextSubtle()));
        SimpleDraweeView replyAuthorAvatar = messageViewReplyPreviewBindingInflate.replyAuthorAvatar;
        Intrinsics.checkNotNullExpressionValue(replyAuthorAvatar, "replyAuthorAvatar");
        ViewClippingUtilsKt.clipToCircle(replyAuthorAvatar);
        MessageContentView messageContentView = messageViewReplyPreviewBindingInflate.replyText;
        Intrinsics.checkNotNull(messageContentView);
        DiscordFontUtilsKt.setDiscordFont(messageContentView, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(messageContentView, 12.0f);
        messageContentView.setTextColor(ThemeManagerKt.getTheme().getInteractiveTextDefault());
        float dimension = getResources().getDimension(R.dimen.message_start_guideline);
        float f2 = 2;
        float dimension2 = (dimension / f2) - (getResources().getDimension(com.discord.channel_spine.R.dimen.spine_width) / f2);
        float dimension3 = (dimension - getResources().getDimension(R.dimen.message_reply_leading_views_margin_start)) - dimension2;
        messageViewReplyPreviewBindingInflate.replySpline.configureAsReplySpline();
        ChannelSpineView replySpline = messageViewReplyPreviewBindingInflate.replySpline;
        Intrinsics.checkNotNullExpressionValue(replySpline, "replySpline");
        ViewGroup.LayoutParams layoutParams = replySpline.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = (int) dimension3;
            marginLayoutParams.setMarginStart((int) dimension2);
            replySpline.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
