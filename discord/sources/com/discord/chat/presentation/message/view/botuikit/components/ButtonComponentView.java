package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.r0;
import com.discord.chat.bridge.botuikit.ActionComponentState;
import com.discord.chat.bridge.botuikit.ButtonComponent;
import com.discord.chat.bridge.botuikit.ButtonStyle;
import com.discord.chat.bridge.botuikit.ComponentEmoji;
import com.discord.chat.databinding.MessageComponentButtonViewBinding;
import com.discord.chat.presentation.message.system.b;
import com.discord.chat.presentation.message.t;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.message.view.botuikit.ComponentViewKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.progress_dots.ProgressDots;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 52\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u00015B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0016J \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0002J\"\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u001a2\u0006\u00100\u001a\u00020\u001eH\u0002J\u0018\u00101\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0018H\u0002R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/ButtonComponent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/MessageComponentButtonViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/MessageComponentButtonViewBinding;", "progressDots", "Lcom/discord/progress_dots/ProgressDots;", "getProgressDots", "()Lcom/discord/progress_dots/ProgressDots;", "progressDots$delegate", "Lkotlin/Lazy;", "currentComponent", "currentStyle", "Lcom/discord/chat/bridge/botuikit/ButtonStyle;", "currentEmoji", "Lcom/discord/chat/bridge/botuikit/ComponentEmoji;", "currentLabel", "", "currentIsLoading", "", "getComponentType", "Lkotlin/reflect/KClass;", "configure", "", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "configureLabelPadding", "label", "Landroid/widget/TextView;", "messageComponent", "configureEmoji", "emojiView", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "emoji", "isLoading", "configureStyle", "button", "Landroid/widget/Button;", "style", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nButtonComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ButtonComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,220:1\n257#2,2:221\n278#2,2:223\n257#2,2:225\n278#2,2:227\n*S KotlinDebug\n*F\n+ 1 ButtonComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView\n*L\n95#1:221,2\n101#1:223,2\n127#1:225,2\n168#1:227,2\n*E\n"})
public final class ButtonComponentView extends ConstraintLayout implements ComponentView<ButtonComponent> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final MessageComponentButtonViewBinding binding;
    private ButtonComponent currentComponent;
    private ComponentEmoji currentEmoji;
    private boolean currentIsLoading;
    private String currentLabel;

    @NotNull
    private ButtonStyle currentStyle;

    /* JADX INFO: renamed from: progressDots$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressDots;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView$Companion;", "", "<init>", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/components/ButtonComponentView;", "context", "Landroid/content/Context;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ButtonComponentView inflateComponent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new ButtonComponentView(context, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.SECONDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyle.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonStyle.PRIMARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonStyle.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ButtonStyle.DANGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ButtonStyle.PREMIUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonComponentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$3(ButtonComponent buttonComponent, ComponentContext componentContext, View view) {
        if (buttonComponent.getUrl() != null) {
            componentContext.getComponentActionEventHandlers().getOnTapButtonLinkComponent().invoke(buttonComponent.getUrl());
        } else if (buttonComponent.getCustomId() != null || buttonComponent.getStyle() == ButtonStyle.PREMIUM) {
            componentContext.getComponentActionEventHandlers().getOnTapButtonActionComponent().invoke(buttonComponent.getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$4(View view) {
    }

    private final void configureEmoji(SimpleDraweeSpanTextView emojiView, ComponentEmoji emoji, boolean isLoading) {
        if (Intrinsics.areEqual(emoji, this.currentEmoji) && isLoading == this.currentIsLoading) {
            return;
        }
        this.currentEmoji = emoji;
        if (emoji == null || !isLoading) {
            ComponentViewKt.setEmojiOrHide(emojiView, emoji);
        } else {
            emojiView.setVisibility(4);
        }
    }

    private final void configureLabelPadding(TextView label, ButtonComponent messageComponent) {
        ButtonComponent buttonComponent;
        ButtonComponent buttonComponent2;
        if (Intrinsics.areEqual(this.currentLabel, messageComponent.getLabel()) && (buttonComponent = this.currentComponent) != null && ButtonComponentViewKt.hasEmoji(messageComponent) == ButtonComponentViewKt.hasEmoji(buttonComponent) && (buttonComponent2 = this.currentComponent) != null && ButtonComponentViewKt.hasIcon(messageComponent) == ButtonComponentViewKt.hasIcon(buttonComponent2)) {
            return;
        }
        this.currentLabel = messageComponent.getLabel();
        if (messageComponent.getLabel() == null) {
            label.setPadding(0, 0, (ButtonComponentViewKt.hasEmoji(messageComponent) && ButtonComponentViewKt.hasIcon(messageComponent)) ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(16), 0);
        } else {
            label.setPadding(ButtonComponentViewKt.hasEmoji(messageComponent) ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(16), 0, ButtonComponentViewKt.hasIcon(messageComponent) ? SizeUtilsKt.getDpToPx(8) : SizeUtilsKt.getDpToPx(16), 0);
        }
    }

    private final void configureStyle(Button button, ButtonStyle style) {
        if (this.currentStyle == style) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[style.ordinal()]) {
            case 1:
                ButtonComponentViewKt.setSecondaryColor(button);
                return;
            case 2:
                ButtonComponentViewKt.setSecondaryColor(button);
                return;
            case 3:
                ButtonComponentViewKt.setSecondaryColor(button);
                return;
            case 4:
                ButtonComponentViewKt.setBrandColor(button);
                return;
            case 5:
                ButtonComponentViewKt.setSuccessColor(button);
                return;
            case 6:
                ButtonComponentViewKt.setDangerColor(button);
                return;
            case 7:
                ButtonComponentViewKt.setBrandColor(button);
                return;
            default:
                throw new n();
        }
    }

    private final ProgressDots getProgressDots() {
        return (ProgressDots) this.progressDots.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProgressDots progressDots_delegate$lambda$0(ButtonComponentView buttonComponentView) {
        View viewInflate = buttonComponentView.binding.loadingDots.inflate();
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.discord.progress_dots.ProgressDots");
        return (ProgressDots) viewInflate;
    }

    @NotNull
    public final MessageComponentButtonViewBinding getBinding() {
        return this.binding;
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    @NotNull
    public KClass getComponentType() {
        return Reflection.getOrCreateKotlinClass(ButtonComponent.class);
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void onRecycle(@NotNull ComponentProvider componentProvider) {
        ComponentView.DefaultImpls.onRecycle(this, componentProvider);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonComponentView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void configure(@NotNull ButtonComponent component, @NotNull ComponentProvider componentProvider, @NotNull ComponentContext componentContext) {
        int textDefault;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        if (Intrinsics.areEqual(component, this.currentComponent)) {
            return;
        }
        boolean z5 = component.getState() == ActionComponentState.DISABLED || component.getDisabled();
        boolean z6 = component.getState() == ActionComponentState.LOADING;
        MaterialButton button = this.binding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        configureStyle(button, component.getStyle());
        SimpleDraweeSpanTextView emoji = this.binding.emoji;
        Intrinsics.checkNotNullExpressionValue(emoji, "emoji");
        configureEmoji(emoji, component.getEmoji(), z6);
        MaterialTextView label = this.binding.label;
        Intrinsics.checkNotNullExpressionValue(label, "label");
        configureLabelPadding(label, component);
        this.binding.button.setEnabled(!z5);
        MaterialButton materialButton = this.binding.button;
        String label2 = component.getLabel();
        if (label2 == null) {
            ComponentEmoji emoji2 = component.getEmoji();
            label2 = emoji2 != null ? emoji2.getName() : null;
        }
        materialButton.setContentDescription(label2);
        this.binding.label.setAlpha(z5 ? 0.5f : 1.0f);
        this.binding.emoji.setAlpha(z5 ? 0.3f : 1.0f);
        SimpleDraweeView simpleDraweeView = this.binding.linkIcon;
        simpleDraweeView.setAlpha(z5 ? 0.3f : 1.0f);
        Intrinsics.checkNotNull(simpleDraweeView);
        simpleDraweeView.setVisibility(component.getStyle() == ButtonStyle.LINK ? 0 : 8);
        ColorUtilsKt.setTintColor(simpleDraweeView, Integer.valueOf(ThemeManagerKt.getTheme().getTextDefault()));
        MaterialTextView materialTextView = this.binding.label;
        materialTextView.setText(component.getLabel());
        Intrinsics.checkNotNull(materialTextView);
        materialTextView.setVisibility(z6 ? 4 : 0);
        DiscordFontUtilsKt.setDiscordFont(materialTextView, DiscordFont.PrimaryMedium);
        switch (WhenMappings.$EnumSwitchMapping$0[component.getStyle().ordinal()]) {
            case 1:
            case 2:
            case 3:
                textDefault = ThemeManagerKt.getTheme().getTextDefault();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                textDefault = ThemeManagerKt.getTheme().getWhite();
                break;
            default:
                throw new n();
        }
        materialTextView.setTextColor(textDefault);
        if (z6) {
            MaterialButton button2 = this.binding.button;
            Intrinsics.checkNotNullExpressionValue(button2, "button");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(button2, false, new b(4), 1, null);
        } else {
            MaterialButton button3 = this.binding.button;
            Intrinsics.checkNotNullExpressionValue(button3, "button");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(button3, false, new t(5, component, componentContext), 1, null);
        }
        if (z6 != this.currentIsLoading) {
            getProgressDots().setVisibility(z6 ? 0 : 8);
        }
        this.currentIsLoading = z6;
    }

    public /* synthetic */ ButtonComponentView(Context context, AttributeSet attributeSet, int i7, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonComponentView(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        MessageComponentButtonViewBinding messageComponentButtonViewBindingInflate = MessageComponentButtonViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(messageComponentButtonViewBindingInflate, "inflate(...)");
        this.binding = messageComponentButtonViewBindingInflate;
        this.progressDots = l.b(new r0(12, this));
        this.currentStyle = ButtonStyle.UNKNOWN;
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
        layoutParams.f5878i = 0.0f;
        setLayoutParams(layoutParams);
        setMinWidth(SizeUtilsKt.getDpToPx(52));
        setMinimumWidth(getMinWidth());
        SimpleDraweeView linkIcon = messageComponentButtonViewBindingInflate.linkIcon;
        Intrinsics.checkNotNullExpressionValue(linkIcon, "linkIcon");
        ReactAssetUtilsKt.setReactAsset(linkIcon, ReactAsset.WindowLaunchIcon);
    }
}
