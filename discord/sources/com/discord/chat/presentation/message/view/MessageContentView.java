package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.u0;
import androidx.lifecycle.r0;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.bridge.contentnode.GameMentionContentNode;
import com.discord.chat.bridge.contentnode.InlineCodeContentNode;
import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.contentnode.SoundmojiContentNode;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.bridge.truncation.Truncation;
import com.discord.chat.presentation.message.messagepart.MessageMargins;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderEventHandlers;
import com.discord.chat.presentation.message.view.botuikit.MarkdownTextRenderOptions;
import com.discord.chat.presentation.textutils.LinkStyle;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.span.utilities.spannable.BoldSpan;
import com.discord.span.utilities.spannable.ClickableSpan;
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan;
import com.discord.span.utilities.spannable.QuoteSpan;
import com.discord.span.utilities.spannable.SpoilerSpan;
import com.discord.theme.DiscordThemeObject;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u0000 a2\u00020\u00012\u00020\u0002:\u0002abB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJS\u0010\u001b\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\"\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\"\u0010#JC\u0010-\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u0017¢\u0006\u0004\b-\u0010.JÕ\u0004\u0010-\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u00172\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00150\u00142\"\u00107\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0015062*\u00109\u001a&\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u0015082\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u00142\u0018\u0010<\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150;2:\u0010>\u001a6\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\u00150=2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u00150\u00142\u0014\b\u0002\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00150D2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00150\u00142\u0014\b\u0002\u0010M\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020L0\u00142\u0006\u0010N\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010P\u001a\u00020O2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u0017¢\u0006\u0004\bQ\u0010RJ\u0019\u0010U\u001a\u00020\u00152\b\u0010T\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bU\u0010VJ\u0011\u0010W\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020\u0015¢\u0006\u0004\bY\u0010ZR\u0018\u0010N\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010[R\u001b\u0010`\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/discord/chat/presentation/message/view/MessageContentView;", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/discord/chat/presentation/message/messagepart/MessageMargins;", "margins", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/truncation/Truncation;", "truncation", "constrainedWidth", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "spannableStringBuilder", "Lkotlin/Function1;", "", "onTapSeeMore", "", "isForwardedContent", "truncate-l3ndG-o", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Ljava/lang/String;Lcom/discord/chat/bridge/truncation/Truncation;ILcom/facebook/drawee/span/DraweeSpanStringBuilder;Lkotlin/jvm/functions/Function1;Z)V", "truncate", "Landroid/text/SpannableStringBuilder;", "", "editedLabel", "editedLabelTextColor", "editedTimestamp", "onTapTimestamp", "appendEditedLabel", "(Landroid/text/SpannableStringBuilder;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/bridge/structurabletext/StructurableText;", "messageContent", "Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;", "options", "Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;", "eventHandlers", "", "emojiBaselineHeightOverridePx", "shouldOmitTopAndBottomHeadingSpacerNewLine", "setMessageContent", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/structurabletext/StructurableText;Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderOptions;Lcom/discord/chat/presentation/message/view/botuikit/MarkdownTextRenderEventHandlers;Ljava/lang/Float;Z)V", "shouldAnimateEmoji", "shouldShowLinkDecorations", "shouldShowRoleDot", "shouldShowRoleOnName", "Lcom/discord/chat/bridge/contentnode/LinkContentNode;", "onTapLink", "onLongTapLink", "Lkotlin/Function3;", "onTapChannel", "Lkotlin/Function4;", "onLongPressChannel", "onTapAttachmentLink", "Lkotlin/Function2;", "onLongPressAttachmentLink", "Lkotlin/Function6;", "onTapMention", "Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;", "onTapCommand", "onLongPressCommand", "Lcom/discord/chat/bridge/contentnode/GameMentionContentNode;", "onTapGameMention", "Lkotlin/Function0;", "onTapSpoiler", "Lcom/discord/chat/bridge/contentnode/InlineCodeContentNode;", "onTapInlineCode", "Lcom/discord/chat/bridge/contentnode/EmojiContentNode;", "onTapEmoji", "Lcom/discord/chat/bridge/contentnode/SoundmojiContentNode;", "onTapSoundmoji", "Lcom/discord/chat/presentation/textutils/LinkStyle;", "linkStyleProvider", "bottomSpacingPx", "Lcom/discord/theme/DiscordThemeObject;", "theme", "setMessageContent-hYrISQc", "(Lcom/discord/chat/presentation/message/messagepart/MessageMargins;Lcom/discord/chat/bridge/structurabletext/StructurableText;Ljava/lang/String;ZZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function6;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IIZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/discord/chat/bridge/truncation/Truncation;Lcom/discord/theme/DiscordThemeObject;Ljava/lang/Float;Z)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "spacingPxOverride", "()Ljava/lang/Integer;", "revealAllSpoilers", "()V", "Ljava/lang/Integer;", "shadowView$delegate", "Lkotlin/Lazy;", "getShadowView", "()Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "shadowView", "Companion", "MessageContentViewAccessibilityDelegate", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class MessageContentView extends SimpleDraweeSpanTextView implements VerticalSpacingItemDecoration.SpacingProviderView {
    private static final float LINE_SPACING_ADD = 0.0f;
    private static final float LINE_SPACING_MULT = 1.05f;
    private Integer bottomSpacingPx;

    /* JADX INFO: renamed from: shadowView$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy shadowView;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/MessageContentView$MessageContentViewAccessibilityDelegate;", "Landroidx/core/view/b;", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "view", "<init>", "(Lcom/discord/chat/presentation/message/view/MessageContentView;)V", "Landroid/view/View;", "host", "Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;", "info", "", "onInitializeAccessibilityNodeInfo", "(Landroid/view/View;Landroidx/core/view/accessibility/AccessibilityNodeInfoCompat;)V", "", "action", "Landroid/os/Bundle;", "args", "", "performAccessibilityAction", "(Landroid/view/View;ILandroid/os/Bundle;)Z", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MessageContentViewAccessibilityDelegate extends androidx.core.view.b {

        @NotNull
        private final MessageContentView view;

        public MessageContentViewAccessibilityDelegate(@NotNull MessageContentView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        @Override // androidx.core.view.b
        public void onInitializeAccessibilityNodeInfo(@NotNull View host, @NotNull AccessibilityNodeInfoCompat info) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(info, "info");
            super.onInitializeAccessibilityNodeInfo(host, info);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.view.getText());
            Iterator it = ArrayIteratorKt.iterator(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), SpoilerSpan.class));
            boolean z5 = false;
            while (it.hasNext()) {
                SpoilerSpan spoilerSpan = (SpoilerSpan) it.next();
                if (!spoilerSpan.getIsRevealed()) {
                    int spanStart = spannableStringBuilder.getSpanStart(spoilerSpan);
                    int spanEnd = spannableStringBuilder.getSpanEnd(spoilerSpan);
                    Context context = host.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    spannableStringBuilder.replace(spanStart, spanEnd, I18nUtilsKt.i18nFormat$default(context, I18nMessage.SPOILER_HIDDEN_A11Y_LABEL, null, 2, null));
                    z5 = true;
                }
            }
            Iterator it2 = ArrayIteratorKt.iterator(spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), EmojiAccessibilitySpan.class));
            while (it2.hasNext()) {
                EmojiAccessibilitySpan emojiAccessibilitySpan = (EmojiAccessibilitySpan) it2.next();
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(emojiAccessibilitySpan), spannableStringBuilder.getSpanEnd(emojiAccessibilitySpan), (CharSequence) emojiAccessibilitySpan.getName());
            }
            info.A(spannableStringBuilder);
            if (z5) {
                Context context2 = host.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                info.b(new androidx.core.view.accessibility.a(16, I18nUtilsKt.i18nFormat$default(context2, I18nMessage.SPOILER_REVEAL_A11Y_ACTION_LABEL, null, 2, null)));
            }
        }

        @Override // androidx.core.view.b
        public boolean performAccessibilityAction(@NotNull View host, int action, Bundle args) {
            Intrinsics.checkNotNullParameter(host, "host");
            if (action != 16) {
                return super.performAccessibilityAction(host, action, args);
            }
            this.view.revealAllSpoilers();
            host.post(new androidx.core.view.z(2, host));
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageContentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void appendEditedLabel(SpannableStringBuilder spannableStringBuilder, String editedLabel, Integer editedLabelTextColor, String editedTimestamp, Function1<? super String, Unit> onTapTimestamp) {
        Object[] spans = spannableStringBuilder.getSpans(spannableStringBuilder.length(), spannableStringBuilder.length(), QuoteSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        QuoteSpan quoteSpan = (QuoteSpan) kotlin.collections.y.t(spans);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) (" (" + editedLabel + ")"));
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(editedLabelTextColor != null ? editedLabelTextColor.intValue() : ThemeManagerKt.getTheme().getTextMuted()), length, spannableStringBuilder.length(), 33);
        if (editedTimestamp != null && !StringsKt.K(editedTimestamp)) {
            spannableStringBuilder.setSpan(new ClickableSpan(null, Integer.valueOf(editedLabelTextColor != null ? editedLabelTextColor.intValue() : ThemeManagerKt.getTheme().getTextMuted()), null, null, LINE_SPACING_ADD, null, null, new v(1, editedTimestamp, onTapTimestamp), 125, null), length, spannableStringBuilder.length(), 33);
        }
        if (quoteSpan != null) {
            spannableStringBuilder.setSpan(quoteSpan, spannableStringBuilder.getSpanStart(quoteSpan), spannableStringBuilder.length(), spannableStringBuilder.getSpanFlags(quoteSpan));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit appendEditedLabel$lambda$5(Function1 function1, String str, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(str);
        return Unit.f14616a;
    }

    private final SimpleDraweeSpanTextView getShadowView() {
        return (SimpleDraweeSpanTextView) this.shadowView.getValue();
    }

    public static /* synthetic */ void setMessageContent$default(MessageContentView messageContentView, MessageMargins messageMargins, StructurableText structurableText, MarkdownTextRenderOptions markdownTextRenderOptions, MarkdownTextRenderEventHandlers markdownTextRenderEventHandlers, Float f2, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMessageContent");
        }
        if ((i7 & 16) != 0) {
            f2 = null;
        }
        Float f7 = f2;
        if ((i7 & 32) != 0) {
            z5 = false;
        }
        messageContentView.setMessageContent(messageMargins, structurableText, markdownTextRenderOptions, markdownTextRenderEventHandlers, f7, z5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStyle setMessageContent$lambda$1(LinkContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new LinkStyle(DiscordFont.PrimaryNormal, ThemeManagerKt.getTheme().getTextLink(), null, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: setMessageContent-hYrISQc$default, reason: not valid java name */
    public static /* synthetic */ void m747setMessageContenthYrISQc$default(MessageContentView messageContentView, MessageMargins messageMargins, StructurableText structurableText, String str, boolean z5, boolean z6, boolean z7, boolean z10, Function1 function1, Function1 function2, Function3 function3, Function4 function4, Function1 function5, Function2 function6, Function6 function7, Function1 function8, Function1 function9, Function1 function10, Function0 function0, Function1 function11, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, int i7, int i10, boolean z11, String str2, String str3, Integer num, Truncation truncation, DiscordThemeObject discordThemeObject, Float f2, boolean z12, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMessageContent-hYrISQc");
        }
        messageContentView.m749setMessageContenthYrISQc(messageMargins, structurableText, str, z5, z6, z7, z10, function1, function2, function3, function4, function5, function6, function7, function8, function9, (i11 & 65536) != 0 ? new com.discord.chat.presentation.list.delegate.a(21) : function10, function0, function11, function12, function13, function14, function15, (i11 & 8388608) != 0 ? new com.discord.chat.presentation.list.delegate.a(22) : function16, i7, i10, z11, (i11 & 134217728) != 0 ? null : str2, (i11 & 268435456) != 0 ? null : str3, (i11 & 536870912) != 0 ? null : num, (i11 & 1073741824) != 0 ? null : truncation, (i11 & Integer.MIN_VALUE) != 0 ? ThemeManagerKt.getTheme() : discordThemeObject, (i12 & 1) != 0 ? null : f2, (i12 & 2) != 0 ? false : z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setMessageContent_hYrISQc$lambda$2(GameMentionContentNode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkStyle setMessageContent_hYrISQc$lambda$3(LinkContentNode linkContentNode) {
        Intrinsics.checkNotNullParameter(linkContentNode, "<unused var>");
        return new LinkStyle(null, 0, null, null, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDraweeSpanTextView shadowView_delegate$lambda$0(MessageContentView messageContentView) {
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = new SimpleDraweeSpanTextView(messageContentView.getContext());
        simpleDraweeSpanTextView.setBreakStrategy(messageContentView.getBreakStrategy());
        simpleDraweeSpanTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return simpleDraweeSpanTextView;
    }

    /* JADX INFO: renamed from: truncate-l3ndG-o, reason: not valid java name */
    private final void m748truncatel3ndGo(MessageMargins margins, String messageId, Truncation truncation, int constrainedWidth, DraweeSpanStringBuilder spannableStringBuilder, Function1<? super MessageId, Unit> onTapSeeMore, boolean isForwardedContent) {
        int numberOfLines = truncation.getNumberOfLines();
        boolean expandable = truncation.getExpandable();
        int width = MessageMargins.INSTANCE.getWidth(margins, constrainedWidth, isForwardedContent);
        getShadowView().setTypeface(getTypeface());
        getShadowView().setTextSize(0, getTextSize());
        getShadowView().setLineSpacing(LINE_SPACING_ADD, LINE_SPACING_MULT);
        getShadowView().setDraweeSpanStringBuilder(spannableStringBuilder);
        getShadowView().measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        getShadowView().layout(0, 0, getShadowView().getMeasuredWidth(), getShadowView().getMeasuredHeight());
        Layout layout = getShadowView().getLayout();
        if (getShadowView().getLineCount() > numberOfLines) {
            int lineVisibleEnd = layout.getLineVisibleEnd(numberOfLines - 1);
            if (!expandable) {
                spannableStringBuilder.delete(lineVisibleEnd, spannableStringBuilder.length());
                return;
            }
            String seeMoreLabel = truncation.getSeeMoreLabel();
            Integer seeMoreLabelColor = truncation.getSeeMoreLabelColor();
            spannableStringBuilder.replace(lineVisibleEnd, spannableStringBuilder.length(), (CharSequence) a3.e.l(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, seeMoreLabel));
            spannableStringBuilder.setSpan(new ClickableSpan(NestedClickableSpan.TouchPriority.HIGH, Integer.valueOf(seeMoreLabelColor != null ? seeMoreLabelColor.intValue() : ThemeManagerKt.getTheme().getTextLink()), null, null, LINE_SPACING_ADD, null, null, new v(0, messageId, onTapSeeMore), 124, null), lineVisibleEnd, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new BoldSpan(), lineVisibleEnd, spannableStringBuilder.length(), 33);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit truncate_l3ndG_o$lambda$4(Function1 function1, String str, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(MessageId.m1156boximpl(str));
        return Unit.f14616a;
    }

    public final void revealAllSpoilers() {
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        Iterator it = ArrayIteratorKt.iterator(spanned.getSpans(0, spanned.length(), SpoilerSpan.class));
        while (it.hasNext()) {
            SpoilerSpan spoilerSpan = (SpoilerSpan) it.next();
            if (!spoilerSpan.getIsRevealed()) {
                spoilerSpan.reveal();
            }
        }
    }

    public final void setMessageContent(@NotNull MessageMargins margins, @NotNull StructurableText messageContent, @NotNull MarkdownTextRenderOptions options, @NotNull MarkdownTextRenderEventHandlers eventHandlers, Float emojiBaselineHeightOverridePx, boolean shouldOmitTopAndBottomHeadingSpacerNewLine) {
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(eventHandlers, "eventHandlers");
        m747setMessageContenthYrISQc$default(this, margins, messageContent, MessageId.m1157constructorimpl(options.getContainerId()), options.getShouldAnimateEmoji(), options.getShouldShowLinkDecorations(), options.getShouldShowRoleDot(), options.getShouldShowRoleOnName(), eventHandlers.getOnLinkClicked(), eventHandlers.getOnLinkLongClicked(), eventHandlers.getOnTapChannel(), eventHandlers.getOnLongPressChannel(), eventHandlers.getOnTapAttachmentLink(), eventHandlers.getOnLongPressAttachmentLink(), eventHandlers.getOnTapMention(), eventHandlers.getOnTapCommand(), eventHandlers.getOnLongPressCommand(), eventHandlers.getOnTapGameMention(), eventHandlers.getOnTapSpoiler(), eventHandlers.getOnTapTimestamp(), eventHandlers.getOnTapInlineCode(), eventHandlers.getOnTapEmoji(), new Function1<MessageId, Unit>() { // from class: com.discord.chat.presentation.message.view.MessageContentView.setMessageContent.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m750invoke1xi1bu0(((MessageId) obj).m1165unboximpl());
                return Unit.f14616a;
            }

            /* JADX INFO: renamed from: invoke-1xi1bu0, reason: not valid java name */
            public final void m750invoke1xi1bu0(String str) {
                Intrinsics.checkNotNullParameter(str, "<unused var>");
            }
        }, eventHandlers.getOnTapSoundmoji(), new com.discord.chat.presentation.list.delegate.a(23), 0, 0, false, null, null, null, null, null, emojiBaselineHeightOverridePx, shouldOmitTopAndBottomHeadingSpacerNewLine, -134217728, 0, null);
    }

    /* JADX INFO: renamed from: setMessageContent-hYrISQc, reason: not valid java name */
    public final void m749setMessageContenthYrISQc(@NotNull MessageMargins margins, @NotNull StructurableText messageContent, @NotNull String messageId, boolean shouldAnimateEmoji, boolean shouldShowLinkDecorations, boolean shouldShowRoleDot, boolean shouldShowRoleOnName, @NotNull Function1<? super LinkContentNode, Unit> onTapLink, @NotNull Function1<? super LinkContentNode, Unit> onLongTapLink, @NotNull Function3 onTapChannel, @NotNull Function4 onLongPressChannel, @NotNull Function1<? super String, Unit> onTapAttachmentLink, @NotNull Function2<? super String, ? super String, Unit> onLongPressAttachmentLink, @NotNull Function6 onTapMention, @NotNull Function1<? super CommandMentionContentNode, Unit> onTapCommand, @NotNull Function1<? super CommandMentionContentNode, Unit> onLongPressCommand, @NotNull Function1<? super GameMentionContentNode, Unit> onTapGameMention, @NotNull Function0<Unit> onTapSpoiler, @NotNull Function1<? super String, Unit> onTapTimestamp, @NotNull Function1<? super InlineCodeContentNode, Unit> onTapInlineCode, @NotNull Function1<? super EmojiContentNode, Unit> onTapEmoji, @NotNull Function1<? super MessageId, Unit> onTapSeeMore, @NotNull Function1<? super SoundmojiContentNode, Unit> onTapSoundmoji, @NotNull Function1<? super LinkContentNode, LinkStyle> linkStyleProvider, int bottomSpacingPx, int constrainedWidth, boolean isForwardedContent, String editedLabel, String editedTimestamp, Integer editedLabelTextColor, Truncation truncation, @NotNull DiscordThemeObject theme, Float emojiBaselineHeightOverridePx, boolean shouldOmitTopAndBottomHeadingSpacerNewLine) {
        DraweeSpanStringBuilder draweeSpanStringBuilder;
        MessageContentView messageContentView;
        Intrinsics.checkNotNullParameter(margins, "margins");
        Intrinsics.checkNotNullParameter(messageContent, "messageContent");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(onTapLink, "onTapLink");
        Intrinsics.checkNotNullParameter(onLongTapLink, "onLongTapLink");
        Intrinsics.checkNotNullParameter(onTapChannel, "onTapChannel");
        Intrinsics.checkNotNullParameter(onLongPressChannel, "onLongPressChannel");
        Intrinsics.checkNotNullParameter(onTapAttachmentLink, "onTapAttachmentLink");
        Intrinsics.checkNotNullParameter(onLongPressAttachmentLink, "onLongPressAttachmentLink");
        Intrinsics.checkNotNullParameter(onTapMention, "onTapMention");
        Intrinsics.checkNotNullParameter(onTapCommand, "onTapCommand");
        Intrinsics.checkNotNullParameter(onLongPressCommand, "onLongPressCommand");
        Intrinsics.checkNotNullParameter(onTapGameMention, "onTapGameMention");
        Intrinsics.checkNotNullParameter(onTapSpoiler, "onTapSpoiler");
        Intrinsics.checkNotNullParameter(onTapTimestamp, "onTapTimestamp");
        Intrinsics.checkNotNullParameter(onTapInlineCode, "onTapInlineCode");
        Intrinsics.checkNotNullParameter(onTapEmoji, "onTapEmoji");
        Intrinsics.checkNotNullParameter(onTapSeeMore, "onTapSeeMore");
        Intrinsics.checkNotNullParameter(onTapSoundmoji, "onTapSoundmoji");
        Intrinsics.checkNotNullParameter(linkStyleProvider, "linkStyleProvider");
        Intrinsics.checkNotNullParameter(theme, "theme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        Intrinsics.checkNotNullExpressionValue(fontMetrics, "getFontMetrics(...)");
        float baselineHeightPx = TextUtilsKt.getBaselineHeightPx(fontMetrics);
        TextPaint paint = getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        DraweeSpanStringBuilder spannable = TextUtilsKt.toSpannable(messageContent, context, messageId, shouldAnimateEmoji, shouldShowLinkDecorations, shouldShowRoleDot, shouldShowRoleOnName, paint, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? new f6.a(20) : onTapLink, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? new n6.e(0) : onLongTapLink, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? new b(5) : onTapChannel, (8388608 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? new c(5) : onLongPressChannel, (8388608 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? new f6.a(21) : onTapAttachmentLink, (8388608 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? new ar.s(27) : onLongPressAttachmentLink, (8388608 & 8192) != 0 ? new d(4) : onTapMention, (8388608 & 16384) != 0 ? new f6.a(22) : onTapCommand, (32768 & 8388608) != 0 ? new f6.a(23) : onLongPressCommand, (65536 & 8388608) != 0 ? new f6.a(24) : onTapGameMention, (131072 & 8388608) != 0 ? new f6.a(25) : onTapTimestamp, (262144 & 8388608) != 0 ? new f6.a(26) : onTapInlineCode, (524288 & 8388608) != 0 ? new f6.a(27) : onTapEmoji, (1048576 & 8388608) != 0 ? new f6.a(28) : linkStyleProvider, (2097152 & 8388608) != 0 ? new i5.a(22) : onTapSpoiler, (4194304 & 8388608) != 0 ? new f6.a(29) : onTapSoundmoji, (8388608 & 8388608) != 0 ? false : false, (16777216 & 8388608) != 0 ? ThemeManagerKt.getTheme() : theme, (33554432 & 8388608) != 0 ? -1.0f : baselineHeightPx, (67108864 & 8388608) != 0 ? null : emojiBaselineHeightOverridePx, (8388608 & 134217728) != 0 ? false : shouldOmitTopAndBottomHeadingSpacerNewLine);
        if (editedLabel != null && !StringsKt.K(editedLabel)) {
            appendEditedLabel(spannable, editedLabel, editedLabelTextColor, editedTimestamp, onTapTimestamp);
        }
        if (truncation != null) {
            m748truncatel3ndGo(margins, messageId, truncation, constrainedWidth, spannable, onTapSeeMore, isForwardedContent);
            messageContentView = this;
            draweeSpanStringBuilder = spannable;
        } else {
            draweeSpanStringBuilder = spannable;
            messageContentView = this;
        }
        SpannableExtensionsKt.coverWithSpan(draweeSpanStringBuilder, new BackgroundSpanDrawer(messageContentView));
        messageContentView.setDraweeSpanStringBuilder(draweeSpanStringBuilder);
        messageContentView.bottomSpacingPx = Integer.valueOf(bottomSpacingPx);
        NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener(messageContentView, true);
        u0.p(messageContentView, new MessageContentViewAccessibilityDelegate(messageContentView));
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener l6) {
        throw new UnsupportedOperationException("MessageContentView uses custom touch handling. click listeners are not supported");
    }

    @Override // com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
    /* JADX INFO: renamed from: spacingPxOverride, reason: from getter */
    public Integer getBottomSpacingPx() {
        return this.bottomSpacingPx;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageContentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MessageContentView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageContentView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.shadowView = rn.l.b(new r0(11, this));
        setLineSpacing(LINE_SPACING_ADD, LINE_SPACING_MULT);
    }
}
