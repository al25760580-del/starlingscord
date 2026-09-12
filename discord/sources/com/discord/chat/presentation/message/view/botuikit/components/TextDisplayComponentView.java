package com.discord.chat.presentation.message.view.botuikit.components;

import android.content.Context;
import android.text.TextPaint;
import android.widget.LinearLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.botuikit.TextDisplayComponent;
import com.discord.chat.presentation.message.MessageUtilsKt;
import com.discord.chat.presentation.message.view.MessageContentView;
import com.discord.chat.presentation.message.view.botuikit.ComponentContext;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.message.view.botuikit.ComponentView;
import com.discord.chat.presentation.textutils.TextUtilsKt;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react.FontManager;
import com.discord.react.utilities.ReactSelfMeasurer;
import com.discord.react.utilities.ReactSelfMeasuringView;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004:\u0001\u001bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016J \u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/TextDisplayComponentView;", "Lcom/discord/chat/presentation/message/view/MessageContentView;", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentView;", "Lcom/discord/chat/bridge/botuikit/TextDisplayComponent;", "Lcom/discord/react/utilities/ReactSelfMeasuringView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "reactSelfMeasurer", "Lcom/discord/react/utilities/ReactSelfMeasurer;", "getReactSelfMeasurer", "()Lcom/discord/react/utilities/ReactSelfMeasurer;", "requestLayout", "", "onMeasure", "widthMeasureSpec", "", "heightMeasureSpec", "getComponentType", "Lkotlin/reflect/KClass;", "configure", "component", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentContext", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentContext;", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextDisplayComponentView extends MessageContentView implements ComponentView<TextDisplayComponent>, ReactSelfMeasuringView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ReactSelfMeasurer reactSelfMeasurer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/discord/chat/presentation/message/view/botuikit/components/TextDisplayComponentView$Companion;", "", "<init>", "()V", "inflateComponent", "Lcom/discord/chat/presentation/message/view/botuikit/components/TextDisplayComponentView;", "context", "Landroid/content/Context;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextDisplayComponentView inflateComponent(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new TextDisplayComponentView(context);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextDisplayComponentView(@NotNull Context context) {
        super(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.reactSelfMeasurer = new ReactSelfMeasurer(this);
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    @NotNull
    public KClass getComponentType() {
        return Reflection.getOrCreateKotlinClass(TextDisplayComponent.class);
    }

    @Override // com.discord.react.utilities.ReactSelfMeasuringView
    @NotNull
    public ReactSelfMeasurer getReactSelfMeasurer() {
        return this.reactSelfMeasurer;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, getReactSelfMeasurer().measureHeightSpec(heightMeasureSpec));
        getReactSelfMeasurer().publishHeight(getMeasuredHeight());
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void onRecycle(@NotNull ComponentProvider componentProvider) {
        ComponentView.DefaultImpls.onRecycle(this, componentProvider);
    }

    @Override // android.view.View
    public void requestLayout() {
        super.requestLayout();
        ReactSelfMeasurer reactSelfMeasurer = getReactSelfMeasurer();
        if (reactSelfMeasurer != null) {
            reactSelfMeasurer.onRequestLayout();
        }
    }

    @Override // com.discord.chat.presentation.message.view.botuikit.ComponentView
    public void configure(@NotNull TextDisplayComponent component, @NotNull ComponentProvider componentProvider, @NotNull ComponentContext componentContext) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        configure(component, componentContext);
    }

    public final void configure(@NotNull TextDisplayComponent component, @NotNull ComponentContext componentContext) {
        float chatTextSizeSp;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(componentContext, "componentContext");
        setTextColor(ThemeManagerKt.getTheme().getTextDefault());
        DiscordFontUtilsKt.setDiscordFont(this, DiscordFont.PrimaryMedium);
        if (componentContext.isInContainerComponent()) {
            chatTextSizeSp = 14.0f;
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            chatTextSizeSp = MessageUtilsKt.getChatTextSizeSp(context);
        }
        SetTextSizeSpKt.setTextSizeSp(this, chatTextSizeSp);
        TextPaint paint = getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        FontManager fontManager = FontManager.INSTANCE;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setMessageContent(componentContext.getMargins(), component.getContent(), componentContext.getMarkdownTextRenderOptions(), componentContext.getMarkdownTextRenderEventHandlers(), Float.valueOf(TextUtilsKt.getBaselineHeightForFontSizePx(paint, fontManager.getScaledSpToPx(16, context2))), true);
    }
}
