package com.discord.chat.presentation.stickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.sticker.StickerFormatType;
import com.discord.chat.databinding.WelcomeStickerViewBinding;
import com.discord.chat.presentation.message.d;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.DiscordThemeObject;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/discord/chat/presentation/stickers/WelcomeStickerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "", "bindSticker", "(Lcom/discord/chat/bridge/sticker/Sticker;)V", "Lcom/discord/chat/bridge/Message;", "message", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "onWelcomeReplyClicked", "setSticker", "(Lcom/discord/chat/bridge/sticker/Sticker;Lcom/discord/chat/bridge/Message;Lkotlin/jvm/functions/Function2;)V", "Lcom/discord/chat/databinding/WelcomeStickerViewBinding;", "binding", "Lcom/discord/chat/databinding/WelcomeStickerViewBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WelcomeStickerView extends LinearLayout {

    @NotNull
    private final WelcomeStickerViewBinding binding;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerFormatType.values().length];
            try {
                iArr[StickerFormatType.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerFormatType.APNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerFormatType.LOTTIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerFormatType.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WelcomeStickerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void bindSticker(Sticker sticker) {
        int i7 = WhenMappings.$EnumSwitchMapping$0[sticker.getFormatType().ordinal()];
        if (i7 == 1) {
            this.binding.stickerView.asPng(sticker.getUrl(), sticker.getWidth(), sticker.getHeight(), sticker.getAccessibilityLabel());
            return;
        }
        if (i7 == 2) {
            this.binding.stickerView.asApng(sticker.getUrl(), 32, 32, true, sticker.getAccessibilityLabel());
            return;
        }
        if (i7 != 3) {
            if (i7 != 4) {
                throw new n();
            }
            this.binding.stickerView.asGif(sticker.getUrl(), 32, 32, true, sticker.getAccessibilityLabel());
        } else {
            this.binding.stickerView.asLottie(sticker.getUrl(), 32, 32, true, sticker.getAsset(), sticker.getRenderMode(), sticker.getAccessibilityLabel());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSticker$lambda$1(Function2 function2, Sticker sticker, Message message, View view) {
        function2.invoke(sticker, MessageId.m1156boximpl(message.m267getId3Eiw7ao()));
    }

    public final void setSticker(@NotNull Sticker sticker, @NotNull Message message, @NotNull Function2<? super Sticker, ? super MessageId, Unit> onWelcomeReplyClicked) {
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onWelcomeReplyClicked, "onWelcomeReplyClicked");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new d(onWelcomeReplyClicked, sticker, message, 9), 1, null);
        this.binding.welcomeReplyText.setText(message.getStickerLabel());
        bindSticker(sticker);
    }

    public /* synthetic */ WelcomeStickerView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeStickerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        WelcomeStickerViewBinding welcomeStickerViewBindingInflate = WelcomeStickerViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(welcomeStickerViewBindingInflate, "inflate(...)");
        this.binding = welcomeStickerViewBindingInflate;
        RippleUtilsKt.addRipple$default(this, true, 0, 2, null);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
        boolean zIsVisualRefreshEnabled = ThemeManager.INSTANCE.isVisualRefreshEnabled();
        TextView textView = welcomeStickerViewBindingInflate.welcomeReplyText;
        DiscordThemeObject theme = ThemeManagerKt.getTheme();
        textView.setTextColor(zIsVisualRefreshEnabled ? theme.getControlSecondaryTextDefault() : theme.getTextDefault());
        Intrinsics.checkNotNull(textView);
        SetTextSizeSpKt.setTextSizeSp(textView, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        if (zIsVisualRefreshEnabled) {
            ViewBackgroundUtilsKt.setBackgroundRectangle(this, ThemeManagerKt.getTheme().getControlSecondaryBackgroundDefault(), SizeUtilsKt.getDpToPx(4), Integer.valueOf(ThemeManagerKt.getTheme().getControlSecondaryBorderDefault()), SizeUtilsKt.getDpToPx(1));
        } else {
            ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundModStrong(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
        }
    }
}
