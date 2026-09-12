package com.discord.chat.presentation.invitetospeak;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.Message;
import com.discord.chat.databinding.InviteToSpeakViewBinding;
import com.discord.chat.presentation.message.t;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/chat/bridge/Message;", "message", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "", "onInviteToSpeakClicked", "setProps", "(Lcom/discord/chat/bridge/Message;Lkotlin/jvm/functions/Function1;)V", "Lcom/discord/chat/databinding/InviteToSpeakViewBinding;", "binding", "Lcom/discord/chat/databinding/InviteToSpeakViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InviteToSpeakView extends LinearLayout {

    @NotNull
    private final InviteToSpeakViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InviteToSpeakView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProps$lambda$1(Function1 function1, Message message, View view) {
        function1.invoke(MessageId.m1156boximpl(message.m267getId3Eiw7ao()));
    }

    public final void setProps(@NotNull Message message, @NotNull Function1<? super MessageId, Unit> onInviteToSpeakClicked) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onInviteToSpeakClicked, "onInviteToSpeakClicked");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new t(18, onInviteToSpeakClicked, message), 1, null);
        this.binding.inviteToSpeakText.setText(message.getButtonLabel());
        SimpleDraweeView moveToSpeakerIcon = this.binding.moveToSpeakerIcon;
        Intrinsics.checkNotNullExpressionValue(moveToSpeakerIcon, "moveToSpeakerIcon");
        ReactAssetUtilsKt.setReactAsset(moveToSpeakerIcon, ReactAsset.MicrophoneArrowRightIcon);
        SimpleDraweeView moveToSpeakerIcon2 = this.binding.moveToSpeakerIcon;
        Intrinsics.checkNotNullExpressionValue(moveToSpeakerIcon2, "moveToSpeakerIcon");
        ColorUtilsKt.setTintColor(moveToSpeakerIcon2, Integer.valueOf(ThemeManagerKt.getTheme().getMobileTextHeadingPrimary()));
    }

    public /* synthetic */ InviteToSpeakView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteToSpeakView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        InviteToSpeakViewBinding inviteToSpeakViewBindingInflate = InviteToSpeakViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inviteToSpeakViewBindingInflate, "inflate(...)");
        this.binding = inviteToSpeakViewBindingInflate;
        RippleUtilsKt.addRipple$default(this, true, 0, 2, null);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
        TextView textView = inviteToSpeakViewBindingInflate.inviteToSpeakText;
        Intrinsics.checkNotNull(textView);
        textView.setTextColor(ColorUtilsKt.getColorCompat(textView, R.color.white));
        SetTextSizeSpKt.setTextSizeSp(textView, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getMobileLegacyButtonSecondaryBackgroundDefault(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
    }
}
