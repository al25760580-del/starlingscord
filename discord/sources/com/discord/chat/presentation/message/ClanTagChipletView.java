package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.ClanTagChipletViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SetOptionalImageUrlKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.DiscordThemeObject;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J4\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/message/ClanTagChipletView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ClanTagChipletViewBinding;", "configure", "", "tagContent", "", "badgeUrl", "guildId", "Lcom/discord/primitives/GuildId;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "scale", "", "theme", "Lcom/discord/theme/DiscordThemeObject;", "configure-ETwJlQw", "(Ljava/lang/String;Ljava/lang/String;JLcom/discord/chat/presentation/events/ChatEventHandler;FLcom/discord/theme/DiscordThemeObject;)V", "configureAppearance", "useControllerIconFallback", "", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nClanTagChipletView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClanTagChipletView.kt\ncom/discord/chat/presentation/message/ClanTagChipletView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,116:1\n257#2,2:117\n257#2,2:119\n257#2,2:121\n*S KotlinDebug\n*F\n+ 1 ClanTagChipletView.kt\ncom/discord/chat/presentation/message/ClanTagChipletView\n*L\n90#1:117,2\n99#1:119,2\n102#1:121,2\n*E\n"})
public final class ClanTagChipletView extends FrameLayout {
    private static final float BASE_BADGE_SIZE = 12.0f;
    private static final float BASE_HEIGHT = 18.0f;
    private static final float BASE_PADDING_HORIZONTAL = 4.0f;

