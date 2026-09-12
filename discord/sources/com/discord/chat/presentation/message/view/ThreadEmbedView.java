package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.text.style.LeadingMarginSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.ThreadEmbedViewBinding;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetImageUriWithCachePolicyKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.primitives.GuildId;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.modules.dialog.AlertFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013JY\u0010\u0019\u001a\u00020\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\b\u0010 \u001a\u0004\u0018\u00010\u00132\b\u0010!\u001a\u0004\u0018\u00010\u00132\b\u0010\"\u001a\u0004\u0018\u00010#¢\u0006\u0004\b$\u0010%J\b\u0010&\u001a\u00020'H\u0002R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006("}, d2 = {"Lcom/discord/chat/presentation/message/view/ThreadEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/ThreadEmbedViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/ThreadEmbedViewBinding;", "setThread", "", AlertFragment.ARG_TITLE, "", "label", "", "setAccessibilityLabel", "setArchived", "archived", "", "iconUrl", "setMessage", "imageUrl", NotificationRenderer.USERNAME, "usernameColor", "message", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "italicizeMessage", "clanTag", "clanBadgeUrl", "clanGuildId", "Lcom/discord/primitives/GuildId;", "setMessage-CKTq3AQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/facebook/drawee/span/DraweeSpanStringBuilder;ZLjava/lang/String;Ljava/lang/String;Lcom/discord/primitives/GuildId;)V", "getLeadingMarginSpan", "Landroid/text/style/LeadingMarginSpan;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nThreadEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadEmbedView.kt\ncom/discord/chat/presentation/message/view/ThreadEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,151:1\n257#2,2:152\n257#2,2:154\n257#2,2:156\n257#2,2:158\n*S KotlinDebug\n*F\n+ 1 ThreadEmbedView.kt\ncom/discord/chat/presentation/message/view/ThreadEmbedView\n*L\n91#1:152,2\n113#1:154,2\n125#1:156,2\n127#1:158,2\n*E\n"})
public final class ThreadEmbedView extends ConstraintLayout {

    @NotNull
    private final ThreadEmbedViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LeadingMarginSpan getLeadingMarginSpan() {
        this.binding.threadEmbedMostRecentMessageHeader.measure(0, 0);
        return new LeadingMarginSpan.Standard(this.binding.threadEmbedMostRecentMessageHeader.getMeasuredWidth(), 0);
    }

