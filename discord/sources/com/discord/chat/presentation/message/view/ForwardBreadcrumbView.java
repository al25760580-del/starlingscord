package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.bridge.forwarding.ForwardFooterInfo;
import com.discord.chat.bridge.forwarding.ForwardInfo;
import com.discord.chat.databinding.ForwardBreadcrumbViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JE\u0010\u0014\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u001e\u0010\u0011\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/discord/chat/presentation/message/view/ForwardBreadcrumbView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/MessageId;", "messageId", "Lcom/discord/chat/bridge/forwarding/ForwardInfo;", "info", "Lkotlin/Function3;", "", "", "onTapForwardFooter", "configure-JjTCmh4", "(JLjava/lang/String;Lcom/discord/chat/bridge/forwarding/ForwardInfo;Lkotlin/jvm/functions/Function3;)V", "configure", "Lcom/discord/chat/databinding/ForwardBreadcrumbViewBinding;", "binding", "Lcom/discord/chat/databinding/ForwardBreadcrumbViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/ForwardBreadcrumbViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForwardBreadcrumbView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardBreadcrumbView.kt\ncom/discord/chat/presentation/message/view/ForwardBreadcrumbView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n257#2,2:73\n*S KotlinDebug\n*F\n+ 1 ForwardBreadcrumbView.kt\ncom/discord/chat/presentation/message/view/ForwardBreadcrumbView\n*L\n62#1:73,2\n*E\n"})
public final class ForwardBreadcrumbView extends ConstraintLayout {

    @NotNull
    private final ForwardBreadcrumbViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ForwardBreadcrumbView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure_JjTCmh4$lambda$0(Function3 function3, ForwardInfo forwardInfo, long j, String str, View view) {
        function3.invoke(Integer.valueOf(forwardInfo.getSnapshotIndex()), ChannelId.m1130boximpl(j), MessageId.m1156boximpl(str));
    }

    /* JADX INFO: renamed from: configure-JjTCmh4, reason: not valid java name */
    public final void m743configureJjTCmh4(long channelId, @NotNull String messageId, @NotNull ForwardInfo info, @NotNull Function3 onTapForwardFooter) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(onTapForwardFooter, "onTapForwardFooter");
        ForwardFooterInfo footerInfo = info.getFooterInfo();
        if (footerInfo == null) {
            return;
        }
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new com.discord.chat.presentation.message.l(channelId, messageId, info, onTapForwardFooter), 1, null);
        SimpleDraweeView icon = this.binding.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        icon.setVisibility(footerInfo.getOriginIconUrl() == null ? 8 : 0);
        if (footerInfo.getOriginIconUrl() != null) {
            SimpleDraweeView icon2 = this.binding.icon;
            Intrinsics.checkNotNullExpressionValue(icon2, "icon");
            ReactAssetUtilsKt.setReactImageUrl(icon2, footerInfo.getOriginIconUrl());
        }
        this.binding.label.setText(footerInfo.getOriginLabel());
        this.binding.timestamp.setText(footerInfo.getTimestampLabel());
        setContentDescription(footerInfo.getAccessibilityLabel());
    }

    @NotNull
    public final ForwardBreadcrumbViewBinding getBinding() {
        return this.binding;
    }

    public /* synthetic */ ForwardBreadcrumbView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForwardBreadcrumbView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ForwardBreadcrumbViewBinding forwardBreadcrumbViewBindingInflate = ForwardBreadcrumbViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(forwardBreadcrumbViewBindingInflate, "inflate(...)");
        this.binding = forwardBreadcrumbViewBindingInflate;
        RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
        forwardBreadcrumbViewBindingInflate.getRoot().setPadding(0, SizeUtilsKt.getDpToPx(1), 0, SizeUtilsKt.getDpToPx(1));
        SimpleDraweeView icon = forwardBreadcrumbViewBindingInflate.icon;
        Intrinsics.checkNotNullExpressionValue(icon, "icon");
        ViewClippingUtilsKt.clipToRoundedRectangle(icon, SizeUtilsKt.getDpToPx(4));
        forwardBreadcrumbViewBindingInflate.label.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        TextView label = forwardBreadcrumbViewBindingInflate.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        DiscordFontUtilsKt.setDiscordFont(label, DiscordFont.PrimaryMedium);
        TextView separator = forwardBreadcrumbViewBindingInflate.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        DiscordFont discordFont = DiscordFont.PrimaryNormal;
        DiscordFontUtilsKt.setDiscordFont(separator, discordFont);
        forwardBreadcrumbViewBindingInflate.separator.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        TextView timestamp = forwardBreadcrumbViewBindingInflate.timestamp;
        Intrinsics.checkNotNullExpressionValue(timestamp, "timestamp");
        DiscordFontUtilsKt.setDiscordFont(timestamp, discordFont);
        forwardBreadcrumbViewBindingInflate.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        SimpleDraweeView arrow = forwardBreadcrumbViewBindingInflate.arrow;
        Intrinsics.checkNotNullExpressionValue(arrow, "arrow");
        ReactAssetUtilsKt.setReactAsset(arrow, ReactAsset.ChevronSmallRightIcon);
        SimpleDraweeView arrow2 = forwardBreadcrumbViewBindingInflate.arrow;
        Intrinsics.checkNotNullExpressionValue(arrow2, "arrow");
        ColorUtilsKt.setTintColor(arrow2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
    }
}
