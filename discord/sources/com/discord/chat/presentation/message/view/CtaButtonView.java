package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.discord.chat.bridge.ctabutton.CtaButton;
import com.discord.chat.databinding.CtaButtonBinding;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageId;
import com.discord.theme.R;
import com.google.android.flexbox.FlexboxLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JO\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JQ\u0010\u001a\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\u001e\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/discord/chat/presentation/message/view/CtaButtonView;", "Lcom/google/android/flexbox/FlexboxLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/discord/core/DCDButton;", "button", "Lcom/discord/chat/bridge/ctabutton/CtaButton;", "accessory", "Lcom/discord/primitives/ChannelId;", "channelId", "Lcom/discord/primitives/MessageId;", "messageId", "Lkotlin/Function3;", "", "", "onTapCtaButton", "configureButton-CMNjcK4", "(Lcom/discord/core/DCDButton;Lcom/discord/chat/bridge/ctabutton/CtaButton;JLjava/lang/String;Lkotlin/jvm/functions/Function3;)V", "configureButton", "secondaryAccessory", "setContent-uHwPWNE", "(JLjava/lang/String;Lcom/discord/chat/bridge/ctabutton/CtaButton;Lcom/discord/chat/bridge/ctabutton/CtaButton;Lkotlin/jvm/functions/Function3;)V", "setContent", "Lcom/discord/chat/databinding/CtaButtonBinding;", "binding", "Lcom/discord/chat/databinding/CtaButtonBinding;", "getBinding", "()Lcom/discord/chat/databinding/CtaButtonBinding;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CtaButtonView extends FlexboxLayout {

    @NotNull
    private final CtaButtonBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CtaButtonView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: configureButton-CMNjcK4, reason: not valid java name */
    private final void m732configureButtonCMNjcK4(DCDButton button, CtaButton accessory, long channelId, String messageId, Function3 onTapCtaButton) {
        button.setText(accessory.getText());
        Integer textColor = accessory.getTextColor();
        button.setTextColor(Integer.valueOf(textColor != null ? textColor.intValue() : -1));
        Integer backgroundColor = accessory.getBackgroundColor();
        button.setBackgroundColor(backgroundColor != null ? backgroundColor.intValue() : getContext().getColor(R.color.brand_500));
        button.setTextSizeSp(14.0f);
        button.setCornerRadius(32);
        String callback = accessory.getCallback();
        if (callback == null || StringsKt.K(callback)) {
            button.setOnClickButtonListener(new com.discord.chat.presentation.message.system.b(2));
            button.setEnabled(false);
            button.setAlpha(0.5f);
        } else {
            button.setOnClickButtonListener(new com.discord.chat.presentation.message.l(onTapCtaButton, channelId, messageId, callback));
            button.setEnabled(true);
            button.setAlpha(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureButton_CMNjcK4$lambda$0(Function3 function3, long j, String str, String str2, View view) {
        function3.invoke(ChannelId.m1130boximpl(j), MessageId.m1156boximpl(str), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureButton_CMNjcK4$lambda$1(View view) {
    }

    /* JADX INFO: renamed from: setContent-uHwPWNE$default, reason: not valid java name */
    public static /* synthetic */ void m733setContentuHwPWNE$default(CtaButtonView ctaButtonView, long j, String str, CtaButton ctaButton, CtaButton ctaButton2, Function3 function3, int i7, Object obj) {
        if ((i7 & 8) != 0) {
            ctaButton2 = null;
        }
        ctaButtonView.m734setContentuHwPWNE(j, str, ctaButton, ctaButton2, function3);
    }

    @NotNull
    public final CtaButtonBinding getBinding() {
        return this.binding;
    }

    /* JADX INFO: renamed from: setContent-uHwPWNE, reason: not valid java name */
    public final void m734setContentuHwPWNE(long channelId, @NotNull String messageId, @NotNull CtaButton accessory, CtaButton secondaryAccessory, @NotNull Function3 onTapCtaButton) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(accessory, "accessory");
        Intrinsics.checkNotNullParameter(onTapCtaButton, "onTapCtaButton");
        DCDButton ctaButton = this.binding.ctaButton;
        Intrinsics.checkNotNullExpressionValue(ctaButton, "ctaButton");
        m732configureButtonCMNjcK4(ctaButton, accessory, channelId, messageId, onTapCtaButton);
        if (secondaryAccessory == null) {
            this.binding.secondaryCtaButton.setVisibility(8);
            return;
        }
        this.binding.secondaryCtaButton.setVisibility(0);
        DCDButton secondaryCtaButton = this.binding.secondaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(secondaryCtaButton, "secondaryCtaButton");
        m732configureButtonCMNjcK4(secondaryCtaButton, secondaryAccessory, channelId, messageId, onTapCtaButton);
    }

    public /* synthetic */ CtaButtonView(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtaButtonView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        CtaButtonBinding ctaButtonBindingInflate = CtaButtonBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(ctaButtonBindingInflate, "inflate(...)");
        this.binding = ctaButtonBindingInflate;
        setFlexWrap(1);
        setAlignItems(0);
        DCDButton dCDButton = ctaButtonBindingInflate.ctaButton;
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        dCDButton.setDiscordFont(discordFont);
        ctaButtonBindingInflate.secondaryCtaButton.setDiscordFont(discordFont);
    }
}