    public static /* synthetic */ void setArchived$default(ThreadEmbedView threadEmbedView, boolean z5, String str, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            str = null;
        }
        threadEmbedView.setArchived(z5, str);
    }

    @NotNull
    public final ThreadEmbedViewBinding getBinding() {
        return this.binding;
    }

    public final void setAccessibilityLabel(CharSequence label) {
        setContentDescription(label);
    }

    public final void setArchived(boolean archived, String iconUrl) {
        SimpleDraweeView threadEmbedIcon = this.binding.threadEmbedIcon;
        Intrinsics.checkNotNullExpressionValue(threadEmbedIcon, "threadEmbedIcon");
        ReactAssetUtilsKt.setOptionalReactImageUrl(threadEmbedIcon, iconUrl);
        SimpleDraweeView threadEmbedIcon2 = this.binding.threadEmbedIcon;
        Intrinsics.checkNotNullExpressionValue(threadEmbedIcon2, "threadEmbedIcon");
        threadEmbedIcon2.setVisibility(archived ? 0 : 8);
    }

    /* JADX INFO: renamed from: setMessage-CKTq3AQ, reason: not valid java name */
    public final void m756setMessageCKTq3AQ(String imageUrl, String username, Integer usernameColor, @NotNull DraweeSpanStringBuilder message, boolean italicizeMessage, String clanTag, String clanBadgeUrl, GuildId clanGuildId) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (usernameColor != null) {
            this.binding.threadEmbedMostRecentMessageName.setTextColor(usernameColor.intValue());
        } else {
            this.binding.threadEmbedMostRecentMessageName.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        }
        TextView threadEmbedMostRecentMessageName = this.binding.threadEmbedMostRecentMessageName;
        Intrinsics.checkNotNullExpressionValue(threadEmbedMostRecentMessageName, "threadEmbedMostRecentMessageName");
        ViewUtilsKt.setOptionalText(threadEmbedMostRecentMessageName, username);
        SimpleDraweeView threadEmbedMostRecentMessageAvatar = this.binding.threadEmbedMostRecentMessageAvatar;
        Intrinsics.checkNotNullExpressionValue(threadEmbedMostRecentMessageAvatar, "threadEmbedMostRecentMessageAvatar");
        SetImageUriWithCachePolicyKt.setImageUriWithCachePolicy(threadEmbedMostRecentMessageAvatar, imageUrl);
        boolean z5 = username != null;
        LinearLayout threadEmbedMostRecentMessageHeader = this.binding.threadEmbedMostRecentMessageHeader;
        Intrinsics.checkNotNullExpressionValue(threadEmbedMostRecentMessageHeader, "threadEmbedMostRecentMessageHeader");
        threadEmbedMostRecentMessageHeader.setVisibility(z5 ? 0 : 8);
        SimpleDraweeSpanTextView threadEmbedMostRecentMessageContent = this.binding.threadEmbedMostRecentMessageContent;
        Intrinsics.checkNotNullExpressionValue(threadEmbedMostRecentMessageContent, "threadEmbedMostRecentMessageContent");
        DiscordFontUtilsKt.setDiscordFont(threadEmbedMostRecentMessageContent, italicizeMessage ? DiscordFont.PrimaryNormalItalic : DiscordFont.PrimaryMedium);
        if (clanTag == null || clanGuildId == null) {
            ClanTagChipletView tagChiplet = this.binding.tagChiplet;
            Intrinsics.checkNotNullExpressionValue(tagChiplet, "tagChiplet");
            tagChiplet.setVisibility(8);
        } else {
            ClanTagChipletView.m535configureETwJlQw$default(this.binding.tagChiplet, clanTag, clanBadgeUrl, clanGuildId.m1152unboximpl(), null, 0.89f, null, 32, null);
            ClanTagChipletView tagChiplet2 = this.binding.tagChiplet;
            Intrinsics.checkNotNullExpressionValue(tagChiplet2, "tagChiplet");
            tagChiplet2.setVisibility(0);
        }
        if (z5) {
            message.setSpan(getLeadingMarginSpan(), 0, message.length(), 33);
        }
        SimpleDraweeSpanTextView threadEmbedMostRecentMessageContent2 = this.binding.threadEmbedMostRecentMessageContent;
        Intrinsics.checkNotNullExpressionValue(threadEmbedMostRecentMessageContent2, "threadEmbedMostRecentMessageContent");
        SpannableExtensionsKt.coverWithSpan(message, new BackgroundSpanDrawer(threadEmbedMostRecentMessageContent2));
        this.binding.threadEmbedMostRecentMessageContent.setDraweeSpanStringBuilder(message);
    }

    public final void setThread(CharSequence title, @NotNull String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        TextView threadEmbedName = this.binding.threadEmbedName;
        Intrinsics.checkNotNullExpressionValue(threadEmbedName, "threadEmbedName");
        ViewUtilsKt.setOptionalText(threadEmbedName, title);
        TextView threadEmbedMessagesCount = this.binding.threadEmbedMessagesCount;
        Intrinsics.checkNotNullExpressionValue(threadEmbedMessagesCount, "threadEmbedMessagesCount");
        ViewUtilsKt.setOptionalText(threadEmbedMessagesCount, label);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ThreadEmbedView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadEmbedView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        ThreadEmbedViewBinding threadEmbedViewBindingInflate = ThreadEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(threadEmbedViewBindingInflate, "inflate(...)");
        this.binding = threadEmbedViewBindingInflate;
        TextView textView = threadEmbedViewBindingInflate.threadEmbedName;
        Intrinsics.checkNotNull(textView);
        DiscordFont discordFont = DiscordFont.PrimaryBold;
        DiscordFontUtilsKt.setDiscordFont(textView, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView, 14.0f);
        textView.setTextColor(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary());
        TextView textView2 = threadEmbedViewBindingInflate.threadEmbedMessagesCount;
        Intrinsics.checkNotNull(textView2);
        DiscordFontUtilsKt.setDiscordFont(textView2, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView2, 14.0f);
        textView2.setTextColor(ThemeManagerKt.getTheme().getTextLink());
        TextView textView3 = threadEmbedViewBindingInflate.threadEmbedMostRecentMessageName;
        Intrinsics.checkNotNull(textView3);
        DiscordFontUtilsKt.setDiscordFont(textView3, discordFont);
        SetTextSizeSpKt.setTextSizeSp(textView3, 14.0f);
        textView3.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = threadEmbedViewBindingInflate.threadEmbedMostRecentMessageContent;
        Intrinsics.checkNotNull(simpleDraweeSpanTextView);
        DiscordFontUtilsKt.setDiscordFont(simpleDraweeSpanTextView, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(simpleDraweeSpanTextView, 14.0f);
        simpleDraweeSpanTextView.setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
        if (ThemeManager.INSTANCE.isVisualRefreshEnabled()) {
            ViewBackgroundUtilsKt.setBackgroundRectangle(this, ThemeManagerKt.getTheme().getMobileThreadEmbedBackground(), SizeUtilsKt.getDpToPx(12), Integer.valueOf(ThemeManagerKt.getTheme().getBorderSubtle()), SizeUtilsKt.getDpToPx(1));
            RippleUtilsKt.addRipple(this, true, SizeUtilsKt.getDpToPx(12));
            return;
        }
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundModStrong(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        RippleUtilsKt.addRipple(this, true, SizeUtilsKt.getDpToPx(4));
    }
}