    @NotNull
    private final ClanTagChipletViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClanTagChipletView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ClanTagChipletViewBinding clanTagChipletViewBindingInflate = ClanTagChipletViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(clanTagChipletViewBindingInflate, "inflate(...)");
        this.binding = clanTagChipletViewBindingInflate;
        LinearLayout container = clanTagChipletViewBindingInflate.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        ViewClippingUtilsKt.clipToRoundedRectangle(container, SizeUtilsKt.getDpToPx(4));
        TextView tag = clanTagChipletViewBindingInflate.tag;
        Intrinsics.checkNotNullExpressionValue(tag, "tag");
        SetTextSizeSpKt.setTextSizeSp(tag, BASE_BADGE_SIZE);
        TextView tag2 = clanTagChipletViewBindingInflate.tag;
        Intrinsics.checkNotNullExpressionValue(tag2, "tag");
        DiscordFontUtilsKt.setDiscordFont(tag2, DiscordFont.PrimarySemibold);
    }

    public static /* synthetic */ void configure$default(ClanTagChipletView clanTagChipletView, String str, String str2, float f2, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            f2 = 1.0f;
        }
        clanTagChipletView.configure(str, str2, f2);
    }

    /* JADX INFO: renamed from: configure-ETwJlQw$default, reason: not valid java name */
    public static /* synthetic */ void m535configureETwJlQw$default(ClanTagChipletView clanTagChipletView, String str, String str2, long j, ChatEventHandler chatEventHandler, float f2, DiscordThemeObject discordThemeObject, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            f2 = 1.0f;
        }
        clanTagChipletView.m536configureETwJlQw(str, str2, j, chatEventHandler, f2, (i7 & 32) != 0 ? ThemeManagerKt.getEffectiveTheme() : discordThemeObject);
    }

    private final void configureAppearance(String tagContent, String badgeUrl, float scale, boolean useControllerIconFallback, DiscordThemeObject theme) {
        this.binding.container.setBackgroundColor(theme.getBackgroundModStrong());
        this.binding.tag.setTextColor(theme.getTextDefault());
        this.binding.container.getLayoutParams().height = SizeUtilsKt.getDpToPx(BASE_HEIGHT * scale);
        int dpToPx = SizeUtilsKt.getDpToPx(4.0f * scale);
        this.binding.container.setPadding(dpToPx, 0, dpToPx, 0);
        float f2 = BASE_BADGE_SIZE * scale;
        int dpToPx2 = SizeUtilsKt.getDpToPx(f2);
        if (badgeUrl != null) {
            SimpleDraweeView badge = this.binding.badge;
            Intrinsics.checkNotNullExpressionValue(badge, "badge");
            ColorUtilsKt.setTintColor(badge, (Integer) null);
            SimpleDraweeView badge2 = this.binding.badge;
            Intrinsics.checkNotNullExpressionValue(badge2, "badge");
            SetOptionalImageUrlKt.setOptionalImageUrl$default(badge2, badgeUrl, null, null, null, null, null, 62, null);
            ViewGroup.LayoutParams layoutParams = this.binding.badge.getLayoutParams();
            layoutParams.width = dpToPx2;
            layoutParams.height = dpToPx2;
            SimpleDraweeView badge3 = this.binding.badge;
            Intrinsics.checkNotNullExpressionValue(badge3, "badge");
            badge3.setVisibility(0);
        } else if (useControllerIconFallback) {
            SimpleDraweeView badge4 = this.binding.badge;
            Intrinsics.checkNotNullExpressionValue(badge4, "badge");
            ReactAssetUtilsKt.setReactAsset(badge4, ReactAsset.GameControllerIcon);
            SimpleDraweeView badge5 = this.binding.badge;
            Intrinsics.checkNotNullExpressionValue(badge5, "badge");
            ColorUtilsKt.setTintColor(badge5, Integer.valueOf(theme.getTextDefault()));
            ViewGroup.LayoutParams layoutParams2 = this.binding.badge.getLayoutParams();
            layoutParams2.width = dpToPx2;
            layoutParams2.height = dpToPx2;
            SimpleDraweeView badge6 = this.binding.badge;
            Intrinsics.checkNotNullExpressionValue(badge6, "badge");
            badge6.setVisibility(0);
        } else {
            SimpleDraweeView badge7 = this.binding.badge;
            Intrinsics.checkNotNullExpressionValue(badge7, "badge");
            badge7.setVisibility(8);
        }
        this.binding.tag.setText(tagContent);
        TextView tag = this.binding.tag;
        Intrinsics.checkNotNullExpressionValue(tag, "tag");
        SetTextSizeSpKt.setTextSizeSp(tag, f2);
    }

    public static /* synthetic */ void configureAppearance$default(ClanTagChipletView clanTagChipletView, String str, String str2, float f2, boolean z5, DiscordThemeObject discordThemeObject, int i7, Object obj) {
        if ((i7 & 16) != 0) {
            discordThemeObject = ThemeManagerKt.getEffectiveTheme();
        }
        clanTagChipletView.configureAppearance(str, str2, f2, z5, discordThemeObject);
    }

    public final void configure(@NotNull String tagContent, String badgeUrl, float scale) {
        Intrinsics.checkNotNullParameter(tagContent, "tagContent");
        configureAppearance$default(this, tagContent, badgeUrl, scale, true, null, 16, null);
        LinearLayout container = this.binding.container;
        Intrinsics.checkNotNullExpressionValue(container, "container");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(container, false, null, 1, null);
        this.binding.container.setClickable(false);
    }

    /* JADX INFO: renamed from: configure-ETwJlQw, reason: not valid java name */
    public final void m536configureETwJlQw(@NotNull String tagContent, String badgeUrl, final long guildId, final ChatEventHandler eventHandler, float scale, @NotNull DiscordThemeObject theme) {
        Intrinsics.checkNotNullParameter(tagContent, "tagContent");
        Intrinsics.checkNotNullParameter(theme, "theme");
        configureAppearance(tagContent, badgeUrl, scale, false, theme);
        if (eventHandler != null) {
            LinearLayout linearLayout = this.binding.container;
            Intrinsics.checkNotNull(linearLayout);
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(linearLayout, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    eventHandler.mo484onTapClanTagChipletg3bFfsM(guildId);
                }
            }, 1, null);
        }
    }
}
